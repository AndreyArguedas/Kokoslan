/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval

import java.util.*

class KoKoListValue: ArrayList<KoKoValue?>, KoKoValue{
    constructor() : super()
    constructor(list : List<KoKoValue?>) : super(list)

    fun getValue(): KoKoListValue {
        return this
    }

    fun getRest() : KoKoListValue{
        return KoKoListValue(this.drop(1))
    }

    fun getFirst() : KoKoValue?{
        return this.firstOrNull()
    }

    fun getClone() : KoKoListValue = this.clone() as KoKoListValue

    fun dropFirst() : KoKoListValue = KoKoListValue(this.getClone().drop(1))
}