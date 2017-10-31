/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kt.eval

import kokoslan.kt.ast.*
import kokoslan.kt.exception.*

class KoKoEvaluator(private var head: KoKoAst, protected var args: KoKoList){

	fun evaluate(ctx: KoKoContext): KoKoValue?{
		val name: String = (this.head as KoKoId).getValue()
        if(name.equals("print"))
            printArguments(ctx)
		else{
            val kokoval = ctx.find (this.head as KoKoId)
            if(kokoval is KoKoLambdaValue) {
                var kl = kokoval as KoKoLambdaValue
                ctx.set(kl.pattern.toString(), ctx.getValue(args.get(0).toString()))
                return kl.expr.eval(ctx)
            }

        }
        return null
	}

	fun printArguments(ctx: KoKoContext){
        args.forEach{ print(it.eval(ctx)) }
    }

	/*
		fun evaluate(tree: KoKoProgram, ctx: KoKoContext): KoKoValue{
			return null;
		}
	*/
	
}