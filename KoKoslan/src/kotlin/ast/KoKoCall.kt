/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*

class KoKoCall(protected var args : KoKoList, protected var head : KoKoAst) : KoKoAst{

    constructor(head : KoKoAst) : this {
        this(head, KoKoList())
    }

    fun genCode(Out : PrintStream) : Unit { //The code we see when we do call.kl
        this.head.genCode(Out)
        Out.print(" (")
        this.args.genCode(Out)
        Out.print(") ")
    }

    fun eval(ctx : KoKoContext) : KoKoValue { //Evaluates the call, returns a value, context = id(args)
        return KoKoEvaluator(this.head, this.args).evaluate(ctx)
    }
    
}