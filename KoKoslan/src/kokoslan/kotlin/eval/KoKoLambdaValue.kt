/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.eval

import kokoslan.kotlin.ast.*

class KoKoLambdaValue(val pattern : KoKoAst, val expr : KoKoAst, var ctx : KoKoContext) : KoKoValue