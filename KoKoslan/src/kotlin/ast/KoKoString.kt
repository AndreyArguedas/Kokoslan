/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast
import java.util.*
import java.io.*

class KoKoString(value : String) : KoKoAtom<String>(value) {
    
   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return KoKoStringValue(getValue())  
   }
}