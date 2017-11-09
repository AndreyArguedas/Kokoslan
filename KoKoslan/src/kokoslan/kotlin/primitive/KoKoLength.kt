package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kt.eval.KoKoContext
import kokoslan.kt.eval.KoKoListValue
import kokoslan.kt.eval.KoKoNumValue
import kokoslan.kt.eval.KoKoValue

class KoKoLength(): KoKoPrimitive {
    override val name = "length"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> KoKoNumValue(value.size.toDouble())
            else -> throw KoKoFailException()
        }
    }

}