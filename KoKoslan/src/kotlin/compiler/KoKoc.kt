/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.compile
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree
import java.io.FileInputStream
import java.io.InputStream
import kokoslan.parser.*

class KoKoc {
	val VERSION = "KoKoc v0.0 CR EIF400.II-2017"
	val PROMPT = ">"
	
    //@Throws(e : Exception)
   fun main(args : Array<String>) {
		println("\n...............................................")
		println(">>> $VERSION <<<");
		println("...............................................\n")
		// Get parameters
        var inputFile : String? = null
        var outputFile : String? = null
        
        if (args.size > 0) 
		  inputFile = args[0]

        var  is : InputStream = System.`in`
		
        if (inputFile != null){
 		   is = FileInputStream(inputFile)
		   println(">>> KoKoc Reading from $inputFile <<<")
		} else{
		   println(">>> KoKoc Reading from console (enter CTRL-Z+ENTER to finish <<<")
		}
		 // Setup Lexer/Parser
        //val input = ANTLRInputStream(is)
        val input = CharStreams.fromStream(is)
        val lexer = FooLexer(input)
        val tokens = CommonTokenStream(lexer)
        val parser = FooParser(tokens)
		
		// Parse, Compile and Generate code
		// Starting point is rule (context) 'program' (See grammar KoKoslan.g4)
        val tree = parser.program()
        
		// Compile tree
		if (args.size > 1) 
		  outputFile = args[1]

		val compiler = KoKoCompiler(outputFile)
		compiler.compile(tree)
		
		// Write code
	    System.err.println(">>> KoKoc is writing to $outputFile <<<")
		compiler.genCode()
		 // Eval code
		System.err.println(">>> KoKoc starts evaluating to console <<<")
		println( "$PROMPT ${compiler.eval()}")
		println("...............................................\n")
		
    }
}
