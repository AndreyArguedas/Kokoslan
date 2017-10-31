/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;

import java.io.*;
import kokoslan.java.eval.*;

public interface KoKoAst{
   default void genCode(){
      genCode(System.out);
   }
   default void genCode(PrintStream out){
   }
   KoKoValue eval(KoKoContext ctx);
   
}