/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.primitive.KoKoPrimitive
import kokoslan.kotlin.primitive.KoKoRest
import java.util.*
import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

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
            return beta_reduction(vv as KoKoLambdaValue, args[0].eval(ctx)!!)
        }

        when((this.head as KoKoId).getValue()) {
            "print" -> printArguments(ctx)
            "fail" ->  throw KoKoFailException()
            "rest" ->  return KoKoRest().eval(this.args.first().eval(ctx)!!, ctx)
            else -> {
                val closure = ctx.find(this.head as KoKoId)
                val arg = args[0]
                val valueOfArg: KoKoValue

                if(closure is KoKoLambdaValue) {
                    if(arg is KoKoLambda) {
                        valueOfArg = arg.eval(closure.ctx)!!
                    } else if(arg is KoKoCall) {
                        valueOfArg = arg.eval(ctx)!!
                    } else if(arg is KoKoBiOperation) {
                        valueOfArg = arg.eval(closure.ctx)
                    }
                    else if(ctx.contains(KoKoId(arg.toString())))
                        valueOfArg = ctx.find(KoKoId(arg.toString()))
                    else
                        valueOfArg = KoKoNumValue(arg .toString().toDouble())
                    val r = beta_reduction(closure, valueOfArg)
                    return r
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
    fun printArguments(ctx: KoKoContext){
        args.forEach{ println(it.eval(ctx)) }
    }

}