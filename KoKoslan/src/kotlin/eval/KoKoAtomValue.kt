/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

open class KoKoAtomValue<T>(private var value: T) : KoKoValue{
    
    fun getValue() : T {return value}

    override fun toString(): String{
        return value.toString()
    }
}