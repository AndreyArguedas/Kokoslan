/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast

class KoKoEvaluator(private var head: KoKoAst, protected var args: KoKoList){

	fun evaluate(ctx: KoKoContext): KoKoValue{
		print("Vine a evaluar todo");
		val name: String = ((KoKoId)this.head).value;
        if(name.equals("print"))
            printArguments(ctx);
		return null;
	}

	fun printArguments(ctx: KoKoContext): Unit{
        this.args
            .stream()
            .forEach( a -> print(a.eval(ctx)));
    }

	/*
		fun evaluate(tree: KoKoProgram, ctx: KoKoContext): KoKoValue{
			return null;
		}
	*/
	
}