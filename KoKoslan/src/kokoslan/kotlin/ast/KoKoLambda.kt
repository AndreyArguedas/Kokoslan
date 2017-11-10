/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import jdk.nashorn.internal.codegen.CompilerConstants
import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoLambda(val pattern : KoKoAst, private val expr : KoKoAst, var isLambdaEvaluable : Boolean) : KoKoAst{

   override fun genCode(Out : PrintStream){
       if(isLambdaEvaluable)
           Out.print("(")
       Out.print("\\")
       this.pattern.genCode(Out)
       Out.print(". ")
       this.expr.genCode(Out)
       if(isLambdaEvaluable)
           Out.print(") ")
   }

    fun getExpr() : KoKoAst{
        return this.getExpr()
    }

   override fun eval(ctx : KoKoContext) : KoKoValue? { //La idea es no evaluar una lambda hasta que no le hagan call
       if(isLambdaEvaluable) {
           val newCtx = ctx.push()
           val ptrn = pattern as KoKoLambda
           val kokoLambdaValue = KoKoLambdaValue(ptrn.pattern, ptrn.expr, newCtx.push())
           newCtx.assoc(KoKoId(pattern.hashCode().toString()), kokoLambdaValue)
           val r = KoKoCall(KoKoId(pattern.hashCode().toString()), KoKoList(listOf(expr))).eval(kokoLambdaValue.ctx)
           return r
       }
       val kokoLambdaValue : KoKoLambdaValue
       if(pattern is KoKoListPat)
           kokoLambdaValue = KoKoLambdaValue(pattern, expr, ctx.push())
       else
           kokoLambdaValue = KoKoLambdaValue(pattern as KoKoId, expr, ctx.push())
       return kokoLambdaValue
   }
}