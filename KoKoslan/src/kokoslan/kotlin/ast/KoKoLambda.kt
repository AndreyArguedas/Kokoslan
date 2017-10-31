/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoLambda(private var pattern : KoKoAst, private var expr : KoKoAst, private var lambdaEvaluable : Boolean) : KoKoAst{
   fun getPattern() : KoKoAst { return this.pattern }

   fun getExpr() : KoKoAst { return this.expr }

   override fun genCode(Out : PrintStream){
      if(this.lambdaEvaluable)
          Out.print(" ( ")
	  this.pattern.genCode(Out)
      if(!this.lambdaEvaluable)
	      Out.print(" -> ")
      if(this.lambdaEvaluable)
          Out.print(" ) ")
	  this.expr.genCode(Out)
   }

   override fun eval(ctx : KoKoContext) : KoKoValue?{ //La idea es no evaluar una lambda hasta que no le hagan call

       var kokolamb = KoKoLambdaValue(pattern as KoKoId, expr, ctx.push())
       //x -> x * x   //{x : x * x}
       ctx.assoc(pattern as KoKoId, kokolamb) //Mete en el hash de KoKoContext
       return kokolamb
       /*val value = expr.eval(ctx)
	   ctx.assoc(pattern as KoKoId, value)
	   return value*/
   }

}