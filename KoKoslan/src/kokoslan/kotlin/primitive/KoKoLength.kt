package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoNumValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoLength(): KoKoPrimitive {
    override val name = "length"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> KoKoNumValue(value.size.toDouble())
            else -> throw KoKoFailException()
        }
    }

}