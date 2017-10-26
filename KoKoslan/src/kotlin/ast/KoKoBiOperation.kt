/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*


class KoKoBiOperation : KoKoOperation {
	
    constructor(Operator : KoKoAst, left : KoKoAst, right : KoKoAst) : this {
		super(Operator, Arrays.asList(left, right))
	}
	
	fun left() : KoKoAst {return this.operands.get(0)}
	fun right() : KoKoAst {return this.operands.get(1)}
	
	override fun eval(ctx : KoKoContext) : KoKoValue {
	   try {
	        val operId = (KoKoId)operator_
			val lv = (KoKoNumValue)(left().eval(ctx)) //Parsing??
			val rv = (KoKoNumValue)(right().eval(ctx))
			when (operId.getValue()){
				"+" -> return KoKoNumValue(lv.getValue() + rv.getValue())
				"-" -> return KoKoNumValue(lv.getValue() - rv.getValue())
				"*" -> return KoKoNumValue(lv.getValue() * rv.getValue())
				else -> throw KoKoEvalException("KoKoBiOperation unimpemented operator")
			}
			
	   } catch (e : Exception) {
			throw KoKoEvalException(e.getMessage())
	     }
	   
   }
	
}