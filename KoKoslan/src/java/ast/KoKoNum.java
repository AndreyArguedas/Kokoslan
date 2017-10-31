/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;
import kokoslan.java.eval.*;

public class KoKoNum extends KoKoAtom<Double>{
   public KoKoNum(Double value){
      super(value);
   }
   @Override
   public KoKoValue eval(KoKoContext ctx){
	   return new KoKoNumValue(getValue());
	   
   }
   
}