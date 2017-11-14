/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.eval

import java.util.*
import java.io.*
import kokoslan.kotlin.ast.*


class KoKoList(var list : List<KoKoAst>? = null, private var kokoNativeList: Boolean = false) : ArrayList<KoKoAst>(list), KoKoAst{
    
    override fun genCode(Out : PrintStream){
        if(this.size == 0) return
        if(kokoNativeList)
            Out.print("[ ")
        this[0].genCode(Out)
        this.drop(1)
            .forEach{Out.print(", "); it.genCode(Out);}
        if(kokoNativeList)
            Out.print("] ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        val res = KoKoListValue()
        (0 until this.size).mapTo(res) { this[it].eval(ctx) }
        return res
    }

    fun eval() : KoKoValue? {
        return eval(KoKoContext())
    }
    
} 