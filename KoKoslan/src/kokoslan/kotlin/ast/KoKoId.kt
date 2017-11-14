/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import kokoslan.kotlin.eval.*

class KoKoId(value : String) : KoKoAtom<String>(value) {

    override fun eval(ctx : KoKoContext) : KoKoValue {
        return ctx.find(this)
    }
   
}