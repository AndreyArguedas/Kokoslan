/*
    Andrey Arguedas Espinoza
    Daniela Armas Sanchez
    Michael Chen Wang
    Kimberly Olivas Delgado
*/

package kokoslan.kt.compiler

import kokoslan.parser.*
import kokoslan.kt.ast.*
import kokoslan.kt.eval.*
import kokoslan.kt.exception.*

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
        return LET(id, expr)
    }

    override fun visitLambda_expr(ctx: KoKoslanParser.Lambda_exprContext): KoKoAst {
        val id: KoKoAst = visit(ctx.pattern())
        val expr: KoKoAst = visit(ctx.expression())
        return LAMBDA(id, expr, false)
    }

    override fun visitEvaluableLambdaExpr(ctx: KoKoslanParser.EvaluableLambdaExprContext): KoKoAst {
        val lambda: KoKoAst = visit(ctx.lambda_expr())
        val expr: KoKoAst = visit(ctx.value_expr())
        return LAMBDA(lambda, expr, true)
    }

    override fun visitCase_value(ctx: KoKoslanParser.Case_valueContext): KoKoAst {
        val caseExpr: KoKoAst = visit(ctx.case_expr())
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

        val lambdas: List<KoKoAst> = ctx.lambda_expr().map {
            visit(it)
        }
        //La idea es visitar todas las lambdas dentro del case

        println(lambdas) //Las lambdas dentro de {}

        return CASE(lambdas)
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
            return UNARY_OPERATION( OPERATOR("!"), visit(ctx.logic_expr()), true)
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
        val head: KoKoAst = visit(ctx.value_expr())
        val args: KoKoList = visit(ctx.call_args()) as KoKoList
        return CALL(head, args)
    }

    override fun visitCall_args(ctx: KoKoslanParser.Call_argsContext): KoKoAst {
        return ctx.list_expr()?.let { visit(ctx.list_expr()) } ?: LIST()
    }

    override fun visitList_expr(ctx: KoKoslanParser.List_exprContext): KoKoAst {
        val exprs: List<KoKoAst> = ctx.expression().map { visit(it) }
        return LIST(exprs, false)
    }

    override fun visitList_value(ctx: KoKoslanParser.List_valueContext): KoKoAst {
        val exprs: List<KoKoAst> = ctx.list_expr().expression(0).part_expr().map {
            visit(it)
        }
        return LIST(exprs, true);
    }

}