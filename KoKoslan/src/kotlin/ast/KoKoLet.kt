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

class KoKoLet(private var id : KoKoAst, private var expr : KoKoAst) : KoKoAst {

   fun getId() : KoKoAst {return this.id}
   fun getExpr() : KoKoAst {return this.expr}
   
   override fun genCode(Out : PrintStream) : Unit{
      Out.print("let ")
	  this.id.genCode(Out)
	  Out.print(" = ")
	  this.expr.genCode(Out)
	  Out.println()
   }
   
   override fun eval(ctx : KoKoContext) : KoKoValue?{
	   val value = expr.eval(ctx)
	   ctx.assoc(id as KoKoId, value) //Parsing?
	   return value;
   }
}