/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kt.eval

import java.util.*;
import java.io.*;
import kokoslan.kt.ast.*
import kokoslan.kt.exception.*

class KoKoLambdaValue(val pattern : KoKoAst, val expr : KoKoAst, var ctx : KoKoContext) : KoKoValue