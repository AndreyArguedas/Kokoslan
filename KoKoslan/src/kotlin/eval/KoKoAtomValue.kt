/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

class KoKoAtomValue<T> : KoKoValue{
    private var value: T

    fun getValue(): T{
        return this.value
    }

    constructor(value: T){
        this.value = value
    }

    fun toString(): String{
        return this.value.toString()
    }
}