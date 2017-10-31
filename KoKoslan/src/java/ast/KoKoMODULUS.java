/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.ast;
import java.util.*;
import java.io.*;
import kokoslan.java.eval.*;


public class KoKoMODULUS extends KoKoBiOperation {
	
    public KoKoMODULUS(KoKoAst operator, KoKoAst left, KoKoAst right){
		super(operator, left, right);
	}
	
	@Override
	public KoKoValue eval(KoKoContext ctx){
	   try {
		     KoKoNumValue lv = (KoKoNumValue)(left().eval(ctx));
			 KoKoNumValue rv = (KoKoNumValue)(right().eval(ctx));
	         return new KoKoNumValue(lv.getValue() % rv.getValue());
	   } catch (Exception e) {
			throw new KoKoEvalException(e.getMessage());
	   }
	   
   }
	
}