/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*

class KoKoMINUS(Operator : KoKoAst, left : KoKoAst, right : KoKoAst) : KoKoBiOperation(Operator, left, right) {
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
	   try {
		     val lv = (KoKoNumValue)(left().eval(ctx))
			 val rv = (KoKoNumValue)(right().eval(ctx))
	         return KoKoNumValue(lv.getValue() - rv.getValue())
	   } catch (e : Exception) {
			throw KoKoEvalException(e.getMessage())
	   }
	   
   }
	
}