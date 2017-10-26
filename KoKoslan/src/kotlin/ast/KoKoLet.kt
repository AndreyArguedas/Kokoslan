/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

class KoKoLet : KoKoAst {
   private var id : KoKoAst
   fun getId() : KoKoAst {return this.id}
   
   private var expr : KoKoAst
   fun getExpr() : KoKoAst {return this.expr}
   
   constructor(id : KoKoAst, expr : KoKoAst) : this {
      this.id = id
	  this.expr = expr
   }
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