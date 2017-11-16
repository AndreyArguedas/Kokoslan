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
		T__9=10, T__10=11, T__11=12, NUMBER=13, STRING=14, DOT=15, BACK_SLASH=16, 
		COMMA=17, COLON=18, QUESTION_MARK=19, LEFT_PAR=20, RIGHT_PAR=21, LEFT_CURLY=22, 
		RIGHT_CURLY=23, LEFT_BRACKET=24, RIGHT_BRACKET=25, PIPE=26, LET=27, NOT=28, 
		EQ=29, NEQ=30, LEQ=31, OR=32, TRUE=33, FALSE=34, MUL=35, DIV=36, ADD=37, 
		SUB=38, ID=39, SLC=40, MLC=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", 
		"COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", 
		"RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", "PIPE", "LET", "NOT", 
		"EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", 
		"ID", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->'", "'&&'", "'%'", "'^'", "'++'", "'--'", "'>'", "'<'", "'=='", 
		"'>='", "'while('", "'then'", null, null, "'.'", "'\\'", "','", "':'", 
		"'?'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'|'", "'let'", "'!'", 
		"'='", "'!='", "'<='", "'||'", "'true'", "'false'", "'*'", "'/'", "'+'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUMBER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", "QUESTION_MARK", 
		"LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "PIPE", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", 
		"FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u00fd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\5\16\u0081\n\16\3\16\3\16\3\16\5\16\u0086\n"+
		"\16\3\17\6\17\u0089\n\17\r\17\16\17\u008a\3\20\3\20\7\20\u008f\n\20\f"+
		"\20\16\20\u0092\13\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\3)\7)\u00d4\n)\f)\16)\u00d7\13)\3*\3*\3*\3*\7*\u00dd\n*\f*\16*\u00e0"+
		"\13*\3*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u00eb\n+\f+\16+\u00ee\13+\3+\5+\u00f1"+
		"\n+\3+\3+\3+\3+\3,\6,\u00f8\n,\r,\16,\u00f9\3,\3,\4\u00de\u00ec\2-\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\2\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)S*U+W,\3\2\7\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u0104\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2"+
		"-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2"+
		"\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2"+
		"E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7_\3\2"+
		"\2\2\ta\3\2\2\2\13c\3\2\2\2\rf\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23m\3\2"+
		"\2\2\25p\3\2\2\2\27s\3\2\2\2\31z\3\2\2\2\33\u0080\3\2\2\2\35\u0088\3\2"+
		"\2\2\37\u008c\3\2\2\2!\u0095\3\2\2\2#\u0097\3\2\2\2%\u0099\3\2\2\2\'\u009b"+
		"\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61"+
		"\u00a5\3\2\2\2\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ab\3\2\2\29\u00ad"+
		"\3\2\2\2;\u00b1\3\2\2\2=\u00b3\3\2\2\2?\u00b5\3\2\2\2A\u00b8\3\2\2\2C"+
		"\u00bb\3\2\2\2E\u00be\3\2\2\2G\u00c3\3\2\2\2I\u00c9\3\2\2\2K\u00cb\3\2"+
		"\2\2M\u00cd\3\2\2\2O\u00cf\3\2\2\2Q\u00d1\3\2\2\2S\u00d8\3\2\2\2U\u00e6"+
		"\3\2\2\2W\u00f7\3\2\2\2YZ\7/\2\2Z[\7@\2\2[\4\3\2\2\2\\]\7(\2\2]^\7(\2"+
		"\2^\6\3\2\2\2_`\7\'\2\2`\b\3\2\2\2ab\7`\2\2b\n\3\2\2\2cd\7-\2\2de\7-\2"+
		"\2e\f\3\2\2\2fg\7/\2\2gh\7/\2\2h\16\3\2\2\2ij\7@\2\2j\20\3\2\2\2kl\7>"+
		"\2\2l\22\3\2\2\2mn\7?\2\2no\7?\2\2o\24\3\2\2\2pq\7@\2\2qr\7?\2\2r\26\3"+
		"\2\2\2st\7y\2\2tu\7j\2\2uv\7k\2\2vw\7n\2\2wx\7g\2\2xy\7*\2\2y\30\3\2\2"+
		"\2z{\7v\2\2{|\7j\2\2|}\7g\2\2}~\7p\2\2~\32\3\2\2\2\177\u0081\7/\2\2\u0080"+
		"\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\5\35"+
		"\17\2\u0083\u0084\7\60\2\2\u0084\u0086\5\35\17\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\34\3\2\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\36"+
		"\3\2\2\2\u008c\u0090\7$\2\2\u008d\u008f\n\3\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7$\2\2\u0094 \3\2\2\2\u0095\u0096"+
		"\7\60\2\2\u0096\"\3\2\2\2\u0097\u0098\7^\2\2\u0098$\3\2\2\2\u0099\u009a"+
		"\7.\2\2\u009a&\3\2\2\2\u009b\u009c\7<\2\2\u009c(\3\2\2\2\u009d\u009e\7"+
		"A\2\2\u009e*\3\2\2\2\u009f\u00a0\7*\2\2\u00a0,\3\2\2\2\u00a1\u00a2\7+"+
		"\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\60\3\2\2\2\u00a5\u00a6\7"+
		"\177\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7]\2\2\u00a8\64\3\2\2\2\u00a9\u00aa"+
		"\7_\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac8\3\2\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0:\3\2\2\2\u00b1\u00b2"+
		"\7#\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7?\2\2\u00b4>\3\2\2\2\u00b5\u00b6\7"+
		"#\2\2\u00b6\u00b7\7?\2\2\u00b7@\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba"+
		"\7?\2\2\u00baB\3\2\2\2\u00bb\u00bc\7~\2\2\u00bc\u00bd\7~\2\2\u00bdD\3"+
		"\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7w\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2F\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5"+
		"\u00c6\7n\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7g\2\2\u00c8H\3\2\2\2\u00c9"+
		"\u00ca\7,\2\2\u00caJ\3\2\2\2\u00cb\u00cc\7\61\2\2\u00ccL\3\2\2\2\u00cd"+
		"\u00ce\7-\2\2\u00ceN\3\2\2\2\u00cf\u00d0\7/\2\2\u00d0P\3\2\2\2\u00d1\u00d5"+
		"\t\4\2\2\u00d2\u00d4\t\5\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6R\3\2\2\2\u00d7\u00d5\3\2\2\2"+
		"\u00d8\u00d9\7\61\2\2\u00d9\u00da\7,\2\2\u00da\u00de\3\2\2\2\u00db\u00dd"+
		"\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\7,\2\2\u00e2\u00e3\7\61\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b*\2\2\u00e5"+
		"T\3\2\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00ec\3\2\2"+
		"\2\u00e9\u00eb\13\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ef\u00f1\7\17\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\f\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b+"+
		"\2\2\u00f5V\3\2\2\2\u00f6\u00f8\t\6\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fc\b,\2\2\u00fcX\3\2\2\2\f\2\u0080\u0085\u008a\u0090\u00d5\u00de\u00ec"+
		"\u00f0\u00f9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}