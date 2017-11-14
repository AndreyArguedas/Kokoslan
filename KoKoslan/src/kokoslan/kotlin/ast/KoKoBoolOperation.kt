/**
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import java.util.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoBoolOperation(oper: KoKoAst, left: KoKoAst, right: KoKoAst) : KoKoOperation(oper, Arrays.asList(left, right)) {

    private fun left(): KoKoAst {
        return operands[0]
    }

    private fun right(): KoKoAst {
        return operands[1]
    }

	override fun eval(ctx: KoKoContext): KoKoValue{
	   try {
	        val operId = oper as KoKoId
			val lv = left().eval(ctx)!!
			val rv = right().eval(ctx)!!

           return when (operId.getValue()){
               "<" ->  { lv as KoKoNumValue; rv as KoKoNumValue; KoKoBoolValue(lv.getValue() < rv.getValue())  }
               ">" ->  { lv as KoKoNumValue; rv as KoKoNumValue; KoKoBoolValue(lv.getValue() > rv.getValue())  }
               "<=" -> { lv as KoKoNumValue; rv as KoKoNumValue; KoKoBoolValue(lv.getValue() <= rv.getValue()) }
               ">=" -> { lv as KoKoNumValue; rv as KoKoNumValue; KoKoBoolValue(lv.getValue() >= rv.getValue()) }
               "==" -> { equals(lv, rv) }
               "!=" -> { notEquals(lv, rv) }
               "||" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; KoKoBoolValue(lv.getValue() || rv.getValue())}
               "&&" -> { lv as KoKoBoolValue; rv as KoKoBoolValue; KoKoBoolValue(lv.getValue() && rv.getValue())}
               else -> throw KoKoEvalException("KoKoBoolOperation unimpemented operator")
           }
	   } catch (e: Exception) {
			throw KoKoEvalException(e.message!!)
       }
   }


    private fun equals(lv: KoKoValue, rv: KoKoValue): KoKoBoolValue {
        if(lv is KoKoNumValue && rv is KoKoNumValue)
            return KoKoBoolValue(lv.getValue() == rv.getValue())

        if(lv is KoKoListValue && rv is KoKoListValue)
            return KoKoBoolValue(lv == rv)

        if(lv is KoKoBoolValue && rv is KoKoBoolValue)
            return KoKoBoolValue(lv.getValue() == rv.getValue())

        return KoKoBoolValue(false)
    }

    private fun notEquals(lv: KoKoValue, rv: KoKoValue): KoKoBoolValue {
        if(lv is KoKoNumValue && rv is KoKoNumValue)
            return KoKoBoolValue(lv.getValue() != rv.getValue())
        if(lv is KoKoListValue && rv is KoKoListValue)
            return KoKoBoolValue(lv != rv)

        return KoKoBoolValue(true)
    }

}