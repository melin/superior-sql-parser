// Generated from /Users/libinsong/Documents/codes/bigdata-sql-parser/src/main/antlr4/com/github/bigdata/sql/antlr4/stream/StreamSqlLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StreamSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, CREATE=5, 
		TABLE=6, SOURCE=7, SINK=8, SIDE=9, WITH=10, VIEW=11, COMMENT=12, TRUE=13, 
		FALSE=14, AS=15, BY=16, PROCTIME=17, ROWTIME=18, SET=19, WATERMARK=20, 
		RANGE=21, DELAY=22, INSERT=23, INTO=24, FUNCTION=25, USING=26, MINUSMINUS=27, 
		VARCHAR=28, BOOLEAN=29, TINYINT=30, SMALLINT=31, INT=32, BIGINT=33, FLOAT=34, 
		DECIMAL=35, DOUBLE=36, DATE=37, TIME=38, TIMESTAMP=39, STAR=40, DIVIDE=41, 
		MODULE=42, PLUS=43, MINUS=44, EQUAL_SYMBOL=45, GREATER_SYMBOL=46, LESS_SYMBOL=47, 
		EXCLAMATION_SYMBOL=48, BIT_NOT_OP=49, BIT_OR_OP=50, BIT_AND_OP=51, BIT_XOR_OP=52, 
		DOT=53, LR_BRACKET=54, RR_BRACKET=55, COMMA=56, SEMI=57, DOT_ID=58, ID=59, 
		REVERSE_QUOTE_ID=60, STRING_LITERAL=61, DECIMAL_LITERAL=62, REAL_LITERAL=63, 
		ERROR_RECONGNIGION=64;
	public static final int
		DCSTREAMCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "DCSTREAMCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "CREATE", 
			"TABLE", "SOURCE", "SINK", "SIDE", "WITH", "VIEW", "COMMENT", "TRUE", 
			"FALSE", "AS", "BY", "PROCTIME", "ROWTIME", "SET", "WATERMARK", "RANGE", 
			"DELAY", "INSERT", "INTO", "FUNCTION", "USING", "MINUSMINUS", "VARCHAR", 
			"BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DECIMAL", 
			"DOUBLE", "DATE", "TIME", "TIMESTAMP", "STAR", "DIVIDE", "MODULE", "PLUS", 
			"MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", 
			"RR_BRACKET", "COMMA", "SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "REAL_LITERAL", "EXPONENT_NUM_PART", "ID_LITERAL", 
			"DQUOTA_STRING", "SQUOTA_STRING", "DEC_DIGIT", "ERROR_RECONGNIGION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'CREATE'", "'TABLE'", "'SOURCE'", "'SINK'", 
			"'SIDE'", "'WITH'", "'VIEW'", "'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", 
			"'BY'", "'PROCTIME'", "'ROWTIME'", "'SET'", "'WATERMARK'", "'RANGE'", 
			"'DELAY'", "'INSERT'", "'INTO'", "'FUNCTION'", "'USING'", "'--'", "'VARCHAR'", 
			"'BOOLEAN'", "'TINYINT'", "'SMALLINT'", "'INT'", "'BIGINT'", "'FLOAT'", 
			"'DECIMAL'", "'DOUBLE'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'*'", "'/'", 
			"'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", 
			"'^'", "'.'", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"CREATE", "TABLE", "SOURCE", "SINK", "SIDE", "WITH", "VIEW", "COMMENT", 
			"TRUE", "FALSE", "AS", "BY", "PROCTIME", "ROWTIME", "SET", "WATERMARK", 
			"RANGE", "DELAY", "INSERT", "INTO", "FUNCTION", "USING", "MINUSMINUS", 
			"VARCHAR", "BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", 
			"DECIMAL", "DOUBLE", "DATE", "TIME", "TIMESTAMP", "STAR", "DIVIDE", "MODULE", 
			"PLUS", "MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", 
			"RR_BRACKET", "COMMA", "SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", 
			"DECIMAL_LITERAL", "REAL_LITERAL", "ERROR_RECONGNIGION"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public StreamSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StreamSqlLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2B\u0251\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\6\2\u008f\n"+
		"\2\r\2\16\2\u0090\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u009a\n\3\r\3\16\3\u009b"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a7\n\4\f\4\16\4\u00aa\13\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00b5\n\5\3\5\7\5\u00b8\n\5\f"+
		"\5\16\5\u00bb\13\5\3\5\5\5\u00be\n\5\3\5\3\5\5\5\u00c2\n\5\3\5\3\5\3\5"+
		"\3\5\5\5\u00c8\n\5\3\5\3\5\5\5\u00cc\n\5\5\5\u00ce\n\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3=\3="+
		"\6=\u01dc\n=\r=\16=\u01dd\3=\3=\3>\3>\5>\u01e4\n>\3?\6?\u01e7\n?\r?\16"+
		"?\u01e8\3@\6@\u01ec\n@\r@\16@\u01ed\5@\u01f0\n@\3@\3@\6@\u01f4\n@\r@\16"+
		"@\u01f5\3@\6@\u01f9\n@\r@\16@\u01fa\3@\3@\3@\3@\6@\u0201\n@\r@\16@\u0202"+
		"\5@\u0205\n@\3@\3@\6@\u0209\n@\r@\16@\u020a\3@\3@\3@\6@\u0210\n@\r@\16"+
		"@\u0211\3@\3@\5@\u0216\n@\3A\3A\5A\u021a\nA\3A\6A\u021d\nA\rA\16A\u021e"+
		"\3B\7B\u0222\nB\fB\16B\u0225\13B\3B\6B\u0228\nB\rB\16B\u0229\3B\7B\u022d"+
		"\nB\fB\16B\u0230\13B\3C\3C\3C\3C\3C\3C\7C\u0238\nC\fC\16C\u023b\13C\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\7D\u0245\nD\fD\16D\u0248\13D\3D\3D\3E\3E\3F\3F"+
		"\3F\3F\6\u009b\u00a8\u0223\u0229\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081\2\u0083"+
		"\2\u0085\2\u0087\2\u0089\2\u008bB\3\2\n\5\2\13\f\17\17\"\"\4\2\f\f\17"+
		"\17\3\2bb\6\2&&\62;C\\aa\5\2&&C\\aa\4\2$$^^\4\2))^^\3\2\62;\2\u026e\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U"+
		"\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2"+
		"\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2"+
		"\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u008b\3\2\2\2\3\u008e\3\2\2\2\5\u0094"+
		"\3\2\2\2\7\u00a2\3\2\2\2\t\u00cd\3\2\2\2\13\u00d1\3\2\2\2\r\u00d8\3\2"+
		"\2\2\17\u00de\3\2\2\2\21\u00e5\3\2\2\2\23\u00ea\3\2\2\2\25\u00ef\3\2\2"+
		"\2\27\u00f4\3\2\2\2\31\u00f9\3\2\2\2\33\u0101\3\2\2\2\35\u0106\3\2\2\2"+
		"\37\u010c\3\2\2\2!\u010f\3\2\2\2#\u0112\3\2\2\2%\u011b\3\2\2\2\'\u0123"+
		"\3\2\2\2)\u0127\3\2\2\2+\u0131\3\2\2\2-\u0137\3\2\2\2/\u013d\3\2\2\2\61"+
		"\u0144\3\2\2\2\63\u0149\3\2\2\2\65\u0152\3\2\2\2\67\u0158\3\2\2\29\u015b"+
		"\3\2\2\2;\u0163\3\2\2\2=\u016b\3\2\2\2?\u0173\3\2\2\2A\u017c\3\2\2\2C"+
		"\u0180\3\2\2\2E\u0187\3\2\2\2G\u018d\3\2\2\2I\u0195\3\2\2\2K\u019c\3\2"+
		"\2\2M\u01a1\3\2\2\2O\u01a6\3\2\2\2Q\u01b0\3\2\2\2S\u01b2\3\2\2\2U\u01b4"+
		"\3\2\2\2W\u01b6\3\2\2\2Y\u01b8\3\2\2\2[\u01ba\3\2\2\2]\u01bc\3\2\2\2_"+
		"\u01be\3\2\2\2a\u01c0\3\2\2\2c\u01c2\3\2\2\2e\u01c4\3\2\2\2g\u01c6\3\2"+
		"\2\2i\u01c8\3\2\2\2k\u01ca\3\2\2\2m\u01cc\3\2\2\2o\u01ce\3\2\2\2q\u01d0"+
		"\3\2\2\2s\u01d2\3\2\2\2u\u01d4\3\2\2\2w\u01d7\3\2\2\2y\u01d9\3\2\2\2{"+
		"\u01e3\3\2\2\2}\u01e6\3\2\2\2\177\u0215\3\2\2\2\u0081\u0217\3\2\2\2\u0083"+
		"\u0223\3\2\2\2\u0085\u0231\3\2\2\2\u0087\u023e\3\2\2\2\u0089\u024b\3\2"+
		"\2\2\u008b\u024d\3\2\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0093\b\2\2\2\u0093\4\3\2\2\2\u0094\u0095\7\61\2\2\u0095\u0096"+
		"\7,\2\2\u0096\u0097\7#\2\2\u0097\u0099\3\2\2\2\u0098\u009a\13\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7,\2\2\u009e\u009f\7\61\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\b\3\3\2\u00a1\6\3\2\2\2\u00a2\u00a3\7\61\2"+
		"\2\u00a3\u00a4\7,\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a7\13\2\2\2\u00a6\u00a5"+
		"\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac\u00ad\7\61"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\4\2\2\u00af\b\3\2\2\2\u00b0\u00b1"+
		"\7/\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b5\7\"\2\2\u00b3\u00b5\7%\2\2\u00b4"+
		"\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b8\n\3"+
		"\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00c1\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\7\17"+
		"\2\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c2\7\f\2\2\u00c0\u00c2\7\2\2\3\u00c1\u00bd\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00ce\3\2\2\2\u00c3\u00c4\7/\2\2\u00c4\u00c5\7/\2\2\u00c5\u00cb"+
		"\3\2\2\2\u00c6\u00c8\7\17\2\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00cc\7\f\2\2\u00ca\u00cc\7\2\2\3\u00cb\u00c7"+
		"\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00b4\3\2\2\2\u00cd"+
		"\u00c3\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\5\2\2\u00d0\n\3\2\2\2"+
		"\u00d1\u00d2\7E\2\2\u00d2\u00d3\7T\2\2\u00d3\u00d4\7G\2\2\u00d4\u00d5"+
		"\7C\2\2\u00d5\u00d6\7V\2\2\u00d6\u00d7\7G\2\2\u00d7\f\3\2\2\2\u00d8\u00d9"+
		"\7V\2\2\u00d9\u00da\7C\2\2\u00da\u00db\7D\2\2\u00db\u00dc\7N\2\2\u00dc"+
		"\u00dd\7G\2\2\u00dd\16\3\2\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7Q\2\2\u00e0"+
		"\u00e1\7W\2\2\u00e1\u00e2\7T\2\2\u00e2\u00e3\7E\2\2\u00e3\u00e4\7G\2\2"+
		"\u00e4\20\3\2\2\2\u00e5\u00e6\7U\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7"+
		"P\2\2\u00e8\u00e9\7M\2\2\u00e9\22\3\2\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec"+
		"\7K\2\2\u00ec\u00ed\7F\2\2\u00ed\u00ee\7G\2\2\u00ee\24\3\2\2\2\u00ef\u00f0"+
		"\7Y\2\2\u00f0\u00f1\7K\2\2\u00f1\u00f2\7V\2\2\u00f2\u00f3\7J\2\2\u00f3"+
		"\26\3\2\2\2\u00f4\u00f5\7X\2\2\u00f5\u00f6\7K\2\2\u00f6\u00f7\7G\2\2\u00f7"+
		"\u00f8\7Y\2\2\u00f8\30\3\2\2\2\u00f9\u00fa\7E\2\2\u00fa\u00fb\7Q\2\2\u00fb"+
		"\u00fc\7O\2\2\u00fc\u00fd\7O\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7P\2\2"+
		"\u00ff\u0100\7V\2\2\u0100\32\3\2\2\2\u0101\u0102\7V\2\2\u0102\u0103\7"+
		"T\2\2\u0103\u0104\7W\2\2\u0104\u0105\7G\2\2\u0105\34\3\2\2\2\u0106\u0107"+
		"\7H\2\2\u0107\u0108\7C\2\2\u0108\u0109\7N\2\2\u0109\u010a\7U\2\2\u010a"+
		"\u010b\7G\2\2\u010b\36\3\2\2\2\u010c\u010d\7C\2\2\u010d\u010e\7U\2\2\u010e"+
		" \3\2\2\2\u010f\u0110\7D\2\2\u0110\u0111\7[\2\2\u0111\"\3\2\2\2\u0112"+
		"\u0113\7R\2\2\u0113\u0114\7T\2\2\u0114\u0115\7Q\2\2\u0115\u0116\7E\2\2"+
		"\u0116\u0117\7V\2\2\u0117\u0118\7K\2\2\u0118\u0119\7O\2\2\u0119\u011a"+
		"\7G\2\2\u011a$\3\2\2\2\u011b\u011c\7T\2\2\u011c\u011d\7Q\2\2\u011d\u011e"+
		"\7Y\2\2\u011e\u011f\7V\2\2\u011f\u0120\7K\2\2\u0120\u0121\7O\2\2\u0121"+
		"\u0122\7G\2\2\u0122&\3\2\2\2\u0123\u0124\7U\2\2\u0124\u0125\7G\2\2\u0125"+
		"\u0126\7V\2\2\u0126(\3\2\2\2\u0127\u0128\7Y\2\2\u0128\u0129\7C\2\2\u0129"+
		"\u012a\7V\2\2\u012a\u012b\7G\2\2\u012b\u012c\7T\2\2\u012c\u012d\7O\2\2"+
		"\u012d\u012e\7C\2\2\u012e\u012f\7T\2\2\u012f\u0130\7M\2\2\u0130*\3\2\2"+
		"\2\u0131\u0132\7T\2\2\u0132\u0133\7C\2\2\u0133\u0134\7P\2\2\u0134\u0135"+
		"\7I\2\2\u0135\u0136\7G\2\2\u0136,\3\2\2\2\u0137\u0138\7F\2\2\u0138\u0139"+
		"\7G\2\2\u0139\u013a\7N\2\2\u013a\u013b\7C\2\2\u013b\u013c\7[\2\2\u013c"+
		".\3\2\2\2\u013d\u013e\7K\2\2\u013e\u013f\7P\2\2\u013f\u0140\7U\2\2\u0140"+
		"\u0141\7G\2\2\u0141\u0142\7T\2\2\u0142\u0143\7V\2\2\u0143\60\3\2\2\2\u0144"+
		"\u0145\7K\2\2\u0145\u0146\7P\2\2\u0146\u0147\7V\2\2\u0147\u0148\7Q\2\2"+
		"\u0148\62\3\2\2\2\u0149\u014a\7H\2\2\u014a\u014b\7W\2\2\u014b\u014c\7"+
		"P\2\2\u014c\u014d\7E\2\2\u014d\u014e\7V\2\2\u014e\u014f\7K\2\2\u014f\u0150"+
		"\7Q\2\2\u0150\u0151\7P\2\2\u0151\64\3\2\2\2\u0152\u0153\7W\2\2\u0153\u0154"+
		"\7U\2\2\u0154\u0155\7K\2\2\u0155\u0156\7P\2\2\u0156\u0157\7I\2\2\u0157"+
		"\66\3\2\2\2\u0158\u0159\7/\2\2\u0159\u015a\7/\2\2\u015a8\3\2\2\2\u015b"+
		"\u015c\7X\2\2\u015c\u015d\7C\2\2\u015d\u015e\7T\2\2\u015e\u015f\7E\2\2"+
		"\u015f\u0160\7J\2\2\u0160\u0161\7C\2\2\u0161\u0162\7T\2\2\u0162:\3\2\2"+
		"\2\u0163\u0164\7D\2\2\u0164\u0165\7Q\2\2\u0165\u0166\7Q\2\2\u0166\u0167"+
		"\7N\2\2\u0167\u0168\7G\2\2\u0168\u0169\7C\2\2\u0169\u016a\7P\2\2\u016a"+
		"<\3\2\2\2\u016b\u016c\7V\2\2\u016c\u016d\7K\2\2\u016d\u016e\7P\2\2\u016e"+
		"\u016f\7[\2\2\u016f\u0170\7K\2\2\u0170\u0171\7P\2\2\u0171\u0172\7V\2\2"+
		"\u0172>\3\2\2\2\u0173\u0174\7U\2\2\u0174\u0175\7O\2\2\u0175\u0176\7C\2"+
		"\2\u0176\u0177\7N\2\2\u0177\u0178\7N\2\2\u0178\u0179\7K\2\2\u0179\u017a"+
		"\7P\2\2\u017a\u017b\7V\2\2\u017b@\3\2\2\2\u017c\u017d\7K\2\2\u017d\u017e"+
		"\7P\2\2\u017e\u017f\7V\2\2\u017fB\3\2\2\2\u0180\u0181\7D\2\2\u0181\u0182"+
		"\7K\2\2\u0182\u0183\7I\2\2\u0183\u0184\7K\2\2\u0184\u0185\7P\2\2\u0185"+
		"\u0186\7V\2\2\u0186D\3\2\2\2\u0187\u0188\7H\2\2\u0188\u0189\7N\2\2\u0189"+
		"\u018a\7Q\2\2\u018a\u018b\7C\2\2\u018b\u018c\7V\2\2\u018cF\3\2\2\2\u018d"+
		"\u018e\7F\2\2\u018e\u018f\7G\2\2\u018f\u0190\7E\2\2\u0190\u0191\7K\2\2"+
		"\u0191\u0192\7O\2\2\u0192\u0193\7C\2\2\u0193\u0194\7N\2\2\u0194H\3\2\2"+
		"\2\u0195\u0196\7F\2\2\u0196\u0197\7Q\2\2\u0197\u0198\7W\2\2\u0198\u0199"+
		"\7D\2\2\u0199\u019a\7N\2\2\u019a\u019b\7G\2\2\u019bJ\3\2\2\2\u019c\u019d"+
		"\7F\2\2\u019d\u019e\7C\2\2\u019e\u019f\7V\2\2\u019f\u01a0\7G\2\2\u01a0"+
		"L\3\2\2\2\u01a1\u01a2\7V\2\2\u01a2\u01a3\7K\2\2\u01a3\u01a4\7O\2\2\u01a4"+
		"\u01a5\7G\2\2\u01a5N\3\2\2\2\u01a6\u01a7\7V\2\2\u01a7\u01a8\7K\2\2\u01a8"+
		"\u01a9\7O\2\2\u01a9\u01aa\7G\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\7V\2\2"+
		"\u01ac\u01ad\7C\2\2\u01ad\u01ae\7O\2\2\u01ae\u01af\7R\2\2\u01afP\3\2\2"+
		"\2\u01b0\u01b1\7,\2\2\u01b1R\3\2\2\2\u01b2\u01b3\7\61\2\2\u01b3T\3\2\2"+
		"\2\u01b4\u01b5\7\'\2\2\u01b5V\3\2\2\2\u01b6\u01b7\7-\2\2\u01b7X\3\2\2"+
		"\2\u01b8\u01b9\7/\2\2\u01b9Z\3\2\2\2\u01ba\u01bb\7?\2\2\u01bb\\\3\2\2"+
		"\2\u01bc\u01bd\7@\2\2\u01bd^\3\2\2\2\u01be\u01bf\7>\2\2\u01bf`\3\2\2\2"+
		"\u01c0\u01c1\7#\2\2\u01c1b\3\2\2\2\u01c2\u01c3\7\u0080\2\2\u01c3d\3\2"+
		"\2\2\u01c4\u01c5\7~\2\2\u01c5f\3\2\2\2\u01c6\u01c7\7(\2\2\u01c7h\3\2\2"+
		"\2\u01c8\u01c9\7`\2\2\u01c9j\3\2\2\2\u01ca\u01cb\7\60\2\2\u01cbl\3\2\2"+
		"\2\u01cc\u01cd\7*\2\2\u01cdn\3\2\2\2\u01ce\u01cf\7+\2\2\u01cfp\3\2\2\2"+
		"\u01d0\u01d1\7.\2\2\u01d1r\3\2\2\2\u01d2\u01d3\7=\2\2\u01d3t\3\2\2\2\u01d4"+
		"\u01d5\7\60\2\2\u01d5\u01d6\5\u0083B\2\u01d6v\3\2\2\2\u01d7\u01d8\5\u0083"+
		"B\2\u01d8x\3\2\2\2\u01d9\u01db\7b\2\2\u01da\u01dc\n\4\2\2\u01db\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de"+
		"\u01df\3\2\2\2\u01df\u01e0\7b\2\2\u01e0z\3\2\2\2\u01e1\u01e4\5\u0085C"+
		"\2\u01e2\u01e4\5\u0087D\2\u01e3\u01e1\3\2\2\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"|\3\2\2\2\u01e5\u01e7\5\u0089E\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2"+
		"\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9~\3\2\2\2\u01ea\u01ec"+
		"\5\u0089E\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2"+
		"\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01eb\3\2\2\2\u01ef\u01f0"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\7\60\2\2\u01f2\u01f4\5\u0089"+
		"E\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u0216\3\2\2\2\u01f7\u01f9\5\u0089E\2\u01f8\u01f7"+
		"\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\7\60\2\2\u01fd\u01fe\5\u0081A\2\u01fe\u0216"+
		"\3\2\2\2\u01ff\u0201\5\u0089E\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0200"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\7\60\2\2"+
		"\u0207\u0209\5\u0089E\2\u0208\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\5\u0081"+
		"A\2\u020d\u0216\3\2\2\2\u020e\u0210\5\u0089E\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0214\5\u0081A\2\u0214\u0216\3\2\2\2\u0215\u01ef\3\2\2\2\u0215"+
		"\u01f8\3\2\2\2\u0215\u0204\3\2\2\2\u0215\u020f\3\2\2\2\u0216\u0080\3\2"+
		"\2\2\u0217\u0219\7G\2\2\u0218\u021a\7/\2\2\u0219\u0218\3\2\2\2\u0219\u021a"+
		"\3\2\2\2\u021a\u021c\3\2\2\2\u021b\u021d\5\u0089E\2\u021c\u021b\3\2\2"+
		"\2\u021d\u021e\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0082"+
		"\3\2\2\2\u0220\u0222\t\5\2\2\u0221\u0220\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0224\3\2\2\2\u0223\u0221\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2"+
		"\2\2\u0226\u0228\t\6\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u022e\3\2\2\2\u022b\u022d\t\5"+
		"\2\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0084\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0239\7$"+
		"\2\2\u0232\u0233\7^\2\2\u0233\u0238\13\2\2\2\u0234\u0235\7$\2\2\u0235"+
		"\u0238\7$\2\2\u0236\u0238\n\7\2\2\u0237\u0232\3\2\2\2\u0237\u0234\3\2"+
		"\2\2\u0237\u0236\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7$"+
		"\2\2\u023d\u0086\3\2\2\2\u023e\u0246\7)\2\2\u023f\u0240\7^\2\2\u0240\u0245"+
		"\13\2\2\2\u0241\u0242\7)\2\2\u0242\u0245\7)\2\2\u0243\u0245\n\b\2\2\u0244"+
		"\u023f\3\2\2\2\u0244\u0241\3\2\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2"+
		"\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024a\7)\2\2\u024a\u0088\3\2\2\2\u024b\u024c\t\t"+
		"\2\2\u024c\u008a\3\2\2\2\u024d\u024e\13\2\2\2\u024e\u024f\3\2\2\2\u024f"+
		"\u0250\bF\4\2\u0250\u008c\3\2\2\2\"\2\u0090\u009b\u00a8\u00b4\u00b9\u00bd"+
		"\u00c1\u00c7\u00cb\u00cd\u01dd\u01e3\u01e8\u01ed\u01ef\u01f5\u01fa\u0202"+
		"\u0204\u020a\u0211\u0215\u0219\u021e\u0223\u0229\u022e\u0237\u0239\u0244"+
		"\u0246\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}