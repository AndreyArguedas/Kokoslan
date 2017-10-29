/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package package kokoslan.kt.ast
import java.io.*

interface KoKoAst {
   fun genCode() { //default void?
      genCode(System.out) //'??
   }
   
   //Default void?
   fun genCode(Out : PrintStream)
   
   fun eval(ctx : KoKoContext) : KoKoValue?
}