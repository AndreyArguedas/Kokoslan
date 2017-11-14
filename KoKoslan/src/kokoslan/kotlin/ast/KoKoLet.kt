/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

class KoKoLet(private var id: KoKoAst, private var expr: KoKoAst) : KoKoAst {

    fun getId(): KoKoAst {
        return this.id
    }


    override fun genCode(Out: PrintStream) {
        Out.print("let ")
        this.id.genCode(Out)
        Out.print(" = ")
        this.expr.genCode(Out)
        Out.println()
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        val value = expr.eval(ctx)
        ctx.assoc(id as KoKoId, value)
        return value
    }

}