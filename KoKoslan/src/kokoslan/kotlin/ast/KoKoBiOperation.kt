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

open class KoKoBiOperation(oper: KoKoAst, left: KoKoAst, right: KoKoAst) : KoKoOperation(oper, Arrays.asList(left, right)) {

    fun left(): KoKoAst {
        return this.operands[0]
    }

    fun right(): KoKoAst {
        return this.operands[1]
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        try {
            val operId = this.oper as KoKoId
            val leftCtx = ctx.makeClone()
            val rightCtx = ctx.makeClone()
            val lv = left().eval(leftCtx) as KoKoNumValue
            val rv = right().eval(rightCtx) as KoKoNumValue
            return when (operId.getValue()) {
                "+" -> KoKoNumValue(lv.getValue() + rv.getValue())
                "-" -> KoKoNumValue(lv.getValue() - rv.getValue())
                "*" -> KoKoNumValue(lv.getValue() * rv.getValue())
                "/" -> KoKoNumValue(lv.getValue() / rv.getValue())
                "%" -> KoKoNumValue(lv.getValue() % rv.getValue())
                "^" -> KoKoNumValue(Math.pow(lv.getValue(), rv.getValue()))
                else -> throw KoKoEvalException("KoKoBiOperation unimplemented operator")
            }

        } catch (e: Exception) {
            throw KoKoEvalException(e.message!!)
        }
    }

}