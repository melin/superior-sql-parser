// Generated from com/dataworker/sql/parser/antlr4/presto/PrestoSqlBase.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.presto;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrestoSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		ADD=10, ADMIN=11, ALL=12, ALTER=13, ANALYZE=14, AND=15, ANY=16, ARRAY=17, 
		AS=18, ASC=19, AT=20, AUTHORIZATION=21, BERNOULLI=22, BETWEEN=23, BY=24, 
		CALL=25, CASCADE=26, CASE=27, CAST=28, CATALOGS=29, COLUMN=30, COLUMNS=31, 
		COMMENT=32, COMMIT=33, COMMITTED=34, CONSTRAINT=35, CREATE=36, CROSS=37, 
		CUBE=38, CURRENT=39, CURRENT_DATE=40, CURRENT_PATH=41, CURRENT_ROLE=42, 
		CURRENT_TIME=43, CURRENT_TIMESTAMP=44, CURRENT_USER=45, DATA=46, DATE=47, 
		DAY=48, DEALLOCATE=49, DEFINER=50, DELETE=51, DESC=52, DESCRIBE=53, DISTINCT=54, 
		DISTRIBUTED=55, DOUBLE=56, DROP=57, ELSE=58, END=59, ESCAPE=60, EXCEPT=61, 
		EXCLUDING=62, EXECUTE=63, EXISTS=64, EXPLAIN=65, EXTRACT=66, FALSE=67, 
		FETCH=68, FILTER=69, FIRST=70, FOLLOWING=71, FOR=72, FORMAT=73, FROM=74, 
		FULL=75, FUNCTIONS=76, GRANT=77, GRANTED=78, GRANTS=79, GRAPHVIZ=80, GROUP=81, 
		GROUPING=82, HAVING=83, HOUR=84, IF=85, IGNORE=86, IN=87, INCLUDING=88, 
		INNER=89, INPUT=90, INSERT=91, INTERSECT=92, INTERVAL=93, INTO=94, INVOKER=95, 
		IO=96, IS=97, ISOLATION=98, JOIN=99, JSON=100, LAST=101, LATERAL=102, 
		LEFT=103, LEVEL=104, LIKE=105, LIMIT=106, LOCALTIME=107, LOCALTIMESTAMP=108, 
		LOGICAL=109, MAP=110, MINUTE=111, MONTH=112, NATURAL=113, NEXT=114, NFC=115, 
		NFD=116, NFKC=117, NFKD=118, NO=119, NONE=120, NORMALIZE=121, NOT=122, 
		NULL=123, NULLIF=124, NULLS=125, OFFSET=126, ON=127, ONLY=128, OPTION=129, 
		OR=130, ORDER=131, ORDINALITY=132, OUTER=133, OUTPUT=134, OVER=135, PARTITION=136, 
		PARTITIONS=137, PATH=138, POSITION=139, PRECEDING=140, PRECISION=141, 
		PREPARE=142, PRIVILEGES=143, PROPERTIES=144, RANGE=145, READ=146, RECURSIVE=147, 
		RENAME=148, REPEATABLE=149, REPLACE=150, RESET=151, RESPECT=152, RESTRICT=153, 
		REVOKE=154, RIGHT=155, ROLE=156, ROLES=157, ROLLBACK=158, ROLLUP=159, 
		ROW=160, ROWS=161, SCHEMA=162, SCHEMAS=163, SECOND=164, SECURITY=165, 
		SELECT=166, SERIALIZABLE=167, SESSION=168, SET=169, SETS=170, SHOW=171, 
		SOME=172, START=173, STATS=174, SUBSTRING=175, SYSTEM=176, TABLE=177, 
		TABLES=178, TABLESAMPLE=179, TEXT=180, THEN=181, TIES=182, TIME=183, TIMESTAMP=184, 
		TO=185, TRANSACTION=186, TRUE=187, TRY_CAST=188, TYPE=189, UESCAPE=190, 
		UNBOUNDED=191, UNCOMMITTED=192, UNION=193, UNNEST=194, USE=195, USER=196, 
		USING=197, VALIDATE=198, VALUES=199, VERBOSE=200, VIEW=201, WHEN=202, 
		WHERE=203, WITH=204, WITHOUT=205, WORK=206, WRITE=207, YEAR=208, ZONE=209, 
		EQ=210, NEQ=211, LT=212, LTE=213, GT=214, GTE=215, PLUS=216, MINUS=217, 
		ASTERISK=218, SLASH=219, PERCENT=220, CONCAT=221, STRING=222, UNICODE_STRING=223, 
		BINARY_LITERAL=224, INTEGER_VALUE=225, DECIMAL_VALUE=226, DOUBLE_VALUE=227, 
		IDENTIFIER=228, DIGIT_IDENTIFIER=229, QUOTED_IDENTIFIER=230, BACKQUOTED_IDENTIFIER=231, 
		SIMPLE_COMMENT=232, BRACKETED_COMMENT=233, WS=234, UNRECOGNIZED=235, DELIMITER=236;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standalonePathSpecification = 2, 
		RULE_standaloneType = 3, RULE_statement = 4, RULE_query = 5, RULE_with = 6, 
		RULE_tableElement = 7, RULE_columnDefinition = 8, RULE_likeClause = 9, 
		RULE_properties = 10, RULE_property = 11, RULE_queryNoWith = 12, RULE_queryTerm = 13, 
		RULE_queryPrimary = 14, RULE_sortItem = 15, RULE_querySpecification = 16, 
		RULE_groupBy = 17, RULE_groupingElement = 18, RULE_groupingSet = 19, RULE_namedQuery = 20, 
		RULE_setQuantifier = 21, RULE_selectItem = 22, RULE_relation = 23, RULE_joinType = 24, 
		RULE_joinCriteria = 25, RULE_sampledRelation = 26, RULE_sampleType = 27, 
		RULE_aliasedRelation = 28, RULE_columnAliases = 29, RULE_relationPrimary = 30, 
		RULE_expression = 31, RULE_booleanExpression = 32, RULE_predicate = 33, 
		RULE_valueExpression = 34, RULE_primaryExpression = 35, RULE_nullTreatment = 36, 
		RULE_string = 37, RULE_timeZoneSpecifier = 38, RULE_comparisonOperator = 39, 
		RULE_comparisonQuantifier = 40, RULE_booleanValue = 41, RULE_interval = 42, 
		RULE_intervalField = 43, RULE_normalForm = 44, RULE_type = 45, RULE_rowField = 46, 
		RULE_typeParameter = 47, RULE_whenClause = 48, RULE_filter = 49, RULE_over = 50, 
		RULE_windowFrame = 51, RULE_frameBound = 52, RULE_explainOption = 53, 
		RULE_transactionMode = 54, RULE_levelOfIsolation = 55, RULE_callArgument = 56, 
		RULE_pathElement = 57, RULE_pathSpecification = 58, RULE_privilege = 59, 
		RULE_qualifiedName = 60, RULE_grantor = 61, RULE_principal = 62, RULE_roles = 63, 
		RULE_identifier = 64, RULE_number = 65, RULE_nonReserved = 66;
	public static final String[] ruleNames = {
		"singleStatement", "standaloneExpression", "standalonePathSpecification", 
		"standaloneType", "statement", "query", "with", "tableElement", "columnDefinition", 
		"likeClause", "properties", "property", "queryNoWith", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "groupBy", "groupingElement", "groupingSet", 
		"namedQuery", "setQuantifier", "selectItem", "relation", "joinType", "joinCriteria", 
		"sampledRelation", "sampleType", "aliasedRelation", "columnAliases", "relationPrimary", 
		"expression", "booleanExpression", "predicate", "valueExpression", "primaryExpression", 
		"nullTreatment", "string", "timeZoneSpecifier", "comparisonOperator", 
		"comparisonQuantifier", "booleanValue", "interval", "intervalField", "normalForm", 
		"type", "rowField", "typeParameter", "whenClause", "filter", "over", "windowFrame", 
		"frameBound", "explainOption", "transactionMode", "levelOfIsolation", 
		"callArgument", "pathElement", "pathSpecification", "privilege", "qualifiedName", 
		"grantor", "principal", "roles", "identifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "')'", "','", "'?'", "'->'", "'['", "']'", "'=>'", 
		"'ADD'", "'ADMIN'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", 
		"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BERNOULLI'", 
		"'BETWEEN'", "'BY'", "'CALL'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", 
		"'COLUMN'", "'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
		"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_DATE'", "'CURRENT_PATH'", 
		"'CURRENT_ROLE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'CURRENT_USER'", 
		"'DATA'", "'DATE'", "'DAY'", "'DEALLOCATE'", "'DEFINER'", "'DELETE'", 
		"'DESC'", "'DESCRIBE'", "'DISTINCT'", "'DISTRIBUTED'", "'DOUBLE'", "'DROP'", 
		"'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", 
		"'EXISTS'", "'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FILTER'", 
		"'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", 
		"'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", 
		"'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", "'INNER'", 
		"'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", "'INTO'", "'INVOKER'", 
		"'IO'", "'IS'", "'ISOLATION'", "'JOIN'", "'JSON'", "'LAST'", "'LATERAL'", 
		"'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCALTIME'", "'LOCALTIMESTAMP'", 
		"'LOGICAL'", "'MAP'", "'MINUTE'", "'MONTH'", "'NATURAL'", "'NEXT'", "'NFC'", 
		"'NFD'", "'NFKC'", "'NFKD'", "'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", 
		"'NULL'", "'NULLIF'", "'NULLS'", "'OFFSET'", "'ON'", "'ONLY'", "'OPTION'", 
		"'OR'", "'ORDER'", "'ORDINALITY'", "'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", 
		"'PARTITIONS'", "'PATH'", "'POSITION'", "'PRECEDING'", "'PRECISION'", 
		"'PREPARE'", "'PRIVILEGES'", "'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", 
		"'RENAME'", "'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", 
		"'REVOKE'", "'RIGHT'", "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", 
		"'ROW'", "'ROWS'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SECURITY'", 
		"'SELECT'", "'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", "'SHOW'", 
		"'SOME'", "'START'", "'STATS'", "'SUBSTRING'", "'SYSTEM'", "'TABLE'", 
		"'TABLES'", "'TABLESAMPLE'", "'TEXT'", "'THEN'", "'TIES'", "'TIME'", "'TIMESTAMP'", 
		"'TO'", "'TRANSACTION'", "'TRUE'", "'TRY_CAST'", "'TYPE'", "'UESCAPE'", 
		"'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", "'UNNEST'", "'USE'", "'USER'", 
		"'USING'", "'VALIDATE'", "'VALUES'", "'VERBOSE'", "'VIEW'", "'WHEN'", 
		"'WHERE'", "'WITH'", "'WITHOUT'", "'WORK'", "'WRITE'", "'YEAR'", "'ZONE'", 
		"'='", null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "ADD", "ADMIN", 
		"ALL", "ALTER", "ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", 
		"BERNOULLI", "BETWEEN", "BY", "CALL", "CASCADE", "CASE", "CAST", "CATALOGS", 
		"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", "CREATE", 
		"CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_PATH", "CURRENT_ROLE", 
		"CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", "DATE", "DAY", 
		"DEALLOCATE", "DEFINER", "DELETE", "DESC", "DESCRIBE", "DISTINCT", "DISTRIBUTED", 
		"DOUBLE", "DROP", "ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUDING", "EXECUTE", 
		"EXISTS", "EXPLAIN", "EXTRACT", "FALSE", "FETCH", "FILTER", "FIRST", "FOLLOWING", 
		"FOR", "FORMAT", "FROM", "FULL", "FUNCTIONS", "GRANT", "GRANTED", "GRANTS", 
		"GRAPHVIZ", "GROUP", "GROUPING", "HAVING", "HOUR", "IF", "IGNORE", "IN", 
		"INCLUDING", "INNER", "INPUT", "INSERT", "INTERSECT", "INTERVAL", "INTO", 
		"INVOKER", "IO", "IS", "ISOLATION", "JOIN", "JSON", "LAST", "LATERAL", 
		"LEFT", "LEVEL", "LIKE", "LIMIT", "LOCALTIME", "LOCALTIMESTAMP", "LOGICAL", 
		"MAP", "MINUTE", "MONTH", "NATURAL", "NEXT", "NFC", "NFD", "NFKC", "NFKD", 
		"NO", "NONE", "NORMALIZE", "NOT", "NULL", "NULLIF", "NULLS", "OFFSET", 
		"ON", "ONLY", "OPTION", "OR", "ORDER", "ORDINALITY", "OUTER", "OUTPUT", 
		"OVER", "PARTITION", "PARTITIONS", "PATH", "POSITION", "PRECEDING", "PRECISION", 
		"PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", "READ", "RECURSIVE", "RENAME", 
		"REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", "RIGHT", 
		"ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "SCHEMA", "SCHEMAS", 
		"SECOND", "SECURITY", "SELECT", "SERIALIZABLE", "SESSION", "SET", "SETS", 
		"SHOW", "SOME", "START", "STATS", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", 
		"TABLESAMPLE", "TEXT", "THEN", "TIES", "TIME", "TIMESTAMP", "TO", "TRANSACTION", 
		"TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", 
		"UNNEST", "USE", "USER", "USING", "VALIDATE", "VALUES", "VERBOSE", "VIEW", 
		"WHEN", "WHERE", "WITH", "WITHOUT", "WORK", "WRITE", "YEAR", "ZONE", "EQ", 
		"NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", 
		"PERCENT", "CONCAT", "STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
		"UNRECOGNIZED", "DELIMITER"
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
	public String getGrammarFileName() { return "PrestoSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrestoSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrestoSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			statement();
			setState(135);
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

	public static class StandaloneExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrestoSqlBaseParser.EOF, 0); }
		public StandaloneExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStandaloneExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStandaloneExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStandaloneExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneExpressionContext standaloneExpression() throws RecognitionException {
		StandaloneExpressionContext _localctx = new StandaloneExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_standaloneExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			expression();
			setState(138);
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

	public static class StandalonePathSpecificationContext extends ParserRuleContext {
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrestoSqlBaseParser.EOF, 0); }
		public StandalonePathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standalonePathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStandalonePathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStandalonePathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStandalonePathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandalonePathSpecificationContext standalonePathSpecification() throws RecognitionException {
		StandalonePathSpecificationContext _localctx = new StandalonePathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_standalonePathSpecification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			pathSpecification();
			setState(141);
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

	public static class StandaloneTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrestoSqlBaseParser.EOF, 0); }
		public StandaloneTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStandaloneType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStandaloneType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStandaloneType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneTypeContext standaloneType() throws RecognitionException {
		StandaloneTypeContext _localctx = new StandaloneTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_standaloneType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type(0);
			setState(144);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(PrestoSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(PrestoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode VERBOSE() { return getToken(PrestoSqlBaseParser.VERBOSE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(PrestoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(PrestoSqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(PrestoSqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(PrestoSqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(PrestoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(PrestoSqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(PrestoSqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(PrestoSqlBaseParser.ADMIN, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public CreateRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public QualifiedNameContext column;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(PrestoSqlBaseParser.COLUMN, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public DropColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(PrestoSqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(PrestoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRolesContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLES() { return getToken(PrestoSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(PrestoSqlBaseParser.CURRENT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public ShowRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(PrestoSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(PrestoSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentColumnContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public TerminalNode COLUMN() { return getToken(PrestoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(PrestoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(PrestoSqlBaseParser.NULL, 0); }
		public CommentColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCommentColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCommentColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCommentColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeRolesContext extends StatementContext {
		public TerminalNode REVOKE() { return getToken(PrestoSqlBaseParser.REVOKE, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode ADMIN() { return getToken(PrestoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PrestoSqlBaseParser.FOR, 0); }
		public TerminalNode GRANTED() { return getToken(PrestoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(PrestoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public RevokeRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRevokeRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRevokeRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRevokeRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(PrestoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public TerminalNode DESCRIBE() { return getToken(PrestoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(PrestoSqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowRoleGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public TerminalNode GRANTS() { return getToken(PrestoSqlBaseParser.GRANTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public ShowRoleGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowRoleGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowRoleGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowRoleGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public ColumnDefinitionContext column;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(PrestoSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(PrestoSqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(PrestoSqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(PrestoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(PrestoSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PrestoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(PrestoSqlBaseParser.SESSION, 0); }
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateSchemaContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(PrestoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(PrestoSqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode USING() { return getToken(PrestoSqlBaseParser.USING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameSchemaContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(PrestoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RenameSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRenameSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRenameSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRenameSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropRoleContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DropRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(PrestoSqlBaseParser.ANALYZE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetRoleContext extends StatementContext {
		public IdentifierContext role;
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode NONE() { return getToken(PrestoSqlBaseParser.NONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetRoleContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetRole(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowGrantsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode GRANTS() { return getToken(PrestoSqlBaseParser.GRANTS, 0); }
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public ShowGrantsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowGrants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowGrants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowGrants(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropSchemaContext extends StatementContext {
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public TerminalNode CASCADE() { return getToken(PrestoSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(PrestoSqlBaseParser.RESTRICT, 0); }
		public DropSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(PrestoSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(PrestoSqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> WITH() { return getTokens(PrestoSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(PrestoSqlBaseParser.WITH, i);
		}
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(PrestoSqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(PrestoSqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(PrestoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(PrestoSqlBaseParser.FOR, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowStatsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowStats(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateSchemaContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateSchemaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowCreateSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowCreateSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowCreateSchema(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public PrincipalContext grantee;
		public TerminalNode REVOKE() { return getToken(PrestoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PrestoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(PrestoSqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(PrestoSqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(PrestoSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(PrestoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeInputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(PrestoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode INPUT() { return getToken(PrestoSqlBaseParser.INPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeInputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDescribeInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDescribeInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDescribeInput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowStatsForQueryContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode STATS() { return getToken(PrestoSqlBaseParser.STATS, 0); }
		public TerminalNode FOR() { return getToken(PrestoSqlBaseParser.FOR, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public ShowStatsForQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowStatsForQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowStatsForQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowStatsForQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(PrestoSqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PrestoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(PrestoSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PrestoSqlBaseParser.REPLACE, 0); }
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode SECURITY() { return getToken(PrestoSqlBaseParser.SECURITY, 0); }
		public TerminalNode DEFINER() { return getToken(PrestoSqlBaseParser.DEFINER, 0); }
		public TerminalNode INVOKER() { return getToken(PrestoSqlBaseParser.INVOKER, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(PrestoSqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSchemaAuthorizationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(PrestoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SetSchemaAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetSchemaAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetSchemaAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetSchemaAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(PrestoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(PrestoSqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(PrestoSqlBaseParser.IS, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(PrestoSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameViewContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public TerminalNode RENAME() { return getToken(PrestoSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRenameView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRenameView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRenameView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetPathContext extends StatementContext {
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode PATH() { return getToken(PrestoSqlBaseParser.PATH, 0); }
		public PathSpecificationContext pathSpecification() {
			return getRuleContext(PathSpecificationContext.class,0);
		}
		public SetPathContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantRolesContext extends StatementContext {
		public TerminalNode GRANT() { return getToken(PrestoSqlBaseParser.GRANT, 0); }
		public RolesContext roles() {
			return getRuleContext(RolesContext.class,0);
		}
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public List<PrincipalContext> principal() {
			return getRuleContexts(PrincipalContext.class);
		}
		public PrincipalContext principal(int i) {
			return getRuleContext(PrincipalContext.class,i);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode ADMIN() { return getToken(PrestoSqlBaseParser.ADMIN, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode GRANTED() { return getToken(PrestoSqlBaseParser.GRANTED, 0); }
		public TerminalNode BY() { return getToken(PrestoSqlBaseParser.BY, 0); }
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public GrantRolesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGrantRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGrantRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGrantRoles(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(PrestoSqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public StringContext pattern;
		public StringContext escape;
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(PrestoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeOutputContext extends StatementContext {
		public TerminalNode DESCRIBE() { return getToken(PrestoSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode OUTPUT() { return getToken(PrestoSqlBaseParser.OUTPUT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DescribeOutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDescribeOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDescribeOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDescribeOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public PrincipalContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(PrestoSqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(PrestoSqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PrestoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(USE);
				setState(148);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(USE);
				setState(150);
				((UseContext)_localctx).catalog = identifier();
				setState(151);
				match(T__0);
				setState(152);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(CREATE);
				setState(155);
				match(SCHEMA);
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(156);
					match(IF);
					setState(157);
					match(NOT);
					setState(158);
					match(EXISTS);
					}
					break;
				}
				setState(161);
				qualifiedName();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTHORIZATION) {
					{
					setState(162);
					match(AUTHORIZATION);
					setState(163);
					principal();
					}
				}

				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(166);
					match(WITH);
					setState(167);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(DROP);
				setState(171);
				match(SCHEMA);
				setState(174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(172);
					match(IF);
					setState(173);
					match(EXISTS);
					}
					break;
				}
				setState(176);
				qualifiedName();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(177);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 6:
				_localctx = new RenameSchemaContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(ALTER);
				setState(181);
				match(SCHEMA);
				setState(182);
				qualifiedName();
				setState(183);
				match(RENAME);
				setState(184);
				match(TO);
				setState(185);
				identifier();
				}
				break;
			case 7:
				_localctx = new SetSchemaAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				match(ALTER);
				setState(188);
				match(SCHEMA);
				setState(189);
				qualifiedName();
				setState(190);
				match(SET);
				setState(191);
				match(AUTHORIZATION);
				setState(192);
				principal();
				}
				break;
			case 8:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				match(CREATE);
				setState(195);
				match(TABLE);
				setState(199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(196);
					match(IF);
					setState(197);
					match(NOT);
					setState(198);
					match(EXISTS);
					}
					break;
				}
				setState(201);
				qualifiedName();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(202);
					columnAliases();
					}
				}

				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(205);
					match(COMMENT);
					setState(206);
					string();
					}
				}

				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(209);
					match(WITH);
					setState(210);
					properties();
					}
				}

				setState(213);
				match(AS);
				setState(219);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(214);
					query();
					}
					break;
				case 2:
					{
					setState(215);
					match(T__1);
					setState(216);
					query();
					setState(217);
					match(T__2);
					}
					break;
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(221);
					match(WITH);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(222);
						match(NO);
						}
					}

					setState(225);
					match(DATA);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(228);
				match(CREATE);
				setState(229);
				match(TABLE);
				setState(233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(230);
					match(IF);
					setState(231);
					match(NOT);
					setState(232);
					match(EXISTS);
					}
					break;
				}
				setState(235);
				qualifiedName();
				setState(236);
				match(T__1);
				setState(237);
				tableElement();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(238);
					match(T__3);
					setState(239);
					tableElement();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				match(T__2);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(246);
					match(COMMENT);
					setState(247);
					string();
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(250);
					match(WITH);
					setState(251);
					properties();
					}
				}

				}
				break;
			case 10:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(DROP);
				setState(255);
				match(TABLE);
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(256);
					match(IF);
					setState(257);
					match(EXISTS);
					}
					break;
				}
				setState(260);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(261);
				match(INSERT);
				setState(262);
				match(INTO);
				setState(263);
				qualifiedName();
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(264);
					columnAliases();
					}
					break;
				}
				setState(267);
				query();
				}
				break;
			case 12:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(269);
				match(DELETE);
				setState(270);
				match(FROM);
				setState(271);
				qualifiedName();
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(272);
					match(WHERE);
					setState(273);
					booleanExpression(0);
					}
				}

				}
				break;
			case 13:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(276);
				match(ALTER);
				setState(277);
				match(TABLE);
				setState(278);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(279);
				match(RENAME);
				setState(280);
				match(TO);
				setState(281);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 14:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(283);
				match(COMMENT);
				setState(284);
				match(ON);
				setState(285);
				match(TABLE);
				setState(286);
				qualifiedName();
				setState(287);
				match(IS);
				setState(290);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(288);
					string();
					}
					break;
				case NULL:
					{
					setState(289);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 15:
				_localctx = new CommentColumnContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(292);
				match(COMMENT);
				setState(293);
				match(ON);
				setState(294);
				match(COLUMN);
				setState(295);
				qualifiedName();
				setState(296);
				match(IS);
				setState(299);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(297);
					string();
					}
					break;
				case NULL:
					{
					setState(298);
					match(NULL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 16:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(301);
				match(ALTER);
				setState(302);
				match(TABLE);
				setState(303);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(304);
				match(RENAME);
				setState(305);
				match(COLUMN);
				setState(306);
				((RenameColumnContext)_localctx).from = identifier();
				setState(307);
				match(TO);
				setState(308);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(310);
				match(ALTER);
				setState(311);
				match(TABLE);
				setState(312);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(313);
				match(DROP);
				setState(314);
				match(COLUMN);
				setState(315);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 18:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(317);
				match(ALTER);
				setState(318);
				match(TABLE);
				setState(319);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(320);
				match(ADD);
				setState(321);
				match(COLUMN);
				setState(322);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 19:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(324);
				match(ANALYZE);
				setState(325);
				qualifiedName();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(326);
					match(WITH);
					setState(327);
					properties();
					}
				}

				}
				break;
			case 20:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(330);
				match(CREATE);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(331);
					match(OR);
					setState(332);
					match(REPLACE);
					}
				}

				setState(335);
				match(VIEW);
				setState(336);
				qualifiedName();
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(337);
					match(COMMENT);
					setState(338);
					string();
					}
				}

				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(341);
					match(SECURITY);
					setState(342);
					_la = _input.LA(1);
					if ( !(_la==DEFINER || _la==INVOKER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(345);
				match(AS);
				setState(346);
				query();
				}
				break;
			case 21:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(348);
				match(DROP);
				setState(349);
				match(VIEW);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(350);
					match(IF);
					setState(351);
					match(EXISTS);
					}
					break;
				}
				setState(354);
				qualifiedName();
				}
				break;
			case 22:
				_localctx = new RenameViewContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(355);
				match(ALTER);
				setState(356);
				match(VIEW);
				setState(357);
				((RenameViewContext)_localctx).from = qualifiedName();
				setState(358);
				match(RENAME);
				setState(359);
				match(TO);
				setState(360);
				((RenameViewContext)_localctx).to = qualifiedName();
				}
				break;
			case 23:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(362);
				match(CALL);
				setState(363);
				qualifiedName();
				setState(364);
				match(T__1);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(365);
					callArgument();
					setState(370);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(366);
						match(T__3);
						setState(367);
						callArgument();
						}
						}
						setState(372);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(375);
				match(T__2);
				}
				break;
			case 24:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(377);
				match(CREATE);
				setState(378);
				match(ROLE);
				setState(379);
				((CreateRoleContext)_localctx).name = identifier();
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(380);
					match(WITH);
					setState(381);
					match(ADMIN);
					setState(382);
					grantor();
					}
				}

				}
				break;
			case 25:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(385);
				match(DROP);
				setState(386);
				match(ROLE);
				setState(387);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 26:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(388);
				match(GRANT);
				setState(389);
				roles();
				setState(390);
				match(TO);
				setState(391);
				principal();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(392);
					match(T__3);
					setState(393);
					principal();
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(399);
					match(WITH);
					setState(400);
					match(ADMIN);
					setState(401);
					match(OPTION);
					}
				}

				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(404);
					match(GRANTED);
					setState(405);
					match(BY);
					setState(406);
					grantor();
					}
				}

				}
				break;
			case 27:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(409);
				match(REVOKE);
				setState(413);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(410);
					match(ADMIN);
					setState(411);
					match(OPTION);
					setState(412);
					match(FOR);
					}
					break;
				}
				setState(415);
				roles();
				setState(416);
				match(FROM);
				setState(417);
				principal();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(418);
					match(T__3);
					setState(419);
					principal();
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(425);
					match(GRANTED);
					setState(426);
					match(BY);
					setState(427);
					grantor();
					}
				}

				}
				break;
			case 28:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(430);
				match(SET);
				setState(431);
				match(ROLE);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(432);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(433);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(434);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 29:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(437);
				match(GRANT);
				setState(448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(438);
					privilege();
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(439);
						match(T__3);
						setState(440);
						privilege();
						}
						}
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(446);
					match(ALL);
					setState(447);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(450);
				match(ON);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(451);
					match(TABLE);
					}
				}

				setState(454);
				qualifiedName();
				setState(455);
				match(TO);
				setState(456);
				((GrantContext)_localctx).grantee = principal();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(457);
					match(WITH);
					setState(458);
					match(GRANT);
					setState(459);
					match(OPTION);
					}
				}

				}
				break;
			case 30:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(462);
				match(REVOKE);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(463);
					match(GRANT);
					setState(464);
					match(OPTION);
					setState(465);
					match(FOR);
					}
				}

				setState(478);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
					{
					setState(468);
					privilege();
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(469);
						match(T__3);
						setState(470);
						privilege();
						}
						}
						setState(475);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(476);
					match(ALL);
					setState(477);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(480);
				match(ON);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(481);
					match(TABLE);
					}
				}

				setState(484);
				qualifiedName();
				setState(485);
				match(FROM);
				setState(486);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 31:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(488);
				match(SHOW);
				setState(489);
				match(GRANTS);
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(490);
					match(ON);
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(491);
						match(TABLE);
						}
					}

					setState(494);
					qualifiedName();
					}
				}

				}
				break;
			case 32:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(497);
				match(EXPLAIN);
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(498);
					match(ANALYZE);
					}
					break;
				}
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(501);
					match(VERBOSE);
					}
				}

				setState(515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(504);
					match(T__1);
					setState(505);
					explainOption();
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(506);
						match(T__3);
						setState(507);
						explainOption();
						}
						}
						setState(512);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(513);
					match(T__2);
					}
					break;
				}
				setState(517);
				statement();
				}
				break;
			case 33:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(518);
				match(SHOW);
				setState(519);
				match(CREATE);
				setState(520);
				match(TABLE);
				setState(521);
				qualifiedName();
				}
				break;
			case 34:
				_localctx = new ShowCreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(522);
				match(SHOW);
				setState(523);
				match(CREATE);
				setState(524);
				match(SCHEMA);
				setState(525);
				qualifiedName();
				}
				break;
			case 35:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(526);
				match(SHOW);
				setState(527);
				match(CREATE);
				setState(528);
				match(VIEW);
				setState(529);
				qualifiedName();
				}
				break;
			case 36:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(530);
				match(SHOW);
				setState(531);
				match(TABLES);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(532);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(533);
					qualifiedName();
					}
				}

				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(536);
					match(LIKE);
					setState(537);
					((ShowTablesContext)_localctx).pattern = string();
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(538);
						match(ESCAPE);
						setState(539);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 37:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(544);
				match(SHOW);
				setState(545);
				match(SCHEMAS);
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(546);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(547);
					identifier();
					}
				}

				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(550);
					match(LIKE);
					setState(551);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(552);
						match(ESCAPE);
						setState(553);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 38:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(558);
				match(SHOW);
				setState(559);
				match(CATALOGS);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(560);
					match(LIKE);
					setState(561);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(562);
						match(ESCAPE);
						setState(563);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 39:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(568);
				match(SHOW);
				setState(569);
				match(COLUMNS);
				setState(570);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXPLAIN - 65)) | (1L << (FETCH - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (INVOKER - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NEXT - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)) | (1L << (OFFSET - 65)) | (1L << (ONLY - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PATH - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRECISION - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIES - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WITHOUT - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(571);
					qualifiedName();
					}
				}

				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(574);
					match(LIKE);
					setState(575);
					((ShowColumnsContext)_localctx).pattern = string();
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(576);
						match(ESCAPE);
						setState(577);
						((ShowColumnsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 40:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(582);
				match(SHOW);
				setState(583);
				match(STATS);
				setState(584);
				match(FOR);
				setState(585);
				qualifiedName();
				}
				break;
			case 41:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(586);
				match(SHOW);
				setState(587);
				match(STATS);
				setState(588);
				match(FOR);
				setState(589);
				match(T__1);
				setState(590);
				querySpecification();
				setState(591);
				match(T__2);
				}
				break;
			case 42:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(593);
				match(SHOW);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(594);
					match(CURRENT);
					}
				}

				setState(597);
				match(ROLES);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(598);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(599);
					identifier();
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(602);
				match(SHOW);
				setState(603);
				match(ROLE);
				setState(604);
				match(GRANTS);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(605);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(606);
					identifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(609);
				match(DESCRIBE);
				setState(610);
				qualifiedName();
				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(611);
				match(DESC);
				setState(612);
				qualifiedName();
				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(613);
				match(SHOW);
				setState(614);
				match(FUNCTIONS);
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(615);
					match(LIKE);
					setState(616);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(617);
						match(ESCAPE);
						setState(618);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 47:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(623);
				match(SHOW);
				setState(624);
				match(SESSION);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(625);
					match(LIKE);
					setState(626);
					((ShowSessionContext)_localctx).pattern = string();
					setState(629);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(627);
						match(ESCAPE);
						setState(628);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 48:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(633);
				match(SET);
				setState(634);
				match(SESSION);
				setState(635);
				qualifiedName();
				setState(636);
				match(EQ);
				setState(637);
				expression();
				}
				break;
			case 49:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(639);
				match(RESET);
				setState(640);
				match(SESSION);
				setState(641);
				qualifiedName();
				}
				break;
			case 50:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(642);
				match(START);
				setState(643);
				match(TRANSACTION);
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(644);
					transactionMode();
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(645);
						match(T__3);
						setState(646);
						transactionMode();
						}
						}
						setState(651);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 51:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(654);
				match(COMMIT);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(655);
					match(WORK);
					}
				}

				}
				break;
			case 52:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(658);
				match(ROLLBACK);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(659);
					match(WORK);
					}
				}

				}
				break;
			case 53:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(662);
				match(PREPARE);
				setState(663);
				identifier();
				setState(664);
				match(FROM);
				setState(665);
				statement();
				}
				break;
			case 54:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(667);
				match(DEALLOCATE);
				setState(668);
				match(PREPARE);
				setState(669);
				identifier();
				}
				break;
			case 55:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(670);
				match(EXECUTE);
				setState(671);
				identifier();
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(672);
					match(USING);
					setState(673);
					expression();
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(674);
						match(T__3);
						setState(675);
						expression();
						}
						}
						setState(680);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 56:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(683);
				match(DESCRIBE);
				setState(684);
				match(INPUT);
				setState(685);
				identifier();
				}
				break;
			case 57:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(686);
				match(DESCRIBE);
				setState(687);
				match(OUTPUT);
				setState(688);
				identifier();
				}
				break;
			case 58:
				_localctx = new SetPathContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(689);
				match(SET);
				setState(690);
				match(PATH);
				setState(691);
				pathSpecification();
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

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(694);
				with();
				}
			}

			setState(697);
			queryNoWith();
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

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(PrestoSqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(WITH);
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(700);
				match(RECURSIVE);
				}
			}

			setState(703);
			namedQuery();
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(704);
				match(T__3);
				setState(705);
				namedQuery();
				}
				}
				setState(710);
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

	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public LikeClauseContext likeClause() {
			return getRuleContext(LikeClauseContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableElement);
		try {
			setState(713);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				likeClause();
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

	public static class ColumnDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PrestoSqlBaseParser.NULL, 0); }
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterColumnDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitColumnDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitColumnDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			identifier();
			setState(716);
			type(0);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(717);
				match(NOT);
				setState(718);
				match(NULL);
				}
			}

			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(721);
				match(COMMENT);
				setState(722);
				string();
				}
			}

			setState(727);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(725);
				match(WITH);
				setState(726);
				properties();
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

	public static class LikeClauseContext extends ParserRuleContext {
		public Token optionType;
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode PROPERTIES() { return getToken(PrestoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode INCLUDING() { return getToken(PrestoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode EXCLUDING() { return getToken(PrestoSqlBaseParser.EXCLUDING, 0); }
		public LikeClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_likeClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLikeClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLikeClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLikeClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LikeClauseContext likeClause() throws RecognitionException {
		LikeClauseContext _localctx = new LikeClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(LIKE);
			setState(730);
			qualifiedName();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(731);
				((LikeClauseContext)_localctx).optionType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EXCLUDING || _la==INCLUDING) ) {
					((LikeClauseContext)_localctx).optionType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(732);
				match(PROPERTIES);
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

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(T__1);
			setState(736);
			property();
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(737);
				match(T__3);
				setState(738);
				property();
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
			match(T__2);
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

	public static class PropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PrestoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			identifier();
			setState(747);
			match(EQ);
			setState(748);
			expression();
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

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token offset;
		public Token limit;
		public Token fetchFirst;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(PrestoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PrestoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode OFFSET() { return getToken(PrestoSqlBaseParser.OFFSET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(PrestoSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(PrestoSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode LIMIT() { return getToken(PrestoSqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(PrestoSqlBaseParser.FETCH, 0); }
		public TerminalNode FIRST() { return getToken(PrestoSqlBaseParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(PrestoSqlBaseParser.NEXT, 0); }
		public List<TerminalNode> ROW() { return getTokens(PrestoSqlBaseParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(PrestoSqlBaseParser.ROW, i);
		}
		public List<TerminalNode> ROWS() { return getTokens(PrestoSqlBaseParser.ROWS); }
		public TerminalNode ROWS(int i) {
			return getToken(PrestoSqlBaseParser.ROWS, i);
		}
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode ONLY() { return getToken(PrestoSqlBaseParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(PrestoSqlBaseParser.TIES, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			queryTerm(0);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(751);
				match(ORDER);
				setState(752);
				match(BY);
				setState(753);
				sortItem();
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(754);
					match(T__3);
					setState(755);
					sortItem();
					}
					}
					setState(760);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(763);
				match(OFFSET);
				setState(764);
				((QueryNoWithContext)_localctx).offset = match(INTEGER_VALUE);
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(765);
					_la = _input.LA(1);
					if ( !(_la==ROW || _la==ROWS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
			}

			setState(783);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				{
				setState(770);
				match(LIMIT);
				setState(771);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case FETCH:
				{
				{
				setState(772);
				match(FETCH);
				setState(773);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(774);
					((QueryNoWithContext)_localctx).fetchFirst = match(INTEGER_VALUE);
					}
				}

				setState(777);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(781);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(778);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(779);
					match(WITH);
					setState(780);
					match(TIES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case EOF:
			case T__2:
			case WITH:
				break;
			default:
				break;
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

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(PrestoSqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(PrestoSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(PrestoSqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(786);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(800);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(788);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(789);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(791);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(790);
							setQuantifier();
							}
						}

						setState(793);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(794);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(795);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(797);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(796);
							setQuantifier();
							}
						}

						setState(799);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(PrestoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_queryPrimary);
		try {
			int _alt;
			setState(821);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(TABLE);
				setState(807);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(808);
				match(VALUES);
				setState(809);
				expression();
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(810);
						match(T__3);
						setState(811);
						expression();
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(817);
				match(T__1);
				setState(818);
				queryNoWith();
				setState(819);
				match(T__2);
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

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(PrestoSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(PrestoSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PrestoSqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(PrestoSqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(PrestoSqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			expression();
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(824);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(827);
				match(NULLS);
				setState(828);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(PrestoSqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(PrestoSqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(PrestoSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PrestoSqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(PrestoSqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(SELECT);
			setState(833);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(832);
				setQuantifier();
				}
				break;
			}
			setState(835);
			selectItem();
			setState(840);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(836);
					match(T__3);
					setState(837);
					selectItem();
					}
					} 
				}
				setState(842);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(843);
				match(FROM);
				setState(844);
				relation(0);
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(845);
						match(T__3);
						setState(846);
						relation(0);
						}
						} 
					}
					setState(851);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			}
			setState(856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(854);
				match(WHERE);
				setState(855);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(861);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(858);
				match(GROUP);
				setState(859);
				match(BY);
				setState(860);
				groupBy();
				}
				break;
			}
			setState(865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(863);
				match(HAVING);
				setState(864);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
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

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(867);
				setQuantifier();
				}
				break;
			}
			setState(870);
			groupingElement();
			setState(875);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					match(T__3);
					setState(872);
					groupingElement();
					}
					} 
				}
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(PrestoSqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(PrestoSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(PrestoSqlBaseParser.CUBE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(PrestoSqlBaseParser.ROLLUP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_groupingElement);
		int _la;
		try {
			setState(918);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(878);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				match(ROLLUP);
				setState(880);
				match(T__1);
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(881);
					expression();
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(882);
						match(T__3);
						setState(883);
						expression();
						}
						}
						setState(888);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(891);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(892);
				match(CUBE);
				setState(893);
				match(T__1);
				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(894);
					expression();
					setState(899);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(895);
						match(T__3);
						setState(896);
						expression();
						}
						}
						setState(901);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(904);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(905);
				match(GROUPING);
				setState(906);
				match(SETS);
				setState(907);
				match(T__1);
				setState(908);
				groupingSet();
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(909);
					match(T__3);
					setState(910);
					groupingSet();
					}
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(916);
				match(T__2);
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

	public static class GroupingSetContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupingSet);
		int _la;
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				match(T__1);
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(921);
					expression();
					setState(926);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(922);
						match(T__3);
						setState(923);
						expression();
						}
						}
						setState(928);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(931);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				expression();
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			((NamedQueryContext)_localctx).name = identifier();
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(936);
				columnAliases();
				}
			}

			setState(939);
			match(AS);
			setState(940);
			match(T__1);
			setState(941);
			query();
			setState(942);
			match(T__2);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(PrestoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
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

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(PrestoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectItem);
		int _la;
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				expression();
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(947);
						match(AS);
						}
					}

					setState(950);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(953);
				primaryExpression(0);
				setState(954);
				match(T__0);
				setState(955);
				match(ASTERISK);
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(956);
					match(AS);
					setState(957);
					columnAliases();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				match(ASTERISK);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(PrestoSqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(PrestoSqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(PrestoSqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(964);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(966);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(980);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(967);
						match(CROSS);
						setState(968);
						match(JOIN);
						setState(969);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(970);
						joinType();
						setState(971);
						match(JOIN);
						setState(972);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(973);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(975);
						match(NATURAL);
						setState(976);
						joinType();
						setState(977);
						match(JOIN);
						setState(978);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(PrestoSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PrestoSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(PrestoSqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(PrestoSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PrestoSqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_joinType);
		int _la;
		try {
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(987);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(990);
				match(LEFT);
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(991);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(994);
				match(RIGHT);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(995);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(998);
				match(FULL);
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(999);
					match(OUTER);
					}
				}

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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(PrestoSqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_joinCriteria);
		int _la;
		try {
			setState(1018);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(ON);
				setState(1005);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(USING);
				setState(1007);
				match(T__1);
				setState(1008);
				identifier();
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1009);
					match(T__3);
					setState(1010);
					identifier();
					}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1016);
				match(T__2);
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

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(PrestoSqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			aliasedRelation();
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				{
				setState(1021);
				match(TABLESAMPLE);
				setState(1022);
				sampleType();
				setState(1023);
				match(T__1);
				setState(1024);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1025);
				match(T__2);
				}
				break;
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

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(PrestoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(PrestoSqlBaseParser.SYSTEM, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_la = _input.LA(1);
			if ( !(_la==BERNOULLI || _la==SYSTEM) ) {
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

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			relationPrimary();
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1033);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1032);
					match(AS);
					}
				}

				setState(1035);
				identifier();
				setState(1037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1036);
					columnAliases();
					}
					break;
				}
				}
				break;
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(T__1);
			setState(1042);
			identifier();
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1043);
				match(T__3);
				setState(1044);
				identifier();
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1050);
			match(T__2);
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

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(PrestoSqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(PrestoSqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LateralContext extends RelationPrimaryContext {
		public TerminalNode LATERAL() { return getToken(PrestoSqlBaseParser.LATERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public LateralContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLateral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLateral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLateral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationPrimary);
		int _la;
		try {
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1052);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1053);
				match(T__1);
				setState(1054);
				query();
				setState(1055);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
				match(UNNEST);
				setState(1058);
				match(T__1);
				setState(1059);
				expression();
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1060);
					match(T__3);
					setState(1061);
					expression();
					}
					}
					setState(1066);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1067);
				match(T__2);
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
				case 1:
					{
					setState(1068);
					match(WITH);
					setState(1069);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new LateralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1072);
				match(LATERAL);
				setState(1073);
				match(T__1);
				setState(1074);
				query();
				setState(1075);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1077);
				match(T__1);
				setState(1078);
				relation(0);
				setState(1079);
				match(T__2);
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

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			booleanExpression(0);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(PrestoSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CASE:
			case CAST:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_PATH:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NORMALIZE:
			case NULL:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRUE:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case STRING:
			case UNICODE_STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1086);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1088);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1087);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1090);
				match(NOT);
				setState(1091);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1094);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1095);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1096);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1097);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1098);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1099);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(PrestoSqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(PrestoSqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(PrestoSqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(PrestoSqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(PrestoSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PrestoSqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(PrestoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ComparisonQuantifierContext comparisonQuantifier() {
			return getRuleContext(ComparisonQuantifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 66, RULE_predicate);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				comparisonOperator();
				setState(1106);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				comparisonOperator();
				setState(1109);
				comparisonQuantifier();
				setState(1110);
				match(T__1);
				setState(1111);
				query();
				setState(1112);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1114);
					match(NOT);
					}
				}

				setState(1117);
				match(BETWEEN);
				setState(1118);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1119);
				match(AND);
				setState(1120);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1122);
					match(NOT);
					}
				}

				setState(1125);
				match(IN);
				setState(1126);
				match(T__1);
				setState(1127);
				expression();
				setState(1132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1128);
					match(T__3);
					setState(1129);
					expression();
					}
					}
					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1135);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1137);
					match(NOT);
					}
				}

				setState(1140);
				match(IN);
				setState(1141);
				match(T__1);
				setState(1142);
				query();
				setState(1143);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1145);
					match(NOT);
					}
				}

				setState(1148);
				match(LIKE);
				setState(1149);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1150);
					match(ESCAPE);
					setState(1151);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1154);
				match(IS);
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1155);
					match(NOT);
					}
				}

				setState(1158);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1159);
				match(IS);
				setState(1161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1160);
					match(NOT);
					}
				}

				setState(1163);
				match(DISTINCT);
				setState(1164);
				match(FROM);
				setState(1165);
				((DistinctFromContext)_localctx).right = valueExpression(0);
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(PrestoSqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(PrestoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(PrestoSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PrestoSqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(PrestoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(PrestoSqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(PrestoSqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1169);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1171);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1174);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1175);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (ASTERISK - 218)) | (1L << (SLASH - 218)) | (1L << (PERCENT - 218)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1176);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1177);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1178);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1179);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1180);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1181);
						match(CONCAT);
						setState(1182);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1183);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1184);
						match(AT);
						setState(1185);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DOUBLE() { return getToken(PrestoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PrestoSqlBaseParser.PRECISION, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(PrestoSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(PrestoSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PrestoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PrestoSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(PrestoSqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(PrestoSqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(PrestoSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(PrestoSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(PrestoSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(PrestoSqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParameterContext extends PrimaryExpressionContext {
		public ParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(PrestoSqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext operand;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(PrestoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(PrestoSqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PrestoSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(PrestoSqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentPathContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_PATH() { return getToken(PrestoSqlBaseParser.CURRENT_PATH, 0); }
		public CurrentPathContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentPath(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(PrestoSqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentUserContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_USER() { return getToken(PrestoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentUser(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(PrestoSqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PrestoSqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(PrestoSqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(PrestoSqlBaseParser.ASTERISK, 0); }
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(PrestoSqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PrestoSqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(PrestoSqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(PrestoSqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(PrestoSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(PrestoSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PrestoSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupingOperationContext extends PrimaryExpressionContext {
		public TerminalNode GROUPING() { return getToken(PrestoSqlBaseParser.GROUPING, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingOperationContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGroupingOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGroupingOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGroupingOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1192);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1193);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1194);
				identifier();
				setState(1195);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1197);
				match(DOUBLE);
				setState(1198);
				match(PRECISION);
				setState(1199);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1200);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1201);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1202);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1203);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1204);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1205);
				match(POSITION);
				setState(1206);
				match(T__1);
				setState(1207);
				valueExpression(0);
				setState(1208);
				match(IN);
				setState(1209);
				valueExpression(0);
				setState(1210);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1212);
				match(T__1);
				setState(1213);
				expression();
				setState(1216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1214);
					match(T__3);
					setState(1215);
					expression();
					}
					}
					setState(1218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1220);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1222);
				match(ROW);
				setState(1223);
				match(T__1);
				setState(1224);
				expression();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1225);
					match(T__3);
					setState(1226);
					expression();
					}
					}
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1232);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1234);
				qualifiedName();
				setState(1235);
				match(T__1);
				setState(1236);
				match(ASTERISK);
				setState(1237);
				match(T__2);
				setState(1239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1238);
					filter();
					}
					break;
				}
				setState(1242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1241);
					over();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1244);
				qualifiedName();
				setState(1245);
				match(T__1);
				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTINCT) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
					case 1:
						{
						setState(1246);
						setQuantifier();
						}
						break;
					}
					setState(1249);
					expression();
					setState(1254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1250);
						match(T__3);
						setState(1251);
						expression();
						}
						}
						setState(1256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1259);
					match(ORDER);
					setState(1260);
					match(BY);
					setState(1261);
					sortItem();
					setState(1266);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1262);
						match(T__3);
						setState(1263);
						sortItem();
						}
						}
						setState(1268);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1271);
				match(T__2);
				setState(1273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1272);
					filter();
					}
					break;
				}
				setState(1279);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1275);
						nullTreatment();
						}
					}

					setState(1278);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1281);
				identifier();
				setState(1282);
				match(T__5);
				setState(1283);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1285);
				match(T__1);
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXPLAIN - 65)) | (1L << (FETCH - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (INVOKER - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NEXT - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)) | (1L << (OFFSET - 65)) | (1L << (ONLY - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PATH - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRECISION - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIES - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WITHOUT - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1286);
					identifier();
					setState(1291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1287);
						match(T__3);
						setState(1288);
						identifier();
						}
						}
						setState(1293);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1296);
				match(T__2);
				setState(1297);
				match(T__5);
				setState(1298);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1299);
				match(T__1);
				setState(1300);
				query();
				setState(1301);
				match(T__2);
				}
				break;
			case 18:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1303);
				match(EXISTS);
				setState(1304);
				match(T__1);
				setState(1305);
				query();
				setState(1306);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1308);
				match(CASE);
				setState(1309);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1310);
					whenClause();
					}
					}
					setState(1313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1315);
					match(ELSE);
					setState(1316);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1319);
				match(END);
				}
				break;
			case 20:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1321);
				match(CASE);
				setState(1323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1322);
					whenClause();
					}
					}
					setState(1325); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1327);
					match(ELSE);
					setState(1328);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1331);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1333);
				match(CAST);
				setState(1334);
				match(T__1);
				setState(1335);
				expression();
				setState(1336);
				match(AS);
				setState(1337);
				type(0);
				setState(1338);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1340);
				match(TRY_CAST);
				setState(1341);
				match(T__1);
				setState(1342);
				expression();
				setState(1343);
				match(AS);
				setState(1344);
				type(0);
				setState(1345);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1347);
				match(ARRAY);
				setState(1348);
				match(T__6);
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MINUTE - 64)) | (1L << (MONTH - 64)) | (1L << (NEXT - 64)) | (1L << (NFC - 64)) | (1L << (NFD - 64)) | (1L << (NFKC - 64)) | (1L << (NFKD - 64)) | (1L << (NO - 64)) | (1L << (NONE - 64)) | (1L << (NORMALIZE - 64)) | (1L << (NOT - 64)) | (1L << (NULL - 64)) | (1L << (NULLIF - 64)) | (1L << (NULLS - 64)) | (1L << (OFFSET - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PATH - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)) | (1L << (SCHEMA - 128)) | (1L << (SCHEMAS - 128)) | (1L << (SECOND - 128)) | (1L << (SECURITY - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (SESSION - 128)) | (1L << (SET - 128)) | (1L << (SETS - 128)) | (1L << (SHOW - 128)) | (1L << (SOME - 128)) | (1L << (START - 128)) | (1L << (STATS - 128)) | (1L << (SUBSTRING - 128)) | (1L << (SYSTEM - 128)) | (1L << (TABLES - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (TEXT - 128)) | (1L << (TIES - 128)) | (1L << (TIME - 128)) | (1L << (TIMESTAMP - 128)) | (1L << (TO - 128)) | (1L << (TRANSACTION - 128)) | (1L << (TRUE - 128)) | (1L << (TRY_CAST - 128)) | (1L << (TYPE - 128)) | (1L << (UNBOUNDED - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (UNCOMMITTED - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)) | (1L << (STRING - 192)) | (1L << (UNICODE_STRING - 192)) | (1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1349);
					expression();
					setState(1354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1350);
						match(T__3);
						setState(1351);
						expression();
						}
						}
						setState(1356);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1359);
				match(T__7);
				}
				break;
			case 24:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1360);
				identifier();
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1361);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1362);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1363);
					match(T__1);
					setState(1364);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1365);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1368);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1369);
					match(T__1);
					setState(1370);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1371);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 28:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1374);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1375);
					match(T__1);
					setState(1376);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1377);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 29:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1380);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1381);
					match(T__1);
					setState(1382);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1383);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1386);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 31:
				{
				_localctx = new CurrentPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1387);
				((CurrentPathContext)_localctx).name = match(CURRENT_PATH);
				}
				break;
			case 32:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1388);
				match(SUBSTRING);
				setState(1389);
				match(T__1);
				setState(1390);
				valueExpression(0);
				setState(1391);
				match(FROM);
				setState(1392);
				valueExpression(0);
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1393);
					match(FOR);
					setState(1394);
					valueExpression(0);
					}
				}

				setState(1397);
				match(T__2);
				}
				break;
			case 33:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1399);
				match(NORMALIZE);
				setState(1400);
				match(T__1);
				setState(1401);
				valueExpression(0);
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1402);
					match(T__3);
					setState(1403);
					normalForm();
					}
				}

				setState(1406);
				match(T__2);
				}
				break;
			case 34:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1408);
				match(EXTRACT);
				setState(1409);
				match(T__1);
				setState(1410);
				identifier();
				setState(1411);
				match(FROM);
				setState(1412);
				valueExpression(0);
				setState(1413);
				match(T__2);
				}
				break;
			case 35:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1415);
				match(T__1);
				setState(1416);
				expression();
				setState(1417);
				match(T__2);
				}
				break;
			case 36:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1419);
				match(GROUPING);
				setState(1420);
				match(T__1);
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXPLAIN - 65)) | (1L << (FETCH - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (INVOKER - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NEXT - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)) | (1L << (OFFSET - 65)) | (1L << (ONLY - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PATH - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRECISION - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIES - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WITHOUT - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)) | (1L << (IDENTIFIER - 195)) | (1L << (DIGIT_IDENTIFIER - 195)) | (1L << (QUOTED_IDENTIFIER - 195)) | (1L << (BACKQUOTED_IDENTIFIER - 195)))) != 0)) {
					{
					setState(1421);
					qualifiedName();
					setState(1426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1422);
						match(T__3);
						setState(1423);
						qualifiedName();
						}
						}
						setState(1428);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1431);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1442);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1434);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1435);
						match(T__6);
						setState(1436);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1437);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1439);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1440);
						match(T__0);
						setState(1441);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode IGNORE() { return getToken(PrestoSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(PrestoSqlBaseParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(PrestoSqlBaseParser.RESPECT, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_nullTreatment);
		try {
			setState(1451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1447);
				match(IGNORE);
				setState(1448);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(RESPECT);
				setState(1450);
				match(NULLS);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnicodeStringLiteralContext extends StringContext {
		public TerminalNode UNICODE_STRING() { return getToken(PrestoSqlBaseParser.UNICODE_STRING, 0); }
		public TerminalNode UESCAPE() { return getToken(PrestoSqlBaseParser.UESCAPE, 0); }
		public TerminalNode STRING() { return getToken(PrestoSqlBaseParser.STRING, 0); }
		public UnicodeStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnicodeStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnicodeStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnicodeStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(PrestoSqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_string);
		try {
			setState(1459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1453);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1454);
				match(UNICODE_STRING);
				setState(1457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1455);
					match(UESCAPE);
					setState(1456);
					match(STRING);
					}
					break;
				}
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(PrestoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PrestoSqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(PrestoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PrestoSqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_timeZoneSpecifier);
		try {
			setState(1467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1461);
				match(TIME);
				setState(1462);
				match(ZONE);
				setState(1463);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1464);
				match(TIME);
				setState(1465);
				match(ZONE);
				setState(1466);
				string();
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(PrestoSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PrestoSqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(PrestoSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(PrestoSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(PrestoSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(PrestoSqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			_la = _input.LA(1);
			if ( !(((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & ((1L << (EQ - 210)) | (1L << (NEQ - 210)) | (1L << (LT - 210)) | (1L << (LTE - 210)) | (1L << (GT - 210)) | (1L << (GTE - 210)))) != 0)) ) {
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

	public static class ComparisonQuantifierContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode SOME() { return getToken(PrestoSqlBaseParser.SOME, 0); }
		public TerminalNode ANY() { return getToken(PrestoSqlBaseParser.ANY, 0); }
		public ComparisonQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterComparisonQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitComparisonQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitComparisonQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonQuantifierContext comparisonQuantifier() throws RecognitionException {
		ComparisonQuantifierContext _localctx = new ComparisonQuantifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PrestoSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PrestoSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(PrestoSqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(PrestoSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			match(INTERVAL);
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1476);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1479);
			string();
			setState(1480);
			((IntervalContext)_localctx).from = intervalField();
			setState(1483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1481);
				match(TO);
				setState(1482);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(PrestoSqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(PrestoSqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(PrestoSqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(PrestoSqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(PrestoSqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(PrestoSqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (HOUR - 84)) | (1L << (MINUTE - 84)) | (1L << (MONTH - 84)))) != 0) || _la==SECOND || _la==YEAR) ) {
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

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(PrestoSqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(PrestoSqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(PrestoSqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(PrestoSqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (NFC - 115)) | (1L << (NFD - 115)) | (1L << (NFKC - 115)) | (1L << (NFKD - 115)))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowTypeContext extends TypeContext {
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public List<RowFieldContext> rowField() {
			return getRuleContexts(RowFieldContext.class);
		}
		public RowFieldContext rowField(int i) {
			return getRuleContext(RowFieldContext.class,i);
		}
		public RowTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRowType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRowType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRowType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalTypeContext extends TypeContext {
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(PrestoSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public IntervalTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterIntervalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitIntervalType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitIntervalType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(PrestoSqlBaseParser.ARRAY, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(PrestoSqlBaseParser.INTEGER_VALUE, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoublePrecisionTypeContext extends TypeContext {
		public TerminalNode DOUBLE() { return getToken(PrestoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PrestoSqlBaseParser.PRECISION, 0); }
		public DoublePrecisionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDoublePrecisionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDoublePrecisionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDoublePrecisionType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyArrayTypeContext extends TypeContext {
		public TerminalNode ARRAY() { return getToken(PrestoSqlBaseParser.ARRAY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LegacyArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLegacyArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLegacyArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLegacyArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericTypeContext extends TypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public GenericTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DateTimeTypeContext extends TypeContext {
		public Token base;
		public TypeParameterContext precision;
		public TerminalNode TIMESTAMP() { return getToken(PrestoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode WITHOUT() { return getToken(PrestoSqlBaseParser.WITHOUT, 0); }
		public List<TerminalNode> TIME() { return getTokens(PrestoSqlBaseParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(PrestoSqlBaseParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(PrestoSqlBaseParser.ZONE, 0); }
		public TypeParameterContext typeParameter() {
			return getRuleContext(TypeParameterContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public DateTimeTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDateTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDateTimeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDateTimeType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyMapTypeContext extends TypeContext {
		public TypeContext keyType;
		public TypeContext valueType;
		public TerminalNode MAP() { return getToken(PrestoSqlBaseParser.MAP, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public LegacyMapTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLegacyMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLegacyMapType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLegacyMapType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1490);
				match(ROW);
				setState(1491);
				match(T__1);
				setState(1492);
				rowField();
				setState(1497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1493);
					match(T__3);
					setState(1494);
					rowField();
					}
					}
					setState(1499);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1500);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1502);
				match(INTERVAL);
				setState(1503);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1504);
					match(TO);
					setState(1505);
					((IntervalTypeContext)_localctx).to = intervalField();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1508);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1509);
					match(T__1);
					setState(1510);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1511);
					match(T__2);
					}
					break;
				}
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1515);
					match(WITHOUT);
					setState(1516);
					match(TIME);
					setState(1517);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 4:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1520);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1521);
					match(T__1);
					setState(1522);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1523);
					match(T__2);
					}
				}

				setState(1527);
				match(WITH);
				setState(1528);
				match(TIME);
				setState(1529);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1530);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1535);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1531);
					match(T__1);
					setState(1532);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1533);
					match(T__2);
					}
					break;
				}
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1537);
					match(WITHOUT);
					setState(1538);
					match(TIME);
					setState(1539);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 6:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1542);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1543);
					match(T__1);
					setState(1544);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1545);
					match(T__2);
					}
				}

				setState(1549);
				match(WITH);
				setState(1550);
				match(TIME);
				setState(1551);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new DoublePrecisionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1552);
				match(DOUBLE);
				setState(1553);
				match(PRECISION);
				}
				break;
			case 8:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1554);
				match(ARRAY);
				setState(1555);
				match(LT);
				setState(1556);
				type(0);
				setState(1557);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1559);
				match(MAP);
				setState(1560);
				match(LT);
				setState(1561);
				((LegacyMapTypeContext)_localctx).keyType = type(0);
				setState(1562);
				match(T__3);
				setState(1563);
				((LegacyMapTypeContext)_localctx).valueType = type(0);
				setState(1564);
				match(GT);
				}
				break;
			case 10:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1566);
				identifier();
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1567);
					match(T__1);
					setState(1568);
					typeParameter();
					setState(1573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1569);
						match(T__3);
						setState(1570);
						typeParameter();
						}
						}
						setState(1575);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1576);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1582);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1583);
					match(ARRAY);
					setState(1587);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						setState(1584);
						match(T__6);
						setState(1585);
						match(INTEGER_VALUE);
						setState(1586);
						match(T__7);
						}
						break;
					}
					}
					} 
				}
				setState(1593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RowFieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RowFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRowField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRowField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRowField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFieldContext rowField() throws RecognitionException {
		RowFieldContext _localctx = new RowFieldContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_rowField);
		try {
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				identifier();
				setState(1596);
				type(0);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PrestoSqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_typeParameter);
		try {
			setState(1602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1601);
				type(0);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(PrestoSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(PrestoSqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			match(WHEN);
			setState(1605);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1606);
			match(THEN);
			setState(1607);
			((WhenClauseContext)_localctx).result = expression();
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

	public static class FilterContext extends ParserRuleContext {
		public TerminalNode FILTER() { return getToken(PrestoSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(PrestoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			match(FILTER);
			setState(1610);
			match(T__1);
			setState(1611);
			match(WHERE);
			setState(1612);
			booleanExpression(0);
			setState(1613);
			match(T__2);
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

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(PrestoSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(PrestoSqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(PrestoSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(PrestoSqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(PrestoSqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(OVER);
			setState(1616);
			match(T__1);
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1617);
				match(PARTITION);
				setState(1618);
				match(BY);
				setState(1619);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1620);
					match(T__3);
					setState(1621);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1629);
				match(ORDER);
				setState(1630);
				match(BY);
				setState(1631);
				sortItem();
				setState(1636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1632);
					match(T__3);
					setState(1633);
					sortItem();
					}
					}
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1641);
				windowFrame();
				}
			}

			setState(1644);
			match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(PrestoSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(PrestoSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(PrestoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_windowFrame);
		try {
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1646);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1647);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1648);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1649);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1650);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1651);
				match(BETWEEN);
				setState(1652);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1653);
				match(AND);
				setState(1654);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1656);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1657);
				match(BETWEEN);
				setState(1658);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1659);
				match(AND);
				setState(1660);
				((WindowFrameContext)_localctx).end = frameBound();
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

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(PrestoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(PrestoSqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(PrestoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PrestoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(PrestoSqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(PrestoSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_frameBound);
		int _la;
		try {
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1664);
				match(UNBOUNDED);
				setState(1665);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(UNBOUNDED);
				setState(1667);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1668);
				match(CURRENT);
				setState(1669);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1670);
				expression();
				setState(1671);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(PrestoSqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(PrestoSqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(PrestoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode JSON() { return getToken(PrestoSqlBaseParser.JSON, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(PrestoSqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(PrestoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(PrestoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode VALIDATE() { return getToken(PrestoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode IO() { return getToken(PrestoSqlBaseParser.IO, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_explainOption);
		int _la;
		try {
			setState(1679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				match(FORMAT);
				setState(1676);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GRAPHVIZ || _la==JSON || _la==TEXT) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1677);
				match(TYPE);
				setState(1678);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (DISTRIBUTED - 55)) | (1L << (IO - 55)) | (1L << (LOGICAL - 55)))) != 0) || _la==VALIDATE) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(PrestoSqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(PrestoSqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(PrestoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(PrestoSqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_transactionMode);
		int _la;
		try {
			setState(1686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1681);
				match(ISOLATION);
				setState(1682);
				match(LEVEL);
				setState(1683);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1684);
				match(READ);
				setState(1685);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ONLY || _la==WRITE) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(PrestoSqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(PrestoSqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(PrestoSqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(PrestoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_levelOfIsolation);
		try {
			setState(1695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1688);
				match(READ);
				setState(1689);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1690);
				match(READ);
				setState(1691);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1692);
				match(REPEATABLE);
				setState(1693);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1694);
				match(SERIALIZABLE);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_callArgument);
		try {
			setState(1702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1697);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1698);
				identifier();
				setState(1699);
				match(T__8);
				setState(1700);
				expression();
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

	public static class PathElementContext extends ParserRuleContext {
		public PathElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathElement; }
	 
		public PathElementContext() { }
		public void copyFrom(PathElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualifiedArgumentContext extends PathElementContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnqualifiedArgumentContext extends PathElementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnqualifiedArgumentContext(PathElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnqualifiedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnqualifiedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnqualifiedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathElementContext pathElement() throws RecognitionException {
		PathElementContext _localctx = new PathElementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_pathElement);
		try {
			setState(1709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new QualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				identifier();
				setState(1705);
				match(T__0);
				setState(1706);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnqualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1708);
				identifier();
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

	public static class PathSpecificationContext extends ParserRuleContext {
		public List<PathElementContext> pathElement() {
			return getRuleContexts(PathElementContext.class);
		}
		public PathElementContext pathElement(int i) {
			return getRuleContext(PathElementContext.class,i);
		}
		public PathSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPathSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPathSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPathSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathSpecificationContext pathSpecification() throws RecognitionException {
		PathSpecificationContext _localctx = new PathSpecificationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_pathSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			pathElement();
			setState(1716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1712);
				match(T__3);
				setState(1713);
				pathElement();
				}
				}
				setState(1718);
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

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PrestoSqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(PrestoSqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(PrestoSqlBaseParser.INSERT, 0); }
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_privilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT) ) {
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			identifier();
			setState(1726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1722);
					match(T__0);
					setState(1723);
					identifier();
					}
					} 
				}
				setState(1728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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

	public static class GrantorContext extends ParserRuleContext {
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
	 
		public GrantorContext() { }
		public void copyFrom(GrantorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CurrentUserGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_USER() { return getToken(PrestoSqlBaseParser.CURRENT_USER, 0); }
		public CurrentUserGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentUserGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentUserGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentUserGrantor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecifiedPrincipalContext extends GrantorContext {
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public SpecifiedPrincipalContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSpecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSpecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSpecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRoleGrantorContext extends GrantorContext {
		public TerminalNode CURRENT_ROLE() { return getToken(PrestoSqlBaseParser.CURRENT_ROLE, 0); }
		public CurrentRoleGrantorContext(GrantorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentRoleGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentRoleGrantor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentRoleGrantor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_grantor);
		try {
			setState(1732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new SpecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				principal();
				}
				break;
			case CURRENT_USER:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1730);
				match(CURRENT_USER);
				}
				break;
			case CURRENT_ROLE:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1731);
				match(CURRENT_ROLE);
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

	public static class PrincipalContext extends ParserRuleContext {
		public PrincipalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principal; }
	 
		public PrincipalContext() { }
		public void copyFrom(PrincipalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnspecifiedPrincipalContext extends PrincipalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnspecifiedPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnspecifiedPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnspecifiedPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnspecifiedPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UserPrincipalContext extends PrincipalContext {
		public TerminalNode USER() { return getToken(PrestoSqlBaseParser.USER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UserPrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUserPrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUserPrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUserPrincipal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RolePrincipalContext extends PrincipalContext {
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RolePrincipalContext(PrincipalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRolePrincipal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRolePrincipal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRolePrincipal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrincipalContext principal() throws RecognitionException {
		PrincipalContext _localctx = new PrincipalContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_principal);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1734);
				identifier();
				}
				break;
			case 2:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1735);
				match(USER);
				setState(1736);
				identifier();
				}
				break;
			case 3:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1737);
				match(ROLE);
				setState(1738);
				identifier();
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

	public static class RolesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRoles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRoles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRoles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RolesContext roles() throws RecognitionException {
		RolesContext _localctx = new RolesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			identifier();
			setState(1746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1742);
				match(T__3);
				setState(1743);
				identifier();
				}
				}
				setState(1748);
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

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(PrestoSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierContext extends IdentifierContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(PrestoSqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(PrestoSqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(PrestoSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_identifier);
		try {
			setState(1754);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1749);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case ALL:
			case ANALYZE:
			case ANY:
			case ARRAY:
			case ASC:
			case AT:
			case AUTHORIZATION:
			case BERNOULLI:
			case CALL:
			case CASCADE:
			case CATALOGS:
			case COLUMN:
			case COLUMNS:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CURRENT:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DISTRIBUTED:
			case DOUBLE:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INPUT:
			case INTERVAL:
			case INVOKER:
			case IO:
			case ISOLATION:
			case JSON:
			case LAST:
			case LATERAL:
			case LEVEL:
			case LIMIT:
			case LOGICAL:
			case MAP:
			case MINUTE:
			case MONTH:
			case NEXT:
			case NFC:
			case NFD:
			case NFKC:
			case NFKD:
			case NO:
			case NONE:
			case NULLIF:
			case NULLS:
			case OFFSET:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PATH:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESPECT:
			case RESTRICT:
			case REVOKE:
			case ROLE:
			case ROLES:
			case ROLLBACK:
			case ROW:
			case ROWS:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSTRING:
			case SYSTEM:
			case TABLES:
			case TABLESAMPLE:
			case TEXT:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TO:
			case TRANSACTION:
			case TRY_CAST:
			case TYPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1751);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1752);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1753);
				match(DIGIT_IDENTIFIER);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(PrestoSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(PrestoSqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PrestoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(PrestoSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_number);
		int _la;
		try {
			setState(1768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1756);
					match(MINUS);
					}
				}

				setState(1759);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1760);
					match(MINUS);
					}
				}

				setState(1763);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1764);
					match(MINUS);
					}
				}

				setState(1767);
				match(INTEGER_VALUE);
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(PrestoSqlBaseParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(PrestoSqlBaseParser.ADMIN, 0); }
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode ANALYZE() { return getToken(PrestoSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANY() { return getToken(PrestoSqlBaseParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(PrestoSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(PrestoSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(PrestoSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(PrestoSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BERNOULLI() { return getToken(PrestoSqlBaseParser.BERNOULLI, 0); }
		public TerminalNode CALL() { return getToken(PrestoSqlBaseParser.CALL, 0); }
		public TerminalNode CASCADE() { return getToken(PrestoSqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOGS() { return getToken(PrestoSqlBaseParser.CATALOGS, 0); }
		public TerminalNode COLUMN() { return getToken(PrestoSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(PrestoSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(PrestoSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(PrestoSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(PrestoSqlBaseParser.COMMITTED, 0); }
		public TerminalNode CURRENT() { return getToken(PrestoSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(PrestoSqlBaseParser.DATA, 0); }
		public TerminalNode DATE() { return getToken(PrestoSqlBaseParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(PrestoSqlBaseParser.DAY, 0); }
		public TerminalNode DEFINER() { return getToken(PrestoSqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(PrestoSqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(PrestoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DOUBLE() { return getToken(PrestoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode EXCLUDING() { return getToken(PrestoSqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(PrestoSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FETCH() { return getToken(PrestoSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(PrestoSqlBaseParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(PrestoSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(PrestoSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(PrestoSqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(PrestoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(PrestoSqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(PrestoSqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(PrestoSqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(PrestoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode HOUR() { return getToken(PrestoSqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(PrestoSqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(PrestoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode INPUT() { return getToken(PrestoSqlBaseParser.INPUT, 0); }
		public TerminalNode INTERVAL() { return getToken(PrestoSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(PrestoSqlBaseParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(PrestoSqlBaseParser.IO, 0); }
		public TerminalNode ISOLATION() { return getToken(PrestoSqlBaseParser.ISOLATION, 0); }
		public TerminalNode JSON() { return getToken(PrestoSqlBaseParser.JSON, 0); }
		public TerminalNode LAST() { return getToken(PrestoSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(PrestoSqlBaseParser.LATERAL, 0); }
		public TerminalNode LEVEL() { return getToken(PrestoSqlBaseParser.LEVEL, 0); }
		public TerminalNode LIMIT() { return getToken(PrestoSqlBaseParser.LIMIT, 0); }
		public TerminalNode LOGICAL() { return getToken(PrestoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(PrestoSqlBaseParser.MAP, 0); }
		public TerminalNode MINUTE() { return getToken(PrestoSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(PrestoSqlBaseParser.MONTH, 0); }
		public TerminalNode NEXT() { return getToken(PrestoSqlBaseParser.NEXT, 0); }
		public TerminalNode NFC() { return getToken(PrestoSqlBaseParser.NFC, 0); }
		public TerminalNode NFD() { return getToken(PrestoSqlBaseParser.NFD, 0); }
		public TerminalNode NFKC() { return getToken(PrestoSqlBaseParser.NFKC, 0); }
		public TerminalNode NFKD() { return getToken(PrestoSqlBaseParser.NFKD, 0); }
		public TerminalNode NO() { return getToken(PrestoSqlBaseParser.NO, 0); }
		public TerminalNode NONE() { return getToken(PrestoSqlBaseParser.NONE, 0); }
		public TerminalNode NULLIF() { return getToken(PrestoSqlBaseParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(PrestoSqlBaseParser.NULLS, 0); }
		public TerminalNode OFFSET() { return getToken(PrestoSqlBaseParser.OFFSET, 0); }
		public TerminalNode ONLY() { return getToken(PrestoSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(PrestoSqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(PrestoSqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(PrestoSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(PrestoSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(PrestoSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PATH() { return getToken(PrestoSqlBaseParser.PATH, 0); }
		public TerminalNode POSITION() { return getToken(PrestoSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(PrestoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(PrestoSqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PrestoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(PrestoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(PrestoSqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public TerminalNode RENAME() { return getToken(PrestoSqlBaseParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(PrestoSqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(PrestoSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(PrestoSqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(PrestoSqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(PrestoSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(PrestoSqlBaseParser.REVOKE, 0); }
		public TerminalNode ROLE() { return getToken(PrestoSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(PrestoSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(PrestoSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PrestoSqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(PrestoSqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(PrestoSqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(PrestoSqlBaseParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(PrestoSqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(PrestoSqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(PrestoSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(PrestoSqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(PrestoSqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(PrestoSqlBaseParser.STATS, 0); }
		public TerminalNode SUBSTRING() { return getToken(PrestoSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYSTEM() { return getToken(PrestoSqlBaseParser.SYSTEM, 0); }
		public TerminalNode TABLES() { return getToken(PrestoSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(PrestoSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TEXT() { return getToken(PrestoSqlBaseParser.TEXT, 0); }
		public TerminalNode TIES() { return getToken(PrestoSqlBaseParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(PrestoSqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PrestoSqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public TerminalNode TRANSACTION() { return getToken(PrestoSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRY_CAST() { return getToken(PrestoSqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(PrestoSqlBaseParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PrestoSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(PrestoSqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode USE() { return getToken(PrestoSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(PrestoSqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(PrestoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(PrestoSqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public TerminalNode WITHOUT() { return getToken(PrestoSqlBaseParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(PrestoSqlBaseParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(PrestoSqlBaseParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(PrestoSqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(PrestoSqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC) | (1L << DISTRIBUTED) | (1L << DOUBLE) | (1L << EXCLUDING))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (EXPLAIN - 65)) | (1L << (FETCH - 65)) | (1L << (FILTER - 65)) | (1L << (FIRST - 65)) | (1L << (FOLLOWING - 65)) | (1L << (FORMAT - 65)) | (1L << (FUNCTIONS - 65)) | (1L << (GRANT - 65)) | (1L << (GRANTED - 65)) | (1L << (GRANTS - 65)) | (1L << (GRAPHVIZ - 65)) | (1L << (HOUR - 65)) | (1L << (IF - 65)) | (1L << (IGNORE - 65)) | (1L << (INCLUDING - 65)) | (1L << (INPUT - 65)) | (1L << (INTERVAL - 65)) | (1L << (INVOKER - 65)) | (1L << (IO - 65)) | (1L << (ISOLATION - 65)) | (1L << (JSON - 65)) | (1L << (LAST - 65)) | (1L << (LATERAL - 65)) | (1L << (LEVEL - 65)) | (1L << (LIMIT - 65)) | (1L << (LOGICAL - 65)) | (1L << (MAP - 65)) | (1L << (MINUTE - 65)) | (1L << (MONTH - 65)) | (1L << (NEXT - 65)) | (1L << (NFC - 65)) | (1L << (NFD - 65)) | (1L << (NFKC - 65)) | (1L << (NFKD - 65)) | (1L << (NO - 65)) | (1L << (NONE - 65)) | (1L << (NULLIF - 65)) | (1L << (NULLS - 65)) | (1L << (OFFSET - 65)) | (1L << (ONLY - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (OPTION - 129)) | (1L << (ORDINALITY - 129)) | (1L << (OUTPUT - 129)) | (1L << (OVER - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PATH - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRECISION - 129)) | (1L << (PRIVILEGES - 129)) | (1L << (PROPERTIES - 129)) | (1L << (RANGE - 129)) | (1L << (READ - 129)) | (1L << (RENAME - 129)) | (1L << (REPEATABLE - 129)) | (1L << (REPLACE - 129)) | (1L << (RESET - 129)) | (1L << (RESPECT - 129)) | (1L << (RESTRICT - 129)) | (1L << (REVOKE - 129)) | (1L << (ROLE - 129)) | (1L << (ROLES - 129)) | (1L << (ROLLBACK - 129)) | (1L << (ROW - 129)) | (1L << (ROWS - 129)) | (1L << (SCHEMA - 129)) | (1L << (SCHEMAS - 129)) | (1L << (SECOND - 129)) | (1L << (SECURITY - 129)) | (1L << (SERIALIZABLE - 129)) | (1L << (SESSION - 129)) | (1L << (SET - 129)) | (1L << (SETS - 129)) | (1L << (SHOW - 129)) | (1L << (SOME - 129)) | (1L << (START - 129)) | (1L << (STATS - 129)) | (1L << (SUBSTRING - 129)) | (1L << (SYSTEM - 129)) | (1L << (TABLES - 129)) | (1L << (TABLESAMPLE - 129)) | (1L << (TEXT - 129)) | (1L << (TIES - 129)) | (1L << (TIME - 129)) | (1L << (TIMESTAMP - 129)) | (1L << (TO - 129)) | (1L << (TRANSACTION - 129)) | (1L << (TRY_CAST - 129)) | (1L << (TYPE - 129)) | (1L << (UNBOUNDED - 129)) | (1L << (UNCOMMITTED - 129)))) != 0) || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (USE - 195)) | (1L << (USER - 195)) | (1L << (VALIDATE - 195)) | (1L << (VERBOSE - 195)) | (1L << (VIEW - 195)) | (1L << (WITHOUT - 195)) | (1L << (WORK - 195)) | (1L << (WRITE - 195)) | (1L << (YEAR - 195)) | (1L << (ZONE - 195)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 23:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 32:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 34:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 35:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 45:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00ee\u06ef\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6\u00a2\n\6\3\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\5\6\u00ab\n\6\3\6\3"+
		"\6\3\6\3\6\5\6\u00b1\n\6\3\6\3\6\5\6\u00b5\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\6"+
		"\3\6\5\6\u00ce\n\6\3\6\3\6\5\6\u00d2\n\6\3\6\3\6\5\6\u00d6\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00de\n\6\3\6\3\6\5\6\u00e2\n\6\3\6\5\6\u00e5\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ec\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f3\n\6\f"+
		"\6\16\6\u00f6\13\6\3\6\3\6\3\6\5\6\u00fb\n\6\3\6\3\6\5\6\u00ff\n\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0105\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u010c\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0115\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0125\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u012e"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014b\n\6\3\6\3\6\3\6\5"+
		"\6\u0150\n\6\3\6\3\6\3\6\3\6\5\6\u0156\n\6\3\6\3\6\5\6\u015a\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u0163\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u0173\n\6\f\6\16\6\u0176\13\6\5\6\u0178\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0182\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6\u018d\n\6\f\6\16\6\u0190\13\6\3\6\3\6\3\6\5\6\u0195\n"+
		"\6\3\6\3\6\3\6\5\6\u019a\n\6\3\6\3\6\3\6\3\6\5\6\u01a0\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u01a7\n\6\f\6\16\6\u01aa\13\6\3\6\3\6\3\6\5\6\u01af\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u01b6\n\6\3\6\3\6\3\6\3\6\7\6\u01bc\n\6\f\6\16"+
		"\6\u01bf\13\6\3\6\3\6\5\6\u01c3\n\6\3\6\3\6\5\6\u01c7\n\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u01cf\n\6\3\6\3\6\3\6\3\6\5\6\u01d5\n\6\3\6\3\6\3\6\7"+
		"\6\u01da\n\6\f\6\16\6\u01dd\13\6\3\6\3\6\5\6\u01e1\n\6\3\6\3\6\5\6\u01e5"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u01ef\n\6\3\6\5\6\u01f2\n\6\3"+
		"\6\3\6\5\6\u01f6\n\6\3\6\5\6\u01f9\n\6\3\6\3\6\3\6\3\6\7\6\u01ff\n\6\f"+
		"\6\16\6\u0202\13\6\3\6\3\6\5\6\u0206\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0219\n\6\3\6\3\6\3\6\3\6\5"+
		"\6\u021f\n\6\5\6\u0221\n\6\3\6\3\6\3\6\3\6\5\6\u0227\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u022d\n\6\5\6\u022f\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0237\n\6\5"+
		"\6\u0239\n\6\3\6\3\6\3\6\3\6\5\6\u023f\n\6\3\6\3\6\3\6\3\6\5\6\u0245\n"+
		"\6\5\6\u0247\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0256\n\6\3\6\3\6\3\6\5\6\u025b\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u0262\n"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u026e\n\6\5\6\u0270\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0278\n\6\5\6\u027a\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u028a\n\6\f\6\16\6\u028d\13"+
		"\6\5\6\u028f\n\6\3\6\3\6\5\6\u0293\n\6\3\6\3\6\5\6\u0297\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u02a7\n\6\f\6\16\6"+
		"\u02aa\13\6\5\6\u02ac\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u02b7"+
		"\n\6\3\7\5\7\u02ba\n\7\3\7\3\7\3\b\3\b\5\b\u02c0\n\b\3\b\3\b\3\b\7\b\u02c5"+
		"\n\b\f\b\16\b\u02c8\13\b\3\t\3\t\5\t\u02cc\n\t\3\n\3\n\3\n\3\n\5\n\u02d2"+
		"\n\n\3\n\3\n\5\n\u02d6\n\n\3\n\3\n\5\n\u02da\n\n\3\13\3\13\3\13\3\13\5"+
		"\13\u02e0\n\13\3\f\3\f\3\f\3\f\7\f\u02e6\n\f\f\f\16\f\u02e9\13\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u02f7\n\16\f\16"+
		"\16\16\u02fa\13\16\5\16\u02fc\n\16\3\16\3\16\3\16\5\16\u0301\n\16\5\16"+
		"\u0303\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u030a\n\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0310\n\16\5\16\u0312\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u031a\n\17\3\17\3\17\3\17\3\17\5\17\u0320\n\17\3\17\7\17\u0323\n\17\f"+
		"\17\16\17\u0326\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u032f\n"+
		"\20\f\20\16\20\u0332\13\20\3\20\3\20\3\20\3\20\5\20\u0338\n\20\3\21\3"+
		"\21\5\21\u033c\n\21\3\21\3\21\5\21\u0340\n\21\3\22\3\22\5\22\u0344\n\22"+
		"\3\22\3\22\3\22\7\22\u0349\n\22\f\22\16\22\u034c\13\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0352\n\22\f\22\16\22\u0355\13\22\5\22\u0357\n\22\3\22\3\22"+
		"\5\22\u035b\n\22\3\22\3\22\3\22\5\22\u0360\n\22\3\22\3\22\5\22\u0364\n"+
		"\22\3\23\5\23\u0367\n\23\3\23\3\23\3\23\7\23\u036c\n\23\f\23\16\23\u036f"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0377\n\24\f\24\16\24\u037a"+
		"\13\24\5\24\u037c\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0384\n\24\f"+
		"\24\16\24\u0387\13\24\5\24\u0389\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u0392\n\24\f\24\16\24\u0395\13\24\3\24\3\24\5\24\u0399\n\24\3"+
		"\25\3\25\3\25\3\25\7\25\u039f\n\25\f\25\16\25\u03a2\13\25\5\25\u03a4\n"+
		"\25\3\25\3\25\5\25\u03a8\n\25\3\26\3\26\5\26\u03ac\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u03b7\n\30\3\30\5\30\u03ba\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u03c1\n\30\3\30\5\30\u03c4\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u03d7\n\31\7\31\u03d9\n\31\f\31\16\31\u03dc\13\31\3\32\5\32"+
		"\u03df\n\32\3\32\3\32\5\32\u03e3\n\32\3\32\3\32\5\32\u03e7\n\32\3\32\3"+
		"\32\5\32\u03eb\n\32\5\32\u03ed\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u03f6\n\33\f\33\16\33\u03f9\13\33\3\33\3\33\5\33\u03fd\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0406\n\34\3\35\3\35\3\36\3\36\5\36"+
		"\u040c\n\36\3\36\3\36\5\36\u0410\n\36\5\36\u0412\n\36\3\37\3\37\3\37\3"+
		"\37\7\37\u0418\n\37\f\37\16\37\u041b\13\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \7 \u0429\n \f \16 \u042c\13 \3 \3 \3 \5 \u0431\n \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u043c\n \3!\3!\3\"\3\"\3\"\5\"\u0443\n\"\3\""+
		"\3\"\5\"\u0447\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u044f\n\"\f\"\16\"\u0452"+
		"\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u045e\n#\3#\3#\3#\3#\3#\3#\5#\u0466"+
		"\n#\3#\3#\3#\3#\3#\7#\u046d\n#\f#\16#\u0470\13#\3#\3#\3#\5#\u0475\n#\3"+
		"#\3#\3#\3#\3#\3#\5#\u047d\n#\3#\3#\3#\3#\5#\u0483\n#\3#\3#\5#\u0487\n"+
		"#\3#\3#\3#\5#\u048c\n#\3#\3#\3#\5#\u0491\n#\3$\3$\3$\3$\5$\u0497\n$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u04a5\n$\f$\16$\u04a8\13$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\6%\u04c3\n%\r%\16%\u04c4\3%\3%\3%\3%\3%\3%\3%\7%\u04ce\n%\f%\16%\u04d1"+
		"\13%\3%\3%\3%\3%\3%\3%\3%\5%\u04da\n%\3%\5%\u04dd\n%\3%\3%\3%\5%\u04e2"+
		"\n%\3%\3%\3%\7%\u04e7\n%\f%\16%\u04ea\13%\5%\u04ec\n%\3%\3%\3%\3%\3%\7"+
		"%\u04f3\n%\f%\16%\u04f6\13%\5%\u04f8\n%\3%\3%\5%\u04fc\n%\3%\5%\u04ff"+
		"\n%\3%\5%\u0502\n%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u050c\n%\f%\16%\u050f\13"+
		"%\5%\u0511\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u0522\n"+
		"%\r%\16%\u0523\3%\3%\5%\u0528\n%\3%\3%\3%\3%\6%\u052e\n%\r%\16%\u052f"+
		"\3%\3%\5%\u0534\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\7%\u054b\n%\f%\16%\u054e\13%\5%\u0550\n%\3%\3%\3%\3%\3%\3"+
		"%\3%\5%\u0559\n%\3%\3%\3%\3%\5%\u055f\n%\3%\3%\3%\3%\5%\u0565\n%\3%\3"+
		"%\3%\3%\5%\u056b\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0576\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\5%\u057f\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\7%\u0593\n%\f%\16%\u0596\13%\5%\u0598\n%\3%\5%\u059b\n%\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\7%\u05a5\n%\f%\16%\u05a8\13%\3&\3&\3&\3&\5&\u05ae\n"+
		"&\3\'\3\'\3\'\3\'\5\'\u05b4\n\'\5\'\u05b6\n\'\3(\3(\3(\3(\3(\3(\5(\u05be"+
		"\n(\3)\3)\3*\3*\3+\3+\3,\3,\5,\u05c8\n,\3,\3,\3,\3,\5,\u05ce\n,\3-\3-"+
		"\3.\3.\3/\3/\3/\3/\3/\3/\7/\u05da\n/\f/\16/\u05dd\13/\3/\3/\3/\3/\3/\3"+
		"/\5/\u05e5\n/\3/\3/\3/\3/\3/\5/\u05ec\n/\3/\3/\3/\5/\u05f1\n/\3/\3/\3"+
		"/\3/\3/\5/\u05f8\n/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0602\n/\3/\3/\3/\5/\u0607"+
		"\n/\3/\3/\3/\3/\3/\5/\u060e\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0626\n/\f/\16/\u0629\13/\3/\3/\5/\u062d"+
		"\n/\5/\u062f\n/\3/\3/\3/\3/\3/\5/\u0636\n/\7/\u0638\n/\f/\16/\u063b\13"+
		"/\3\60\3\60\3\60\3\60\5\60\u0641\n\60\3\61\3\61\5\61\u0645\n\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\64\7\64\u0659\n\64\f\64\16\64\u065c\13\64\5\64\u065e\n\64\3"+
		"\64\3\64\3\64\3\64\3\64\7\64\u0665\n\64\f\64\16\64\u0668\13\64\5\64\u066a"+
		"\n\64\3\64\5\64\u066d\n\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0681\n\65\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u068c\n\66\3\67\3\67\3\67\3\67"+
		"\5\67\u0692\n\67\38\38\38\38\38\58\u0699\n8\39\39\39\39\39\39\39\59\u06a2"+
		"\n9\3:\3:\3:\3:\3:\5:\u06a9\n:\3;\3;\3;\3;\3;\5;\u06b0\n;\3<\3<\3<\7<"+
		"\u06b5\n<\f<\16<\u06b8\13<\3=\3=\3>\3>\3>\7>\u06bf\n>\f>\16>\u06c2\13"+
		">\3?\3?\3?\5?\u06c7\n?\3@\3@\3@\3@\3@\5@\u06ce\n@\3A\3A\3A\7A\u06d3\n"+
		"A\fA\16A\u06d6\13A\3B\3B\3B\3B\3B\5B\u06dd\nB\3C\5C\u06e0\nC\3C\3C\5C"+
		"\u06e4\nC\3C\3C\5C\u06e8\nC\3C\5C\u06eb\nC\3D\3D\3D\2\b\34\60BFH\\E\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\2\33\4\2\34\34\u009b"+
		"\u009b\4\2\64\64aa\4\2LLYY\4\2@@ZZ\3\2\u00a2\u00a3\4\2\16\16\u00e3\u00e3"+
		"\4\2HHtt\4\2??\u00c3\u00c3\4\2\25\25\66\66\4\2HHgg\4\2\16\1688\4\2\30"+
		"\30\u00b2\u00b2\3\2\u00da\u00db\3\2\u00dc\u00de\3\2\u00d4\u00d9\5\2\16"+
		"\16\22\22\u00ae\u00ae\4\2EE\u00bd\u00bd\7\2\62\62VVqr\u00a6\u00a6\u00d2"+
		"\u00d2\3\2ux\4\2II\u008e\u008e\5\2RRff\u00b6\u00b6\6\299bboo\u00c8\u00c8"+
		"\4\2\u0082\u0082\u00d1\u00d1\5\2\65\65]]\u00a8\u00a8.\2\f\16\20\20\22"+
		"\23\25\30\33\34\37$))\60\62\64\64\66\669:@@CCFIKKNRVXZZ\\\\__abddfhjj"+
		"llortz~\u0080\u0082\u0083\u0086\u0086\u0088\u008f\u0091\u0094\u0096\u009c"+
		"\u009e\u00a0\u00a2\u00a7\u00a9\u00b2\u00b4\u00b6\u00b8\u00bc\u00be\u00bf"+
		"\u00c1\u00c2\u00c5\u00c6\u00c8\u00c8\u00ca\u00cb\u00cf\u00d3\2\u0813\2"+
		"\u0088\3\2\2\2\4\u008b\3\2\2\2\6\u008e\3\2\2\2\b\u0091\3\2\2\2\n\u02b6"+
		"\3\2\2\2\f\u02b9\3\2\2\2\16\u02bd\3\2\2\2\20\u02cb\3\2\2\2\22\u02cd\3"+
		"\2\2\2\24\u02db\3\2\2\2\26\u02e1\3\2\2\2\30\u02ec\3\2\2\2\32\u02f0\3\2"+
		"\2\2\34\u0313\3\2\2\2\36\u0337\3\2\2\2 \u0339\3\2\2\2\"\u0341\3\2\2\2"+
		"$\u0366\3\2\2\2&\u0398\3\2\2\2(\u03a7\3\2\2\2*\u03a9\3\2\2\2,\u03b2\3"+
		"\2\2\2.\u03c3\3\2\2\2\60\u03c5\3\2\2\2\62\u03ec\3\2\2\2\64\u03fc\3\2\2"+
		"\2\66\u03fe\3\2\2\28\u0407\3\2\2\2:\u0409\3\2\2\2<\u0413\3\2\2\2>\u043b"+
		"\3\2\2\2@\u043d\3\2\2\2B\u0446\3\2\2\2D\u0490\3\2\2\2F\u0496\3\2\2\2H"+
		"\u059a\3\2\2\2J\u05ad\3\2\2\2L\u05b5\3\2\2\2N\u05bd\3\2\2\2P\u05bf\3\2"+
		"\2\2R\u05c1\3\2\2\2T\u05c3\3\2\2\2V\u05c5\3\2\2\2X\u05cf\3\2\2\2Z\u05d1"+
		"\3\2\2\2\\\u062e\3\2\2\2^\u0640\3\2\2\2`\u0644\3\2\2\2b\u0646\3\2\2\2"+
		"d\u064b\3\2\2\2f\u0651\3\2\2\2h\u0680\3\2\2\2j\u068b\3\2\2\2l\u0691\3"+
		"\2\2\2n\u0698\3\2\2\2p\u06a1\3\2\2\2r\u06a8\3\2\2\2t\u06af\3\2\2\2v\u06b1"+
		"\3\2\2\2x\u06b9\3\2\2\2z\u06bb\3\2\2\2|\u06c6\3\2\2\2~\u06cd\3\2\2\2\u0080"+
		"\u06cf\3\2\2\2\u0082\u06dc\3\2\2\2\u0084\u06ea\3\2\2\2\u0086\u06ec\3\2"+
		"\2\2\u0088\u0089\5\n\6\2\u0089\u008a\7\2\2\3\u008a\3\3\2\2\2\u008b\u008c"+
		"\5@!\2\u008c\u008d\7\2\2\3\u008d\5\3\2\2\2\u008e\u008f\5v<\2\u008f\u0090"+
		"\7\2\2\3\u0090\7\3\2\2\2\u0091\u0092\5\\/\2\u0092\u0093\7\2\2\3\u0093"+
		"\t\3\2\2\2\u0094\u02b7\5\f\7\2\u0095\u0096\7\u00c5\2\2\u0096\u02b7\5\u0082"+
		"B\2\u0097\u0098\7\u00c5\2\2\u0098\u0099\5\u0082B\2\u0099\u009a\7\3\2\2"+
		"\u009a\u009b\5\u0082B\2\u009b\u02b7\3\2\2\2\u009c\u009d\7&\2\2\u009d\u00a1"+
		"\7\u00a4\2\2\u009e\u009f\7W\2\2\u009f\u00a0\7|\2\2\u00a0\u00a2\7B\2\2"+
		"\u00a1\u009e\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6"+
		"\5z>\2\u00a4\u00a5\7\27\2\2\u00a5\u00a7\5~@\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a9\7\u00ce\2\2\u00a9\u00ab"+
		"\5\26\f\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u02b7\3\2\2\2"+
		"\u00ac\u00ad\7;\2\2\u00ad\u00b0\7\u00a4\2\2\u00ae\u00af\7W\2\2\u00af\u00b1"+
		"\7B\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b4\5z>\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2\2"+
		"\2\u00b5\u02b7\3\2\2\2\u00b6\u00b7\7\17\2\2\u00b7\u00b8\7\u00a4\2\2\u00b8"+
		"\u00b9\5z>\2\u00b9\u00ba\7\u0096\2\2\u00ba\u00bb\7\u00bb\2\2\u00bb\u00bc"+
		"\5\u0082B\2\u00bc\u02b7\3\2\2\2\u00bd\u00be\7\17\2\2\u00be\u00bf\7\u00a4"+
		"\2\2\u00bf\u00c0\5z>\2\u00c0\u00c1\7\u00ab\2\2\u00c1\u00c2\7\27\2\2\u00c2"+
		"\u00c3\5~@\2\u00c3\u02b7\3\2\2\2\u00c4\u00c5\7&\2\2\u00c5\u00c9\7\u00b3"+
		"\2\2\u00c6\u00c7\7W\2\2\u00c7\u00c8\7|\2\2\u00c8\u00ca\7B\2\2\u00c9\u00c6"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\5z>\2\u00cc"+
		"\u00ce\5<\37\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d2\5L\'\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d4\7\u00ce\2\2\u00d4\u00d6"+
		"\5\26\f\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00dd\7\24\2\2\u00d8\u00de\5\f\7\2\u00d9\u00da\7\4\2\2\u00da\u00db"+
		"\5\f\7\2\u00db\u00dc\7\5\2\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00de\u00e4\3\2\2\2\u00df\u00e1\7\u00ce\2\2\u00e0\u00e2"+
		"\7y\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e5\7\60\2\2\u00e4\u00df\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u02b7\3"+
		"\2\2\2\u00e6\u00e7\7&\2\2\u00e7\u00eb\7\u00b3\2\2\u00e8\u00e9\7W\2\2\u00e9"+
		"\u00ea\7|\2\2\u00ea\u00ec\7B\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00ec\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\5z>\2\u00ee\u00ef\7\4\2\2\u00ef\u00f4"+
		"\5\20\t\2\u00f0\u00f1\7\6\2\2\u00f1\u00f3\5\20\t\2\u00f2\u00f0\3\2\2\2"+
		"\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\7\5\2\2\u00f8\u00f9\7\"\2\2\u00f9"+
		"\u00fb\5L\'\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fd\7\u00ce\2\2\u00fd\u00ff\5\26\f\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u02b7\3\2\2\2\u0100\u0101\7;\2\2\u0101\u0104"+
		"\7\u00b3\2\2\u0102\u0103\7W\2\2\u0103\u0105\7B\2\2\u0104\u0102\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u02b7\5z>\2\u0107\u0108"+
		"\7]\2\2\u0108\u0109\7`\2\2\u0109\u010b\5z>\2\u010a\u010c\5<\37\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\5\f"+
		"\7\2\u010e\u02b7\3\2\2\2\u010f\u0110\7\65\2\2\u0110\u0111\7L\2\2\u0111"+
		"\u0114\5z>\2\u0112\u0113\7\u00cd\2\2\u0113\u0115\5B\"\2\u0114\u0112\3"+
		"\2\2\2\u0114\u0115\3\2\2\2\u0115\u02b7\3\2\2\2\u0116\u0117\7\17\2\2\u0117"+
		"\u0118\7\u00b3\2\2\u0118\u0119\5z>\2\u0119\u011a\7\u0096\2\2\u011a\u011b"+
		"\7\u00bb\2\2\u011b\u011c\5z>\2\u011c\u02b7\3\2\2\2\u011d\u011e\7\"\2\2"+
		"\u011e\u011f\7\u0081\2\2\u011f\u0120\7\u00b3\2\2\u0120\u0121\5z>\2\u0121"+
		"\u0124\7c\2\2\u0122\u0125\5L\'\2\u0123\u0125\7}\2\2\u0124\u0122\3\2\2"+
		"\2\u0124\u0123\3\2\2\2\u0125\u02b7\3\2\2\2\u0126\u0127\7\"\2\2\u0127\u0128"+
		"\7\u0081\2\2\u0128\u0129\7 \2\2\u0129\u012a\5z>\2\u012a\u012d\7c\2\2\u012b"+
		"\u012e\5L\'\2\u012c\u012e\7}\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2"+
		"\2\u012e\u02b7\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0131\7\u00b3\2\2\u0131"+
		"\u0132\5z>\2\u0132\u0133\7\u0096\2\2\u0133\u0134\7 \2\2\u0134\u0135\5"+
		"\u0082B\2\u0135\u0136\7\u00bb\2\2\u0136\u0137\5\u0082B\2\u0137\u02b7\3"+
		"\2\2\2\u0138\u0139\7\17\2\2\u0139\u013a\7\u00b3\2\2\u013a\u013b\5z>\2"+
		"\u013b\u013c\7;\2\2\u013c\u013d\7 \2\2\u013d\u013e\5z>\2\u013e\u02b7\3"+
		"\2\2\2\u013f\u0140\7\17\2\2\u0140\u0141\7\u00b3\2\2\u0141\u0142\5z>\2"+
		"\u0142\u0143\7\f\2\2\u0143\u0144\7 \2\2\u0144\u0145\5\22\n\2\u0145\u02b7"+
		"\3\2\2\2\u0146\u0147\7\20\2\2\u0147\u014a\5z>\2\u0148\u0149\7\u00ce\2"+
		"\2\u0149\u014b\5\26\f\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b"+
		"\u02b7\3\2\2\2\u014c\u014f\7&\2\2\u014d\u014e\7\u0084\2\2\u014e\u0150"+
		"\7\u0098\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0152\7\u00cb\2\2\u0152\u0155\5z>\2\u0153\u0154\7\"\2\2\u0154"+
		"\u0156\5L\'\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0159\3\2"+
		"\2\2\u0157\u0158\7\u00a7\2\2\u0158\u015a\t\3\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7\24\2\2\u015c\u015d\5"+
		"\f\7\2\u015d\u02b7\3\2\2\2\u015e\u015f\7;\2\2\u015f\u0162\7\u00cb\2\2"+
		"\u0160\u0161\7W\2\2\u0161\u0163\7B\2\2\u0162\u0160\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u02b7\5z>\2\u0165\u0166\7\17\2\2\u0166"+
		"\u0167\7\u00cb\2\2\u0167\u0168\5z>\2\u0168\u0169\7\u0096\2\2\u0169\u016a"+
		"\7\u00bb\2\2\u016a\u016b\5z>\2\u016b\u02b7\3\2\2\2\u016c\u016d\7\33\2"+
		"\2\u016d\u016e\5z>\2\u016e\u0177\7\4\2\2\u016f\u0174\5r:\2\u0170\u0171"+
		"\7\6\2\2\u0171\u0173\5r:\2\u0172\u0170\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0178\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u016f\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\7\5\2\2\u017a\u02b7\3\2\2\2\u017b\u017c\7&\2\2\u017c\u017d\7\u009e"+
		"\2\2\u017d\u0181\5\u0082B\2\u017e\u017f\7\u00ce\2\2\u017f\u0180\7\r\2"+
		"\2\u0180\u0182\5|?\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u02b7"+
		"\3\2\2\2\u0183\u0184\7;\2\2\u0184\u0185\7\u009e\2\2\u0185\u02b7\5\u0082"+
		"B\2\u0186\u0187\7O\2\2\u0187\u0188\5\u0080A\2\u0188\u0189\7\u00bb\2\2"+
		"\u0189\u018e\5~@\2\u018a\u018b\7\6\2\2\u018b\u018d\5~@\2\u018c\u018a\3"+
		"\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0194\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7\u00ce\2\2\u0192\u0193"+
		"\7\r\2\2\u0193\u0195\7\u0083\2\2\u0194\u0191\3\2\2\2\u0194\u0195\3\2\2"+
		"\2\u0195\u0199\3\2\2\2\u0196\u0197\7P\2\2\u0197\u0198\7\32\2\2\u0198\u019a"+
		"\5|?\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u02b7\3\2\2\2\u019b"+
		"\u019f\7\u009c\2\2\u019c\u019d\7\r\2\2\u019d\u019e\7\u0083\2\2\u019e\u01a0"+
		"\7J\2\2\u019f\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\5\u0080A\2\u01a2\u01a3\7L\2\2\u01a3\u01a8\5~@\2\u01a4\u01a5\7\6"+
		"\2\2\u01a5\u01a7\5~@\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ae\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ac\7P\2\2\u01ac\u01ad\7\32\2\2\u01ad\u01af\5|?\2\u01ae\u01ab\3\2\2"+
		"\2\u01ae\u01af\3\2\2\2\u01af\u02b7\3\2\2\2\u01b0\u01b1\7\u00ab\2\2\u01b1"+
		"\u01b5\7\u009e\2\2\u01b2\u01b6\7\16\2\2\u01b3\u01b6\7z\2\2\u01b4\u01b6"+
		"\5\u0082B\2\u01b5\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2"+
		"\2\u01b6\u02b7\3\2\2\2\u01b7\u01c2\7O\2\2\u01b8\u01bd\5x=\2\u01b9\u01ba"+
		"\7\6\2\2\u01ba\u01bc\5x=\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c3\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01c0\u01c1\7\16\2\2\u01c1\u01c3\7\u0091\2\2\u01c2\u01b8\3\2\2\2"+
		"\u01c2\u01c0\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c6\7\u0081\2\2\u01c5"+
		"\u01c7\7\u00b3\2\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01c9\5z>\2\u01c9\u01ca\7\u00bb\2\2\u01ca\u01ce\5~@\2\u01cb"+
		"\u01cc\7\u00ce\2\2\u01cc\u01cd\7O\2\2\u01cd\u01cf\7\u0083\2\2\u01ce\u01cb"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u02b7\3\2\2\2\u01d0\u01d4\7\u009c\2"+
		"\2\u01d1\u01d2\7O\2\2\u01d2\u01d3\7\u0083\2\2\u01d3\u01d5\7J\2\2\u01d4"+
		"\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01e0\3\2\2\2\u01d6\u01db\5x"+
		"=\2\u01d7\u01d8\7\6\2\2\u01d8\u01da\5x=\2\u01d9\u01d7\3\2\2\2\u01da\u01dd"+
		"\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e1\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01de\u01df\7\16\2\2\u01df\u01e1\7\u0091\2\2\u01e0\u01d6"+
		"\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\7\u0081\2"+
		"\2\u01e3\u01e5\7\u00b3\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\5z>\2\u01e7\u01e8\7L\2\2\u01e8\u01e9\5~@\2"+
		"\u01e9\u02b7\3\2\2\2\u01ea\u01eb\7\u00ad\2\2\u01eb\u01f1\7Q\2\2\u01ec"+
		"\u01ee\7\u0081\2\2\u01ed\u01ef\7\u00b3\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\5z>\2\u01f1\u01ec\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u02b7\3\2\2\2\u01f3\u01f5\7C\2\2\u01f4\u01f6\7\20"+
		"\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7"+
		"\u01f9\7\u00ca\2\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u0205"+
		"\3\2\2\2\u01fa\u01fb\7\4\2\2\u01fb\u0200\5l\67\2\u01fc\u01fd\7\6\2\2\u01fd"+
		"\u01ff\5l\67\2\u01fe\u01fc\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe\3\2"+
		"\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\7\5\2\2\u0204\u0206\3\2\2\2\u0205\u01fa\3\2\2\2\u0205\u0206\3\2"+
		"\2\2\u0206\u0207\3\2\2\2\u0207\u02b7\5\n\6\2\u0208\u0209\7\u00ad\2\2\u0209"+
		"\u020a\7&\2\2\u020a\u020b\7\u00b3\2\2\u020b\u02b7\5z>\2\u020c\u020d\7"+
		"\u00ad\2\2\u020d\u020e\7&\2\2\u020e\u020f\7\u00a4\2\2\u020f\u02b7\5z>"+
		"\2\u0210\u0211\7\u00ad\2\2\u0211\u0212\7&\2\2\u0212\u0213\7\u00cb\2\2"+
		"\u0213\u02b7\5z>\2\u0214\u0215\7\u00ad\2\2\u0215\u0218\7\u00b4\2\2\u0216"+
		"\u0217\t\4\2\2\u0217\u0219\5z>\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2"+
		"\2\u0219\u0220\3\2\2\2\u021a\u021b\7k\2\2\u021b\u021e\5L\'\2\u021c\u021d"+
		"\7>\2\2\u021d\u021f\5L\'\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f"+
		"\u0221\3\2\2\2\u0220\u021a\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u02b7\3\2"+
		"\2\2\u0222\u0223\7\u00ad\2\2\u0223\u0226\7\u00a5\2\2\u0224\u0225\t\4\2"+
		"\2\u0225\u0227\5\u0082B\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u022e\3\2\2\2\u0228\u0229\7k\2\2\u0229\u022c\5L\'\2\u022a\u022b\7>\2"+
		"\2\u022b\u022d\5L\'\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f"+
		"\3\2\2\2\u022e\u0228\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u02b7\3\2\2\2\u0230"+
		"\u0231\7\u00ad\2\2\u0231\u0238\7\37\2\2\u0232\u0233\7k\2\2\u0233\u0236"+
		"\5L\'\2\u0234\u0235\7>\2\2\u0235\u0237\5L\'\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0232\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u02b7\3\2\2\2\u023a\u023b\7\u00ad\2\2\u023b\u023c\7!\2\2\u023c"+
		"\u023e\t\4\2\2\u023d\u023f\5z>\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u0246\3\2\2\2\u0240\u0241\7k\2\2\u0241\u0244\5L\'\2\u0242\u0243"+
		"\7>\2\2\u0243\u0245\5L\'\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0240\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u02b7\3\2"+
		"\2\2\u0248\u0249\7\u00ad\2\2\u0249\u024a\7\u00b0\2\2\u024a\u024b\7J\2"+
		"\2\u024b\u02b7\5z>\2\u024c\u024d\7\u00ad\2\2\u024d\u024e\7\u00b0\2\2\u024e"+
		"\u024f\7J\2\2\u024f\u0250\7\4\2\2\u0250\u0251\5\"\22\2\u0251\u0252\7\5"+
		"\2\2\u0252\u02b7\3\2\2\2\u0253\u0255\7\u00ad\2\2\u0254\u0256\7)\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u025a\7\u009f"+
		"\2\2\u0258\u0259\t\4\2\2\u0259\u025b\5\u0082B\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025b\u02b7\3\2\2\2\u025c\u025d\7\u00ad\2\2\u025d\u025e"+
		"\7\u009e\2\2\u025e\u0261\7Q\2\2\u025f\u0260\t\4\2\2\u0260\u0262\5\u0082"+
		"B\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u02b7\3\2\2\2\u0263"+
		"\u0264\7\67\2\2\u0264\u02b7\5z>\2\u0265\u0266\7\66\2\2\u0266\u02b7\5z"+
		">\2\u0267\u0268\7\u00ad\2\2\u0268\u026f\7N\2\2\u0269\u026a\7k\2\2\u026a"+
		"\u026d\5L\'\2\u026b\u026c\7>\2\2\u026c\u026e\5L\'\2\u026d\u026b\3\2\2"+
		"\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0269\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u02b7\3\2\2\2\u0271\u0272\7\u00ad\2\2\u0272\u0279\7\u00aa"+
		"\2\2\u0273\u0274\7k\2\2\u0274\u0277\5L\'\2\u0275\u0276\7>\2\2\u0276\u0278"+
		"\5L\'\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279"+
		"\u0273\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u02b7\3\2\2\2\u027b\u027c\7\u00ab"+
		"\2\2\u027c\u027d\7\u00aa\2\2\u027d\u027e\5z>\2\u027e\u027f\7\u00d4\2\2"+
		"\u027f\u0280\5@!\2\u0280\u02b7\3\2\2\2\u0281\u0282\7\u0099\2\2\u0282\u0283"+
		"\7\u00aa\2\2\u0283\u02b7\5z>\2\u0284\u0285\7\u00af\2\2\u0285\u028e\7\u00bc"+
		"\2\2\u0286\u028b\5n8\2\u0287\u0288\7\6\2\2\u0288\u028a\5n8\2\u0289\u0287"+
		"\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028e\u0286\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u02b7\3\2\2\2\u0290\u0292\7#\2\2\u0291\u0293\7\u00d0\2\2\u0292"+
		"\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u02b7\3\2\2\2\u0294\u0296\7\u00a0"+
		"\2\2\u0295\u0297\7\u00d0\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u02b7\3\2\2\2\u0298\u0299\7\u0090\2\2\u0299\u029a\5\u0082B\2\u029a\u029b"+
		"\7L\2\2\u029b\u029c\5\n\6\2\u029c\u02b7\3\2\2\2\u029d\u029e\7\63\2\2\u029e"+
		"\u029f\7\u0090\2\2\u029f\u02b7\5\u0082B\2\u02a0\u02a1\7A\2\2\u02a1\u02ab"+
		"\5\u0082B\2\u02a2\u02a3\7\u00c7\2\2\u02a3\u02a8\5@!\2\u02a4\u02a5\7\6"+
		"\2\2\u02a5\u02a7\5@!\2\u02a6\u02a4\3\2\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6"+
		"\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02ab"+
		"\u02a2\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b7\3\2\2\2\u02ad\u02ae\7\67"+
		"\2\2\u02ae\u02af\7\\\2\2\u02af\u02b7\5\u0082B\2\u02b0\u02b1\7\67\2\2\u02b1"+
		"\u02b2\7\u0088\2\2\u02b2\u02b7\5\u0082B\2\u02b3\u02b4\7\u00ab\2\2\u02b4"+
		"\u02b5\7\u008c\2\2\u02b5\u02b7\5v<\2\u02b6\u0094\3\2\2\2\u02b6\u0095\3"+
		"\2\2\2\u02b6\u0097\3\2\2\2\u02b6\u009c\3\2\2\2\u02b6\u00ac\3\2\2\2\u02b6"+
		"\u00b6\3\2\2\2\u02b6\u00bd\3\2\2\2\u02b6\u00c4\3\2\2\2\u02b6\u00e6\3\2"+
		"\2\2\u02b6\u0100\3\2\2\2\u02b6\u0107\3\2\2\2\u02b6\u010f\3\2\2\2\u02b6"+
		"\u0116\3\2\2\2\u02b6\u011d\3\2\2\2\u02b6\u0126\3\2\2\2\u02b6\u012f\3\2"+
		"\2\2\u02b6\u0138\3\2\2\2\u02b6\u013f\3\2\2\2\u02b6\u0146\3\2\2\2\u02b6"+
		"\u014c\3\2\2\2\u02b6\u015e\3\2\2\2\u02b6\u0165\3\2\2\2\u02b6\u016c\3\2"+
		"\2\2\u02b6\u017b\3\2\2\2\u02b6\u0183\3\2\2\2\u02b6\u0186\3\2\2\2\u02b6"+
		"\u019b\3\2\2\2\u02b6\u01b0\3\2\2\2\u02b6\u01b7\3\2\2\2\u02b6\u01d0\3\2"+
		"\2\2\u02b6\u01ea\3\2\2\2\u02b6\u01f3\3\2\2\2\u02b6\u0208\3\2\2\2\u02b6"+
		"\u020c\3\2\2\2\u02b6\u0210\3\2\2\2\u02b6\u0214\3\2\2\2\u02b6\u0222\3\2"+
		"\2\2\u02b6\u0230\3\2\2\2\u02b6\u023a\3\2\2\2\u02b6\u0248\3\2\2\2\u02b6"+
		"\u024c\3\2\2\2\u02b6\u0253\3\2\2\2\u02b6\u025c\3\2\2\2\u02b6\u0263\3\2"+
		"\2\2\u02b6\u0265\3\2\2\2\u02b6\u0267\3\2\2\2\u02b6\u0271\3\2\2\2\u02b6"+
		"\u027b\3\2\2\2\u02b6\u0281\3\2\2\2\u02b6\u0284\3\2\2\2\u02b6\u0290\3\2"+
		"\2\2\u02b6\u0294\3\2\2\2\u02b6\u0298\3\2\2\2\u02b6\u029d\3\2\2\2\u02b6"+
		"\u02a0\3\2\2\2\u02b6\u02ad\3\2\2\2\u02b6\u02b0\3\2\2\2\u02b6\u02b3\3\2"+
		"\2\2\u02b7\13\3\2\2\2\u02b8\u02ba\5\16\b\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\5\32\16\2\u02bc\r\3\2\2\2\u02bd"+
		"\u02bf\7\u00ce\2\2\u02be\u02c0\7\u0095\2\2\u02bf\u02be\3\2\2\2\u02bf\u02c0"+
		"\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c6\5*\26\2\u02c2\u02c3\7\6\2\2\u02c3"+
		"\u02c5\5*\26\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\17\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02cc"+
		"\5\22\n\2\u02ca\u02cc\5\24\13\2\u02cb\u02c9\3\2\2\2\u02cb\u02ca\3\2\2"+
		"\2\u02cc\21\3\2\2\2\u02cd\u02ce\5\u0082B\2\u02ce\u02d1\5\\/\2\u02cf\u02d0"+
		"\7|\2\2\u02d0\u02d2\7}\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d5\3\2\2\2\u02d3\u02d4\7\"\2\2\u02d4\u02d6\5L\'\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7\u02d8\7\u00ce\2\2\u02d8"+
		"\u02da\5\26\f\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\23\3\2\2"+
		"\2\u02db\u02dc\7k\2\2\u02dc\u02df\5z>\2\u02dd\u02de\t\5\2\2\u02de\u02e0"+
		"\7\u0092\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\25\3\2\2\2"+
		"\u02e1\u02e2\7\4\2\2\u02e2\u02e7\5\30\r\2\u02e3\u02e4\7\6\2\2\u02e4\u02e6"+
		"\5\30\r\2\u02e5\u02e3\3\2\2\2\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2"+
		"\u02e7\u02e8\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02eb"+
		"\7\5\2\2\u02eb\27\3\2\2\2\u02ec\u02ed\5\u0082B\2\u02ed\u02ee\7\u00d4\2"+
		"\2\u02ee\u02ef\5@!\2\u02ef\31\3\2\2\2\u02f0\u02fb\5\34\17\2\u02f1\u02f2"+
		"\7\u0085\2\2\u02f2\u02f3\7\32\2\2\u02f3\u02f8\5 \21\2\u02f4\u02f5\7\6"+
		"\2\2\u02f5\u02f7\5 \21\2\u02f6\u02f4\3\2\2\2\u02f7\u02fa\3\2\2\2\u02f8"+
		"\u02f6\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2"+
		"\2\2\u02fb\u02f1\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u0302\3\2\2\2\u02fd"+
		"\u02fe\7\u0080\2\2\u02fe\u0300\7\u00e3\2\2\u02ff\u0301\t\6\2\2\u0300\u02ff"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u02fd\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0311\3\2\2\2\u0304\u0305\7l\2\2\u0305\u0312\t\7"+
		"\2\2\u0306\u0307\7F\2\2\u0307\u0309\t\b\2\2\u0308\u030a\7\u00e3\2\2\u0309"+
		"\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030f\t\6"+
		"\2\2\u030c\u0310\7\u0082\2\2\u030d\u030e\7\u00ce\2\2\u030e\u0310\7\u00b8"+
		"\2\2\u030f\u030c\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0312\3\2\2\2\u0311"+
		"\u0304\3\2\2\2\u0311\u0306\3\2\2\2\u0311\u0312\3\2\2\2\u0312\33\3\2\2"+
		"\2\u0313\u0314\b\17\1\2\u0314\u0315\5\36\20\2\u0315\u0324\3\2\2\2\u0316"+
		"\u0317\f\4\2\2\u0317\u0319\7^\2\2\u0318\u031a\5,\27\2\u0319\u0318\3\2"+
		"\2\2\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0323\5\34\17\5\u031c"+
		"\u031d\f\3\2\2\u031d\u031f\t\t\2\2\u031e\u0320\5,\27\2\u031f\u031e\3\2"+
		"\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\5\34\17\4\u0322"+
		"\u0316\3\2\2\2\u0322\u031c\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2"+
		"\2\2\u0324\u0325\3\2\2\2\u0325\35\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0338"+
		"\5\"\22\2\u0328\u0329\7\u00b3\2\2\u0329\u0338\5z>\2\u032a\u032b\7\u00c9"+
		"\2\2\u032b\u0330\5@!\2\u032c\u032d\7\6\2\2\u032d\u032f\5@!\2\u032e\u032c"+
		"\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0338\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7\4\2\2\u0334\u0335\5\32"+
		"\16\2\u0335\u0336\7\5\2\2\u0336\u0338\3\2\2\2\u0337\u0327\3\2\2\2\u0337"+
		"\u0328\3\2\2\2\u0337\u032a\3\2\2\2\u0337\u0333\3\2\2\2\u0338\37\3\2\2"+
		"\2\u0339\u033b\5@!\2\u033a\u033c\t\n\2\2\u033b\u033a\3\2\2\2\u033b\u033c"+
		"\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033e\7\177\2\2\u033e\u0340\t\13\2"+
		"\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340!\3\2\2\2\u0341\u0343"+
		"\7\u00a8\2\2\u0342\u0344\5,\27\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2"+
		"\2\u0344\u0345\3\2\2\2\u0345\u034a\5.\30\2\u0346\u0347\7\6\2\2\u0347\u0349"+
		"\5.\30\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u0356\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034e\7L"+
		"\2\2\u034e\u0353\5\60\31\2\u034f\u0350\7\6\2\2\u0350\u0352\5\60\31\2\u0351"+
		"\u034f\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2"+
		"\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u034d\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0359\7\u00cd\2\2\u0359\u035b"+
		"\5B\"\2\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035f\3\2\2\2\u035c"+
		"\u035d\7S\2\2\u035d\u035e\7\32\2\2\u035e\u0360\5$\23\2\u035f\u035c\3\2"+
		"\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2\2\2\u0361\u0362\7U\2\2\u0362"+
		"\u0364\5B\"\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364#\3\2\2\2\u0365"+
		"\u0367\5,\27\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2"+
		"\2\2\u0368\u036d\5&\24\2\u0369\u036a\7\6\2\2\u036a\u036c\5&\24\2\u036b"+
		"\u0369\3\2\2\2\u036c\u036f\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2"+
		"\2\2\u036e%\3\2\2\2\u036f\u036d\3\2\2\2\u0370\u0399\5(\25\2\u0371\u0372"+
		"\7\u00a1\2\2\u0372\u037b\7\4\2\2\u0373\u0378\5@!\2\u0374\u0375\7\6\2\2"+
		"\u0375\u0377\5@!\2\u0376\u0374\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037c\3\2\2\2\u037a\u0378\3\2\2\2\u037b"+
		"\u0373\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0399\7\5"+
		"\2\2\u037e\u037f\7(\2\2\u037f\u0388\7\4\2\2\u0380\u0385\5@!\2\u0381\u0382"+
		"\7\6\2\2\u0382\u0384\5@!\2\u0383\u0381\3\2\2\2\u0384\u0387\3\2\2\2\u0385"+
		"\u0383\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2"+
		"\2\2\u0388\u0380\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u0399\7\5\2\2\u038b\u038c\7T\2\2\u038c\u038d\7\u00ac\2\2\u038d\u038e"+
		"\7\4\2\2\u038e\u0393\5(\25\2\u038f\u0390\7\6\2\2\u0390\u0392\5(\25\2\u0391"+
		"\u038f\3\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2"+
		"\2\2\u0394\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0397\7\5\2\2\u0397"+
		"\u0399\3\2\2\2\u0398\u0370\3\2\2\2\u0398\u0371\3\2\2\2\u0398\u037e\3\2"+
		"\2\2\u0398\u038b\3\2\2\2\u0399\'\3\2\2\2\u039a\u03a3\7\4\2\2\u039b\u03a0"+
		"\5@!\2\u039c\u039d\7\6\2\2\u039d\u039f\5@!\2\u039e\u039c\3\2\2\2\u039f"+
		"\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a4\3\2"+
		"\2\2\u03a2\u03a0\3\2\2\2\u03a3\u039b\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4"+
		"\u03a5\3\2\2\2\u03a5\u03a8\7\5\2\2\u03a6\u03a8\5@!\2\u03a7\u039a\3\2\2"+
		"\2\u03a7\u03a6\3\2\2\2\u03a8)\3\2\2\2\u03a9\u03ab\5\u0082B\2\u03aa\u03ac"+
		"\5<\37\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad"+
		"\u03ae\7\24\2\2\u03ae\u03af\7\4\2\2\u03af\u03b0\5\f\7\2\u03b0\u03b1\7"+
		"\5\2\2\u03b1+\3\2\2\2\u03b2\u03b3\t\f\2\2\u03b3-\3\2\2\2\u03b4\u03b9\5"+
		"@!\2\u03b5\u03b7\7\24\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7"+
		"\u03b8\3\2\2\2\u03b8\u03ba\5\u0082B\2\u03b9\u03b6\3\2\2\2\u03b9\u03ba"+
		"\3\2\2\2\u03ba\u03c4\3\2\2\2\u03bb\u03bc\5H%\2\u03bc\u03bd\7\3\2\2\u03bd"+
		"\u03c0\7\u00dc\2\2\u03be\u03bf\7\24\2\2\u03bf\u03c1\5<\37\2\u03c0\u03be"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c4\7\u00dc\2"+
		"\2\u03c3\u03b4\3\2\2\2\u03c3\u03bb\3\2\2\2\u03c3\u03c2\3\2\2\2\u03c4/"+
		"\3\2\2\2\u03c5\u03c6\b\31\1\2\u03c6\u03c7\5\66\34\2\u03c7\u03da\3\2\2"+
		"\2\u03c8\u03d6\f\4\2\2\u03c9\u03ca\7\'\2\2\u03ca\u03cb\7e\2\2\u03cb\u03d7"+
		"\5\66\34\2\u03cc\u03cd\5\62\32\2\u03cd\u03ce\7e\2\2\u03ce\u03cf\5\60\31"+
		"\2\u03cf\u03d0\5\64\33\2\u03d0\u03d7\3\2\2\2\u03d1\u03d2\7s\2\2\u03d2"+
		"\u03d3\5\62\32\2\u03d3\u03d4\7e\2\2\u03d4\u03d5\5\66\34\2\u03d5\u03d7"+
		"\3\2\2\2\u03d6\u03c9\3\2\2\2\u03d6\u03cc\3\2\2\2\u03d6\u03d1\3\2\2\2\u03d7"+
		"\u03d9\3\2\2\2\u03d8\u03c8\3\2\2\2\u03d9\u03dc\3\2\2\2\u03da\u03d8\3\2"+
		"\2\2\u03da\u03db\3\2\2\2\u03db\61\3\2\2\2\u03dc\u03da\3\2\2\2\u03dd\u03df"+
		"\7[\2\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03ed\3\2\2\2\u03e0"+
		"\u03e2\7i\2\2\u03e1\u03e3\7\u0087\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3"+
		"\3\2\2\2\u03e3\u03ed\3\2\2\2\u03e4\u03e6\7\u009d\2\2\u03e5\u03e7\7\u0087"+
		"\2\2\u03e6\u03e5\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03ed\3\2\2\2\u03e8"+
		"\u03ea\7M\2\2\u03e9\u03eb\7\u0087\2\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03ed\3\2\2\2\u03ec\u03de\3\2\2\2\u03ec\u03e0\3\2\2\2\u03ec"+
		"\u03e4\3\2\2\2\u03ec\u03e8\3\2\2\2\u03ed\63\3\2\2\2\u03ee\u03ef\7\u0081"+
		"\2\2\u03ef\u03fd\5B\"\2\u03f0\u03f1\7\u00c7\2\2\u03f1\u03f2\7\4\2\2\u03f2"+
		"\u03f7\5\u0082B\2\u03f3\u03f4\7\6\2\2\u03f4\u03f6\5\u0082B\2\u03f5\u03f3"+
		"\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8"+
		"\u03fa\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\5\2\2\u03fb\u03fd\3\2"+
		"\2\2\u03fc\u03ee\3\2\2\2\u03fc\u03f0\3\2\2\2\u03fd\65\3\2\2\2\u03fe\u0405"+
		"\5:\36\2\u03ff\u0400\7\u00b5\2\2\u0400\u0401\58\35\2\u0401\u0402\7\4\2"+
		"\2\u0402\u0403\5@!\2\u0403\u0404\7\5\2\2\u0404\u0406\3\2\2\2\u0405\u03ff"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\67\3\2\2\2\u0407\u0408\t\r\2\2\u0408"+
		"9\3\2\2\2\u0409\u0411\5> \2\u040a\u040c\7\24\2\2\u040b\u040a\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040f\5\u0082B\2\u040e\u0410"+
		"\5<\37\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u0412\3\2\2\2\u0411"+
		"\u040b\3\2\2\2\u0411\u0412\3\2\2\2\u0412;\3\2\2\2\u0413\u0414\7\4\2\2"+
		"\u0414\u0419\5\u0082B\2\u0415\u0416\7\6\2\2\u0416\u0418\5\u0082B\2\u0417"+
		"\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2"+
		"\2\2\u041a\u041c\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u041d\7\5\2\2\u041d"+
		"=\3\2\2\2\u041e\u043c\5z>\2\u041f\u0420\7\4\2\2\u0420\u0421\5\f\7\2\u0421"+
		"\u0422\7\5\2\2\u0422\u043c\3\2\2\2\u0423\u0424\7\u00c4\2\2\u0424\u0425"+
		"\7\4\2\2\u0425\u042a\5@!\2\u0426\u0427\7\6\2\2\u0427\u0429\5@!\2\u0428"+
		"\u0426\3\2\2\2\u0429\u042c\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u042b\3\2"+
		"\2\2\u042b\u042d\3\2\2\2\u042c\u042a\3\2\2\2\u042d\u0430\7\5\2\2\u042e"+
		"\u042f\7\u00ce\2\2\u042f\u0431\7\u0086\2\2\u0430\u042e\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u043c\3\2\2\2\u0432\u0433\7h\2\2\u0433\u0434\7\4\2\2\u0434"+
		"\u0435\5\f\7\2\u0435\u0436\7\5\2\2\u0436\u043c\3\2\2\2\u0437\u0438\7\4"+
		"\2\2\u0438\u0439\5\60\31\2\u0439\u043a\7\5\2\2\u043a\u043c\3\2\2\2\u043b"+
		"\u041e\3\2\2\2\u043b\u041f\3\2\2\2\u043b\u0423\3\2\2\2\u043b\u0432\3\2"+
		"\2\2\u043b\u0437\3\2\2\2\u043c?\3\2\2\2\u043d\u043e\5B\"\2\u043eA\3\2"+
		"\2\2\u043f\u0440\b\"\1\2\u0440\u0442\5F$\2\u0441\u0443\5D#\2\u0442\u0441"+
		"\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0447\3\2\2\2\u0444\u0445\7|\2\2\u0445"+
		"\u0447\5B\"\5\u0446\u043f\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0450\3\2"+
		"\2\2\u0448\u0449\f\4\2\2\u0449\u044a\7\21\2\2\u044a\u044f\5B\"\5\u044b"+
		"\u044c\f\3\2\2\u044c\u044d\7\u0084\2\2\u044d\u044f\5B\"\4\u044e\u0448"+
		"\3\2\2\2\u044e\u044b\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451C\3\2\2\2\u0452\u0450\3\2\2\2\u0453\u0454\5P)\2\u0454"+
		"\u0455\5F$\2\u0455\u0491\3\2\2\2\u0456\u0457\5P)\2\u0457\u0458\5R*\2\u0458"+
		"\u0459\7\4\2\2\u0459\u045a\5\f\7\2\u045a\u045b\7\5\2\2\u045b\u0491\3\2"+
		"\2\2\u045c\u045e\7|\2\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e"+
		"\u045f\3\2\2\2\u045f\u0460\7\31\2\2\u0460\u0461\5F$\2\u0461\u0462\7\21"+
		"\2\2\u0462\u0463\5F$\2\u0463\u0491\3\2\2\2\u0464\u0466\7|\2\2\u0465\u0464"+
		"\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\7Y\2\2\u0468"+
		"\u0469\7\4\2\2\u0469\u046e\5@!\2\u046a\u046b\7\6\2\2\u046b\u046d\5@!\2"+
		"\u046c\u046a\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0471\3\2\2\2\u0470\u046e\3\2\2\2\u0471\u0472\7\5\2\2\u0472"+
		"\u0491\3\2\2\2\u0473\u0475\7|\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0476\3\2\2\2\u0476\u0477\7Y\2\2\u0477\u0478\7\4\2\2\u0478"+
		"\u0479\5\f\7\2\u0479\u047a\7\5\2\2\u047a\u0491\3\2\2\2\u047b\u047d\7|"+
		"\2\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u047f\7k\2\2\u047f\u0482\5F$\2\u0480\u0481\7>\2\2\u0481\u0483\5F$\2\u0482"+
		"\u0480\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0491\3\2\2\2\u0484\u0486\7c"+
		"\2\2\u0485\u0487\7|\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u0491\7}\2\2\u0489\u048b\7c\2\2\u048a\u048c\7|\2"+
		"\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e"+
		"\78\2\2\u048e\u048f\7L\2\2\u048f\u0491\5F$\2\u0490\u0453\3\2\2\2\u0490"+
		"\u0456\3\2\2\2\u0490\u045d\3\2\2\2\u0490\u0465\3\2\2\2\u0490\u0474\3\2"+
		"\2\2\u0490\u047c\3\2\2\2\u0490\u0484\3\2\2\2\u0490\u0489\3\2\2\2\u0491"+
		"E\3\2\2\2\u0492\u0493\b$\1\2\u0493\u0497\5H%\2\u0494\u0495\t\16\2\2\u0495"+
		"\u0497\5F$\6\u0496\u0492\3\2\2\2\u0496\u0494\3\2\2\2\u0497\u04a6\3\2\2"+
		"\2\u0498\u0499\f\5\2\2\u0499\u049a\t\17\2\2\u049a\u04a5\5F$\6\u049b\u049c"+
		"\f\4\2\2\u049c\u049d\t\16\2\2\u049d\u04a5\5F$\5\u049e\u049f\f\3\2\2\u049f"+
		"\u04a0\7\u00df\2\2\u04a0\u04a5\5F$\4\u04a1\u04a2\f\7\2\2\u04a2\u04a3\7"+
		"\26\2\2\u04a3\u04a5\5N(\2\u04a4\u0498\3\2\2\2\u04a4\u049b\3\2\2\2\u04a4"+
		"\u049e\3\2\2\2\u04a4\u04a1\3\2\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a4\3\2"+
		"\2\2\u04a6\u04a7\3\2\2\2\u04a7G\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a9\u04aa"+
		"\b%\1\2\u04aa\u059b\7}\2\2\u04ab\u059b\5V,\2\u04ac\u04ad\5\u0082B\2\u04ad"+
		"\u04ae\5L\'\2\u04ae\u059b\3\2\2\2\u04af\u04b0\7:\2\2\u04b0\u04b1\7\u008f"+
		"\2\2\u04b1\u059b\5L\'\2\u04b2\u059b\5\u0084C\2\u04b3\u059b\5T+\2\u04b4"+
		"\u059b\5L\'\2\u04b5\u059b\7\u00e2\2\2\u04b6\u059b\7\7\2\2\u04b7\u04b8"+
		"\7\u008d\2\2\u04b8\u04b9\7\4\2\2\u04b9\u04ba\5F$\2\u04ba\u04bb\7Y\2\2"+
		"\u04bb\u04bc\5F$\2\u04bc\u04bd\7\5\2\2\u04bd\u059b\3\2\2\2\u04be\u04bf"+
		"\7\4\2\2\u04bf\u04c2\5@!\2\u04c0\u04c1\7\6\2\2\u04c1\u04c3\5@!\2\u04c2"+
		"\u04c0\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2"+
		"\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c7\7\5\2\2\u04c7\u059b\3\2\2\2\u04c8"+
		"\u04c9\7\u00a2\2\2\u04c9\u04ca\7\4\2\2\u04ca\u04cf\5@!\2\u04cb\u04cc\7"+
		"\6\2\2\u04cc\u04ce\5@!\2\u04cd\u04cb\3\2\2\2\u04ce\u04d1\3\2\2\2\u04cf"+
		"\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\3\2\2\2\u04d1\u04cf\3\2"+
		"\2\2\u04d2\u04d3\7\5\2\2\u04d3\u059b\3\2\2\2\u04d4\u04d5\5z>\2\u04d5\u04d6"+
		"\7\4\2\2\u04d6\u04d7\7\u00dc\2\2\u04d7\u04d9\7\5\2\2\u04d8\u04da\5d\63"+
		"\2\u04d9\u04d8\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04dc\3\2\2\2\u04db\u04dd"+
		"\5f\64\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u059b\3\2\2\2\u04de"+
		"\u04df\5z>\2\u04df\u04eb\7\4\2\2\u04e0\u04e2\5,\27\2\u04e1\u04e0\3\2\2"+
		"\2\u04e1\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e8\5@!\2\u04e4\u04e5"+
		"\7\6\2\2\u04e5\u04e7\5@!\2\u04e6\u04e4\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8"+
		"\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ec\3\2\2\2\u04ea\u04e8\3\2"+
		"\2\2\u04eb\u04e1\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04f7\3\2\2\2\u04ed"+
		"\u04ee\7\u0085\2\2\u04ee\u04ef\7\32\2\2\u04ef\u04f4\5 \21\2\u04f0\u04f1"+
		"\7\6\2\2\u04f1\u04f3\5 \21\2\u04f2\u04f0\3\2\2\2\u04f3\u04f6\3\2\2\2\u04f4"+
		"\u04f2\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2"+
		"\2\2\u04f7\u04ed\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fb\7\5\2\2\u04fa\u04fc\5d\63\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2"+
		"\2\2\u04fc\u0501\3\2\2\2\u04fd\u04ff\5J&\2\u04fe\u04fd\3\2\2\2\u04fe\u04ff"+
		"\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\5f\64\2\u0501\u04fe\3\2\2\2\u0501"+
		"\u0502\3\2\2\2\u0502\u059b\3\2\2\2\u0503\u0504\5\u0082B\2\u0504\u0505"+
		"\7\b\2\2\u0505\u0506\5@!\2\u0506\u059b\3\2\2\2\u0507\u0510\7\4\2\2\u0508"+
		"\u050d\5\u0082B\2\u0509\u050a\7\6\2\2\u050a\u050c\5\u0082B\2\u050b\u0509"+
		"\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0508\3\2\2\2\u0510\u0511\3\2"+
		"\2\2\u0511\u0512\3\2\2\2\u0512\u0513\7\5\2\2\u0513\u0514\7\b\2\2\u0514"+
		"\u059b\5@!\2\u0515\u0516\7\4\2\2\u0516\u0517\5\f\7\2\u0517\u0518\7\5\2"+
		"\2\u0518\u059b\3\2\2\2\u0519\u051a\7B\2\2\u051a\u051b\7\4\2\2\u051b\u051c"+
		"\5\f\7\2\u051c\u051d\7\5\2\2\u051d\u059b\3\2\2\2\u051e\u051f\7\35\2\2"+
		"\u051f\u0521\5@!\2\u0520\u0522\5b\62\2\u0521\u0520\3\2\2\2\u0522\u0523"+
		"\3\2\2\2\u0523\u0521\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0527\3\2\2\2\u0525"+
		"\u0526\7<\2\2\u0526\u0528\5@!\2\u0527\u0525\3\2\2\2\u0527\u0528\3\2\2"+
		"\2\u0528\u0529\3\2\2\2\u0529\u052a\7=\2\2\u052a\u059b\3\2\2\2\u052b\u052d"+
		"\7\35\2\2\u052c\u052e\5b\62\2\u052d\u052c\3\2\2\2\u052e\u052f\3\2\2\2"+
		"\u052f\u052d\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u0532"+
		"\7<\2\2\u0532\u0534\5@!\2\u0533\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534"+
		"\u0535\3\2\2\2\u0535\u0536\7=\2\2\u0536\u059b\3\2\2\2\u0537\u0538\7\36"+
		"\2\2\u0538\u0539\7\4\2\2\u0539\u053a\5@!\2\u053a\u053b\7\24\2\2\u053b"+
		"\u053c\5\\/\2\u053c\u053d\7\5\2\2\u053d\u059b\3\2\2\2\u053e\u053f\7\u00be"+
		"\2\2\u053f\u0540\7\4\2\2\u0540\u0541\5@!\2\u0541\u0542\7\24\2\2\u0542"+
		"\u0543\5\\/\2\u0543\u0544\7\5\2\2\u0544\u059b\3\2\2\2\u0545\u0546\7\23"+
		"\2\2\u0546\u054f\7\t\2\2\u0547\u054c\5@!\2\u0548\u0549\7\6\2\2\u0549\u054b"+
		"\5@!\2\u054a\u0548\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c"+
		"\u054d\3\2\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0547\3\2"+
		"\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u059b\7\n\2\2\u0552"+
		"\u059b\5\u0082B\2\u0553\u059b\7*\2\2\u0554\u0558\7-\2\2\u0555\u0556\7"+
		"\4\2\2\u0556\u0557\7\u00e3\2\2\u0557\u0559\7\5\2\2\u0558\u0555\3\2\2\2"+
		"\u0558\u0559\3\2\2\2\u0559\u059b\3\2\2\2\u055a\u055e\7.\2\2\u055b\u055c"+
		"\7\4\2\2\u055c\u055d\7\u00e3\2\2\u055d\u055f\7\5\2\2\u055e\u055b\3\2\2"+
		"\2\u055e\u055f\3\2\2\2\u055f\u059b\3\2\2\2\u0560\u0564\7m\2\2\u0561\u0562"+
		"\7\4\2\2\u0562\u0563\7\u00e3\2\2\u0563\u0565\7\5\2\2\u0564\u0561\3\2\2"+
		"\2\u0564\u0565\3\2\2\2\u0565\u059b\3\2\2\2\u0566\u056a\7n\2\2\u0567\u0568"+
		"\7\4\2\2\u0568\u0569\7\u00e3\2\2\u0569\u056b\7\5\2\2\u056a\u0567\3\2\2"+
		"\2\u056a\u056b\3\2\2\2\u056b\u059b\3\2\2\2\u056c\u059b\7/\2\2\u056d\u059b"+
		"\7+\2\2\u056e\u056f\7\u00b1\2\2\u056f\u0570\7\4\2\2\u0570\u0571\5F$\2"+
		"\u0571\u0572\7L\2\2\u0572\u0575\5F$\2\u0573\u0574\7J\2\2\u0574\u0576\5"+
		"F$\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u0578\7\5\2\2\u0578\u059b\3\2\2\2\u0579\u057a\7{\2\2\u057a\u057b\7\4"+
		"\2\2\u057b\u057e\5F$\2\u057c\u057d\7\6\2\2\u057d\u057f\5Z.\2\u057e\u057c"+
		"\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\7\5\2\2\u0581"+
		"\u059b\3\2\2\2\u0582\u0583\7D\2\2\u0583\u0584\7\4\2\2\u0584\u0585\5\u0082"+
		"B\2\u0585\u0586\7L\2\2\u0586\u0587\5F$\2\u0587\u0588\7\5\2\2\u0588\u059b"+
		"\3\2\2\2\u0589\u058a\7\4\2\2\u058a\u058b\5@!\2\u058b\u058c\7\5\2\2\u058c"+
		"\u059b\3\2\2\2\u058d\u058e\7T\2\2\u058e\u0597\7\4\2\2\u058f\u0594\5z>"+
		"\2\u0590\u0591\7\6\2\2\u0591\u0593\5z>\2\u0592\u0590\3\2\2\2\u0593\u0596"+
		"\3\2\2\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0598\3\2\2\2\u0596"+
		"\u0594\3\2\2\2\u0597\u058f\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2"+
		"\2\2\u0599\u059b\7\5\2\2\u059a\u04a9\3\2\2\2\u059a\u04ab\3\2\2\2\u059a"+
		"\u04ac\3\2\2\2\u059a\u04af\3\2\2\2\u059a\u04b2\3\2\2\2\u059a\u04b3\3\2"+
		"\2\2\u059a\u04b4\3\2\2\2\u059a\u04b5\3\2\2\2\u059a\u04b6\3\2\2\2\u059a"+
		"\u04b7\3\2\2\2\u059a\u04be\3\2\2\2\u059a\u04c8\3\2\2\2\u059a\u04d4\3\2"+
		"\2\2\u059a\u04de\3\2\2\2\u059a\u0503\3\2\2\2\u059a\u0507\3\2\2\2\u059a"+
		"\u0515\3\2\2\2\u059a\u0519\3\2\2\2\u059a\u051e\3\2\2\2\u059a\u052b\3\2"+
		"\2\2\u059a\u0537\3\2\2\2\u059a\u053e\3\2\2\2\u059a\u0545\3\2\2\2\u059a"+
		"\u0552\3\2\2\2\u059a\u0553\3\2\2\2\u059a\u0554\3\2\2\2\u059a\u055a\3\2"+
		"\2\2\u059a\u0560\3\2\2\2\u059a\u0566\3\2\2\2\u059a\u056c\3\2\2\2\u059a"+
		"\u056d\3\2\2\2\u059a\u056e\3\2\2\2\u059a\u0579\3\2\2\2\u059a\u0582\3\2"+
		"\2\2\u059a\u0589\3\2\2\2\u059a\u058d\3\2\2\2\u059b\u05a6\3\2\2\2\u059c"+
		"\u059d\f\21\2\2\u059d\u059e\7\t\2\2\u059e\u059f\5F$\2\u059f\u05a0\7\n"+
		"\2\2\u05a0\u05a5\3\2\2\2\u05a1\u05a2\f\17\2\2\u05a2\u05a3\7\3\2\2\u05a3"+
		"\u05a5\5\u0082B\2\u05a4\u059c\3\2\2\2\u05a4\u05a1\3\2\2\2\u05a5\u05a8"+
		"\3\2\2\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7I\3\2\2\2\u05a8"+
		"\u05a6\3\2\2\2\u05a9\u05aa\7X\2\2\u05aa\u05ae\7\177\2\2\u05ab\u05ac\7"+
		"\u009a\2\2\u05ac\u05ae\7\177\2\2\u05ad\u05a9\3\2\2\2\u05ad\u05ab\3\2\2"+
		"\2\u05aeK\3\2\2\2\u05af\u05b6\7\u00e0\2\2\u05b0\u05b3\7\u00e1\2\2\u05b1"+
		"\u05b2\7\u00c0\2\2\u05b2\u05b4\7\u00e0\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b4"+
		"\3\2\2\2\u05b4\u05b6\3\2\2\2\u05b5\u05af\3\2\2\2\u05b5\u05b0\3\2\2\2\u05b6"+
		"M\3\2\2\2\u05b7\u05b8\7\u00b9\2\2\u05b8\u05b9\7\u00d3\2\2\u05b9\u05be"+
		"\5V,\2\u05ba\u05bb\7\u00b9\2\2\u05bb\u05bc\7\u00d3\2\2\u05bc\u05be\5L"+
		"\'\2\u05bd\u05b7\3\2\2\2\u05bd\u05ba\3\2\2\2\u05beO\3\2\2\2\u05bf\u05c0"+
		"\t\20\2\2\u05c0Q\3\2\2\2\u05c1\u05c2\t\21\2\2\u05c2S\3\2\2\2\u05c3\u05c4"+
		"\t\22\2\2\u05c4U\3\2\2\2\u05c5\u05c7\7_\2\2\u05c6\u05c8\t\16\2\2\u05c7"+
		"\u05c6\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\5L"+
		"\'\2\u05ca\u05cd\5X-\2\u05cb\u05cc\7\u00bb\2\2\u05cc\u05ce\5X-\2\u05cd"+
		"\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ceW\3\2\2\2\u05cf\u05d0\t\23\2\2"+
		"\u05d0Y\3\2\2\2\u05d1\u05d2\t\24\2\2\u05d2[\3\2\2\2\u05d3\u05d4\b/\1\2"+
		"\u05d4\u05d5\7\u00a2\2\2\u05d5\u05d6\7\4\2\2\u05d6\u05db\5^\60\2\u05d7"+
		"\u05d8\7\6\2\2\u05d8\u05da\5^\60\2\u05d9\u05d7\3\2\2\2\u05da\u05dd\3\2"+
		"\2\2\u05db\u05d9\3\2\2\2\u05db\u05dc\3\2\2\2\u05dc\u05de\3\2\2\2\u05dd"+
		"\u05db\3\2\2\2\u05de\u05df\7\5\2\2\u05df\u062f\3\2\2\2\u05e0\u05e1\7_"+
		"\2\2\u05e1\u05e4\5X-\2\u05e2\u05e3\7\u00bb\2\2\u05e3\u05e5\5X-\2\u05e4"+
		"\u05e2\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u062f\3\2\2\2\u05e6\u05eb\7\u00ba"+
		"\2\2\u05e7\u05e8\7\4\2\2\u05e8\u05e9\5`\61\2\u05e9\u05ea\7\5\2\2\u05ea"+
		"\u05ec\3\2\2\2\u05eb\u05e7\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f0\3\2"+
		"\2\2\u05ed\u05ee\7\u00cf\2\2\u05ee\u05ef\7\u00b9\2\2\u05ef\u05f1\7\u00d3"+
		"\2\2\u05f0\u05ed\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u062f\3\2\2\2\u05f2"+
		"\u05f7\7\u00ba\2\2\u05f3\u05f4\7\4\2\2\u05f4\u05f5\5`\61\2\u05f5\u05f6"+
		"\7\5\2\2\u05f6\u05f8\3\2\2\2\u05f7\u05f3\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8"+
		"\u05f9\3\2\2\2\u05f9\u05fa\7\u00ce\2\2\u05fa\u05fb\7\u00b9\2\2\u05fb\u062f"+
		"\7\u00d3\2\2\u05fc\u0601\7\u00b9\2\2\u05fd\u05fe\7\4\2\2\u05fe\u05ff\5"+
		"`\61\2\u05ff\u0600\7\5\2\2\u0600\u0602\3\2\2\2\u0601\u05fd\3\2\2\2\u0601"+
		"\u0602\3\2\2\2\u0602\u0606\3\2\2\2\u0603\u0604\7\u00cf\2\2\u0604\u0605"+
		"\7\u00b9\2\2\u0605\u0607\7\u00d3\2\2\u0606\u0603\3\2\2\2\u0606\u0607\3"+
		"\2\2\2\u0607\u062f\3\2\2\2\u0608\u060d\7\u00b9\2\2\u0609\u060a\7\4\2\2"+
		"\u060a\u060b\5`\61\2\u060b\u060c\7\5\2\2\u060c\u060e\3\2\2\2\u060d\u0609"+
		"\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610\7\u00ce\2"+
		"\2\u0610\u0611\7\u00b9\2\2\u0611\u062f\7\u00d3\2\2\u0612\u0613\7:\2\2"+
		"\u0613\u062f\7\u008f\2\2\u0614\u0615\7\23\2\2\u0615\u0616\7\u00d6\2\2"+
		"\u0616\u0617\5\\/\2\u0617\u0618\7\u00d8\2\2\u0618\u062f\3\2\2\2\u0619"+
		"\u061a\7p\2\2\u061a\u061b\7\u00d6\2\2\u061b\u061c\5\\/\2\u061c\u061d\7"+
		"\6\2\2\u061d\u061e\5\\/\2\u061e\u061f\7\u00d8\2\2\u061f\u062f\3\2\2\2"+
		"\u0620\u062c\5\u0082B\2\u0621\u0622\7\4\2\2\u0622\u0627\5`\61\2\u0623"+
		"\u0624\7\6\2\2\u0624\u0626\5`\61\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2"+
		"\2\2\u0627\u0625\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062a\3\2\2\2\u0629"+
		"\u0627\3\2\2\2\u062a\u062b\7\5\2\2\u062b\u062d\3\2\2\2\u062c\u0621\3\2"+
		"\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u05d3\3\2\2\2\u062e"+
		"\u05e0\3\2\2\2\u062e\u05e6\3\2\2\2\u062e\u05f2\3\2\2\2\u062e\u05fc\3\2"+
		"\2\2\u062e\u0608\3\2\2\2\u062e\u0612\3\2\2\2\u062e\u0614\3\2\2\2\u062e"+
		"\u0619\3\2\2\2\u062e\u0620\3\2\2\2\u062f\u0639\3\2\2\2\u0630\u0631\f\4"+
		"\2\2\u0631\u0635\7\23\2\2\u0632\u0633\7\t\2\2\u0633\u0634\7\u00e3\2\2"+
		"\u0634\u0636\7\n\2\2\u0635\u0632\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638"+
		"\3\2\2\2\u0637\u0630\3\2\2\2\u0638\u063b\3\2\2\2\u0639\u0637\3\2\2\2\u0639"+
		"\u063a\3\2\2\2\u063a]\3\2\2\2\u063b\u0639\3\2\2\2\u063c\u0641\5\\/\2\u063d"+
		"\u063e\5\u0082B\2\u063e\u063f\5\\/\2\u063f\u0641\3\2\2\2\u0640\u063c\3"+
		"\2\2\2\u0640\u063d\3\2\2\2\u0641_\3\2\2\2\u0642\u0645\7\u00e3\2\2\u0643"+
		"\u0645\5\\/\2\u0644\u0642\3\2\2\2\u0644\u0643\3\2\2\2\u0645a\3\2\2\2\u0646"+
		"\u0647\7\u00cc\2\2\u0647\u0648\5@!\2\u0648\u0649\7\u00b7\2\2\u0649\u064a"+
		"\5@!\2\u064ac\3\2\2\2\u064b\u064c\7G\2\2\u064c\u064d\7\4\2\2\u064d\u064e"+
		"\7\u00cd\2\2\u064e\u064f\5B\"\2\u064f\u0650\7\5\2\2\u0650e\3\2\2\2\u0651"+
		"\u0652\7\u0089\2\2\u0652\u065d\7\4\2\2\u0653\u0654\7\u008a\2\2\u0654\u0655"+
		"\7\32\2\2\u0655\u065a\5@!\2\u0656\u0657\7\6\2\2\u0657\u0659\5@!\2\u0658"+
		"\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2"+
		"\2\2\u065b\u065e\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u0653\3\2\2\2\u065d"+
		"\u065e\3\2\2\2\u065e\u0669\3\2\2\2\u065f\u0660\7\u0085\2\2\u0660\u0661"+
		"\7\32\2\2\u0661\u0666\5 \21\2\u0662\u0663\7\6\2\2\u0663\u0665\5 \21\2"+
		"\u0664\u0662\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667"+
		"\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u065f\3\2\2\2\u0669"+
		"\u066a\3\2\2\2\u066a\u066c\3\2\2\2\u066b\u066d\5h\65\2\u066c\u066b\3\2"+
		"\2\2\u066c\u066d\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u066f\7\5\2\2\u066f"+
		"g\3\2\2\2\u0670\u0671\7\u0093\2\2\u0671\u0681\5j\66\2\u0672\u0673\7\u00a3"+
		"\2\2\u0673\u0681\5j\66\2\u0674\u0675\7\u0093\2\2\u0675\u0676\7\31\2\2"+
		"\u0676\u0677\5j\66\2\u0677\u0678\7\21\2\2\u0678\u0679\5j\66\2\u0679\u0681"+
		"\3\2\2\2\u067a\u067b\7\u00a3\2\2\u067b\u067c\7\31\2\2\u067c\u067d\5j\66"+
		"\2\u067d\u067e\7\21\2\2\u067e\u067f\5j\66\2\u067f\u0681\3\2\2\2\u0680"+
		"\u0670\3\2\2\2\u0680\u0672\3\2\2\2\u0680\u0674\3\2\2\2\u0680\u067a\3\2"+
		"\2\2\u0681i\3\2\2\2\u0682\u0683\7\u00c1\2\2\u0683\u068c\7\u008e\2\2\u0684"+
		"\u0685\7\u00c1\2\2\u0685\u068c\7I\2\2\u0686\u0687\7)\2\2\u0687\u068c\7"+
		"\u00a2\2\2\u0688\u0689\5@!\2\u0689\u068a\t\25\2\2\u068a\u068c\3\2\2\2"+
		"\u068b\u0682\3\2\2\2\u068b\u0684\3\2\2\2\u068b\u0686\3\2\2\2\u068b\u0688"+
		"\3\2\2\2\u068ck\3\2\2\2\u068d\u068e\7K\2\2\u068e\u0692\t\26\2\2\u068f"+
		"\u0690\7\u00bf\2\2\u0690\u0692\t\27\2\2\u0691\u068d\3\2\2\2\u0691\u068f"+
		"\3\2\2\2\u0692m\3\2\2\2\u0693\u0694\7d\2\2\u0694\u0695\7j\2\2\u0695\u0699"+
		"\5p9\2\u0696\u0697\7\u0094\2\2\u0697\u0699\t\30\2\2\u0698\u0693\3\2\2"+
		"\2\u0698\u0696\3\2\2\2\u0699o\3\2\2\2\u069a\u069b\7\u0094\2\2\u069b\u06a2"+
		"\7\u00c2\2\2\u069c\u069d\7\u0094\2\2\u069d\u06a2\7$\2\2\u069e\u069f\7"+
		"\u0097\2\2\u069f\u06a2\7\u0094\2\2\u06a0\u06a2\7\u00a9\2\2\u06a1\u069a"+
		"\3\2\2\2\u06a1\u069c\3\2\2\2\u06a1\u069e\3\2\2\2\u06a1\u06a0\3\2\2\2\u06a2"+
		"q\3\2\2\2\u06a3\u06a9\5@!\2\u06a4\u06a5\5\u0082B\2\u06a5\u06a6\7\13\2"+
		"\2\u06a6\u06a7\5@!\2\u06a7\u06a9\3\2\2\2\u06a8\u06a3\3\2\2\2\u06a8\u06a4"+
		"\3\2\2\2\u06a9s\3\2\2\2\u06aa\u06ab\5\u0082B\2\u06ab\u06ac\7\3\2\2\u06ac"+
		"\u06ad\5\u0082B\2\u06ad\u06b0\3\2\2\2\u06ae\u06b0\5\u0082B\2\u06af\u06aa"+
		"\3\2\2\2\u06af\u06ae\3\2\2\2\u06b0u\3\2\2\2\u06b1\u06b6\5t;\2\u06b2\u06b3"+
		"\7\6\2\2\u06b3\u06b5\5t;\2\u06b4\u06b2\3\2\2\2\u06b5\u06b8\3\2\2\2\u06b6"+
		"\u06b4\3\2\2\2\u06b6\u06b7\3\2\2\2\u06b7w\3\2\2\2\u06b8\u06b6\3\2\2\2"+
		"\u06b9\u06ba\t\31\2\2\u06bay\3\2\2\2\u06bb\u06c0\5\u0082B\2\u06bc\u06bd"+
		"\7\3\2\2\u06bd\u06bf\5\u0082B\2\u06be\u06bc\3\2\2\2\u06bf\u06c2\3\2\2"+
		"\2\u06c0\u06be\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1{\3\2\2\2\u06c2\u06c0"+
		"\3\2\2\2\u06c3\u06c7\5~@\2\u06c4\u06c7\7/\2\2\u06c5\u06c7\7,\2\2\u06c6"+
		"\u06c3\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c6\u06c5\3\2\2\2\u06c7}\3\2\2\2"+
		"\u06c8\u06ce\5\u0082B\2\u06c9\u06ca\7\u00c6\2\2\u06ca\u06ce\5\u0082B\2"+
		"\u06cb\u06cc\7\u009e\2\2\u06cc\u06ce\5\u0082B\2\u06cd\u06c8\3\2\2\2\u06cd"+
		"\u06c9\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\177\3\2\2\2\u06cf\u06d4\5\u0082"+
		"B\2\u06d0\u06d1\7\6\2\2\u06d1\u06d3\5\u0082B\2\u06d2\u06d0\3\2\2\2\u06d3"+
		"\u06d6\3\2\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u0081\3\2"+
		"\2\2\u06d6\u06d4\3\2\2\2\u06d7\u06dd\7\u00e6\2\2\u06d8\u06dd\7\u00e8\2"+
		"\2\u06d9\u06dd\5\u0086D\2\u06da\u06dd\7\u00e9\2\2\u06db\u06dd\7\u00e7"+
		"\2\2\u06dc\u06d7\3\2\2\2\u06dc\u06d8\3\2\2\2\u06dc\u06d9\3\2\2\2\u06dc"+
		"\u06da\3\2\2\2\u06dc\u06db\3\2\2\2\u06dd\u0083\3\2\2\2\u06de\u06e0\7\u00db"+
		"\2\2\u06df\u06de\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1"+
		"\u06eb\7\u00e4\2\2\u06e2\u06e4\7\u00db\2\2\u06e3\u06e2\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06eb\7\u00e5\2\2\u06e6\u06e8\7\u00db"+
		"\2\2\u06e7\u06e6\3\2\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9"+
		"\u06eb\7\u00e3\2\2\u06ea\u06df\3\2\2\2\u06ea\u06e3\3\2\2\2\u06ea\u06e7"+
		"\3\2\2\2\u06eb\u0085\3\2\2\2\u06ec\u06ed\t\32\2\2\u06ed\u0087\3\2\2\2"+
		"\u00e7\u00a1\u00a6\u00aa\u00b0\u00b4\u00c9\u00cd\u00d1\u00d5\u00dd\u00e1"+
		"\u00e4\u00eb\u00f4\u00fa\u00fe\u0104\u010b\u0114\u0124\u012d\u014a\u014f"+
		"\u0155\u0159\u0162\u0174\u0177\u0181\u018e\u0194\u0199\u019f\u01a8\u01ae"+
		"\u01b5\u01bd\u01c2\u01c6\u01ce\u01d4\u01db\u01e0\u01e4\u01ee\u01f1\u01f5"+
		"\u01f8\u0200\u0205\u0218\u021e\u0220\u0226\u022c\u022e\u0236\u0238\u023e"+
		"\u0244\u0246\u0255\u025a\u0261\u026d\u026f\u0277\u0279\u028b\u028e\u0292"+
		"\u0296\u02a8\u02ab\u02b6\u02b9\u02bf\u02c6\u02cb\u02d1\u02d5\u02d9\u02df"+
		"\u02e7\u02f8\u02fb\u0300\u0302\u0309\u030f\u0311\u0319\u031f\u0322\u0324"+
		"\u0330\u0337\u033b\u033f\u0343\u034a\u0353\u0356\u035a\u035f\u0363\u0366"+
		"\u036d\u0378\u037b\u0385\u0388\u0393\u0398\u03a0\u03a3\u03a7\u03ab\u03b6"+
		"\u03b9\u03c0\u03c3\u03d6\u03da\u03de\u03e2\u03e6\u03ea\u03ec\u03f7\u03fc"+
		"\u0405\u040b\u040f\u0411\u0419\u042a\u0430\u043b\u0442\u0446\u044e\u0450"+
		"\u045d\u0465\u046e\u0474\u047c\u0482\u0486\u048b\u0490\u0496\u04a4\u04a6"+
		"\u04c4\u04cf\u04d9\u04dc\u04e1\u04e8\u04eb\u04f4\u04f7\u04fb\u04fe\u0501"+
		"\u050d\u0510\u0523\u0527\u052f\u0533\u054c\u054f\u0558\u055e\u0564\u056a"+
		"\u0575\u057e\u0594\u0597\u059a\u05a4\u05a6\u05ad\u05b3\u05b5\u05bd\u05c7"+
		"\u05cd\u05db\u05e4\u05eb\u05f0\u05f7\u0601\u0606\u060d\u0627\u062c\u062e"+
		"\u0635\u0639\u0640\u0644\u065a\u065d\u0666\u0669\u066c\u0680\u068b\u0691"+
		"\u0698\u06a1\u06a8\u06af\u06b6\u06c0\u06c6\u06cd\u06d4\u06dc\u06df\u06e3"+
		"\u06e7\u06ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}