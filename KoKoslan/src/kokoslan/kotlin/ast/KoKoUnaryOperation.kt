/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoUnaryOperation(oper: KoKoAst, value: KoKoAst, val isPrefix: Boolean = false) : KoKoOperation(oper, mutableListOf(value)) {

    fun getValue(): KoKoAst {
        return this.operands[0]
    }

    private fun setToCtx(ctx: KoKoContext, id: KoKoId, value: KoKoNumValue) {
        ctx.set(id.getValue(), value)
    }

    private fun plusPlus(ctx: KoKoContext): KoKoNumValue {
        val valueId = getValue() as KoKoId
        var value = getValue().eval(ctx) as KoKoNumValue
        if (isPrefix) {
            value = KoKoNumValue(value.getValue() + 1)
            setToCtx(ctx, valueId, value)
        } else
            setToCtx(ctx, valueId, KoKoNumValue(value.getValue() + 1))
        return value
    }

    private fun minusMinus(ctx: KoKoContext): KoKoNumValue {
        val valueId = getValue() as KoKoId
        var value = getValue().eval(ctx) as KoKoNumValue
        if (isPrefix) {
            value = KoKoNumValue(value.getValue() - 1)
            setToCtx(ctx, valueId, value)
        } else
            setToCtx(ctx, valueId, KoKoNumValue(value.getValue() - 1))
        return value
    }

    fun not(ctx: KoKoContext): KoKoBoolValue {
        val kbv = getValue().eval(ctx) as KoKoBoolValue
        return when (kbv.getValue()) {
            true -> KoKoBoolValue(false)
            else -> KoKoBoolValue(true)
        }
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        try {
            val operId = this.oper as KoKoId
            return when (operId.getValue()) {
                "++" -> plusPlus(ctx)
                "--" -> minusMinus(ctx)
                "!" -> not(ctx)
                else -> throw KoKoEvalException("KoKoUnaryOperation unimpemented operator")
            }
        } catch (e: Exception) {
            throw KoKoEvalException(e.message!!)
        }
    }

    override fun genCode(Out: PrintStream) {
        if (isPrefix) {
            genOperCode(Out)
            getValue().genCode(Out)
        } else {
            genValueCode(Out)
            genOperCode(Out)
        }
    }

    private fun genOperCode(Out: PrintStream) {
        Out.print(this.oper.toString())
    }

    private fun genValueCode(Out: PrintStream) {
        Out.print(getValue().toString())
    }
}