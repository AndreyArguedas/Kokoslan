/**
 * Foo controller of compilation
 * Purpose is to start a compilation
 * Demo ANTLR
 @author loriacarlos@gmail.com 
 @version EIF400.II-2017
 @since 0.0
*/
/**
 * Kokoslan toy controller
 * Demo ANTLR (suing visitors)
 @author loriacarlos@gmail.com 
 @version EIF400.II-2017
 @since 0.0
*/

package kokoslan.compile;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

import kokoslan.parser.*;

public class KoKoc {
	public static final String VERSION = "KoKoc v0.0 CR EIF400.II-2017";
	public static String PROMPT = ">";
	
    public static void main(String[] args) throws Exception {
		System.out.println("\n...............................................");
		System.out.println(">>> " + VERSION + " <<<");
		System.out.println("...............................................\n");
		// Get parameters
        String inputFile = null, 
		       outputFile = null;
        if (args.length > 0) 
		  inputFile = args[0];
	  
        InputStream is = System.in;
		
        if (inputFile != null){
 		   is = new FileInputStream(inputFile);
		   System.out.println(">>> KoKoc Reading from " + inputFile + " <<<");
		} else{
		   System.out.println(">>> KoKoc Reading from console (enter CTRL-Z+ENTER to finish <<<");
		}
		 // Setup Lexer/Parser
        ANTLRInputStream input = new ANTLRInputStream(is);
        KoKoslanLexer lexer = new KoKoslanLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        KoKoslanParser parser = new KoKoslanParser(tokens);
		
		// Parse, Compile and Generate code
		// Starting point is rule (context) 'program' (See grammar KoKoslan.g4)
        ParseTree tree = parser.program(); 
        
		// Compile tree
		if (args.length > 1) 
		  outputFile = args[1];
		KoKoCompiler compiler = new KoKoCompiler(outputFile);
		compiler.compile(tree);
		
		// Write code
	    System.err.println(">>> KoKoc is writing to " + outputFile + " <<<");
		compiler.genCode();
		 // Eval code
		System.err.println(">>> KoKoc starts evaluating to console <<<");
		System.out.format( "%s %s%n", PROMPT, compiler.eval() );
		System.out.println("...............................................\n");
		
    }
}
