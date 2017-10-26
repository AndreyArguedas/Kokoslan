/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast
import java.io.*

interface KoKoAst{
   fun genCode() : Unit { //default void?
      genCode(System.out) //'??
   }
   fun genCode(Out : PrintStream) : Unit {}//default void?
   fun eval(ctx : KoKoContext) : KoKoValue {}
}