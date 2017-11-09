package kokoslan.kt.ast

import kokoslan.kt.eval.*
import java.io.PrintStream

class KoKoListPat(val head : KoKoAst, val rest : KoKoAst) : KoKoAst{

    /*fun getHead() : KoKoAst { return head }

    fun getExpr() : KoKoAst { return this.expr }*/

    override fun genCode(Out : PrintStream){
        Out.print("[")
        this.head.genCode(Out)
        Out.print("|")
        this.rest.genCode(Out)
        Out.print("]")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? { //La idea es no evaluar una lambda hasta que no le hagan call
        var headValue = this.head.eval(ctx)
        var restValue = this.rest.eval(ctx)
        val l = restValue as KoKoListValue
        l.add(0, headValue)
        return KoKoListValue(l)
    }
}

