/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kotlin.compiler

import kokoslan.parser.*
import kokoslan.kotlin.ast.*
import kokoslan.kotlin.eval.*
import kokoslan.kotlin.exception.*

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

import java.util.*
import java.util.stream.*
import java.io.*

/* THIS CLASS USES WHAT PARSER GENERATED AND GIVES AN IMPLEMENTATION 
   PLEASE DO SOME RESEARCH OF VISISTOR PATTERN FIRST
*/

class KoKoCompiler(protected var outputFile: String? = null) : KoKoslanBaseVisitor<KoKoAst>(), KoKoEmiter {

    protected var program: KoKoAst? = null
    protected var statements: MutableList<KoKoAst> = mutableListOf<KoKoAst>()
    protected var primitives = hashSetOf<String>("cons", "first", "rest", "length")

    fun getProgram(): KoKoProgram {
        return PROGRAM(statements)
    }

    fun genCode() {
        try {
            genCode(outputFile?.let { PrintStream(outputFile) } ?: System.out)
        } catch (e: Exception) {
            throw RuntimeException(e.message)
        }
    }

    fun genCode(out: PrintStream) {
        statements.forEach { it.genCode(out) }
    }

    fun eval(): KoKoValue? {
        return getProgram().eval()
    }

    fun compile(tree: ParseTree): KoKoAst {
        return visit(tree)
    }

    override fun visitProgram(ctx: KoKoslanParser.ProgramContext): KoKoAst? {
        ctx.definition().map { visit(it) }
                .forEach { statements.add(it) }
        program = PROGRAM(statements)
        val expr: KoKoAst = visit(ctx.expression())
        statements.add(expr)
        return program
    }

    override fun visitDefinition(ctx: KoKoslanParser.DefinitionContext): KoKoAst {
        val id: KoKoAst = visit(ctx.id())
        val expr: KoKoAst = visit(ctx.expression())
        if (primitives.contains(id.toString()))
            primitives.remove(id.toString())
        return LET(id, expr)
    }

    override fun visitBackslashLambda(ctx: KoKoslanParser.BackslashLambdaContext): KoKoAst {
        var id: KoKoAst = visit(ctx.pattern(0))
        val pattern = id
        var expr = if (ctx.expression() != null) visit(ctx.expression()) else visit(ctx.pattern(1))
        when (id) {
            is KoKoBool,
            is KoKoList,
            is KoKoNum -> {
                id = ID("#x")
                expr = TEST(BOOL_OPERATION(ID("=="), id, pattern), expr, CALL(ID("fail"), KoKoList(listOf(id))))
            }
        }
        return LAMBDA(id, expr, false)
    }

    override fun visitArrowLambda(ctx: KoKoslanParser.ArrowLambdaContext): KoKoAst {
        var id: KoKoAst = visit(ctx.pattern(0))
        val pattern = id
        var expr = if (ctx.expression() != null) visit(ctx.expression()) else visit(ctx.pattern(1))
        /*
        expr = TEST(BOOL_OPERATION(ID("=="), ID("#x"), pattern), expr, CALL(ID("#n"), KoKoList(listOf(ID("#x")))))
        //val expr = LAMBDA(ID("#x"), LAMBDA(ID("#n"), expr, false), false)
        expr = LAMBDA(ID("#x"), LAMBDA(ID("#n"), expr, false), false)
        return expr
        */

        when (pattern) {
            is KoKoBool,
            is KoKoList,
            is KoKoNum -> {
                expr = TEST(BOOL_OPERATION(ID("=="), ID("#x"), pattern), expr, CALL(ID("#n"), KoKoList(listOf(ID("#x")))))
                //val expr = LAMBDA(ID("#x"), LAMBDA(ID("#n"), expr, false), false)
                val expr = LAMBDA(ID("#x"), LAMBDA(ID("#n"), expr, false), false)
                return expr
            }
            is KoKoListPat -> {
                return LAMBDA(id, expr, false)
            }
        }
        return LAMBDA(id, expr, false)

    }

    override fun visitEvaluableLambdaExpr(ctx: KoKoslanParser.EvaluableLambdaExprContext): KoKoAst {
        val lambda: KoKoAst = visit(ctx.lambda_expr())
        val expr: KoKoAst = visit(ctx.value_expr())
        return LAMBDA(lambda, expr, true)
    }

    override fun visitCase_value(ctx: KoKoslanParser.Case_valueContext): KoKoAst {
        val caseExpr: KoKoAst = visit(ctx.case_expr(0))
        return caseExpr
    }

