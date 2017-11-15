/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval

import java.util.*
import kokoslan.kotlin.ast.*
import kokoslan.kotlin.exception.*

class KoKoContext (private var parent: KoKoContext? = null) : HashMap<String, KoKoValue?>(){

	fun find(id: KoKoId): KoKoValue{
		val value: KoKoValue? = get(id.getValue())
		return value ?: parent?.find(id) ?: throw KoKoNotFoundId(id)
	}

	fun contains(id: KoKoId): Boolean {
		var r = containsKey(id.getValue())
		if(!r) r = parent?.contains(id) ?: false
		return r
	}

	fun makeClone(): KoKoContext = this.clone() as KoKoContext

	fun assoc(id: KoKoId, value: KoKoValue?){
		put(id.getValue(), value)
	}

	fun push(): KoKoContext{
		return KoKoContext(this)
	}

	fun pop(): KoKoContext{
		return parent ?: throw KoKoStackUnderflow()
	}
	
}