// Generated from com/dataworker/sql/parser/antlr4/spark/SparkStreamSqlParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkStreamSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, SPEC_MYSQL_COMMENT=2, COMMENT_INPUT=3, LINE_COMMENT=4, CREATE=5, 
		TABLE=6, STREAM=7, WITH=8, COMMENT=9, TRUE=10, FALSE=11, AS=12, BY=13, 
		SET=14, DELAY=15, INSERT=16, INTO=17, USING=18, PATTERN=19, MINUSMINUS=20, 
		STRING=21, BOOLEAN=22, INT=23, BIGINT=24, FLOAT=25, DOUBLE=26, DATE=27, 
		TIMESTAMP=28, STAR=29, DIVIDE=30, MODULE=31, PLUS=32, MINUS=33, EQUAL_SYMBOL=34, 
		GREATER_SYMBOL=35, LESS_SYMBOL=36, EXCLAMATION_SYMBOL=37, BIT_NOT_OP=38, 
		BIT_OR_OP=39, BIT_AND_OP=40, BIT_XOR_OP=41, DOT=42, LR_BRACKET=43, RR_BRACKET=44, 
		COMMA=45, SEMI=46, ID=47, REVERSE_QUOTE_ID=48, STRING_LITERAL=49, DECIMAL_LITERAL=50, 
		REAL_LITERAL=51, ERROR_RECONGNIGION=52;
	public static final int
		RULE_root = 0, RULE_sqlStatements = 1, RULE_sqlStatement = 2, RULE_createStreamTable = 3, 
		RULE_insertStatement = 4, RULE_setStatement = 5, RULE_emptyStatement = 6, 
		RULE_setKeyExpr = 7, RULE_valueKeyExpr = 8, RULE_selectExpr = 9, RULE_word = 10, 
		RULE_colTypeList = 11, RULE_colType = 12, RULE_dataType = 13, RULE_tablePropertyList = 14, 
		RULE_tableProperty = 15, RULE_tablePropertyKey = 16, RULE_tablePropertyValue = 17, 
		RULE_booleanValue = 18, RULE_tableIdentifier = 19, RULE_identifier = 20;
	public static final String[] ruleNames = {
		"root", "sqlStatements", "sqlStatement", "createStreamTable", "insertStatement", 
		"setStatement", "emptyStatement", "setKeyExpr", "valueKeyExpr", "selectExpr", 
		"word", "colTypeList", "colType", "dataType", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "booleanValue", "tableIdentifier", 
		"identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'CREATE'", "'TABLE'", "'STREAM'", "'WITH'", 
		"'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", "'BY'", "'SET'", "'DELAY'", 
		"'INSERT'", "'INTO'", "'USING'", "'PATTERN'", "'--'", "'STRING'", "'BOOLEAN'", 
		"'INT'", "'BIGINT'", "'FLOAT'", "'DOUBLE'", "'DATE'", "'TIMESTAMP'", "'*'", 
		"'/'", "'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", 
		"'&'", "'^'", "'.'", "'('", "')'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "SPEC_MYSQL_COMMENT", "COMMENT_INPUT", "LINE_COMMENT", 
		"CREATE", "TABLE", "STREAM", "WITH", "COMMENT", "TRUE", "FALSE", "AS", 
		"BY", "SET", "DELAY", "INSERT", "INTO", "USING", "PATTERN", "MINUSMINUS", 
		"STRING", "BOOLEAN", "INT", "BIGINT", "FLOAT", "DOUBLE", "DATE", "TIMESTAMP", 
		"STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", "EQUAL_SYMBOL", "GREATER_SYMBOL", 
		"LESS_SYMBOL", "EXCLAMATION_SYMBOL", "BIT_NOT_OP", "BIT_OR_OP", "BIT_AND_OP", 
		"BIT_XOR_OP", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "ID", 
		"REVERSE_QUOTE_ID", "STRING_LITERAL", "DECIMAL_LITERAL", "REAL_LITERAL", 
		"ERROR_RECONGNIGION"
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

	@Override
	public String getGrammarFileName() { return "SparkStreamSqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SparkStreamSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SparkStreamSqlParser.EOF, 0); }
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(SparkStreamSqlParser.MINUSMINUS, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << SET) | (1L << INSERT) | (1L << SEMI))) != 0)) {
				{
				setState(42);
				sqlStatements();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(45);
				match(MINUSMINUS);
				}
			}

			setState(48);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatementsContext extends ParserRuleContext {
		public List<SqlStatementContext> sqlStatement() {
			return getRuleContexts(SqlStatementContext.class);
		}
		public SqlStatementContext sqlStatement(int i) {
			return getRuleContext(SqlStatementContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(SparkStreamSqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(SparkStreamSqlParser.SEMI, i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(SparkStreamSqlParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(SparkStreamSqlParser.MINUSMINUS, i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitSqlStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sqlStatements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(57);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CREATE:
					case SET:
					case INSERT:
						{
						setState(50);
						sqlStatement();
						setState(52);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUSMINUS) {
							{
							setState(51);
							match(MINUSMINUS);
							}
						}

						setState(54);
						match(SEMI);
						}
						break;
					case SEMI:
						{
						setState(56);
						emptyStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case SET:
			case INSERT:
				{
				setState(62);
				sqlStatement();
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(63);
						match(MINUSMINUS);
						}
					}

					setState(66);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(69);
				emptyStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatementContext extends ParserRuleContext {
		public CreateStreamTableContext createStreamTable() {
			return getRuleContext(CreateStreamTableContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SetStatementContext setStatement() {
			return getRuleContext(SetStatementContext.class,0);
		}
		public SqlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				createStreamTable();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				insertStatement();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				setStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateStreamTableContext extends ParserRuleContext {
		public TableIdentifierContext tableName;
		public ColTypeListContext columns;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SparkStreamSqlParser.CREATE, 0); }
		public TerminalNode STREAM() { return getToken(SparkStreamSqlParser.STREAM, 0); }
		public TerminalNode TABLE() { return getToken(SparkStreamSqlParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SparkStreamSqlParser.WITH, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateStreamTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createStreamTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterCreateStreamTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitCreateStreamTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitCreateStreamTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateStreamTableContext createStreamTable() throws RecognitionException {
		CreateStreamTableContext _localctx = new CreateStreamTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createStreamTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CREATE);
			setState(78);
			match(STREAM);
			setState(79);
			match(TABLE);
			setState(80);
			((CreateStreamTableContext)_localctx).tableName = tableIdentifier();
			setState(81);
			match(LR_BRACKET);
			setState(82);
			((CreateStreamTableContext)_localctx).columns = colTypeList();
			setState(83);
			match(RR_BRACKET);
			setState(84);
			match(WITH);
			setState(85);
			((CreateStreamTableContext)_localctx).tableProps = tablePropertyList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStatementContext extends ParserRuleContext {
		public TableIdentifierContext tableName;
		public SelectExprContext select;
		public TerminalNode INSERT() { return getToken(SparkStreamSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkStreamSqlParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(INSERT);
			setState(88);
			match(INTO);
			setState(89);
			((InsertStatementContext)_localctx).tableName = tableIdentifier();
			setState(90);
			((InsertStatementContext)_localctx).select = selectExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetStatementContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SparkStreamSqlParser.SET, 0); }
		public SetKeyExprContext setKeyExpr() {
			return getRuleContext(SetKeyExprContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(SparkStreamSqlParser.EQUAL_SYMBOL, 0); }
		public ValueKeyExprContext valueKeyExpr() {
			return getRuleContext(ValueKeyExprContext.class,0);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(SET);
			setState(93);
			setKeyExpr();
			setState(94);
			match(EQUAL_SYMBOL);
			setState(95);
			valueKeyExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SparkStreamSqlParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetKeyExprContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SparkStreamSqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SparkStreamSqlParser.ID, i);
		}
		public SetKeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setKeyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterSetKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitSetKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitSetKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetKeyExprContext setKeyExpr() throws RecognitionException {
		SetKeyExprContext _localctx = new SetKeyExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setKeyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(100);
				match(DOT);
				setState(101);
				match(ID);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueKeyExprContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public ValueKeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueKeyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterValueKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitValueKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitValueKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueKeyExprContext valueKeyExpr() throws RecognitionException {
		ValueKeyExprContext _localctx = new ValueKeyExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_valueKeyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			word();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << TRUE) | (1L << FALSE) | (1L << AS) | (1L << BY) | (1L << SET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << DOT) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << ID) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << REAL_LITERAL))) != 0)) {
				{
				{
				setState(108);
				word();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			word();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << TRUE) | (1L << FALSE) | (1L << AS) | (1L << BY) | (1L << SET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << DOT) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << ID) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << REAL_LITERAL))) != 0)) {
				{
				{
				setState(115);
				word();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SparkStreamSqlParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SparkStreamSqlParser.STRING_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(SparkStreamSqlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(SparkStreamSqlParser.REAL_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkStreamSqlParser.AS, 0); }
		public TerminalNode BY() { return getToken(SparkStreamSqlParser.BY, 0); }
		public TerminalNode SET() { return getToken(SparkStreamSqlParser.SET, 0); }
		public TerminalNode STAR() { return getToken(SparkStreamSqlParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(SparkStreamSqlParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(SparkStreamSqlParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(SparkStreamSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkStreamSqlParser.MINUS, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(SparkStreamSqlParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(SparkStreamSqlParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(SparkStreamSqlParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(SparkStreamSqlParser.EXCLAMATION_SYMBOL, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(SparkStreamSqlParser.BIT_NOT_OP, 0); }
		public TerminalNode BIT_OR_OP() { return getToken(SparkStreamSqlParser.BIT_OR_OP, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(SparkStreamSqlParser.BIT_AND_OP, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(SparkStreamSqlParser.BIT_XOR_OP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SparkStreamSqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SparkStreamSqlParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(SparkStreamSqlParser.COMMA, 0); }
		public TerminalNode TABLE() { return getToken(SparkStreamSqlParser.TABLE, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_word);
		try {
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(122);
				match(DOT);
				setState(123);
				match(ID);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(STRING_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(DECIMAL_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(REAL_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				booleanValue();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(AS);
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				match(BY);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				match(SET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				match(STAR);
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				match(DIVIDE);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				match(MODULE);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(135);
				match(MINUS);
				}
				break;
			case EQUAL_SYMBOL:
				enterOuterAlt(_localctx, 15);
				{
				setState(136);
				match(EQUAL_SYMBOL);
				}
				break;
			case GREATER_SYMBOL:
				enterOuterAlt(_localctx, 16);
				{
				setState(137);
				match(GREATER_SYMBOL);
				}
				break;
			case LESS_SYMBOL:
				enterOuterAlt(_localctx, 17);
				{
				setState(138);
				match(LESS_SYMBOL);
				}
				break;
			case EXCLAMATION_SYMBOL:
				enterOuterAlt(_localctx, 18);
				{
				setState(139);
				match(EXCLAMATION_SYMBOL);
				}
				break;
			case BIT_NOT_OP:
				enterOuterAlt(_localctx, 19);
				{
				setState(140);
				match(BIT_NOT_OP);
				}
				break;
			case BIT_OR_OP:
				enterOuterAlt(_localctx, 20);
				{
				setState(141);
				match(BIT_OR_OP);
				}
				break;
			case BIT_AND_OP:
				enterOuterAlt(_localctx, 21);
				{
				setState(142);
				match(BIT_AND_OP);
				}
				break;
			case BIT_XOR_OP:
				enterOuterAlt(_localctx, 22);
				{
				setState(143);
				match(BIT_XOR_OP);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 23);
				{
				setState(144);
				match(LR_BRACKET);
				}
				break;
			case RR_BRACKET:
				enterOuterAlt(_localctx, 24);
				{
				setState(145);
				match(RR_BRACKET);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 25);
				{
				setState(146);
				match(COMMA);
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(147);
				match(TABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			colType();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(151);
				match(COMMA);
				setState(152);
				colType();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public Token jsonPath;
		public Token pattern;
		public Token comment;
		public TerminalNode ID() { return getToken(SparkStreamSqlParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode PATTERN() { return getToken(SparkStreamSqlParser.PATTERN, 0); }
		public TerminalNode COMMENT() { return getToken(SparkStreamSqlParser.COMMENT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SparkStreamSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SparkStreamSqlParser.STRING_LITERAL, i);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ID);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(159);
				((ColTypeContext)_localctx).jsonPath = match(STRING_LITERAL);
				}
			}

			setState(162);
			dataType();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATTERN) {
				{
				setState(163);
				match(PATTERN);
				setState(164);
				((ColTypeContext)_localctx).pattern = match(STRING_LITERAL);
				}
			}

			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(167);
				match(COMMENT);
				setState(168);
				((ColTypeContext)_localctx).comment = match(STRING_LITERAL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkStreamSqlParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SparkStreamSqlParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(SparkStreamSqlParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(SparkStreamSqlParser.BIGINT, 0); }
		public TerminalNode FLOAT() { return getToken(SparkStreamSqlParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SparkStreamSqlParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(SparkStreamSqlParser.DATE, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SparkStreamSqlParser.TIMESTAMP, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOLEAN) | (1L << INT) | (1L << BIGINT) | (1L << FLOAT) | (1L << DOUBLE) | (1L << DATE) | (1L << TIMESTAMP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyListContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LR_BRACKET);
			setState(174);
			tableProperty();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(175);
				match(COMMA);
				setState(176);
				tableProperty();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public TablePropertyKeyContext key;
		public TablePropertyValueContext value;
		public TerminalNode EQUAL_SYMBOL() { return getToken(SparkStreamSqlParser.EQUAL_SYMBOL, 0); }
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(185);
			match(EQUAL_SYMBOL);
			setState(186);
			((TablePropertyContext)_localctx).value = tablePropertyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SparkStreamSqlParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SparkStreamSqlParser.ID, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SparkStreamSqlParser.STRING_LITERAL, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tablePropertyKey);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ID);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(189);
					match(DOT);
					setState(190);
					match(ID);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyValueContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SparkStreamSqlParser.DECIMAL_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SparkStreamSqlParser.STRING_LITERAL, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tablePropertyValue);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(DECIMAL_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				booleanValue();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SparkStreamSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkStreamSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext table;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(206);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(207);
				match(DOT);
				}
				break;
			}
			setState(211);
			((TableIdentifierContext)_localctx).table = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SparkStreamSqlParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkStreamSqlParserListener ) ((SparkStreamSqlParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkStreamSqlParserVisitor ) return ((SparkStreamSqlParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\5\2\61\n\2\3"+
		"\2\3\2\3\3\3\3\5\3\67\n\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3"+
		"\5\3C\n\3\3\3\5\3F\n\3\3\3\5\3I\n\3\3\4\3\4\3\4\5\4N\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\n\3\n\7\np\n\n\f\n\16\ns\13"+
		"\n\3\13\3\13\7\13w\n\13\f\13\16\13z\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0097\n\f\3\r\3\r\3\r\7\r\u009c\n\r\f\r\16\r\u009f\13\r"+
		"\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\16\3\16\5"+
		"\16\u00ac\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00b4\n\20\f\20\16\20"+
		"\u00b7\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00c2\n"+
		"\22\f\22\16\22\u00c5\13\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23\5\23\u00cd"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u00d4\n\25\3\25\3\25\3\26\3\26\3\26"+
		"\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\4\3\2\27\36\3"+
		"\2\f\r\2\u00f4\2-\3\2\2\2\4=\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nY\3\2\2\2"+
		"\f^\3\2\2\2\16c\3\2\2\2\20e\3\2\2\2\22m\3\2\2\2\24t\3\2\2\2\26\u0096\3"+
		"\2\2\2\30\u0098\3\2\2\2\32\u00a0\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3\2"+
		"\2\2 \u00ba\3\2\2\2\"\u00c7\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3\2\2\2(\u00d3"+
		"\3\2\2\2*\u00d7\3\2\2\2,.\5\4\3\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61"+
		"\7\26\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\2\2\3\63\3\3"+
		"\2\2\2\64\66\5\6\4\2\65\67\7\26\2\2\66\65\3\2\2\2\66\67\3\2\2\2\678\3"+
		"\2\2\289\7\60\2\29<\3\2\2\2:<\5\16\b\2;\64\3\2\2\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>H\3\2\2\2?=\3\2\2\2@E\5\6\4\2AC\7\26\2\2BA\3\2\2"+
		"\2BC\3\2\2\2CD\3\2\2\2DF\7\60\2\2EB\3\2\2\2EF\3\2\2\2FI\3\2\2\2GI\5\16"+
		"\b\2H@\3\2\2\2HG\3\2\2\2I\5\3\2\2\2JN\5\b\5\2KN\5\n\6\2LN\5\f\7\2MJ\3"+
		"\2\2\2MK\3\2\2\2ML\3\2\2\2N\7\3\2\2\2OP\7\7\2\2PQ\7\t\2\2QR\7\b\2\2RS"+
		"\5(\25\2ST\7-\2\2TU\5\30\r\2UV\7.\2\2VW\7\n\2\2WX\5\36\20\2X\t\3\2\2\2"+
		"YZ\7\22\2\2Z[\7\23\2\2[\\\5(\25\2\\]\5\24\13\2]\13\3\2\2\2^_\7\20\2\2"+
		"_`\5\20\t\2`a\7$\2\2ab\5\22\n\2b\r\3\2\2\2cd\7\60\2\2d\17\3\2\2\2ej\7"+
		"\61\2\2fg\7,\2\2gi\7\61\2\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\21"+
		"\3\2\2\2lj\3\2\2\2mq\5\26\f\2np\5\26\f\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r\23\3\2\2\2sq\3\2\2\2tx\5\26\f\2uw\5\26\f\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y\25\3\2\2\2zx\3\2\2\2{\u0097\7\61\2\2|}\7,\2"+
		"\2}\u0097\7\61\2\2~\u0097\7\63\2\2\177\u0097\7\64\2\2\u0080\u0097\7\65"+
		"\2\2\u0081\u0097\5&\24\2\u0082\u0097\7\16\2\2\u0083\u0097\7\17\2\2\u0084"+
		"\u0097\7\20\2\2\u0085\u0097\7\37\2\2\u0086\u0097\7 \2\2\u0087\u0097\7"+
		"!\2\2\u0088\u0097\7\"\2\2\u0089\u0097\7#\2\2\u008a\u0097\7$\2\2\u008b"+
		"\u0097\7%\2\2\u008c\u0097\7&\2\2\u008d\u0097\7\'\2\2\u008e\u0097\7(\2"+
		"\2\u008f\u0097\7)\2\2\u0090\u0097\7*\2\2\u0091\u0097\7+\2\2\u0092\u0097"+
		"\7-\2\2\u0093\u0097\7.\2\2\u0094\u0097\7/\2\2\u0095\u0097\7\b\2\2\u0096"+
		"{\3\2\2\2\u0096|\3\2\2\2\u0096~\3\2\2\2\u0096\177\3\2\2\2\u0096\u0080"+
		"\3\2\2\2\u0096\u0081\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0083\3\2\2\2\u0096"+
		"\u0084\3\2\2\2\u0096\u0085\3\2\2\2\u0096\u0086\3\2\2\2\u0096\u0087\3\2"+
		"\2\2\u0096\u0088\3\2\2\2\u0096\u0089\3\2\2\2\u0096\u008a\3\2\2\2\u0096"+
		"\u008b\3\2\2\2\u0096\u008c\3\2\2\2\u0096\u008d\3\2\2\2\u0096\u008e\3\2"+
		"\2\2\u0096\u008f\3\2\2\2\u0096\u0090\3\2\2\2\u0096\u0091\3\2\2\2\u0096"+
		"\u0092\3\2\2\2\u0096\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2"+
		"\2\2\u0097\27\3\2\2\2\u0098\u009d\5\32\16\2\u0099\u009a\7/\2\2\u009a\u009c"+
		"\5\32\16\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\31\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2"+
		"\7\61\2\2\u00a1\u00a3\7\63\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a7\5\34\17\2\u00a5\u00a6\7\25\2\2\u00a6"+
		"\u00a8\7\63\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ab\3"+
		"\2\2\2\u00a9\u00aa\7\13\2\2\u00aa\u00ac\7\63\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\33\3\2\2\2\u00ad\u00ae\t\2\2\2\u00ae\35\3\2\2\2\u00af"+
		"\u00b0\7-\2\2\u00b0\u00b5\5 \21\2\u00b1\u00b2\7/\2\2\u00b2\u00b4\5 \21"+
		"\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6"+
		"\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7.\2\2\u00b9"+
		"\37\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7$\2\2\u00bc\u00bd\5$\23"+
		"\2\u00bd!\3\2\2\2\u00be\u00c3\7\61\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c2"+
		"\7\61\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c8\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8"+
		"\7\63\2\2\u00c7\u00be\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8#\3\2\2\2\u00c9"+
		"\u00cd\7\64\2\2\u00ca\u00cd\5&\24\2\u00cb\u00cd\7\63\2\2\u00cc\u00c9\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf"+
		"\t\3\2\2\u00cf\'\3\2\2\2\u00d0\u00d1\5*\26\2\u00d1\u00d2\7,\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\5*\26\2\u00d6)\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8+\3"+
		"\2\2\2\30-\60\66;=BEHMjqx\u0096\u009d\u00a2\u00a7\u00ab\u00b5\u00c3\u00c7"+
		"\u00cc\u00d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}