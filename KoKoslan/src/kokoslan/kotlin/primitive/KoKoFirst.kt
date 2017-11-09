package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kt.eval.KoKoContext
import kokoslan.kt.eval.KoKoListValue
import kokoslan.kt.eval.KoKoValue

class KoKoFirst(): KoKoPrimitive {
    override val name = "first"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> value.getFirst()
            else -> throw KoKoFailException()
        }
    }

}