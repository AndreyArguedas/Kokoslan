/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kt.exception
import kokoslan.kt.ast.*

class KoKoNotFoundId(id: KoKoId) : RuntimeException("*** Id ${id.getValue()} is not defined! ***") { }