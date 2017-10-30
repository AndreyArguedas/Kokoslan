// Generated from KoKoslan.g4 by ANTLR 4.7
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
		LEFT_BRACKET=22, RIGHT_BRACKET=23, LET=24, NOT=25, EQ=26, NEQ=27, LEQ=28, 
		OR=29, TRUE=30, FALSE=31, MUL=32, DIV=33, ADD=34, SUB=35, ID=36, SLC=37, 
		MLC=38, WS=39;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_expression = 2, RULE_part_expr = 3, 
		RULE_lambda_expr = 4, RULE_lambda_eval_expr = 5, RULE_evaluable_expr = 6, 
		RULE_add_expr = 7, RULE_add_oper = 8, RULE_mult_expr = 9, RULE_mult_oper = 10, 
		RULE_bool_expr = 11, RULE_prefixUnary_expr = 12, RULE_posfixUnary_expr = 13, 
		RULE_unary_oper = 14, RULE_bool_oper = 15, RULE_test_expr = 16, RULE_value_expr = 17, 
		RULE_atomic_value = 18, RULE_list_value = 19, RULE_list_expr = 20, RULE_case_value = 21, 
		RULE_case_expr = 22, RULE_call_args = 23, RULE_pattern = 24, RULE_atomic_pat = 25, 
		RULE_list_pat = 26, RULE_list_body_pat = 27, RULE_rest_body_pat = 28, 
		RULE_id = 29, RULE_string = 30, RULE_number = 31, RULE_bool = 32;
	public static final String[] ruleNames = {
		"program", "definition", "expression", "part_expr", "lambda_expr", "lambda_eval_expr", 
		"evaluable_expr", "add_expr", "add_oper", "mult_expr", "mult_oper", "bool_expr", 
		"prefixUnary_expr", "posfixUnary_expr", "unary_oper", "bool_oper", "test_expr", 
		"value_expr", "atomic_value", "list_value", "list_expr", "case_value", 
		"case_expr", "call_args", "pattern", "atomic_pat", "list_pat", "list_body_pat", 
		"rest_body_pat", "id", "string", "number", "bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'%'", "'^'", "'++'", "'--'", "'>'", "'<'", "'=='", "'>='", 
		"'|'", null, null, "'.'", "'\\'", "','", "':'", "'?'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "'let'", "'!'", "'='", "'!='", "'<='", "'||'", "'true'", 
		"'false'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
		"STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"LET", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", 
		"ADD", "SUB", "ID", "SLC", "MLC", "WS"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LET) {
				{
				{
				setState(66);
				definition();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LET);
			setState(75);
			id();
			setState(76);
			match(EQ);
			setState(77);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			part_expr();
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(80);
					match(COMMA);
					setState(81);
					part_expr();
					}
					} 
				}
				setState(86);
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
		public Evaluable_exprContext evaluable_expr() {
			return getRuleContext(Evaluable_exprContext.class,0);
		}
		public Lambda_eval_exprContext lambda_eval_expr() {
			return getRuleContext(Lambda_eval_exprContext.class,0);
		}
		public Part_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterPart_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitPart_expr(this);
		}
	}

	public final Part_exprContext part_expr() throws RecognitionException {
		Part_exprContext _localctx = new Part_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_part_expr);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				lambda_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				evaluable_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				lambda_eval_expr();
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterLambda_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitLambda_expr(this);
		}
	}

	public final Lambda_exprContext lambda_expr() throws RecognitionException {
		Lambda_exprContext _localctx = new Lambda_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lambda_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			pattern();
			setState(93);
			match(T__0);
			setState(94);
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

	public static class Lambda_eval_exprContext extends ParserRuleContext {
		public Lambda_exprContext lambda_expr() {
			return getRuleContext(Lambda_exprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Lambda_eval_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambda_eval_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterLambda_eval_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitLambda_eval_expr(this);
		}
	}

	public final Lambda_eval_exprContext lambda_eval_expr() throws RecognitionException {
		Lambda_eval_exprContext _localctx = new Lambda_eval_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lambda_eval_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(LEFT_PAR);
			setState(97);
			lambda_expr();
			setState(98);
			match(RIGHT_PAR);
			setState(99);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterEvaluable_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitEvaluable_expr(this);
		}
	}

	public final Evaluable_exprContext evaluable_expr() throws RecognitionException {
		Evaluable_exprContext _localctx = new Evaluable_exprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_evaluable_expr);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				add_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				bool_expr();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_MARK) {
					{
					setState(103);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterAdd_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitAdd_expr(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_add_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			mult_expr();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(109);
				add_oper();
				setState(110);
				mult_expr();
				}
				}
				setState(116);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterAdd_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitAdd_oper(this);
		}
	}

	public final Add_operContext add_oper() throws RecognitionException {
		Add_operContext _localctx = new Add_operContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_add_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterMult_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitMult_expr(this);
		}
	}

	public final Mult_exprContext mult_expr() throws RecognitionException {
		Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mult_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			prefixUnary_expr();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << MUL) | (1L << DIV))) != 0)) {
				{
				{
				setState(120);
				mult_oper();
				setState(121);
				prefixUnary_expr();
				}
				}
				setState(127);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterMult_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitMult_oper(this);
		}
	}

	public final Mult_operContext mult_oper() throws RecognitionException {
		Mult_operContext _localctx = new Mult_operContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mult_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Mult_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << MUL) | (1L << DIV))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			value_expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << NEQ) | (1L << LEQ))) != 0)) {
				{
				{
				setState(131);
				bool_oper();
				setState(132);
				value_expr(0);
				}
				}
				setState(138);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterPrefixUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitPrefixUnary_expr(this);
		}
	}

	public final PrefixUnary_exprContext prefixUnary_expr() throws RecognitionException {
		PrefixUnary_exprContext _localctx = new PrefixUnary_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prefixUnary_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterPosfixUnary_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitPosfixUnary_expr(this);
		}
	}

	public final PosfixUnary_exprContext posfixUnary_expr() throws RecognitionException {
		PosfixUnary_exprContext _localctx = new PosfixUnary_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_posfixUnary_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			value_expr(0);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__4) {
				{
				setState(142);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterUnary_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitUnary_oper(this);
		}
	}

	public final Unary_operContext unary_oper() throws RecognitionException {
		Unary_operContext _localctx = new Unary_operContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((Unary_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterBool_oper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitBool_oper(this);
		}
	}

	public final Bool_operContext bool_oper() throws RecognitionException {
		Bool_operContext _localctx = new Bool_operContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bool_oper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			((Bool_operContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << NEQ) | (1L << LEQ))) != 0)) ) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterTest_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitTest_expr(this);
		}
	}

	public final Test_exprContext test_expr() throws RecognitionException {
		Test_exprContext _localctx = new Test_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_test_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(QUESTION_MARK);
			setState(150);
			expression();
			setState(151);
			match(COLON);
			setState(152);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterParentValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitParentValueExpr(this);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterCallValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitCallValueExpr(this);
		}
	}
	public static class ListValueExprContext extends Value_exprContext {
		public List_valueContext list_value() {
			return getRuleContext(List_valueContext.class,0);
		}
		public ListValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterListValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitListValueExpr(this);
		}
	}
	public static class CaseValueExprContext extends Value_exprContext {
		public Case_valueContext case_value() {
			return getRuleContext(Case_valueContext.class,0);
		}
		public CaseValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterCaseValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitCaseValueExpr(this);
		}
	}
	public static class AtomicValueExprContext extends Value_exprContext {
		public Atomic_valueContext atomic_value() {
			return getRuleContext(Atomic_valueContext.class,0);
		}
		public AtomicValueExprContext(Value_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterAtomicValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitAtomicValueExpr(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_value_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAR:
				{
				_localctx = new ParentValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				match(LEFT_PAR);
				setState(156);
				expression();
				setState(157);
				match(RIGHT_PAR);
				}
				break;
			case NUMBER:
			case STRING:
			case TRUE:
			case FALSE:
			case ID:
				{
				_localctx = new AtomicValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				atomic_value();
				}
				break;
			case LEFT_BRACKET:
				{
				_localctx = new ListValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				list_value();
				}
				break;
			case LEFT_CURLY:
				{
				_localctx = new CaseValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				case_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CallValueExprContext(new Value_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_value_expr);
					setState(164);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(165);
					call_args();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterAtomic_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitAtomic_value(this);
		}
	}

	public final Atomic_valueContext atomic_value() throws RecognitionException {
		Atomic_valueContext _localctx = new Atomic_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atomic_value);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				id();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				bool();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterList_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitList_value(this);
		}
	}

	public final List_valueContext list_value() throws RecognitionException {
		List_valueContext _localctx = new List_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_list_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(LEFT_BRACKET);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << LEFT_PAR) | (1L << LEFT_CURLY) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(178);
				list_expr();
				}
			}

			setState(181);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterList_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitList_expr(this);
		}
	}

	public final List_exprContext list_expr() throws RecognitionException {
		List_exprContext _localctx = new List_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_list_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expression();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(184);
				match(COMMA);
				setState(185);
				expression();
				}
				}
				setState(190);
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
		public Case_exprContext case_expr() {
			return getRuleContext(Case_exprContext.class,0);
		}
		public Case_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterCase_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitCase_value(this);
		}
	}

	public final Case_valueContext case_value() throws RecognitionException {
		Case_valueContext _localctx = new Case_valueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_case_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LEFT_CURLY);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(192);
				case_expr();
				}
			}

			setState(195);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterCase_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitCase_expr(this);
		}
	}

	public final Case_exprContext case_expr() throws RecognitionException {
		Case_exprContext _localctx = new Case_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_case_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			lambda_expr();
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				match(COMMA);
				setState(199);
				lambda_expr();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterCall_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitCall_args(this);
		}
	}

	public final Call_argsContext call_args() throws RecognitionException {
		Call_argsContext _localctx = new Call_argsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_call_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LEFT_PAR);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << STRING) | (1L << LEFT_PAR) | (1L << LEFT_CURLY) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(205);
				list_expr();
				}
			}

			setState(208);
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
		public Atomic_patContext atomic_pat() {
			return getRuleContext(Atomic_patContext.class,0);
		}
		public List_patContext list_pat() {
			return getRuleContext(List_patContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pattern);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case TRUE:
			case FALSE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				atomic_pat();
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				list_pat();
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterAtomic_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitAtomic_pat(this);
		}
	}

	public final Atomic_patContext atomic_pat() throws RecognitionException {
		Atomic_patContext _localctx = new Atomic_patContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atomic_pat);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				id();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				number();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterList_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitList_pat(this);
		}
	}

	public final List_patContext list_pat() throws RecognitionException {
		List_patContext _localctx = new List_patContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_list_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(LEFT_BRACKET);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << LEFT_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << ID))) != 0)) {
				{
				setState(220);
				list_body_pat();
				}
			}

			setState(223);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterList_body_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitList_body_pat(this);
		}
	}

	public final List_body_patContext list_body_pat() throws RecognitionException {
		List_body_patContext _localctx = new List_body_patContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_body_pat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			pattern();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				pattern();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(233);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterRest_body_pat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitRest_body_pat(this);
		}
	}

	public final Rest_body_patContext rest_body_pat() throws RecognitionException {
		Rest_body_patContext _localctx = new Rest_body_patContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_rest_body_pat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__9);
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(237);
				id();
				}
				break;
			case LEFT_BRACKET:
				{
				setState(238);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KoKoslanListener ) ((KoKoslanListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
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
		case 17:
			return value_expr_sempred((Value_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean value_expr_sempred(Value_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00fc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\7\4U\n\4\f\4\16\4X\13\4\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bk\n\b\5\bm\n\b\3\t\3\t\3\t\3\t\7"+
		"\ts\n\t\f\t\16\tv\13\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13~\n\13\f\13\16"+
		"\13\u0081\13\13\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0089\n\r\f\r\16\r\u008c\13"+
		"\r\3\16\3\16\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00a5\n\23"+
		"\3\23\3\23\7\23\u00a9\n\23\f\23\16\23\u00ac\13\23\3\24\3\24\3\24\3\24"+
		"\5\24\u00b2\n\24\3\25\3\25\5\25\u00b6\n\25\3\25\3\25\3\26\3\26\3\26\7"+
		"\26\u00bd\n\26\f\26\16\26\u00c0\13\26\3\27\3\27\5\27\u00c4\n\27\3\27\3"+
		"\27\3\30\3\30\3\30\6\30\u00cb\n\30\r\30\16\30\u00cc\3\31\3\31\5\31\u00d1"+
		"\n\31\3\31\3\31\3\32\3\32\5\32\u00d7\n\32\3\33\3\33\3\33\5\33\u00dc\n"+
		"\33\3\34\3\34\5\34\u00e0\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u00e7\n\35"+
		"\f\35\16\35\u00ea\13\35\3\35\5\35\u00ed\n\35\3\36\3\36\3\36\5\36\u00f2"+
		"\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\2\3$#\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\7\3\2$%\4\2\4\5\"#\3\2\6"+
		"\7\4\2\b\13\35\36\3\2 !\2\u00f7\2G\3\2\2\2\4L\3\2\2\2\6Q\3\2\2\2\b\\\3"+
		"\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22w\3\2\2\2\24y\3"+
		"\2\2\2\26\u0082\3\2\2\2\30\u0084\3\2\2\2\32\u008d\3\2\2\2\34\u008f\3\2"+
		"\2\2\36\u0093\3\2\2\2 \u0095\3\2\2\2\"\u0097\3\2\2\2$\u00a4\3\2\2\2&\u00b1"+
		"\3\2\2\2(\u00b3\3\2\2\2*\u00b9\3\2\2\2,\u00c1\3\2\2\2.\u00c7\3\2\2\2\60"+
		"\u00ce\3\2\2\2\62\u00d6\3\2\2\2\64\u00db\3\2\2\2\66\u00dd\3\2\2\28\u00e3"+
		"\3\2\2\2:\u00ee\3\2\2\2<\u00f3\3\2\2\2>\u00f5\3\2\2\2@\u00f7\3\2\2\2B"+
		"\u00f9\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2"+
		"\2\2IG\3\2\2\2JK\5\6\4\2K\3\3\2\2\2LM\7\32\2\2MN\5<\37\2NO\7\34\2\2OP"+
		"\5\6\4\2P\5\3\2\2\2QV\5\b\5\2RS\7\21\2\2SU\5\b\5\2TR\3\2\2\2UX\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2\2\2Y]\5\n\6\2Z]\5\16\b\2[]\5\f\7"+
		"\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3\2\2\2^_\5\62\32\2_`\7\3\2\2`"+
		"a\5\6\4\2a\13\3\2\2\2bc\7\24\2\2cd\5\n\6\2de\7\25\2\2ef\5\6\4\2f\r\3\2"+
		"\2\2gm\5\20\t\2hj\5\30\r\2ik\5\"\22\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2lg"+
		"\3\2\2\2lh\3\2\2\2m\17\3\2\2\2nt\5\24\13\2op\5\22\n\2pq\5\24\13\2qs\3"+
		"\2\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2w"+
		"x\t\2\2\2x\23\3\2\2\2y\177\5\32\16\2z{\5\26\f\2{|\5\32\16\2|~\3\2\2\2"+
		"}z\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\25\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0082\u0083\t\3\2\2\u0083\27\3\2\2\2\u0084\u008a"+
		"\5$\23\2\u0085\u0086\5 \21\2\u0086\u0087\5$\23\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\31\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\5\34\17\2\u008e"+
		"\33\3\2\2\2\u008f\u0091\5$\23\2\u0090\u0092\5\36\20\2\u0091\u0090\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\35\3\2\2\2\u0093\u0094\t\4\2\2\u0094\37"+
		"\3\2\2\2\u0095\u0096\t\5\2\2\u0096!\3\2\2\2\u0097\u0098\7\23\2\2\u0098"+
		"\u0099\5\6\4\2\u0099\u009a\7\22\2\2\u009a\u009b\5\6\4\2\u009b#\3\2\2\2"+
		"\u009c\u009d\b\23\1\2\u009d\u009e\7\24\2\2\u009e\u009f\5\6\4\2\u009f\u00a0"+
		"\7\25\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a5\5&\24\2\u00a2\u00a5\5(\25\2"+
		"\u00a3\u00a5\5,\27\2\u00a4\u009c\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\f\6\2\2\u00a7"+
		"\u00a9\5\60\31\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00b2"+
		"\5<\37\2\u00ae\u00b2\5@!\2\u00af\u00b2\5B\"\2\u00b0\u00b2\5> \2\u00b1"+
		"\u00ad\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\'\3\2\2\2\u00b3\u00b5\7\30\2\2\u00b4\u00b6\5*\26\2\u00b5\u00b4"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\31\2\2"+
		"\u00b8)\3\2\2\2\u00b9\u00be\5\6\4\2\u00ba\u00bb\7\21\2\2\u00bb\u00bd\5"+
		"\6\4\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf+\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c3\7\26\2\2"+
		"\u00c2\u00c4\5.\30\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\7\27\2\2\u00c6-\3\2\2\2\u00c7\u00ca\5\n\6\2\u00c8"+
		"\u00c9\7\21\2\2\u00c9\u00cb\5\n\6\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd/\3\2\2\2\u00ce\u00d0"+
		"\7\24\2\2\u00cf\u00d1\5*\26\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7\25\2\2\u00d3\61\3\2\2\2\u00d4\u00d7"+
		"\5\64\33\2\u00d5\u00d7\5\66\34\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\63\3\2\2\2\u00d8\u00dc\5<\37\2\u00d9\u00dc\5@!\2\u00da\u00dc"+
		"\5B\"\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\65\3\2\2\2\u00dd\u00df\7\30\2\2\u00de\u00e0\58\35\2\u00df\u00de\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\31\2\2\u00e2"+
		"\67\3\2\2\2\u00e3\u00e8\5\62\32\2\u00e4\u00e5\7\21\2\2\u00e5\u00e7\5\62"+
		"\32\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\5:"+
		"\36\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed9\3\2\2\2\u00ee\u00f1"+
		"\7\f\2\2\u00ef\u00f2\5<\37\2\u00f0\u00f2\5\66\34\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2;\3\2\2\2\u00f3\u00f4\7&\2\2\u00f4=\3\2\2\2"+
		"\u00f5\u00f6\7\16\2\2\u00f6?\3\2\2\2\u00f7\u00f8\7\r\2\2\u00f8A\3\2\2"+
		"\2\u00f9\u00fa\t\6\2\2\u00faC\3\2\2\2\31GV\\jlt\177\u008a\u0091\u00a4"+
		"\u00aa\u00b1\u00b5\u00be\u00c3\u00cc\u00d0\u00d6\u00db\u00df\u00e8\u00ec"+
		"\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}