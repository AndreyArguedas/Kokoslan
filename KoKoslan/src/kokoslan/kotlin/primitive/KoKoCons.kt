/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.*

class KoKoCons: KoKoPrimitive {
    override val name = "cons"


    override fun buildLambdaPrimitive(): KoKoAst {
        return KoKoLambda(KoKoId("#x"), KoKoLambda(KoKoId("#y"), KoKoListPat(KoKoId("#x"), KoKoId("#y")), false), true)
    }

}