/** 
   Andrey Arguedas Espinoza
   Daniela Armas Sanchez
   Michael Chen Wang
   Kimberly Olivas Delgado
*/

package kokoslan.kt.compiler

import java.util.*
import kokoslan.kt.ast.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

/* SEE THE GRAMMAR AND COMPARE IT WITH THIS, THIS INTERFACE
    IS VERY IMPORTANT, GIVES GRAMMAR A SENSE, TURNS GRAMMAR WORDS
    TO OBJECTS, EACH TIME SOMETHING IS CHANGED IN GRAMMAR
    IS NECESSARY TO CHANGE IT OR IMPLEMENT IT HERE
*/

interface KoKoEmiter {

    val TRUE: KoKoBool get() = KoKoBool(true)
    val FALSE: KoKoBool get() = KoKoBool(false)

    val PLUS: KoKoAst get() = KoKoId("+")
    val MINUS: KoKoAst get() = KoKoId("-")
    val MULT: KoKoAst get() = KoKoId("*")
    val DIV: KoKoAst get() = KoKoId("/")
    val MODULUS: KoKoAst get() = KoKoId("%")
    val POW: KoKoAst get() = KoKoId("^")
    val ERROR: KoKoAst get() = KoKoId("??")

    fun PROGRAM(stmts: MutableList < KoKoAst > ): KoKoProgram {
        return KoKoProgram(stmts)
    }

    fun LET(id: KoKoAst, expr: KoKoAst): KoKoAst {
        return KoKoLet(id, expr)
    }

    fun OPERATOR(oper: String): KoKoAst {
        return KoKoId(oper)
    }

    fun OPERATION(oper: KoKoAst, operands: MutableList < KoKoAst > ): KoKoAst {
        return KoKoOperation(oper, operands)
    }

    fun BI_OPERATION(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoAst {
        val id = oper as KoKoId
        when(id.getValue()) {
            "+" -> return KoKoPLUS(oper, left, right)
            "-" -> return KoKoMINUS(oper, left, right)
            "*" -> return KoKoMULT(oper, left, right)
            "/" -> return KoKoDIV(oper, left, right)
            "%" -> return KoKoMODULUS(oper, left, right)
            "^" -> return KoKoPOW(oper, left, right)
            else -> return KoKoBiOperation(oper, left, right)
        }
    }

    fun BOOL_OPERATION(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoAst {
        val id = oper as KoKoId
        when(id.getValue()) { //I think we can put all the operators in a hash or list and use contains. Chen: I agree
            "<" -> return KoKoBoolOperation(oper, left, right)
            ">" -> return KoKoBoolOperation(oper, left, right)
            "<=" -> return KoKoBoolOperation(oper, left, right)
            ">=" -> return KoKoBoolOperation(oper, left, right)
            "==" -> return KoKoBoolOperation(oper, left, right)
            "!=" -> return KoKoBoolOperation(oper, left, right)
            "||" -> return KoKoBoolOperation(oper, left, right)
            "&&" -> return KoKoBoolOperation(oper, left, right)
            else -> return KoKoBiOperation(oper, left, right)
        }
    }

    fun UNARY_OPERATION(oper: KoKoAst, operand: KoKoAst, isPrefix: Boolean = false): KoKoAst {
        return KoKoUnaryOperation(oper, operand, isPrefix)
    }


    fun NUM(value: Double): KoKoNum {
        return KoKoNum(value)
    }

    fun STRING(value: String): KoKoString {
        return KoKoString(value)
    }

    fun ID(value: String): KoKoId {
        return KoKoId(value)
    }

    fun LIST(expressions: List < KoKoAst > , nat: Boolean): KoKoList { //Arguments with expressions 
        return KoKoList(expressions, nat)
    }

    fun LIST(): KoKoList { //Empty arguments
        return KoKoList()
    }

    fun LAMBDA(pattern: KoKoAst, expr: KoKoAst, evaluable: Boolean): KoKoLambda {
        return KoKoLambda(pattern, expr, evaluable)
    }

    fun CASE(lambdas: List < KoKoAst > ): KoKoCase {
        return KoKoCase(lambdas)
    }

    fun CALL(head: KoKoAst, args: KoKoList): KoKoAst {
        return KoKoCall(head, args)
    }

    fun TEST(condition: KoKoAst, success: KoKoAst, fail: KoKoAst): KoKoAst {
        return KoKoTest(condition, success, fail)
    }

}