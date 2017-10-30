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

class KoKoUnaryOperation(oper: KoKoAst, value: KoKoAst) : KoKoOperation(oper, Arrays.asList(value, value)){
		
	fun preValue(): KoKoAst {
		return operands.get(0)
	}

	fun posValue(): KoKoAst {
		return operands.get(1)
	}
	
	override fun eval(ctx: KoKoContext): KoKoValue{
	   try {
	        val operId = oper as KoKoId
			val lv = preValue().eval(ctx) as KoKoNumValue
			val rv = posValue().eval(ctx) as KoKoNumValue
			when (operId.getValue()){
				"++" -> return KoKoNumValue(lv.getValue() + rv.getValue())
				"--" -> return KoKoNumValue(lv.getValue() - rv.getValue())
                else -> throw KoKoEvalException("KoKoUnaryOperation unimpemented operator")
			}
			
	   } catch (e: Exception) {
			throw KoKoEvalException(e.message!!)
	   }
    }
	
}