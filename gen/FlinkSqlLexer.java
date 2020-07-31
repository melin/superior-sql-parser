// Generated from /Users/libinsong/Documents/codes/tongdun/dataworker-sql-parser/src/main/antlr4/com/dataworker/sql/parser/antlr4/flink/FlinkSqlLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlinkSqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, CREATE=5, 
		TABLE=6, WITH=7, VIEW=8, COMMENT=9, TRUE=10, FALSE=11, AS=12, BY=13, PROCTIME=14, 
		ROWTIME=15, SET=16, WATERMARK=17, RANGE=18, DELAY=19, INSERT=20, INTO=21, 
		FUNCTION=22, USING=23, PRIMARY=24, PERIOD=25, KEY=26, SYSTEM_TIME=27, 
		FOR=28, WITHOFFSET=29, MINUSMINUS=30, VARCHAR=31, BOOLEAN=32, TINYINT=33, 
		SMALLINT=34, INT=35, BIGINT=36, FLOAT=37, DECIMAL=38, DOUBLE=39, DATE=40, 
		TIME=41, TIMESTAMP=42, VARBINARY=43, STAR=44, DIVIDE=45, MODULE=46, PLUS=47, 
		MINUS=48, EQUAL_SYMBOL=49, GREATER_SYMBOL=50, LESS_SYMBOL=51, EXCLAMATION_SYMBOL=52, 
		BIT_NOT_OP=53, BIT_OR_OP=54, BIT_AND_OP=55, BIT_XOR_OP=56, DOT=57, LR_BRACKET=58, 
		RR_BRACKET=59, COMMA=60, SEMI=61, DOT_ID=62, ID=63, REVERSE_QUOTE_ID=64, 
		STRING_LITERAL=65, DECIMAL_LITERAL=66, REAL_LITERAL=67, ERROR_RECONGNIGION=68;
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
			"TABLE", "WITH", "VIEW", "COMMENT", "TRUE", "FALSE", "AS", "BY", "PROCTIME", 
			"ROWTIME", "SET", "WATERMARK", "RANGE", "DELAY", "INSERT", "INTO", "FUNCTION", 
			"USING", "PRIMARY", "PERIOD", "KEY", "SYSTEM_TIME", "FOR", "WITHOFFSET", 
			"MINUSMINUS", "VARCHAR", "BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", 
			"FLOAT", "DECIMAL", "DOUBLE", "DATE", "TIME", "TIMESTAMP", "VARBINARY", 
			"STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", 
			"LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", 
			"BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "DOT_ID", 
			"ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", 
			"EXPONENT_NUM_PART", "ID_LITERAL", "DQUOTA_STRING", "SQUOTA_STRING", 
			"DEC_DIGIT", "ERROR_RECONGNIGION"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'CREATE'", "'TABLE'", "'WITH'", "'VIEW'", 
			"'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", "'BY'", "'PROCTIME'", "'ROWTIME'", 
			"'SET'", "'WATERMARK'", "'RANGE'", "'DELAY'", "'INSERT'", "'INTO'", "'FUNCTION'", 
			"'USING'", "'PRIMARY'", "'PERIOD'", "'KEY'", "'SYSTEM_TIME'", "'FOR'", 
			"'WITHOFFSET'", "'--'", "'VARCHAR'", "'BOOLEAN'", "'TINYINT'", "'SMALLINT'", 
			"'INT'", "'BIGINT'", "'FLOAT'", "'DECIMAL'", "'DOUBLE'", "'DATE'", "'TIME'", 
			"'TIMESTAMP'", "'VARBINARY'", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", 
			"'>'", "'<'", "'!'", "'~'", "'|'", "'&'", "'^'", "'.'", "'('", "')'", 
			"','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
			"CREATE", "TABLE", "WITH", "VIEW", "COMMENT", "TRUE", "FALSE", "AS", 
			"BY", "PROCTIME", "ROWTIME", "SET", "WATERMARK", "RANGE", "DELAY", "INSERT", 
			"INTO", "FUNCTION", "USING", "PRIMARY", "PERIOD", "KEY", "SYSTEM_TIME", 
			"FOR", "WITHOFFSET", "MINUSMINUS", "VARCHAR", "BOOLEAN", "TINYINT", "SMALLINT", 
			"INT", "BIGINT", "FLOAT", "DECIMAL", "DOUBLE", "DATE", "TIME", "TIMESTAMP", 
			"VARBINARY", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
			"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", 
			"BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", 
			"COMMA", "SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", 
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


	public FlinkSqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlinkSqlLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u0280\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\6\2\u0097\n\2\r\2\16\2\u0098\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\6\3\u00a2\n\3\r\3\16\3\u00a3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4"+
		"\u00af\n\4\f\4\16\4\u00b2\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"\u00bd\n\5\3\5\7\5\u00c0\n\5\f\5\16\5\u00c3\13\5\3\5\5\5\u00c6\n\5\3\5"+
		"\3\5\5\5\u00ca\n\5\3\5\3\5\3\5\3\5\5\5\u00d0\n\5\3\5\3\5\5\5\u00d4\n\5"+
		"\5\5\u00d6\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>"+
		"\3>\3?\3?\3?\3@\3@\3A\3A\6A\u020b\nA\rA\16A\u020c\3A\3A\3B\3B\5B\u0213"+
		"\nB\3C\6C\u0216\nC\rC\16C\u0217\3D\6D\u021b\nD\rD\16D\u021c\5D\u021f\n"+
		"D\3D\3D\6D\u0223\nD\rD\16D\u0224\3D\6D\u0228\nD\rD\16D\u0229\3D\3D\3D"+
		"\3D\6D\u0230\nD\rD\16D\u0231\5D\u0234\nD\3D\3D\6D\u0238\nD\rD\16D\u0239"+
		"\3D\3D\3D\6D\u023f\nD\rD\16D\u0240\3D\3D\5D\u0245\nD\3E\3E\5E\u0249\n"+
		"E\3E\6E\u024c\nE\rE\16E\u024d\3F\7F\u0251\nF\fF\16F\u0254\13F\3F\6F\u0257"+
		"\nF\rF\16F\u0258\3F\7F\u025c\nF\fF\16F\u025f\13F\3G\3G\3G\3G\3G\3G\7G"+
		"\u0267\nG\fG\16G\u026a\13G\3G\3G\3H\3H\3H\3H\3H\3H\7H\u0274\nH\fH\16H"+
		"\u0277\13H\3H\3H\3I\3I\3J\3J\3J\3J\6\u00a3\u00b0\u0252\u0258\2K\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093F\3\2\n\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2bb\6\2&&\62"+
		";C\\aa\5\2&&C\\aa\4\2$$^^\4\2))^^\3\2\62;\2\u029d\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0093\3\2\2\2\3\u0096\3\2\2\2\5\u009c\3\2\2\2\7\u00aa\3\2\2\2"+
		"\t\u00d5\3\2\2\2\13\u00d9\3\2\2\2\r\u00e0\3\2\2\2\17\u00e6\3\2\2\2\21"+
		"\u00eb\3\2\2\2\23\u00f0\3\2\2\2\25\u00f8\3\2\2\2\27\u00fd\3\2\2\2\31\u0103"+
		"\3\2\2\2\33\u0106\3\2\2\2\35\u0109\3\2\2\2\37\u0112\3\2\2\2!\u011a\3\2"+
		"\2\2#\u011e\3\2\2\2%\u0128\3\2\2\2\'\u012e\3\2\2\2)\u0134\3\2\2\2+\u013b"+
		"\3\2\2\2-\u0140\3\2\2\2/\u0149\3\2\2\2\61\u014f\3\2\2\2\63\u0157\3\2\2"+
		"\2\65\u015e\3\2\2\2\67\u0162\3\2\2\29\u016e\3\2\2\2;\u0172\3\2\2\2=\u017d"+
		"\3\2\2\2?\u0180\3\2\2\2A\u0188\3\2\2\2C\u0190\3\2\2\2E\u0198\3\2\2\2G"+
		"\u01a1\3\2\2\2I\u01a5\3\2\2\2K\u01ac\3\2\2\2M\u01b2\3\2\2\2O\u01ba\3\2"+
		"\2\2Q\u01c1\3\2\2\2S\u01c6\3\2\2\2U\u01cb\3\2\2\2W\u01d5\3\2\2\2Y\u01df"+
		"\3\2\2\2[\u01e1\3\2\2\2]\u01e3\3\2\2\2_\u01e5\3\2\2\2a\u01e7\3\2\2\2c"+
		"\u01e9\3\2\2\2e\u01eb\3\2\2\2g\u01ed\3\2\2\2i\u01ef\3\2\2\2k\u01f1\3\2"+
		"\2\2m\u01f3\3\2\2\2o\u01f5\3\2\2\2q\u01f7\3\2\2\2s\u01f9\3\2\2\2u\u01fb"+
		"\3\2\2\2w\u01fd\3\2\2\2y\u01ff\3\2\2\2{\u0201\3\2\2\2}\u0203\3\2\2\2\177"+
		"\u0206\3\2\2\2\u0081\u0208\3\2\2\2\u0083\u0212\3\2\2\2\u0085\u0215\3\2"+
		"\2\2\u0087\u0244\3\2\2\2\u0089\u0246\3\2\2\2\u008b\u0252\3\2\2\2\u008d"+
		"\u0260\3\2\2\2\u008f\u026d\3\2\2\2\u0091\u027a\3\2\2\2\u0093\u027c\3\2"+
		"\2\2\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\2"+
		"\2\2\u009b\4\3\2\2\2\u009c\u009d\7\61\2\2\u009d\u009e\7,\2\2\u009e\u009f"+
		"\7#\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\b\3\3\2\u00a9\6\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\7,\2\2"+
		"\u00ac\u00b0\3\2\2\2\u00ad\u00af\13\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\b\4\2\2\u00b7\b\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba"+
		"\7/\2\2\u00ba\u00bd\7\"\2\2\u00bb\u00bd\7%\2\2\u00bc\u00b8\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\n\3\2\2\u00bf\u00be\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c9\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\7\f\2\2\u00c8"+
		"\u00ca\7\2\2\3\u00c9\u00c5\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00d6\3\2"+
		"\2\2\u00cb\u00cc\7/\2\2\u00cc\u00cd\7/\2\2\u00cd\u00d3\3\2\2\2\u00ce\u00d0"+
		"\7\17\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2"+
		"\u00d1\u00d4\7\f\2\2\u00d2\u00d4\7\2\2\3\u00d3\u00cf\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00bc\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\b\5\2\2\u00d8\n\3\2\2\2\u00d9\u00da\7E\2\2"+
		"\u00da\u00db\7T\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7C\2\2\u00dd\u00de"+
		"\7V\2\2\u00de\u00df\7G\2\2\u00df\f\3\2\2\2\u00e0\u00e1\7V\2\2\u00e1\u00e2"+
		"\7C\2\2\u00e2\u00e3\7D\2\2\u00e3\u00e4\7N\2\2\u00e4\u00e5\7G\2\2\u00e5"+
		"\16\3\2\2\2\u00e6\u00e7\7Y\2\2\u00e7\u00e8\7K\2\2\u00e8\u00e9\7V\2\2\u00e9"+
		"\u00ea\7J\2\2\u00ea\20\3\2\2\2\u00eb\u00ec\7X\2\2\u00ec\u00ed\7K\2\2\u00ed"+
		"\u00ee\7G\2\2\u00ee\u00ef\7Y\2\2\u00ef\22\3\2\2\2\u00f0\u00f1\7E\2\2\u00f1"+
		"\u00f2\7Q\2\2\u00f2\u00f3\7O\2\2\u00f3\u00f4\7O\2\2\u00f4\u00f5\7G\2\2"+
		"\u00f5\u00f6\7P\2\2\u00f6\u00f7\7V\2\2\u00f7\24\3\2\2\2\u00f8\u00f9\7"+
		"V\2\2\u00f9\u00fa\7T\2\2\u00fa\u00fb\7W\2\2\u00fb\u00fc\7G\2\2\u00fc\26"+
		"\3\2\2\2\u00fd\u00fe\7H\2\2\u00fe\u00ff\7C\2\2\u00ff\u0100\7N\2\2\u0100"+
		"\u0101\7U\2\2\u0101\u0102\7G\2\2\u0102\30\3\2\2\2\u0103\u0104\7C\2\2\u0104"+
		"\u0105\7U\2\2\u0105\32\3\2\2\2\u0106\u0107\7D\2\2\u0107\u0108\7[\2\2\u0108"+
		"\34\3\2\2\2\u0109\u010a\7R\2\2\u010a\u010b\7T\2\2\u010b\u010c\7Q\2\2\u010c"+
		"\u010d\7E\2\2\u010d\u010e\7V\2\2\u010e\u010f\7K\2\2\u010f\u0110\7O\2\2"+
		"\u0110\u0111\7G\2\2\u0111\36\3\2\2\2\u0112\u0113\7T\2\2\u0113\u0114\7"+
		"Q\2\2\u0114\u0115\7Y\2\2\u0115\u0116\7V\2\2\u0116\u0117\7K\2\2\u0117\u0118"+
		"\7O\2\2\u0118\u0119\7G\2\2\u0119 \3\2\2\2\u011a\u011b\7U\2\2\u011b\u011c"+
		"\7G\2\2\u011c\u011d\7V\2\2\u011d\"\3\2\2\2\u011e\u011f\7Y\2\2\u011f\u0120"+
		"\7C\2\2\u0120\u0121\7V\2\2\u0121\u0122\7G\2\2\u0122\u0123\7T\2\2\u0123"+
		"\u0124\7O\2\2\u0124\u0125\7C\2\2\u0125\u0126\7T\2\2\u0126\u0127\7M\2\2"+
		"\u0127$\3\2\2\2\u0128\u0129\7T\2\2\u0129\u012a\7C\2\2\u012a\u012b\7P\2"+
		"\2\u012b\u012c\7I\2\2\u012c\u012d\7G\2\2\u012d&\3\2\2\2\u012e\u012f\7"+
		"F\2\2\u012f\u0130\7G\2\2\u0130\u0131\7N\2\2\u0131\u0132\7C\2\2\u0132\u0133"+
		"\7[\2\2\u0133(\3\2\2\2\u0134\u0135\7K\2\2\u0135\u0136\7P\2\2\u0136\u0137"+
		"\7U\2\2\u0137\u0138\7G\2\2\u0138\u0139\7T\2\2\u0139\u013a\7V\2\2\u013a"+
		"*\3\2\2\2\u013b\u013c\7K\2\2\u013c\u013d\7P\2\2\u013d\u013e\7V\2\2\u013e"+
		"\u013f\7Q\2\2\u013f,\3\2\2\2\u0140\u0141\7H\2\2\u0141\u0142\7W\2\2\u0142"+
		"\u0143\7P\2\2\u0143\u0144\7E\2\2\u0144\u0145\7V\2\2\u0145\u0146\7K\2\2"+
		"\u0146\u0147\7Q\2\2\u0147\u0148\7P\2\2\u0148.\3\2\2\2\u0149\u014a\7W\2"+
		"\2\u014a\u014b\7U\2\2\u014b\u014c\7K\2\2\u014c\u014d\7P\2\2\u014d\u014e"+
		"\7I\2\2\u014e\60\3\2\2\2\u014f\u0150\7R\2\2\u0150\u0151\7T\2\2\u0151\u0152"+
		"\7K\2\2\u0152\u0153\7O\2\2\u0153\u0154\7C\2\2\u0154\u0155\7T\2\2\u0155"+
		"\u0156\7[\2\2\u0156\62\3\2\2\2\u0157\u0158\7R\2\2\u0158\u0159\7G\2\2\u0159"+
		"\u015a\7T\2\2\u015a\u015b\7K\2\2\u015b\u015c\7Q\2\2\u015c\u015d\7F\2\2"+
		"\u015d\64\3\2\2\2\u015e\u015f\7M\2\2\u015f\u0160\7G\2\2\u0160\u0161\7"+
		"[\2\2\u0161\66\3\2\2\2\u0162\u0163\7U\2\2\u0163\u0164\7[\2\2\u0164\u0165"+
		"\7U\2\2\u0165\u0166\7V\2\2\u0166\u0167\7G\2\2\u0167\u0168\7O\2\2\u0168"+
		"\u0169\7a\2\2\u0169\u016a\7V\2\2\u016a\u016b\7K\2\2\u016b\u016c\7O\2\2"+
		"\u016c\u016d\7G\2\2\u016d8\3\2\2\2\u016e\u016f\7H\2\2\u016f\u0170\7Q\2"+
		"\2\u0170\u0171\7T\2\2\u0171:\3\2\2\2\u0172\u0173\7Y\2\2\u0173\u0174\7"+
		"K\2\2\u0174\u0175\7V\2\2\u0175\u0176\7J\2\2\u0176\u0177\7Q\2\2\u0177\u0178"+
		"\7H\2\2\u0178\u0179\7H\2\2\u0179\u017a\7U\2\2\u017a\u017b\7G\2\2\u017b"+
		"\u017c\7V\2\2\u017c<\3\2\2\2\u017d\u017e\7/\2\2\u017e\u017f\7/\2\2\u017f"+
		">\3\2\2\2\u0180\u0181\7X\2\2\u0181\u0182\7C\2\2\u0182\u0183\7T\2\2\u0183"+
		"\u0184\7E\2\2\u0184\u0185\7J\2\2\u0185\u0186\7C\2\2\u0186\u0187\7T\2\2"+
		"\u0187@\3\2\2\2\u0188\u0189\7D\2\2\u0189\u018a\7Q\2\2\u018a\u018b\7Q\2"+
		"\2\u018b\u018c\7N\2\2\u018c\u018d\7G\2\2\u018d\u018e\7C\2\2\u018e\u018f"+
		"\7P\2\2\u018fB\3\2\2\2\u0190\u0191\7V\2\2\u0191\u0192\7K\2\2\u0192\u0193"+
		"\7P\2\2\u0193\u0194\7[\2\2\u0194\u0195\7K\2\2\u0195\u0196\7P\2\2\u0196"+
		"\u0197\7V\2\2\u0197D\3\2\2\2\u0198\u0199\7U\2\2\u0199\u019a\7O\2\2\u019a"+
		"\u019b\7C\2\2\u019b\u019c\7N\2\2\u019c\u019d\7N\2\2\u019d\u019e\7K\2\2"+
		"\u019e\u019f\7P\2\2\u019f\u01a0\7V\2\2\u01a0F\3\2\2\2\u01a1\u01a2\7K\2"+
		"\2\u01a2\u01a3\7P\2\2\u01a3\u01a4\7V\2\2\u01a4H\3\2\2\2\u01a5\u01a6\7"+
		"D\2\2\u01a6\u01a7\7K\2\2\u01a7\u01a8\7I\2\2\u01a8\u01a9\7K\2\2\u01a9\u01aa"+
		"\7P\2\2\u01aa\u01ab\7V\2\2\u01abJ\3\2\2\2\u01ac\u01ad\7H\2\2\u01ad\u01ae"+
		"\7N\2\2\u01ae\u01af\7Q\2\2\u01af\u01b0\7C\2\2\u01b0\u01b1\7V\2\2\u01b1"+
		"L\3\2\2\2\u01b2\u01b3\7F\2\2\u01b3\u01b4\7G\2\2\u01b4\u01b5\7E\2\2\u01b5"+
		"\u01b6\7K\2\2\u01b6\u01b7\7O\2\2\u01b7\u01b8\7C\2\2\u01b8\u01b9\7N\2\2"+
		"\u01b9N\3\2\2\2\u01ba\u01bb\7F\2\2\u01bb\u01bc\7Q\2\2\u01bc\u01bd\7W\2"+
		"\2\u01bd\u01be\7D\2\2\u01be\u01bf\7N\2\2\u01bf\u01c0\7G\2\2\u01c0P\3\2"+
		"\2\2\u01c1\u01c2\7F\2\2\u01c2\u01c3\7C\2\2\u01c3\u01c4\7V\2\2\u01c4\u01c5"+
		"\7G\2\2\u01c5R\3\2\2\2\u01c6\u01c7\7V\2\2\u01c7\u01c8\7K\2\2\u01c8\u01c9"+
		"\7O\2\2\u01c9\u01ca\7G\2\2\u01caT\3\2\2\2\u01cb\u01cc\7V\2\2\u01cc\u01cd"+
		"\7K\2\2\u01cd\u01ce\7O\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0\7U\2\2\u01d0"+
		"\u01d1\7V\2\2\u01d1\u01d2\7C\2\2\u01d2\u01d3\7O\2\2\u01d3\u01d4\7R\2\2"+
		"\u01d4V\3\2\2\2\u01d5\u01d6\7X\2\2\u01d6\u01d7\7C\2\2\u01d7\u01d8\7T\2"+
		"\2\u01d8\u01d9\7D\2\2\u01d9\u01da\7K\2\2\u01da\u01db\7P\2\2\u01db\u01dc"+
		"\7C\2\2\u01dc\u01dd\7T\2\2\u01dd\u01de\7[\2\2\u01deX\3\2\2\2\u01df\u01e0"+
		"\7,\2\2\u01e0Z\3\2\2\2\u01e1\u01e2\7\61\2\2\u01e2\\\3\2\2\2\u01e3\u01e4"+
		"\7\'\2\2\u01e4^\3\2\2\2\u01e5\u01e6\7-\2\2\u01e6`\3\2\2\2\u01e7\u01e8"+
		"\7/\2\2\u01e8b\3\2\2\2\u01e9\u01ea\7?\2\2\u01ead\3\2\2\2\u01eb\u01ec\7"+
		"@\2\2\u01ecf\3\2\2\2\u01ed\u01ee\7>\2\2\u01eeh\3\2\2\2\u01ef\u01f0\7#"+
		"\2\2\u01f0j\3\2\2\2\u01f1\u01f2\7\u0080\2\2\u01f2l\3\2\2\2\u01f3\u01f4"+
		"\7~\2\2\u01f4n\3\2\2\2\u01f5\u01f6\7(\2\2\u01f6p\3\2\2\2\u01f7\u01f8\7"+
		"`\2\2\u01f8r\3\2\2\2\u01f9\u01fa\7\60\2\2\u01fat\3\2\2\2\u01fb\u01fc\7"+
		"*\2\2\u01fcv\3\2\2\2\u01fd\u01fe\7+\2\2\u01fex\3\2\2\2\u01ff\u0200\7."+
		"\2\2\u0200z\3\2\2\2\u0201\u0202\7=\2\2\u0202|\3\2\2\2\u0203\u0204\7\60"+
		"\2\2\u0204\u0205\5\u008bF\2\u0205~\3\2\2\2\u0206\u0207\5\u008bF\2\u0207"+
		"\u0080\3\2\2\2\u0208\u020a\7b\2\2\u0209\u020b\n\4\2\2\u020a\u0209\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\7b\2\2\u020f\u0082\3\2\2\2\u0210\u0213\5\u008d"+
		"G\2\u0211\u0213\5\u008fH\2\u0212\u0210\3\2\2\2\u0212\u0211\3\2\2\2\u0213"+
		"\u0084\3\2\2\2\u0214\u0216\5\u0091I\2\u0215\u0214\3\2\2\2\u0216\u0217"+
		"\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0086\3\2\2\2\u0219"+
		"\u021b\5\u0091I\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021a\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0222\7\60\2\2\u0221\u0223\5"+
		"\u0091I\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0222\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0225\u0245\3\2\2\2\u0226\u0228\5\u0091I\2\u0227"+
		"\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2\2\2\u0229\u022a\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7\60\2\2\u022c\u022d\5\u0089E\2\u022d"+
		"\u0245\3\2\2\2\u022e\u0230\5\u0091I\2\u022f\u022e\3\2\2\2\u0230\u0231"+
		"\3\2\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u022f\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\7\60"+
		"\2\2\u0236\u0238\5\u0091I\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5\u0089"+
		"E\2\u023c\u0245\3\2\2\2\u023d\u023f\5\u0091I\2\u023e\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2"+
		"\2\2\u0242\u0243\5\u0089E\2\u0243\u0245\3\2\2\2\u0244\u021e\3\2\2\2\u0244"+
		"\u0227\3\2\2\2\u0244\u0233\3\2\2\2\u0244\u023e\3\2\2\2\u0245\u0088\3\2"+
		"\2\2\u0246\u0248\7G\2\2\u0247\u0249\7/\2\2\u0248\u0247\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u024c\5\u0091I\2\u024b\u024a\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u008a"+
		"\3\2\2\2\u024f\u0251\t\5\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0255\u0257\t\6\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025d\3\2\2\2\u025a\u025c\t\5"+
		"\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u008c\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0268\7$"+
		"\2\2\u0261\u0262\7^\2\2\u0262\u0267\13\2\2\2\u0263\u0264\7$\2\2\u0264"+
		"\u0267\7$\2\2\u0265\u0267\n\7\2\2\u0266\u0261\3\2\2\2\u0266\u0263\3\2"+
		"\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026c\7$"+
		"\2\2\u026c\u008e\3\2\2\2\u026d\u0275\7)\2\2\u026e\u026f\7^\2\2\u026f\u0274"+
		"\13\2\2\2\u0270\u0271\7)\2\2\u0271\u0274\7)\2\2\u0272\u0274\n\b\2\2\u0273"+
		"\u026e\3\2\2\2\u0273\u0270\3\2\2\2\u0273\u0272\3\2\2\2\u0274\u0277\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0278\3\2\2\2\u0277"+
		"\u0275\3\2\2\2\u0278\u0279\7)\2\2\u0279\u0090\3\2\2\2\u027a\u027b\t\t"+
		"\2\2\u027b\u0092\3\2\2\2\u027c\u027d\13\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\bJ\4\2\u027f\u0094\3\2\2\2\"\2\u0098\u00a3\u00b0\u00bc\u00c1\u00c5"+
		"\u00c9\u00cf\u00d3\u00d5\u020c\u0212\u0217\u021c\u021e\u0224\u0229\u0231"+
		"\u0233\u0239\u0240\u0244\u0248\u024d\u0252\u0258\u025d\u0266\u0268\u0273"+
		"\u0275\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}