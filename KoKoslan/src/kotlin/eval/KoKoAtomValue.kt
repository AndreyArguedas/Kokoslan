/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

open class KoKoAtomValue<T>(private var value: T) : KoKoValue{

    override fun toString(): String{
        return value.toString()
    }
}