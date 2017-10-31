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

open class KoKoAtom<T>(private var value : T) : KoKoAst {

   fun getValue() : T {return value}

   override fun genCode(Out : PrintStream){
      Out.print(value.toString() + " ")
   }

   override fun eval(ctx : KoKoContext) : KoKoValue {
	   throw KoKoEvalException("KoKoAtom: eval not implemented") 
   }
   
   override fun toString() : String {
	   return value.toString()
   }
   
}