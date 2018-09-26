// Generated from com/github/bigdata/sql/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.7
package com.github.bigdata.sql.antlr4.spark;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SparkSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, SELECT=11, FROM=12, ADD=13, AS=14, ALL=15, ANY=16, DISTINCT=17, 
		WHERE=18, GROUP=19, BY=20, GROUPING=21, SETS=22, CUBE=23, ROLLUP=24, ORDER=25, 
		HAVING=26, LIMIT=27, AT=28, OR=29, AND=30, IN=31, NOT=32, NO=33, EXISTS=34, 
		BETWEEN=35, LIKE=36, RLIKE=37, IS=38, NULL=39, TRUE=40, FALSE=41, NULLS=42, 
		ASC=43, DESC=44, FOR=45, INTERVAL=46, CASE=47, WHEN=48, THEN=49, ELSE=50, 
		END=51, JOIN=52, CROSS=53, OUTER=54, INNER=55, LEFT=56, SEMI=57, RIGHT=58, 
		FULL=59, NATURAL=60, ON=61, PIVOT=62, LATERAL=63, WINDOW=64, OVER=65, 
		PARTITION=66, RANGE=67, ROWS=68, UNBOUNDED=69, PRECEDING=70, FOLLOWING=71, 
		CURRENT=72, FIRST=73, AFTER=74, LAST=75, ROW=76, WITH=77, VALUES=78, CREATE=79, 
		TABLE=80, DIRECTORY=81, VIEW=82, REPLACE=83, INSERT=84, DELETE=85, INTO=86, 
		DESCRIBE=87, EXPLAIN=88, FORMAT=89, LOGICAL=90, CODEGEN=91, COST=92, CAST=93, 
		SHOW=94, TABLES=95, COLUMNS=96, COLUMN=97, USE=98, PARTITIONS=99, FUNCTIONS=100, 
		DROP=101, UNION=102, EXCEPT=103, SETMINUS=104, INTERSECT=105, TO=106, 
		TABLESAMPLE=107, STRATIFY=108, ALTER=109, RENAME=110, ARRAY=111, MAP=112, 
		STRUCT=113, COMMENT=114, LIFECYCLE=115, SET=116, RESET=117, DATA=118, 
		START=119, TRANSACTION=120, COMMIT=121, ROLLBACK=122, MACRO=123, IGNORE=124, 
		BOTH=125, LEADING=126, TRAILING=127, MERGE=128, KILL=129, READ=130, JOB=131, 
		IF=132, POSITION=133, EXTRACT=134, EQ=135, NSEQ=136, NEQ=137, NEQJ=138, 
		LT=139, LTE=140, GT=141, GTE=142, PLUS=143, MINUS=144, ASTERISK=145, SLASH=146, 
		PERCENT=147, DIV=148, TILDE=149, AMPERSAND=150, PIPE=151, CONCAT_PIPE=152, 
		HAT=153, PERCENTLIT=154, BUCKET=155, OUT=156, OF=157, SORT=158, CLUSTER=159, 
		DISTRIBUTE=160, OVERWRITE=161, TRANSFORM=162, REDUCE=163, USING=164, SERDE=165, 
		SERDEPROPERTIES=166, RECORDREADER=167, RECORDWRITER=168, DELIMITED=169, 
		FIELDS=170, TERMINATED=171, COLLECTION=172, ITEMS=173, KEYS=174, ESCAPED=175, 
		LINES=176, SEPARATED=177, FUNCTION=178, EXTENDED=179, REFRESH=180, CLEAR=181, 
		CACHE=182, UNCACHE=183, LAZY=184, FORMATTED=185, GLOBAL=186, TEMPORARY=187, 
		OPTIONS=188, UNSET=189, TBLPROPERTIES=190, DBPROPERTIES=191, BUCKETS=192, 
		SKEWED=193, STORED=194, DIRECTORIES=195, LOCATION=196, EXCHANGE=197, ARCHIVE=198, 
		UNARCHIVE=199, FILEFORMAT=200, TOUCH=201, COMPACT=202, CONCATENATE=203, 
		CHANGE=204, CASCADE=205, RESTRICT=206, CLUSTERED=207, SORTED=208, PURGE=209, 
		INPUTFORMAT=210, OUTPUTFORMAT=211, DATABASE=212, DATABASES=213, DFS=214, 
		TRUNCATE=215, ANALYZE=216, COMPUTE=217, LIST=218, STATISTICS=219, PARTITIONED=220, 
		EXTERNAL=221, DEFINED=222, REVOKE=223, GRANT=224, LOCK=225, UNLOCK=226, 
		MSCK=227, REPAIR=228, RECOVER=229, EXPORT=230, IMPORT=231, LOAD=232, ROLE=233, 
		ROLES=234, COMPACTIONS=235, PRINCIPALS=236, TRANSACTIONS=237, INDEX=238, 
		INDEXES=239, LOCKS=240, OPTION=241, ANTI=242, LOCAL=243, INPATH=244, ANGEL=245, 
		ADDJAR=246, STRING=247, BIGINT_LITERAL=248, SMALLINT_LITERAL=249, TINYINT_LITERAL=250, 
		INTEGER_VALUE=251, DECIMAL_VALUE=252, DOUBLE_LITERAL=253, BIGDECIMAL_LITERAL=254, 
		IDENTIFIER=255, BACKQUOTED_IDENTIFIER=256, SIMPLE_COMMENT=257, BRACKETED_EMPTY_COMMENT=258, 
		BRACKETED_COMMENT=259, WS=260, UNRECOGNIZED=261, STATUS=262, JOBIDENTIFIER=263;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_jobIdentifier = 7, RULE_loadOptions = 8, RULE_optionVal = 9, 
		RULE_unsupportedHiveNativeCommands = 10, RULE_createTableHeader = 11, 
		RULE_bucketSpec = 12, RULE_skewSpec = 13, RULE_locationSpec = 14, RULE_query = 15, 
		RULE_insertInto = 16, RULE_partitionSpecLocation = 17, RULE_partitionSpec = 18, 
		RULE_partitionVal = 19, RULE_describeFuncName = 20, RULE_describeColName = 21, 
		RULE_ctes = 22, RULE_namedQuery = 23, RULE_tableProvider = 24, RULE_tablePropertyList = 25, 
		RULE_tableProperty = 26, RULE_tablePropertyKey = 27, RULE_tablePropertyValue = 28, 
		RULE_constantList = 29, RULE_nestedConstantList = 30, RULE_createFileFormat = 31, 
		RULE_fileFormat = 32, RULE_storageHandler = 33, RULE_resource = 34, RULE_queryNoWith = 35, 
		RULE_queryOrganization = 36, RULE_multiInsertQueryBody = 37, RULE_queryTerm = 38, 
		RULE_queryPrimary = 39, RULE_sortItem = 40, RULE_querySpecification = 41, 
		RULE_hint = 42, RULE_hintStatement = 43, RULE_fromClause = 44, RULE_aggregation = 45, 
		RULE_groupingSet = 46, RULE_pivotClause = 47, RULE_pivotColumn = 48, RULE_pivotValue = 49, 
		RULE_lateralView = 50, RULE_setQuantifier = 51, RULE_relation = 52, RULE_joinRelation = 53, 
		RULE_joinType = 54, RULE_joinCriteria = 55, RULE_sample = 56, RULE_sampleMethod = 57, 
		RULE_identifierList = 58, RULE_identifierSeq = 59, RULE_orderedIdentifierList = 60, 
		RULE_orderedIdentifier = 61, RULE_identifierCommentList = 62, RULE_identifierComment = 63, 
		RULE_relationPrimary = 64, RULE_inlineTable = 65, RULE_functionTable = 66, 
		RULE_tableAlias = 67, RULE_rowFormat = 68, RULE_tableIdentifier = 69, 
		RULE_functionIdentifier = 70, RULE_namedExpression = 71, RULE_namedExpressionSeq = 72, 
		RULE_expression = 73, RULE_booleanExpression = 74, RULE_predicate = 75, 
		RULE_valueExpression = 76, RULE_primaryExpression = 77, RULE_constant = 78, 
		RULE_comparisonOperator = 79, RULE_arithmeticOperator = 80, RULE_predicateOperator = 81, 
		RULE_booleanValue = 82, RULE_interval = 83, RULE_intervalField = 84, RULE_intervalValue = 85, 
		RULE_colPosition = 86, RULE_dataType = 87, RULE_colTypeList = 88, RULE_colType = 89, 
		RULE_complexColTypeList = 90, RULE_complexColType = 91, RULE_whenClause = 92, 
		RULE_windows = 93, RULE_namedWindow = 94, RULE_windowSpec = 95, RULE_windowFrame = 96, 
		RULE_frameBound = 97, RULE_qualifiedName = 98, RULE_identifier = 99, RULE_strictIdentifier = 100, 
		RULE_quotedIdentifier = 101, RULE_number = 102, RULE_nonReserved = 103;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "singleTableSchema", "statement", "jobIdentifier", "loadOptions", 
		"optionVal", "unsupportedHiveNativeCommands", "createTableHeader", "bucketSpec", 
		"skewSpec", "locationSpec", "query", "insertInto", "partitionSpecLocation", 
		"partitionSpec", "partitionVal", "describeFuncName", "describeColName", 
		"ctes", "namedQuery", "tableProvider", "tablePropertyList", "tableProperty", 
		"tablePropertyKey", "tablePropertyValue", "constantList", "nestedConstantList", 
		"createFileFormat", "fileFormat", "storageHandler", "resource", "queryNoWith", 
		"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "hint", "hintStatement", "fromClause", 
		"aggregation", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
		"lateralView", "setQuantifier", "relation", "joinRelation", "joinType", 
		"joinCriteria", "sample", "sampleMethod", "identifierList", "identifierSeq", 
		"orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
		"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
		"tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "expression", "booleanExpression", "predicate", 
		"valueExpression", "primaryExpression", "constant", "comparisonOperator", 
		"arithmeticOperator", "predicateOperator", "booleanValue", "interval", 
		"intervalField", "intervalValue", "colPosition", "dataType", "colTypeList", 
		"colType", "complexColTypeList", "complexColType", "whenClause", "windows", 
		"namedWindow", "windowSpec", "windowFrame", "frameBound", "qualifiedName", 
		"identifier", "strictIdentifier", "quotedIdentifier", "number", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", "']'", 
		"':'", "'SELECT'", "'FROM'", "'ADD'", "'AS'", "'ALL'", "'ANY'", "'DISTINCT'", 
		"'WHERE'", "'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", 
		"'ORDER'", "'HAVING'", "'LIMIT'", "'AT'", "'OR'", "'AND'", "'IN'", null, 
		"'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", null, "'IS'", "'NULL'", "'TRUE'", 
		"'FALSE'", "'NULLS'", "'ASC'", "'DESC'", "'FOR'", "'INTERVAL'", "'CASE'", 
		"'WHEN'", "'THEN'", "'ELSE'", "'END'", "'JOIN'", "'CROSS'", "'OUTER'", 
		"'INNER'", "'LEFT'", "'SEMI'", "'RIGHT'", "'FULL'", "'NATURAL'", "'ON'", 
		"'PIVOT'", "'LATERAL'", "'WINDOW'", "'OVER'", "'PARTITION'", "'RANGE'", 
		"'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'FIRST'", 
		"'AFTER'", "'LAST'", "'ROW'", "'WITH'", "'VALUES'", "'CREATE'", "'TABLE'", 
		"'DIRECTORY'", "'VIEW'", "'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", 
		"'DESCRIBE'", "'EXPLAIN'", "'FORMAT'", "'LOGICAL'", "'CODEGEN'", "'COST'", 
		"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", "'INTERSECT'", 
		"'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", "'ARRAY'", 
		"'MAP'", "'STRUCT'", "'COMMENT'", "'LIFECYCLE'", "'SET'", "'RESET'", "'DATA'", 
		"'START'", "'TRANSACTION'", "'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", 
		"'BOTH'", "'LEADING'", "'TRAILING'", "'MERGE'", "'KILL'", "'READ'", "'JOB'", 
		"'IF'", "'POSITION'", "'EXTRACT'", null, "'<=>'", "'<>'", "'!='", "'<'", 
		null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", 
		"'&'", "'|'", "'||'", "'^'", "'PERCENT'", "'BUCKET'", "'OUT'", "'OF'", 
		"'SORT'", "'CLUSTER'", "'DISTRIBUTE'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", 
		"'USING'", "'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", 
		"'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", 
		"'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", "'LAZY'", "'FORMATTED'", 
		"'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", "'DBPROPERTIES'", 
		"'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", "'LOCATION'", "'EXCHANGE'", 
		"'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", "'TOUCH'", "'COMPACT'", "'CONCATENATE'", 
		"'CHANGE'", "'CASCADE'", "'RESTRICT'", "'CLUSTERED'", "'SORTED'", "'PURGE'", 
		"'INPUTFORMAT'", "'OUTPUTFORMAT'", null, null, "'DFS'", "'TRUNCATE'", 
		"'ANALYZE'", "'COMPUTE'", "'LIST'", "'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", 
		"'DEFINED'", "'REVOKE'", "'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", 
		"'RECOVER'", "'EXPORT'", "'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", 
		"'PRINCIPALS'", "'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", 
		"'ANTI'", "'LOCAL'", "'INPATH'", "'ANGEL'", "'ADDJAR'", null, null, null, 
		null, null, null, null, null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "SELECT", 
		"FROM", "ADD", "AS", "ALL", "ANY", "DISTINCT", "WHERE", "GROUP", "BY", 
		"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "AT", 
		"OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", "LIKE", "RLIKE", 
		"IS", "NULL", "TRUE", "FALSE", "NULLS", "ASC", "DESC", "FOR", "INTERVAL", 
		"CASE", "WHEN", "THEN", "ELSE", "END", "JOIN", "CROSS", "OUTER", "INNER", 
		"LEFT", "SEMI", "RIGHT", "FULL", "NATURAL", "ON", "PIVOT", "LATERAL", 
		"WINDOW", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "FIRST", "AFTER", "LAST", "ROW", "WITH", "VALUES", 
		"CREATE", "TABLE", "DIRECTORY", "VIEW", "REPLACE", "INSERT", "DELETE", 
		"INTO", "DESCRIBE", "EXPLAIN", "FORMAT", "LOGICAL", "CODEGEN", "COST", 
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "USE", "PARTITIONS", "FUNCTIONS", 
		"DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", "TABLESAMPLE", 
		"STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", "COMMENT", "LIFECYCLE", 
		"SET", "RESET", "DATA", "START", "TRANSACTION", "COMMIT", "ROLLBACK", 
		"MACRO", "IGNORE", "BOTH", "LEADING", "TRAILING", "MERGE", "KILL", "READ", 
		"JOB", "IF", "POSITION", "EXTRACT", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", 
		"LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "DIV", 
		"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", "BUCKET", 
		"OUT", "OF", "SORT", "CLUSTER", "DISTRIBUTE", "OVERWRITE", "TRANSFORM", 
		"REDUCE", "USING", "SERDE", "SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", 
		"DELIMITED", "FIELDS", "TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", 
		"LINES", "SEPARATED", "FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", 
		"UNCACHE", "LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", 
		"TBLPROPERTIES", "DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", 
		"LOCATION", "EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", 
		"COMPACT", "CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", 
		"SORTED", "PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", 
		"DFS", "TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "ANGEL", "ADDJAR", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
		"TINYINT_LITERAL", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", 
		"STATUS", "JOBIDENTIFIER"
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
	public String getGrammarFileName() { return "SparkSqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enbled = false;

	  /**
	   * Verify whether current token is a valid decimal token (which contains dot).
	   * Returns true if the character that follows the token is not a digit or letter or underscore.
	   *
	   * For example:
	   * For char stream "2.3", "2." is not a valid decimal token, because it is followed by digit '3'.
	   * For char stream "2.3_", "2.3" is not a valid decimal token, because it is followed by '_'.
	   * For char stream "2.3W", "2.3" is not a valid decimal token, because it is followed by 'W'.
	   * For char stream "12.0D 34.E2+0.12 "  12.0D is a valid decimal token because it is followed
	   * by a space. 34.E2 is a valid decimal token because it is followed by symbol '+'
	   * which is not a digit or letter or underscore.
	   */
	  public boolean isValidDecimal() {
	    int nextChar = _input.LA(1);
	    if (nextChar >= 'A' && nextChar <= 'Z' || nextChar >= '0' && nextChar <= '9' ||
	      nextChar == '_') {
	      return false;
	    } else {
	      return true;
	    }
	  }

	public SparkSqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			statement();
			setState(209);
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			namedExpression();
			setState(212);
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

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			tableIdentifier();
			setState(215);
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

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			functionIdentifier();
			setState(218);
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

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			dataType();
			setState(221);
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

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			colTypeList();
			setState(224);
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
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropDatabaseContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public DropDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDatabaseContext extends StatementContext {
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public DescribeDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public TableIdentifierContext from;
		public TableIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AngelContext extends StatementContext {
		public IdentifierContext name;
		public TerminalNode ANGEL() { return getToken(SparkSqlBaseParser.ANGEL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public AngelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAngel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAngel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAngel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddJarContext extends StatementContext {
		public IdentifierContext jar;
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AddJarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddJar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddJar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddJar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public IdentifierContext db;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public List<TerminalNode> FROM() { return getTokens(SparkSqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkSqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkSqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkSqlBaseParser.IN, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportCSVContext extends StatementContext {
		public ConstantContext name;
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadOptionsContext loadOptions() {
			return getRuleContext(LoadOptionsContext.class,0);
		}
		public ExportCSVContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExportCSV(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExportCSV(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExportCSV(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeTableContext extends StatementContext {
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public MergeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMergeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMergeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMergeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadTableContext extends StatementContext {
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ReadTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReadTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReadTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReadTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateDatabaseContext extends StatementContext {
		public Token comment;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public CreateDatabaseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateDatabase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateHiveTableContext extends StatementContext {
		public ColTypeListContext columns;
		public Token comment;
		public ColTypeListContext partitionColumns;
		public TablePropertyListContext tableProps;
		public Token lifecycle;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public TerminalNode LIFECYCLE() { return getToken(SparkSqlBaseParser.LIFECYCLE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public List<TerminalNode> COMMENT() { return getTokens(SparkSqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkSqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public CreateHiveTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateHiveTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateHiveTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateHiveTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableContext extends StatementContext {
		public IdentifierContext db;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ShowTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetDatabasePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetDatabasePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetDatabaseProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetDatabaseProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetDatabaseProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TablePropertyListContext options;
		public IdentifierListContext partitionColumnNames;
		public Token comment;
		public TablePropertyListContext tableProps;
		public Token lifecycle;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public TerminalNode LIFECYCLE() { return getToken(SparkSqlBaseParser.LIFECYCLE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public List<TerminalNode> OPTIONS() { return getTokens(SparkSqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkSqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SparkSqlBaseParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SparkSqlBaseParser.COMMENT, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeTableContext extends StatementContext {
		public Token option;
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public DescribeTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public Token resName;
		public Token loadMode;
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeColumnContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public ChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitChangeColumn(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowDatabasesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowDatabasesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowDatabases(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatusJobContext extends StatementContext {
		public TerminalNode STATUS() { return getToken(SparkSqlBaseParser.STATUS, 0); }
		public StatusJobContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStatusJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStatusJob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStatusJob(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public TableIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KillJobContext extends StatementContext {
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public JobIdentifierContext jobIdentifier() {
			return getRuleContext(JobIdentifierContext.class,0);
		}
		public KillJobContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterKillJob(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitKillJob(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitKillJob(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadTempTableContext extends StatementContext {
		public ConstantContext path;
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LoadOptionsContext loadOptions() {
			return getRuleContext(LoadOptionsContext.class,0);
		}
		public LoadTempTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLoadTempTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLoadTempTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLoadTempTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public ColTypeListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(USE);
				setState(228);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				match(CREATE);
				setState(230);
				match(DATABASE);
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(231);
					match(IF);
					setState(232);
					match(NOT);
					setState(233);
					match(EXISTS);
					}
					break;
				}
				setState(236);
				identifier();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(237);
					match(COMMENT);
					setState(238);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(241);
					locationSpec();
					}
				}

				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(244);
					match(WITH);
					setState(245);
					match(DBPROPERTIES);
					setState(246);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				match(ALTER);
				setState(250);
				match(DATABASE);
				setState(251);
				identifier();
				setState(252);
				match(SET);
				setState(253);
				match(DBPROPERTIES);
				setState(254);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				match(DROP);
				setState(257);
				match(DATABASE);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(258);
					match(IF);
					setState(259);
					match(EXISTS);
					}
					break;
				}
				setState(262);
				identifier();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(263);
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
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				createTableHeader();
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(267);
					match(T__0);
					setState(268);
					colTypeList();
					setState(269);
					match(T__1);
					}
				}

				setState(273);
				tableProvider();
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (OPTIONS - 188)) | (1L << (TBLPROPERTIES - 188)) | (1L << (LOCATION - 188)) | (1L << (CLUSTERED - 188)) | (1L << (PARTITIONED - 188)))) != 0)) {
					{
					setState(285);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(274);
						match(OPTIONS);
						setState(275);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(276);
						match(PARTITIONED);
						setState(277);
						match(BY);
						setState(278);
						((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(279);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(280);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(281);
						match(COMMENT);
						setState(282);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(283);
						match(TBLPROPERTIES);
						setState(284);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFECYCLE) {
					{
					setState(290);
					match(LIFECYCLE);
					setState(291);
					((CreateTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
				}

				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(294);
						match(AS);
						}
					}

					setState(297);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(300);
				createTableHeader();
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(301);
					match(T__0);
					setState(302);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(303);
					match(T__1);
					}
					break;
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 190)) & ~0x3f) == 0 && ((1L << (_la - 190)) & ((1L << (TBLPROPERTIES - 190)) | (1L << (SKEWED - 190)) | (1L << (STORED - 190)) | (1L << (LOCATION - 190)) | (1L << (CLUSTERED - 190)) | (1L << (PARTITIONED - 190)))) != 0)) {
					{
					setState(322);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(307);
						match(COMMENT);
						setState(308);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(309);
						match(PARTITIONED);
						setState(310);
						match(BY);
						setState(311);
						match(T__0);
						setState(312);
						((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
						setState(313);
						match(T__1);
						}
						}
						break;
					case CLUSTERED:
						{
						setState(315);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(316);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(317);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(318);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(319);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(320);
						match(TBLPROPERTIES);
						setState(321);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFECYCLE) {
					{
					setState(327);
					match(LIFECYCLE);
					setState(328);
					((CreateHiveTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
				}

				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(331);
						match(AS);
						}
					}

					setState(334);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(337);
				match(CREATE);
				setState(338);
				match(TABLE);
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(339);
					match(IF);
					setState(340);
					match(NOT);
					setState(341);
					match(EXISTS);
					}
					break;
				}
				setState(344);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(345);
				match(LIKE);
				setState(346);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(347);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
				match(ANALYZE);
				setState(351);
				match(TABLE);
				setState(352);
				tableIdentifier();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(353);
					partitionSpec();
					}
				}

				setState(356);
				match(COMPUTE);
				setState(357);
				match(STATISTICS);
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(358);
					identifier();
					}
					break;
				case 2:
					{
					setState(359);
					match(FOR);
					setState(360);
					match(COLUMNS);
					setState(361);
					identifierSeq();
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(364);
				match(ALTER);
				setState(365);
				match(TABLE);
				setState(366);
				tableIdentifier();
				setState(367);
				match(ADD);
				setState(368);
				match(COLUMNS);
				setState(369);
				match(T__0);
				setState(370);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(371);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(373);
				match(ALTER);
				setState(374);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(375);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(376);
				match(RENAME);
				setState(377);
				match(TO);
				setState(378);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(380);
				match(ALTER);
				setState(381);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(382);
				tableIdentifier();
				setState(383);
				match(SET);
				setState(384);
				match(TBLPROPERTIES);
				setState(385);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(387);
				match(ALTER);
				setState(388);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(389);
				tableIdentifier();
				setState(390);
				match(UNSET);
				setState(391);
				match(TBLPROPERTIES);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(392);
					match(IF);
					setState(393);
					match(EXISTS);
					}
				}

				setState(396);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(398);
				match(ALTER);
				setState(399);
				match(TABLE);
				setState(400);
				tableIdentifier();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(401);
					partitionSpec();
					}
				}

				setState(404);
				match(CHANGE);
				setState(406);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(405);
					match(COLUMN);
					}
					break;
				}
				setState(408);
				identifier();
				setState(409);
				colType();
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(410);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(413);
				match(ALTER);
				setState(414);
				match(TABLE);
				setState(415);
				tableIdentifier();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(416);
					partitionSpec();
					}
				}

				setState(419);
				match(SET);
				setState(420);
				match(SERDE);
				setState(421);
				match(STRING);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(422);
					match(WITH);
					setState(423);
					match(SERDEPROPERTIES);
					setState(424);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(427);
				match(ALTER);
				setState(428);
				match(TABLE);
				setState(429);
				tableIdentifier();
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(430);
					partitionSpec();
					}
				}

				setState(433);
				match(SET);
				setState(434);
				match(SERDEPROPERTIES);
				setState(435);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(437);
				match(ALTER);
				setState(438);
				match(TABLE);
				setState(439);
				tableIdentifier();
				setState(440);
				match(ADD);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(441);
					match(IF);
					setState(442);
					match(NOT);
					setState(443);
					match(EXISTS);
					}
				}

				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(446);
					partitionSpecLocation();
					}
					}
					setState(449); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(451);
				match(ALTER);
				setState(452);
				match(VIEW);
				setState(453);
				tableIdentifier();
				setState(454);
				match(ADD);
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(455);
					match(IF);
					setState(456);
					match(NOT);
					setState(457);
					match(EXISTS);
					}
				}

				setState(461); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(460);
					partitionSpec();
					}
					}
					setState(463); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(465);
				match(ALTER);
				setState(466);
				match(TABLE);
				setState(467);
				tableIdentifier();
				setState(468);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(469);
				match(RENAME);
				setState(470);
				match(TO);
				setState(471);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(473);
				match(ALTER);
				setState(474);
				match(TABLE);
				setState(475);
				tableIdentifier();
				setState(476);
				match(DROP);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(477);
					match(IF);
					setState(478);
					match(EXISTS);
					}
				}

				setState(481);
				partitionSpec();
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(482);
					match(T__2);
					setState(483);
					partitionSpec();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(489);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(492);
				match(ALTER);
				setState(493);
				match(VIEW);
				setState(494);
				tableIdentifier();
				setState(495);
				match(DROP);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(496);
					match(IF);
					setState(497);
					match(EXISTS);
					}
				}

				setState(500);
				partitionSpec();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(501);
					match(T__2);
					setState(502);
					partitionSpec();
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(508);
				match(ALTER);
				setState(509);
				match(TABLE);
				setState(510);
				tableIdentifier();
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(511);
					partitionSpec();
					}
				}

				setState(514);
				match(SET);
				setState(515);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(517);
				match(ALTER);
				setState(518);
				match(TABLE);
				setState(519);
				tableIdentifier();
				setState(520);
				match(RECOVER);
				setState(521);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(523);
				match(DROP);
				setState(524);
				match(TABLE);
				setState(527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(525);
					match(IF);
					setState(526);
					match(EXISTS);
					}
					break;
				}
				setState(529);
				tableIdentifier();
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(530);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(533);
				match(DROP);
				setState(534);
				match(VIEW);
				setState(537);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(535);
					match(IF);
					setState(536);
					match(EXISTS);
					}
					break;
				}
				setState(539);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(540);
				match(CREATE);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(541);
					match(OR);
					setState(542);
					match(REPLACE);
					}
				}

				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(545);
						match(GLOBAL);
						}
					}

					setState(548);
					match(TEMPORARY);
					}
				}

				setState(551);
				match(VIEW);
				setState(555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(552);
					match(IF);
					setState(553);
					match(NOT);
					setState(554);
					match(EXISTS);
					}
					break;
				}
				setState(557);
				tableIdentifier();
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(558);
					identifierCommentList();
					}
				}

				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(561);
					match(COMMENT);
					setState(562);
					match(STRING);
					}
				}

				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(565);
					match(PARTITIONED);
					setState(566);
					match(ON);
					setState(567);
					identifierList();
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(570);
					match(TBLPROPERTIES);
					setState(571);
					tablePropertyList();
					}
				}

				setState(574);
				match(AS);
				setState(575);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(577);
				match(CREATE);
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(578);
					match(OR);
					setState(579);
					match(REPLACE);
					}
				}

				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(582);
					match(GLOBAL);
					}
				}

				setState(585);
				match(TEMPORARY);
				setState(586);
				match(VIEW);
				setState(587);
				tableIdentifier();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(588);
					match(T__0);
					setState(589);
					colTypeList();
					setState(590);
					match(T__1);
					}
				}

				setState(594);
				tableProvider();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(595);
					match(OPTIONS);
					setState(596);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(599);
				match(ALTER);
				setState(600);
				match(VIEW);
				setState(601);
				tableIdentifier();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(602);
					match(AS);
					}
				}

				setState(605);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(607);
				match(CREATE);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(608);
					match(OR);
					setState(609);
					match(REPLACE);
					}
				}

				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(612);
					match(TEMPORARY);
					}
				}

				setState(615);
				match(FUNCTION);
				setState(619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(616);
					match(IF);
					setState(617);
					match(NOT);
					setState(618);
					match(EXISTS);
					}
					break;
				}
				setState(621);
				qualifiedName();
				setState(622);
				match(AS);
				setState(623);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(624);
					match(USING);
					setState(625);
					resource();
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(626);
						match(T__2);
						setState(627);
						resource();
						}
						}
						setState(632);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 30:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(635);
				match(DROP);
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(636);
					match(TEMPORARY);
					}
				}

				setState(639);
				match(FUNCTION);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(640);
					match(IF);
					setState(641);
					match(EXISTS);
					}
					break;
				}
				setState(644);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(645);
				match(EXPLAIN);
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(646);
					_la = _input.LA(1);
					if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(649);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(650);
				match(SHOW);
				setState(651);
				match(TABLES);
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(652);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(653);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(657);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(656);
						match(LIKE);
						}
					}

					setState(659);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(662);
				match(SHOW);
				setState(663);
				match(TABLE);
				setState(664);
				match(EXTENDED);
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(665);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(666);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(669);
				match(LIKE);
				setState(670);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(671);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(674);
				match(SHOW);
				setState(675);
				match(DATABASES);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(676);
						match(LIKE);
						}
					}

					setState(679);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(682);
				match(SHOW);
				setState(683);
				match(TBLPROPERTIES);
				setState(684);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(685);
					match(T__0);
					setState(686);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(687);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(691);
				match(SHOW);
				setState(692);
				match(COLUMNS);
				setState(693);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(694);
				tableIdentifier();
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
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
					setState(696);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(699);
				match(SHOW);
				setState(700);
				match(PARTITIONS);
				setState(701);
				tableIdentifier();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(702);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(705);
				match(SHOW);
				setState(707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(706);
					identifier();
					}
					break;
				}
				setState(709);
				match(FUNCTIONS);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (MERGE - 75)) | (1L << (KILL - 75)) | (1L << (READ - 75)) | (1L << (IF - 75)) | (1L << (POSITION - 75)) | (1L << (EXTRACT - 75)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (DIV - 148)) | (1L << (PERCENTLIT - 148)) | (1L << (BUCKET - 148)) | (1L << (OUT - 148)) | (1L << (OF - 148)) | (1L << (SORT - 148)) | (1L << (CLUSTER - 148)) | (1L << (DISTRIBUTE - 148)) | (1L << (OVERWRITE - 148)) | (1L << (TRANSFORM - 148)) | (1L << (REDUCE - 148)) | (1L << (SERDE - 148)) | (1L << (SERDEPROPERTIES - 148)) | (1L << (RECORDREADER - 148)) | (1L << (RECORDWRITER - 148)) | (1L << (DELIMITED - 148)) | (1L << (FIELDS - 148)) | (1L << (TERMINATED - 148)) | (1L << (COLLECTION - 148)) | (1L << (ITEMS - 148)) | (1L << (KEYS - 148)) | (1L << (ESCAPED - 148)) | (1L << (LINES - 148)) | (1L << (SEPARATED - 148)) | (1L << (FUNCTION - 148)) | (1L << (EXTENDED - 148)) | (1L << (REFRESH - 148)) | (1L << (CLEAR - 148)) | (1L << (CACHE - 148)) | (1L << (UNCACHE - 148)) | (1L << (LAZY - 148)) | (1L << (FORMATTED - 148)) | (1L << (GLOBAL - 148)) | (1L << (TEMPORARY - 148)) | (1L << (OPTIONS - 148)) | (1L << (UNSET - 148)) | (1L << (TBLPROPERTIES - 148)) | (1L << (DBPROPERTIES - 148)) | (1L << (BUCKETS - 148)) | (1L << (SKEWED - 148)) | (1L << (STORED - 148)) | (1L << (DIRECTORIES - 148)) | (1L << (LOCATION - 148)) | (1L << (EXCHANGE - 148)) | (1L << (ARCHIVE - 148)) | (1L << (UNARCHIVE - 148)) | (1L << (FILEFORMAT - 148)) | (1L << (TOUCH - 148)) | (1L << (COMPACT - 148)) | (1L << (CONCATENATE - 148)) | (1L << (CHANGE - 148)) | (1L << (CASCADE - 148)) | (1L << (RESTRICT - 148)) | (1L << (CLUSTERED - 148)) | (1L << (SORTED - 148)) | (1L << (PURGE - 148)) | (1L << (INPUTFORMAT - 148)) | (1L << (OUTPUTFORMAT - 148)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATABASE - 212)) | (1L << (DATABASES - 212)) | (1L << (DFS - 212)) | (1L << (TRUNCATE - 212)) | (1L << (ANALYZE - 212)) | (1L << (COMPUTE - 212)) | (1L << (LIST - 212)) | (1L << (STATISTICS - 212)) | (1L << (PARTITIONED - 212)) | (1L << (EXTERNAL - 212)) | (1L << (DEFINED - 212)) | (1L << (REVOKE - 212)) | (1L << (GRANT - 212)) | (1L << (LOCK - 212)) | (1L << (UNLOCK - 212)) | (1L << (MSCK - 212)) | (1L << (REPAIR - 212)) | (1L << (RECOVER - 212)) | (1L << (EXPORT - 212)) | (1L << (IMPORT - 212)) | (1L << (LOAD - 212)) | (1L << (ROLE - 212)) | (1L << (ROLES - 212)) | (1L << (COMPACTIONS - 212)) | (1L << (PRINCIPALS - 212)) | (1L << (TRANSACTIONS - 212)) | (1L << (INDEX - 212)) | (1L << (INDEXES - 212)) | (1L << (LOCKS - 212)) | (1L << (OPTION - 212)) | (1L << (ANTI - 212)) | (1L << (LOCAL - 212)) | (1L << (INPATH - 212)) | (1L << (STRING - 212)) | (1L << (IDENTIFIER - 212)) | (1L << (BACKQUOTED_IDENTIFIER - 212)) | (1L << (STATUS - 212)))) != 0)) {
					{
					setState(711);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
					case 1:
						{
						setState(710);
						match(LIKE);
						}
						break;
					}
					setState(715);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
					case FROM:
					case ADD:
					case AS:
					case ALL:
					case ANY:
					case DISTINCT:
					case WHERE:
					case GROUP:
					case BY:
					case GROUPING:
					case SETS:
					case CUBE:
					case ROLLUP:
					case ORDER:
					case HAVING:
					case LIMIT:
					case AT:
					case OR:
					case AND:
					case IN:
					case NOT:
					case NO:
					case EXISTS:
					case BETWEEN:
					case LIKE:
					case RLIKE:
					case IS:
					case NULL:
					case TRUE:
					case FALSE:
					case NULLS:
					case ASC:
					case DESC:
					case FOR:
					case INTERVAL:
					case CASE:
					case WHEN:
					case THEN:
					case ELSE:
					case END:
					case JOIN:
					case CROSS:
					case OUTER:
					case INNER:
					case LEFT:
					case SEMI:
					case RIGHT:
					case FULL:
					case NATURAL:
					case ON:
					case PIVOT:
					case LATERAL:
					case WINDOW:
					case OVER:
					case PARTITION:
					case RANGE:
					case ROWS:
					case UNBOUNDED:
					case PRECEDING:
					case FOLLOWING:
					case CURRENT:
					case FIRST:
					case AFTER:
					case LAST:
					case ROW:
					case WITH:
					case VALUES:
					case CREATE:
					case TABLE:
					case DIRECTORY:
					case VIEW:
					case REPLACE:
					case INSERT:
					case DELETE:
					case INTO:
					case DESCRIBE:
					case EXPLAIN:
					case FORMAT:
					case LOGICAL:
					case CODEGEN:
					case COST:
					case CAST:
					case SHOW:
					case TABLES:
					case COLUMNS:
					case COLUMN:
					case USE:
					case PARTITIONS:
					case FUNCTIONS:
					case DROP:
					case UNION:
					case EXCEPT:
					case SETMINUS:
					case INTERSECT:
					case TO:
					case TABLESAMPLE:
					case STRATIFY:
					case ALTER:
					case RENAME:
					case ARRAY:
					case MAP:
					case STRUCT:
					case COMMENT:
					case SET:
					case RESET:
					case DATA:
					case START:
					case TRANSACTION:
					case COMMIT:
					case ROLLBACK:
					case MACRO:
					case IGNORE:
					case BOTH:
					case LEADING:
					case TRAILING:
					case MERGE:
					case KILL:
					case READ:
					case IF:
					case POSITION:
					case EXTRACT:
					case DIV:
					case PERCENTLIT:
					case BUCKET:
					case OUT:
					case OF:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case OVERWRITE:
					case TRANSFORM:
					case REDUCE:
					case SERDE:
					case SERDEPROPERTIES:
					case RECORDREADER:
					case RECORDWRITER:
					case DELIMITED:
					case FIELDS:
					case TERMINATED:
					case COLLECTION:
					case ITEMS:
					case KEYS:
					case ESCAPED:
					case LINES:
					case SEPARATED:
					case FUNCTION:
					case EXTENDED:
					case REFRESH:
					case CLEAR:
					case CACHE:
					case UNCACHE:
					case LAZY:
					case FORMATTED:
					case GLOBAL:
					case TEMPORARY:
					case OPTIONS:
					case UNSET:
					case TBLPROPERTIES:
					case DBPROPERTIES:
					case BUCKETS:
					case SKEWED:
					case STORED:
					case DIRECTORIES:
					case LOCATION:
					case EXCHANGE:
					case ARCHIVE:
					case UNARCHIVE:
					case FILEFORMAT:
					case TOUCH:
					case COMPACT:
					case CONCATENATE:
					case CHANGE:
					case CASCADE:
					case RESTRICT:
					case CLUSTERED:
					case SORTED:
					case PURGE:
					case INPUTFORMAT:
					case OUTPUTFORMAT:
					case DATABASE:
					case DATABASES:
					case DFS:
					case TRUNCATE:
					case ANALYZE:
					case COMPUTE:
					case LIST:
					case STATISTICS:
					case PARTITIONED:
					case EXTERNAL:
					case DEFINED:
					case REVOKE:
					case GRANT:
					case LOCK:
					case UNLOCK:
					case MSCK:
					case REPAIR:
					case RECOVER:
					case EXPORT:
					case IMPORT:
					case LOAD:
					case ROLE:
					case ROLES:
					case COMPACTIONS:
					case PRINCIPALS:
					case TRANSACTIONS:
					case INDEX:
					case INDEXES:
					case LOCKS:
					case OPTION:
					case ANTI:
					case LOCAL:
					case INPATH:
					case IDENTIFIER:
					case BACKQUOTED_IDENTIFIER:
					case STATUS:
						{
						setState(713);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(714);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case 39:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(719);
				match(SHOW);
				setState(720);
				match(CREATE);
				setState(721);
				match(TABLE);
				setState(722);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(723);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(724);
				match(FUNCTION);
				setState(726);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(725);
					match(EXTENDED);
					}
					break;
				}
				setState(728);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(729);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(730);
				match(DATABASE);
				setState(732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(731);
					match(EXTENDED);
					}
					break;
				}
				setState(734);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(736);
					match(TABLE);
					}
					break;
				}
				setState(740);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(739);
					((DescribeTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(742);
				tableIdentifier();
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(743);
					partitionSpec();
					}
					break;
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (MERGE - 75)) | (1L << (KILL - 75)) | (1L << (READ - 75)) | (1L << (IF - 75)) | (1L << (POSITION - 75)) | (1L << (EXTRACT - 75)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (DIV - 148)) | (1L << (PERCENTLIT - 148)) | (1L << (BUCKET - 148)) | (1L << (OUT - 148)) | (1L << (OF - 148)) | (1L << (SORT - 148)) | (1L << (CLUSTER - 148)) | (1L << (DISTRIBUTE - 148)) | (1L << (OVERWRITE - 148)) | (1L << (TRANSFORM - 148)) | (1L << (REDUCE - 148)) | (1L << (SERDE - 148)) | (1L << (SERDEPROPERTIES - 148)) | (1L << (RECORDREADER - 148)) | (1L << (RECORDWRITER - 148)) | (1L << (DELIMITED - 148)) | (1L << (FIELDS - 148)) | (1L << (TERMINATED - 148)) | (1L << (COLLECTION - 148)) | (1L << (ITEMS - 148)) | (1L << (KEYS - 148)) | (1L << (ESCAPED - 148)) | (1L << (LINES - 148)) | (1L << (SEPARATED - 148)) | (1L << (FUNCTION - 148)) | (1L << (EXTENDED - 148)) | (1L << (REFRESH - 148)) | (1L << (CLEAR - 148)) | (1L << (CACHE - 148)) | (1L << (UNCACHE - 148)) | (1L << (LAZY - 148)) | (1L << (FORMATTED - 148)) | (1L << (GLOBAL - 148)) | (1L << (TEMPORARY - 148)) | (1L << (OPTIONS - 148)) | (1L << (UNSET - 148)) | (1L << (TBLPROPERTIES - 148)) | (1L << (DBPROPERTIES - 148)) | (1L << (BUCKETS - 148)) | (1L << (SKEWED - 148)) | (1L << (STORED - 148)) | (1L << (DIRECTORIES - 148)) | (1L << (LOCATION - 148)) | (1L << (EXCHANGE - 148)) | (1L << (ARCHIVE - 148)) | (1L << (UNARCHIVE - 148)) | (1L << (FILEFORMAT - 148)) | (1L << (TOUCH - 148)) | (1L << (COMPACT - 148)) | (1L << (CONCATENATE - 148)) | (1L << (CHANGE - 148)) | (1L << (CASCADE - 148)) | (1L << (RESTRICT - 148)) | (1L << (CLUSTERED - 148)) | (1L << (SORTED - 148)) | (1L << (PURGE - 148)) | (1L << (INPUTFORMAT - 148)) | (1L << (OUTPUTFORMAT - 148)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATABASE - 212)) | (1L << (DATABASES - 212)) | (1L << (DFS - 212)) | (1L << (TRUNCATE - 212)) | (1L << (ANALYZE - 212)) | (1L << (COMPUTE - 212)) | (1L << (LIST - 212)) | (1L << (STATISTICS - 212)) | (1L << (PARTITIONED - 212)) | (1L << (EXTERNAL - 212)) | (1L << (DEFINED - 212)) | (1L << (REVOKE - 212)) | (1L << (GRANT - 212)) | (1L << (LOCK - 212)) | (1L << (UNLOCK - 212)) | (1L << (MSCK - 212)) | (1L << (REPAIR - 212)) | (1L << (RECOVER - 212)) | (1L << (EXPORT - 212)) | (1L << (IMPORT - 212)) | (1L << (LOAD - 212)) | (1L << (ROLE - 212)) | (1L << (ROLES - 212)) | (1L << (COMPACTIONS - 212)) | (1L << (PRINCIPALS - 212)) | (1L << (TRANSACTIONS - 212)) | (1L << (INDEX - 212)) | (1L << (INDEXES - 212)) | (1L << (LOCKS - 212)) | (1L << (OPTION - 212)) | (1L << (ANTI - 212)) | (1L << (LOCAL - 212)) | (1L << (INPATH - 212)) | (1L << (IDENTIFIER - 212)) | (1L << (BACKQUOTED_IDENTIFIER - 212)) | (1L << (STATUS - 212)))) != 0)) {
					{
					setState(746);
					describeColName();
					}
				}

				}
				break;
			case 43:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(749);
				match(REFRESH);
				setState(750);
				match(TABLE);
				setState(751);
				tableIdentifier();
				}
				break;
			case 44:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(752);
				match(REFRESH);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(753);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(757);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(754);
							matchWildcard();
							}
							} 
						}
						setState(759);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 45:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(762);
				match(CACHE);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(763);
					match(LAZY);
					}
				}

				setState(766);
				match(TABLE);
				setState(767);
				tableIdentifier();
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(768);
						match(AS);
						}
					}

					setState(771);
					query();
					}
				}

				}
				break;
			case 46:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(774);
				match(UNCACHE);
				setState(775);
				match(TABLE);
				setState(778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(776);
					match(IF);
					setState(777);
					match(EXISTS);
					}
					break;
				}
				setState(780);
				tableIdentifier();
				}
				break;
			case 47:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(781);
				match(CLEAR);
				setState(782);
				match(CACHE);
				}
				break;
			case 48:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(783);
				match(LOAD);
				setState(784);
				match(DATA);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(785);
					match(LOCAL);
					}
				}

				setState(788);
				match(INPATH);
				setState(789);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(790);
					match(OVERWRITE);
					}
				}

				setState(793);
				match(INTO);
				setState(794);
				match(TABLE);
				setState(795);
				tableIdentifier();
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(796);
					partitionSpec();
					}
				}

				}
				break;
			case 49:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(799);
				match(TRUNCATE);
				setState(800);
				match(TABLE);
				setState(801);
				tableIdentifier();
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(802);
					partitionSpec();
					}
				}

				}
				break;
			case 50:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(805);
				match(MSCK);
				setState(806);
				match(REPAIR);
				setState(807);
				match(TABLE);
				setState(808);
				tableIdentifier();
				}
				break;
			case 51:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(809);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(810);
				identifier();
				setState(814);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(811);
						matchWildcard();
						}
						} 
					}
					setState(816);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				}
				break;
			case 52:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(817);
				match(SET);
				setState(818);
				match(ROLE);
				setState(822);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(819);
						matchWildcard();
						}
						} 
					}
					setState(824);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				}
				}
				break;
			case 53:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(825);
				match(SET);
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(826);
						matchWildcard();
						}
						} 
					}
					setState(831);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(832);
				match(RESET);
				}
				break;
			case 55:
				_localctx = new StatusJobContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(833);
				match(STATUS);
				setState(837);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(834);
						matchWildcard();
						}
						} 
					}
					setState(839);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 56:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(840);
				match(MERGE);
				setState(841);
				match(TABLE);
				setState(842);
				tableIdentifier();
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(843);
					partitionSpec();
					}
				}

				}
				break;
			case 57:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(846);
				match(KILL);
				setState(847);
				match(JOB);
				setState(848);
				jobIdentifier();
				}
				break;
			case 58:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(849);
				match(ADDJAR);
				setState(850);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 59:
				_localctx = new AngelContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(851);
				match(ANGEL);
				setState(852);
				((AngelContext)_localctx).name = identifier();
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(853);
					tablePropertyList();
					}
				}

				}
				break;
			case 60:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(856);
				match(READ);
				setState(857);
				match(TABLE);
				setState(858);
				tableIdentifier();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(859);
					partitionSpec();
					}
				}

				setState(862);
				match(LIMIT);
				setState(863);
				number();
				}
				break;
			case 61:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(865);
				match(LOAD);
				setState(866);
				match(DATA);
				setState(867);
				((LoadTempTableContext)_localctx).path = constant();
				setState(868);
				match(TABLE);
				setState(869);
				tableIdentifier();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(870);
					loadOptions();
					}
				}

				}
				break;
			case 62:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(873);
				match(LOAD);
				setState(874);
				match(DATA);
				setState(875);
				((LoadDataContext)_localctx).resName = match(STRING);
				setState(876);
				((LoadDataContext)_localctx).loadMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTO || _la==OVERWRITE) ) {
					((LoadDataContext)_localctx).loadMode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(877);
				match(TABLE);
				setState(878);
				tableIdentifier();
				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(879);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new ExportCSVContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(882);
				match(EXPORT);
				setState(883);
				match(TABLE);
				setState(884);
				tableIdentifier();
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(885);
					partitionSpec();
					}
				}

				setState(888);
				match(TO);
				setState(889);
				((ExportCSVContext)_localctx).name = constant();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(890);
					loadOptions();
					}
				}

				}
				break;
			case 64:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(893);
				unsupportedHiveNativeCommands();
				setState(897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(894);
						matchWildcard();
						}
						} 
					}
					setState(899);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class JobIdentifierContext extends ParserRuleContext {
		public TerminalNode JOBIDENTIFIER() { return getToken(SparkSqlBaseParser.JOBIDENTIFIER, 0); }
		public JobIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJobIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJobIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJobIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobIdentifierContext jobIdentifier() throws RecognitionException {
		JobIdentifierContext _localctx = new JobIdentifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jobIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(JOBIDENTIFIER);
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

	public static class LoadOptionsContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public List<OptionValContext> optionVal() {
			return getRuleContexts(OptionValContext.class);
		}
		public OptionValContext optionVal(int i) {
			return getRuleContext(OptionValContext.class,i);
		}
		public LoadOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLoadOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLoadOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLoadOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoadOptionsContext loadOptions() throws RecognitionException {
		LoadOptionsContext _localctx = new LoadOptionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loadOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(OPTIONS);
			setState(905);
			match(T__0);
			setState(906);
			optionVal();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(907);
				match(T__2);
				setState(908);
				optionVal();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(914);
			match(T__1);
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

	public static class OptionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public OptionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOptionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOptionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOptionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionValContext optionVal() throws RecognitionException {
		OptionValContext _localctx = new OptionValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optionVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			identifier();
			setState(917);
			match(EQ);
			setState(918);
			constant();
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

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(920);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(921);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(923);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(926);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(925);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(930);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(929);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(932);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(933);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(934);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(935);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(936);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(939);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(940);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(941);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(942);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(943);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(944);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(945);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(946);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(947);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(948);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(949);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(950);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(951);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(952);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(953);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(954);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(955);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(956);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(957);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(958);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(959);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(960);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(961);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(962);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(963);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(964);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(965);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(966);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(967);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(968);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(969);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(970);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(971);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(972);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(973);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(974);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(975);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(976);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(977);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(978);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(979);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(980);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(981);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(982);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(983);
				tableIdentifier();
				setState(984);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(985);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(987);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(988);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(989);
				tableIdentifier();
				setState(990);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(991);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(993);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(994);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(995);
				tableIdentifier();
				setState(996);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(997);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(999);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1000);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1001);
				tableIdentifier();
				setState(1002);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1003);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1005);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1006);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1007);
				tableIdentifier();
				setState(1008);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1009);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1011);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1012);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1013);
				tableIdentifier();
				setState(1014);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1015);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1016);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1017);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1019);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1020);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1021);
				tableIdentifier();
				setState(1022);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1023);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1024);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1026);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1027);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1028);
				tableIdentifier();
				setState(1029);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1030);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1032);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1033);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1034);
				tableIdentifier();
				setState(1035);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1036);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1038);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1039);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1040);
				tableIdentifier();
				setState(1041);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1042);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1044);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1045);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1046);
				tableIdentifier();
				setState(1047);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1049);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1050);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1051);
				tableIdentifier();
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1052);
					partitionSpec();
					}
				}

				setState(1055);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1057);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1058);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1059);
				tableIdentifier();
				setState(1061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1060);
					partitionSpec();
					}
				}

				setState(1063);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1065);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1066);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1067);
				tableIdentifier();
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1068);
					partitionSpec();
					}
				}

				setState(1071);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1072);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1074);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1075);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1076);
				tableIdentifier();
				setState(1078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1077);
					partitionSpec();
					}
				}

				setState(1080);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1081);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1083);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1084);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1085);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1086);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1087);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 45);
				{
				setState(1088);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DELETE);
				setState(1089);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(FROM);
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

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			match(CREATE);
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1093);
				match(TEMPORARY);
				}
			}

			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1096);
				match(EXTERNAL);
				}
			}

			setState(1099);
			match(TABLE);
			setState(1103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1100);
				match(IF);
				setState(1101);
				match(NOT);
				setState(1102);
				match(EXISTS);
				}
				break;
			}
			setState(1105);
			tableIdentifier();
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

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(CLUSTERED);
			setState(1108);
			match(BY);
			setState(1109);
			identifierList();
			setState(1113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1110);
				match(SORTED);
				setState(1111);
				match(BY);
				setState(1112);
				orderedIdentifierList();
				}
			}

			setState(1115);
			match(INTO);
			setState(1116);
			match(INTEGER_VALUE);
			setState(1117);
			match(BUCKETS);
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

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(SKEWED);
			setState(1120);
			match(BY);
			setState(1121);
			identifierList();
			setState(1122);
			match(ON);
			setState(1125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1123);
				constantList();
				}
				break;
			case 2:
				{
				setState(1124);
				nestedConstantList();
				}
				break;
			}
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1127);
				match(STORED);
				setState(1128);
				match(AS);
				setState(1129);
				match(DIRECTORIES);
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

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			match(LOCATION);
			setState(1133);
			match(STRING);
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
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1135);
				ctes();
				}
			}

			setState(1138);
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

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public TablePropertyListContext options;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_insertInto);
		int _la;
		try {
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(INSERT);
				setState(1141);
				match(OVERWRITE);
				setState(1142);
				match(TABLE);
				setState(1143);
				tableIdentifier();
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1144);
					partitionSpec();
					setState(1148);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1145);
						match(IF);
						setState(1146);
						match(NOT);
						setState(1147);
						match(EXISTS);
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				match(INSERT);
				setState(1153);
				match(INTO);
				setState(1155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1154);
					match(TABLE);
					}
					break;
				}
				setState(1157);
				tableIdentifier();
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1158);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1161);
				match(INSERT);
				setState(1162);
				match(OVERWRITE);
				setState(1164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1163);
					match(LOCAL);
					}
				}

				setState(1166);
				match(DIRECTORY);
				setState(1167);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1168);
					rowFormat();
					}
				}

				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1171);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				match(INSERT);
				setState(1175);
				match(OVERWRITE);
				setState(1177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1176);
					match(LOCAL);
					}
				}

				setState(1179);
				match(DIRECTORY);
				setState(1181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1180);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1183);
				tableProvider();
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1184);
					match(OPTIONS);
					setState(1185);
					((InsertOverwriteDirContext)_localctx).options = tablePropertyList();
					}
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

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			partitionSpec();
			setState(1192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1191);
				locationSpec();
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

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(PARTITION);
			setState(1195);
			match(T__0);
			setState(1196);
			partitionVal();
			setState(1201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1197);
				match(T__2);
				setState(1198);
				partitionVal();
				}
				}
				setState(1203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1204);
			match(T__1);
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

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			identifier();
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1207);
				match(EQ);
				setState(1208);
				constant();
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

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_describeFuncName);
		try {
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1211);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1213);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1214);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1215);
				predicateOperator();
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

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1219);
				match(T__3);
				setState(1220);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1225);
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

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(WITH);
			setState(1227);
			namedQuery();
			setState(1232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1228);
				match(T__2);
				setState(1229);
				namedQuery();
				}
				}
				setState(1234);
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

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1236);
				match(AS);
				}
			}

			setState(1239);
			match(T__0);
			setState(1240);
			query();
			setState(1241);
			match(T__1);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(USING);
			setState(1244);
			qualifiedName();
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyListContext tablePropertyList() throws RecognitionException {
		TablePropertyListContext _localctx = new TablePropertyListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			match(T__0);
			setState(1247);
			tableProperty();
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1248);
				match(T__2);
				setState(1249);
				tableProperty();
				}
				}
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1255);
			match(T__1);
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
		public TablePropertyKeyContext tablePropertyKey() {
			return getRuleContext(TablePropertyKeyContext.class,0);
		}
		public TablePropertyValueContext tablePropertyValue() {
			return getRuleContext(TablePropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (STRING - 247)) | (1L << (INTEGER_VALUE - 247)) | (1L << (DECIMAL_VALUE - 247)))) != 0)) {
				{
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1258);
					match(EQ);
					}
				}

				setState(1261);
				((TablePropertyContext)_localctx).value = tablePropertyValue();
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

	public static class TablePropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyKeyContext tablePropertyKey() throws RecognitionException {
		TablePropertyKeyContext _localctx = new TablePropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case MERGE:
			case KILL:
			case READ:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case STATUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				identifier();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1265);
					match(T__3);
					setState(1266);
					identifier();
					}
					}
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1272);
				match(STRING);
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
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TablePropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tablePropertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTablePropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTablePropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTablePropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyValueContext tablePropertyValue() throws RecognitionException {
		TablePropertyValueContext _localctx = new TablePropertyValueContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tablePropertyValue);
		try {
			setState(1279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1276);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1277);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1278);
				match(STRING);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(T__0);
			setState(1282);
			constant();
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1283);
				match(T__2);
				setState(1284);
				constant();
				}
				}
				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1290);
			match(T__1);
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

	public static class NestedConstantListContext extends ParserRuleContext {
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(T__0);
			setState(1293);
			constantList();
			setState(1298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1294);
				match(T__2);
				setState(1295);
				constantList();
				}
				}
				setState(1300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1301);
			match(T__1);
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

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createFileFormat);
		try {
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1303);
				match(STORED);
				setState(1304);
				match(AS);
				setState(1305);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(STORED);
				setState(1307);
				match(BY);
				setState(1308);
				storageHandler();
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

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_fileFormat);
		try {
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1311);
				match(INPUTFORMAT);
				setState(1312);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1313);
				match(OUTPUTFORMAT);
				setState(1314);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
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

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(STRING);
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1319);
				match(WITH);
				setState(1320);
				match(SERDEPROPERTIES);
				setState(1321);
				tablePropertyList();
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

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324);
			identifier();
			setState(1325);
			match(STRING);
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
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInsertQueryContext extends QueryNoWithContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public SingleInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends QueryNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_queryNoWith);
		int _la;
		try {
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1327);
					insertInto();
					}
				}

				setState(1330);
				queryTerm(0);
				setState(1331);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				fromClause();
				setState(1335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1334);
					multiInsertQueryBody();
					}
					}
					setState(1337); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SELECT || _la==FROM || _la==INSERT || _la==MAP || _la==REDUCE );
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

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1341);
				match(ORDER);
				setState(1342);
				match(BY);
				setState(1343);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1344);
					match(T__2);
					setState(1345);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1353);
				match(CLUSTER);
				setState(1354);
				match(BY);
				setState(1355);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1356);
					match(T__2);
					setState(1357);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1365);
				match(DISTRIBUTE);
				setState(1366);
				match(BY);
				setState(1367);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1368);
					match(T__2);
					setState(1369);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1374);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1377);
				match(SORT);
				setState(1378);
				match(BY);
				setState(1379);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1380);
					match(T__2);
					setState(1381);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1389);
				windows();
				}
			}

			setState(1397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1392);
				match(LIMIT);
				setState(1395);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1393);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1394);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1399);
				insertInto();
				}
			}

			setState(1402);
			querySpecification();
			setState(1403);
			queryOrganization();
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
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
		public TerminalNode INTERSECT() { return getToken(SparkSqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1406);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1408);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1409);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1410);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)) | (1L << (INTERSECT - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1412);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1411);
							setQuantifier();
							}
						}

						setState(1414);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1415);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1416);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1417);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1419);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1418);
							setQuantifier();
							}
						}

						setState(1421);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1422);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1423);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1424);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (UNION - 102)) | (1L << (EXCEPT - 102)) | (1L << (SETMINUS - 102)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1426);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1425);
							setQuantifier();
							}
						}

						setState(1428);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,170,_ctx);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_queryPrimary);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1435);
				match(TABLE);
				setState(1436);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1437);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1438);
				match(T__0);
				setState(1439);
				queryNoWith();
				setState(1440);
				match(T__1);
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
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			expression();
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1445);
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

			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1448);
				match(NULLS);
				setState(1449);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
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
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public BooleanExpressionContext where;
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public BooleanExpressionContext having;
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationContext aggregation() {
			return getRuleContext(AggregationContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public WindowsContext windows() {
			return getRuleContext(WindowsContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1462);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1452);
					match(SELECT);
					setState(1453);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1454);
					match(T__0);
					setState(1455);
					namedExpressionSeq();
					setState(1456);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1458);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1459);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1460);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1461);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1464);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1467);
					match(RECORDWRITER);
					setState(1468);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1471);
				match(USING);
				setState(1472);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1473);
					match(AS);
					setState(1483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1474);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1475);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1476);
						match(T__0);
						setState(1479);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
						case 1:
							{
							setState(1477);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1478);
							colTypeList();
							}
							break;
						}
						setState(1481);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1487);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1490);
					match(RECORDREADER);
					setState(1491);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1494);
					fromClause();
					}
					break;
				}
				setState(1499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1497);
					match(WHERE);
					setState(1498);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1523);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1501);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1502);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1507);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1509);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
					case 1:
						{
						setState(1508);
						setQuantifier();
						}
						break;
					}
					setState(1511);
					namedExpressionSeq();
					setState(1513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1512);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1515);
					fromClause();
					setState(1521);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1516);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1518);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
						case 1:
							{
							setState(1517);
							setQuantifier();
							}
							break;
						}
						setState(1520);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1525);
						lateralView();
						}
						} 
					}
					setState(1530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				setState(1533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1531);
					match(WHERE);
					setState(1532);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1535);
					aggregation();
					}
					break;
				}
				setState(1540);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1538);
					match(HAVING);
					setState(1539);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1542);
					windows();
					}
					break;
				}
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

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			match(T__4);
			setState(1548);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
				{
				{
				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1549);
					match(T__2);
					}
				}

				setState(1552);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1558);
			match(T__5);
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

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hintStatement);
		int _la;
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1562);
				match(T__0);
				setState(1563);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1564);
					match(T__2);
					setState(1565);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1571);
				match(T__1);
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

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(FROM);
			setState(1576);
			relation();
			setState(1581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1577);
					match(T__2);
					setState(1578);
					relation();
					}
					} 
				}
				setState(1583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			setState(1587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1584);
					lateralView();
					}
					} 
				}
				setState(1589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1590);
				pivotClause();
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

	public static class AggregationContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SparkSqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public AggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAggregation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAggregation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationContext aggregation() throws RecognitionException {
		AggregationContext _localctx = new AggregationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(GROUP);
				setState(1594);
				match(BY);
				setState(1595);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1596);
						match(T__2);
						setState(1597);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1602);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				setState(1620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1603);
					match(WITH);
					setState(1604);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1605);
					match(WITH);
					setState(1606);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1607);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1608);
					match(SETS);
					setState(1609);
					match(T__0);
					setState(1610);
					groupingSet();
					setState(1615);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1611);
						match(T__2);
						setState(1612);
						groupingSet();
						}
						}
						setState(1617);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1618);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1622);
				match(GROUP);
				setState(1623);
				match(BY);
				setState(1624);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1625);
				match(SETS);
				setState(1626);
				match(T__0);
				setState(1627);
				groupingSet();
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1628);
					match(T__2);
					setState(1629);
					groupingSet();
					}
					}
					setState(1634);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1635);
				match(T__1);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_groupingSet);
		int _la;
		try {
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				match(T__0);
				setState(1648);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
					{
					setState(1640);
					expression();
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1641);
						match(T__2);
						setState(1642);
						expression();
						}
						}
						setState(1647);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1650);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1651);
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

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			match(PIVOT);
			setState(1655);
			match(T__0);
			setState(1656);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1657);
			match(FOR);
			setState(1658);
			pivotColumn();
			setState(1659);
			match(IN);
			setState(1660);
			match(T__0);
			setState(1661);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1662);
				match(T__2);
				setState(1663);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1669);
			match(T__1);
			setState(1670);
			match(T__1);
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

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pivotColumn);
		int _la;
		try {
			setState(1684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case MERGE:
			case KILL:
			case READ:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case STATUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673);
				match(T__0);
				setState(1674);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1675);
					match(T__2);
					setState(1676);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1681);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1682);
				match(T__1);
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

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			expression();
			setState(1691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (MERGE - 75)) | (1L << (KILL - 75)) | (1L << (READ - 75)) | (1L << (IF - 75)) | (1L << (POSITION - 75)) | (1L << (EXTRACT - 75)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (DIV - 148)) | (1L << (PERCENTLIT - 148)) | (1L << (BUCKET - 148)) | (1L << (OUT - 148)) | (1L << (OF - 148)) | (1L << (SORT - 148)) | (1L << (CLUSTER - 148)) | (1L << (DISTRIBUTE - 148)) | (1L << (OVERWRITE - 148)) | (1L << (TRANSFORM - 148)) | (1L << (REDUCE - 148)) | (1L << (SERDE - 148)) | (1L << (SERDEPROPERTIES - 148)) | (1L << (RECORDREADER - 148)) | (1L << (RECORDWRITER - 148)) | (1L << (DELIMITED - 148)) | (1L << (FIELDS - 148)) | (1L << (TERMINATED - 148)) | (1L << (COLLECTION - 148)) | (1L << (ITEMS - 148)) | (1L << (KEYS - 148)) | (1L << (ESCAPED - 148)) | (1L << (LINES - 148)) | (1L << (SEPARATED - 148)) | (1L << (FUNCTION - 148)) | (1L << (EXTENDED - 148)) | (1L << (REFRESH - 148)) | (1L << (CLEAR - 148)) | (1L << (CACHE - 148)) | (1L << (UNCACHE - 148)) | (1L << (LAZY - 148)) | (1L << (FORMATTED - 148)) | (1L << (GLOBAL - 148)) | (1L << (TEMPORARY - 148)) | (1L << (OPTIONS - 148)) | (1L << (UNSET - 148)) | (1L << (TBLPROPERTIES - 148)) | (1L << (DBPROPERTIES - 148)) | (1L << (BUCKETS - 148)) | (1L << (SKEWED - 148)) | (1L << (STORED - 148)) | (1L << (DIRECTORIES - 148)) | (1L << (LOCATION - 148)) | (1L << (EXCHANGE - 148)) | (1L << (ARCHIVE - 148)) | (1L << (UNARCHIVE - 148)) | (1L << (FILEFORMAT - 148)) | (1L << (TOUCH - 148)) | (1L << (COMPACT - 148)) | (1L << (CONCATENATE - 148)) | (1L << (CHANGE - 148)) | (1L << (CASCADE - 148)) | (1L << (RESTRICT - 148)) | (1L << (CLUSTERED - 148)) | (1L << (SORTED - 148)) | (1L << (PURGE - 148)) | (1L << (INPUTFORMAT - 148)) | (1L << (OUTPUTFORMAT - 148)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATABASE - 212)) | (1L << (DATABASES - 212)) | (1L << (DFS - 212)) | (1L << (TRUNCATE - 212)) | (1L << (ANALYZE - 212)) | (1L << (COMPUTE - 212)) | (1L << (LIST - 212)) | (1L << (STATISTICS - 212)) | (1L << (PARTITIONED - 212)) | (1L << (EXTERNAL - 212)) | (1L << (DEFINED - 212)) | (1L << (REVOKE - 212)) | (1L << (GRANT - 212)) | (1L << (LOCK - 212)) | (1L << (UNLOCK - 212)) | (1L << (MSCK - 212)) | (1L << (REPAIR - 212)) | (1L << (RECOVER - 212)) | (1L << (EXPORT - 212)) | (1L << (IMPORT - 212)) | (1L << (LOAD - 212)) | (1L << (ROLE - 212)) | (1L << (ROLES - 212)) | (1L << (COMPACTIONS - 212)) | (1L << (PRINCIPALS - 212)) | (1L << (TRANSACTIONS - 212)) | (1L << (INDEX - 212)) | (1L << (INDEXES - 212)) | (1L << (LOCKS - 212)) | (1L << (OPTION - 212)) | (1L << (ANTI - 212)) | (1L << (LOCAL - 212)) | (1L << (INPATH - 212)) | (1L << (IDENTIFIER - 212)) | (1L << (BACKQUOTED_IDENTIFIER - 212)) | (1L << (STATUS - 212)))) != 0)) {
				{
				setState(1688);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1687);
					match(AS);
					}
					break;
				}
				setState(1690);
				identifier();
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

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(LATERAL);
			setState(1694);
			match(VIEW);
			setState(1696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1695);
				match(OUTER);
				}
				break;
			}
			setState(1698);
			qualifiedName();
			setState(1699);
			match(T__0);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
				{
				setState(1700);
				expression();
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1701);
					match(T__2);
					setState(1702);
					expression();
					}
					}
					setState(1707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1710);
			match(T__1);
			setState(1711);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1712);
					match(AS);
					}
					break;
				}
				setState(1715);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1720);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1716);
						match(T__2);
						setState(1717);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1722);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
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

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			relationPrimary();
			setState(1731);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1728);
					joinRelation();
					}
					} 
				}
				setState(1733);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
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

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SparkSqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SparkSqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_joinRelation);
		try {
			setState(1745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case CROSS:
			case INNER:
			case LEFT:
			case RIGHT:
			case FULL:
			case ANTI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1734);
				joinType();
				}
				setState(1735);
				match(JOIN);
				setState(1736);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1737);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				match(NATURAL);
				setState(1741);
				joinType();
				setState(1742);
				match(JOIN);
				setState(1743);
				((JoinRelationContext)_localctx).right = relationPrimary();
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

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SparkSqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_joinType);
		int _la;
		try {
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1747);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1750);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1751);
				match(LEFT);
				setState(1753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1752);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1755);
				match(LEFT);
				setState(1756);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1757);
				match(RIGHT);
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1758);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1761);
				match(FULL);
				setState(1763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1762);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1765);
					match(LEFT);
					}
				}

				setState(1768);
				match(ANTI);
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

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_joinCriteria);
		int _la;
		try {
			setState(1785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1771);
				match(ON);
				setState(1772);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				match(USING);
				setState(1774);
				match(T__0);
				setState(1775);
				identifier();
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1776);
					match(T__2);
					setState(1777);
					identifier();
					}
					}
					setState(1782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1783);
				match(T__1);
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

	public static class SampleContext extends ParserRuleContext {
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(TABLESAMPLE);
			setState(1788);
			match(T__0);
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
				{
				setState(1789);
				sampleMethod();
				}
			}

			setState(1792);
			match(T__1);
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

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sampleMethod);
		int _la;
		try {
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1794);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1797);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1798);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1799);
				expression();
				setState(1800);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1802);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(1803);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(1804);
				match(OUT);
				setState(1805);
				match(OF);
				setState(1806);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(1815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1807);
					match(ON);
					setState(1813);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						setState(1808);
						identifier();
						}
						break;
					case 2:
						{
						setState(1809);
						qualifiedName();
						setState(1810);
						match(T__0);
						setState(1811);
						match(T__1);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1817);
				((SampleByBytesContext)_localctx).bytes = expression();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			match(T__0);
			setState(1821);
			identifierSeq();
			setState(1822);
			match(T__1);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			identifier();
			setState(1829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1825);
					match(T__2);
					setState(1826);
					identifier();
					}
					} 
				}
				setState(1831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1832);
			match(T__0);
			setState(1833);
			orderedIdentifier();
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1834);
				match(T__2);
				setState(1835);
				orderedIdentifier();
				}
				}
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1841);
			match(T__1);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public Token ordering;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			identifier();
			setState(1845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1844);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
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

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(T__0);
			setState(1848);
			identifierComment();
			setState(1853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1849);
				match(T__2);
				setState(1850);
				identifierComment();
				}
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1856);
			match(T__1);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			identifier();
			setState(1861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(1859);
				match(COMMENT);
				setState(1860);
				match(STRING);
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
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_relationPrimary);
		try {
			setState(1887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1863);
				tableIdentifier();
				setState(1865);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1864);
					sample();
					}
					break;
				}
				setState(1867);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1869);
				match(T__0);
				setState(1870);
				queryNoWith();
				setState(1871);
				match(T__1);
				setState(1873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1872);
					sample();
					}
					break;
				}
				setState(1875);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1877);
				match(T__0);
				setState(1878);
				relation();
				setState(1879);
				match(T__1);
				setState(1881);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1880);
					sample();
					}
					break;
				}
				setState(1883);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1885);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1886);
				functionTable();
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

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			match(VALUES);
			setState(1890);
			expression();
			setState(1895);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1891);
					match(T__2);
					setState(1892);
					expression();
					}
					} 
				}
				setState(1897);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			setState(1898);
			tableAlias();
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

	public static class FunctionTableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1900);
			identifier();
			setState(1901);
			match(T__0);
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
				{
				setState(1902);
				expression();
				setState(1907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1903);
					match(T__2);
					setState(1904);
					expression();
					}
					}
					setState(1909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1912);
			match(T__1);
			setState(1913);
			tableAlias();
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

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(1916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(1915);
					match(AS);
					}
					break;
				}
				setState(1918);
				strictIdentifier();
				setState(1920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(1919);
					identifierList();
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

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public TablePropertyListContext props;
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SparkSqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SparkSqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_rowFormat);
		try {
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1924);
				match(ROW);
				setState(1925);
				match(FORMAT);
				setState(1926);
				match(SERDE);
				setState(1927);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(1931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
				case 1:
					{
					setState(1928);
					match(WITH);
					setState(1929);
					match(SERDEPROPERTIES);
					setState(1930);
					((RowFormatSerdeContext)_localctx).props = tablePropertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1933);
				match(ROW);
				setState(1934);
				match(FORMAT);
				setState(1935);
				match(DELIMITED);
				setState(1945);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1936);
					match(FIELDS);
					setState(1937);
					match(TERMINATED);
					setState(1938);
					match(BY);
					setState(1939);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(1943);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						setState(1940);
						match(ESCAPED);
						setState(1941);
						match(BY);
						setState(1942);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(1952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(1947);
					match(COLLECTION);
					setState(1948);
					match(ITEMS);
					setState(1949);
					match(TERMINATED);
					setState(1950);
					match(BY);
					setState(1951);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(1954);
					match(MAP);
					setState(1955);
					match(KEYS);
					setState(1956);
					match(TERMINATED);
					setState(1957);
					match(BY);
					setState(1958);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(1965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(1961);
					match(LINES);
					setState(1962);
					match(TERMINATED);
					setState(1963);
					match(BY);
					setState(1964);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(1971);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(1967);
					match(NULL);
					setState(1968);
					match(DEFINED);
					setState(1969);
					match(AS);
					setState(1970);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(1975);
				((TableIdentifierContext)_localctx).db = identifier();
				setState(1976);
				match(T__3);
				}
				break;
			}
			setState(1980);
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

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public IdentifierContext db;
		public IdentifierContext function;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(1982);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(1983);
				match(T__3);
				}
				break;
			}
			setState(1987);
			((FunctionIdentifierContext)_localctx).function = identifier();
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

	public static class NamedExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			expression();
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(1991);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(1990);
					match(AS);
					}
					break;
				}
				setState(1995);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
				case FROM:
				case ADD:
				case AS:
				case ALL:
				case ANY:
				case DISTINCT:
				case WHERE:
				case GROUP:
				case BY:
				case GROUPING:
				case SETS:
				case CUBE:
				case ROLLUP:
				case ORDER:
				case HAVING:
				case LIMIT:
				case AT:
				case OR:
				case AND:
				case IN:
				case NOT:
				case NO:
				case EXISTS:
				case BETWEEN:
				case LIKE:
				case RLIKE:
				case IS:
				case NULL:
				case TRUE:
				case FALSE:
				case NULLS:
				case ASC:
				case DESC:
				case FOR:
				case INTERVAL:
				case CASE:
				case WHEN:
				case THEN:
				case ELSE:
				case END:
				case JOIN:
				case CROSS:
				case OUTER:
				case INNER:
				case LEFT:
				case SEMI:
				case RIGHT:
				case FULL:
				case NATURAL:
				case ON:
				case PIVOT:
				case LATERAL:
				case WINDOW:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case UNBOUNDED:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case FIRST:
				case AFTER:
				case LAST:
				case ROW:
				case WITH:
				case VALUES:
				case CREATE:
				case TABLE:
				case DIRECTORY:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case INTO:
				case DESCRIBE:
				case EXPLAIN:
				case FORMAT:
				case LOGICAL:
				case CODEGEN:
				case COST:
				case CAST:
				case SHOW:
				case TABLES:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case DROP:
				case UNION:
				case EXCEPT:
				case SETMINUS:
				case INTERSECT:
				case TO:
				case TABLESAMPLE:
				case STRATIFY:
				case ALTER:
				case RENAME:
				case ARRAY:
				case MAP:
				case STRUCT:
				case COMMENT:
				case SET:
				case RESET:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case MACRO:
				case IGNORE:
				case BOTH:
				case LEADING:
				case TRAILING:
				case MERGE:
				case KILL:
				case READ:
				case IF:
				case POSITION:
				case EXTRACT:
				case DIV:
				case PERCENTLIT:
				case BUCKET:
				case OUT:
				case OF:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case OVERWRITE:
				case TRANSFORM:
				case REDUCE:
				case SERDE:
				case SERDEPROPERTIES:
				case RECORDREADER:
				case RECORDWRITER:
				case DELIMITED:
				case FIELDS:
				case TERMINATED:
				case COLLECTION:
				case ITEMS:
				case KEYS:
				case ESCAPED:
				case LINES:
				case SEPARATED:
				case FUNCTION:
				case EXTENDED:
				case REFRESH:
				case CLEAR:
				case CACHE:
				case UNCACHE:
				case LAZY:
				case FORMATTED:
				case GLOBAL:
				case TEMPORARY:
				case OPTIONS:
				case UNSET:
				case TBLPROPERTIES:
				case DBPROPERTIES:
				case BUCKETS:
				case SKEWED:
				case STORED:
				case DIRECTORIES:
				case LOCATION:
				case EXCHANGE:
				case ARCHIVE:
				case UNARCHIVE:
				case FILEFORMAT:
				case TOUCH:
				case COMPACT:
				case CONCATENATE:
				case CHANGE:
				case CASCADE:
				case RESTRICT:
				case CLUSTERED:
				case SORTED:
				case PURGE:
				case INPUTFORMAT:
				case OUTPUTFORMAT:
				case DATABASE:
				case DATABASES:
				case DFS:
				case TRUNCATE:
				case ANALYZE:
				case COMPUTE:
				case LIST:
				case STATISTICS:
				case PARTITIONED:
				case EXTERNAL:
				case DEFINED:
				case REVOKE:
				case GRANT:
				case LOCK:
				case UNLOCK:
				case MSCK:
				case REPAIR:
				case RECOVER:
				case EXPORT:
				case IMPORT:
				case LOAD:
				case ROLE:
				case ROLES:
				case COMPACTIONS:
				case PRINCIPALS:
				case TRANSACTIONS:
				case INDEX:
				case INDEXES:
				case LOCKS:
				case OPTION:
				case ANTI:
				case LOCAL:
				case INPATH:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
				case STATUS:
					{
					setState(1993);
					identifier();
					}
					break;
				case T__0:
					{
					setState(1994);
					identifierList();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1999);
			namedExpression();
			setState(2004);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2000);
					match(T__2);
					setState(2001);
					namedExpression();
					}
					} 
				}
				setState(2006);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2007);
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
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExists(this);
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
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
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
		int _startState = 148;
		enterRecursionRule(_localctx, 148, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2010);
				match(NOT);
				setState(2011);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2012);
				match(EXISTS);
				setState(2013);
				match(T__0);
				setState(2014);
				query();
				setState(2015);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2017);
				valueExpression(0);
				setState(2019);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
				case 1:
					{
					setState(2018);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2029);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2023);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2024);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2025);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2026);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2027);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2028);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
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
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_predicate);
		int _la;
		try {
			setState(2082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2034);
					match(NOT);
					}
				}

				setState(2037);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2038);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2039);
				match(AND);
				setState(2040);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2042);
					match(NOT);
					}
				}

				setState(2045);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2046);
				match(T__0);
				setState(2047);
				expression();
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2048);
					match(T__2);
					setState(2049);
					expression();
					}
					}
					setState(2054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2055);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2057);
					match(NOT);
					}
				}

				setState(2060);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2061);
				match(T__0);
				setState(2062);
				query();
				setState(2063);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2065);
					match(NOT);
					}
				}

				setState(2068);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==RLIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2069);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2070);
				match(IS);
				setState(2072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2071);
					match(NOT);
					}
				}

				setState(2074);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2075);
				match(IS);
				setState(2077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2076);
					match(NOT);
					}
				}

				setState(2079);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2080);
				match(FROM);
				setState(2081);
				((PredicateContext)_localctx).right = valueExpression(0);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComparison(this);
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
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
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
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2088);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2085);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2086);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (TILDE - 143)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2087);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2090);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2091);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & ((1L << (ASTERISK - 145)) | (1L << (SLASH - 145)) | (1L << (PERCENT - 145)) | (1L << (DIV - 145)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2092);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2093);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2094);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (CONCAT_PIPE - 143)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2095);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2096);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2097);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2098);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2099);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2100);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2101);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2102);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2103);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2104);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2105);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2106);
						comparisonOperator();
						setState(2107);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
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
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
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
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStar(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SparkSqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SparkSqlBaseParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SparkSqlBaseParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLambda(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public Token trimOption;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFirst(this);
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2115);
				match(CASE);
				setState(2117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2116);
					whenClause();
					}
					}
					setState(2119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2121);
					match(ELSE);
					setState(2122);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2125);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2127);
				match(CASE);
				setState(2128);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2129);
					whenClause();
					}
					}
					setState(2132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2134);
					match(ELSE);
					setState(2135);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2138);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2140);
				match(CAST);
				setState(2141);
				match(T__0);
				setState(2142);
				expression();
				setState(2143);
				match(AS);
				setState(2144);
				dataType();
				setState(2145);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2147);
				match(STRUCT);
				setState(2148);
				match(T__0);
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
					{
					setState(2149);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2150);
						match(T__2);
						setState(2151);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2159);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2160);
				match(FIRST);
				setState(2161);
				match(T__0);
				setState(2162);
				expression();
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2163);
					match(IGNORE);
					setState(2164);
					match(NULLS);
					}
				}

				setState(2167);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2169);
				match(LAST);
				setState(2170);
				match(T__0);
				setState(2171);
				expression();
				setState(2174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2172);
					match(IGNORE);
					setState(2173);
					match(NULLS);
					}
				}

				setState(2176);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2178);
				match(POSITION);
				setState(2179);
				match(T__0);
				setState(2180);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2181);
				match(IN);
				setState(2182);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2183);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2185);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2186);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2187);
				qualifiedName();
				setState(2188);
				match(T__3);
				setState(2189);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2191);
				match(T__0);
				setState(2192);
				namedExpression();
				setState(2195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2193);
					match(T__2);
					setState(2194);
					namedExpression();
					}
					}
					setState(2197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2199);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2201);
				match(T__0);
				setState(2202);
				query();
				setState(2203);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2205);
				qualifiedName();
				setState(2206);
				match(T__0);
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)) | (1L << (BOTH - 64)) | (1L << (LEADING - 64)) | (1L << (TRAILING - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (ESCAPED - 128)) | (1L << (LINES - 128)) | (1L << (SEPARATED - 128)) | (1L << (FUNCTION - 128)) | (1L << (EXTENDED - 128)) | (1L << (REFRESH - 128)) | (1L << (CLEAR - 128)) | (1L << (CACHE - 128)) | (1L << (UNCACHE - 128)) | (1L << (LAZY - 128)) | (1L << (FORMATTED - 128)) | (1L << (GLOBAL - 128)) | (1L << (TEMPORARY - 128)) | (1L << (OPTIONS - 128)) | (1L << (UNSET - 128)) | (1L << (TBLPROPERTIES - 128)) | (1L << (DBPROPERTIES - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (INDEX - 192)) | (1L << (INDEXES - 192)) | (1L << (LOCKS - 192)) | (1L << (OPTION - 192)) | (1L << (ANTI - 192)) | (1L << (LOCAL - 192)) | (1L << (INPATH - 192)) | (1L << (STRING - 192)) | (1L << (BIGINT_LITERAL - 192)) | (1L << (SMALLINT_LITERAL - 192)) | (1L << (TINYINT_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (DOUBLE_LITERAL - 192)) | (1L << (BIGDECIMAL_LITERAL - 192)) | (1L << (IDENTIFIER - 192)))) != 0) || _la==BACKQUOTED_IDENTIFIER || _la==STATUS) {
					{
					setState(2208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
					case 1:
						{
						setState(2207);
						setQuantifier();
						}
						break;
					}
					setState(2210);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2211);
						match(T__2);
						setState(2212);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2217);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2220);
				match(T__1);
				setState(2223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2221);
					match(OVER);
					setState(2222);
					windowSpec();
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
				setState(2225);
				qualifiedName();
				setState(2226);
				match(T__0);
				setState(2227);
				((FunctionCallContext)_localctx).trimOption = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (BOTH - 125)) | (1L << (LEADING - 125)) | (1L << (TRAILING - 125)))) != 0)) ) {
					((FunctionCallContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2228);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2229);
				match(FROM);
				setState(2230);
				((FunctionCallContext)_localctx).expression = expression();
				((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
				setState(2231);
				match(T__1);
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2233);
				match(IDENTIFIER);
				setState(2234);
				match(T__6);
				setState(2235);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2236);
				match(T__0);
				setState(2237);
				match(IDENTIFIER);
				setState(2240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2238);
					match(T__2);
					setState(2239);
					match(IDENTIFIER);
					}
					}
					setState(2242); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2244);
				match(T__1);
				setState(2245);
				match(T__6);
				setState(2246);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2247);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2248);
				match(T__0);
				setState(2249);
				expression();
				setState(2250);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2252);
				match(EXTRACT);
				setState(2253);
				match(T__0);
				setState(2254);
				((ExtractContext)_localctx).field = identifier();
				setState(2255);
				match(FROM);
				setState(2256);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2257);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2261);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2262);
						match(T__7);
						setState(2263);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2264);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2267);
						match(T__3);
						setState(2268);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_constant);
		try {
			int _alt;
			setState(2286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2274);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2275);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2276);
				identifier();
				setState(2277);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2279);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2280);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2282); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2281);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2284); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SparkSqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SparkSqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SparkSqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SparkSqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SparkSqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SparkSqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (EQ - 135)) | (1L << (NSEQ - 135)) | (1L << (NEQ - 135)) | (1L << (NEQJ - 135)) | (1L << (LT - 135)) | (1L << (LTE - 135)) | (1L << (GT - 135)) | (1L << (GTE - 135)))) != 0)) ) {
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

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SparkSqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SparkSqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SparkSqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SparkSqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SparkSqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SparkSqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SparkSqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (PLUS - 143)) | (1L << (MINUS - 143)) | (1L << (ASTERISK - 143)) | (1L << (SLASH - 143)) | (1L << (PERCENT - 143)) | (1L << (DIV - 143)) | (1L << (TILDE - 143)) | (1L << (AMPERSAND - 143)) | (1L << (PIPE - 143)) | (1L << (CONCAT_PIPE - 143)) | (1L << (HAT - 143)))) != 0)) ) {
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

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT))) != 0)) ) {
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
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
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

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2296);
			match(INTERVAL);
			setState(2300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2297);
					intervalField();
					}
					} 
				}
				setState(2302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
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
		public IntervalValueContext value;
		public IdentifierContext unit;
		public IdentifierContext to;
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2304);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2305);
				match(TO);
				setState(2306);
				((IntervalFieldContext)_localctx).to = identifier();
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

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode PLUS() { return getToken(SparkSqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_intervalValue);
		int _la;
		try {
			setState(2314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2309);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2312);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				match(STRING);
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

	public static class ColPositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_colPosition);
		try {
			setState(2319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2316);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2317);
				match(AFTER);
				setState(2318);
				identifier();
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

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SparkSqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_dataType);
		int _la;
		try {
			setState(2355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2321);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2322);
				match(LT);
				setState(2323);
				dataType();
				setState(2324);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2326);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2327);
				match(LT);
				setState(2328);
				dataType();
				setState(2329);
				match(T__2);
				setState(2330);
				dataType();
				setState(2331);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2333);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2340);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2334);
					match(LT);
					setState(2336);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (JOIN - 11)) | (1L << (CROSS - 11)) | (1L << (OUTER - 11)) | (1L << (INNER - 11)) | (1L << (LEFT - 11)) | (1L << (SEMI - 11)) | (1L << (RIGHT - 11)) | (1L << (FULL - 11)) | (1L << (NATURAL - 11)) | (1L << (ON - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (UNION - 75)) | (1L << (EXCEPT - 75)) | (1L << (SETMINUS - 75)) | (1L << (INTERSECT - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (MERGE - 75)) | (1L << (KILL - 75)) | (1L << (READ - 75)) | (1L << (IF - 75)) | (1L << (POSITION - 75)) | (1L << (EXTRACT - 75)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (DIV - 148)) | (1L << (PERCENTLIT - 148)) | (1L << (BUCKET - 148)) | (1L << (OUT - 148)) | (1L << (OF - 148)) | (1L << (SORT - 148)) | (1L << (CLUSTER - 148)) | (1L << (DISTRIBUTE - 148)) | (1L << (OVERWRITE - 148)) | (1L << (TRANSFORM - 148)) | (1L << (REDUCE - 148)) | (1L << (SERDE - 148)) | (1L << (SERDEPROPERTIES - 148)) | (1L << (RECORDREADER - 148)) | (1L << (RECORDWRITER - 148)) | (1L << (DELIMITED - 148)) | (1L << (FIELDS - 148)) | (1L << (TERMINATED - 148)) | (1L << (COLLECTION - 148)) | (1L << (ITEMS - 148)) | (1L << (KEYS - 148)) | (1L << (ESCAPED - 148)) | (1L << (LINES - 148)) | (1L << (SEPARATED - 148)) | (1L << (FUNCTION - 148)) | (1L << (EXTENDED - 148)) | (1L << (REFRESH - 148)) | (1L << (CLEAR - 148)) | (1L << (CACHE - 148)) | (1L << (UNCACHE - 148)) | (1L << (LAZY - 148)) | (1L << (FORMATTED - 148)) | (1L << (GLOBAL - 148)) | (1L << (TEMPORARY - 148)) | (1L << (OPTIONS - 148)) | (1L << (UNSET - 148)) | (1L << (TBLPROPERTIES - 148)) | (1L << (DBPROPERTIES - 148)) | (1L << (BUCKETS - 148)) | (1L << (SKEWED - 148)) | (1L << (STORED - 148)) | (1L << (DIRECTORIES - 148)) | (1L << (LOCATION - 148)) | (1L << (EXCHANGE - 148)) | (1L << (ARCHIVE - 148)) | (1L << (UNARCHIVE - 148)) | (1L << (FILEFORMAT - 148)) | (1L << (TOUCH - 148)) | (1L << (COMPACT - 148)) | (1L << (CONCATENATE - 148)) | (1L << (CHANGE - 148)) | (1L << (CASCADE - 148)) | (1L << (RESTRICT - 148)) | (1L << (CLUSTERED - 148)) | (1L << (SORTED - 148)) | (1L << (PURGE - 148)) | (1L << (INPUTFORMAT - 148)) | (1L << (OUTPUTFORMAT - 148)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATABASE - 212)) | (1L << (DATABASES - 212)) | (1L << (DFS - 212)) | (1L << (TRUNCATE - 212)) | (1L << (ANALYZE - 212)) | (1L << (COMPUTE - 212)) | (1L << (LIST - 212)) | (1L << (STATISTICS - 212)) | (1L << (PARTITIONED - 212)) | (1L << (EXTERNAL - 212)) | (1L << (DEFINED - 212)) | (1L << (REVOKE - 212)) | (1L << (GRANT - 212)) | (1L << (LOCK - 212)) | (1L << (UNLOCK - 212)) | (1L << (MSCK - 212)) | (1L << (REPAIR - 212)) | (1L << (RECOVER - 212)) | (1L << (EXPORT - 212)) | (1L << (IMPORT - 212)) | (1L << (LOAD - 212)) | (1L << (ROLE - 212)) | (1L << (ROLES - 212)) | (1L << (COMPACTIONS - 212)) | (1L << (PRINCIPALS - 212)) | (1L << (TRANSACTIONS - 212)) | (1L << (INDEX - 212)) | (1L << (INDEXES - 212)) | (1L << (LOCKS - 212)) | (1L << (OPTION - 212)) | (1L << (ANTI - 212)) | (1L << (LOCAL - 212)) | (1L << (INPATH - 212)) | (1L << (IDENTIFIER - 212)) | (1L << (BACKQUOTED_IDENTIFIER - 212)) | (1L << (STATUS - 212)))) != 0)) {
						{
						setState(2335);
						complexColTypeList();
						}
					}

					setState(2338);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2339);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2342);
				identifier();
				setState(2353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2343);
					match(T__0);
					setState(2344);
					match(INTEGER_VALUE);
					setState(2349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2345);
						match(T__2);
						setState(2346);
						match(INTEGER_VALUE);
						}
						}
						setState(2351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2352);
					match(T__1);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2357);
			colType();
			setState(2362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2358);
					match(T__2);
					setState(2359);
					colType();
					}
					} 
				}
				setState(2364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2365);
			identifier();
			setState(2366);
			dataType();
			setState(2369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				setState(2367);
				match(COMMENT);
				setState(2368);
				match(STRING);
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

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2371);
			complexColType();
			setState(2376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2372);
				match(T__2);
				setState(2373);
				complexColType();
				}
				}
				setState(2378);
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

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2379);
			identifier();
			setState(2380);
			match(T__9);
			setState(2381);
			dataType();
			setState(2384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2382);
				match(COMMENT);
				setState(2383);
				match(STRING);
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

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2386);
			match(WHEN);
			setState(2387);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2388);
			match(THEN);
			setState(2389);
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

	public static class WindowsContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindows(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowsContext windows() throws RecognitionException {
		WindowsContext _localctx = new WindowsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2391);
			match(WINDOW);
			setState(2392);
			namedWindow();
			setState(2397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2393);
					match(T__2);
					setState(2394);
					namedWindow();
					}
					} 
				}
				setState(2399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
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

	public static class NamedWindowContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2400);
			identifier();
			setState(2401);
			match(AS);
			setState(2402);
			windowSpec();
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

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public IdentifierContext name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_windowSpec);
		int _la;
		try {
			setState(2446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case JOIN:
			case CROSS:
			case OUTER:
			case INNER:
			case LEFT:
			case SEMI:
			case RIGHT:
			case FULL:
			case NATURAL:
			case ON:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case UNION:
			case EXCEPT:
			case SETMINUS:
			case INTERSECT:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case MERGE:
			case KILL:
			case READ:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case ANTI:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case STATUS:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2404);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(T__0);
				setState(2440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2406);
					match(CLUSTER);
					setState(2407);
					match(BY);
					setState(2408);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2409);
						match(T__2);
						setState(2410);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2415);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
				case DISTRIBUTE:
					{
					setState(2426);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2416);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2417);
						match(BY);
						setState(2418);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2419);
							match(T__2);
							setState(2420);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2425);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2428);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2429);
						match(BY);
						setState(2430);
						sortItem();
						setState(2435);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2431);
							match(T__2);
							setState(2432);
							sortItem();
							}
							}
							setState(2437);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2443);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2442);
					windowFrame();
					}
				}

				setState(2445);
				match(T__1);
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

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_windowFrame);
		try {
			setState(2464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2448);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2449);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2450);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2451);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2452);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2453);
				match(BETWEEN);
				setState(2454);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2455);
				match(AND);
				setState(2456);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2458);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2459);
				match(BETWEEN);
				setState(2460);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2461);
				match(AND);
				setState(2462);
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
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_frameBound);
		int _la;
		try {
			setState(2473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2466);
				match(UNBOUNDED);
				setState(2467);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2468);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2469);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2470);
				expression();
				setState(2471);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
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
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
			identifier();
			setState(2480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2476);
					match(T__3);
					setState(2477);
					identifier();
					}
					} 
				}
				setState(2482);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,326,_ctx);
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
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkSqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkSqlBaseParser.NATURAL, 0); }
		public TerminalNode JOIN() { return getToken(SparkSqlBaseParser.JOIN, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlBaseParser.CROSS, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlBaseParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkSqlBaseParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_identifier);
		try {
			setState(2498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case MERGE:
			case KILL:
			case READ:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case STATUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(2483);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2484);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2485);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2486);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2487);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2488);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2489);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2490);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2491);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2492);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2493);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2494);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2495);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2496);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2497);
				match(SETMINUS);
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

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SparkSqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_strictIdentifier);
		try {
			setState(2503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2500);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2501);
				quotedIdentifier();
				}
				break;
			case SELECT:
			case FROM:
			case ADD:
			case AS:
			case ALL:
			case ANY:
			case DISTINCT:
			case WHERE:
			case GROUP:
			case BY:
			case GROUPING:
			case SETS:
			case CUBE:
			case ROLLUP:
			case ORDER:
			case HAVING:
			case LIMIT:
			case AT:
			case OR:
			case AND:
			case IN:
			case NOT:
			case NO:
			case EXISTS:
			case BETWEEN:
			case LIKE:
			case RLIKE:
			case IS:
			case NULL:
			case TRUE:
			case FALSE:
			case NULLS:
			case ASC:
			case DESC:
			case FOR:
			case INTERVAL:
			case CASE:
			case WHEN:
			case THEN:
			case ELSE:
			case END:
			case OUTER:
			case PIVOT:
			case LATERAL:
			case WINDOW:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case UNBOUNDED:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case FIRST:
			case AFTER:
			case LAST:
			case ROW:
			case WITH:
			case VALUES:
			case CREATE:
			case TABLE:
			case DIRECTORY:
			case VIEW:
			case REPLACE:
			case INSERT:
			case DELETE:
			case INTO:
			case DESCRIBE:
			case EXPLAIN:
			case FORMAT:
			case LOGICAL:
			case CODEGEN:
			case COST:
			case CAST:
			case SHOW:
			case TABLES:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case DROP:
			case TO:
			case TABLESAMPLE:
			case STRATIFY:
			case ALTER:
			case RENAME:
			case ARRAY:
			case MAP:
			case STRUCT:
			case COMMENT:
			case SET:
			case RESET:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case MACRO:
			case IGNORE:
			case BOTH:
			case LEADING:
			case TRAILING:
			case MERGE:
			case KILL:
			case READ:
			case IF:
			case POSITION:
			case EXTRACT:
			case DIV:
			case PERCENTLIT:
			case BUCKET:
			case OUT:
			case OF:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case OVERWRITE:
			case TRANSFORM:
			case REDUCE:
			case SERDE:
			case SERDEPROPERTIES:
			case RECORDREADER:
			case RECORDWRITER:
			case DELIMITED:
			case FIELDS:
			case TERMINATED:
			case COLLECTION:
			case ITEMS:
			case KEYS:
			case ESCAPED:
			case LINES:
			case SEPARATED:
			case FUNCTION:
			case EXTENDED:
			case REFRESH:
			case CLEAR:
			case CACHE:
			case UNCACHE:
			case LAZY:
			case FORMATTED:
			case GLOBAL:
			case TEMPORARY:
			case OPTIONS:
			case UNSET:
			case TBLPROPERTIES:
			case DBPROPERTIES:
			case BUCKETS:
			case SKEWED:
			case STORED:
			case DIRECTORIES:
			case LOCATION:
			case EXCHANGE:
			case ARCHIVE:
			case UNARCHIVE:
			case FILEFORMAT:
			case TOUCH:
			case COMPACT:
			case CONCATENATE:
			case CHANGE:
			case CASCADE:
			case RESTRICT:
			case CLUSTERED:
			case SORTED:
			case PURGE:
			case INPUTFORMAT:
			case OUTPUTFORMAT:
			case DATABASE:
			case DATABASES:
			case DFS:
			case TRUNCATE:
			case ANALYZE:
			case COMPUTE:
			case LIST:
			case STATISTICS:
			case PARTITIONED:
			case EXTERNAL:
			case DEFINED:
			case REVOKE:
			case GRANT:
			case LOCK:
			case UNLOCK:
			case MSCK:
			case REPAIR:
			case RECOVER:
			case EXPORT:
			case IMPORT:
			case LOAD:
			case ROLE:
			case ROLES:
			case COMPACTIONS:
			case PRINCIPALS:
			case TRANSACTIONS:
			case INDEX:
			case INDEXES:
			case LOCKS:
			case OPTION:
			case LOCAL:
			case INPATH:
			case STATUS:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2502);
				nonReserved();
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

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SparkSqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2505);
			match(BACKQUOTED_IDENTIFIER);
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
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SparkSqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SparkSqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SparkSqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SparkSqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SparkSqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_number);
		int _la;
		try {
			setState(2535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2507);
					match(MINUS);
					}
				}

				setState(2510);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2511);
					match(MINUS);
					}
				}

				setState(2514);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2515);
					match(MINUS);
					}
				}

				setState(2518);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2519);
					match(MINUS);
					}
				}

				setState(2522);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2523);
					match(MINUS);
					}
				}

				setState(2526);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2527);
					match(MINUS);
					}
				}

				setState(2530);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2531);
					match(MINUS);
					}
				}

				setState(2534);
				match(BIGDECIMAL_LITERAL);
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
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlBaseParser.TERMINATED, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlBaseParser.SEPARATED, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode NO() { return getToken(SparkSqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlBaseParser.GRANT, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlBaseParser.OPTION, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public TerminalNode AT() { return getToken(SparkSqlBaseParser.AT, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(SparkSqlBaseParser.ANY, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public TerminalNode GROUP() { return getToken(SparkSqlBaseParser.GROUP, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkSqlBaseParser.CAST, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlBaseParser.STRATIFY, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode STATUS() { return getToken(SparkSqlBaseParser.STATUS, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (OUTER - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (MERGE - 75)) | (1L << (KILL - 75)) | (1L << (READ - 75)) | (1L << (IF - 75)) | (1L << (POSITION - 75)) | (1L << (EXTRACT - 75)))) != 0) || ((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (DIV - 148)) | (1L << (PERCENTLIT - 148)) | (1L << (BUCKET - 148)) | (1L << (OUT - 148)) | (1L << (OF - 148)) | (1L << (SORT - 148)) | (1L << (CLUSTER - 148)) | (1L << (DISTRIBUTE - 148)) | (1L << (OVERWRITE - 148)) | (1L << (TRANSFORM - 148)) | (1L << (REDUCE - 148)) | (1L << (SERDE - 148)) | (1L << (SERDEPROPERTIES - 148)) | (1L << (RECORDREADER - 148)) | (1L << (RECORDWRITER - 148)) | (1L << (DELIMITED - 148)) | (1L << (FIELDS - 148)) | (1L << (TERMINATED - 148)) | (1L << (COLLECTION - 148)) | (1L << (ITEMS - 148)) | (1L << (KEYS - 148)) | (1L << (ESCAPED - 148)) | (1L << (LINES - 148)) | (1L << (SEPARATED - 148)) | (1L << (FUNCTION - 148)) | (1L << (EXTENDED - 148)) | (1L << (REFRESH - 148)) | (1L << (CLEAR - 148)) | (1L << (CACHE - 148)) | (1L << (UNCACHE - 148)) | (1L << (LAZY - 148)) | (1L << (FORMATTED - 148)) | (1L << (GLOBAL - 148)) | (1L << (TEMPORARY - 148)) | (1L << (OPTIONS - 148)) | (1L << (UNSET - 148)) | (1L << (TBLPROPERTIES - 148)) | (1L << (DBPROPERTIES - 148)) | (1L << (BUCKETS - 148)) | (1L << (SKEWED - 148)) | (1L << (STORED - 148)) | (1L << (DIRECTORIES - 148)) | (1L << (LOCATION - 148)) | (1L << (EXCHANGE - 148)) | (1L << (ARCHIVE - 148)) | (1L << (UNARCHIVE - 148)) | (1L << (FILEFORMAT - 148)) | (1L << (TOUCH - 148)) | (1L << (COMPACT - 148)) | (1L << (CONCATENATE - 148)) | (1L << (CHANGE - 148)) | (1L << (CASCADE - 148)) | (1L << (RESTRICT - 148)) | (1L << (CLUSTERED - 148)) | (1L << (SORTED - 148)) | (1L << (PURGE - 148)) | (1L << (INPUTFORMAT - 148)) | (1L << (OUTPUTFORMAT - 148)))) != 0) || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATABASE - 212)) | (1L << (DATABASES - 212)) | (1L << (DFS - 212)) | (1L << (TRUNCATE - 212)) | (1L << (ANALYZE - 212)) | (1L << (COMPUTE - 212)) | (1L << (LIST - 212)) | (1L << (STATISTICS - 212)) | (1L << (PARTITIONED - 212)) | (1L << (EXTERNAL - 212)) | (1L << (DEFINED - 212)) | (1L << (REVOKE - 212)) | (1L << (GRANT - 212)) | (1L << (LOCK - 212)) | (1L << (UNLOCK - 212)) | (1L << (MSCK - 212)) | (1L << (REPAIR - 212)) | (1L << (RECOVER - 212)) | (1L << (EXPORT - 212)) | (1L << (IMPORT - 212)) | (1L << (LOAD - 212)) | (1L << (ROLE - 212)) | (1L << (ROLES - 212)) | (1L << (COMPACTIONS - 212)) | (1L << (PRINCIPALS - 212)) | (1L << (TRANSACTIONS - 212)) | (1L << (INDEX - 212)) | (1L << (INDEXES - 212)) | (1L << (LOCKS - 212)) | (1L << (OPTION - 212)) | (1L << (LOCAL - 212)) | (1L << (INPATH - 212)) | (1L << (STATUS - 212)))) != 0)) ) {
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
		case 38:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 74:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 76:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 77:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enbled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 5);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0109\u09ee\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ed\n\b\3\b\3\b\3\b\5\b\u00f2\n\b\3\b\5\b"+
		"\u00f5\n\b\3\b\3\b\3\b\5\b\u00fa\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0107\n\b\3\b\3\b\5\b\u010b\n\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0112\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0120\n"+
		"\b\f\b\16\b\u0123\13\b\3\b\3\b\5\b\u0127\n\b\3\b\5\b\u012a\n\b\3\b\5\b"+
		"\u012d\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0134\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0145\n\b\f\b\16\b\u0148\13\b\3"+
		"\b\3\b\5\b\u014c\n\b\3\b\5\b\u014f\n\b\3\b\5\b\u0152\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0159\n\b\3\b\3\b\3\b\3\b\5\b\u015f\n\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0165\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u016d\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u018d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0195\n\b\3\b\3\b\5\b\u0199\n\b\3\b\3\b\3\b\5\b\u019e\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01a4\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01ac\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u01b2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01bf"+
		"\n\b\3\b\6\b\u01c2\n\b\r\b\16\b\u01c3\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u01cd\n\b\3\b\6\b\u01d0\n\b\r\b\16\b\u01d1\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01e2\n\b\3\b\3\b\3\b\7\b\u01e7\n\b"+
		"\f\b\16\b\u01ea\13\b\3\b\5\b\u01ed\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f5"+
		"\n\b\3\b\3\b\3\b\7\b\u01fa\n\b\f\b\16\b\u01fd\13\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0203\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0212"+
		"\n\b\3\b\3\b\5\b\u0216\n\b\3\b\3\b\3\b\3\b\5\b\u021c\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0222\n\b\3\b\5\b\u0225\n\b\3\b\5\b\u0228\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u022e\n\b\3\b\3\b\5\b\u0232\n\b\3\b\3\b\5\b\u0236\n\b\3\b\3\b\3\b\5"+
		"\b\u023b\n\b\3\b\3\b\5\b\u023f\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0247\n"+
		"\b\3\b\5\b\u024a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0253\n\b\3\b\3\b"+
		"\3\b\5\b\u0258\n\b\3\b\3\b\3\b\3\b\5\b\u025e\n\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0265\n\b\3\b\5\b\u0268\n\b\3\b\3\b\3\b\3\b\5\b\u026e\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0277\n\b\f\b\16\b\u027a\13\b\5\b\u027c\n\b\3\b"+
		"\3\b\5\b\u0280\n\b\3\b\3\b\3\b\5\b\u0285\n\b\3\b\3\b\3\b\5\b\u028a\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u0291\n\b\3\b\5\b\u0294\n\b\3\b\5\b\u0297\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u029e\n\b\3\b\3\b\3\b\5\b\u02a3\n\b\3\b\3\b\3"+
		"\b\5\b\u02a8\n\b\3\b\5\b\u02ab\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b4"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02bc\n\b\3\b\3\b\3\b\3\b\5\b\u02c2\n"+
		"\b\3\b\3\b\5\b\u02c6\n\b\3\b\3\b\5\b\u02ca\n\b\3\b\3\b\5\b\u02ce\n\b\5"+
		"\b\u02d0\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02d9\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u02df\n\b\3\b\3\b\3\b\5\b\u02e4\n\b\3\b\5\b\u02e7\n\b\3\b\3\b\5\b"+
		"\u02eb\n\b\3\b\5\b\u02ee\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u02f6\n\b\f\b"+
		"\16\b\u02f9\13\b\5\b\u02fb\n\b\3\b\3\b\5\b\u02ff\n\b\3\b\3\b\3\b\5\b\u0304"+
		"\n\b\3\b\5\b\u0307\n\b\3\b\3\b\3\b\3\b\5\b\u030d\n\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0315\n\b\3\b\3\b\3\b\5\b\u031a\n\b\3\b\3\b\3\b\3\b\5\b\u0320"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u0326\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u032f"+
		"\n\b\f\b\16\b\u0332\13\b\3\b\3\b\3\b\7\b\u0337\n\b\f\b\16\b\u033a\13\b"+
		"\3\b\3\b\7\b\u033e\n\b\f\b\16\b\u0341\13\b\3\b\3\b\3\b\7\b\u0346\n\b\f"+
		"\b\16\b\u0349\13\b\3\b\3\b\3\b\3\b\5\b\u034f\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0359\n\b\3\b\3\b\3\b\3\b\5\b\u035f\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u036a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0373"+
		"\n\b\3\b\3\b\3\b\3\b\5\b\u0379\n\b\3\b\3\b\3\b\5\b\u037e\n\b\3\b\3\b\7"+
		"\b\u0382\n\b\f\b\16\b\u0385\13\b\5\b\u0387\n\b\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u0390\n\n\f\n\16\n\u0393\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u03a1\n\f\3\f\3\f\5\f\u03a5\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u03ac\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0420\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0428\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0430"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0439\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0445\n\f\3\r\3\r\5\r\u0449\n\r\3\r\5\r\u044c\n\r"+
		"\3\r\3\r\3\r\3\r\5\r\u0452\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u045c\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0468\n\17\3\17\3\17\3\17\5\17\u046d\n\17\3\20\3\20\3\20\3\21\5\21\u0473"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u047f\n\22"+
		"\5\22\u0481\n\22\3\22\3\22\3\22\5\22\u0486\n\22\3\22\3\22\5\22\u048a\n"+
		"\22\3\22\3\22\3\22\5\22\u048f\n\22\3\22\3\22\3\22\5\22\u0494\n\22\3\22"+
		"\5\22\u0497\n\22\3\22\3\22\3\22\5\22\u049c\n\22\3\22\3\22\5\22\u04a0\n"+
		"\22\3\22\3\22\3\22\5\22\u04a5\n\22\5\22\u04a7\n\22\3\23\3\23\5\23\u04ab"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\7\24\u04b2\n\24\f\24\16\24\u04b5\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u04bc\n\25\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u04c3\n\26\3\27\3\27\3\27\7\27\u04c8\n\27\f\27\16\27\u04cb\13\27\3\30"+
		"\3\30\3\30\3\30\7\30\u04d1\n\30\f\30\16\30\u04d4\13\30\3\31\3\31\5\31"+
		"\u04d8\n\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u04e5\n\33\f\33\16\33\u04e8\13\33\3\33\3\33\3\34\3\34\5\34\u04ee\n\34"+
		"\3\34\5\34\u04f1\n\34\3\35\3\35\3\35\7\35\u04f6\n\35\f\35\16\35\u04f9"+
		"\13\35\3\35\5\35\u04fc\n\35\3\36\3\36\3\36\3\36\5\36\u0502\n\36\3\37\3"+
		"\37\3\37\3\37\7\37\u0508\n\37\f\37\16\37\u050b\13\37\3\37\3\37\3 \3 \3"+
		" \3 \7 \u0513\n \f \16 \u0516\13 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0520\n!"+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u0527\n\"\3#\3#\3#\3#\5#\u052d\n#\3$\3$\3$\3"+
		"%\5%\u0533\n%\3%\3%\3%\3%\3%\6%\u053a\n%\r%\16%\u053b\5%\u053e\n%\3&\3"+
		"&\3&\3&\3&\7&\u0545\n&\f&\16&\u0548\13&\5&\u054a\n&\3&\3&\3&\3&\3&\7&"+
		"\u0551\n&\f&\16&\u0554\13&\5&\u0556\n&\3&\3&\3&\3&\3&\7&\u055d\n&\f&\16"+
		"&\u0560\13&\5&\u0562\n&\3&\3&\3&\3&\3&\7&\u0569\n&\f&\16&\u056c\13&\5"+
		"&\u056e\n&\3&\5&\u0571\n&\3&\3&\3&\5&\u0576\n&\5&\u0578\n&\3\'\5\'\u057b"+
		"\n\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\5(\u0587\n(\3(\3(\3(\3(\3(\5(\u058e"+
		"\n(\3(\3(\3(\3(\3(\5(\u0595\n(\3(\7(\u0598\n(\f(\16(\u059b\13(\3)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u05a5\n)\3*\3*\5*\u05a9\n*\3*\3*\5*\u05ad\n*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u05b9\n+\3+\5+\u05bc\n+\3+\3+\5+\u05c0\n"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u05ca\n+\3+\3+\5+\u05ce\n+\5+\u05d0\n+\3"+
		"+\5+\u05d3\n+\3+\3+\5+\u05d7\n+\3+\5+\u05da\n+\3+\3+\5+\u05de\n+\3+\3"+
		"+\7+\u05e2\n+\f+\16+\u05e5\13+\3+\5+\u05e8\n+\3+\3+\5+\u05ec\n+\3+\3+"+
		"\3+\5+\u05f1\n+\3+\5+\u05f4\n+\5+\u05f6\n+\3+\7+\u05f9\n+\f+\16+\u05fc"+
		"\13+\3+\3+\5+\u0600\n+\3+\5+\u0603\n+\3+\3+\5+\u0607\n+\3+\5+\u060a\n"+
		"+\5+\u060c\n+\3,\3,\3,\5,\u0611\n,\3,\7,\u0614\n,\f,\16,\u0617\13,\3,"+
		"\3,\3-\3-\3-\3-\3-\3-\7-\u0621\n-\f-\16-\u0624\13-\3-\3-\5-\u0628\n-\3"+
		".\3.\3.\3.\7.\u062e\n.\f.\16.\u0631\13.\3.\7.\u0634\n.\f.\16.\u0637\13"+
		".\3.\5.\u063a\n.\3/\3/\3/\3/\3/\7/\u0641\n/\f/\16/\u0644\13/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\7/\u0650\n/\f/\16/\u0653\13/\3/\3/\5/\u0657\n/\3"+
		"/\3/\3/\3/\3/\3/\3/\3/\7/\u0661\n/\f/\16/\u0664\13/\3/\3/\5/\u0668\n/"+
		"\3\60\3\60\3\60\3\60\7\60\u066e\n\60\f\60\16\60\u0671\13\60\5\60\u0673"+
		"\n\60\3\60\3\60\5\60\u0677\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0683\n\61\f\61\16\61\u0686\13\61\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\7\62\u0690\n\62\f\62\16\62\u0693\13\62\3\62\3\62"+
		"\5\62\u0697\n\62\3\63\3\63\5\63\u069b\n\63\3\63\5\63\u069e\n\63\3\64\3"+
		"\64\3\64\5\64\u06a3\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u06aa\n\64\f\64"+
		"\16\64\u06ad\13\64\5\64\u06af\n\64\3\64\3\64\3\64\5\64\u06b4\n\64\3\64"+
		"\3\64\3\64\7\64\u06b9\n\64\f\64\16\64\u06bc\13\64\5\64\u06be\n\64\3\65"+
		"\3\65\3\66\3\66\7\66\u06c4\n\66\f\66\16\66\u06c7\13\66\3\67\3\67\3\67"+
		"\3\67\5\67\u06cd\n\67\3\67\3\67\3\67\3\67\3\67\5\67\u06d4\n\67\38\58\u06d7"+
		"\n8\38\38\38\58\u06dc\n8\38\38\38\38\58\u06e2\n8\38\38\58\u06e6\n8\38"+
		"\58\u06e9\n8\38\58\u06ec\n8\39\39\39\39\39\39\39\79\u06f5\n9\f9\169\u06f8"+
		"\139\39\39\59\u06fc\n9\3:\3:\3:\5:\u0701\n:\3:\3:\3;\5;\u0706\n;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0718\n;\5;\u071a\n;\3"+
		";\5;\u071d\n;\3<\3<\3<\3<\3=\3=\3=\7=\u0726\n=\f=\16=\u0729\13=\3>\3>"+
		"\3>\3>\7>\u072f\n>\f>\16>\u0732\13>\3>\3>\3?\3?\5?\u0738\n?\3@\3@\3@\3"+
		"@\7@\u073e\n@\f@\16@\u0741\13@\3@\3@\3A\3A\3A\5A\u0748\nA\3B\3B\5B\u074c"+
		"\nB\3B\3B\3B\3B\3B\3B\5B\u0754\nB\3B\3B\3B\3B\3B\3B\5B\u075c\nB\3B\3B"+
		"\3B\3B\5B\u0762\nB\3C\3C\3C\3C\7C\u0768\nC\fC\16C\u076b\13C\3C\3C\3D\3"+
		"D\3D\3D\3D\7D\u0774\nD\fD\16D\u0777\13D\5D\u0779\nD\3D\3D\3D\3E\5E\u077f"+
		"\nE\3E\3E\5E\u0783\nE\5E\u0785\nE\3F\3F\3F\3F\3F\3F\3F\5F\u078e\nF\3F"+
		"\3F\3F\3F\3F\3F\3F\3F\3F\3F\5F\u079a\nF\5F\u079c\nF\3F\3F\3F\3F\3F\5F"+
		"\u07a3\nF\3F\3F\3F\3F\3F\5F\u07aa\nF\3F\3F\3F\3F\5F\u07b0\nF\3F\3F\3F"+
		"\3F\5F\u07b6\nF\5F\u07b8\nF\3G\3G\3G\5G\u07bd\nG\3G\3G\3H\3H\3H\5H\u07c4"+
		"\nH\3H\3H\3I\3I\5I\u07ca\nI\3I\3I\5I\u07ce\nI\5I\u07d0\nI\3J\3J\3J\7J"+
		"\u07d5\nJ\fJ\16J\u07d8\13J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\5L\u07e6"+
		"\nL\5L\u07e8\nL\3L\3L\3L\3L\3L\3L\7L\u07f0\nL\fL\16L\u07f3\13L\3M\5M\u07f6"+
		"\nM\3M\3M\3M\3M\3M\3M\5M\u07fe\nM\3M\3M\3M\3M\3M\7M\u0805\nM\fM\16M\u0808"+
		"\13M\3M\3M\3M\5M\u080d\nM\3M\3M\3M\3M\3M\3M\5M\u0815\nM\3M\3M\3M\3M\5"+
		"M\u081b\nM\3M\3M\3M\5M\u0820\nM\3M\3M\3M\5M\u0825\nM\3N\3N\3N\3N\5N\u082b"+
		"\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u0840"+
		"\nN\fN\16N\u0843\13N\3O\3O\3O\6O\u0848\nO\rO\16O\u0849\3O\3O\5O\u084e"+
		"\nO\3O\3O\3O\3O\3O\6O\u0855\nO\rO\16O\u0856\3O\3O\5O\u085b\nO\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\7O\u086b\nO\fO\16O\u086e\13O\5O\u0870"+
		"\nO\3O\3O\3O\3O\3O\3O\5O\u0878\nO\3O\3O\3O\3O\3O\3O\3O\5O\u0881\nO\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\6O\u0896\nO\rO"+
		"\16O\u0897\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u08a3\nO\3O\3O\3O\7O\u08a8\n"+
		"O\fO\16O\u08ab\13O\5O\u08ad\nO\3O\3O\3O\5O\u08b2\nO\3O\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\6O\u08c3\nO\rO\16O\u08c4\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u08d6\nO\3O\3O\3O\3O\3O\3O\3O\3O\7O\u08e0"+
		"\nO\fO\16O\u08e3\13O\3P\3P\3P\3P\3P\3P\3P\3P\6P\u08ed\nP\rP\16P\u08ee"+
		"\5P\u08f1\nP\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\7U\u08fd\nU\fU\16U\u0900\13"+
		"U\3V\3V\3V\3V\5V\u0906\nV\3W\5W\u0909\nW\3W\3W\5W\u090d\nW\3X\3X\3X\5"+
		"X\u0912\nX\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u0923\nY\3"+
		"Y\3Y\5Y\u0927\nY\3Y\3Y\3Y\3Y\3Y\7Y\u092e\nY\fY\16Y\u0931\13Y\3Y\5Y\u0934"+
		"\nY\5Y\u0936\nY\3Z\3Z\3Z\7Z\u093b\nZ\fZ\16Z\u093e\13Z\3[\3[\3[\3[\5[\u0944"+
		"\n[\3\\\3\\\3\\\7\\\u0949\n\\\f\\\16\\\u094c\13\\\3]\3]\3]\3]\3]\5]\u0953"+
		"\n]\3^\3^\3^\3^\3^\3_\3_\3_\3_\7_\u095e\n_\f_\16_\u0961\13_\3`\3`\3`\3"+
		"`\3a\3a\3a\3a\3a\3a\3a\7a\u096e\na\fa\16a\u0971\13a\3a\3a\3a\3a\3a\7a"+
		"\u0978\na\fa\16a\u097b\13a\5a\u097d\na\3a\3a\3a\3a\3a\7a\u0984\na\fa\16"+
		"a\u0987\13a\5a\u0989\na\5a\u098b\na\3a\5a\u098e\na\3a\5a\u0991\na\3b\3"+
		"b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u09a3\nb\3c\3c\3c\3c\3"+
		"c\3c\3c\5c\u09ac\nc\3d\3d\3d\7d\u09b1\nd\fd\16d\u09b4\13d\3e\3e\3e\3e"+
		"\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\5e\u09c5\ne\3f\3f\3f\5f\u09ca\nf\3g"+
		"\3g\3h\5h\u09cf\nh\3h\3h\5h\u09d3\nh\3h\3h\5h\u09d7\nh\3h\3h\5h\u09db"+
		"\nh\3h\3h\5h\u09df\nh\3h\3h\5h\u09e3\nh\3h\3h\5h\u09e7\nh\3h\5h\u09ea"+
		"\nh\3i\3i\3i\b\u02f7\u0330\u0338\u033f\u0347\u0383\6N\u0096\u009a\u009c"+
		"j\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\2\36\3\2"+
		"\u00cf\u00d0\4\2RRTT\5\2\\^\u00b5\u00b5\u00bb\u00bb\4\2\16\16!!\4\2.."+
		"YY\4\2\u00b5\u00b5\u00bb\u00bb\4\2\17\17\u00dc\u00dc\4\2XX\u00a3\u00a3"+
		"\3\2hk\3\2hj\3\2-.\4\2KKMM\4\2\21\21\23\23\3\2\u00fd\u00fe\3\2&\'\4\2"+
		"\u0091\u0092\u0097\u0097\3\2\u0093\u0096\4\2\u0091\u0092\u009a\u009a\3"+
		"\2\177\u0081\3\2\u0089\u0090\3\2\u0091\u009b\3\2\37\"\3\2*+\3\2\u0091"+
		"\u0092\4\2DD\u00a2\u00a2\4\2\33\33\u00a0\u00a0\3\2HI\r\2\r\6588@gltv\u0084"+
		"\u0086\u0088\u0096\u0096\u009c\u00a5\u00a7\u00f3\u00f5\u00f6\u0108\u0108"+
		"\2\u0b98\2\u00d2\3\2\2\2\4\u00d5\3\2\2\2\6\u00d8\3\2\2\2\b\u00db\3\2\2"+
		"\2\n\u00de\3\2\2\2\f\u00e1\3\2\2\2\16\u0386\3\2\2\2\20\u0388\3\2\2\2\22"+
		"\u038a\3\2\2\2\24\u0396\3\2\2\2\26\u0444\3\2\2\2\30\u0446\3\2\2\2\32\u0455"+
		"\3\2\2\2\34\u0461\3\2\2\2\36\u046e\3\2\2\2 \u0472\3\2\2\2\"\u04a6\3\2"+
		"\2\2$\u04a8\3\2\2\2&\u04ac\3\2\2\2(\u04b8\3\2\2\2*\u04c2\3\2\2\2,\u04c4"+
		"\3\2\2\2.\u04cc\3\2\2\2\60\u04d5\3\2\2\2\62\u04dd\3\2\2\2\64\u04e0\3\2"+
		"\2\2\66\u04eb\3\2\2\28\u04fb\3\2\2\2:\u0501\3\2\2\2<\u0503\3\2\2\2>\u050e"+
		"\3\2\2\2@\u051f\3\2\2\2B\u0526\3\2\2\2D\u0528\3\2\2\2F\u052e\3\2\2\2H"+
		"\u053d\3\2\2\2J\u0549\3\2\2\2L\u057a\3\2\2\2N\u057f\3\2\2\2P\u05a4\3\2"+
		"\2\2R\u05a6\3\2\2\2T\u060b\3\2\2\2V\u060d\3\2\2\2X\u0627\3\2\2\2Z\u0629"+
		"\3\2\2\2\\\u0667\3\2\2\2^\u0676\3\2\2\2`\u0678\3\2\2\2b\u0696\3\2\2\2"+
		"d\u0698\3\2\2\2f\u069f\3\2\2\2h\u06bf\3\2\2\2j\u06c1\3\2\2\2l\u06d3\3"+
		"\2\2\2n\u06eb\3\2\2\2p\u06fb\3\2\2\2r\u06fd\3\2\2\2t\u071c\3\2\2\2v\u071e"+
		"\3\2\2\2x\u0722\3\2\2\2z\u072a\3\2\2\2|\u0735\3\2\2\2~\u0739\3\2\2\2\u0080"+
		"\u0744\3\2\2\2\u0082\u0761\3\2\2\2\u0084\u0763\3\2\2\2\u0086\u076e\3\2"+
		"\2\2\u0088\u0784\3\2\2\2\u008a\u07b7\3\2\2\2\u008c\u07bc\3\2\2\2\u008e"+
		"\u07c3\3\2\2\2\u0090\u07c7\3\2\2\2\u0092\u07d1\3\2\2\2\u0094\u07d9\3\2"+
		"\2\2\u0096\u07e7\3\2\2\2\u0098\u0824\3\2\2\2\u009a\u082a\3\2\2\2\u009c"+
		"\u08d5\3\2\2\2\u009e\u08f0\3\2\2\2\u00a0\u08f2\3\2\2\2\u00a2\u08f4\3\2"+
		"\2\2\u00a4\u08f6\3\2\2\2\u00a6\u08f8\3\2\2\2\u00a8\u08fa\3\2\2\2\u00aa"+
		"\u0901\3\2\2\2\u00ac\u090c\3\2\2\2\u00ae\u0911\3\2\2\2\u00b0\u0935\3\2"+
		"\2\2\u00b2\u0937\3\2\2\2\u00b4\u093f\3\2\2\2\u00b6\u0945\3\2\2\2\u00b8"+
		"\u094d\3\2\2\2\u00ba\u0954\3\2\2\2\u00bc\u0959\3\2\2\2\u00be\u0962\3\2"+
		"\2\2\u00c0\u0990\3\2\2\2\u00c2\u09a2\3\2\2\2\u00c4\u09ab\3\2\2\2\u00c6"+
		"\u09ad\3\2\2\2\u00c8\u09c4\3\2\2\2\u00ca\u09c9\3\2\2\2\u00cc\u09cb\3\2"+
		"\2\2\u00ce\u09e9\3\2\2\2\u00d0\u09eb\3\2\2\2\u00d2\u00d3\5\16\b\2\u00d3"+
		"\u00d4\7\2\2\3\u00d4\3\3\2\2\2\u00d5\u00d6\5\u0090I\2\u00d6\u00d7\7\2"+
		"\2\3\u00d7\5\3\2\2\2\u00d8\u00d9\5\u008cG\2\u00d9\u00da\7\2\2\3\u00da"+
		"\7\3\2\2\2\u00db\u00dc\5\u008eH\2\u00dc\u00dd\7\2\2\3\u00dd\t\3\2\2\2"+
		"\u00de\u00df\5\u00b0Y\2\u00df\u00e0\7\2\2\3\u00e0\13\3\2\2\2\u00e1\u00e2"+
		"\5\u00b2Z\2\u00e2\u00e3\7\2\2\3\u00e3\r\3\2\2\2\u00e4\u0387\5 \21\2\u00e5"+
		"\u00e6\7d\2\2\u00e6\u0387\5\u00c8e\2\u00e7\u00e8\7Q\2\2\u00e8\u00ec\7"+
		"\u00d6\2\2\u00e9\u00ea\7\u0086\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ed\7$"+
		"\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f1\5\u00c8e\2\u00ef\u00f0\7t\2\2\u00f0\u00f2\7\u00f9\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5\36\20\2"+
		"\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f7"+
		"\7O\2\2\u00f7\u00f8\7\u00c1\2\2\u00f8\u00fa\5\64\33\2\u00f9\u00f6\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0387\3\2\2\2\u00fb\u00fc\7o\2\2\u00fc"+
		"\u00fd\7\u00d6\2\2\u00fd\u00fe\5\u00c8e\2\u00fe\u00ff\7v\2\2\u00ff\u0100"+
		"\7\u00c1\2\2\u0100\u0101\5\64\33\2\u0101\u0387\3\2\2\2\u0102\u0103\7g"+
		"\2\2\u0103\u0106\7\u00d6\2\2\u0104\u0105\7\u0086\2\2\u0105\u0107\7$\2"+
		"\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a"+
		"\5\u00c8e\2\u0109\u010b\t\2\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u0387\3\2\2\2\u010c\u0111\5\30\r\2\u010d\u010e\7\3\2\2\u010e"+
		"\u010f\5\u00b2Z\2\u010f\u0110\7\4\2\2\u0110\u0112\3\2\2\2\u0111\u010d"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0121\5\62\32\2"+
		"\u0114\u0115\7\u00be\2\2\u0115\u0120\5\64\33\2\u0116\u0117\7\u00de\2\2"+
		"\u0117\u0118\7\26\2\2\u0118\u0120\5v<\2\u0119\u0120\5\32\16\2\u011a\u0120"+
		"\5\36\20\2\u011b\u011c\7t\2\2\u011c\u0120\7\u00f9\2\2\u011d\u011e\7\u00c0"+
		"\2\2\u011e\u0120\5\64\33\2\u011f\u0114\3\2\2\2\u011f\u0116\3\2\2\2\u011f"+
		"\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0126\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125\7u\2\2\u0125\u0127\7\u00fd"+
		"\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012c\3\2\2\2\u0128"+
		"\u012a\7\20\2\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3"+
		"\2\2\2\u012b\u012d\5 \21\2\u012c\u0129\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u0387\3\2\2\2\u012e\u0133\5\30\r\2\u012f\u0130\7\3\2\2\u0130\u0131\5"+
		"\u00b2Z\2\u0131\u0132\7\4\2\2\u0132\u0134\3\2\2\2\u0133\u012f\3\2\2\2"+
		"\u0133\u0134\3\2\2\2\u0134\u0146\3\2\2\2\u0135\u0136\7t\2\2\u0136\u0145"+
		"\7\u00f9\2\2\u0137\u0138\7\u00de\2\2\u0138\u0139\7\26\2\2\u0139\u013a"+
		"\7\3\2\2\u013a\u013b\5\u00b2Z\2\u013b\u013c\7\4\2\2\u013c\u0145\3\2\2"+
		"\2\u013d\u0145\5\32\16\2\u013e\u0145\5\34\17\2\u013f\u0145\5\u008aF\2"+
		"\u0140\u0145\5@!\2\u0141\u0145\5\36\20\2\u0142\u0143\7\u00c0\2\2\u0143"+
		"\u0145\5\64\33\2\u0144\u0135\3\2\2\2\u0144\u0137\3\2\2\2\u0144\u013d\3"+
		"\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0147\3\2\2\2\u0147\u014b\3\2\2\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014a\7u\2\2\u014a\u014c\7\u00fd\2\2\u014b\u0149\3\2\2\2\u014b\u014c"+
		"\3\2\2\2\u014c\u0151\3\2\2\2\u014d\u014f\7\20\2\2\u014e\u014d\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\5 \21\2\u0151\u014e"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0387\3\2\2\2\u0153\u0154\7Q\2\2\u0154"+
		"\u0158\7R\2\2\u0155\u0156\7\u0086\2\2\u0156\u0157\7\"\2\2\u0157\u0159"+
		"\7$\2\2\u0158\u0155\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\5\u008cG\2\u015b\u015c\7&\2\2\u015c\u015e\5\u008cG\2\u015d\u015f"+
		"\5\36\20\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0387\3\2\2\2"+
		"\u0160\u0161\7\u00da\2\2\u0161\u0162\7R\2\2\u0162\u0164\5\u008cG\2\u0163"+
		"\u0165\5&\24\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0167\7\u00db\2\2\u0167\u016c\7\u00dd\2\2\u0168\u016d\5\u00c8"+
		"e\2\u0169\u016a\7/\2\2\u016a\u016b\7b\2\2\u016b\u016d\5x=\2\u016c\u0168"+
		"\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u0387\3\2\2\2\u016e"+
		"\u016f\7o\2\2\u016f\u0170\7R\2\2\u0170\u0171\5\u008cG\2\u0171\u0172\7"+
		"\17\2\2\u0172\u0173\7b\2\2\u0173\u0174\7\3\2\2\u0174\u0175\5\u00b2Z\2"+
		"\u0175\u0176\7\4\2\2\u0176\u0387\3\2\2\2\u0177\u0178\7o\2\2\u0178\u0179"+
		"\t\3\2\2\u0179\u017a\5\u008cG\2\u017a\u017b\7p\2\2\u017b\u017c\7l\2\2"+
		"\u017c\u017d\5\u008cG\2\u017d\u0387\3\2\2\2\u017e\u017f\7o\2\2\u017f\u0180"+
		"\t\3\2\2\u0180\u0181\5\u008cG\2\u0181\u0182\7v\2\2\u0182\u0183\7\u00c0"+
		"\2\2\u0183\u0184\5\64\33\2\u0184\u0387\3\2\2\2\u0185\u0186\7o\2\2\u0186"+
		"\u0187\t\3\2\2\u0187\u0188\5\u008cG\2\u0188\u0189\7\u00bf\2\2\u0189\u018c"+
		"\7\u00c0\2\2\u018a\u018b\7\u0086\2\2\u018b\u018d\7$\2\2\u018c\u018a\3"+
		"\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\5\64\33\2\u018f"+
		"\u0387\3\2\2\2\u0190\u0191\7o\2\2\u0191\u0192\7R\2\2\u0192\u0194\5\u008c"+
		"G\2\u0193\u0195\5&\24\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0198\7\u00ce\2\2\u0197\u0199\7c\2\2\u0198\u0197"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5\u00c8e"+
		"\2\u019b\u019d\5\u00b4[\2\u019c\u019e\5\u00aeX\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u0387\3\2\2\2\u019f\u01a0\7o\2\2\u01a0\u01a1\7R\2"+
		"\2\u01a1\u01a3\5\u008cG\2\u01a2\u01a4\5&\24\2\u01a3\u01a2\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7\u00a7"+
		"\2\2\u01a7\u01ab\7\u00f9\2\2\u01a8\u01a9\7O\2\2\u01a9\u01aa\7\u00a8\2"+
		"\2\u01aa\u01ac\5\64\33\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u0387\3\2\2\2\u01ad\u01ae\7o\2\2\u01ae\u01af\7R\2\2\u01af\u01b1\5\u008c"+
		"G\2\u01b0\u01b2\5&\24\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\7v\2\2\u01b4\u01b5\7\u00a8\2\2\u01b5\u01b6"+
		"\5\64\33\2\u01b6\u0387\3\2\2\2\u01b7\u01b8\7o\2\2\u01b8\u01b9\7R\2\2\u01b9"+
		"\u01ba\5\u008cG\2\u01ba\u01be\7\17\2\2\u01bb\u01bc\7\u0086\2\2\u01bc\u01bd"+
		"\7\"\2\2\u01bd\u01bf\7$\2\2\u01be\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01c2\5$\23\2\u01c1\u01c0\3\2\2\2\u01c2\u01c3\3\2"+
		"\2\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u0387\3\2\2\2\u01c5"+
		"\u01c6\7o\2\2\u01c6\u01c7\7T\2\2\u01c7\u01c8\5\u008cG\2\u01c8\u01cc\7"+
		"\17\2\2\u01c9\u01ca\7\u0086\2\2\u01ca\u01cb\7\"\2\2\u01cb\u01cd\7$\2\2"+
		"\u01cc\u01c9\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0"+
		"\5&\24\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1"+
		"\u01d2\3\2\2\2\u01d2\u0387\3\2\2\2\u01d3\u01d4\7o\2\2\u01d4\u01d5\7R\2"+
		"\2\u01d5\u01d6\5\u008cG\2\u01d6\u01d7\5&\24\2\u01d7\u01d8\7p\2\2\u01d8"+
		"\u01d9\7l\2\2\u01d9\u01da\5&\24\2\u01da\u0387\3\2\2\2\u01db\u01dc\7o\2"+
		"\2\u01dc\u01dd\7R\2\2\u01dd\u01de\5\u008cG\2\u01de\u01e1\7g\2\2\u01df"+
		"\u01e0\7\u0086\2\2\u01e0\u01e2\7$\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e8\5&\24\2\u01e4\u01e5\7\5\2\2\u01e5"+
		"\u01e7\5&\24\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ed\7\u00d3\2\2\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0387"+
		"\3\2\2\2\u01ee\u01ef\7o\2\2\u01ef\u01f0\7T\2\2\u01f0\u01f1\5\u008cG\2"+
		"\u01f1\u01f4\7g\2\2\u01f2\u01f3\7\u0086\2\2\u01f3\u01f5\7$\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fb\5&\24\2\u01f7"+
		"\u01f8\7\5\2\2\u01f8\u01fa\5&\24\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2"+
		"\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0387\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fe\u01ff\7o\2\2\u01ff\u0200\7R\2\2\u0200\u0202\5\u008c"+
		"G\2\u0201\u0203\5&\24\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204\u0205\7v\2\2\u0205\u0206\5\36\20\2\u0206\u0387\3"+
		"\2\2\2\u0207\u0208\7o\2\2\u0208\u0209\7R\2\2\u0209\u020a\5\u008cG\2\u020a"+
		"\u020b\7\u00e7\2\2\u020b\u020c\7e\2\2\u020c\u0387\3\2\2\2\u020d\u020e"+
		"\7g\2\2\u020e\u0211\7R\2\2\u020f\u0210\7\u0086\2\2\u0210\u0212\7$\2\2"+
		"\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215"+
		"\5\u008cG\2\u0214\u0216\7\u00d3\2\2\u0215\u0214\3\2\2\2\u0215\u0216\3"+
		"\2\2\2\u0216\u0387\3\2\2\2\u0217\u0218\7g\2\2\u0218\u021b\7T\2\2\u0219"+
		"\u021a\7\u0086\2\2\u021a\u021c\7$\2\2\u021b\u0219\3\2\2\2\u021b\u021c"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u0387\5\u008cG\2\u021e\u0221\7Q\2\2"+
		"\u021f\u0220\7\37\2\2\u0220\u0222\7U\2\2\u0221\u021f\3\2\2\2\u0221\u0222"+
		"\3\2\2\2\u0222\u0227\3\2\2\2\u0223\u0225\7\u00bc\2\2\u0224\u0223\3\2\2"+
		"\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0228\7\u00bd\2\2\u0227"+
		"\u0224\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022d\7T"+
		"\2\2\u022a\u022b\7\u0086\2\2\u022b\u022c\7\"\2\2\u022c\u022e\7$\2\2\u022d"+
		"\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\5\u008c"+
		"G\2\u0230\u0232\5~@\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0235"+
		"\3\2\2\2\u0233\u0234\7t\2\2\u0234\u0236\7\u00f9\2\2\u0235\u0233\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u023a\3\2\2\2\u0237\u0238\7\u00de\2\2\u0238"+
		"\u0239\7?\2\2\u0239\u023b\5v<\2\u023a\u0237\3\2\2\2\u023a\u023b\3\2\2"+
		"\2\u023b\u023e\3\2\2\2\u023c\u023d\7\u00c0\2\2\u023d\u023f\5\64\33\2\u023e"+
		"\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7\20"+
		"\2\2\u0241\u0242\5 \21\2\u0242\u0387\3\2\2\2\u0243\u0246\7Q\2\2\u0244"+
		"\u0245\7\37\2\2\u0245\u0247\7U\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2"+
		"\2\2\u0247\u0249\3\2\2\2\u0248\u024a\7\u00bc\2\2\u0249\u0248\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\u00bd\2\2\u024c\u024d"+
		"\7T\2\2\u024d\u0252\5\u008cG\2\u024e\u024f\7\3\2\2\u024f\u0250\5\u00b2"+
		"Z\2\u0250\u0251\7\4\2\2\u0251\u0253\3\2\2\2\u0252\u024e\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\5\62\32\2\u0255\u0256\7"+
		"\u00be\2\2\u0256\u0258\5\64\33\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2"+
		"\2\u0258\u0387\3\2\2\2\u0259\u025a\7o\2\2\u025a\u025b\7T\2\2\u025b\u025d"+
		"\5\u008cG\2\u025c\u025e\7\20\2\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0260\5 \21\2\u0260\u0387\3\2\2\2\u0261\u0264"+
		"\7Q\2\2\u0262\u0263\7\37\2\2\u0263\u0265\7U\2\2\u0264\u0262\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\7\u00bd\2\2\u0267\u0266"+
		"\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026d\7\u00b4\2"+
		"\2\u026a\u026b\7\u0086\2\2\u026b\u026c\7\"\2\2\u026c\u026e\7$\2\2\u026d"+
		"\u026a\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\5\u00c6"+
		"d\2\u0270\u0271\7\20\2\2\u0271\u027b\7\u00f9\2\2\u0272\u0273\7\u00a6\2"+
		"\2\u0273\u0278\5F$\2\u0274\u0275\7\5\2\2\u0275\u0277\5F$\2\u0276\u0274"+
		"\3\2\2\2\u0277\u027a\3\2\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027b\u0272\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u0387\3\2\2\2\u027d\u027f\7g\2\2\u027e\u0280\7\u00bd\2\2\u027f"+
		"\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0284\7\u00b4"+
		"\2\2\u0282\u0283\7\u0086\2\2\u0283\u0285\7$\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0387\5\u00c6d\2\u0287\u0289"+
		"\7Z\2\2\u0288\u028a\t\4\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u0387\5\16\b\2\u028c\u028d\7`\2\2\u028d\u0290\7a"+
		"\2\2\u028e\u028f\t\5\2\2\u028f\u0291\5\u00c8e\2\u0290\u028e\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0294\7&\2\2\u0293\u0292\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\7\u00f9\2\2\u0296"+
		"\u0293\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0387\3\2\2\2\u0298\u0299\7`"+
		"\2\2\u0299\u029a\7R\2\2\u029a\u029d\7\u00b5\2\2\u029b\u029c\t\5\2\2\u029c"+
		"\u029e\5\u00c8e\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u029f"+
		"\3\2\2\2\u029f\u02a0\7&\2\2\u02a0\u02a2\7\u00f9\2\2\u02a1\u02a3\5&\24"+
		"\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u0387\3\2\2\2\u02a4\u02a5"+
		"\7`\2\2\u02a5\u02aa\7\u00d7\2\2\u02a6\u02a8\7&\2\2\u02a7\u02a6\3\2\2\2"+
		"\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\7\u00f9\2\2\u02aa"+
		"\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u0387\3\2\2\2\u02ac\u02ad\7`"+
		"\2\2\u02ad\u02ae\7\u00c0\2\2\u02ae\u02b3\5\u008cG\2\u02af\u02b0\7\3\2"+
		"\2\u02b0\u02b1\58\35\2\u02b1\u02b2\7\4\2\2\u02b2\u02b4\3\2\2\2\u02b3\u02af"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u0387\3\2\2\2\u02b5\u02b6\7`\2\2\u02b6"+
		"\u02b7\7b\2\2\u02b7\u02b8\t\5\2\2\u02b8\u02bb\5\u008cG\2\u02b9\u02ba\t"+
		"\5\2\2\u02ba\u02bc\5\u00c8e\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2"+
		"\u02bc\u0387\3\2\2\2\u02bd\u02be\7`\2\2\u02be\u02bf\7e\2\2\u02bf\u02c1"+
		"\5\u008cG\2\u02c0\u02c2\5&\24\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2"+
		"\2\u02c2\u0387\3\2\2\2\u02c3\u02c5\7`\2\2\u02c4\u02c6\5\u00c8e\2\u02c5"+
		"\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cf\7f"+
		"\2\2\u02c8\u02ca\7&\2\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02cd\3\2\2\2\u02cb\u02ce\5\u00c6d\2\u02cc\u02ce\7\u00f9\2\2\u02cd\u02cb"+
		"\3\2\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf"+
		"\u02d0\3\2\2\2\u02d0\u0387\3\2\2\2\u02d1\u02d2\7`\2\2\u02d2\u02d3\7Q\2"+
		"\2\u02d3\u02d4\7R\2\2\u02d4\u0387\5\u008cG\2\u02d5\u02d6\t\6\2\2\u02d6"+
		"\u02d8\7\u00b4\2\2\u02d7\u02d9\7\u00b5\2\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9"+
		"\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u0387\5*\26\2\u02db\u02dc\t\6\2\2\u02dc"+
		"\u02de\7\u00d6\2\2\u02dd\u02df\7\u00b5\2\2\u02de\u02dd\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u0387\5\u00c8e\2\u02e1\u02e3\t\6\2"+
		"\2\u02e2\u02e4\7R\2\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6"+
		"\3\2\2\2\u02e5\u02e7\t\7\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02ea\5\u008cG\2\u02e9\u02eb\5&\24\2\u02ea\u02e9"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ee\5,\27\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u0387\3\2\2\2\u02ef\u02f0\7\u00b6"+
		"\2\2\u02f0\u02f1\7R\2\2\u02f1\u0387\5\u008cG\2\u02f2\u02fa\7\u00b6\2\2"+
		"\u02f3\u02fb\7\u00f9\2\2\u02f4\u02f6\13\2\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02f3\3\2\2\2\u02fa\u02f7\3\2\2\2\u02fb"+
		"\u0387\3\2\2\2\u02fc\u02fe\7\u00b8\2\2\u02fd\u02ff\7\u00ba\2\2\u02fe\u02fd"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\7R\2\2\u0301"+
		"\u0306\5\u008cG\2\u0302\u0304\7\20\2\2\u0303\u0302\3\2\2\2\u0303\u0304"+
		"\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0307\5 \21\2\u0306\u0303\3\2\2\2\u0306"+
		"\u0307\3\2\2\2\u0307\u0387\3\2\2\2\u0308\u0309\7\u00b9\2\2\u0309\u030c"+
		"\7R\2\2\u030a\u030b\7\u0086\2\2\u030b\u030d\7$\2\2\u030c\u030a\3\2\2\2"+
		"\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0387\5\u008cG\2\u030f"+
		"\u0310\7\u00b7\2\2\u0310\u0387\7\u00b8\2\2\u0311\u0312\7\u00ea\2\2\u0312"+
		"\u0314\7x\2\2\u0313\u0315\7\u00f5\2\2\u0314\u0313\3\2\2\2\u0314\u0315"+
		"\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\7\u00f6\2\2\u0317\u0319\7\u00f9"+
		"\2\2\u0318\u031a\7\u00a3\2\2\u0319\u0318\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\3\2\2\2\u031b\u031c\7X\2\2\u031c\u031d\7R\2\2\u031d\u031f\5\u008c"+
		"G\2\u031e\u0320\5&\24\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320"+
		"\u0387\3\2\2\2\u0321\u0322\7\u00d9\2\2\u0322\u0323\7R\2\2\u0323\u0325"+
		"\5\u008cG\2\u0324\u0326\5&\24\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2"+
		"\2\u0326\u0387\3\2\2\2\u0327\u0328\7\u00e5\2\2\u0328\u0329\7\u00e6\2\2"+
		"\u0329\u032a\7R\2\2\u032a\u0387\5\u008cG\2\u032b\u032c\t\b\2\2\u032c\u0330"+
		"\5\u00c8e\2\u032d\u032f\13\2\2\2\u032e\u032d\3\2\2\2\u032f\u0332\3\2\2"+
		"\2\u0330\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u0387\3\2\2\2\u0332\u0330"+
		"\3\2\2\2\u0333\u0334\7v\2\2\u0334\u0338\7\u00eb\2\2\u0335\u0337\13\2\2"+
		"\2\u0336\u0335\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0339\3\2\2\2\u0338\u0336"+
		"\3\2\2\2\u0339\u0387\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033f\7v\2\2\u033c"+
		"\u033e\13\2\2\2\u033d\u033c\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u0340\3"+
		"\2\2\2\u033f\u033d\3\2\2\2\u0340\u0387\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0387\7w\2\2\u0343\u0347\7\u0108\2\2\u0344\u0346\13\2\2\2\u0345\u0344"+
		"\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0348\3\2\2\2\u0347\u0345\3\2\2\2\u0348"+
		"\u0387\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034b\7\u0082\2\2\u034b\u034c"+
		"\7R\2\2\u034c\u034e\5\u008cG\2\u034d\u034f\5&\24\2\u034e\u034d\3\2\2\2"+
		"\u034e\u034f\3\2\2\2\u034f\u0387\3\2\2\2\u0350\u0351\7\u0083\2\2\u0351"+
		"\u0352\7\u0085\2\2\u0352\u0387\5\20\t\2\u0353\u0354\7\u00f8\2\2\u0354"+
		"\u0387\5\u00c8e\2\u0355\u0356\7\u00f7\2\2\u0356\u0358\5\u00c8e\2\u0357"+
		"\u0359\5\64\33\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u0387\3"+
		"\2\2\2\u035a\u035b\7\u0084\2\2\u035b\u035c\7R\2\2\u035c\u035e\5\u008c"+
		"G\2\u035d\u035f\5&\24\2\u035e\u035d\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0361\7\35\2\2\u0361\u0362\5\u00ceh\2\u0362\u0387"+
		"\3\2\2\2\u0363\u0364\7\u00ea\2\2\u0364\u0365\7x\2\2\u0365\u0366\5\u009e"+
		"P\2\u0366\u0367\7R\2\2\u0367\u0369\5\u008cG\2\u0368\u036a\5\22\n\2\u0369"+
		"\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u0387\3\2\2\2\u036b\u036c\7\u00ea"+
		"\2\2\u036c\u036d\7x\2\2\u036d\u036e\7\u00f9\2\2\u036e\u036f\t\t\2\2\u036f"+
		"\u0370\7R\2\2\u0370\u0372\5\u008cG\2\u0371\u0373\5&\24\2\u0372\u0371\3"+
		"\2\2\2\u0372\u0373\3\2\2\2\u0373\u0387\3\2\2\2\u0374\u0375\7\u00e8\2\2"+
		"\u0375\u0376\7R\2\2\u0376\u0378\5\u008cG\2\u0377\u0379\5&\24\2\u0378\u0377"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7l\2\2\u037b"+
		"\u037d\5\u009eP\2\u037c\u037e\5\22\n\2\u037d\u037c\3\2\2\2\u037d\u037e"+
		"\3\2\2\2\u037e\u0387\3\2\2\2\u037f\u0383\5\26\f\2\u0380\u0382\13\2\2\2"+
		"\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0384\3\2\2\2\u0383\u0381"+
		"\3\2\2\2\u0384\u0387\3\2\2\2\u0385\u0383\3\2\2\2\u0386\u00e4\3\2\2\2\u0386"+
		"\u00e5\3\2\2\2\u0386\u00e7\3\2\2\2\u0386\u00fb\3\2\2\2\u0386\u0102\3\2"+
		"\2\2\u0386\u010c\3\2\2\2\u0386\u012e\3\2\2\2\u0386\u0153\3\2\2\2\u0386"+
		"\u0160\3\2\2\2\u0386\u016e\3\2\2\2\u0386\u0177\3\2\2\2\u0386\u017e\3\2"+
		"\2\2\u0386\u0185\3\2\2\2\u0386\u0190\3\2\2\2\u0386\u019f\3\2\2\2\u0386"+
		"\u01ad\3\2\2\2\u0386\u01b7\3\2\2\2\u0386\u01c5\3\2\2\2\u0386\u01d3\3\2"+
		"\2\2\u0386\u01db\3\2\2\2\u0386\u01ee\3\2\2\2\u0386\u01fe\3\2\2\2\u0386"+
		"\u0207\3\2\2\2\u0386\u020d\3\2\2\2\u0386\u0217\3\2\2\2\u0386\u021e\3\2"+
		"\2\2\u0386\u0243\3\2\2\2\u0386\u0259\3\2\2\2\u0386\u0261\3\2\2\2\u0386"+
		"\u027d\3\2\2\2\u0386\u0287\3\2\2\2\u0386\u028c\3\2\2\2\u0386\u0298\3\2"+
		"\2\2\u0386\u02a4\3\2\2\2\u0386\u02ac\3\2\2\2\u0386\u02b5\3\2\2\2\u0386"+
		"\u02bd\3\2\2\2\u0386\u02c3\3\2\2\2\u0386\u02d1\3\2\2\2\u0386\u02d5\3\2"+
		"\2\2\u0386\u02db\3\2\2\2\u0386\u02e1\3\2\2\2\u0386\u02ef\3\2\2\2\u0386"+
		"\u02f2\3\2\2\2\u0386\u02fc\3\2\2\2\u0386\u0308\3\2\2\2\u0386\u030f\3\2"+
		"\2\2\u0386\u0311\3\2\2\2\u0386\u0321\3\2\2\2\u0386\u0327\3\2\2\2\u0386"+
		"\u032b\3\2\2\2\u0386\u0333\3\2\2\2\u0386\u033b\3\2\2\2\u0386\u0342\3\2"+
		"\2\2\u0386\u0343\3\2\2\2\u0386\u034a\3\2\2\2\u0386\u0350\3\2\2\2\u0386"+
		"\u0353\3\2\2\2\u0386\u0355\3\2\2\2\u0386\u035a\3\2\2\2\u0386\u0363\3\2"+
		"\2\2\u0386\u036b\3\2\2\2\u0386\u0374\3\2\2\2\u0386\u037f\3\2\2\2\u0387"+
		"\17\3\2\2\2\u0388\u0389\7\u0109\2\2\u0389\21\3\2\2\2\u038a\u038b\7\u00be"+
		"\2\2\u038b\u038c\7\3\2\2\u038c\u0391\5\24\13\2\u038d\u038e\7\5\2\2\u038e"+
		"\u0390\5\24\13\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391\u038f\3"+
		"\2\2\2\u0391\u0392\3\2\2\2\u0392\u0394\3\2\2\2\u0393\u0391\3\2\2\2\u0394"+
		"\u0395\7\4\2\2\u0395\23\3\2\2\2\u0396\u0397\5\u00c8e\2\u0397\u0398\7\u0089"+
		"\2\2\u0398\u0399\5\u009eP\2\u0399\25\3\2\2\2\u039a\u039b\7Q\2\2\u039b"+
		"\u0445\7\u00eb\2\2\u039c\u039d\7g\2\2\u039d\u0445\7\u00eb\2\2\u039e\u03a0"+
		"\7\u00e2\2\2\u039f\u03a1\7\u00eb\2\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3"+
		"\2\2\2\u03a1\u0445\3\2\2\2\u03a2\u03a4\7\u00e1\2\2\u03a3\u03a5\7\u00eb"+
		"\2\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u0445\3\2\2\2\u03a6"+
		"\u03a7\7`\2\2\u03a7\u0445\7\u00e2\2\2\u03a8\u03a9\7`\2\2\u03a9\u03ab\7"+
		"\u00eb\2\2\u03aa\u03ac\7\u00e2\2\2\u03ab\u03aa\3\2\2\2\u03ab\u03ac\3\2"+
		"\2\2\u03ac\u0445\3\2\2\2\u03ad\u03ae\7`\2\2\u03ae\u0445\7\u00ee\2\2\u03af"+
		"\u03b0\7`\2\2\u03b0\u0445\7\u00ec\2\2\u03b1\u03b2\7`\2\2\u03b2\u03b3\7"+
		"J\2\2\u03b3\u0445\7\u00ec\2\2\u03b4\u03b5\7\u00e8\2\2\u03b5\u0445\7R\2"+
		"\2\u03b6\u03b7\7\u00e9\2\2\u03b7\u0445\7R\2\2\u03b8\u03b9\7`\2\2\u03b9"+
		"\u0445\7\u00ed\2\2\u03ba\u03bb\7`\2\2\u03bb\u03bc\7Q\2\2\u03bc\u0445\7"+
		"R\2\2\u03bd\u03be\7`\2\2\u03be\u0445\7\u00ef\2\2\u03bf\u03c0\7`\2\2\u03c0"+
		"\u0445\7\u00f1\2\2\u03c1\u03c2\7`\2\2\u03c2\u0445\7\u00f2\2\2\u03c3\u03c4"+
		"\7Q\2\2\u03c4\u0445\7\u00f0\2\2\u03c5\u03c6\7g\2\2\u03c6\u0445\7\u00f0"+
		"\2\2\u03c7\u03c8\7o\2\2\u03c8\u0445\7\u00f0\2\2\u03c9\u03ca\7\u00e3\2"+
		"\2\u03ca\u0445\7R\2\2\u03cb\u03cc\7\u00e3\2\2\u03cc\u0445\7\u00d6\2\2"+
		"\u03cd\u03ce\7\u00e4\2\2\u03ce\u0445\7R\2\2\u03cf\u03d0\7\u00e4\2\2\u03d0"+
		"\u0445\7\u00d6\2\2\u03d1\u03d2\7Q\2\2\u03d2\u03d3\7\u00bd\2\2\u03d3\u0445"+
		"\7}\2\2\u03d4\u03d5\7g\2\2\u03d5\u03d6\7\u00bd\2\2\u03d6\u0445\7}\2\2"+
		"\u03d7\u03d8\7o\2\2\u03d8\u03d9\7R\2\2\u03d9\u03da\5\u008cG\2\u03da\u03db"+
		"\7\"\2\2\u03db\u03dc\7\u00d1\2\2\u03dc\u0445\3\2\2\2\u03dd\u03de\7o\2"+
		"\2\u03de\u03df\7R\2\2\u03df\u03e0\5\u008cG\2\u03e0\u03e1\7\u00d1\2\2\u03e1"+
		"\u03e2\7\26\2\2\u03e2\u0445\3\2\2\2\u03e3\u03e4\7o\2\2\u03e4\u03e5\7R"+
		"\2\2\u03e5\u03e6\5\u008cG\2\u03e6\u03e7\7\"\2\2\u03e7\u03e8\7\u00d2\2"+
		"\2\u03e8\u0445\3\2\2\2\u03e9\u03ea\7o\2\2\u03ea\u03eb\7R\2\2\u03eb\u03ec"+
		"\5\u008cG\2\u03ec\u03ed\7\u00c3\2\2\u03ed\u03ee\7\26\2\2\u03ee\u0445\3"+
		"\2\2\2\u03ef\u03f0\7o\2\2\u03f0\u03f1\7R\2\2\u03f1\u03f2\5\u008cG\2\u03f2"+
		"\u03f3\7\"\2\2\u03f3\u03f4\7\u00c3\2\2\u03f4\u0445\3\2\2\2\u03f5\u03f6"+
		"\7o\2\2\u03f6\u03f7\7R\2\2\u03f7\u03f8\5\u008cG\2\u03f8\u03f9\7\"\2\2"+
		"\u03f9\u03fa\7\u00c4\2\2\u03fa\u03fb\7\20\2\2\u03fb\u03fc\7\u00c5\2\2"+
		"\u03fc\u0445\3\2\2\2\u03fd\u03fe\7o\2\2\u03fe\u03ff\7R\2\2\u03ff\u0400"+
		"\5\u008cG\2\u0400\u0401\7v\2\2\u0401\u0402\7\u00c3\2\2\u0402\u0403\7\u00c6"+
		"\2\2\u0403\u0445\3\2\2\2\u0404\u0405\7o\2\2\u0405\u0406\7R\2\2\u0406\u0407"+
		"\5\u008cG\2\u0407\u0408\7\u00c7\2\2\u0408\u0409\7D\2\2\u0409\u0445\3\2"+
		"\2\2\u040a\u040b\7o\2\2\u040b\u040c\7R\2\2\u040c\u040d\5\u008cG\2\u040d"+
		"\u040e\7\u00c8\2\2\u040e\u040f\7D\2\2\u040f\u0445\3\2\2\2\u0410\u0411"+
		"\7o\2\2\u0411\u0412\7R\2\2\u0412\u0413\5\u008cG\2\u0413\u0414\7\u00c9"+
		"\2\2\u0414\u0415\7D\2\2\u0415\u0445\3\2\2\2\u0416\u0417\7o\2\2\u0417\u0418"+
		"\7R\2\2\u0418\u0419\5\u008cG\2\u0419\u041a\7\u00cb\2\2\u041a\u0445\3\2"+
		"\2\2\u041b\u041c\7o\2\2\u041c\u041d\7R\2\2\u041d\u041f\5\u008cG\2\u041e"+
		"\u0420\5&\24\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u0422\7\u00cc\2\2\u0422\u0445\3\2\2\2\u0423\u0424\7o\2\2\u0424"+
		"\u0425\7R\2\2\u0425\u0427\5\u008cG\2\u0426\u0428\5&\24\2\u0427\u0426\3"+
		"\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\7\u00cd\2\2"+
		"\u042a\u0445\3\2\2\2\u042b\u042c\7o\2\2\u042c\u042d\7R\2\2\u042d\u042f"+
		"\5\u008cG\2\u042e\u0430\5&\24\2\u042f\u042e\3\2\2\2\u042f\u0430\3\2\2"+
		"\2\u0430\u0431\3\2\2\2\u0431\u0432\7v\2\2\u0432\u0433\7\u00ca\2\2\u0433"+
		"\u0445\3\2\2\2\u0434\u0435\7o\2\2\u0435\u0436\7R\2\2\u0436\u0438\5\u008c"+
		"G\2\u0437\u0439\5&\24\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439"+
		"\u043a\3\2\2\2\u043a\u043b\7U\2\2\u043b\u043c\7b\2\2\u043c\u0445\3\2\2"+
		"\2\u043d\u043e\7y\2\2\u043e\u0445\7z\2\2\u043f\u0445\7{\2\2\u0440\u0445"+
		"\7|\2\2\u0441\u0445\7\u00d8\2\2\u0442\u0443\7W\2\2\u0443\u0445\7\16\2"+
		"\2\u0444\u039a\3\2\2\2\u0444\u039c\3\2\2\2\u0444\u039e\3\2\2\2\u0444\u03a2"+
		"\3\2\2\2\u0444\u03a6\3\2\2\2\u0444\u03a8\3\2\2\2\u0444\u03ad\3\2\2\2\u0444"+
		"\u03af\3\2\2\2\u0444\u03b1\3\2\2\2\u0444\u03b4\3\2\2\2\u0444\u03b6\3\2"+
		"\2\2\u0444\u03b8\3\2\2\2\u0444\u03ba\3\2\2\2\u0444\u03bd\3\2\2\2\u0444"+
		"\u03bf\3\2\2\2\u0444\u03c1\3\2\2\2\u0444\u03c3\3\2\2\2\u0444\u03c5\3\2"+
		"\2\2\u0444\u03c7\3\2\2\2\u0444\u03c9\3\2\2\2\u0444\u03cb\3\2\2\2\u0444"+
		"\u03cd\3\2\2\2\u0444\u03cf\3\2\2\2\u0444\u03d1\3\2\2\2\u0444\u03d4\3\2"+
		"\2\2\u0444\u03d7\3\2\2\2\u0444\u03dd\3\2\2\2\u0444\u03e3\3\2\2\2\u0444"+
		"\u03e9\3\2\2\2\u0444\u03ef\3\2\2\2\u0444\u03f5\3\2\2\2\u0444\u03fd\3\2"+
		"\2\2\u0444\u0404\3\2\2\2\u0444\u040a\3\2\2\2\u0444\u0410\3\2\2\2\u0444"+
		"\u0416\3\2\2\2\u0444\u041b\3\2\2\2\u0444\u0423\3\2\2\2\u0444\u042b\3\2"+
		"\2\2\u0444\u0434\3\2\2\2\u0444\u043d\3\2\2\2\u0444\u043f\3\2\2\2\u0444"+
		"\u0440\3\2\2\2\u0444\u0441\3\2\2\2\u0444\u0442\3\2\2\2\u0445\27\3\2\2"+
		"\2\u0446\u0448\7Q\2\2\u0447\u0449\7\u00bd\2\2\u0448\u0447\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u044c\7\u00df\2\2\u044b\u044a"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0451\7R\2\2\u044e"+
		"\u044f\7\u0086\2\2\u044f\u0450\7\"\2\2\u0450\u0452\7$\2\2\u0451\u044e"+
		"\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\5\u008cG"+
		"\2\u0454\31\3\2\2\2\u0455\u0456\7\u00d1\2\2\u0456\u0457\7\26\2\2\u0457"+
		"\u045b\5v<\2\u0458\u0459\7\u00d2\2\2\u0459\u045a\7\26\2\2\u045a\u045c"+
		"\5z>\2\u045b\u0458\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045d\3\2\2\2\u045d"+
		"\u045e\7X\2\2\u045e\u045f\7\u00fd\2\2\u045f\u0460\7\u00c2\2\2\u0460\33"+
		"\3\2\2\2\u0461\u0462\7\u00c3\2\2\u0462\u0463\7\26\2\2\u0463\u0464\5v<"+
		"\2\u0464\u0467\7?\2\2\u0465\u0468\5<\37\2\u0466\u0468\5> \2\u0467\u0465"+
		"\3\2\2\2\u0467\u0466\3\2\2\2\u0468\u046c\3\2\2\2\u0469\u046a\7\u00c4\2"+
		"\2\u046a\u046b\7\20\2\2\u046b\u046d\7\u00c5\2\2\u046c\u0469\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\35\3\2\2\2\u046e\u046f\7\u00c6\2\2\u046f\u0470\7"+
		"\u00f9\2\2\u0470\37\3\2\2\2\u0471\u0473\5.\30\2\u0472\u0471\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\5H%\2\u0475!\3\2\2\2\u0476"+
		"\u0477\7V\2\2\u0477\u0478\7\u00a3\2\2\u0478\u0479\7R\2\2\u0479\u0480\5"+
		"\u008cG\2\u047a\u047e\5&\24\2\u047b\u047c\7\u0086\2\2\u047c\u047d\7\""+
		"\2\2\u047d\u047f\7$\2\2\u047e\u047b\3\2\2\2\u047e\u047f\3\2\2\2\u047f"+
		"\u0481\3\2\2\2\u0480\u047a\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u04a7\3\2"+
		"\2\2\u0482\u0483\7V\2\2\u0483\u0485\7X\2\2\u0484\u0486\7R\2\2\u0485\u0484"+
		"\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0489\5\u008cG"+
		"\2\u0488\u048a\5&\24\2\u0489\u0488\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u04a7"+
		"\3\2\2\2\u048b\u048c\7V\2\2\u048c\u048e\7\u00a3\2\2\u048d\u048f\7\u00f5"+
		"\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2\2\2\u0490"+
		"\u0491\7S\2\2\u0491\u0493\7\u00f9\2\2\u0492\u0494\5\u008aF\2\u0493\u0492"+
		"\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0496\3\2\2\2\u0495\u0497\5@!\2\u0496"+
		"\u0495\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u04a7\3\2\2\2\u0498\u0499\7V"+
		"\2\2\u0499\u049b\7\u00a3\2\2\u049a\u049c\7\u00f5\2\2\u049b\u049a\3\2\2"+
		"\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049f\7S\2\2\u049e\u04a0"+
		"\7\u00f9\2\2\u049f\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2"+
		"\2\u04a1\u04a4\5\62\32\2\u04a2\u04a3\7\u00be\2\2\u04a3\u04a5\5\64\33\2"+
		"\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u0476"+
		"\3\2\2\2\u04a6\u0482\3\2\2\2\u04a6\u048b\3\2\2\2\u04a6\u0498\3\2\2\2\u04a7"+
		"#\3\2\2\2\u04a8\u04aa\5&\24\2\u04a9\u04ab\5\36\20\2\u04aa\u04a9\3\2\2"+
		"\2\u04aa\u04ab\3\2\2\2\u04ab%\3\2\2\2\u04ac\u04ad\7D\2\2\u04ad\u04ae\7"+
		"\3\2\2\u04ae\u04b3\5(\25\2\u04af\u04b0\7\5\2\2\u04b0\u04b2\5(\25\2\u04b1"+
		"\u04af\3\2\2\2\u04b2\u04b5\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b6\u04b7\7\4\2\2\u04b7"+
		"\'\3\2\2\2\u04b8\u04bb\5\u00c8e\2\u04b9\u04ba\7\u0089\2\2\u04ba\u04bc"+
		"\5\u009eP\2\u04bb\u04b9\3\2\2\2\u04bb\u04bc\3\2\2\2\u04bc)\3\2\2\2\u04bd"+
		"\u04c3\5\u00c6d\2\u04be\u04c3\7\u00f9\2\2\u04bf\u04c3\5\u00a0Q\2\u04c0"+
		"\u04c3\5\u00a2R\2\u04c1\u04c3\5\u00a4S\2\u04c2\u04bd\3\2\2\2\u04c2\u04be"+
		"\3\2\2\2\u04c2\u04bf\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c1\3\2\2\2\u04c3"+
		"+\3\2\2\2\u04c4\u04c9\5\u00c8e\2\u04c5\u04c6\7\6\2\2\u04c6\u04c8\5\u00c8"+
		"e\2\u04c7\u04c5\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca-\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc\u04cd\7O\2\2\u04cd"+
		"\u04d2\5\60\31\2\u04ce\u04cf\7\5\2\2\u04cf\u04d1\5\60\31\2\u04d0\u04ce"+
		"\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"/\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d7\5\u00c8e\2\u04d6\u04d8\7\20"+
		"\2\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9"+
		"\u04da\7\3\2\2\u04da\u04db\5 \21\2\u04db\u04dc\7\4\2\2\u04dc\61\3\2\2"+
		"\2\u04dd\u04de\7\u00a6\2\2\u04de\u04df\5\u00c6d\2\u04df\63\3\2\2\2\u04e0"+
		"\u04e1\7\3\2\2\u04e1\u04e6\5\66\34\2\u04e2\u04e3\7\5\2\2\u04e3\u04e5\5"+
		"\66\34\2\u04e4\u04e2\3\2\2\2\u04e5\u04e8\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6"+
		"\u04e7\3\2\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e9\u04ea\7\4"+
		"\2\2\u04ea\65\3\2\2\2\u04eb\u04f0\58\35\2\u04ec\u04ee\7\u0089\2\2\u04ed"+
		"\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\5:"+
		"\36\2\u04f0\u04ed\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\67\3\2\2\2\u04f2\u04f7"+
		"\5\u00c8e\2\u04f3\u04f4\7\6\2\2\u04f4\u04f6\5\u00c8e\2\u04f5\u04f3\3\2"+
		"\2\2\u04f6\u04f9\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04fc\3\2\2\2\u04f9\u04f7\3\2\2\2\u04fa\u04fc\7\u00f9\2\2\u04fb\u04f2"+
		"\3\2\2\2\u04fb\u04fa\3\2\2\2\u04fc9\3\2\2\2\u04fd\u0502\7\u00fd\2\2\u04fe"+
		"\u0502\7\u00fe\2\2\u04ff\u0502\5\u00a6T\2\u0500\u0502\7\u00f9\2\2\u0501"+
		"\u04fd\3\2\2\2\u0501\u04fe\3\2\2\2\u0501\u04ff\3\2\2\2\u0501\u0500\3\2"+
		"\2\2\u0502;\3\2\2\2\u0503\u0504\7\3\2\2\u0504\u0509\5\u009eP\2\u0505\u0506"+
		"\7\5\2\2\u0506\u0508\5\u009eP\2\u0507\u0505\3\2\2\2\u0508\u050b\3\2\2"+
		"\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u0509"+
		"\3\2\2\2\u050c\u050d\7\4\2\2\u050d=\3\2\2\2\u050e\u050f\7\3\2\2\u050f"+
		"\u0514\5<\37\2\u0510\u0511\7\5\2\2\u0511\u0513\5<\37\2\u0512\u0510\3\2"+
		"\2\2\u0513\u0516\3\2\2\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u0517\3\2\2\2\u0516\u0514\3\2\2\2\u0517\u0518\7\4\2\2\u0518?\3\2\2\2"+
		"\u0519\u051a\7\u00c4\2\2\u051a\u051b\7\20\2\2\u051b\u0520\5B\"\2\u051c"+
		"\u051d\7\u00c4\2\2\u051d\u051e\7\26\2\2\u051e\u0520\5D#\2\u051f\u0519"+
		"\3\2\2\2\u051f\u051c\3\2\2\2\u0520A\3\2\2\2\u0521\u0522\7\u00d4\2\2\u0522"+
		"\u0523\7\u00f9\2\2\u0523\u0524\7\u00d5\2\2\u0524\u0527\7\u00f9\2\2\u0525"+
		"\u0527\5\u00c8e\2\u0526\u0521\3\2\2\2\u0526\u0525\3\2\2\2\u0527C\3\2\2"+
		"\2\u0528\u052c\7\u00f9\2\2\u0529\u052a\7O\2\2\u052a\u052b\7\u00a8\2\2"+
		"\u052b\u052d\5\64\33\2\u052c\u0529\3\2\2\2\u052c\u052d\3\2\2\2\u052dE"+
		"\3\2\2\2\u052e\u052f\5\u00c8e\2\u052f\u0530\7\u00f9\2\2\u0530G\3\2\2\2"+
		"\u0531\u0533\5\"\22\2\u0532\u0531\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0534"+
		"\3\2\2\2\u0534\u0535\5N(\2\u0535\u0536\5J&\2\u0536\u053e\3\2\2\2\u0537"+
		"\u0539\5Z.\2\u0538\u053a\5L\'\2\u0539\u0538\3\2\2\2\u053a\u053b\3\2\2"+
		"\2\u053b\u0539\3\2\2\2\u053b\u053c\3\2\2\2\u053c\u053e\3\2\2\2\u053d\u0532"+
		"\3\2\2\2\u053d\u0537\3\2\2\2\u053eI\3\2\2\2\u053f\u0540\7\33\2\2\u0540"+
		"\u0541\7\26\2\2\u0541\u0546\5R*\2\u0542\u0543\7\5\2\2\u0543\u0545\5R*"+
		"\2\u0544\u0542\3\2\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u054a\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u053f\3\2\2\2\u0549"+
		"\u054a\3\2\2\2\u054a\u0555\3\2\2\2\u054b\u054c\7\u00a1\2\2\u054c\u054d"+
		"\7\26\2\2\u054d\u0552\5\u0094K\2\u054e\u054f\7\5\2\2\u054f\u0551\5\u0094"+
		"K\2\u0550\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2\2\u0552"+
		"\u0553\3\2\2\2\u0553\u0556\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u054b\3\2"+
		"\2\2\u0555\u0556\3\2\2\2\u0556\u0561\3\2\2\2\u0557\u0558\7\u00a2\2\2\u0558"+
		"\u0559\7\26\2\2\u0559\u055e\5\u0094K\2\u055a\u055b\7\5\2\2\u055b\u055d"+
		"\5\u0094K\2\u055c\u055a\3\2\2\2\u055d\u0560\3\2\2\2\u055e\u055c\3\2\2"+
		"\2\u055e\u055f\3\2\2\2\u055f\u0562\3\2\2\2\u0560\u055e\3\2\2\2\u0561\u0557"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u056d\3\2\2\2\u0563\u0564\7\u00a0\2"+
		"\2\u0564\u0565\7\26\2\2\u0565\u056a\5R*\2\u0566\u0567\7\5\2\2\u0567\u0569"+
		"\5R*\2\u0568\u0566\3\2\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a"+
		"\u056b\3\2\2\2\u056b\u056e\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u0563\3\2"+
		"\2\2\u056d\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f\u0571\5\u00bc_\2\u0570"+
		"\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u0577\3\2\2\2\u0572\u0575\7\35"+
		"\2\2\u0573\u0576\7\21\2\2\u0574\u0576\5\u0094K\2\u0575\u0573\3\2\2\2\u0575"+
		"\u0574\3\2\2\2\u0576\u0578\3\2\2\2\u0577\u0572\3\2\2\2\u0577\u0578\3\2"+
		"\2\2\u0578K\3\2\2\2\u0579\u057b\5\"\22\2\u057a\u0579\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\5T+\2\u057d\u057e\5J&\2\u057e"+
		"M\3\2\2\2\u057f\u0580\b(\1\2\u0580\u0581\5P)\2\u0581\u0599\3\2\2\2\u0582"+
		"\u0583\f\5\2\2\u0583\u0584\6(\3\2\u0584\u0586\t\n\2\2\u0585\u0587\5h\65"+
		"\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0598"+
		"\5N(\6\u0589\u058a\f\4\2\2\u058a\u058b\6(\5\2\u058b\u058d\7k\2\2\u058c"+
		"\u058e\5h\65\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\3\2"+
		"\2\2\u058f\u0598\5N(\5\u0590\u0591\f\3\2\2\u0591\u0592\6(\7\2\u0592\u0594"+
		"\t\13\2\2\u0593\u0595\5h\65\2\u0594\u0593\3\2\2\2\u0594\u0595\3\2\2\2"+
		"\u0595\u0596\3\2\2\2\u0596\u0598\5N(\4\u0597\u0582\3\2\2\2\u0597\u0589"+
		"\3\2\2\2\u0597\u0590\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599"+
		"\u059a\3\2\2\2\u059aO\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u05a5\5T+\2\u059d"+
		"\u059e\7R\2\2\u059e\u05a5\5\u008cG\2\u059f\u05a5\5\u0084C\2\u05a0\u05a1"+
		"\7\3\2\2\u05a1\u05a2\5H%\2\u05a2\u05a3\7\4\2\2\u05a3\u05a5\3\2\2\2\u05a4"+
		"\u059c\3\2\2\2\u05a4\u059d\3\2\2\2\u05a4\u059f\3\2\2\2\u05a4\u05a0\3\2"+
		"\2\2\u05a5Q\3\2\2\2\u05a6\u05a8\5\u0094K\2\u05a7\u05a9\t\f\2\2\u05a8\u05a7"+
		"\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05ac\3\2\2\2\u05aa\u05ab\7,\2\2\u05ab"+
		"\u05ad\t\r\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05adS\3\2\2\2"+
		"\u05ae\u05af\7\r\2\2\u05af\u05b0\7\u00a4\2\2\u05b0\u05b1\7\3\2\2\u05b1"+
		"\u05b2\5\u0092J\2\u05b2\u05b3\7\4\2\2\u05b3\u05b9\3\2\2\2\u05b4\u05b5"+
		"\7r\2\2\u05b5\u05b9\5\u0092J\2\u05b6\u05b7\7\u00a5\2\2\u05b7\u05b9\5\u0092"+
		"J\2\u05b8\u05ae\3\2\2\2\u05b8\u05b4\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9"+
		"\u05bb\3\2\2\2\u05ba\u05bc\5\u008aF\2\u05bb\u05ba\3\2\2\2\u05bb\u05bc"+
		"\3\2\2\2\u05bc\u05bf\3\2\2\2\u05bd\u05be\7\u00aa\2\2\u05be\u05c0\7\u00f9"+
		"\2\2\u05bf\u05bd\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c2\7\u00a6\2\2\u05c2\u05cf\7\u00f9\2\2\u05c3\u05cd\7\20\2\2\u05c4"+
		"\u05ce\5x=\2\u05c5\u05ce\5\u00b2Z\2\u05c6\u05c9\7\3\2\2\u05c7\u05ca\5"+
		"x=\2\u05c8\u05ca\5\u00b2Z\2\u05c9\u05c7\3\2\2\2\u05c9\u05c8\3\2\2\2\u05ca"+
		"\u05cb\3\2\2\2\u05cb\u05cc\7\4\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05c4\3\2"+
		"\2\2\u05cd\u05c5\3\2\2\2\u05cd\u05c6\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf"+
		"\u05c3\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d2\3\2\2\2\u05d1\u05d3\5\u008a"+
		"F\2\u05d2\u05d1\3\2\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4"+
		"\u05d5\7\u00a9\2\2\u05d5\u05d7\7\u00f9\2\2\u05d6\u05d4\3\2\2\2\u05d6\u05d7"+
		"\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05da\5Z.\2\u05d9\u05d8\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u05dd\3\2\2\2\u05db\u05dc\7\24\2\2\u05dc\u05de\5"+
		"\u0096L\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u060c\3\2\2\2"+
		"\u05df\u05e3\7\r\2\2\u05e0\u05e2\5V,\2\u05e1\u05e0\3\2\2\2\u05e2\u05e5"+
		"\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5"+
		"\u05e3\3\2\2\2\u05e6\u05e8\5h\65\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8\3\2"+
		"\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\5\u0092J\2\u05ea\u05ec\5Z.\2\u05eb"+
		"\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05f6\3\2\2\2\u05ed\u05f3\5Z"+
		".\2\u05ee\u05f0\7\r\2\2\u05ef\u05f1\5h\65\2\u05f0\u05ef\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\5\u0092J\2\u05f3\u05ee"+
		"\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6\3\2\2\2\u05f5\u05df\3\2\2\2\u05f5"+
		"\u05ed\3\2\2\2\u05f6\u05fa\3\2\2\2\u05f7\u05f9\5f\64\2\u05f8\u05f7\3\2"+
		"\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05ff\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05fe\7\24\2\2\u05fe\u0600\5"+
		"\u0096L\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0602\3\2\2\2"+
		"\u0601\u0603\5\\/\2\u0602\u0601\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0606"+
		"\3\2\2\2\u0604\u0605\7\34\2\2\u0605\u0607\5\u0096L\2\u0606\u0604\3\2\2"+
		"\2\u0606\u0607\3\2\2\2\u0607\u0609\3\2\2\2\u0608\u060a\5\u00bc_\2\u0609"+
		"\u0608\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060c\3\2\2\2\u060b\u05b8\3\2"+
		"\2\2\u060b\u05f5\3\2\2\2\u060cU\3\2\2\2\u060d\u060e\7\7\2\2\u060e\u0615"+
		"\5X-\2\u060f\u0611\7\5\2\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0612\3\2\2\2\u0612\u0614\5X-\2\u0613\u0610\3\2\2\2\u0614\u0617\3\2\2"+
		"\2\u0615\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617\u0615"+
		"\3\2\2\2\u0618\u0619\7\b\2\2\u0619W\3\2\2\2\u061a\u0628\5\u00c8e\2\u061b"+
		"\u061c\5\u00c8e\2\u061c\u061d\7\3\2\2\u061d\u0622\5\u009cO\2\u061e\u061f"+
		"\7\5\2\2\u061f\u0621\5\u009cO\2\u0620\u061e\3\2\2\2\u0621\u0624\3\2\2"+
		"\2\u0622\u0620\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u0622"+
		"\3\2\2\2\u0625\u0626\7\4\2\2\u0626\u0628\3\2\2\2\u0627\u061a\3\2\2\2\u0627"+
		"\u061b\3\2\2\2\u0628Y\3\2\2\2\u0629\u062a\7\16\2\2\u062a\u062f\5j\66\2"+
		"\u062b\u062c\7\5\2\2\u062c\u062e\5j\66\2\u062d\u062b\3\2\2\2\u062e\u0631"+
		"\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0635\3\2\2\2\u0631"+
		"\u062f\3\2\2\2\u0632\u0634\5f\64\2\u0633\u0632\3\2\2\2\u0634\u0637\3\2"+
		"\2\2\u0635\u0633\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0639\3\2\2\2\u0637"+
		"\u0635\3\2\2\2\u0638\u063a\5`\61\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2"+
		"\2\2\u063a[\3\2\2\2\u063b\u063c\7\25\2\2\u063c\u063d\7\26\2\2\u063d\u0642"+
		"\5\u0094K\2\u063e\u063f\7\5\2\2\u063f\u0641\5\u0094K\2\u0640\u063e\3\2"+
		"\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2\2\2\u0643"+
		"\u0656\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0646\7O\2\2\u0646\u0657\7\32"+
		"\2\2\u0647\u0648\7O\2\2\u0648\u0657\7\31\2\2\u0649\u064a\7\27\2\2\u064a"+
		"\u064b\7\30\2\2\u064b\u064c\7\3\2\2\u064c\u0651\5^\60\2\u064d\u064e\7"+
		"\5\2\2\u064e\u0650\5^\60\2\u064f\u064d\3\2\2\2\u0650\u0653\3\2\2\2\u0651"+
		"\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0654\3\2\2\2\u0653\u0651\3\2"+
		"\2\2\u0654\u0655\7\4\2\2\u0655\u0657\3\2\2\2\u0656\u0645\3\2\2\2\u0656"+
		"\u0647\3\2\2\2\u0656\u0649\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0668\3\2"+
		"\2\2\u0658\u0659\7\25\2\2\u0659\u065a\7\26\2\2\u065a\u065b\7\27\2\2\u065b"+
		"\u065c\7\30\2\2\u065c\u065d\7\3\2\2\u065d\u0662\5^\60\2\u065e\u065f\7"+
		"\5\2\2\u065f\u0661\5^\60\2\u0660\u065e\3\2\2\2\u0661\u0664\3\2\2\2\u0662"+
		"\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0665\3\2\2\2\u0664\u0662\3\2"+
		"\2\2\u0665\u0666\7\4\2\2\u0666\u0668\3\2\2\2\u0667\u063b\3\2\2\2\u0667"+
		"\u0658\3\2\2\2\u0668]\3\2\2\2\u0669\u0672\7\3\2\2\u066a\u066f\5\u0094"+
		"K\2\u066b\u066c\7\5\2\2\u066c\u066e\5\u0094K\2\u066d\u066b\3\2\2\2\u066e"+
		"\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0673\3\2"+
		"\2\2\u0671\u066f\3\2\2\2\u0672\u066a\3\2\2\2\u0672\u0673\3\2\2\2\u0673"+
		"\u0674\3\2\2\2\u0674\u0677\7\4\2\2\u0675\u0677\5\u0094K\2\u0676\u0669"+
		"\3\2\2\2\u0676\u0675\3\2\2\2\u0677_\3\2\2\2\u0678\u0679\7@\2\2\u0679\u067a"+
		"\7\3\2\2\u067a\u067b\5\u0092J\2\u067b\u067c\7/\2\2\u067c\u067d\5b\62\2"+
		"\u067d\u067e\7!\2\2\u067e\u067f\7\3\2\2\u067f\u0684\5d\63\2\u0680\u0681"+
		"\7\5\2\2\u0681\u0683\5d\63\2\u0682\u0680\3\2\2\2\u0683\u0686\3\2\2\2\u0684"+
		"\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0687\3\2\2\2\u0686\u0684\3\2"+
		"\2\2\u0687\u0688\7\4\2\2\u0688\u0689\7\4\2\2\u0689a\3\2\2\2\u068a\u0697"+
		"\5\u00c8e\2\u068b\u068c\7\3\2\2\u068c\u0691\5\u00c8e\2\u068d\u068e\7\5"+
		"\2\2\u068e\u0690\5\u00c8e\2\u068f\u068d\3\2\2\2\u0690\u0693\3\2\2\2\u0691"+
		"\u068f\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0694\3\2\2\2\u0693\u0691\3\2"+
		"\2\2\u0694\u0695\7\4\2\2\u0695\u0697\3\2\2\2\u0696\u068a\3\2\2\2\u0696"+
		"\u068b\3\2\2\2\u0697c\3\2\2\2\u0698\u069d\5\u0094K\2\u0699\u069b\7\20"+
		"\2\2\u069a\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u069e\5\u00c8e\2\u069d\u069a\3\2\2\2\u069d\u069e\3\2\2\2\u069ee\3\2\2"+
		"\2\u069f\u06a0\7A\2\2\u06a0\u06a2\7T\2\2\u06a1\u06a3\78\2\2\u06a2\u06a1"+
		"\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a5\5\u00c6d"+
		"\2\u06a5\u06ae\7\3\2\2\u06a6\u06ab\5\u0094K\2\u06a7\u06a8\7\5\2\2\u06a8"+
		"\u06aa\5\u0094K\2\u06a9\u06a7\3\2\2\2\u06aa\u06ad\3\2\2\2\u06ab\u06a9"+
		"\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ae"+
		"\u06a6\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\7\4"+
		"\2\2\u06b1\u06bd\5\u00c8e\2\u06b2\u06b4\7\20\2\2\u06b3\u06b2\3\2\2\2\u06b3"+
		"\u06b4\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06ba\5\u00c8e\2\u06b6\u06b7"+
		"\7\5\2\2\u06b7\u06b9\5\u00c8e\2\u06b8\u06b6\3\2\2\2\u06b9\u06bc\3\2\2"+
		"\2\u06ba\u06b8\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06be\3\2\2\2\u06bc\u06ba"+
		"\3\2\2\2\u06bd\u06b3\3\2\2\2\u06bd\u06be\3\2\2\2\u06beg\3\2\2\2\u06bf"+
		"\u06c0\t\16\2\2\u06c0i\3\2\2\2\u06c1\u06c5\5\u0082B\2\u06c2\u06c4\5l\67"+
		"\2\u06c3\u06c2\3\2\2\2\u06c4\u06c7\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c5\u06c6"+
		"\3\2\2\2\u06c6k\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c8\u06c9\5n8\2\u06c9\u06ca"+
		"\7\66\2\2\u06ca\u06cc\5\u0082B\2\u06cb\u06cd\5p9\2\u06cc\u06cb\3\2\2\2"+
		"\u06cc\u06cd\3\2\2\2\u06cd\u06d4\3\2\2\2\u06ce\u06cf\7>\2\2\u06cf\u06d0"+
		"\5n8\2\u06d0\u06d1\7\66\2\2\u06d1\u06d2\5\u0082B\2\u06d2\u06d4\3\2\2\2"+
		"\u06d3\u06c8\3\2\2\2\u06d3\u06ce\3\2\2\2\u06d4m\3\2\2\2\u06d5\u06d7\7"+
		"9\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06ec\3\2\2\2\u06d8"+
		"\u06ec\7\67\2\2\u06d9\u06db\7:\2\2\u06da\u06dc\78\2\2\u06db\u06da\3\2"+
		"\2\2\u06db\u06dc\3\2\2\2\u06dc\u06ec\3\2\2\2\u06dd\u06de\7:\2\2\u06de"+
		"\u06ec\7;\2\2\u06df\u06e1\7<\2\2\u06e0\u06e2\78\2\2\u06e1\u06e0\3\2\2"+
		"\2\u06e1\u06e2\3\2\2\2\u06e2\u06ec\3\2\2\2\u06e3\u06e5\7=\2\2\u06e4\u06e6"+
		"\78\2\2\u06e5\u06e4\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06ec\3\2\2\2\u06e7"+
		"\u06e9\7:\2\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2"+
		"\2\2\u06ea\u06ec\7\u00f4\2\2\u06eb\u06d6\3\2\2\2\u06eb\u06d8\3\2\2\2\u06eb"+
		"\u06d9\3\2\2\2\u06eb\u06dd\3\2\2\2\u06eb\u06df\3\2\2\2\u06eb\u06e3\3\2"+
		"\2\2\u06eb\u06e8\3\2\2\2\u06eco\3\2\2\2\u06ed\u06ee\7?\2\2\u06ee\u06fc"+
		"\5\u0096L\2\u06ef\u06f0\7\u00a6\2\2\u06f0\u06f1\7\3\2\2\u06f1\u06f6\5"+
		"\u00c8e\2\u06f2\u06f3\7\5\2\2\u06f3\u06f5\5\u00c8e\2\u06f4\u06f2\3\2\2"+
		"\2\u06f5\u06f8\3\2\2\2\u06f6\u06f4\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f9"+
		"\3\2\2\2\u06f8\u06f6\3\2\2\2\u06f9\u06fa\7\4\2\2\u06fa\u06fc\3\2\2\2\u06fb"+
		"\u06ed\3\2\2\2\u06fb\u06ef\3\2\2\2\u06fcq\3\2\2\2\u06fd\u06fe\7m\2\2\u06fe"+
		"\u0700\7\3\2\2\u06ff\u0701\5t;\2\u0700\u06ff\3\2\2\2\u0700\u0701\3\2\2"+
		"\2\u0701\u0702\3\2\2\2\u0702\u0703\7\4\2\2\u0703s\3\2\2\2\u0704\u0706"+
		"\7\u0092\2\2\u0705\u0704\3\2\2\2\u0705\u0706\3\2\2\2\u0706\u0707\3\2\2"+
		"\2\u0707\u0708\t\17\2\2\u0708\u071d\7\u009c\2\2\u0709\u070a\5\u0094K\2"+
		"\u070a\u070b\7F\2\2\u070b\u071d\3\2\2\2\u070c\u070d\7\u009d\2\2\u070d"+
		"\u070e\7\u00fd\2\2\u070e\u070f\7\u009e\2\2\u070f\u0710\7\u009f\2\2\u0710"+
		"\u0719\7\u00fd\2\2\u0711\u0717\7?\2\2\u0712\u0718\5\u00c8e\2\u0713\u0714"+
		"\5\u00c6d\2\u0714\u0715\7\3\2\2\u0715\u0716\7\4\2\2\u0716\u0718\3\2\2"+
		"\2\u0717\u0712\3\2\2\2\u0717\u0713\3\2\2\2\u0718\u071a\3\2\2\2\u0719\u0711"+
		"\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u071d\3\2\2\2\u071b\u071d\5\u0094K"+
		"\2\u071c\u0705\3\2\2\2\u071c\u0709\3\2\2\2\u071c\u070c\3\2\2\2\u071c\u071b"+
		"\3\2\2\2\u071du\3\2\2\2\u071e\u071f\7\3\2\2\u071f\u0720\5x=\2\u0720\u0721"+
		"\7\4\2\2\u0721w\3\2\2\2\u0722\u0727\5\u00c8e\2\u0723\u0724\7\5\2\2\u0724"+
		"\u0726\5\u00c8e\2\u0725\u0723\3\2\2\2\u0726\u0729\3\2\2\2\u0727\u0725"+
		"\3\2\2\2\u0727\u0728\3\2\2\2\u0728y\3\2\2\2\u0729\u0727\3\2\2\2\u072a"+
		"\u072b\7\3\2\2\u072b\u0730\5|?\2\u072c\u072d\7\5\2\2\u072d\u072f\5|?\2"+
		"\u072e\u072c\3\2\2\2\u072f\u0732\3\2\2\2\u0730\u072e\3\2\2\2\u0730\u0731"+
		"\3\2\2\2\u0731\u0733\3\2\2\2\u0732\u0730\3\2\2\2\u0733\u0734\7\4\2\2\u0734"+
		"{\3\2\2\2\u0735\u0737\5\u00c8e\2\u0736\u0738\t\f\2\2\u0737\u0736\3\2\2"+
		"\2\u0737\u0738\3\2\2\2\u0738}\3\2\2\2\u0739\u073a\7\3\2\2\u073a\u073f"+
		"\5\u0080A\2\u073b\u073c\7\5\2\2\u073c\u073e\5\u0080A\2\u073d\u073b\3\2"+
		"\2\2\u073e\u0741\3\2\2\2\u073f\u073d\3\2\2\2\u073f\u0740\3\2\2\2\u0740"+
		"\u0742\3\2\2\2\u0741\u073f\3\2\2\2\u0742\u0743\7\4\2\2\u0743\177\3\2\2"+
		"\2\u0744\u0747\5\u00c8e\2\u0745\u0746\7t\2\2\u0746\u0748\7\u00f9\2\2\u0747"+
		"\u0745\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0081\3\2\2\2\u0749\u074b\5\u008c"+
		"G\2\u074a\u074c\5r:\2\u074b\u074a\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u074d"+
		"\3\2\2\2\u074d\u074e\5\u0088E\2\u074e\u0762\3\2\2\2\u074f\u0750\7\3\2"+
		"\2\u0750\u0751\5H%\2\u0751\u0753\7\4\2\2\u0752\u0754\5r:\2\u0753\u0752"+
		"\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\5\u0088E"+
		"\2\u0756\u0762\3\2\2\2\u0757\u0758\7\3\2\2\u0758\u0759\5j\66\2\u0759\u075b"+
		"\7\4\2\2\u075a\u075c\5r:\2\u075b\u075a\3\2\2\2\u075b\u075c\3\2\2\2\u075c"+
		"\u075d\3\2\2\2\u075d\u075e\5\u0088E\2\u075e\u0762\3\2\2\2\u075f\u0762"+
		"\5\u0084C\2\u0760\u0762\5\u0086D\2\u0761\u0749\3\2\2\2\u0761\u074f\3\2"+
		"\2\2\u0761\u0757\3\2\2\2\u0761\u075f\3\2\2\2\u0761\u0760\3\2\2\2\u0762"+
		"\u0083\3\2\2\2\u0763\u0764\7P\2\2\u0764\u0769\5\u0094K\2\u0765\u0766\7"+
		"\5\2\2\u0766\u0768\5\u0094K\2\u0767\u0765\3\2\2\2\u0768\u076b\3\2\2\2"+
		"\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c\3\2\2\2\u076b\u0769"+
		"\3\2\2\2\u076c\u076d\5\u0088E\2\u076d\u0085\3\2\2\2\u076e\u076f\5\u00c8"+
		"e\2\u076f\u0778\7\3\2\2\u0770\u0775\5\u0094K\2\u0771\u0772\7\5\2\2\u0772"+
		"\u0774\5\u0094K\2\u0773\u0771\3\2\2\2\u0774\u0777\3\2\2\2\u0775\u0773"+
		"\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0778"+
		"\u0770\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\7\4"+
		"\2\2\u077b\u077c\5\u0088E\2\u077c\u0087\3\2\2\2\u077d\u077f\7\20\2\2\u077e"+
		"\u077d\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0780\3\2\2\2\u0780\u0782\5\u00ca"+
		"f\2\u0781\u0783\5v<\2\u0782\u0781\3\2\2\2\u0782\u0783\3\2\2\2\u0783\u0785"+
		"\3\2\2\2\u0784\u077e\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0089\3\2\2\2\u0786"+
		"\u0787\7N\2\2\u0787\u0788\7[\2\2\u0788\u0789\7\u00a7\2\2\u0789\u078d\7"+
		"\u00f9\2\2\u078a\u078b\7O\2\2\u078b\u078c\7\u00a8\2\2\u078c\u078e\5\64"+
		"\33\2\u078d\u078a\3\2\2\2\u078d\u078e\3\2\2\2\u078e\u07b8\3\2\2\2\u078f"+
		"\u0790\7N\2\2\u0790\u0791\7[\2\2\u0791\u079b\7\u00ab\2\2\u0792\u0793\7"+
		"\u00ac\2\2\u0793\u0794\7\u00ad\2\2\u0794\u0795\7\26\2\2\u0795\u0799\7"+
		"\u00f9\2\2\u0796\u0797\7\u00b1\2\2\u0797\u0798\7\26\2\2\u0798\u079a\7"+
		"\u00f9\2\2\u0799\u0796\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2\2\2"+
		"\u079b\u0792\3\2\2\2\u079b\u079c\3\2\2\2\u079c\u07a2\3\2\2\2\u079d\u079e"+
		"\7\u00ae\2\2\u079e\u079f\7\u00af\2\2\u079f\u07a0\7\u00ad\2\2\u07a0\u07a1"+
		"\7\26\2\2\u07a1\u07a3\7\u00f9\2\2\u07a2\u079d\3\2\2\2\u07a2\u07a3\3\2"+
		"\2\2\u07a3\u07a9\3\2\2\2\u07a4\u07a5\7r\2\2\u07a5\u07a6\7\u00b0\2\2\u07a6"+
		"\u07a7\7\u00ad\2\2\u07a7\u07a8\7\26\2\2\u07a8\u07aa\7\u00f9\2\2\u07a9"+
		"\u07a4\3\2\2\2\u07a9\u07aa\3\2\2\2\u07aa\u07af\3\2\2\2\u07ab\u07ac\7\u00b2"+
		"\2\2\u07ac\u07ad\7\u00ad\2\2\u07ad\u07ae\7\26\2\2\u07ae\u07b0\7\u00f9"+
		"\2\2\u07af\u07ab\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b5\3\2\2\2\u07b1"+
		"\u07b2\7)\2\2\u07b2\u07b3\7\u00e0\2\2\u07b3\u07b4\7\20\2\2\u07b4\u07b6"+
		"\7\u00f9\2\2\u07b5\u07b1\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07b8\3\2\2"+
		"\2\u07b7\u0786\3\2\2\2\u07b7\u078f\3\2\2\2\u07b8\u008b\3\2\2\2\u07b9\u07ba"+
		"\5\u00c8e\2\u07ba\u07bb\7\6\2\2\u07bb\u07bd\3\2\2\2\u07bc\u07b9\3\2\2"+
		"\2\u07bc\u07bd\3\2\2\2\u07bd\u07be\3\2\2\2\u07be\u07bf\5\u00c8e\2\u07bf"+
		"\u008d\3\2\2\2\u07c0\u07c1\5\u00c8e\2\u07c1\u07c2\7\6\2\2\u07c2\u07c4"+
		"\3\2\2\2\u07c3\u07c0\3\2\2\2\u07c3\u07c4\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5"+
		"\u07c6\5\u00c8e\2\u07c6\u008f\3\2\2\2\u07c7\u07cf\5\u0094K\2\u07c8\u07ca"+
		"\7\20\2\2\u07c9\u07c8\3\2\2\2\u07c9\u07ca\3\2\2\2\u07ca\u07cd\3\2\2\2"+
		"\u07cb\u07ce\5\u00c8e\2\u07cc\u07ce\5v<\2\u07cd\u07cb\3\2\2\2\u07cd\u07cc"+
		"\3\2\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07c9\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u0091\3\2\2\2\u07d1\u07d6\5\u0090I\2\u07d2\u07d3\7\5\2\2\u07d3\u07d5"+
		"\5\u0090I\2\u07d4\u07d2\3\2\2\2\u07d5\u07d8\3\2\2\2\u07d6\u07d4\3\2\2"+
		"\2\u07d6\u07d7\3\2\2\2\u07d7\u0093\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d9\u07da"+
		"\5\u0096L\2\u07da\u0095\3\2\2\2\u07db\u07dc\bL\1\2\u07dc\u07dd\7\"\2\2"+
		"\u07dd\u07e8\5\u0096L\7\u07de\u07df\7$\2\2\u07df\u07e0\7\3\2\2\u07e0\u07e1"+
		"\5 \21\2\u07e1\u07e2\7\4\2\2\u07e2\u07e8\3\2\2\2\u07e3\u07e5\5\u009aN"+
		"\2\u07e4\u07e6\5\u0098M\2\u07e5\u07e4\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6"+
		"\u07e8\3\2\2\2\u07e7\u07db\3\2\2\2\u07e7\u07de\3\2\2\2\u07e7\u07e3\3\2"+
		"\2\2\u07e8\u07f1\3\2\2\2\u07e9\u07ea\f\4\2\2\u07ea\u07eb\7 \2\2\u07eb"+
		"\u07f0\5\u0096L\5\u07ec\u07ed\f\3\2\2\u07ed\u07ee\7\37\2\2\u07ee\u07f0"+
		"\5\u0096L\4\u07ef\u07e9\3\2\2\2\u07ef\u07ec\3\2\2\2\u07f0\u07f3\3\2\2"+
		"\2\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u0097\3\2\2\2\u07f3\u07f1"+
		"\3\2\2\2\u07f4\u07f6\7\"\2\2\u07f5\u07f4\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u07f7\3\2\2\2\u07f7\u07f8\7%\2\2\u07f8\u07f9\5\u009aN\2\u07f9\u07fa\7"+
		" \2\2\u07fa\u07fb\5\u009aN\2\u07fb\u0825\3\2\2\2\u07fc\u07fe\7\"\2\2\u07fd"+
		"\u07fc\3\2\2\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0800\7!"+
		"\2\2\u0800\u0801\7\3\2\2\u0801\u0806\5\u0094K\2\u0802\u0803\7\5\2\2\u0803"+
		"\u0805\5\u0094K\2\u0804\u0802\3\2\2\2\u0805\u0808\3\2\2\2\u0806\u0804"+
		"\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3\2\2\2\u0808\u0806\3\2\2\2\u0809"+
		"\u080a\7\4\2\2\u080a\u0825\3\2\2\2\u080b\u080d\7\"\2\2\u080c\u080b\3\2"+
		"\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f\7!\2\2\u080f"+
		"\u0810\7\3\2\2\u0810\u0811\5 \21\2\u0811\u0812\7\4\2\2\u0812\u0825\3\2"+
		"\2\2\u0813\u0815\7\"\2\2\u0814\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815"+
		"\u0816\3\2\2\2\u0816\u0817\t\20\2\2\u0817\u0825\5\u009aN\2\u0818\u081a"+
		"\7(\2\2\u0819\u081b\7\"\2\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b"+
		"\u081c\3\2\2\2\u081c\u0825\7)\2\2\u081d\u081f\7(\2\2\u081e\u0820\7\"\2"+
		"\2\u081f\u081e\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0822"+
		"\7\23\2\2\u0822\u0823\7\16\2\2\u0823\u0825\5\u009aN\2\u0824\u07f5\3\2"+
		"\2\2\u0824\u07fd\3\2\2\2\u0824\u080c\3\2\2\2\u0824\u0814\3\2\2\2\u0824"+
		"\u0818\3\2\2\2\u0824\u081d\3\2\2\2\u0825\u0099\3\2\2\2\u0826\u0827\bN"+
		"\1\2\u0827\u082b\5\u009cO\2\u0828\u0829\t\21\2\2\u0829\u082b\5\u009aN"+
		"\t\u082a\u0826\3\2\2\2\u082a\u0828\3\2\2\2\u082b\u0841\3\2\2\2\u082c\u082d"+
		"\f\b\2\2\u082d\u082e\t\22\2\2\u082e\u0840\5\u009aN\t\u082f\u0830\f\7\2"+
		"\2\u0830\u0831\t\23\2\2\u0831\u0840\5\u009aN\b\u0832\u0833\f\6\2\2\u0833"+
		"\u0834\7\u0098\2\2\u0834\u0840\5\u009aN\7\u0835\u0836\f\5\2\2\u0836\u0837"+
		"\7\u009b\2\2\u0837\u0840\5\u009aN\6\u0838\u0839\f\4\2\2\u0839\u083a\7"+
		"\u0099\2\2\u083a\u0840\5\u009aN\5\u083b\u083c\f\3\2\2\u083c\u083d\5\u00a0"+
		"Q\2\u083d\u083e\5\u009aN\4\u083e\u0840\3\2\2\2\u083f\u082c\3\2\2\2\u083f"+
		"\u082f\3\2\2\2\u083f\u0832\3\2\2\2\u083f\u0835\3\2\2\2\u083f\u0838\3\2"+
		"\2\2\u083f\u083b\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0841"+
		"\u0842\3\2\2\2\u0842\u009b\3\2\2\2\u0843\u0841\3\2\2\2\u0844\u0845\bO"+
		"\1\2\u0845\u0847\7\61\2\2\u0846\u0848\5\u00ba^\2\u0847\u0846\3\2\2\2\u0848"+
		"\u0849\3\2\2\2\u0849\u0847\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u084d\3\2"+
		"\2\2\u084b\u084c\7\64\2\2\u084c\u084e\5\u0094K\2\u084d\u084b\3\2\2\2\u084d"+
		"\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0850\7\65\2\2\u0850\u08d6\3"+
		"\2\2\2\u0851\u0852\7\61\2\2\u0852\u0854\5\u0094K\2\u0853\u0855\5\u00ba"+
		"^\2\u0854\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0854\3\2\2\2\u0856"+
		"\u0857\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0859\7\64\2\2\u0859\u085b\5"+
		"\u0094K\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\3\2\2\2"+
		"\u085c\u085d\7\65\2\2\u085d\u08d6\3\2\2\2\u085e\u085f\7_\2\2\u085f\u0860"+
		"\7\3\2\2\u0860\u0861\5\u0094K\2\u0861\u0862\7\20\2\2\u0862\u0863\5\u00b0"+
		"Y\2\u0863\u0864\7\4\2\2\u0864\u08d6\3\2\2\2\u0865\u0866\7s\2\2\u0866\u086f"+
		"\7\3\2\2\u0867\u086c\5\u0090I\2\u0868\u0869\7\5\2\2\u0869\u086b\5\u0090"+
		"I\2\u086a\u0868\3\2\2\2\u086b\u086e\3\2\2\2\u086c\u086a\3\2\2\2\u086c"+
		"\u086d\3\2\2\2\u086d\u0870\3\2\2\2\u086e\u086c\3\2\2\2\u086f\u0867\3\2"+
		"\2\2\u086f\u0870\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u08d6\7\4\2\2\u0872"+
		"\u0873\7K\2\2\u0873\u0874\7\3\2\2\u0874\u0877\5\u0094K\2\u0875\u0876\7"+
		"~\2\2\u0876\u0878\7,\2\2\u0877\u0875\3\2\2\2\u0877\u0878\3\2\2\2\u0878"+
		"\u0879\3\2\2\2\u0879\u087a\7\4\2\2\u087a\u08d6\3\2\2\2\u087b\u087c\7M"+
		"\2\2\u087c\u087d\7\3\2\2\u087d\u0880\5\u0094K\2\u087e\u087f\7~\2\2\u087f"+
		"\u0881\7,\2\2\u0880\u087e\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\3\2"+
		"\2\2\u0882\u0883\7\4\2\2\u0883\u08d6\3\2\2\2\u0884\u0885\7\u0087\2\2\u0885"+
		"\u0886\7\3\2\2\u0886\u0887\5\u009aN\2\u0887\u0888\7!\2\2\u0888\u0889\5"+
		"\u009aN\2\u0889\u088a\7\4\2\2\u088a\u08d6\3\2\2\2\u088b\u08d6\5\u009e"+
		"P\2\u088c\u08d6\7\u0093\2\2\u088d\u088e\5\u00c6d\2\u088e\u088f\7\6\2\2"+
		"\u088f\u0890\7\u0093\2\2\u0890\u08d6\3\2\2\2\u0891\u0892\7\3\2\2\u0892"+
		"\u0895\5\u0090I\2\u0893\u0894\7\5\2\2\u0894\u0896\5\u0090I\2\u0895\u0893"+
		"\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0895\3\2\2\2\u0897\u0898\3\2\2\2\u0898"+
		"\u0899\3\2\2\2\u0899\u089a\7\4\2\2\u089a\u08d6\3\2\2\2\u089b\u089c\7\3"+
		"\2\2\u089c\u089d\5 \21\2\u089d\u089e\7\4\2\2\u089e\u08d6\3\2\2\2\u089f"+
		"\u08a0\5\u00c6d\2\u08a0\u08ac\7\3\2\2\u08a1\u08a3\5h\65\2\u08a2\u08a1"+
		"\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4\u08a9\5\u0094K"+
		"\2\u08a5\u08a6\7\5\2\2\u08a6\u08a8\5\u0094K\2\u08a7\u08a5\3\2\2\2\u08a8"+
		"\u08ab\3\2\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ad\3\2"+
		"\2\2\u08ab\u08a9\3\2\2\2\u08ac\u08a2\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad"+
		"\u08ae\3\2\2\2\u08ae\u08b1\7\4\2\2\u08af\u08b0\7C\2\2\u08b0\u08b2\5\u00c0"+
		"a\2\u08b1\u08af\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08d6\3\2\2\2\u08b3"+
		"\u08b4\5\u00c6d\2\u08b4\u08b5\7\3\2\2\u08b5\u08b6\t\24\2\2\u08b6\u08b7"+
		"\5\u0094K\2\u08b7\u08b8\7\16\2\2\u08b8\u08b9\5\u0094K\2\u08b9\u08ba\7"+
		"\4\2\2\u08ba\u08d6\3\2\2\2\u08bb\u08bc\7\u0101\2\2\u08bc\u08bd\7\t\2\2"+
		"\u08bd\u08d6\5\u0094K\2\u08be\u08bf\7\3\2\2\u08bf\u08c2\7\u0101\2\2\u08c0"+
		"\u08c1\7\5\2\2\u08c1\u08c3\7\u0101\2\2\u08c2\u08c0\3\2\2\2\u08c3\u08c4"+
		"\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6"+
		"\u08c7\7\4\2\2\u08c7\u08c8\7\t\2\2\u08c8\u08d6\5\u0094K\2\u08c9\u08d6"+
		"\5\u00c8e\2\u08ca\u08cb\7\3\2\2\u08cb\u08cc\5\u0094K\2\u08cc\u08cd\7\4"+
		"\2\2\u08cd\u08d6\3\2\2\2\u08ce\u08cf\7\u0088\2\2\u08cf\u08d0\7\3\2\2\u08d0"+
		"\u08d1\5\u00c8e\2\u08d1\u08d2\7\16\2\2\u08d2\u08d3\5\u009aN\2\u08d3\u08d4"+
		"\7\4\2\2\u08d4\u08d6\3\2\2\2\u08d5\u0844\3\2\2\2\u08d5\u0851\3\2\2\2\u08d5"+
		"\u085e\3\2\2\2\u08d5\u0865\3\2\2\2\u08d5\u0872\3\2\2\2\u08d5\u087b\3\2"+
		"\2\2\u08d5\u0884\3\2\2\2\u08d5\u088b\3\2\2\2\u08d5\u088c\3\2\2\2\u08d5"+
		"\u088d\3\2\2\2\u08d5\u0891\3\2\2\2\u08d5\u089b\3\2\2\2\u08d5\u089f\3\2"+
		"\2\2\u08d5\u08b3\3\2\2\2\u08d5\u08bb\3\2\2\2\u08d5\u08be\3\2\2\2\u08d5"+
		"\u08c9\3\2\2\2\u08d5\u08ca\3\2\2\2\u08d5\u08ce\3\2\2\2\u08d6\u08e1\3\2"+
		"\2\2\u08d7\u08d8\f\7\2\2\u08d8\u08d9\7\n\2\2\u08d9\u08da\5\u009aN\2\u08da"+
		"\u08db\7\13\2\2\u08db\u08e0\3\2\2\2\u08dc\u08dd\f\5\2\2\u08dd\u08de\7"+
		"\6\2\2\u08de\u08e0\5\u00c8e\2\u08df\u08d7\3\2\2\2\u08df\u08dc\3\2\2\2"+
		"\u08e0\u08e3\3\2\2\2\u08e1\u08df\3\2\2\2\u08e1\u08e2\3\2\2\2\u08e2\u009d"+
		"\3\2\2\2\u08e3\u08e1\3\2\2\2\u08e4\u08f1\7)\2\2\u08e5\u08f1\5\u00a8U\2"+
		"\u08e6\u08e7\5\u00c8e\2\u08e7\u08e8\7\u00f9\2\2\u08e8\u08f1\3\2\2\2\u08e9"+
		"\u08f1\5\u00ceh\2\u08ea\u08f1\5\u00a6T\2\u08eb\u08ed\7\u00f9\2\2\u08ec"+
		"\u08eb\3\2\2\2\u08ed\u08ee\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2"+
		"\2\2\u08ef\u08f1\3\2\2\2\u08f0\u08e4\3\2\2\2\u08f0\u08e5\3\2\2\2\u08f0"+
		"\u08e6\3\2\2\2\u08f0\u08e9\3\2\2\2\u08f0\u08ea\3\2\2\2\u08f0\u08ec\3\2"+
		"\2\2\u08f1\u009f\3\2\2\2\u08f2\u08f3\t\25\2\2\u08f3\u00a1\3\2\2\2\u08f4"+
		"\u08f5\t\26\2\2\u08f5\u00a3\3\2\2\2\u08f6\u08f7\t\27\2\2\u08f7\u00a5\3"+
		"\2\2\2\u08f8\u08f9\t\30\2\2\u08f9\u00a7\3\2\2\2\u08fa\u08fe\7\60\2\2\u08fb"+
		"\u08fd\5\u00aaV\2\u08fc\u08fb\3\2\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc"+
		"\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u00a9\3\2\2\2\u0900\u08fe\3\2\2\2\u0901"+
		"\u0902\5\u00acW\2\u0902\u0905\5\u00c8e\2\u0903\u0904\7l\2\2\u0904\u0906"+
		"\5\u00c8e\2\u0905\u0903\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u00ab\3\2\2"+
		"\2\u0907\u0909\t\31";
	private static final String _serializedATNSegment1 =
		"\2\2\u0908\u0907\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\3\2\2\2\u090a"+
		"\u090d\t\17\2\2\u090b\u090d\7\u00f9\2\2\u090c\u0908\3\2\2\2\u090c\u090b"+
		"\3\2\2\2\u090d\u00ad\3\2\2\2\u090e\u0912\7K\2\2\u090f\u0910\7L\2\2\u0910"+
		"\u0912\5\u00c8e\2\u0911\u090e\3\2\2\2\u0911\u090f\3\2\2\2\u0912\u00af"+
		"\3\2\2\2\u0913\u0914\7q\2\2\u0914\u0915\7\u008d\2\2\u0915\u0916\5\u00b0"+
		"Y\2\u0916\u0917\7\u008f\2\2\u0917\u0936\3\2\2\2\u0918\u0919\7r\2\2\u0919"+
		"\u091a\7\u008d\2\2\u091a\u091b\5\u00b0Y\2\u091b\u091c\7\5\2\2\u091c\u091d"+
		"\5\u00b0Y\2\u091d\u091e\7\u008f\2\2\u091e\u0936\3\2\2\2\u091f\u0926\7"+
		"s\2\2\u0920\u0922\7\u008d\2\2\u0921\u0923\5\u00b6\\\2\u0922\u0921\3\2"+
		"\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2\u0924\u0927\7\u008f\2\2\u0925"+
		"\u0927\7\u008b\2\2\u0926\u0920\3\2\2\2\u0926\u0925\3\2\2\2\u0927\u0936"+
		"\3\2\2\2\u0928\u0933\5\u00c8e\2\u0929\u092a\7\3\2\2\u092a\u092f\7\u00fd"+
		"\2\2\u092b\u092c\7\5\2\2\u092c\u092e\7\u00fd\2\2\u092d\u092b\3\2\2\2\u092e"+
		"\u0931\3\2\2\2\u092f\u092d\3\2\2\2\u092f\u0930\3\2\2\2\u0930\u0932\3\2"+
		"\2\2\u0931\u092f\3\2\2\2\u0932\u0934\7\4\2\2\u0933\u0929\3\2\2\2\u0933"+
		"\u0934\3\2\2\2\u0934\u0936\3\2\2\2\u0935\u0913\3\2\2\2\u0935\u0918\3\2"+
		"\2\2\u0935\u091f\3\2\2\2\u0935\u0928\3\2\2\2\u0936\u00b1\3\2\2\2\u0937"+
		"\u093c\5\u00b4[\2\u0938\u0939\7\5\2\2\u0939\u093b\5\u00b4[\2\u093a\u0938"+
		"\3\2\2\2\u093b\u093e\3\2\2\2\u093c\u093a\3\2\2\2\u093c\u093d\3\2\2\2\u093d"+
		"\u00b3\3\2\2\2\u093e\u093c\3\2\2\2\u093f\u0940\5\u00c8e\2\u0940\u0943"+
		"\5\u00b0Y\2\u0941\u0942\7t\2\2\u0942\u0944\7\u00f9\2\2\u0943\u0941\3\2"+
		"\2\2\u0943\u0944\3\2\2\2\u0944\u00b5\3\2\2\2\u0945\u094a\5\u00b8]\2\u0946"+
		"\u0947\7\5\2\2\u0947\u0949\5\u00b8]\2\u0948\u0946\3\2\2\2\u0949\u094c"+
		"\3\2\2\2\u094a\u0948\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u00b7\3\2\2\2\u094c"+
		"\u094a\3\2\2\2\u094d\u094e\5\u00c8e\2\u094e\u094f\7\f\2\2\u094f\u0952"+
		"\5\u00b0Y\2\u0950\u0951\7t\2\2\u0951\u0953\7\u00f9\2\2\u0952\u0950\3\2"+
		"\2\2\u0952\u0953\3\2\2\2\u0953\u00b9\3\2\2\2\u0954\u0955\7\62\2\2\u0955"+
		"\u0956\5\u0094K\2\u0956\u0957\7\63\2\2\u0957\u0958\5\u0094K\2\u0958\u00bb"+
		"\3\2\2\2\u0959\u095a\7B\2\2\u095a\u095f\5\u00be`\2\u095b\u095c\7\5\2\2"+
		"\u095c\u095e\5\u00be`\2\u095d\u095b\3\2\2\2\u095e\u0961\3\2\2\2\u095f"+
		"\u095d\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u00bd\3\2\2\2\u0961\u095f\3\2"+
		"\2\2\u0962\u0963\5\u00c8e\2\u0963\u0964\7\20\2\2\u0964\u0965\5\u00c0a"+
		"\2\u0965\u00bf\3\2\2\2\u0966\u0991\5\u00c8e\2\u0967\u098a\7\3\2\2\u0968"+
		"\u0969\7\u00a1\2\2\u0969\u096a\7\26\2\2\u096a\u096f\5\u0094K\2\u096b\u096c"+
		"\7\5\2\2\u096c\u096e\5\u0094K\2\u096d\u096b\3\2\2\2\u096e\u0971\3\2\2"+
		"\2\u096f\u096d\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u098b\3\2\2\2\u0971\u096f"+
		"\3\2\2\2\u0972\u0973\t\32\2\2\u0973\u0974\7\26\2\2\u0974\u0979\5\u0094"+
		"K\2\u0975\u0976\7\5\2\2\u0976\u0978\5\u0094K\2\u0977\u0975\3\2\2\2\u0978"+
		"\u097b\3\2\2\2\u0979\u0977\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u097d\3\2"+
		"\2\2\u097b\u0979\3\2\2\2\u097c\u0972\3\2\2\2\u097c\u097d\3\2\2\2\u097d"+
		"\u0988\3\2\2\2\u097e\u097f\t\33\2\2\u097f\u0980\7\26\2\2\u0980\u0985\5"+
		"R*\2\u0981\u0982\7\5\2\2\u0982\u0984\5R*\2\u0983\u0981\3\2\2\2\u0984\u0987"+
		"\3\2\2\2\u0985\u0983\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0989\3\2\2\2\u0987"+
		"\u0985\3\2\2\2\u0988\u097e\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098b\3\2"+
		"\2\2\u098a\u0968\3\2\2\2\u098a\u097c\3\2\2\2\u098b\u098d\3\2\2\2\u098c"+
		"\u098e\5\u00c2b\2\u098d\u098c\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u098f"+
		"\3\2\2\2\u098f\u0991\7\4\2\2\u0990\u0966\3\2\2\2\u0990\u0967\3\2\2\2\u0991"+
		"\u00c1\3\2\2\2\u0992\u0993\7E\2\2\u0993\u09a3\5\u00c4c\2\u0994\u0995\7"+
		"F\2\2\u0995\u09a3\5\u00c4c\2\u0996\u0997\7E\2\2\u0997\u0998\7%\2\2\u0998"+
		"\u0999\5\u00c4c\2\u0999\u099a\7 \2\2\u099a\u099b\5\u00c4c\2\u099b\u09a3"+
		"\3\2\2\2\u099c\u099d\7F\2\2\u099d\u099e\7%\2\2\u099e\u099f\5\u00c4c\2"+
		"\u099f\u09a0\7 \2\2\u09a0\u09a1\5\u00c4c\2\u09a1\u09a3\3\2\2\2\u09a2\u0992"+
		"\3\2\2\2\u09a2\u0994\3\2\2\2\u09a2\u0996\3\2\2\2\u09a2\u099c\3\2\2\2\u09a3"+
		"\u00c3\3\2\2\2\u09a4\u09a5\7G\2\2\u09a5\u09ac\t\34\2\2\u09a6\u09a7\7J"+
		"\2\2\u09a7\u09ac\7N\2\2\u09a8\u09a9\5\u0094K\2\u09a9\u09aa\t\34\2\2\u09aa"+
		"\u09ac\3\2\2\2\u09ab\u09a4\3\2\2\2\u09ab\u09a6\3\2\2\2\u09ab\u09a8\3\2"+
		"\2\2\u09ac\u00c5\3\2\2\2\u09ad\u09b2\5\u00c8e\2\u09ae\u09af\7\6\2\2\u09af"+
		"\u09b1\5\u00c8e\2\u09b0\u09ae\3\2\2\2\u09b1\u09b4\3\2\2\2\u09b2\u09b0"+
		"\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u00c7\3\2\2\2\u09b4\u09b2\3\2\2\2\u09b5"+
		"\u09c5\5\u00caf\2\u09b6\u09c5\7\u00f4\2\2\u09b7\u09c5\7=\2\2\u09b8\u09c5"+
		"\79\2\2\u09b9\u09c5\7:\2\2\u09ba\u09c5\7;\2\2\u09bb\u09c5\7<\2\2\u09bc"+
		"\u09c5\7>\2\2\u09bd\u09c5\7\66\2\2\u09be\u09c5\7\67\2\2\u09bf\u09c5\7"+
		"?\2\2\u09c0\u09c5\7h\2\2\u09c1\u09c5\7k\2\2\u09c2\u09c5\7i\2\2\u09c3\u09c5"+
		"\7j\2\2\u09c4\u09b5\3\2\2\2\u09c4\u09b6\3\2\2\2\u09c4\u09b7\3\2\2\2\u09c4"+
		"\u09b8\3\2\2\2\u09c4\u09b9\3\2\2\2\u09c4\u09ba\3\2\2\2\u09c4\u09bb\3\2"+
		"\2\2\u09c4\u09bc\3\2\2\2\u09c4\u09bd\3\2\2\2\u09c4\u09be\3\2\2\2\u09c4"+
		"\u09bf\3\2\2\2\u09c4\u09c0\3\2\2\2\u09c4\u09c1\3\2\2\2\u09c4\u09c2\3\2"+
		"\2\2\u09c4\u09c3\3\2\2\2\u09c5\u00c9\3\2\2\2\u09c6\u09ca\7\u0101\2\2\u09c7"+
		"\u09ca\5\u00ccg\2\u09c8\u09ca\5\u00d0i\2\u09c9\u09c6\3\2\2\2\u09c9\u09c7"+
		"\3\2\2\2\u09c9\u09c8\3\2\2\2\u09ca\u00cb\3\2\2\2\u09cb\u09cc\7\u0102\2"+
		"\2\u09cc\u00cd\3\2\2\2\u09cd\u09cf\7\u0092\2\2\u09ce\u09cd\3\2\2\2\u09ce"+
		"\u09cf\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09ea\7\u00fe\2\2\u09d1\u09d3"+
		"\7\u0092\2\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\3\2\2"+
		"\2\u09d4\u09ea\7\u00fd\2\2\u09d5\u09d7\7\u0092\2\2\u09d6\u09d5\3\2\2\2"+
		"\u09d6\u09d7\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09ea\7\u00fa\2\2\u09d9"+
		"\u09db\7\u0092\2\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc"+
		"\3\2\2\2\u09dc\u09ea\7\u00fb\2\2\u09dd\u09df\7\u0092\2\2\u09de\u09dd\3"+
		"\2\2\2\u09de\u09df\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09ea\7\u00fc\2\2"+
		"\u09e1\u09e3\7\u0092\2\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3"+
		"\u09e4\3\2\2\2\u09e4\u09ea\7\u00ff\2\2\u09e5\u09e7\7\u0092\2\2\u09e6\u09e5"+
		"\3\2\2\2\u09e6\u09e7\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\7\u0100\2"+
		"\2\u09e9\u09ce\3\2\2\2\u09e9\u09d2\3\2\2\2\u09e9\u09d6\3\2\2\2\u09e9\u09da"+
		"\3\2\2\2\u09e9\u09de\3\2\2\2\u09e9\u09e2\3\2\2\2\u09e9\u09e6\3\2\2\2\u09ea"+
		"\u00cf\3\2\2\2\u09eb\u09ec\t\35\2\2\u09ec\u00d1\3\2\2\2\u0153\u00ec\u00f1"+
		"\u00f4\u00f9\u0106\u010a\u0111\u011f\u0121\u0126\u0129\u012c\u0133\u0144"+
		"\u0146\u014b\u014e\u0151\u0158\u015e\u0164\u016c\u018c\u0194\u0198\u019d"+
		"\u01a3\u01ab\u01b1\u01be\u01c3\u01cc\u01d1\u01e1\u01e8\u01ec\u01f4\u01fb"+
		"\u0202\u0211\u0215\u021b\u0221\u0224\u0227\u022d\u0231\u0235\u023a\u023e"+
		"\u0246\u0249\u0252\u0257\u025d\u0264\u0267\u026d\u0278\u027b\u027f\u0284"+
		"\u0289\u0290\u0293\u0296\u029d\u02a2\u02a7\u02aa\u02b3\u02bb\u02c1\u02c5"+
		"\u02c9\u02cd\u02cf\u02d8\u02de\u02e3\u02e6\u02ea\u02ed\u02f7\u02fa\u02fe"+
		"\u0303\u0306\u030c\u0314\u0319\u031f\u0325\u0330\u0338\u033f\u0347\u034e"+
		"\u0358\u035e\u0369\u0372\u0378\u037d\u0383\u0386\u0391\u03a0\u03a4\u03ab"+
		"\u041f\u0427\u042f\u0438\u0444\u0448\u044b\u0451\u045b\u0467\u046c\u0472"+
		"\u047e\u0480\u0485\u0489\u048e\u0493\u0496\u049b\u049f\u04a4\u04a6\u04aa"+
		"\u04b3\u04bb\u04c2\u04c9\u04d2\u04d7\u04e6\u04ed\u04f0\u04f7\u04fb\u0501"+
		"\u0509\u0514\u051f\u0526\u052c\u0532\u053b\u053d\u0546\u0549\u0552\u0555"+
		"\u055e\u0561\u056a\u056d\u0570\u0575\u0577\u057a\u0586\u058d\u0594\u0597"+
		"\u0599\u05a4\u05a8\u05ac\u05b8\u05bb\u05bf\u05c9\u05cd\u05cf\u05d2\u05d6"+
		"\u05d9\u05dd\u05e3\u05e7\u05eb\u05f0\u05f3\u05f5\u05fa\u05ff\u0602\u0606"+
		"\u0609\u060b\u0610\u0615\u0622\u0627\u062f\u0635\u0639\u0642\u0651\u0656"+
		"\u0662\u0667\u066f\u0672\u0676\u0684\u0691\u0696\u069a\u069d\u06a2\u06ab"+
		"\u06ae\u06b3\u06ba\u06bd\u06c5\u06cc\u06d3\u06d6\u06db\u06e1\u06e5\u06e8"+
		"\u06eb\u06f6\u06fb\u0700\u0705\u0717\u0719\u071c\u0727\u0730\u0737\u073f"+
		"\u0747\u074b\u0753\u075b\u0761\u0769\u0775\u0778\u077e\u0782\u0784\u078d"+
		"\u0799\u079b\u07a2\u07a9\u07af\u07b5\u07b7\u07bc\u07c3\u07c9\u07cd\u07cf"+
		"\u07d6\u07e5\u07e7\u07ef\u07f1\u07f5\u07fd\u0806\u080c\u0814\u081a\u081f"+
		"\u0824\u082a\u083f\u0841\u0849\u084d\u0856\u085a\u086c\u086f\u0877\u0880"+
		"\u0897\u08a2\u08a9\u08ac\u08b1\u08c4\u08d5\u08df\u08e1\u08ee\u08f0\u08fe"+
		"\u0905\u0908\u090c\u0911\u0922\u0926\u092f\u0933\u0935\u093c\u0943\u094a"+
		"\u0952\u095f\u096f\u0979\u097c\u0985\u0988\u098a\u098d\u0990\u09a2\u09ab"+
		"\u09b2\u09c4\u09c9\u09ce\u09d2\u09d6\u09da\u09de\u09e2\u09e6\u09e9";
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