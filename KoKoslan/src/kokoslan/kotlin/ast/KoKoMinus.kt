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

class KoKoMINUS(oper : KoKoAst, left : KoKoAst, right : KoKoAst) : KoKoBiOperation(oper, left, right) {
	
	override fun eval(ctx : KoKoContext) : KoKoValue{
	   try {
		     val lv = left().eval(ctx) as KoKoNumValue
			 val rv = right().eval(ctx) as KoKoNumValue
	         return KoKoNumValue(lv.getValue() - rv.getValue())
	   } catch (e : Exception) {
			throw KoKoEvalException(e.message!!)
	   }  
    }
	
}