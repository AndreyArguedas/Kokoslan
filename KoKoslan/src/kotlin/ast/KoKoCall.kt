/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.util.*
import java.io.*

class KoKoCall : KoKoAst{
    protected var args : KoKoList //Args is what is inside the parenthesis of a call to kokoslan function
    protected var head : KoKoAst //THE NAME OF THE CALL EXAMPLE THE PRINT

    constructor(head : KoKoAst, args : KoKoList) : this {
        this.head = head
        this.args = args
    }

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