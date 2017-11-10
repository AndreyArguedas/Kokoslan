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
class KoKoCase(list : List<KoKoAst>? = null) : ArrayList<KoKoAst>(list), KoKoAst{

    override fun genCode(Out : PrintStream){
        //println("He venido a imprimirme 1 " + this)
        if(this.size == 0) return
        //println("He venido a imprimirme" + this)
        Out.print("{ ")
        this.get(0).genCode(Out); //First KoKoAST gens code
        this.drop(1)
            .forEach{Out.print(", "); it.genCode(Out);}
        Out.print("} ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? {
        //return KoKoCall().eval(ctx);
        val res = KoKoListValue()
        for(i in 0 until this.size) res.add(this.get(i).eval(ctx))
        return res
    }

    fun eval() : KoKoValue? { //See the upper method
        return eval(KoKoContext())
    }
    
} 