/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.eval;

import kokoslan.java.ast.*;

public class KoKoEvaluator {

	private KoKoAst head;
	protected KoKoList args;

	public KoKoEvaluator(KoKoAst head, KoKoList args){
		this.head = head;
		this.args = args;
	}

	public KoKoValue evaluate(KoKoContext ctx){
		String name = ((KoKoId)this.head).getValue();
        if(name.equals("print"))
            printArguments(ctx);
		return null;
	}

	public void printArguments(KoKoContext ctx){
        this.args
            .stream()
            .forEach( a -> System.out.println(a.eval(ctx)));
    }

	/*
		public KoKoValue evaluate(KoKoProgram tree, KoKoContext ctx){
			return null;
		}
	*/
	
}