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
		T__0=1, NUMBER=2, STRING=3, DOT=4, BACK_SLASH=5, COMMA=6, COLON=7, QUESTION_MARK=8, 
		LEFT_PAR=9, RIGHT_PAR=10, LEFT_CURLY=11, RIGHT_CURLY=12, LEFT_BRACKET=13, 
		RIGHT_BRACKET=14, LET=15, NOT=16, EQ=17, NEQ=18, LEQ=19, OR=20, TRUE=21, 
		FALSE=22, MUL=23, DIV=24, ADD=25, SUB=26, ID=27, SLC=28, MLC=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "NUMBER", "INTEGER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", null, null, "'.'", "'\\'", "','", "':'", "'?'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", "'let'", "'!'", "'='", "'!='", "'<='", "'||'", 
		"'true'", "'false'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NUMBER", "STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", 
		"QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", 
		"LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", "EQ", "NEQ", "LEQ", "OR", 
		"TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", "ID", "SLC", "MLC", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00bf\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\5\3E\n\3\3\3\3\3\3\3\5\3J\n\3\3\4\6\4M\n\4\r\4\16\4N\3\5\3\5"+
		"\7\5S\n\5\f\5\16\5V\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u0096\n\35\f\35\16\35\u0099"+
		"\13\35\3\36\3\36\3\36\3\36\7\36\u009f\n\36\f\36\16\36\u00a2\13\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00ad\n\37\f\37\16\37\u00b0"+
		"\13\37\3\37\5\37\u00b3\n\37\3\37\3\37\3\37\3\37\3 \6 \u00ba\n \r \16 "+
		"\u00bb\3 \3 \4\u00a0\u00ae\2!\3\3\5\4\7\2\t\5\13\6\r\7\17\b\21\t\23\n"+
		"\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35;\36=\37? \3\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\13\f\17\17\"\"\2\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5D\3\2\2"+
		"\2\7L\3\2\2\2\tP\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2\21_\3\2\2"+
		"\2\23a\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33i\3\2\2\2\35k\3\2"+
		"\2\2\37m\3\2\2\2!o\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)z\3\2\2\2+}"+
		"\3\2\2\2-\u0080\3\2\2\2/\u0085\3\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2"+
		"\2\65\u008f\3\2\2\2\67\u0091\3\2\2\29\u0093\3\2\2\2;\u009a\3\2\2\2=\u00a8"+
		"\3\2\2\2?\u00b9\3\2\2\2AB\7~\2\2B\4\3\2\2\2CE\7/\2\2DC\3\2\2\2DE\3\2\2"+
		"\2EF\3\2\2\2FI\5\7\4\2GH\7\60\2\2HJ\5\7\4\2IG\3\2\2\2IJ\3\2\2\2J\6\3\2"+
		"\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\b\3\2\2\2PT\7"+
		"$\2\2QS\n\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3"+
		"\2\2\2WX\7$\2\2X\n\3\2\2\2YZ\7\60\2\2Z\f\3\2\2\2[\\\7^\2\2\\\16\3\2\2"+
		"\2]^\7.\2\2^\20\3\2\2\2_`\7<\2\2`\22\3\2\2\2ab\7A\2\2b\24\3\2\2\2cd\7"+
		"*\2\2d\26\3\2\2\2ef\7+\2\2f\30\3\2\2\2gh\7}\2\2h\32\3\2\2\2ij\7\177\2"+
		"\2j\34\3\2\2\2kl\7]\2\2l\36\3\2\2\2mn\7_\2\2n \3\2\2\2op\7n\2\2pq\7g\2"+
		"\2qr\7v\2\2r\"\3\2\2\2st\7#\2\2t$\3\2\2\2uv\7?\2\2v&\3\2\2\2wx\7#\2\2"+
		"xy\7?\2\2y(\3\2\2\2z{\7>\2\2{|\7?\2\2|*\3\2\2\2}~\7~\2\2~\177\7~\2\2\177"+
		",\3\2\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7w\2\2\u0083"+
		"\u0084\7g\2\2\u0084.\3\2\2\2\u0085\u0086\7h\2\2\u0086\u0087\7c\2\2\u0087"+
		"\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089\u008a\7g\2\2\u008a\60\3\2\2\2\u008b"+
		"\u008c\7,\2\2\u008c\62\3\2\2\2\u008d\u008e\7\61\2\2\u008e\64\3\2\2\2\u008f"+
		"\u0090\7-\2\2\u0090\66\3\2\2\2\u0091\u0092\7/\2\2\u00928\3\2\2\2\u0093"+
		"\u0097\t\4\2\2\u0094\u0096\t\5\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098:\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\7\61\2\2\u009b\u009c\7,\2\2\u009c\u00a0\3\2\2\2\u009d"+
		"\u009f\13\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a4\7,\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\36"+
		"\2\2\u00a7<\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae"+
		"\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7"+
		"\b\37\2\2\u00b7>\3\2\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00be\b \2\2\u00be@\3\2\2\2\f\2DINT\u0097\u00a0\u00ae\u00b2"+
		"\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}