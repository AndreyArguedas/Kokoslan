/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.primitive.KoKoLength
import java.io.*
import kokoslan.kotlin.eval.*

data class KoKoCall(private var head: KoKoAst, private var args: KoKoList = KoKoList()) : KoKoAst {

    override fun genCode(Out: PrintStream) {
        this.head.genCode(Out)
        Out.print(" (")
        this.args.genCode(Out)
        Out.print(") ")
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {

        if (this.head is KoKoCall) //This is for managing calls of call example max(190)(30)
            return manageMultipleCalls(ctx)

        if (this.head is KoKoLambda)   //Manage closures
            return manageCallOfClosures(ctx)

        if (this.head is KoKoId)
            if (this.head.toString() == "length")
                if (!ctx.contains(KoKoId("length")))
                    return KoKoLength().eval(this.args.first().eval(ctx)!!)

        when ((this.head as KoKoId).getValue()) {
            "print" -> return printArguments(ctx)
            "fail" -> throw KoKoFailException()
            else -> {
                val closure = ctx.find(this.head as KoKoId)
                val arg = args[0]

                val valueOfArg: KoKoValue

                if (closure is KoKoLambdaValue) {
                    if (arg is KoKoLambda || arg is KoKoBiOperation || arg is KoKoBoolOperation || arg is KoKoList) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if (arg is KoKoCall) {
                        valueOfArg = arg.eval(ctx)!!
                    } else if (ctx.contains(KoKoId(arg.toString())))
                        valueOfArg = ctx.find(KoKoId(arg.toString()))
                    else
                        valueOfArg = KoKoNumValue(arg.toString().toDouble())
                    return beta_reduction(closure, valueOfArg)
                } else if (closure is KoKoCaseValue) {
                    val tempCaseValue = this.head.eval(ctx)
                    return case_beta_reduction(tempCaseValue as KoKoCaseValue, arg, ctx)
                }
            }
        }
        return null
    }

    private fun manageCallOfClosures(ctx: KoKoContext): KoKoValue? {
        val kkLambda = KoKoLambda(this.head, args[0], true)
        return kkLambda.eval(ctx)
    }

    private fun manageMultipleCalls(ctx: KoKoContext): KoKoValue? {
        val vv = this.head.eval(ctx) //A closure is expected
        if (vv is KoKoLambdaValue)
            return beta_reduction(vv, args[0].eval(ctx)!!)
        if (vv is KoKoCaseValue)
            return case_beta_reduction(vv, args[0], ctx)
        return vv //There's not more closure inside the chain of calls
    }


    private fun beta_reduction(closure: KoKoLambdaValue, valueOfArg: KoKoValue): KoKoValue? {
        if (closure.pattern is KoKoListPat && valueOfArg is KoKoListValue) {
            manageKoKoListPat(closure, valueOfArg)
        } else
            closure.ctx.set(closure.pattern.toString(), valueOfArg)
        return closure.expr.eval(closure.ctx)
    }

    private fun manageKoKoListPat(closure: KoKoLambdaValue, valueOfArg: KoKoValue) {
        if (closure.pattern is KoKoListPat && valueOfArg is KoKoListValue) {

            val valOfArg = manageKoKoListPatPart(closure.ctx, closure.pattern.head, valueOfArg)!!
            manageKoKoListPatPart(closure.ctx, closure.pattern.rest, valOfArg, false)

        }
    }

    private fun manageKoKoListPatPart(ctx: KoKoContext, part: KoKoAst, valueOfArg: KoKoValue, isFirst: Boolean = true): KoKoValue? {
        valueOfArg as KoKoListValue
        when(part) {
            is KoKoId -> {
                if(isFirst) {
                    ctx.assoc(part, valueOfArg.getFirst())
                    return valueOfArg.dropFirst()
                } else {
                    ctx.assoc(part, valueOfArg)
                }
            }
            is KoKoListPat -> {
                val valOfArg = manageKoKoListPatPart(ctx, part.head, valueOfArg)!!
                manageKoKoListPatPart(ctx, part.rest, valOfArg, false)
            }
        }
        return null
    }

    private fun case_beta_reduction(closure: KoKoCaseValue, arg: KoKoAst, ctx: KoKoContext): KoKoValue? {
        val valueOfArg = arg.eval(ctx)!!
        val newClosureAst = closure.call as KoKoLambda
        val newClosure = newClosureAst.eval(closure.ctx) as KoKoLambdaValue
        return beta_reduction(newClosure, valueOfArg)
    }

    private fun printArguments(ctx: KoKoContext): KoKoValue? {
        args.forEach { println(it.eval(ctx)) }
        return KoKoStringValue("")
    }

}