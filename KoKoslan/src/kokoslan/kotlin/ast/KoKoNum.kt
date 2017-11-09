/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoNum(value : Double) : KoKoAtom<Double>(value){

   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return KoKoNumValue(getValue())
   }
   
}