    override fun visitEvaluable_expr(ctx: KoKoslanParser.Evaluable_exprContext): KoKoAst {
        if (ctx.test_expr() == null) {
            if (ctx.bool_expr() == null)
                return visit(ctx.add_expr())
            else
                return visit(ctx.bool_expr())
        }

        val condition = visit(ctx.bool_expr())
        val success = visit(ctx.test_expr().expression(0))
        val fail = visit(ctx.test_expr().expression(1))

        return TEST(condition, success, fail)

    }

    override fun visitCase_expr(ctx: KoKoslanParser.Case_exprContext): KoKoAst {

        var lambdas: List<KoKoAst> = ctx.lambda_expr().mapIndexed { idx, it ->
            val lmda = visit(it)
            LET(ID("case_$idx"), lmda)
        }

        var allCases = mutableListOf<KoKoAst>(defaultExpression())

        lambdas.reversed().forEach { allCases.add(it) }

        val mainLambda = packLambdas(allCases.asReversed())

        allCases = allCases.asReversed()
        allCases.add(mainLambda)

        return CASE(allCases) //Se le da vuelta a la lista
    }


    override fun visitParentValueExpr(ctx: KoKoslanParser.ParentValueExprContext): KoKoAst {
        val operation: KoKoAst = visit(ctx.expression().part_expr(0).logic_expr())
        return operation;
    }


    override fun visitAdd_expr(ctx: KoKoslanParser.Add_exprContext): KoKoAst {
        // Check if only one operand. Then just visit down
        if (ctx.add_oper() == null) {
            return visit(ctx.mult_expr(0))
        }

        val operators = ctx.add_oper().map { visit(it) }

        val operands = ctx.mult_expr().map { visit(it) }

        var r: Array<KoKoAst> = arrayOf(operands.get(0))
        (1 until operands.size).forEach {
            r[0] = BI_OPERATION(operators.get(it - 1), r[0], operands.get(it))
        }
        return r[0]
    }

    override fun visitAdd_oper(ctx: KoKoslanParser.Add_operContext): KoKoAst {
        return OPERATOR(ctx.oper.text)
    }

    override fun visitLogic_expr(ctx: KoKoslanParser.Logic_exprContext): KoKoAst {
        // Check if only one operand. Then just visit down
        if (ctx.rel_oper() == null) {
            return visit(ctx.rel_expr(0))
        }

        val operators = ctx.rel_oper().map { visit(it) }

        val operands = ctx.rel_expr().map { visit(it) }

        var r: Array<KoKoAst> = arrayOf(operands.get(0))
        (1 until operands.size).forEach {
            r[0] = BOOL_OPERATION(operators.get(it - 1), r[0], operands.get(it))
        }
        return r[0]
    }

    override fun visitRel_expr(ctx: KoKoslanParser.Rel_exprContext): KoKoAst { //Este visit soporta los NOT simples
        // Check if only one operand. Then just visit down
        if (ctx.evaluable_expr() == null) //En este caso es que viene el not (!)
            return UNARY_OPERATION(OPERATOR("!"), visit(ctx.logic_expr()), true)
        else return visit(ctx.evaluable_expr())

    }


    override fun visitRel_oper(ctx: KoKoslanParser.Rel_operContext): KoKoAst {
        return OPERATOR(ctx.oper.text)
    }

    override fun visitId(ctx: KoKoslanParser.IdContext): KoKoAst {
        return ID(ctx.ID().text)
    }

    override fun visitNumber(ctx: KoKoslanParser.NumberContext): KoKoAst {
        return NUM((ctx.NUMBER().text).toDouble())
    }

    override fun visitBool(ctx: KoKoslanParser.BoolContext): KoKoAst {
        return ctx.TRUE()?.let { TRUE } ?: FALSE
    }

    override fun visitString(ctx: KoKoslanParser.StringContext): KoKoAst {
        return STRING(ctx.STRING().text)
    }

    override fun visitMult_expr(ctx: KoKoslanParser.Mult_exprContext): KoKoAst {
        if (ctx.mult_oper() == null) {
            return visit(ctx.prefixUnary_expr(0))
        }

        val operators: List<KoKoAst> = ctx.mult_oper().map {
            visit(it)
        }

        val operands: List<KoKoAst> = ctx.prefixUnary_expr().map {
            visit(it)
        }

        var r: Array<KoKoAst> = arrayOf(operands.get(0))
        (1 until operands.size).forEach {
            r[0] = BI_OPERATION(operators.get(it - 1), r[0], operands.get(it))
        }
        return r[0]
    }

    override fun visitMult_oper(ctx: KoKoslanParser.Mult_operContext): KoKoAst {
        return OPERATOR(ctx.oper.text)
    }

