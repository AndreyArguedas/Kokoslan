/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast;

class KoKoId(value : String) : KoKoAtom<String>(value) {

   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return ctx.find(this)
   }
   
}