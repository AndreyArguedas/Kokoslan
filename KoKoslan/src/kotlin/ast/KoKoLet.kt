/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

class KoKoLet(private var id : KoKoAst, private var expr : KoKoAst) : KoKoAst {

   fun getId() : KoKoAst {return this.id}
   fun getExpr() : KoKoAst {return this.expr}
   
   fun genCode(Out : PrintStream) : Unit{
      Out.print("let ")
	  this.id.genCode(Out)
	  Out.print(" = ")
	  this.expr.genCode(Out)
	  Out.println()
   }
   fun eval(ctx : KoKoContext) : KoKoValue{
	   val value = expr.eval(ctx)
	   ctx.assoc((KoKoId)id, value) //Parsing?
	   return value;
   }
}