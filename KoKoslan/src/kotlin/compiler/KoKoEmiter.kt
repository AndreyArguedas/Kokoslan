/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.compile

import java.util.*
import kokoslan.kt.ast.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

/* SEE THE GRAMMAR AND COMPARE IT WITH THIS, THIS INTERFACE
   IS VERY IMPORTANT, GIVES GRAMMAR A SENSE, TURNS GRAMMAR WORDS
   TO OBJECTS, EACH TIME SOMETHING IS CHANGED IN GRAMMAR
   IS NECESSARY TO CHANGE IT OR IMPLEMENT IT HERE
*/

public interface KoKoEmiter{
	
   val TRUE : KoKoBool get() = KoKoBool(true) 
   val FALSE : KoKoBool get() = KoKoBool(false)
   
   val PLUS : KoKoAst get() = KoKoId("+")
   val MINUS : KoKoAst get() = KoKoId("-")
   val MULT : KoKoAst get() = KoKoId("*")
   val DIV : KoKoAst get() = KoKoId("/")
   val MODULUS : KoKoAst get() = KoKoId("%")
   val POW :  KoKoAst get() = KoKoId("%");
   val ERROR : KoKoAst get() = KoKoId("??")
   
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
       val id = oper as KoKoId
	   when(id.getValue() ){
		   "+" -> return KoKoPLUS(oper, left, right)
		   "-" -> return KoKoMINUS(oper, left, right)
           "*" -> return KoKoMULT(oper, left, right)
           "/" -> return KoKoDIV(oper, left, right)
           "%" -> return KoKoMODULUS(oper, left, right)
           "^" -> return KoKoPOW(oper, left, right)
		   else -> return KoKoBiOperation(oper, left, right)
	   }    
   }

    fun BOOL_OPERATION(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoAst {    //DEFAULT
       val id = oper as KoKoId
	   when(id.getValue() ){ //I think we can put all the operators in a hash or list and use contains
		   "<" -> return KoKoBoolOperation(oper, left, right)
           ">" -> return KoKoBoolOperation(oper, left, right)
           "<=" -> return KoKoBoolOperation(oper, left, right)
           ">=" -> return KoKoBoolOperation(oper, left, right)
           "==" -> return KoKoBoolOperation(oper, left, right)
           "!=" -> return KoKoBoolOperation(oper, left, right)
		   else -> return KoKoBiOperation(oper, left, right)
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
   
   fun LIST(expressions : List<KoKoAst>, nat: Boolean) : KoKoList{ //Arguments with expressions  //DEFAULT 
       return KoKoList(expressions, nat)
   }

   fun LIST() : KoKoList { //Empty arguments   //DEFAULT
        return KoKoList()
   }
   
   fun CALL(head : KoKoAst, args : KoKoList) : KoKoAst {   //DEFAULT
       return KoKoCall(head, args)
   }
   
}