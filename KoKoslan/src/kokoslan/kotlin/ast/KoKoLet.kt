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
   
   override fun genCode(Out : PrintStream){
      Out.print("let ")
	  this.id.genCode(Out)
	  Out.print(" = ")
	  this.expr.genCode(Out)
	  Out.println()
   }
   
   override fun eval(ctx : KoKoContext) : KoKoValue?{
       /*var reg = expr.toString() //To find recursion patterns
       if(reg.contains( getId().toString())){
           var kokorc = KoKoRecursiveClosure(expr, ctx.push())
           ctx.assoc(id as KoKoId, kokorc)
           return kokorc
       }*/
	   val value = expr.eval(ctx)
	   ctx.assoc(id as KoKoId, value)
	   return value
   }
   
}