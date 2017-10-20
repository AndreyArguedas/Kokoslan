package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoCall implements KoKoAst{
    protected KoKoList args;
    protected KoKoAst head;

    public KoKoCall(KoKoAst head, KoKoList args){
        this.head = head;
        this.args = args;
    }

    public KoKoCall(KoKoAst head){
        this(head, new KoKoList());
    }

    public void genCode(PrintStream out){
        this.head.genCode(out);
        out.print(" (");
        this.args.genCode(out);
        out.print(") ");
    }

    public KoKoValue eval(KoKoContext ctx){
        throw new KoKoEvalException("KoKoCall: eval not implemented");
    }
}