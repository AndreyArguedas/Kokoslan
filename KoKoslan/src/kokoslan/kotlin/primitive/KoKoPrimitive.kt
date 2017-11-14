package kokoslan.kotlin.primitive

import kokoslan.kotlin.ast.KoKoAst


interface KoKoPrimitive {
    val name: String
    fun buildLambdaPrimitive() : KoKoAst
}