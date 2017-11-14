/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval

import kokoslan.kotlin.ast.*

data class KoKoEvaluator(private var head: KoKoAst, protected var args: KoKoList) {


    fun evaluate(tree: KoKoProgram, ctx: KoKoContext): KoKoValue? {
        return null
    }


}