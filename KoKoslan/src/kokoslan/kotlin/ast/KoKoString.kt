/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import java.util.*
import java.io.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoString(value : String) : KoKoAtom<String>(value) {
    
   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return KoKoStringValue(getValue())  
   }
   
}