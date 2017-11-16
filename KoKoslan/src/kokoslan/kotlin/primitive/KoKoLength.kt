/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.KoKoAst
import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoNumValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoLength : KoKoPrimitive {

    override val name = "length"

    fun eval(value: KoKoValue): KoKoValue? {
        return when (value) {
            is KoKoListValue -> KoKoNumValue(value.size.toDouble())
            else -> throw KoKoFailException()
        }
    }

    override fun buildLambdaPrimitive(): KoKoAst {
        throw KoKoFailException("Not implemented yet!!!")
    }

}