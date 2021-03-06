// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KoKoslanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KoKoslanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(KoKoslanParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(KoKoslanParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KoKoslanParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#part_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart_expr(KoKoslanParser.Part_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackslashLambda}
	 * labeled alternative in {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackslashLambda(KoKoslanParser.BackslashLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowLambda}
	 * labeled alternative in {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowLambda(KoKoslanParser.ArrowLambdaContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expr(KoKoslanParser.Logic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#rel_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_expr(KoKoslanParser.Rel_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#rel_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_oper(KoKoslanParser.Rel_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluable_expr(KoKoslanParser.Evaluable_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(KoKoslanParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#add_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_oper(KoKoslanParser.Add_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#mult_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_expr(KoKoslanParser.Mult_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#mult_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_oper(KoKoslanParser.Mult_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(KoKoslanParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#prefixUnary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnary_expr(KoKoslanParser.PrefixUnary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#posfixUnary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosfixUnary_expr(KoKoslanParser.PosfixUnary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#unary_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_oper(KoKoslanParser.Unary_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#bool_oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_oper(KoKoslanParser.Bool_operContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#test_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_expr(KoKoslanParser.Test_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentValueExpr(KoKoslanParser.ParentValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallValueExpr(KoKoslanParser.CallValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListValueExpr(KoKoslanParser.ListValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvaluableLambdaExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluableLambdaExpr(KoKoslanParser.EvaluableLambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileThenExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileThenExpr(KoKoslanParser.WhileThenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicValueExpr(KoKoslanParser.AtomicValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#while_then_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_then_expr(KoKoslanParser.While_then_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(KoKoslanParser.While_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#while_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_body(KoKoslanParser.While_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#then_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen_expr(KoKoslanParser.Then_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#atomic_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_value(KoKoslanParser.Atomic_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_value(KoKoslanParser.List_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expr(KoKoslanParser.List_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#case_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_value(KoKoslanParser.Case_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(KoKoslanParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#call_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_args(KoKoslanParser.Call_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(KoKoslanParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#atomic_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic_pat(KoKoslanParser.Atomic_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_pat(KoKoslanParser.List_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#list_body_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_body_pat(KoKoslanParser.List_body_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#rest_body_pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRest_body_pat(KoKoslanParser.Rest_body_patContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(KoKoslanParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(KoKoslanParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(KoKoslanParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link KoKoslanParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(KoKoslanParser.BoolContext ctx);
}