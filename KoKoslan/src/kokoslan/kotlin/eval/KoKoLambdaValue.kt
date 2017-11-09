/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.eval

import java.util.*;
import java.io.*;
import kokoslan.kotlin.ast.*
import kokoslan.kotlin.exception.*

class KoKoLambdaValue(val pattern : KoKoAst, val expr : KoKoAst, var ctx : KoKoContext) : KoKoValue