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


/*  Lists of KoKoAst objects
    KoKoAst : Generates code with PrintStream,
    and can evaluate context and pass it to kokovalues
 */
class KoKoList(list : List<KoKoAst>? = null, var kokoNativeList: Boolean = false) : ArrayList<KoKoAst>(list), KoKoAst{
    
    override fun genCode(Out : PrintStream){
        if(this.size == 0) return
        if(kokoNativeList == true)
            Out.print("[ ")
        this.get(0).genCode(Out)
        this.drop(1)
            .forEach{Out.print(", "); it.genCode(Out);}
        if(kokoNativeList == true)
            Out.print("] ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        val res = KoKoListValue()
        for(i in 0 .. this.size-1) res.add(this.get(i).eval(ctx))
        return res
    }

    fun eval() : KoKoValue? {
        return eval(KoKoContext())
    }
    
} 