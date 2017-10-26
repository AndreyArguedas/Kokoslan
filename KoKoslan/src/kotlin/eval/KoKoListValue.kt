/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast;
import java.util.*;
import java.io.*;

class KoKoListValue : ArrayList<KoKoValue>, KoKoValue{
    constructor(list : List<KoKoValue>) : this {
        super(list)
    }
    constructor() : this {
        super()
    }
}