/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoId(value : String) : KoKoAtom<String>(value) {

   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return ctx.find(this)
   }
   
}