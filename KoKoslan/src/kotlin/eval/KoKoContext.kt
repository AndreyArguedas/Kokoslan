/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*

class KoKoContext (private var parent: KoKoContext? = null) : HashMap<String, KoKoValue?>(){

	fun find(id: KoKoId): KoKoValue{
		val value: KoKoValue? = get(id.getValue())
		return value ?: parent?.find(id) ?: throw KoKoNotFoundId(id)
	}

	fun assoc(id: KoKoId, value: KoKoValue?): Unit{
		put(id.getValue(), value)
	}

	fun push(): KoKoContext{
		return KoKoContext(this)
	}

	fun pop(): KoKoContext{
		return parent ?: throw KoKoStackUnderflow()
	}
	
}