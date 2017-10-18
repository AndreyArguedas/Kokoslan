/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.util.*;
import java.io.*;


public class KoKoMINUS extends KoKoBiOperation {
	
    public KoKoMINUS(KoKoAst operator, KoKoAst left, KoKoAst right){
		super(operator, left, right);
	}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
		     KoKoNumValue lv = (KoKoNumValue)(left().eval(ctx));
			 KoKoNumValue rv = (KoKoNumValue)(right().eval(ctx));
	         return new KoKoNumValue(lv.getValue() - rv.getValue());
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	   }
	   
   }
	
}