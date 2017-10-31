/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.ast;
import java.io.*;
import kokoslan.java.eval.*;


public class KoKoLambda implements KoKoAst{
   private KoKoAst pattern;

   public KoKoAst getPattern(){return this.pattern;}
   
   private KoKoAst expr;

   private boolean lambdaEvaluable = false;

   public KoKoAst getExpr(){return this.expr;}
   
   public KoKoLambda(KoKoAst pattern, KoKoAst expr, boolean evaluable){
      this.pattern = pattern;
	  this.expr = expr;
      this.lambdaEvaluable = evaluable;
   }
   public void genCode(PrintStream out){
      if(this.lambdaEvaluable)
          out.print(" ( ");  
	  this.pattern.genCode(out);
      if(!this.lambdaEvaluable)
	      out.print(" -> ");
      if(this.lambdaEvaluable)
          out.print(" ) ");
	  this.expr.genCode(out);
      
   }
   public KoKoValue eval(KoKoContext ctx){
	   KoKoValue val = expr.eval(ctx);
	   ctx.assoc((KoKoId)pattern, val);
	   return val;
   }
}