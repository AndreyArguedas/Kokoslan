/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import java.util.*
import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoProgram(private val statements: List < KoKoAst > ): KoKoAst {

    override fun genCode(Out: PrintStream) {
        statements.forEach {
            it.genCode(Out)
        }
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        var res: KoKoValue?
        for (i in 0..statements.size-1){
            res = statements.get(i).eval(ctx)
        }
        res = statements.get(statements.size - 1).eval(ctx)
        return res
    }

    fun eval(): KoKoValue? {
        return eval(KoKoContext())
    }
    
}