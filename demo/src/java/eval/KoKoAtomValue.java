/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.io.*;

public class KoKoAtomValue<T> implements KoKoValue{
   private T value;
   public T getValue(){return this.value;}
   
   public KoKoAtomValue(T value){
      this.value = value;
   }
   public String toString(){
      return this.value.toString();
   }
}