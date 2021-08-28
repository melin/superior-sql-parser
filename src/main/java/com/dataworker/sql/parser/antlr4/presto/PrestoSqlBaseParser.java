// Generated from com/dataworker/sql/parser/antlr4/presto/PrestoSqlBase.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, ADD=17, 
		ADMIN=18, AFTER=19, ALL=20, ALTER=21, ANALYZE=22, AND=23, ANY=24, ARRAY=25, 
		AS=26, ASC=27, AT=28, AUTHORIZATION=29, BERNOULLI=30, BETWEEN=31, BY=32, 
		CALL=33, CASCADE=34, CASE=35, CAST=36, CATALOGS=37, COLUMN=38, COLUMNS=39, 
		COMMENT=40, COMMIT=41, COMMITTED=42, CONSTRAINT=43, CREATE=44, CROSS=45, 
		CUBE=46, CURRENT=47, CURRENT_CATALOG=48, CURRENT_DATE=49, CURRENT_PATH=50, 
		CURRENT_ROLE=51, CURRENT_SCHEMA=52, CURRENT_TIME=53, CURRENT_TIMESTAMP=54, 
		CURRENT_USER=55, DATA=56, DATE=57, DAY=58, DEALLOCATE=59, DEFINER=60, 
		DELETE=61, DESC=62, DESCRIBE=63, DEFINE=64, DISTINCT=65, DISTRIBUTED=66, 
		DOUBLE=67, DROP=68, ELSE=69, EMPTY=70, END=71, ESCAPE=72, EXCEPT=73, EXCLUDING=74, 
		EXECUTE=75, EXISTS=76, EXPLAIN=77, EXTRACT=78, FALSE=79, FETCH=80, FILTER=81, 
		FINAL=82, FIRST=83, FOLLOWING=84, FOR=85, FORMAT=86, FROM=87, FULL=88, 
		FUNCTIONS=89, GRANT=90, GRANTED=91, GRANTS=92, GRAPHVIZ=93, GROUP=94, 
		GROUPING=95, GROUPS=96, HAVING=97, HOUR=98, IF=99, IGNORE=100, IN=101, 
		INCLUDING=102, INITIAL=103, INNER=104, INPUT=105, INSERT=106, INTERSECT=107, 
		INTERVAL=108, INTO=109, INVOKER=110, IO=111, IS=112, ISOLATION=113, JOIN=114, 
		JSON=115, LAST=116, LATERAL=117, LEFT=118, LEVEL=119, LIKE=120, LIMIT=121, 
		LOCAL=122, LOCALTIME=123, LOCALTIMESTAMP=124, LOGICAL=125, MAP=126, MATCH=127, 
		MATCHED=128, MATCHES=129, MATCH_RECOGNIZE=130, MATERIALIZED=131, MEASURES=132, 
		MERGE=133, MINUTE=134, MONTH=135, NATURAL=136, NEXT=137, NFC=138, NFD=139, 
		NFKC=140, NFKD=141, NO=142, NONE=143, NORMALIZE=144, NOT=145, NULL=146, 
		NULLIF=147, NULLS=148, OFFSET=149, OMIT=150, ON=151, ONE=152, ONLY=153, 
		OPTION=154, OR=155, ORDER=156, ORDINALITY=157, OUTER=158, OUTPUT=159, 
		OVER=160, PARTITION=161, PARTITIONS=162, PAST=163, PATH=164, PATTERN=165, 
		PER=166, PERMUTE=167, POSITION=168, PRECEDING=169, PRECISION=170, PREPARE=171, 
		PRIVILEGES=172, PROPERTIES=173, RANGE=174, READ=175, RECURSIVE=176, REFRESH=177, 
		RENAME=178, REPEATABLE=179, REPLACE=180, RESET=181, RESPECT=182, RESTRICT=183, 
		REVOKE=184, RIGHT=185, ROLE=186, ROLES=187, ROLLBACK=188, ROLLUP=189, 
		ROW=190, ROWS=191, RUNNING=192, SCHEMA=193, SCHEMAS=194, SECOND=195, SECURITY=196, 
		SEEK=197, SELECT=198, SERIALIZABLE=199, SESSION=200, SET=201, SETS=202, 
		SHOW=203, SOME=204, START=205, STATS=206, SUBSET=207, SUBSTRING=208, SYSTEM=209, 
		TABLE=210, TABLES=211, TABLESAMPLE=212, TEXT=213, THEN=214, TIES=215, 
		TIME=216, TIMESTAMP=217, TO=218, TRANSACTION=219, TRUE=220, TRY_CAST=221, 
		TYPE=222, UESCAPE=223, UNBOUNDED=224, UNCOMMITTED=225, UNION=226, UNMATCHED=227, 
		UNNEST=228, UPDATE=229, USE=230, USER=231, USING=232, VALIDATE=233, VALUES=234, 
		VERBOSE=235, VIEW=236, WHEN=237, WHERE=238, WINDOW=239, WITH=240, WITHOUT=241, 
		WORK=242, WRITE=243, YEAR=244, ZONE=245, EQ=246, NEQ=247, LT=248, LTE=249, 
		GT=250, GTE=251, PLUS=252, MINUS=253, ASTERISK=254, SLASH=255, PERCENT=256, 
		CONCAT=257, QUESTION_MARK=258, STRING=259, UNICODE_STRING=260, BINARY_LITERAL=261, 
		INTEGER_VALUE=262, DECIMAL_VALUE=263, DOUBLE_VALUE=264, IDENTIFIER=265, 
		DIGIT_IDENTIFIER=266, QUOTED_IDENTIFIER=267, BACKQUOTED_IDENTIFIER=268, 
		SIMPLE_COMMENT=269, BRACKETED_COMMENT=270, WS=271, UNRECOGNIZED=272, DELIMITER=273;
	public static final int
		RULE_singleStatement = 0, RULE_standaloneExpression = 1, RULE_standalonePathSpecification = 2, 
		RULE_standaloneType = 3, RULE_standaloneRowPattern = 4, RULE_statement = 5, 
		RULE_query = 6, RULE_with = 7, RULE_tableElement = 8, RULE_columnDefinition = 9, 
		RULE_likeClause = 10, RULE_properties = 11, RULE_property = 12, RULE_queryNoWith = 13, 
		RULE_limitRowCount = 14, RULE_rowCount = 15, RULE_queryTerm = 16, RULE_queryPrimary = 17, 
		RULE_sortItem = 18, RULE_querySpecification = 19, RULE_groupBy = 20, RULE_groupingElement = 21, 
		RULE_groupingSet = 22, RULE_windowDefinition = 23, RULE_windowSpecification = 24, 
		RULE_namedQuery = 25, RULE_setQuantifier = 26, RULE_selectItem = 27, RULE_relation = 28, 
		RULE_joinType = 29, RULE_joinCriteria = 30, RULE_sampledRelation = 31, 
		RULE_sampleType = 32, RULE_patternRecognition = 33, RULE_measureDefinition = 34, 
		RULE_rowsPerMatch = 35, RULE_emptyMatchHandling = 36, RULE_skipTo = 37, 
		RULE_subsetDefinition = 38, RULE_variableDefinition = 39, RULE_aliasedRelation = 40, 
		RULE_columnAliases = 41, RULE_relationPrimary = 42, RULE_expression = 43, 
		RULE_booleanExpression = 44, RULE_predicate = 45, RULE_valueExpression = 46, 
		RULE_primaryExpression = 47, RULE_processingMode = 48, RULE_nullTreatment = 49, 
		RULE_string = 50, RULE_timeZoneSpecifier = 51, RULE_comparisonOperator = 52, 
		RULE_comparisonQuantifier = 53, RULE_booleanValue = 54, RULE_interval = 55, 
		RULE_intervalField = 56, RULE_normalForm = 57, RULE_type = 58, RULE_rowField = 59, 
		RULE_typeParameter = 60, RULE_whenClause = 61, RULE_filter = 62, RULE_mergeCase = 63, 
		RULE_over = 64, RULE_windowFrame = 65, RULE_frameExtent = 66, RULE_frameBound = 67, 
		RULE_rowPattern = 68, RULE_patternPrimary = 69, RULE_patternQuantifier = 70, 
		RULE_updateAssignment = 71, RULE_explainOption = 72, RULE_transactionMode = 73, 
		RULE_levelOfIsolation = 74, RULE_callArgument = 75, RULE_pathElement = 76, 
		RULE_pathSpecification = 77, RULE_privilege = 78, RULE_qualifiedName = 79, 
		RULE_grantor = 80, RULE_principal = 81, RULE_roles = 82, RULE_identifier = 83, 
		RULE_number = 84, RULE_nonReserved = 85;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "standaloneExpression", "standalonePathSpecification", 
			"standaloneType", "standaloneRowPattern", "statement", "query", "with", 
			"tableElement", "columnDefinition", "likeClause", "properties", "property", 
			"queryNoWith", "limitRowCount", "rowCount", "queryTerm", "queryPrimary", 
			"sortItem", "querySpecification", "groupBy", "groupingElement", "groupingSet", 
			"windowDefinition", "windowSpecification", "namedQuery", "setQuantifier", 
			"selectItem", "relation", "joinType", "joinCriteria", "sampledRelation", 
			"sampleType", "patternRecognition", "measureDefinition", "rowsPerMatch", 
			"emptyMatchHandling", "skipTo", "subsetDefinition", "variableDefinition", 
			"aliasedRelation", "columnAliases", "relationPrimary", "expression", 
			"booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"processingMode", "nullTreatment", "string", "timeZoneSpecifier", "comparisonOperator", 
			"comparisonQuantifier", "booleanValue", "interval", "intervalField", 
			"normalForm", "type", "rowField", "typeParameter", "whenClause", "filter", 
			"mergeCase", "over", "windowFrame", "frameExtent", "frameBound", "rowPattern", 
			"patternPrimary", "patternQuantifier", "updateAssignment", "explainOption", 
			"transactionMode", "levelOfIsolation", "callArgument", "pathElement", 
			"pathSpecification", "privilege", "qualifiedName", "grantor", "principal", 
			"roles", "identifier", "number", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'('", "')'", "','", "'SKIP'", "'->'", "'['", "']'", "'|'", 
			"'^'", "'$'", "'{-'", "'-}'", "'{'", "'}'", "'=>'", "'ADD'", "'ADMIN'", 
			"'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANY'", "'ARRAY'", 
			"'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BERNOULLI'", "'BETWEEN'", 
			"'BY'", "'CALL'", "'CASCADE'", "'CASE'", "'CAST'", "'CATALOGS'", "'COLUMN'", 
			"'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMMITTED'", "'CONSTRAINT'", 
			"'CREATE'", "'CROSS'", "'CUBE'", "'CURRENT'", "'CURRENT_CATALOG'", "'CURRENT_DATE'", 
			"'CURRENT_PATH'", "'CURRENT_ROLE'", "'CURRENT_SCHEMA'", "'CURRENT_TIME'", 
			"'CURRENT_TIMESTAMP'", "'CURRENT_USER'", "'DATA'", "'DATE'", "'DAY'", 
			"'DEALLOCATE'", "'DEFINER'", "'DELETE'", "'DESC'", "'DESCRIBE'", "'DEFINE'", 
			"'DISTINCT'", "'DISTRIBUTED'", "'DOUBLE'", "'DROP'", "'ELSE'", "'EMPTY'", 
			"'END'", "'ESCAPE'", "'EXCEPT'", "'EXCLUDING'", "'EXECUTE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FILTER'", "'FINAL'", 
			"'FIRST'", "'FOLLOWING'", "'FOR'", "'FORMAT'", "'FROM'", "'FULL'", "'FUNCTIONS'", 
			"'GRANT'", "'GRANTED'", "'GRANTS'", "'GRAPHVIZ'", "'GROUP'", "'GROUPING'", 
			"'GROUPS'", "'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IN'", "'INCLUDING'", 
			"'INITIAL'", "'INNER'", "'INPUT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
			"'INTO'", "'INVOKER'", "'IO'", "'IS'", "'ISOLATION'", "'JOIN'", "'JSON'", 
			"'LAST'", "'LATERAL'", "'LEFT'", "'LEVEL'", "'LIKE'", "'LIMIT'", "'LOCAL'", 
			"'LOCALTIME'", "'LOCALTIMESTAMP'", "'LOGICAL'", "'MAP'", "'MATCH'", "'MATCHED'", 
			"'MATCHES'", "'MATCH_RECOGNIZE'", "'MATERIALIZED'", "'MEASURES'", "'MERGE'", 
			"'MINUTE'", "'MONTH'", "'NATURAL'", "'NEXT'", "'NFC'", "'NFD'", "'NFKC'", 
			"'NFKD'", "'NO'", "'NONE'", "'NORMALIZE'", "'NOT'", "'NULL'", "'NULLIF'", 
			"'NULLS'", "'OFFSET'", "'OMIT'", "'ON'", "'ONE'", "'ONLY'", "'OPTION'", 
			"'OR'", "'ORDER'", "'ORDINALITY'", "'OUTER'", "'OUTPUT'", "'OVER'", "'PARTITION'", 
			"'PARTITIONS'", "'PAST'", "'PATH'", "'PATTERN'", "'PER'", "'PERMUTE'", 
			"'POSITION'", "'PRECEDING'", "'PRECISION'", "'PREPARE'", "'PRIVILEGES'", 
			"'PROPERTIES'", "'RANGE'", "'READ'", "'RECURSIVE'", "'REFRESH'", "'RENAME'", 
			"'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
			"'RUNNING'", "'SCHEMA'", "'SCHEMAS'", "'SECOND'", "'SECURITY'", "'SEEK'", 
			"'SELECT'", "'SERIALIZABLE'", "'SESSION'", "'SET'", "'SETS'", "'SHOW'", 
			"'SOME'", "'START'", "'STATS'", "'SUBSET'", "'SUBSTRING'", "'SYSTEM'", 
			"'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TEXT'", "'THEN'", "'TIES'", 
			"'TIME'", "'TIMESTAMP'", "'TO'", "'TRANSACTION'", "'TRUE'", "'TRY_CAST'", 
			"'TYPE'", "'UESCAPE'", "'UNBOUNDED'", "'UNCOMMITTED'", "'UNION'", "'UNMATCHED'", 
			"'UNNEST'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALIDATE'", "'VALUES'", 
			"'VERBOSE'", "'VIEW'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'WITHOUT'", 
			"'WORK'", "'WRITE'", "'YEAR'", "'ZONE'", "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ADD", "ADMIN", "AFTER", "ALL", "ALTER", 
			"ANALYZE", "AND", "ANY", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", 
			"BERNOULLI", "BETWEEN", "BY", "CALL", "CASCADE", "CASE", "CAST", "CATALOGS", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMMITTED", "CONSTRAINT", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_CATALOG", "CURRENT_DATE", 
			"CURRENT_PATH", "CURRENT_ROLE", "CURRENT_SCHEMA", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURRENT_USER", "DATA", "DATE", "DAY", "DEALLOCATE", "DEFINER", "DELETE", 
			"DESC", "DESCRIBE", "DEFINE", "DISTINCT", "DISTRIBUTED", "DOUBLE", "DROP", 
			"ELSE", "EMPTY", "END", "ESCAPE", "EXCEPT", "EXCLUDING", "EXECUTE", "EXISTS", 
			"EXPLAIN", "EXTRACT", "FALSE", "FETCH", "FILTER", "FINAL", "FIRST", "FOLLOWING", 
			"FOR", "FORMAT", "FROM", "FULL", "FUNCTIONS", "GRANT", "GRANTED", "GRANTS", 
			"GRAPHVIZ", "GROUP", "GROUPING", "GROUPS", "HAVING", "HOUR", "IF", "IGNORE", 
			"IN", "INCLUDING", "INITIAL", "INNER", "INPUT", "INSERT", "INTERSECT", 
			"INTERVAL", "INTO", "INVOKER", "IO", "IS", "ISOLATION", "JOIN", "JSON", 
			"LAST", "LATERAL", "LEFT", "LEVEL", "LIKE", "LIMIT", "LOCAL", "LOCALTIME", 
			"LOCALTIMESTAMP", "LOGICAL", "MAP", "MATCH", "MATCHED", "MATCHES", "MATCH_RECOGNIZE", 
			"MATERIALIZED", "MEASURES", "MERGE", "MINUTE", "MONTH", "NATURAL", "NEXT", 
			"NFC", "NFD", "NFKC", "NFKD", "NO", "NONE", "NORMALIZE", "NOT", "NULL", 
			"NULLIF", "NULLS", "OFFSET", "OMIT", "ON", "ONE", "ONLY", "OPTION", "OR", 
			"ORDER", "ORDINALITY", "OUTER", "OUTPUT", "OVER", "PARTITION", "PARTITIONS", 
			"PAST", "PATH", "PATTERN", "PER", "PERMUTE", "POSITION", "PRECEDING", 
			"PRECISION", "PREPARE", "PRIVILEGES", "PROPERTIES", "RANGE", "READ", 
			"RECURSIVE", "REFRESH", "RENAME", "REPEATABLE", "REPLACE", "RESET", "RESPECT", 
			"RESTRICT", "REVOKE", "RIGHT", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", 
			"ROW", "ROWS", "RUNNING", "SCHEMA", "SCHEMAS", "SECOND", "SECURITY", 
			"SEEK", "SELECT", "SERIALIZABLE", "SESSION", "SET", "SETS", "SHOW", "SOME", 
			"START", "STATS", "SUBSET", "SUBSTRING", "SYSTEM", "TABLE", "TABLES", 
			"TABLESAMPLE", "TEXT", "THEN", "TIES", "TIME", "TIMESTAMP", "TO", "TRANSACTION", 
			"TRUE", "TRY_CAST", "TYPE", "UESCAPE", "UNBOUNDED", "UNCOMMITTED", "UNION", 
			"UNMATCHED", "UNNEST", "UPDATE", "USE", "USER", "USING", "VALIDATE", 
			"VALUES", "VERBOSE", "VIEW", "WHEN", "WHERE", "WINDOW", "WITH", "WITHOUT", 
			"WORK", "WRITE", "YEAR", "ZONE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "QUESTION_MARK", 
			"STRING", "UNICODE_STRING", "BINARY_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED", "DELIMITER"
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
			setState(172);
			statement();
			setState(173);
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
			setState(175);
			expression();
			setState(176);
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
			setState(178);
			pathSpecification();
			setState(179);
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
			setState(181);
			type(0);
			setState(182);
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

	public static class StandaloneRowPatternContext extends ParserRuleContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PrestoSqlBaseParser.EOF, 0); }
		public StandaloneRowPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standaloneRowPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterStandaloneRowPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitStandaloneRowPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitStandaloneRowPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StandaloneRowPatternContext standaloneRowPattern() throws RecognitionException {
		StandaloneRowPatternContext _localctx = new StandaloneRowPatternContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_standaloneRowPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			rowPattern(0);
			setState(185);
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
	public static class DropMaterializedViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(PrestoSqlBaseParser.DROP, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PrestoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
		public DropMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterDropMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitDropMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitDropMaterializedView(this);
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
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(PrestoSqlBaseParser.EXISTS, 0); }
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
		public List<TerminalNode> IF() { return getTokens(PrestoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PrestoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(PrestoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(PrestoSqlBaseParser.EXISTS, i);
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
	public static class SetViewAuthorizationContext extends StatementContext {
		public QualifiedNameContext from;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(PrestoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetViewAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetViewAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetViewAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetViewAuthorization(this);
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
	public static class MergeContext extends StatementContext {
		public TerminalNode MERGE() { return getToken(PrestoSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(PrestoSqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(PrestoSqlBaseParser.USING, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode ON() { return getToken(PrestoSqlBaseParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<MergeCaseContext> mergeCase() {
			return getRuleContexts(MergeCaseContext.class);
		}
		public MergeCaseContext mergeCase(int i) {
			return getRuleContext(MergeCaseContext.class,i);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public MergeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMerge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMerge(this);
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
		public List<TerminalNode> IF() { return getTokens(PrestoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PrestoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(PrestoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(PrestoSqlBaseParser.EXISTS, i);
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
		public List<TerminalNode> IF() { return getTokens(PrestoSqlBaseParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PrestoSqlBaseParser.IF, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(PrestoSqlBaseParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(PrestoSqlBaseParser.EXISTS, i);
		}
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
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
	public static class ExplainAnalyzeContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(PrestoSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode ANALYZE() { return getToken(PrestoSqlBaseParser.ANALYZE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode VERBOSE() { return getToken(PrestoSqlBaseParser.VERBOSE, 0); }
		public ExplainAnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExplainAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExplainAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExplainAnalyze(this);
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
	public static class SetTableAuthorizationContext extends StatementContext {
		public QualifiedNameContext tableName;
		public TerminalNode ALTER() { return getToken(PrestoSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(PrestoSqlBaseParser.AUTHORIZATION, 0); }
		public PrincipalContext principal() {
			return getRuleContext(PrincipalContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SetTableAuthorizationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetTableAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetTableAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetTableAuthorization(this);
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
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
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
	public static class UpdateContext extends StatementContext {
		public BooleanExpressionContext where;
		public TerminalNode UPDATE() { return getToken(PrestoSqlBaseParser.UPDATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public List<UpdateAssignmentContext> updateAssignment() {
			return getRuleContexts(UpdateAssignmentContext.class);
		}
		public UpdateAssignmentContext updateAssignment(int i) {
			return getRuleContext(UpdateAssignmentContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(PrestoSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUpdate(this);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
	public static class SetTimeZoneContext extends StatementContext {
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(PrestoSqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(PrestoSqlBaseParser.ZONE, 0); }
		public TerminalNode LOCAL() { return getToken(PrestoSqlBaseParser.LOCAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateMaterializedViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PrestoSqlBaseParser.MATERIALIZED, 0); }
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
		public CreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCreateMaterializedView(this);
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
	public static class RefreshMaterializedViewContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(PrestoSqlBaseParser.REFRESH, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PrestoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public RefreshMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRefreshMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRefreshMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRefreshMaterializedView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateMaterializedViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(PrestoSqlBaseParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PrestoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateMaterializedViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterShowCreateMaterializedView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitShowCreateMaterializedView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitShowCreateMaterializedView(this);
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
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode TABLE() { return getToken(PrestoSqlBaseParser.TABLE, 0); }
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
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(USE);
				setState(189);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(USE);
				setState(191);
				((UseContext)_localctx).catalog = identifier();
				setState(192);
				match(T__0);
				setState(193);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(CREATE);
				setState(196);
				match(SCHEMA);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(197);
					match(IF);
					setState(198);
					match(NOT);
					setState(199);
					match(EXISTS);
					}
					break;
				}
				setState(202);
				qualifiedName();
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTHORIZATION) {
					{
					setState(203);
					match(AUTHORIZATION);
					setState(204);
					principal();
					}
				}

				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(207);
					match(WITH);
					setState(208);
					properties();
					}
				}

				}
				break;
			case 5:
				_localctx = new DropSchemaContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				match(DROP);
				setState(212);
				match(SCHEMA);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(213);
					match(IF);
					setState(214);
					match(EXISTS);
					}
					break;
				}
				setState(217);
				qualifiedName();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(218);
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
				setState(221);
				match(ALTER);
				setState(222);
				match(SCHEMA);
				setState(223);
				qualifiedName();
				setState(224);
				match(RENAME);
				setState(225);
				match(TO);
				setState(226);
				identifier();
				}
				break;
			case 7:
				_localctx = new SetSchemaAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(228);
				match(ALTER);
				setState(229);
				match(SCHEMA);
				setState(230);
				qualifiedName();
				setState(231);
				match(SET);
				setState(232);
				match(AUTHORIZATION);
				setState(233);
				principal();
				}
				break;
			case 8:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				match(CREATE);
				setState(236);
				match(TABLE);
				setState(240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(237);
					match(IF);
					setState(238);
					match(NOT);
					setState(239);
					match(EXISTS);
					}
					break;
				}
				setState(242);
				qualifiedName();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(243);
					columnAliases();
					}
				}

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

				setState(254);
				match(AS);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(255);
					query();
					}
					break;
				case 2:
					{
					setState(256);
					match(T__1);
					setState(257);
					query();
					setState(258);
					match(T__2);
					}
					break;
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(262);
					match(WITH);
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(263);
						match(NO);
						}
					}

					setState(266);
					match(DATA);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(269);
				match(CREATE);
				setState(270);
				match(TABLE);
				setState(274);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(271);
					match(IF);
					setState(272);
					match(NOT);
					setState(273);
					match(EXISTS);
					}
					break;
				}
				setState(276);
				qualifiedName();
				setState(277);
				match(T__1);
				setState(278);
				tableElement();
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(279);
					match(T__3);
					setState(280);
					tableElement();
					}
					}
					setState(285);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				match(T__2);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(287);
					match(COMMENT);
					setState(288);
					string();
					}
				}

				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(291);
					match(WITH);
					setState(292);
					properties();
					}
				}

				}
				break;
			case 10:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(295);
				match(DROP);
				setState(296);
				match(TABLE);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(297);
					match(IF);
					setState(298);
					match(EXISTS);
					}
					break;
				}
				setState(301);
				qualifiedName();
				}
				break;
			case 11:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(302);
				match(INSERT);
				setState(303);
				match(INTO);
				setState(304);
				qualifiedName();
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(305);
					columnAliases();
					}
					break;
				}
				setState(308);
				query();
				}
				break;
			case 12:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(310);
				match(DELETE);
				setState(311);
				match(FROM);
				setState(312);
				qualifiedName();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(313);
					match(WHERE);
					setState(314);
					booleanExpression(0);
					}
				}

				}
				break;
			case 13:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(317);
				match(ALTER);
				setState(318);
				match(TABLE);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(319);
					match(IF);
					setState(320);
					match(EXISTS);
					}
					break;
				}
				setState(323);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(324);
				match(RENAME);
				setState(325);
				match(TO);
				setState(326);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 14:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(328);
				match(COMMENT);
				setState(329);
				match(ON);
				setState(330);
				match(TABLE);
				setState(331);
				qualifiedName();
				setState(332);
				match(IS);
				setState(335);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(333);
					string();
					}
					break;
				case NULL:
					{
					setState(334);
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
				setState(337);
				match(COMMENT);
				setState(338);
				match(ON);
				setState(339);
				match(COLUMN);
				setState(340);
				qualifiedName();
				setState(341);
				match(IS);
				setState(344);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
				case UNICODE_STRING:
					{
					setState(342);
					string();
					}
					break;
				case NULL:
					{
					setState(343);
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
				setState(346);
				match(ALTER);
				setState(347);
				match(TABLE);
				setState(350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(EXISTS);
					}
					break;
				}
				setState(352);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(353);
				match(RENAME);
				setState(354);
				match(COLUMN);
				setState(357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(355);
					match(IF);
					setState(356);
					match(EXISTS);
					}
					break;
				}
				setState(359);
				((RenameColumnContext)_localctx).from = identifier();
				setState(360);
				match(TO);
				setState(361);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 17:
				_localctx = new DropColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(363);
				match(ALTER);
				setState(364);
				match(TABLE);
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(365);
					match(IF);
					setState(366);
					match(EXISTS);
					}
					break;
				}
				setState(369);
				((DropColumnContext)_localctx).tableName = qualifiedName();
				setState(370);
				match(DROP);
				setState(371);
				match(COLUMN);
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(372);
					match(IF);
					setState(373);
					match(EXISTS);
					}
					break;
				}
				setState(376);
				((DropColumnContext)_localctx).column = qualifiedName();
				}
				break;
			case 18:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(378);
				match(ALTER);
				setState(379);
				match(TABLE);
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(380);
					match(IF);
					setState(381);
					match(EXISTS);
					}
					break;
				}
				setState(384);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(385);
				match(ADD);
				setState(386);
				match(COLUMN);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(387);
					match(IF);
					setState(388);
					match(NOT);
					setState(389);
					match(EXISTS);
					}
					break;
				}
				setState(392);
				((AddColumnContext)_localctx).column = columnDefinition();
				}
				break;
			case 19:
				_localctx = new SetTableAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(394);
				match(ALTER);
				setState(395);
				match(TABLE);
				setState(396);
				((SetTableAuthorizationContext)_localctx).tableName = qualifiedName();
				setState(397);
				match(SET);
				setState(398);
				match(AUTHORIZATION);
				setState(399);
				principal();
				}
				break;
			case 20:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(401);
				match(ANALYZE);
				setState(402);
				qualifiedName();
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(403);
					match(WITH);
					setState(404);
					properties();
					}
				}

				}
				break;
			case 21:
				_localctx = new CreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(407);
				match(CREATE);
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(408);
					match(OR);
					setState(409);
					match(REPLACE);
					}
				}

				setState(412);
				match(MATERIALIZED);
				setState(413);
				match(VIEW);
				setState(417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(414);
					match(IF);
					setState(415);
					match(NOT);
					setState(416);
					match(EXISTS);
					}
					break;
				}
				setState(419);
				qualifiedName();
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(420);
					match(COMMENT);
					setState(421);
					string();
					}
				}

				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(424);
					match(WITH);
					setState(425);
					properties();
					}
				}

				setState(428);
				match(AS);
				setState(429);
				query();
				}
				break;
			case 22:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(431);
				match(CREATE);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(432);
					match(OR);
					setState(433);
					match(REPLACE);
					}
				}

				setState(436);
				match(VIEW);
				setState(437);
				qualifiedName();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(438);
					match(COMMENT);
					setState(439);
					string();
					}
				}

				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SECURITY) {
					{
					setState(442);
					match(SECURITY);
					setState(443);
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

				setState(446);
				match(AS);
				setState(447);
				query();
				}
				break;
			case 23:
				_localctx = new RefreshMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(449);
				match(REFRESH);
				setState(450);
				match(MATERIALIZED);
				setState(451);
				match(VIEW);
				setState(452);
				qualifiedName();
				}
				break;
			case 24:
				_localctx = new DropMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(453);
				match(DROP);
				setState(454);
				match(MATERIALIZED);
				setState(455);
				match(VIEW);
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(456);
					match(IF);
					setState(457);
					match(EXISTS);
					}
					break;
				}
				setState(460);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(461);
				match(DROP);
				setState(462);
				match(VIEW);
				setState(465);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(463);
					match(IF);
					setState(464);
					match(EXISTS);
					}
					break;
				}
				setState(467);
				qualifiedName();
				}
				break;
			case 26:
				_localctx = new RenameViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(468);
				match(ALTER);
				setState(469);
				match(VIEW);
				setState(470);
				((RenameViewContext)_localctx).from = qualifiedName();
				setState(471);
				match(RENAME);
				setState(472);
				match(TO);
				setState(473);
				((RenameViewContext)_localctx).to = qualifiedName();
				}
				break;
			case 27:
				_localctx = new SetViewAuthorizationContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(475);
				match(ALTER);
				setState(476);
				match(VIEW);
				setState(477);
				((SetViewAuthorizationContext)_localctx).from = qualifiedName();
				setState(478);
				match(SET);
				setState(479);
				match(AUTHORIZATION);
				setState(480);
				principal();
				}
				break;
			case 28:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(482);
				match(CALL);
				setState(483);
				qualifiedName();
				setState(484);
				match(T__1);
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(485);
					callArgument();
					setState(490);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(486);
						match(T__3);
						setState(487);
						callArgument();
						}
						}
						setState(492);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(495);
				match(T__2);
				}
				break;
			case 29:
				_localctx = new CreateRoleContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(497);
				match(CREATE);
				setState(498);
				match(ROLE);
				setState(499);
				((CreateRoleContext)_localctx).name = identifier();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(500);
					match(WITH);
					setState(501);
					match(ADMIN);
					setState(502);
					grantor();
					}
				}

				}
				break;
			case 30:
				_localctx = new DropRoleContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(505);
				match(DROP);
				setState(506);
				match(ROLE);
				setState(507);
				((DropRoleContext)_localctx).name = identifier();
				}
				break;
			case 31:
				_localctx = new GrantRolesContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(508);
				match(GRANT);
				setState(509);
				roles();
				setState(510);
				match(TO);
				setState(511);
				principal();
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(512);
					match(T__3);
					setState(513);
					principal();
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(519);
					match(WITH);
					setState(520);
					match(ADMIN);
					setState(521);
					match(OPTION);
					}
				}

				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(524);
					match(GRANTED);
					setState(525);
					match(BY);
					setState(526);
					grantor();
					}
				}

				}
				break;
			case 32:
				_localctx = new RevokeRolesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(529);
				match(REVOKE);
				setState(533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(530);
					match(ADMIN);
					setState(531);
					match(OPTION);
					setState(532);
					match(FOR);
					}
					break;
				}
				setState(535);
				roles();
				setState(536);
				match(FROM);
				setState(537);
				principal();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(538);
					match(T__3);
					setState(539);
					principal();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANTED) {
					{
					setState(545);
					match(GRANTED);
					setState(546);
					match(BY);
					setState(547);
					grantor();
					}
				}

				}
				break;
			case 33:
				_localctx = new SetRoleContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(550);
				match(SET);
				setState(551);
				match(ROLE);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(552);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(553);
					match(NONE);
					}
					break;
				case 3:
					{
					setState(554);
					((SetRoleContext)_localctx).role = identifier();
					}
					break;
				}
				}
				break;
			case 34:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(557);
				match(GRANT);
				setState(568);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
				case UPDATE:
					{
					setState(558);
					privilege();
					setState(563);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(559);
						match(T__3);
						setState(560);
						privilege();
						}
						}
						setState(565);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(566);
					match(ALL);
					setState(567);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(570);
				match(ON);
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(571);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(574);
				qualifiedName();
				setState(575);
				match(TO);
				setState(576);
				((GrantContext)_localctx).grantee = principal();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(577);
					match(WITH);
					setState(578);
					match(GRANT);
					setState(579);
					match(OPTION);
					}
				}

				}
				break;
			case 35:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(582);
				match(REVOKE);
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GRANT) {
					{
					setState(583);
					match(GRANT);
					setState(584);
					match(OPTION);
					setState(585);
					match(FOR);
					}
				}

				setState(598);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DELETE:
				case INSERT:
				case SELECT:
				case UPDATE:
					{
					setState(588);
					privilege();
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(589);
						match(T__3);
						setState(590);
						privilege();
						}
						}
						setState(595);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(596);
					match(ALL);
					setState(597);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(600);
				match(ON);
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(601);
					_la = _input.LA(1);
					if ( !(_la==SCHEMA || _la==TABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(604);
				qualifiedName();
				setState(605);
				match(FROM);
				setState(606);
				((RevokeContext)_localctx).grantee = principal();
				}
				break;
			case 36:
				_localctx = new ShowGrantsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(608);
				match(SHOW);
				setState(609);
				match(GRANTS);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(610);
					match(ON);
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLE) {
						{
						setState(611);
						match(TABLE);
						}
					}

					setState(614);
					qualifiedName();
					}
				}

				}
				break;
			case 37:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(617);
				match(EXPLAIN);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(618);
					match(T__1);
					setState(619);
					explainOption();
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(620);
						match(T__3);
						setState(621);
						explainOption();
						}
						}
						setState(626);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(627);
					match(T__2);
					}
					break;
				}
				setState(631);
				statement();
				}
				break;
			case 38:
				_localctx = new ExplainAnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(632);
				match(EXPLAIN);
				setState(633);
				match(ANALYZE);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VERBOSE) {
					{
					setState(634);
					match(VERBOSE);
					}
				}

				setState(637);
				statement();
				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(638);
				match(SHOW);
				setState(639);
				match(CREATE);
				setState(640);
				match(TABLE);
				setState(641);
				qualifiedName();
				}
				break;
			case 40:
				_localctx = new ShowCreateSchemaContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(642);
				match(SHOW);
				setState(643);
				match(CREATE);
				setState(644);
				match(SCHEMA);
				setState(645);
				qualifiedName();
				}
				break;
			case 41:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(646);
				match(SHOW);
				setState(647);
				match(CREATE);
				setState(648);
				match(VIEW);
				setState(649);
				qualifiedName();
				}
				break;
			case 42:
				_localctx = new ShowCreateMaterializedViewContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(650);
				match(SHOW);
				setState(651);
				match(CREATE);
				setState(652);
				match(MATERIALIZED);
				setState(653);
				match(VIEW);
				setState(654);
				qualifiedName();
				}
				break;
			case 43:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(655);
				match(SHOW);
				setState(656);
				match(TABLES);
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(657);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(658);
					qualifiedName();
					}
				}

				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(661);
					match(LIKE);
					setState(662);
					((ShowTablesContext)_localctx).pattern = string();
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(663);
						match(ESCAPE);
						setState(664);
						((ShowTablesContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 44:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(669);
				match(SHOW);
				setState(670);
				match(SCHEMAS);
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(671);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(672);
					identifier();
					}
				}

				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(675);
					match(LIKE);
					setState(676);
					((ShowSchemasContext)_localctx).pattern = string();
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(677);
						match(ESCAPE);
						setState(678);
						((ShowSchemasContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 45:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(683);
				match(SHOW);
				setState(684);
				match(CATALOGS);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(685);
					match(LIKE);
					setState(686);
					((ShowCatalogsContext)_localctx).pattern = string();
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(687);
						match(ESCAPE);
						setState(688);
						((ShowCatalogsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 46:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(693);
				match(SHOW);
				setState(694);
				match(COLUMNS);
				setState(695);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOCAL - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (NULLIF - 147)) | (1L << (NULLS - 147)) | (1L << (OFFSET - 147)) | (1L << (OMIT - 147)) | (1L << (ONE - 147)) | (1L << (ONLY - 147)) | (1L << (OPTION - 147)) | (1L << (ORDINALITY - 147)) | (1L << (OUTPUT - 147)) | (1L << (OVER - 147)) | (1L << (PARTITION - 147)) | (1L << (PARTITIONS - 147)) | (1L << (PAST - 147)) | (1L << (PATH - 147)) | (1L << (PATTERN - 147)) | (1L << (PER - 147)) | (1L << (PERMUTE - 147)) | (1L << (POSITION - 147)) | (1L << (PRECEDING - 147)) | (1L << (PRECISION - 147)) | (1L << (PRIVILEGES - 147)) | (1L << (PROPERTIES - 147)) | (1L << (RANGE - 147)) | (1L << (READ - 147)) | (1L << (REFRESH - 147)) | (1L << (RENAME - 147)) | (1L << (REPEATABLE - 147)) | (1L << (REPLACE - 147)) | (1L << (RESET - 147)) | (1L << (RESPECT - 147)) | (1L << (RESTRICT - 147)) | (1L << (REVOKE - 147)) | (1L << (ROLE - 147)) | (1L << (ROLES - 147)) | (1L << (ROLLBACK - 147)) | (1L << (ROW - 147)) | (1L << (ROWS - 147)) | (1L << (RUNNING - 147)) | (1L << (SCHEMA - 147)) | (1L << (SCHEMAS - 147)) | (1L << (SECOND - 147)) | (1L << (SECURITY - 147)) | (1L << (SEEK - 147)) | (1L << (SERIALIZABLE - 147)) | (1L << (SESSION - 147)) | (1L << (SET - 147)) | (1L << (SETS - 147)) | (1L << (SHOW - 147)) | (1L << (SOME - 147)) | (1L << (START - 147)) | (1L << (STATS - 147)) | (1L << (SUBSET - 147)) | (1L << (SUBSTRING - 147)) | (1L << (SYSTEM - 147)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (TABLES - 211)) | (1L << (TABLESAMPLE - 211)) | (1L << (TEXT - 211)) | (1L << (TIES - 211)) | (1L << (TIME - 211)) | (1L << (TIMESTAMP - 211)) | (1L << (TO - 211)) | (1L << (TRANSACTION - 211)) | (1L << (TRY_CAST - 211)) | (1L << (TYPE - 211)) | (1L << (UNBOUNDED - 211)) | (1L << (UNCOMMITTED - 211)) | (1L << (UNMATCHED - 211)) | (1L << (UPDATE - 211)) | (1L << (USE - 211)) | (1L << (USER - 211)) | (1L << (VALIDATE - 211)) | (1L << (VERBOSE - 211)) | (1L << (VIEW - 211)) | (1L << (WINDOW - 211)) | (1L << (WITHOUT - 211)) | (1L << (WORK - 211)) | (1L << (WRITE - 211)) | (1L << (YEAR - 211)) | (1L << (ZONE - 211)) | (1L << (IDENTIFIER - 211)) | (1L << (DIGIT_IDENTIFIER - 211)) | (1L << (QUOTED_IDENTIFIER - 211)) | (1L << (BACKQUOTED_IDENTIFIER - 211)))) != 0)) {
					{
					setState(696);
					qualifiedName();
					}
				}

				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(699);
					match(LIKE);
					setState(700);
					((ShowColumnsContext)_localctx).pattern = string();
					setState(703);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(701);
						match(ESCAPE);
						setState(702);
						((ShowColumnsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 47:
				_localctx = new ShowStatsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(707);
				match(SHOW);
				setState(708);
				match(STATS);
				setState(709);
				match(FOR);
				setState(710);
				qualifiedName();
				}
				break;
			case 48:
				_localctx = new ShowStatsForQueryContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(711);
				match(SHOW);
				setState(712);
				match(STATS);
				setState(713);
				match(FOR);
				setState(714);
				match(T__1);
				setState(715);
				query();
				setState(716);
				match(T__2);
				}
				break;
			case 49:
				_localctx = new ShowRolesContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(718);
				match(SHOW);
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(719);
					match(CURRENT);
					}
				}

				setState(722);
				match(ROLES);
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(723);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(724);
					identifier();
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowRoleGrantsContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(727);
				match(SHOW);
				setState(728);
				match(ROLE);
				setState(729);
				match(GRANTS);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(731);
					identifier();
					}
				}

				}
				break;
			case 51:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(734);
				match(DESCRIBE);
				setState(735);
				qualifiedName();
				}
				break;
			case 52:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(736);
				match(DESC);
				setState(737);
				qualifiedName();
				}
				break;
			case 53:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(738);
				match(SHOW);
				setState(739);
				match(FUNCTIONS);
				setState(746);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(740);
					match(LIKE);
					setState(741);
					((ShowFunctionsContext)_localctx).pattern = string();
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(742);
						match(ESCAPE);
						setState(743);
						((ShowFunctionsContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 54:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(748);
				match(SHOW);
				setState(749);
				match(SESSION);
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(750);
					match(LIKE);
					setState(751);
					((ShowSessionContext)_localctx).pattern = string();
					setState(754);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ESCAPE) {
						{
						setState(752);
						match(ESCAPE);
						setState(753);
						((ShowSessionContext)_localctx).escape = string();
						}
					}

					}
				}

				}
				break;
			case 55:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(758);
				match(SET);
				setState(759);
				match(SESSION);
				setState(760);
				qualifiedName();
				setState(761);
				match(EQ);
				setState(762);
				expression();
				}
				break;
			case 56:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(764);
				match(RESET);
				setState(765);
				match(SESSION);
				setState(766);
				qualifiedName();
				}
				break;
			case 57:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(767);
				match(START);
				setState(768);
				match(TRANSACTION);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(769);
					transactionMode();
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(770);
						match(T__3);
						setState(771);
						transactionMode();
						}
						}
						setState(776);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 58:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(779);
				match(COMMIT);
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(780);
					match(WORK);
					}
				}

				}
				break;
			case 59:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(783);
				match(ROLLBACK);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(784);
					match(WORK);
					}
				}

				}
				break;
			case 60:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(787);
				match(PREPARE);
				setState(788);
				identifier();
				setState(789);
				match(FROM);
				setState(790);
				statement();
				}
				break;
			case 61:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(792);
				match(DEALLOCATE);
				setState(793);
				match(PREPARE);
				setState(794);
				identifier();
				}
				break;
			case 62:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(795);
				match(EXECUTE);
				setState(796);
				identifier();
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(797);
					match(USING);
					setState(798);
					expression();
					setState(803);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(799);
						match(T__3);
						setState(800);
						expression();
						}
						}
						setState(805);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 63:
				_localctx = new DescribeInputContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(808);
				match(DESCRIBE);
				setState(809);
				match(INPUT);
				setState(810);
				identifier();
				}
				break;
			case 64:
				_localctx = new DescribeOutputContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(811);
				match(DESCRIBE);
				setState(812);
				match(OUTPUT);
				setState(813);
				identifier();
				}
				break;
			case 65:
				_localctx = new SetPathContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(814);
				match(SET);
				setState(815);
				match(PATH);
				setState(816);
				pathSpecification();
				}
				break;
			case 66:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(817);
				match(SET);
				setState(818);
				match(TIME);
				setState(819);
				match(ZONE);
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(820);
					match(LOCAL);
					}
					break;
				case 2:
					{
					setState(821);
					expression();
					}
					break;
				}
				}
				break;
			case 67:
				_localctx = new UpdateContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(824);
				match(UPDATE);
				setState(825);
				qualifiedName();
				setState(826);
				match(SET);
				setState(827);
				updateAssignment();
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(828);
					match(T__3);
					setState(829);
					updateAssignment();
					}
					}
					setState(834);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(835);
					match(WHERE);
					setState(836);
					((UpdateContext)_localctx).where = booleanExpression(0);
					}
				}

				}
				break;
			case 68:
				_localctx = new MergeContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(839);
				match(MERGE);
				setState(840);
				match(INTO);
				setState(841);
				qualifiedName();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (AS - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOCAL - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (NULLIF - 147)) | (1L << (NULLS - 147)) | (1L << (OFFSET - 147)) | (1L << (OMIT - 147)) | (1L << (ONE - 147)) | (1L << (ONLY - 147)) | (1L << (OPTION - 147)) | (1L << (ORDINALITY - 147)) | (1L << (OUTPUT - 147)) | (1L << (OVER - 147)) | (1L << (PARTITION - 147)) | (1L << (PARTITIONS - 147)) | (1L << (PAST - 147)) | (1L << (PATH - 147)) | (1L << (PATTERN - 147)) | (1L << (PER - 147)) | (1L << (PERMUTE - 147)) | (1L << (POSITION - 147)) | (1L << (PRECEDING - 147)) | (1L << (PRECISION - 147)) | (1L << (PRIVILEGES - 147)) | (1L << (PROPERTIES - 147)) | (1L << (RANGE - 147)) | (1L << (READ - 147)) | (1L << (REFRESH - 147)) | (1L << (RENAME - 147)) | (1L << (REPEATABLE - 147)) | (1L << (REPLACE - 147)) | (1L << (RESET - 147)) | (1L << (RESPECT - 147)) | (1L << (RESTRICT - 147)) | (1L << (REVOKE - 147)) | (1L << (ROLE - 147)) | (1L << (ROLES - 147)) | (1L << (ROLLBACK - 147)) | (1L << (ROW - 147)) | (1L << (ROWS - 147)) | (1L << (RUNNING - 147)) | (1L << (SCHEMA - 147)) | (1L << (SCHEMAS - 147)) | (1L << (SECOND - 147)) | (1L << (SECURITY - 147)) | (1L << (SEEK - 147)) | (1L << (SERIALIZABLE - 147)) | (1L << (SESSION - 147)) | (1L << (SET - 147)) | (1L << (SETS - 147)) | (1L << (SHOW - 147)) | (1L << (SOME - 147)) | (1L << (START - 147)) | (1L << (STATS - 147)) | (1L << (SUBSET - 147)) | (1L << (SUBSTRING - 147)) | (1L << (SYSTEM - 147)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (TABLES - 211)) | (1L << (TABLESAMPLE - 211)) | (1L << (TEXT - 211)) | (1L << (TIES - 211)) | (1L << (TIME - 211)) | (1L << (TIMESTAMP - 211)) | (1L << (TO - 211)) | (1L << (TRANSACTION - 211)) | (1L << (TRY_CAST - 211)) | (1L << (TYPE - 211)) | (1L << (UNBOUNDED - 211)) | (1L << (UNCOMMITTED - 211)) | (1L << (UNMATCHED - 211)) | (1L << (UPDATE - 211)) | (1L << (USE - 211)) | (1L << (USER - 211)) | (1L << (VALIDATE - 211)) | (1L << (VERBOSE - 211)) | (1L << (VIEW - 211)) | (1L << (WINDOW - 211)) | (1L << (WITHOUT - 211)) | (1L << (WORK - 211)) | (1L << (WRITE - 211)) | (1L << (YEAR - 211)) | (1L << (ZONE - 211)) | (1L << (IDENTIFIER - 211)) | (1L << (DIGIT_IDENTIFIER - 211)) | (1L << (QUOTED_IDENTIFIER - 211)) | (1L << (BACKQUOTED_IDENTIFIER - 211)))) != 0)) {
					{
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(842);
						match(AS);
						}
					}

					setState(845);
					identifier();
					}
				}

				setState(848);
				match(USING);
				setState(849);
				relation(0);
				setState(850);
				match(ON);
				setState(851);
				expression();
				setState(853); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(852);
					mergeCase();
					}
					}
					setState(855); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
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
		enterRule(_localctx, 12, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(859);
				with();
				}
			}

			setState(862);
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
		enterRule(_localctx, 14, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(WITH);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(865);
				match(RECURSIVE);
				}
			}

			setState(868);
			namedQuery();
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(869);
				match(T__3);
				setState(870);
				namedQuery();
				}
				}
				setState(875);
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
		enterRule(_localctx, 16, RULE_tableElement);
		try {
			setState(878);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
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
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
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
				setState(876);
				columnDefinition();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(877);
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
		enterRule(_localctx, 18, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			identifier();
			setState(881);
			type(0);
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(882);
				match(NOT);
				setState(883);
				match(NULL);
				}
			}

			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(886);
				match(COMMENT);
				setState(887);
				string();
				}
			}

			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(890);
				match(WITH);
				setState(891);
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
		enterRule(_localctx, 20, RULE_likeClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			match(LIKE);
			setState(895);
			qualifiedName();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDING || _la==INCLUDING) {
				{
				setState(896);
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
				setState(897);
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
		enterRule(_localctx, 22, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(T__1);
			setState(901);
			property();
			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(902);
				match(T__3);
				setState(903);
				property();
				}
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(909);
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
		enterRule(_localctx, 24, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			identifier();
			setState(912);
			match(EQ);
			setState(913);
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
		public RowCountContext offset;
		public LimitRowCountContext limit;
		public RowCountContext fetchFirst;
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
		public List<RowCountContext> rowCount() {
			return getRuleContexts(RowCountContext.class);
		}
		public RowCountContext rowCount(int i) {
			return getRuleContext(RowCountContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(PrestoSqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(PrestoSqlBaseParser.FETCH, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			queryTerm(0);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(916);
				match(ORDER);
				setState(917);
				match(BY);
				setState(918);
				sortItem();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(919);
					match(T__3);
					setState(920);
					sortItem();
					}
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(928);
				match(OFFSET);
				setState(929);
				((QueryNoWithContext)_localctx).offset = rowCount();
				setState(931);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW || _la==ROWS) {
					{
					setState(930);
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

			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIMIT:
				{
				{
				setState(935);
				match(LIMIT);
				setState(936);
				((QueryNoWithContext)_localctx).limit = limitRowCount();
				}
				}
				break;
			case FETCH:
				{
				{
				setState(937);
				match(FETCH);
				setState(938);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUESTION_MARK || _la==INTEGER_VALUE) {
					{
					setState(939);
					((QueryNoWithContext)_localctx).fetchFirst = rowCount();
					}
				}

				setState(942);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(946);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(943);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(944);
					match(WITH);
					setState(945);
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

	public static class LimitRowCountContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public RowCountContext rowCount() {
			return getRuleContext(RowCountContext.class,0);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterLimitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitLimitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitRowCount);
		try {
			setState(952);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				match(ALL);
				}
				break;
			case QUESTION_MARK:
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				rowCount();
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

	public static class RowCountContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(PrestoSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(PrestoSqlBaseParser.QUESTION_MARK, 0); }
		public RowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowCountContext rowCount() throws RecognitionException {
		RowCountContext _localctx = new RowCountContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rowCount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_la = _input.LA(1);
			if ( !(_la==QUESTION_MARK || _la==INTEGER_VALUE) ) {
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(957);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(971);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(959);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(960);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(962);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(961);
							setQuantifier();
							}
						}

						setState(964);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(965);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(966);
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
						setState(968);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(967);
							setQuantifier();
							}
						}

						setState(970);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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
		enterRule(_localctx, 34, RULE_queryPrimary);
		try {
			int _alt;
			setState(992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				match(TABLE);
				setState(978);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(979);
				match(VALUES);
				setState(980);
				expression();
				setState(985);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(981);
						match(T__3);
						setState(982);
						expression();
						}
						} 
					}
					setState(987);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(988);
				match(T__1);
				setState(989);
				queryNoWith();
				setState(990);
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
		enterRule(_localctx, 36, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			expression();
			setState(996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(995);
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

			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(998);
				match(NULLS);
				setState(999);
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
		public TerminalNode WINDOW() { return getToken(PrestoSqlBaseParser.WINDOW, 0); }
		public List<WindowDefinitionContext> windowDefinition() {
			return getRuleContexts(WindowDefinitionContext.class);
		}
		public WindowDefinitionContext windowDefinition(int i) {
			return getRuleContext(WindowDefinitionContext.class,i);
		}
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
		enterRule(_localctx, 38, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			match(SELECT);
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1003);
				setQuantifier();
				}
				break;
			}
			setState(1006);
			selectItem();
			setState(1011);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1007);
					match(T__3);
					setState(1008);
					selectItem();
					}
					} 
				}
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			setState(1023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1014);
				match(FROM);
				setState(1015);
				relation(0);
				setState(1020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1016);
						match(T__3);
						setState(1017);
						relation(0);
						}
						} 
					}
					setState(1022);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				}
				break;
			}
			setState(1027);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1025);
				match(WHERE);
				setState(1026);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(1032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1029);
				match(GROUP);
				setState(1030);
				match(BY);
				setState(1031);
				groupBy();
				}
				break;
			}
			setState(1036);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1034);
				match(HAVING);
				setState(1035);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			setState(1047);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(1038);
				match(WINDOW);
				setState(1039);
				windowDefinition();
				setState(1044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1040);
						match(T__3);
						setState(1041);
						windowDefinition();
						}
						} 
					}
					setState(1046);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
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
		enterRule(_localctx, 40, RULE_groupBy);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1049);
				setQuantifier();
				}
				break;
			}
			setState(1052);
			groupingElement();
			setState(1057);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1053);
					match(T__3);
					setState(1054);
					groupingElement();
					}
					} 
				}
				setState(1059);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
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
		enterRule(_localctx, 42, RULE_groupingElement);
		int _la;
		try {
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				groupingSet();
				}
				break;
			case 2:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(ROLLUP);
				setState(1062);
				match(T__1);
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(1063);
					expression();
					setState(1068);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1064);
						match(T__3);
						setState(1065);
						expression();
						}
						}
						setState(1070);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1073);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1074);
				match(CUBE);
				setState(1075);
				match(T__1);
				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(1076);
					expression();
					setState(1081);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1077);
						match(T__3);
						setState(1078);
						expression();
						}
						}
						setState(1083);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1086);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1087);
				match(GROUPING);
				setState(1088);
				match(SETS);
				setState(1089);
				match(T__1);
				setState(1090);
				groupingSet();
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1091);
					match(T__3);
					setState(1092);
					groupingSet();
					}
					}
					setState(1097);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1098);
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
		enterRule(_localctx, 44, RULE_groupingSet);
		int _la;
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				match(T__1);
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(1103);
					expression();
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1104);
						match(T__3);
						setState(1105);
						expression();
						}
						}
						setState(1110);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1113);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1114);
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

	public static class WindowDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterWindowDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitWindowDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitWindowDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			((WindowDefinitionContext)_localctx).name = identifier();
			setState(1118);
			match(AS);
			setState(1119);
			match(T__1);
			setState(1120);
			windowSpecification();
			setState(1121);
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

	public static class WindowSpecificationContext extends ParserRuleContext {
		public IdentifierContext existingWindowName;
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterWindowSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitWindowSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitWindowSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecificationContext windowSpecification() throws RecognitionException {
		WindowSpecificationContext _localctx = new WindowSpecificationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_windowSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1123);
				((WindowSpecificationContext)_localctx).existingWindowName = identifier();
				}
				break;
			}
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1126);
				match(PARTITION);
				setState(1127);
				match(BY);
				setState(1128);
				((WindowSpecificationContext)_localctx).expression = expression();
				((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1129);
					match(T__3);
					setState(1130);
					((WindowSpecificationContext)_localctx).expression = expression();
					((WindowSpecificationContext)_localctx).partition.add(((WindowSpecificationContext)_localctx).expression);
					}
					}
					setState(1135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1138);
				match(ORDER);
				setState(1139);
				match(BY);
				setState(1140);
				sortItem();
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1141);
					match(T__3);
					setState(1142);
					sortItem();
					}
					}
					setState(1147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUPS || _la==MEASURES || _la==RANGE || _la==ROWS) {
				{
				setState(1150);
				windowFrame();
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
		enterRule(_localctx, 50, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1154);
				columnAliases();
				}
			}

			setState(1157);
			match(AS);
			setState(1158);
			match(T__1);
			setState(1159);
			query();
			setState(1160);
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
		enterRule(_localctx, 52, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
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
		enterRule(_localctx, 54, RULE_selectItem);
		int _la;
		try {
			setState(1179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				expression();
				setState(1169);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1166);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1165);
						match(AS);
						}
					}

					setState(1168);
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
				setState(1171);
				primaryExpression(0);
				setState(1172);
				match(T__0);
				setState(1173);
				match(ASTERISK);
				setState(1176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1174);
					match(AS);
					setState(1175);
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
				setState(1178);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1182);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(1202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(1184);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1198);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(1185);
						match(CROSS);
						setState(1186);
						match(JOIN);
						setState(1187);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case FULL:
					case INNER:
					case JOIN:
					case LEFT:
					case RIGHT:
						{
						setState(1188);
						joinType();
						setState(1189);
						match(JOIN);
						setState(1190);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(1191);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(1193);
						match(NATURAL);
						setState(1194);
						joinType();
						setState(1195);
						match(JOIN);
						setState(1196);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(1204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
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
		enterRule(_localctx, 58, RULE_joinType);
		int _la;
		try {
			setState(1220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1205);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1208);
				match(LEFT);
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1209);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1212);
				match(RIGHT);
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1213);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1216);
				match(FULL);
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1217);
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
		enterRule(_localctx, 60, RULE_joinCriteria);
		int _la;
		try {
			setState(1236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(ON);
				setState(1223);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1224);
				match(USING);
				setState(1225);
				match(T__1);
				setState(1226);
				identifier();
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1227);
					match(T__3);
					setState(1228);
					identifier();
					}
					}
					setState(1233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1234);
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
		public PatternRecognitionContext patternRecognition() {
			return getRuleContext(PatternRecognitionContext.class,0);
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
		enterRule(_localctx, 62, RULE_sampledRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			patternRecognition();
			setState(1245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1239);
				match(TABLESAMPLE);
				setState(1240);
				sampleType();
				setState(1241);
				match(T__1);
				setState(1242);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(1243);
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
		enterRule(_localctx, 64, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
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

	public static class PatternRecognitionContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode MATCH_RECOGNIZE() { return getToken(PrestoSqlBaseParser.MATCH_RECOGNIZE, 0); }
		public TerminalNode PATTERN() { return getToken(PrestoSqlBaseParser.PATTERN, 0); }
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public TerminalNode DEFINE() { return getToken(PrestoSqlBaseParser.DEFINE, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
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
		public TerminalNode MEASURES() { return getToken(PrestoSqlBaseParser.MEASURES, 0); }
		public List<MeasureDefinitionContext> measureDefinition() {
			return getRuleContexts(MeasureDefinitionContext.class);
		}
		public MeasureDefinitionContext measureDefinition(int i) {
			return getRuleContext(MeasureDefinitionContext.class,i);
		}
		public RowsPerMatchContext rowsPerMatch() {
			return getRuleContext(RowsPerMatchContext.class,0);
		}
		public TerminalNode AFTER() { return getToken(PrestoSqlBaseParser.AFTER, 0); }
		public TerminalNode MATCH() { return getToken(PrestoSqlBaseParser.MATCH, 0); }
		public SkipToContext skipTo() {
			return getRuleContext(SkipToContext.class,0);
		}
		public TerminalNode SUBSET() { return getToken(PrestoSqlBaseParser.SUBSET, 0); }
		public List<SubsetDefinitionContext> subsetDefinition() {
			return getRuleContexts(SubsetDefinitionContext.class);
		}
		public SubsetDefinitionContext subsetDefinition(int i) {
			return getRuleContext(SubsetDefinitionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INITIAL() { return getToken(PrestoSqlBaseParser.INITIAL, 0); }
		public TerminalNode SEEK() { return getToken(PrestoSqlBaseParser.SEEK, 0); }
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public PatternRecognitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternRecognition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPatternRecognition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPatternRecognition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPatternRecognition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternRecognitionContext patternRecognition() throws RecognitionException {
		PatternRecognitionContext _localctx = new PatternRecognitionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_patternRecognition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			aliasedRelation();
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1250);
				match(MATCH_RECOGNIZE);
				setState(1251);
				match(T__1);
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1252);
					match(PARTITION);
					setState(1253);
					match(BY);
					setState(1254);
					((PatternRecognitionContext)_localctx).expression = expression();
					((PatternRecognitionContext)_localctx).partition.add(((PatternRecognitionContext)_localctx).expression);
					setState(1259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1255);
						match(T__3);
						setState(1256);
						((PatternRecognitionContext)_localctx).expression = expression();
						((PatternRecognitionContext)_localctx).partition.add(((PatternRecognitionContext)_localctx).expression);
						}
						}
						setState(1261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1264);
					match(ORDER);
					setState(1265);
					match(BY);
					setState(1266);
					sortItem();
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1267);
						match(T__3);
						setState(1268);
						sortItem();
						}
						}
						setState(1273);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MEASURES) {
					{
					setState(1276);
					match(MEASURES);
					setState(1277);
					measureDefinition();
					setState(1282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1278);
						match(T__3);
						setState(1279);
						measureDefinition();
						}
						}
						setState(1284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ONE) {
					{
					setState(1287);
					rowsPerMatch();
					}
				}

				setState(1293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER) {
					{
					setState(1290);
					match(AFTER);
					setState(1291);
					match(MATCH);
					setState(1292);
					skipTo();
					}
				}

				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INITIAL || _la==SEEK) {
					{
					setState(1295);
					_la = _input.LA(1);
					if ( !(_la==INITIAL || _la==SEEK) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1298);
				match(PATTERN);
				setState(1299);
				match(T__1);
				setState(1300);
				rowPattern(0);
				setState(1301);
				match(T__2);
				setState(1311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUBSET) {
					{
					setState(1302);
					match(SUBSET);
					setState(1303);
					subsetDefinition();
					setState(1308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1304);
						match(T__3);
						setState(1305);
						subsetDefinition();
						}
						}
						setState(1310);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1313);
				match(DEFINE);
				setState(1314);
				variableDefinition();
				setState(1319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1315);
					match(T__3);
					setState(1316);
					variableDefinition();
					}
					}
					setState(1321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1322);
				match(T__2);
				setState(1330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(1323);
						match(AS);
						}
					}

					setState(1326);
					identifier();
					setState(1328);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
					case 1:
						{
						setState(1327);
						columnAliases();
						}
						break;
					}
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

	public static class MeasureDefinitionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MeasureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMeasureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMeasureDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMeasureDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasureDefinitionContext measureDefinition() throws RecognitionException {
		MeasureDefinitionContext _localctx = new MeasureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_measureDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			expression();
			setState(1335);
			match(AS);
			setState(1336);
			identifier();
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

	public static class RowsPerMatchContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(PrestoSqlBaseParser.ONE, 0); }
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public TerminalNode PER() { return getToken(PrestoSqlBaseParser.PER, 0); }
		public TerminalNode MATCH() { return getToken(PrestoSqlBaseParser.MATCH, 0); }
		public TerminalNode ALL() { return getToken(PrestoSqlBaseParser.ALL, 0); }
		public TerminalNode ROWS() { return getToken(PrestoSqlBaseParser.ROWS, 0); }
		public EmptyMatchHandlingContext emptyMatchHandling() {
			return getRuleContext(EmptyMatchHandlingContext.class,0);
		}
		public RowsPerMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowsPerMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRowsPerMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRowsPerMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRowsPerMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowsPerMatchContext rowsPerMatch() throws RecognitionException {
		RowsPerMatchContext _localctx = new RowsPerMatchContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rowsPerMatch);
		int _la;
		try {
			setState(1349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1338);
				match(ONE);
				setState(1339);
				match(ROW);
				setState(1340);
				match(PER);
				setState(1341);
				match(MATCH);
				}
				break;
			case ALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1342);
				match(ALL);
				setState(1343);
				match(ROWS);
				setState(1344);
				match(PER);
				setState(1345);
				match(MATCH);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OMIT || _la==SHOW || _la==WITH) {
					{
					setState(1346);
					emptyMatchHandling();
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

	public static class EmptyMatchHandlingContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode EMPTY() { return getToken(PrestoSqlBaseParser.EMPTY, 0); }
		public TerminalNode MATCHES() { return getToken(PrestoSqlBaseParser.MATCHES, 0); }
		public TerminalNode OMIT() { return getToken(PrestoSqlBaseParser.OMIT, 0); }
		public TerminalNode WITH() { return getToken(PrestoSqlBaseParser.WITH, 0); }
		public TerminalNode UNMATCHED() { return getToken(PrestoSqlBaseParser.UNMATCHED, 0); }
		public TerminalNode ROWS() { return getToken(PrestoSqlBaseParser.ROWS, 0); }
		public EmptyMatchHandlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyMatchHandling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterEmptyMatchHandling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitEmptyMatchHandling(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitEmptyMatchHandling(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyMatchHandlingContext emptyMatchHandling() throws RecognitionException {
		EmptyMatchHandlingContext _localctx = new EmptyMatchHandlingContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_emptyMatchHandling);
		try {
			setState(1360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SHOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1351);
				match(SHOW);
				setState(1352);
				match(EMPTY);
				setState(1353);
				match(MATCHES);
				}
				break;
			case OMIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354);
				match(OMIT);
				setState(1355);
				match(EMPTY);
				setState(1356);
				match(MATCHES);
				}
				break;
			case WITH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1357);
				match(WITH);
				setState(1358);
				match(UNMATCHED);
				setState(1359);
				match(ROWS);
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

	public static class SkipToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(PrestoSqlBaseParser.TO, 0); }
		public TerminalNode NEXT() { return getToken(PrestoSqlBaseParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(PrestoSqlBaseParser.ROW, 0); }
		public TerminalNode PAST() { return getToken(PrestoSqlBaseParser.PAST, 0); }
		public TerminalNode LAST() { return getToken(PrestoSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(PrestoSqlBaseParser.FIRST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SkipToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSkipTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSkipTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSkipTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipToContext skipTo() throws RecognitionException {
		SkipToContext _localctx = new SkipToContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_skipTo);
		try {
			setState(1381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				match(T__4);
				setState(1363);
				match(TO);
				setState(1364);
				match(NEXT);
				setState(1365);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1366);
				match(T__4);
				setState(1367);
				match(PAST);
				setState(1368);
				match(LAST);
				setState(1369);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1370);
				match(T__4);
				setState(1371);
				match(TO);
				setState(1372);
				match(FIRST);
				setState(1373);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1374);
				match(T__4);
				setState(1375);
				match(TO);
				setState(1376);
				match(LAST);
				setState(1377);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1378);
				match(T__4);
				setState(1379);
				match(TO);
				setState(1380);
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

	public static class SubsetDefinitionContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public List<IdentifierContext> union = new ArrayList<IdentifierContext>();
		public TerminalNode EQ() { return getToken(PrestoSqlBaseParser.EQ, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SubsetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subsetDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterSubsetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitSubsetDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitSubsetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubsetDefinitionContext subsetDefinition() throws RecognitionException {
		SubsetDefinitionContext _localctx = new SubsetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_subsetDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			((SubsetDefinitionContext)_localctx).name = identifier();
			setState(1384);
			match(EQ);
			setState(1385);
			match(T__1);
			setState(1386);
			((SubsetDefinitionContext)_localctx).identifier = identifier();
			((SubsetDefinitionContext)_localctx).union.add(((SubsetDefinitionContext)_localctx).identifier);
			setState(1391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1387);
				match(T__3);
				setState(1388);
				((SubsetDefinitionContext)_localctx).identifier = identifier();
				((SubsetDefinitionContext)_localctx).union.add(((SubsetDefinitionContext)_localctx).identifier);
				}
				}
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1394);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(PrestoSqlBaseParser.AS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			identifier();
			setState(1397);
			match(AS);
			setState(1398);
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
		enterRule(_localctx, 80, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			relationPrimary();
			setState(1408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1401);
					match(AS);
					}
				}

				setState(1404);
				identifier();
				setState(1406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1405);
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
		enterRule(_localctx, 82, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(T__1);
			setState(1411);
			identifier();
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1412);
				match(T__3);
				setState(1413);
				identifier();
				}
				}
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1419);
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
		enterRule(_localctx, 84, RULE_relationPrimary);
		int _la;
		try {
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1421);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1422);
				match(T__1);
				setState(1423);
				query();
				setState(1424);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1426);
				match(UNNEST);
				setState(1427);
				match(T__1);
				setState(1428);
				expression();
				setState(1433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1429);
					match(T__3);
					setState(1430);
					expression();
					}
					}
					setState(1435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1436);
				match(T__2);
				setState(1439);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1437);
					match(WITH);
					setState(1438);
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
				setState(1441);
				match(LATERAL);
				setState(1442);
				match(T__1);
				setState(1443);
				query();
				setState(1444);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1446);
				match(T__1);
				setState(1447);
				relation(0);
				setState(1448);
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
		enterRule(_localctx, 86, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case ADD:
			case ADMIN:
			case AFTER:
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
			case CURRENT_CATALOG:
			case CURRENT_DATE:
			case CURRENT_PATH:
			case CURRENT_SCHEMA:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case DATA:
			case DATE:
			case DAY:
			case DEFINER:
			case DESC:
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXISTS:
			case EXPLAIN:
			case EXTRACT:
			case FALSE:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPING:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case PLUS:
			case MINUS:
			case QUESTION_MARK:
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

				setState(1455);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(1457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1456);
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
				setState(1459);
				match(NOT);
				setState(1460);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1463);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1464);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(1465);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(1466);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1467);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(1468);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(1473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
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
		enterRule(_localctx, 90, RULE_predicate);
		int _la;
		try {
			setState(1535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1474);
				comparisonOperator();
				setState(1475);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1477);
				comparisonOperator();
				setState(1478);
				comparisonQuantifier();
				setState(1479);
				match(T__1);
				setState(1480);
				query();
				setState(1481);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1483);
					match(NOT);
					}
				}

				setState(1486);
				match(BETWEEN);
				setState(1487);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(1488);
				match(AND);
				setState(1489);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1491);
					match(NOT);
					}
				}

				setState(1494);
				match(IN);
				setState(1495);
				match(T__1);
				setState(1496);
				expression();
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1497);
					match(T__3);
					setState(1498);
					expression();
					}
					}
					setState(1503);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1504);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1506);
					match(NOT);
					}
				}

				setState(1509);
				match(IN);
				setState(1510);
				match(T__1);
				setState(1511);
				query();
				setState(1512);
				match(T__2);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1514);
					match(NOT);
					}
				}

				setState(1517);
				match(LIKE);
				setState(1518);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(1521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1519);
					match(ESCAPE);
					setState(1520);
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
				setState(1523);
				match(IS);
				setState(1525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1524);
					match(NOT);
					}
				}

				setState(1527);
				match(NULL);
				}
				break;
			case 8:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1528);
				match(IS);
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1529);
					match(NOT);
					}
				}

				setState(1532);
				match(DISTINCT);
				setState(1533);
				match(FROM);
				setState(1534);
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
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1538);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1539);
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
				setState(1540);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1555);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1543);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1544);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 254)) & ~0x3f) == 0 && ((1L << (_la - 254)) & ((1L << (ASTERISK - 254)) | (1L << (SLASH - 254)) | (1L << (PERCENT - 254)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1545);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1546);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1547);
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
						setState(1548);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1549);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1550);
						match(CONCAT);
						setState(1551);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(1552);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1553);
						match(AT);
						setState(1554);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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
		public TerminalNode QUESTION_MARK() { return getToken(PrestoSqlBaseParser.QUESTION_MARK, 0); }
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
	public static class MeasureContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public MeasureContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMeasure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMeasure(this);
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
		public ProcessingModeContext processingMode() {
			return getRuleContext(ProcessingModeContext.class,0);
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
	public static class CurrentSchemaContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_SCHEMA() { return getToken(PrestoSqlBaseParser.CURRENT_SCHEMA, 0); }
		public CurrentSchemaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentSchema(this);
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
	public static class CurrentCatalogContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_CATALOG() { return getToken(PrestoSqlBaseParser.CURRENT_CATALOG, 0); }
		public CurrentCatalogContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterCurrentCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitCurrentCatalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitCurrentCatalog(this);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1561);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1562);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1563);
				identifier();
				setState(1564);
				string();
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1566);
				match(DOUBLE);
				setState(1567);
				match(PRECISION);
				setState(1568);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1569);
				number();
				}
				break;
			case 6:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1570);
				booleanValue();
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1571);
				string();
				}
				break;
			case 8:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1572);
				match(BINARY_LITERAL);
				}
				break;
			case 9:
				{
				_localctx = new ParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1573);
				match(QUESTION_MARK);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1574);
				match(POSITION);
				setState(1575);
				match(T__1);
				setState(1576);
				valueExpression(0);
				setState(1577);
				match(IN);
				setState(1578);
				valueExpression(0);
				setState(1579);
				match(T__2);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1581);
				match(T__1);
				setState(1582);
				expression();
				setState(1585); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1583);
					match(T__3);
					setState(1584);
					expression();
					}
					}
					setState(1587); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(1589);
				match(T__2);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1591);
				match(ROW);
				setState(1592);
				match(T__1);
				setState(1593);
				expression();
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1594);
					match(T__3);
					setState(1595);
					expression();
					}
					}
					setState(1600);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1601);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1603);
				qualifiedName();
				setState(1604);
				match(T__1);
				setState(1605);
				match(ASTERISK);
				setState(1606);
				match(T__2);
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1607);
					filter();
					}
					break;
				}
				setState(1611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1610);
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
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1613);
					processingMode();
					}
					break;
				}
				setState(1616);
				qualifiedName();
				setState(1617);
				match(T__1);
				setState(1629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(1619);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						setState(1618);
						setQuantifier();
						}
						break;
					}
					setState(1621);
					expression();
					setState(1626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1622);
						match(T__3);
						setState(1623);
						expression();
						}
						}
						setState(1628);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(1631);
					match(ORDER);
					setState(1632);
					match(BY);
					setState(1633);
					sortItem();
					setState(1638);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1634);
						match(T__3);
						setState(1635);
						sortItem();
						}
						}
						setState(1640);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1643);
				match(T__2);
				setState(1645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1644);
					filter();
					}
					break;
				}
				setState(1651);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IGNORE || _la==RESPECT) {
						{
						setState(1647);
						nullTreatment();
						}
					}

					setState(1650);
					over();
					}
					break;
				}
				}
				break;
			case 15:
				{
				_localctx = new MeasureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1653);
				identifier();
				setState(1654);
				over();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1656);
				identifier();
				setState(1657);
				match(T__5);
				setState(1658);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1660);
				match(T__1);
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOCAL - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (NULLIF - 147)) | (1L << (NULLS - 147)) | (1L << (OFFSET - 147)) | (1L << (OMIT - 147)) | (1L << (ONE - 147)) | (1L << (ONLY - 147)) | (1L << (OPTION - 147)) | (1L << (ORDINALITY - 147)) | (1L << (OUTPUT - 147)) | (1L << (OVER - 147)) | (1L << (PARTITION - 147)) | (1L << (PARTITIONS - 147)) | (1L << (PAST - 147)) | (1L << (PATH - 147)) | (1L << (PATTERN - 147)) | (1L << (PER - 147)) | (1L << (PERMUTE - 147)) | (1L << (POSITION - 147)) | (1L << (PRECEDING - 147)) | (1L << (PRECISION - 147)) | (1L << (PRIVILEGES - 147)) | (1L << (PROPERTIES - 147)) | (1L << (RANGE - 147)) | (1L << (READ - 147)) | (1L << (REFRESH - 147)) | (1L << (RENAME - 147)) | (1L << (REPEATABLE - 147)) | (1L << (REPLACE - 147)) | (1L << (RESET - 147)) | (1L << (RESPECT - 147)) | (1L << (RESTRICT - 147)) | (1L << (REVOKE - 147)) | (1L << (ROLE - 147)) | (1L << (ROLES - 147)) | (1L << (ROLLBACK - 147)) | (1L << (ROW - 147)) | (1L << (ROWS - 147)) | (1L << (RUNNING - 147)) | (1L << (SCHEMA - 147)) | (1L << (SCHEMAS - 147)) | (1L << (SECOND - 147)) | (1L << (SECURITY - 147)) | (1L << (SEEK - 147)) | (1L << (SERIALIZABLE - 147)) | (1L << (SESSION - 147)) | (1L << (SET - 147)) | (1L << (SETS - 147)) | (1L << (SHOW - 147)) | (1L << (SOME - 147)) | (1L << (START - 147)) | (1L << (STATS - 147)) | (1L << (SUBSET - 147)) | (1L << (SUBSTRING - 147)) | (1L << (SYSTEM - 147)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (TABLES - 211)) | (1L << (TABLESAMPLE - 211)) | (1L << (TEXT - 211)) | (1L << (TIES - 211)) | (1L << (TIME - 211)) | (1L << (TIMESTAMP - 211)) | (1L << (TO - 211)) | (1L << (TRANSACTION - 211)) | (1L << (TRY_CAST - 211)) | (1L << (TYPE - 211)) | (1L << (UNBOUNDED - 211)) | (1L << (UNCOMMITTED - 211)) | (1L << (UNMATCHED - 211)) | (1L << (UPDATE - 211)) | (1L << (USE - 211)) | (1L << (USER - 211)) | (1L << (VALIDATE - 211)) | (1L << (VERBOSE - 211)) | (1L << (VIEW - 211)) | (1L << (WINDOW - 211)) | (1L << (WITHOUT - 211)) | (1L << (WORK - 211)) | (1L << (WRITE - 211)) | (1L << (YEAR - 211)) | (1L << (ZONE - 211)) | (1L << (IDENTIFIER - 211)) | (1L << (DIGIT_IDENTIFIER - 211)) | (1L << (QUOTED_IDENTIFIER - 211)) | (1L << (BACKQUOTED_IDENTIFIER - 211)))) != 0)) {
					{
					setState(1661);
					identifier();
					setState(1666);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1662);
						match(T__3);
						setState(1663);
						identifier();
						}
						}
						setState(1668);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1671);
				match(T__2);
				setState(1672);
				match(T__5);
				setState(1673);
				expression();
				}
				break;
			case 18:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1674);
				match(T__1);
				setState(1675);
				query();
				setState(1676);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1678);
				match(EXISTS);
				setState(1679);
				match(T__1);
				setState(1680);
				query();
				setState(1681);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1683);
				match(CASE);
				setState(1684);
				((SimpleCaseContext)_localctx).operand = expression();
				setState(1686); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1685);
					whenClause();
					}
					}
					setState(1688); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1690);
					match(ELSE);
					setState(1691);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1694);
				match(END);
				}
				break;
			case 21:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1696);
				match(CASE);
				setState(1698); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1697);
					whenClause();
					}
					}
					setState(1700); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1702);
					match(ELSE);
					setState(1703);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1706);
				match(END);
				}
				break;
			case 22:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1708);
				match(CAST);
				setState(1709);
				match(T__1);
				setState(1710);
				expression();
				setState(1711);
				match(AS);
				setState(1712);
				type(0);
				setState(1713);
				match(T__2);
				}
				break;
			case 23:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1715);
				match(TRY_CAST);
				setState(1716);
				match(T__1);
				setState(1717);
				expression();
				setState(1718);
				match(AS);
				setState(1719);
				type(0);
				setState(1720);
				match(T__2);
				}
				break;
			case 24:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1722);
				match(ARRAY);
				setState(1723);
				match(T__6);
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << CURRENT_CATALOG) | (1L << CURRENT_DATE) | (1L << CURRENT_PATH) | (1L << CURRENT_SCHEMA) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPING - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRUE - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)) | (1L << (PLUS - 192)) | (1L << (MINUS - 192)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (QUESTION_MARK - 258)) | (1L << (STRING - 258)) | (1L << (UNICODE_STRING - 258)) | (1L << (BINARY_LITERAL - 258)) | (1L << (INTEGER_VALUE - 258)) | (1L << (DECIMAL_VALUE - 258)) | (1L << (DOUBLE_VALUE - 258)) | (1L << (IDENTIFIER - 258)) | (1L << (DIGIT_IDENTIFIER - 258)) | (1L << (QUOTED_IDENTIFIER - 258)) | (1L << (BACKQUOTED_IDENTIFIER - 258)))) != 0)) {
					{
					setState(1724);
					expression();
					setState(1729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1725);
						match(T__3);
						setState(1726);
						expression();
						}
						}
						setState(1731);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1734);
				match(T__7);
				}
				break;
			case 25:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1735);
				identifier();
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1736);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 27:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1737);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1738);
					match(T__1);
					setState(1739);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1740);
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
				setState(1743);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1744);
					match(T__1);
					setState(1745);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1746);
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
				setState(1749);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1753);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1750);
					match(T__1);
					setState(1751);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1752);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 30:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1755);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1759);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1756);
					match(T__1);
					setState(1757);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1758);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 31:
				{
				_localctx = new CurrentUserContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1761);
				((CurrentUserContext)_localctx).name = match(CURRENT_USER);
				}
				break;
			case 32:
				{
				_localctx = new CurrentCatalogContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1762);
				((CurrentCatalogContext)_localctx).name = match(CURRENT_CATALOG);
				}
				break;
			case 33:
				{
				_localctx = new CurrentSchemaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1763);
				((CurrentSchemaContext)_localctx).name = match(CURRENT_SCHEMA);
				}
				break;
			case 34:
				{
				_localctx = new CurrentPathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1764);
				((CurrentPathContext)_localctx).name = match(CURRENT_PATH);
				}
				break;
			case 35:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1765);
				match(SUBSTRING);
				setState(1766);
				match(T__1);
				setState(1767);
				valueExpression(0);
				setState(1768);
				match(FROM);
				setState(1769);
				valueExpression(0);
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1770);
					match(FOR);
					setState(1771);
					valueExpression(0);
					}
				}

				setState(1774);
				match(T__2);
				}
				break;
			case 36:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1776);
				match(NORMALIZE);
				setState(1777);
				match(T__1);
				setState(1778);
				valueExpression(0);
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(1779);
					match(T__3);
					setState(1780);
					normalForm();
					}
				}

				setState(1783);
				match(T__2);
				}
				break;
			case 37:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1785);
				match(EXTRACT);
				setState(1786);
				match(T__1);
				setState(1787);
				identifier();
				setState(1788);
				match(FROM);
				setState(1789);
				valueExpression(0);
				setState(1790);
				match(T__2);
				}
				break;
			case 38:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1792);
				match(T__1);
				setState(1793);
				expression();
				setState(1794);
				match(T__2);
				}
				break;
			case 39:
				{
				_localctx = new GroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1796);
				match(GROUPING);
				setState(1797);
				match(T__1);
				setState(1806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (ADD - 17)) | (1L << (ADMIN - 17)) | (1L << (AFTER - 17)) | (1L << (ALL - 17)) | (1L << (ANALYZE - 17)) | (1L << (ANY - 17)) | (1L << (ARRAY - 17)) | (1L << (ASC - 17)) | (1L << (AT - 17)) | (1L << (AUTHORIZATION - 17)) | (1L << (BERNOULLI - 17)) | (1L << (CALL - 17)) | (1L << (CASCADE - 17)) | (1L << (CATALOGS - 17)) | (1L << (COLUMN - 17)) | (1L << (COLUMNS - 17)) | (1L << (COMMENT - 17)) | (1L << (COMMIT - 17)) | (1L << (COMMITTED - 17)) | (1L << (CURRENT - 17)) | (1L << (DATA - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)) | (1L << (DEFINER - 17)) | (1L << (DESC - 17)) | (1L << (DEFINE - 17)) | (1L << (DISTRIBUTED - 17)) | (1L << (DOUBLE - 17)) | (1L << (EMPTY - 17)) | (1L << (EXCLUDING - 17)) | (1L << (EXPLAIN - 17)) | (1L << (FETCH - 17)))) != 0) || ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (FILTER - 81)) | (1L << (FINAL - 81)) | (1L << (FIRST - 81)) | (1L << (FOLLOWING - 81)) | (1L << (FORMAT - 81)) | (1L << (FUNCTIONS - 81)) | (1L << (GRANT - 81)) | (1L << (GRANTED - 81)) | (1L << (GRANTS - 81)) | (1L << (GRAPHVIZ - 81)) | (1L << (GROUPS - 81)) | (1L << (HOUR - 81)) | (1L << (IF - 81)) | (1L << (IGNORE - 81)) | (1L << (INCLUDING - 81)) | (1L << (INITIAL - 81)) | (1L << (INPUT - 81)) | (1L << (INTERVAL - 81)) | (1L << (INVOKER - 81)) | (1L << (IO - 81)) | (1L << (ISOLATION - 81)) | (1L << (JSON - 81)) | (1L << (LAST - 81)) | (1L << (LATERAL - 81)) | (1L << (LEVEL - 81)) | (1L << (LIMIT - 81)) | (1L << (LOCAL - 81)) | (1L << (LOGICAL - 81)) | (1L << (MAP - 81)) | (1L << (MATCH - 81)) | (1L << (MATCHED - 81)) | (1L << (MATCHES - 81)) | (1L << (MATCH_RECOGNIZE - 81)) | (1L << (MATERIALIZED - 81)) | (1L << (MEASURES - 81)) | (1L << (MERGE - 81)) | (1L << (MINUTE - 81)) | (1L << (MONTH - 81)) | (1L << (NEXT - 81)) | (1L << (NFC - 81)) | (1L << (NFD - 81)) | (1L << (NFKC - 81)) | (1L << (NFKD - 81)) | (1L << (NO - 81)) | (1L << (NONE - 81)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (NULLIF - 147)) | (1L << (NULLS - 147)) | (1L << (OFFSET - 147)) | (1L << (OMIT - 147)) | (1L << (ONE - 147)) | (1L << (ONLY - 147)) | (1L << (OPTION - 147)) | (1L << (ORDINALITY - 147)) | (1L << (OUTPUT - 147)) | (1L << (OVER - 147)) | (1L << (PARTITION - 147)) | (1L << (PARTITIONS - 147)) | (1L << (PAST - 147)) | (1L << (PATH - 147)) | (1L << (PATTERN - 147)) | (1L << (PER - 147)) | (1L << (PERMUTE - 147)) | (1L << (POSITION - 147)) | (1L << (PRECEDING - 147)) | (1L << (PRECISION - 147)) | (1L << (PRIVILEGES - 147)) | (1L << (PROPERTIES - 147)) | (1L << (RANGE - 147)) | (1L << (READ - 147)) | (1L << (REFRESH - 147)) | (1L << (RENAME - 147)) | (1L << (REPEATABLE - 147)) | (1L << (REPLACE - 147)) | (1L << (RESET - 147)) | (1L << (RESPECT - 147)) | (1L << (RESTRICT - 147)) | (1L << (REVOKE - 147)) | (1L << (ROLE - 147)) | (1L << (ROLES - 147)) | (1L << (ROLLBACK - 147)) | (1L << (ROW - 147)) | (1L << (ROWS - 147)) | (1L << (RUNNING - 147)) | (1L << (SCHEMA - 147)) | (1L << (SCHEMAS - 147)) | (1L << (SECOND - 147)) | (1L << (SECURITY - 147)) | (1L << (SEEK - 147)) | (1L << (SERIALIZABLE - 147)) | (1L << (SESSION - 147)) | (1L << (SET - 147)) | (1L << (SETS - 147)) | (1L << (SHOW - 147)) | (1L << (SOME - 147)) | (1L << (START - 147)) | (1L << (STATS - 147)) | (1L << (SUBSET - 147)) | (1L << (SUBSTRING - 147)) | (1L << (SYSTEM - 147)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (TABLES - 211)) | (1L << (TABLESAMPLE - 211)) | (1L << (TEXT - 211)) | (1L << (TIES - 211)) | (1L << (TIME - 211)) | (1L << (TIMESTAMP - 211)) | (1L << (TO - 211)) | (1L << (TRANSACTION - 211)) | (1L << (TRY_CAST - 211)) | (1L << (TYPE - 211)) | (1L << (UNBOUNDED - 211)) | (1L << (UNCOMMITTED - 211)) | (1L << (UNMATCHED - 211)) | (1L << (UPDATE - 211)) | (1L << (USE - 211)) | (1L << (USER - 211)) | (1L << (VALIDATE - 211)) | (1L << (VERBOSE - 211)) | (1L << (VIEW - 211)) | (1L << (WINDOW - 211)) | (1L << (WITHOUT - 211)) | (1L << (WORK - 211)) | (1L << (WRITE - 211)) | (1L << (YEAR - 211)) | (1L << (ZONE - 211)) | (1L << (IDENTIFIER - 211)) | (1L << (DIGIT_IDENTIFIER - 211)) | (1L << (QUOTED_IDENTIFIER - 211)) | (1L << (BACKQUOTED_IDENTIFIER - 211)))) != 0)) {
					{
					setState(1798);
					qualifiedName();
					setState(1803);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1799);
						match(T__3);
						setState(1800);
						qualifiedName();
						}
						}
						setState(1805);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1808);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1819);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1811);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1812);
						match(T__6);
						setState(1813);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1814);
						match(T__7);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1816);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1817);
						match(T__0);
						setState(1818);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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

	public static class ProcessingModeContext extends ParserRuleContext {
		public TerminalNode RUNNING() { return getToken(PrestoSqlBaseParser.RUNNING, 0); }
		public TerminalNode FINAL() { return getToken(PrestoSqlBaseParser.FINAL, 0); }
		public ProcessingModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processingMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterProcessingMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitProcessingMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitProcessingMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessingModeContext processingMode() throws RecognitionException {
		ProcessingModeContext _localctx = new ProcessingModeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_processingMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==RUNNING) ) {
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
		enterRule(_localctx, 98, RULE_nullTreatment);
		try {
			setState(1830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IGNORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1826);
				match(IGNORE);
				setState(1827);
				match(NULLS);
				}
				break;
			case RESPECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1828);
				match(RESPECT);
				setState(1829);
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
		enterRule(_localctx, 100, RULE_string);
		try {
			setState(1838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new BasicStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1832);
				match(STRING);
				}
				break;
			case UNICODE_STRING:
				_localctx = new UnicodeStringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1833);
				match(UNICODE_STRING);
				setState(1836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1834);
					match(UESCAPE);
					setState(1835);
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
		enterRule(_localctx, 102, RULE_timeZoneSpecifier);
		try {
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1840);
				match(TIME);
				setState(1841);
				match(ZONE);
				setState(1842);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1843);
				match(TIME);
				setState(1844);
				match(ZONE);
				setState(1845);
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
		enterRule(_localctx, 104, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			_la = _input.LA(1);
			if ( !(((((_la - 246)) & ~0x3f) == 0 && ((1L << (_la - 246)) & ((1L << (EQ - 246)) | (1L << (NEQ - 246)) | (1L << (LT - 246)) | (1L << (LTE - 246)) | (1L << (GT - 246)) | (1L << (GTE - 246)))) != 0)) ) {
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
		enterRule(_localctx, 106, RULE_comparisonQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
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
		enterRule(_localctx, 108, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
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
		enterRule(_localctx, 110, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(INTERVAL);
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1855);
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

			setState(1858);
			string();
			setState(1859);
			((IntervalContext)_localctx).from = intervalField();
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				{
				setState(1860);
				match(TO);
				setState(1861);
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
		enterRule(_localctx, 112, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			_la = _input.LA(1);
			if ( !(_la==DAY || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (HOUR - 98)) | (1L << (MINUTE - 98)) | (1L << (MONTH - 98)))) != 0) || _la==SECOND || _la==YEAR) ) {
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
		enterRule(_localctx, 114, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (NFC - 138)) | (1L << (NFD - 138)) | (1L << (NFKC - 138)) | (1L << (NFKD - 138)))) != 0)) ) {
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
		public TerminalNode LT() { return getToken(PrestoSqlBaseParser.LT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(PrestoSqlBaseParser.GT, 0); }
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
		public TerminalNode LT() { return getToken(PrestoSqlBaseParser.LT, 0); }
		public TerminalNode GT() { return getToken(PrestoSqlBaseParser.GT, 0); }
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				_localctx = new RowTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1869);
				match(ROW);
				setState(1870);
				match(T__1);
				setState(1871);
				rowField();
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1872);
					match(T__3);
					setState(1873);
					rowField();
					}
					}
					setState(1878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1879);
				match(T__2);
				}
				break;
			case 2:
				{
				_localctx = new IntervalTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1881);
				match(INTERVAL);
				setState(1882);
				((IntervalTypeContext)_localctx).from = intervalField();
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
				case 1:
					{
					setState(1883);
					match(TO);
					setState(1884);
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
				setState(1887);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1888);
					match(T__1);
					setState(1889);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1890);
					match(T__2);
					}
					break;
				}
				setState(1897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1894);
					match(WITHOUT);
					setState(1895);
					match(TIME);
					setState(1896);
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
				setState(1899);
				((DateTimeTypeContext)_localctx).base = match(TIMESTAMP);
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1900);
					match(T__1);
					setState(1901);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1902);
					match(T__2);
					}
				}

				setState(1906);
				match(WITH);
				setState(1907);
				match(TIME);
				setState(1908);
				match(ZONE);
				}
				break;
			case 5:
				{
				_localctx = new DateTimeTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1909);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1914);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1910);
					match(T__1);
					setState(1911);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1912);
					match(T__2);
					}
					break;
				}
				setState(1919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1916);
					match(WITHOUT);
					setState(1917);
					match(TIME);
					setState(1918);
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
				setState(1921);
				((DateTimeTypeContext)_localctx).base = match(TIME);
				setState(1926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1922);
					match(T__1);
					setState(1923);
					((DateTimeTypeContext)_localctx).precision = typeParameter();
					setState(1924);
					match(T__2);
					}
				}

				setState(1928);
				match(WITH);
				setState(1929);
				match(TIME);
				setState(1930);
				match(ZONE);
				}
				break;
			case 7:
				{
				_localctx = new DoublePrecisionTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1931);
				match(DOUBLE);
				setState(1932);
				match(PRECISION);
				}
				break;
			case 8:
				{
				_localctx = new LegacyArrayTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1933);
				match(ARRAY);
				setState(1934);
				match(LT);
				setState(1935);
				type(0);
				setState(1936);
				match(GT);
				}
				break;
			case 9:
				{
				_localctx = new LegacyMapTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1938);
				match(MAP);
				setState(1939);
				match(LT);
				setState(1940);
				((LegacyMapTypeContext)_localctx).keyType = type(0);
				setState(1941);
				match(T__3);
				setState(1942);
				((LegacyMapTypeContext)_localctx).valueType = type(0);
				setState(1943);
				match(GT);
				}
				break;
			case 10:
				{
				_localctx = new GenericTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1945);
				identifier();
				setState(1957);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1946);
					match(T__1);
					setState(1947);
					typeParameter();
					setState(1952);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1948);
						match(T__3);
						setState(1949);
						typeParameter();
						}
						}
						setState(1954);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1955);
					match(T__2);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1961);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1962);
					match(ARRAY);
					setState(1966);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
					case 1:
						{
						setState(1963);
						match(T__6);
						setState(1964);
						match(INTEGER_VALUE);
						setState(1965);
						match(T__7);
						}
						break;
					}
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		enterRule(_localctx, 118, RULE_rowField);
		try {
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1974);
				identifier();
				setState(1975);
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
		enterRule(_localctx, 120, RULE_typeParameter);
		try {
			setState(1981);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case ADMIN:
			case AFTER:
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
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
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
				setState(1980);
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
		enterRule(_localctx, 122, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1983);
			match(WHEN);
			setState(1984);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1985);
			match(THEN);
			setState(1986);
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
		enterRule(_localctx, 124, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(FILTER);
			setState(1989);
			match(T__1);
			setState(1990);
			match(WHERE);
			setState(1991);
			booleanExpression(0);
			setState(1992);
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

	public static class MergeCaseContext extends ParserRuleContext {
		public MergeCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeCase; }
	 
		public MergeCaseContext() { }
		public void copyFrom(MergeCaseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MergeInsertContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(PrestoSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(PrestoSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(PrestoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(PrestoSqlBaseParser.THEN, 0); }
		public TerminalNode INSERT() { return getToken(PrestoSqlBaseParser.INSERT, 0); }
		public TerminalNode VALUES() { return getToken(PrestoSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MergeInsertContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMergeInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMergeInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMergeInsert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeUpdateContext extends MergeCaseContext {
		public ExpressionContext condition;
		public IdentifierContext identifier;
		public List<IdentifierContext> targets = new ArrayList<IdentifierContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> values = new ArrayList<ExpressionContext>();
		public TerminalNode WHEN() { return getToken(PrestoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(PrestoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(PrestoSqlBaseParser.THEN, 0); }
		public TerminalNode UPDATE() { return getToken(PrestoSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public List<TerminalNode> EQ() { return getTokens(PrestoSqlBaseParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(PrestoSqlBaseParser.EQ, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public MergeUpdateContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMergeUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMergeUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMergeUpdate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeDeleteContext extends MergeCaseContext {
		public ExpressionContext condition;
		public TerminalNode WHEN() { return getToken(PrestoSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(PrestoSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(PrestoSqlBaseParser.THEN, 0); }
		public TerminalNode DELETE() { return getToken(PrestoSqlBaseParser.DELETE, 0); }
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MergeDeleteContext(MergeCaseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterMergeDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitMergeDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitMergeDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeCaseContext mergeCase() throws RecognitionException {
		MergeCaseContext _localctx = new MergeCaseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mergeCase);
		int _la;
		try {
			setState(2058);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				_localctx = new MergeUpdateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1994);
				match(WHEN);
				setState(1995);
				match(MATCHED);
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(1996);
					match(AND);
					setState(1997);
					((MergeUpdateContext)_localctx).condition = expression();
					}
				}

				setState(2000);
				match(THEN);
				setState(2001);
				match(UPDATE);
				setState(2002);
				match(SET);
				setState(2003);
				((MergeUpdateContext)_localctx).identifier = identifier();
				((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
				setState(2004);
				match(EQ);
				setState(2005);
				((MergeUpdateContext)_localctx).expression = expression();
				((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2006);
					match(T__3);
					setState(2007);
					((MergeUpdateContext)_localctx).identifier = identifier();
					((MergeUpdateContext)_localctx).targets.add(((MergeUpdateContext)_localctx).identifier);
					setState(2008);
					match(EQ);
					setState(2009);
					((MergeUpdateContext)_localctx).expression = expression();
					((MergeUpdateContext)_localctx).values.add(((MergeUpdateContext)_localctx).expression);
					}
					}
					setState(2015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new MergeDeleteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2016);
				match(WHEN);
				setState(2017);
				match(MATCHED);
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(2018);
					match(AND);
					setState(2019);
					((MergeDeleteContext)_localctx).condition = expression();
					}
				}

				setState(2022);
				match(THEN);
				setState(2023);
				match(DELETE);
				}
				break;
			case 3:
				_localctx = new MergeInsertContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2024);
				match(WHEN);
				setState(2025);
				match(NOT);
				setState(2026);
				match(MATCHED);
				setState(2029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND) {
					{
					setState(2027);
					match(AND);
					setState(2028);
					((MergeInsertContext)_localctx).condition = expression();
					}
				}

				setState(2031);
				match(THEN);
				setState(2032);
				match(INSERT);
				setState(2044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2033);
					match(T__1);
					setState(2034);
					((MergeInsertContext)_localctx).identifier = identifier();
					((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
					setState(2039);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2035);
						match(T__3);
						setState(2036);
						((MergeInsertContext)_localctx).identifier = identifier();
						((MergeInsertContext)_localctx).targets.add(((MergeInsertContext)_localctx).identifier);
						}
						}
						setState(2041);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2042);
					match(T__2);
					}
				}

				setState(2046);
				match(VALUES);
				setState(2047);
				match(T__1);
				setState(2048);
				((MergeInsertContext)_localctx).expression = expression();
				((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2049);
					match(T__3);
					setState(2050);
					((MergeInsertContext)_localctx).expression = expression();
					((MergeInsertContext)_localctx).values.add(((MergeInsertContext)_localctx).expression);
					}
					}
					setState(2055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2056);
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

	public static class OverContext extends ParserRuleContext {
		public IdentifierContext windowName;
		public TerminalNode OVER() { return getToken(PrestoSqlBaseParser.OVER, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 128, RULE_over);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			match(OVER);
			setState(2066);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
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
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				setState(2061);
				((OverContext)_localctx).windowName = identifier();
				}
				break;
			case T__1:
				{
				setState(2062);
				match(T__1);
				setState(2063);
				windowSpecification();
				setState(2064);
				match(T__2);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public FrameExtentContext frameExtent() {
			return getRuleContext(FrameExtentContext.class,0);
		}
		public TerminalNode MEASURES() { return getToken(PrestoSqlBaseParser.MEASURES, 0); }
		public List<MeasureDefinitionContext> measureDefinition() {
			return getRuleContexts(MeasureDefinitionContext.class);
		}
		public MeasureDefinitionContext measureDefinition(int i) {
			return getRuleContext(MeasureDefinitionContext.class,i);
		}
		public TerminalNode AFTER() { return getToken(PrestoSqlBaseParser.AFTER, 0); }
		public TerminalNode MATCH() { return getToken(PrestoSqlBaseParser.MATCH, 0); }
		public SkipToContext skipTo() {
			return getRuleContext(SkipToContext.class,0);
		}
		public TerminalNode PATTERN() { return getToken(PrestoSqlBaseParser.PATTERN, 0); }
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public TerminalNode SUBSET() { return getToken(PrestoSqlBaseParser.SUBSET, 0); }
		public List<SubsetDefinitionContext> subsetDefinition() {
			return getRuleContexts(SubsetDefinitionContext.class);
		}
		public SubsetDefinitionContext subsetDefinition(int i) {
			return getRuleContext(SubsetDefinitionContext.class,i);
		}
		public TerminalNode DEFINE() { return getToken(PrestoSqlBaseParser.DEFINE, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public TerminalNode INITIAL() { return getToken(PrestoSqlBaseParser.INITIAL, 0); }
		public TerminalNode SEEK() { return getToken(PrestoSqlBaseParser.SEEK, 0); }
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
		enterRule(_localctx, 130, RULE_windowFrame);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MEASURES) {
				{
				setState(2068);
				match(MEASURES);
				setState(2069);
				measureDefinition();
				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2070);
					match(T__3);
					setState(2071);
					measureDefinition();
					}
					}
					setState(2076);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2079);
			frameExtent();
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER) {
				{
				setState(2080);
				match(AFTER);
				setState(2081);
				match(MATCH);
				setState(2082);
				skipTo();
				}
			}

			setState(2086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INITIAL || _la==SEEK) {
				{
				setState(2085);
				_la = _input.LA(1);
				if ( !(_la==INITIAL || _la==SEEK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PATTERN) {
				{
				setState(2088);
				match(PATTERN);
				setState(2089);
				match(T__1);
				setState(2090);
				rowPattern(0);
				setState(2091);
				match(T__2);
				}
			}

			setState(2104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBSET) {
				{
				setState(2095);
				match(SUBSET);
				setState(2096);
				subsetDefinition();
				setState(2101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2097);
					match(T__3);
					setState(2098);
					subsetDefinition();
					}
					}
					setState(2103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(2106);
				match(DEFINE);
				setState(2107);
				variableDefinition();
				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2108);
					match(T__3);
					setState(2109);
					variableDefinition();
					}
					}
					setState(2114);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class FrameExtentContext extends ParserRuleContext {
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
		public TerminalNode GROUPS() { return getToken(PrestoSqlBaseParser.GROUPS, 0); }
		public TerminalNode BETWEEN() { return getToken(PrestoSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PrestoSqlBaseParser.AND, 0); }
		public FrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameExtent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterFrameExtent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitFrameExtent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitFrameExtent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameExtentContext frameExtent() throws RecognitionException {
		FrameExtentContext _localctx = new FrameExtentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_frameExtent);
		try {
			setState(2141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2117);
				((FrameExtentContext)_localctx).frameType = match(RANGE);
				setState(2118);
				((FrameExtentContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2119);
				((FrameExtentContext)_localctx).frameType = match(ROWS);
				setState(2120);
				((FrameExtentContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2121);
				((FrameExtentContext)_localctx).frameType = match(GROUPS);
				setState(2122);
				((FrameExtentContext)_localctx).start = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2123);
				((FrameExtentContext)_localctx).frameType = match(RANGE);
				setState(2124);
				match(BETWEEN);
				setState(2125);
				((FrameExtentContext)_localctx).start = frameBound();
				setState(2126);
				match(AND);
				setState(2127);
				((FrameExtentContext)_localctx).end = frameBound();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2129);
				((FrameExtentContext)_localctx).frameType = match(ROWS);
				setState(2130);
				match(BETWEEN);
				setState(2131);
				((FrameExtentContext)_localctx).start = frameBound();
				setState(2132);
				match(AND);
				setState(2133);
				((FrameExtentContext)_localctx).end = frameBound();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2135);
				((FrameExtentContext)_localctx).frameType = match(GROUPS);
				setState(2136);
				match(BETWEEN);
				setState(2137);
				((FrameExtentContext)_localctx).start = frameBound();
				setState(2138);
				match(AND);
				setState(2139);
				((FrameExtentContext)_localctx).end = frameBound();
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
		enterRule(_localctx, 134, RULE_frameBound);
		int _la;
		try {
			setState(2152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2143);
				match(UNBOUNDED);
				setState(2144);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2145);
				match(UNBOUNDED);
				setState(2146);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2147);
				match(CURRENT);
				setState(2148);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2149);
				expression();
				setState(2150);
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

	public static class RowPatternContext extends ParserRuleContext {
		public RowPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowPattern; }
	 
		public RowPatternContext() { }
		public void copyFrom(RowPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuantifiedPrimaryContext extends RowPatternContext {
		public PatternPrimaryContext patternPrimary() {
			return getRuleContext(PatternPrimaryContext.class,0);
		}
		public PatternQuantifierContext patternQuantifier() {
			return getRuleContext(PatternQuantifierContext.class,0);
		}
		public QuantifiedPrimaryContext(RowPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterQuantifiedPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitQuantifiedPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitQuantifiedPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatternConcatenationContext extends RowPatternContext {
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternConcatenationContext(RowPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPatternConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPatternConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPatternConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatternAlternationContext extends RowPatternContext {
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternAlternationContext(RowPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPatternAlternation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPatternAlternation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPatternAlternation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowPatternContext rowPattern() throws RecognitionException {
		return rowPattern(0);
	}

	private RowPatternContext rowPattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RowPatternContext _localctx = new RowPatternContext(_ctx, _parentState);
		RowPatternContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_rowPattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QuantifiedPrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2155);
			patternPrimary();
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				{
				setState(2156);
				patternQuantifier();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						_localctx = new PatternConcatenationContext(new RowPatternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rowPattern);
						setState(2159);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2160);
						rowPattern(3);
						}
						break;
					case 2:
						{
						_localctx = new PatternAlternationContext(new RowPatternContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rowPattern);
						setState(2161);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2162);
						match(T__8);
						setState(2163);
						rowPattern(2);
						}
						break;
					}
					} 
				}
				setState(2168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,277,_ctx);
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

	public static class PatternPrimaryContext extends ParserRuleContext {
		public PatternPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternPrimary; }
	 
		public PatternPrimaryContext() { }
		public void copyFrom(PatternPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PatternPermutationContext extends PatternPrimaryContext {
		public TerminalNode PERMUTE() { return getToken(PrestoSqlBaseParser.PERMUTE, 0); }
		public List<RowPatternContext> rowPattern() {
			return getRuleContexts(RowPatternContext.class);
		}
		public RowPatternContext rowPattern(int i) {
			return getRuleContext(RowPatternContext.class,i);
		}
		public PatternPermutationContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPatternPermutation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPatternPermutation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPatternPermutation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionEndAnchorContext extends PatternPrimaryContext {
		public PartitionEndAnchorContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPartitionEndAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPartitionEndAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPartitionEndAnchor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PatternVariableContext extends PatternPrimaryContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PatternVariableContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPatternVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPatternVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPatternVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExcludedPatternContext extends PatternPrimaryContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public ExcludedPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterExcludedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitExcludedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitExcludedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionStartAnchorContext extends PatternPrimaryContext {
		public PartitionStartAnchorContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterPartitionStartAnchor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitPartitionStartAnchor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitPartitionStartAnchor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyPatternContext extends PatternPrimaryContext {
		public EmptyPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterEmptyPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitEmptyPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitEmptyPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupedPatternContext extends PatternPrimaryContext {
		public RowPatternContext rowPattern() {
			return getRuleContext(RowPatternContext.class,0);
		}
		public GroupedPatternContext(PatternPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterGroupedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitGroupedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitGroupedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternPrimaryContext patternPrimary() throws RecognitionException {
		PatternPrimaryContext _localctx = new PatternPrimaryContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_patternPrimary);
		int _la;
		try {
			setState(2194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				_localctx = new PatternVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				identifier();
				}
				break;
			case 2:
				_localctx = new EmptyPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2170);
				match(T__1);
				setState(2171);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new PatternPermutationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2172);
				match(PERMUTE);
				setState(2173);
				match(T__1);
				setState(2174);
				rowPattern(0);
				setState(2179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2175);
					match(T__3);
					setState(2176);
					rowPattern(0);
					}
					}
					setState(2181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2182);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new GroupedPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2184);
				match(T__1);
				setState(2185);
				rowPattern(0);
				setState(2186);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new PartitionStartAnchorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2188);
				match(T__9);
				}
				break;
			case 6:
				_localctx = new PartitionEndAnchorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2189);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new ExcludedPatternContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2190);
				match(T__11);
				setState(2191);
				rowPattern(0);
				setState(2192);
				match(T__12);
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

	public static class PatternQuantifierContext extends ParserRuleContext {
		public PatternQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternQuantifier; }
	 
		public PatternQuantifierContext() { }
		public void copyFrom(PatternQuantifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ZeroOrMoreQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public TerminalNode ASTERISK() { return getToken(PrestoSqlBaseParser.ASTERISK, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(PrestoSqlBaseParser.QUESTION_MARK, 0); }
		public ZeroOrMoreQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterZeroOrMoreQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitZeroOrMoreQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitZeroOrMoreQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneOrMoreQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public TerminalNode PLUS() { return getToken(PrestoSqlBaseParser.PLUS, 0); }
		public TerminalNode QUESTION_MARK() { return getToken(PrestoSqlBaseParser.QUESTION_MARK, 0); }
		public OneOrMoreQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterOneOrMoreQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitOneOrMoreQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitOneOrMoreQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ZeroOrOneQuantifierContext extends PatternQuantifierContext {
		public Token reluctant;
		public List<TerminalNode> QUESTION_MARK() { return getTokens(PrestoSqlBaseParser.QUESTION_MARK); }
		public TerminalNode QUESTION_MARK(int i) {
			return getToken(PrestoSqlBaseParser.QUESTION_MARK, i);
		}
		public ZeroOrOneQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterZeroOrOneQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitZeroOrOneQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitZeroOrOneQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RangeQuantifierContext extends PatternQuantifierContext {
		public Token exactly;
		public Token reluctant;
		public Token atLeast;
		public Token atMost;
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(PrestoSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(PrestoSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(PrestoSqlBaseParser.QUESTION_MARK, 0); }
		public RangeQuantifierContext(PatternQuantifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterRangeQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitRangeQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitRangeQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternQuantifierContext patternQuantifier() throws RecognitionException {
		PatternQuantifierContext _localctx = new PatternQuantifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_patternQuantifier);
		int _la;
		try {
			setState(2226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				_localctx = new ZeroOrMoreQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2196);
				match(ASTERISK);
				setState(2198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2197);
					((ZeroOrMoreQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new OneOrMoreQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2200);
				match(PLUS);
				setState(2202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2201);
					((OneOrMoreQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ZeroOrOneQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2204);
				match(QUESTION_MARK);
				setState(2206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2205);
					((ZeroOrOneQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new RangeQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2208);
				match(T__13);
				setState(2209);
				((RangeQuantifierContext)_localctx).exactly = match(INTEGER_VALUE);
				setState(2210);
				match(T__14);
				setState(2212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2211);
					((RangeQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new RangeQuantifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2214);
				match(T__13);
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(2215);
					((RangeQuantifierContext)_localctx).atLeast = match(INTEGER_VALUE);
					}
				}

				setState(2218);
				match(T__3);
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_VALUE) {
					{
					setState(2219);
					((RangeQuantifierContext)_localctx).atMost = match(INTEGER_VALUE);
					}
				}

				setState(2222);
				match(T__14);
				setState(2224);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2223);
					((RangeQuantifierContext)_localctx).reluctant = match(QUESTION_MARK);
					}
					break;
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

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PrestoSqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).enterUpdateAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrestoSqlBaseListener ) ((PrestoSqlBaseListener)listener).exitUpdateAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrestoSqlBaseVisitor ) return ((PrestoSqlBaseVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_updateAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			identifier();
			setState(2229);
			match(EQ);
			setState(2230);
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
		enterRule(_localctx, 144, RULE_explainOption);
		int _la;
		try {
			setState(2236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2232);
				match(FORMAT);
				setState(2233);
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
				setState(2234);
				match(TYPE);
				setState(2235);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (DISTRIBUTED - 66)) | (1L << (IO - 66)) | (1L << (LOGICAL - 66)))) != 0) || _la==VALIDATE) ) {
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
		enterRule(_localctx, 146, RULE_transactionMode);
		int _la;
		try {
			setState(2243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				match(ISOLATION);
				setState(2239);
				match(LEVEL);
				setState(2240);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2241);
				match(READ);
				setState(2242);
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
		enterRule(_localctx, 148, RULE_levelOfIsolation);
		try {
			setState(2252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				match(READ);
				setState(2246);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2247);
				match(READ);
				setState(2248);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2249);
				match(REPEATABLE);
				setState(2250);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2251);
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
		enterRule(_localctx, 150, RULE_callArgument);
		try {
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2254);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2255);
				identifier();
				setState(2256);
				match(T__15);
				setState(2257);
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
		enterRule(_localctx, 152, RULE_pathElement);
		try {
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				_localctx = new QualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2261);
				identifier();
				setState(2262);
				match(T__0);
				setState(2263);
				identifier();
				}
				break;
			case 2:
				_localctx = new UnqualifiedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2265);
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
		enterRule(_localctx, 154, RULE_pathSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			pathElement();
			setState(2273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2269);
				match(T__3);
				setState(2270);
				pathElement();
				}
				}
				setState(2275);
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
		public TerminalNode UPDATE() { return getToken(PrestoSqlBaseParser.UPDATE, 0); }
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
		enterRule(_localctx, 156, RULE_privilege);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT || _la==UPDATE) ) {
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
		enterRule(_localctx, 158, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			identifier();
			setState(2283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2279);
					match(T__0);
					setState(2280);
					identifier();
					}
					} 
				}
				setState(2285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
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
		enterRule(_localctx, 160, RULE_grantor);
		try {
			setState(2289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case ADMIN:
			case AFTER:
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
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
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
				setState(2286);
				principal();
				}
				break;
			case CURRENT_USER:
				_localctx = new CurrentUserGrantorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2287);
				match(CURRENT_USER);
				}
				break;
			case CURRENT_ROLE:
				_localctx = new CurrentRoleGrantorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2288);
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
		enterRule(_localctx, 162, RULE_principal);
		try {
			setState(2296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				_localctx = new UnspecifiedPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2291);
				identifier();
				}
				break;
			case 2:
				_localctx = new UserPrincipalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2292);
				match(USER);
				setState(2293);
				identifier();
				}
				break;
			case 3:
				_localctx = new RolePrincipalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2294);
				match(ROLE);
				setState(2295);
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
		enterRule(_localctx, 164, RULE_roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2298);
			identifier();
			setState(2303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2299);
				match(T__3);
				setState(2300);
				identifier();
				}
				}
				setState(2305);
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
		enterRule(_localctx, 166, RULE_identifier);
		try {
			setState(2311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2306);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2307);
				match(QUOTED_IDENTIFIER);
				}
				break;
			case ADD:
			case ADMIN:
			case AFTER:
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
			case DEFINE:
			case DISTRIBUTED:
			case DOUBLE:
			case EMPTY:
			case EXCLUDING:
			case EXPLAIN:
			case FETCH:
			case FILTER:
			case FINAL:
			case FIRST:
			case FOLLOWING:
			case FORMAT:
			case FUNCTIONS:
			case GRANT:
			case GRANTED:
			case GRANTS:
			case GRAPHVIZ:
			case GROUPS:
			case HOUR:
			case IF:
			case IGNORE:
			case INCLUDING:
			case INITIAL:
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
			case LOCAL:
			case LOGICAL:
			case MAP:
			case MATCH:
			case MATCHED:
			case MATCHES:
			case MATCH_RECOGNIZE:
			case MATERIALIZED:
			case MEASURES:
			case MERGE:
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
			case OMIT:
			case ONE:
			case ONLY:
			case OPTION:
			case ORDINALITY:
			case OUTPUT:
			case OVER:
			case PARTITION:
			case PARTITIONS:
			case PAST:
			case PATH:
			case PATTERN:
			case PER:
			case PERMUTE:
			case POSITION:
			case PRECEDING:
			case PRECISION:
			case PRIVILEGES:
			case PROPERTIES:
			case RANGE:
			case READ:
			case REFRESH:
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
			case RUNNING:
			case SCHEMA:
			case SCHEMAS:
			case SECOND:
			case SECURITY:
			case SEEK:
			case SERIALIZABLE:
			case SESSION:
			case SET:
			case SETS:
			case SHOW:
			case SOME:
			case START:
			case STATS:
			case SUBSET:
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
			case UNMATCHED:
			case UPDATE:
			case USE:
			case USER:
			case VALIDATE:
			case VERBOSE:
			case VIEW:
			case WINDOW:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2308);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2309);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2310);
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
		enterRule(_localctx, 168, RULE_number);
		int _la;
		try {
			setState(2325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2313);
					match(MINUS);
					}
				}

				setState(2316);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2317);
					match(MINUS);
					}
				}

				setState(2320);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2321);
					match(MINUS);
					}
				}

				setState(2324);
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
		public TerminalNode AFTER() { return getToken(PrestoSqlBaseParser.AFTER, 0); }
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
		public TerminalNode DEFINE() { return getToken(PrestoSqlBaseParser.DEFINE, 0); }
		public TerminalNode DEFINER() { return getToken(PrestoSqlBaseParser.DEFINER, 0); }
		public TerminalNode DESC() { return getToken(PrestoSqlBaseParser.DESC, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(PrestoSqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode DOUBLE() { return getToken(PrestoSqlBaseParser.DOUBLE, 0); }
		public TerminalNode EMPTY() { return getToken(PrestoSqlBaseParser.EMPTY, 0); }
		public TerminalNode EXCLUDING() { return getToken(PrestoSqlBaseParser.EXCLUDING, 0); }
		public TerminalNode EXPLAIN() { return getToken(PrestoSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FETCH() { return getToken(PrestoSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(PrestoSqlBaseParser.FILTER, 0); }
		public TerminalNode FINAL() { return getToken(PrestoSqlBaseParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(PrestoSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(PrestoSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(PrestoSqlBaseParser.FORMAT, 0); }
		public TerminalNode FUNCTIONS() { return getToken(PrestoSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GRANT() { return getToken(PrestoSqlBaseParser.GRANT, 0); }
		public TerminalNode GRANTED() { return getToken(PrestoSqlBaseParser.GRANTED, 0); }
		public TerminalNode GRANTS() { return getToken(PrestoSqlBaseParser.GRANTS, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(PrestoSqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode GROUPS() { return getToken(PrestoSqlBaseParser.GROUPS, 0); }
		public TerminalNode HOUR() { return getToken(PrestoSqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(PrestoSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(PrestoSqlBaseParser.IGNORE, 0); }
		public TerminalNode INCLUDING() { return getToken(PrestoSqlBaseParser.INCLUDING, 0); }
		public TerminalNode INITIAL() { return getToken(PrestoSqlBaseParser.INITIAL, 0); }
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
		public TerminalNode LOCAL() { return getToken(PrestoSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOGICAL() { return getToken(PrestoSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MAP() { return getToken(PrestoSqlBaseParser.MAP, 0); }
		public TerminalNode MATCH() { return getToken(PrestoSqlBaseParser.MATCH, 0); }
		public TerminalNode MATCHED() { return getToken(PrestoSqlBaseParser.MATCHED, 0); }
		public TerminalNode MATCHES() { return getToken(PrestoSqlBaseParser.MATCHES, 0); }
		public TerminalNode MATCH_RECOGNIZE() { return getToken(PrestoSqlBaseParser.MATCH_RECOGNIZE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PrestoSqlBaseParser.MATERIALIZED, 0); }
		public TerminalNode MEASURES() { return getToken(PrestoSqlBaseParser.MEASURES, 0); }
		public TerminalNode MERGE() { return getToken(PrestoSqlBaseParser.MERGE, 0); }
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
		public TerminalNode OMIT() { return getToken(PrestoSqlBaseParser.OMIT, 0); }
		public TerminalNode ONE() { return getToken(PrestoSqlBaseParser.ONE, 0); }
		public TerminalNode ONLY() { return getToken(PrestoSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(PrestoSqlBaseParser.OPTION, 0); }
		public TerminalNode ORDINALITY() { return getToken(PrestoSqlBaseParser.ORDINALITY, 0); }
		public TerminalNode OUTPUT() { return getToken(PrestoSqlBaseParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(PrestoSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(PrestoSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONS() { return getToken(PrestoSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PAST() { return getToken(PrestoSqlBaseParser.PAST, 0); }
		public TerminalNode PATH() { return getToken(PrestoSqlBaseParser.PATH, 0); }
		public TerminalNode PATTERN() { return getToken(PrestoSqlBaseParser.PATTERN, 0); }
		public TerminalNode PER() { return getToken(PrestoSqlBaseParser.PER, 0); }
		public TerminalNode PERMUTE() { return getToken(PrestoSqlBaseParser.PERMUTE, 0); }
		public TerminalNode POSITION() { return getToken(PrestoSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(PrestoSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(PrestoSqlBaseParser.PRECISION, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PrestoSqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PROPERTIES() { return getToken(PrestoSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode RANGE() { return getToken(PrestoSqlBaseParser.RANGE, 0); }
		public TerminalNode READ() { return getToken(PrestoSqlBaseParser.READ, 0); }
		public TerminalNode REFRESH() { return getToken(PrestoSqlBaseParser.REFRESH, 0); }
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
		public TerminalNode RUNNING() { return getToken(PrestoSqlBaseParser.RUNNING, 0); }
		public TerminalNode SCHEMA() { return getToken(PrestoSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(PrestoSqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(PrestoSqlBaseParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(PrestoSqlBaseParser.SECURITY, 0); }
		public TerminalNode SEEK() { return getToken(PrestoSqlBaseParser.SEEK, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(PrestoSqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode SESSION() { return getToken(PrestoSqlBaseParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(PrestoSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(PrestoSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(PrestoSqlBaseParser.SHOW, 0); }
		public TerminalNode SOME() { return getToken(PrestoSqlBaseParser.SOME, 0); }
		public TerminalNode START() { return getToken(PrestoSqlBaseParser.START, 0); }
		public TerminalNode STATS() { return getToken(PrestoSqlBaseParser.STATS, 0); }
		public TerminalNode SUBSET() { return getToken(PrestoSqlBaseParser.SUBSET, 0); }
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
		public TerminalNode UNMATCHED() { return getToken(PrestoSqlBaseParser.UNMATCHED, 0); }
		public TerminalNode UPDATE() { return getToken(PrestoSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(PrestoSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(PrestoSqlBaseParser.USER, 0); }
		public TerminalNode VALIDATE() { return getToken(PrestoSqlBaseParser.VALIDATE, 0); }
		public TerminalNode VERBOSE() { return getToken(PrestoSqlBaseParser.VERBOSE, 0); }
		public TerminalNode VIEW() { return getToken(PrestoSqlBaseParser.VIEW, 0); }
		public TerminalNode WINDOW() { return getToken(PrestoSqlBaseParser.WINDOW, 0); }
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
		enterRule(_localctx, 170, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << ALL) | (1L << ANALYZE) | (1L << ANY) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BERNOULLI) | (1L << CALL) | (1L << CASCADE) | (1L << CATALOGS) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMMITTED) | (1L << CURRENT) | (1L << DATA) | (1L << DATE) | (1L << DAY) | (1L << DEFINER) | (1L << DESC))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DEFINE - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (DOUBLE - 64)) | (1L << (EMPTY - 64)) | (1L << (EXCLUDING - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FETCH - 64)) | (1L << (FILTER - 64)) | (1L << (FINAL - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GRANT - 64)) | (1L << (GRANTED - 64)) | (1L << (GRANTS - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (GROUPS - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (INCLUDING - 64)) | (1L << (INITIAL - 64)) | (1L << (INPUT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INVOKER - 64)) | (1L << (IO - 64)) | (1L << (ISOLATION - 64)) | (1L << (JSON - 64)) | (1L << (LAST - 64)) | (1L << (LATERAL - 64)) | (1L << (LEVEL - 64)) | (1L << (LIMIT - 64)) | (1L << (LOCAL - 64)) | (1L << (LOGICAL - 64)) | (1L << (MAP - 64)) | (1L << (MATCH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MATCHED - 128)) | (1L << (MATCHES - 128)) | (1L << (MATCH_RECOGNIZE - 128)) | (1L << (MATERIALIZED - 128)) | (1L << (MEASURES - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (NEXT - 128)) | (1L << (NFC - 128)) | (1L << (NFD - 128)) | (1L << (NFKC - 128)) | (1L << (NFKD - 128)) | (1L << (NO - 128)) | (1L << (NONE - 128)) | (1L << (NULLIF - 128)) | (1L << (NULLS - 128)) | (1L << (OFFSET - 128)) | (1L << (OMIT - 128)) | (1L << (ONE - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (ORDINALITY - 128)) | (1L << (OUTPUT - 128)) | (1L << (OVER - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PAST - 128)) | (1L << (PATH - 128)) | (1L << (PATTERN - 128)) | (1L << (PER - 128)) | (1L << (PERMUTE - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRECISION - 128)) | (1L << (PRIVILEGES - 128)) | (1L << (PROPERTIES - 128)) | (1L << (RANGE - 128)) | (1L << (READ - 128)) | (1L << (REFRESH - 128)) | (1L << (RENAME - 128)) | (1L << (REPEATABLE - 128)) | (1L << (REPLACE - 128)) | (1L << (RESET - 128)) | (1L << (RESPECT - 128)) | (1L << (RESTRICT - 128)) | (1L << (REVOKE - 128)) | (1L << (ROLE - 128)) | (1L << (ROLES - 128)) | (1L << (ROLLBACK - 128)) | (1L << (ROW - 128)) | (1L << (ROWS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RUNNING - 192)) | (1L << (SCHEMA - 192)) | (1L << (SCHEMAS - 192)) | (1L << (SECOND - 192)) | (1L << (SECURITY - 192)) | (1L << (SEEK - 192)) | (1L << (SERIALIZABLE - 192)) | (1L << (SESSION - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SOME - 192)) | (1L << (START - 192)) | (1L << (STATS - 192)) | (1L << (SUBSET - 192)) | (1L << (SUBSTRING - 192)) | (1L << (SYSTEM - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TEXT - 192)) | (1L << (TIES - 192)) | (1L << (TIME - 192)) | (1L << (TIMESTAMP - 192)) | (1L << (TO - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRY_CAST - 192)) | (1L << (TYPE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCOMMITTED - 192)) | (1L << (UNMATCHED - 192)) | (1L << (UPDATE - 192)) | (1L << (USE - 192)) | (1L << (USER - 192)) | (1L << (VALIDATE - 192)) | (1L << (VERBOSE - 192)) | (1L << (VIEW - 192)) | (1L << (WINDOW - 192)) | (1L << (WITHOUT - 192)) | (1L << (WORK - 192)) | (1L << (WRITE - 192)) | (1L << (YEAR - 192)) | (1L << (ZONE - 192)))) != 0)) ) {
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
		case 16:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 28:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 44:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 46:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 47:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 58:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 68:
			return rowPattern_sempred((RowPatternContext)_localctx, predIndex);
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
			return precpred(_ctx, 17);
		case 10:
			return precpred(_ctx, 15);
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
	private boolean rowPattern_sempred(RowPatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0113\u091c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00cb"+
		"\n\7\3\7\3\7\3\7\5\7\u00d0\n\7\3\7\3\7\5\7\u00d4\n\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00da\n\7\3\7\3\7\5\7\u00de\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00f3\n\7\3\7\3\7\5\7\u00f7"+
		"\n\7\3\7\3\7\5\7\u00fb\n\7\3\7\3\7\5\7\u00ff\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0107\n\7\3\7\3\7\5\7\u010b\n\7\3\7\5\7\u010e\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0115\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u011c\n\7\f\7\16\7\u011f"+
		"\13\7\3\7\3\7\3\7\5\7\u0124\n\7\3\7\3\7\5\7\u0128\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u012e\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0135\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u013e\n\7\3\7\3\7\3\7\3\7\5\7\u0144\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0152\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u015b\n\7\3\7\3\7\3\7\3\7\5\7\u0161\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0168"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0172\n\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0179\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0181\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0189\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u0198\n\7\3\7\3\7\3\7\5\7\u019d\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u01a4"+
		"\n\7\3\7\3\7\3\7\5\7\u01a9\n\7\3\7\3\7\5\7\u01ad\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u01b5\n\7\3\7\3\7\3\7\3\7\5\7\u01bb\n\7\3\7\3\7\5\7\u01bf\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cd\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u01d4\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u01eb\n\7\f\7\16\7\u01ee"+
		"\13\7\5\7\u01f0\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01fa\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0205\n\7\f\7\16\7\u0208\13\7\3\7"+
		"\3\7\3\7\5\7\u020d\n\7\3\7\3\7\3\7\5\7\u0212\n\7\3\7\3\7\3\7\3\7\5\7\u0218"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u021f\n\7\f\7\16\7\u0222\13\7\3\7\3\7\3\7"+
		"\5\7\u0227\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u022e\n\7\3\7\3\7\3\7\3\7\7\7\u0234"+
		"\n\7\f\7\16\7\u0237\13\7\3\7\3\7\5\7\u023b\n\7\3\7\3\7\5\7\u023f\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u0247\n\7\3\7\3\7\3\7\3\7\5\7\u024d\n\7\3\7"+
		"\3\7\3\7\7\7\u0252\n\7\f\7\16\7\u0255\13\7\3\7\3\7\5\7\u0259\n\7\3\7\3"+
		"\7\5\7\u025d\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0267\n\7\3\7\5\7"+
		"\u026a\n\7\3\7\3\7\3\7\3\7\3\7\7\7\u0271\n\7\f\7\16\7\u0274\13\7\3\7\3"+
		"\7\5\7\u0278\n\7\3\7\3\7\3\7\3\7\5\7\u027e\n\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0296"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u029c\n\7\5\7\u029e\n\7\3\7\3\7\3\7\3\7\5\7\u02a4"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u02aa\n\7\5\7\u02ac\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u02b4\n\7\5\7\u02b6\n\7\3\7\3\7\3\7\3\7\5\7\u02bc\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u02c2\n\7\5\7\u02c4\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u02d3\n\7\3\7\3\7\3\7\5\7\u02d8\n\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u02df\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02eb"+
		"\n\7\5\7\u02ed\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u02f5\n\7\5\7\u02f7\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0307\n\7"+
		"\f\7\16\7\u030a\13\7\5\7\u030c\n\7\3\7\3\7\5\7\u0310\n\7\3\7\3\7\5\7\u0314"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0324"+
		"\n\7\f\7\16\7\u0327\13\7\5\7\u0329\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0339\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0341"+
		"\n\7\f\7\16\7\u0344\13\7\3\7\3\7\5\7\u0348\n\7\3\7\3\7\3\7\3\7\5\7\u034e"+
		"\n\7\3\7\5\7\u0351\n\7\3\7\3\7\3\7\3\7\3\7\6\7\u0358\n\7\r\7\16\7\u0359"+
		"\5\7\u035c\n\7\3\b\5\b\u035f\n\b\3\b\3\b\3\t\3\t\5\t\u0365\n\t\3\t\3\t"+
		"\3\t\7\t\u036a\n\t\f\t\16\t\u036d\13\t\3\n\3\n\5\n\u0371\n\n\3\13\3\13"+
		"\3\13\3\13\5\13\u0377\n\13\3\13\3\13\5\13\u037b\n\13\3\13\3\13\5\13\u037f"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u0385\n\f\3\r\3\r\3\r\3\r\7\r\u038b\n\r\f\r"+
		"\16\r\u038e\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\7\17\u039c\n\17\f\17\16\17\u039f\13\17\5\17\u03a1\n\17\3\17\3\17"+
		"\3\17\5\17\u03a6\n\17\5\17\u03a8\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u03af"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u03b5\n\17\5\17\u03b7\n\17\3\20\3\20\5"+
		"\20\u03bb\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u03c5\n\22"+
		"\3\22\3\22\3\22\3\22\5\22\u03cb\n\22\3\22\7\22\u03ce\n\22\f\22\16\22\u03d1"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u03da\n\23\f\23\16\23\u03dd"+
		"\13\23\3\23\3\23\3\23\3\23\5\23\u03e3\n\23\3\24\3\24\5\24\u03e7\n\24\3"+
		"\24\3\24\5\24\u03eb\n\24\3\25\3\25\5\25\u03ef\n\25\3\25\3\25\3\25\7\25"+
		"\u03f4\n\25\f\25\16\25\u03f7\13\25\3\25\3\25\3\25\3\25\7\25\u03fd\n\25"+
		"\f\25\16\25\u0400\13\25\5\25\u0402\n\25\3\25\3\25\5\25\u0406\n\25\3\25"+
		"\3\25\3\25\5\25\u040b\n\25\3\25\3\25\5\25\u040f\n\25\3\25\3\25\3\25\3"+
		"\25\7\25\u0415\n\25\f\25\16\25\u0418\13\25\5\25\u041a\n\25\3\26\5\26\u041d"+
		"\n\26\3\26\3\26\3\26\7\26\u0422\n\26\f\26\16\26\u0425\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u042d\n\27\f\27\16\27\u0430\13\27\5\27\u0432"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u043a\n\27\f\27\16\27\u043d\13"+
		"\27\5\27\u043f\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0448\n\27"+
		"\f\27\16\27\u044b\13\27\3\27\3\27\5\27\u044f\n\27\3\30\3\30\3\30\3\30"+
		"\7\30\u0455\n\30\f\30\16\30\u0458\13\30\5\30\u045a\n\30\3\30\3\30\5\30"+
		"\u045e\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\5\32\u0467\n\32\3\32\3"+
		"\32\3\32\3\32\3\32\7\32\u046e\n\32\f\32\16\32\u0471\13\32\5\32\u0473\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\7\32\u047a\n\32\f\32\16\32\u047d\13\32\5"+
		"\32\u047f\n\32\3\32\5\32\u0482\n\32\3\33\3\33\5\33\u0486\n\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\5\35\u0491\n\35\3\35\5\35\u0494\n"+
		"\35\3\35\3\35\3\35\3\35\3\35\5\35\u049b\n\35\3\35\5\35\u049e\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u04b1\n\36\7\36\u04b3\n\36\f\36\16\36\u04b6\13\36\3\37"+
		"\5\37\u04b9\n\37\3\37\3\37\5\37\u04bd\n\37\3\37\3\37\5\37\u04c1\n\37\3"+
		"\37\3\37\5\37\u04c5\n\37\5\37\u04c7\n\37\3 \3 \3 \3 \3 \3 \3 \7 \u04d0"+
		"\n \f \16 \u04d3\13 \3 \3 \5 \u04d7\n \3!\3!\3!\3!\3!\3!\3!\5!\u04e0\n"+
		"!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u04ec\n#\f#\16#\u04ef\13#\5#\u04f1"+
		"\n#\3#\3#\3#\3#\3#\7#\u04f8\n#\f#\16#\u04fb\13#\5#\u04fd\n#\3#\3#\3#\3"+
		"#\7#\u0503\n#\f#\16#\u0506\13#\5#\u0508\n#\3#\5#\u050b\n#\3#\3#\3#\5#"+
		"\u0510\n#\3#\5#\u0513\n#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u051d\n#\f#\16#\u0520"+
		"\13#\5#\u0522\n#\3#\3#\3#\3#\7#\u0528\n#\f#\16#\u052b\13#\3#\3#\5#\u052f"+
		"\n#\3#\3#\5#\u0533\n#\5#\u0535\n#\5#\u0537\n#\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3%\3%\3%\3%\3%\5%\u0546\n%\5%\u0548\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u0553\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u0568\n\'\3(\3(\3(\3(\3(\3(\7(\u0570\n(\f(\16(\u0573"+
		"\13(\3(\3(\3)\3)\3)\3)\3*\3*\5*\u057d\n*\3*\3*\5*\u0581\n*\5*\u0583\n"+
		"*\3+\3+\3+\3+\7+\u0589\n+\f+\16+\u058c\13+\3+\3+\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\7,\u059a\n,\f,\16,\u059d\13,\3,\3,\3,\5,\u05a2\n,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u05ad\n,\3-\3-\3.\3.\3.\5.\u05b4\n.\3.\3.\5.\u05b8"+
		"\n.\3.\3.\3.\3.\3.\3.\7.\u05c0\n.\f.\16.\u05c3\13.\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u05cf\n/\3/\3/\3/\3/\3/\3/\5/\u05d7\n/\3/\3/\3/\3/\3/\7"+
		"/\u05de\n/\f/\16/\u05e1\13/\3/\3/\3/\5/\u05e6\n/\3/\3/\3/\3/\3/\3/\5/"+
		"\u05ee\n/\3/\3/\3/\3/\5/\u05f4\n/\3/\3/\5/\u05f8\n/\3/\3/\3/\5/\u05fd"+
		"\n/\3/\3/\3/\5/\u0602\n/\3\60\3\60\3\60\3\60\5\60\u0608\n\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60\u0616\n\60\f\60"+
		"\16\60\u0619\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\6\61\u0634\n\61\r\61\16\61\u0635\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\7\61\u063f\n\61\f\61\16\61\u0642\13\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u064b\n\61\3\61\5\61\u064e\n\61\3\61\5\61\u0651\n\61\3\61\3"+
		"\61\3\61\5\61\u0656\n\61\3\61\3\61\3\61\7\61\u065b\n\61\f\61\16\61\u065e"+
		"\13\61\5\61\u0660\n\61\3\61\3\61\3\61\3\61\3\61\7\61\u0667\n\61\f\61\16"+
		"\61\u066a\13\61\5\61\u066c\n\61\3\61\3\61\5\61\u0670\n\61\3\61\5\61\u0673"+
		"\n\61\3\61\5\61\u0676\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0683\n\61\f\61\16\61\u0686\13\61\5\61\u0688\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\6\61\u0699\n\61\r\61\16\61\u069a\3\61\3\61\5\61\u069f\n\61\3\61\3\61"+
		"\3\61\3\61\6\61\u06a5\n\61\r\61\16\61\u06a6\3\61\3\61\5\61\u06ab\n\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u06c2\n\61\f\61\16\61\u06c5\13"+
		"\61\5\61\u06c7\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u06d0\n\61"+
		"\3\61\3\61\3\61\3\61\5\61\u06d6\n\61\3\61\3\61\3\61\3\61\5\61\u06dc\n"+
		"\61\3\61\3\61\3\61\3\61\5\61\u06e2\n\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u06ef\n\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\5\61\u06f8\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u070c\n\61\f\61\16\61\u070f"+
		"\13\61\5\61\u0711\n\61\3\61\5\61\u0714\n\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\7\61\u071e\n\61\f\61\16\61\u0721\13\61\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\5\63\u0729\n\63\3\64\3\64\3\64\3\64\5\64\u072f\n\64\5\64"+
		"\u0731\n\64\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0739\n\65\3\66\3\66\3"+
		"\67\3\67\38\38\39\39\59\u0743\n9\39\39\39\39\59\u0749\n9\3:\3:\3;\3;\3"+
		"<\3<\3<\3<\3<\3<\7<\u0755\n<\f<\16<\u0758\13<\3<\3<\3<\3<\3<\3<\5<\u0760"+
		"\n<\3<\3<\3<\3<\3<\5<\u0767\n<\3<\3<\3<\5<\u076c\n<\3<\3<\3<\3<\3<\5<"+
		"\u0773\n<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u077d\n<\3<\3<\3<\5<\u0782\n<\3<"+
		"\3<\3<\3<\3<\5<\u0789\n<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\7<\u07a1\n<\f<\16<\u07a4\13<\3<\3<\5<\u07a8\n<\5"+
		"<\u07aa\n<\3<\3<\3<\3<\3<\5<\u07b1\n<\7<\u07b3\n<\f<\16<\u07b6\13<\3="+
		"\3=\3=\3=\5=\u07bc\n=\3>\3>\5>\u07c0\n>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@"+
		"\3@\3A\3A\3A\3A\5A\u07d1\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u07de"+
		"\nA\fA\16A\u07e1\13A\3A\3A\3A\3A\5A\u07e7\nA\3A\3A\3A\3A\3A\3A\3A\5A\u07f0"+
		"\nA\3A\3A\3A\3A\3A\3A\7A\u07f8\nA\fA\16A\u07fb\13A\3A\3A\5A\u07ff\nA\3"+
		"A\3A\3A\3A\3A\7A\u0806\nA\fA\16A\u0809\13A\3A\3A\5A\u080d\nA\3B\3B\3B"+
		"\3B\3B\3B\5B\u0815\nB\3C\3C\3C\3C\7C\u081b\nC\fC\16C\u081e\13C\5C\u0820"+
		"\nC\3C\3C\3C\3C\5C\u0826\nC\3C\5C\u0829\nC\3C\3C\3C\3C\3C\5C\u0830\nC"+
		"\3C\3C\3C\3C\7C\u0836\nC\fC\16C\u0839\13C\5C\u083b\nC\3C\3C\3C\3C\7C\u0841"+
		"\nC\fC\16C\u0844\13C\5C\u0846\nC\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0860\nD\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\5E\u086b\nE\3F\3F\3F\5F\u0870\nF\3F\3F\3F\3F\3F\7F\u0877\nF\fF\16"+
		"F\u087a\13F\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0884\nG\fG\16G\u0887\13G\3G\3"+
		"G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0895\nG\3H\3H\5H\u0899\nH\3H\3H\5"+
		"H\u089d\nH\3H\3H\5H\u08a1\nH\3H\3H\3H\3H\5H\u08a7\nH\3H\3H\5H\u08ab\n"+
		"H\3H\3H\5H\u08af\nH\3H\3H\5H\u08b3\nH\5H\u08b5\nH\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\5J\u08bf\nJ\3K\3K\3K\3K\3K\5K\u08c6\nK\3L\3L\3L\3L\3L\3L\3L\5L\u08cf"+
		"\nL\3M\3M\3M\3M\3M\5M\u08d6\nM\3N\3N\3N\3N\3N\5N\u08dd\nN\3O\3O\3O\7O"+
		"\u08e2\nO\fO\16O\u08e5\13O\3P\3P\3Q\3Q\3Q\7Q\u08ec\nQ\fQ\16Q\u08ef\13"+
		"Q\3R\3R\3R\5R\u08f4\nR\3S\3S\3S\3S\3S\5S\u08fb\nS\3T\3T\3T\7T\u0900\n"+
		"T\fT\16T\u0903\13T\3U\3U\3U\3U\3U\5U\u090a\nU\3V\5V\u090d\nV\3V\3V\5V"+
		"\u0911\nV\3V\3V\5V\u0915\nV\3V\5V\u0918\nV\3W\3W\3W\2\t\":Z^`v\u008aX"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\2\36\4\2$$\u00b9\u00b9\4\2>>pp\4\2\u00c3\u00c3"+
		"\u00d4\u00d4\4\2YYgg\4\2LLhh\3\2\u00c0\u00c1\4\2UU\u008b\u008b\4\2\u0104"+
		"\u0104\u0108\u0108\4\2KK\u00e4\u00e4\4\2\35\35@@\4\2UUvv\4\2\26\26CC\4"+
		"\2  \u00d3\u00d3\4\2ii\u00c7\u00c7\3\2\u00fe\u00ff\3\2\u0100\u0102\4\2"+
		"TT\u00c2\u00c2\3\2\u00f8\u00fd\5\2\26\26\32\32\u00ce\u00ce\4\2QQ\u00de"+
		"\u00de\7\2<<dd\u0088\u0089\u00c5\u00c5\u00f6\u00f6\3\2\u008c\u008f\4\2"+
		"VV\u00ab\u00ab\5\2__uu\u00d7\u00d7\6\2DDqq\177\177\u00eb\u00eb\4\2\u009b"+
		"\u009b\u00f5\u00f5\6\2??ll\u00c8\u00c8\u00e7\u00e7\63\2\23\26\30\30\32"+
		"\33\35 #$\',\61\61:<>>@@BBDEHHLLOORVXX[_bbdfhikknnpqssuwyy{|\177\u0089"+
		"\u008b\u0091\u0095\u0098\u009a\u009c\u009f\u009f\u00a1\u00ac\u00ae\u00b1"+
		"\u00b3\u00ba\u00bc\u00be\u00c0\u00c7\u00c9\u00d3\u00d5\u00d7\u00d9\u00dd"+
		"\u00df\u00e0\u00e2\u00e3\u00e5\u00e5\u00e7\u00e9\u00eb\u00eb\u00ed\u00ee"+
		"\u00f1\u00f1\u00f3\u00f7\2\u0a93\2\u00ae\3\2\2\2\4\u00b1\3\2\2\2\6\u00b4"+
		"\3\2\2\2\b\u00b7\3\2\2\2\n\u00ba\3\2\2\2\f\u035b\3\2\2\2\16\u035e\3\2"+
		"\2\2\20\u0362\3\2\2\2\22\u0370\3\2\2\2\24\u0372\3\2\2\2\26\u0380\3\2\2"+
		"\2\30\u0386\3\2\2\2\32\u0391\3\2\2\2\34\u0395\3\2\2\2\36\u03ba\3\2\2\2"+
		" \u03bc\3\2\2\2\"\u03be\3\2\2\2$\u03e2\3\2\2\2&\u03e4\3\2\2\2(\u03ec\3"+
		"\2\2\2*\u041c\3\2\2\2,\u044e\3\2\2\2.\u045d\3\2\2\2\60\u045f\3\2\2\2\62"+
		"\u0466\3\2\2\2\64\u0483\3\2\2\2\66\u048c\3\2\2\28\u049d\3\2\2\2:\u049f"+
		"\3\2\2\2<\u04c6\3\2\2\2>\u04d6\3\2\2\2@\u04d8\3\2\2\2B\u04e1\3\2\2\2D"+
		"\u04e3\3\2\2\2F\u0538\3\2\2\2H\u0547\3\2\2\2J\u0552\3\2\2\2L\u0567\3\2"+
		"\2\2N\u0569\3\2\2\2P\u0576\3\2\2\2R\u057a\3\2\2\2T\u0584\3\2\2\2V\u05ac"+
		"\3\2\2\2X\u05ae\3\2\2\2Z\u05b7\3\2\2\2\\\u0601\3\2\2\2^\u0607\3\2\2\2"+
		"`\u0713\3\2\2\2b\u0722\3\2\2\2d\u0728\3\2\2\2f\u0730\3\2\2\2h\u0738\3"+
		"\2\2\2j\u073a\3\2\2\2l\u073c\3\2\2\2n\u073e\3\2\2\2p\u0740\3\2\2\2r\u074a"+
		"\3\2\2\2t\u074c\3\2\2\2v\u07a9\3\2\2\2x\u07bb\3\2\2\2z\u07bf\3\2\2\2|"+
		"\u07c1\3\2\2\2~\u07c6\3\2\2\2\u0080\u080c\3\2\2\2\u0082\u080e\3\2\2\2"+
		"\u0084\u081f\3\2\2\2\u0086\u085f\3\2\2\2\u0088\u086a\3\2\2\2\u008a\u086c"+
		"\3\2\2\2\u008c\u0894\3\2\2\2\u008e\u08b4\3\2\2\2\u0090\u08b6\3\2\2\2\u0092"+
		"\u08be\3\2\2\2\u0094\u08c5\3\2\2\2\u0096\u08ce\3\2\2\2\u0098\u08d5\3\2"+
		"\2\2\u009a\u08dc\3\2\2\2\u009c\u08de\3\2\2\2\u009e\u08e6\3\2\2\2\u00a0"+
		"\u08e8\3\2\2\2\u00a2\u08f3\3\2\2\2\u00a4\u08fa\3\2\2\2\u00a6\u08fc\3\2"+
		"\2\2\u00a8\u0909\3\2\2\2\u00aa\u0917\3\2\2\2\u00ac\u0919\3\2\2\2\u00ae"+
		"\u00af\5\f\7\2\u00af\u00b0\7\2\2\3\u00b0\3\3\2\2\2\u00b1\u00b2\5X-\2\u00b2"+
		"\u00b3\7\2\2\3\u00b3\5\3\2\2\2\u00b4\u00b5\5\u009cO\2\u00b5\u00b6\7\2"+
		"\2\3\u00b6\7\3\2\2\2\u00b7\u00b8\5v<\2\u00b8\u00b9\7\2\2\3\u00b9\t\3\2"+
		"\2\2\u00ba\u00bb\5\u008aF\2\u00bb\u00bc\7\2\2\3\u00bc\13\3\2\2\2\u00bd"+
		"\u035c\5\16\b\2\u00be\u00bf\7\u00e8\2\2\u00bf\u035c\5\u00a8U\2\u00c0\u00c1"+
		"\7\u00e8\2\2\u00c1\u00c2\5\u00a8U\2\u00c2\u00c3\7\3\2\2\u00c3\u00c4\5"+
		"\u00a8U\2\u00c4\u035c\3\2\2\2\u00c5\u00c6\7.\2\2\u00c6\u00ca\7\u00c3\2"+
		"\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7\u0093\2\2\u00c9\u00cb\7N\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cf\5\u00a0"+
		"Q\2\u00cd\u00ce\7\37\2\2\u00ce\u00d0\5\u00a4S\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\7\u00f2\2\2\u00d2\u00d4"+
		"\5\30\r\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u035c\3\2\2\2"+
		"\u00d5\u00d6\7F\2\2\u00d6\u00d9\7\u00c3\2\2\u00d7\u00d8\7e\2\2\u00d8\u00da"+
		"\7N\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dd\5\u00a0Q\2\u00dc\u00de\t\2\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u035c\3\2\2\2\u00df\u00e0\7\27\2\2\u00e0\u00e1\7\u00c3"+
		"\2\2\u00e1\u00e2\5\u00a0Q\2\u00e2\u00e3\7\u00b4\2\2\u00e3\u00e4\7\u00dc"+
		"\2\2\u00e4\u00e5\5\u00a8U\2\u00e5\u035c\3\2\2\2\u00e6\u00e7\7\27\2\2\u00e7"+
		"\u00e8\7\u00c3\2\2\u00e8\u00e9\5\u00a0Q\2\u00e9\u00ea\7\u00cb\2\2\u00ea"+
		"\u00eb\7\37\2\2\u00eb\u00ec\5\u00a4S\2\u00ec\u035c\3\2\2\2\u00ed\u00ee"+
		"\7.\2\2\u00ee\u00f2\7\u00d4\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7\u0093"+
		"\2\2\u00f1\u00f3\7N\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f6\5\u00a0Q\2\u00f5\u00f7\5T+\2\u00f6\u00f5\3"+
		"\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\7*\2\2\u00f9"+
		"\u00fb\5f\64\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fd\7\u00f2\2\2\u00fd\u00ff\5\30\r\2\u00fe\u00fc\3\2\2\2"+
		"\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0106\7\34\2\2\u0101\u0107"+
		"\5\16\b\2\u0102\u0103\7\4\2\2\u0103\u0104\5\16\b\2\u0104\u0105\7\5\2\2"+
		"\u0105\u0107\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0102\3\2\2\2\u0107\u010d"+
		"\3\2\2\2\u0108\u010a\7\u00f2\2\2\u0109\u010b\7\u0090\2\2\u010a\u0109\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7:\2\2\u010d"+
		"\u0108\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u035c\3\2\2\2\u010f\u0110\7."+
		"\2\2\u0110\u0114\7\u00d4\2\2\u0111\u0112\7e\2\2\u0112\u0113\7\u0093\2"+
		"\2\u0113\u0115\7N\2\2\u0114\u0111\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\5\u00a0Q\2\u0117\u0118\7\4\2\2\u0118\u011d\5\22\n"+
		"\2\u0119\u011a\7\6\2\2\u011a\u011c\5\22\n\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u0120\u0123\7\5\2\2\u0121\u0122\7*\2\2\u0122"+
		"\u0124\5f\64\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0127\3\2"+
		"\2\2\u0125\u0126\7\u00f2\2\2\u0126\u0128\5\30\r\2\u0127\u0125\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u035c\3\2\2\2\u0129\u012a\7F\2\2\u012a\u012d"+
		"\7\u00d4\2\2\u012b\u012c\7e\2\2\u012c\u012e\7N\2\2\u012d\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u035c\5\u00a0Q\2\u0130"+
		"\u0131\7l\2\2\u0131\u0132\7o\2\2\u0132\u0134\5\u00a0Q\2\u0133\u0135\5"+
		"T+\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\5\16\b\2\u0137\u035c\3\2\2\2\u0138\u0139\7?\2\2\u0139\u013a\7Y"+
		"\2\2\u013a\u013d\5\u00a0Q\2\u013b\u013c\7\u00f0\2\2\u013c\u013e\5Z.\2"+
		"\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u035c\3\2\2\2\u013f\u0140"+
		"\7\27\2\2\u0140\u0143\7\u00d4\2\2\u0141\u0142\7e\2\2\u0142\u0144\7N\2"+
		"\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146"+
		"\5\u00a0Q\2\u0146\u0147\7\u00b4\2\2\u0147\u0148\7\u00dc\2\2\u0148\u0149"+
		"\5\u00a0Q\2\u0149\u035c\3\2\2\2\u014a\u014b\7*\2\2\u014b\u014c\7\u0099"+
		"\2\2\u014c\u014d\7\u00d4\2\2\u014d\u014e\5\u00a0Q\2\u014e\u0151\7r\2\2"+
		"\u014f\u0152\5f\64\2\u0150\u0152\7\u0094\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152\u035c\3\2\2\2\u0153\u0154\7*\2\2\u0154\u0155\7\u0099"+
		"\2\2\u0155\u0156\7(\2\2\u0156\u0157\5\u00a0Q\2\u0157\u015a\7r\2\2\u0158"+
		"\u015b\5f\64\2\u0159\u015b\7\u0094\2\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015b\u035c\3\2\2\2\u015c\u015d\7\27\2\2\u015d\u0160\7\u00d4"+
		"\2\2\u015e\u015f\7e\2\2\u015f\u0161\7N\2\2\u0160\u015e\3\2\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\5\u00a0Q\2\u0163\u0164\7\u00b4"+
		"\2\2\u0164\u0167\7(\2\2\u0165\u0166\7e\2\2\u0166\u0168\7N\2\2\u0167\u0165"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5\u00a8U"+
		"\2\u016a\u016b\7\u00dc\2\2\u016b\u016c\5\u00a8U\2\u016c\u035c\3\2\2\2"+
		"\u016d\u016e\7\27\2\2\u016e\u0171\7\u00d4\2\2\u016f\u0170\7e\2\2\u0170"+
		"\u0172\7N\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173\u0174\5\u00a0Q\2\u0174\u0175\7F\2\2\u0175\u0178\7(\2\2\u0176"+
		"\u0177\7e\2\2\u0177\u0179\7N\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u017b\5\u00a0Q\2\u017b\u035c\3\2\2\2\u017c"+
		"\u017d\7\27\2\2\u017d\u0180\7\u00d4\2\2\u017e\u017f\7e\2\2\u017f\u0181"+
		"\7N\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\5\u00a0Q\2\u0183\u0184\7\23\2\2\u0184\u0188\7(\2\2\u0185\u0186"+
		"\7e\2\2\u0186\u0187\7\u0093\2\2\u0187\u0189\7N\2\2\u0188\u0185\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\24\13\2\u018b\u035c"+
		"\3\2\2\2\u018c\u018d\7\27\2\2\u018d\u018e\7\u00d4\2\2\u018e\u018f\5\u00a0"+
		"Q\2\u018f\u0190\7\u00cb\2\2\u0190\u0191\7\37\2\2\u0191\u0192\5\u00a4S"+
		"\2\u0192\u035c\3\2\2\2\u0193\u0194\7\30\2\2\u0194\u0197\5\u00a0Q\2\u0195"+
		"\u0196\7\u00f2\2\2\u0196\u0198\5\30\r\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u035c\3\2\2\2\u0199\u019c\7.\2\2\u019a\u019b\7\u009d\2"+
		"\2\u019b\u019d\7\u00b6\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\7\u0085\2\2\u019f\u01a3\7\u00ee\2\2\u01a0\u01a1"+
		"\7e\2\2\u01a1\u01a2\7\u0093\2\2\u01a2\u01a4\7N\2\2\u01a3\u01a0\3\2\2\2"+
		"\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\5\u00a0Q\2\u01a6"+
		"\u01a7\7*\2\2\u01a7\u01a9\5f\64\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ab\7\u00f2\2\2\u01ab\u01ad\5\30\r\2"+
		"\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af"+
		"\7\34\2\2\u01af\u01b0\5\16\b\2\u01b0\u035c\3\2\2\2\u01b1\u01b4\7.\2\2"+
		"\u01b2\u01b3\7\u009d\2\2\u01b3\u01b5\7\u00b6\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\u00ee\2\2\u01b7\u01ba"+
		"\5\u00a0Q\2\u01b8\u01b9\7*\2\2\u01b9\u01bb\5f\64\2\u01ba\u01b8\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01bd\7\u00c6\2\2\u01bd"+
		"\u01bf\t\3\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\7\34\2\2\u01c1\u01c2\5\16\b\2\u01c2\u035c\3\2\2\2\u01c3"+
		"\u01c4\7\u00b3\2\2\u01c4\u01c5\7\u0085\2\2\u01c5\u01c6\7\u00ee\2\2\u01c6"+
		"\u035c\5\u00a0Q\2\u01c7\u01c8\7F\2\2\u01c8\u01c9\7\u0085\2\2\u01c9\u01cc"+
		"\7\u00ee\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cd\7N\2\2\u01cc\u01ca\3\2\2\2"+
		"\u01cc\u01cd\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u035c\5\u00a0Q\2\u01cf"+
		"\u01d0\7F\2\2\u01d0\u01d3\7\u00ee\2\2\u01d1\u01d2\7e\2\2\u01d2\u01d4\7"+
		"N\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u035c\5\u00a0Q\2\u01d6\u01d7\7\27\2\2\u01d7\u01d8\7\u00ee\2\2\u01d8\u01d9"+
		"\5\u00a0Q\2\u01d9\u01da\7\u00b4\2\2\u01da\u01db\7\u00dc\2\2\u01db\u01dc"+
		"\5\u00a0Q\2\u01dc\u035c\3\2\2\2\u01dd\u01de\7\27\2\2\u01de\u01df\7\u00ee"+
		"\2\2\u01df\u01e0\5\u00a0Q\2\u01e0\u01e1\7\u00cb\2\2\u01e1\u01e2\7\37\2"+
		"\2\u01e2\u01e3\5\u00a4S\2\u01e3\u035c\3\2\2\2\u01e4\u01e5\7#\2\2\u01e5"+
		"\u01e6\5\u00a0Q\2\u01e6\u01ef\7\4\2\2\u01e7\u01ec\5\u0098M\2\u01e8\u01e9"+
		"\7\6\2\2\u01e9\u01eb\5\u0098M\2\u01ea\u01e8\3\2\2\2\u01eb\u01ee\3\2\2"+
		"\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01e7\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\7\5\2\2\u01f2\u035c\3\2\2\2\u01f3\u01f4\7.\2\2\u01f4\u01f5\7\u00bc"+
		"\2\2\u01f5\u01f9\5\u00a8U\2\u01f6\u01f7\7\u00f2\2\2\u01f7\u01f8\7\24\2"+
		"\2\u01f8\u01fa\5\u00a2R\2\u01f9\u01f6\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa"+
		"\u035c\3\2\2\2\u01fb\u01fc\7F\2\2\u01fc\u01fd\7\u00bc\2\2\u01fd\u035c"+
		"\5\u00a8U\2\u01fe\u01ff\7\\\2\2\u01ff\u0200\5\u00a6T\2\u0200\u0201\7\u00dc"+
		"\2\2\u0201\u0206\5\u00a4S\2\u0202\u0203\7\6\2\2\u0203\u0205\5\u00a4S\2"+
		"\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u020c\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\u00f2\2"+
		"\2\u020a\u020b\7\24\2\2\u020b\u020d\7\u009c\2\2\u020c\u0209\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u0211\3\2\2\2\u020e\u020f\7]\2\2\u020f\u0210\7\""+
		"\2\2\u0210\u0212\5\u00a2R\2\u0211\u020e\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u035c\3\2\2\2\u0213\u0217\7\u00ba\2\2\u0214\u0215\7\24\2\2\u0215\u0216"+
		"\7\u009c\2\2\u0216\u0218\7W\2\2\u0217\u0214\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u0219\3\2\2\2\u0219\u021a\5\u00a6T\2\u021a\u021b\7Y\2\2\u021b"+
		"\u0220\5\u00a4S\2\u021c\u021d\7\6\2\2\u021d\u021f\5\u00a4S\2\u021e\u021c"+
		"\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0226\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7]\2\2\u0224\u0225\7\""+
		"\2\2\u0225\u0227\5\u00a2R\2\u0226\u0223\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u035c\3\2\2\2\u0228\u0229\7\u00cb\2\2\u0229\u022d\7\u00bc\2\2\u022a\u022e"+
		"\7\26\2\2\u022b\u022e\7\u0091\2\2\u022c\u022e\5\u00a8U\2\u022d\u022a\3"+
		"\2\2\2\u022d\u022b\3\2\2\2\u022d\u022c\3\2\2\2\u022e\u035c\3\2\2\2\u022f"+
		"\u023a\7\\\2\2\u0230\u0235\5\u009eP\2\u0231\u0232\7\6\2\2\u0232\u0234"+
		"\5\u009eP\2\u0233\u0231\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u023b\3\2\2\2\u0237\u0235\3\2\2\2\u0238\u0239"+
		"\7\26\2\2\u0239\u023b\7\u00ae\2\2\u023a\u0230\3\2\2\2\u023a\u0238\3\2"+
		"\2\2\u023b\u023c\3\2\2\2\u023c\u023e\7\u0099\2\2\u023d\u023f\t\4\2\2\u023e"+
		"\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\5\u00a0"+
		"Q\2\u0241\u0242\7\u00dc\2\2\u0242\u0246\5\u00a4S\2\u0243\u0244\7\u00f2"+
		"\2\2\u0244\u0245\7\\\2\2\u0245\u0247\7\u009c\2\2\u0246\u0243\3\2\2\2\u0246"+
		"\u0247\3\2\2\2\u0247\u035c\3\2\2\2\u0248\u024c\7\u00ba\2\2\u0249\u024a"+
		"\7\\\2\2\u024a\u024b\7\u009c\2\2\u024b\u024d\7W\2\2\u024c\u0249\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u0258\3\2\2\2\u024e\u0253\5\u009eP\2\u024f"+
		"\u0250\7\6\2\2\u0250\u0252\5\u009eP\2\u0251\u024f\3\2\2\2\u0252\u0255"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0259\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0257\7\26\2\2\u0257\u0259\7\u00ae\2\2\u0258\u024e"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\7\u0099\2"+
		"\2\u025b\u025d\t\4\2\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\5\u00a0Q\2\u025f\u0260\7Y\2\2\u0260\u0261\5\u00a4"+
		"S\2\u0261\u035c\3\2\2\2\u0262\u0263\7\u00cd\2\2\u0263\u0269\7^\2\2\u0264"+
		"\u0266\7\u0099\2\2\u0265\u0267\7\u00d4\2\2\u0266\u0265\3\2\2\2\u0266\u0267"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u026a\5\u00a0Q\2\u0269\u0264\3\2\2"+
		"\2\u0269\u026a\3\2\2\2\u026a\u035c\3\2\2\2\u026b\u0277\7O\2\2\u026c\u026d"+
		"\7\4\2\2\u026d\u0272\5\u0092J\2\u026e\u026f\7\6\2\2\u026f\u0271\5\u0092"+
		"J\2\u0270\u026e\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0276\7\5"+
		"\2\2\u0276\u0278\3\2\2\2\u0277\u026c\3\2\2\2\u0277\u0278\3\2\2\2\u0278"+
		"\u0279\3\2\2\2\u0279\u035c\5\f\7\2\u027a\u027b\7O\2\2\u027b\u027d\7\30"+
		"\2\2\u027c\u027e\7\u00ed\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\3\2\2\2\u027f\u035c\5\f\7\2\u0280\u0281\7\u00cd\2\2\u0281\u0282"+
		"\7.\2\2\u0282\u0283\7\u00d4\2\2\u0283\u035c\5\u00a0Q\2\u0284\u0285\7\u00cd"+
		"\2\2\u0285\u0286\7.\2\2\u0286\u0287\7\u00c3\2\2\u0287\u035c\5\u00a0Q\2"+
		"\u0288\u0289\7\u00cd\2\2\u0289\u028a\7.\2\2\u028a\u028b\7\u00ee\2\2\u028b"+
		"\u035c\5\u00a0Q\2\u028c\u028d\7\u00cd\2\2\u028d\u028e\7.\2\2\u028e\u028f"+
		"\7\u0085\2\2\u028f\u0290\7\u00ee\2\2\u0290\u035c\5\u00a0Q\2\u0291\u0292"+
		"\7\u00cd\2\2\u0292\u0295\7\u00d5\2\2\u0293\u0294\t\5\2\2\u0294\u0296\5"+
		"\u00a0Q\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029d\3\2\2\2"+
		"\u0297\u0298\7z\2\2\u0298\u029b\5f\64\2\u0299\u029a\7J\2\2\u029a\u029c"+
		"\5f\64\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2\2\2\u029d"+
		"\u0297\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u035c\3\2\2\2\u029f\u02a0\7\u00cd"+
		"\2\2\u02a0\u02a3\7\u00c4\2\2\u02a1\u02a2\t\5\2\2\u02a2\u02a4\5\u00a8U"+
		"\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02ab\3\2\2\2\u02a5\u02a6"+
		"\7z\2\2\u02a6\u02a9\5f\64\2\u02a7\u02a8\7J\2\2\u02a8\u02aa\5f\64\2\u02a9"+
		"\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a5\3\2"+
		"\2\2\u02ab\u02ac\3\2\2\2\u02ac\u035c\3\2\2\2\u02ad\u02ae\7\u00cd\2\2\u02ae"+
		"\u02b5\7\'\2\2\u02af\u02b0\7z\2\2\u02b0\u02b3\5f\64\2\u02b1\u02b2\7J\2"+
		"\2\u02b2\u02b4\5f\64\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b6"+
		"\3\2\2\2\u02b5\u02af\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u035c\3\2\2\2\u02b7"+
		"\u02b8\7\u00cd\2\2\u02b8\u02b9\7)\2\2\u02b9\u02bb\t\5\2\2\u02ba\u02bc"+
		"\5\u00a0Q\2\u02bb\u02ba\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c3\3\2\2"+
		"\2\u02bd\u02be\7z\2\2\u02be\u02c1\5f\64\2\u02bf\u02c0\7J\2\2\u02c0\u02c2"+
		"\5f\64\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02bd\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u035c\3\2\2\2\u02c5\u02c6\7\u00cd"+
		"\2\2\u02c6\u02c7\7\u00d0\2\2\u02c7\u02c8\7W\2\2\u02c8\u035c\5\u00a0Q\2"+
		"\u02c9\u02ca\7\u00cd\2\2\u02ca\u02cb\7\u00d0\2\2\u02cb\u02cc\7W\2\2\u02cc"+
		"\u02cd\7\4\2\2\u02cd\u02ce\5\16\b\2\u02ce\u02cf\7\5\2\2\u02cf\u035c\3"+
		"\2\2\2\u02d0\u02d2\7\u00cd\2\2\u02d1\u02d3\7\61\2\2\u02d2\u02d1\3\2\2"+
		"\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d7\7\u00bd\2\2\u02d5"+
		"\u02d6\t\5\2\2\u02d6\u02d8\5\u00a8U\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8\u035c\3\2\2\2\u02d9\u02da\7\u00cd\2\2\u02da\u02db\7\u00bc"+
		"\2\2\u02db\u02de\7^\2\2\u02dc\u02dd\t\5\2\2\u02dd\u02df\5\u00a8U\2\u02de"+
		"\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u035c\3\2\2\2\u02e0\u02e1\7A"+
		"\2\2\u02e1\u035c\5\u00a0Q\2\u02e2\u02e3\7@\2\2\u02e3\u035c\5\u00a0Q\2"+
		"\u02e4\u02e5\7\u00cd\2\2\u02e5\u02ec\7[\2\2\u02e6\u02e7\7z\2\2\u02e7\u02ea"+
		"\5f\64\2\u02e8\u02e9\7J\2\2\u02e9\u02eb\5f\64\2\u02ea\u02e8\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e6\3\2\2\2\u02ec\u02ed\3\2"+
		"\2\2\u02ed\u035c\3\2\2\2\u02ee\u02ef\7\u00cd\2\2\u02ef\u02f6\7\u00ca\2"+
		"\2\u02f0\u02f1\7z\2\2\u02f1\u02f4\5f\64\2\u02f2\u02f3\7J\2\2\u02f3\u02f5"+
		"\5f\64\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2\2\2\u02f6"+
		"\u02f0\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u035c\3\2\2\2\u02f8\u02f9\7\u00cb"+
		"\2\2\u02f9\u02fa\7\u00ca\2\2\u02fa\u02fb\5\u00a0Q\2\u02fb\u02fc\7\u00f8"+
		"\2\2\u02fc\u02fd\5X-\2\u02fd\u035c\3\2\2\2\u02fe\u02ff\7\u00b7\2\2\u02ff"+
		"\u0300\7\u00ca\2\2\u0300\u035c\5\u00a0Q\2\u0301\u0302\7\u00cf\2\2\u0302"+
		"\u030b\7\u00dd\2\2\u0303\u0308\5\u0094K\2\u0304\u0305\7\6\2\2\u0305\u0307"+
		"\5\u0094K\2\u0306\u0304\3\2\2\2\u0307\u030a\3\2\2\2\u0308\u0306\3\2\2"+
		"\2\u0308\u0309\3\2\2\2\u0309\u030c\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u0303"+
		"\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u035c\3\2\2\2\u030d\u030f\7+\2\2\u030e"+
		"\u0310\7\u00f4\2\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u035c"+
		"\3\2\2\2\u0311\u0313\7\u00be\2\2\u0312\u0314\7\u00f4\2\2\u0313\u0312\3"+
		"\2\2\2\u0313\u0314\3\2\2\2\u0314\u035c\3\2\2\2\u0315\u0316\7\u00ad\2\2"+
		"\u0316\u0317\5\u00a8U\2\u0317\u0318\7Y\2\2\u0318\u0319\5\f\7\2\u0319\u035c"+
		"\3\2\2\2\u031a\u031b\7=\2\2\u031b\u031c\7\u00ad\2\2\u031c\u035c\5\u00a8"+
		"U\2\u031d\u031e\7M\2\2\u031e\u0328\5\u00a8U\2\u031f\u0320\7\u00ea\2\2"+
		"\u0320\u0325\5X-\2\u0321\u0322\7\6\2\2\u0322\u0324\5X-\2\u0323\u0321\3"+
		"\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u031f\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u035c\3\2\2\2\u032a\u032b\7A\2\2\u032b\u032c\7k\2\2\u032c\u035c"+
		"\5\u00a8U\2\u032d\u032e\7A\2\2\u032e\u032f\7\u00a1\2\2\u032f\u035c\5\u00a8"+
		"U\2\u0330\u0331\7\u00cb\2\2\u0331\u0332\7\u00a6\2\2\u0332\u035c\5\u009c"+
		"O\2\u0333\u0334\7\u00cb\2\2\u0334\u0335\7\u00da\2\2\u0335\u0338\7\u00f7"+
		"\2\2\u0336\u0339\7|\2\2\u0337\u0339\5X-\2\u0338\u0336\3\2\2\2\u0338\u0337"+
		"\3\2\2\2\u0339\u035c\3\2\2\2\u033a\u033b\7\u00e7\2\2\u033b\u033c\5\u00a0"+
		"Q\2\u033c\u033d\7\u00cb\2\2\u033d\u0342\5\u0090I\2\u033e\u033f\7\6\2\2"+
		"\u033f\u0341\5\u0090I\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0347\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0345\u0346\7\u00f0\2\2\u0346\u0348\5Z.\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u035c\3\2\2\2\u0349\u034a\7\u0087\2\2\u034a\u034b"+
		"\7o\2\2\u034b\u0350\5\u00a0Q\2\u034c\u034e\7\34\2\2\u034d\u034c\3\2\2"+
		"\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\5\u00a8U\2\u0350"+
		"\u034d\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\7\u00ea"+
		"\2\2\u0353\u0354\5:\36\2\u0354\u0355\7\u0099\2\2\u0355\u0357\5X-\2\u0356"+
		"\u0358\5\u0080A\2\u0357\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0357"+
		"\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u00bd\3\2\2\2\u035b"+
		"\u00be\3\2\2\2\u035b\u00c0\3\2\2\2\u035b\u00c5\3\2\2\2\u035b\u00d5\3\2"+
		"\2\2\u035b\u00df\3\2\2\2\u035b\u00e6\3\2\2\2\u035b\u00ed\3\2\2\2\u035b"+
		"\u010f\3\2\2\2\u035b\u0129\3\2\2\2\u035b\u0130\3\2\2\2\u035b\u0138\3\2"+
		"\2\2\u035b\u013f\3\2\2\2\u035b\u014a\3\2\2\2\u035b\u0153\3\2\2\2\u035b"+
		"\u015c\3\2\2\2\u035b\u016d\3\2\2\2\u035b\u017c\3\2\2\2\u035b\u018c\3\2"+
		"\2\2\u035b\u0193\3\2\2\2\u035b\u0199\3\2\2\2\u035b\u01b1\3\2\2\2\u035b"+
		"\u01c3\3\2\2\2\u035b\u01c7\3\2\2\2\u035b\u01cf\3\2\2\2\u035b\u01d6\3\2"+
		"\2\2\u035b\u01dd\3\2\2\2\u035b\u01e4\3\2\2\2\u035b\u01f3\3\2\2\2\u035b"+
		"\u01fb\3\2\2\2\u035b\u01fe\3\2\2\2\u035b\u0213\3\2\2\2\u035b\u0228\3\2"+
		"\2\2\u035b\u022f\3\2\2\2\u035b\u0248\3\2\2\2\u035b\u0262\3\2\2\2\u035b"+
		"\u026b\3\2\2\2\u035b\u027a\3\2\2\2\u035b\u0280\3\2\2\2\u035b\u0284\3\2"+
		"\2\2\u035b\u0288\3\2\2\2\u035b\u028c\3\2\2\2\u035b\u0291\3\2\2\2\u035b"+
		"\u029f\3\2\2\2\u035b\u02ad\3\2\2\2\u035b\u02b7\3\2\2\2\u035b\u02c5\3\2"+
		"\2\2\u035b\u02c9\3\2\2\2\u035b\u02d0\3\2\2\2\u035b\u02d9\3\2\2\2\u035b"+
		"\u02e0\3\2\2\2\u035b\u02e2\3\2\2\2\u035b\u02e4\3\2\2\2\u035b\u02ee\3\2"+
		"\2\2\u035b\u02f8\3\2\2\2\u035b\u02fe\3\2\2\2\u035b\u0301\3\2\2\2\u035b"+
		"\u030d\3\2\2\2\u035b\u0311\3\2\2\2\u035b\u0315\3\2\2\2\u035b\u031a\3\2"+
		"\2\2\u035b\u031d\3\2\2\2\u035b\u032a\3\2\2\2\u035b\u032d\3\2\2\2\u035b"+
		"\u0330\3\2\2\2\u035b\u0333\3\2\2\2\u035b\u033a\3\2\2\2\u035b\u0349\3\2"+
		"\2\2\u035c\r\3\2\2\2\u035d\u035f\5\20\t\2\u035e\u035d\3\2\2\2\u035e\u035f"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\5\34\17\2\u0361\17\3\2\2\2\u0362"+
		"\u0364\7\u00f2\2\2\u0363\u0365\7\u00b2\2\2\u0364\u0363\3\2\2\2\u0364\u0365"+
		"\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u036b\5\64\33\2\u0367\u0368\7\6\2\2"+
		"\u0368\u036a\5\64\33\2\u0369\u0367\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369"+
		"\3\2\2\2\u036b\u036c\3\2\2\2\u036c\21\3\2\2\2\u036d\u036b\3\2\2\2\u036e"+
		"\u0371\5\24\13\2\u036f\u0371\5\26\f\2\u0370\u036e\3\2\2\2\u0370\u036f"+
		"\3\2\2\2\u0371\23\3\2\2\2\u0372\u0373\5\u00a8U\2\u0373\u0376\5v<\2\u0374"+
		"\u0375\7\u0093\2\2\u0375\u0377\7\u0094\2\2\u0376\u0374\3\2\2\2\u0376\u0377"+
		"\3\2\2\2\u0377\u037a\3\2\2\2\u0378\u0379\7*\2\2\u0379\u037b\5f\64\2\u037a"+
		"\u0378\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037d\7\u00f2"+
		"\2\2\u037d\u037f\5\30\r\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2\2\2\u037f"+
		"\25\3\2\2\2\u0380\u0381\7z\2\2\u0381\u0384\5\u00a0Q\2\u0382\u0383\t\6"+
		"\2\2\u0383\u0385\7\u00af\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385"+
		"\27\3\2\2\2\u0386\u0387\7\4\2\2\u0387\u038c\5\32\16\2\u0388\u0389\7\6"+
		"\2\2\u0389\u038b\5\32\16\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2\2\2\u038c"+
		"\u038a\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\3\2\2\2\u038e\u038c\3\2"+
		"\2\2\u038f\u0390\7\5\2\2\u0390\31\3\2\2\2\u0391\u0392\5\u00a8U\2\u0392"+
		"\u0393\7\u00f8\2\2\u0393\u0394\5X-\2\u0394\33\3\2\2\2\u0395\u03a0\5\""+
		"\22\2\u0396\u0397\7\u009e\2\2\u0397\u0398\7\"\2\2\u0398\u039d\5&\24\2"+
		"\u0399\u039a\7\6\2\2\u039a\u039c\5&\24\2\u039b\u0399\3\2\2\2\u039c\u039f"+
		"\3\2\2\2\u039d\u039b\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a1\3\2\2\2\u039f"+
		"\u039d\3\2\2\2\u03a0\u0396\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a7\3\2"+
		"\2\2\u03a2\u03a3\7\u0097\2\2\u03a3\u03a5\5 \21\2\u03a4\u03a6\t\7\2\2\u03a5"+
		"\u03a4\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03a8\3\2\2\2\u03a7\u03a2\3\2"+
		"\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03b6\3\2\2\2\u03a9\u03aa\7{\2\2\u03aa"+
		"\u03b7\5\36\20\2\u03ab\u03ac\7R\2\2\u03ac\u03ae\t\b\2\2\u03ad\u03af\5"+
		" \21\2\u03ae\u03ad\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0"+
		"\u03b4\t\7\2\2\u03b1\u03b5\7\u009b\2\2\u03b2\u03b3\7\u00f2\2\2\u03b3\u03b5"+
		"\7\u00d9\2\2\u03b4\u03b1\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03b7\3\2\2"+
		"\2\u03b6\u03a9\3\2\2\2\u03b6\u03ab\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\35"+
		"\3\2\2\2\u03b8\u03bb\7\26\2\2\u03b9\u03bb\5 \21\2\u03ba\u03b8\3\2\2\2"+
		"\u03ba\u03b9\3\2\2\2\u03bb\37\3\2\2\2\u03bc\u03bd\t\t\2\2\u03bd!\3\2\2"+
		"\2\u03be\u03bf\b\22\1\2\u03bf\u03c0\5$\23\2\u03c0\u03cf\3\2\2\2\u03c1"+
		"\u03c2\f\4\2\2\u03c2\u03c4\7m\2\2\u03c3\u03c5\5\66\34\2\u03c4\u03c3\3"+
		"\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03ce\5\"\22\5\u03c7"+
		"\u03c8\f\3\2\2\u03c8\u03ca\t\n\2\2\u03c9\u03cb\5\66\34\2\u03ca\u03c9\3"+
		"\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\5\"\22\4\u03cd"+
		"\u03c1\3\2\2\2\u03cd\u03c7\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2"+
		"\2\2\u03cf\u03d0\3\2\2\2\u03d0#\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03e3"+
		"\5(\25\2\u03d3\u03d4\7\u00d4\2\2\u03d4\u03e3\5\u00a0Q\2\u03d5\u03d6\7"+
		"\u00ec\2\2\u03d6\u03db\5X-\2\u03d7\u03d8\7\6\2\2\u03d8\u03da\5X-\2\u03d9"+
		"\u03d7\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2"+
		"\2\2\u03dc\u03e3\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03df\7\4\2\2\u03df"+
		"\u03e0\5\34\17\2\u03e0\u03e1\7\5\2\2\u03e1\u03e3\3\2\2\2\u03e2\u03d2\3"+
		"\2\2\2\u03e2\u03d3\3\2\2\2\u03e2\u03d5\3\2\2\2\u03e2\u03de\3\2\2\2\u03e3"+
		"%\3\2\2\2\u03e4\u03e6\5X-\2\u03e5\u03e7\t\13\2\2\u03e6\u03e5\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8\u03e9\7\u0096\2\2\u03e9\u03eb"+
		"\t\f\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\'\3\2\2\2\u03ec"+
		"\u03ee\7\u00c8\2\2\u03ed\u03ef\5\66\34\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef"+
		"\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f5\58\35\2\u03f1\u03f2\7\6\2\2\u03f2"+
		"\u03f4\58\35\2\u03f3\u03f1\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f5\u03f6\3\2\2\2\u03f6\u0401\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8"+
		"\u03f9\7Y\2\2\u03f9\u03fe\5:\36\2\u03fa\u03fb\7\6\2\2\u03fb\u03fd\5:\36"+
		"\2\u03fc\u03fa\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff"+
		"\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u03f8\3\2\2\2\u0401"+
		"\u0402\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0404\7\u00f0\2\2\u0404\u0406"+
		"\5Z.\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u040a\3\2\2\2\u0407"+
		"\u0408\7`\2\2\u0408\u0409\7\"\2\2\u0409\u040b\5*\26\2\u040a\u0407\3\2"+
		"\2\2\u040a\u040b\3\2\2\2\u040b\u040e\3\2\2\2\u040c\u040d\7c\2\2\u040d"+
		"\u040f\5Z.\2\u040e\u040c\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0419\3\2\2"+
		"\2\u0410\u0411\7\u00f1\2\2\u0411\u0416\5\60\31\2\u0412\u0413\7\6\2\2\u0413"+
		"\u0415\5\60\31\2\u0414\u0412\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3"+
		"\2\2\2\u0416\u0417\3\2\2\2\u0417\u041a\3\2\2\2\u0418\u0416\3\2\2\2\u0419"+
		"\u0410\3\2\2\2\u0419\u041a\3\2\2\2\u041a)\3\2\2\2\u041b\u041d\5\66\34"+
		"\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0423"+
		"\5,\27\2\u041f\u0420\7\6\2\2\u0420\u0422\5,\27\2\u0421\u041f\3\2\2\2\u0422"+
		"\u0425\3\2\2\2\u0423\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424+\3\2\2\2"+
		"\u0425\u0423\3\2\2\2\u0426\u044f\5.\30\2\u0427\u0428\7\u00bf\2\2\u0428"+
		"\u0431\7\4\2\2\u0429\u042e\5X-\2\u042a\u042b\7\6\2\2\u042b\u042d\5X-\2"+
		"\u042c\u042a\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042c\3\2\2\2\u042e\u042f"+
		"\3\2\2\2\u042f\u0432\3\2\2\2\u0430\u042e\3\2\2\2\u0431\u0429\3\2\2\2\u0431"+
		"\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u044f\7\5\2\2\u0434\u0435\7\60"+
		"\2\2\u0435\u043e\7\4\2\2\u0436\u043b\5X-\2\u0437\u0438\7\6\2\2\u0438\u043a"+
		"\5X-\2\u0439\u0437\3\2\2\2\u043a\u043d\3\2\2\2\u043b\u0439\3\2\2\2\u043b"+
		"\u043c\3\2\2\2\u043c\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043e\u0436\3\2"+
		"\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u044f\7\5\2\2\u0441"+
		"\u0442\7a\2\2\u0442\u0443\7\u00cc\2\2\u0443\u0444\7\4\2\2\u0444\u0449"+
		"\5.\30\2\u0445\u0446\7\6\2\2\u0446\u0448\5.\30\2\u0447\u0445\3\2\2\2\u0448"+
		"\u044b\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2"+
		"\2\2\u044b\u0449\3\2\2\2\u044c\u044d\7\5\2\2\u044d\u044f\3\2\2\2\u044e"+
		"\u0426\3\2\2\2\u044e\u0427\3\2\2\2\u044e\u0434\3\2\2\2\u044e\u0441\3\2"+
		"\2\2\u044f-\3\2\2\2\u0450\u0459\7\4\2\2\u0451\u0456\5X-\2\u0452\u0453"+
		"\7\6\2\2\u0453\u0455\5X-\2\u0454\u0452\3\2\2\2\u0455\u0458\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045a\3\2\2\2\u0458\u0456\3\2"+
		"\2\2\u0459\u0451\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b\3\2\2\2\u045b"+
		"\u045e\7\5\2\2\u045c\u045e\5X-\2\u045d\u0450\3\2\2\2\u045d\u045c\3\2\2"+
		"\2\u045e/\3\2\2\2\u045f\u0460\5\u00a8U\2\u0460\u0461\7\34\2\2\u0461\u0462"+
		"\7\4\2\2\u0462\u0463\5\62\32\2\u0463\u0464\7\5\2\2\u0464\61\3\2\2\2\u0465"+
		"\u0467\5\u00a8U\2\u0466\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0472"+
		"\3\2\2\2\u0468\u0469\7\u00a3\2\2\u0469\u046a\7\"\2\2\u046a\u046f\5X-\2"+
		"\u046b\u046c\7\6\2\2\u046c\u046e\5X-\2\u046d\u046b\3\2\2\2\u046e\u0471"+
		"\3\2\2\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0473\3\2\2\2\u0471"+
		"\u046f\3\2\2\2\u0472\u0468\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u047e\3\2"+
		"\2\2\u0474\u0475\7\u009e\2\2\u0475\u0476\7\"\2\2\u0476\u047b\5&\24\2\u0477"+
		"\u0478\7\6\2\2\u0478\u047a\5&\24\2\u0479\u0477\3\2\2\2\u047a\u047d\3\2"+
		"\2\2\u047b\u0479\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047f\3\2\2\2\u047d"+
		"\u047b\3\2\2\2\u047e\u0474\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2"+
		"\2\2\u0480\u0482\5\u0084C\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\63\3\2\2\2\u0483\u0485\5\u00a8U\2\u0484\u0486\5T+\2\u0485\u0484\3\2\2"+
		"\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\7\34\2\2\u0488"+
		"\u0489\7\4\2\2\u0489\u048a\5\16\b\2\u048a\u048b\7\5\2\2\u048b\65\3\2\2"+
		"\2\u048c\u048d\t\r\2\2\u048d\67\3\2\2\2\u048e\u0493\5X-\2\u048f\u0491"+
		"\7\34\2\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0492\3\2\2\2"+
		"\u0492\u0494\5\u00a8U\2\u0493\u0490\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u049e\3\2\2\2\u0495\u0496\5`\61\2\u0496\u0497\7\3\2\2\u0497\u049a\7\u0100"+
		"\2\2\u0498\u0499\7\34\2\2\u0499\u049b\5T+\2\u049a\u0498\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049e\3\2\2\2\u049c\u049e\7\u0100\2\2\u049d\u048e"+
		"\3\2\2\2\u049d\u0495\3\2\2\2\u049d\u049c\3\2\2\2\u049e9\3\2\2\2\u049f"+
		"\u04a0\b\36\1\2\u04a0\u04a1\5@!\2\u04a1\u04b4\3\2\2\2\u04a2\u04b0\f\4"+
		"\2\2\u04a3\u04a4\7/\2\2\u04a4\u04a5\7t\2\2\u04a5\u04b1\5@!\2\u04a6\u04a7"+
		"\5<\37\2\u04a7\u04a8\7t\2\2\u04a8\u04a9\5:\36\2\u04a9\u04aa\5> \2\u04aa"+
		"\u04b1\3\2\2\2\u04ab\u04ac\7\u008a\2\2\u04ac\u04ad\5<\37\2\u04ad\u04ae"+
		"\7t\2\2\u04ae\u04af\5@!\2\u04af\u04b1\3\2\2\2\u04b0\u04a3\3\2\2\2\u04b0"+
		"\u04a6\3\2\2\2\u04b0\u04ab\3\2\2\2\u04b1\u04b3\3\2\2\2\u04b2\u04a2\3\2"+
		"\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		";\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7\u04b9\7j\2\2\u04b8\u04b7\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04c7\3\2\2\2\u04ba\u04bc\7x\2\2\u04bb\u04bd\7\u00a0"+
		"\2\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04c7\3\2\2\2\u04be"+
		"\u04c0\7\u00bb\2\2\u04bf\u04c1\7\u00a0\2\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1"+
		"\3\2\2\2\u04c1\u04c7\3\2\2\2\u04c2\u04c4\7Z\2\2\u04c3\u04c5\7\u00a0\2"+
		"\2\u04c4\u04c3\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04b8"+
		"\3\2\2\2\u04c6\u04ba\3\2\2\2\u04c6\u04be\3\2\2\2\u04c6\u04c2\3\2\2\2\u04c7"+
		"=\3\2\2\2\u04c8\u04c9\7\u0099\2\2\u04c9\u04d7\5Z.\2\u04ca\u04cb\7\u00ea"+
		"\2\2\u04cb\u04cc\7\4\2\2\u04cc\u04d1\5\u00a8U\2\u04cd\u04ce\7\6\2\2\u04ce"+
		"\u04d0\5\u00a8U\2\u04cf\u04cd\3\2\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04cf"+
		"\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04d1\3\2\2\2\u04d4"+
		"\u04d5\7\5\2\2\u04d5\u04d7\3\2\2\2\u04d6\u04c8\3\2\2\2\u04d6\u04ca\3\2"+
		"\2\2\u04d7?\3\2\2\2\u04d8\u04df\5D#\2\u04d9\u04da\7\u00d6\2\2\u04da\u04db"+
		"\5B\"\2\u04db\u04dc\7\4\2\2\u04dc\u04dd\5X-\2\u04dd\u04de\7\5\2\2\u04de"+
		"\u04e0\3\2\2\2\u04df\u04d9\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0A\3\2\2\2"+
		"\u04e1\u04e2\t\16\2\2\u04e2C\3\2\2\2\u04e3\u0536\5R*\2\u04e4\u04e5\7\u0084"+
		"\2\2\u04e5\u04f0\7\4\2\2\u04e6\u04e7\7\u00a3\2\2\u04e7\u04e8\7\"\2\2\u04e8"+
		"\u04ed\5X-\2\u04e9\u04ea\7\6\2\2\u04ea\u04ec\5X-\2\u04eb\u04e9\3\2\2\2"+
		"\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04f1"+
		"\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04e6\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1"+
		"\u04fc\3\2\2\2\u04f2\u04f3\7\u009e\2\2\u04f3\u04f4\7\"\2\2\u04f4\u04f9"+
		"\5&\24\2\u04f5\u04f6\7\6\2\2\u04f6\u04f8\5&\24\2\u04f7\u04f5\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fd\3\2"+
		"\2\2\u04fb\u04f9\3\2\2\2\u04fc\u04f2\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u0507\3\2\2\2\u04fe\u04ff\7\u0086\2\2\u04ff\u0504\5F$\2\u0500\u0501\7"+
		"\6\2\2\u0501\u0503\5F$\2\u0502\u0500\3\2\2\2\u0503\u0506\3\2\2\2\u0504"+
		"\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0508\3\2\2\2\u0506\u0504\3\2"+
		"\2\2\u0507\u04fe\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509"+
		"\u050b\5H%\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050f\3\2\2"+
		"\2\u050c\u050d\7\25\2\2\u050d\u050e\7\u0081\2\2\u050e\u0510\5L\'\2\u050f"+
		"\u050c\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u0512\3\2\2\2\u0511\u0513\t\17"+
		"\2\2\u0512\u0511\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0514\3\2\2\2\u0514"+
		"\u0515\7\u00a7\2\2\u0515\u0516\7\4\2\2\u0516\u0517\5\u008aF\2\u0517\u0521"+
		"\7\5\2\2\u0518\u0519\7\u00d1\2\2\u0519\u051e\5N(\2\u051a\u051b\7\6\2\2"+
		"\u051b\u051d\5N(\2\u051c\u051a\3\2\2\2\u051d\u0520\3\2\2\2\u051e\u051c"+
		"\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0521"+
		"\u0518\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7B"+
		"\2\2\u0524\u0529\5P)\2\u0525\u0526\7\6\2\2\u0526\u0528\5P)\2\u0527\u0525"+
		"\3\2\2\2\u0528\u052b\3\2\2\2\u0529\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a"+
		"\u052c\3\2\2\2\u052b\u0529\3\2\2\2\u052c\u0534\7\5\2\2\u052d\u052f\7\34"+
		"\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\3\2\2\2\u0530"+
		"\u0532\5\u00a8U\2\u0531\u0533\5T+\2\u0532\u0531\3\2\2\2\u0532\u0533\3"+
		"\2\2\2\u0533\u0535\3\2\2\2\u0534\u052e\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0537\3\2\2\2\u0536\u04e4\3\2\2\2\u0536\u0537\3\2\2\2\u0537E\3\2\2\2"+
		"\u0538\u0539\5X-\2\u0539\u053a\7\34\2\2\u053a\u053b\5\u00a8U\2\u053bG"+
		"\3\2\2\2\u053c\u053d\7\u009a\2\2\u053d\u053e\7\u00c0\2\2\u053e\u053f\7"+
		"\u00a8\2\2\u053f\u0548\7\u0081\2\2\u0540\u0541\7\26\2\2\u0541\u0542\7"+
		"\u00c1\2\2\u0542\u0543\7\u00a8\2\2\u0543\u0545\7\u0081\2\2\u0544\u0546"+
		"\5J&\2\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0548\3\2\2\2\u0547"+
		"\u053c\3\2\2\2\u0547\u0540\3\2\2\2\u0548I\3\2\2\2\u0549\u054a\7\u00cd"+
		"\2\2\u054a\u054b\7H\2\2\u054b\u0553\7\u0083\2\2\u054c\u054d\7\u0098\2"+
		"\2\u054d\u054e\7H\2\2\u054e\u0553\7\u0083\2\2\u054f\u0550\7\u00f2\2\2"+
		"\u0550\u0551\7\u00e5\2\2\u0551\u0553\7\u00c1\2\2\u0552\u0549\3\2\2\2\u0552"+
		"\u054c\3\2\2\2\u0552\u054f\3\2\2\2\u0553K\3\2\2\2\u0554\u0555\7\7\2\2"+
		"\u0555\u0556\7\u00dc\2\2\u0556\u0557\7\u008b\2\2\u0557\u0568\7\u00c0\2"+
		"\2\u0558\u0559\7\7\2\2\u0559\u055a\7\u00a5\2\2\u055a\u055b\7v\2\2\u055b"+
		"\u0568\7\u00c0\2\2\u055c\u055d\7\7\2\2\u055d\u055e\7\u00dc\2\2\u055e\u055f"+
		"\7U\2\2\u055f\u0568\5\u00a8U\2\u0560\u0561\7\7\2\2\u0561\u0562\7\u00dc"+
		"\2\2\u0562\u0563\7v\2\2\u0563\u0568\5\u00a8U\2\u0564\u0565\7\7\2\2\u0565"+
		"\u0566\7\u00dc\2\2\u0566\u0568\5\u00a8U\2\u0567\u0554\3\2\2\2\u0567\u0558"+
		"\3\2\2\2\u0567\u055c\3\2\2\2\u0567\u0560\3\2\2\2\u0567\u0564\3\2\2\2\u0568"+
		"M\3\2\2\2\u0569\u056a\5\u00a8U\2\u056a\u056b\7\u00f8\2\2\u056b\u056c\7"+
		"\4\2\2\u056c\u0571\5\u00a8U\2\u056d\u056e\7\6\2\2\u056e\u0570\5\u00a8"+
		"U\2\u056f\u056d\3\2\2\2\u0570\u0573\3\2\2\2\u0571\u056f\3\2\2\2\u0571"+
		"\u0572\3\2\2\2\u0572\u0574\3\2\2\2\u0573\u0571\3\2\2\2\u0574\u0575\7\5"+
		"\2\2\u0575O\3\2\2\2\u0576\u0577\5\u00a8U\2\u0577\u0578\7\34\2\2\u0578"+
		"\u0579\5X-\2\u0579Q\3\2\2\2\u057a\u0582\5V,\2\u057b\u057d\7\34\2\2\u057c"+
		"\u057b\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u0580\5\u00a8"+
		"U\2\u057f\u0581\5T+\2\u0580\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0583"+
		"\3\2\2\2\u0582\u057c\3\2\2\2\u0582\u0583\3\2\2\2\u0583S\3\2\2\2\u0584"+
		"\u0585\7\4\2\2\u0585\u058a\5\u00a8U\2\u0586\u0587\7\6\2\2\u0587\u0589"+
		"\5\u00a8U\2\u0588\u0586\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2"+
		"\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058e"+
		"\7\5\2\2\u058eU\3\2\2\2\u058f\u05ad\5\u00a0Q\2\u0590\u0591\7\4\2\2\u0591"+
		"\u0592\5\16\b\2\u0592\u0593\7\5\2\2\u0593\u05ad\3\2\2\2\u0594\u0595\7"+
		"\u00e6\2\2\u0595\u0596\7\4\2\2\u0596\u059b\5X-\2\u0597\u0598\7\6\2\2\u0598"+
		"\u059a\5X-\2\u0599\u0597\3\2\2\2\u059a\u059d\3\2\2\2\u059b\u0599\3\2\2"+
		"\2\u059b\u059c\3\2\2\2\u059c\u059e\3\2\2\2\u059d\u059b\3\2\2\2\u059e\u05a1"+
		"\7\5\2\2\u059f\u05a0\7\u00f2\2\2\u05a0\u05a2\7\u009f\2\2\u05a1\u059f\3"+
		"\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05ad\3\2\2\2\u05a3\u05a4\7w\2\2\u05a4"+
		"\u05a5\7\4\2\2\u05a5\u05a6\5\16\b\2\u05a6\u05a7\7\5\2\2\u05a7\u05ad\3"+
		"\2\2\2\u05a8\u05a9\7\4\2\2\u05a9\u05aa\5:\36\2\u05aa\u05ab\7\5\2\2\u05ab"+
		"\u05ad\3\2\2\2\u05ac\u058f\3\2\2\2\u05ac\u0590\3\2\2\2\u05ac\u0594\3\2"+
		"\2\2\u05ac\u05a3\3\2\2\2\u05ac\u05a8\3\2\2\2\u05adW\3\2\2\2\u05ae\u05af"+
		"\5Z.\2\u05afY\3\2\2\2\u05b0\u05b1\b.\1\2\u05b1\u05b3\5^\60\2\u05b2\u05b4"+
		"\5\\/\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b8\3\2\2\2\u05b5"+
		"\u05b6\7\u0093\2\2\u05b6\u05b8\5Z.\5\u05b7\u05b0\3\2\2\2\u05b7\u05b5\3"+
		"\2\2\2\u05b8\u05c1\3\2\2\2\u05b9\u05ba\f\4\2\2\u05ba\u05bb\7\31\2\2\u05bb"+
		"\u05c0\5Z.\5\u05bc\u05bd\f\3\2\2\u05bd\u05be\7\u009d\2\2\u05be\u05c0\5"+
		"Z.\4\u05bf\u05b9\3\2\2\2\u05bf\u05bc\3\2\2\2\u05c0\u05c3\3\2\2\2\u05c1"+
		"\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2[\3\2\2\2\u05c3\u05c1\3\2\2\2"+
		"\u05c4\u05c5\5j\66\2\u05c5\u05c6\5^\60\2\u05c6\u0602\3\2\2\2\u05c7\u05c8"+
		"\5j\66\2\u05c8\u05c9\5l\67\2\u05c9\u05ca\7\4\2\2\u05ca\u05cb\5\16\b\2"+
		"\u05cb\u05cc\7\5\2\2\u05cc\u0602\3\2\2\2\u05cd\u05cf\7\u0093\2\2\u05ce"+
		"\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\7!"+
		"\2\2\u05d1\u05d2\5^\60\2\u05d2\u05d3\7\31\2\2\u05d3\u05d4\5^\60\2\u05d4"+
		"\u0602\3\2\2\2\u05d5\u05d7\7\u0093\2\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05d8\3\2\2\2\u05d8\u05d9\7g\2\2\u05d9\u05da\7\4\2\2\u05da"+
		"\u05df\5X-\2\u05db\u05dc\7\6\2\2\u05dc\u05de\5X-\2\u05dd\u05db\3\2\2\2"+
		"\u05de\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2"+
		"\3\2\2\2\u05e1\u05df\3\2\2\2\u05e2\u05e3\7\5\2\2\u05e3\u0602\3\2\2\2\u05e4"+
		"\u05e6\7\u0093\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\7g\2\2\u05e8\u05e9\7\4\2\2\u05e9\u05ea\5\16\b\2\u05ea"+
		"\u05eb\7\5\2\2\u05eb\u0602\3\2\2\2\u05ec\u05ee\7\u0093\2\2\u05ed\u05ec"+
		"\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f0\7z\2\2\u05f0"+
		"\u05f3\5^\60\2\u05f1\u05f2\7J\2\2\u05f2\u05f4\5^\60\2\u05f3\u05f1\3\2"+
		"\2\2\u05f3\u05f4\3\2\2\2\u05f4\u0602\3\2\2\2\u05f5\u05f7\7r\2\2\u05f6"+
		"\u05f8\7\u0093\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9"+
		"\3\2\2\2\u05f9\u0602\7\u0094\2\2\u05fa\u05fc\7r\2\2\u05fb\u05fd\7\u0093"+
		"\2\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe"+
		"\u05ff\7C\2\2\u05ff\u0600\7Y\2\2\u0600\u0602\5^\60\2\u0601\u05c4\3\2\2"+
		"\2\u0601\u05c7\3\2\2\2\u0601\u05ce\3\2\2\2\u0601\u05d6\3\2\2\2\u0601\u05e5"+
		"\3\2\2\2\u0601\u05ed\3\2\2\2\u0601\u05f5\3\2\2\2\u0601\u05fa\3\2\2\2\u0602"+
		"]\3\2\2\2\u0603\u0604\b\60\1\2\u0604\u0608\5`\61\2\u0605\u0606\t\20\2"+
		"\2\u0606\u0608\5^\60\6\u0607\u0603\3\2\2\2\u0607\u0605\3\2\2\2\u0608\u0617"+
		"\3\2\2\2\u0609\u060a\f\5\2\2\u060a\u060b\t\21\2\2\u060b\u0616\5^\60\6"+
		"\u060c\u060d\f\4\2\2\u060d\u060e\t\20\2\2\u060e\u0616\5^\60\5\u060f\u0610"+
		"\f\3\2\2\u0610\u0611\7\u0103\2\2\u0611\u0616\5^\60\4\u0612\u0613\f\7\2"+
		"\2\u0613\u0614\7\36\2\2\u0614\u0616\5h\65\2\u0615\u0609\3\2\2\2\u0615"+
		"\u060c\3\2\2\2\u0615\u060f\3\2\2\2\u0615\u0612\3\2\2\2\u0616\u0619\3\2"+
		"\2\2\u0617\u0615\3\2\2\2\u0617\u0618\3\2\2\2\u0618_\3\2\2\2\u0619\u0617"+
		"\3\2\2\2\u061a\u061b\b\61\1\2\u061b\u0714\7\u0094\2\2\u061c\u0714\5p9"+
		"\2\u061d\u061e\5\u00a8U\2\u061e\u061f\5f\64\2\u061f\u0714\3\2\2\2\u0620"+
		"\u0621\7E\2\2\u0621\u0622\7\u00ac\2\2\u0622\u0714\5f\64\2\u0623\u0714"+
		"\5\u00aaV\2\u0624\u0714\5n8\2\u0625\u0714\5f\64\2\u0626\u0714\7\u0107"+
		"\2\2\u0627\u0714\7\u0104\2\2\u0628\u0629\7\u00aa\2\2\u0629\u062a\7\4\2"+
		"\2\u062a\u062b\5^\60\2\u062b\u062c\7g\2\2\u062c\u062d\5^\60\2\u062d\u062e"+
		"\7\5\2\2\u062e\u0714\3\2\2\2\u062f\u0630\7\4\2\2\u0630\u0633\5X-\2\u0631"+
		"\u0632\7\6\2\2\u0632\u0634\5X-\2\u0633\u0631\3\2\2\2\u0634\u0635\3\2\2"+
		"\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0638"+
		"\7\5\2\2\u0638\u0714\3\2\2\2\u0639\u063a\7\u00c0\2\2\u063a\u063b\7\4\2"+
		"\2\u063b\u0640\5X-\2\u063c\u063d\7\6\2\2\u063d\u063f\5X-\2\u063e\u063c"+
		"\3\2\2\2\u063f\u0642\3\2\2\2\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641"+
		"\u0643\3\2\2\2\u0642\u0640\3\2\2\2\u0643\u0644\7\5\2\2\u0644\u0714\3\2"+
		"\2\2\u0645\u0646\5\u00a0Q\2\u0646\u0647\7\4\2\2\u0647\u0648\7\u0100\2"+
		"\2\u0648\u064a\7\5\2\2\u0649\u064b\5~@\2\u064a\u0649\3\2\2\2\u064a\u064b"+
		"\3\2\2\2\u064b\u064d\3\2\2\2\u064c\u064e\5\u0082B\2\u064d\u064c\3\2\2"+
		"\2\u064d\u064e\3\2\2\2\u064e\u0714\3\2\2\2\u064f\u0651\5b\62\2\u0650\u064f"+
		"\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0653\5\u00a0Q"+
		"\2\u0653\u065f\7\4\2\2\u0654\u0656\5\66\34\2\u0655\u0654\3\2\2\2\u0655"+
		"\u0656\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u065c\5X-\2\u0658\u0659\7\6\2"+
		"\2\u0659\u065b\5X-\2\u065a\u0658\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065a"+
		"\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u0660\3\2\2\2\u065e\u065c\3\2\2\2\u065f"+
		"\u0655\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u066b\3\2\2\2\u0661\u0662\7\u009e"+
		"\2\2\u0662\u0663\7\"\2\2\u0663\u0668\5&\24\2\u0664\u0665\7\6\2\2\u0665"+
		"\u0667\5&\24\2\u0666\u0664\3\2\2\2\u0667\u066a\3\2\2\2\u0668\u0666\3\2"+
		"\2\2\u0668\u0669\3\2\2\2\u0669\u066c\3\2\2\2\u066a\u0668\3\2\2\2\u066b"+
		"\u0661\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066f\7\5"+
		"\2\2\u066e\u0670\5~@\2\u066f\u066e\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0675"+
		"\3\2\2\2\u0671\u0673\5d\63\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0676\5\u0082B\2\u0675\u0672\3\2\2\2\u0675\u0676"+
		"\3\2\2\2\u0676\u0714\3\2\2\2\u0677\u0678\5\u00a8U\2\u0678\u0679\5\u0082"+
		"B\2\u0679\u0714\3\2\2\2\u067a\u067b\5\u00a8U\2\u067b\u067c\7\b\2\2\u067c"+
		"\u067d\5X-\2\u067d\u0714\3\2\2\2\u067e\u0687\7\4\2\2\u067f\u0684\5\u00a8"+
		"U\2\u0680\u0681\7\6\2\2\u0681\u0683\5\u00a8U\2\u0682\u0680\3\2\2\2\u0683"+
		"\u0686\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0688\3\2"+
		"\2\2\u0686\u0684\3\2\2\2\u0687\u067f\3\2\2\2\u0687\u0688\3\2\2\2\u0688"+
		"\u0689\3\2\2\2\u0689\u068a\7\5\2\2\u068a\u068b\7\b\2\2\u068b\u0714\5X"+
		"-\2\u068c\u068d\7\4\2\2\u068d\u068e\5\16\b\2\u068e\u068f\7\5\2\2\u068f"+
		"\u0714\3\2\2\2\u0690\u0691\7N\2\2\u0691\u0692\7\4\2\2\u0692\u0693\5\16"+
		"\b\2\u0693\u0694\7\5\2\2\u0694\u0714\3\2\2\2\u0695\u0696\7%\2\2\u0696"+
		"\u0698\5X-\2\u0697\u0699\5|?\2\u0698\u0697\3\2\2\2\u0699\u069a\3\2\2\2"+
		"\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069e\3\2\2\2\u069c\u069d"+
		"\7G\2\2\u069d\u069f\5X-\2\u069e\u069c\3\2\2\2\u069e\u069f\3\2\2\2\u069f"+
		"\u06a0\3\2\2\2\u06a0\u06a1\7I\2\2\u06a1\u0714\3\2\2\2\u06a2\u06a4\7%\2"+
		"\2\u06a3\u06a5\5|?\2\u06a4\u06a3\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6\u06a4"+
		"\3\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06aa\3\2\2\2\u06a8\u06a9\7G\2\2\u06a9"+
		"\u06ab\5X-\2\u06aa\u06a8\3\2\2\2\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3\2\2"+
		"\2\u06ac\u06ad\7I\2\2\u06ad\u0714\3\2\2\2\u06ae\u06af\7&\2\2\u06af\u06b0"+
		"\7\4\2\2\u06b0\u06b1\5X-\2\u06b1\u06b2\7\34\2\2\u06b2\u06b3\5v<\2\u06b3"+
		"\u06b4\7\5\2\2\u06b4\u0714\3\2\2\2\u06b5\u06b6\7\u00df\2\2\u06b6\u06b7"+
		"\7\4\2\2\u06b7\u06b8\5X-\2\u06b8\u06b9\7\34\2\2\u06b9\u06ba\5v<\2\u06ba"+
		"\u06bb\7\5\2\2\u06bb\u0714\3\2\2\2\u06bc\u06bd\7\33\2\2\u06bd\u06c6\7"+
		"\t\2\2\u06be\u06c3\5X-\2\u06bf\u06c0\7\6\2\2\u06c0\u06c2\5X-\2\u06c1\u06bf"+
		"\3\2\2\2\u06c2\u06c5\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4"+
		"\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u06be\3\2\2\2\u06c6\u06c7\3\2"+
		"\2\2\u06c7\u06c8\3\2\2\2\u06c8\u0714\7\n\2\2\u06c9\u0714\5\u00a8U\2\u06ca"+
		"\u0714\7\63\2\2\u06cb\u06cf\7\67\2\2\u06cc\u06cd\7\4\2\2\u06cd\u06ce\7"+
		"\u0108\2\2\u06ce\u06d0\7\5\2\2\u06cf\u06cc\3\2\2\2\u06cf\u06d0\3\2\2\2"+
		"\u06d0\u0714\3\2\2\2\u06d1\u06d5\78\2\2\u06d2\u06d3\7\4\2\2\u06d3\u06d4"+
		"\7\u0108\2\2\u06d4\u06d6\7\5\2\2\u06d5\u06d2\3\2\2\2\u06d5\u06d6\3\2\2"+
		"\2\u06d6\u0714\3\2\2\2\u06d7\u06db\7}\2\2\u06d8\u06d9\7\4\2\2\u06d9\u06da"+
		"\7\u0108\2\2\u06da\u06dc\7\5\2\2\u06db\u06d8\3\2\2\2\u06db\u06dc\3\2\2"+
		"\2\u06dc\u0714\3\2\2\2\u06dd\u06e1\7~\2\2\u06de\u06df\7\4\2\2\u06df\u06e0"+
		"\7\u0108\2\2\u06e0\u06e2\7\5\2\2\u06e1\u06de\3\2\2\2\u06e1\u06e2\3\2\2"+
		"\2\u06e2\u0714\3\2\2\2\u06e3\u0714\79\2\2\u06e4\u0714\7\62\2\2\u06e5\u0714"+
		"\7\66\2\2\u06e6\u0714\7\64\2\2\u06e7\u06e8\7\u00d2\2\2\u06e8\u06e9\7\4"+
		"\2\2\u06e9\u06ea\5^\60\2\u06ea\u06eb\7Y\2\2\u06eb\u06ee\5^\60\2\u06ec"+
		"\u06ed\7W\2\2\u06ed\u06ef\5^\60\2\u06ee\u06ec\3\2\2\2\u06ee\u06ef\3\2"+
		"\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1\7\5\2\2\u06f1\u0714\3\2\2\2\u06f2"+
		"\u06f3\7\u0092\2\2\u06f3\u06f4\7\4\2\2\u06f4\u06f7\5^\60\2\u06f5\u06f6"+
		"\7\6\2\2\u06f6\u06f8\5t;\2\u06f7\u06f5\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8"+
		"\u06f9\3\2\2\2\u06f9\u06fa\7\5\2\2\u06fa\u0714\3\2\2\2\u06fb\u06fc\7P"+
		"\2\2\u06fc\u06fd\7\4\2\2\u06fd\u06fe\5\u00a8U\2\u06fe\u06ff\7Y\2\2\u06ff"+
		"\u0700\5^\60\2\u0700\u0701\7\5\2\2\u0701\u0714\3\2\2\2\u0702\u0703\7\4"+
		"\2\2\u0703\u0704\5X-\2\u0704\u0705\7\5\2\2\u0705\u0714\3\2\2\2\u0706\u0707"+
		"\7a\2\2\u0707\u0710\7\4\2\2\u0708\u070d\5\u00a0Q\2\u0709\u070a\7\6\2\2"+
		"\u070a\u070c\5\u00a0Q\2\u070b\u0709\3\2\2\2\u070c\u070f\3\2\2\2\u070d"+
		"\u070b\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0711\3\2\2\2\u070f\u070d\3\2"+
		"\2\2\u0710\u0708\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0714\7\5\2\2\u0713\u061a\3\2\2\2\u0713\u061c\3\2\2\2\u0713\u061d\3\2"+
		"\2\2\u0713\u0620\3\2\2\2\u0713\u0623\3\2\2\2\u0713\u0624\3\2\2\2\u0713"+
		"\u0625\3\2\2\2\u0713\u0626\3\2\2\2\u0713\u0627\3\2\2\2\u0713\u0628\3\2"+
		"\2\2\u0713\u062f\3\2\2\2\u0713\u0639\3\2\2\2\u0713\u0645\3\2\2\2\u0713"+
		"\u0650\3\2\2\2\u0713\u0677\3\2\2\2\u0713\u067a\3\2\2\2\u0713\u067e\3\2"+
		"\2\2\u0713\u068c\3\2\2\2\u0713\u0690\3\2\2\2\u0713\u0695\3\2\2\2\u0713"+
		"\u06a2\3\2\2\2\u0713\u06ae\3\2\2\2\u0713\u06b5\3\2\2\2\u0713\u06bc\3\2"+
		"\2\2\u0713\u06c9\3\2\2\2\u0713\u06ca\3\2\2\2\u0713\u06cb\3\2\2\2\u0713"+
		"\u06d1\3\2\2\2\u0713\u06d7\3\2\2\2\u0713\u06dd\3\2\2\2\u0713\u06e3\3\2"+
		"\2\2\u0713\u06e4\3\2\2\2\u0713\u06e5\3\2\2\2\u0713\u06e6\3\2\2\2\u0713"+
		"\u06e7\3\2\2\2\u0713\u06f2\3\2\2\2\u0713\u06fb\3\2\2\2\u0713\u0702\3\2"+
		"\2\2\u0713\u0706\3\2\2\2\u0714\u071f\3\2\2\2\u0715\u0716\f\23\2\2\u0716"+
		"\u0717\7\t\2\2\u0717\u0718\5^\60\2\u0718\u0719\7\n\2\2\u0719\u071e\3\2"+
		"\2\2\u071a\u071b\f\21\2\2\u071b\u071c\7\3\2\2\u071c\u071e\5\u00a8U\2\u071d"+
		"\u0715\3\2\2\2\u071d\u071a\3\2\2\2\u071e\u0721\3\2\2\2\u071f\u071d\3\2"+
		"\2\2\u071f\u0720\3\2\2\2\u0720a\3\2\2\2\u0721\u071f\3\2\2\2\u0722\u0723"+
		"\t\22\2\2\u0723c\3\2\2\2\u0724\u0725\7f\2\2\u0725\u0729\7\u0096\2\2\u0726"+
		"\u0727\7\u00b8\2\2\u0727\u0729\7\u0096\2\2\u0728\u0724\3\2\2\2\u0728\u0726"+
		"\3\2\2\2\u0729e\3\2\2\2\u072a\u0731\7\u0105\2\2\u072b\u072e\7\u0106\2"+
		"\2\u072c\u072d\7\u00e1\2\2\u072d\u072f\7\u0105\2\2\u072e\u072c\3\2\2\2"+
		"\u072e\u072f\3\2\2\2\u072f\u0731\3\2\2\2\u0730\u072a\3\2\2\2\u0730\u072b"+
		"\3\2\2\2\u0731g\3\2\2\2\u0732\u0733\7\u00da\2\2\u0733\u0734\7\u00f7\2"+
		"\2\u0734\u0739\5p9\2\u0735\u0736\7\u00da\2\2\u0736\u0737\7\u00f7\2\2\u0737"+
		"\u0739\5f\64\2\u0738\u0732\3\2\2\2\u0738\u0735\3\2\2\2\u0739i\3\2\2\2"+
		"\u073a\u073b\t\23\2\2\u073bk\3\2\2\2\u073c\u073d\t\24\2\2\u073dm\3\2\2"+
		"\2\u073e\u073f\t\25\2\2\u073fo\3\2\2\2\u0740\u0742\7n\2\2\u0741\u0743"+
		"\t\20\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2\2"+
		"\u0744\u0745\5f\64\2\u0745\u0748\5r:\2\u0746\u0747\7\u00dc\2\2\u0747\u0749"+
		"\5r:\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749q\3\2\2\2\u074a\u074b"+
		"\t\26\2\2\u074bs\3\2\2\2\u074c\u074d\t\27\2\2\u074du\3\2\2\2\u074e\u074f"+
		"\b<\1\2\u074f\u0750\7\u00c0\2\2\u0750\u0751\7\4\2\2\u0751\u0756\5x=\2"+
		"\u0752\u0753\7\6\2\2\u0753\u0755\5x=\2\u0754\u0752\3\2\2\2\u0755\u0758"+
		"\3\2\2\2\u0756\u0754\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0759\3\2\2\2\u0758"+
		"\u0756\3\2\2\2\u0759\u075a\7\5\2\2\u075a\u07aa\3\2\2\2\u075b\u075c\7n"+
		"\2\2\u075c\u075f\5r:\2\u075d\u075e\7\u00dc\2\2\u075e\u0760\5r:\2\u075f"+
		"\u075d\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u07aa\3\2\2\2\u0761\u0766\7\u00db"+
		"\2\2\u0762\u0763\7\4\2\2\u0763\u0764\5z>\2\u0764\u0765\7\5\2\2\u0765\u0767"+
		"\3\2\2\2\u0766\u0762\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u076b\3\2\2\2\u0768"+
		"\u0769\7\u00f3\2\2\u0769\u076a\7\u00da\2\2\u076a\u076c\7\u00f7\2\2\u076b"+
		"\u0768\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u07aa\3\2\2\2\u076d\u0772\7\u00db"+
		"\2\2\u076e\u076f\7\4\2\2\u076f\u0770\5z>\2\u0770\u0771\7\5\2\2\u0771\u0773"+
		"\3\2\2\2\u0772\u076e\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\3\2\2\2\u0774"+
		"\u0775\7\u00f2\2\2\u0775\u0776\7\u00da\2\2\u0776\u07aa\7\u00f7\2\2\u0777"+
		"\u077c\7\u00da\2\2\u0778\u0779\7\4\2\2\u0779\u077a\5z>\2\u077a\u077b\7"+
		"\5\2\2\u077b\u077d\3\2\2\2\u077c\u0778\3\2\2\2\u077c\u077d\3\2\2\2\u077d"+
		"\u0781\3\2\2\2\u077e\u077f\7\u00f3\2\2\u077f\u0780\7\u00da\2\2\u0780\u0782"+
		"\7\u00f7\2\2\u0781\u077e\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u07aa\3\2\2"+
		"\2\u0783\u0788\7\u00da\2\2\u0784\u0785\7\4\2\2\u0785\u0786\5z>\2\u0786"+
		"\u0787\7\5\2\2\u0787\u0789\3\2\2\2\u0788\u0784\3\2\2\2\u0788\u0789\3\2"+
		"\2\2\u0789\u078a\3\2\2\2\u078a\u078b\7\u00f2\2\2\u078b\u078c\7\u00da\2"+
		"\2\u078c\u07aa\7\u00f7\2\2\u078d\u078e\7E\2\2\u078e\u07aa\7\u00ac\2\2"+
		"\u078f\u0790\7\33\2\2\u0790\u0791\7\u00fa\2\2\u0791\u0792\5v<\2\u0792"+
		"\u0793\7\u00fc\2\2\u0793\u07aa\3\2\2\2\u0794\u0795\7\u0080\2\2\u0795\u0796"+
		"\7\u00fa\2\2\u0796\u0797\5v<\2\u0797\u0798\7\6\2\2\u0798\u0799\5v<\2\u0799"+
		"\u079a\7\u00fc\2\2\u079a\u07aa\3\2\2\2\u079b\u07a7\5\u00a8U\2\u079c\u079d"+
		"\7\4\2\2\u079d\u07a2\5z>\2\u079e\u079f\7\6\2\2\u079f\u07a1\5z>\2\u07a0"+
		"\u079e\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2\2\u07a2\u07a3\3\2"+
		"\2\2\u07a3\u07a5\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a6\7\5\2\2\u07a6"+
		"\u07a8\3\2\2\2\u07a7\u079c\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa\3\2"+
		"\2\2\u07a9\u074e\3\2\2\2\u07a9\u075b\3\2\2\2\u07a9\u0761\3\2\2\2\u07a9"+
		"\u076d\3\2\2\2\u07a9\u0777\3\2\2\2\u07a9\u0783\3\2\2\2\u07a9\u078d\3\2"+
		"\2\2\u07a9\u078f\3\2\2\2\u07a9\u0794\3\2\2\2\u07a9\u079b\3\2\2\2\u07aa"+
		"\u07b4\3\2\2\2\u07ab\u07ac\f\4\2\2\u07ac\u07b0\7\33\2\2\u07ad\u07ae\7"+
		"\t\2\2\u07ae\u07af\7\u0108\2\2\u07af\u07b1\7\n\2\2\u07b0\u07ad\3\2\2\2"+
		"\u07b0\u07b1\3\2\2\2\u07b1\u07b3\3\2\2\2\u07b2\u07ab\3\2\2\2\u07b3\u07b6"+
		"\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5w\3\2\2\2\u07b6"+
		"\u07b4\3\2\2\2\u07b7\u07bc\5v<\2\u07b8\u07b9\5\u00a8U\2\u07b9\u07ba\5"+
		"v<\2\u07ba\u07bc\3\2\2\2\u07bb\u07b7\3\2\2\2\u07bb\u07b8\3\2\2\2\u07bc"+
		"y\3\2\2\2\u07bd\u07c0\7\u0108\2\2\u07be\u07c0\5v<\2\u07bf\u07bd\3\2\2"+
		"\2\u07bf\u07be\3\2\2\2\u07c0{\3\2\2\2\u07c1\u07c2\7\u00ef\2\2\u07c2\u07c3"+
		"\5X-\2\u07c3\u07c4\7\u00d8\2\2\u07c4\u07c5\5X-\2\u07c5}\3\2\2\2\u07c6"+
		"\u07c7\7S\2\2\u07c7\u07c8\7\4\2\2\u07c8\u07c9\7\u00f0\2\2\u07c9\u07ca"+
		"\5Z.\2\u07ca\u07cb\7\5\2\2\u07cb\177\3\2\2\2\u07cc\u07cd\7\u00ef\2\2\u07cd"+
		"\u07d0\7\u0082\2\2\u07ce\u07cf\7\31\2\2\u07cf\u07d1\5X-\2\u07d0\u07ce"+
		"\3\2\2\2\u07d0\u07d1\3\2\2\2\u07d1\u07d2\3\2\2\2\u07d2\u07d3\7\u00d8\2"+
		"\2\u07d3\u07d4\7\u00e7\2\2\u07d4\u07d5\7\u00cb\2\2\u07d5\u07d6\5\u00a8"+
		"U\2\u07d6\u07d7\7\u00f8\2\2\u07d7\u07df\5X-\2\u07d8\u07d9\7\6\2\2\u07d9"+
		"\u07da\5\u00a8U\2\u07da\u07db\7\u00f8\2\2\u07db\u07dc\5X-\2\u07dc\u07de"+
		"\3\2\2\2\u07dd\u07d8\3\2\2\2\u07de\u07e1\3\2\2\2\u07df\u07dd\3\2\2\2\u07df"+
		"\u07e0\3\2\2\2\u07e0\u080d\3\2\2\2\u07e1\u07df\3\2\2\2\u07e2\u07e3\7\u00ef"+
		"\2\2\u07e3\u07e6\7\u0082\2\2\u07e4\u07e5\7\31\2\2\u07e5\u07e7\5X-\2\u07e6"+
		"\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07e9\7\u00d8"+
		"\2\2\u07e9\u080d\7?\2\2\u07ea\u07eb\7\u00ef\2\2\u07eb\u07ec\7\u0093\2"+
		"\2\u07ec\u07ef\7\u0082\2\2\u07ed\u07ee\7\31\2\2\u07ee\u07f0\5X-\2\u07ef"+
		"\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\7\u00d8"+
		"\2\2\u07f2\u07fe\7l\2\2\u07f3\u07f4\7\4\2\2\u07f4\u07f9\5\u00a8U\2\u07f5"+
		"\u07f6\7\6\2\2\u07f6\u07f8\5\u00a8U\2\u07f7\u07f5\3\2\2\2\u07f8\u07fb"+
		"\3\2\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fc\3\2\2\2\u07fb"+
		"\u07f9\3\2\2\2\u07fc\u07fd\7\5\2\2\u07fd\u07ff\3\2\2\2\u07fe\u07f3\3\2"+
		"\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\3\2\2\2\u0800\u0801\7\u00ec\2\2\u0801"+
		"\u0802\7\4\2\2\u0802\u0807\5X-\2\u0803\u0804\7\6\2\2\u0804\u0806\5X-\2"+
		"\u0805\u0803\3\2\2\2\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808"+
		"\3\2\2\2\u0808\u080a\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u080b\7\5\2\2\u080b"+
		"\u080d\3\2\2\2\u080c\u07cc\3\2\2\2\u080c\u07e2\3\2\2\2\u080c\u07ea\3\2"+
		"\2\2\u080d\u0081\3\2\2\2\u080e\u0814\7\u00a2\2\2\u080f\u0815\5\u00a8U"+
		"\2\u0810\u0811\7\4\2\2\u0811\u0812\5\62\32\2\u0812\u0813\7\5\2\2\u0813"+
		"\u0815\3\2\2\2\u0814\u080f\3\2\2\2\u0814\u0810\3\2\2\2\u0815\u0083\3\2"+
		"\2\2\u0816\u0817\7\u0086\2\2\u0817\u081c\5F$\2\u0818\u0819\7\6\2\2\u0819"+
		"\u081b\5F$\2\u081a\u0818\3\2\2\2\u081b\u081e\3\2\2\2\u081c\u081a\3\2\2"+
		"\2\u081c\u081d\3\2\2\2\u081d\u0820\3\2\2\2\u081e\u081c\3\2\2\2\u081f\u0816"+
		"\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0825\5\u0086D"+
		"\2\u0822\u0823\7\25\2\2\u0823\u0824\7\u0081\2\2\u0824\u0826\5L\'\2\u0825"+
		"\u0822\3\2\2\2\u0825\u0826\3\2\2\2\u0826\u0828\3\2\2\2\u0827\u0829\t\17"+
		"\2\2\u0828\u0827\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082f\3\2\2\2\u082a"+
		"\u082b\7\u00a7\2\2\u082b\u082c\7\4\2\2\u082c\u082d\5\u008aF\2\u082d\u082e"+
		"\7\5\2\2\u082e\u0830\3\2\2\2\u082f\u082a\3\2\2\2\u082f\u0830\3\2\2\2\u0830"+
		"\u083a\3\2\2\2\u0831\u0832\7\u00d1\2\2\u0832\u0837\5N(\2\u0833\u0834\7"+
		"\6\2\2\u0834\u0836\5N(\2\u0835\u0833\3\2\2\2\u0836\u0839\3\2\2\2\u0837"+
		"\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083b\3\2\2\2\u0839\u0837\3\2"+
		"\2\2\u083a\u0831\3\2\2\2\u083a\u083b\3\2\2\2\u083b\u0845\3\2\2\2\u083c"+
		"\u083d\7B\2\2\u083d\u0842\5P)\2\u083e\u083f\7\6\2\2\u083f\u0841\5P)\2"+
		"\u0840\u083e\3\2\2\2\u0841\u0844\3\2\2\2\u0842\u0840\3\2\2\2\u0842\u0843"+
		"\3\2\2\2\u0843\u0846\3\2\2\2\u0844\u0842\3\2\2\2\u0845\u083c\3\2\2\2\u0845"+
		"\u0846\3\2\2\2\u0846\u0085\3\2\2\2\u0847\u0848\7\u00b0\2\2\u0848\u0860"+
		"\5\u0088E\2\u0849\u084a\7\u00c1\2\2\u084a\u0860\5\u0088E\2\u084b\u084c"+
		"\7b\2\2\u084c\u0860\5\u0088E\2\u084d\u084e\7\u00b0\2\2\u084e\u084f\7!"+
		"\2\2\u084f\u0850\5\u0088E\2\u0850\u0851\7\31\2\2\u0851\u0852\5\u0088E"+
		"\2\u0852\u0860\3\2\2\2\u0853\u0854\7\u00c1\2\2\u0854\u0855\7!\2\2\u0855"+
		"\u0856\5\u0088E\2\u0856\u0857\7\31\2\2\u0857\u0858\5\u0088E\2\u0858\u0860"+
		"\3\2\2\2\u0859\u085a\7b\2\2\u085a\u085b\7!\2\2\u085b\u085c\5\u0088E\2"+
		"\u085c\u085d\7\31\2\2\u085d\u085e\5\u0088E\2\u085e\u0860\3\2\2\2\u085f"+
		"\u0847\3\2\2\2\u085f\u0849\3\2\2\2\u085f\u084b\3\2\2\2\u085f\u084d\3\2"+
		"\2\2\u085f\u0853\3\2\2\2\u085f\u0859\3\2\2\2\u0860\u0087\3\2\2\2\u0861"+
		"\u0862\7\u00e2\2\2\u0862\u086b\7\u00ab\2\2\u0863\u0864\7\u00e2\2\2\u0864"+
		"\u086b\7V\2\2\u0865\u0866\7\61\2\2\u0866\u086b\7\u00c0\2\2\u0867\u0868"+
		"\5X-\2\u0868\u0869\t\30\2\2\u0869\u086b\3\2\2\2\u086a\u0861\3\2\2\2\u086a"+
		"\u0863\3\2\2\2\u086a\u0865\3\2\2\2\u086a\u0867\3\2\2\2\u086b\u0089\3\2"+
		"\2\2\u086c\u086d\bF\1\2\u086d\u086f\5\u008cG\2\u086e\u0870\5\u008eH\2"+
		"\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0878\3\2\2\2\u0871\u0872"+
		"\f\4\2\2\u0872\u0877\5\u008aF\5\u0873\u0874\f\3\2\2\u0874\u0875\7\13\2"+
		"\2\u0875\u0877\5\u008aF\4\u0876\u0871\3\2\2\2\u0876\u0873\3\2\2\2\u0877"+
		"\u087a\3\2\2\2\u0878\u0876\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u008b\3\2"+
		"\2\2\u087a\u0878\3\2\2\2\u087b\u0895\5\u00a8U\2\u087c\u087d\7\4\2\2\u087d"+
		"\u0895\7\5\2\2\u087e\u087f\7\u00a9\2\2\u087f\u0880\7\4\2\2\u0880\u0885"+
		"\5\u008aF\2\u0881\u0882\7\6\2\2\u0882\u0884\5\u008aF\2\u0883\u0881\3\2"+
		"\2\2\u0884\u0887\3\2\2\2\u0885\u0883\3\2\2\2\u0885\u0886\3\2\2\2\u0886"+
		"\u0888\3\2\2\2\u0887\u0885\3\2\2\2\u0888\u0889\7\5\2\2\u0889\u0895\3\2"+
		"\2\2\u088a\u088b\7\4\2\2\u088b\u088c\5\u008aF\2\u088c\u088d\7\5\2\2\u088d"+
		"\u0895\3\2\2\2\u088e\u0895\7\f\2\2\u088f\u0895\7\r\2\2\u0890\u0891\7\16"+
		"\2\2\u0891\u0892\5\u008aF\2\u0892\u0893\7\17\2\2\u0893\u0895\3\2\2\2\u0894"+
		"\u087b\3\2\2\2\u0894\u087c\3\2\2\2\u0894\u087e\3\2\2\2\u0894\u088a\3\2"+
		"\2\2\u0894\u088e\3\2\2\2\u0894\u088f\3\2\2\2\u0894\u0890\3\2\2\2\u0895"+
		"\u008d\3\2\2\2\u0896\u0898\7\u0100\2\2\u0897\u0899\7\u0104\2\2\u0898\u0897"+
		"\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u08b5\3\2\2\2\u089a\u089c\7\u00fe\2"+
		"\2\u089b\u089d\7\u0104\2\2\u089c\u089b\3\2\2\2\u089c\u089d\3\2\2\2\u089d"+
		"\u08b5\3\2\2\2\u089e\u08a0\7\u0104\2\2\u089f\u08a1\7\u0104\2\2\u08a0\u089f"+
		"\3\2\2\2\u08a0\u08a1\3\2\2\2\u08a1\u08b5\3\2\2\2\u08a2\u08a3\7\20\2\2"+
		"\u08a3\u08a4\7\u0108\2\2\u08a4\u08a6\7\21\2\2\u08a5\u08a7\7\u0104\2\2"+
		"\u08a6\u08a5\3\2\2\2\u08a6\u08a7\3\2\2\2\u08a7\u08b5\3\2\2\2\u08a8\u08aa"+
		"\7\20\2\2\u08a9\u08ab\7\u0108\2\2\u08aa\u08a9\3\2\2\2\u08aa\u08ab\3\2"+
		"\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ae\7\6\2\2\u08ad\u08af\7\u0108\2\2\u08ae"+
		"\u08ad\3\2\2\2\u08ae\u08af\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08b2\7\21"+
		"\2\2\u08b1\u08b3\7\u0104\2\2\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3"+
		"\u08b5\3\2\2\2\u08b4\u0896\3\2\2\2\u08b4\u089a\3\2\2\2\u08b4\u089e\3\2"+
		"\2\2\u08b4\u08a2\3\2\2\2\u08b4\u08a8\3\2\2\2\u08b5\u008f\3\2\2\2\u08b6"+
		"\u08b7\5\u00a8U\2\u08b7\u08b8\7\u00f8\2\2\u08b8\u08b9\5X-\2\u08b9\u0091"+
		"\3\2\2\2\u08ba\u08bb\7X\2\2\u08bb\u08bf\t\31\2\2\u08bc\u08bd\7\u00e0\2"+
		"\2\u08bd\u08bf\t\32\2\2\u08be\u08ba\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf"+
		"\u0093\3\2\2\2\u08c0\u08c1\7s\2\2\u08c1\u08c2\7y\2\2\u08c2\u08c6\5\u0096"+
		"L\2\u08c3\u08c4\7\u00b1\2\2\u08c4\u08c6\t\33\2\2\u08c5\u08c0\3\2\2\2\u08c5"+
		"\u08c3\3\2\2\2\u08c6\u0095\3\2\2\2\u08c7\u08c8\7\u00b1\2\2\u08c8\u08cf"+
		"\7\u00e3\2\2\u08c9\u08ca\7\u00b1\2\2\u08ca\u08cf\7,\2\2\u08cb\u08cc\7"+
		"\u00b5\2\2\u08cc\u08cf\7\u00b1\2\2\u08cd\u08cf\7\u00c9\2\2\u08ce\u08c7"+
		"\3\2\2\2\u08ce\u08c9\3\2\2\2\u08ce\u08cb\3\2\2\2\u08ce\u08cd\3\2\2\2\u08cf"+
		"\u0097\3\2\2\2\u08d0\u08d6\5X-\2\u08d1\u08d2\5\u00a8U\2\u08d2\u08d3\7"+
		"\22\2\2\u08d3\u08d4\5X-\2\u08d4\u08d6\3\2\2\2\u08d5\u08d0\3\2\2\2\u08d5"+
		"\u08d1\3\2\2\2\u08d6\u0099\3\2\2\2\u08d7\u08d8\5\u00a8U\2\u08d8\u08d9"+
		"\7\3\2\2\u08d9\u08da\5\u00a8U\2\u08da\u08dd\3\2\2\2\u08db\u08dd\5\u00a8"+
		"U\2\u08dc\u08d7\3\2\2\2\u08dc\u08db\3\2\2\2\u08dd\u009b\3\2\2\2\u08de"+
		"\u08e3\5\u009aN\2\u08df\u08e0\7\6\2\2\u08e0\u08e2\5\u009aN\2\u08e1\u08df"+
		"\3\2\2\2\u08e2\u08e5\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e3\u08e4\3\2\2\2\u08e4"+
		"\u009d\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e6\u08e7\t\34\2\2\u08e7\u009f\3"+
		"\2\2\2\u08e8\u08ed\5\u00a8U\2\u08e9\u08ea\7\3\2\2\u08ea\u08ec\5\u00a8"+
		"U\2\u08eb\u08e9\3\2\2\2\u08ec\u08ef\3\2\2\2\u08ed\u08eb\3\2\2\2\u08ed"+
		"\u08ee\3\2\2\2\u08ee\u00a1\3\2\2\2\u08ef\u08ed\3\2\2\2\u08f0\u08f4\5\u00a4"+
		"S\2\u08f1\u08f4\79\2\2\u08f2\u08f4\7\65\2\2\u08f3\u08f0\3\2\2\2\u08f3"+
		"\u08f1\3\2\2\2\u08f3\u08f2\3\2\2\2\u08f4\u00a3\3\2\2\2\u08f5\u08fb\5\u00a8"+
		"U\2\u08f6\u08f7\7\u00e9\2\2\u08f7\u08fb\5\u00a8U\2\u08f8\u08f9\7\u00bc"+
		"\2\2\u08f9\u08fb\5\u00a8U\2\u08fa\u08f5\3\2\2\2\u08fa\u08f6\3\2\2\2\u08fa"+
		"\u08f8\3\2\2\2\u08fb\u00a5\3\2\2\2\u08fc\u0901\5\u00a8U\2\u08fd\u08fe"+
		"\7\6\2\2\u08fe\u0900\5\u00a8U\2\u08ff\u08fd\3\2\2\2\u0900\u0903\3\2\2"+
		"\2\u0901\u08ff\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u00a7\3\2\2\2\u0903\u0901"+
		"\3\2\2\2\u0904\u090a\7\u010b\2\2\u0905\u090a\7\u010d\2\2\u0906\u090a\5"+
		"\u00acW\2\u0907\u090a\7\u010e\2\2\u0908\u090a\7\u010c\2\2\u0909\u0904"+
		"\3\2\2\2\u0909\u0905\3\2\2\2\u0909\u0906\3\2\2\2\u0909\u0907\3\2\2\2\u0909"+
		"\u0908\3\2\2\2\u090a\u00a9\3\2\2\2\u090b\u090d\7\u00ff\2\2\u090c\u090b"+
		"\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u0918\7\u0109\2"+
		"\2\u090f\u0911\7\u00ff\2\2\u0910\u090f\3\2\2\2\u0910\u0911\3\2\2\2\u0911"+
		"\u0912\3\2\2\2\u0912\u0918\7\u010a\2\2\u0913\u0915\7\u00ff\2\2\u0914\u0913"+
		"\3\2\2\2\u0914\u0915\3\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918\7\u0108\2"+
		"\2\u0917\u090c\3\2\2\2\u0917\u0910\3\2\2\2\u0917\u0914\3\2\2\2\u0918\u00ab"+
		"\3\2\2\2\u0919\u091a\t\35\2\2\u091a\u00ad\3\2\2\2\u0131\u00ca\u00cf\u00d3"+
		"\u00d9\u00dd\u00f2\u00f6\u00fa\u00fe\u0106\u010a\u010d\u0114\u011d\u0123"+
		"\u0127\u012d\u0134\u013d\u0143\u0151\u015a\u0160\u0167\u0171\u0178\u0180"+
		"\u0188\u0197\u019c\u01a3\u01a8\u01ac\u01b4\u01ba\u01be\u01cc\u01d3\u01ec"+
		"\u01ef\u01f9\u0206\u020c\u0211\u0217\u0220\u0226\u022d\u0235\u023a\u023e"+
		"\u0246\u024c\u0253\u0258\u025c\u0266\u0269\u0272\u0277\u027d\u0295\u029b"+
		"\u029d\u02a3\u02a9\u02ab\u02b3\u02b5\u02bb\u02c1\u02c3\u02d2\u02d7\u02de"+
		"\u02ea\u02ec\u02f4\u02f6\u0308\u030b\u030f\u0313\u0325\u0328\u0338\u0342"+
		"\u0347\u034d\u0350\u0359\u035b\u035e\u0364\u036b\u0370\u0376\u037a\u037e"+
		"\u0384\u038c\u039d\u03a0\u03a5\u03a7\u03ae\u03b4\u03b6\u03ba\u03c4\u03ca"+
		"\u03cd\u03cf\u03db\u03e2\u03e6\u03ea\u03ee\u03f5\u03fe\u0401\u0405\u040a"+
		"\u040e\u0416\u0419\u041c\u0423\u042e\u0431\u043b\u043e\u0449\u044e\u0456"+
		"\u0459\u045d\u0466\u046f\u0472\u047b\u047e\u0481\u0485\u0490\u0493\u049a"+
		"\u049d\u04b0\u04b4\u04b8\u04bc\u04c0\u04c4\u04c6\u04d1\u04d6\u04df\u04ed"+
		"\u04f0\u04f9\u04fc\u0504\u0507\u050a\u050f\u0512\u051e\u0521\u0529\u052e"+
		"\u0532\u0534\u0536\u0545\u0547\u0552\u0567\u0571\u057c\u0580\u0582\u058a"+
		"\u059b\u05a1\u05ac\u05b3\u05b7\u05bf\u05c1\u05ce\u05d6\u05df\u05e5\u05ed"+
		"\u05f3\u05f7\u05fc\u0601\u0607\u0615\u0617\u0635\u0640\u064a\u064d\u0650"+
		"\u0655\u065c\u065f\u0668";
	private static final String _serializedATNSegment1 =
		"\u066b\u066f\u0672\u0675\u0684\u0687\u069a\u069e\u06a6\u06aa\u06c3\u06c6"+
		"\u06cf\u06d5\u06db\u06e1\u06ee\u06f7\u070d\u0710\u0713\u071d\u071f\u0728"+
		"\u072e\u0730\u0738\u0742\u0748\u0756\u075f\u0766\u076b\u0772\u077c\u0781"+
		"\u0788\u07a2\u07a7\u07a9\u07b0\u07b4\u07bb\u07bf\u07d0\u07df\u07e6\u07ef"+
		"\u07f9\u07fe\u0807\u080c\u0814\u081c\u081f\u0825\u0828\u082f\u0837\u083a"+
		"\u0842\u0845\u085f\u086a\u086f\u0876\u0878\u0885\u0894\u0898\u089c\u08a0"+
		"\u08a6\u08aa\u08ae\u08b2\u08b4\u08be\u08c5\u08ce\u08d5\u08dc\u08e3\u08ed"+
		"\u08f3\u08fa\u0901\u0909\u090c\u0910\u0914\u0917";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}