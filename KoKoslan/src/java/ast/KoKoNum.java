/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;

public class KoKoNum extends KoKoAtom<Double>{
   public KoKoNum(Double value){
      super(value);
   }
   @Override
   public KoKoValue eval(KoKoContext ctx){
	   return new KoKoNumValue(getValue());
	   
   }
   
}