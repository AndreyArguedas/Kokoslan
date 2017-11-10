package kokoslan.kotlin.primitive

import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.ast.KoKoCall
import kokoslan.kotlin.ast.KoKoId
import kokoslan.kotlin.ast.KoKoLambda
import kokoslan.kotlin.ast.KoKoListPat
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoNumValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoCons(): KoKoPrimitive {
    override val name = "cons"


    override fun eval(value: KoKoValue, ctx: KoKoContext): KoKoValue? {

        return when(value) {
            is KoKoListValue -> value.getFirst()
            else -> throw KoKoFailException()
        }
    }

}