/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*

class KoKoProgram(private statements : List<KoKoAst>) : KoKoAst{

   fun genCode(out: PrintStream){
       statements.forEach{ it.genCode(out) }
   }

   fun eval(ctx: KoKoContext): KoKoValue?{
		var res: KoKoValue? = null;
		for(int i = 0; i < statements.size -1 ; i++){
			res = statements.get(i).eval(ctx)
		}
		res = statements.get(statements.size -1).eval(ctx)
		return res		
	}

	fun eval(): KoKoValue?{
		return  eval(KoKoContext())
	}
}