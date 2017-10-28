/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*


class KoKoAtom<T>(private var value : T) : KoKoAst {

   fun getValue() : T {return this.value}

   fun genCode(Out : PrintStream) : Unit{
      Out.print(this.value + " ")
   }
   fun eval(ctx : KoKoContext) : KoKoValue {
	   throw KoKoEvalException("KoKoAtom: eval not implemented") 
   }
   override fun toString() : String {
	   return value.toString()
   }
}