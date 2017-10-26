/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.util.*;
import java.io.*;


public class KoKoOperation implements KoKoAst{
   protected List<KoKoAst> operands;
   protected KoKoAst operator;
   
   public KoKoOperation(KoKoAst operator, List<KoKoAst> operands){
	  this.operator = operator;
      this.operands = operands;
	  
   }
   public KoKoOperation(KoKoAst operator){
	  this(operator, new ArrayList<KoKoAst>	());
	  
   }
   public void addOperand(KoKoAst x){
	   this.operands.add(x);
   }
   public void genCode(PrintStream out){
	   this.operands.get(0).genCode(out);
       this.operands.stream()
	                .skip(1)
	                .forEach( t -> {
						  this.operator.genCode(out);
					      t.genCode(out);
					   });
   }
   public KoKoValue eval(KoKoContext ctx){
	   throw new KoKoEvalException("KoKoOperation: eval not implemented");
	   
   }
   
}