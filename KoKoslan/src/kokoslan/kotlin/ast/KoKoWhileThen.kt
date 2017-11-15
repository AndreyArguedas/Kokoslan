/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

class KoKoWhileThen(private val whileCondition: KoKoAst, private val body: KoKoAst, private var then: KoKoAst) : KoKoAst {

    private fun getCondition(): KoKoAst {
        return this.whileCondition
    }

    private fun getBody(): KoKoAst {
        return this.body
    }

    private fun getThen(): KoKoAst {
        return this.then
    }

    override fun genCode(Out: PrintStream) {
        Out.print("while(")
        getCondition().genCode(Out)
        Out.println(") {")
        getBody().genCode(Out)
        Out.print("}")
        getThen().genCode(Out)
        Out.println()
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        var condition = getCondition().eval(ctx) as KoKoBoolValue
        if(condition.getValue())
            while ( condition.getValue() ) {
                body.eval(ctx)
                condition = getCondition().eval(ctx) as KoKoBoolValue
            }
        return getThen().eval(ctx)
    }

}