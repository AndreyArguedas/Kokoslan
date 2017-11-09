/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

class KoKoTest(private val condition : KoKoAst, private val successExpr : KoKoAst, private var failExpr : KoKoAst) : KoKoAst{

    fun getCondition() : KoKoAst { return this.condition }

    fun getSuccessExpr() : KoKoAst { return this.successExpr }

    fun getFailExpr() : KoKoAst { return this.failExpr }

    override fun genCode(Out : PrintStream){

        getCondition().genCode(Out)
        Out.print(" ? ")
        getSuccessExpr().genCode(Out)
        Out.print(" : ")
        getFailExpr().genCode(Out)
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        var cond  = getCondition().eval(ctx)
        if(cond is KoKoBoolValue){
            var value = when(cond.getValue()){
                                    true -> getSuccessExpr().eval(ctx)
                                    false -> getFailExpr().eval(ctx)
            }
            return value
        }
        return null
    }

}