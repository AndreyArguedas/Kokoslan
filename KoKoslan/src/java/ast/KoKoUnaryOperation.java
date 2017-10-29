/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;
import java.util.*;
import java.io.*;


public class KoKoUnaryOperation extends KoKoOperation {
	Boolean isPrefix = false;

    public KoKoUnaryOperation(KoKoAst operator, KoKoAst value, boolean isPrefix){
		//Two values are being passed for a preValue, and posValue
		super(operator, Arrays.asList(value, value));
		this.isPrefix = isPrefix;
	}
	
	public KoKoAst preValue(){return this.operands.get(0);}
	public KoKoAst posValue(){return this.operands.get(1);}

	public KoKoNumValue preSum(KoKoContext ctx) {
		KoKoNumValue kokoNum = (KoKoNumValue)preValue().eval(ctx);
		Double value = kokoNum.getValue();
		this.operands.set(0, new KoKoNum(++value));
		this.operands.set(1, new KoKoNum(value));
		return (KoKoNumValue)preValue();
	}

	public KoKoNumValue posSum(KoKoContext ctx) {
		KoKoNumValue kokoNum = (KoKoNumValue)preValue().eval(ctx);
		Double value = kokoNum.getValue();
		this.operands.set(0, new KoKoNum(value++));
		this.operands.set(1, new KoKoNum(value));
		return (KoKoNumValue)preValue();
	}

	public KoKoNumValue preMin(KoKoContext ctx) {
		KoKoNumValue kokoNum = (KoKoNumValue)preValue().eval(ctx);
		Double value = kokoNum.getValue();
		this.operands.set(0, new KoKoNum(--value));
		this.operands.set(1, new KoKoNum(value));
		return (KoKoNumValue)preValue();
	}

	public KoKoNumValue posMin(KoKoContext ctx) {
		KoKoNumValue kokoNum = (KoKoNumValue)preValue().eval(ctx);
		Double value = kokoNum.getValue();
		this.operands.set(0, new KoKoNum(value--));
		this.operands.set(1, new KoKoNum(value));
		return (KoKoNumValue)preValue();
	}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
	        KoKoId operId = (KoKoId)operator;
			switch (operId.getValue()){
				case "++" : 
					return isPrefix ? new KoKoNumValue(preSum(ctx).getValue())
									: new KoKoNumValue(posSum(ctx).getValue());
				case "--" : 
					return isPrefix ? new KoKoNumValue(preMin(ctx).getValue())
									: new KoKoNumValue(posMin(ctx).getValue());
				default  : throw new KoKoEvalException("KoKoUnaryOperation: unimpemented operator");
			}
			
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	     }
	   
   }
	
}