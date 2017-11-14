/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval


open class KoKoAtomValue<T>(private var value: T) : KoKoValue {
    
    open fun getValue() : T {return value}

    override fun toString(): String{
        return value.toString()
    }

}