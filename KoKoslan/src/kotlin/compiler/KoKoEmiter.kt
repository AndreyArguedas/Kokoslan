/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.compile
import kokoslan.ast.*
import java.util.*

/* SEE THE GRAMMAR AND COMPARE IT WITH THIS, THIS INTERFACE
   IS VERY IMPORTANT, GIVES GRAMMAR A SENSE, TURNS GRAMMAR WORDS
   TO OBJECTS, EACH TIME SOMETHING IS CHANGED IN GRAMMAR
   IS NECESSARY TO CHANGE IT OR IMPLEMENT IT HERE
*/

public interface KoKoEmiter{
	
   val TRUE = KoKoBool(true) 
   val FALSE = KoKoBool(false)
   
   val PLUS = KoKoId("+")
   val MINUS = KoKoId("-")
   val MULT = new KoKoId("*")
   val DIV = new KoKoId("/")
   val MODULUS = KoKoId("%")
   val ERROR = new KoKoId("??")
   
   fun PROGRAM(stmts : List<KoKoAst>) : KoKoProgram {  //DEFAULT?
       return KoKoProgram(stmts)
   }
   
   fun LET(id : KoKoAst, expr : KoKoAst) : KoKoAst { //DEFAULT
	   return KoKoLet(id, expr)
   }
   fun OPERATOR(Operator : String) : KoKoAst { //DEFAULT
	   return KoKoId(Operator)
   }
   fun OPERATION(Operator : KoKoAst, operands : List<KoKoAst>) : KoKoAst { //DEFAULT
       return KoKoOperation(Operator, operands)
   }
   
   fun BI_OPERATION(Operator : KoKoAst, left : KoKoAst, right : KoKoAst) : KoKoAst {  //DEFAULT
       val id = (KoKoId)Operator //PARSING
	   when(id.getValue() ){
		   "+" -> return KoKoPLUS(Operator, left, right);
		   "-" -> return KoKoMINUS(Operator, left, right);
           "*" -> return KoKoMULT(Operator, left, right);
           "/" -> return KoKoDIV(Operator, left, right);
           "%" -> return KoKoMODULUS(Operator, left, right);
		   else -> return KoKoBiOperation(Operator, left, right);
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