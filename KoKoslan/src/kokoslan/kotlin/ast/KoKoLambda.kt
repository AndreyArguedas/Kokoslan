/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import jdk.nashorn.internal.codegen.CompilerConstants
import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoLambda(private val pattern : KoKoAst, private val expr : KoKoAst, private var lambdaEvaluable : Boolean) : KoKoAst{
   fun getPattern() : KoKoAst { return this.pattern }

   fun getExpr() : KoKoAst { return this.expr }

   override fun genCode(Out : PrintStream){
       if(this.lambdaEvaluable)
           Out.print("(")
       Out.print("\\")
       this.pattern.genCode(Out)
       Out.print(". ")
       this.expr.genCode(Out)
       if(this.lambdaEvaluable)
           Out.print(") ")
   }

   override fun eval(ctx : KoKoContext) : KoKoValue? { //La idea es no evaluar una lambda hasta que no le hagan call
       if(lambdaEvaluable) {
           val newCtx = ctx.push()
           val ptrn = pattern as KoKoLambda
           val kokoLambdaValue = KoKoLambdaValue(ptrn.pattern, ptrn.expr, newCtx.push())
           newCtx.assoc(KoKoId(pattern.hashCode().toString()), kokoLambdaValue)
           val r = KoKoCall(KoKoId(pattern.hashCode().toString()), KoKoList(listOf(expr))).eval(kokoLambdaValue.ctx)
           return r
       }
       val kokoLambdaValue = KoKoLambdaValue(pattern as KoKoId, expr, ctx.push())   //Hacer el return de una vez
       return kokoLambdaValue
   }
}