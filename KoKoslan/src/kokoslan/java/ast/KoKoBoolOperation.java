/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;
import java.util.*;
import java.io.*;
import kokoslan.java.eval.*;
import kokoslan.java.exception.*;


public class KoKoBoolOperation extends KoKoOperation {
	
    public KoKoBoolOperation(KoKoAst operator, KoKoAst left, KoKoAst right){
		super(operator, Arrays.asList(left, right));
	}
	
	public KoKoAst left(){return this.operands.get(0);}
	public KoKoAst right(){return this.operands.get(1);}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
	        KoKoId operId = (KoKoId)operator;
			KoKoNumValue lv = (KoKoNumValue)(left().eval(ctx));
			KoKoNumValue rv = (KoKoNumValue)(right().eval(ctx));
			switch (operId.getValue()){
				case "<" : return new KoKoBoolValue(lv.getValue() < rv.getValue());
                case ">" : return new KoKoBoolValue(lv.getValue() > rv.getValue());
                case "<=" : return new KoKoBoolValue(lv.getValue() <= rv.getValue());
                case ">=" : return new KoKoBoolValue(lv.getValue() >= rv.getValue());
                case "==" : return new KoKoBoolValue(lv.getValue().equals(rv.getValue()));
                case "!=" : return new KoKoBoolValue(!lv.getValue().equals(rv.getValue()));
				default  : throw new KoKoEvalException("KoKoBoolOperation: unimpemented operator");
			}
			
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	     }
	   
   }
	
}