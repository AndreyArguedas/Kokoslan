/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.compiler

import org.antlr.v4.runtime.*
import java.io.FileInputStream
import java.io.InputStream

import kokoslan.parser.*


const val VERSION = "KoKoc v1.3 CR EIF400.II-2017"
const val PROMPT = ">"

//@Throws(e : Exception)
fun main(args: Array<String>) {
    println("\n...............................................")
    println(">>> $VERSION <<<")
    println("...............................................\n")

    var inputFile: String? = null
    var outputFile: String? = null

    if (args.isNotEmpty())
        inputFile = args[0]

    var inputStream: InputStream = System.`in`

    if (inputFile != null) {
        inputStream = FileInputStream(inputFile)
        println(">>> KoKoc Reading from $inputFile <<<")
    } else {
        println(">>> KoKoc Reading from console (enter CTRL-Z+ENTER to finish <<<")
    }
    // Setup Lexer/Parser
    //val input = ANTLRInputStream(inputStream)
    val input = CharStreams.fromStream(inputStream)
    val lexer = KoKoslanLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = KoKoslanParser(tokens)

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
    println("$PROMPT ${compiler.eval()}")
    println("...............................................\n")

}