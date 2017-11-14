/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.util.*
import java.io.*
import kokoslan.kotlin.eval.*

class KoKoCase(list: List<KoKoAst>? = null) : ArrayList<KoKoAst>(list), KoKoAst {

    override fun genCode(Out: PrintStream) {
        if (this.size == 0) return
        Out.println("{ ")
        Out.print("\t  ")
        this[0].genCode(Out)
        this.drop(1)
                .forEach { Out.print("\t| "); it.genCode(Out); }
        Out.println("\n}")
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        val casesList = mutableListOf<KoKoAst>()
        val newCtx = ctx.push()

        for (i in 0 until this.size - 1) {
            val myLet = this[i] as KoKoLet
            casesList.add(myLet)
            newCtx.assoc(myLet.getId() as KoKoId, myLet.eval(newCtx))
        }
        val myCall = this.last()
        return KoKoCaseValue(KoKoList(casesList.toList()), myCall, newCtx)

    }

    fun eval(): KoKoValue? {
        return eval(KoKoContext())
    }

} 