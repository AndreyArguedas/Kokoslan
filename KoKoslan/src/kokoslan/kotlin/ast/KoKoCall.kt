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

class KoKoCall(protected var head : KoKoAst, protected var args : KoKoList = KoKoList()) : KoKoAst {

    override fun genCode(Out : PrintStream) { //The code we see when we do call.kl
        this.head.genCode(Out)
        Out.print(" (")
        this.args.genCode(Out)
        Out.print(") ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? { //Evaluates the call, returns a value, context = id(args)
        //This can be turned into a when for this.head, as KoKoCall, as KoKoLambda, as KoKoId

        if(this.head is KoKoCall){ //Esto es para manejar calls anidados ejemplo max(10)(20)
            val vv =  this.head.eval(ctx) //Un closure esperaria yo
            if(vv is KoKoLambdaValue){
                return beta_reduction(vv, args[0].eval(ctx)!!)
            }
            //Succeded
            return vv
        }

        if(this.head is KoKoLambda) {
            val kkLambda = KoKoLambda(this.head, args[0], true)
            return kkLambda.eval(ctx)
        }

        if(this.head is KoKoId)
            if(this.head.toString() == "length")
                if(!ctx.contains(KoKoId("length")))
                    return KoKoLength().eval(this.args.first().eval(ctx)!!, ctx)

        when((this.head as KoKoId).getValue()) {
            "print"     -> printArguments(ctx)
            "fail"      -> throw KoKoFailException()
            else        -> {
                var closure = ctx.find(this.head as KoKoId)
                var arg = args[0]

                val valueOfArg: KoKoValue

                if(closure is KoKoLambdaValue) {
                    if(arg is KoKoLambda) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if(arg is KoKoCall) {
                        valueOfArg = arg.eval(ctx)!!
                    } else if(arg is KoKoBiOperation) {
                        valueOfArg = arg.eval(closure.ctx)
                    } else if(arg is KoKoList) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if(ctx.contains(KoKoId(arg.toString())))
                        valueOfArg = ctx.find(KoKoId(arg.toString()))
                    else
                        valueOfArg = KoKoNumValue(arg .toString().toDouble())
                    val r = beta_reduction(closure, valueOfArg)
                    return r
                }
                else if(closure is KoKoCaseValue){
                    val tempCaseValue =  this.head.eval(ctx) //Un closure esperaria yo
                    return case_beta_reduction(tempCaseValue as KoKoCaseValue, args[0].eval(ctx)!!)
                    /*
                    if(arg is KoKoLambda) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if(arg is KoKoCall) {
                        valueOfArg = arg.eval(ctx)!!
                    } else if(arg is KoKoBiOperation) {
                        valueOfArg = arg.eval(closure.ctx)
                    } else if(arg is KoKoList) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if(ctx.contains(KoKoId(arg.toString())))
                        valueOfArg = ctx.find(KoKoId(arg.toString()))
                    else
                        valueOfArg = KoKoNumValue(arg .toString().toDouble())
                    closure.ctx.assoc(KoKoId("#x"), valueOfArg)
                    val r = closure.call.eval(closure.ctx)
                    return r
                    */
                }
            }
        }
        return null
    }

    fun beta_reduction(closure: KoKoLambdaValue, valueOfArg: KoKoValue): KoKoValue? {
        if(closure.pattern is KoKoListPat && valueOfArg is KoKoListValue){
            closure.ctx.assoc(closure.pattern.head as KoKoId, valueOfArg.getFirst())
            closure.ctx.assoc(closure.pattern.rest as KoKoId, valueOfArg.getRest())
        }
        else
            closure.ctx.set(closure.pattern.toString(), valueOfArg)

        return closure.expr.eval(closure.ctx)
    }

    fun case_beta_reduction(closure: KoKoCaseValue, valueOfArg: KoKoValue): KoKoValue? {
        val newClosureAst = closure.call as KoKoLambda
        val newClosure = newClosureAst.eval(closure.ctx)
        return beta_reduction(newClosure as KoKoLambdaValue, valueOfArg)
    }

    fun setArg(arg: KoKoAst) {
        this.args = KoKoList(listOf(arg))
    }

    fun printArguments(ctx: KoKoContext){
        args.forEach{ println(it.eval(ctx)) }
    }

}