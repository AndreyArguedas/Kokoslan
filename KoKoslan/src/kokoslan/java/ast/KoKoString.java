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

public class KoKoString extends KoKoAtom<String>{
   
   public KoKoString(String value){
      super(value);
   }

   @Override
   public KoKoValue eval(KoKoContext ctx){
	   return new KoKoStringValue(getValue());  
   }
}