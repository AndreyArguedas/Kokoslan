/**
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import kokoslan.kotlin.exception.KoKoFailException
import java.util.*
import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

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
                ">" ->  { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() > rv.getValue())}
                "<=" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() <= rv.getValue())}
                ">=" -> { lv as KoKoNumValue; rv as KoKoNumValue; return KoKoBoolValue(lv.getValue() >= rv.getValue())}
                "==" -> { return equals(lv, rv) }
                "!=" -> { return notEquals(lv, rv) }
                "||" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; return KoKoBoolValue(lv.getValue() || rv.getValue())}
                "&&" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; return KoKoBoolValue(lv.getValue() && rv.getValue())}
				else -> throw KoKoEvalException("KoKoBoolOperation unimpemented operator")
			}
	   } catch (e: Exception) {
			throw KoKoEvalException(e.message!!)
       }
   }
    //<
    fun lt(lv: KoKoValue, rv: KoKoValue): KoKoBoolValue {
        if(lv is KoKoNumValue && rv is KoKoNumValue)
            return KoKoBoolValue(lv.getValue() < rv.getValue())
        throw KoKoEvalException("Not implemented")
    }

    fun equals(lv: KoKoValue, rv: KoKoValue): KoKoBoolValue {
        if(lv is KoKoNumValue && rv is KoKoNumValue)
            return KoKoBoolValue(lv.getValue() == rv.getValue())
        if(lv is KoKoListValue && rv is KoKoListValue)
            return KoKoBoolValue(lv == rv)
        throw KoKoEvalException("Not implemented")
    }

    fun notEquals(lv: KoKoValue, rv: KoKoValue): KoKoBoolValue {
        if(lv is KoKoNumValue && rv is KoKoNumValue)
            return KoKoBoolValue(lv.getValue() != rv.getValue())
        if(lv is KoKoListValue && rv is KoKoListValue)
            return KoKoBoolValue(lv != rv)
        throw KoKoEvalException("Not implemented")
    }

}