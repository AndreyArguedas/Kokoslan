package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kt.eval.KoKoContext
import kokoslan.kt.eval.KoKoListValue
import kokoslan.kt.eval.KoKoValue

class KoKoRest(): KoKoPrimitive {
    override val name = "rest"

    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {
        return when(value) {
            is KoKoListValue -> KoKoListValue(value.drop(1))
            else -> throw KoKoFailException()
        }
    }

}