package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.KoKoAst
import kokoslan.kotlin.ast.KoKoId
import kokoslan.kotlin.ast.KoKoLambda
import kokoslan.kotlin.ast.KoKoListPat
import kokoslan.kotlin.exception.KoKoFailException
import kokoslan.kotlin.eval.KoKoContext
import kokoslan.kotlin.eval.KoKoListValue
import kokoslan.kotlin.eval.KoKoValue

class KoKoRest : KoKoPrimitive {

    override val name = "rest"

    override fun buildLambdaPrimitive(): KoKoAst {
        return KoKoLambda(KoKoListPat(KoKoId("#x"), KoKoId("#y")), KoKoId("#y"), false)
    }

}