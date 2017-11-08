/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoBool(value: Boolean) : KoKoAtom<Boolean>(value) {
    override fun eval(ctx : KoKoContext) : KoKoValue {
        return KoKoBoolValue(getValue())
    }
}