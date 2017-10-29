/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.ast;


public class KoKoStackUnderflow extends RuntimeException {
	public KoKoStackUnderflow(){
		super( "Pop of an empty context" );
	}
	
}