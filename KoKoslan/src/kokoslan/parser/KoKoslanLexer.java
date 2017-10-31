// Generated from grammar/KoKoslan.g4 by ANTLR 4.7
package kokoslan.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KoKoslanLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
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


	public KoKoslanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "KoKoslan.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u00e8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\f\5\fn\n\f\3\f\3\f\3\f\5\fs\n\f\3\r\6\rv\n\r\r\r"+
		"\16\rw\3\16\3\16\7\16|\n\16\f\16\16\16\177\13\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\7&\u00bf\n&\f&\16&\u00c2\13&\3"+
		"\'\3\'\3\'\3\'\7\'\u00c8\n\'\f\'\16\'\u00cb\13\'\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3(\7(\u00d6\n(\f(\16(\u00d9\13(\3(\5(\u00dc\n(\3(\3(\3(\3(\3)"+
		"\6)\u00e3\n)\r)\16)\u00e4\3)\3)\4\u00c9\u00d7\2*\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\16\35\17\37\20!\21#\22%\23\'\24"+
		")\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'"+
		"O(Q)\3\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u00ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5V\3\2"+
		"\2\2\7X\3\2\2\2\tZ\3\2\2\2\13]\3\2\2\2\r`\3\2\2\2\17b\3\2\2\2\21d\3\2"+
		"\2\2\23g\3\2\2\2\25j\3\2\2\2\27m\3\2\2\2\31u\3\2\2\2\33y\3\2\2\2\35\u0082"+
		"\3\2\2\2\37\u0084\3\2\2\2!\u0086\3\2\2\2#\u0088\3\2\2\2%\u008a\3\2\2\2"+
		"\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0090\3\2\2\2-\u0092\3\2\2\2/\u0094\3"+
		"\2\2\2\61\u0096\3\2\2\2\63\u0098\3\2\2\2\65\u009c\3\2\2\2\67\u009e\3\2"+
		"\2\29\u00a0\3\2\2\2;\u00a3\3\2\2\2=\u00a6\3\2\2\2?\u00a9\3\2\2\2A\u00ae"+
		"\3\2\2\2C\u00b4\3\2\2\2E\u00b6\3\2\2\2G\u00b8\3\2\2\2I\u00ba\3\2\2\2K"+
		"\u00bc\3\2\2\2M\u00c3\3\2\2\2O\u00d1\3\2\2\2Q\u00e2\3\2\2\2ST\7/\2\2T"+
		"U\7@\2\2U\4\3\2\2\2VW\7\'\2\2W\6\3\2\2\2XY\7`\2\2Y\b\3\2\2\2Z[\7-\2\2"+
		"[\\\7-\2\2\\\n\3\2\2\2]^\7/\2\2^_\7/\2\2_\f\3\2\2\2`a\7@\2\2a\16\3\2\2"+
		"\2bc\7>\2\2c\20\3\2\2\2de\7?\2\2ef\7?\2\2f\22\3\2\2\2gh\7@\2\2hi\7?\2"+
		"\2i\24\3\2\2\2jk\7~\2\2k\26\3\2\2\2ln\7/\2\2ml\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2or\5\31\r\2pq\7\60\2\2qs\5\31\r\2rp\3\2\2\2rs\3\2\2\2s\30\3\2\2\2"+
		"tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\32\3\2\2\2y}\7$\2"+
		"\2z|\n\3\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2"+
		"\177}\3\2\2\2\u0080\u0081\7$\2\2\u0081\34\3\2\2\2\u0082\u0083\7\60\2\2"+
		"\u0083\36\3\2\2\2\u0084\u0085\7^\2\2\u0085 \3\2\2\2\u0086\u0087\7.\2\2"+
		"\u0087\"\3\2\2\2\u0088\u0089\7<\2\2\u0089$\3\2\2\2\u008a\u008b\7A\2\2"+
		"\u008b&\3\2\2\2\u008c\u008d\7*\2\2\u008d(\3\2\2\2\u008e\u008f\7+\2\2\u008f"+
		"*\3\2\2\2\u0090\u0091\7}\2\2\u0091,\3\2\2\2\u0092\u0093\7\177\2\2\u0093"+
		".\3\2\2\2\u0094\u0095\7]\2\2\u0095\60\3\2\2\2\u0096\u0097\7_\2\2\u0097"+
		"\62\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a\7g\2\2\u009a\u009b\7v\2\2\u009b"+
		"\64\3\2\2\2\u009c\u009d\7#\2\2\u009d\66\3\2\2\2\u009e\u009f\7?\2\2\u009f"+
		"8\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\7?\2\2\u00a2:\3\2\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a5\7?\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7~\2\2\u00a7\u00a8"+
		"\7~\2\2\u00a8>\3\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7w\2\2\u00ac\u00ad\7g\2\2\u00ad@\3\2\2\2\u00ae\u00af\7h\2\2\u00af\u00b0"+
		"\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"B\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5D\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"F\3\2\2\2\u00b8\u00b9\7-\2\2\u00b9H\3\2\2\2\u00ba\u00bb\7/\2\2\u00bbJ"+
		"\3\2\2\2\u00bc\u00c0\t\4\2\2\u00bd\u00bf\t\5\2\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1L\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\7,\2\2\u00c5\u00c9"+
		"\3\2\2\2\u00c6\u00c8\13\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cc\u00cd\7,\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\b\'\2\2\u00d0N\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2"+
		"\2\u00d3\u00d7\3\2\2\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\7\17\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7\f\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\b(\2\2\u00e0P\3\2\2\2\u00e1\u00e3\t\6\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e7\b)\2\2\u00e7R\3\2\2\2\f\2mrw}\u00c0\u00c9\u00d7"+
		"\u00db\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}