/**
 * Kokoslan toy compiler
 * Demo ANTLR (suing visitors)
 @author loriacarlos@gmail.com 
 @version EIF400.II-2017
 @since 0.0
*/
package kokoslan.java.compile;

import kokoslan.parser.*;
import kokoslan.java.ast.*;
import kokoslan.java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.lang.reflect.*;


/* THIS CLASS USES WHAT PARSER GENERATED AND GIVES AN IMPLEMENTATION 
   PLEASE DO SOME RESEARCH OF VISISTOR PATTERN FIRST
*/

public class KoKoCompiler extends KoKoslanBaseVisitor<KoKoAst> implements KoKoEmiter{
	
   protected String outputFile = null; //the final result kl.out.kl
   protected KoKoAst program;
   
   public KoKoCompiler(){
	   this(null);
   }
   public KoKoCompiler(String outputFile){
	   this.outputFile = outputFile;
   }
   public KoKoProgram getProgram(){
	   return PROGRAM(this.statements);
   }
   protected List<KoKoAst> statements = new ArrayList<>();
   
   public void genCode(){
	   try {
	    genCode(outputFile == null ? System.out : new PrintStream(outputFile));
	   } catch (Exception e){
		   throw new RuntimeException(e.getMessage());
	   }
   }
   public void genCode(PrintStream out){
      this.statements.stream()
	                 .forEach( t -> t.genCode(out));
   }
   public KoKoValue eval(){
	   return getProgram().eval();
   }
   
   public KoKoAst compile(ParseTree tree){
      return visit(tree);
   }
   @Override
   public KoKoAst visitProgram(KoKoslanParser.ProgramContext ctx){
	   ctx.definition()
	          .stream()
	          .map(fun -> visit(fun))
	          .forEach( fun -> this.statements.add(fun) );
	   this.program = PROGRAM(this.statements);
	   KoKoAst expr = visit(ctx.expression());
	   this.statements.add(expr);
	   return this.program;
   }
   @Override
   public KoKoAst visitDefinition(KoKoslanParser.DefinitionContext ctx){
	  KoKoAst id = visit(ctx.id());
      KoKoAst expr = visit(ctx.expression());	  
	  return LET(id, expr);
   }
   @Override
   public KoKoAst visitAdd_expr(KoKoslanParser.Add_exprContext ctx){
	  // Check if only one operand. Then just visit down
	  if ( ctx.add_oper() == null ){
		  return visit(ctx.mult_expr(0));
	  }

	  List<KoKoAst> operators = ctx.add_oper()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList());
								   
	  List<KoKoAst> operands =  ctx.mult_expr()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList());

      KoKoAst[] r = {operands.get(0)};
      java.util.stream.IntStream
	                  .range(1, operands.size())
	                  .forEach( i -> r[0] = BI_OPERATION(operators.get(i - 1), r[0], operands.get(i)));	  
      return r[0];
   }
   @Override
   public KoKoAst visitAdd_oper(KoKoslanParser.Add_operContext ctx){
	   return OPERATOR(ctx.oper.getText());
   }
   @Override
   public KoKoAst visitId(KoKoslanParser.IdContext ctx){
	  return ID(ctx.ID().getText());
   }
   
   @Override
   public KoKoAst visitNumber(KoKoslanParser.NumberContext ctx){
	  return NUM(Double.valueOf(ctx.NUMBER().getText()));
   }
   @Override
   public KoKoAst visitBool(KoKoslanParser.BoolContext ctx){
      return ( ctx.TRUE() != null ) ? TRUE : FALSE;
   }

   @Override
   public KoKoAst visitString(KoKoslanParser.StringContext ctx){
	  return STRING(String.valueOf(ctx.STRING().getText()));
   }

   @Override
    public KoKoAst visitMult_expr(KoKoslanParser.Mult_exprContext ctx) {
        if (ctx.mult_oper() == null) {
            return visit(ctx.prefixUnary_expr(0));
        }

        List<KoKoAst> operators = ctx.mult_oper()
                                     .stream()
                                     .map(e -> visit(e))
                                     .collect(Collectors.toList());

        List<KoKoAst> operands = ctx.prefixUnary_expr()
                                    .stream()
                                    .map(e -> visit(e))
                                    .collect(Collectors.toList());

        KoKoAst[] r = { operands.get(0) };
        java.util.stream.IntStream.range(1, operands.size())
                .forEach(i -> r[0] = BI_OPERATION(operators.get(i - 1), r[0], operands.get(i)));
        return r[0];
    }

   @Override
   public KoKoAst visitMult_oper(KoKoslanParser.Mult_operContext ctx){
	   return OPERATOR(ctx.oper.getText());
   }

   @Override
   public KoKoAst visitBool_expr(KoKoslanParser.Bool_exprContext ctx){
      if ( ctx.bool_oper() == null ){
		  return visit(ctx.value_expr(0));
	  }
	  
	  List<KoKoAst> operators = ctx.bool_oper()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList());
								   
	  List<KoKoAst> operands =  ctx.value_expr()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList());
                                   

      KoKoAst[] r = {operands.get(0)};
      java.util.stream.IntStream
	                  .range(1, operands.size())
	                  .forEach( i -> r[0] = BOOL_OPERATION(operators.get(i - 1), r[0], operands.get(i)));	  
      return r[0];
   }

   @Override
   public KoKoAst visitBool_oper(KoKoslanParser.Bool_operContext ctx){
	   return OPERATOR(ctx.oper.getText());
   }

   @Override 
    public KoKoAst visitPrefixUnary_expr(KoKoslanParser.PrefixUnary_exprContext ctx) { 
        return visitChildren(ctx); 
    }

    @Override 
    public KoKoAst visitPosfixUnary_expr(KoKoslanParser.PosfixUnary_exprContext ctx) { 
        if(ctx.unary_oper() == null) 
            return visit(ctx.value_expr());
        KoKoId unaryOper = (KoKoId)visit(ctx.unary_oper());
        KoKoAst operand = visit(ctx.value_expr());
        KoKoAst result = UNARY_OPERATION(unaryOper, operand, false);
        System.out.println("UnaryOper " + unaryOper);
        System.out.println("Operand " + operand);
        System.out.println("Result " + result);
        return result;
    }

    @Override
    public KoKoAst visitUnary_oper(KoKoslanParser.Unary_operContext ctx) {
        return OPERATOR(ctx.oper.getText());
    }
   
   @Override
   public KoKoAst visitCallValueExpr(KoKoslanParser.CallValueExprContext ctx){
      KoKoAst head = visit(ctx.value_expr());
	  KoKoList args = (KoKoList)visit(ctx.call_args());
	  return CALL( head, args );
   }

   @Override
   public KoKoAst visitCall_args(KoKoslanParser.Call_argsContext ctx){
      if( ctx.list_expr() != null )
	  	return visit(ctx.list_expr());
	  else return LIST();
   }
   
   @Override
   public KoKoAst visitList_expr(KoKoslanParser.List_exprContext ctx){
      System.out.println(ctx.expression(0).getText());
      List<KoKoAst> exprs = ctx.expression()
	                        .stream()
	                        .map( e -> visit(e) )
	                        .collect(Collectors.toList());
	return LIST(exprs, false);
   }


   @Override
   public KoKoAst visitList_value(KoKoslanParser.List_valueContext ctx){

      List<KoKoAst> exprs = ctx.list_expr().expression(0).part_expr()
	                        .stream()
	                        .map( e -> visit(e) )
	                        .collect(Collectors.toList());
      
	return LIST(exprs, true);
   }


}
