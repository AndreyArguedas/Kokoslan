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
		LEFT_BRACKET=22, RIGHT_BRACKET=23, PIPE=24, LET=25, NOT=26, EQ=27, NEQ=28, 
		LEQ=29, OR=30, TRUE=31, FALSE=32, MUL=33, DIV=34, ADD=35, SUB=36, ID=37, 
		SLC=38, MLC=39, WS=40;
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
		"LEFT_BRACKET", "RIGHT_BRACKET", "PIPE", "LET", "NOT", "EQ", "NEQ", "LEQ", 
		"OR", "TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00ed\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\5\fq\n\f\3\f\3\f\3\f\5\fv\n\f\3\r\6"+
		"\ry\n\r\r\r\16\rz\3\16\3\16\7\16\177\n\16\f\16\16\16\u0082\13\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'"+
		"\u00c4\n\'\f\'\16\'\u00c7\13\'\3(\3(\3(\3(\7(\u00cd\n(\f(\16(\u00d0\13"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u00db\n)\f)\16)\u00de\13)\3)\5)\u00e1"+
		"\n)\3)\3)\3)\3)\3*\6*\u00e8\n*\r*\16*\u00e9\3*\3*\4\u00ce\u00dc\2+\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\16\35\17\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)S*\3\2\7\3\2\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac"+
		"|\5\2\13\f\17\17\"\"\2\u00f4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2"+
		"\2\2S\3\2\2\2\3U\3\2\2\2\5X\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2"+
		"\rb\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25l\3\2\2\2\27p\3\2\2"+
		"\2\31x\3\2\2\2\33|\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3\2\2\2!\u0089\3"+
		"\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u0091\3\2\2\2+\u0093"+
		"\3\2\2\2-\u0095\3\2\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u009b\3\2\2"+
		"\2\65\u009d\3\2\2\2\67\u00a1\3\2\2\29\u00a3\3\2\2\2;\u00a5\3\2\2\2=\u00a8"+
		"\3\2\2\2?\u00ab\3\2\2\2A\u00ae\3\2\2\2C\u00b3\3\2\2\2E\u00b9\3\2\2\2G"+
		"\u00bb\3\2\2\2I\u00bd\3\2\2\2K\u00bf\3\2\2\2M\u00c1\3\2\2\2O\u00c8\3\2"+
		"\2\2Q\u00d6\3\2\2\2S\u00e7\3\2\2\2UV\7/\2\2VW\7@\2\2W\4\3\2\2\2XY\7(\2"+
		"\2YZ\7(\2\2Z\6\3\2\2\2[\\\7\'\2\2\\\b\3\2\2\2]^\7`\2\2^\n\3\2\2\2_`\7"+
		"-\2\2`a\7-\2\2a\f\3\2\2\2bc\7/\2\2cd\7/\2\2d\16\3\2\2\2ef\7@\2\2f\20\3"+
		"\2\2\2gh\7>\2\2h\22\3\2\2\2ij\7?\2\2jk\7?\2\2k\24\3\2\2\2lm\7@\2\2mn\7"+
		"?\2\2n\26\3\2\2\2oq\7/\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2ru\5\31\r\2st"+
		"\7\60\2\2tv\5\31\r\2us\3\2\2\2uv\3\2\2\2v\30\3\2\2\2wy\t\2\2\2xw\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\32\3\2\2\2|\u0080\7$\2\2}\177\n\3\2"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7$\2\2\u0084\34\3\2\2\2"+
		"\u0085\u0086\7\60\2\2\u0086\36\3\2\2\2\u0087\u0088\7^\2\2\u0088 \3\2\2"+
		"\2\u0089\u008a\7.\2\2\u008a\"\3\2\2\2\u008b\u008c\7<\2\2\u008c$\3\2\2"+
		"\2\u008d\u008e\7A\2\2\u008e&\3\2\2\2\u008f\u0090\7*\2\2\u0090(\3\2\2\2"+
		"\u0091\u0092\7+\2\2\u0092*\3\2\2\2\u0093\u0094\7}\2\2\u0094,\3\2\2\2\u0095"+
		"\u0096\7\177\2\2\u0096.\3\2\2\2\u0097\u0098\7]\2\2\u0098\60\3\2\2\2\u0099"+
		"\u009a\7_\2\2\u009a\62\3\2\2\2\u009b\u009c\7~\2\2\u009c\64\3\2\2\2\u009d"+
		"\u009e\7n\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\66\3\2\2\2\u00a1"+
		"\u00a2\7#\2\2\u00a28\3\2\2\2\u00a3\u00a4\7?\2\2\u00a4:\3\2\2\2\u00a5\u00a6"+
		"\7#\2\2\u00a6\u00a7\7?\2\2\u00a7<\3\2\2\2\u00a8\u00a9\7>\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa>\3\2\2\2\u00ab\u00ac\7~\2\2\u00ac\u00ad\7~\2\2\u00ad@\3"+
		"\2\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7w\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2B\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7c\2\2\u00b5"+
		"\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2\u00b8D\3\2\2\2\u00b9"+
		"\u00ba\7,\2\2\u00baF\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bcH\3\2\2\2\u00bd"+
		"\u00be\7-\2\2\u00beJ\3\2\2\2\u00bf\u00c0\7/\2\2\u00c0L\3\2\2\2\u00c1\u00c5"+
		"\t\4\2\2\u00c2\u00c4\t\5\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6N\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c8\u00c9\7\61\2\2\u00c9\u00ca\7,\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd"+
		"\13\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2"+
		"\7,\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b(\2\2\u00d5"+
		"P\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00dc\3\2\2"+
		"\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e1\7\17\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\7\f\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\b)"+
		"\2\2\u00e5R\3\2\2\2\u00e6\u00e8\t\6\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\b*\2\2\u00ecT\3\2\2\2\f\2puz\u0080\u00c5\u00ce\u00dc\u00e0\u00e9"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}