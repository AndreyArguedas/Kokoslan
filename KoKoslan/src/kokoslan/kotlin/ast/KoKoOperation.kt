/* 
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

open class KoKoOperation(var oper: KoKoAst, var operands: MutableList<KoKoAst> = mutableListOf<KoKoAst>()) : KoKoAst {
    
    fun addOperand(x: KoKoAst) {
        this.operands.add(x)
    }

    override fun genCode(Out: PrintStream) {
        this.operands.get(0).genCode(Out)
        this.operands.drop(1)
                     .forEach{
                         this.oper.genCode(Out)
                         it.genCode(Out)
                     }
    }

    override fun eval(ctx: KoKoContext): KoKoValue {
        throw KoKoEvalException("KoKoOperation: eval not implemented");
    }

}