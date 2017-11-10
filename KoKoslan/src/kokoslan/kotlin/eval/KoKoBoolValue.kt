/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval

import kokoslan.kotlin.ast.*
import kokoslan.kotlin.exception.*

class KoKoBoolValue(value: Boolean) : KoKoAtomValue<Boolean>(value){
    override fun getValue(): Boolean {
        return super.getValue()
    }
}