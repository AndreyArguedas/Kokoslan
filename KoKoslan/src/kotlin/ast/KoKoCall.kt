/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import java.util.*
import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

class KoKoCall(protected var head : KoKoAst, protected var args : KoKoList = KoKoList()) : KoKoAst {

    override fun genCode(Out : PrintStream) : Unit { //The code we see when we do call.kl
        this.head.genCode(Out)
        Out.print(" (")
        this.args.genCode(Out)
        Out.print(") ")
    }

    override fun eval(ctx : KoKoContext) : KoKoValue? { //Evaluates the call, returns a value, context = id(args)
        return KoKoEvaluator(this.head, this.args).evaluate(ctx)
    }
    
}