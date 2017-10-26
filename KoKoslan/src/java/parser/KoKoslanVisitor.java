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
	 * Visit a parse tree produced by {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_expr(KoKoslanParser.Lambda_exprContext ctx);
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
	 * Visit a parse tree produced by the {@code CaseValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseValueExpr(KoKoslanParser.CaseValueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicValueExpr(KoKoslanParser.AtomicValueExprContext ctx);
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