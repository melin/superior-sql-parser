// Generated from com/github/bigdata/sql/antlr4/stream/StreamSqlLexer.g4 by ANTLR 4.7
package com.github.bigdata.sql.antlr4.stream;
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, CREATE=5, 
		TABLE=6, SOURCE=7, SINK=8, WITH=9, VIEW=10, COMMENT=11, TRUE=12, FALSE=13, 
		AS=14, BY=15, PROCTIME=16, ROWTIME=17, SET=18, WATERMARK=19, RANGE=20, 
		DELAY=21, INSERT=22, INTO=23, FUNCTION=24, USING=25, MINUSMINUS=26, VARCHAR=27, 
		BOOLEAN=28, TINYINT=29, SMALLINT=30, INT=31, BIGINT=32, FLOAT=33, DECIMAL=34, 
		DOUBLE=35, DATE=36, TIME=37, TIMESTAMP=38, STAR=39, DIVIDE=40, MODULE=41, 
		PLUS=42, MINUS=43, EQUAL_SYMBOL=44, GREATER_SYMBOL=45, LESS_SYMBOL=46, 
		EXCLAMATION_SYMBOL=47, BIT_NOT_OP=48, BIT_OR_OP=49, BIT_AND_OP=50, BIT_XOR_OP=51, 
		DOT=52, LR_BRACKET=53, RR_BRACKET=54, COMMA=55, SEMI=56, DOT_ID=57, ID=58, 
		REVERSE_QUOTE_ID=59, STRING_LITERAL=60, DECIMAL_LITERAL=61, REAL_LITERAL=62, 
		ERROR_RECONGNIGION=63;
	public static final int
		DCSTREAMCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "DCSTREAMCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "CREATE", 
		"TABLE", "SOURCE", "SINK", "WITH", "VIEW", "COMMENT", "TRUE", "FALSE", 
		"AS", "BY", "PROCTIME", "ROWTIME", "SET", "WATERMARK", "RANGE", "DELAY", 
		"INSERT", "INTO", "FUNCTION", "USING", "MINUSMINUS", "VARCHAR", "BOOLEAN", 
		"TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DECIMAL", "DOUBLE", 
		"DATE", "TIME", "TIMESTAMP", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", 
		"EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
		"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", 
		"RR_BRACKET", "COMMA", "SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", 
		"DECIMAL_LITERAL", "REAL_LITERAL", "EXPONENT_NUM_PART", "ID_LITERAL", 
		"DQUOTA_STRING", "SQUOTA_STRING", "DEC_DIGIT", "ERROR_RECONGNIGION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'CREATE'", "'TABLE'", "'SOURCE'", "'SINK'", 
		"'WITH'", "'VIEW'", "'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", "'BY'", 
		"'PROCTIME'", "'ROWTIME'", "'SET'", "'WATERMARK'", "'RANGE'", "'DELAY'", 
		"'INSERT'", "'INTO'", "'FUNCTION'", "'USING'", "'--'", "'VARCHAR'", "'BOOLEAN'", 
		"'TINYINT'", "'SMALLINT'", "'INT'", "'BIGINT'", "'FLOAT'", "'DECIMAL'", 
		"'DOUBLE'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", "'^'", "'.'", 
		"'('", "')'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
		"CREATE", "TABLE", "SOURCE", "SINK", "WITH", "VIEW", "COMMENT", "TRUE", 
		"FALSE", "AS", "BY", "PROCTIME", "ROWTIME", "SET", "WATERMARK", "RANGE", 
		"DELAY", "INSERT", "INTO", "FUNCTION", "USING", "MINUSMINUS", "VARCHAR", 
		"BOOLEAN", "TINYINT", "SMALLINT", "INT", "BIGINT", "FLOAT", "DECIMAL", 
		"DOUBLE", "DATE", "TIME", "TIMESTAMP", "STAR", "DIVIDE", "MODULE", "PLUS", 
		"MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
		"BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", 
		"RR_BRACKET", "COMMA", "SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", 
		"DECIMAL_LITERAL", "REAL_LITERAL", "ERROR_RECONGNIGION"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u024a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\6\2\u008d\n\2\r\2"+
		"\16\2\u008e\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\u0098\n\3\r\3\16\3\u0099\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u00a5\n\4\f\4\16\4\u00a8\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5\7\5\u00b6\n\5\f\5"+
		"\16\5\u00b9\13\5\3\5\5\5\u00bc\n\5\3\5\3\5\5\5\u00c0\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00c6\n\5\3\5\3\5\5\5\u00ca\n\5\5\5\u00cc\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\6<\u01d5"+
		"\n<\r<\16<\u01d6\3<\3<\3=\3=\5=\u01dd\n=\3>\6>\u01e0\n>\r>\16>\u01e1\3"+
		"?\6?\u01e5\n?\r?\16?\u01e6\5?\u01e9\n?\3?\3?\6?\u01ed\n?\r?\16?\u01ee"+
		"\3?\6?\u01f2\n?\r?\16?\u01f3\3?\3?\3?\3?\6?\u01fa\n?\r?\16?\u01fb\5?\u01fe"+
		"\n?\3?\3?\6?\u0202\n?\r?\16?\u0203\3?\3?\3?\6?\u0209\n?\r?\16?\u020a\3"+
		"?\3?\5?\u020f\n?\3@\3@\5@\u0213\n@\3@\6@\u0216\n@\r@\16@\u0217\3A\7A\u021b"+
		"\nA\fA\16A\u021e\13A\3A\6A\u0221\nA\rA\16A\u0222\3A\7A\u0226\nA\fA\16"+
		"A\u0229\13A\3B\3B\3B\3B\3B\3B\7B\u0231\nB\fB\16B\u0234\13B\3B\3B\3C\3"+
		"C\3C\3C\3C\3C\7C\u023e\nC\fC\16C\u0241\13C\3C\3C\3D\3D\3E\3E\3E\3E\6\u0099"+
		"\u00a6\u021c\u0222\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089A\3\2\n\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2bb\6\2&&\62;C\\aa"+
		"\5\2&&C\\aa\4\2$$^^\4\2))^^\3\2\62;\2\u0267\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0089"+
		"\3\2\2\2\3\u008c\3\2\2\2\5\u0092\3\2\2\2\7\u00a0\3\2\2\2\t\u00cb\3\2\2"+
		"\2\13\u00cf\3\2\2\2\r\u00d6\3\2\2\2\17\u00dc\3\2\2\2\21\u00e3\3\2\2\2"+
		"\23\u00e8\3\2\2\2\25\u00ed\3\2\2\2\27\u00f2\3\2\2\2\31\u00fa\3\2\2\2\33"+
		"\u00ff\3\2\2\2\35\u0105\3\2\2\2\37\u0108\3\2\2\2!\u010b\3\2\2\2#\u0114"+
		"\3\2\2\2%\u011c\3\2\2\2\'\u0120\3\2\2\2)\u012a\3\2\2\2+\u0130\3\2\2\2"+
		"-\u0136\3\2\2\2/\u013d\3\2\2\2\61\u0142\3\2\2\2\63\u014b\3\2\2\2\65\u0151"+
		"\3\2\2\2\67\u0154\3\2\2\29\u015c\3\2\2\2;\u0164\3\2\2\2=\u016c\3\2\2\2"+
		"?\u0175\3\2\2\2A\u0179\3\2\2\2C\u0180\3\2\2\2E\u0186\3\2\2\2G\u018e\3"+
		"\2\2\2I\u0195\3\2\2\2K\u019a\3\2\2\2M\u019f\3\2\2\2O\u01a9\3\2\2\2Q\u01ab"+
		"\3\2\2\2S\u01ad\3\2\2\2U\u01af\3\2\2\2W\u01b1\3\2\2\2Y\u01b3\3\2\2\2["+
		"\u01b5\3\2\2\2]\u01b7\3\2\2\2_\u01b9\3\2\2\2a\u01bb\3\2\2\2c\u01bd\3\2"+
		"\2\2e\u01bf\3\2\2\2g\u01c1\3\2\2\2i\u01c3\3\2\2\2k\u01c5\3\2\2\2m\u01c7"+
		"\3\2\2\2o\u01c9\3\2\2\2q\u01cb\3\2\2\2s\u01cd\3\2\2\2u\u01d0\3\2\2\2w"+
		"\u01d2\3\2\2\2y\u01dc\3\2\2\2{\u01df\3\2\2\2}\u020e\3\2\2\2\177\u0210"+
		"\3\2\2\2\u0081\u021c\3\2\2\2\u0083\u022a\3\2\2\2\u0085\u0237\3\2\2\2\u0087"+
		"\u0244\3\2\2\2\u0089\u0246\3\2\2\2\u008b\u008d\t\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\2\2\2\u0091\4\3\2\2\2\u0092\u0093\7\61\2"+
		"\2\u0093\u0094\7,\2\2\u0094\u0095\7#\2\2\u0095\u0097\3\2\2\2\u0096\u0098"+
		"\13\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7,\2\2\u009c\u009d"+
		"\7\61\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\3\3\2\u009f\6\3\2\2\2\u00a0"+
		"\u00a1\7\61\2\2\u00a1\u00a2\7,\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13"+
		"\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7,"+
		"\2\2\u00aa\u00ab\7\61\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\4\2\2\u00ad"+
		"\b\3\2\2\2\u00ae\u00af\7/\2\2\u00af\u00b0\7/\2\2\u00b0\u00b3\7\"\2\2\u00b1"+
		"\u00b3\7%\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b7\3\2"+
		"\2\2\u00b4\u00b6\n\3\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bf\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\7\17\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00c0\7\f\2\2\u00be\u00c0\7\2\2\3\u00bf\u00bb\3\2"+
		"\2\2\u00bf\u00be\3\2\2\2\u00c0\u00cc\3\2\2\2\u00c1\u00c2\7/\2\2\u00c2"+
		"\u00c3\7/\2\2\u00c3\u00c9\3\2\2\2\u00c4\u00c6\7\17\2\2\u00c5\u00c4\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\7\f\2\2\u00c8"+
		"\u00ca\7\2\2\3\u00c9\u00c5\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00b2\3\2\2\2\u00cb\u00c1\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\b\5\2\2\u00ce\n\3\2\2\2\u00cf\u00d0\7E\2\2\u00d0\u00d1\7T\2\2\u00d1"+
		"\u00d2\7G\2\2\u00d2\u00d3\7C\2\2\u00d3\u00d4\7V\2\2\u00d4\u00d5\7G\2\2"+
		"\u00d5\f\3\2\2\2\u00d6\u00d7\7V\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7D"+
		"\2\2\u00d9\u00da\7N\2\2\u00da\u00db\7G\2\2\u00db\16\3\2\2\2\u00dc\u00dd"+
		"\7U\2\2\u00dd\u00de\7Q\2\2\u00de\u00df\7W\2\2\u00df\u00e0\7T\2\2\u00e0"+
		"\u00e1\7E\2\2\u00e1\u00e2\7G\2\2\u00e2\20\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4"+
		"\u00e5\7K\2\2\u00e5\u00e6\7P\2\2\u00e6\u00e7\7M\2\2\u00e7\22\3\2\2\2\u00e8"+
		"\u00e9\7Y\2\2\u00e9\u00ea\7K\2\2\u00ea\u00eb\7V\2\2\u00eb\u00ec\7J\2\2"+
		"\u00ec\24\3\2\2\2\u00ed\u00ee\7X\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\7"+
		"G\2\2\u00f0\u00f1\7Y\2\2\u00f1\26\3\2\2\2\u00f2\u00f3\7E\2\2\u00f3\u00f4"+
		"\7Q\2\2\u00f4\u00f5\7O\2\2\u00f5\u00f6\7O\2\2\u00f6\u00f7\7G\2\2\u00f7"+
		"\u00f8\7P\2\2\u00f8\u00f9\7V\2\2\u00f9\30\3\2\2\2\u00fa\u00fb\7V\2\2\u00fb"+
		"\u00fc\7T\2\2\u00fc\u00fd\7W\2\2\u00fd\u00fe\7G\2\2\u00fe\32\3\2\2\2\u00ff"+
		"\u0100\7H\2\2\u0100\u0101\7C\2\2\u0101\u0102\7N\2\2\u0102\u0103\7U\2\2"+
		"\u0103\u0104\7G\2\2\u0104\34\3\2\2\2\u0105\u0106\7C\2\2\u0106\u0107\7"+
		"U\2\2\u0107\36\3\2\2\2\u0108\u0109\7D\2\2\u0109\u010a\7[\2\2\u010a \3"+
		"\2\2\2\u010b\u010c\7R\2\2\u010c\u010d\7T\2\2\u010d\u010e\7Q\2\2\u010e"+
		"\u010f\7E\2\2\u010f\u0110\7V\2\2\u0110\u0111\7K\2\2\u0111\u0112\7O\2\2"+
		"\u0112\u0113\7G\2\2\u0113\"\3\2\2\2\u0114\u0115\7T\2\2\u0115\u0116\7Q"+
		"\2\2\u0116\u0117\7Y\2\2\u0117\u0118\7V\2\2\u0118\u0119\7K\2\2\u0119\u011a"+
		"\7O\2\2\u011a\u011b\7G\2\2\u011b$\3\2\2\2\u011c\u011d\7U\2\2\u011d\u011e"+
		"\7G\2\2\u011e\u011f\7V\2\2\u011f&\3\2\2\2\u0120\u0121\7Y\2\2\u0121\u0122"+
		"\7C\2\2\u0122\u0123\7V\2\2\u0123\u0124\7G\2\2\u0124\u0125\7T\2\2\u0125"+
		"\u0126\7O\2\2\u0126\u0127\7C\2\2\u0127\u0128\7T\2\2\u0128\u0129\7M\2\2"+
		"\u0129(\3\2\2\2\u012a\u012b\7T\2\2\u012b\u012c\7C\2\2\u012c\u012d\7P\2"+
		"\2\u012d\u012e\7I\2\2\u012e\u012f\7G\2\2\u012f*\3\2\2\2\u0130\u0131\7"+
		"F\2\2\u0131\u0132\7G\2\2\u0132\u0133\7N\2\2\u0133\u0134\7C\2\2\u0134\u0135"+
		"\7[\2\2\u0135,\3\2\2\2\u0136\u0137\7K\2\2\u0137\u0138\7P\2\2\u0138\u0139"+
		"\7U\2\2\u0139\u013a\7G\2\2\u013a\u013b\7T\2\2\u013b\u013c\7V\2\2\u013c"+
		".\3\2\2\2\u013d\u013e\7K\2\2\u013e\u013f\7P\2\2\u013f\u0140\7V\2\2\u0140"+
		"\u0141\7Q\2\2\u0141\60\3\2\2\2\u0142\u0143\7H\2\2\u0143\u0144\7W\2\2\u0144"+
		"\u0145\7P\2\2\u0145\u0146\7E\2\2\u0146\u0147\7V\2\2\u0147\u0148\7K\2\2"+
		"\u0148\u0149\7Q\2\2\u0149\u014a\7P\2\2\u014a\62\3\2\2\2\u014b\u014c\7"+
		"W\2\2\u014c\u014d\7U\2\2\u014d\u014e\7K\2\2\u014e\u014f\7P\2\2\u014f\u0150"+
		"\7I\2\2\u0150\64\3\2\2\2\u0151\u0152\7/\2\2\u0152\u0153\7/\2\2\u0153\66"+
		"\3\2\2\2\u0154\u0155\7X\2\2\u0155\u0156\7C\2\2\u0156\u0157\7T\2\2\u0157"+
		"\u0158\7E\2\2\u0158\u0159\7J\2\2\u0159\u015a\7C\2\2\u015a\u015b\7T\2\2"+
		"\u015b8\3\2\2\2\u015c\u015d\7D\2\2\u015d\u015e\7Q\2\2\u015e\u015f\7Q\2"+
		"\2\u015f\u0160\7N\2\2\u0160\u0161\7G\2\2\u0161\u0162\7C\2\2\u0162\u0163"+
		"\7P\2\2\u0163:\3\2\2\2\u0164\u0165\7V\2\2\u0165\u0166\7K\2\2\u0166\u0167"+
		"\7P\2\2\u0167\u0168\7[\2\2\u0168\u0169\7K\2\2\u0169\u016a\7P\2\2\u016a"+
		"\u016b\7V\2\2\u016b<\3\2\2\2\u016c\u016d\7U\2\2\u016d\u016e\7O\2\2\u016e"+
		"\u016f\7C\2\2\u016f\u0170\7N\2\2\u0170\u0171\7N\2\2\u0171\u0172\7K\2\2"+
		"\u0172\u0173\7P\2\2\u0173\u0174\7V\2\2\u0174>\3\2\2\2\u0175\u0176\7K\2"+
		"\2\u0176\u0177\7P\2\2\u0177\u0178\7V\2\2\u0178@\3\2\2\2\u0179\u017a\7"+
		"D\2\2\u017a\u017b\7K\2\2\u017b\u017c\7I\2\2\u017c\u017d\7K\2\2\u017d\u017e"+
		"\7P\2\2\u017e\u017f\7V\2\2\u017fB\3\2\2\2\u0180\u0181\7H\2\2\u0181\u0182"+
		"\7N\2\2\u0182\u0183\7Q\2\2\u0183\u0184\7C\2\2\u0184\u0185\7V\2\2\u0185"+
		"D\3\2\2\2\u0186\u0187\7F\2\2\u0187\u0188\7G\2\2\u0188\u0189\7E\2\2\u0189"+
		"\u018a\7K\2\2\u018a\u018b\7O\2\2\u018b\u018c\7C\2\2\u018c\u018d\7N\2\2"+
		"\u018dF\3\2\2\2\u018e\u018f\7F\2\2\u018f\u0190\7Q\2\2\u0190\u0191\7W\2"+
		"\2\u0191\u0192\7D\2\2\u0192\u0193\7N\2\2\u0193\u0194\7G\2\2\u0194H\3\2"+
		"\2\2\u0195\u0196\7F\2\2\u0196\u0197\7C\2\2\u0197\u0198\7V\2\2\u0198\u0199"+
		"\7G\2\2\u0199J\3\2\2\2\u019a\u019b\7V\2\2\u019b\u019c\7K\2\2\u019c\u019d"+
		"\7O\2\2\u019d\u019e\7G\2\2\u019eL\3\2\2\2\u019f\u01a0\7V\2\2\u01a0\u01a1"+
		"\7K\2\2\u01a1\u01a2\7O\2\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7U\2\2\u01a4"+
		"\u01a5\7V\2\2\u01a5\u01a6\7C\2\2\u01a6\u01a7\7O\2\2\u01a7\u01a8\7R\2\2"+
		"\u01a8N\3\2\2\2\u01a9\u01aa\7,\2\2\u01aaP\3\2\2\2\u01ab\u01ac\7\61\2\2"+
		"\u01acR\3\2\2\2\u01ad\u01ae\7\'\2\2\u01aeT\3\2\2\2\u01af\u01b0\7-\2\2"+
		"\u01b0V\3\2\2\2\u01b1\u01b2\7/\2\2\u01b2X\3\2\2\2\u01b3\u01b4\7?\2\2\u01b4"+
		"Z\3\2\2\2\u01b5\u01b6\7@\2\2\u01b6\\\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8"+
		"^\3\2\2\2\u01b9\u01ba\7#\2\2\u01ba`\3\2\2\2\u01bb\u01bc\7\u0080\2\2\u01bc"+
		"b\3\2\2\2\u01bd\u01be\7~\2\2\u01bed\3\2\2\2\u01bf\u01c0\7(\2\2\u01c0f"+
		"\3\2\2\2\u01c1\u01c2\7`\2\2\u01c2h\3\2\2\2\u01c3\u01c4\7\60\2\2\u01c4"+
		"j\3\2\2\2\u01c5\u01c6\7*\2\2\u01c6l\3\2\2\2\u01c7\u01c8\7+\2\2\u01c8n"+
		"\3\2\2\2\u01c9\u01ca\7.\2\2\u01cap\3\2\2\2\u01cb\u01cc\7=\2\2\u01ccr\3"+
		"\2\2\2\u01cd\u01ce\7\60\2\2\u01ce\u01cf\5\u0081A\2\u01cft\3\2\2\2\u01d0"+
		"\u01d1\5\u0081A\2\u01d1v\3\2\2\2\u01d2\u01d4\7b\2\2\u01d3\u01d5\n\4\2"+
		"\2\u01d4\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7b\2\2\u01d9x\3\2\2\2\u01da\u01dd"+
		"\5\u0083B\2\u01db\u01dd\5\u0085C\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2"+
		"\2\2\u01ddz\3\2\2\2\u01de\u01e0\5\u0087D\2\u01df\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2|\3\2\2\2\u01e3"+
		"\u01e5\5\u0087D\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e4\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\7\60\2\2\u01eb\u01ed\5"+
		"\u0087D\2\u01ec\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ec\3\2\2\2"+
		"\u01ee\u01ef\3\2\2\2\u01ef\u020f\3\2\2\2\u01f0\u01f2\5\u0087D\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7\60\2\2\u01f6\u01f7\5\177@\2\u01f7"+
		"\u020f\3\2\2\2\u01f8\u01fa\5\u0087D\2\u01f9\u01f8\3\2\2\2\u01fa\u01fb"+
		"\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd"+
		"\u01f9\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\7\60"+
		"\2\2\u0200\u0202\5\u0087D\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\5\177"+
		"@\2\u0206\u020f\3\2\2\2\u0207\u0209\5\u0087D\2\u0208\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2"+
		"\2\2\u020c\u020d\5\177@\2\u020d\u020f\3\2\2\2\u020e\u01e8\3\2\2\2\u020e"+
		"\u01f1\3\2\2\2\u020e\u01fd\3\2\2\2\u020e\u0208\3\2\2\2\u020f~\3\2\2\2"+
		"\u0210\u0212\7G\2\2\u0211\u0213\7/\2\2\u0212\u0211\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\5\u0087D\2\u0215\u0214\3\2\2"+
		"\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0080"+
		"\3\2\2\2\u0219\u021b\t\5\2\2\u021a\u0219\3\2\2\2\u021b\u021e\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2"+
		"\2\2\u021f\u0221\t\6\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0227\3\2\2\2\u0224\u0226\t\5"+
		"\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227"+
		"\u0228\3\2\2\2\u0228\u0082\3\2\2\2\u0229\u0227\3\2\2\2\u022a\u0232\7$"+
		"\2\2\u022b\u022c\7^\2\2\u022c\u0231\13\2\2\2\u022d\u022e\7$\2\2\u022e"+
		"\u0231\7$\2\2\u022f\u0231\n\7\2\2\u0230\u022b\3\2\2\2\u0230\u022d\3\2"+
		"\2\2\u0230\u022f\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235\u0236\7$"+
		"\2\2\u0236\u0084\3\2\2\2\u0237\u023f\7)\2\2\u0238\u0239\7^\2\2\u0239\u023e"+
		"\13\2\2\2\u023a\u023b\7)\2\2\u023b\u023e\7)\2\2\u023c\u023e\n\b\2\2\u023d"+
		"\u0238\3\2\2\2\u023d\u023a\3\2\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2"+
		"\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0242\u0243\7)\2\2\u0243\u0086\3\2\2\2\u0244\u0245\t\t"+
		"\2\2\u0245\u0088\3\2\2\2\u0246\u0247\13\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\bE\4\2\u0249\u008a\3\2\2\2\"\2\u008e\u0099\u00a6\u00b2\u00b7\u00bb"+
		"\u00bf\u00c5\u00c9\u00cb\u01d6\u01dc\u01e1\u01e6\u01e8\u01ee\u01f3\u01fb"+
		"\u01fd\u0203\u020a\u020e\u0212\u0217\u021c\u0222\u0227\u0230\u0232\u023d"+
		"\u023f\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}