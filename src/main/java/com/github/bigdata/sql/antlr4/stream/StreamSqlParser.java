// Generated from com/github/bigdata/sql/antlr4/stream/StreamSqlParser.g4 by ANTLR 4.7
package com.github.bigdata.sql.antlr4.stream;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StreamSqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		RULE_root = 0, RULE_sqlStatements = 1, RULE_sqlStatement = 2, RULE_createSoureTable = 3, 
		RULE_createSinkTable = 4, RULE_createSideTable = 5, RULE_createView = 6, 
		RULE_createFunction = 7, RULE_insertStatement = 8, RULE_setStatement = 9, 
		RULE_emptyStatement = 10, RULE_setKeyExpr = 11, RULE_valueKeyExpr = 12, 
		RULE_selectExpr = 13, RULE_word = 14, RULE_colTypeList = 15, RULE_colType = 16, 
		RULE_dataType = 17, RULE_tableNameList = 18, RULE_tablePropertyList = 19, 
		RULE_tableProperty = 20, RULE_tablePropertyKey = 21, RULE_tablePropertyValue = 22, 
		RULE_booleanValue = 23, RULE_timeModeExpr = 24, RULE_attrNameExpr = 25, 
		RULE_tableName = 26, RULE_functionName = 27;
	public static final String[] ruleNames = {
		"root", "sqlStatements", "sqlStatement", "createSoureTable", "createSinkTable", 
		"createSideTable", "createView", "createFunction", "insertStatement", 
		"setStatement", "emptyStatement", "setKeyExpr", "valueKeyExpr", "selectExpr", 
		"word", "colTypeList", "colType", "dataType", "tableNameList", "tablePropertyList", 
		"tableProperty", "tablePropertyKey", "tablePropertyValue", "booleanValue", 
		"timeModeExpr", "attrNameExpr", "tableName", "functionName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'CREATE'", "'TABLE'", "'SOURCE'", "'SINK'", 
		"'SIDE'", "'WITH'", "'VIEW'", "'COMMENT'", "'TRUE'", "'FALSE'", "'AS'", 
		"'BY'", "'PROCTIME'", "'ROWTIME'", "'SET'", "'WATERMARK'", "'RANGE'", 
		"'DELAY'", "'INSERT'", "'INTO'", "'FUNCTION'", "'USING'", "'--'", "'VARCHAR'", 
		"'BOOLEAN'", "'TINYINT'", "'SMALLINT'", "'INT'", "'BIGINT'", "'FLOAT'", 
		"'DECIMAL'", "'DOUBLE'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'*'", "'/'", 
		"'%'", "'+'", "'-'", "'='", "'>'", "'<'", "'!'", "'~'", "'|'", "'&'", 
		"'^'", "'.'", "'('", "')'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public String getGrammarFileName() { return "StreamSqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StreamSqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StreamSqlParser.EOF, 0); }
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode MINUSMINUS() { return getToken(StreamSqlParser.MINUSMINUS, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitRoot(this);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << SET) | (1L << INSERT) | (1L << SEMI))) != 0)) {
				{
				setState(56);
				sqlStatements();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUSMINUS) {
				{
				setState(59);
				match(MINUSMINUS);
				}
			}

			setState(62);
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
		public List<TerminalNode> SEMI() { return getTokens(StreamSqlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(StreamSqlParser.SEMI, i);
		}
		public List<TerminalNode> MINUSMINUS() { return getTokens(StreamSqlParser.MINUSMINUS); }
		public TerminalNode MINUSMINUS(int i) {
			return getToken(StreamSqlParser.MINUSMINUS, i);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitSqlStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitSqlStatements(this);
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
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(71);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CREATE:
					case SET:
					case INSERT:
						{
						setState(64);
						sqlStatement();
						setState(66);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==MINUSMINUS) {
							{
							setState(65);
							match(MINUSMINUS);
							}
						}

						setState(68);
						match(SEMI);
						}
						break;
					case SEMI:
						{
						setState(70);
						emptyStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
			case SET:
			case INSERT:
				{
				setState(76);
				sqlStatement();
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==MINUSMINUS) {
						{
						setState(77);
						match(MINUSMINUS);
						}
					}

					setState(80);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case SEMI:
				{
				setState(83);
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
		public CreateSoureTableContext createSoureTable() {
			return getRuleContext(CreateSoureTableContext.class,0);
		}
		public CreateSinkTableContext createSinkTable() {
			return getRuleContext(CreateSinkTableContext.class,0);
		}
		public CreateViewContext createView() {
			return getRuleContext(CreateViewContext.class,0);
		}
		public CreateFunctionContext createFunction() {
			return getRuleContext(CreateFunctionContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public CreateSideTableContext createSideTable() {
			return getRuleContext(CreateSideTableContext.class,0);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterSqlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitSqlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitSqlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlStatementContext sqlStatement() throws RecognitionException {
		SqlStatementContext _localctx = new SqlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sqlStatement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				createSoureTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				createSinkTable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				createView();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				createFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				insertStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				createSideTable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				setStatement();
				}
				break;
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

	public static class CreateSoureTableContext extends ParserRuleContext {
		public ColTypeListContext columns;
		public TablePropertyListContext tableProps;
		public TimeModeExprContext timeMode;
		public TerminalNode CREATE() { return getToken(StreamSqlParser.CREATE, 0); }
		public TerminalNode SOURCE() { return getToken(StreamSqlParser.SOURCE, 0); }
		public TerminalNode TABLE() { return getToken(StreamSqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(StreamSqlParser.WITH, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TimeModeExprContext timeModeExpr() {
			return getRuleContext(TimeModeExprContext.class,0);
		}
		public CreateSoureTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSoureTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterCreateSoureTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitCreateSoureTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitCreateSoureTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSoureTableContext createSoureTable() throws RecognitionException {
		CreateSoureTableContext _localctx = new CreateSoureTableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createSoureTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CREATE);
			setState(96);
			match(SOURCE);
			setState(97);
			match(TABLE);
			setState(98);
			tableName();
			setState(99);
			match(LR_BRACKET);
			setState(100);
			((CreateSoureTableContext)_localctx).columns = colTypeList();
			setState(101);
			match(RR_BRACKET);
			setState(102);
			match(WITH);
			setState(103);
			((CreateSoureTableContext)_localctx).tableProps = tablePropertyList();
			setState(104);
			((CreateSoureTableContext)_localctx).timeMode = timeModeExpr();
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

	public static class CreateSinkTableContext extends ParserRuleContext {
		public ColTypeListContext columns;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(StreamSqlParser.CREATE, 0); }
		public TerminalNode SINK() { return getToken(StreamSqlParser.SINK, 0); }
		public TerminalNode TABLE() { return getToken(StreamSqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(StreamSqlParser.WITH, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateSinkTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSinkTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterCreateSinkTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitCreateSinkTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitCreateSinkTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSinkTableContext createSinkTable() throws RecognitionException {
		CreateSinkTableContext _localctx = new CreateSinkTableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createSinkTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(CREATE);
			setState(107);
			match(SINK);
			setState(108);
			match(TABLE);
			setState(109);
			tableName();
			setState(110);
			match(LR_BRACKET);
			setState(111);
			((CreateSinkTableContext)_localctx).columns = colTypeList();
			setState(112);
			match(RR_BRACKET);
			setState(113);
			match(WITH);
			setState(114);
			((CreateSinkTableContext)_localctx).tableProps = tablePropertyList();
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

	public static class CreateSideTableContext extends ParserRuleContext {
		public ColTypeListContext columns;
		public TablePropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(StreamSqlParser.CREATE, 0); }
		public TerminalNode SIDE() { return getToken(StreamSqlParser.SIDE, 0); }
		public TerminalNode TABLE() { return getToken(StreamSqlParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(StreamSqlParser.WITH, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateSideTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSideTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterCreateSideTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitCreateSideTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitCreateSideTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateSideTableContext createSideTable() throws RecognitionException {
		CreateSideTableContext _localctx = new CreateSideTableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createSideTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(CREATE);
			setState(117);
			match(SIDE);
			setState(118);
			match(TABLE);
			setState(119);
			tableName();
			setState(120);
			match(LR_BRACKET);
			setState(121);
			((CreateSideTableContext)_localctx).columns = colTypeList();
			setState(122);
			match(RR_BRACKET);
			setState(123);
			match(WITH);
			setState(124);
			((CreateSideTableContext)_localctx).tableProps = tablePropertyList();
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

	public static class CreateViewContext extends ParserRuleContext {
		public SelectExprContext select;
		public TerminalNode CREATE() { return getToken(StreamSqlParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(StreamSqlParser.VIEW, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(StreamSqlParser.AS, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public CreateViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateViewContext createView() throws RecognitionException {
		CreateViewContext _localctx = new CreateViewContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(CREATE);
			setState(127);
			match(VIEW);
			setState(128);
			tableName();
			setState(129);
			match(AS);
			setState(130);
			((CreateViewContext)_localctx).select = selectExpr();
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

	public static class CreateFunctionContext extends ParserRuleContext {
		public Token className;
		public Token jarFile;
		public TerminalNode CREATE() { return getToken(StreamSqlParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(StreamSqlParser.FUNCTION, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(StreamSqlParser.AS, 0); }
		public TerminalNode USING() { return getToken(StreamSqlParser.USING, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(StreamSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(StreamSqlParser.STRING_LITERAL, i);
		}
		public CreateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFunctionContext createFunction() throws RecognitionException {
		CreateFunctionContext _localctx = new CreateFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_createFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CREATE);
			setState(133);
			match(FUNCTION);
			setState(134);
			functionName();
			setState(135);
			match(AS);
			setState(136);
			((CreateFunctionContext)_localctx).className = match(STRING_LITERAL);
			setState(137);
			match(USING);
			setState(138);
			((CreateFunctionContext)_localctx).jarFile = match(STRING_LITERAL);
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
		public TableNameListContext tableNames;
		public SelectExprContext select;
		public TerminalNode INSERT() { return getToken(StreamSqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(StreamSqlParser.INTO, 0); }
		public TableNameListContext tableNameList() {
			return getRuleContext(TableNameListContext.class,0);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitInsertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitInsertStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(INSERT);
			setState(141);
			match(INTO);
			setState(142);
			((InsertStatementContext)_localctx).tableNames = tableNameList();
			setState(143);
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
		public TerminalNode SET() { return getToken(StreamSqlParser.SET, 0); }
		public SetKeyExprContext setKeyExpr() {
			return getRuleContext(SetKeyExprContext.class,0);
		}
		public TerminalNode EQUAL_SYMBOL() { return getToken(StreamSqlParser.EQUAL_SYMBOL, 0); }
		public ValueKeyExprContext valueKeyExpr() {
			return getRuleContext(ValueKeyExprContext.class,0);
		}
		public SetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatementContext setStatement() throws RecognitionException {
		SetStatementContext _localctx = new SetStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(SET);
			setState(146);
			setKeyExpr();
			setState(147);
			match(EQUAL_SYMBOL);
			setState(148);
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
		public TerminalNode SEMI() { return getToken(StreamSqlParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(StreamSqlParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(StreamSqlParser.DOT_ID, i);
		}
		public SetKeyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setKeyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterSetKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitSetKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitSetKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetKeyExprContext setKeyExpr() throws RecognitionException {
		SetKeyExprContext _localctx = new SetKeyExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_setKeyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT_ID) {
				{
				{
				setState(153);
				match(DOT_ID);
				}
				}
				setState(158);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterValueKeyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitValueKeyExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitValueKeyExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueKeyExprContext valueKeyExpr() throws RecognitionException {
		ValueKeyExprContext _localctx = new ValueKeyExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valueKeyExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			word();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << TRUE) | (1L << FALSE) | (1L << AS) | (1L << BY) | (1L << PROCTIME) | (1L << SET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << REAL_LITERAL))) != 0)) {
				{
				{
				setState(160);
				word();
				}
				}
				setState(165);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			word();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TABLE) | (1L << TRUE) | (1L << FALSE) | (1L << AS) | (1L << BY) | (1L << PROCTIME) | (1L << SET) | (1L << STAR) | (1L << DIVIDE) | (1L << MODULE) | (1L << PLUS) | (1L << MINUS) | (1L << EQUAL_SYMBOL) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL) | (1L << EXCLAMATION_SYMBOL) | (1L << BIT_NOT_OP) | (1L << BIT_OR_OP) | (1L << BIT_AND_OP) | (1L << BIT_XOR_OP) | (1L << LR_BRACKET) | (1L << RR_BRACKET) | (1L << COMMA) | (1L << DOT_ID) | (1L << ID) | (1L << STRING_LITERAL) | (1L << DECIMAL_LITERAL) | (1L << REAL_LITERAL))) != 0)) {
				{
				{
				setState(167);
				word();
				}
				}
				setState(172);
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
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public TerminalNode DOT_ID() { return getToken(StreamSqlParser.DOT_ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(StreamSqlParser.STRING_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(StreamSqlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(StreamSqlParser.REAL_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode AS() { return getToken(StreamSqlParser.AS, 0); }
		public TerminalNode BY() { return getToken(StreamSqlParser.BY, 0); }
		public TerminalNode PROCTIME() { return getToken(StreamSqlParser.PROCTIME, 0); }
		public TerminalNode SET() { return getToken(StreamSqlParser.SET, 0); }
		public TerminalNode STAR() { return getToken(StreamSqlParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(StreamSqlParser.DIVIDE, 0); }
		public TerminalNode MODULE() { return getToken(StreamSqlParser.MODULE, 0); }
		public TerminalNode PLUS() { return getToken(StreamSqlParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(StreamSqlParser.MINUS, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(StreamSqlParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(StreamSqlParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(StreamSqlParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(StreamSqlParser.EXCLAMATION_SYMBOL, 0); }
		public TerminalNode BIT_NOT_OP() { return getToken(StreamSqlParser.BIT_NOT_OP, 0); }
		public TerminalNode BIT_OR_OP() { return getToken(StreamSqlParser.BIT_OR_OP, 0); }
		public TerminalNode BIT_AND_OP() { return getToken(StreamSqlParser.BIT_AND_OP, 0); }
		public TerminalNode BIT_XOR_OP() { return getToken(StreamSqlParser.BIT_XOR_OP, 0); }
		public TerminalNode LR_BRACKET() { return getToken(StreamSqlParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(StreamSqlParser.RR_BRACKET, 0); }
		public TerminalNode COMMA() { return getToken(StreamSqlParser.COMMA, 0); }
		public TerminalNode TABLE() { return getToken(StreamSqlParser.TABLE, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_word);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(ID);
				}
				break;
			case DOT_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(DOT_ID);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(STRING_LITERAL);
				}
				break;
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				match(DECIMAL_LITERAL);
				}
				break;
			case REAL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(REAL_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				booleanValue();
				}
				break;
			case AS:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				match(AS);
				}
				break;
			case BY:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				match(BY);
				}
				break;
			case PROCTIME:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				match(PROCTIME);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				match(SET);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				match(STAR);
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 12);
				{
				setState(184);
				match(DIVIDE);
				}
				break;
			case MODULE:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				match(MODULE);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 14);
				{
				setState(186);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(187);
				match(MINUS);
				}
				break;
			case EQUAL_SYMBOL:
				enterOuterAlt(_localctx, 16);
				{
				setState(188);
				match(EQUAL_SYMBOL);
				}
				break;
			case GREATER_SYMBOL:
				enterOuterAlt(_localctx, 17);
				{
				setState(189);
				match(GREATER_SYMBOL);
				}
				break;
			case LESS_SYMBOL:
				enterOuterAlt(_localctx, 18);
				{
				setState(190);
				match(LESS_SYMBOL);
				}
				break;
			case EXCLAMATION_SYMBOL:
				enterOuterAlt(_localctx, 19);
				{
				setState(191);
				match(EXCLAMATION_SYMBOL);
				}
				break;
			case BIT_NOT_OP:
				enterOuterAlt(_localctx, 20);
				{
				setState(192);
				match(BIT_NOT_OP);
				}
				break;
			case BIT_OR_OP:
				enterOuterAlt(_localctx, 21);
				{
				setState(193);
				match(BIT_OR_OP);
				}
				break;
			case BIT_AND_OP:
				enterOuterAlt(_localctx, 22);
				{
				setState(194);
				match(BIT_AND_OP);
				}
				break;
			case BIT_XOR_OP:
				enterOuterAlt(_localctx, 23);
				{
				setState(195);
				match(BIT_XOR_OP);
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 24);
				{
				setState(196);
				match(LR_BRACKET);
				}
				break;
			case RR_BRACKET:
				enterOuterAlt(_localctx, 25);
				{
				setState(197);
				match(RR_BRACKET);
				}
				break;
			case COMMA:
				enterOuterAlt(_localctx, 26);
				{
				setState(198);
				match(COMMA);
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 27);
				{
				setState(199);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_colTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			colType();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				colType();
				}
				}
				setState(209);
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
		public Token comment;
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(StreamSqlParser.COMMENT, 0); }
		public List<TerminalNode> STRING_LITERAL() { return getTokens(StreamSqlParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(StreamSqlParser.STRING_LITERAL, i);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_colType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(ID);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LITERAL) {
				{
				setState(211);
				((ColTypeContext)_localctx).jsonPath = match(STRING_LITERAL);
				}
			}

			setState(214);
			dataType();
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(215);
				match(COMMENT);
				setState(216);
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
		public TerminalNode VARCHAR() { return getToken(StreamSqlParser.VARCHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(StreamSqlParser.BOOLEAN, 0); }
		public TerminalNode TINYINT() { return getToken(StreamSqlParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(StreamSqlParser.SMALLINT, 0); }
		public TerminalNode INT() { return getToken(StreamSqlParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(StreamSqlParser.BIGINT, 0); }
		public TerminalNode FLOAT() { return getToken(StreamSqlParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(StreamSqlParser.DECIMAL, 0); }
		public TerminalNode DOUBLE() { return getToken(StreamSqlParser.DOUBLE, 0); }
		public TerminalNode DATE() { return getToken(StreamSqlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(StreamSqlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(StreamSqlParser.TIMESTAMP, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARCHAR) | (1L << BOOLEAN) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INT) | (1L << BIGINT) | (1L << FLOAT) | (1L << DECIMAL) | (1L << DOUBLE) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP))) != 0)) ) {
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

	public static class TableNameListContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public TableNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTableNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTableNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTableNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameListContext tableNameList() throws RecognitionException {
		TableNameListContext _localctx = new TableNameListContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			tableName();
			setState(226);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					tableName();
					}
					} 
				}
				setState(228);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(LR_BRACKET);
			setState(230);
			tableProperty();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				tableProperty();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
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
		public TerminalNode EQUAL_SYMBOL() { return getToken(StreamSqlParser.EQUAL_SYMBOL, 0); }
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
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(241);
			match(EQUAL_SYMBOL);
			setState(242);
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
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public List<TerminalNode> DOT_ID() { return getTokens(StreamSqlParser.DOT_ID); }
		public TerminalNode DOT_ID(int i) {
			return getToken(StreamSqlParser.DOT_ID, i);
		}
		public TerminalNode STRING_LITERAL() { return getToken(StreamSqlParser.STRING_LITERAL, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tablePropertyKey);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(ID);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT_ID) {
					{
					{
					setState(245);
					match(DOT_ID);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
		public TerminalNode DECIMAL_LITERAL() { return getToken(StreamSqlParser.DECIMAL_LITERAL, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(StreamSqlParser.STRING_LITERAL, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tablePropertyValue);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(DECIMAL_LITERAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				booleanValue();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
		public TerminalNode TRUE() { return getToken(StreamSqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(StreamSqlParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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

	public static class TimeModeExprContext extends ParserRuleContext {
		public Token timeMode;
		public AttrNameExprContext attrName;
		public Token time;
		public TerminalNode TIMESTAMP() { return getToken(StreamSqlParser.TIMESTAMP, 0); }
		public TerminalNode BY() { return getToken(StreamSqlParser.BY, 0); }
		public TerminalNode PROCTIME() { return getToken(StreamSqlParser.PROCTIME, 0); }
		public AttrNameExprContext attrNameExpr() {
			return getRuleContext(AttrNameExprContext.class,0);
		}
		public TerminalNode SET() { return getToken(StreamSqlParser.SET, 0); }
		public TerminalNode WATERMARK() { return getToken(StreamSqlParser.WATERMARK, 0); }
		public TerminalNode DELAY() { return getToken(StreamSqlParser.DELAY, 0); }
		public TerminalNode ROWTIME() { return getToken(StreamSqlParser.ROWTIME, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(StreamSqlParser.DECIMAL_LITERAL, 0); }
		public TimeModeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeModeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTimeModeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTimeModeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTimeModeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeModeExprContext timeModeExpr() throws RecognitionException {
		TimeModeExprContext _localctx = new TimeModeExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_timeModeExpr);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(TIMESTAMP);
				setState(262);
				match(BY);
				setState(263);
				((TimeModeExprContext)_localctx).timeMode = match(PROCTIME);
				setState(264);
				((TimeModeExprContext)_localctx).attrName = attrNameExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(TIMESTAMP);
				setState(266);
				match(BY);
				setState(267);
				((TimeModeExprContext)_localctx).timeMode = match(ROWTIME);
				setState(268);
				((TimeModeExprContext)_localctx).attrName = attrNameExpr();
				setState(269);
				match(SET);
				setState(270);
				match(WATERMARK);
				setState(271);
				match(DELAY);
				setState(272);
				((TimeModeExprContext)_localctx).time = match(DECIMAL_LITERAL);
				}
				break;
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

	public static class AttrNameExprContext extends ParserRuleContext {
		public TerminalNode PROCTIME() { return getToken(StreamSqlParser.PROCTIME, 0); }
		public TerminalNode ROWTIME() { return getToken(StreamSqlParser.ROWTIME, 0); }
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public AttrNameExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrNameExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterAttrNameExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitAttrNameExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitAttrNameExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrNameExprContext attrNameExpr() throws RecognitionException {
		AttrNameExprContext _localctx = new AttrNameExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_attrNameExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PROCTIME) | (1L << ROWTIME) | (1L << ID))) != 0)) ) {
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

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StreamSqlParser.ID, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StreamSqlParserListener ) ((StreamSqlParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StreamSqlParserVisitor ) return ((StreamSqlParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u011d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\5\2<\n\2\3\2\5\2?\n\2\3\2"+
		"\3\2\3\3\3\3\5\3E\n\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\3\3\3\5\3"+
		"Q\n\3\3\3\5\3T\n\3\3\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\7\r\u009d\n\r\f\r\16\r\u00a0\13\r\3\16\3"+
		"\16\7\16\u00a4\n\16\f\16\16\16\u00a7\13\16\3\17\3\17\7\17\u00ab\n\17\f"+
		"\17\16\17\u00ae\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21\7\21\u00d0\n\21\f\21\16"+
		"\21\u00d3\13\21\3\22\3\22\5\22\u00d7\n\22\3\22\3\22\3\22\5\22\u00dc\n"+
		"\22\3\23\3\23\3\24\3\24\3\24\7\24\u00e3\n\24\f\24\16\24\u00e6\13\24\3"+
		"\25\3\25\3\25\3\25\7\25\u00ec\n\25\f\25\16\25\u00ef\13\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\3"+
		"\27\5\27\u00ff\n\27\3\30\3\30\3\30\5\30\u0104\n\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0115\n\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\36)\3\2\17\20\4\2\23\24==\2"+
		"\u0135\2;\3\2\2\2\4K\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\nl\3\2\2\2\fv\3\2\2"+
		"\2\16\u0080\3\2\2\2\20\u0086\3\2\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2"+
		"\26\u0098\3\2\2\2\30\u009a\3\2\2\2\32\u00a1\3\2\2\2\34\u00a8\3\2\2\2\36"+
		"\u00ca\3\2\2\2 \u00cc\3\2\2\2\"\u00d4\3\2\2\2$\u00dd\3\2\2\2&\u00df\3"+
		"\2\2\2(\u00e7\3\2\2\2*\u00f2\3\2\2\2,\u00fe\3\2\2\2.\u0103\3\2\2\2\60"+
		"\u0105\3\2\2\2\62\u0114\3\2\2\2\64\u0116\3\2\2\2\66\u0118\3\2\2\28\u011a"+
		"\3\2\2\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\7\35\2\2>=\3\2\2\2"+
		">?\3\2\2\2?@\3\2\2\2@A\7\2\2\3A\3\3\2\2\2BD\5\6\4\2CE\7\35\2\2DC\3\2\2"+
		"\2DE\3\2\2\2EF\3\2\2\2FG\7;\2\2GJ\3\2\2\2HJ\5\26\f\2IB\3\2\2\2IH\3\2\2"+
		"\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LV\3\2\2\2MK\3\2\2\2NS\5\6\4\2OQ\7\35"+
		"\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RT\7;\2\2SP\3\2\2\2ST\3\2\2\2TW\3\2"+
		"\2\2UW\5\26\f\2VN\3\2\2\2VU\3\2\2\2W\5\3\2\2\2X`\5\b\5\2Y`\5\n\6\2Z`\5"+
		"\16\b\2[`\5\20\t\2\\`\5\22\n\2]`\5\f\7\2^`\5\24\13\2_X\3\2\2\2_Y\3\2\2"+
		"\2_Z\3\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\7\7"+
		"\2\2bc\7\t\2\2cd\7\b\2\2de\5\66\34\2ef\78\2\2fg\5 \21\2gh\79\2\2hi\7\f"+
		"\2\2ij\5(\25\2jk\5\62\32\2k\t\3\2\2\2lm\7\7\2\2mn\7\n\2\2no\7\b\2\2op"+
		"\5\66\34\2pq\78\2\2qr\5 \21\2rs\79\2\2st\7\f\2\2tu\5(\25\2u\13\3\2\2\2"+
		"vw\7\7\2\2wx\7\13\2\2xy\7\b\2\2yz\5\66\34\2z{\78\2\2{|\5 \21\2|}\79\2"+
		"\2}~\7\f\2\2~\177\5(\25\2\177\r\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0082"+
		"\7\r\2\2\u0082\u0083\5\66\34\2\u0083\u0084\7\21\2\2\u0084\u0085\5\34\17"+
		"\2\u0085\17\3\2\2\2\u0086\u0087\7\7\2\2\u0087\u0088\7\33\2\2\u0088\u0089"+
		"\58\35\2\u0089\u008a\7\21\2\2\u008a\u008b\7?\2\2\u008b\u008c\7\34\2\2"+
		"\u008c\u008d\7?\2\2\u008d\21\3\2\2\2\u008e\u008f\7\31\2\2\u008f\u0090"+
		"\7\32\2\2\u0090\u0091\5&\24\2\u0091\u0092\5\34\17\2\u0092\23\3\2\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7/\2\2\u0096\u0097\5"+
		"\32\16\2\u0097\25\3\2\2\2\u0098\u0099\7;\2\2\u0099\27\3\2\2\2\u009a\u009e"+
		"\7=\2\2\u009b\u009d\7<\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\31\3\2\2\2\u00a0\u009e\3\2\2"+
		"\2\u00a1\u00a5\5\36\20\2\u00a2\u00a4\5\36\20\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\33\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00ac\5\36\20\2\u00a9\u00ab\5\36\20\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\35\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00cb\7=\2\2\u00b0\u00cb"+
		"\7<\2\2\u00b1\u00cb\7?\2\2\u00b2\u00cb\7@\2\2\u00b3\u00cb\7A\2\2\u00b4"+
		"\u00cb\5\60\31\2\u00b5\u00cb\7\21\2\2\u00b6\u00cb\7\22\2\2\u00b7\u00cb"+
		"\7\23\2\2\u00b8\u00cb\7\25\2\2\u00b9\u00cb\7*\2\2\u00ba\u00cb\7+\2\2\u00bb"+
		"\u00cb\7,\2\2\u00bc\u00cb\7-\2\2\u00bd\u00cb\7.\2\2\u00be\u00cb\7/\2\2"+
		"\u00bf\u00cb\7\60\2\2\u00c0\u00cb\7\61\2\2\u00c1\u00cb\7\62\2\2\u00c2"+
		"\u00cb\7\63\2\2\u00c3\u00cb\7\64\2\2\u00c4\u00cb\7\65\2\2\u00c5\u00cb"+
		"\7\66\2\2\u00c6\u00cb\78\2\2\u00c7\u00cb\79\2\2\u00c8\u00cb\7:\2\2\u00c9"+
		"\u00cb\7\b\2\2\u00ca\u00af\3\2\2\2\u00ca\u00b0\3\2\2\2\u00ca\u00b1\3\2"+
		"\2\2\u00ca\u00b2\3\2\2\2\u00ca\u00b3\3\2\2\2\u00ca\u00b4\3\2\2\2\u00ca"+
		"\u00b5\3\2\2\2\u00ca\u00b6\3\2\2\2\u00ca\u00b7\3\2\2\2\u00ca\u00b8\3\2"+
		"\2\2\u00ca\u00b9\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00bb\3\2\2\2\u00ca"+
		"\u00bc\3\2\2\2\u00ca\u00bd\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00bf\3\2"+
		"\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c1\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00c3\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c6\3\2"+
		"\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\37\3\2\2\2\u00cc\u00d1\5\"\22\2\u00cd\u00ce\7:\2\2\u00ce\u00d0\5\"\22"+
		"\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2!\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7=\2\2\u00d5\u00d7"+
		"\7?\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00db\5$\23\2\u00d9\u00da\7\16\2\2\u00da\u00dc\7?\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc#\3\2\2\2\u00dd\u00de\t\2\2\2\u00de%\3\2"+
		"\2\2\u00df\u00e4\5\66\34\2\u00e0\u00e1\7:\2\2\u00e1\u00e3\5\66\34\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\'\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\78\2\2\u00e8\u00ed"+
		"\5*\26\2\u00e9\u00ea\7:\2\2\u00ea\u00ec\5*\26\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\79\2\2\u00f1)\3\2\2\2\u00f2\u00f3"+
		"\5,\27\2\u00f3\u00f4\7/\2\2\u00f4\u00f5\5.\30\2\u00f5+\3\2\2\2\u00f6\u00fa"+
		"\7=\2\2\u00f7\u00f9\7<\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00ff\7?\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff"+
		"-\3\2\2\2\u0100\u0104\7@\2\2\u0101\u0104\5\60\31\2\u0102\u0104\7?\2\2"+
		"\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104/\3"+
		"\2\2\2\u0105\u0106\t\3\2\2\u0106\61\3\2\2\2\u0107\u0108\7)\2\2\u0108\u0109"+
		"\7\22\2\2\u0109\u010a\7\23\2\2\u010a\u0115\5\64\33\2\u010b\u010c\7)\2"+
		"\2\u010c\u010d\7\22\2\2\u010d\u010e\7\24\2\2\u010e\u010f\5\64\33\2\u010f"+
		"\u0110\7\25\2\2\u0110\u0111\7\26\2\2\u0111\u0112\7\30\2\2\u0112\u0113"+
		"\7@\2\2\u0113\u0115\3\2\2\2\u0114\u0107\3\2\2\2\u0114\u010b\3\2\2\2\u0115"+
		"\63\3\2\2\2\u0116\u0117\t\4\2\2\u0117\65\3\2\2\2\u0118\u0119\7=\2\2\u0119"+
		"\67\3\2\2\2\u011a\u011b\7=\2\2\u011b9\3\2\2\2\30;>DIKPSV_\u009e\u00a5"+
		"\u00ac\u00ca\u00d1\u00d6\u00db\u00e4\u00ed\u00fa\u00fe\u0103\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}