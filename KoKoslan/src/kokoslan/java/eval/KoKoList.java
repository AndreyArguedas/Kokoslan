/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.eval;

import kokoslan.java.ast.*;
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

/*  Lists of KoKoAst objects
    KoKoAst : Generates code with PrintStream,
    and can evaluate context and pass it to kokovalues
 */
public class KoKoList extends ArrayList<KoKoAst> implements KoKoAst{

    private boolean kokoNativeList = false; //To separate list of expressions and this kind of list -> []

    public KoKoList(List<KoKoAst> list, boolean nat){
        super(list); //KoKoList is ArrayList
        kokoNativeList = nat;
    }

    public KoKoList(){
        super(); //KoKoList is ArrayList
    }

    public void genCode(PrintStream out){
        if(this.size() == 0) return;
        if(this.kokoNativeList)
            out.print("[ ");
        this.get(0).genCode(out); //First KoKoAST gens code
        this.stream()
            .skip(1)              //The first does not gen
            .forEach( t -> {
                            out.print(", ");
                            t.genCode(out); //KoKoAST gens code
            });
        if(this.kokoNativeList)
            out.print("] ");
    }

    public KoKoValue eval(KoKoContext ctx){
        KoKoListValue res = new KoKoListValue();
        IntStream.range(0, this.size()).forEach( i -> {
            res.add(this.get(i).eval(ctx));
        });
        return res;
    }

    public KoKoValue eval(){ //See the upper method
        return eval(new KoKoContext());
    }
} 