// Generated from com/dataworker/sql/parser/antlr4/arithmetic/Arithmetic.g4 by ANTLR 4.8
package com.dataworker.sql.parser.antlr4.arithmetic;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArithmeticLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, STRING=5, TRUE=6, FALSE=7, NULL=8, CASE=9, 
		WHEN=10, THEN=11, ELSE=12, END=13, DISTINCT=14, ALL=15, EQ=16, NSEQ=17, 
		NEQ=18, NEQJ=19, LT=20, LTE=21, GT=22, GTE=23, LBRACKET=24, RBRACKET=25, 
		PLUS=26, MINUS=27, ASTERISK=28, SLASH=29, PERCENT=30, DIV=31, TILDE=32, 
		AMPERSAND=33, PIPE=34, CONCAT_PIPE=35, HAT=36, BIGINT_LITERAL=37, SMALLINT_LITERAL=38, 
		TINYINT_LITERAL=39, INTEGER_VALUE=40, IDENTIFIER=41, DOUBLE_LITERAL=42, 
		BIGDECIMAL_LITERAL=43, SIMPLE_COMMENT=44, BRACKETED_EMPTY_COMMENT=45, 
		BRACKETED_COMMENT=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "STRING", "TRUE", "FALSE", "NULL", "CASE", 
			"WHEN", "THEN", "ELSE", "END", "DISTINCT", "ALL", "EQ", "NSEQ", "NEQ", 
			"NEQJ", "LT", "LTE", "GT", "GTE", "LBRACKET", "RBRACKET", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
			"INTEGER_VALUE", "IDENTIFIER", "EXPONENT", "DECIMAL_DIGITS", "DOUBLE_LITERAL", 
			"BIGDECIMAL_LITERAL", "DIGIT", "LETTER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'->'", null, "'TRUE'", "'FALSE'", "'NULL'", 
			"'CASE'", "'WHEN'", "'THEN'", "'ELSE'", "'END'", "'DISTINCT'", "'ALL'", 
			null, "'<=>'", "'<>'", "'!='", "'<'", "'<='", "'>'", "'>='", "'['", "']'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", 
			"'^'", null, null, null, null, null, null, null, null, "'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "STRING", "TRUE", "FALSE", "NULL", "CASE", 
			"WHEN", "THEN", "ELSE", "END", "DISTINCT", "ALL", "EQ", "NSEQ", "NEQ", 
			"NEQJ", "LT", "LTE", "GT", "GTE", "LBRACKET", "RBRACKET", "PLUS", "MINUS", 
			"ASTERISK", "SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", 
			"CONCAT_PIPE", "HAT", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
			"INTEGER_VALUE", "IDENTIFIER", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
			"SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS"
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


	    public boolean bracket_enbled = true;


	public ArithmeticLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arithmetic.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u018f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6w\n\6\f\6"+
		"\16\6z\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3\6"+
		"\5\6\u0087\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00c1\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"$\3%\3%\3&\6&\u00f5\n&\r&\16&\u00f6\3&\3&\3\'\6\'\u00fc\n\'\r\'\16\'\u00fd"+
		"\3\'\3\'\3(\6(\u0103\n(\r(\16(\u0104\3(\3(\3)\6)\u010a\n)\r)\16)\u010b"+
		"\3*\3*\3*\6*\u0111\n*\r*\16*\u0112\3+\3+\5+\u0117\n+\3+\6+\u011a\n+\r"+
		"+\16+\u011b\3,\6,\u011f\n,\r,\16,\u0120\3,\3,\7,\u0125\n,\f,\16,\u0128"+
		"\13,\3,\3,\6,\u012c\n,\r,\16,\u012d\5,\u0130\n,\3-\6-\u0133\n-\r-\16-"+
		"\u0134\3-\5-\u0138\n-\3-\3-\3-\3-\5-\u013e\n-\3-\3-\5-\u0142\n-\3.\6."+
		"\u0145\n.\r.\16.\u0146\3.\5.\u014a\n.\3.\3.\3.\3.\3.\5.\u0151\n.\3.\3"+
		".\3.\5.\u0156\n.\3/\3/\3\60\3\60\3\60\3\60\5\60\u015e\n\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\7\61\u0166\n\61\f\61\16\61\u0169\13\61\3\61\5\61\u016c"+
		"\n\61\3\61\5\61\u016f\n\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\63\3\63\3\63\3\63\3\63\7\63\u017f\n\63\f\63\16\63\u0182\13\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\6\64\u018a\n\64\r\64\16\64\u018b\3\64\3\64\3"+
		"\u0180\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W\2Y,[-]\2_\2a.c/e\60g\61\3\2"+
		"\r\4\2))^^\4\2$$^^\4\2--//\3\2\62;\4\2C\\c|\4\2\2\u0081\ud802\udc01\3"+
		"\2\ud802\udc01\3\2\udc02\ue001\4\2\f\f\17\17\3\2--\5\2\13\f\17\17\"\""+
		"\2\u01ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3i\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to\3\2\2\2\13\u0086\3\2\2\2\r\u0088"+
		"\3\2\2\2\17\u008d\3\2\2\2\21\u0093\3\2\2\2\23\u0098\3\2\2\2\25\u009d\3"+
		"\2\2\2\27\u00a2\3\2\2\2\31\u00a7\3\2\2\2\33\u00ac\3\2\2\2\35\u00b0\3\2"+
		"\2\2\37\u00b9\3\2\2\2!\u00c0\3\2\2\2#\u00c2\3\2\2\2%\u00c6\3\2\2\2\'\u00c9"+
		"\3\2\2\2)\u00cc\3\2\2\2+\u00ce\3\2\2\2-\u00d1\3\2\2\2/\u00d3\3\2\2\2\61"+
		"\u00d6\3\2\2\2\63\u00d8\3\2\2\2\65\u00da\3\2\2\2\67\u00dc\3\2\2\29\u00de"+
		"\3\2\2\2;\u00e0\3\2\2\2=\u00e2\3\2\2\2?\u00e4\3\2\2\2A\u00e8\3\2\2\2C"+
		"\u00ea\3\2\2\2E\u00ec\3\2\2\2G\u00ee\3\2\2\2I\u00f1\3\2\2\2K\u00f4\3\2"+
		"\2\2M\u00fb\3\2\2\2O\u0102\3\2\2\2Q\u0109\3\2\2\2S\u0110\3\2\2\2U\u0114"+
		"\3\2\2\2W\u012f\3\2\2\2Y\u0141\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_"+
		"\u015d\3\2\2\2a\u015f\3\2\2\2c\u0172\3\2\2\2e\u0179\3\2\2\2g\u0189\3\2"+
		"\2\2ij\7*\2\2j\4\3\2\2\2kl\7.\2\2l\6\3\2\2\2mn\7+\2\2n\b\3\2\2\2op\7/"+
		"\2\2pq\7@\2\2q\n\3\2\2\2rx\7)\2\2sw\n\2\2\2tu\7^\2\2uw\13\2\2\2vs\3\2"+
		"\2\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{\u0087"+
		"\7)\2\2|\u0082\7$\2\2}\u0081\n\3\2\2~\177\7^\2\2\177\u0081\13\2\2\2\u0080"+
		"}\3\2\2\2\u0080~\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\7$"+
		"\2\2\u0086r\3\2\2\2\u0086|\3\2\2\2\u0087\f\3\2\2\2\u0088\u0089\7V\2\2"+
		"\u0089\u008a\7T\2\2\u008a\u008b\7W\2\2\u008b\u008c\7G\2\2\u008c\16\3\2"+
		"\2\2\u008d\u008e\7H\2\2\u008e\u008f\7C\2\2\u008f\u0090\7N\2\2\u0090\u0091"+
		"\7U\2\2\u0091\u0092\7G\2\2\u0092\20\3\2\2\2\u0093\u0094\7P\2\2\u0094\u0095"+
		"\7W\2\2\u0095\u0096\7N\2\2\u0096\u0097\7N\2\2\u0097\22\3\2\2\2\u0098\u0099"+
		"\7E\2\2\u0099\u009a\7C\2\2\u009a\u009b\7U\2\2\u009b\u009c\7G\2\2\u009c"+
		"\24\3\2\2\2\u009d\u009e\7Y\2\2\u009e\u009f\7J\2\2\u009f\u00a0\7G\2\2\u00a0"+
		"\u00a1\7P\2\2\u00a1\26\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7J\2\2\u00a4"+
		"\u00a5\7G\2\2\u00a5\u00a6\7P\2\2\u00a6\30\3\2\2\2\u00a7\u00a8\7G\2\2\u00a8"+
		"\u00a9\7N\2\2\u00a9\u00aa\7U\2\2\u00aa\u00ab\7G\2\2\u00ab\32\3\2\2\2\u00ac"+
		"\u00ad\7G\2\2\u00ad\u00ae\7P\2\2\u00ae\u00af\7F\2\2\u00af\34\3\2\2\2\u00b0"+
		"\u00b1\7F\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7V\2\2"+
		"\u00b4\u00b5\7K\2\2\u00b5\u00b6\7P\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8"+
		"\7V\2\2\u00b8\36\3\2\2\2\u00b9\u00ba\7C\2\2\u00ba\u00bb\7N\2\2\u00bb\u00bc"+
		"\7N\2\2\u00bc \3\2\2\2\u00bd\u00c1\7?\2\2\u00be\u00bf\7?\2\2\u00bf\u00c1"+
		"\7?\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\"\3\2\2\2\u00c2"+
		"\u00c3\7>\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7@\2\2\u00c5$\3\2\2\2\u00c6"+
		"\u00c7\7>\2\2\u00c7\u00c8\7@\2\2\u00c8&\3\2\2\2\u00c9\u00ca\7#\2\2\u00ca"+
		"\u00cb\7?\2\2\u00cb(\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd*\3\2\2\2\u00ce\u00cf"+
		"\7>\2\2\u00cf\u00d0\7?\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7@\2\2\u00d2.\3"+
		"\2\2\2\u00d3\u00d4\7@\2\2\u00d4\u00d5\7?\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7]\2\2\u00d7\62\3\2\2\2\u00d8\u00d9\7_\2\2\u00d9\64\3\2\2\2\u00da\u00db"+
		"\7-\2\2\u00db\66\3\2\2\2\u00dc\u00dd\7/\2\2\u00dd8\3\2\2\2\u00de\u00df"+
		"\7,\2\2\u00df:\3\2\2\2\u00e0\u00e1\7\61\2\2\u00e1<\3\2\2\2\u00e2\u00e3"+
		"\7\'\2\2\u00e3>\3\2\2\2\u00e4\u00e5\7F\2\2\u00e5\u00e6\7K\2\2\u00e6\u00e7"+
		"\7X\2\2\u00e7@\3\2\2\2\u00e8\u00e9\7\u0080\2\2\u00e9B\3\2\2\2\u00ea\u00eb"+
		"\7(\2\2\u00ebD\3\2\2\2\u00ec\u00ed\7~\2\2\u00edF\3\2\2\2\u00ee\u00ef\7"+
		"~\2\2\u00ef\u00f0\7~\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7`\2\2\u00f2J\3\2"+
		"\2\2\u00f3\u00f5\5]/\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7N\2\2\u00f9"+
		"L\3\2\2\2\u00fa\u00fc\5]/\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7U"+
		"\2\2\u0100N\3\2\2\2\u0101\u0103\5]/\2\u0102\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\7[\2\2\u0107P\3\2\2\2\u0108\u010a\5]/\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cR\3\2\2\2"+
		"\u010d\u0111\5_\60\2\u010e\u0111\5]/\2\u010f\u0111\7a\2\2\u0110\u010d"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113T\3\2\2\2\u0114\u0116\7G\2\2\u0115"+
		"\u0117\t\4\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2"+
		"\2\2\u0118\u011a\5]/\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011cV\3\2\2\2\u011d\u011f\5]/\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0126\7\60\2\2\u0123\u0125\5]/\2\u0124\u0123\3\2"+
		"\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0130\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012b\7\60\2\2\u012a\u012c\5"+
		"]/\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u011e\3\2\2\2\u012f\u0129\3\2"+
		"\2\2\u0130X\3\2\2\2\u0131\u0133\5]/\2\u0132\u0131\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0138\5U+\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2"+
		"\2\u0139\u013a\7F\2\2\u013a\u0142\3\2\2\2\u013b\u013d\5W,\2\u013c\u013e"+
		"\5U+\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7F\2\2\u0140\u0142\3\2\2\2\u0141\u0132\3\2\2\2\u0141\u013b\3\2"+
		"\2\2\u0142Z\3\2\2\2\u0143\u0145\5]/\2\u0144\u0143\3\2\2\2\u0145\u0146"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0149\3\2\2\2\u0148"+
		"\u014a\5U+\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2"+
		"\2\u014b\u014c\7D\2\2\u014c\u014d\7F\2\2\u014d\u0156\3\2\2\2\u014e\u0150"+
		"\5W,\2\u014f\u0151\5U+\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\7D\2\2\u0153\u0154\7F\2\2\u0154\u0156\3\2\2"+
		"\2\u0155\u0144\3\2\2\2\u0155\u014e\3\2\2\2\u0156\\\3\2\2\2\u0157\u0158"+
		"\t\5\2\2\u0158^\3\2\2\2\u0159\u015e\t\6\2\2\u015a\u015e\n\7\2\2\u015b"+
		"\u015c\t\b\2\2\u015c\u015e\t\t\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015e`\3\2\2\2\u015f\u0160\7/\2\2\u0160\u0161"+
		"\7/\2\2\u0161\u0167\3\2\2\2\u0162\u0163\7^\2\2\u0163\u0166\7\f\2\2\u0164"+
		"\u0166\n\n\2\2\u0165\u0162\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u016a\u016c\7\17\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3"+
		"\2\2\2\u016c\u016e\3\2\2\2\u016d\u016f\7\f\2\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\b\61\2\2\u0171b\3\2\2\2"+
		"\u0172\u0173\7\61\2\2\u0173\u0174\7,\2\2\u0174\u0175\7,\2\2\u0175\u0176"+
		"\7\61\2\2\u0176\u0177\3\2\2\2\u0177\u0178\b\62\2\2\u0178d\3\2\2\2\u0179"+
		"\u017a\7\61\2\2\u017a\u017b\7,\2\2\u017b\u017c\3\2\2\2\u017c\u0180\n\13"+
		"\2\2\u017d\u017f\13\2\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0183\u0184\7,\2\2\u0184\u0185\7\61\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\b\63\2\2\u0187f\3\2\2\2\u0188\u018a\t\f\2\2\u0189\u0188\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018e\b\64\3\2\u018eh\3\2\2\2$\2vx\u0080\u0082\u0086\u00c0"+
		"\u00f6\u00fd\u0104\u010b\u0110\u0112\u0116\u011b\u0120\u0126\u012d\u012f"+
		"\u0134\u0137\u013d\u0141\u0146\u0149\u0150\u0155\u015d\u0165\u0167\u016b"+
		"\u016e\u0180\u018b\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}