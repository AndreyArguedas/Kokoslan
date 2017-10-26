/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*

class KoKoContext : HashMap<String, KoKoValue>{
	private var parent : KoKoContext

	constructor KoKoContext(){
		this(null)
	}

	constructor KoKoContext(parent: KoKoContext){
		this.parent = parent
	}

	fun find(id: KoKoId): KoKoValue{
		val value: KoKoValue = get(id.getValue())
		if (value != null) return value
		if (parent == null) throw KoKoNotFoundId(id)
		return parent.find(id)
	}
	fun assoc(id: KoKoId, value: KoKoValue): Unit{
		put(id.getValue(), value);
	}

	fun push(): KoKoContext{
		return KoKoContext(this);
	}

	fun pop(): KoKoContext{
		if ( parent == null ) throw KoKoStackUnderflow()
		return parent
	}
	
}