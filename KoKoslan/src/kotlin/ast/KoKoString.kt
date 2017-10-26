/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*

class KoKoString : KoKoAtom<String>{
   
   constructor(value : String) : this {
      super(value)
   }

   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return KoKoStringValue(getValue())  
   }
}