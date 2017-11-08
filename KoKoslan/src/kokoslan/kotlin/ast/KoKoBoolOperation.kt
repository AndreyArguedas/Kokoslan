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

class KoKoBoolOperation(oper: KoKoAst, left: KoKoAst, right: KoKoAst) : KoKoOperation(oper, Arrays.asList(left, right)) {
	
    fun left(): KoKoAst {
        return operands.get(0)
    }

    fun right(): KoKoAst {
        return operands.get(1)
    }

	override fun eval(ctx: KoKoContext): KoKoValue{
	   try {
	        val operId = oper as KoKoId
			var lv = left().eval(ctx)!!
			var rv = right().eval(ctx)!!

			when (operId.getValue()){
				"<" ->  { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                ">" ->  { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                "<=" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                ">=" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                "==" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                "!=" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() < rv.getValue())}
                "||" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; return KoKoBoolValue(lv.getValue() || rv.getValue())}
                "&&" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; return KoKoBoolValue(lv.getValue() && rv.getValue())}
				else -> throw KoKoEvalException("KoKoBoolOperation unimpemented operator")
			}
			
	   } catch (e: Exception) {
			throw KoKoEvalException(e.message!!)
       }
   }
}