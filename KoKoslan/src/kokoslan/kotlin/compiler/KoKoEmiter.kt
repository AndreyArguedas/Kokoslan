/**
Andrey Arguedas Espinoza
Daniela Armas Sanchez
Michael Chen Wang
Kimberly Olivas Delgado
 */

package kokoslan.kotlin.compiler

import kokoslan.kotlin.ast.*
import kokoslan.kotlin.eval.*

interface KoKoEmiter {

    val TRUE: KoKoBool get() = KoKoBool(true)
    val FALSE: KoKoBool get() = KoKoBool(false)

    val DIV: KoKoAst get() = KoKoId("/")

    fun PROGRAM(statements: MutableList<KoKoAst>): KoKoProgram {
        return KoKoProgram(statements)
    }

    fun LET(id: KoKoAst, expr: KoKoAst): KoKoAst {
        return KoKoLet(id, expr)
    }

    fun OPERATOR(oper: String): KoKoAst {
        return KoKoId(oper)
    }

    fun BI_OPERATION(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoAst {
        val id = oper as KoKoId
        return when (id.getValue()) {
            "+" -> KoKoBiOperation(oper, left, right)
            "-" -> KoKoBiOperation(oper, left, right)
            "*" -> KoKoBiOperation(oper, left, right)
            "/" -> KoKoBiOperation(oper, left, right)
            "%" -> KoKoBiOperation(oper, left, right)
            "^" -> KoKoBiOperation(oper, left, right)
            else -> KoKoBiOperation(oper, left, right)
        }
    }

    fun BOOL_OPERATION(oper: KoKoAst, left: KoKoAst, right: KoKoAst): KoKoAst {
        val id = oper as KoKoId
        return when (id.getValue()) {
            "<", ">", "<=", ">=", "==", "!=", "||", "&&" -> {
                KoKoBoolOperation(oper, left, right)
            }
            else -> KoKoBiOperation(oper, left, right)
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

    fun LIST(expressions: List<KoKoAst>, nat: Boolean): KoKoList { //Arguments with expressions
        return KoKoList(expressions, nat)
    }

    fun LIST(isNative: Boolean = false): KoKoList { //Empty arguments
        return KoKoList(listOf(), isNative)
    }

    fun LAMBDA(pattern: KoKoAst, expr: KoKoAst, isEvaluable: Boolean): KoKoLambda {
        return KoKoLambda(pattern, expr, isEvaluable)
    }

    fun LIST_PAT(head: KoKoAst, rest: KoKoAst): KoKoListPat {
        return KoKoListPat(head, rest)
    }

    fun CASE(lambdas: List<KoKoAst>): KoKoCase {
        return KoKoCase(lambdas)
    }

    fun CALL(head: KoKoAst, args: KoKoList): KoKoAst {
        return KoKoCall(head, args)
    }

    fun TEST(condition: KoKoAst, success: KoKoAst, fail: KoKoAst): KoKoAst {
        return KoKoTest(condition, success, fail)
    }

}