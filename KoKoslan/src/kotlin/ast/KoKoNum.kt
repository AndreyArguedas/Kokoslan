/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.ast

class KoKoNum(value : Double) : KoKoAtom<Double>(value){
   override fun eval(ctx : KoKoContext) : KoKoValue {
	   return KoKoNumValue(getValue())
   }
}