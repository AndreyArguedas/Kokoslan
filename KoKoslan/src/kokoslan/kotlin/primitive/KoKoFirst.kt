/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.KoKoAst
import kokoslan.kotlin.ast.KoKoId
import kokoslan.kotlin.ast.KoKoLambda
import kokoslan.kotlin.ast.KoKoListPat
import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoFirst : KoKoPrimitive {
    override val name = "first"

    override fun buildLambdaPrimitive(): KoKoAst {
        return KoKoLambda(KoKoListPat(KoKoId("#x"), KoKoId("#y")), KoKoId("#x"), false)
    }

}