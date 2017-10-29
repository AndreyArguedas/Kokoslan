/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.compile
import kokoslan.ast.*
import java.util.*

/* SEE THE GRAMMAR AND COMPARE IT WITH THIS, THIS INTERFACE
   IS VERY IMPORTANT, GIVES GRAMMAR A SENSE, TURNS GRAMMAR WORDS
   TO OBJECTS, EACH TIME SOMETHING IS CHANGED IN GRAMMAR
   IS NECESSARY TO CHANGE IT OR IMPLEMENT IT HERE
*/

public interface KoKoEmiter{
	
   val TRUE : KoKoBool get() = KoKoBool(true) 
   val FALSE : KoKoBool get() = KoKoBool(false)
   
   val PLUS : KoKoId get() = KoKoId("+")
   val MINUS : KoKoId get() = KoKoId("-")
   val MULT : KoKoId get() = KoKoId("*")
   val DIV : KoKoId get() = KoKoId("/")
   val MODULUS : KoKoId get() = KoKoId("%")
   val ERROR : KoKoId get() = KoKoId("??")
   
   fun PROGRAM(stmts : MutableList<KoKoAst>) : KoKoProgram {  //DEFAULT?
       return KoKoProgram(stmts)
   }
   
   fun LET(id : KoKoAst, expr : KoKoAst) : KoKoAst { //DEFAULT
	   return KoKoLet(id, expr)
   }
   fun OPERATOR(oper : String) : KoKoAst { //DEFAULT
	   return KoKoId(oper)
   }
   fun OPERATION(oper : KoKoAst, operands : MutableList<KoKoAst>) : KoKoAst { //DEFAULT
       return KoKoOperation(oper, operands)
   }
   
   fun BI_OPERATION(oper : KoKoAst, left : KoKoAst, right : KoKoAst) : KoKoAst {  //DEFAULT
       val id = oper as KoKoId //PARSING
	   when(id.getValue() ){
		   "+" -> return KoKoPLUS(oper, left, right);
		   "-" -> return KoKoMINUS(oper, left, right);
           "*" -> return KoKoMULT(oper, left, right);
           "/" -> return KoKoDIV(oper, left, right);
           "%" -> return KoKoMODULUS(oper, left, right);
		   else -> return KoKoBiOperation(oper, left, right);
	   }
       
   }
   
   fun NUM(value : Double) : KoKoNum{   //DEFAULT
       return KoKoNum(value)
   }

  fun STRING(value : String) : KoKoString {   //DEFAULT
       return KoKoString(value)
   }
   
   fun ID(value : String) : KoKoId{ 
       return KoKoId(value)
   }
   
   fun LIST(expressions : List<KoKoAst>) : KoKoList{ //Arguments with expressions  //DEFAULT 
       return KoKoList(expressions)
   }

   fun LIST() : KoKoList { //Empty arguments   //DEFAULT
        return KoKoList()
   }
   
   fun CALL(head : KoKoAst, args : KoKoList) : KoKoAst {   //DEFAULT
       return KoKoCall(head, args)
   }
   
   
}