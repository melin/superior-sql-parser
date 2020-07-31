// Generated from com/dataworker/sql/parser/antlr4/job/JobTaskLexer.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.job;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JobTaskLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, SET=5, 
		UNSET=6, STAR=7, DIVIDE=8, MODULE=9, PLUS=10, MINUS=11, EQUAL_SYMBOL=12, 
		GREATER_SYMBOL=13, LESS_SYMBOL=14, EXCLAMATION_SYMBOL=15, BIT_NOT_OP=16, 
		BIT_OR_OP=17, BIT_AND_OP=18, BIT_XOR_OP=19, DOT=20, LR_BRACKET=21, RR_BRACKET=22, 
		COMMA=23, SEMI=24, DOT_ID=25, ID=26, REVERSE_QUOTE_ID=27, STRING_LITERAL=28, 
		ERROR_RECONGNIGION=29;
	public static final int
		DCSTREAMCOMMENT=2, ERRORCHANNEL=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "DCSTREAMCOMMENT", "ERRORCHANNEL"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", "SET", 
		"UNSET", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
		"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", 
		"BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
		"SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "ID_LITERAL", 
		"DQUOTA_STRING", "SQUOTA_STRING", "ERROR_RECONGNIGION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'SET'", "'UNSET'", "'*'", "'/'", "'%'", 
		"'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", "'^'", 
		"'.'", "'('", "')'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
		"SET", "UNSET", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", 
		"GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", 
		"BIT_AND_OP", "BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
		"SEMI", "DOT_ID", "ID", "REVERSE_QUOTE_ID", "STRING_LITERAL", "ERROR_RECONGNIGION"
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


	public JobTaskLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JobTaskLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\6\2E\n\2\r\2\16\2F\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3P\n\3\r"+
		"\3\16\3Q\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5k\n\5\3\5\7\5n\n\5\f\5\16\5q\13"+
		"\5\3\5\5\5t\n\5\3\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\5\5~\n\5\3\5\3\5\5\5"+
		"\u0082\n\5\5\5\u0084\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\6"+
		"\34\u00bd\n\34\r\34\16\34\u00be\3\34\3\34\3\35\3\35\5\35\u00c5\n\35\3"+
		"\36\7\36\u00c8\n\36\f\36\16\36\u00cb\13\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\7\37\u00d3\n\37\f\37\16\37\u00d6\13\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \7 \u00e0\n \f \16 \u00e3\13 \3 \3 \3!\3!\3!\3!\4Q^\2\"\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2?\2A\37\3\2"+
		"\b\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2bb\7\2&&./\62<C\\aa\4\2$$^^\4\2"+
		"))^^\2\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2A\3\2\2\2\3D\3\2\2\2\5J\3\2\2\2\7X\3\2\2\2\t\u0083\3\2\2\2\13"+
		"\u0087\3\2\2\2\r\u008b\3\2\2\2\17\u0091\3\2\2\2\21\u0093\3\2\2\2\23\u0095"+
		"\3\2\2\2\25\u0097\3\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3"+
		"\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2"+
		"%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3\2\2\2-\u00af\3"+
		"\2\2\2/\u00b1\3\2\2\2\61\u00b3\3\2\2\2\63\u00b5\3\2\2\2\65\u00b8\3\2\2"+
		"\2\67\u00ba\3\2\2\29\u00c4\3\2\2\2;\u00c9\3\2\2\2=\u00cc\3\2\2\2?\u00d9"+
		"\3\2\2\2A\u00e6\3\2\2\2CE\t\2\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GH\3\2\2\2HI\b\2\2\2I\4\3\2\2\2JK\7\61\2\2KL\7,\2\2LM\7#\2\2MO\3\2"+
		"\2\2NP\13\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\3\2\2\2QO\3\2\2\2RS\3\2\2\2ST\7"+
		",\2\2TU\7\61\2\2UV\3\2\2\2VW\b\3\3\2W\6\3\2\2\2XY\7\61\2\2YZ\7,\2\2Z^"+
		"\3\2\2\2[]\13\2\2\2\\[\3\2\2\2]`\3\2\2\2^_\3\2\2\2^\\\3\2\2\2_a\3\2\2"+
		"\2`^\3\2\2\2ab\7,\2\2bc\7\61\2\2cd\3\2\2\2de\b\4\2\2e\b\3\2\2\2fg\7/\2"+
		"\2gh\7/\2\2hk\7\"\2\2ik\7%\2\2jf\3\2\2\2ji\3\2\2\2ko\3\2\2\2ln\n\3\2\2"+
		"ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pw\3\2\2\2qo\3\2\2\2rt\7\17\2"+
		"\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2ux\7\f\2\2vx\7\2\2\3ws\3\2\2\2wv\3\2\2"+
		"\2x\u0084\3\2\2\2yz\7/\2\2z{\7/\2\2{\u0081\3\2\2\2|~\7\17\2\2}|\3\2\2"+
		"\2}~\3\2\2\2~\177\3\2\2\2\177\u0082\7\f\2\2\u0080\u0082\7\2\2\3\u0081"+
		"}\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083j\3\2\2\2\u0083"+
		"y\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\5\2\2\u0086\n\3\2\2\2\u0087"+
		"\u0088\7U\2\2\u0088\u0089\7G\2\2\u0089\u008a\7V\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7W\2\2\u008c\u008d\7P\2\2\u008d\u008e\7U\2\2\u008e\u008f\7G\2\2"+
		"\u008f\u0090\7V\2\2\u0090\16\3\2\2\2\u0091\u0092\7,\2\2\u0092\20\3\2\2"+
		"\2\u0093\u0094\7\61\2\2\u0094\22\3\2\2\2\u0095\u0096\7\'\2\2\u0096\24"+
		"\3\2\2\2\u0097\u0098\7-\2\2\u0098\26\3\2\2\2\u0099\u009a\7/\2\2\u009a"+
		"\30\3\2\2\2\u009b\u009c\7?\2\2\u009c\32\3\2\2\2\u009d\u009e\7@\2\2\u009e"+
		"\34\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7#\2\2\u00a2"+
		" \3\2\2\2\u00a3\u00a4\7\u0080\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6"+
		"$\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7`\2\2\u00aa("+
		"\3\2\2\2\u00ab\u00ac\7\60\2\2\u00ac*\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae"+
		",\3\2\2\2\u00af\u00b0\7+\2\2\u00b0.\3\2\2\2\u00b1\u00b2\7.\2\2\u00b2\60"+
		"\3\2\2\2\u00b3\u00b4\7=\2\2\u00b4\62\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6"+
		"\u00b7\5;\36\2\u00b7\64\3\2\2\2\u00b8\u00b9\5;\36\2\u00b9\66\3\2\2\2\u00ba"+
		"\u00bc\7b\2\2\u00bb\u00bd\n\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\7b\2\2\u00c18\3\2\2\2\u00c2\u00c5\5=\37\2\u00c3\u00c5\5? \2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5:\3\2\2\2\u00c6\u00c8\t\5\2\2"+
		"\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca<\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d4\7$\2\2\u00cd\u00ce"+
		"\7^\2\2\u00ce\u00d3\13\2\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d3\7$\2\2\u00d1"+
		"\u00d3\n\6\2\2\u00d2\u00cd\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d2\u00d1\3\2"+
		"\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7$\2\2\u00d8>\3\2\2\2\u00d9"+
		"\u00e1\7)\2\2\u00da\u00db\7^\2\2\u00db\u00e0\13\2\2\2\u00dc\u00dd\7)\2"+
		"\2\u00dd\u00e0\7)\2\2\u00de\u00e0\n\7\2\2\u00df\u00da\3\2\2\2\u00df\u00dc"+
		"\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7)"+
		"\2\2\u00e5@\3\2\2\2\u00e6\u00e7\13\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\b!\4\2\u00e9B\3\2\2\2\24\2FQ^josw}\u0081\u0083\u00be\u00c4\u00c9\u00d2"+
		"\u00d4\u00df\u00e1\5\2\3\2\2\4\2\2\5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}