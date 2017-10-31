/**
 * Foo Emiter
 * Helps at compiling
 * Demo ANTLR
 @author loriacarlos@gmail.com 
 @version EIF400.II-2017
 @since 0.0
 
*/
package kokoslan.java.compiler;

import kokoslan.java.ast.*;
import kokoslan.java.eval.*;
import java.util.*;

/* SEE THE GRAMMAR AND COMPARE IT WITH THIS, THIS INTERFACE
   IS VERY IMPORTANT, GIVES GRAMMAR A SENSE, TURNS GRAMMAR WORDS
   TO OBJECTS, EACH TIME SOMETHING IS CHANGED IN GRAMMAR
   IS NECESSARY TO CHANGE IT OR IMPLEMENT IT HERE
*/

public interface KoKoEmiter{
	
   final KoKoBool TRUE = new KoKoBool(true);
   final KoKoBool FALSE = new KoKoBool(false);
   
   final KoKoAst PLUS = new KoKoId("+");
   final KoKoAst MINUS = new KoKoId("-");
   final KoKoAst MULT = new KoKoId("*");
   final KoKoAst DIV = new KoKoId("/");
   final KoKoAst MODULUS = new KoKoId("%");
   final KoKoAst POW = new KoKoId("^");
   final KoKoAst ERROR = new KoKoId("??");
   
   default KoKoProgram PROGRAM(List<KoKoAst> stmts){ 
       return new KoKoProgram(stmts);
   }
   
   default KoKoAst LET(KoKoAst id, KoKoAst expr){
	   return new KoKoLet(id, expr);
   }
   default KoKoAst OPERATOR(String operator){
	   return new KoKoId(operator);
   }
   default KoKoAst OPERATION(KoKoAst operator, List<KoKoAst> operands){ 
       return new KoKoOperation(operator, operands);
   }
   
   default KoKoAst BI_OPERATION(KoKoAst operator, KoKoAst left, KoKoAst right){ 
       KoKoId id = (KoKoId)operator;
	   switch( id.getValue() ){
		   case "+" : return new KoKoPLUS(operator, left, right);
		   case "-" : return new KoKoMINUS(operator, left, right);
           case "*" : return new KoKoMULT(operator, left, right);
           case "/" : return new KoKoDIV(operator, left, right);
           case "%" : return new KoKoMODULUS(operator, left, right);
           case "^" : return new KoKoPOW(operator, left, right);
		   default  : return new KoKoBiOperation(operator, left, right);
	   }
       
   }

   default KoKoAst BOOL_OPERATION(KoKoAst operator, KoKoAst left, KoKoAst right){ 
       KoKoId id = (KoKoId)operator;
	   switch( id.getValue() ){ //I think we can put all the operators in a hash or list and use contains
		   case "<" : return new KoKoBoolOperation(operator, left, right);
           case ">" : return new KoKoBoolOperation(operator, left, right);
           case "<=" : return new KoKoBoolOperation(operator, left, right);
           case ">=" : return new KoKoBoolOperation(operator, left, right);
           case "==" : return new KoKoBoolOperation(operator, left, right);
           case "!=" : return new KoKoBoolOperation(operator, left, right);
		   default  : return new KoKoBiOperation(operator, left, right);
	   }
       
   }
   
   default KoKoNum NUM(double value){ 
       return new KoKoNum(value);
   }

   default KoKoString STRING(String value){ 
       return new KoKoString(value);
   }
   
   default KoKoId ID(String value){ 
       return new KoKoId(value);
   }
   
   default KoKoList LIST(List<KoKoAst> expressions, boolean nat){ //Arguments with expressions
       return new KoKoList(expressions, nat);
   }

   default KoKoList LIST(){ //Empty arguments
        return new KoKoList();
   }

   default KoKoLambda LAMBDA(KoKoAst pattern, KoKoAst expr, boolean evaluable){ 
        return new KoKoLambda(pattern, expr, evaluable);
   }

   default KoKoCase CASE(List<KoKoAst> lambdas){ 
        return new KoKoCase(lambdas);
   }

   default KoKoAst CALL(KoKoAst head, KoKoList args){
       return new KoKoCall(head, args);
   }
   
   
}