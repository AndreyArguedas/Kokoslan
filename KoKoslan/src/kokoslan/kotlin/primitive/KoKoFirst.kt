package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoFirst(): KoKoPrimitive {
    override val name = "first"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> value.getFirst()
            else -> throw KoKoFailException()
        }
    }

}