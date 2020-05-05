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
		SHOW=94, TABLES=95, COLUMNS=96, COLUMN=97, UPDATE=98, USE=99, PARTITIONS=100, 
		FUNCTIONS=101, DROP=102, UNION=103, EXCEPT=104, SETMINUS=105, INTERSECT=106, 
		TO=107, TABLESAMPLE=108, STRATIFY=109, ALTER=110, RENAME=111, ARRAY=112, 
		MAP=113, STRUCT=114, SUBSTR=115, SUBSTRING=116, COMMENT=117, LIFECYCLE=118, 
		SET=119, RESET=120, DATA=121, START=122, TRANSACTION=123, COMMIT=124, 
		ROLLBACK=125, MACRO=126, IGNORE=127, BOTH=128, LEADING=129, TRAILING=130, 
		CONVERT=131, DELTA=132, PARQUET=133, VACUUM=134, RETAIN=135, RUN=136, 
		HISTORY=137, HOURS=138, DETAIL=139, DRY=140, MATCHED=141, MERGE=142, KILL=143, 
		READ=144, JOB=145, IF=146, POSITION=147, EXTRACT=148, EQ=149, NSEQ=150, 
		NEQ=151, NEQJ=152, LT=153, LTE=154, GT=155, GTE=156, PLUS=157, MINUS=158, 
		ASTERISK=159, SLASH=160, PERCENT=161, DIV=162, TILDE=163, AMPERSAND=164, 
		PIPE=165, CONCAT_PIPE=166, HAT=167, PERCENTLIT=168, BUCKET=169, OUT=170, 
		OF=171, STATUS=172, SORT=173, CLUSTER=174, DISTRIBUTE=175, TRIM=176, OVERLAY=177, 
		PLACING=178, OVERWRITE=179, TRANSFORM=180, REDUCE=181, USING=182, SERDE=183, 
		SERDEPROPERTIES=184, RECORDREADER=185, RECORDWRITER=186, DELIMITED=187, 
		FIELDS=188, TERMINATED=189, COLLECTION=190, ITEMS=191, KEYS=192, ESCAPED=193, 
		LINES=194, SEPARATED=195, FUNCTION=196, EXTENDED=197, REFRESH=198, CLEAR=199, 
		CACHE=200, UNCACHE=201, UNKNOWN=202, LAZY=203, FORMATTED=204, GLOBAL=205, 
		TEMPORARY=206, OPTIONS=207, UNSET=208, TBLPROPERTIES=209, DBPROPERTIES=210, 
		BUCKETS=211, SKEWED=212, STORED=213, DIRECTORIES=214, LOCATION=215, EXCHANGE=216, 
		ARCHIVE=217, UNARCHIVE=218, FILEFORMAT=219, TOUCH=220, COMPACT=221, CONCATENATE=222, 
		CHANGE=223, CASCADE=224, RESTRICT=225, CLUSTERED=226, SORTED=227, PURGE=228, 
		INPUTFORMAT=229, OUTPUTFORMAT=230, DATABASE=231, DATABASES=232, DFS=233, 
		TRUNCATE=234, ANALYZE=235, COMPUTE=236, LIST=237, STATISTICS=238, PARTITIONED=239, 
		EXTERNAL=240, DEFINED=241, REVOKE=242, GRANT=243, LOCK=244, UNLOCK=245, 
		MSCK=246, REPAIR=247, RECOVER=248, EXPORT=249, IMPORT=250, LOAD=251, ROLE=252, 
		ROLES=253, COMPACTIONS=254, PRINCIPALS=255, TRANSACTIONS=256, INDEX=257, 
		INDEXES=258, LOCKS=259, OPTION=260, ANTI=261, LOCAL=262, INPATH=263, ANGEL=264, 
		ADDJAR=265, COMPRESS=266, FILE=267, DISTCP=268, DRUID=269, CLICKHOUSE=270, 
		STRING=271, BIGINT_LITERAL=272, SMALLINT_LITERAL=273, TINYINT_LITERAL=274, 
		INTEGER_VALUE=275, DECIMAL_VALUE=276, DOUBLE_LITERAL=277, BIGDECIMAL_LITERAL=278, 
		IDENTIFIER=279, BACKQUOTED_IDENTIFIER=280, SIMPLE_COMMENT=281, BRACKETED_EMPTY_COMMENT=282, 
		BRACKETED_COMMENT=283, WS=284, UNRECOGNIZED=285;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleFunctionIdentifier = 3, RULE_singleDataType = 4, RULE_singleTableSchema = 5, 
		RULE_statement = 6, RULE_dataSource = 7, RULE_sparkOptions = 8, RULE_optionVal = 9, 
		RULE_matchedClause = 10, RULE_matchedAction = 11, RULE_notMatchedClause = 12, 
		RULE_notMatchedAction = 13, RULE_unsupportedHiveNativeCommands = 14, RULE_createTableHeader = 15, 
		RULE_bucketSpec = 16, RULE_skewSpec = 17, RULE_locationSpec = 18, RULE_query = 19, 
		RULE_insertInto = 20, RULE_setClause = 21, RULE_assign = 22, RULE_assignmentList = 23, 
		RULE_assignment = 24, RULE_multipartIdentifier = 25, RULE_partitionSpecLocation = 26, 
		RULE_partitionSpec = 27, RULE_partitionVal = 28, RULE_describeFuncName = 29, 
		RULE_describeColName = 30, RULE_ctes = 31, RULE_namedQuery = 32, RULE_tableProvider = 33, 
		RULE_tablePropertyList = 34, RULE_tableProperty = 35, RULE_tablePropertyKey = 36, 
		RULE_tablePropertyValue = 37, RULE_constantList = 38, RULE_nestedConstantList = 39, 
		RULE_createFileFormat = 40, RULE_fileFormat = 41, RULE_storageHandler = 42, 
		RULE_resource = 43, RULE_queryNoWith = 44, RULE_queryOrganization = 45, 
		RULE_multiInsertQueryBody = 46, RULE_queryTerm = 47, RULE_queryPrimary = 48, 
		RULE_sortItem = 49, RULE_querySpecification = 50, RULE_hint = 51, RULE_hintStatement = 52, 
		RULE_fromClause = 53, RULE_aggregation = 54, RULE_groupingSet = 55, RULE_pivotClause = 56, 
		RULE_pivotColumn = 57, RULE_pivotValue = 58, RULE_lateralView = 59, RULE_setQuantifier = 60, 
		RULE_relation = 61, RULE_joinRelation = 62, RULE_joinType = 63, RULE_joinCriteria = 64, 
		RULE_sample = 65, RULE_sampleMethod = 66, RULE_identifierList = 67, RULE_identifierSeq = 68, 
		RULE_orderedIdentifierList = 69, RULE_orderedIdentifier = 70, RULE_identifierCommentList = 71, 
		RULE_identifierComment = 72, RULE_relationPrimary = 73, RULE_inlineTable = 74, 
		RULE_functionTable = 75, RULE_tableAlias = 76, RULE_rowFormat = 77, RULE_tableIdentifier = 78, 
		RULE_functionIdentifier = 79, RULE_namedExpression = 80, RULE_namedExpressionSeq = 81, 
		RULE_expression = 82, RULE_booleanExpression = 83, RULE_predicate = 84, 
		RULE_valueExpression = 85, RULE_primaryExpression = 86, RULE_constant = 87, 
		RULE_comparisonOperator = 88, RULE_arithmeticOperator = 89, RULE_predicateOperator = 90, 
		RULE_booleanValue = 91, RULE_interval = 92, RULE_intervalField = 93, RULE_intervalValue = 94, 
		RULE_colPosition = 95, RULE_dataType = 96, RULE_colTypeList = 97, RULE_colType = 98, 
		RULE_complexColTypeList = 99, RULE_complexColType = 100, RULE_whenClause = 101, 
		RULE_windows = 102, RULE_namedWindow = 103, RULE_windowSpec = 104, RULE_windowFrame = 105, 
		RULE_frameBound = 106, RULE_qualifiedName = 107, RULE_identifier = 108, 
		RULE_strictIdentifier = 109, RULE_quotedIdentifier = 110, RULE_number = 111, 
		RULE_nonReserved = 112;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleFunctionIdentifier", 
		"singleDataType", "singleTableSchema", "statement", "dataSource", "sparkOptions", 
		"optionVal", "matchedClause", "matchedAction", "notMatchedClause", "notMatchedAction", 
		"unsupportedHiveNativeCommands", "createTableHeader", "bucketSpec", "skewSpec", 
		"locationSpec", "query", "insertInto", "setClause", "assign", "assignmentList", 
		"assignment", "multipartIdentifier", "partitionSpecLocation", "partitionSpec", 
		"partitionVal", "describeFuncName", "describeColName", "ctes", "namedQuery", 
		"tableProvider", "tablePropertyList", "tableProperty", "tablePropertyKey", 
		"tablePropertyValue", "constantList", "nestedConstantList", "createFileFormat", 
		"fileFormat", "storageHandler", "resource", "queryNoWith", "queryOrganization", 
		"multiInsertQueryBody", "queryTerm", "queryPrimary", "sortItem", "querySpecification", 
		"hint", "hintStatement", "fromClause", "aggregation", "groupingSet", "pivotClause", 
		"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "tableIdentifier", "functionIdentifier", 
		"namedExpression", "namedExpressionSeq", "expression", "booleanExpression", 
		"predicate", "valueExpression", "primaryExpression", "constant", "comparisonOperator", 
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
		"'CAST'", "'SHOW'", "'TABLES'", "'COLUMNS'", "'COLUMN'", "'UPDATE'", "'USE'", 
		"'PARTITIONS'", "'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'MINUS'", 
		"'INTERSECT'", "'TO'", "'TABLESAMPLE'", "'STRATIFY'", "'ALTER'", "'RENAME'", 
		"'ARRAY'", "'MAP'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'COMMENT'", 
		"'LIFECYCLE'", "'SET'", "'RESET'", "'DATA'", "'START'", "'TRANSACTION'", 
		"'COMMIT'", "'ROLLBACK'", "'MACRO'", "'IGNORE'", "'BOTH'", "'LEADING'", 
		"'TRAILING'", "'CONVERT'", "'DELTA'", "'PARQUET'", "'VACUUM'", "'RETAIN'", 
		"'RUN'", "'HISTORY'", "'HOURS'", "'DETAIL'", "'DRY'", "'MATCHED'", "'MERGE'", 
		"'KILL'", "'READ'", "'JOB'", "'IF'", "'POSITION'", "'EXTRACT'", null, 
		"'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'DIV'", "'~'", "'&'", "'|'", "'||'", "'^'", "'PERCENT'", 
		"'BUCKET'", "'OUT'", "'OF'", "'STATUS'", "'SORT'", "'CLUSTER'", "'DISTRIBUTE'", 
		"'TRIM'", "'OVERLAY'", "'PLACING'", "'OVERWRITE'", "'TRANSFORM'", "'REDUCE'", 
		"'USING'", "'SERDE'", "'SERDEPROPERTIES'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'DELIMITED'", "'FIELDS'", "'TERMINATED'", "'COLLECTION'", "'ITEMS'", 
		"'KEYS'", "'ESCAPED'", "'LINES'", "'SEPARATED'", "'FUNCTION'", "'EXTENDED'", 
		"'REFRESH'", "'CLEAR'", "'CACHE'", "'UNCACHE'", "'UNKNOWN'", "'LAZY'", 
		"'FORMATTED'", "'GLOBAL'", null, "'OPTIONS'", "'UNSET'", "'TBLPROPERTIES'", 
		"'DBPROPERTIES'", "'BUCKETS'", "'SKEWED'", "'STORED'", "'DIRECTORIES'", 
		"'LOCATION'", "'EXCHANGE'", "'ARCHIVE'", "'UNARCHIVE'", "'FILEFORMAT'", 
		"'TOUCH'", "'COMPACT'", "'CONCATENATE'", "'CHANGE'", "'CASCADE'", "'RESTRICT'", 
		"'CLUSTERED'", "'SORTED'", "'PURGE'", "'INPUTFORMAT'", "'OUTPUTFORMAT'", 
		null, null, "'DFS'", "'TRUNCATE'", "'ANALYZE'", "'COMPUTE'", "'LIST'", 
		"'STATISTICS'", "'PARTITIONED'", "'EXTERNAL'", "'DEFINED'", "'REVOKE'", 
		"'GRANT'", "'LOCK'", "'UNLOCK'", "'MSCK'", "'REPAIR'", "'RECOVER'", "'EXPORT'", 
		"'IMPORT'", "'LOAD'", "'ROLE'", "'ROLES'", "'COMPACTIONS'", "'PRINCIPALS'", 
		"'TRANSACTIONS'", "'INDEX'", "'INDEXES'", "'LOCKS'", "'OPTION'", "'ANTI'", 
		"'LOCAL'", "'INPATH'", "'ANGEL'", "'ADDJAR'", "'COMPRESS'", "'FILE'", 
		"'DISTCP'", "'DRUID'", "'CLICKHOUSE'", null, null, null, null, null, null, 
		null, null, null, null, null, "'/**/'"
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
		"CAST", "SHOW", "TABLES", "COLUMNS", "COLUMN", "UPDATE", "USE", "PARTITIONS", 
		"FUNCTIONS", "DROP", "UNION", "EXCEPT", "SETMINUS", "INTERSECT", "TO", 
		"TABLESAMPLE", "STRATIFY", "ALTER", "RENAME", "ARRAY", "MAP", "STRUCT", 
		"SUBSTR", "SUBSTRING", "COMMENT", "LIFECYCLE", "SET", "RESET", "DATA", 
		"START", "TRANSACTION", "COMMIT", "ROLLBACK", "MACRO", "IGNORE", "BOTH", 
		"LEADING", "TRAILING", "CONVERT", "DELTA", "PARQUET", "VACUUM", "RETAIN", 
		"RUN", "HISTORY", "HOURS", "DETAIL", "DRY", "MATCHED", "MERGE", "KILL", 
		"READ", "JOB", "IF", "POSITION", "EXTRACT", "EQ", "NSEQ", "NEQ", "NEQJ", 
		"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
		"DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "PERCENTLIT", 
		"BUCKET", "OUT", "OF", "STATUS", "SORT", "CLUSTER", "DISTRIBUTE", "TRIM", 
		"OVERLAY", "PLACING", "OVERWRITE", "TRANSFORM", "REDUCE", "USING", "SERDE", 
		"SERDEPROPERTIES", "RECORDREADER", "RECORDWRITER", "DELIMITED", "FIELDS", 
		"TERMINATED", "COLLECTION", "ITEMS", "KEYS", "ESCAPED", "LINES", "SEPARATED", 
		"FUNCTION", "EXTENDED", "REFRESH", "CLEAR", "CACHE", "UNCACHE", "UNKNOWN", 
		"LAZY", "FORMATTED", "GLOBAL", "TEMPORARY", "OPTIONS", "UNSET", "TBLPROPERTIES", 
		"DBPROPERTIES", "BUCKETS", "SKEWED", "STORED", "DIRECTORIES", "LOCATION", 
		"EXCHANGE", "ARCHIVE", "UNARCHIVE", "FILEFORMAT", "TOUCH", "COMPACT", 
		"CONCATENATE", "CHANGE", "CASCADE", "RESTRICT", "CLUSTERED", "SORTED", 
		"PURGE", "INPUTFORMAT", "OUTPUTFORMAT", "DATABASE", "DATABASES", "DFS", 
		"TRUNCATE", "ANALYZE", "COMPUTE", "LIST", "STATISTICS", "PARTITIONED", 
		"EXTERNAL", "DEFINED", "REVOKE", "GRANT", "LOCK", "UNLOCK", "MSCK", "REPAIR", 
		"RECOVER", "EXPORT", "IMPORT", "LOAD", "ROLE", "ROLES", "COMPACTIONS", 
		"PRINCIPALS", "TRANSACTIONS", "INDEX", "INDEXES", "LOCKS", "OPTION", "ANTI", 
		"LOCAL", "INPATH", "ANGEL", "ADDJAR", "COMPRESS", "FILE", "DISTCP", "DRUID", 
		"CLICKHOUSE", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", 
		"IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
			setState(226);
			statement();
			setState(227);
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
			setState(229);
			namedExpression();
			setState(230);
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
			setState(232);
			tableIdentifier();
			setState(233);
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
			setState(235);
			functionIdentifier();
			setState(236);
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
			setState(238);
			dataType();
			setState(239);
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
			setState(241);
			colTypeList();
			setState(242);
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
	public static class DeltaConvertContext extends StatementContext {
		public Token format;
		public TableIdentifierContext table;
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
		}
		public DeltaConvertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDeltaConvert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDeltaConvert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDeltaConvert(this);
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
	public static class DeleteFromTableContext extends StatementContext {
		public TableIdentifierContext table;
		public BooleanExpressionContext where;
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteFromTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeltaMergeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableAliasContext targetAlias;
		public TableIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeltaMergeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDeltaMerge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDeltaMerge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDeltaMerge(this);
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
	public static class CompressFileContext extends StatementContext {
		public ConstantContext path;
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
		}
		public CompressFileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCompressFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCompressFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCompressFile(this);
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
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
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
	public static class UpdateTableContext extends StatementContext {
		public TableIdentifierContext table;
		public SetClauseContext upset;
		public BooleanExpressionContext where;
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUpdateTable(this);
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
	public static class DescribeDeltaDetailContext extends StatementContext {
		public TableIdentifierContext table;
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public DescribeDeltaDetailContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeDeltaDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeDeltaDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaDetail(this);
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
		public IdentifierListContext partitionColumnNames;
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
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
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
	public static class DistcpDatasourceContext extends StatementContext {
		public DataSourceContext ds;
		public TableIdentifierContext srcTable;
		public TableIdentifierContext destTable;
		public TerminalNode DISTCP() { return getToken(SparkSqlBaseParser.DISTCP, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
		}
		public DistcpDatasourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDistcpDatasource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDistcpDatasource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDistcpDatasource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VacuumTableContext extends StatementContext {
		public TableIdentifierContext table;
		public NumberContext num;
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VacuumTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterVacuumTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitVacuumTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitVacuumTable(this);
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
		public ColTypeListContext columns;
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
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
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
	public static class DescribeDeltaHistoryContext extends StatementContext {
		public TableIdentifierContext table;
		public Token limit;
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SparkSqlBaseParser.INTEGER_VALUE, 0); }
		public DescribeDeltaHistoryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeDeltaHistory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeDeltaHistory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeDeltaHistory(this);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
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
	public static class CompressTableContext extends StatementContext {
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
		}
		public CompressTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCompressTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCompressTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCompressTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportTableContext extends StatementContext {
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
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SparkOptionsContext sparkOptions() {
			return getRuleContext(SparkOptionsContext.class,0);
		}
		public ExportTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExportTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExportTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExportTable(this);
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
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(USE);
				setState(246);
				((UseContext)_localctx).db = identifier();
				}
				break;
			case 3:
				_localctx = new CreateDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				match(CREATE);
				setState(248);
				match(DATABASE);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(249);
					match(IF);
					setState(250);
					match(NOT);
					setState(251);
					match(EXISTS);
					}
					break;
				}
				setState(254);
				identifier();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(255);
					match(COMMENT);
					setState(256);
					((CreateDatabaseContext)_localctx).comment = match(STRING);
					}
				}

				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(259);
					locationSpec();
					}
				}

				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(262);
					match(WITH);
					setState(263);
					match(DBPROPERTIES);
					setState(264);
					tablePropertyList();
					}
				}

				}
				break;
			case 4:
				_localctx = new SetDatabasePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(ALTER);
				setState(268);
				match(DATABASE);
				setState(269);
				identifier();
				setState(270);
				match(SET);
				setState(271);
				match(DBPROPERTIES);
				setState(272);
				tablePropertyList();
				}
				break;
			case 5:
				_localctx = new DropDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(274);
				match(DROP);
				setState(275);
				match(DATABASE);
				setState(278);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(276);
					match(IF);
					setState(277);
					match(EXISTS);
					}
					break;
				}
				setState(280);
				identifier();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(281);
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
				setState(284);
				createTableHeader();
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(285);
					match(T__0);
					setState(286);
					((CreateTableContext)_localctx).columns = colTypeList();
					setState(287);
					match(T__1);
					}
				}

				setState(291);
				tableProvider();
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || ((((_la - 207)) & ~0x3f) == 0 && ((1L << (_la - 207)) & ((1L << (OPTIONS - 207)) | (1L << (TBLPROPERTIES - 207)) | (1L << (LOCATION - 207)) | (1L << (CLUSTERED - 207)) | (1L << (PARTITIONED - 207)))) != 0)) {
					{
					setState(303);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(292);
						match(OPTIONS);
						setState(293);
						((CreateTableContext)_localctx).options = tablePropertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(294);
						match(PARTITIONED);
						setState(295);
						match(BY);
						setState(296);
						((CreateTableContext)_localctx).partitionColumnNames = identifierList();
						}
						}
						break;
					case CLUSTERED:
						{
						setState(297);
						bucketSpec();
						}
						break;
					case LOCATION:
						{
						setState(298);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						{
						setState(299);
						match(COMMENT);
						setState(300);
						((CreateTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(301);
						match(TBLPROPERTIES);
						setState(302);
						((CreateTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFECYCLE) {
					{
					setState(308);
					match(LIFECYCLE);
					setState(309);
					((CreateTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
				}

				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(312);
						match(AS);
						}
					}

					setState(315);
					query();
					}
				}

				}
				break;
			case 7:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				createTableHeader();
				setState(323);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(319);
					match(T__0);
					setState(320);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(321);
					match(T__1);
					}
					break;
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ROW || _la==COMMENT || ((((_la - 209)) & ~0x3f) == 0 && ((1L << (_la - 209)) & ((1L << (TBLPROPERTIES - 209)) | (1L << (SKEWED - 209)) | (1L << (STORED - 209)) | (1L << (LOCATION - 209)) | (1L << (CLUSTERED - 209)) | (1L << (PARTITIONED - 209)))) != 0)) {
					{
					setState(345);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						{
						setState(325);
						match(COMMENT);
						setState(326);
						((CreateHiveTableContext)_localctx).comment = match(STRING);
						}
						}
						break;
					case PARTITIONED:
						{
						setState(336);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
						case 1:
							{
							setState(327);
							match(PARTITIONED);
							setState(328);
							match(BY);
							setState(329);
							match(T__0);
							setState(330);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(331);
							match(T__1);
							}
							break;
						case 2:
							{
							setState(333);
							match(PARTITIONED);
							setState(334);
							match(BY);
							setState(335);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(338);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(339);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(340);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(341);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(342);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(343);
						match(TBLPROPERTIES);
						setState(344);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIFECYCLE) {
					{
					setState(350);
					match(LIFECYCLE);
					setState(351);
					((CreateHiveTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
				}

				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(354);
						match(AS);
						}
					}

					setState(357);
					query();
					}
				}

				}
				break;
			case 8:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(360);
				match(CREATE);
				setState(361);
				match(TABLE);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(362);
					match(IF);
					setState(363);
					match(NOT);
					setState(364);
					match(EXISTS);
					}
					break;
				}
				setState(367);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(368);
				match(LIKE);
				setState(369);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCATION) {
					{
					setState(370);
					locationSpec();
					}
				}

				}
				break;
			case 9:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(373);
				match(ANALYZE);
				setState(374);
				match(TABLE);
				setState(375);
				tableIdentifier();
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(376);
					partitionSpec();
					}
				}

				setState(379);
				match(COMPUTE);
				setState(380);
				match(STATISTICS);
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(381);
					identifier();
					}
					break;
				case 2:
					{
					setState(382);
					match(FOR);
					setState(383);
					match(COLUMNS);
					setState(384);
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
				setState(387);
				match(ALTER);
				setState(388);
				match(TABLE);
				setState(389);
				tableIdentifier();
				setState(390);
				match(ADD);
				setState(391);
				match(COLUMNS);
				setState(392);
				match(T__0);
				setState(393);
				((AddTableColumnsContext)_localctx).columns = colTypeList();
				setState(394);
				match(T__1);
				}
				break;
			case 11:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(396);
				match(ALTER);
				setState(397);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(398);
				((RenameTableContext)_localctx).from = tableIdentifier();
				setState(399);
				match(RENAME);
				setState(400);
				match(TO);
				setState(401);
				((RenameTableContext)_localctx).to = tableIdentifier();
				}
				break;
			case 12:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(403);
				match(ALTER);
				setState(404);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405);
				tableIdentifier();
				setState(406);
				match(SET);
				setState(407);
				match(TBLPROPERTIES);
				setState(408);
				tablePropertyList();
				}
				break;
			case 13:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(410);
				match(ALTER);
				setState(411);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				tableIdentifier();
				setState(413);
				match(UNSET);
				setState(414);
				match(TBLPROPERTIES);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(415);
					match(IF);
					setState(416);
					match(EXISTS);
					}
				}

				setState(419);
				tablePropertyList();
				}
				break;
			case 14:
				_localctx = new ChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(421);
				match(ALTER);
				setState(422);
				match(TABLE);
				setState(423);
				tableIdentifier();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(424);
					partitionSpec();
					}
				}

				setState(427);
				match(CHANGE);
				setState(429);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(428);
					match(COLUMN);
					}
					break;
				}
				setState(431);
				identifier();
				setState(432);
				colType();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIRST || _la==AFTER) {
					{
					setState(433);
					colPosition();
					}
				}

				}
				break;
			case 15:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(436);
				match(ALTER);
				setState(437);
				match(TABLE);
				setState(438);
				tableIdentifier();
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(439);
					partitionSpec();
					}
				}

				setState(442);
				match(SET);
				setState(443);
				match(SERDE);
				setState(444);
				match(STRING);
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(445);
					match(WITH);
					setState(446);
					match(SERDEPROPERTIES);
					setState(447);
					tablePropertyList();
					}
				}

				}
				break;
			case 16:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(450);
				match(ALTER);
				setState(451);
				match(TABLE);
				setState(452);
				tableIdentifier();
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(453);
					partitionSpec();
					}
				}

				setState(456);
				match(SET);
				setState(457);
				match(SERDEPROPERTIES);
				setState(458);
				tablePropertyList();
				}
				break;
			case 17:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(460);
				match(ALTER);
				setState(461);
				match(TABLE);
				setState(462);
				tableIdentifier();
				setState(463);
				match(ADD);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(464);
					match(IF);
					setState(465);
					match(NOT);
					setState(466);
					match(EXISTS);
					}
				}

				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					partitionSpecLocation();
					}
					}
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 18:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(474);
				match(ALTER);
				setState(475);
				match(VIEW);
				setState(476);
				tableIdentifier();
				setState(477);
				match(ADD);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(478);
					match(IF);
					setState(479);
					match(NOT);
					setState(480);
					match(EXISTS);
					}
				}

				setState(484); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(483);
					partitionSpec();
					}
					}
					setState(486); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 19:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(488);
				match(ALTER);
				setState(489);
				match(TABLE);
				setState(490);
				tableIdentifier();
				setState(491);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(492);
				match(RENAME);
				setState(493);
				match(TO);
				setState(494);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 20:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(496);
				match(ALTER);
				setState(497);
				match(TABLE);
				setState(498);
				tableIdentifier();
				setState(499);
				match(DROP);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(500);
					match(IF);
					setState(501);
					match(EXISTS);
					}
				}

				setState(504);
				partitionSpec();
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(505);
					match(T__2);
					setState(506);
					partitionSpec();
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(512);
					match(PURGE);
					}
				}

				}
				break;
			case 21:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(515);
				match(ALTER);
				setState(516);
				match(VIEW);
				setState(517);
				tableIdentifier();
				setState(518);
				match(DROP);
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(519);
					match(IF);
					setState(520);
					match(EXISTS);
					}
				}

				setState(523);
				partitionSpec();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(524);
					match(T__2);
					setState(525);
					partitionSpec();
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 22:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(531);
				match(ALTER);
				setState(532);
				match(TABLE);
				setState(533);
				tableIdentifier();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(534);
					partitionSpec();
					}
				}

				setState(537);
				match(SET);
				setState(538);
				locationSpec();
				}
				break;
			case 23:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(540);
				match(ALTER);
				setState(541);
				match(TABLE);
				setState(542);
				tableIdentifier();
				setState(543);
				match(RECOVER);
				setState(544);
				match(PARTITIONS);
				}
				break;
			case 24:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(546);
				match(DROP);
				setState(547);
				match(TABLE);
				setState(550);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(548);
					match(IF);
					setState(549);
					match(EXISTS);
					}
					break;
				}
				setState(552);
				tableIdentifier();
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(553);
					match(PURGE);
					}
				}

				}
				break;
			case 25:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(556);
				match(DROP);
				setState(557);
				match(VIEW);
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(558);
					match(IF);
					setState(559);
					match(EXISTS);
					}
					break;
				}
				setState(562);
				tableIdentifier();
				}
				break;
			case 26:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(563);
				match(CREATE);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(564);
					match(OR);
					setState(565);
					match(REPLACE);
					}
				}

				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(568);
						match(GLOBAL);
						}
					}

					setState(571);
					match(TEMPORARY);
					}
				}

				setState(574);
				match(VIEW);
				setState(578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(575);
					match(IF);
					setState(576);
					match(NOT);
					setState(577);
					match(EXISTS);
					}
					break;
				}
				setState(580);
				tableIdentifier();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(581);
					identifierCommentList();
					}
				}

				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMENT) {
					{
					setState(584);
					match(COMMENT);
					setState(585);
					match(STRING);
					}
				}

				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(588);
					match(PARTITIONED);
					setState(589);
					match(ON);
					setState(590);
					identifierList();
					}
				}

				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TBLPROPERTIES) {
					{
					setState(593);
					match(TBLPROPERTIES);
					setState(594);
					tablePropertyList();
					}
				}

				setState(597);
				match(AS);
				setState(598);
				query();
				}
				break;
			case 27:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(600);
				match(CREATE);
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(601);
					match(OR);
					setState(602);
					match(REPLACE);
					}
				}

				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(605);
					match(GLOBAL);
					}
				}

				setState(608);
				match(TEMPORARY);
				setState(609);
				match(VIEW);
				setState(610);
				tableIdentifier();
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(611);
					match(T__0);
					setState(612);
					colTypeList();
					setState(613);
					match(T__1);
					}
				}

				setState(617);
				tableProvider();
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(618);
					match(OPTIONS);
					setState(619);
					tablePropertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(622);
				match(ALTER);
				setState(623);
				match(VIEW);
				setState(624);
				tableIdentifier();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(625);
					match(AS);
					}
				}

				setState(628);
				query();
				}
				break;
			case 29:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(630);
				match(CREATE);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(631);
					match(OR);
					setState(632);
					match(REPLACE);
					}
				}

				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(635);
					match(TEMPORARY);
					}
				}

				setState(638);
				match(FUNCTION);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(639);
					match(IF);
					setState(640);
					match(NOT);
					setState(641);
					match(EXISTS);
					}
					break;
				}
				setState(644);
				qualifiedName();
				setState(645);
				match(AS);
				setState(646);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(647);
					match(USING);
					setState(648);
					resource();
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(649);
						match(T__2);
						setState(650);
						resource();
						}
						}
						setState(655);
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
				setState(658);
				match(DROP);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(659);
					match(TEMPORARY);
					}
				}

				setState(662);
				match(FUNCTION);
				setState(665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(663);
					match(IF);
					setState(664);
					match(EXISTS);
					}
					break;
				}
				setState(667);
				qualifiedName();
				}
				break;
			case 31:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(668);
				match(EXPLAIN);
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (LOGICAL - 90)) | (1L << (CODEGEN - 90)) | (1L << (COST - 90)))) != 0) || _la==EXTENDED || _la==FORMATTED) {
					{
					setState(669);
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

				setState(672);
				statement();
				}
				break;
			case 32:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(673);
				match(SHOW);
				setState(674);
				match(TABLES);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(675);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(676);
					((ShowTablesContext)_localctx).db = identifier();
					}
				}

				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(679);
						match(LIKE);
						}
					}

					setState(682);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(685);
				match(SHOW);
				setState(686);
				match(TABLE);
				setState(687);
				match(EXTENDED);
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(688);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(689);
					((ShowTableContext)_localctx).db = identifier();
					}
				}

				setState(692);
				match(LIKE);
				setState(693);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(694);
					partitionSpec();
					}
				}

				}
				break;
			case 34:
				_localctx = new ShowDatabasesContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(697);
				match(SHOW);
				setState(698);
				match(DATABASES);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(699);
						match(LIKE);
						}
					}

					setState(702);
					((ShowDatabasesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 35:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(705);
				match(SHOW);
				setState(706);
				match(TBLPROPERTIES);
				setState(707);
				((ShowTblPropertiesContext)_localctx).table = tableIdentifier();
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(708);
					match(T__0);
					setState(709);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(710);
					match(T__1);
					}
				}

				}
				break;
			case 36:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(714);
				match(SHOW);
				setState(715);
				match(COLUMNS);
				setState(716);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(717);
				tableIdentifier();
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(718);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(719);
					((ShowColumnsContext)_localctx).db = identifier();
					}
				}

				}
				break;
			case 37:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(722);
				match(SHOW);
				setState(723);
				match(PARTITIONS);
				setState(724);
				tableIdentifier();
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(725);
					partitionSpec();
					}
				}

				}
				break;
			case 38:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(728);
				match(SHOW);
				setState(730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(729);
					identifier();
					}
					break;
				}
				setState(732);
				match(FUNCTIONS);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
					{
					setState(734);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(733);
						match(LIKE);
						}
						break;
					}
					setState(738);
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
					case UPDATE:
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
					case SUBSTR:
					case SUBSTRING:
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
					case CONVERT:
					case DELTA:
					case PARQUET:
					case VACUUM:
					case RETAIN:
					case RUN:
					case HISTORY:
					case HOURS:
					case DETAIL:
					case DRY:
					case MATCHED:
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
					case STATUS:
					case SORT:
					case CLUSTER:
					case DISTRIBUTE:
					case TRIM:
					case OVERLAY:
					case PLACING:
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
					case UNKNOWN:
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
						{
						setState(736);
						qualifiedName();
						}
						break;
					case STRING:
						{
						setState(737);
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
				setState(742);
				match(SHOW);
				setState(743);
				match(CREATE);
				setState(744);
				match(TABLE);
				setState(745);
				tableIdentifier();
				}
				break;
			case 40:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(747);
				match(FUNCTION);
				setState(749);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(748);
					match(EXTENDED);
					}
					break;
				}
				setState(751);
				describeFuncName();
				}
				break;
			case 41:
				_localctx = new DescribeDatabaseContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(752);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(753);
				match(DATABASE);
				setState(755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(754);
					match(EXTENDED);
					}
					break;
				}
				setState(757);
				identifier();
				}
				break;
			case 42:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(758);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(759);
				match(DETAIL);
				setState(760);
				((DescribeDeltaDetailContext)_localctx).table = tableIdentifier();
				}
				break;
			case 43:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(761);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(762);
				match(HISTORY);
				setState(763);
				((DescribeDeltaHistoryContext)_localctx).table = tableIdentifier();
				setState(766);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(764);
					match(LIMIT);
					setState(765);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 44:
				_localctx = new DescribeTableContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(768);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(769);
					match(TABLE);
					}
					break;
				}
				setState(773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(772);
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
				setState(775);
				tableIdentifier();
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(776);
					partitionSpec();
					}
					break;
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
					{
					setState(779);
					describeColName();
					}
				}

				}
				break;
			case 45:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(782);
				match(REFRESH);
				setState(783);
				match(TABLE);
				setState(784);
				tableIdentifier();
				}
				break;
			case 46:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(785);
				match(REFRESH);
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(786);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(790);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(787);
							matchWildcard();
							}
							} 
						}
						setState(792);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(795);
				match(CACHE);
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(796);
					match(LAZY);
					}
				}

				setState(799);
				match(TABLE);
				setState(800);
				tableIdentifier();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << AS))) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (WITH - 77)) | (1L << (VALUES - 77)) | (1L << (TABLE - 77)) | (1L << (INSERT - 77)) | (1L << (MAP - 77)))) != 0) || _la==REDUCE) {
					{
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(801);
						match(AS);
						}
					}

					setState(804);
					query();
					}
				}

				}
				break;
			case 48:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(807);
				match(UNCACHE);
				setState(808);
				match(TABLE);
				setState(811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(809);
					match(IF);
					setState(810);
					match(EXISTS);
					}
					break;
				}
				setState(813);
				tableIdentifier();
				}
				break;
			case 49:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(814);
				match(CLEAR);
				setState(815);
				match(CACHE);
				}
				break;
			case 50:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(816);
				match(LOAD);
				setState(817);
				match(DATA);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(818);
					match(LOCAL);
					}
				}

				setState(821);
				match(INPATH);
				setState(822);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(823);
					match(OVERWRITE);
					}
				}

				setState(826);
				match(INTO);
				setState(827);
				match(TABLE);
				setState(828);
				tableIdentifier();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(829);
					partitionSpec();
					}
				}

				}
				break;
			case 51:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(832);
				match(TRUNCATE);
				setState(833);
				match(TABLE);
				setState(834);
				tableIdentifier();
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(835);
					partitionSpec();
					}
				}

				}
				break;
			case 52:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(838);
				match(MSCK);
				setState(839);
				match(REPAIR);
				setState(840);
				match(TABLE);
				setState(841);
				tableIdentifier();
				}
				break;
			case 53:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(842);
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
				setState(843);
				identifier();
				setState(847);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(844);
						matchWildcard();
						}
						} 
					}
					setState(849);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;
			case 54:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(850);
				match(SET);
				setState(851);
				match(ROLE);
				setState(855);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(852);
						matchWildcard();
						}
						} 
					}
					setState(857);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			case 55:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(858);
				match(SET);
				setState(862);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(859);
						matchWildcard();
						}
						} 
					}
					setState(864);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			case 56:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(865);
				match(RESET);
				}
				break;
			case 57:
				_localctx = new StatusJobContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(866);
				match(STATUS);
				setState(870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(867);
						matchWildcard();
						}
						} 
					}
					setState(872);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
				}
				}
				break;
			case 58:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(873);
				match(MERGE);
				setState(874);
				match(TABLE);
				setState(875);
				tableIdentifier();
				setState(877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(876);
					partitionSpec();
					}
				}

				setState(880);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(879);
					sparkOptions();
					}
				}

				}
				break;
			case 59:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(882);
				match(KILL);
				setState(883);
				match(JOB);
				setState(884);
				identifier();
				}
				break;
			case 60:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(885);
				match(ADDJAR);
				setState(886);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 61:
				_localctx = new AngelContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(887);
				match(ANGEL);
				setState(888);
				((AngelContext)_localctx).name = identifier();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(889);
					tablePropertyList();
					}
				}

				}
				break;
			case 62:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(892);
				match(READ);
				setState(893);
				match(TABLE);
				setState(894);
				tableIdentifier();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(895);
					partitionSpec();
					}
				}

				setState(898);
				match(LIMIT);
				setState(899);
				number();
				}
				break;
			case 63:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(901);
				match(LOAD);
				setState(902);
				match(DATA);
				setState(903);
				((LoadTempTableContext)_localctx).path = constant();
				setState(904);
				match(TABLE);
				setState(905);
				tableIdentifier();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(906);
					sparkOptions();
					}
				}

				}
				break;
			case 64:
				_localctx = new ExportTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(909);
					ctes();
					}
				}

				setState(912);
				match(EXPORT);
				setState(913);
				match(TABLE);
				setState(914);
				tableIdentifier();
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(915);
					partitionSpec();
					}
				}

				setState(918);
				match(TO);
				setState(919);
				((ExportTableContext)_localctx).name = constant();
				setState(921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(920);
					sparkOptions();
					}
				}

				}
				break;
			case 65:
				_localctx = new CompressTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(923);
				match(COMPRESS);
				setState(924);
				match(TABLE);
				setState(925);
				tableIdentifier();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(926);
					partitionSpec();
					}
				}

				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(929);
					sparkOptions();
					}
				}

				}
				break;
			case 66:
				_localctx = new CompressFileContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(932);
				match(COMPRESS);
				setState(933);
				match(FILE);
				setState(934);
				((CompressFileContext)_localctx).path = constant();
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(935);
					sparkOptions();
					}
				}

				}
				break;
			case 67:
				_localctx = new DistcpDatasourceContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(938);
					ctes();
					}
				}

				setState(941);
				match(DISTCP);
				setState(942);
				((DistcpDatasourceContext)_localctx).ds = dataSource();
				setState(943);
				((DistcpDatasourceContext)_localctx).srcTable = tableIdentifier();
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(944);
					partitionSpec();
					}
				}

				setState(947);
				match(TO);
				setState(948);
				((DistcpDatasourceContext)_localctx).destTable = tableIdentifier();
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(949);
					sparkOptions();
					}
				}

				}
				break;
			case 68:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(952);
				match(DELETE);
				setState(953);
				match(FROM);
				setState(954);
				((DeleteFromTableContext)_localctx).table = tableIdentifier();
				setState(955);
				tableAlias();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(956);
					match(WHERE);
					setState(957);
					((DeleteFromTableContext)_localctx).where = booleanExpression(0);
					}
				}

				}
				break;
			case 69:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(960);
				match(UPDATE);
				setState(961);
				((UpdateTableContext)_localctx).table = tableIdentifier();
				setState(962);
				tableAlias();
				setState(963);
				((UpdateTableContext)_localctx).upset = setClause();
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(964);
					match(WHERE);
					setState(965);
					((UpdateTableContext)_localctx).where = booleanExpression(0);
					}
				}

				}
				break;
			case 70:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(968);
				match(VACUUM);
				setState(969);
				((VacuumTableContext)_localctx).table = tableIdentifier();
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(970);
					match(RETAIN);
					setState(971);
					((VacuumTableContext)_localctx).num = number();
					setState(972);
					match(HOURS);
					}
				}

				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRY) {
					{
					setState(976);
					match(DRY);
					setState(977);
					match(RUN);
					}
				}

				}
				break;
			case 71:
				_localctx = new DeltaMergeContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(980);
				match(MERGE);
				setState(981);
				match(INTO);
				setState(982);
				((DeltaMergeContext)_localctx).target = tableIdentifier();
				setState(983);
				((DeltaMergeContext)_localctx).targetAlias = tableAlias();
				setState(984);
				match(USING);
				setState(990);
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
				case UPDATE:
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
				case SUBSTR:
				case SUBSTRING:
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
				case CONVERT:
				case DELTA:
				case PARQUET:
				case VACUUM:
				case RETAIN:
				case RUN:
				case HISTORY:
				case HOURS:
				case DETAIL:
				case DRY:
				case MATCHED:
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
				case STATUS:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case TRIM:
				case OVERLAY:
				case PLACING:
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
				case UNKNOWN:
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
				case DRUID:
				case IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(985);
					((DeltaMergeContext)_localctx).source = tableIdentifier();
					}
					break;
				case T__0:
					{
					setState(986);
					match(T__0);
					setState(987);
					((DeltaMergeContext)_localctx).sourceQuery = query();
					setState(988);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(992);
				((DeltaMergeContext)_localctx).sourceAlias = tableAlias();
				setState(993);
				match(ON);
				setState(995);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(994);
					((DeltaMergeContext)_localctx).mergeCondition = booleanExpression(0);
					}
					break;
				}
				setState(1000);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(997);
						matchedClause();
						}
						} 
					}
					setState(1002);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1003);
					notMatchedClause();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 72:
				_localctx = new DeltaConvertContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1009);
				match(CONVERT);
				setState(1010);
				match(TO);
				setState(1011);
				((DeltaConvertContext)_localctx).format = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DELTA || _la==PARQUET) ) {
					((DeltaConvertContext)_localctx).format = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1012);
				((DeltaConvertContext)_localctx).table = tableIdentifier();
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(1013);
					match(PARTITIONED);
					setState(1014);
					match(BY);
					setState(1015);
					match(T__0);
					setState(1016);
					colTypeList();
					setState(1017);
					match(T__1);
					}
				}

				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1021);
					sparkOptions();
					}
				}

				}
				break;
			case 73:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1024);
				unsupportedHiveNativeCommands();
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1025);
						matchWildcard();
						}
						} 
					}
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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

	public static class DataSourceContext extends ParserRuleContext {
		public TerminalNode DRUID() { return getToken(SparkSqlBaseParser.DRUID, 0); }
		public TerminalNode CLICKHOUSE() { return getToken(SparkSqlBaseParser.CLICKHOUSE, 0); }
		public DataSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDataSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDataSource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDataSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSourceContext dataSource() throws RecognitionException {
		DataSourceContext _localctx = new DataSourceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dataSource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			_la = _input.LA(1);
			if ( !(_la==DRUID || _la==CLICKHOUSE) ) {
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

	public static class SparkOptionsContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public List<OptionValContext> optionVal() {
			return getRuleContexts(OptionValContext.class);
		}
		public OptionValContext optionVal(int i) {
			return getRuleContext(OptionValContext.class,i);
		}
		public SparkOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparkOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSparkOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSparkOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSparkOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SparkOptionsContext sparkOptions() throws RecognitionException {
		SparkOptionsContext _localctx = new SparkOptionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sparkOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(OPTIONS);
			setState(1036);
			match(T__0);
			setState(1037);
			optionVal();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1038);
				match(T__2);
				setState(1039);
				optionVal();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
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
		public IdentifierContext key;
		public ConstantContext value;
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
			setState(1047);
			((OptionValContext)_localctx).key = identifier();
			setState(1048);
			match(EQ);
			setState(1049);
			((OptionValContext)_localctx).value = constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(WHEN);
			setState(1052);
			match(MATCHED);
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1053);
				match(AND);
				setState(1054);
				((MatchedClauseContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(1057);
			match(THEN);
			setState(1058);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
	 
		public MatchedActionContext() { }
		public void copyFrom(MatchedActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateStarContext extends MatchedActionContext {
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public UpdateStarContext(MatchedActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUpdateStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUpdateStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUpdateStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends MatchedActionContext {
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public DeleteContext(MatchedActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateSetClauseContext extends MatchedActionContext {
		public AssignmentListContext upset;
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public UpdateSetClauseContext(MatchedActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUpdateSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUpdateSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUpdateSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchedAction);
		try {
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1060);
				match(DELETE);
				}
				break;
			case 2:
				_localctx = new UpdateStarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1061);
				match(UPDATE);
				setState(1062);
				match(SET);
				setState(1063);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new UpdateSetClauseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1064);
				match(UPDATE);
				setState(1065);
				match(SET);
				setState(1066);
				((UpdateSetClauseContext)_localctx).upset = assignmentList();
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(WHEN);
			setState(1070);
			match(NOT);
			setState(1071);
			match(MATCHED);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1072);
				match(AND);
				setState(1073);
				((NotMatchedClauseContext)_localctx).where = booleanExpression(0);
				}
			}

			setState(1076);
			match(THEN);
			setState(1077);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
	 
		public NotMatchedActionContext() { }
		public void copyFrom(NotMatchedActionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertSetClauseContext extends NotMatchedActionContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public List<NamedExpressionSeqContext> namedExpressionSeq() {
			return getRuleContexts(NamedExpressionSeqContext.class);
		}
		public NamedExpressionSeqContext namedExpressionSeq(int i) {
			return getRuleContext(NamedExpressionSeqContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public InsertSetClauseContext(NotMatchedActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertSetClause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertStarContext extends NotMatchedActionContext {
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public InsertStarContext(NotMatchedActionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterInsertStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitInsertStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitInsertStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_notMatchedAction);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				_localctx = new InsertStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(INSERT);
				setState(1080);
				match(ASTERISK);
				}
				break;
			case 2:
				_localctx = new InsertSetClauseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				match(INSERT);
				setState(1082);
				match(T__0);
				setState(1083);
				namedExpressionSeq();
				setState(1084);
				match(T__1);
				setState(1085);
				match(VALUES);
				setState(1086);
				match(T__0);
				setState(1087);
				namedExpressionSeq();
				setState(1088);
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
		enterRule(_localctx, 28, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1093);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1095);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1096);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1098);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1097);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1100);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1101);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1104);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1105);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1106);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1107);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1109);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1108);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1111);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1112);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1113);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1114);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1115);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1116);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1117);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1118);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1119);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1120);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1121);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1122);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1123);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1124);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1125);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1126);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1127);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1155);
				tableIdentifier();
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1161);
				tableIdentifier();
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1167);
				tableIdentifier();
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1173);
				tableIdentifier();
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1179);
				tableIdentifier();
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1185);
				tableIdentifier();
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1193);
				tableIdentifier();
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1200);
				tableIdentifier();
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1206);
				tableIdentifier();
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1212);
				tableIdentifier();
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1217);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1218);
				tableIdentifier();
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1223);
				tableIdentifier();
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1224);
					partitionSpec();
					}
				}

				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1229);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1231);
				tableIdentifier();
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1232);
					partitionSpec();
					}
				}

				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1239);
				tableIdentifier();
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1240);
					partitionSpec();
					}
				}

				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1244);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1247);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1248);
				tableIdentifier();
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1249);
					partitionSpec();
					}
				}

				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1256);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1259);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
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
		enterRule(_localctx, 30, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1262);
			match(CREATE);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1263);
				match(TEMPORARY);
				}
			}

			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1266);
				match(EXTERNAL);
				}
			}

			setState(1269);
			match(TABLE);
			setState(1273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1270);
				match(IF);
				setState(1271);
				match(NOT);
				setState(1272);
				match(EXISTS);
				}
				break;
			}
			setState(1275);
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
		enterRule(_localctx, 32, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			match(CLUSTERED);
			setState(1278);
			match(BY);
			setState(1279);
			identifierList();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1280);
				match(SORTED);
				setState(1281);
				match(BY);
				setState(1282);
				orderedIdentifierList();
				}
			}

			setState(1285);
			match(INTO);
			setState(1286);
			match(INTEGER_VALUE);
			setState(1287);
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
		enterRule(_localctx, 34, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			match(SKEWED);
			setState(1290);
			match(BY);
			setState(1291);
			identifierList();
			setState(1292);
			match(ON);
			setState(1295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1293);
				constantList();
				}
				break;
			case 2:
				{
				setState(1294);
				nestedConstantList();
				}
				break;
			}
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1297);
				match(STORED);
				setState(1298);
				match(AS);
				setState(1299);
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
		enterRule(_localctx, 36, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(LOCATION);
			setState(1303);
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
		enterRule(_localctx, 38, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1305);
				ctes();
				}
			}

			setState(1308);
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
		enterRule(_localctx, 40, RULE_insertInto);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1310);
				match(INSERT);
				setState(1311);
				match(OVERWRITE);
				setState(1312);
				match(TABLE);
				setState(1313);
				tableIdentifier();
				setState(1320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1314);
					partitionSpec();
					setState(1318);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1315);
						match(IF);
						setState(1316);
						match(NOT);
						setState(1317);
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
				setState(1322);
				match(INSERT);
				setState(1323);
				match(INTO);
				setState(1325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1324);
					match(TABLE);
					}
					break;
				}
				setState(1327);
				tableIdentifier();
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1328);
					partitionSpec();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1331);
				match(INSERT);
				setState(1332);
				match(OVERWRITE);
				setState(1334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1333);
					match(LOCAL);
					}
				}

				setState(1336);
				match(DIRECTORY);
				setState(1337);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1338);
					rowFormat();
					}
				}

				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1341);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1344);
				match(INSERT);
				setState(1345);
				match(OVERWRITE);
				setState(1347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1346);
					match(LOCAL);
					}
				}

				setState(1349);
				match(DIRECTORY);
				setState(1351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1350);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1353);
				tableProvider();
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1354);
					match(OPTIONS);
					setState(1355);
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

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_setClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(SET);
			setState(1361);
			assign();
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1362);
				match(T__2);
				setState(1363);
				assign();
				}
				}
				setState(1368);
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

	public static class AssignContext extends ParserRuleContext {
		public IdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			((AssignContext)_localctx).key = identifier();
			setState(1370);
			match(EQ);
			setState(1371);
			((AssignContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			assignment();
			setState(1378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1374);
				match(T__2);
				setState(1375);
				assignment();
				}
				}
				setState(1380);
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

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SparkSqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1382);
			match(EQ);
			setState(1383);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_multipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1385);
				identifier();
				setState(1386);
				match(T__3);
				}
				break;
			}
			setState(1390);
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
		enterRule(_localctx, 52, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			partitionSpec();
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1393);
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
		enterRule(_localctx, 54, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			match(PARTITION);
			setState(1397);
			match(T__0);
			setState(1398);
			partitionVal();
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1399);
				match(T__2);
				setState(1400);
				partitionVal();
				}
				}
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1406);
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
		enterRule(_localctx, 56, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			identifier();
			setState(1411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1409);
				match(EQ);
				setState(1410);
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
		enterRule(_localctx, 58, RULE_describeFuncName);
		try {
			setState(1418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1416);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1417);
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
		enterRule(_localctx, 60, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1420);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1421);
				match(T__3);
				setState(1422);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1427);
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
		enterRule(_localctx, 62, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1428);
			match(WITH);
			setState(1429);
			namedQuery();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1430);
				match(T__2);
				setState(1431);
				namedQuery();
				}
				}
				setState(1436);
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
		enterRule(_localctx, 64, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			((NamedQueryContext)_localctx).name = identifier();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1438);
				match(AS);
				}
			}

			setState(1441);
			match(T__0);
			setState(1442);
			query();
			setState(1443);
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
		enterRule(_localctx, 66, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			match(USING);
			setState(1446);
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
		enterRule(_localctx, 68, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(T__0);
			setState(1449);
			tableProperty();
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1450);
				match(T__2);
				setState(1451);
				tableProperty();
				}
				}
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1457);
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
		enterRule(_localctx, 70, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE || _la==EQ || ((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (STRING - 271)) | (1L << (INTEGER_VALUE - 271)) | (1L << (DECIMAL_VALUE - 271)))) != 0)) {
				{
				setState(1461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1460);
					match(EQ);
					}
				}

				setState(1463);
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
		enterRule(_localctx, 72, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1475);
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
			case UPDATE:
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
			case SUBSTR:
			case SUBSTRING:
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
			case CONVERT:
			case DELTA:
			case PARQUET:
			case VACUUM:
			case RETAIN:
			case RUN:
			case HISTORY:
			case HOURS:
			case DETAIL:
			case DRY:
			case MATCHED:
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
			case STATUS:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case TRIM:
			case OVERLAY:
			case PLACING:
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
			case UNKNOWN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				identifier();
				setState(1471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1467);
					match(T__3);
					setState(1468);
					identifier();
					}
					}
					setState(1473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1474);
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
		enterRule(_localctx, 74, RULE_tablePropertyValue);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				match(DECIMAL_VALUE);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1479);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1480);
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
		enterRule(_localctx, 76, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(T__0);
			setState(1484);
			constant();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1485);
				match(T__2);
				setState(1486);
				constant();
				}
				}
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1492);
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
		enterRule(_localctx, 78, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1494);
			match(T__0);
			setState(1495);
			constantList();
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1496);
				match(T__2);
				setState(1497);
				constantList();
				}
				}
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1503);
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
		enterRule(_localctx, 80, RULE_createFileFormat);
		try {
			setState(1511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1505);
				match(STORED);
				setState(1506);
				match(AS);
				setState(1507);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(STORED);
				setState(1509);
				match(BY);
				setState(1510);
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
		enterRule(_localctx, 82, RULE_fileFormat);
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1513);
				match(INPUTFORMAT);
				setState(1514);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1515);
				match(OUTPUTFORMAT);
				setState(1516);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
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
		enterRule(_localctx, 84, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(STRING);
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1521);
				match(WITH);
				setState(1522);
				match(SERDEPROPERTIES);
				setState(1523);
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
		enterRule(_localctx, 86, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1526);
			identifier();
			setState(1527);
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
		enterRule(_localctx, 88, RULE_queryNoWith);
		int _la;
		try {
			setState(1541);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INSERT) {
					{
					setState(1529);
					insertInto();
					}
				}

				setState(1532);
				queryTerm(0);
				setState(1533);
				queryOrganization();
				}
				break;
			case 2:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1535);
				fromClause();
				setState(1537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1536);
					multiInsertQueryBody();
					}
					}
					setState(1539); 
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
		enterRule(_localctx, 90, RULE_queryOrganization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1543);
				match(ORDER);
				setState(1544);
				match(BY);
				setState(1545);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1546);
					match(T__2);
					setState(1547);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLUSTER) {
				{
				setState(1555);
				match(CLUSTER);
				setState(1556);
				match(BY);
				setState(1557);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1558);
					match(T__2);
					setState(1559);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTRIBUTE) {
				{
				setState(1567);
				match(DISTRIBUTE);
				setState(1568);
				match(BY);
				setState(1569);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1570);
					match(T__2);
					setState(1571);
					((QueryOrganizationContext)_localctx).expression = expression();
					((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
					}
					}
					setState(1576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORT) {
				{
				setState(1579);
				match(SORT);
				setState(1580);
				match(BY);
				setState(1581);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1582);
					match(T__2);
					setState(1583);
					((QueryOrganizationContext)_localctx).sortItem = sortItem();
					((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
					}
					}
					setState(1588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1591);
				windows();
				}
			}

			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1594);
				match(LIMIT);
				setState(1597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1595);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1596);
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
		enterRule(_localctx, 92, RULE_multiInsertQueryBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INSERT) {
				{
				setState(1601);
				insertInto();
				}
			}

			setState(1604);
			querySpecification();
			setState(1605);
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
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1608);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1631);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1610);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1611);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1612);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (EXCEPT - 103)) | (1L << (SETMINUS - 103)) | (1L << (INTERSECT - 103)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1614);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1613);
							setQuantifier();
							}
						}

						setState(1616);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1617);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1618);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1619);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1620);
							setQuantifier();
							}
						}

						setState(1623);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1624);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1625);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1626);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (UNION - 103)) | (1L << (EXCEPT - 103)) | (1L << (SETMINUS - 103)))) != 0)) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1628);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1627);
							setQuantifier();
							}
						}

						setState(1630);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
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
		enterRule(_localctx, 96, RULE_queryPrimary);
		try {
			setState(1644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
			case FROM:
			case MAP:
			case REDUCE:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1636);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1637);
				match(TABLE);
				setState(1638);
				tableIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1639);
				inlineTable();
				}
				break;
			case T__0:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1640);
				match(T__0);
				setState(1641);
				queryNoWith();
				setState(1642);
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
		enterRule(_localctx, 98, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1646);
			expression();
			setState(1648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1647);
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

			setState(1652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(1650);
				match(NULLS);
				setState(1651);
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
		enterRule(_localctx, 100, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(1664);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1654);
					match(SELECT);
					setState(1655);
					((QuerySpecificationContext)_localctx).kind = match(TRANSFORM);
					setState(1656);
					match(T__0);
					setState(1657);
					namedExpressionSeq();
					setState(1658);
					match(T__1);
					}
					break;
				case MAP:
					{
					setState(1660);
					((QuerySpecificationContext)_localctx).kind = match(MAP);
					setState(1661);
					namedExpressionSeq();
					}
					break;
				case REDUCE:
					{
					setState(1662);
					((QuerySpecificationContext)_localctx).kind = match(REDUCE);
					setState(1663);
					namedExpressionSeq();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1666);
					((QuerySpecificationContext)_localctx).inRowFormat = rowFormat();
					}
				}

				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RECORDWRITER) {
					{
					setState(1669);
					match(RECORDWRITER);
					setState(1670);
					((QuerySpecificationContext)_localctx).recordWriter = match(STRING);
					}
				}

				setState(1673);
				match(USING);
				setState(1674);
				((QuerySpecificationContext)_localctx).script = match(STRING);
				setState(1687);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1675);
					match(AS);
					setState(1685);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						setState(1676);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1677);
						colTypeList();
						}
						break;
					case 3:
						{
						{
						setState(1678);
						match(T__0);
						setState(1681);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
						case 1:
							{
							setState(1679);
							identifierSeq();
							}
							break;
						case 2:
							{
							setState(1680);
							colTypeList();
							}
							break;
						}
						setState(1683);
						match(T__1);
						}
						}
						break;
					}
					}
					break;
				}
				setState(1690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1689);
					((QuerySpecificationContext)_localctx).outRowFormat = rowFormat();
					}
					break;
				}
				setState(1694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1692);
					match(RECORDREADER);
					setState(1693);
					((QuerySpecificationContext)_localctx).recordReader = match(STRING);
					}
					break;
				}
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1696);
					fromClause();
					}
					break;
				}
				setState(1701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1699);
					match(WHERE);
					setState(1700);
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
				setState(1725);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					setState(1703);
					((QuerySpecificationContext)_localctx).kind = match(SELECT);
					setState(1707);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(1704);
						((QuerySpecificationContext)_localctx).hint = hint();
						((QuerySpecificationContext)_localctx).hints.add(((QuerySpecificationContext)_localctx).hint);
						}
						}
						setState(1709);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1711);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						setState(1710);
						setQuantifier();
						}
						break;
					}
					setState(1713);
					namedExpressionSeq();
					setState(1715);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
					case 1:
						{
						setState(1714);
						fromClause();
						}
						break;
					}
					}
					break;
				case FROM:
					{
					setState(1717);
					fromClause();
					setState(1723);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1718);
						((QuerySpecificationContext)_localctx).kind = match(SELECT);
						setState(1720);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
						case 1:
							{
							setState(1719);
							setQuantifier();
							}
							break;
						}
						setState(1722);
						namedExpressionSeq();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1727);
						lateralView();
						}
						} 
					}
					setState(1732);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
				}
				setState(1735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1733);
					match(WHERE);
					setState(1734);
					((QuerySpecificationContext)_localctx).where = booleanExpression(0);
					}
					break;
				}
				setState(1738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1737);
					aggregation();
					}
					break;
				}
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1740);
					match(HAVING);
					setState(1741);
					((QuerySpecificationContext)_localctx).having = booleanExpression(0);
					}
					break;
				}
				setState(1745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1744);
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
		enterRule(_localctx, 102, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			match(T__4);
			setState(1750);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
				{
				{
				setState(1752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1751);
					match(T__2);
					}
				}

				setState(1754);
				((HintContext)_localctx).hintStatement = hintStatement();
				((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
				}
				}
				setState(1759);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1760);
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
		enterRule(_localctx, 104, RULE_hintStatement);
		int _la;
		try {
			setState(1775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1763);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1764);
				match(T__0);
				setState(1765);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1766);
					match(T__2);
					setState(1767);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1772);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1773);
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
		enterRule(_localctx, 106, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			match(FROM);
			setState(1778);
			relation();
			setState(1783);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1779);
					match(T__2);
					setState(1780);
					relation();
					}
					} 
				}
				setState(1785);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1789);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1786);
					lateralView();
					}
					} 
				}
				setState(1791);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,227,_ctx);
			}
			setState(1793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1792);
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
		enterRule(_localctx, 108, RULE_aggregation);
		int _la;
		try {
			int _alt;
			setState(1839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1795);
				match(GROUP);
				setState(1796);
				match(BY);
				setState(1797);
				((AggregationContext)_localctx).expression = expression();
				((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
				setState(1802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1798);
						match(T__2);
						setState(1799);
						((AggregationContext)_localctx).expression = expression();
						((AggregationContext)_localctx).groupingExpressions.add(((AggregationContext)_localctx).expression);
						}
						} 
					}
					setState(1804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
				}
				setState(1822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1805);
					match(WITH);
					setState(1806);
					((AggregationContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1807);
					match(WITH);
					setState(1808);
					((AggregationContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1809);
					((AggregationContext)_localctx).kind = match(GROUPING);
					setState(1810);
					match(SETS);
					setState(1811);
					match(T__0);
					setState(1812);
					groupingSet();
					setState(1817);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1813);
						match(T__2);
						setState(1814);
						groupingSet();
						}
						}
						setState(1819);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1820);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1824);
				match(GROUP);
				setState(1825);
				match(BY);
				setState(1826);
				((AggregationContext)_localctx).kind = match(GROUPING);
				setState(1827);
				match(SETS);
				setState(1828);
				match(T__0);
				setState(1829);
				groupingSet();
				setState(1834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1830);
					match(T__2);
					setState(1831);
					groupingSet();
					}
					}
					setState(1836);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1837);
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
		enterRule(_localctx, 110, RULE_groupingSet);
		int _la;
		try {
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1841);
				match(T__0);
				setState(1850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
					{
					setState(1842);
					expression();
					setState(1847);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1843);
						match(T__2);
						setState(1844);
						expression();
						}
						}
						setState(1849);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1852);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1853);
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
		enterRule(_localctx, 112, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
			match(PIVOT);
			setState(1857);
			match(T__0);
			setState(1858);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(1859);
			match(FOR);
			setState(1860);
			pivotColumn();
			setState(1861);
			match(IN);
			setState(1862);
			match(T__0);
			setState(1863);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1864);
				match(T__2);
				setState(1865);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(1870);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1871);
			match(T__1);
			setState(1872);
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
		enterRule(_localctx, 114, RULE_pivotColumn);
		int _la;
		try {
			setState(1886);
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
			case UPDATE:
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
			case SUBSTR:
			case SUBSTRING:
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
			case CONVERT:
			case DELTA:
			case PARQUET:
			case VACUUM:
			case RETAIN:
			case RUN:
			case HISTORY:
			case HOURS:
			case DETAIL:
			case DRY:
			case MATCHED:
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
			case STATUS:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case TRIM:
			case OVERLAY:
			case PLACING:
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
			case UNKNOWN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(1875);
				match(T__0);
				setState(1876);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1877);
					match(T__2);
					setState(1878);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(1883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1884);
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
		enterRule(_localctx, 116, RULE_pivotValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			expression();
			setState(1893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
				{
				setState(1890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1889);
					match(AS);
					}
					break;
				}
				setState(1892);
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
		enterRule(_localctx, 118, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			match(LATERAL);
			setState(1896);
			match(VIEW);
			setState(1898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1897);
				match(OUTER);
				}
				break;
			}
			setState(1900);
			qualifiedName();
			setState(1901);
			match(T__0);
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
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
			((LateralViewContext)_localctx).tblName = identifier();
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				{
				setState(1915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1914);
					match(AS);
					}
					break;
				}
				setState(1917);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(1922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1918);
						match(T__2);
						setState(1919);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(1924);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,246,_ctx);
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
		enterRule(_localctx, 120, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
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
		enterRule(_localctx, 122, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			relationPrimary();
			setState(1933);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1930);
					joinRelation();
					}
					} 
				}
				setState(1935);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
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
		enterRule(_localctx, 124, RULE_joinRelation);
		try {
			setState(1947);
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
				setState(1936);
				joinType();
				}
				setState(1937);
				match(JOIN);
				setState(1938);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(1940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(1939);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1942);
				match(NATURAL);
				setState(1943);
				joinType();
				setState(1944);
				match(JOIN);
				setState(1945);
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
		enterRule(_localctx, 126, RULE_joinType);
		int _la;
		try {
			setState(1971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1949);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1952);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1953);
				match(LEFT);
				setState(1955);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1954);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1957);
				match(LEFT);
				setState(1958);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1959);
				match(RIGHT);
				setState(1961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1960);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1963);
				match(FULL);
				setState(1965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(1964);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(1967);
					match(LEFT);
					}
				}

				setState(1970);
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
		enterRule(_localctx, 128, RULE_joinCriteria);
		int _la;
		try {
			setState(1987);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(1973);
				match(ON);
				setState(1974);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1975);
				match(USING);
				setState(1976);
				match(T__0);
				setState(1977);
				identifier();
				setState(1982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1978);
					match(T__2);
					setState(1979);
					identifier();
					}
					}
					setState(1984);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1985);
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
		enterRule(_localctx, 130, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1989);
			match(TABLESAMPLE);
			setState(1990);
			match(T__0);
			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
				{
				setState(1991);
				sampleMethod();
				}
			}

			setState(1994);
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
		enterRule(_localctx, 132, RULE_sampleMethod);
		int _la;
		try {
			setState(2020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1996);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(1999);
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
				setState(2000);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2001);
				expression();
				setState(2002);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2004);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2005);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2006);
				match(OUT);
				setState(2007);
				match(OF);
				setState(2008);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2009);
					match(ON);
					setState(2015);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
					case 1:
						{
						setState(2010);
						identifier();
						}
						break;
					case 2:
						{
						setState(2011);
						qualifiedName();
						setState(2012);
						match(T__0);
						setState(2013);
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
				setState(2019);
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
		enterRule(_localctx, 134, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			match(T__0);
			setState(2023);
			identifierSeq();
			setState(2024);
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
		enterRule(_localctx, 136, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			identifier();
			setState(2031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2027);
					match(T__2);
					setState(2028);
					identifier();
					}
					} 
				}
				setState(2033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
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
		enterRule(_localctx, 138, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			match(T__0);
			setState(2035);
			orderedIdentifier();
			setState(2040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2036);
				match(T__2);
				setState(2037);
				orderedIdentifier();
				}
				}
				setState(2042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2043);
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
		enterRule(_localctx, 140, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			identifier();
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2046);
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
		enterRule(_localctx, 142, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2049);
			match(T__0);
			setState(2050);
			identifierComment();
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2051);
				match(T__2);
				setState(2052);
				identifierComment();
				}
				}
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2058);
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
		enterRule(_localctx, 144, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2060);
			identifier();
			setState(2063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2061);
				match(COMMENT);
				setState(2062);
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
		enterRule(_localctx, 146, RULE_relationPrimary);
		try {
			setState(2089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2065);
				tableIdentifier();
				setState(2067);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2066);
					sample();
					}
					break;
				}
				setState(2069);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2071);
				match(T__0);
				setState(2072);
				queryNoWith();
				setState(2073);
				match(T__1);
				setState(2075);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2074);
					sample();
					}
					break;
				}
				setState(2077);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2079);
				match(T__0);
				setState(2080);
				relation();
				setState(2081);
				match(T__1);
				setState(2083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2082);
					sample();
					}
					break;
				}
				setState(2085);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2087);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2088);
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
		enterRule(_localctx, 148, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2091);
			match(VALUES);
			setState(2092);
			expression();
			setState(2097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2093);
					match(T__2);
					setState(2094);
					expression();
					}
					} 
				}
				setState(2099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			}
			setState(2100);
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
		enterRule(_localctx, 150, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			identifier();
			setState(2103);
			match(T__0);
			setState(2112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
				{
				setState(2104);
				expression();
				setState(2109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2105);
					match(T__2);
					setState(2106);
					expression();
					}
					}
					setState(2111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2114);
			match(T__1);
			setState(2115);
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
		enterRule(_localctx, 152, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				{
				setState(2118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2117);
					match(AS);
					}
					break;
				}
				setState(2120);
				strictIdentifier();
				setState(2122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2121);
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
		enterRule(_localctx, 154, RULE_rowFormat);
		try {
			setState(2175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				match(ROW);
				setState(2127);
				match(FORMAT);
				setState(2128);
				match(SERDE);
				setState(2129);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2133);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2130);
					match(WITH);
					setState(2131);
					match(SERDEPROPERTIES);
					setState(2132);
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
				setState(2135);
				match(ROW);
				setState(2136);
				match(FORMAT);
				setState(2137);
				match(DELIMITED);
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2138);
					match(FIELDS);
					setState(2139);
					match(TERMINATED);
					setState(2140);
					match(BY);
					setState(2141);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2145);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
					case 1:
						{
						setState(2142);
						match(ESCAPED);
						setState(2143);
						match(BY);
						setState(2144);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2149);
					match(COLLECTION);
					setState(2150);
					match(ITEMS);
					setState(2151);
					match(TERMINATED);
					setState(2152);
					match(BY);
					setState(2153);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2156);
					match(MAP);
					setState(2157);
					match(KEYS);
					setState(2158);
					match(TERMINATED);
					setState(2159);
					match(BY);
					setState(2160);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2167);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2163);
					match(LINES);
					setState(2164);
					match(TERMINATED);
					setState(2165);
					match(BY);
					setState(2166);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2173);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2169);
					match(NULL);
					setState(2170);
					match(DEFINED);
					setState(2171);
					match(AS);
					setState(2172);
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
		public TerminalNode DRUID() { return getToken(SparkSqlBaseParser.DRUID, 0); }
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
		enterRule(_localctx, 156, RULE_tableIdentifier);
		int _la;
		try {
			setState(2188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2177);
					((TableIdentifierContext)_localctx).db = identifier();
					setState(2178);
					match(T__3);
					}
					break;
				}
				setState(2182);
				((TableIdentifierContext)_localctx).table = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRUID) {
					{
					setState(2183);
					match(DRUID);
					setState(2184);
					match(T__3);
					}
				}

				setState(2187);
				((TableIdentifierContext)_localctx).table = identifier();
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
		enterRule(_localctx, 158, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2190);
				((FunctionIdentifierContext)_localctx).db = identifier();
				setState(2191);
				match(T__3);
				}
				break;
			}
			setState(2195);
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
		enterRule(_localctx, 160, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2197);
			expression();
			setState(2205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2199);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2198);
					match(AS);
					}
					break;
				}
				setState(2203);
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
				case UPDATE:
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
				case SUBSTR:
				case SUBSTRING:
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
				case CONVERT:
				case DELTA:
				case PARQUET:
				case VACUUM:
				case RETAIN:
				case RUN:
				case HISTORY:
				case HOURS:
				case DETAIL:
				case DRY:
				case MATCHED:
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
				case STATUS:
				case SORT:
				case CLUSTER:
				case DISTRIBUTE:
				case TRIM:
				case OVERLAY:
				case PLACING:
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
				case UNKNOWN:
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
					{
					setState(2201);
					identifier();
					}
					break;
				case T__0:
					{
					setState(2202);
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
		enterRule(_localctx, 162, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			namedExpression();
			setState(2212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2208);
					match(T__2);
					setState(2209);
					namedExpression();
					}
					} 
				}
				setState(2214);
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
		enterRule(_localctx, 164, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
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
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2218);
				match(NOT);
				setState(2219);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2220);
				match(EXISTS);
				setState(2221);
				match(T__0);
				setState(2222);
				query();
				setState(2223);
				match(T__1);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2225);
				valueExpression(0);
				setState(2227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2226);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,298,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2231);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2232);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2233);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2235);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2236);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2241);
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
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkSqlBaseParser.UNKNOWN, 0); }
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
		enterRule(_localctx, 168, RULE_predicate);
		int _la;
		try {
			setState(2295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2242);
					match(NOT);
					}
				}

				setState(2245);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2246);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2247);
				match(AND);
				setState(2248);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2250);
					match(NOT);
					}
				}

				setState(2253);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2254);
				match(T__0);
				setState(2255);
				expression();
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(2256);
					match(T__2);
					setState(2257);
					expression();
					}
					}
					setState(2262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2263);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2265);
					match(NOT);
					}
				}

				setState(2268);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2269);
				match(T__0);
				setState(2270);
				query();
				setState(2271);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2273);
					match(NOT);
					}
				}

				setState(2276);
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
				setState(2277);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2278);
				match(IS);
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2279);
					match(NOT);
					}
				}

				setState(2282);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2283);
				match(IS);
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2284);
					match(NOT);
					}
				}

				setState(2287);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2288);
				match(IS);
				setState(2290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2289);
					match(NOT);
					}
				}

				setState(2292);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2293);
				match(FROM);
				setState(2294);
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
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2298);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2299);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PLUS - 157)) | (1L << (MINUS - 157)) | (1L << (TILDE - 157)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2300);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2303);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2304);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 159)) & ~0x3f) == 0 && ((1L << (_la - 159)) & ((1L << (ASTERISK - 159)) | (1L << (SLASH - 159)) | (1L << (PERCENT - 159)) | (1L << (DIV - 159)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2305);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2306);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2307);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PLUS - 157)) | (1L << (MINUS - 157)) | (1L << (CONCAT_PIPE - 157)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2308);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2309);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2310);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2311);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2312);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2313);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2314);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2315);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2316);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2317);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2318);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2319);
						comparisonOperator();
						setState(2320);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
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
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitOverlay(this);
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
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
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
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
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
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2328);
				match(CASE);
				setState(2330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2329);
					whenClause();
					}
					}
					setState(2332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2334);
					match(ELSE);
					setState(2335);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2338);
				match(END);
				}
				break;
			case 2:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2340);
				match(CASE);
				setState(2341);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2342);
					whenClause();
					}
					}
					setState(2345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2347);
					match(ELSE);
					setState(2348);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2351);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2353);
				match(CAST);
				setState(2354);
				match(T__0);
				setState(2355);
				expression();
				setState(2356);
				match(AS);
				setState(2357);
				dataType();
				setState(2358);
				match(T__1);
				}
				break;
			case 4:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2360);
				match(STRUCT);
				setState(2361);
				match(T__0);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
					{
					setState(2362);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2367);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2363);
						match(T__2);
						setState(2364);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2369);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2372);
				match(T__1);
				}
				break;
			case 5:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2373);
				match(FIRST);
				setState(2374);
				match(T__0);
				setState(2375);
				expression();
				setState(2378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2376);
					match(IGNORE);
					setState(2377);
					match(NULLS);
					}
				}

				setState(2380);
				match(T__1);
				}
				break;
			case 6:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2382);
				match(LAST);
				setState(2383);
				match(T__0);
				setState(2384);
				expression();
				setState(2387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2385);
					match(IGNORE);
					setState(2386);
					match(NULLS);
					}
				}

				setState(2389);
				match(T__1);
				}
				break;
			case 7:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2391);
				match(POSITION);
				setState(2392);
				match(T__0);
				setState(2393);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2394);
				match(IN);
				setState(2395);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2396);
				match(T__1);
				}
				break;
			case 8:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2398);
				constant();
				}
				break;
			case 9:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2399);
				match(ASTERISK);
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2400);
				qualifiedName();
				setState(2401);
				match(T__3);
				setState(2402);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2404);
				match(T__0);
				setState(2405);
				namedExpression();
				setState(2408); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2406);
					match(T__2);
					setState(2407);
					namedExpression();
					}
					}
					setState(2410); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2412);
				match(T__1);
				}
				break;
			case 12:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2414);
				match(T__0);
				setState(2415);
				query();
				setState(2416);
				match(T__1);
				}
				break;
			case 13:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2418);
				qualifiedName();
				setState(2419);
				match(T__0);
				setState(2431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (ASTERISK - 128)) | (1L << (DIV - 128)) | (1L << (TILDE - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (STRING - 256)) | (1L << (BIGINT_LITERAL - 256)) | (1L << (SMALLINT_LITERAL - 256)) | (1L << (TINYINT_LITERAL - 256)) | (1L << (INTEGER_VALUE - 256)) | (1L << (DECIMAL_VALUE - 256)) | (1L << (DOUBLE_LITERAL - 256)) | (1L << (BIGDECIMAL_LITERAL - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
					{
					setState(2421);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						setState(2420);
						setQuantifier();
						}
						break;
					}
					setState(2423);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2424);
						match(T__2);
						setState(2425);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2430);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2433);
				match(T__1);
				setState(2436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2434);
					match(OVER);
					setState(2435);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2438);
				match(IDENTIFIER);
				setState(2439);
				match(T__6);
				setState(2440);
				expression();
				}
				break;
			case 15:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2441);
				match(T__0);
				setState(2442);
				match(IDENTIFIER);
				setState(2445); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2443);
					match(T__2);
					setState(2444);
					match(IDENTIFIER);
					}
					}
					setState(2447); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(2449);
				match(T__1);
				setState(2450);
				match(T__6);
				setState(2451);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2452);
				identifier();
				}
				break;
			case 17:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2453);
				match(T__0);
				setState(2454);
				expression();
				setState(2455);
				match(T__1);
				}
				break;
			case 18:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2457);
				match(EXTRACT);
				setState(2458);
				match(T__0);
				setState(2459);
				((ExtractContext)_localctx).field = identifier();
				setState(2460);
				match(FROM);
				setState(2461);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2462);
				match(T__1);
				}
				break;
			case 19:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2464);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2465);
				match(T__0);
				setState(2466);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2467);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2468);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==FOR) {
					{
					setState(2469);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2470);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2473);
				match(T__1);
				}
				break;
			case 20:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2475);
				match(TRIM);
				setState(2476);
				match(T__0);
				setState(2478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
				case 1:
					{
					setState(2477);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)))) != 0)) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2481);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
				case 1:
					{
					setState(2480);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2483);
				match(FROM);
				setState(2484);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2485);
				match(T__1);
				}
				break;
			case 21:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2487);
				match(OVERLAY);
				setState(2488);
				match(T__0);
				setState(2489);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2490);
				match(PLACING);
				setState(2491);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2492);
				match(FROM);
				setState(2493);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2494);
					match(FOR);
					setState(2495);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2498);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2510);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2502);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2503);
						match(T__7);
						setState(2504);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2505);
						match(T__8);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2507);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2508);
						match(T__3);
						setState(2509);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
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
		enterRule(_localctx, 174, RULE_constant);
		try {
			int _alt;
			setState(2527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2515);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2516);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2517);
				identifier();
				setState(2518);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2520);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2521);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2523); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2522);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2525); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,332,_ctx);
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
		enterRule(_localctx, 176, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			_la = _input.LA(1);
			if ( !(((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (EQ - 149)) | (1L << (NSEQ - 149)) | (1L << (NEQ - 149)) | (1L << (NEQJ - 149)) | (1L << (LT - 149)) | (1L << (LTE - 149)) | (1L << (GT - 149)) | (1L << (GTE - 149)))) != 0)) ) {
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
		enterRule(_localctx, 178, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2531);
			_la = _input.LA(1);
			if ( !(((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (PLUS - 157)) | (1L << (MINUS - 157)) | (1L << (ASTERISK - 157)) | (1L << (SLASH - 157)) | (1L << (PERCENT - 157)) | (1L << (DIV - 157)) | (1L << (TILDE - 157)) | (1L << (AMPERSAND - 157)) | (1L << (PIPE - 157)) | (1L << (CONCAT_PIPE - 157)) | (1L << (HAT - 157)))) != 0)) ) {
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
		enterRule(_localctx, 180, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2533);
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
		enterRule(_localctx, 182, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2535);
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
		enterRule(_localctx, 184, RULE_interval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			match(INTERVAL);
			setState(2541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2538);
					intervalField();
					}
					} 
				}
				setState(2543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,334,_ctx);
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
		enterRule(_localctx, 186, RULE_intervalField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			((IntervalFieldContext)_localctx).value = intervalValue();
			setState(2545);
			((IntervalFieldContext)_localctx).unit = identifier();
			setState(2548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,335,_ctx) ) {
			case 1:
				{
				setState(2546);
				match(TO);
				setState(2547);
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
		enterRule(_localctx, 188, RULE_intervalValue);
		int _la;
		try {
			setState(2555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2550);
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

				setState(2553);
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
				setState(2554);
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
		enterRule(_localctx, 190, RULE_colPosition);
		try {
			setState(2560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2558);
				match(AFTER);
				setState(2559);
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
		enterRule(_localctx, 192, RULE_dataType);
		int _la;
		try {
			setState(2596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2562);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2563);
				match(LT);
				setState(2564);
				dataType();
				setState(2565);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2567);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2568);
				match(LT);
				setState(2569);
				dataType();
				setState(2570);
				match(T__2);
				setState(2571);
				dataType();
				setState(2572);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2574);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2581);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2575);
					match(LT);
					setState(2577);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SELECT) | (1L << FROM) | (1L << ADD) | (1L << AS) | (1L << ALL) | (1L << ANY) | (1L << DISTINCT) | (1L << WHERE) | (1L << GROUP) | (1L << BY) | (1L << GROUPING) | (1L << SETS) | (1L << CUBE) | (1L << ROLLUP) | (1L << ORDER) | (1L << HAVING) | (1L << LIMIT) | (1L << AT) | (1L << OR) | (1L << AND) | (1L << IN) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << BETWEEN) | (1L << LIKE) | (1L << RLIKE) | (1L << IS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << NULLS) | (1L << ASC) | (1L << DESC) | (1L << FOR) | (1L << INTERVAL) | (1L << CASE) | (1L << WHEN) | (1L << THEN) | (1L << ELSE) | (1L << END) | (1L << JOIN) | (1L << CROSS) | (1L << OUTER) | (1L << INNER) | (1L << LEFT) | (1L << SEMI) | (1L << RIGHT) | (1L << FULL) | (1L << NATURAL) | (1L << ON) | (1L << PIVOT) | (1L << LATERAL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (WINDOW - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (UNBOUNDED - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (FIRST - 64)) | (1L << (AFTER - 64)) | (1L << (LAST - 64)) | (1L << (ROW - 64)) | (1L << (WITH - 64)) | (1L << (VALUES - 64)) | (1L << (CREATE - 64)) | (1L << (TABLE - 64)) | (1L << (DIRECTORY - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (INSERT - 64)) | (1L << (DELETE - 64)) | (1L << (INTO - 64)) | (1L << (DESCRIBE - 64)) | (1L << (EXPLAIN - 64)) | (1L << (FORMAT - 64)) | (1L << (LOGICAL - 64)) | (1L << (CODEGEN - 64)) | (1L << (COST - 64)) | (1L << (CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (COLUMNS - 64)) | (1L << (COLUMN - 64)) | (1L << (UPDATE - 64)) | (1L << (USE - 64)) | (1L << (PARTITIONS - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (DROP - 64)) | (1L << (UNION - 64)) | (1L << (EXCEPT - 64)) | (1L << (SETMINUS - 64)) | (1L << (INTERSECT - 64)) | (1L << (TO - 64)) | (1L << (TABLESAMPLE - 64)) | (1L << (STRATIFY - 64)) | (1L << (ALTER - 64)) | (1L << (RENAME - 64)) | (1L << (ARRAY - 64)) | (1L << (MAP - 64)) | (1L << (STRUCT - 64)) | (1L << (SUBSTR - 64)) | (1L << (SUBSTRING - 64)) | (1L << (COMMENT - 64)) | (1L << (SET - 64)) | (1L << (RESET - 64)) | (1L << (DATA - 64)) | (1L << (START - 64)) | (1L << (TRANSACTION - 64)) | (1L << (COMMIT - 64)) | (1L << (ROLLBACK - 64)) | (1L << (MACRO - 64)) | (1L << (IGNORE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (BOTH - 128)) | (1L << (LEADING - 128)) | (1L << (TRAILING - 128)) | (1L << (CONVERT - 128)) | (1L << (DELTA - 128)) | (1L << (PARQUET - 128)) | (1L << (VACUUM - 128)) | (1L << (RETAIN - 128)) | (1L << (RUN - 128)) | (1L << (HISTORY - 128)) | (1L << (HOURS - 128)) | (1L << (DETAIL - 128)) | (1L << (DRY - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (KILL - 128)) | (1L << (READ - 128)) | (1L << (IF - 128)) | (1L << (POSITION - 128)) | (1L << (EXTRACT - 128)) | (1L << (DIV - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (BUCKET - 128)) | (1L << (OUT - 128)) | (1L << (OF - 128)) | (1L << (STATUS - 128)) | (1L << (SORT - 128)) | (1L << (CLUSTER - 128)) | (1L << (DISTRIBUTE - 128)) | (1L << (TRIM - 128)) | (1L << (OVERLAY - 128)) | (1L << (PLACING - 128)) | (1L << (OVERWRITE - 128)) | (1L << (TRANSFORM - 128)) | (1L << (REDUCE - 128)) | (1L << (SERDE - 128)) | (1L << (SERDEPROPERTIES - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (DELIMITED - 128)) | (1L << (FIELDS - 128)) | (1L << (TERMINATED - 128)) | (1L << (COLLECTION - 128)) | (1L << (ITEMS - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (KEYS - 192)) | (1L << (ESCAPED - 192)) | (1L << (LINES - 192)) | (1L << (SEPARATED - 192)) | (1L << (FUNCTION - 192)) | (1L << (EXTENDED - 192)) | (1L << (REFRESH - 192)) | (1L << (CLEAR - 192)) | (1L << (CACHE - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNKNOWN - 192)) | (1L << (LAZY - 192)) | (1L << (FORMATTED - 192)) | (1L << (GLOBAL - 192)) | (1L << (TEMPORARY - 192)) | (1L << (OPTIONS - 192)) | (1L << (UNSET - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (DBPROPERTIES - 192)) | (1L << (BUCKETS - 192)) | (1L << (SKEWED - 192)) | (1L << (STORED - 192)) | (1L << (DIRECTORIES - 192)) | (1L << (LOCATION - 192)) | (1L << (EXCHANGE - 192)) | (1L << (ARCHIVE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (FILEFORMAT - 192)) | (1L << (TOUCH - 192)) | (1L << (COMPACT - 192)) | (1L << (CONCATENATE - 192)) | (1L << (CHANGE - 192)) | (1L << (CASCADE - 192)) | (1L << (RESTRICT - 192)) | (1L << (CLUSTERED - 192)) | (1L << (SORTED - 192)) | (1L << (PURGE - 192)) | (1L << (INPUTFORMAT - 192)) | (1L << (OUTPUTFORMAT - 192)) | (1L << (DATABASE - 192)) | (1L << (DATABASES - 192)) | (1L << (DFS - 192)) | (1L << (TRUNCATE - 192)) | (1L << (ANALYZE - 192)) | (1L << (COMPUTE - 192)) | (1L << (LIST - 192)) | (1L << (STATISTICS - 192)) | (1L << (PARTITIONED - 192)) | (1L << (EXTERNAL - 192)) | (1L << (DEFINED - 192)) | (1L << (REVOKE - 192)) | (1L << (GRANT - 192)) | (1L << (LOCK - 192)) | (1L << (UNLOCK - 192)) | (1L << (MSCK - 192)) | (1L << (REPAIR - 192)) | (1L << (RECOVER - 192)) | (1L << (EXPORT - 192)) | (1L << (IMPORT - 192)) | (1L << (LOAD - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (COMPACTIONS - 192)) | (1L << (PRINCIPALS - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (TRANSACTIONS - 256)) | (1L << (INDEX - 256)) | (1L << (INDEXES - 256)) | (1L << (LOCKS - 256)) | (1L << (OPTION - 256)) | (1L << (ANTI - 256)) | (1L << (LOCAL - 256)) | (1L << (INPATH - 256)) | (1L << (IDENTIFIER - 256)) | (1L << (BACKQUOTED_IDENTIFIER - 256)))) != 0)) {
						{
						setState(2576);
						complexColTypeList();
						}
					}

					setState(2579);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2580);
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
				setState(2583);
				identifier();
				setState(2594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2584);
					match(T__0);
					setState(2585);
					match(INTEGER_VALUE);
					setState(2590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2586);
						match(T__2);
						setState(2587);
						match(INTEGER_VALUE);
						}
						}
						setState(2592);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2593);
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
		enterRule(_localctx, 194, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2598);
			colType();
			setState(2603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2599);
					match(T__2);
					setState(2600);
					colType();
					}
					} 
				}
				setState(2605);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,344,_ctx);
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
		enterRule(_localctx, 196, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2606);
			identifier();
			setState(2607);
			dataType();
			setState(2610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
			case 1:
				{
				setState(2608);
				match(COMMENT);
				setState(2609);
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
		enterRule(_localctx, 198, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2612);
			complexColType();
			setState(2617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(2613);
				match(T__2);
				setState(2614);
				complexColType();
				}
				}
				setState(2619);
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
		enterRule(_localctx, 200, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2620);
			identifier();
			setState(2621);
			match(T__9);
			setState(2622);
			dataType();
			setState(2625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2623);
				match(COMMENT);
				setState(2624);
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
		enterRule(_localctx, 202, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			match(WHEN);
			setState(2628);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2629);
			match(THEN);
			setState(2630);
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
		enterRule(_localctx, 204, RULE_windows);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2632);
			match(WINDOW);
			setState(2633);
			namedWindow();
			setState(2638);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2634);
					match(T__2);
					setState(2635);
					namedWindow();
					}
					} 
				}
				setState(2640);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,348,_ctx);
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
		enterRule(_localctx, 206, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
			identifier();
			setState(2642);
			match(AS);
			setState(2643);
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
		enterRule(_localctx, 208, RULE_windowSpec);
		int _la;
		try {
			setState(2687);
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
			case UPDATE:
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
			case SUBSTR:
			case SUBSTRING:
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
			case CONVERT:
			case DELTA:
			case PARQUET:
			case VACUUM:
			case RETAIN:
			case RUN:
			case HISTORY:
			case HOURS:
			case DETAIL:
			case DRY:
			case MATCHED:
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
			case STATUS:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case TRIM:
			case OVERLAY:
			case PLACING:
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
			case UNKNOWN:
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
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				((WindowRefContext)_localctx).name = identifier();
				}
				break;
			case T__0:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2646);
				match(T__0);
				setState(2681);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2647);
					match(CLUSTER);
					setState(2648);
					match(BY);
					setState(2649);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2654);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(2650);
						match(T__2);
						setState(2651);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2656);
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
					setState(2667);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PARTITION || _la==DISTRIBUTE) {
						{
						setState(2657);
						_la = _input.LA(1);
						if ( !(_la==PARTITION || _la==DISTRIBUTE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2658);
						match(BY);
						setState(2659);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2664);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2660);
							match(T__2);
							setState(2661);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2666);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2679);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2669);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2670);
						match(BY);
						setState(2671);
						sortItem();
						setState(2676);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(2672);
							match(T__2);
							setState(2673);
							sortItem();
							}
							}
							setState(2678);
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
				setState(2684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2683);
					windowFrame();
					}
				}

				setState(2686);
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
		enterRule(_localctx, 210, RULE_windowFrame);
		try {
			setState(2705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2689);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2690);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2691);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2692);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2693);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2694);
				match(BETWEEN);
				setState(2695);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2696);
				match(AND);
				setState(2697);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2699);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2700);
				match(BETWEEN);
				setState(2701);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2702);
				match(AND);
				setState(2703);
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
		enterRule(_localctx, 212, RULE_frameBound);
		int _la;
		try {
			setState(2714);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2707);
				match(UNBOUNDED);
				setState(2708);
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
				setState(2709);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2710);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2711);
				expression();
				setState(2712);
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
		enterRule(_localctx, 214, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2716);
			identifier();
			setState(2721);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2717);
					match(T__3);
					setState(2718);
					identifier();
					}
					} 
				}
				setState(2723);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,359,_ctx);
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
		enterRule(_localctx, 216, RULE_identifier);
		try {
			setState(2739);
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
			case UPDATE:
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
			case SUBSTR:
			case SUBSTRING:
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
			case CONVERT:
			case DELTA:
			case PARQUET:
			case VACUUM:
			case RETAIN:
			case RUN:
			case HISTORY:
			case HOURS:
			case DETAIL:
			case DRY:
			case MATCHED:
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
			case STATUS:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case TRIM:
			case OVERLAY:
			case PLACING:
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
			case UNKNOWN:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(2724);
				strictIdentifier();
				}
				break;
			case ANTI:
				enterOuterAlt(_localctx, 2);
				{
				setState(2725);
				match(ANTI);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2726);
				match(FULL);
				}
				break;
			case INNER:
				enterOuterAlt(_localctx, 4);
				{
				setState(2727);
				match(INNER);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2728);
				match(LEFT);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 6);
				{
				setState(2729);
				match(SEMI);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 7);
				{
				setState(2730);
				match(RIGHT);
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(2731);
				match(NATURAL);
				}
				break;
			case JOIN:
				enterOuterAlt(_localctx, 9);
				{
				setState(2732);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 10);
				{
				setState(2733);
				match(CROSS);
				}
				break;
			case ON:
				enterOuterAlt(_localctx, 11);
				{
				setState(2734);
				match(ON);
				}
				break;
			case UNION:
				enterOuterAlt(_localctx, 12);
				{
				setState(2735);
				match(UNION);
				}
				break;
			case INTERSECT:
				enterOuterAlt(_localctx, 13);
				{
				setState(2736);
				match(INTERSECT);
				}
				break;
			case EXCEPT:
				enterOuterAlt(_localctx, 14);
				{
				setState(2737);
				match(EXCEPT);
				}
				break;
			case SETMINUS:
				enterOuterAlt(_localctx, 15);
				{
				setState(2738);
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
		enterRule(_localctx, 218, RULE_strictIdentifier);
		try {
			setState(2744);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2741);
				match(IDENTIFIER);
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2742);
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
			case UPDATE:
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
			case SUBSTR:
			case SUBSTRING:
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
			case CONVERT:
			case DELTA:
			case PARQUET:
			case VACUUM:
			case RETAIN:
			case RUN:
			case HISTORY:
			case HOURS:
			case DETAIL:
			case DRY:
			case MATCHED:
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
			case STATUS:
			case SORT:
			case CLUSTER:
			case DISTRIBUTE:
			case TRIM:
			case OVERLAY:
			case PLACING:
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
			case UNKNOWN:
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
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2743);
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
		enterRule(_localctx, 220, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2746);
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
		enterRule(_localctx, 222, RULE_number);
		int _la;
		try {
			setState(2776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2748);
					match(MINUS);
					}
				}

				setState(2751);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2752);
					match(MINUS);
					}
				}

				setState(2755);
				match(INTEGER_VALUE);
				}
				break;
			case 3:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2756);
					match(MINUS);
					}
				}

				setState(2759);
				match(BIGINT_LITERAL);
				}
				break;
			case 4:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2760);
					match(MINUS);
					}
				}

				setState(2763);
				match(SMALLINT_LITERAL);
				}
				break;
			case 5:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2764);
					match(MINUS);
					}
				}

				setState(2767);
				match(TINYINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2769);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2768);
					match(MINUS);
					}
				}

				setState(2771);
				match(DOUBLE_LITERAL);
				}
				break;
			case 7:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2772);
					match(MINUS);
					}
				}

				setState(2775);
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
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
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
		public TerminalNode UNKNOWN() { return getToken(SparkSqlBaseParser.UNKNOWN, 0); }
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
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
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
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
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
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode STATUS() { return getToken(SparkSqlBaseParser.STATUS, 0); }
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
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
		enterRule(_localctx, 224, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2778);
			_la = _input.LA(1);
			if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (SELECT - 11)) | (1L << (FROM - 11)) | (1L << (ADD - 11)) | (1L << (AS - 11)) | (1L << (ALL - 11)) | (1L << (ANY - 11)) | (1L << (DISTINCT - 11)) | (1L << (WHERE - 11)) | (1L << (GROUP - 11)) | (1L << (BY - 11)) | (1L << (GROUPING - 11)) | (1L << (SETS - 11)) | (1L << (CUBE - 11)) | (1L << (ROLLUP - 11)) | (1L << (ORDER - 11)) | (1L << (HAVING - 11)) | (1L << (LIMIT - 11)) | (1L << (AT - 11)) | (1L << (OR - 11)) | (1L << (AND - 11)) | (1L << (IN - 11)) | (1L << (NOT - 11)) | (1L << (NO - 11)) | (1L << (EXISTS - 11)) | (1L << (BETWEEN - 11)) | (1L << (LIKE - 11)) | (1L << (RLIKE - 11)) | (1L << (IS - 11)) | (1L << (NULL - 11)) | (1L << (TRUE - 11)) | (1L << (FALSE - 11)) | (1L << (NULLS - 11)) | (1L << (ASC - 11)) | (1L << (DESC - 11)) | (1L << (FOR - 11)) | (1L << (INTERVAL - 11)) | (1L << (CASE - 11)) | (1L << (WHEN - 11)) | (1L << (THEN - 11)) | (1L << (ELSE - 11)) | (1L << (END - 11)) | (1L << (OUTER - 11)) | (1L << (PIVOT - 11)) | (1L << (LATERAL - 11)) | (1L << (WINDOW - 11)) | (1L << (OVER - 11)) | (1L << (PARTITION - 11)) | (1L << (RANGE - 11)) | (1L << (ROWS - 11)) | (1L << (UNBOUNDED - 11)) | (1L << (PRECEDING - 11)) | (1L << (FOLLOWING - 11)) | (1L << (CURRENT - 11)) | (1L << (FIRST - 11)) | (1L << (AFTER - 11)))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (LAST - 75)) | (1L << (ROW - 75)) | (1L << (WITH - 75)) | (1L << (VALUES - 75)) | (1L << (CREATE - 75)) | (1L << (TABLE - 75)) | (1L << (DIRECTORY - 75)) | (1L << (VIEW - 75)) | (1L << (REPLACE - 75)) | (1L << (INSERT - 75)) | (1L << (DELETE - 75)) | (1L << (INTO - 75)) | (1L << (DESCRIBE - 75)) | (1L << (EXPLAIN - 75)) | (1L << (FORMAT - 75)) | (1L << (LOGICAL - 75)) | (1L << (CODEGEN - 75)) | (1L << (COST - 75)) | (1L << (CAST - 75)) | (1L << (SHOW - 75)) | (1L << (TABLES - 75)) | (1L << (COLUMNS - 75)) | (1L << (COLUMN - 75)) | (1L << (UPDATE - 75)) | (1L << (USE - 75)) | (1L << (PARTITIONS - 75)) | (1L << (FUNCTIONS - 75)) | (1L << (DROP - 75)) | (1L << (TO - 75)) | (1L << (TABLESAMPLE - 75)) | (1L << (STRATIFY - 75)) | (1L << (ALTER - 75)) | (1L << (RENAME - 75)) | (1L << (ARRAY - 75)) | (1L << (MAP - 75)) | (1L << (STRUCT - 75)) | (1L << (SUBSTR - 75)) | (1L << (SUBSTRING - 75)) | (1L << (COMMENT - 75)) | (1L << (SET - 75)) | (1L << (RESET - 75)) | (1L << (DATA - 75)) | (1L << (START - 75)) | (1L << (TRANSACTION - 75)) | (1L << (COMMIT - 75)) | (1L << (ROLLBACK - 75)) | (1L << (MACRO - 75)) | (1L << (IGNORE - 75)) | (1L << (BOTH - 75)) | (1L << (LEADING - 75)) | (1L << (TRAILING - 75)) | (1L << (CONVERT - 75)) | (1L << (DELTA - 75)) | (1L << (PARQUET - 75)) | (1L << (VACUUM - 75)) | (1L << (RETAIN - 75)) | (1L << (RUN - 75)) | (1L << (HISTORY - 75)) | (1L << (HOURS - 75)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (DETAIL - 139)) | (1L << (DRY - 139)) | (1L << (MATCHED - 139)) | (1L << (MERGE - 139)) | (1L << (KILL - 139)) | (1L << (READ - 139)) | (1L << (IF - 139)) | (1L << (POSITION - 139)) | (1L << (EXTRACT - 139)) | (1L << (DIV - 139)) | (1L << (PERCENTLIT - 139)) | (1L << (BUCKET - 139)) | (1L << (OUT - 139)) | (1L << (OF - 139)) | (1L << (STATUS - 139)) | (1L << (SORT - 139)) | (1L << (CLUSTER - 139)) | (1L << (DISTRIBUTE - 139)) | (1L << (TRIM - 139)) | (1L << (OVERLAY - 139)) | (1L << (PLACING - 139)) | (1L << (OVERWRITE - 139)) | (1L << (TRANSFORM - 139)) | (1L << (REDUCE - 139)) | (1L << (SERDE - 139)) | (1L << (SERDEPROPERTIES - 139)) | (1L << (RECORDREADER - 139)) | (1L << (RECORDWRITER - 139)) | (1L << (DELIMITED - 139)) | (1L << (FIELDS - 139)) | (1L << (TERMINATED - 139)) | (1L << (COLLECTION - 139)) | (1L << (ITEMS - 139)) | (1L << (KEYS - 139)) | (1L << (ESCAPED - 139)) | (1L << (LINES - 139)) | (1L << (SEPARATED - 139)) | (1L << (FUNCTION - 139)) | (1L << (EXTENDED - 139)) | (1L << (REFRESH - 139)) | (1L << (CLEAR - 139)) | (1L << (CACHE - 139)) | (1L << (UNCACHE - 139)) | (1L << (UNKNOWN - 139)))) != 0) || ((((_la - 203)) & ~0x3f) == 0 && ((1L << (_la - 203)) & ((1L << (LAZY - 203)) | (1L << (FORMATTED - 203)) | (1L << (GLOBAL - 203)) | (1L << (TEMPORARY - 203)) | (1L << (OPTIONS - 203)) | (1L << (UNSET - 203)) | (1L << (TBLPROPERTIES - 203)) | (1L << (DBPROPERTIES - 203)) | (1L << (BUCKETS - 203)) | (1L << (SKEWED - 203)) | (1L << (STORED - 203)) | (1L << (DIRECTORIES - 203)) | (1L << (LOCATION - 203)) | (1L << (EXCHANGE - 203)) | (1L << (ARCHIVE - 203)) | (1L << (UNARCHIVE - 203)) | (1L << (FILEFORMAT - 203)) | (1L << (TOUCH - 203)) | (1L << (COMPACT - 203)) | (1L << (CONCATENATE - 203)) | (1L << (CHANGE - 203)) | (1L << (CASCADE - 203)) | (1L << (RESTRICT - 203)) | (1L << (CLUSTERED - 203)) | (1L << (SORTED - 203)) | (1L << (PURGE - 203)) | (1L << (INPUTFORMAT - 203)) | (1L << (OUTPUTFORMAT - 203)) | (1L << (DATABASE - 203)) | (1L << (DATABASES - 203)) | (1L << (DFS - 203)) | (1L << (TRUNCATE - 203)) | (1L << (ANALYZE - 203)) | (1L << (COMPUTE - 203)) | (1L << (LIST - 203)) | (1L << (STATISTICS - 203)) | (1L << (PARTITIONED - 203)) | (1L << (EXTERNAL - 203)) | (1L << (DEFINED - 203)) | (1L << (REVOKE - 203)) | (1L << (GRANT - 203)) | (1L << (LOCK - 203)) | (1L << (UNLOCK - 203)) | (1L << (MSCK - 203)) | (1L << (REPAIR - 203)) | (1L << (RECOVER - 203)) | (1L << (EXPORT - 203)) | (1L << (IMPORT - 203)) | (1L << (LOAD - 203)) | (1L << (ROLE - 203)) | (1L << (ROLES - 203)) | (1L << (COMPACTIONS - 203)) | (1L << (PRINCIPALS - 203)) | (1L << (TRANSACTIONS - 203)) | (1L << (INDEX - 203)) | (1L << (INDEXES - 203)) | (1L << (LOCKS - 203)) | (1L << (OPTION - 203)) | (1L << (LOCAL - 203)) | (1L << (INPATH - 203)))) != 0)) ) {
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
		case 47:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 83:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 85:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 86:
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
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 6);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u011f\u0adf\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00ff\n\b\3\b\3\b\3\b\5\b\u0104\n\b\3\b\5\b\u0107\n\b\3\b"+
		"\3\b\3\b\5\b\u010c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u0119\n\b\3\b\3\b\5\b\u011d\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0124\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0132\n\b\f\b\16\b\u0135"+
		"\13\b\3\b\3\b\5\b\u0139\n\b\3\b\5\b\u013c\n\b\3\b\5\b\u013f\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0146\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\b\u0153\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u015c\n\b\f\b\16\b\u015f"+
		"\13\b\3\b\3\b\5\b\u0163\n\b\3\b\5\b\u0166\n\b\3\b\5\b\u0169\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0170\n\b\3\b\3\b\3\b\3\b\5\b\u0176\n\b\3\b\3\b\3\b"+
		"\3\b\5\b\u017c\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0184\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01a4\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01ac\n\b\3\b\3\b\5\b\u01b0\n\b\3\b\3\b\3\b\5\b\u01b5\n\b\3\b"+
		"\3\b\3\b\3\b\5\b\u01bb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01c3\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u01c9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u01d6\n\b\3\b\6\b\u01d9\n\b\r\b\16\b\u01da\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u01e4\n\b\3\b\6\b\u01e7\n\b\r\b\16\b\u01e8\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u01f9\n\b\3\b\3\b\3\b\7\b\u01fe"+
		"\n\b\f\b\16\b\u0201\13\b\3\b\5\b\u0204\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u020c\n\b\3\b\3\b\3\b\7\b\u0211\n\b\f\b\16\b\u0214\13\b\3\b\3\b\3\b\3"+
		"\b\5\b\u021a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0229\n\b\3\b\3\b\5\b\u022d\n\b\3\b\3\b\3\b\3\b\5\b\u0233\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u0239\n\b\3\b\5\b\u023c\n\b\3\b\5\b\u023f\n\b\3\b\3\b\3"+
		"\b\3\b\5\b\u0245\n\b\3\b\3\b\5\b\u0249\n\b\3\b\3\b\5\b\u024d\n\b\3\b\3"+
		"\b\3\b\5\b\u0252\n\b\3\b\3\b\5\b\u0256\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u025e\n\b\3\b\5\b\u0261\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u026a\n\b"+
		"\3\b\3\b\3\b\5\b\u026f\n\b\3\b\3\b\3\b\3\b\5\b\u0275\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u027c\n\b\3\b\5\b\u027f\n\b\3\b\3\b\3\b\3\b\5\b\u0285\n\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u028e\n\b\f\b\16\b\u0291\13\b\5\b\u0293"+
		"\n\b\3\b\3\b\5\b\u0297\n\b\3\b\3\b\3\b\5\b\u029c\n\b\3\b\3\b\3\b\5\b\u02a1"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u02a8\n\b\3\b\5\b\u02ab\n\b\3\b\5\b\u02ae"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u02b5\n\b\3\b\3\b\3\b\5\b\u02ba\n\b\3\b\3"+
		"\b\3\b\5\b\u02bf\n\b\3\b\5\b\u02c2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"\u02cb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02d3\n\b\3\b\3\b\3\b\3\b\5\b\u02d9"+
		"\n\b\3\b\3\b\5\b\u02dd\n\b\3\b\3\b\5\b\u02e1\n\b\3\b\3\b\5\b\u02e5\n\b"+
		"\5\b\u02e7\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u02f0\n\b\3\b\3\b\3\b\3"+
		"\b\5\b\u02f6\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0301\n\b\3\b"+
		"\3\b\5\b\u0305\n\b\3\b\5\b\u0308\n\b\3\b\3\b\5\b\u030c\n\b\3\b\5\b\u030f"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0317\n\b\f\b\16\b\u031a\13\b\5\b\u031c"+
		"\n\b\3\b\3\b\5\b\u0320\n\b\3\b\3\b\3\b\5\b\u0325\n\b\3\b\5\b\u0328\n\b"+
		"\3\b\3\b\3\b\3\b\5\b\u032e\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0336\n\b\3"+
		"\b\3\b\3\b\5\b\u033b\n\b\3\b\3\b\3\b\3\b\5\b\u0341\n\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0347\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0350\n\b\f\b\16\b\u0353"+
		"\13\b\3\b\3\b\3\b\7\b\u0358\n\b\f\b\16\b\u035b\13\b\3\b\3\b\7\b\u035f"+
		"\n\b\f\b\16\b\u0362\13\b\3\b\3\b\3\b\7\b\u0367\n\b\f\b\16\b\u036a\13\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0370\n\b\3\b\5\b\u0373\n\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u037d\n\b\3\b\3\b\3\b\3\b\5\b\u0383\n\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u038e\n\b\3\b\5\b\u0391\n\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0397\n\b\3\b\3\b\3\b\5\b\u039c\n\b\3\b\3\b\3\b\3\b\5\b\u03a2\n\b\3"+
		"\b\5\b\u03a5\n\b\3\b\3\b\3\b\3\b\5\b\u03ab\n\b\3\b\5\b\u03ae\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u03b4\n\b\3\b\3\b\3\b\5\b\u03b9\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u03c1\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03c9\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\b\u03d1\n\b\3\b\3\b\5\b\u03d5\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u03e1\n\b\3\b\3\b\3\b\5\b\u03e6\n\b\3\b\7\b\u03e9"+
		"\n\b\f\b\16\b\u03ec\13\b\3\b\7\b\u03ef\n\b\f\b\16\b\u03f2\13\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u03fe\n\b\3\b\5\b\u0401\n\b\3\b\3"+
		"\b\7\b\u0405\n\b\f\b\16\b\u0408\13\b\5\b\u040a\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u0413\n\n\f\n\16\n\u0416\13\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\5\f\u0422\n\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u042e\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0435\n\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0445\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u044d\n\20\3\20\3\20\5\20\u0451\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u0458\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u04cc\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u04d4\n\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u04dc\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u04e5\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u04ef\n\20\3\21\3\21"+
		"\5\21\u04f3\n\21\3\21\5\21\u04f6\n\21\3\21\3\21\3\21\3\21\5\21\u04fc\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0506\n\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0512\n\23\3\23\3\23\3\23"+
		"\5\23\u0517\n\23\3\24\3\24\3\24\3\25\5\25\u051d\n\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0529\n\26\5\26\u052b\n\26\3\26"+
		"\3\26\3\26\5\26\u0530\n\26\3\26\3\26\5\26\u0534\n\26\3\26\3\26\3\26\5"+
		"\26\u0539\n\26\3\26\3\26\3\26\5\26\u053e\n\26\3\26\5\26\u0541\n\26\3\26"+
		"\3\26\3\26\5\26\u0546\n\26\3\26\3\26\5\26\u054a\n\26\3\26\3\26\3\26\5"+
		"\26\u054f\n\26\5\26\u0551\n\26\3\27\3\27\3\27\3\27\7\27\u0557\n\27\f\27"+
		"\16\27\u055a\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0563\n\31"+
		"\f\31\16\31\u0566\13\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\5\33\u056f"+
		"\n\33\3\33\3\33\3\34\3\34\5\34\u0575\n\34\3\35\3\35\3\35\3\35\3\35\7\35"+
		"\u057c\n\35\f\35\16\35\u057f\13\35\3\35\3\35\3\36\3\36\3\36\5\36\u0586"+
		"\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u058d\n\37\3 \3 \3 \7 \u0592\n \f"+
		" \16 \u0595\13 \3!\3!\3!\3!\7!\u059b\n!\f!\16!\u059e\13!\3\"\3\"\5\"\u05a2"+
		"\n\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\7$\u05af\n$\f$\16$\u05b2\13"+
		"$\3$\3$\3%\3%\5%\u05b8\n%\3%\5%\u05bb\n%\3&\3&\3&\7&\u05c0\n&\f&\16&\u05c3"+
		"\13&\3&\5&\u05c6\n&\3\'\3\'\3\'\3\'\5\'\u05cc\n\'\3(\3(\3(\3(\7(\u05d2"+
		"\n(\f(\16(\u05d5\13(\3(\3(\3)\3)\3)\3)\7)\u05dd\n)\f)\16)\u05e0\13)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\5*\u05ea\n*\3+\3+\3+\3+\3+\5+\u05f1\n+\3,\3,\3"+
		",\3,\5,\u05f7\n,\3-\3-\3-\3.\5.\u05fd\n.\3.\3.\3.\3.\3.\6.\u0604\n.\r"+
		".\16.\u0605\5.\u0608\n.\3/\3/\3/\3/\3/\7/\u060f\n/\f/\16/\u0612\13/\5"+
		"/\u0614\n/\3/\3/\3/\3/\3/\7/\u061b\n/\f/\16/\u061e\13/\5/\u0620\n/\3/"+
		"\3/\3/\3/\3/\7/\u0627\n/\f/\16/\u062a\13/\5/\u062c\n/\3/\3/\3/\3/\3/\7"+
		"/\u0633\n/\f/\16/\u0636\13/\5/\u0638\n/\3/\5/\u063b\n/\3/\3/\3/\5/\u0640"+
		"\n/\5/\u0642\n/\3\60\5\60\u0645\n\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\5\61\u0651\n\61\3\61\3\61\3\61\3\61\3\61\5\61\u0658\n"+
		"\61\3\61\3\61\3\61\3\61\3\61\5\61\u065f\n\61\3\61\7\61\u0662\n\61\f\61"+
		"\16\61\u0665\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u066f"+
		"\n\62\3\63\3\63\5\63\u0673\n\63\3\63\3\63\5\63\u0677\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0683\n\64\3\64\5\64\u0686"+
		"\n\64\3\64\3\64\5\64\u068a\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0694\n\64\3\64\3\64\5\64\u0698\n\64\5\64\u069a\n\64\3\64\5\64\u069d"+
		"\n\64\3\64\3\64\5\64\u06a1\n\64\3\64\5\64\u06a4\n\64\3\64\3\64\5\64\u06a8"+
		"\n\64\3\64\3\64\7\64\u06ac\n\64\f\64\16\64\u06af\13\64\3\64\5\64\u06b2"+
		"\n\64\3\64\3\64\5\64\u06b6\n\64\3\64\3\64\3\64\5\64\u06bb\n\64\3\64\5"+
		"\64\u06be\n\64\5\64\u06c0\n\64\3\64\7\64\u06c3\n\64\f\64\16\64\u06c6\13"+
		"\64\3\64\3\64\5\64\u06ca\n\64\3\64\5\64\u06cd\n\64\3\64\3\64\5\64\u06d1"+
		"\n\64\3\64\5\64\u06d4\n\64\5\64\u06d6\n\64\3\65\3\65\3\65\5\65\u06db\n"+
		"\65\3\65\7\65\u06de\n\65\f\65\16\65\u06e1\13\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\7\66\u06eb\n\66\f\66\16\66\u06ee\13\66\3\66\3\66\5"+
		"\66\u06f2\n\66\3\67\3\67\3\67\3\67\7\67\u06f8\n\67\f\67\16\67\u06fb\13"+
		"\67\3\67\7\67\u06fe\n\67\f\67\16\67\u0701\13\67\3\67\5\67\u0704\n\67\3"+
		"8\38\38\38\38\78\u070b\n8\f8\168\u070e\138\38\38\38\38\38\38\38\38\38"+
		"\38\78\u071a\n8\f8\168\u071d\138\38\38\58\u0721\n8\38\38\38\38\38\38\3"+
		"8\38\78\u072b\n8\f8\168\u072e\138\38\38\58\u0732\n8\39\39\39\39\79\u0738"+
		"\n9\f9\169\u073b\139\59\u073d\n9\39\39\59\u0741\n9\3:\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\7:\u074d\n:\f:\16:\u0750\13:\3:\3:\3:\3;\3;\3;\3;\3;\7;\u075a"+
		"\n;\f;\16;\u075d\13;\3;\3;\5;\u0761\n;\3<\3<\5<\u0765\n<\3<\5<\u0768\n"+
		"<\3=\3=\3=\5=\u076d\n=\3=\3=\3=\3=\3=\7=\u0774\n=\f=\16=\u0777\13=\5="+
		"\u0779\n=\3=\3=\3=\5=\u077e\n=\3=\3=\3=\7=\u0783\n=\f=\16=\u0786\13=\5"+
		"=\u0788\n=\3>\3>\3?\3?\7?\u078e\n?\f?\16?\u0791\13?\3@\3@\3@\3@\5@\u0797"+
		"\n@\3@\3@\3@\3@\3@\5@\u079e\n@\3A\5A\u07a1\nA\3A\3A\3A\5A\u07a6\nA\3A"+
		"\3A\3A\3A\5A\u07ac\nA\3A\3A\5A\u07b0\nA\3A\5A\u07b3\nA\3A\5A\u07b6\nA"+
		"\3B\3B\3B\3B\3B\3B\3B\7B\u07bf\nB\fB\16B\u07c2\13B\3B\3B\5B\u07c6\nB\3"+
		"C\3C\3C\5C\u07cb\nC\3C\3C\3D\5D\u07d0\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\5D\u07e2\nD\5D\u07e4\nD\3D\5D\u07e7\nD\3E\3E\3E\3"+
		"E\3F\3F\3F\7F\u07f0\nF\fF\16F\u07f3\13F\3G\3G\3G\3G\7G\u07f9\nG\fG\16"+
		"G\u07fc\13G\3G\3G\3H\3H\5H\u0802\nH\3I\3I\3I\3I\7I\u0808\nI\fI\16I\u080b"+
		"\13I\3I\3I\3J\3J\3J\5J\u0812\nJ\3K\3K\5K\u0816\nK\3K\3K\3K\3K\3K\3K\5"+
		"K\u081e\nK\3K\3K\3K\3K\3K\3K\5K\u0826\nK\3K\3K\3K\3K\5K\u082c\nK\3L\3"+
		"L\3L\3L\7L\u0832\nL\fL\16L\u0835\13L\3L\3L\3M\3M\3M\3M\3M\7M\u083e\nM"+
		"\fM\16M\u0841\13M\5M\u0843\nM\3M\3M\3M\3N\5N\u0849\nN\3N\3N\5N\u084d\n"+
		"N\5N\u084f\nN\3O\3O\3O\3O\3O\3O\3O\5O\u0858\nO\3O\3O\3O\3O\3O\3O\3O\3"+
		"O\3O\3O\5O\u0864\nO\5O\u0866\nO\3O\3O\3O\3O\3O\5O\u086d\nO\3O\3O\3O\3"+
		"O\3O\5O\u0874\nO\3O\3O\3O\3O\5O\u087a\nO\3O\3O\3O\3O\5O\u0880\nO\5O\u0882"+
		"\nO\3P\3P\3P\5P\u0887\nP\3P\3P\3P\5P\u088c\nP\3P\5P\u088f\nP\3Q\3Q\3Q"+
		"\5Q\u0894\nQ\3Q\3Q\3R\3R\5R\u089a\nR\3R\3R\5R\u089e\nR\5R\u08a0\nR\3S"+
		"\3S\3S\7S\u08a5\nS\fS\16S\u08a8\13S\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3"+
		"U\5U\u08b6\nU\5U\u08b8\nU\3U\3U\3U\3U\3U\3U\7U\u08c0\nU\fU\16U\u08c3\13"+
		"U\3V\5V\u08c6\nV\3V\3V\3V\3V\3V\3V\5V\u08ce\nV\3V\3V\3V\3V\3V\7V\u08d5"+
		"\nV\fV\16V\u08d8\13V\3V\3V\3V\5V\u08dd\nV\3V\3V\3V\3V\3V\3V\5V\u08e5\n"+
		"V\3V\3V\3V\3V\5V\u08eb\nV\3V\3V\3V\5V\u08f0\nV\3V\3V\3V\5V\u08f5\nV\3"+
		"V\3V\3V\5V\u08fa\nV\3W\3W\3W\3W\5W\u0900\nW\3W\3W\3W\3W\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\7W\u0915\nW\fW\16W\u0918\13W\3X\3X\3X"+
		"\6X\u091d\nX\rX\16X\u091e\3X\3X\5X\u0923\nX\3X\3X\3X\3X\3X\6X\u092a\n"+
		"X\rX\16X\u092b\3X\3X\5X\u0930\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\7X\u0940\nX\fX\16X\u0943\13X\5X\u0945\nX\3X\3X\3X\3X\3X\3X\5X\u094d"+
		"\nX\3X\3X\3X\3X\3X\3X\3X\5X\u0956\nX\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\3X\3X\3X\6X\u096b\nX\rX\16X\u096c\3X\3X\3X\3X\3X\3X\3"+
		"X\3X\3X\5X\u0978\nX\3X\3X\3X\7X\u097d\nX\fX\16X\u0980\13X\5X\u0982\nX"+
		"\3X\3X\3X\5X\u0987\nX\3X\3X\3X\3X\3X\3X\3X\6X\u0990\nX\rX\16X\u0991\3"+
		"X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\5X\u09aa"+
		"\nX\3X\3X\3X\3X\3X\5X\u09b1\nX\3X\5X\u09b4\nX\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\3X\3X\3X\3X\3X\5X\u09c3\nX\3X\3X\5X\u09c7\nX\3X\3X\3X\3X\3X\3X\3X\3X"+
		"\7X\u09d1\nX\fX\16X\u09d4\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\6Y\u09de\nY\rY\16"+
		"Y\u09df\5Y\u09e2\nY\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\7^\u09ee\n^\f^\16"+
		"^\u09f1\13^\3_\3_\3_\3_\5_\u09f7\n_\3`\5`\u09fa\n`\3`\3`\5`\u09fe\n`\3"+
		"a\3a\3a\5a\u0a03\na\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\5b\u0a14"+
		"\nb\3b\3b\5b\u0a18\nb\3b\3b\3b\3b\3b\7b\u0a1f\nb\fb\16b\u0a22\13b\3b\5"+
		"b\u0a25\nb\5b\u0a27\nb\3c\3c\3c\7c\u0a2c\nc\fc\16c\u0a2f\13c\3d\3d\3d"+
		"\3d\5d\u0a35\nd\3e\3e\3e\7e\u0a3a\ne\fe\16e\u0a3d\13e\3f\3f\3f\3f\3f\5"+
		"f\u0a44\nf\3g\3g\3g\3g\3g\3h\3h\3h\3h\7h\u0a4f\nh\fh\16h\u0a52\13h\3i"+
		"\3i\3i\3i\3j\3j\3j\3j\3j\3j\3j\7j\u0a5f\nj\fj\16j\u0a62\13j\3j\3j\3j\3"+
		"j\3j\7j\u0a69\nj\fj\16j\u0a6c\13j\5j\u0a6e\nj\3j\3j\3j\3j\3j\7j\u0a75"+
		"\nj\fj\16j\u0a78\13j\5j\u0a7a\nj\5j\u0a7c\nj\3j\5j\u0a7f\nj\3j\5j\u0a82"+
		"\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\5k\u0a94\nk\3l\3l"+
		"\3l\3l\3l\3l\3l\5l\u0a9d\nl\3m\3m\3m\7m\u0aa2\nm\fm\16m\u0aa5\13m\3n\3"+
		"n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\3n\5n\u0ab6\nn\3o\3o\3o\5o\u0abb"+
		"\no\3p\3p\3q\5q\u0ac0\nq\3q\3q\5q\u0ac4\nq\3q\3q\5q\u0ac8\nq\3q\3q\5q"+
		"\u0acc\nq\3q\3q\5q\u0ad0\nq\3q\3q\5q\u0ad4\nq\3q\3q\5q\u0ad8\nq\3q\5q"+
		"\u0adb\nq\3r\3r\3r\b\u0318\u0351\u0359\u0360\u0368\u0406\6`\u00a8\u00ac"+
		"\u00aes\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\2#\3\2\u00e2\u00e3\4"+
		"\2RRTT\5\2\\^\u00c7\u00c7\u00ce\u00ce\4\2\16\16!!\4\2..YY\4\2\u00c7\u00c7"+
		"\u00ce\u00ce\4\2\17\17\u00ef\u00ef\3\2\u0086\u0087\3\2\u010f\u0110\3\2"+
		"il\3\2ik\3\2-.\4\2KKMM\4\2\21\21\23\23\3\2\u0115\u0116\3\2&\'\4\2*+\u00cc"+
		"\u00cc\4\2\u009f\u00a0\u00a5\u00a5\3\2\u00a1\u00a4\4\2\u009f\u00a0\u00a8"+
		"\u00a8\3\2uv\4\2\5\5\16\16\4\2\5\5//\3\2\u0082\u0084\3\2\u0097\u009e\3"+
		"\2\u009f\u00a9\3\2\37\"\3\2*+\3\2\u009f\u00a0\4\2DD\u00b1\u00b1\4\2\33"+
		"\33\u00af\u00af\3\2HI\f\2\r\6588@hmwy\u0092\u0094\u0096\u00a4\u00a4\u00aa"+
		"\u00b7\u00b9\u0106\u0108\u0109\2\u0cad\2\u00e4\3\2\2\2\4\u00e7\3\2\2\2"+
		"\6\u00ea\3\2\2\2\b\u00ed\3\2\2\2\n\u00f0\3\2\2\2\f\u00f3\3\2\2\2\16\u0409"+
		"\3\2\2\2\20\u040b\3\2\2\2\22\u040d\3\2\2\2\24\u0419\3\2\2\2\26\u041d\3"+
		"\2\2\2\30\u042d\3\2\2\2\32\u042f\3\2\2\2\34\u0444\3\2\2\2\36\u04ee\3\2"+
		"\2\2 \u04f0\3\2\2\2\"\u04ff\3\2\2\2$\u050b\3\2\2\2&\u0518\3\2\2\2(\u051c"+
		"\3\2\2\2*\u0550\3\2\2\2,\u0552\3\2\2\2.\u055b\3\2\2\2\60\u055f\3\2\2\2"+
		"\62\u0567\3\2\2\2\64\u056e\3\2\2\2\66\u0572\3\2\2\28\u0576\3\2\2\2:\u0582"+
		"\3\2\2\2<\u058c\3\2\2\2>\u058e\3\2\2\2@\u0596\3\2\2\2B\u059f\3\2\2\2D"+
		"\u05a7\3\2\2\2F\u05aa\3\2\2\2H\u05b5\3\2\2\2J\u05c5\3\2\2\2L\u05cb\3\2"+
		"\2\2N\u05cd\3\2\2\2P\u05d8\3\2\2\2R\u05e9\3\2\2\2T\u05f0\3\2\2\2V\u05f2"+
		"\3\2\2\2X\u05f8\3\2\2\2Z\u0607\3\2\2\2\\\u0613\3\2\2\2^\u0644\3\2\2\2"+
		"`\u0649\3\2\2\2b\u066e\3\2\2\2d\u0670\3\2\2\2f\u06d5\3\2\2\2h\u06d7\3"+
		"\2\2\2j\u06f1\3\2\2\2l\u06f3\3\2\2\2n\u0731\3\2\2\2p\u0740\3\2\2\2r\u0742"+
		"\3\2\2\2t\u0760\3\2\2\2v\u0762\3\2\2\2x\u0769\3\2\2\2z\u0789\3\2\2\2|"+
		"\u078b\3\2\2\2~\u079d\3\2\2\2\u0080\u07b5\3\2\2\2\u0082\u07c5\3\2\2\2"+
		"\u0084\u07c7\3\2\2\2\u0086\u07e6\3\2\2\2\u0088\u07e8\3\2\2\2\u008a\u07ec"+
		"\3\2\2\2\u008c\u07f4\3\2\2\2\u008e\u07ff\3\2\2\2\u0090\u0803\3\2\2\2\u0092"+
		"\u080e\3\2\2\2\u0094\u082b\3\2\2\2\u0096\u082d\3\2\2\2\u0098\u0838\3\2"+
		"\2\2\u009a\u084e\3\2\2\2\u009c\u0881\3\2\2\2\u009e\u088e\3\2\2\2\u00a0"+
		"\u0893\3\2\2\2\u00a2\u0897\3\2\2\2\u00a4\u08a1\3\2\2\2\u00a6\u08a9\3\2"+
		"\2\2\u00a8\u08b7\3\2\2\2\u00aa\u08f9\3\2\2\2\u00ac\u08ff\3\2\2\2\u00ae"+
		"\u09c6\3\2\2\2\u00b0\u09e1\3\2\2\2\u00b2\u09e3\3\2\2\2\u00b4\u09e5\3\2"+
		"\2\2\u00b6\u09e7\3\2\2\2\u00b8\u09e9\3\2\2\2\u00ba\u09eb\3\2\2\2\u00bc"+
		"\u09f2\3\2\2\2\u00be\u09fd\3\2\2\2\u00c0\u0a02\3\2\2\2\u00c2\u0a26\3\2"+
		"\2\2\u00c4\u0a28\3\2\2\2\u00c6\u0a30\3\2\2\2\u00c8\u0a36\3\2\2\2\u00ca"+
		"\u0a3e\3\2\2\2\u00cc\u0a45\3\2\2\2\u00ce\u0a4a\3\2\2\2\u00d0\u0a53\3\2"+
		"\2\2\u00d2\u0a81\3\2\2\2\u00d4\u0a93\3\2\2\2\u00d6\u0a9c\3\2\2\2\u00d8"+
		"\u0a9e\3\2\2\2\u00da\u0ab5\3\2\2\2\u00dc\u0aba\3\2\2\2\u00de\u0abc\3\2"+
		"\2\2\u00e0\u0ada\3\2\2\2\u00e2\u0adc\3\2\2\2\u00e4\u00e5\5\16\b\2\u00e5"+
		"\u00e6\7\2\2\3\u00e6\3\3\2\2\2\u00e7\u00e8\5\u00a2R\2\u00e8\u00e9\7\2"+
		"\2\3\u00e9\5\3\2\2\2\u00ea\u00eb\5\u009eP\2\u00eb\u00ec\7\2\2\3\u00ec"+
		"\7\3\2\2\2\u00ed\u00ee\5\u00a0Q\2\u00ee\u00ef\7\2\2\3\u00ef\t\3\2\2\2"+
		"\u00f0\u00f1\5\u00c2b\2\u00f1\u00f2\7\2\2\3\u00f2\13\3\2\2\2\u00f3\u00f4"+
		"\5\u00c4c\2\u00f4\u00f5\7\2\2\3\u00f5\r\3\2\2\2\u00f6\u040a\5(\25\2\u00f7"+
		"\u00f8\7e\2\2\u00f8\u040a\5\u00dan\2\u00f9\u00fa\7Q\2\2\u00fa\u00fe\7"+
		"\u00e9\2\2\u00fb\u00fc\7\u0094\2\2\u00fc\u00fd\7\"\2\2\u00fd\u00ff\7$"+
		"\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0103\5\u00dan\2\u0101\u0102\7w\2\2\u0102\u0104\7\u0111\2\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0107\5&\24\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010b\3\2\2\2\u0108\u0109\7O"+
		"\2\2\u0109\u010a\7\u00d4\2\2\u010a\u010c\5F$\2\u010b\u0108\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u040a\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f\7\u00e9"+
		"\2\2\u010f\u0110\5\u00dan\2\u0110\u0111\7y\2\2\u0111\u0112\7\u00d4\2\2"+
		"\u0112\u0113\5F$\2\u0113\u040a\3\2\2\2\u0114\u0115\7h\2\2\u0115\u0118"+
		"\7\u00e9\2\2\u0116\u0117\7\u0094\2\2\u0117\u0119\7$\2\2\u0118\u0116\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\5\u00dan\2"+
		"\u011b\u011d\t\2\2\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u040a"+
		"\3\2\2\2\u011e\u0123\5 \21\2\u011f\u0120\7\3\2\2\u0120\u0121\5\u00c4c"+
		"\2\u0121\u0122\7\4\2\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0133\5D#\2\u0126\u0127\7\u00d1\2\2"+
		"\u0127\u0132\5F$\2\u0128\u0129\7\u00f1\2\2\u0129\u012a\7\26\2\2\u012a"+
		"\u0132\5\u0088E\2\u012b\u0132\5\"\22\2\u012c\u0132\5&\24\2\u012d\u012e"+
		"\7w\2\2\u012e\u0132\7\u0111\2\2\u012f\u0130\7\u00d3\2\2\u0130\u0132\5"+
		"F$\2\u0131\u0126\3\2\2\2\u0131\u0128\3\2\2\2\u0131\u012b\3\2\2\2\u0131"+
		"\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0135\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0138\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0136\u0137\7x\2\2\u0137\u0139\7\u0115\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013e\3\2\2\2\u013a\u013c\7\20\2\2"+
		"\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f"+
		"\5(\25\2\u013e\u013b\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u040a\3\2\2\2\u0140"+
		"\u0145\5 \21\2\u0141\u0142\7\3\2\2\u0142\u0143\5\u00c4c\2\u0143\u0144"+
		"\7\4\2\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u015d\3\2\2\2\u0147\u0148\7w\2\2\u0148\u015c\7\u0111\2\2\u0149\u014a"+
		"\7\u00f1\2\2\u014a\u014b\7\26\2\2\u014b\u014c\7\3\2\2\u014c\u014d\5\u00c4"+
		"c\2\u014d\u014e\7\4\2\2\u014e\u0153\3\2\2\2\u014f\u0150\7\u00f1\2\2\u0150"+
		"\u0151\7\26\2\2\u0151\u0153\5\u0088E\2\u0152\u0149\3\2\2\2\u0152\u014f"+
		"\3\2\2\2\u0153\u015c\3\2\2\2\u0154\u015c\5\"\22\2\u0155\u015c\5$\23\2"+
		"\u0156\u015c\5\u009cO\2\u0157\u015c\5R*\2\u0158\u015c\5&\24\2\u0159\u015a"+
		"\7\u00d3\2\2\u015a\u015c\5F$\2\u015b\u0147\3\2\2\2\u015b\u0152\3\2\2\2"+
		"\u015b\u0154\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b\u0157"+
		"\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015f\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u015d\3\2"+
		"\2\2\u0160\u0161\7x\2\2\u0161\u0163\7\u0115\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0168\3\2\2\2\u0164\u0166\7\20\2\2\u0165\u0164\3"+
		"\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\5(\25\2\u0168"+
		"\u0165\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u040a\3\2\2\2\u016a\u016b\7Q"+
		"\2\2\u016b\u016f\7R\2\2\u016c\u016d\7\u0094\2\2\u016d\u016e\7\"\2\2\u016e"+
		"\u0170\7$\2\2\u016f\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\5\u009eP\2\u0172\u0173\7&\2\2\u0173\u0175\5\u009eP\2"+
		"\u0174\u0176\5&\24\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u040a"+
		"\3\2\2\2\u0177\u0178\7\u00ed\2\2\u0178\u0179\7R\2\2\u0179\u017b\5\u009e"+
		"P\2\u017a\u017c\58\35\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017e\7\u00ee\2\2\u017e\u0183\7\u00f0\2\2\u017f\u0184"+
		"\5\u00dan\2\u0180\u0181\7/\2\2\u0181\u0182\7b\2\2\u0182\u0184\5\u008a"+
		"F\2\u0183\u017f\3\2\2\2\u0183\u0180\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u040a\3\2\2\2\u0185\u0186\7p\2\2\u0186\u0187\7R\2\2\u0187\u0188\5\u009e"+
		"P\2\u0188\u0189\7\17\2\2\u0189\u018a\7b\2\2\u018a\u018b\7\3\2\2\u018b"+
		"\u018c\5\u00c4c\2\u018c\u018d\7\4\2\2\u018d\u040a\3\2\2\2\u018e\u018f"+
		"\7p\2\2\u018f\u0190\t\3\2\2\u0190\u0191\5\u009eP\2\u0191\u0192\7q\2\2"+
		"\u0192\u0193\7m\2\2\u0193\u0194\5\u009eP\2\u0194\u040a\3\2\2\2\u0195\u0196"+
		"\7p\2\2\u0196\u0197\t\3\2\2\u0197\u0198\5\u009eP\2\u0198\u0199\7y\2\2"+
		"\u0199\u019a\7\u00d3\2\2\u019a\u019b\5F$\2\u019b\u040a\3\2\2\2\u019c\u019d"+
		"\7p\2\2\u019d\u019e\t\3\2\2\u019e\u019f\5\u009eP\2\u019f\u01a0\7\u00d2"+
		"\2\2\u01a0\u01a3\7\u00d3\2\2\u01a1\u01a2\7\u0094\2\2\u01a2\u01a4\7$\2"+
		"\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6"+
		"\5F$\2\u01a6\u040a\3\2\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7R\2\2\u01a9"+
		"\u01ab\5\u009eP\2\u01aa\u01ac\58\35\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac"+
		"\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7\u00e1\2\2\u01ae\u01b0\7c\2"+
		"\2\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\5\u00dan\2\u01b2\u01b4\5\u00c6d\2\u01b3\u01b5\5\u00c0a\2\u01b4\u01b3"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u040a\3\2\2\2\u01b6\u01b7\7p\2\2\u01b7"+
		"\u01b8\7R\2\2\u01b8\u01ba\5\u009eP\2\u01b9\u01bb\58\35\2\u01ba\u01b9\3"+
		"\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\7y\2\2\u01bd"+
		"\u01be\7\u00b9\2\2\u01be\u01c2\7\u0111\2\2\u01bf\u01c0\7O\2\2\u01c0\u01c1"+
		"\7\u00ba\2\2\u01c1\u01c3\5F$\2\u01c2\u01bf\3\2\2\2\u01c2\u01c3\3\2\2\2"+
		"\u01c3\u040a\3\2\2\2\u01c4\u01c5\7p\2\2\u01c5\u01c6\7R\2\2\u01c6\u01c8"+
		"\5\u009eP\2\u01c7\u01c9\58\35\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2"+
		"\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\7y\2\2\u01cb\u01cc\7\u00ba\2\2\u01cc"+
		"\u01cd\5F$\2\u01cd\u040a\3\2\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7R\2\2"+
		"\u01d0\u01d1\5\u009eP\2\u01d1\u01d5\7\17\2\2\u01d2\u01d3\7\u0094\2\2\u01d3"+
		"\u01d4\7\"\2\2\u01d4\u01d6\7$\2\2\u01d5\u01d2\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d9\5\66\34\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u040a\3\2"+
		"\2\2\u01dc\u01dd\7p\2\2\u01dd\u01de\7T\2\2\u01de\u01df\5\u009eP\2\u01df"+
		"\u01e3\7\17\2\2\u01e0\u01e1\7\u0094\2\2\u01e1\u01e2\7\"\2\2\u01e2\u01e4"+
		"\7$\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e7\58\35\2\u01e6\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9\u040a\3\2\2\2\u01ea\u01eb\7p\2\2\u01eb"+
		"\u01ec\7R\2\2\u01ec\u01ed\5\u009eP\2\u01ed\u01ee\58\35\2\u01ee\u01ef\7"+
		"q\2\2\u01ef\u01f0\7m\2\2\u01f0\u01f1\58\35\2\u01f1\u040a\3\2\2\2\u01f2"+
		"\u01f3\7p\2\2\u01f3\u01f4\7R\2\2\u01f4\u01f5\5\u009eP\2\u01f5\u01f8\7"+
		"h\2\2\u01f6\u01f7\7\u0094\2\2\u01f7\u01f9\7$\2\2\u01f8\u01f6\3\2\2\2\u01f8"+
		"\u01f9\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01ff\58\35\2\u01fb\u01fc\7\5"+
		"\2\2\u01fc\u01fe\58\35\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2"+
		"\2\2\u0202\u0204\7\u00e6\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u040a\3\2\2\2\u0205\u0206\7p\2\2\u0206\u0207\7T\2\2\u0207\u0208\5\u009e"+
		"P\2\u0208\u020b\7h\2\2\u0209\u020a\7\u0094\2\2\u020a\u020c\7$\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0212\58"+
		"\35\2\u020e\u020f\7\5\2\2\u020f\u0211\58\35\2\u0210\u020e\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u040a\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7p\2\2\u0216\u0217\7R\2\2\u0217\u0219"+
		"\5\u009eP\2\u0218\u021a\58\35\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2"+
		"\2\u021a\u021b\3\2\2\2\u021b\u021c\7y\2\2\u021c\u021d\5&\24\2\u021d\u040a"+
		"\3\2\2\2\u021e\u021f\7p\2\2\u021f\u0220\7R\2\2\u0220\u0221\5\u009eP\2"+
		"\u0221\u0222\7\u00fa\2\2\u0222\u0223\7f\2\2\u0223\u040a\3\2\2\2\u0224"+
		"\u0225\7h\2\2\u0225\u0228\7R\2\2\u0226\u0227\7\u0094\2\2\u0227\u0229\7"+
		"$\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022c\5\u009eP\2\u022b\u022d\7\u00e6\2\2\u022c\u022b\3\2\2\2\u022c\u022d"+
		"\3\2\2\2\u022d\u040a\3\2\2\2\u022e\u022f\7h\2\2\u022f\u0232\7T\2\2\u0230"+
		"\u0231\7\u0094\2\2\u0231\u0233\7$\2\2\u0232\u0230\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u040a\5\u009eP\2\u0235\u0238\7Q\2\2"+
		"\u0236\u0237\7\37\2\2\u0237\u0239\7U\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023e\3\2\2\2\u023a\u023c\7\u00cf\2\2\u023b\u023a\3\2\2"+
		"\2\u023b\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\7\u00d0\2\2\u023e"+
		"\u023b\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0244\7T"+
		"\2\2\u0241\u0242\7\u0094\2\2\u0242\u0243\7\"\2\2\u0243\u0245\7$\2\2\u0244"+
		"\u0241\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\5\u009e"+
		"P\2\u0247\u0249\5\u0090I\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249"+
		"\u024c\3\2\2\2\u024a\u024b\7w\2\2\u024b\u024d\7\u0111\2\2\u024c\u024a"+
		"\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0251\3\2\2\2\u024e\u024f\7\u00f1\2"+
		"\2\u024f\u0250\7?\2\2\u0250\u0252\5\u0088E\2\u0251\u024e\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0254\7\u00d3\2\2\u0254\u0256"+
		"\5F$\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257"+
		"\u0258\7\20\2\2\u0258\u0259\5(\25\2\u0259\u040a\3\2\2\2\u025a\u025d\7"+
		"Q\2\2\u025b\u025c\7\37\2\2\u025c\u025e\7U\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\7\u00cf\2\2\u0260\u025f"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263\7\u00d0\2"+
		"\2\u0263\u0264\7T\2\2\u0264\u0269\5\u009eP\2\u0265\u0266\7\3\2\2\u0266"+
		"\u0267\5\u00c4c\2\u0267\u0268\7\4\2\2\u0268\u026a\3\2\2\2\u0269\u0265"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026e\5D#\2\u026c"+
		"\u026d\7\u00d1\2\2\u026d\u026f\5F$\2\u026e\u026c\3\2\2\2\u026e\u026f\3"+
		"\2\2\2\u026f\u040a\3\2\2\2\u0270\u0271\7p\2\2\u0271\u0272\7T\2\2\u0272"+
		"\u0274\5\u009eP\2\u0273\u0275\7\20\2\2\u0274\u0273\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\5(\25\2\u0277\u040a\3\2\2\2\u0278"+
		"\u027b\7Q\2\2\u0279\u027a\7\37\2\2\u027a\u027c\7U\2\2\u027b\u0279\3\2"+
		"\2\2\u027b\u027c\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027f\7\u00d0\2\2\u027e"+
		"\u027d\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0284\7\u00c6"+
		"\2\2\u0281\u0282\7\u0094\2\2\u0282\u0283\7\"\2\2\u0283\u0285\7$\2\2\u0284"+
		"\u0281\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\5\u00d8"+
		"m\2\u0287\u0288\7\20\2\2\u0288\u0292\7\u0111\2\2\u0289\u028a\7\u00b8\2"+
		"\2\u028a\u028f\5X-\2\u028b\u028c\7\5\2\2\u028c\u028e\5X-\2\u028d\u028b"+
		"\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0289\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u040a\3\2\2\2\u0294\u0296\7h\2\2\u0295\u0297\7\u00d0\2\2\u0296"+
		"\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029b\7\u00c6"+
		"\2\2\u0299\u029a\7\u0094\2\2\u029a\u029c\7$\2\2\u029b\u0299\3\2\2\2\u029b"+
		"\u029c\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u040a\5\u00d8m\2\u029e\u02a0"+
		"\7Z\2\2\u029f\u02a1\t\4\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u040a\5\16\b\2\u02a3\u02a4\7`\2\2\u02a4\u02a7\7a"+
		"\2\2\u02a5\u02a6\t\5\2\2\u02a6\u02a8\5\u00dan\2\u02a7\u02a5\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u02ad\3\2\2\2\u02a9\u02ab\7&\2\2\u02aa\u02a9\3\2"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\7\u0111\2\2\u02ad"+
		"\u02aa\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u040a\3\2\2\2\u02af\u02b0\7`"+
		"\2\2\u02b0\u02b1\7R\2\2\u02b1\u02b4\7\u00c7\2\2\u02b2\u02b3\t\5\2\2\u02b3"+
		"\u02b5\5\u00dan\2\u02b4\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6"+
		"\3\2\2\2\u02b6\u02b7\7&\2\2\u02b7\u02b9\7\u0111\2\2\u02b8\u02ba\58\35"+
		"\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u040a\3\2\2\2\u02bb\u02bc"+
		"\7`\2\2\u02bc\u02c1\7\u00ea\2\2\u02bd\u02bf\7&\2\2\u02be\u02bd\3\2\2\2"+
		"\u02be\u02bf\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\7\u0111\2\2\u02c1"+
		"\u02be\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u040a\3\2\2\2\u02c3\u02c4\7`"+
		"\2\2\u02c4\u02c5\7\u00d3\2\2\u02c5\u02ca\5\u009eP\2\u02c6\u02c7\7\3\2"+
		"\2\u02c7\u02c8\5J&\2\u02c8\u02c9\7\4\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02c6"+
		"\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u040a\3\2\2\2\u02cc\u02cd\7`\2\2\u02cd"+
		"\u02ce\7b\2\2\u02ce\u02cf\t\5\2\2\u02cf\u02d2\5\u009eP\2\u02d0\u02d1\t"+
		"\5\2\2\u02d1\u02d3\5\u00dan\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2"+
		"\u02d3\u040a\3\2\2\2\u02d4\u02d5\7`\2\2\u02d5\u02d6\7f\2\2\u02d6\u02d8"+
		"\5\u009eP\2\u02d7\u02d9\58\35\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2"+
		"\2\u02d9\u040a\3\2\2\2\u02da\u02dc\7`\2\2\u02db\u02dd\5\u00dan\2\u02dc"+
		"\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e6\7g"+
		"\2\2\u02df\u02e1\7&\2\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1"+
		"\u02e4\3\2\2\2\u02e2\u02e5\5\u00d8m\2\u02e3\u02e5\7\u0111\2\2\u02e4\u02e2"+
		"\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02e0\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u040a\3\2\2\2\u02e8\u02e9\7`\2\2\u02e9\u02ea\7Q\2"+
		"\2\u02ea\u02eb\7R\2\2\u02eb\u040a\5\u009eP\2\u02ec\u02ed\t\6\2\2\u02ed"+
		"\u02ef\7\u00c6\2\2\u02ee\u02f0\7\u00c7\2\2\u02ef\u02ee\3\2\2\2\u02ef\u02f0"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u040a\5<\37\2\u02f2\u02f3\t\6\2\2\u02f3"+
		"\u02f5\7\u00e9\2\2\u02f4\u02f6\7\u00c7\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6"+
		"\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u040a\5\u00dan\2\u02f8\u02f9\t\6\2"+
		"\2\u02f9\u02fa\7\u008d\2\2\u02fa\u040a\5\u009eP\2\u02fb\u02fc\t\6\2\2"+
		"\u02fc\u02fd\7\u008b\2\2\u02fd\u0300\5\u009eP\2\u02fe\u02ff\7\35\2\2\u02ff"+
		"\u0301\7\u0115\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u040a"+
		"\3\2\2\2\u0302\u0304\t\6\2\2\u0303\u0305\7R\2\2\u0304\u0303\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0307\3\2\2\2\u0306\u0308\t\7\2\2\u0307\u0306\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030b\5\u009eP\2\u030a"+
		"\u030c\58\35\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2"+
		"\2\2\u030d\u030f\5> \2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u040a"+
		"\3\2\2\2\u0310\u0311\7\u00c8\2\2\u0311\u0312\7R\2\2\u0312\u040a\5\u009e"+
		"P\2\u0313\u031b\7\u00c8\2\2\u0314\u031c\7\u0111\2\2\u0315\u0317\13\2\2"+
		"\2\u0316\u0315\3\2\2\2\u0317\u031a\3\2\2\2\u0318\u0319\3\2\2\2\u0318\u0316"+
		"\3\2\2\2\u0319\u031c\3\2\2\2\u031a\u0318\3\2\2\2\u031b\u0314\3\2\2\2\u031b"+
		"\u0318\3\2\2\2\u031c\u040a\3\2\2\2\u031d\u031f\7\u00ca\2\2\u031e\u0320"+
		"\7\u00cd\2\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2"+
		"\2\u0321\u0322\7R\2\2\u0322\u0327\5\u009eP\2\u0323\u0325\7\20\2\2\u0324"+
		"\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\5("+
		"\25\2\u0327\u0324\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u040a\3\2\2\2\u0329"+
		"\u032a\7\u00cb\2\2\u032a\u032d\7R\2\2\u032b\u032c\7\u0094\2\2\u032c\u032e"+
		"\7$\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f"+
		"\u040a\5\u009eP\2\u0330\u0331\7\u00c9\2\2\u0331\u040a\7\u00ca\2\2\u0332"+
		"\u0333\7\u00fd\2\2\u0333\u0335\7{\2\2\u0334\u0336\7\u0108\2\2\u0335\u0334"+
		"\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\7\u0109\2"+
		"\2\u0338\u033a\7\u0111\2\2\u0339\u033b\7\u00b5\2\2\u033a\u0339\3\2\2\2"+
		"\u033a\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7X\2\2\u033d\u033e"+
		"\7R\2\2\u033e\u0340\5\u009eP\2\u033f\u0341\58\35\2\u0340\u033f\3\2\2\2"+
		"\u0340\u0341\3\2\2\2\u0341\u040a\3\2\2\2\u0342\u0343\7\u00ec\2\2\u0343"+
		"\u0344\7R\2\2\u0344\u0346\5\u009eP\2\u0345\u0347\58\35\2\u0346\u0345\3"+
		"\2\2\2\u0346\u0347\3\2\2\2\u0347\u040a\3\2\2\2\u0348\u0349\7\u00f8\2\2"+
		"\u0349\u034a\7\u00f9\2\2\u034a\u034b\7R\2\2\u034b\u040a\5\u009eP\2\u034c"+
		"\u034d\t\b\2\2\u034d\u0351\5\u00dan\2\u034e\u0350\13\2\2\2\u034f\u034e"+
		"\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u0352\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"\u040a\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355\7y\2\2\u0355\u0359\7\u00fe"+
		"\2\2\u0356\u0358\13\2\2\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u040a\3\2\2\2\u035b\u0359\3\2"+
		"\2\2\u035c\u0360\7y\2\2\u035d\u035f\13\2\2\2\u035e\u035d\3\2\2\2\u035f"+
		"\u0362\3\2\2\2\u0360\u0361\3\2\2\2\u0360\u035e\3\2\2\2\u0361\u040a\3\2"+
		"\2\2\u0362\u0360\3\2\2\2\u0363\u040a\7z\2\2\u0364\u0368\7\u00ae\2\2\u0365"+
		"\u0367\13\2\2\2\u0366\u0365\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0369\3"+
		"\2\2\2\u0368\u0366\3\2\2\2\u0369\u040a\3\2\2\2\u036a\u0368\3\2\2\2\u036b"+
		"\u036c\7\u0090\2\2\u036c\u036d\7R\2\2\u036d\u036f\5\u009eP\2\u036e\u0370"+
		"\58\35\2\u036f\u036e\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0372\3\2\2\2\u0371"+
		"\u0373\5\22\n\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u040a\3"+
		"\2\2\2\u0374\u0375\7\u0091\2\2\u0375\u0376\7\u0093\2\2\u0376\u040a\5\u00da"+
		"n\2\u0377\u0378\7\u010b\2\2\u0378\u040a\5\u00dan\2\u0379\u037a\7\u010a"+
		"\2\2\u037a\u037c\5\u00dan\2\u037b\u037d\5F$\2\u037c\u037b\3\2\2\2\u037c"+
		"\u037d\3\2\2\2\u037d\u040a\3\2\2\2\u037e\u037f\7\u0092\2\2\u037f\u0380"+
		"\7R\2\2\u0380\u0382\5\u009eP\2\u0381\u0383\58\35\2\u0382\u0381\3\2\2\2"+
		"\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\7\35\2\2\u0385\u0386"+
		"\5\u00e0q\2\u0386\u040a\3\2\2\2\u0387\u0388\7\u00fd\2\2\u0388\u0389\7"+
		"{\2\2\u0389\u038a\5\u00b0Y\2\u038a\u038b\7R\2\2\u038b\u038d\5\u009eP\2"+
		"\u038c\u038e\5\22\n\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u040a"+
		"\3\2\2\2\u038f\u0391\5@!\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0392\3\2\2\2\u0392\u0393\7\u00fb\2\2\u0393\u0394\7R\2\2\u0394\u0396"+
		"\5\u009eP\2\u0395\u0397\58\35\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2"+
		"\2\u0397\u0398\3\2\2\2\u0398\u0399\7m\2\2\u0399\u039b\5\u00b0Y\2\u039a"+
		"\u039c\5\22\n\2\u039b\u039a\3\2\2\2\u039b\u039c\3\2\2\2\u039c\u040a\3"+
		"\2\2\2\u039d\u039e\7\u010c\2\2\u039e\u039f\7R\2\2\u039f\u03a1\5\u009e"+
		"P\2\u03a0\u03a2\58\35\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a4\3\2\2\2\u03a3\u03a5\5\22\n\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5\3"+
		"\2\2\2\u03a5\u040a\3\2\2\2\u03a6\u03a7\7\u010c\2\2\u03a7\u03a8\7\u010d"+
		"\2\2\u03a8\u03aa\5\u00b0Y\2\u03a9\u03ab\5\22\n\2\u03aa\u03a9\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u040a\3\2\2\2\u03ac\u03ae\5@!\2\u03ad\u03ac\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\7\u010e\2\2\u03b0"+
		"\u03b1\5\20\t\2\u03b1\u03b3\5\u009eP\2\u03b2\u03b4\58\35\2\u03b3\u03b2"+
		"\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b6\7m\2\2\u03b6"+
		"\u03b8\5\u009eP\2\u03b7\u03b9\5\22\n\2\u03b8\u03b7\3\2\2\2\u03b8\u03b9"+
		"\3\2\2\2\u03b9\u040a\3\2\2\2\u03ba\u03bb\7W\2\2\u03bb\u03bc\7\16\2\2\u03bc"+
		"\u03bd\5\u009eP\2\u03bd\u03c0\5\u009aN\2\u03be\u03bf\7\24\2\2\u03bf\u03c1"+
		"\5\u00a8U\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u040a\3\2\2"+
		"\2\u03c2\u03c3\7d\2\2\u03c3\u03c4\5\u009eP\2\u03c4\u03c5\5\u009aN\2\u03c5"+
		"\u03c8\5,\27\2\u03c6\u03c7\7\24\2\2\u03c7\u03c9\5\u00a8U\2\u03c8\u03c6"+
		"\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u040a\3\2\2\2\u03ca\u03cb\7\u0088\2"+
		"\2\u03cb\u03d0\5\u009eP\2\u03cc\u03cd\7\u0089\2\2\u03cd\u03ce\5\u00e0"+
		"q\2\u03ce\u03cf\7\u008c\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03cc\3\2\2\2\u03d0"+
		"\u03d1\3\2\2\2\u03d1\u03d4\3\2\2\2\u03d2\u03d3\7\u008e\2\2\u03d3\u03d5"+
		"\7\u008a\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u040a\3\2\2"+
		"\2\u03d6\u03d7\7\u0090\2\2\u03d7\u03d8\7X\2\2\u03d8\u03d9\5\u009eP\2\u03d9"+
		"\u03da\5\u009aN\2\u03da\u03e0\7\u00b8\2\2\u03db\u03e1\5\u009eP\2\u03dc"+
		"\u03dd\7\3\2\2\u03dd\u03de\5(\25\2\u03de\u03df\7\4\2\2\u03df\u03e1\3\2"+
		"\2\2\u03e0\u03db\3\2\2\2\u03e0\u03dc\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\5\u009aN\2\u03e3\u03e5\7?\2\2\u03e4\u03e6\5\u00a8U\2\u03e5\u03e4"+
		"\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ea\3\2\2\2\u03e7\u03e9\5\26\f\2"+
		"\u03e8\u03e7\3\2\2\2\u03e9\u03ec\3\2\2\2\u03ea\u03e8\3\2\2\2\u03ea\u03eb"+
		"\3\2\2\2\u03eb\u03f0\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ed\u03ef\5\32\16\2"+
		"\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03f1"+
		"\3\2\2\2\u03f1\u040a\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\7\u0085\2"+
		"\2\u03f4\u03f5\7m\2\2\u03f5\u03f6\t\t\2\2\u03f6\u03fd\5\u009eP\2\u03f7"+
		"\u03f8\7\u00f1\2\2\u03f8\u03f9\7\26\2\2\u03f9\u03fa\7\3\2\2\u03fa\u03fb"+
		"\5\u00c4c\2\u03fb\u03fc\7\4\2\2\u03fc\u03fe\3\2\2\2\u03fd\u03f7\3\2\2"+
		"\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u0401\5\22\n\2\u0400"+
		"\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u040a\3\2\2\2\u0402\u0406\5\36"+
		"\20\2\u0403\u0405\13\2\2\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406"+
		"\u0407\3\2\2\2\u0406\u0404\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2"+
		"\2\2\u0409\u00f6\3\2\2\2\u0409\u00f7\3\2\2\2\u0409\u00f9\3\2\2\2\u0409"+
		"\u010d\3\2\2\2\u0409\u0114\3\2\2\2\u0409\u011e\3\2\2\2\u0409\u0140\3\2"+
		"\2\2\u0409\u016a\3\2\2\2\u0409\u0177\3\2\2\2\u0409\u0185\3\2\2\2\u0409"+
		"\u018e\3\2\2\2\u0409\u0195\3\2\2\2\u0409\u019c\3\2\2\2\u0409\u01a7\3\2"+
		"\2\2\u0409\u01b6\3\2\2\2\u0409\u01c4\3\2\2\2\u0409\u01ce\3\2\2\2\u0409"+
		"\u01dc\3\2\2\2\u0409\u01ea\3\2\2\2\u0409\u01f2\3\2\2\2\u0409\u0205\3\2"+
		"\2\2\u0409\u0215\3\2\2\2\u0409\u021e\3\2\2\2\u0409\u0224\3\2\2\2\u0409"+
		"\u022e\3\2\2\2\u0409\u0235\3\2\2\2\u0409\u025a\3\2\2\2\u0409\u0270\3\2"+
		"\2\2\u0409\u0278\3\2\2\2\u0409\u0294\3\2\2\2\u0409\u029e\3\2\2\2\u0409"+
		"\u02a3\3\2\2\2\u0409\u02af\3\2\2\2\u0409\u02bb\3\2\2\2\u0409\u02c3\3\2"+
		"\2\2\u0409\u02cc\3\2\2\2\u0409\u02d4\3\2\2\2\u0409\u02da\3\2\2\2\u0409"+
		"\u02e8\3\2\2\2\u0409\u02ec\3\2\2\2\u0409\u02f2\3\2\2\2\u0409\u02f8\3\2"+
		"\2\2\u0409\u02fb\3\2\2\2\u0409\u0302\3\2\2\2\u0409\u0310\3\2\2\2\u0409"+
		"\u0313\3\2\2\2\u0409\u031d\3\2\2\2\u0409\u0329\3\2\2\2\u0409\u0330\3\2"+
		"\2\2\u0409\u0332\3\2\2\2\u0409\u0342\3\2\2\2\u0409\u0348\3\2\2\2\u0409"+
		"\u034c\3\2\2\2\u0409\u0354\3\2\2\2\u0409\u035c\3\2\2\2\u0409\u0363\3\2"+
		"\2\2\u0409\u0364\3\2\2\2\u0409\u036b\3\2\2\2\u0409\u0374\3\2\2\2\u0409"+
		"\u0377\3\2\2\2\u0409\u0379\3\2\2\2\u0409\u037e\3\2\2\2\u0409\u0387\3\2"+
		"\2\2\u0409\u0390\3\2\2\2\u0409\u039d\3\2\2\2\u0409\u03a6\3\2\2\2\u0409"+
		"\u03ad\3\2\2\2\u0409\u03ba\3\2\2\2\u0409\u03c2\3\2\2\2\u0409\u03ca\3\2"+
		"\2\2\u0409\u03d6\3\2\2\2\u0409\u03f3\3\2\2\2\u0409\u0402\3\2\2\2\u040a"+
		"\17\3\2\2\2\u040b\u040c\t\n\2\2\u040c\21\3\2\2\2\u040d\u040e\7\u00d1\2"+
		"\2\u040e\u040f\7\3\2\2\u040f\u0414\5\24\13\2\u0410\u0411\7\5\2\2\u0411"+
		"\u0413\5\24\13\2\u0412\u0410\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3"+
		"\2\2\2\u0414\u0415\3\2\2\2\u0415\u0417\3\2\2\2\u0416\u0414\3\2\2\2\u0417"+
		"\u0418\7\4\2\2\u0418\23\3\2\2\2\u0419\u041a\5\u00dan\2\u041a\u041b\7\u0097"+
		"\2\2\u041b\u041c\5\u00b0Y\2\u041c\25\3\2\2\2\u041d\u041e\7\62\2\2\u041e"+
		"\u0421\7\u008f\2\2\u041f\u0420\7 \2\2\u0420\u0422\5\u00a8U\2\u0421\u041f"+
		"\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\7\63\2\2"+
		"\u0424\u0425\5\30\r\2\u0425\27\3\2\2\2\u0426\u042e\7W\2\2\u0427\u0428"+
		"\7d\2\2\u0428\u0429\7y\2\2\u0429\u042e\7\u00a1\2\2\u042a\u042b\7d\2\2"+
		"\u042b\u042c\7y\2\2\u042c\u042e\5\60\31\2\u042d\u0426\3\2\2\2\u042d\u0427"+
		"\3\2\2\2\u042d\u042a\3\2\2\2\u042e\31\3\2\2\2\u042f\u0430\7\62\2\2\u0430"+
		"\u0431\7\"\2\2\u0431\u0434\7\u008f\2\2\u0432\u0433\7 \2\2\u0433\u0435"+
		"\5\u00a8U\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2"+
		"\2\u0436\u0437\7\63\2\2\u0437\u0438\5\34\17\2\u0438\33\3\2\2\2\u0439\u043a"+
		"\7V\2\2\u043a\u0445\7\u00a1\2\2\u043b\u043c\7V\2\2\u043c\u043d\7\3\2\2"+
		"\u043d\u043e\5\u00a4S\2\u043e\u043f\7\4\2\2\u043f\u0440\7P\2\2\u0440\u0441"+
		"\7\3\2\2\u0441\u0442\5\u00a4S\2\u0442\u0443\7\4\2\2\u0443\u0445\3\2\2"+
		"\2\u0444\u0439\3\2\2\2\u0444\u043b\3\2\2\2\u0445\35\3\2\2\2\u0446\u0447"+
		"\7Q\2\2\u0447\u04ef\7\u00fe\2\2\u0448\u0449\7h\2\2\u0449\u04ef\7\u00fe"+
		"\2\2\u044a\u044c\7\u00f5\2\2\u044b\u044d\7\u00fe\2\2\u044c\u044b\3\2\2"+
		"\2\u044c\u044d\3\2\2\2\u044d\u04ef\3\2\2\2\u044e\u0450\7\u00f4\2\2\u044f"+
		"\u0451\7\u00fe\2\2\u0450\u044f\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u04ef"+
		"\3\2\2\2\u0452\u0453\7`\2\2\u0453\u04ef\7\u00f5\2\2\u0454\u0455\7`\2\2"+
		"\u0455\u0457\7\u00fe\2\2\u0456\u0458\7\u00f5\2\2\u0457\u0456\3\2\2\2\u0457"+
		"\u0458\3\2\2\2\u0458\u04ef\3\2\2\2\u0459\u045a\7`\2\2\u045a\u04ef\7\u0101"+
		"\2\2\u045b\u045c\7`\2\2\u045c\u04ef\7\u00ff\2\2\u045d\u045e\7`\2\2\u045e"+
		"\u045f\7J\2\2\u045f\u04ef\7\u00ff\2\2\u0460\u0461\7\u00fb\2\2\u0461\u04ef"+
		"\7R\2\2\u0462\u0463\7\u00fc\2\2\u0463\u04ef\7R\2\2\u0464\u0465\7`\2\2"+
		"\u0465\u04ef\7\u0100\2\2\u0466\u0467\7`\2\2\u0467\u0468\7Q\2\2\u0468\u04ef"+
		"\7R\2\2\u0469\u046a\7`\2\2\u046a\u04ef\7\u0102\2\2\u046b\u046c\7`\2\2"+
		"\u046c\u04ef\7\u0104\2\2\u046d\u046e\7`\2\2\u046e\u04ef\7\u0105\2\2\u046f"+
		"\u0470\7Q\2\2\u0470\u04ef\7\u0103\2\2\u0471\u0472\7h\2\2\u0472\u04ef\7"+
		"\u0103\2\2\u0473\u0474\7p\2\2\u0474\u04ef\7\u0103\2\2\u0475\u0476\7\u00f6"+
		"\2\2\u0476\u04ef\7R\2\2\u0477\u0478\7\u00f6\2\2\u0478\u04ef\7\u00e9\2"+
		"\2\u0479\u047a\7\u00f7\2\2\u047a\u04ef\7R\2\2\u047b\u047c\7\u00f7\2\2"+
		"\u047c\u04ef\7\u00e9\2\2\u047d\u047e\7Q\2\2\u047e\u047f\7\u00d0\2\2\u047f"+
		"\u04ef\7\u0080\2\2\u0480\u0481\7h\2\2\u0481\u0482\7\u00d0\2\2\u0482\u04ef"+
		"\7\u0080\2\2\u0483\u0484\7p\2\2\u0484\u0485\7R\2\2\u0485\u0486\5\u009e"+
		"P\2\u0486\u0487\7\"\2\2\u0487\u0488\7\u00e4\2\2\u0488\u04ef\3\2\2\2\u0489"+
		"\u048a\7p\2\2\u048a\u048b\7R\2\2\u048b\u048c\5\u009eP\2\u048c\u048d\7"+
		"\u00e4\2\2\u048d\u048e\7\26\2\2\u048e\u04ef\3\2\2\2\u048f\u0490\7p\2\2"+
		"\u0490\u0491\7R\2\2\u0491\u0492\5\u009eP\2\u0492\u0493\7\"\2\2\u0493\u0494"+
		"\7\u00e5\2\2\u0494\u04ef\3\2\2\2\u0495\u0496\7p\2\2\u0496\u0497\7R\2\2"+
		"\u0497\u0498\5\u009eP\2\u0498\u0499\7\u00d6\2\2\u0499\u049a\7\26\2\2\u049a"+
		"\u04ef\3\2\2\2\u049b\u049c\7p\2\2\u049c\u049d\7R\2\2\u049d\u049e\5\u009e"+
		"P\2\u049e\u049f\7\"\2\2\u049f\u04a0\7\u00d6\2\2\u04a0\u04ef\3\2\2\2\u04a1"+
		"\u04a2\7p\2\2\u04a2\u04a3\7R\2\2\u04a3\u04a4\5\u009eP\2\u04a4\u04a5\7"+
		"\"\2\2\u04a5\u04a6\7\u00d7\2\2\u04a6\u04a7\7\20\2\2\u04a7\u04a8\7\u00d8"+
		"\2\2\u04a8\u04ef\3\2\2\2\u04a9\u04aa\7p\2\2\u04aa\u04ab\7R\2\2\u04ab\u04ac"+
		"\5\u009eP\2\u04ac\u04ad\7y\2\2\u04ad\u04ae\7\u00d6\2\2\u04ae\u04af\7\u00d9"+
		"\2\2\u04af\u04ef\3\2\2\2\u04b0\u04b1\7p\2\2\u04b1\u04b2\7R\2\2\u04b2\u04b3"+
		"\5\u009eP\2\u04b3\u04b4\7\u00da\2\2\u04b4\u04b5\7D\2\2\u04b5\u04ef\3\2"+
		"\2\2\u04b6\u04b7\7p\2\2\u04b7\u04b8\7R\2\2\u04b8\u04b9\5\u009eP\2\u04b9"+
		"\u04ba\7\u00db\2\2\u04ba\u04bb\7D\2\2\u04bb\u04ef\3\2\2\2\u04bc\u04bd"+
		"\7p\2\2\u04bd\u04be\7R\2\2\u04be\u04bf\5\u009eP\2\u04bf\u04c0\7\u00dc"+
		"\2\2\u04c0\u04c1\7D\2\2\u04c1\u04ef\3\2\2\2\u04c2\u04c3\7p\2\2\u04c3\u04c4"+
		"\7R\2\2\u04c4\u04c5\5\u009eP\2\u04c5\u04c6\7\u00de\2\2\u04c6\u04ef\3\2"+
		"\2\2\u04c7\u04c8\7p\2\2\u04c8\u04c9\7R\2\2\u04c9\u04cb\5\u009eP\2\u04ca"+
		"\u04cc\58\35\2\u04cb\u04ca\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\3\2"+
		"\2\2\u04cd\u04ce\7\u00df\2\2\u04ce\u04ef\3\2\2\2\u04cf\u04d0\7p\2\2\u04d0"+
		"\u04d1\7R\2\2\u04d1\u04d3\5\u009eP\2\u04d2\u04d4\58\35\2\u04d3\u04d2\3"+
		"\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\7\u00e0\2\2"+
		"\u04d6\u04ef\3\2\2\2\u04d7\u04d8\7p\2\2\u04d8\u04d9\7R\2\2\u04d9\u04db"+
		"\5\u009eP\2\u04da\u04dc\58\35\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2"+
		"\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\7y\2\2\u04de\u04df\7\u00dd\2\2\u04df"+
		"\u04ef\3\2\2\2\u04e0\u04e1\7p\2\2\u04e1\u04e2\7R\2\2\u04e2\u04e4\5\u009e"+
		"P\2\u04e3\u04e5\58\35\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5"+
		"\u04e6\3\2\2\2\u04e6\u04e7\7U\2\2\u04e7\u04e8\7b\2\2\u04e8\u04ef\3\2\2"+
		"\2\u04e9\u04ea\7|\2\2\u04ea\u04ef\7}\2\2\u04eb\u04ef\7~\2\2\u04ec\u04ef"+
		"\7\177\2\2\u04ed\u04ef\7\u00eb\2\2\u04ee\u0446\3\2\2\2\u04ee\u0448\3\2"+
		"\2\2\u04ee\u044a\3\2\2\2\u04ee\u044e\3\2\2\2\u04ee\u0452\3\2\2\2\u04ee"+
		"\u0454\3\2\2\2\u04ee\u0459\3\2\2\2\u04ee\u045b\3\2\2\2\u04ee\u045d\3\2"+
		"\2\2\u04ee\u0460\3\2\2\2\u04ee\u0462\3\2\2\2\u04ee\u0464\3\2\2\2\u04ee"+
		"\u0466\3\2\2\2\u04ee\u0469\3\2\2\2\u04ee\u046b\3\2\2\2\u04ee\u046d\3\2"+
		"\2\2\u04ee\u046f\3\2\2\2\u04ee\u0471\3\2\2\2\u04ee\u0473\3\2\2\2\u04ee"+
		"\u0475\3\2\2\2\u04ee\u0477\3\2\2\2\u04ee\u0479\3\2\2\2\u04ee\u047b\3\2"+
		"\2\2\u04ee\u047d\3\2\2\2\u04ee\u0480\3\2\2\2\u04ee\u0483\3\2\2\2\u04ee"+
		"\u0489\3\2\2\2\u04ee\u048f\3\2\2\2\u04ee\u0495\3\2\2\2\u04ee\u049b\3\2"+
		"\2\2\u04ee\u04a1\3\2\2\2\u04ee\u04a9\3\2\2\2\u04ee\u04b0\3\2\2\2\u04ee"+
		"\u04b6\3\2\2\2\u04ee\u04bc\3\2\2\2\u04ee\u04c2\3\2\2\2\u04ee\u04c7\3\2"+
		"\2\2\u04ee\u04cf\3\2\2\2\u04ee\u04d7\3\2\2\2\u04ee\u04e0\3\2\2\2\u04ee"+
		"\u04e9\3\2\2\2\u04ee\u04eb\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee\u04ed\3\2"+
		"\2\2\u04ef\37\3\2\2\2\u04f0\u04f2\7Q\2\2\u04f1\u04f3\7\u00d0\2\2\u04f2"+
		"\u04f1\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f5\3\2\2\2\u04f4\u04f6\7\u00f2"+
		"\2\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04fb\7R\2\2\u04f8\u04f9\7\u0094\2\2\u04f9\u04fa\7\"\2\2\u04fa\u04fc"+
		"\7$\2\2\u04fb\u04f8\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd"+
		"\u04fe\5\u009eP\2\u04fe!\3\2\2\2\u04ff\u0500\7\u00e4\2\2\u0500\u0501\7"+
		"\26\2\2\u0501\u0505\5\u0088E\2\u0502\u0503\7\u00e5\2\2\u0503\u0504\7\26"+
		"\2\2\u0504\u0506\5\u008cG\2\u0505\u0502\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0507\3\2\2\2\u0507\u0508\7X\2\2\u0508\u0509\7\u0115\2\2\u0509\u050a"+
		"\7\u00d5\2\2\u050a#\3\2\2\2\u050b\u050c\7\u00d6\2\2\u050c\u050d\7\26\2"+
		"\2\u050d\u050e\5\u0088E\2\u050e\u0511\7?\2\2\u050f\u0512\5N(\2\u0510\u0512"+
		"\5P)\2\u0511\u050f\3\2\2\2\u0511\u0510\3\2\2\2\u0512\u0516\3\2\2\2\u0513"+
		"\u0514\7\u00d7\2\2\u0514\u0515\7\20\2\2\u0515\u0517\7\u00d8\2\2\u0516"+
		"\u0513\3\2\2\2\u0516\u0517\3\2\2\2\u0517%\3\2\2\2\u0518\u0519\7\u00d9"+
		"\2\2\u0519\u051a\7\u0111\2\2\u051a\'\3\2\2\2\u051b\u051d\5@!\2\u051c\u051b"+
		"\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5Z.\2\u051f"+
		")\3\2\2\2\u0520\u0521\7V\2\2\u0521\u0522\7\u00b5\2\2\u0522\u0523\7R\2"+
		"\2\u0523\u052a\5\u009eP\2\u0524\u0528\58\35\2\u0525\u0526\7\u0094\2\2"+
		"\u0526\u0527\7\"\2\2\u0527\u0529\7$\2\2\u0528\u0525\3\2\2\2\u0528\u0529"+
		"\3\2\2\2\u0529\u052b\3\2\2\2\u052a\u0524\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u0551\3\2\2\2\u052c\u052d\7V\2\2\u052d\u052f\7X\2\2\u052e\u0530\7R\2"+
		"\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533"+
		"\5\u009eP\2\u0532\u0534\58\35\2\u0533\u0532\3\2\2\2\u0533\u0534\3\2\2"+
		"\2\u0534\u0551\3\2\2\2\u0535\u0536\7V\2\2\u0536\u0538\7\u00b5\2\2\u0537"+
		"\u0539\7\u0108\2\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053a"+
		"\3\2\2\2\u053a\u053b\7S\2\2\u053b\u053d\7\u0111\2\2\u053c\u053e\5\u009c"+
		"O\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0540\3\2\2\2\u053f"+
		"\u0541\5R*\2\u0540\u053f\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0551\3\2\2"+
		"\2\u0542\u0543\7V\2\2\u0543\u0545\7\u00b5\2\2\u0544\u0546\7\u0108\2\2"+
		"\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0549"+
		"\7S\2\2\u0548\u054a\7\u0111\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2"+
		"\2\u054a\u054b\3\2\2\2\u054b\u054e\5D#\2\u054c\u054d\7\u00d1\2\2\u054d"+
		"\u054f\5F$\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\3\2\2"+
		"\2\u0550\u0520\3\2\2\2\u0550\u052c\3\2\2\2\u0550\u0535\3\2\2\2\u0550\u0542"+
		"\3\2\2\2\u0551+\3\2\2\2\u0552\u0553\7y\2\2\u0553\u0558\5.\30\2\u0554\u0555"+
		"\7\5\2\2\u0555\u0557\5.\30\2\u0556\u0554\3\2\2\2\u0557\u055a\3\2\2\2\u0558"+
		"\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559-\3\2\2\2\u055a\u0558\3\2\2\2"+
		"\u055b\u055c\5\u00dan\2\u055c\u055d\7\u0097\2\2\u055d\u055e\5\u00a6T\2"+
		"\u055e/\3\2\2\2\u055f\u0564\5\62\32\2\u0560\u0561\7\5\2\2\u0561\u0563"+
		"\5\62\32\2\u0562\u0560\3\2\2\2\u0563\u0566\3\2\2\2\u0564\u0562\3\2\2\2"+
		"\u0564\u0565\3\2\2\2\u0565\61\3\2\2\2\u0566\u0564\3\2\2\2\u0567\u0568"+
		"\5\64\33\2\u0568\u0569\7\u0097\2\2\u0569\u056a\5\u00a6T\2\u056a\63\3\2"+
		"\2\2\u056b\u056c\5\u00dan\2\u056c\u056d\7\6\2\2\u056d\u056f\3\2\2\2\u056e"+
		"\u056b\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0571\5\u00da"+
		"n\2\u0571\65\3\2\2\2\u0572\u0574\58\35\2\u0573\u0575\5&\24\2\u0574\u0573"+
		"\3\2\2\2\u0574\u0575\3\2\2\2\u0575\67\3\2\2\2\u0576\u0577\7D\2\2\u0577"+
		"\u0578\7\3\2\2\u0578\u057d\5:\36\2\u0579\u057a\7\5\2\2\u057a\u057c\5:"+
		"\36\2\u057b\u0579\3\2\2\2\u057c\u057f\3\2\2\2\u057d\u057b\3\2\2\2\u057d"+
		"\u057e\3\2\2\2\u057e\u0580\3\2\2\2\u057f\u057d\3\2\2\2\u0580\u0581\7\4"+
		"\2\2\u05819\3\2\2\2\u0582\u0585\5\u00dan\2\u0583\u0584\7\u0097\2\2\u0584"+
		"\u0586\5\u00b0Y\2\u0585\u0583\3\2\2\2\u0585\u0586\3\2\2\2\u0586;\3\2\2"+
		"\2\u0587\u058d\5\u00d8m\2\u0588\u058d\7\u0111\2\2\u0589\u058d\5\u00b2"+
		"Z\2\u058a\u058d\5\u00b4[\2\u058b\u058d\5\u00b6\\\2\u058c\u0587\3\2\2\2"+
		"\u058c\u0588\3\2\2\2\u058c\u0589\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058b"+
		"\3\2\2\2\u058d=\3\2\2\2\u058e\u0593\5\u00dan\2\u058f\u0590\7\6\2\2\u0590"+
		"\u0592\5\u00dan\2\u0591\u058f\3\2\2\2\u0592\u0595\3\2\2\2\u0593\u0591"+
		"\3\2\2\2\u0593\u0594\3\2\2\2\u0594?\3\2\2\2\u0595\u0593\3\2\2\2\u0596"+
		"\u0597\7O\2\2\u0597\u059c\5B\"\2\u0598\u0599\7\5\2\2\u0599\u059b\5B\""+
		"\2\u059a\u0598\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d"+
		"\3\2\2\2\u059dA\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a1\5\u00dan\2\u05a0"+
		"\u05a2\7\20\2\2\u05a1\u05a0\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\3"+
		"\2\2\2\u05a3\u05a4\7\3\2\2\u05a4\u05a5\5(\25\2\u05a5\u05a6\7\4\2\2\u05a6"+
		"C\3\2\2\2\u05a7\u05a8\7\u00b8\2\2\u05a8\u05a9\5\u00d8m\2\u05a9E\3\2\2"+
		"\2\u05aa\u05ab\7\3\2\2\u05ab\u05b0\5H%\2\u05ac\u05ad\7\5\2\2\u05ad\u05af"+
		"\5H%\2\u05ae\u05ac\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0"+
		"\u05b1\3\2\2\2\u05b1\u05b3\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4\7\4"+
		"\2\2\u05b4G\3\2\2\2\u05b5\u05ba\5J&\2\u05b6\u05b8\7\u0097\2\2\u05b7\u05b6"+
		"\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05bb\5L\'\2\u05ba"+
		"\u05b7\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bbI\3\2\2\2\u05bc\u05c1\5\u00da"+
		"n\2\u05bd\u05be\7\6\2\2\u05be\u05c0\5\u00dan\2\u05bf\u05bd\3\2\2\2\u05c0"+
		"\u05c3\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c6\3\2"+
		"\2\2\u05c3\u05c1\3\2\2\2\u05c4\u05c6\7\u0111\2\2\u05c5\u05bc\3\2\2\2\u05c5"+
		"\u05c4\3\2\2\2\u05c6K\3\2\2\2\u05c7\u05cc\7\u0115\2\2\u05c8\u05cc\7\u0116"+
		"\2\2\u05c9\u05cc\5\u00b8]\2\u05ca\u05cc\7\u0111\2\2\u05cb\u05c7\3\2\2"+
		"\2\u05cb\u05c8\3\2\2\2\u05cb\u05c9\3\2\2\2\u05cb\u05ca\3\2\2\2\u05ccM"+
		"\3\2\2\2\u05cd\u05ce\7\3\2\2\u05ce\u05d3\5\u00b0Y\2\u05cf\u05d0\7\5\2"+
		"\2\u05d0\u05d2\5\u00b0Y\2\u05d1\u05cf\3\2\2\2\u05d2\u05d5\3\2\2\2\u05d3"+
		"\u05d1\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\3\2\2\2\u05d5\u05d3\3\2"+
		"\2\2\u05d6\u05d7\7\4\2\2\u05d7O\3\2\2\2\u05d8\u05d9\7\3\2\2\u05d9\u05de"+
		"\5N(\2\u05da\u05db\7\5\2\2\u05db\u05dd\5N(\2\u05dc\u05da\3\2\2\2\u05dd"+
		"\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\3\2"+
		"\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\7\4\2\2\u05e2Q\3\2\2\2\u05e3\u05e4"+
		"\7\u00d7\2\2\u05e4\u05e5\7\20\2\2\u05e5\u05ea\5T+\2\u05e6\u05e7\7\u00d7"+
		"\2\2\u05e7\u05e8\7\26\2\2\u05e8\u05ea\5V,\2\u05e9\u05e3\3\2\2\2\u05e9"+
		"\u05e6\3\2\2\2\u05eaS\3\2\2\2\u05eb\u05ec\7\u00e7\2\2\u05ec\u05ed\7\u0111"+
		"\2\2\u05ed\u05ee\7\u00e8\2\2\u05ee\u05f1\7\u0111\2\2\u05ef\u05f1\5\u00da"+
		"n\2\u05f0\u05eb\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1U\3\2\2\2\u05f2\u05f6"+
		"\7\u0111\2\2\u05f3\u05f4\7O\2\2\u05f4\u05f5\7\u00ba\2\2\u05f5\u05f7\5"+
		"F$\2\u05f6\u05f3\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7W\3\2\2\2\u05f8\u05f9"+
		"\5\u00dan\2\u05f9\u05fa\7\u0111\2\2\u05faY\3\2\2\2\u05fb\u05fd\5*\26\2"+
		"\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff"+
		"\5`\61\2\u05ff\u0600\5\\/\2\u0600\u0608\3\2\2\2\u0601\u0603\5l\67\2\u0602"+
		"\u0604\5^\60\2\u0603\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605\u0603\3\2"+
		"\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u05fc\3\2\2\2\u0607"+
		"\u0601\3\2\2\2\u0608[\3\2\2\2\u0609\u060a\7\33\2\2\u060a\u060b\7\26\2"+
		"\2\u060b\u0610\5d\63\2\u060c\u060d\7\5\2\2\u060d\u060f\5d\63\2\u060e\u060c"+
		"\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611\3\2\2\2\u0611"+
		"\u0614\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0609\3\2\2\2\u0613\u0614\3\2"+
		"\2\2\u0614\u061f\3\2\2\2\u0615\u0616\7\u00b0\2\2\u0616\u0617\7\26\2\2"+
		"\u0617\u061c\5\u00a6T\2\u0618\u0619\7\5\2\2\u0619\u061b\5\u00a6T\2\u061a"+
		"\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2"+
		"\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0615\3\2\2\2\u061f"+
		"\u0620\3\2\2\2\u0620\u062b\3\2\2\2\u0621\u0622\7\u00b1\2\2\u0622\u0623"+
		"\7\26\2\2\u0623\u0628\5\u00a6T\2\u0624\u0625\7\5\2\2\u0625\u0627\5\u00a6"+
		"T\2\u0626\u0624\3\2\2\2\u0627\u062a\3\2\2\2\u0628\u0626\3\2\2\2\u0628"+
		"\u0629\3\2\2\2\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062b\u0621\3\2"+
		"\2\2\u062b\u062c\3\2\2\2\u062c\u0637\3\2\2\2\u062d\u062e\7\u00af\2\2\u062e"+
		"\u062f\7\26\2\2\u062f\u0634\5d\63\2\u0630\u0631\7\5\2\2\u0631\u0633\5"+
		"d\63\2\u0632\u0630\3\2\2\2\u0633\u0636\3\2\2\2\u0634\u0632\3\2\2\2\u0634"+
		"\u0635\3\2\2\2\u0635\u0638\3\2\2\2\u0636\u0634\3\2\2\2\u0637\u062d\3\2"+
		"\2\2\u0637\u0638\3\2\2\2\u0638\u063a\3\2\2\2\u0639\u063b\5\u00ceh\2\u063a"+
		"\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u0641\3\2\2\2\u063c\u063f\7\35"+
		"\2\2\u063d\u0640\7\21\2\2\u063e\u0640\5\u00a6T\2\u063f\u063d\3\2\2\2\u063f"+
		"\u063e\3\2\2\2\u0640\u0642\3\2\2\2\u0641\u063c\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642]\3\2\2\2\u0643\u0645\5*\26\2\u0644\u0643\3\2\2\2\u0644\u0645"+
		"\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0647\5f\64\2\u0647\u0648\5\\/\2\u0648"+
		"_\3\2\2\2\u0649\u064a\b\61\1\2\u064a\u064b\5b\62\2\u064b\u0663\3\2\2\2"+
		"\u064c\u064d\f\5\2\2\u064d\u064e\6\61\3\2\u064e\u0650\t\13\2\2\u064f\u0651"+
		"\5z>\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0662\5`\61\6\u0653\u0654\f\4\2\2\u0654\u0655\6\61\5\2\u0655\u0657\7"+
		"l\2\2\u0656\u0658\5z>\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u0662\5`\61\5\u065a\u065b\f\3\2\2\u065b\u065c\6\61"+
		"\7\2\u065c\u065e\t\f\2\2\u065d\u065f\5z>\2\u065e\u065d\3\2\2\2\u065e\u065f"+
		"\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0662\5`\61\4\u0661\u064c\3\2\2\2\u0661"+
		"\u0653\3\2\2\2\u0661\u065a\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2"+
		"\2\2\u0663\u0664\3\2\2\2\u0664a\3\2\2\2\u0665\u0663\3\2\2\2\u0666\u066f"+
		"\5f\64\2\u0667\u0668\7R\2\2\u0668\u066f\5\u009eP\2\u0669\u066f\5\u0096"+
		"L\2\u066a\u066b\7\3\2\2\u066b\u066c\5Z.\2\u066c\u066d\7\4\2\2\u066d\u066f"+
		"\3\2\2\2\u066e\u0666\3\2\2\2\u066e\u0667\3\2\2\2\u066e\u0669\3\2\2\2\u066e"+
		"\u066a\3\2\2\2\u066fc\3\2\2\2\u0670\u0672\5\u00a6T\2\u0671\u0673\t\r\2"+
		"\2\u0672\u0671\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0676\3\2\2\2\u0674\u0675"+
		"\7,\2\2\u0675\u0677\t\16\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677"+
		"e\3\2\2\2\u0678\u0679\7\r\2\2\u0679\u067a\7\u00b6\2\2\u067a\u067b\7\3"+
		"\2\2\u067b\u067c\5\u00a4S\2\u067c\u067d\7\4\2\2\u067d\u0683\3\2\2\2\u067e"+
		"\u067f\7s\2\2\u067f\u0683\5\u00a4S\2\u0680\u0681\7\u00b7\2\2\u0681\u0683"+
		"\5\u00a4S\2\u0682\u0678\3\2\2\2\u0682\u067e\3\2\2\2\u0682\u0680\3\2\2"+
		"\2\u0683\u0685\3\2\2\2\u0684\u0686\5\u009cO\2\u0685\u0684\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0688\7\u00bc\2\2\u0688\u068a"+
		"\7\u0111\2\2\u0689\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b\3\2\2"+
		"\2\u068b\u068c\7\u00b8\2\2\u068c\u0699\7\u0111\2\2\u068d\u0697\7\20\2"+
		"\2\u068e\u0698\5\u008aF\2\u068f\u0698\5\u00c4c\2\u0690\u0693\7\3\2\2\u0691"+
		"\u0694\5\u008aF\2\u0692\u0694\5\u00c4c\2\u0693\u0691\3\2\2\2\u0693\u0692"+
		"\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0696\7\4\2\2\u0696\u0698\3\2\2\2\u0697"+
		"\u068e\3\2\2\2\u0697\u068f\3\2\2\2\u0697\u0690\3\2\2\2\u0698\u069a\3\2"+
		"\2\2\u0699\u068d\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u069c\3\2\2\2\u069b"+
		"\u069d\5\u009cO\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u06a0"+
		"\3\2\2\2\u069e\u069f\7\u00bb\2\2\u069f\u06a1\7\u0111\2\2\u06a0\u069e\3"+
		"\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a3\3\2\2\2\u06a2\u06a4\5l\67\2\u06a3"+
		"\u06a2\3\2\2\2\u06a3\u06a4\3\2\2\2\u06a4\u06a7\3\2\2\2\u06a5\u06a6\7\24"+
		"\2\2\u06a6\u06a8\5\u00a8U\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8"+
		"\u06d6\3\2\2\2\u06a9\u06ad\7\r\2\2\u06aa\u06ac\5h\65\2\u06ab\u06aa\3\2"+
		"\2\2\u06ac\u06af\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae"+
		"\u06b1\3\2\2\2\u06af\u06ad\3\2\2\2\u06b0\u06b2\5z>\2\u06b1\u06b0\3\2\2"+
		"\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b5\5\u00a4S\2\u06b4"+
		"\u06b6\5l\67\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6\u06c0\3\2"+
		"\2\2\u06b7\u06bd\5l\67\2\u06b8\u06ba\7\r\2\2\u06b9\u06bb\5z>\2\u06ba\u06b9"+
		"\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\5\u00a4S"+
		"\2\u06bd\u06b8\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06c0\3\2\2\2\u06bf\u06a9"+
		"\3\2\2\2\u06bf\u06b7\3\2\2\2\u06c0\u06c4\3\2\2\2\u06c1\u06c3\5x=\2\u06c2"+
		"\u06c1\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2"+
		"\2\2\u06c5\u06c9\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06c8\7\24\2\2\u06c8"+
		"\u06ca\5\u00a8U\2\u06c9\u06c7\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc"+
		"\3\2\2\2\u06cb\u06cd\5n8\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd"+
		"\u06d0\3\2\2\2\u06ce\u06cf\7\34\2\2\u06cf\u06d1\5\u00a8U\2\u06d0\u06ce"+
		"\3\2\2\2\u06d0\u06d1\3\2\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06d4\5\u00ceh"+
		"\2\u06d3\u06d2\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u0682"+
		"\3\2\2\2\u06d5\u06bf\3\2\2\2\u06d6g\3\2\2\2\u06d7\u06d8\7\7\2\2\u06d8"+
		"\u06df\5j\66\2\u06d9\u06db\7\5\2\2\u06da\u06d9\3\2\2\2\u06da\u06db\3\2"+
		"\2\2\u06db\u06dc\3\2\2\2\u06dc\u06de\5j\66\2\u06dd\u06da\3\2\2\2\u06de"+
		"\u06e1\3\2\2\2\u06df\u06dd\3\2\2\2\u06df\u06e0\3\2\2\2\u06e0\u06e2\3\2"+
		"\2\2\u06e1\u06df\3\2\2\2\u06e2\u06e3\7\b\2\2\u06e3i\3\2\2\2\u06e4\u06f2"+
		"\5\u00dan\2\u06e5\u06e6\5\u00dan\2\u06e6\u06e7\7\3\2\2\u06e7\u06ec\5\u00ae"+
		"X\2\u06e8\u06e9\7\5\2\2\u06e9\u06eb\5\u00aeX\2\u06ea\u06e8\3\2\2\2\u06eb"+
		"\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\3\2"+
		"\2\2\u06ee\u06ec\3\2\2\2\u06ef\u06f0\7\4\2\2\u06f0\u06f2\3\2\2\2\u06f1"+
		"\u06e4\3\2\2\2\u06f1\u06e5\3\2\2\2\u06f2k\3\2\2\2\u06f3\u06f4\7\16\2\2"+
		"\u06f4\u06f9\5|?\2\u06f5\u06f6\7\5\2\2\u06f6\u06f8\5|?\2\u06f7\u06f5\3"+
		"\2\2\2\u06f8\u06fb\3\2\2\2\u06f9\u06f7\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06ff\3\2\2\2\u06fb\u06f9\3\2\2\2\u06fc\u06fe\5x=\2\u06fd\u06fc\3\2\2"+
		"\2\u06fe\u0701\3\2\2\2\u06ff\u06fd\3\2\2\2\u06ff\u0700\3\2\2\2\u0700\u0703"+
		"\3\2\2\2\u0701\u06ff\3\2\2\2\u0702\u0704\5r:\2\u0703\u0702\3\2\2\2\u0703"+
		"\u0704\3\2\2\2\u0704m\3\2\2\2\u0705\u0706\7\25\2\2\u0706\u0707\7\26\2"+
		"\2\u0707\u070c\5\u00a6T\2\u0708\u0709\7\5\2\2\u0709\u070b\5\u00a6T\2\u070a"+
		"\u0708\3\2\2\2\u070b\u070e\3\2\2\2\u070c\u070a\3\2\2\2\u070c\u070d\3\2"+
		"\2\2\u070d\u0720\3\2\2\2\u070e\u070c\3\2\2\2\u070f\u0710\7O\2\2\u0710"+
		"\u0721\7\32\2\2\u0711\u0712\7O\2\2\u0712\u0721\7\31\2\2\u0713\u0714\7"+
		"\27\2\2\u0714\u0715\7\30\2\2\u0715\u0716\7\3\2\2\u0716\u071b\5p9\2\u0717"+
		"\u0718\7\5\2\2\u0718\u071a\5p9\2\u0719\u0717\3\2\2\2\u071a\u071d\3\2\2"+
		"\2\u071b\u0719\3\2\2\2\u071b\u071c\3\2\2\2\u071c\u071e\3\2\2\2\u071d\u071b"+
		"\3\2\2\2\u071e\u071f\7\4\2\2\u071f\u0721\3\2\2\2\u0720\u070f\3\2\2\2\u0720"+
		"\u0711\3\2\2\2\u0720\u0713\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0732\3\2"+
		"\2\2\u0722\u0723\7\25\2\2\u0723\u0724\7\26\2\2\u0724\u0725\7\27\2\2\u0725"+
		"\u0726\7\30\2\2\u0726\u0727\7\3\2\2\u0727\u072c\5p9\2\u0728\u0729\7\5"+
		"\2\2\u0729\u072b\5p9\2\u072a\u0728\3\2\2\2\u072b\u072e\3\2\2\2\u072c\u072a"+
		"\3\2\2\2\u072c\u072d\3\2\2\2\u072d\u072f\3\2\2\2\u072e\u072c\3\2\2\2\u072f"+
		"\u0730\7\4\2\2\u0730\u0732\3\2\2\2\u0731\u0705\3\2\2\2\u0731\u0722\3\2"+
		"\2\2\u0732o\3\2\2\2\u0733\u073c\7\3\2\2\u0734\u0739\5\u00a6T\2\u0735\u0736"+
		"\7\5\2\2\u0736\u0738\5\u00a6T\2\u0737\u0735\3\2\2\2\u0738\u073b\3\2\2"+
		"\2\u0739\u0737\3\2\2\2\u0739\u073a\3\2\2\2\u073a\u073d\3\2\2\2\u073b\u0739"+
		"\3\2\2\2\u073c\u0734\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\3\2\2\2\u073e"+
		"\u0741\7\4\2\2\u073f\u0741\5\u00a6T\2\u0740\u0733\3\2\2\2\u0740\u073f"+
		"\3\2\2\2\u0741q\3\2\2\2\u0742\u0743\7@\2\2\u0743\u0744\7\3\2\2\u0744\u0745"+
		"\5\u00a4S\2\u0745\u0746\7/\2\2\u0746\u0747\5t;\2\u0747\u0748\7!\2\2\u0748"+
		"\u0749\7\3\2\2\u0749\u074e\5v<\2\u074a\u074b\7\5\2\2\u074b\u074d\5v<\2"+
		"\u074c\u074a\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e\u074f"+
		"\3\2\2\2\u074f\u0751\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u0752\7\4\2\2\u0752"+
		"\u0753\7\4\2\2\u0753s\3\2\2\2\u0754\u0761\5\u00dan\2\u0755\u0756\7\3\2"+
		"\2\u0756\u075b\5\u00dan\2\u0757\u0758\7\5\2\2\u0758\u075a\5\u00dan\2\u0759"+
		"\u0757\3\2\2\2\u075a\u075d\3\2\2\2\u075b\u0759\3\2\2\2\u075b\u075c\3\2"+
		"\2\2\u075c\u075e\3\2\2\2\u075d\u075b\3\2\2\2\u075e\u075f\7\4\2\2\u075f"+
		"\u0761\3\2\2\2\u0760\u0754\3\2\2\2\u0760\u0755\3\2\2\2\u0761u\3\2\2\2"+
		"\u0762\u0767\5\u00a6T\2\u0763\u0765\7\20\2\2\u0764\u0763\3\2\2\2\u0764"+
		"\u0765\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0768\5\u00dan\2\u0767\u0764"+
		"\3\2\2\2\u0767\u0768\3\2\2\2\u0768w\3\2\2\2\u0769\u076a\7A\2\2\u076a\u076c"+
		"\7T\2\2\u076b\u076d\78\2\2\u076c\u076b\3\2\2\2\u076c\u076d\3\2\2\2\u076d"+
		"\u076e\3\2\2\2\u076e\u076f\5\u00d8m\2\u076f\u0778\7\3\2\2\u0770\u0775"+
		"\5\u00a6T\2\u0771\u0772\7\5\2\2\u0772\u0774\5\u00a6T\2\u0773\u0771\3\2"+
		"\2\2\u0774\u0777\3\2\2\2\u0775\u0773\3\2\2\2\u0775\u0776\3\2\2\2\u0776"+
		"\u0779\3\2\2\2\u0777\u0775\3\2\2\2\u0778\u0770\3\2\2\2\u0778\u0779\3\2"+
		"\2\2\u0779\u077a\3\2\2\2\u077a\u077b\7\4\2\2\u077b\u0787\5\u00dan\2\u077c"+
		"\u077e\7\20\2\2\u077d\u077c\3\2\2\2\u077d\u077e\3\2\2\2\u077e\u077f\3"+
		"\2\2\2\u077f\u0784\5\u00dan\2\u0780\u0781\7\5\2\2\u0781\u0783\5\u00da"+
		"n\2\u0782\u0780\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784"+
		"\u0785\3\2\2\2\u0785\u0788\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u077d\3\2"+
		"\2\2\u0787\u0788\3\2\2\2\u0788y\3\2\2\2\u0789\u078a\t\17\2\2\u078a{\3"+
		"\2\2\2\u078b\u078f\5\u0094K\2\u078c\u078e\5~@\2\u078d\u078c\3\2\2\2\u078e"+
		"\u0791\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u0790\3\2\2\2\u0790}\3\2\2\2"+
		"\u0791\u078f\3\2\2\2\u0792\u0793\5\u0080A\2\u0793\u0794\7\66\2\2\u0794"+
		"\u0796\5\u0094K\2\u0795\u0797\5\u0082B\2\u0796\u0795\3\2\2\2\u0796\u0797"+
		"\3\2\2\2\u0797\u079e\3\2\2\2\u0798\u0799\7>\2\2\u0799\u079a\5\u0080A\2"+
		"\u079a\u079b\7\66\2\2\u079b\u079c\5\u0094K\2\u079c\u079e\3\2\2\2\u079d"+
		"\u0792\3\2\2\2\u079d\u0798\3\2\2\2\u079e\177\3\2\2\2\u079f\u07a1\79\2"+
		"\2\u07a0\u079f\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07b6\3\2\2\2\u07a2\u07b6"+
		"\7\67\2\2\u07a3\u07a5\7:\2\2\u07a4\u07a6\78\2\2\u07a5\u07a4\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u07b6\3\2\2\2\u07a7\u07a8\7:\2\2\u07a8\u07b6\7;\2"+
		"\2\u07a9\u07ab\7<\2\2\u07aa\u07ac\78\2\2\u07ab\u07aa\3\2\2\2\u07ab\u07ac"+
		"\3\2\2\2\u07ac\u07b6\3\2\2\2\u07ad\u07af\7=\2\2\u07ae\u07b0\78\2\2\u07af"+
		"\u07ae\3\2\2\2\u07af\u07b0\3\2\2\2\u07b0\u07b6\3\2\2\2\u07b1\u07b3\7:"+
		"\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4"+
		"\u07b6\7\u0107\2\2\u07b5\u07a0\3\2\2\2\u07b5\u07a2\3\2\2\2\u07b5\u07a3"+
		"\3\2\2\2\u07b5\u07a7\3\2\2\2\u07b5\u07a9\3\2\2\2\u07b5\u07ad\3\2\2\2\u07b5"+
		"\u07b2\3\2\2\2\u07b6\u0081\3\2\2\2\u07b7\u07b8\7?\2\2\u07b8\u07c6\5\u00a8"+
		"U\2\u07b9\u07ba\7\u00b8\2\2\u07ba\u07bb\7\3\2\2\u07bb\u07c0\5\u00dan\2"+
		"\u07bc\u07bd\7\5\2\2\u07bd\u07bf\5\u00dan\2\u07be\u07bc\3\2\2\2\u07bf"+
		"\u07c2\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07c3\3\2"+
		"\2\2\u07c2\u07c0\3\2\2\2\u07c3\u07c4\7\4\2\2\u07c4\u07c6\3\2\2\2\u07c5"+
		"\u07b7\3\2\2\2\u07c5\u07b9\3\2\2\2\u07c6\u0083\3\2\2\2\u07c7\u07c8\7n"+
		"\2\2\u07c8\u07ca\7\3\2\2\u07c9\u07cb\5\u0086D\2\u07ca\u07c9\3\2\2\2\u07ca"+
		"\u07cb\3\2\2\2\u07cb\u07cc\3\2\2\2\u07cc\u07cd\7\4\2\2\u07cd\u0085\3\2"+
		"\2\2\u07ce\u07d0\7\u00a0\2\2\u07cf\u07ce\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0"+
		"\u07d1\3\2\2\2\u07d1\u07d2\t\20\2\2\u07d2\u07e7\7\u00aa\2\2\u07d3\u07d4"+
		"\5\u00a6T\2\u07d4\u07d5\7F\2\2\u07d5\u07e7\3\2\2\2\u07d6\u07d7\7\u00ab"+
		"\2\2\u07d7\u07d8\7\u0115\2\2\u07d8\u07d9\7\u00ac\2\2\u07d9\u07da\7\u00ad"+
		"\2\2\u07da\u07e3\7\u0115\2\2\u07db\u07e1\7?\2\2\u07dc\u07e2\5\u00dan\2"+
		"\u07dd\u07de\5\u00d8m\2\u07de\u07df\7\3\2\2\u07df\u07e0\7\4\2\2\u07e0"+
		"\u07e2\3\2\2\2\u07e1\u07dc\3\2\2\2\u07e1\u07dd\3\2\2\2\u07e2\u07e4\3\2"+
		"\2\2\u07e3\u07db\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5"+
		"\u07e7\5\u00a6T\2\u07e6\u07cf\3\2\2\2\u07e6\u07d3\3\2\2\2\u07e6\u07d6"+
		"\3\2\2\2\u07e6\u07e5\3\2\2\2\u07e7\u0087\3\2\2\2\u07e8\u07e9\7\3\2\2\u07e9"+
		"\u07ea\5\u008aF\2\u07ea\u07eb\7\4\2\2\u07eb\u0089\3\2\2\2\u07ec\u07f1"+
		"\5\u00dan\2\u07ed\u07ee\7\5\2\2\u07ee\u07f0\5\u00dan\2\u07ef\u07ed\3\2"+
		"\2\2\u07f0\u07f3\3\2\2\2\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2"+
		"\u008b\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f4\u07f5\7\3\2\2\u07f5\u07fa\5\u008e"+
		"H\2\u07f6\u07f7\7\5\2\2\u07f7\u07f9\5\u008eH\2\u07f8\u07f6\3\2\2\2\u07f9"+
		"\u07fc\3\2\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07fb\3\2\2\2\u07fb\u07fd\3\2"+
		"\2\2\u07fc\u07fa\3\2\2\2\u07fd\u07fe\7\4\2\2\u07fe\u008d\3\2\2\2\u07ff"+
		"\u0801\5\u00dan\2\u0800\u0802\t\r\2\2\u0801\u0800\3\2\2\2\u0801\u0802"+
		"\3\2\2\2\u0802\u008f\3\2\2\2\u0803\u0804\7\3\2\2\u0804\u0809\5\u0092J"+
		"\2\u0805\u0806\7\5\2\2\u0806\u0808\5\u0092J\2\u0807\u0805\3\2\2\2\u0808"+
		"\u080b\3\2\2\2\u0809\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\3\2"+
		"\2\2\u080b\u0809\3\2\2\2\u080c\u080d\7\4\2\2\u080d\u0091\3\2\2\2\u080e"+
		"\u0811\5\u00dan\2\u080f\u0810\7w\2\2\u0810\u0812\7\u0111\2\2\u0811\u080f"+
		"\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0093\3\2\2\2\u0813\u0815\5\u009eP"+
		"\2\u0814\u0816\5\u0084C\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816"+
		"\u0817\3\2\2\2\u0817\u0818\5\u009aN\2\u0818\u082c\3\2\2\2\u0819\u081a"+
		"\7\3\2\2\u081a\u081b\5Z.\2\u081b\u081d\7\4\2\2\u081c\u081e\5\u0084C\2"+
		"\u081d\u081c\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\3\2\2\2\u081f\u0820"+
		"\5\u009aN\2\u0820\u082c\3\2\2\2\u0821\u0822\7\3\2\2\u0822\u0823\5|?\2"+
		"\u0823\u0825\7\4\2\2\u0824\u0826\5\u0084C\2\u0825\u0824\3\2\2\2\u0825"+
		"\u0826\3\2\2\2\u0826\u0827\3\2\2\2\u0827\u0828\5\u009aN\2\u0828\u082c"+
		"\3\2\2\2\u0829\u082c\5\u0096L\2\u082a\u082c\5\u0098M\2\u082b\u0813\3\2"+
		"\2\2\u082b\u0819\3\2\2\2\u082b\u0821\3\2\2\2\u082b\u0829\3\2\2\2\u082b"+
		"\u082a\3\2\2\2\u082c\u0095\3\2\2\2\u082d\u082e\7P\2\2\u082e\u0833\5\u00a6"+
		"T\2\u082f\u0830\7\5\2\2\u0830\u0832\5\u00a6T\2\u0831\u082f\3\2\2\2\u0832"+
		"\u0835\3\2\2\2\u0833\u0831\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0836\3\2"+
		"\2\2\u0835\u0833\3\2\2\2\u0836\u0837\5\u009aN\2\u0837\u0097\3\2\2\2\u0838"+
		"\u0839\5\u00dan\2\u0839\u0842\7\3\2\2\u083a\u083f\5\u00a6T\2\u083b\u083c"+
		"\7\5\2\2\u083c\u083e\5\u00a6T\2\u083d\u083b\3\2\2\2\u083e\u0841\3\2\2"+
		"\2\u083f\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f"+
		"\3\2\2\2\u0842\u083a\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844"+
		"\u0845\7\4\2\2\u0845\u0846\5\u009aN\2\u0846\u0099\3\2\2\2\u0847\u0849"+
		"\7\20\2\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084a\3\2\2\2"+
		"\u084a\u084c\5\u00dco\2\u084b\u084d\5\u0088E\2\u084c\u084b\3\2\2\2\u084c"+
		"\u084d\3\2\2\2\u084d\u084f\3\2\2\2\u084e\u0848\3\2\2\2\u084e\u084f\3\2"+
		"\2\2\u084f\u009b\3\2\2\2\u0850\u0851\7N\2\2\u0851\u0852\7[\2\2\u0852\u0853"+
		"\7\u00b9\2\2\u0853\u0857\7\u0111\2\2\u0854\u0855\7O\2\2\u0855\u0856\7"+
		"\u00ba\2\2\u0856\u0858\5F$\2\u0857\u0854\3\2\2\2\u0857\u0858\3\2\2\2\u0858"+
		"\u0882\3\2\2\2\u0859\u085a\7N\2\2\u085a\u085b\7[\2\2\u085b\u0865\7\u00bd"+
		"\2\2\u085c\u085d\7\u00be\2\2\u085d\u085e\7\u00bf\2\2\u085e\u085f\7\26"+
		"\2\2\u085f\u0863\7\u0111\2\2\u0860\u0861\7\u00c3\2\2\u0861\u0862\7\26"+
		"\2\2\u0862\u0864\7\u0111\2\2\u0863\u0860\3\2\2\2\u0863\u0864\3\2\2\2\u0864"+
		"\u0866\3\2\2\2\u0865\u085c\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u086c\3\2"+
		"\2\2\u0867\u0868\7\u00c0\2\2\u0868\u0869\7\u00c1\2\2\u0869\u086a\7\u00bf"+
		"\2\2\u086a\u086b\7\26\2\2\u086b\u086d\7\u0111\2\2\u086c\u0867\3\2\2\2"+
		"\u086c\u086d\3\2\2\2\u086d\u0873\3\2\2\2\u086e\u086f\7s\2\2\u086f\u0870"+
		"\7\u00c2\2\2\u0870\u0871\7\u00bf\2\2\u0871\u0872\7\26\2\2\u0872\u0874"+
		"\7\u0111\2\2\u0873\u086e\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0879\3\2\2"+
		"\2\u0875\u0876\7\u00c4\2\2\u0876\u0877\7\u00bf\2\2\u0877\u0878\7\26\2"+
		"\2\u0878\u087a\7\u0111\2\2\u0879\u0875\3\2\2\2\u0879\u087a\3\2\2\2\u087a"+
		"\u087f\3\2\2\2\u087b\u087c\7)\2\2\u087c\u087d\7\u00f3\2\2\u087d\u087e"+
		"\7\20\2\2\u087e\u0880\7\u0111\2\2\u087f\u087b\3\2\2\2\u087f\u0880\3\2"+
		"\2\2\u0880\u0882\3\2\2\2\u0881\u0850\3\2\2\2\u0881\u0859\3\2\2\2\u0882"+
		"\u009d\3\2\2\2\u0883\u0884\5\u00dan\2\u0884\u0885\7\6\2\2\u0885\u0887"+
		"\3\2\2\2\u0886\u0883\3\2\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888"+
		"\u088f\5\u00dan\2\u0889\u088a\7\u010f\2\2\u088a\u088c\7\6\2\2\u088b\u0889"+
		"\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088f\5\u00dan"+
		"\2\u088e\u0886\3\2\2\2\u088e\u088b\3\2\2\2\u088f\u009f\3\2\2\2\u0890\u0891"+
		"\5\u00dan\2\u0891\u0892\7\6\2\2\u0892\u0894\3\2\2\2\u0893\u0890\3\2\2"+
		"\2\u0893\u0894\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896\5\u00dan\2\u0896"+
		"\u00a1\3\2\2\2\u0897\u089f\5\u00a6T\2\u0898\u089a\7\20\2\2\u0899\u0898"+
		"\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089d\3\2\2\2\u089b\u089e\5\u00dan"+
		"\2\u089c\u089e\5\u0088E\2\u089d\u089b\3\2\2\2\u089d\u089c\3\2\2\2\u089e"+
		"\u08a0\3\2\2\2\u089f\u0899\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u00a3\3\2"+
		"\2\2\u08a1\u08a6\5\u00a2R\2\u08a2\u08a3\7\5\2\2\u08a3\u08a5\5\u00a2R\2"+
		"\u08a4\u08a2\3\2\2\2\u08a5\u08a8\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a6\u08a7"+
		"\3\2\2\2\u08a7\u00a5\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a9\u08aa\5\u00a8U"+
		"\2\u08aa\u00a7\3\2\2\2\u08ab\u08ac\bU\1\2\u08ac\u08ad\7\"\2\2\u08ad\u08b8"+
		"\5\u00a8U\7\u08ae\u08af\7$\2\2\u08af\u08b0\7\3\2\2\u08b0\u08b1\5(\25\2"+
		"\u08b1\u08b2\7\4\2\2\u08b2\u08b8\3\2\2\2\u08b3\u08b5\5\u00acW\2\u08b4"+
		"\u08b6\5\u00aaV\2\u08b5\u08b4\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u08b8"+
		"\3\2\2\2\u08b7\u08ab\3\2\2\2\u08b7\u08ae\3\2\2\2\u08b7\u08b3\3\2\2\2\u08b8"+
		"\u08c1\3\2\2\2\u08b9\u08ba\f\4\2\2\u08ba\u08bb\7 \2\2\u08bb\u08c0\5\u00a8"+
		"U\5\u08bc\u08bd\f\3\2\2\u08bd\u08be\7\37\2\2\u08be\u08c0\5\u00a8U\4\u08bf"+
		"\u08b9\3\2\2\2\u08bf\u08bc\3\2\2\2\u08c0\u08c3\3\2\2\2\u08c1\u08bf\3\2"+
		"\2\2\u08c1\u08c2\3\2\2\2\u08c2\u00a9\3\2\2\2\u08c3\u08c1\3\2\2\2\u08c4"+
		"\u08c6\7\"\2\2\u08c5\u08c4\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\3\2"+
		"\2\2\u08c7\u08c8\7%\2\2\u08c8\u08c9\5\u00acW\2\u08c9\u08ca\7 \2\2\u08ca"+
		"\u08cb\5\u00acW\2\u08cb\u08fa\3\2\2\2";
	private static final String _serializedATNSegment1 =
		"\u08cc\u08ce\7\"\2\2\u08cd\u08cc\3\2\2\2\u08cd\u08ce\3\2\2\2\u08ce\u08cf"+
		"\3\2\2\2\u08cf\u08d0\7!\2\2\u08d0\u08d1\7\3\2\2\u08d1\u08d6\5\u00a6T\2"+
		"\u08d2\u08d3\7\5\2\2\u08d3\u08d5\5\u00a6T\2\u08d4\u08d2\3\2\2\2\u08d5"+
		"\u08d8\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d9\3\2"+
		"\2\2\u08d8\u08d6\3\2\2\2\u08d9\u08da\7\4\2\2\u08da\u08fa\3\2\2\2\u08db"+
		"\u08dd\7\"\2\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2"+
		"\2\2\u08de\u08df\7!\2\2\u08df\u08e0\7\3\2\2\u08e0\u08e1\5(\25\2\u08e1"+
		"\u08e2\7\4\2\2\u08e2\u08fa\3\2\2\2\u08e3\u08e5\7\"\2\2\u08e4\u08e3\3\2"+
		"\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\t\21\2\2\u08e7"+
		"\u08fa\5\u00acW\2\u08e8\u08ea\7(\2\2\u08e9\u08eb\7\"\2\2\u08ea\u08e9\3"+
		"\2\2\2\u08ea\u08eb\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08fa\7)\2\2\u08ed"+
		"\u08ef\7(\2\2\u08ee\u08f0\7\"\2\2\u08ef\u08ee\3\2\2\2\u08ef\u08f0\3\2"+
		"\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08fa\t\22\2\2\u08f2\u08f4\7(\2\2\u08f3"+
		"\u08f5\7\"\2\2\u08f4\u08f3\3\2\2\2\u08f4\u08f5\3\2\2\2\u08f5\u08f6\3\2"+
		"\2\2\u08f6\u08f7\7\23\2\2\u08f7\u08f8\7\16\2\2\u08f8\u08fa\5\u00acW\2"+
		"\u08f9\u08c5\3\2\2\2\u08f9\u08cd\3\2\2\2\u08f9\u08dc\3\2\2\2\u08f9\u08e4"+
		"\3\2\2\2\u08f9\u08e8\3\2\2\2\u08f9\u08ed\3\2\2\2\u08f9\u08f2\3\2\2\2\u08fa"+
		"\u00ab\3\2\2\2\u08fb\u08fc\bW\1\2\u08fc\u0900\5\u00aeX\2\u08fd\u08fe\t"+
		"\23\2\2\u08fe\u0900\5\u00acW\t\u08ff\u08fb\3\2\2\2\u08ff\u08fd\3\2\2\2"+
		"\u0900\u0916\3\2\2\2\u0901\u0902\f\b\2\2\u0902\u0903\t\24\2\2\u0903\u0915"+
		"\5\u00acW\t\u0904\u0905\f\7\2\2\u0905\u0906\t\25\2\2\u0906\u0915\5\u00ac"+
		"W\b\u0907\u0908\f\6\2\2\u0908\u0909\7\u00a6\2\2\u0909\u0915\5\u00acW\7"+
		"\u090a\u090b\f\5\2\2\u090b\u090c\7\u00a9\2\2\u090c\u0915\5\u00acW\6\u090d"+
		"\u090e\f\4\2\2\u090e\u090f\7\u00a7\2\2\u090f\u0915\5\u00acW\5\u0910\u0911"+
		"\f\3\2\2\u0911\u0912\5\u00b2Z\2\u0912\u0913\5\u00acW\4\u0913\u0915\3\2"+
		"\2\2\u0914\u0901\3\2\2\2\u0914\u0904\3\2\2\2\u0914\u0907\3\2\2\2\u0914"+
		"\u090a\3\2\2\2\u0914\u090d\3\2\2\2\u0914\u0910\3\2\2\2\u0915\u0918\3\2"+
		"\2\2\u0916\u0914\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u00ad\3\2\2\2\u0918"+
		"\u0916\3\2\2\2\u0919\u091a\bX\1\2\u091a\u091c\7\61\2\2\u091b\u091d\5\u00cc"+
		"g\2\u091c\u091b\3\2\2\2\u091d\u091e\3\2\2\2\u091e\u091c\3\2\2\2\u091e"+
		"\u091f\3\2\2\2\u091f\u0922\3\2\2\2\u0920\u0921\7\64\2\2\u0921\u0923\5"+
		"\u00a6T\2\u0922\u0920\3\2\2\2\u0922\u0923\3\2\2\2\u0923\u0924\3\2\2\2"+
		"\u0924\u0925\7\65\2\2\u0925\u09c7\3\2\2\2\u0926\u0927\7\61\2\2\u0927\u0929"+
		"\5\u00a6T\2\u0928\u092a\5\u00ccg\2\u0929\u0928\3\2\2\2\u092a\u092b\3\2"+
		"\2\2\u092b\u0929\3\2\2\2\u092b\u092c\3\2\2\2\u092c\u092f\3\2\2\2\u092d"+
		"\u092e\7\64\2\2\u092e\u0930\5\u00a6T\2\u092f\u092d\3\2\2\2\u092f\u0930"+
		"\3\2\2\2\u0930\u0931\3\2\2\2\u0931\u0932\7\65\2\2\u0932\u09c7\3\2\2\2"+
		"\u0933\u0934\7_\2\2\u0934\u0935\7\3\2\2\u0935\u0936\5\u00a6T\2\u0936\u0937"+
		"\7\20\2\2\u0937\u0938\5\u00c2b\2\u0938\u0939\7\4\2\2\u0939\u09c7\3\2\2"+
		"\2\u093a\u093b\7t\2\2\u093b\u0944\7\3\2\2\u093c\u0941\5\u00a2R\2\u093d"+
		"\u093e\7\5\2\2\u093e\u0940\5\u00a2R\2\u093f\u093d\3\2\2\2\u0940\u0943"+
		"\3\2\2\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2\2\2\u0942\u0945\3\2\2\2\u0943"+
		"\u0941\3\2\2\2\u0944\u093c\3\2\2\2\u0944\u0945\3\2\2\2\u0945\u0946\3\2"+
		"\2\2\u0946\u09c7\7\4\2\2\u0947\u0948\7K\2\2\u0948\u0949\7\3\2\2\u0949"+
		"\u094c\5\u00a6T\2\u094a\u094b\7\u0081\2\2\u094b\u094d\7,\2\2\u094c\u094a"+
		"\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\7\4\2\2\u094f"+
		"\u09c7\3\2\2\2\u0950\u0951\7M\2\2\u0951\u0952\7\3\2\2\u0952\u0955\5\u00a6"+
		"T\2\u0953\u0954\7\u0081\2\2\u0954\u0956\7,\2\2\u0955\u0953\3\2\2\2\u0955"+
		"\u0956\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\7\4\2\2\u0958\u09c7\3\2"+
		"\2\2\u0959\u095a\7\u0095\2\2\u095a\u095b\7\3\2\2\u095b\u095c\5\u00acW"+
		"\2\u095c\u095d\7!\2\2\u095d\u095e\5\u00acW\2\u095e\u095f\7\4\2\2\u095f"+
		"\u09c7\3\2\2\2\u0960\u09c7\5\u00b0Y\2\u0961\u09c7\7\u00a1\2\2\u0962\u0963"+
		"\5\u00d8m\2\u0963\u0964\7\6\2\2\u0964\u0965\7\u00a1\2\2\u0965\u09c7\3"+
		"\2\2\2\u0966\u0967\7\3\2\2\u0967\u096a\5\u00a2R\2\u0968\u0969\7\5\2\2"+
		"\u0969\u096b\5\u00a2R\2\u096a\u0968\3\2\2\2\u096b\u096c\3\2\2\2\u096c"+
		"\u096a\3\2\2\2\u096c\u096d\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\7\4"+
		"\2\2\u096f\u09c7\3\2\2\2\u0970\u0971\7\3\2\2\u0971\u0972\5(\25\2\u0972"+
		"\u0973\7\4\2\2\u0973\u09c7\3\2\2\2\u0974\u0975\5\u00d8m\2\u0975\u0981"+
		"\7\3\2\2\u0976\u0978\5z>\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978"+
		"\u0979\3\2\2\2\u0979\u097e\5\u00a6T\2\u097a\u097b\7\5\2\2\u097b\u097d"+
		"\5\u00a6T\2\u097c\u097a\3\2\2\2\u097d\u0980\3\2\2\2\u097e\u097c\3\2\2"+
		"\2\u097e\u097f\3\2\2\2\u097f\u0982\3\2\2\2\u0980\u097e\3\2\2\2\u0981\u0977"+
		"\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0986\7\4\2\2\u0984"+
		"\u0985\7C\2\2\u0985\u0987\5\u00d2j\2\u0986\u0984\3\2\2\2\u0986\u0987\3"+
		"\2\2\2\u0987\u09c7\3\2\2\2\u0988\u0989\7\u0119\2\2\u0989\u098a\7\t\2\2"+
		"\u098a\u09c7\5\u00a6T\2\u098b\u098c\7\3\2\2\u098c\u098f\7\u0119\2\2\u098d"+
		"\u098e\7\5\2\2\u098e\u0990\7\u0119\2\2\u098f\u098d\3\2\2\2\u0990\u0991"+
		"\3\2\2\2\u0991\u098f\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993\3\2\2\2\u0993"+
		"\u0994\7\4\2\2\u0994\u0995\7\t\2\2\u0995\u09c7\5\u00a6T\2\u0996\u09c7"+
		"\5\u00dan\2\u0997\u0998\7\3\2\2\u0998\u0999\5\u00a6T\2\u0999\u099a\7\4"+
		"\2\2\u099a\u09c7\3\2\2\2\u099b\u099c\7\u0096\2\2\u099c\u099d\7\3\2\2\u099d"+
		"\u099e\5\u00dan\2\u099e\u099f\7\16\2\2\u099f\u09a0\5\u00acW\2\u09a0\u09a1"+
		"\7\4\2\2\u09a1\u09c7\3\2\2\2\u09a2\u09a3\t\26\2\2\u09a3\u09a4\7\3\2\2"+
		"\u09a4\u09a5\5\u00acW\2\u09a5\u09a6\t\27\2\2\u09a6\u09a9\5\u00acW\2\u09a7"+
		"\u09a8\t\30\2\2\u09a8\u09aa\5\u00acW\2\u09a9\u09a7\3\2\2\2\u09a9\u09aa"+
		"\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\7\4\2\2\u09ac\u09c7\3\2\2\2\u09ad"+
		"\u09ae\7\u00b2\2\2\u09ae\u09b0\7\3\2\2\u09af\u09b1\t\31\2\2\u09b0\u09af"+
		"\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b3\3\2\2\2\u09b2\u09b4\5\u00acW"+
		"\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6"+
		"\7\16\2\2\u09b6\u09b7\5\u00acW\2\u09b7\u09b8\7\4\2\2\u09b8\u09c7\3\2\2"+
		"\2\u09b9\u09ba\7\u00b3\2\2\u09ba\u09bb\7\3\2\2\u09bb\u09bc\5\u00acW\2"+
		"\u09bc\u09bd\7\u00b4\2\2\u09bd\u09be\5\u00acW\2\u09be\u09bf\7\16\2\2\u09bf"+
		"\u09c2\5\u00acW\2\u09c0\u09c1\7/\2\2\u09c1\u09c3\5\u00acW\2\u09c2\u09c0"+
		"\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7\4\2\2\u09c5"+
		"\u09c7\3\2\2\2\u09c6\u0919\3\2\2\2\u09c6\u0926\3\2\2\2\u09c6\u0933\3\2"+
		"\2\2\u09c6\u093a\3\2\2\2\u09c6\u0947\3\2\2\2\u09c6\u0950\3\2\2\2\u09c6"+
		"\u0959\3\2\2\2\u09c6\u0960\3\2\2\2\u09c6\u0961\3\2\2\2\u09c6\u0962\3\2"+
		"\2\2\u09c6\u0966\3\2\2\2\u09c6\u0970\3\2\2\2\u09c6\u0974\3\2\2\2\u09c6"+
		"\u0988\3\2\2\2\u09c6\u098b\3\2\2\2\u09c6\u0996\3\2\2\2\u09c6\u0997\3\2"+
		"\2\2\u09c6\u099b\3\2\2\2\u09c6\u09a2\3\2\2\2\u09c6\u09ad\3\2\2\2\u09c6"+
		"\u09b9\3\2\2\2\u09c7\u09d2\3\2\2\2\u09c8\u09c9\f\n\2\2\u09c9\u09ca\7\n"+
		"\2\2\u09ca\u09cb\5\u00acW\2\u09cb\u09cc\7\13\2\2\u09cc\u09d1\3\2\2\2\u09cd"+
		"\u09ce\f\b\2\2\u09ce\u09cf\7\6\2\2\u09cf\u09d1\5\u00dan\2\u09d0\u09c8"+
		"\3\2\2\2\u09d0\u09cd\3\2\2\2\u09d1\u09d4\3\2\2\2\u09d2\u09d0\3\2\2\2\u09d2"+
		"\u09d3\3\2\2\2\u09d3\u00af\3\2\2\2\u09d4\u09d2\3\2\2\2\u09d5\u09e2\7)"+
		"\2\2\u09d6\u09e2\5\u00ba^\2\u09d7\u09d8\5\u00dan\2\u09d8\u09d9\7\u0111"+
		"\2\2\u09d9\u09e2\3\2\2\2\u09da\u09e2\5\u00e0q\2\u09db\u09e2\5\u00b8]\2"+
		"\u09dc\u09de\7\u0111\2\2\u09dd\u09dc\3\2\2\2\u09de\u09df\3\2\2\2\u09df"+
		"\u09dd\3\2\2\2\u09df\u09e0\3\2\2\2\u09e0\u09e2\3\2\2\2\u09e1\u09d5\3\2"+
		"\2\2\u09e1\u09d6\3\2\2\2\u09e1\u09d7\3\2\2\2\u09e1\u09da\3\2\2\2\u09e1"+
		"\u09db\3\2\2\2\u09e1\u09dd\3\2\2\2\u09e2\u00b1\3\2\2\2\u09e3\u09e4\t\32"+
		"\2\2\u09e4\u00b3\3\2\2\2\u09e5\u09e6\t\33\2\2\u09e6\u00b5\3\2\2\2\u09e7"+
		"\u09e8\t\34\2\2\u09e8\u00b7\3\2\2\2\u09e9\u09ea\t\35\2\2\u09ea\u00b9\3"+
		"\2\2\2\u09eb\u09ef\7\60\2\2\u09ec\u09ee\5\u00bc_\2\u09ed\u09ec\3\2\2\2"+
		"\u09ee\u09f1\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u00bb"+
		"\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f2\u09f3\5\u00be`\2\u09f3\u09f6\5\u00da"+
		"n\2\u09f4\u09f5\7m\2\2\u09f5\u09f7\5\u00dan\2\u09f6\u09f4\3\2\2\2\u09f6"+
		"\u09f7\3\2\2\2\u09f7\u00bd\3\2\2\2\u09f8\u09fa\t\36\2\2\u09f9\u09f8\3"+
		"\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u09fe\t\20\2\2\u09fc"+
		"\u09fe\7\u0111\2\2\u09fd\u09f9\3\2\2\2\u09fd\u09fc\3\2\2\2\u09fe\u00bf"+
		"\3\2\2\2\u09ff\u0a03\7K\2\2\u0a00\u0a01\7L\2\2\u0a01\u0a03\5\u00dan\2"+
		"\u0a02\u09ff\3\2\2\2\u0a02\u0a00\3\2\2\2\u0a03\u00c1\3\2\2\2\u0a04\u0a05"+
		"\7r\2\2\u0a05\u0a06\7\u009b\2\2\u0a06\u0a07\5\u00c2b\2\u0a07\u0a08\7\u009d"+
		"\2\2\u0a08\u0a27\3\2\2\2\u0a09\u0a0a\7s\2\2\u0a0a\u0a0b\7\u009b\2\2\u0a0b"+
		"\u0a0c\5\u00c2b\2\u0a0c\u0a0d\7\5\2\2\u0a0d\u0a0e\5\u00c2b\2\u0a0e\u0a0f"+
		"\7\u009d\2\2\u0a0f\u0a27\3\2\2\2\u0a10\u0a17\7t\2\2\u0a11\u0a13\7\u009b"+
		"\2\2\u0a12\u0a14\5\u00c8e\2\u0a13\u0a12\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14"+
		"\u0a15\3\2\2\2\u0a15\u0a18\7\u009d\2\2\u0a16\u0a18\7\u0099\2\2\u0a17\u0a11"+
		"\3\2\2\2\u0a17\u0a16\3\2\2\2\u0a18\u0a27\3\2\2\2\u0a19\u0a24\5\u00dan"+
		"\2\u0a1a\u0a1b\7\3\2\2\u0a1b\u0a20\7\u0115\2\2\u0a1c\u0a1d\7\5\2\2\u0a1d"+
		"\u0a1f\7\u0115\2\2\u0a1e\u0a1c\3\2\2\2\u0a1f\u0a22\3\2\2\2\u0a20\u0a1e"+
		"\3\2\2\2\u0a20\u0a21\3\2\2\2\u0a21\u0a23\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a23"+
		"\u0a25\7\4\2\2\u0a24\u0a1a\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a27\3\2"+
		"\2\2\u0a26\u0a04\3\2\2\2\u0a26\u0a09\3\2\2\2\u0a26\u0a10\3\2\2\2\u0a26"+
		"\u0a19\3\2\2\2\u0a27\u00c3\3\2\2\2\u0a28\u0a2d\5\u00c6d\2\u0a29\u0a2a"+
		"\7\5\2\2\u0a2a\u0a2c\5\u00c6d\2\u0a2b\u0a29\3\2\2\2\u0a2c\u0a2f\3\2\2"+
		"\2\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u00c5\3\2\2\2\u0a2f\u0a2d"+
		"\3\2\2\2\u0a30\u0a31\5\u00dan\2\u0a31\u0a34\5\u00c2b\2\u0a32\u0a33\7w"+
		"\2\2\u0a33\u0a35\7\u0111\2\2\u0a34\u0a32\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35"+
		"\u00c7\3\2\2\2\u0a36\u0a3b\5\u00caf\2\u0a37\u0a38\7\5\2\2\u0a38\u0a3a"+
		"\5\u00caf\2\u0a39\u0a37\3\2\2\2\u0a3a\u0a3d\3\2\2\2\u0a3b\u0a39\3\2\2"+
		"\2\u0a3b\u0a3c\3\2\2\2\u0a3c\u00c9\3\2\2\2\u0a3d\u0a3b\3\2\2\2\u0a3e\u0a3f"+
		"\5\u00dan\2\u0a3f\u0a40\7\f\2\2\u0a40\u0a43\5\u00c2b\2\u0a41\u0a42\7w"+
		"\2\2\u0a42\u0a44\7\u0111\2\2\u0a43\u0a41\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44"+
		"\u00cb\3\2\2\2\u0a45\u0a46\7\62\2\2\u0a46\u0a47\5\u00a6T\2\u0a47\u0a48"+
		"\7\63\2\2\u0a48\u0a49\5\u00a6T\2\u0a49\u00cd\3\2\2\2\u0a4a\u0a4b\7B\2"+
		"\2\u0a4b\u0a50\5\u00d0i\2\u0a4c\u0a4d\7\5\2\2\u0a4d\u0a4f\5\u00d0i\2\u0a4e"+
		"\u0a4c\3\2\2\2\u0a4f\u0a52\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2"+
		"\2\2\u0a51\u00cf\3\2\2\2\u0a52\u0a50\3\2\2\2\u0a53\u0a54\5\u00dan\2\u0a54"+
		"\u0a55\7\20\2\2\u0a55\u0a56\5\u00d2j\2\u0a56\u00d1\3\2\2\2\u0a57\u0a82"+
		"\5\u00dan\2\u0a58\u0a7b\7\3\2\2\u0a59\u0a5a\7\u00b0\2\2\u0a5a\u0a5b\7"+
		"\26\2\2\u0a5b\u0a60\5\u00a6T\2\u0a5c\u0a5d\7\5\2\2\u0a5d\u0a5f\5\u00a6"+
		"T\2\u0a5e\u0a5c\3\2\2\2\u0a5f\u0a62\3\2\2\2\u0a60\u0a5e\3\2\2\2\u0a60"+
		"\u0a61\3\2\2\2\u0a61\u0a7c\3\2\2\2\u0a62\u0a60\3\2\2\2\u0a63\u0a64\t\37"+
		"\2\2\u0a64\u0a65\7\26\2\2\u0a65\u0a6a\5\u00a6T\2\u0a66\u0a67\7\5\2\2\u0a67"+
		"\u0a69\5\u00a6T\2\u0a68\u0a66\3\2\2\2\u0a69\u0a6c\3\2\2\2\u0a6a\u0a68"+
		"\3\2\2\2\u0a6a\u0a6b\3\2\2\2\u0a6b\u0a6e\3\2\2\2\u0a6c\u0a6a\3\2\2\2\u0a6d"+
		"\u0a63\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a79\3\2\2\2\u0a6f\u0a70\t "+
		"\2\2\u0a70\u0a71\7\26\2\2\u0a71\u0a76\5d\63\2\u0a72\u0a73\7\5\2\2\u0a73"+
		"\u0a75\5d\63\2\u0a74\u0a72\3\2\2\2\u0a75\u0a78\3\2\2\2\u0a76\u0a74\3\2"+
		"\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a7a\3\2\2\2\u0a78\u0a76\3\2\2\2\u0a79"+
		"\u0a6f\3\2\2\2\u0a79\u0a7a\3\2\2\2\u0a7a\u0a7c\3\2\2\2\u0a7b\u0a59\3\2"+
		"\2\2\u0a7b\u0a6d\3\2\2\2\u0a7c\u0a7e\3\2\2\2\u0a7d\u0a7f\5\u00d4k\2\u0a7e"+
		"\u0a7d\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f\u0a80\3\2\2\2\u0a80\u0a82\7\4"+
		"\2\2\u0a81\u0a57\3\2\2\2\u0a81\u0a58\3\2\2\2\u0a82\u00d3\3\2\2\2\u0a83"+
		"\u0a84\7E\2\2\u0a84\u0a94\5\u00d6l\2\u0a85\u0a86\7F\2\2\u0a86\u0a94\5"+
		"\u00d6l\2\u0a87\u0a88\7E\2\2\u0a88\u0a89\7%\2\2\u0a89\u0a8a\5\u00d6l\2"+
		"\u0a8a\u0a8b\7 \2\2\u0a8b\u0a8c\5\u00d6l\2\u0a8c\u0a94\3\2\2\2\u0a8d\u0a8e"+
		"\7F\2\2\u0a8e\u0a8f\7%\2\2\u0a8f\u0a90\5\u00d6l\2\u0a90\u0a91\7 \2\2\u0a91"+
		"\u0a92\5\u00d6l\2\u0a92\u0a94\3\2\2\2\u0a93\u0a83\3\2\2\2\u0a93\u0a85"+
		"\3\2\2\2\u0a93\u0a87\3\2\2\2\u0a93\u0a8d\3\2\2\2\u0a94\u00d5\3\2\2\2\u0a95"+
		"\u0a96\7G\2\2\u0a96\u0a9d\t!\2\2\u0a97\u0a98\7J\2\2\u0a98\u0a9d\7N\2\2"+
		"\u0a99\u0a9a\5\u00a6T\2\u0a9a\u0a9b\t!\2\2\u0a9b\u0a9d\3\2\2\2\u0a9c\u0a95"+
		"\3\2\2\2\u0a9c\u0a97\3\2\2\2\u0a9c\u0a99\3\2\2\2\u0a9d\u00d7\3\2\2\2\u0a9e"+
		"\u0aa3\5\u00dan\2\u0a9f\u0aa0\7\6\2\2\u0aa0\u0aa2\5\u00dan\2\u0aa1\u0a9f"+
		"\3\2\2\2\u0aa2\u0aa5\3\2\2\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4"+
		"\u00d9\3\2\2\2\u0aa5\u0aa3\3\2\2\2\u0aa6\u0ab6\5\u00dco\2\u0aa7\u0ab6"+
		"\7\u0107\2\2\u0aa8\u0ab6\7=\2\2\u0aa9\u0ab6\79\2\2\u0aaa\u0ab6\7:\2\2"+
		"\u0aab\u0ab6\7;\2\2\u0aac\u0ab6\7<\2\2\u0aad\u0ab6\7>\2\2\u0aae\u0ab6"+
		"\7\66\2\2\u0aaf\u0ab6\7\67\2\2\u0ab0\u0ab6\7?\2\2\u0ab1\u0ab6\7i\2\2\u0ab2"+
		"\u0ab6\7l\2\2\u0ab3\u0ab6\7j\2\2\u0ab4\u0ab6\7k\2\2\u0ab5\u0aa6\3\2\2"+
		"\2\u0ab5\u0aa7\3\2\2\2\u0ab5\u0aa8\3\2\2\2\u0ab5\u0aa9\3\2\2\2\u0ab5\u0aaa"+
		"\3\2\2\2\u0ab5\u0aab\3\2\2\2\u0ab5\u0aac\3\2\2\2\u0ab5\u0aad\3\2\2\2\u0ab5"+
		"\u0aae\3\2\2\2\u0ab5\u0aaf\3\2\2\2\u0ab5\u0ab0\3\2\2\2\u0ab5\u0ab1\3\2"+
		"\2\2\u0ab5\u0ab2\3\2\2\2\u0ab5\u0ab3\3\2\2\2\u0ab5\u0ab4\3\2\2\2\u0ab6"+
		"\u00db\3\2\2\2\u0ab7\u0abb\7\u0119\2\2\u0ab8\u0abb\5\u00dep\2\u0ab9\u0abb"+
		"\5\u00e2r\2\u0aba\u0ab7\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba\u0ab9\3\2\2"+
		"\2\u0abb\u00dd\3\2\2\2\u0abc\u0abd\7\u011a\2\2\u0abd\u00df\3\2\2\2\u0abe"+
		"\u0ac0\7\u00a0\2\2\u0abf\u0abe\3\2\2\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1"+
		"\3\2\2\2\u0ac1\u0adb\7\u0116\2\2\u0ac2\u0ac4\7\u00a0\2\2\u0ac3\u0ac2\3"+
		"\2\2\2\u0ac3\u0ac4\3\2\2\2\u0ac4\u0ac5\3\2\2\2\u0ac5\u0adb\7\u0115\2\2"+
		"\u0ac6\u0ac8\7\u00a0\2\2\u0ac7\u0ac6\3\2\2\2\u0ac7\u0ac8\3\2\2\2\u0ac8"+
		"\u0ac9\3\2\2\2\u0ac9\u0adb\7\u0112\2\2\u0aca\u0acc\7\u00a0\2\2\u0acb\u0aca"+
		"\3\2\2\2\u0acb\u0acc\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0adb\7\u0113\2"+
		"\2\u0ace\u0ad0\7\u00a0\2\2\u0acf\u0ace\3\2\2\2\u0acf\u0ad0\3\2\2\2\u0ad0"+
		"\u0ad1\3\2\2\2\u0ad1\u0adb\7\u0114\2\2\u0ad2\u0ad4\7\u00a0\2\2\u0ad3\u0ad2"+
		"\3\2\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0ad5\3\2\2\2\u0ad5\u0adb\7\u0117\2"+
		"\2\u0ad6\u0ad8\7\u00a0\2\2\u0ad7\u0ad6\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8"+
		"\u0ad9\3\2\2\2\u0ad9\u0adb\7\u0118\2\2\u0ada\u0abf\3\2\2\2\u0ada\u0ac3"+
		"\3\2\2\2\u0ada\u0ac7\3\2\2\2\u0ada\u0acb\3\2\2\2\u0ada\u0acf\3\2\2\2\u0ada"+
		"\u0ad3\3\2\2\2\u0ada\u0ad7\3\2\2\2\u0adb\u00e1\3\2\2\2\u0adc\u0add\t\""+
		"\2\2\u0add\u00e3\3\2\2\2\u0174\u00fe\u0103\u0106\u010b\u0118\u011c\u0123"+
		"\u0131\u0133\u0138\u013b\u013e\u0145\u0152\u015b\u015d\u0162\u0165\u0168"+
		"\u016f\u0175\u017b\u0183\u01a3\u01ab\u01af\u01b4\u01ba\u01c2\u01c8\u01d5"+
		"\u01da\u01e3\u01e8\u01f8\u01ff\u0203\u020b\u0212\u0219\u0228\u022c\u0232"+
		"\u0238\u023b\u023e\u0244\u0248\u024c\u0251\u0255\u025d\u0260\u0269\u026e"+
		"\u0274\u027b\u027e\u0284\u028f\u0292\u0296\u029b\u02a0\u02a7\u02aa\u02ad"+
		"\u02b4\u02b9\u02be\u02c1\u02ca\u02d2\u02d8\u02dc\u02e0\u02e4\u02e6\u02ef"+
		"\u02f5\u0300\u0304\u0307\u030b\u030e\u0318\u031b\u031f\u0324\u0327\u032d"+
		"\u0335\u033a\u0340\u0346\u0351\u0359\u0360\u0368\u036f\u0372\u037c\u0382"+
		"\u038d\u0390\u0396\u039b\u03a1\u03a4\u03aa\u03ad\u03b3\u03b8\u03c0\u03c8"+
		"\u03d0\u03d4\u03e0\u03e5\u03ea\u03f0\u03fd\u0400\u0406\u0409\u0414\u0421"+
		"\u042d\u0434\u0444\u044c\u0450\u0457\u04cb\u04d3\u04db\u04e4\u04ee\u04f2"+
		"\u04f5\u04fb\u0505\u0511\u0516\u051c\u0528\u052a\u052f\u0533\u0538\u053d"+
		"\u0540\u0545\u0549\u054e\u0550\u0558\u0564\u056e\u0574\u057d\u0585\u058c"+
		"\u0593\u059c\u05a1\u05b0\u05b7\u05ba\u05c1\u05c5\u05cb\u05d3\u05de\u05e9"+
		"\u05f0\u05f6\u05fc\u0605\u0607\u0610\u0613\u061c\u061f\u0628\u062b\u0634"+
		"\u0637\u063a\u063f\u0641\u0644\u0650\u0657\u065e\u0661\u0663\u066e\u0672"+
		"\u0676\u0682\u0685\u0689\u0693\u0697\u0699\u069c\u06a0\u06a3\u06a7\u06ad"+
		"\u06b1\u06b5\u06ba\u06bd\u06bf\u06c4\u06c9\u06cc\u06d0\u06d3\u06d5\u06da"+
		"\u06df\u06ec\u06f1\u06f9\u06ff\u0703\u070c\u071b\u0720\u072c\u0731\u0739"+
		"\u073c\u0740\u074e\u075b\u0760\u0764\u0767\u076c\u0775\u0778\u077d\u0784"+
		"\u0787\u078f\u0796\u079d\u07a0\u07a5\u07ab\u07af\u07b2\u07b5\u07c0\u07c5"+
		"\u07ca\u07cf\u07e1\u07e3\u07e6\u07f1\u07fa\u0801\u0809\u0811\u0815\u081d"+
		"\u0825\u082b\u0833\u083f\u0842\u0848\u084c\u084e\u0857\u0863\u0865\u086c"+
		"\u0873\u0879\u087f\u0881\u0886\u088b\u088e\u0893\u0899\u089d\u089f\u08a6"+
		"\u08b5\u08b7\u08bf\u08c1\u08c5\u08cd\u08d6\u08dc\u08e4\u08ea\u08ef\u08f4"+
		"\u08f9\u08ff\u0914\u0916\u091e\u0922\u092b\u092f\u0941\u0944\u094c\u0955"+
		"\u096c\u0977\u097e\u0981\u0986\u0991\u09a9\u09b0\u09b3\u09c2\u09c6\u09d0"+
		"\u09d2\u09df\u09e1\u09ef\u09f6\u09f9\u09fd\u0a02\u0a13\u0a17\u0a20\u0a24"+
		"\u0a26\u0a2d\u0a34\u0a3b\u0a43\u0a50\u0a60\u0a6a\u0a6d\u0a76\u0a79\u0a7b"+
		"\u0a7e\u0a81\u0a93\u0a9c\u0aa3\u0ab5\u0aba\u0abf\u0ac3\u0ac7\u0acb\u0acf"+
		"\u0ad3\u0ad7\u0ada";
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