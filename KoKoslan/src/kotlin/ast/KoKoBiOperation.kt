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


open class KoKoBiOperation(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoOperation(oper, Arrays.asList(left, right)) {

    fun left(): KoKoAst {
        return this.operands.get(0)
    }
    fun right(): KoKoAst {
        return this.operands.get(1)
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        try {
            val operId = this.oper as KoKoId
            val lv = left().eval(ctx) as KoKoNumValue
            val rv = right().eval(ctx) as KoKoNumValue
            when(operId.getValue()) {
                "+" -> return KoKoNumValue(lv.getValue() + rv.getValue())
                "-" -> return KoKoNumValue(lv.getValue() - rv.getValue())
                "*" -> return KoKoNumValue(lv.getValue() * rv.getValue())
                else -> throw KoKoEvalException("KoKoBiOperation unimpemented operator")
            }

        } catch (e: Exception) {
            throw KoKoEvalException(e.message!!)
        }

    }

}