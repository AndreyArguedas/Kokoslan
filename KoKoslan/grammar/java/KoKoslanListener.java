// Generated from KoKoslan.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KoKoslanParser}.
 */
public interface KoKoslanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(KoKoslanParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(KoKoslanParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(KoKoslanParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(KoKoslanParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(KoKoslanParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(KoKoslanParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#part_expr}.
	 * @param ctx the parse tree
	 */
	void enterPart_expr(KoKoslanParser.Part_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#part_expr}.
	 * @param ctx the parse tree
	 */
	void exitPart_expr(KoKoslanParser.Part_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda_expr(KoKoslanParser.Lambda_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#lambda_expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda_expr(KoKoslanParser.Lambda_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 */
	void enterEvaluable_expr(KoKoslanParser.Evaluable_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#evaluable_expr}.
	 * @param ctx the parse tree
	 */
	void exitEvaluable_expr(KoKoslanParser.Evaluable_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(KoKoslanParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(KoKoslanParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#add_oper}.
	 * @param ctx the parse tree
	 */
	void enterAdd_oper(KoKoslanParser.Add_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#add_oper}.
	 * @param ctx the parse tree
	 */
	void exitAdd_oper(KoKoslanParser.Add_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void enterMult_expr(KoKoslanParser.Mult_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#mult_expr}.
	 * @param ctx the parse tree
	 */
	void exitMult_expr(KoKoslanParser.Mult_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#mult_oper}.
	 * @param ctx the parse tree
	 */
	void enterMult_oper(KoKoslanParser.Mult_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#mult_oper}.
	 * @param ctx the parse tree
	 */
	void exitMult_oper(KoKoslanParser.Mult_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(KoKoslanParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(KoKoslanParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#prefixUnary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrefixUnary_expr(KoKoslanParser.PrefixUnary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#prefixUnary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrefixUnary_expr(KoKoslanParser.PrefixUnary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#posfixUnary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPosfixUnary_expr(KoKoslanParser.PosfixUnary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#posfixUnary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPosfixUnary_expr(KoKoslanParser.PosfixUnary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#unary_oper}.
	 * @param ctx the parse tree
	 */
	void enterUnary_oper(KoKoslanParser.Unary_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#unary_oper}.
	 * @param ctx the parse tree
	 */
	void exitUnary_oper(KoKoslanParser.Unary_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#bool_oper}.
	 * @param ctx the parse tree
	 */
	void enterBool_oper(KoKoslanParser.Bool_operContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#bool_oper}.
	 * @param ctx the parse tree
	 */
	void exitBool_oper(KoKoslanParser.Bool_operContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#test_expr}.
	 * @param ctx the parse tree
	 */
	void enterTest_expr(KoKoslanParser.Test_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#test_expr}.
	 * @param ctx the parse tree
	 */
	void exitTest_expr(KoKoslanParser.Test_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterParentValueExpr(KoKoslanParser.ParentValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitParentValueExpr(KoKoslanParser.ParentValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterCallValueExpr(KoKoslanParser.CallValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitCallValueExpr(KoKoslanParser.CallValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterListValueExpr(KoKoslanParser.ListValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitListValueExpr(KoKoslanParser.ListValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvaluableLambdaExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterEvaluableLambdaExpr(KoKoslanParser.EvaluableLambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvaluableLambdaExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitEvaluableLambdaExpr(KoKoslanParser.EvaluableLambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterCaseValueExpr(KoKoslanParser.CaseValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitCaseValueExpr(KoKoslanParser.CaseValueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomicValueExpr(KoKoslanParser.AtomicValueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicValueExpr}
	 * labeled alternative in {@link KoKoslanParser#value_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomicValueExpr(KoKoslanParser.AtomicValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#atomic_value}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_value(KoKoslanParser.Atomic_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#atomic_value}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_value(KoKoslanParser.Atomic_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#list_value}.
	 * @param ctx the parse tree
	 */
	void enterList_value(KoKoslanParser.List_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#list_value}.
	 * @param ctx the parse tree
	 */
	void exitList_value(KoKoslanParser.List_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#list_expr}.
	 * @param ctx the parse tree
	 */
	void enterList_expr(KoKoslanParser.List_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#list_expr}.
	 * @param ctx the parse tree
	 */
	void exitList_expr(KoKoslanParser.List_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#case_value}.
	 * @param ctx the parse tree
	 */
	void enterCase_value(KoKoslanParser.Case_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#case_value}.
	 * @param ctx the parse tree
	 */
	void exitCase_value(KoKoslanParser.Case_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(KoKoslanParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(KoKoslanParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#call_args}.
	 * @param ctx the parse tree
	 */
	void enterCall_args(KoKoslanParser.Call_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#call_args}.
	 * @param ctx the parse tree
	 */
	void exitCall_args(KoKoslanParser.Call_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(KoKoslanParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(KoKoslanParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#atomic_pat}.
	 * @param ctx the parse tree
	 */
	void enterAtomic_pat(KoKoslanParser.Atomic_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#atomic_pat}.
	 * @param ctx the parse tree
	 */
	void exitAtomic_pat(KoKoslanParser.Atomic_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#list_pat}.
	 * @param ctx the parse tree
	 */
	void enterList_pat(KoKoslanParser.List_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#list_pat}.
	 * @param ctx the parse tree
	 */
	void exitList_pat(KoKoslanParser.List_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#list_body_pat}.
	 * @param ctx the parse tree
	 */
	void enterList_body_pat(KoKoslanParser.List_body_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#list_body_pat}.
	 * @param ctx the parse tree
	 */
	void exitList_body_pat(KoKoslanParser.List_body_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#rest_body_pat}.
	 * @param ctx the parse tree
	 */
	void enterRest_body_pat(KoKoslanParser.Rest_body_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#rest_body_pat}.
	 * @param ctx the parse tree
	 */
	void exitRest_body_pat(KoKoslanParser.Rest_body_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(KoKoslanParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(KoKoslanParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(KoKoslanParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(KoKoslanParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KoKoslanParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KoKoslanParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link KoKoslanParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(KoKoslanParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link KoKoslanParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(KoKoslanParser.BoolContext ctx);
}