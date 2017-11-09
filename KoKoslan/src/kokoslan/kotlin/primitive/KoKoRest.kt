package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoRest(): KoKoPrimitive {
    override val name = "rest"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> KoKoListValue(value.drop(1))
            else -> throw KoKoFailException()
        }
    }

}