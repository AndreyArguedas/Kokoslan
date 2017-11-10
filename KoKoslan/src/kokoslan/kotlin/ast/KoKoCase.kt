/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.ast

import java.util.*
import java.io.*
import java.util.stream.IntStream
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

/*  Lists of KoKoAst objects
    KoKoAst : Generates code with PrintStream,
    and can evaluate context and pass it to kokovalues
 */
class KoKoCase(list: List<KoKoAst>? = null) : ArrayList<KoKoAst>(list), KoKoAst {

    override fun genCode(Out: PrintStream) {
        if (this.size == 0) return
        Out.print("{ ")
        this.get(0).genCode(Out)
        this.drop(1)
                .forEach { Out.print(", "); it.genCode(Out); }
        Out.print("} ")
    }

    override fun eval(ctx: KoKoContext): KoKoValue? {
        var casesList = mutableListOf<KoKoAst>()
        var newCtx = ctx.push()

        for (i in 0 until this.size - 1){
            var myLet = this[i] as KoKoLet
            casesList.add(myLet)
            newCtx.assoc(myLet.getId() as KoKoId, myLet.eval(newCtx))
        }
        var myCall = this.last() as KoKoCall
        return KoKoCaseValue(KoKoList(casesList.toList()), myCall, newCtx)

        /*val res = KoKoListValue()
        for(i in 0 until this.size) res.add(this.get(i).eval(ctx))
        return res*/
    }

    fun eval(): KoKoValue? { //See the upper method
        return eval(KoKoContext())
    }

} 