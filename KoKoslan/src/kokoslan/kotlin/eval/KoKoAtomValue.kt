/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kt.eval

import java.io.*
import kokoslan.kt.ast.*
import kokoslan.kt.exception.*


open class KoKoAtomValue<T>(private var value: T) : KoKoValue{
    
    fun getValue() : T {return value}

    override fun toString(): String{
        return value.toString()
    }

}