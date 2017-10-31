/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

import java.io.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

interface KoKoAst {
   fun genCode() {
      genCode(System.out)
   }
   
   fun genCode(Out : PrintStream)
   
   fun eval(ctx : KoKoContext) : KoKoValue?
   
}