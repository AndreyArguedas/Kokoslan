package kokoslan.java.ast;
import java.util.*;
import java.io.*;
import kokoslan.java.eval.*;

public class KoKoCall implements KoKoAst{
    protected KoKoList args; //Args is what is inside the parenthesis of a call to kokoslan function
    protected KoKoAst head;  //THE NAME OF THE CALL EXAMPLE THE PRINT

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
        return new KoKoEvaluator(this.head, this.args).evaluate(ctx);
    }
    
}