// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoKoslanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, STRING=12, DOT=13, BACK_SLASH=14, COMMA=15, COLON=16, 
		QUESTION_MARK=17, LEFT_PAR=18, RIGHT_PAR=19, LEFT_CURLY=20, RIGHT_CURLY=21, 
		LEFT_BRACKET=22, RIGHT_BRACKET=23, PIPE=24, LET=25, NOT=26, EQ=27, NEQ=28, 
		LEQ=29, OR=30, TRUE=31, FALSE=32, MUL=33, DIV=34, ADD=35, SUB=36, ID=37, 
		SLC=38, MLC=39, WS=40;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_expression = 2, RULE_part_expr = 3, 
		RULE_lambda_expr = 4, RULE_logic_expr = 5, RULE_rel_expr = 6, RULE_rel_oper = 7, 
		RULE_evaluable_expr = 8, RULE_add_expr = 9, RULE_add_oper = 10, RULE_mult_expr = 11, 
		RULE_mult_oper = 12, RULE_bool_expr = 13, RULE_prefixUnary_expr = 14, 
		RULE_posfixUnary_expr = 15, RULE_unary_oper = 16, RULE_bool_oper = 17, 
		RULE_test_expr = 18, RULE_value_expr = 19, RULE_atomic_value = 20, RULE_list_value = 21, 
		RULE_list_expr = 22, RULE_case_value = 23, RULE_case_expr = 24, RULE_call_args = 25, 
		RULE_pattern = 26, RULE_atomic_pat = 27, RULE_list_pat = 28, RULE_list_body_pat = 29, 
		RULE_rest_body_pat = 30, RULE_id = 31, RULE_string = 32, RULE_number = 33, 
		RULE_bool = 34;
	public static final String[] ruleNames = {
		"program", "definition", "expression", "part_expr", "lambda_expr", "logic_expr", 
		"rel_expr", "rel_oper", "evaluable_expr", "add_expr", "add_oper", "mult_expr", 
		"mult_oper", "bool_expr", "prefixUnary_expr", "posfixUnary_expr", "unary_oper", 
		"bool_oper", "test_expr", "value_expr", "atomic_value", "list_value", 
		"list_expr", "case_value", "case_expr", "call_args", "pattern", "atomic_pat", 
		"list_pat", "list_body_pat", "rest_body_pat", "id", "string", "number", 
		"bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'&&'", "'%'", "'^'", "'++'", "'--'", "'>'", "'<'", "'=='", 
		"'>='", null, null, "'.'", "'\\'", "','", "':'", "'?'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'|'", "'let'", "'!'", "'='", "'!='", "'<='", 
		"'||'", "'true'", "'false'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"PIPE", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", 
		"DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KoKoslan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KoKoslanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(70);
				definition();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LET);
			setState(79);
			id();
			setState(80);
			match(EQ);
			setState(81);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<Part_exprContext> part_expr() {
			return getRuleContexts(Part_exprContext.class);
		}
		public Part_exprContext part_expr(int i) {
			return getRuleContext(Part_exprContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			part_expr();
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					match(COMMA);
					setState(85);
					part_expr();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part_exprContext extends ParserRuleContext {
		public Lambda_exprContext lambda_expr() {
			return getRuleContext(Lambda_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Evaluable_exprContext evaluable_expr() {
			return getRuleContext(Evaluable_exprContext.class,0);
		}
		public Case_valueContext case_value() {
			return getRuleContext(Case_valueContext.class,0);
		}
		public Part_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitPart_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part_exprContext part_expr() throws RecognitionException {
		Part_exprContext _localctx = new Part_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_part_expr);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				lambda_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				logic_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				evaluable_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				case_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lambda_exprContext extends ParserRuleContext {
		public Lambda_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expr; }
	 
		public Lambda_exprContext() { }
		public void copyFrom(Lambda_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrowLambdaContext extends Lambda_exprContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowLambdaContext(Lambda_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitArrowLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BackslashLambdaContext extends Lambda_exprContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BackslashLambdaContext(Lambda_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitBackslashLambda(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lambda_exprContext lambda_expr() throws RecognitionException {
		Lambda_exprContext _localctx = new Lambda_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lambda_expr);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK_SLASH:
				_localctx = new BackslashLambdaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(BACK_SLASH);
				setState(98);
				pattern();
				setState(99);
				match(DOT);
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(100);
					expression();
					}
					break;
				case 2:
					{
					setState(101);
					pattern();
					}
					break;
				}
				}
				break;
			case NUMBER:
			case LEFT_BRACKET:
			case TRUE:
			case FALSE:
			case ID:
				_localctx = new ArrowLambdaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				pattern();
				setState(105);
				match(T__0);
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(106);
					expression();
					}
					break;
				case 2:
					{
					setState(107);
					pattern();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_exprContext extends ParserRuleContext {
		public List<Rel_exprContext> rel_expr() {
			return getRuleContexts(Rel_exprContext.class);
		}
		public Rel_exprContext rel_expr(int i) {
			return getRuleContext(Rel_exprContext.class,i);
		}
		public List<Rel_operContext> rel_oper() {
			return getRuleContexts(Rel_operContext.class);
		}
		public Rel_operContext rel_oper(int i) {
			return getRuleContext(Rel_operContext.class,i);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logic_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			rel_expr();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					rel_oper();
					setState(114);
					rel_expr();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_exprContext extends ParserRuleContext {
		public Evaluable_exprContext evaluable_expr() {
			return getRuleContext(Evaluable_exprContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Rel_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitRel_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_exprContext rel_expr() throws RecognitionException {
		Rel_exprContext _localctx = new Rel_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rel_expr);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
			case LEFT_PAR:
			case LEFT_BRACKET:
			case TRUE:
			case FALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				evaluable_expr();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(NOT);
				setState(123);
				logic_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_operContext extends ParserRuleContext {
		public Token oper;
		public Rel_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitRel_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_operContext rel_oper() throws RecognitionException {
		Rel_operContext _localctx = new Rel_operContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rel_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((Rel_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==OR) ) {
				((Rel_operContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Evaluable_exprContext extends ParserRuleContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Test_exprContext test_expr() {
			return getRuleContext(Test_exprContext.class,0);
		}
		public Evaluable_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluable_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitEvaluable_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Evaluable_exprContext evaluable_expr() throws RecognitionException {
		Evaluable_exprContext _localctx = new Evaluable_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_evaluable_expr);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				add_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				bool_expr();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_MARK) {
					{
					setState(130);
					test_expr();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_exprContext extends ParserRuleContext {
		public List<Mult_exprContext> mult_expr() {
			return getRuleContexts(Mult_exprContext.class);
		}
		public Mult_exprContext mult_expr(int i) {
			return getRuleContext(Mult_exprContext.class,i);
		}
		public List<Add_operContext> add_oper() {
			return getRuleContexts(Add_operContext.class);
		}
		public Add_operContext add_oper(int i) {
			return getRuleContext(Add_operContext.class,i);
		}
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitAdd_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			mult_expr();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(136);
				add_oper();
				setState(137);
				mult_expr();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_operContext extends ParserRuleContext {
		public Token oper;
		public Add_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitAdd_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_operContext add_oper() throws RecognitionException {
		Add_operContext _localctx = new Add_operContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_add_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			((Add_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
				((Add_operContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_exprContext extends ParserRuleContext {
		public List<PrefixUnary_exprContext> prefixUnary_expr() {
			return getRuleContexts(PrefixUnary_exprContext.class);
		}
		public PrefixUnary_exprContext prefixUnary_expr(int i) {
			return getRuleContext(PrefixUnary_exprContext.class,i);
		}
		public List<Mult_operContext> mult_oper() {
			return getRuleContexts(Mult_operContext.class);
		}
		public Mult_operContext mult_oper(int i) {
			return getRuleContext(Mult_operContext.class,i);
		}
		public Mult_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitMult_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			prefixUnary_expr();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(147);
				mult_oper();
				setState(148);
				prefixUnary_expr();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_operContext extends ParserRuleContext {
		public Token oper;
		public Mult_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitMult_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_operContext mult_oper() throws RecognitionException {
		Mult_operContext _localctx = new Mult_operContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mult_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((Mult_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << MUL) | (1L << DIV))) != 0)) ) {
				((Mult_operContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public List<Value_exprContext> value_expr() {
			return getRuleContexts(Value_exprContext.class);
		}
		public Value_exprContext value_expr(int i) {
			return getRuleContext(Value_exprContext.class,i);
		}
		public List<Bool_operContext> bool_oper() {
			return getRuleContexts(Bool_operContext.class);
		}
		public Bool_operContext bool_oper(int i) {
			return getRuleContext(Bool_operContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			value_expr(0);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << NEQ) | (1L << LEQ))) != 0)) {
				{
				{
				setState(158);
				bool_oper();
				setState(159);
				value_expr(0);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixUnary_exprContext extends ParserRuleContext {
		public PosfixUnary_exprContext posfixUnary_expr() {
			return getRuleContext(PosfixUnary_exprContext.class,0);
		}
		public PrefixUnary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnary_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitPrefixUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnary_exprContext prefixUnary_expr() throws RecognitionException {
		PrefixUnary_exprContext _localctx = new PrefixUnary_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prefixUnary_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			posfixUnary_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PosfixUnary_exprContext extends ParserRuleContext {
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Unary_operContext unary_oper() {
			return getRuleContext(Unary_operContext.class,0);
		}
		public PosfixUnary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posfixUnary_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitPosfixUnary_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PosfixUnary_exprContext posfixUnary_expr() throws RecognitionException {
		PosfixUnary_exprContext _localctx = new PosfixUnary_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_posfixUnary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			value_expr(0);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(169);
				unary_oper();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operContext extends ParserRuleContext {
		public Token oper;
		public Unary_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitUnary_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operContext unary_oper() throws RecognitionException {
		Unary_operContext _localctx = new Unary_operContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unary_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Unary_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
				((Unary_operContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_operContext extends ParserRuleContext {
		public Token oper;
		public Bool_operContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_oper; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitBool_oper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_operContext bool_oper() throws RecognitionException {
		Bool_operContext _localctx = new Bool_operContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			((Bool_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << NEQ) | (1L << LEQ))) != 0)) ) {
				((Bool_operContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Test_exprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Test_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_test_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitTest_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Test_exprContext test_expr() throws RecognitionException {
		Test_exprContext _localctx = new Test_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_test_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(QUESTION_MARK);
			setState(177);
			expression();
			setState(178);
			match(COLON);
			setState(179);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_exprContext extends ParserRuleContext {
		public Value_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expr; }
	 
		public Value_exprContext() { }
		public void copyFrom(Value_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentValueExprContext extends Value_exprContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitParentValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallValueExprContext extends Value_exprContext {
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public Call_argsContext call_args() {
			return getRuleContext(Call_argsContext.class,0);
		}
		public CallValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitCallValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListValueExprContext extends Value_exprContext {
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public ListValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitListValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EvaluableLambdaExprContext extends Value_exprContext {
		public Lambda_exprContext lambda_expr() {
			return getRuleContext(Lambda_exprContext.class,0);
		}
		public Value_exprContext value_expr() {
			return getRuleContext(Value_exprContext.class,0);
		}
		public EvaluableLambdaExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitEvaluableLambdaExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomicValueExprContext extends Value_exprContext {
		public Atomic_valueContext atomic_value() {
			return getRuleContext(Atomic_valueContext.class,0);
		}
		public AtomicValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitAtomicValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_exprContext value_expr() throws RecognitionException {
		return value_expr(0);
	}

	private Value_exprContext value_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Value_exprContext _localctx = new Value_exprContext(_ctx, _parentState);
		Value_exprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_value_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new ParentValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				match(LEFT_PAR);
				setState(183);
				expression();
				setState(184);
				match(RIGHT_PAR);
				}
				break;
			case 2:
				{
				_localctx = new EvaluableLambdaExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(LEFT_PAR);
				setState(187);
				lambda_expr();
				setState(188);
				match(RIGHT_PAR);
				setState(189);
				value_expr(4);
				}
				break;
			case 3:
				{
				_localctx = new AtomicValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				atomic_value();
				}
				break;
			case 4:
				{
				_localctx = new ListValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				list_value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallValueExprContext(new Value_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_value_expr);
					setState(195);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(196);
					call_args();
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Atomic_valueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Atomic_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitAtomic_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_valueContext atomic_value() throws RecognitionException {
		Atomic_valueContext _localctx = new Atomic_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atomic_value);
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				id();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_valueContext extends ParserRuleContext {
		public List_exprContext list_expr() {
			return getRuleContext(List_exprContext.class,0);
		}
		public List_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitList_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LEFT_BRACKET);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << BACK_SLASH) | (1L << LEFT_PAR) | (1L << LEFT_CURLY) | (1L << LEFT_BRACKET) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(209);
				list_expr();
				}
			}

			setState(212);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_exprContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitList_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_exprContext list_expr() throws RecognitionException {
		List_exprContext _localctx = new List_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_list_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			expression();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				expression();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_valueContext extends ParserRuleContext {
		public List<Case_exprContext> case_expr() {
			return getRuleContexts(Case_exprContext.class);
		}
		public Case_exprContext case_expr(int i) {
			return getRuleContext(Case_exprContext.class,i);
		}
		public Case_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitCase_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_valueContext case_value() throws RecognitionException {
		Case_valueContext _localctx = new Case_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_case_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LEFT_CURLY);
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				case_expr();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BACK_SLASH) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0) );
			setState(228);
			match(RIGHT_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Case_exprContext extends ParserRuleContext {
		public List<Lambda_exprContext> lambda_expr() {
			return getRuleContexts(Lambda_exprContext.class);
		}
		public Lambda_exprContext lambda_expr(int i) {
			return getRuleContext(Lambda_exprContext.class,i);
		}
		public Case_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitCase_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			lambda_expr();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE) {
				{
				{
				setState(231);
				match(PIPE);
				setState(232);
				lambda_expr();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_argsContext extends ParserRuleContext {
		public List_exprContext list_expr() {
			return getRuleContext(List_exprContext.class,0);
		}
		public Call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitCall_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_argsContext call_args() throws RecognitionException {
		Call_argsContext _localctx = new Call_argsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_call_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(LEFT_PAR);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << BACK_SLASH) | (1L << LEFT_PAR) | (1L << LEFT_CURLY) | (1L << LEFT_BRACKET) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(239);
				list_expr();
				}
			}

			setState(242);
			match(RIGHT_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public List_patContext list_pat() {
			return getRuleContext(List_patContext.class,0);
		}
		public Atomic_patContext atomic_pat() {
			return getRuleContext(Atomic_patContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pattern);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				list_pat();
				}
				break;
			case NUMBER:
			case TRUE:
			case FALSE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				atomic_pat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atomic_patContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public Atomic_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic_pat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitAtomic_pat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atomic_patContext atomic_pat() throws RecognitionException {
		Atomic_patContext _localctx = new Atomic_patContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_atomic_pat);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				id();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_patContext extends ParserRuleContext {
		public List_body_patContext list_body_pat() {
			return getRuleContext(List_body_patContext.class,0);
		}
		public List_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_pat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitList_pat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_patContext list_pat() throws RecognitionException {
		List_patContext _localctx = new List_patContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(LEFT_BRACKET);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(254);
				list_body_pat();
				}
			}

			setState(257);
			match(RIGHT_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_body_patContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public Rest_body_patContext rest_body_pat() {
			return getRuleContext(Rest_body_patContext.class,0);
		}
		public List_body_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_body_pat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitList_body_pat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_body_patContext list_body_pat() throws RecognitionException {
		List_body_patContext _localctx = new List_body_patContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_list_body_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			pattern();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				pattern();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(267);
				rest_body_pat();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rest_body_patContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List_patContext list_pat() {
			return getRuleContext(List_patContext.class,0);
		}
		public Rest_body_patContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest_body_pat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitRest_body_pat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rest_body_patContext rest_body_pat() throws RecognitionException {
		Rest_body_patContext _localctx = new Rest_body_patContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rest_body_pat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(PIPE);
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(271);
				id();
				}
				break;
			case LEFT_BRACKET:
				{
				setState(272);
				list_pat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(KoKoslanParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(KoKoslanParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(KoKoslanParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(KoKoslanParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(KoKoslanParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof KoKoslanVisitor ) return ((KoKoslanVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return value_expr_sempred((Value_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_expr_sempred(Value_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\5\3\5\3\5\3\5\5\5b\n"+
		"\5\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\6\5\6o\n\6\5\6q\n\6\3\7"+
		"\3\7\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3"+
		"\n\3\n\3\n\5\n\u0086\n\n\5\n\u0088\n\n\3\13\3\13\3\13\3\13\7\13\u008e"+
		"\n\13\f\13\16\13\u0091\13\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0099\n\r\f\r"+
		"\16\r\u009c\13\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00a4\n\17\f\17\16"+
		"\17\u00a7\13\17\3\20\3\20\3\21\3\21\5\21\u00ad\n\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00c4\n\25\3\25\3\25\7\25\u00c8\n\25\f\25\16\25\u00cb"+
		"\13\25\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\3\27\3\27\5\27\u00d5\n\27\3"+
		"\27\3\27\3\30\3\30\3\30\7\30\u00dc\n\30\f\30\16\30\u00df\13\30\3\31\3"+
		"\31\6\31\u00e3\n\31\r\31\16\31\u00e4\3\31\3\31\3\32\3\32\3\32\7\32\u00ec"+
		"\n\32\f\32\16\32\u00ef\13\32\3\33\3\33\5\33\u00f3\n\33\3\33\3\33\3\34"+
		"\3\34\5\34\u00f9\n\34\3\35\3\35\3\35\5\35\u00fe\n\35\3\36\3\36\5\36\u0102"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\7\37\u0109\n\37\f\37\16\37\u010c\13\37"+
		"\3\37\5\37\u010f\n\37\3 \3 \3 \5 \u0114\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\2\3(%\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDF\2\b\4\2\4\4  \3\2%&\4\2\5\6#$\3\2\7\b\4\2\t\f\36\37\3\2!\"\2\u011d"+
		"\2K\3\2\2\2\4P\3\2\2\2\6U\3\2\2\2\ba\3\2\2\2\np\3\2\2\2\fr\3\2\2\2\16"+
		"~\3\2\2\2\20\u0080\3\2\2\2\22\u0087\3\2\2\2\24\u0089\3\2\2\2\26\u0092"+
		"\3\2\2\2\30\u0094\3\2\2\2\32\u009d\3\2\2\2\34\u009f\3\2\2\2\36\u00a8\3"+
		"\2\2\2 \u00aa\3\2\2\2\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00b2\3\2\2\2(\u00c3"+
		"\3\2\2\2*\u00d0\3\2\2\2,\u00d2\3\2\2\2.\u00d8\3\2\2\2\60\u00e0\3\2\2\2"+
		"\62\u00e8\3\2\2\2\64\u00f0\3\2\2\2\66\u00f8\3\2\2\28\u00fd\3\2\2\2:\u00ff"+
		"\3\2\2\2<\u0105\3\2\2\2>\u0110\3\2\2\2@\u0115\3\2\2\2B\u0117\3\2\2\2D"+
		"\u0119\3\2\2\2F\u011b\3\2\2\2HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\5\6\4\2O\3\3\2\2\2PQ\7\33\2\2QR\5@!\2"+
		"RS\7\35\2\2ST\5\6\4\2T\5\3\2\2\2UZ\5\b\5\2VW\7\21\2\2WY\5\b\5\2XV\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\Z\3\2\2\2]b\5\n\6\2^b"+
		"\5\f\7\2_b\5\22\n\2`b\5\60\31\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2"+
		"\2b\t\3\2\2\2cd\7\20\2\2de\5\66\34\2eh\7\17\2\2fi\5\6\4\2gi\5\66\34\2"+
		"hf\3\2\2\2hg\3\2\2\2iq\3\2\2\2jk\5\66\34\2kn\7\3\2\2lo\5\6\4\2mo\5\66"+
		"\34\2nl\3\2\2\2nm\3\2\2\2oq\3\2\2\2pc\3\2\2\2pj\3\2\2\2q\13\3\2\2\2rx"+
		"\5\16\b\2st\5\20\t\2tu\5\16\b\2uw\3\2\2\2vs\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y\r\3\2\2\2zx\3\2\2\2{\177\5\22\n\2|}\7\34\2\2}\177\5\f\7"+
		"\2~{\3\2\2\2~|\3\2\2\2\177\17\3\2\2\2\u0080\u0081\t\2\2\2\u0081\21\3\2"+
		"\2\2\u0082\u0088\5\24\13\2\u0083\u0085\5\34\17\2\u0084\u0086\5&\24\2\u0085"+
		"\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0082\3\2"+
		"\2\2\u0087\u0083\3\2\2\2\u0088\23\3\2\2\2\u0089\u008f\5\30\r\2\u008a\u008b"+
		"\5\26\f\2\u008b\u008c\5\30\r\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\25"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\t\3\2\2\u0093\27\3\2\2\2\u0094"+
		"\u009a\5\36\20\2\u0095\u0096\5\32\16\2\u0096\u0097\5\36\20\2\u0097\u0099"+
		"\3\2\2\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\31\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\t\4\2"+
		"\2\u009e\33\3\2\2\2\u009f\u00a5\5(\25\2\u00a0\u00a1\5$\23\2\u00a1\u00a2"+
		"\5(\25\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\35\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00a9\5 \21\2\u00a9\37\3\2\2\2\u00aa\u00ac\5(\25\2\u00ab\u00ad"+
		"\5\"\22\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad!\3\2\2\2\u00ae"+
		"\u00af\t\5\2\2\u00af#\3\2\2\2\u00b0\u00b1\t\6\2\2\u00b1%\3\2\2\2\u00b2"+
		"\u00b3\7\23\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5"+
		"\6\4\2\u00b6\'\3\2\2\2\u00b7\u00b8\b\25\1\2\u00b8\u00b9\7\24\2\2\u00b9"+
		"\u00ba\5\6\4\2\u00ba\u00bb\7\25\2\2\u00bb\u00c4\3\2\2\2\u00bc\u00bd\7"+
		"\24\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\5(\25\6\u00c0"+
		"\u00c4\3\2\2\2\u00c1\u00c4\5*\26\2\u00c2\u00c4\5,\27\2\u00c3\u00b7\3\2"+
		"\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4"+
		"\u00c9\3\2\2\2\u00c5\u00c6\f\5\2\2\u00c6\u00c8\5\64\33\2\u00c7\u00c5\3"+
		"\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		")\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d1\5@!\2\u00cd\u00d1\5D#\2\u00ce"+
		"\u00d1\5F$\2\u00cf\u00d1\5B\"\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2"+
		"\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d4"+
		"\7\30\2\2\u00d3\u00d5\5.\30\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\31\2\2\u00d7-\3\2\2\2\u00d8\u00dd\5"+
		"\6\4\2\u00d9\u00da\7\21\2\2\u00da\u00dc\5\6\4\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de/\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e2\7\26\2\2\u00e1\u00e3\5\62\32\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\27\2\2\u00e7\61\3\2\2\2\u00e8\u00ed"+
		"\5\n\6\2\u00e9\u00ea\7\32\2\2\u00ea\u00ec\5\n\6\2\u00eb\u00e9\3\2\2\2"+
		"\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\63"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\7\24\2\2\u00f1\u00f3\5.\30\2"+
		"\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5"+
		"\7\25\2\2\u00f5\65\3\2\2\2\u00f6\u00f9\5:\36\2\u00f7\u00f9\58\35\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\67\3\2\2\2\u00fa\u00fe\5@!\2"+
		"\u00fb\u00fe\5D#\2\u00fc\u00fe\5F$\2\u00fd\u00fa\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fc\3\2\2\2\u00fe9\3\2\2\2\u00ff\u0101\7\30\2\2\u0100\u0102"+
		"\5<\37\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\7\31\2\2\u0104;\3\2\2\2\u0105\u010a\5\66\34\2\u0106\u0107\7\21"+
		"\2\2\u0107\u0109\5\66\34\2\u0108\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010d\u010f\5> \2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f="+
		"\3\2\2\2\u0110\u0113\7\32\2\2\u0111\u0114\5@!\2\u0112\u0114\5:\36\2\u0113"+
		"\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114?\3\2\2\2\u0115\u0116\7\'\2\2"+
		"\u0116A\3\2\2\2\u0117\u0118\7\16\2\2\u0118C\3\2\2\2\u0119\u011a\7\r\2"+
		"\2\u011aE\3\2\2\2\u011b\u011c\t\7\2\2\u011cG\3\2\2\2\36KZahnpx~\u0085"+
		"\u0087\u008f\u009a\u00a5\u00ac\u00c3\u00c9\u00d0\u00d4\u00dd\u00e4\u00ed"+
		"\u00f2\u00f8\u00fd\u0101\u010a\u010e\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}