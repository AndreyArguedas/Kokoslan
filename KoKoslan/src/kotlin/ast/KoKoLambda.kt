/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.ast
import java.io.*

class KoKoLambda(private var pattern : KoKoAst, private var expr : KoKoAst, private var lambdaEvaluable : Boolean) : KoKoAst{
   fun getPattern() : KoKoAst { return this.pattern }

   fun getExpr() : KoKoAst { return this.expr }

   fun genCode(Out : PrintStream){
      if(this.lambdaEvaluable)
          Out.print(" ( ")
	  this.pattern.genCode(Out)
      if(!this.lambdaEvaluable)
	      Out.print(" -> ")
      if(this.lambdaEvaluable)
          Out.print(" ) ")
	  this.expr.genCode(Out)
   }

   fun eval(ctx : KoKoContext) : KoKoValue{
	   val value = expr.eval(ctx)
	   ctx.assoc(pattern as KoKoId, value)
	   return value
   }
}