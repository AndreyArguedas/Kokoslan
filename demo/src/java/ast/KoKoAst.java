/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.io.*;


public interface KoKoAst{
   default void genCode(){
      genCode(System.out);
   }
   default void genCode(PrintStream out){
   }
   KoKoValue eval(KoKoContext ctx);
   
}