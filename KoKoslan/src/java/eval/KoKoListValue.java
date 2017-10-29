/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.ast;
import java.util.*;
import java.io.*;

/* Evals KoKoslan lists who stores KoKoslan values */

public class KoKoListValue extends ArrayList<KoKoValue> implements KoKoValue{
    public KoKoListValue(List<KoKoValue> list){
        super(list); //Super is ArrayList of KoKoValue
    }

    public KoKoListValue(){
        super(); //Super is ArrayList of KoKoValue
    }
}