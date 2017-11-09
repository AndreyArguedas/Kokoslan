package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kt.ast.KoKoCall
import kokoslan.kt.ast.KoKoId
import kokoslan.kt.ast.KoKoLambda
import kokoslan.kt.ast.KoKoListPat
import kokoslan.kt.eval.KoKoContext
import kokoslan.kt.eval.KoKoListValue
import kokoslan.kt.eval.KoKoNumValue
import kokoslan.kt.eval.KoKoValue

class KoKoCons(): KoKoPrimitive {
    override val name = "cons"


    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {

        return when(value) {
            is KoKoListValue -> value.getFirst()
            else -> throw KoKoFailException()
        }
    }

}