/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;
import kokoslan.java.eval.*;


public class KoKoId extends KoKoAtom<String>{
   public KoKoId(String value){
      super(value);
   }
   @Override 
   public KoKoValue eval(KoKoContext ctx){
	   return ctx.find(this);
   }
   
}