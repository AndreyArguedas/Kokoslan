/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast;
import java.util.*;
import java.io.*;

/*  Lists of KoKoAst objects
    KoKoAst : Generates code with PrintStream,
    and can evaluate context and pass it to kokovalues
 */
class KoKoList : ArrayList<KoKoAst>, KoKoAst{
    constructor(list : List<KoKoAst>) : this {
        super(list)
    }

    constructor() : this {
        super()
    }

    fun genCode(out : PrintStream){
        if(this.size() == 0) return
        this.get(0).genCode(out)
        
        this.drop(1)
            .forEach( t -> {
                            out.print(", ");
                            t.genCode(out)
            })
    }

    fun eval(ctx : KoKoContext) : KoKoValue {
        val res = KoKoListValue()
        //for(i in 0 .. this.size()) res.add(this.get(i).eval(ctx))
        (0 .. this.size()).forEach { res.add(this.get(it).eval(ctx)) }
        return res
    }

    fun eval() : KoKoValue {
        return eval(KoKoContext())
    }
} 