/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.java.ast;
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;

/*  Lists of KoKoAst objects
    KoKoAst : Generates code with PrintStream,
    and can evaluate context and pass it to kokovalues
 */
public class KoKoCase extends ArrayList<KoKoAst> implements KoKoAst{

    public KoKoCase(List<KoKoAst> list){
        super(list); //KoKoList is ArrayList
    }

    public KoKoCase(){
        super(); //KoKoList is ArrayList
    }

    public void genCode(PrintStream out){
        System.out.println("He venido a imprimirme 1 " + this);
        if(this.size() == 0) return;
        System.out.println("He venido a imprimirme" + this);
        out.print("{ ");
        this.get(0).genCode(out); //First KoKoAST gens code
        this.stream()
            .forEach( t -> {
                            out.print(", ");
                            t.genCode(out); //KoKoAST gens code
            });
        out.print("} ");
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