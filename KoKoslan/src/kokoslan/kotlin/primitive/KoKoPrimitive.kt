package kokoslan.kotlin.primitive

import kokoslan.kt.eval.KoKoContext
import kokoslan.kt.eval.KoKoValue

interface KoKoPrimitive {
    val name: String
    fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue?
}