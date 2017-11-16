/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.KoKoAst


interface KoKoPrimitive {
    val name: String
    fun buildLambdaPrimitive() : KoKoAst
}