    override fun visitBool_expr(ctx: KoKoslanParser.Bool_exprContext): KoKoAst {
        if (ctx.bool_oper() == null) {
            return visit(ctx.value_expr(0))
        }

        val operators: List<KoKoAst> = ctx.bool_oper().map {
            visit(it)
        }

        val operands: List<KoKoAst> = ctx.value_expr().map {
            visit(it)
        }

        var r: Array<KoKoAst> = arrayOf(operands.get(0))
        (1 until operands.size).forEach {
            r[0] = BOOL_OPERATION(operators.get(it - 1), r[0], operands.get(it))
        }
        return r[0]
    }

    override fun visitBool_oper(ctx: KoKoslanParser.Bool_operContext): KoKoAst {
        return OPERATOR(ctx.oper.text)
    }

    override fun visitPrefixUnary_expr(ctx: KoKoslanParser.PrefixUnary_exprContext): KoKoAst {
        return visitChildren(ctx)
    }

    override fun visitPosfixUnary_expr(ctx: KoKoslanParser.PosfixUnary_exprContext): KoKoAst {
        if (ctx.unary_oper() == null)
            return visit(ctx.value_expr())
        val unaryOper: KoKoId = visit(ctx.unary_oper()) as KoKoId
        val operand: KoKoAst = visit(ctx.value_expr())
        return UNARY_OPERATION(unaryOper, operand, false)
    }

    override fun visitUnary_oper(ctx: KoKoslanParser.Unary_operContext): KoKoAst {
        return OPERATOR(ctx.oper.text)
    }

    override fun visitCallValueExpr(ctx: KoKoslanParser.CallValueExprContext): KoKoAst {
        var head: KoKoAst = visit(ctx.value_expr())
        val args: KoKoList = visit(ctx.call_args()) as KoKoList
        if (head is KoKoId) {
            if (head.getValue() in primitives) {
                when (head.getValue()) {
                    "cons" -> head = LAMBDA(ID("#x"), LAMBDA(ID("#y"), LIST_PAT(ID("#x"), ID("#y")), false), true)
                    "rest" -> head = LAMBDA(LIST_PAT(ID("#x"), ID("#y")), ID("#y"), false)
                    "first" -> head = LAMBDA(LIST_PAT(ID("#x"), ID("#y")), ID("#x"), false)
                /*
                "length"-> head = LAMBDA(ID("#l"),
                                         TEST(BOOL_OPERATION(ID("=="), ID("#l"), LIST(true)),
                                              NUM(0.0),
                                              BI_OPERATION(OPERATOR("+"),
                                                           CALL(ID("length"),
                                                                LIST(listOf(CALL(ID("rest"),
                                                                                 LIST(listOf(ID("#l")),
                                                                                      false))),
                                                                     false)),
                                                           NUM(1.0))), false)
                                                           */
                }
            }
        }
        return CALL(head, args)
    }

    override fun visitCall_args(ctx: KoKoslanParser.Call_argsContext): KoKoAst {
        return if (ctx.list_expr() != null)
            visit(ctx.list_expr())
        else LIST()
    }

    override fun visitList_expr(ctx: KoKoslanParser.List_exprContext): KoKoAst {
        val exprs: List<KoKoAst> = ctx.expression().map { visit(it) }
        return LIST(exprs, false)
    }

    override fun visitList_value(ctx: KoKoslanParser.List_valueContext): KoKoAst {
        return if (ctx.list_expr() == null) LIST()
        else LIST(ctx.list_expr().expression(0).part_expr().map { visit(it) }, true)
    }

    override fun visitList_pat(ctx: KoKoslanParser.List_patContext): KoKoAst {
        return if(ctx.list_body_pat() == null) LIST()
        else visit(ctx.list_body_pat())
    }

    override fun visitList_body_pat(ctx: KoKoslanParser.List_body_patContext): KoKoAst {
        val pattern: KoKoAst = visit(ctx.pattern(0))
        val rest: KoKoAst = visit(ctx.rest_body_pat())
        return LIST_PAT(pattern, rest)
    }

    fun defaultExpression(): KoKoAst {
        val myLambda = LAMBDA(ID("#x"), CALL(ID("fail"), LIST(listOf(ID("#x")), false)), false)
        return LET(ID("else_1"), myLambda)
    }

    fun packLambdas(lambdas: MutableList<KoKoAst>): KoKoAst { //Y si lo hacemos iterativo para no parir con el caso base?
        var mainCall: KoKoCall
        val kkl = lambdas.first() as KoKoLet
        val next = lambdas.drop(1).first() as KoKoLet
        mainCall = KoKoCall(kkl.getId(), LIST(listOf(ID("#x")), false))
        lambdas.drop(1).toMutableList().forEach {
            it as KoKoLet
            val anotherCall = KoKoCall(it.getId(), LIST(listOf(ID("#x")), false))
            val lambda = KoKoLambda(ID("#x"), anotherCall, false)
            mainCall = KoKoCall(mainCall, LIST(listOf(lambda), false))
        }
        return LAMBDA(ID("#x"), mainCall, false)
    }
}