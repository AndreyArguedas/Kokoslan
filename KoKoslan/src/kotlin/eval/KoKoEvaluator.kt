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
		print("Vine a evaluar todo")
		val name: String = (this.head as KoKoId).getValue()
        if(name.equals("print"))
            printArguments(ctx)
		return null
	}

	fun printArguments(ctx: KoKoContext): Unit{
        args.forEach{ print(it.eval(ctx)) }
    }

	/*
		fun evaluate(tree: KoKoProgram, ctx: KoKoContext): KoKoValue{
			return null;
		}
	*/
	
}