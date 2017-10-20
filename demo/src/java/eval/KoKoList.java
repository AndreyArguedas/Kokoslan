/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoList extends ArrayList<KoKoAst> implements KoKoAst{
    public KoKoList(List<KoKoAst> list){
        super(list);
    }

    public KoKoList(){
        super();
    }

    public void genCode(PrintStream out){
        if(this.size() == 0) return;
        this.get(0).genCode(out);
        this.stream()
            .skip(1)
            .forEach( t -> {
                            out.print(", ");
                            t.genCode(out);
            });
    }

    public KoKoValue eval(KoKoContext ctx){
        KoKoListValue res = new KoKoListValue();
        for(int i = 0; i < this.size(); i++){
            res.add(this.get(i).eval(ctx));
        }
        return res;
    }

    public KoKoValue eval(){
        return eval(new KoKoContext());
    }
} 