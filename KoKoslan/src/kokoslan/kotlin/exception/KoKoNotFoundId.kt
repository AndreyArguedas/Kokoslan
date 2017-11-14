/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.exception

import kokoslan.kotlin.ast.*

class KoKoNotFoundId(id: KoKoId) : RuntimeException("*** Id ${id.getValue()} is not defined! ***")