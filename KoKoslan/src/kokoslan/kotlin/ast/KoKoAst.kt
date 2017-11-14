/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kotlin.ast

import java.io.*
import kokoslan.kotlin.eval.*

interface KoKoAst {
   fun genCode() {
      genCode(System.out)
   }
   
   fun genCode(Out : PrintStream)
   
   fun eval(ctx : KoKoContext) : KoKoValue?
   
}