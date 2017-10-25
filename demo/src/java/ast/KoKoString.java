/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoString extends KoKoAtom<String>{
   
   public KoKoString(String value){
      super(value);
   }

   @Override
   public KoKoValue eval(KoKoContext ctx){
	   return new KoKoStringValue(getValue());  
   }
}