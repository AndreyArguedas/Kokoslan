/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;


public class KoKoStackUnderflow extends RuntimeException {
	public KoKoStackUnderflow(){
		super( "Pop of an empty context" );
	}
	
}