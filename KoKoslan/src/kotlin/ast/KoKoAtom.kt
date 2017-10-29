/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*


open class KoKoAtom<T>(private var value : T) : KoKoAst {

   fun getValue() : T {return value}

   override fun genCode(Out : PrintStream) : Unit{
      Out.print(value.toString() + " ")
   }
   override fun eval(ctx : KoKoContext) : KoKoValue {
	   throw KoKoEvalException("KoKoAtom: eval not implemented") 
   }
   override fun toString() : String {
	   return value.toString()
   }
}