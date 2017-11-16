/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import kokoslan.kotlin.eval.*
import java.io.PrintStream

class KoKoListPat(val head : KoKoAst, val rest : KoKoAst) : KoKoAst{

    override fun genCode(Out : PrintStream){
        Out.print("[")
        this.head.genCode(Out)
        Out.print("|")
        this.rest.genCode(Out)
        Out.print("]")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        val headValue = this.head.eval(ctx)
        val restValue = this.rest.eval(ctx)
        val l = restValue as KoKoListValue
        l.add(0, headValue)
        return KoKoListValue(l)
    }
}

