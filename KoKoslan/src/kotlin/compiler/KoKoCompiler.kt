package kokoslan.compile

import kokoslan.ast.*
import kokoslan.parser.*

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTree

import java.util.*
import java.util.stream.*
import java.io.*

/* THIS CLASS USES WHAT PARSER GENERATED AND GIVES AN IMPLEMENTATION 
   PLEASE DO SOME RESEARCH OF VISISTOR PATTERN FIRST
*/

class KoKoCompiler(protected var outputFile: String? = null) : KoKoslanBaseVisitor<KoKoAst>, KoKoEmiter{
	
   protected var program: KoKoAst;
   protected var statements: List<KoKoAst> = ArrayList<>()

   fun getProgram(): KoKoProgram{
	   return PROGRAM(statements)
   }
   
   fun genCode(): Unit{
	   try {
		   genCode(outputFile?. PrintStream(outputFile) ?: System.out)
	   } catch (e: Exception){
		   throw RuntimeException(e.getMessage())
	   }     
   }

   fun genCode(out: PrintStream): Unit{
      statements.stream()
	                 .forEach( t -> t.genCode(out))
   }

   fun eval(): KoKoValue{
	   return getProgram().eval()
   }
   
   fun compile(tree: ParseTree): KoKoAst{
      return visit(tree)
   }

   override fun visitProgram(ctx: KoKoslanParser.ProgramContext): KoKoAst{
	   ctx.definition()
	          .stream()
	          .map(fun -> visit(fun))
	          .forEach( fun -> statements.add(fun) )
	   program = PROGRAM(statements)
	   val expr: KoKoAst = visit(ctx.expression())
	   statements.add(expr)
	   return program
   }
   
   override fun visitDefinition(ctx: KoKoslanParser.DefinitionContext): KoKoAst{
	  val id: KoKoAst = visit(ctx.id())
      val expr: KoKoAst = visit(ctx.expression()) 
	  return LET(id, expr)
   }

   override fun visitAdd_expr(ctx: KoKoslanParser.Add_exprContext): KoKoAst{
	  // Check if only one operand. Then just visit down
	  if ( ctx.add_oper() == null ){
		  return visit(ctx.mult_expr(0))
	  }
	  
	  val operators: List<KoKoAst> = ctx.add_oper()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList())
								   
	  val operands: List<KoKoAst> = ctx.mult_expr()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList())
      val r: KoKoAst[] = {operands.get(0)}
      java.util.stream.IntStream
	                  .range(1, operands.size())
	                  .forEach( i -> r[0] = BI_OPERATION(operators.get(i - 1), r[0], operands.get(i)))  
      return r[0]
   }

   override fun visitAdd_oper(ctx: KoKoslanParser.Add_operContext): KoKoAst{
	   return OPERATOR(ctx.oper.getText())
   }

   override fun visitId(ctx: KoKoslanParser.IdContext): KoKoAst{
	  return ID(ctx.ID().getText())
   }
   
   override fun visitNumber(ctx: KoKoslanParser.NumberContext): KoKoAst{
	  return NUM(Double.valueOf(ctx.NUMBER().getText()))
   }

   override fun visitBool(ctx: KoKoslanParser.BoolContext): KoKoAst{
      return ( ctx.TRUE() != null ) ? TRUE : FALSE
   }

   override fun visitString(ctx: KoKoslanParser.StringContext): KoKoAst{
	  return STRING(String.valueOf(ctx.STRING().getText()))
   }

   override fun visitMult_expr(ctx: KoKoslanParser.Mult_exprContext): KoKoAst{
      if ( ctx.mult_oper() == null ){
		  return visit(ctx.value_expr(0))
	  }
	  
	  val operators: List<KoKoAst> = ctx.mult_oper()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList())
								   
	  val operands: List<KoKoAst>  = ctx.value_expr()
	                               .stream()
	                               .map( e -> visit(e) )
								   .collect(Collectors.toList())
                                   
      val r: KoKoAst[] = {operands.get(0)};
      java.util.stream.IntStream
	                  .range(1, operands.size())
	                  .forEach( i -> r[0] = BI_OPERATION(operators.get(i - 1), r[0], operands.get(i)))  
      return r[0]
   }

   override fun visitMult_oper(ctx: KoKoslanParser.Mult_operContext): KoKoAst{
	   return OPERATOR(ctx.oper.getText())
   }
   
   override fun visitCallValueExpr(ctx: KoKoslanParser.CallValueExprContext): KoKoAst{
      val head: KoKoAst = visit(ctx.value_expr())
	  val args: KoKoList = (KoKoList)visit(ctx.call_args())
	  return CALL( head, args )
   }

   override fun visitCall_args(ctx: KoKoslanParser.Call_argsContext): KoKoAst{
      if( ctx.list_expr() != null )
	  	return visit(ctx.list_expr())
	  else return LIST()
   }

   override fun visitList_expr(ctx: KoKoslanParser.List_exprContext): KoKoAst{
      val exprs: List<KoKoAst> = ctx.expression()
	  						   .stream()
							   .map(e -> visit(e))
							   .collect(Collectors.toList())
	  return LIST(exprs)
   }

}
  