/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.kt.ast

import java.util.*
import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

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