/**
 @author loriacarlos@gmail.com
 
*/
package kokoslan.ast;

public class KoKoNotFoundId extends RuntimeException {
	public KoKoNotFoundId(KoKoId id){
		super( String.format("*** Id '%s' is not defined! ***", id.getValue()) );
	}
	
}