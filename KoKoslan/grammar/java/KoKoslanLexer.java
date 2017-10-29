// Generated from KoKoslan.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NUMBER=8, STRING=9, 
		DOT=10, BACK_SLASH=11, COMMA=12, COLON=13, QUESTION_MARK=14, LEFT_PAR=15, 
		RIGHT_PAR=16, LEFT_CURLY=17, RIGHT_CURLY=18, LEFT_BRACKET=19, RIGHT_BRACKET=20, 
		LET=21, NOT=22, EQ=23, NEQ=24, LEQ=25, OR=26, TRUE=27, FALSE=28, MUL=29, 
		DIV=30, ADD=31, SUB=32, ID=33, SLC=34, MLC=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NUMBER", "INTEGER", 
		"STRING", "DOT", "BACK_SLASH", "COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", 
		"RIGHT_PAR", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"LET", "NOT", "EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", 
		"ADD", "SUB", "ID", "SLC", "MLC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'^'", "'>'", "'<'", "'=='", "'>='", "'|'", null, null, "'.'", 
		"'\\'", "','", "':'", "'?'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"'let'", "'!'", "'='", "'!='", "'<='", "'||'", "'true'", "'false'", "'*'", 
		"'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NUMBER", "STRING", "DOT", 
		"BACK_SLASH", "COMMA", "COLON", "QUESTION_MARK", "LEFT_PAR", "RIGHT_PAR", 
		"LEFT_CURLY", "RIGHT_CURLY", "LEFT_BRACKET", "RIGHT_BRACKET", "LET", "NOT", 
		"EQ", "NEQ", "LEQ", "OR", "TRUE", "FALSE", "MUL", "DIV", "ADD", "SUB", 
		"ID", "SLC", "MLC", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\5\t_\n\t\3\t\3\t\3\t\5\td\n\t\3\n\6"+
		"\ng\n\n\r\n\16\nh\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\7#\u00b0\n#\f#\16#\u00b3\13#\3$\3$\3$\3$\7$\u00b9\n$\f$\16$\u00bc\13"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00c7\n%\f%\16%\u00ca\13%\3%\5%\u00cd"+
		"\n%\3%\3%\3%\3%\3&\6&\u00d4\n&\r&\16&\u00d5\3&\3&\4\u00ba\u00c8\2\'\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r\33\16\35\17\37"+
		"\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36="+
		"\37? A!C\"E#G$I%K&\3\2\7\3\2\62;\3\2$$\4\2C\\c|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00e0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3"+
		"\2\2\2\13U\3\2\2\2\rX\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23f\3\2\2\2\25j"+
		"\3\2\2\2\27s\3\2\2\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2\2!"+
		"}\3\2\2\2#\177\3\2\2\2%\u0081\3\2\2\2\'\u0083\3\2\2\2)\u0085\3\2\2\2+"+
		"\u0087\3\2\2\2-\u0089\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2\63\u0091"+
		"\3\2\2\2\65\u0094\3\2\2\2\67\u0097\3\2\2\29\u009a\3\2\2\2;\u009f\3\2\2"+
		"\2=\u00a5\3\2\2\2?\u00a7\3\2\2\2A\u00a9\3\2\2\2C\u00ab\3\2\2\2E\u00ad"+
		"\3\2\2\2G\u00b4\3\2\2\2I\u00c2\3\2\2\2K\u00d3\3\2\2\2MN\7\'\2\2N\4\3\2"+
		"\2\2OP\7`\2\2P\6\3\2\2\2QR\7@\2\2R\b\3\2\2\2ST\7>\2\2T\n\3\2\2\2UV\7?"+
		"\2\2VW\7?\2\2W\f\3\2\2\2XY\7@\2\2YZ\7?\2\2Z\16\3\2\2\2[\\\7~\2\2\\\20"+
		"\3\2\2\2]_\7/\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`c\5\23\n\2ab\7\60\2\2"+
		"bd\5\23\n\2ca\3\2\2\2cd\3\2\2\2d\22\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2i\24\3\2\2\2jn\7$\2\2km\n\3\2\2lk\3\2\2\2mp\3"+
		"\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7$\2\2r\26\3\2\2\2st"+
		"\7\60\2\2t\30\3\2\2\2uv\7^\2\2v\32\3\2\2\2wx\7.\2\2x\34\3\2\2\2yz\7<\2"+
		"\2z\36\3\2\2\2{|\7A\2\2| \3\2\2\2}~\7*\2\2~\"\3\2\2\2\177\u0080\7+\2\2"+
		"\u0080$\3\2\2\2\u0081\u0082\7}\2\2\u0082&\3\2\2\2\u0083\u0084\7\177\2"+
		"\2\u0084(\3\2\2\2\u0085\u0086\7]\2\2\u0086*\3\2\2\2\u0087\u0088\7_\2\2"+
		"\u0088,\3\2\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c\7v\2"+
		"\2\u008c.\3\2\2\2\u008d\u008e\7#\2\2\u008e\60\3\2\2\2\u008f\u0090\7?\2"+
		"\2\u0090\62\3\2\2\2\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\64\3\2"+
		"\2\2\u0094\u0095\7>\2\2\u0095\u0096\7?\2\2\u0096\66\3\2\2\2\u0097\u0098"+
		"\7~\2\2\u0098\u0099\7~\2\2\u00998\3\2\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7w\2\2\u009d\u009e\7g\2\2\u009e:\3\2\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4<\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6>\3\2\2\2\u00a7\u00a8"+
		"\7\61\2\2\u00a8@\3\2\2\2\u00a9\u00aa\7-\2\2\u00aaB\3\2\2\2\u00ab\u00ac"+
		"\7/\2\2\u00acD\3\2\2\2\u00ad\u00b1\t\4\2\2\u00ae\u00b0\t\5\2\2\u00af\u00ae"+
		"\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"F\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\7,\2\2"+
		"\u00b6\u00ba\3\2\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7,\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\b$\2\2\u00c1H\3\2\2\2\u00c2\u00c3\7\61\2\2\u00c3\u00c4"+
		"\7\61\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c7\13\2\2\2\u00c6\u00c5\3\2\2\2"+
		"\u00c7\u00ca\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\7\17\2\2\u00cc\u00cb\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\f\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\b%\2\2\u00d1J\3\2\2\2\u00d2\u00d4\t\6\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\b&\2\2\u00d8L\3\2\2\2\f\2^chn\u00b1\u00ba\u00c8"+
		"\u00cc\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}