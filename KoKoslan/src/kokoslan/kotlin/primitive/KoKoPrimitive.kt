package kokoslan.kotlin.primitive

import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoValue

interface KoKoPrimitive {
    val name: String
    fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue?
}