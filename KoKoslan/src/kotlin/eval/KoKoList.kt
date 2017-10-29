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
class KoKoList(list : List<KoKoAst>? = null) : ArrayList<KoKoAst>(list), KoKoAst{
    
    override fun genCode(Out : PrintStream) : Unit {
        if(this.size == 0) return
        this.get(0).genCode(Out)
        this.drop(1)
            .forEach{Out.print(", "); it.genCode(Out);}
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        val res = KoKoListValue()
        for(i in 0 .. this.size) res.add(this.get(i).eval(ctx))
        //(0 .. this.size).forEach { res.add(this.get(it).eval(ctx)) }
        return res
    }

    fun eval() : KoKoValue? {
        return eval(KoKoContext())
    }
} 