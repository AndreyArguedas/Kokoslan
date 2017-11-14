/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

class KoKoProgram(private val statements: List < KoKoAst > ): KoKoAst {

    override fun genCode(Out: PrintStream) {
        statements.forEach {
            it.genCode(Out)
        }
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        var res: KoKoValue?
        (0 until statements.size - 1)
                .map { statements.get(it) }
                .forEach { res = it.eval(ctx) }
        res = statements[statements.size - 1].eval(ctx)
        return res
    }

    fun eval(): KoKoValue? {
        return eval(KoKoContext())
    }
    
}