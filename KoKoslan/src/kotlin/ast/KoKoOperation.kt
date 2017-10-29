/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.util.*;
import java.io.*;

open class KoKoOperation(var oper: KoKoAst, var operands: MutableList<KoKoAst> = mutableListOf<KoKoAst>()) : KoKoAst {
    fun addOperand(x: KoKoAst) {
        this.operands.add(x)
    }
    override fun genCode(outS: PrintStream) {
        this.operands.get(0).genCode(outS)
        this.operands.drop(1)
                     .forEach{
                         this.oper.genCode(outS)
                         it.genCode(outS)
                     }
    }
    override fun eval(ctx: KoKoContext): KoKoValue {
        throw KoKoEvalException("KoKoOperation: eval not implemented");
    }
}