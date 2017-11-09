/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import java.util.*
import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoProgram(private val statements: List < KoKoAst > ): KoKoAst {

    override fun genCode(Out: PrintStream) {
        statements.forEach {
            it.genCode(Out)
        }
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        var res: KoKoValue?
        for (i in 0 until statements.size - 1){
            val statemnt = statements.get(i)
            res = statemnt.eval(ctx)
        }
        res = statements.get(statements.size - 1).eval(ctx)
        return res
    }

    fun eval(): KoKoValue? { //El eval empieza ca
        return eval(KoKoContext())
    }
    
}