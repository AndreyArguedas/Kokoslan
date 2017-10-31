/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.java.exception;


public class KoKoStackUnderflow extends RuntimeException {
	public KoKoStackUnderflow(){
		super( "Pop of an empty context" );
	}
	
}