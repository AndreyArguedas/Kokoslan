/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import java.util.*
import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoCall(protected var head : KoKoAst, protected var args : KoKoList = KoKoList()) : KoKoAst {

    override fun genCode(Out : PrintStream) { //The code we see when we do call.kl
        this.head.genCode(Out)
        Out.print(" (")
        this.args.genCode(Out)
        Out.print(") ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? { //Evaluates the call, returns a value, context = id(args)
        val closure = ctx.find(this.head as KoKoId)
        if(closure is KoKoLambdaValue) {
            val arg = args[0]
            val valueOfArg: KoKoValue
            if(ctx.contains(KoKoId(arg.toString())))
                valueOfArg = ctx.find(KoKoId(arg.toString()))
            else
                valueOfArg = KoKoNumValue(arg.toString().toDouble())
            val r = beta_reduction(closure, valueOfArg)
            return r
        }
        return null
//        return KoKoEvaluator(this.head, this.args).evaluate(ctx)
    }

    fun beta_reduction(closure: KoKoLambdaValue, valueOfArg: KoKoValue): KoKoValue? {
        closure.ctx.set(closure.pattern.toString(), valueOfArg)
        return closure.expr.eval(closure.ctx)
    }
}