/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

class KoKoBool(value: Boolean) : KoKoAtom<Boolean>(value) {
    override fun eval(ctx : KoKoContext) : KoKoValue {
        return KoKoBoolValue(getValue())
    }
}