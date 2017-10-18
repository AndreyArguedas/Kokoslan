/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;
import java.util.*;
import java.io.*;

public class KoKoProgram implements KoKoAst{
   private List<KoKoAst> statements;
   
   public KoKoProgram(List<KoKoAst> statements){
      this.statements = statements;
	  
   }
   public void genCode(PrintStream out){
       this.statements.stream()
	                  .forEach( t -> t.genCode(out));
   }
   public KoKoValue eval(KoKoContext ctx){
		KoKoValue res = null;
		for(int i = 0; i < statements.size() -1 ; i++){
			res = statements.get(i).eval(ctx);
		}
		res = statements.get(statements.size() -1).eval(ctx);
		return res;
		
	}
	public KoKoValue eval(){
		return  eval(new KoKoContext());
	}
}