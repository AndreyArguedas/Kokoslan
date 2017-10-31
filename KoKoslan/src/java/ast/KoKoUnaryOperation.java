/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;
import java.util.*;
import java.io.*;
import kokoslan.java.eval.*;


public class KoKoUnaryOperation extends KoKoOperation {
	
    public KoKoUnaryOperation(KoKoAst operator, KoKoAst value, boolean isPrefix){
		//Two values are being passed for a preValue, and posValue
		super(operator, Arrays.asList(value, value));
	}
	
	public KoKoAst preValue(){return this.operands.get(0);}
	public KoKoAst posValue(){return this.operands.get(1);}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
	        KoKoId operId = (KoKoId)operator;
			KoKoNumValue lv = (KoKoNumValue)(preValue().eval(ctx));
			KoKoNumValue rv = (KoKoNumValue)(posValue().eval(ctx));
			switch (operId.getValue()){
				case "++" : return new KoKoNumValue(lv.getValue() + rv.getValue());
				case "--" : return new KoKoNumValue(lv.getValue() - rv.getValue());
				default  : throw new KoKoEvalException("KoKoUnaryOperation: unimpemented operator");
			}
			
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	     }
	   
   }
	
}