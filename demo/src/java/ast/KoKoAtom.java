/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.io.*;


public class KoKoAtom<T> implements KoKoAst{
   private T value;
   public T getValue(){return this.value;}
   
   public KoKoAtom(T value){
      this.value = value;
   }
   public void genCode(PrintStream out){
      out.print(this.value + " ");
   }
   public KoKoValue eval(KoKoContext ctx){
	   throw new KoKoEvalException("KoKoAtom: eval not implemented");
	   
   }
   public String toString(){
	   return value.toString();
   }
}