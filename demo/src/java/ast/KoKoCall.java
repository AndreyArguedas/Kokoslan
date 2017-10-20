package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoCall implements KoKoAst{
    protected KoKoList args; //Args is what is inside the parenthesis of a call to kokoslan function
    protected KoKoAst head;  //Dont understand this yet

    public KoKoCall(KoKoAst head, KoKoList args){
        this.head = head;
        this.args = args;
    }

    public KoKoCall(KoKoAst head){
        this(head, new KoKoList());
    }

    public void genCode(PrintStream out){ //The code we see when we do call.kl
        this.head.genCode(out);
        out.print(" (");
        this.args.genCode(out);
        out.print(") ");
    }

    public KoKoValue eval(KoKoContext ctx){ //Evaluates the call, returns a value, context = id(args)
        throw new KoKoEvalException("KoKoCall: eval not implemented");
    }
}