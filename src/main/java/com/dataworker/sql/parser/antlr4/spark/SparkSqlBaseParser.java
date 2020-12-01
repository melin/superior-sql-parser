// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.7.1
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
public class SparkSqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ADD=12, AFTER=13, ALL=14, ALTER=15, ANALYZE=16, AND=17, 
		ANTI=18, ANY=19, ARCHIVE=20, ARRAY=21, AS=22, ASC=23, AT=24, AUTHORIZATION=25, 
		BETWEEN=26, BOTH=27, BUCKET=28, BUCKETS=29, BY=30, CACHE=31, CASCADE=32, 
		CASE=33, CAST=34, CHANGE=35, CHECK=36, CLEAR=37, CLUSTER=38, CLUSTERED=39, 
		CODEGEN=40, COLLATE=41, COLLECTION=42, COLUMN=43, COLUMNS=44, COMMENT=45, 
		COMMIT=46, COMPACT=47, COMPACTIONS=48, COMPUTE=49, CONCATENATE=50, CONSTRAINT=51, 
		CONVERT=52, COST=53, CREATE=54, CROSS=55, CUBE=56, CURRENT=57, CURRENT_DATE=58, 
		CURRENT_TIME=59, CURRENT_TIMESTAMP=60, CURRENT_USER=61, DATA=62, DATABASE=63, 
		DATABASES=64, DAY=65, DBPROPERTIES=66, DEFINED=67, DELETE=68, DELIMITED=69, 
		DELTA=70, DESC=71, DESCRIBE=72, DETAIL=73, DFS=74, DIRECTORIES=75, DIRECTORY=76, 
		DISTINCT=77, DISTRIBUTE=78, DROP=79, DRY=80, ELSE=81, END=82, ESCAPE=83, 
		ESCAPED=84, EXCEPT=85, EXCHANGE=86, EXISTS=87, EXPLAIN=88, EXPORT=89, 
		EXTENDED=90, EXTERNAL=91, EXTRACT=92, FALSE=93, FETCH=94, FIELDS=95, FILTER=96, 
		FILEFORMAT=97, FIRST=98, FOLLOWING=99, FOR=100, FOREIGN=101, FORMAT=102, 
		FORMATTED=103, FROM=104, FULL=105, FUNCTION=106, FUNCTIONS=107, GLOBAL=108, 
		GRANT=109, GROUP=110, GROUPING=111, HAVING=112, HOUR=113, HOURS=114, HISTORY=115, 
		IF=116, IGNORE=117, IMPORT=118, IN=119, INDEX=120, INDEXES=121, INNER=122, 
		INPATH=123, INPUTFORMAT=124, INSERT=125, INTERSECT=126, INTERVAL=127, 
		INTO=128, IS=129, ITEMS=130, JOIN=131, KEYS=132, LAST=133, LATERAL=134, 
		LAZY=135, LEADING=136, LEFT=137, LIKE=138, LIMIT=139, LINES=140, LIST=141, 
		LIFECYCLE=142, LOAD=143, LOCAL=144, LOCATION=145, LOCK=146, LOCKS=147, 
		LOGICAL=148, MACRO=149, MAP=150, MATCHED=151, MERGE=152, MINUTE=153, MONTH=154, 
		MSCK=155, NAMESPACE=156, NAMESPACES=157, NATURAL=158, NO=159, NOT=160, 
		NULL=161, NULLS=162, OF=163, ON=164, ONLY=165, OPTION=166, OPTIONS=167, 
		OR=168, ORDER=169, OUT=170, OUTER=171, OUTPUTFORMAT=172, OVER=173, OVERLAPS=174, 
		OVERLAY=175, OVERWRITE=176, PARTITION=177, PARTITIONED=178, PARTITIONS=179, 
		PARQUET=180, PERCENTLIT=181, PIVOT=182, PLACING=183, POSITION=184, PRECEDING=185, 
		PRIMARY=186, PRINCIPALS=187, PROPERTIES=188, PURGE=189, QUERY=190, RANGE=191, 
		RECORDREADER=192, RECORDWRITER=193, RECOVER=194, REDUCE=195, REFERENCES=196, 
		REFRESH=197, RENAME=198, REPAIR=199, REPLACE=200, RESET=201, RESTRICT=202, 
		REVOKE=203, RETAIN=204, RIGHT=205, RLIKE=206, ROLE=207, ROLES=208, ROLLBACK=209, 
		ROLLUP=210, ROW=211, ROWS=212, RUN=213, SCHEMA=214, SECOND=215, SELECT=216, 
		SEMI=217, SEPARATED=218, SERDE=219, SERDEPROPERTIES=220, SESSION_USER=221, 
		SET=222, SETMINUS=223, SETS=224, SHOW=225, SKEWED=226, SOME=227, SORT=228, 
		SORTED=229, START=230, STATISTICS=231, STORED=232, STRATIFY=233, STRUCT=234, 
		SUBSTR=235, SUBSTRING=236, TABLE=237, TABLES=238, TABLESAMPLE=239, TBLPROPERTIES=240, 
		TEMPORARY=241, TERMINATED=242, THEN=243, TO=244, TOUCH=245, TRAILING=246, 
		TRANSACTION=247, TRANSACTIONS=248, TRANSFORM=249, TRIM=250, TRUE=251, 
		TRUNCATE=252, TYPE=253, UNARCHIVE=254, UNBOUNDED=255, UNCACHE=256, UNION=257, 
		UNIQUE=258, UNKNOWN=259, UNLOCK=260, UNSET=261, UPDATE=262, USE=263, USER=264, 
		USING=265, VALUES=266, VACUUM=267, VIEW=268, VIEWS=269, WHEN=270, WHERE=271, 
		WINDOW=272, WITH=273, YEAR=274, KILL=275, READ=276, JOB=277, ADDJAR=278, 
		COMPRESS=279, FILE=280, DISTCP=281, CLICKHOUSE=282, EQ=283, NSEQ=284, 
		NEQ=285, NEQJ=286, LT=287, LTE=288, GT=289, GTE=290, PLUS=291, MINUS=292, 
		ASTERISK=293, SLASH=294, PERCENT=295, DIV=296, TILDE=297, AMPERSAND=298, 
		PIPE=299, CONCAT_PIPE=300, HAT=301, STRING=302, BIGINT_LITERAL=303, SMALLINT_LITERAL=304, 
		TINYINT_LITERAL=305, INTEGER_VALUE=306, EXPONENT_VALUE=307, DECIMAL_VALUE=308, 
		DOUBLE_LITERAL=309, BIGDECIMAL_LITERAL=310, IDENTIFIER=311, BACKQUOTED_IDENTIFIER=312, 
		SIMPLE_COMMENT=313, BRACKETED_EMPTY_COMMENT=314, BRACKETED_COMMENT=315, 
		WS=316, UNRECOGNIZED=317;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_dataSource = 8, RULE_unsupportedHiveNativeCommands = 9, RULE_createTableHeader = 10, 
		RULE_replaceTableHeader = 11, RULE_bucketSpec = 12, RULE_skewSpec = 13, 
		RULE_locationSpec = 14, RULE_commentSpec = 15, RULE_query = 16, RULE_insertInto = 17, 
		RULE_partitionSpecLocation = 18, RULE_partitionSpec = 19, RULE_partitionVal = 20, 
		RULE_namespace = 21, RULE_describeFuncName = 22, RULE_describeColName = 23, 
		RULE_ctes = 24, RULE_namedQuery = 25, RULE_tableProvider = 26, RULE_createTableClauses = 27, 
		RULE_tablePropertyList = 28, RULE_tableProperty = 29, RULE_tablePropertyKey = 30, 
		RULE_tablePropertyValue = 31, RULE_constantList = 32, RULE_nestedConstantList = 33, 
		RULE_createFileFormat = 34, RULE_fileFormat = 35, RULE_storageHandler = 36, 
		RULE_resource = 37, RULE_dmlStatementNoWith = 38, RULE_queryOrganization = 39, 
		RULE_multiInsertQueryBody = 40, RULE_queryTerm = 41, RULE_queryPrimary = 42, 
		RULE_sortItem = 43, RULE_fromStatement = 44, RULE_fromStatementBody = 45, 
		RULE_querySpecification = 46, RULE_transformClause = 47, RULE_selectClause = 48, 
		RULE_setClause = 49, RULE_matchedClause = 50, RULE_notMatchedClause = 51, 
		RULE_matchedAction = 52, RULE_notMatchedAction = 53, RULE_assignmentList = 54, 
		RULE_assignment = 55, RULE_whereClause = 56, RULE_havingClause = 57, RULE_hint = 58, 
		RULE_hintStatement = 59, RULE_fromClause = 60, RULE_aggregationClause = 61, 
		RULE_groupingSet = 62, RULE_pivotClause = 63, RULE_pivotColumn = 64, RULE_pivotValue = 65, 
		RULE_lateralView = 66, RULE_setQuantifier = 67, RULE_relation = 68, RULE_joinRelation = 69, 
		RULE_joinType = 70, RULE_joinCriteria = 71, RULE_sample = 72, RULE_sampleMethod = 73, 
		RULE_identifierList = 74, RULE_identifierSeq = 75, RULE_orderedIdentifierList = 76, 
		RULE_orderedIdentifier = 77, RULE_identifierCommentList = 78, RULE_identifierComment = 79, 
		RULE_relationPrimary = 80, RULE_inlineTable = 81, RULE_functionTable = 82, 
		RULE_tableAlias = 83, RULE_rowFormat = 84, RULE_multipartIdentifierList = 85, 
		RULE_multipartIdentifier = 86, RULE_tableIdentifier = 87, RULE_functionIdentifier = 88, 
		RULE_namedExpression = 89, RULE_namedExpressionSeq = 90, RULE_transformList = 91, 
		RULE_transform = 92, RULE_transformArgument = 93, RULE_expression = 94, 
		RULE_booleanExpression = 95, RULE_predicate = 96, RULE_valueExpression = 97, 
		RULE_primaryExpression = 98, RULE_constant = 99, RULE_comparisonOperator = 100, 
		RULE_arithmeticOperator = 101, RULE_predicateOperator = 102, RULE_booleanValue = 103, 
		RULE_interval = 104, RULE_errorCapturingMultiUnitsInterval = 105, RULE_multiUnitsInterval = 106, 
		RULE_errorCapturingUnitToUnitInterval = 107, RULE_unitToUnitInterval = 108, 
		RULE_intervalValue = 109, RULE_intervalUnit = 110, RULE_colPosition = 111, 
		RULE_dataType = 112, RULE_qualifiedColTypeWithPositionList = 113, RULE_qualifiedColTypeWithPosition = 114, 
		RULE_colTypeList = 115, RULE_colType = 116, RULE_complexColTypeList = 117, 
		RULE_complexColType = 118, RULE_whenClause = 119, RULE_windowClause = 120, 
		RULE_namedWindow = 121, RULE_windowSpec = 122, RULE_windowFrame = 123, 
		RULE_frameBound = 124, RULE_qualifiedNameList = 125, RULE_functionName = 126, 
		RULE_qualifiedName = 127, RULE_errorCapturingIdentifier = 128, RULE_errorCapturingIdentifierExtra = 129, 
		RULE_identifier = 130, RULE_strictIdentifier = 131, RULE_quotedIdentifier = 132, 
		RULE_number = 133, RULE_alterColumnAction = 134, RULE_ansiNonReserved = 135, 
		RULE_strictNonReserved = 136, RULE_nonReserved = 137;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
		"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
		"dataSource", "unsupportedHiveNativeCommands", "createTableHeader", "replaceTableHeader", 
		"bucketSpec", "skewSpec", "locationSpec", "commentSpec", "query", "insertInto", 
		"partitionSpecLocation", "partitionSpec", "partitionVal", "namespace", 
		"describeFuncName", "describeColName", "ctes", "namedQuery", "tableProvider", 
		"createTableClauses", "tablePropertyList", "tableProperty", "tablePropertyKey", 
		"tablePropertyValue", "constantList", "nestedConstantList", "createFileFormat", 
		"fileFormat", "storageHandler", "resource", "dmlStatementNoWith", "queryOrganization", 
		"multiInsertQueryBody", "queryTerm", "queryPrimary", "sortItem", "fromStatement", 
		"fromStatementBody", "querySpecification", "transformClause", "selectClause", 
		"setClause", "matchedClause", "notMatchedClause", "matchedAction", "notMatchedAction", 
		"assignmentList", "assignment", "whereClause", "havingClause", "hint", 
		"hintStatement", "fromClause", "aggregationClause", "groupingSet", "pivotClause", 
		"pivotColumn", "pivotValue", "lateralView", "setQuantifier", "relation", 
		"joinRelation", "joinType", "joinCriteria", "sample", "sampleMethod", 
		"identifierList", "identifierSeq", "orderedIdentifierList", "orderedIdentifier", 
		"identifierCommentList", "identifierComment", "relationPrimary", "inlineTable", 
		"functionTable", "tableAlias", "rowFormat", "multipartIdentifierList", 
		"multipartIdentifier", "tableIdentifier", "functionIdentifier", "namedExpression", 
		"namedExpressionSeq", "transformList", "transform", "transformArgument", 
		"expression", "booleanExpression", "predicate", "valueExpression", "primaryExpression", 
		"constant", "comparisonOperator", "arithmeticOperator", "predicateOperator", 
		"booleanValue", "interval", "errorCapturingMultiUnitsInterval", "multiUnitsInterval", 
		"errorCapturingUnitToUnitInterval", "unitToUnitInterval", "intervalValue", 
		"intervalUnit", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
		"qualifiedColTypeWithPosition", "colTypeList", "colType", "complexColTypeList", 
		"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
		"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
		"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
		"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
		"ansiNonReserved", "strictNonReserved", "nonReserved"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'('", "')'", "','", "'.'", "'/*+'", "'*/'", "'->'", "'['", 
		"']'", "':'", "'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", 
		"'ANTI'", "'ANY'", "'ARCHIVE'", "'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", 
		"'BETWEEN'", "'BOTH'", "'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", 
		"'CASE'", "'CAST'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", "'CLUSTERED'", 
		"'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", "'COLUMNS'", "'COMMENT'", 
		"'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", "'CONCATENATE'", 
		"'CONSTRAINT'", "'CONVERT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", 
		"'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
		"'CURRENT_USER'", "'DATA'", "'DATABASE'", null, "'DAY'", "'DBPROPERTIES'", 
		"'DEFINED'", "'DELETE'", "'DELIMITED'", "'DELTA'", "'DESC'", "'DESCRIBE'", 
		"'DETAIL'", "'DFS'", "'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", 
		"'DROP'", "'DRY'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", 
		"'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", 
		"'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", 
		"'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", 
		"'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", 
		"'GROUP'", "'GROUPING'", "'HAVING'", "'HOUR'", "'HOURS'", "'HISTORY'", 
		"'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", 
		"'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
		"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
		"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
		"'LIFECYCLE'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
		"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MINUTE'", "'MONTH'", 
		"'MSCK'", "'NAMESPACE'", "'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", 
		"'NULLS'", "'OF'", "'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", 
		"'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", 
		"'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", 
		"'PARQUET'", "'PERCENT'", "'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", 
		"'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", 
		"'RECORDREADER'", "'RECORDWRITER'", "'RECOVER'", "'REDUCE'", "'REFERENCES'", 
		"'REFRESH'", "'RENAME'", "'REPAIR'", "'REPLACE'", "'RESET'", "'RESTRICT'", 
		"'REVOKE'", "'RETAIN'", "'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", 
		"'ROLLUP'", "'ROW'", "'ROWS'", "'RUN'", "'SCHEMA'", "'SECOND'", "'SELECT'", 
		"'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", 
		"'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", 
		"'SORTED'", "'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", 
		"'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", 
		null, "'TERMINATED'", "'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", 
		"'TRANSACTIONS'", "'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", 
		"'UNARCHIVE'", "'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", 
		"'UNLOCK'", "'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", 
		"'VACUUM'", "'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
		"'YEAR'", "'KILL'", "'READ'", "'JOB'", "'ADDJAR'", "'COMPRESS'", "'FILE'", 
		"'DISTCP'", "'CLICKHOUSE'", null, "'<=>'", "'<>'", "'!='", "'<'", null, 
		"'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'DIV'", "'~'", "'&'", 
		"'|'", "'||'", "'^'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "'/**/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
		"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
		"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
		"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", "COLUMN", 
		"COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", 
		"CONSTRAINT", "CONVERT", "COST", "CREATE", "CROSS", "CUBE", "CURRENT", 
		"CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", "DATA", 
		"DATABASE", "DATABASES", "DAY", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DELTA", "DESC", "DESCRIBE", "DETAIL", "DFS", "DIRECTORIES", "DIRECTORY", 
		"DISTINCT", "DISTRIBUTE", "DROP", "DRY", "ELSE", "END", "ESCAPE", "ESCAPED", 
		"EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", 
		"EXTRACT", "FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", 
		"FOLLOWING", "FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", 
		"FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", 
		"HOUR", "HOURS", "HISTORY", "IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", 
		"INNER", "INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", 
		"IS", "ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", 
		"LIKE", "LIMIT", "LINES", "LIST", "LIFECYCLE", "LOAD", "LOCAL", "LOCATION", 
		"LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MINUTE", 
		"MONTH", "MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", "NO", "NOT", "NULL", 
		"NULLS", "OF", "ON", "ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", 
		"OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", 
		"PARTITIONED", "PARTITIONS", "PARQUET", "PERCENTLIT", "PIVOT", "PLACING", 
		"POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", 
		"QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", "REDUCE", 
		"REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", "RESTRICT", 
		"REVOKE", "RETAIN", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", 
		"ROW", "ROWS", "RUN", "SCHEMA", "SECOND", "SELECT", "SEMI", "SEPARATED", 
		"SERDE", "SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", 
		"SHOW", "SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
		"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", 
		"TBLPROPERTIES", "TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", 
		"TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", 
		"TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", 
		"UNLOCK", "UNSET", "UPDATE", "USE", "USER", "USING", "VALUES", "VACUUM", 
		"VIEW", "VIEWS", "WHEN", "WHERE", "WINDOW", "WITH", "YEAR", "KILL", "READ", 
		"JOB", "ADDJAR", "COMPRESS", "FILE", "DISTCP", "CLICKHOUSE", "EQ", "NSEQ", 
		"NEQ", "NEQJ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", 
		"SLASH", "PERCENT", "DIV", "TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", 
		"HAT", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", "TINYINT_LITERAL", 
		"INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", "DOUBLE_LITERAL", 
		"BIGDECIMAL_LITERAL", "IDENTIFIER", "BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", 
		"BRACKETED_EMPTY_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When false, CREATE TABLE syntax without a provider will use
	   * the value of spark.sql.sources.default as its provider.
	   */
	  public boolean legacy_create_hive_table_by_default_enabled = false;

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

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			statement();
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(277);
				match(T__0);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
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
			setState(285);
			namedExpression();
			setState(286);
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
			setState(288);
			tableIdentifier();
			setState(289);
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

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SparkSqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			multipartIdentifier();
			setState(292);
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
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			functionIdentifier();
			setState(295);
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
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			dataType();
			setState(298);
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
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			colTypeList();
			setState(301);
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
	public static class DeltaConvertContext extends StatementContext {
		public Token format;
		public MultipartIdentifierContext table;
		public TablePropertyListContext options;
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
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
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropNamespace(this);
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
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
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
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
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
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SparkSqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SparkSqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SparkSqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SparkSqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
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
		public TablePropertyListContext options;
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeTableContext extends StatementContext {
		public TablePropertyListContext options;
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
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
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
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
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
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
	public static class DescribeDeltaDetailContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
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
		public ColTypeListContext partitionColumns;
		public IdentifierListContext partitionColumnNames;
		public Token lifecycle;
		public TablePropertyListContext tableProps;
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<ColTypeListContext> colTypeList() {
			return getRuleContexts(ColTypeListContext.class);
		}
		public ColTypeListContext colTypeList(int i) {
			return getRuleContext(ColTypeListContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SparkSqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SparkSqlBaseParser.BY, i);
		}
		public List<TerminalNode> LIFECYCLE() { return getTokens(SparkSqlBaseParser.LIFECYCLE); }
		public TerminalNode LIFECYCLE(int i) {
			return getToken(SparkSqlBaseParser.LIFECYCLE, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SparkSqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.TBLPROPERTIES, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext ns;
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext srcTable;
		public MultipartIdentifierContext destTable;
		public TablePropertyListContext options;
		public TerminalNode DISTCP() { return getToken(SparkSqlBaseParser.DISTCP, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public DataSourceContext dataSource() {
			return getRuleContext(DataSourceContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public MultipartIdentifierContext table;
		public NumberContext num;
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public TablePropertyListContext tableProps;
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
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeRelation(this);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeDeltaHistoryContext extends StatementContext {
		public MultipartIdentifierContext table;
		public Token limit;
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SparkSqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SparkSqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SparkSqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SparkSqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
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
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SparkSqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SparkSqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SparkSqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SparkSqlBaseParser.WITH, i);
		}
		public List<TablePropertyListContext> tablePropertyList() {
			return getRuleContexts(TablePropertyListContext.class);
		}
		public TablePropertyListContext tablePropertyList(int i) {
			return getRuleContext(TablePropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SparkSqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SparkSqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SparkSqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public TablePropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public TablePropertyListContext options;
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public TablePropertyListContext options;
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportTableContext extends StatementContext {
		public ConstantContext name;
		public TablePropertyListContext options;
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		public TablePropertyListContext options;
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TablePropertyListContext tablePropertyList() {
			return getRuleContext(TablePropertyListContext.class,0);
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
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(304);
					ctes();
					}
				}

				setState(307);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(USE);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(309);
					match(NAMESPACE);
					}
					break;
				}
				setState(312);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(CREATE);
				setState(314);
				namespace();
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(315);
					match(IF);
					setState(316);
					match(NOT);
					setState(317);
					match(EXISTS);
					}
					break;
				}
				setState(320);
				multipartIdentifier();
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(326);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(321);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(322);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(323);
						match(WITH);
						setState(324);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(325);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(ALTER);
				setState(332);
				namespace();
				setState(333);
				multipartIdentifier();
				setState(334);
				match(SET);
				setState(335);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(336);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(ALTER);
				setState(339);
				namespace();
				setState(340);
				multipartIdentifier();
				setState(341);
				match(SET);
				setState(342);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(344);
				match(DROP);
				setState(345);
				namespace();
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(346);
					match(IF);
					setState(347);
					match(EXISTS);
					}
					break;
				}
				setState(350);
				multipartIdentifier();
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(351);
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
			case 8:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				match(SHOW);
				setState(355);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(356);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(357);
					multipartIdentifier();
					}
				}

				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(360);
						match(LIKE);
						}
					}

					setState(363);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(366);
				if (!(!legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "!legacy_create_hive_table_by_default_enabled");
				setState(367);
				createTableHeader();
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(368);
					match(T__1);
					setState(369);
					colTypeList();
					setState(370);
					match(T__2);
					}
					break;
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(374);
					tableProvider();
					}
				}

				setState(377);
				createTableClauses();
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(378);
						match(AS);
						}
					}

					setState(381);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(384);
				if (!(legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "legacy_create_hive_table_by_default_enabled");
				setState(385);
				createTableHeader();
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(386);
					match(T__1);
					setState(387);
					colTypeList();
					setState(388);
					match(T__2);
					}
				}

				setState(392);
				tableProvider();
				setState(393);
				createTableClauses();
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(394);
						match(AS);
						}
					}

					setState(397);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(400);
				createTableHeader();
				setState(405);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(401);
					match(T__1);
					setState(402);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(403);
					match(T__2);
					}
					break;
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LIFECYCLE - 142)) | (1L << (LOCATION - 142)) | (1L << (PARTITIONED - 142)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (ROW - 211)) | (1L << (SKEWED - 211)) | (1L << (STORED - 211)) | (1L << (TBLPROPERTIES - 211)))) != 0)) {
					{
					setState(428);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(407);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						setState(417);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(408);
							match(PARTITIONED);
							setState(409);
							match(BY);
							setState(410);
							match(T__1);
							setState(411);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(412);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(414);
							match(PARTITIONED);
							setState(415);
							match(BY);
							setState(416);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(419);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(420);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(421);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(422);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(423);
						locationSpec();
						}
						break;
					case LIFECYCLE:
						{
						{
						setState(424);
						match(LIFECYCLE);
						setState(425);
						((CreateHiveTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(426);
						match(TBLPROPERTIES);
						setState(427);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(434);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(433);
						match(AS);
						}
					}

					setState(436);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(439);
				match(CREATE);
				setState(440);
				match(TABLE);
				setState(444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(441);
					match(IF);
					setState(442);
					match(NOT);
					setState(443);
					match(EXISTS);
					}
					break;
				}
				setState(446);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(447);
				match(LIKE);
				setState(448);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (ROW - 211)) | (1L << (STORED - 211)) | (1L << (TBLPROPERTIES - 211)) | (1L << (USING - 211)))) != 0)) {
					{
					setState(455);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(449);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(450);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(451);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(452);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(453);
						match(TBLPROPERTIES);
						setState(454);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(460);
				replaceTableHeader();
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(461);
					match(T__1);
					setState(462);
					colTypeList();
					setState(463);
					match(T__2);
					}
				}

				setState(467);
				tableProvider();
				setState(468);
				createTableClauses();
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(469);
						match(AS);
						}
					}

					setState(472);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(475);
				match(ANALYZE);
				setState(476);
				match(TABLE);
				setState(477);
				multipartIdentifier();
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(478);
					partitionSpec();
					}
				}

				setState(481);
				match(COMPUTE);
				setState(482);
				match(STATISTICS);
				setState(490);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(483);
					identifier();
					}
					break;
				case 2:
					{
					setState(484);
					match(FOR);
					setState(485);
					match(COLUMNS);
					setState(486);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(487);
					match(FOR);
					setState(488);
					match(ALL);
					setState(489);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(492);
				match(ALTER);
				setState(493);
				match(TABLE);
				setState(494);
				multipartIdentifier();
				setState(495);
				match(ADD);
				setState(496);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(497);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(499);
				match(ALTER);
				setState(500);
				match(TABLE);
				setState(501);
				multipartIdentifier();
				setState(502);
				match(ADD);
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				match(T__1);
				setState(505);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(506);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(508);
				match(ALTER);
				setState(509);
				match(TABLE);
				setState(510);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(511);
				match(RENAME);
				setState(512);
				match(COLUMN);
				setState(513);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(514);
				match(TO);
				setState(515);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(517);
				match(ALTER);
				setState(518);
				match(TABLE);
				setState(519);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(520);
				match(DROP);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				match(T__1);
				setState(523);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(524);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(526);
				match(ALTER);
				setState(527);
				match(TABLE);
				setState(528);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(529);
				match(DROP);
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(533);
				match(ALTER);
				setState(534);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(535);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(536);
				match(RENAME);
				setState(537);
				match(TO);
				setState(538);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(540);
				match(ALTER);
				setState(541);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(542);
				multipartIdentifier();
				setState(543);
				match(SET);
				setState(544);
				match(TBLPROPERTIES);
				setState(545);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(547);
				match(ALTER);
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(549);
				multipartIdentifier();
				setState(550);
				match(UNSET);
				setState(551);
				match(TBLPROPERTIES);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(552);
					match(IF);
					setState(553);
					match(EXISTS);
					}
				}

				setState(556);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(558);
				match(ALTER);
				setState(559);
				match(TABLE);
				setState(560);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(561);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(563);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(562);
					match(COLUMN);
					}
					break;
				}
				setState(565);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(566);
					alterColumnAction();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(569);
				match(ALTER);
				setState(570);
				match(TABLE);
				setState(571);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(572);
					partitionSpec();
					}
				}

				setState(575);
				match(CHANGE);
				setState(577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(576);
					match(COLUMN);
					}
					break;
				}
				setState(579);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(580);
				colType();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(581);
					colPosition();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(584);
				match(ALTER);
				setState(585);
				match(TABLE);
				setState(586);
				multipartIdentifier();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(587);
					partitionSpec();
					}
				}

				setState(590);
				match(SET);
				setState(591);
				match(SERDE);
				setState(592);
				match(STRING);
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(593);
					match(WITH);
					setState(594);
					match(SERDEPROPERTIES);
					setState(595);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(598);
				match(ALTER);
				setState(599);
				match(TABLE);
				setState(600);
				multipartIdentifier();
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(601);
					partitionSpec();
					}
				}

				setState(604);
				match(SET);
				setState(605);
				match(SERDEPROPERTIES);
				setState(606);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(608);
				match(ALTER);
				setState(609);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(610);
				multipartIdentifier();
				setState(611);
				match(ADD);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(612);
					match(IF);
					setState(613);
					match(NOT);
					setState(614);
					match(EXISTS);
					}
				}

				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(617);
					partitionSpecLocation();
					}
					}
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(622);
				match(ALTER);
				setState(623);
				match(TABLE);
				setState(624);
				multipartIdentifier();
				setState(625);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(626);
				match(RENAME);
				setState(627);
				match(TO);
				setState(628);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(630);
				match(ALTER);
				setState(631);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(632);
				multipartIdentifier();
				setState(633);
				match(DROP);
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(634);
					match(IF);
					setState(635);
					match(EXISTS);
					}
				}

				setState(638);
				partitionSpec();
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(639);
					match(T__3);
					setState(640);
					partitionSpec();
					}
					}
					setState(645);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(646);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(649);
				match(ALTER);
				setState(650);
				match(TABLE);
				setState(651);
				multipartIdentifier();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(652);
					partitionSpec();
					}
				}

				setState(655);
				match(SET);
				setState(656);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(658);
				match(ALTER);
				setState(659);
				match(TABLE);
				setState(660);
				multipartIdentifier();
				setState(661);
				match(RECOVER);
				setState(662);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(664);
				match(DROP);
				setState(665);
				match(TABLE);
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(666);
					match(IF);
					setState(667);
					match(EXISTS);
					}
					break;
				}
				setState(670);
				multipartIdentifier();
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(671);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(674);
				match(DROP);
				setState(675);
				match(VIEW);
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(676);
					match(IF);
					setState(677);
					match(EXISTS);
					}
					break;
				}
				setState(680);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(681);
				match(CREATE);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(682);
					match(OR);
					setState(683);
					match(REPLACE);
					}
				}

				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(686);
						match(GLOBAL);
						}
					}

					setState(689);
					match(TEMPORARY);
					}
				}

				setState(692);
				match(VIEW);
				setState(696);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(693);
					match(IF);
					setState(694);
					match(NOT);
					setState(695);
					match(EXISTS);
					}
					break;
				}
				setState(698);
				multipartIdentifier();
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(699);
					identifierCommentList();
					}
				}

				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(708);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(702);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(703);
						match(PARTITIONED);
						setState(704);
						match(ON);
						setState(705);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(706);
						match(TBLPROPERTIES);
						setState(707);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(712);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(713);
				match(AS);
				setState(714);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(716);
				match(CREATE);
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(717);
					match(OR);
					setState(718);
					match(REPLACE);
					}
				}

				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(721);
					match(GLOBAL);
					}
				}

				setState(724);
				match(TEMPORARY);
				setState(725);
				match(VIEW);
				setState(726);
				tableIdentifier();
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(727);
					match(T__1);
					setState(728);
					colTypeList();
					setState(729);
					match(T__2);
					}
				}

				setState(733);
				tableProvider();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(734);
					match(OPTIONS);
					setState(735);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(738);
				match(ALTER);
				setState(739);
				match(VIEW);
				setState(740);
				multipartIdentifier();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(741);
					match(AS);
					}
				}

				setState(744);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(746);
				match(CREATE);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(747);
					match(OR);
					setState(748);
					match(REPLACE);
					}
				}

				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(751);
					match(TEMPORARY);
					}
				}

				setState(754);
				match(FUNCTION);
				setState(758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(755);
					match(IF);
					setState(756);
					match(NOT);
					setState(757);
					match(EXISTS);
					}
					break;
				}
				setState(760);
				multipartIdentifier();
				setState(761);
				match(AS);
				setState(762);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(763);
					match(USING);
					setState(764);
					resource();
					setState(769);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(765);
						match(T__3);
						setState(766);
						resource();
						}
						}
						setState(771);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 38:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(774);
				match(DROP);
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(775);
					match(TEMPORARY);
					}
				}

				setState(778);
				match(FUNCTION);
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(779);
					match(IF);
					setState(780);
					match(EXISTS);
					}
					break;
				}
				setState(783);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(784);
				match(EXPLAIN);
				setState(786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(785);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (EXTENDED - 90)) | (1L << (FORMATTED - 90)) | (1L << (LOGICAL - 90)))) != 0)) ) {
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
				setState(788);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(789);
				match(SHOW);
				setState(790);
				match(TABLES);
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(791);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(792);
					multipartIdentifier();
					}
				}

				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(795);
						match(LIKE);
						}
					}

					setState(798);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(801);
				match(SHOW);
				setState(802);
				match(TABLE);
				setState(803);
				match(EXTENDED);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(804);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(805);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(808);
				match(LIKE);
				setState(809);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(810);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(813);
				match(SHOW);
				setState(814);
				match(TBLPROPERTIES);
				setState(815);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(816);
					match(T__1);
					setState(817);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(818);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(822);
				match(SHOW);
				setState(823);
				match(COLUMNS);
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(825);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(826);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(827);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(830);
				match(SHOW);
				setState(831);
				match(VIEWS);
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(832);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(833);
					multipartIdentifier();
					}
				}

				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(836);
						match(LIKE);
						}
					}

					setState(839);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(842);
				match(SHOW);
				setState(843);
				match(PARTITIONS);
				setState(844);
				multipartIdentifier();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(845);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(848);
				match(SHOW);
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(849);
					identifier();
					}
					break;
				}
				setState(852);
				match(FUNCTIONS);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(853);
						match(LIKE);
						}
						break;
					}
					setState(858);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(856);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(857);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 47:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(862);
				match(SHOW);
				setState(863);
				match(CREATE);
				setState(864);
				match(TABLE);
				setState(865);
				multipartIdentifier();
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(866);
					match(AS);
					setState(867);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(870);
				match(SHOW);
				setState(871);
				match(CURRENT);
				setState(872);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(873);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(874);
				match(FUNCTION);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(875);
					match(EXTENDED);
					}
					break;
				}
				setState(878);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(879);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(880);
				namespace();
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(881);
					match(EXTENDED);
					}
					break;
				}
				setState(884);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(886);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(887);
				match(DETAIL);
				setState(888);
				((DescribeDeltaDetailContext)_localctx).table = multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(889);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(890);
				match(HISTORY);
				setState(891);
				((DescribeDeltaHistoryContext)_localctx).table = multipartIdentifier();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(892);
					match(LIMIT);
					setState(893);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 53:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(896);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(898);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(897);
					match(TABLE);
					}
					break;
				}
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(900);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(903);
				multipartIdentifier();
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(904);
					partitionSpec();
					}
					break;
				}
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(907);
					describeColName();
					}
					break;
				}
				}
				break;
			case 54:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(910);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(911);
					match(QUERY);
					}
				}

				setState(914);
				query();
				}
				break;
			case 55:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(915);
				match(COMMENT);
				setState(916);
				match(ON);
				setState(917);
				namespace();
				setState(918);
				multipartIdentifier();
				setState(919);
				match(IS);
				setState(920);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 56:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(922);
				match(COMMENT);
				setState(923);
				match(ON);
				setState(924);
				match(TABLE);
				setState(925);
				multipartIdentifier();
				setState(926);
				match(IS);
				setState(927);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 57:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(929);
				match(REFRESH);
				setState(930);
				match(TABLE);
				setState(931);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(932);
				match(REFRESH);
				setState(940);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(933);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(937);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(934);
							matchWildcard();
							}
							} 
						}
						setState(939);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 59:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(942);
				match(CACHE);
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(943);
					match(LAZY);
					}
				}

				setState(946);
				match(TABLE);
				setState(947);
				multipartIdentifier();
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(948);
					match(OPTIONS);
					setState(949);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(952);
						match(AS);
						}
					}

					setState(955);
					query();
					}
				}

				}
				break;
			case 60:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(958);
				match(UNCACHE);
				setState(959);
				match(TABLE);
				setState(962);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(960);
					match(IF);
					setState(961);
					match(EXISTS);
					}
					break;
				}
				setState(964);
				multipartIdentifier();
				}
				break;
			case 61:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(965);
				match(CLEAR);
				setState(966);
				match(CACHE);
				}
				break;
			case 62:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(967);
				match(LOAD);
				setState(968);
				match(DATA);
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(969);
					match(LOCAL);
					}
				}

				setState(972);
				match(INPATH);
				setState(973);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(974);
					match(OVERWRITE);
					}
				}

				setState(977);
				match(INTO);
				setState(978);
				match(TABLE);
				setState(979);
				multipartIdentifier();
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(980);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(983);
				match(TRUNCATE);
				setState(984);
				match(TABLE);
				setState(985);
				multipartIdentifier();
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(986);
					partitionSpec();
					}
				}

				}
				break;
			case 64:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(989);
				match(MSCK);
				setState(990);
				match(REPAIR);
				setState(991);
				match(TABLE);
				setState(992);
				multipartIdentifier();
				}
				break;
			case 65:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(993);
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
				setState(994);
				identifier();
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(995);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(999);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(996);
							matchWildcard();
							}
							} 
						}
						setState(1001);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 66:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(1004);
				match(SET);
				setState(1005);
				match(ROLE);
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1006);
						matchWildcard();
						}
						} 
					}
					setState(1011);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 67:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1012);
				match(SET);
				setState(1016);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1013);
						matchWildcard();
						}
						} 
					}
					setState(1018);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1019);
				match(RESET);
				}
				break;
			case 69:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1020);
				match(MERGE);
				setState(1021);
				match(TABLE);
				setState(1022);
				multipartIdentifier();
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1023);
					partitionSpec();
					}
				}

				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1026);
					match(OPTIONS);
					setState(1027);
					((MergeTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 70:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1030);
				match(KILL);
				setState(1031);
				match(JOB);
				setState(1032);
				identifier();
				}
				break;
			case 71:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1033);
				match(ADDJAR);
				setState(1034);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 72:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1035);
				match(READ);
				setState(1036);
				match(TABLE);
				setState(1037);
				multipartIdentifier();
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1038);
					partitionSpec();
					}
				}

				setState(1041);
				match(LIMIT);
				setState(1042);
				number();
				}
				break;
			case 73:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1044);
				match(LOAD);
				setState(1045);
				match(DATA);
				setState(1046);
				((LoadTempTableContext)_localctx).path = constant();
				setState(1047);
				match(TABLE);
				setState(1048);
				multipartIdentifier();
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1049);
					match(OPTIONS);
					setState(1050);
					((LoadTempTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 74:
				_localctx = new ExportTableContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1054);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1053);
					ctes();
					}
				}

				setState(1056);
				match(EXPORT);
				setState(1057);
				match(TABLE);
				setState(1058);
				multipartIdentifier();
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1059);
					partitionSpec();
					}
				}

				setState(1062);
				match(TO);
				setState(1063);
				((ExportTableContext)_localctx).name = constant();
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1064);
					match(OPTIONS);
					setState(1065);
					((ExportTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 75:
				_localctx = new CompressTableContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1068);
				match(COMPRESS);
				setState(1069);
				match(TABLE);
				setState(1070);
				multipartIdentifier();
				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1071);
					partitionSpec();
					}
				}

				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1074);
					match(OPTIONS);
					setState(1075);
					((CompressTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 76:
				_localctx = new CompressFileContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1078);
				match(COMPRESS);
				setState(1079);
				match(FILE);
				setState(1080);
				((CompressFileContext)_localctx).path = constant();
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1081);
					match(OPTIONS);
					setState(1082);
					((CompressFileContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 77:
				_localctx = new DistcpDatasourceContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1085);
					ctes();
					}
				}

				setState(1088);
				match(DISTCP);
				setState(1089);
				((DistcpDatasourceContext)_localctx).ds = dataSource();
				setState(1090);
				((DistcpDatasourceContext)_localctx).srcTable = multipartIdentifier();
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1091);
					partitionSpec();
					}
				}

				setState(1094);
				match(TO);
				setState(1095);
				((DistcpDatasourceContext)_localctx).destTable = multipartIdentifier();
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1096);
					match(OPTIONS);
					setState(1097);
					((DistcpDatasourceContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 78:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1100);
				match(VACUUM);
				setState(1101);
				((VacuumTableContext)_localctx).table = multipartIdentifier();
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(1102);
					match(RETAIN);
					setState(1103);
					((VacuumTableContext)_localctx).num = number();
					setState(1104);
					match(HOURS);
					}
				}

				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRY) {
					{
					setState(1108);
					match(DRY);
					setState(1109);
					match(RUN);
					}
				}

				}
				break;
			case 79:
				_localctx = new DeltaConvertContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1112);
				match(CONVERT);
				setState(1113);
				match(TO);
				setState(1114);
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
				setState(1115);
				((DeltaConvertContext)_localctx).table = multipartIdentifier();
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(1116);
					match(PARTITIONED);
					setState(1117);
					match(BY);
					setState(1118);
					match(T__1);
					setState(1119);
					colTypeList();
					setState(1120);
					match(T__2);
					}
				}

				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1124);
					match(OPTIONS);
					setState(1125);
					((DeltaConvertContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1128);
				unsupportedHiveNativeCommands();
				setState(1132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1129);
						matchWildcard();
						}
						} 
					}
					setState(1134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
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
		enterRule(_localctx, 16, RULE_dataSource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(CLICKHOUSE);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1144);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1148);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1156);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1155);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1202);
				tableIdentifier();
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1208);
				tableIdentifier();
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1214);
				tableIdentifier();
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1220);
				tableIdentifier();
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1226);
				tableIdentifier();
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1232);
				tableIdentifier();
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1240);
				tableIdentifier();
				setState(1241);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1247);
				tableIdentifier();
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1251);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1253);
				tableIdentifier();
				setState(1254);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1259);
				tableIdentifier();
				setState(1260);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1263);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1264);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1265);
				tableIdentifier();
				setState(1266);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1268);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1269);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1270);
				tableIdentifier();
				setState(1272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1271);
					partitionSpec();
					}
				}

				setState(1274);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1276);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1277);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1278);
				tableIdentifier();
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1279);
					partitionSpec();
					}
				}

				setState(1282);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1285);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1286);
				tableIdentifier();
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1287);
					partitionSpec();
					}
				}

				setState(1290);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1293);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1294);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1295);
				tableIdentifier();
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1296);
					partitionSpec();
					}
				}

				setState(1299);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1300);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1302);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1303);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1304);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1305);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1306);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		enterRule(_localctx, 20, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			match(CREATE);
			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1310);
				match(TEMPORARY);
				}
			}

			setState(1314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1313);
				match(EXTERNAL);
				}
			}

			setState(1316);
			match(TABLE);
			setState(1320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1317);
				match(IF);
				setState(1318);
				match(NOT);
				setState(1319);
				match(EXISTS);
				}
				break;
			}
			setState(1322);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1324);
				match(CREATE);
				setState(1325);
				match(OR);
				}
			}

			setState(1328);
			match(REPLACE);
			setState(1329);
			match(TABLE);
			setState(1330);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(1332);
			match(CLUSTERED);
			setState(1333);
			match(BY);
			setState(1334);
			identifierList();
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1335);
				match(SORTED);
				setState(1336);
				match(BY);
				setState(1337);
				orderedIdentifierList();
				}
			}

			setState(1340);
			match(INTO);
			setState(1341);
			match(INTEGER_VALUE);
			setState(1342);
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
			setState(1344);
			match(SKEWED);
			setState(1345);
			match(BY);
			setState(1346);
			identifierList();
			setState(1347);
			match(ON);
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1348);
				constantList();
				}
				break;
			case 2:
				{
				setState(1349);
				nestedConstantList();
				}
				break;
			}
			setState(1355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1352);
				match(STORED);
				setState(1353);
				match(AS);
				setState(1354);
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
			setState(1357);
			match(LOCATION);
			setState(1358);
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

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1360);
			match(COMMENT);
			setState(1361);
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
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
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
		enterRule(_localctx, 32, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1363);
				ctes();
				}
			}

			setState(1366);
			queryTerm(0);
			setState(1367);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
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
		enterRule(_localctx, 34, RULE_insertInto);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1369);
				match(INSERT);
				setState(1370);
				match(OVERWRITE);
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1371);
					match(TABLE);
					}
					break;
				}
				setState(1374);
				multipartIdentifier();
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1375);
					partitionSpec();
					setState(1379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1376);
						match(IF);
						setState(1377);
						match(NOT);
						setState(1378);
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
				setState(1383);
				match(INSERT);
				setState(1384);
				match(INTO);
				setState(1386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1385);
					match(TABLE);
					}
					break;
				}
				setState(1388);
				multipartIdentifier();
				setState(1390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1389);
					partitionSpec();
					}
				}

				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1392);
					match(IF);
					setState(1393);
					match(NOT);
					setState(1394);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1397);
				match(INSERT);
				setState(1398);
				match(OVERWRITE);
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1399);
					match(LOCAL);
					}
				}

				setState(1402);
				match(DIRECTORY);
				setState(1403);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1404);
					rowFormat();
					}
				}

				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1407);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1410);
				match(INSERT);
				setState(1411);
				match(OVERWRITE);
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1412);
					match(LOCAL);
					}
				}

				setState(1415);
				match(DIRECTORY);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1416);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1419);
				tableProvider();
				setState(1422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1420);
					match(OPTIONS);
					setState(1421);
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
		enterRule(_localctx, 36, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			partitionSpec();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1427);
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
		enterRule(_localctx, 38, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1430);
			match(PARTITION);
			setState(1431);
			match(T__1);
			setState(1432);
			partitionVal();
			setState(1437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1433);
				match(T__3);
				setState(1434);
				partitionVal();
				}
				}
				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1440);
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
		enterRule(_localctx, 40, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			identifier();
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1443);
				match(EQ);
				setState(1444);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
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
		enterRule(_localctx, 44, RULE_describeFuncName);
		try {
			setState(1454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1451);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1452);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1453);
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
		enterRule(_localctx, 46, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1457);
				match(T__4);
				setState(1458);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1463);
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
		enterRule(_localctx, 48, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464);
			match(WITH);
			setState(1465);
			namedQuery();
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1466);
				match(T__3);
				setState(1467);
				namedQuery();
				}
				}
				setState(1472);
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
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				{
				setState(1474);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1477);
				match(AS);
				}
			}

			setState(1480);
			match(T__1);
			setState(1481);
			query();
			setState(1482);
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

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		enterRule(_localctx, 52, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(USING);
			setState(1485);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public TablePropertyListContext options;
		public TransformListContext partitioning;
		public Token lifecycle;
		public TablePropertyListContext tableProps;
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
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
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
		public List<TerminalNode> LIFECYCLE() { return getTokens(SparkSqlBaseParser.LIFECYCLE); }
		public TerminalNode LIFECYCLE(int i) {
			return getToken(SparkSqlBaseParser.LIFECYCLE, i);
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
		public List<TransformListContext> transformList() {
			return getRuleContexts(TransformListContext.class);
		}
		public TransformListContext transformList(int i) {
			return getRuleContext(TransformListContext.class,i);
		}
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SparkSqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SparkSqlBaseParser.INTEGER_VALUE, i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 142)) & ~0x3f) == 0 && ((1L << (_la - 142)) & ((1L << (LIFECYCLE - 142)) | (1L << (LOCATION - 142)) | (1L << (OPTIONS - 142)) | (1L << (PARTITIONED - 142)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1487);
					match(OPTIONS);
					setState(1488);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1489);
					match(PARTITIONED);
					setState(1490);
					match(BY);
					setState(1491);
					((CreateTableClausesContext)_localctx).partitioning = transformList();
					}
					}
					break;
				case CLUSTERED:
					{
					setState(1492);
					bucketSpec();
					}
					break;
				case LOCATION:
					{
					setState(1493);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1494);
					commentSpec();
					}
					break;
				case LIFECYCLE:
					{
					{
					setState(1495);
					match(LIFECYCLE);
					setState(1496);
					((CreateTableClausesContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1497);
					match(TBLPROPERTIES);
					setState(1498);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1503);
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
		enterRule(_localctx, 56, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(T__1);
			setState(1505);
			tableProperty();
			setState(1510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1506);
				match(T__3);
				setState(1507);
				tableProperty();
				}
				}
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1513);
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
		enterRule(_localctx, 58, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1515);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 251)) & ~0x3f) == 0 && ((1L << (_la - 251)) & ((1L << (TRUE - 251)) | (1L << (EQ - 251)) | (1L << (STRING - 251)) | (1L << (INTEGER_VALUE - 251)) | (1L << (DECIMAL_VALUE - 251)))) != 0)) {
				{
				setState(1517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1516);
					match(EQ);
					}
				}

				setState(1519);
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
		enterRule(_localctx, 60, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1522);
				identifier();
				setState(1527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1523);
					match(T__4);
					setState(1524);
					identifier();
					}
					}
					setState(1529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1530);
				match(STRING);
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
		enterRule(_localctx, 62, RULE_tablePropertyValue);
		try {
			setState(1537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1533);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1534);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1536);
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
		enterRule(_localctx, 64, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1539);
			match(T__1);
			setState(1540);
			constant();
			setState(1545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1541);
				match(T__3);
				setState(1542);
				constant();
				}
				}
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1548);
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
		enterRule(_localctx, 66, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			match(T__1);
			setState(1551);
			constantList();
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1552);
				match(T__3);
				setState(1553);
				constantList();
				}
				}
				setState(1558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1559);
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
		enterRule(_localctx, 68, RULE_createFileFormat);
		try {
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1561);
				match(STORED);
				setState(1562);
				match(AS);
				setState(1563);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1564);
				match(STORED);
				setState(1565);
				match(BY);
				setState(1566);
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
		enterRule(_localctx, 70, RULE_fileFormat);
		try {
			setState(1574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1569);
				match(INPUTFORMAT);
				setState(1570);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1571);
				match(OUTPUTFORMAT);
				setState(1572);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1573);
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
		enterRule(_localctx, 72, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(STRING);
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1577);
				match(WITH);
				setState(1578);
				match(SERDEPROPERTIES);
				setState(1579);
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
		enterRule(_localctx, 74, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			identifier();
			setState(1583);
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

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
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
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
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
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
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
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
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
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1636);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1585);
				insertInto();
				setState(1586);
				queryTerm(0);
				setState(1587);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				fromClause();
				setState(1591); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1590);
					multiInsertQueryBody();
					}
					}
					setState(1593); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1595);
				match(DELETE);
				setState(1596);
				match(FROM);
				setState(1597);
				multipartIdentifier();
				setState(1598);
				tableAlias();
				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1599);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1602);
				match(UPDATE);
				setState(1603);
				multipartIdentifier();
				setState(1604);
				tableAlias();
				setState(1605);
				setClause();
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1606);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1609);
				match(MERGE);
				setState(1610);
				match(INTO);
				setState(1611);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1612);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1613);
				match(USING);
				setState(1619);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1614);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1615);
					match(T__1);
					setState(1616);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1617);
					match(T__2);
					}
					break;
				}
				setState(1621);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1622);
				match(ON);
				setState(1623);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1627);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1624);
						matchedClause();
						}
						} 
					}
					setState(1629);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1630);
					notMatchedClause();
					}
					}
					setState(1635);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
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
		enterRule(_localctx, 78, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1638);
				match(ORDER);
				setState(1639);
				match(BY);
				setState(1640);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1641);
						match(T__3);
						setState(1642);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1647);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			}
			setState(1660);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				{
				setState(1650);
				match(CLUSTER);
				setState(1651);
				match(BY);
				setState(1652);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1653);
						match(T__3);
						setState(1654);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1659);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				}
				break;
			}
			setState(1672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1662);
				match(DISTRIBUTE);
				setState(1663);
				match(BY);
				setState(1664);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1669);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1665);
						match(T__3);
						setState(1666);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1671);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
				}
				}
				break;
			}
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1674);
				match(SORT);
				setState(1675);
				match(BY);
				setState(1676);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1677);
						match(T__3);
						setState(1678);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1683);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
				}
				}
				break;
			}
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				setState(1686);
				windowClause();
				}
				break;
			}
			setState(1694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1689);
				match(LIMIT);
				setState(1692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1690);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1691);
					((QueryOrganizationContext)_localctx).limit = expression();
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

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
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
		enterRule(_localctx, 80, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			insertInto();
			setState(1697);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
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
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1700);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1725);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1723);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1702);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1703);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1704);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1706);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1705);
							setQuantifier();
							}
						}

						setState(1708);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1709);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1710);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1711);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1713);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1712);
							setQuantifier();
							}
						}

						setState(1715);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1716);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1717);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1718);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1720);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1719);
							setQuantifier();
							}
						}

						setState(1722);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1727);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		enterRule(_localctx, 84, RULE_queryPrimary);
		try {
			setState(1737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1728);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1729);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1730);
				match(TABLE);
				setState(1731);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1732);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1733);
				match(T__1);
				setState(1734);
				query();
				setState(1735);
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
		enterRule(_localctx, 86, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			expression();
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1740);
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
				break;
			}
			setState(1745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1743);
				match(NULLS);
				setState(1744);
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

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			fromClause();
			setState(1749); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1748);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1751); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				transformClause();
				setState(1755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1754);
					whereClause();
					}
					break;
				}
				setState(1757);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1759);
				selectClause();
				setState(1763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1760);
						lateralView();
						}
						} 
					}
					setState(1765);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				}
				setState(1767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1766);
					whereClause();
					}
					break;
				}
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1769);
					aggregationClause();
					}
					break;
				}
				setState(1773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1772);
					havingClause();
					}
					break;
				}
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1775);
					windowClause();
					}
					break;
				}
				setState(1778);
				queryOrganization();
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

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_querySpecification);
		try {
			int _alt;
			setState(1811);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1782);
				transformClause();
				setState(1784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1783);
					fromClause();
					}
					break;
				}
				setState(1787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1786);
					whereClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1789);
				selectClause();
				setState(1791);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1790);
					fromClause();
					}
					break;
				}
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1793);
						lateralView();
						}
						} 
					}
					setState(1798);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
				}
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1799);
					whereClause();
					}
					break;
				}
				setState(1803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1802);
					aggregationClause();
					}
					break;
				}
				setState(1806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1805);
					havingClause();
					}
					break;
				}
				setState(1809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1808);
					windowClause();
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

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SparkSqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SparkSqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1823);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1813);
				match(SELECT);
				setState(1814);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1815);
				match(T__1);
				setState(1816);
				namedExpressionSeq();
				setState(1817);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1819);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1820);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1821);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1822);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1825);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1828);
				match(RECORDWRITER);
				setState(1829);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1832);
			match(USING);
			setState(1833);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1834);
				match(AS);
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1835);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1836);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1837);
					match(T__1);
					setState(1840);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
					case 1:
						{
						setState(1838);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1839);
						colTypeList();
						}
						break;
					}
					setState(1842);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1848);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1851);
				match(RECORDREADER);
				setState(1852);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
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

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
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
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			match(SELECT);
			setState(1859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1856);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			}
			setState(1863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1862);
				setQuantifier();
				}
				break;
			}
			setState(1865);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
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
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
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
		enterRule(_localctx, 98, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			match(SET);
			setState(1868);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
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
		public BooleanExpressionContext matchedCond;
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
		enterRule(_localctx, 100, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870);
			match(WHEN);
			setState(1871);
			match(MATCHED);
			setState(1874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1872);
				match(AND);
				setState(1873);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1876);
			match(THEN);
			setState(1877);
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

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
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
		enterRule(_localctx, 102, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			match(WHEN);
			setState(1880);
			match(NOT);
			setState(1881);
			match(MATCHED);
			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1882);
				match(AND);
				setState(1883);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1886);
			match(THEN);
			setState(1887);
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

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_matchedAction);
		try {
			setState(1896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1889);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				match(UPDATE);
				setState(1891);
				match(SET);
				setState(1892);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1893);
				match(UPDATE);
				setState(1894);
				match(SET);
				setState(1895);
				assignmentList();
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

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SparkSqlBaseParser.ASTERISK, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_notMatchedAction);
		int _la;
		try {
			setState(1916);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1898);
				match(INSERT);
				setState(1899);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1900);
				match(INSERT);
				setState(1901);
				match(T__1);
				setState(1902);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1903);
				match(T__2);
				setState(1904);
				match(VALUES);
				setState(1905);
				match(T__1);
				setState(1906);
				expression();
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1907);
					match(T__3);
					setState(1908);
					expression();
					}
					}
					setState(1913);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1914);
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
		enterRule(_localctx, 108, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1918);
			assignment();
			setState(1923);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1919);
				match(T__3);
				setState(1920);
				assignment();
				}
				}
				setState(1925);
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
		enterRule(_localctx, 110, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1927);
			match(EQ);
			setState(1928);
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

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1930);
			match(WHERE);
			setState(1931);
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

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			match(HAVING);
			setState(1934);
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
		enterRule(_localctx, 116, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1936);
			match(T__5);
			setState(1937);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1944);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1939);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(1938);
						match(T__3);
						}
						break;
					}
					setState(1941);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1946);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1947);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 118, RULE_hintStatement);
		int _la;
		try {
			setState(1962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1949);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1950);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1951);
				match(T__1);
				setState(1952);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1953);
					match(T__3);
					setState(1954);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1959);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1960);
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
		enterRule(_localctx, 120, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			match(FROM);
			setState(1965);
			relation();
			setState(1970);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1966);
					match(T__3);
					setState(1967);
					relation();
					}
					} 
				}
				setState(1972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			setState(1976);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1973);
					lateralView();
					}
					} 
				}
				setState(1978);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(1980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				setState(1979);
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

	public static class AggregationClauseContext extends ParserRuleContext {
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
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1982);
				match(GROUP);
				setState(1983);
				match(BY);
				setState(1984);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1989);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1985);
						match(T__3);
						setState(1986);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1991);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
				}
				setState(2009);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1992);
					match(WITH);
					setState(1993);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1994);
					match(WITH);
					setState(1995);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1996);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1997);
					match(SETS);
					setState(1998);
					match(T__1);
					setState(1999);
					groupingSet();
					setState(2004);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2000);
						match(T__3);
						setState(2001);
						groupingSet();
						}
						}
						setState(2006);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2007);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2011);
				match(GROUP);
				setState(2012);
				match(BY);
				setState(2013);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(2014);
				match(SETS);
				setState(2015);
				match(T__1);
				setState(2016);
				groupingSet();
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2017);
					match(T__3);
					setState(2018);
					groupingSet();
					}
					}
					setState(2023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2024);
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
		enterRule(_localctx, 124, RULE_groupingSet);
		int _la;
		try {
			setState(2041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2028);
				match(T__1);
				setState(2037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
				case 1:
					{
					setState(2029);
					expression();
					setState(2034);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2030);
						match(T__3);
						setState(2031);
						expression();
						}
						}
						setState(2036);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2039);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2040);
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
		enterRule(_localctx, 126, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2043);
			match(PIVOT);
			setState(2044);
			match(T__1);
			setState(2045);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2046);
			match(FOR);
			setState(2047);
			pivotColumn();
			setState(2048);
			match(IN);
			setState(2049);
			match(T__1);
			setState(2050);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2051);
				match(T__3);
				setState(2052);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2057);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2058);
			match(T__2);
			setState(2059);
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
		enterRule(_localctx, 128, RULE_pivotColumn);
		int _la;
		try {
			setState(2073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2061);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2062);
				match(T__1);
				setState(2063);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2064);
					match(T__3);
					setState(2065);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2070);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2071);
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
		enterRule(_localctx, 130, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2075);
			expression();
			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2077);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(2076);
					match(AS);
					}
					break;
				}
				setState(2079);
				identifier();
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
		enterRule(_localctx, 132, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			match(LATERAL);
			setState(2083);
			match(VIEW);
			setState(2085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2084);
				match(OUTER);
				}
				break;
			}
			setState(2087);
			qualifiedName();
			setState(2088);
			match(T__1);
			setState(2097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2089);
				expression();
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2090);
					match(T__3);
					setState(2091);
					expression();
					}
					}
					setState(2096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2099);
			match(T__2);
			setState(2100);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				{
				setState(2102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2101);
					match(AS);
					}
					break;
				}
				setState(2104);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2105);
						match(T__3);
						setState(2106);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,261,_ctx);
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
		enterRule(_localctx, 134, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2114);
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
		enterRule(_localctx, 136, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			relationPrimary();
			setState(2120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2117);
					joinRelation();
					}
					} 
				}
				setState(2122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
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
		enterRule(_localctx, 138, RULE_joinRelation);
		try {
			setState(2134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2123);
				joinType();
				}
				setState(2124);
				match(JOIN);
				setState(2125);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2126);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
				match(NATURAL);
				setState(2130);
				joinType();
				setState(2131);
				match(JOIN);
				setState(2132);
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
		enterRule(_localctx, 140, RULE_joinType);
		int _la;
		try {
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2136);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2139);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2140);
				match(LEFT);
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2141);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2144);
					match(LEFT);
					}
				}

				setState(2147);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2148);
				match(RIGHT);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2149);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2152);
				match(FULL);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2153);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2156);
					match(LEFT);
					}
				}

				setState(2159);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
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
		enterRule(_localctx, 142, RULE_joinCriteria);
		try {
			setState(2166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2162);
				match(ON);
				setState(2163);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2164);
				match(USING);
				setState(2165);
				identifierList();
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
		enterRule(_localctx, 144, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			match(TABLESAMPLE);
			setState(2169);
			match(T__1);
			setState(2171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
			case 1:
				{
				setState(2170);
				sampleMethod();
				}
				break;
			}
			setState(2173);
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
		enterRule(_localctx, 146, RULE_sampleMethod);
		int _la;
		try {
			setState(2199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2175);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2178);
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
				setState(2179);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2180);
				expression();
				setState(2181);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2183);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2184);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2185);
				match(OUT);
				setState(2186);
				match(OF);
				setState(2187);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2188);
					match(ON);
					setState(2194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
					case 1:
						{
						setState(2189);
						identifier();
						}
						break;
					case 2:
						{
						setState(2190);
						qualifiedName();
						setState(2191);
						match(T__1);
						setState(2192);
						match(T__2);
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
				setState(2198);
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
		enterRule(_localctx, 148, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(T__1);
			setState(2202);
			identifierSeq();
			setState(2203);
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

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
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
		enterRule(_localctx, 150, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2206);
					match(T__3);
					setState(2207);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,279,_ctx);
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
		enterRule(_localctx, 152, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(T__1);
			setState(2214);
			orderedIdentifier();
			setState(2219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2215);
				match(T__3);
				setState(2216);
				orderedIdentifier();
				}
				}
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2222);
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

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
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
		enterRule(_localctx, 154, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2225);
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
		enterRule(_localctx, 156, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2228);
			match(T__1);
			setState(2229);
			identifierComment();
			setState(2234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2230);
				match(T__3);
				setState(2231);
				identifierComment();
				}
				}
				setState(2236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2237);
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

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
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
		enterRule(_localctx, 158, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			identifier();
			setState(2241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2240);
				commentSpec();
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
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
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
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
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
		enterRule(_localctx, 160, RULE_relationPrimary);
		try {
			setState(2267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2243);
				multipartIdentifier();
				setState(2245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2244);
					sample();
					}
					break;
				}
				setState(2247);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2249);
				match(T__1);
				setState(2250);
				query();
				setState(2251);
				match(T__2);
				setState(2253);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2252);
					sample();
					}
					break;
				}
				setState(2255);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2257);
				match(T__1);
				setState(2258);
				relation();
				setState(2259);
				match(T__2);
				setState(2261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2260);
					sample();
					}
					break;
				}
				setState(2263);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2265);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2266);
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
		enterRule(_localctx, 162, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2269);
			match(VALUES);
			setState(2270);
			expression();
			setState(2275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2271);
					match(T__3);
					setState(2272);
					expression();
					}
					} 
				}
				setState(2277);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			setState(2278);
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
		public ErrorCapturingIdentifierContext funcName;
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
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
		enterRule(_localctx, 164, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2281);
			match(T__1);
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2282);
				expression();
				setState(2287);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2283);
					match(T__3);
					setState(2284);
					expression();
					}
					}
					setState(2289);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2292);
			match(T__2);
			setState(2293);
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
		enterRule(_localctx, 166, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2295);
					match(AS);
					}
					break;
				}
				setState(2298);
				strictIdentifier();
				setState(2300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
				case 1:
					{
					setState(2299);
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
		enterRule(_localctx, 168, RULE_rowFormat);
		try {
			setState(2353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2304);
				match(ROW);
				setState(2305);
				match(FORMAT);
				setState(2306);
				match(SERDE);
				setState(2307);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2308);
					match(WITH);
					setState(2309);
					match(SERDEPROPERTIES);
					setState(2310);
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
				setState(2313);
				match(ROW);
				setState(2314);
				match(FORMAT);
				setState(2315);
				match(DELIMITED);
				setState(2325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2316);
					match(FIELDS);
					setState(2317);
					match(TERMINATED);
					setState(2318);
					match(BY);
					setState(2319);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
					case 1:
						{
						setState(2320);
						match(ESCAPED);
						setState(2321);
						match(BY);
						setState(2322);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2327);
					match(COLLECTION);
					setState(2328);
					match(ITEMS);
					setState(2329);
					match(TERMINATED);
					setState(2330);
					match(BY);
					setState(2331);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2334);
					match(MAP);
					setState(2335);
					match(KEYS);
					setState(2336);
					match(TERMINATED);
					setState(2337);
					match(BY);
					setState(2338);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2341);
					match(LINES);
					setState(2342);
					match(TERMINATED);
					setState(2343);
					match(BY);
					setState(2344);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2347);
					match(NULL);
					setState(2348);
					match(DEFINED);
					setState(2349);
					match(AS);
					setState(2350);
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

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2355);
			multipartIdentifier();
			setState(2360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2356);
				match(T__3);
				setState(2357);
				multipartIdentifier();
				}
				}
				setState(2362);
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

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
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
		enterRule(_localctx, 172, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2364);
					match(T__4);
					setState(2365);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,303,_ctx);
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
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
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
		enterRule(_localctx, 174, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2371);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2372);
				match(T__4);
				}
				break;
			}
			setState(2376);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
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
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
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
		enterRule(_localctx, 176, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2378);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2379);
				match(T__4);
				}
				break;
			}
			setState(2383);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
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
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
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
		enterRule(_localctx, 178, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2385);
			expression();
			setState(2393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2387);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2386);
					match(AS);
					}
					break;
				}
				setState(2391);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
				case 1:
					{
					setState(2389);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2390);
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
		enterRule(_localctx, 180, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			namedExpression();
			setState(2400);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2396);
					match(T__3);
					setState(2397);
					namedExpression();
					}
					} 
				}
				setState(2402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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

	public static class TransformListContext extends ParserRuleContext {
		public TransformContext transform;
		public List<TransformContext> transforms = new ArrayList<TransformContext>();
		public List<TransformContext> transform() {
			return getRuleContexts(TransformContext.class);
		}
		public TransformContext transform(int i) {
			return getRuleContext(TransformContext.class,i);
		}
		public TransformListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformListContext transformList() throws RecognitionException {
		TransformListContext _localctx = new TransformListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2403);
			match(T__1);
			setState(2404);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2405);
				match(T__3);
				setState(2406);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2412);
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

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_transform);
		int _la;
		try {
			setState(2427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2414);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2415);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2416);
				match(T__1);
				setState(2417);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2418);
					match(T__3);
					setState(2419);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2425);
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

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_transformArgument);
		try {
			setState(2431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2429);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2430);
				constant();
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
		enterRule(_localctx, 188, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2433);
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
		int _startState = 190;
		enterRecursionRule(_localctx, 190, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2436);
				match(NOT);
				setState(2437);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2438);
				match(EXISTS);
				setState(2439);
				match(T__1);
				setState(2440);
				query();
				setState(2441);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2443);
				valueExpression(0);
				setState(2445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2444);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2455);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2449);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2450);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2451);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2452);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2453);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2454);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
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
		public Token escapeChar;
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
		public TerminalNode ESCAPE() { return getToken(SparkSqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SparkSqlBaseParser.STRING, 0); }
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
		enterRule(_localctx, 192, RULE_predicate);
		int _la;
		try {
			setState(2522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2460);
					match(NOT);
					}
				}

				setState(2463);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2464);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2465);
				match(AND);
				setState(2466);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2468);
					match(NOT);
					}
				}

				setState(2471);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2472);
				match(T__1);
				setState(2473);
				expression();
				setState(2478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2474);
					match(T__3);
					setState(2475);
					expression();
					}
					}
					setState(2480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2481);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2483);
					match(NOT);
					}
				}

				setState(2486);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2487);
				match(T__1);
				setState(2488);
				query();
				setState(2489);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2491);
					match(NOT);
					}
				}

				setState(2494);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2495);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2496);
					match(NOT);
					}
				}

				setState(2499);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2500);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
				case 1:
					{
					setState(2501);
					match(ESCAPE);
					setState(2502);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2505);
				match(IS);
				setState(2507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2506);
					match(NOT);
					}
				}

				setState(2509);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2510);
				match(IS);
				setState(2512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2511);
					match(NOT);
					}
				}

				setState(2514);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2515);
				match(IS);
				setState(2517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2516);
					match(NOT);
					}
				}

				setState(2519);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2520);
				match(FROM);
				setState(2521);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2525);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2526);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 291)) & ~0x3f) == 0 && ((1L << (_la - 291)) & ((1L << (PLUS - 291)) | (1L << (MINUS - 291)) | (1L << (TILDE - 291)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2527);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,331,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2530);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2531);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & ((1L << (ASTERISK - 293)) | (1L << (SLASH - 293)) | (1L << (PERCENT - 293)) | (1L << (DIV - 293)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2532);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2533);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2534);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 291)) & ~0x3f) == 0 && ((1L << (_la - 291)) & ((1L << (PLUS - 291)) | (1L << (MINUS - 291)) | (1L << (CONCAT_PIPE - 291)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2535);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2536);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2537);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2538);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2539);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2540);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2541);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2542);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2543);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2544);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2545);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2546);
						comparisonOperator();
						setState(2547);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2553);
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
	public static class CurrentDatetimeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SparkSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public CurrentDatetimeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterCurrentDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitCurrentDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitCurrentDatetime(this);
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
		public BooleanExpressionContext where;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
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
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
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
		int _startState = 196;
		enterRecursionRule(_localctx, 196, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2555);
				((CurrentDatetimeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CURRENT_DATE || _la==CURRENT_TIMESTAMP) ) {
					((CurrentDatetimeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2556);
				match(CASE);
				setState(2558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2557);
					whenClause();
					}
					}
					setState(2560); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2562);
					match(ELSE);
					setState(2563);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2566);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2568);
				match(CASE);
				setState(2569);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2570);
					whenClause();
					}
					}
					setState(2573); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2575);
					match(ELSE);
					setState(2576);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2579);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2581);
				match(CAST);
				setState(2582);
				match(T__1);
				setState(2583);
				expression();
				setState(2584);
				match(AS);
				setState(2585);
				dataType();
				setState(2586);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2588);
				match(STRUCT);
				setState(2589);
				match(T__1);
				setState(2598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,337,_ctx) ) {
				case 1:
					{
					setState(2590);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2595);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2591);
						match(T__3);
						setState(2592);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2597);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2600);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2601);
				match(FIRST);
				setState(2602);
				match(T__1);
				setState(2603);
				expression();
				setState(2606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2604);
					match(IGNORE);
					setState(2605);
					match(NULLS);
					}
				}

				setState(2608);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2610);
				match(LAST);
				setState(2611);
				match(T__1);
				setState(2612);
				expression();
				setState(2615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2613);
					match(IGNORE);
					setState(2614);
					match(NULLS);
					}
				}

				setState(2617);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2619);
				match(POSITION);
				setState(2620);
				match(T__1);
				setState(2621);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2622);
				match(IN);
				setState(2623);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2624);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2626);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2627);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2628);
				qualifiedName();
				setState(2629);
				match(T__4);
				setState(2630);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2632);
				match(T__1);
				setState(2633);
				namedExpression();
				setState(2636); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2634);
					match(T__3);
					setState(2635);
					namedExpression();
					}
					}
					setState(2638); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2640);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2642);
				match(T__1);
				setState(2643);
				query();
				setState(2644);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2646);
				functionName();
				setState(2647);
				match(T__1);
				setState(2659);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2649);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
					case 1:
						{
						setState(2648);
						setQuantifier();
						}
						break;
					}
					setState(2651);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2652);
						match(T__3);
						setState(2653);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2661);
				match(T__2);
				setState(2668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2662);
					match(FILTER);
					setState(2663);
					match(T__1);
					setState(2664);
					match(WHERE);
					setState(2665);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2666);
					match(T__2);
					}
					break;
				}
				setState(2672);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2670);
					match(OVER);
					setState(2671);
					windowSpec();
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
				setState(2674);
				identifier();
				setState(2675);
				match(T__7);
				setState(2676);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2678);
				match(T__1);
				setState(2679);
				identifier();
				setState(2682); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2680);
					match(T__3);
					setState(2681);
					identifier();
					}
					}
					setState(2684); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2686);
				match(T__2);
				setState(2687);
				match(T__7);
				setState(2688);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2690);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2691);
				match(T__1);
				setState(2692);
				expression();
				setState(2693);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2695);
				match(EXTRACT);
				setState(2696);
				match(T__1);
				setState(2697);
				((ExtractContext)_localctx).field = identifier();
				setState(2698);
				match(FROM);
				setState(2699);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2700);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2702);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2703);
				match(T__1);
				setState(2704);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2705);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2706);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2707);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2708);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2711);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2713);
				match(TRIM);
				setState(2714);
				match(T__1);
				setState(2716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2715);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
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
				setState(2719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
				case 1:
					{
					setState(2718);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2721);
				match(FROM);
				setState(2722);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2723);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2725);
				match(OVERLAY);
				setState(2726);
				match(T__1);
				setState(2727);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2728);
				match(PLACING);
				setState(2729);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2730);
				match(FROM);
				setState(2731);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2732);
					match(FOR);
					setState(2733);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2736);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2750);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2748);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2740);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2741);
						match(T__8);
						setState(2742);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2743);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2745);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2746);
						match(T__4);
						setState(2747);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
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
		enterRule(_localctx, 198, RULE_constant);
		try {
			int _alt;
			setState(2765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2753);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2754);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2755);
				identifier();
				setState(2756);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2758);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2759);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2761); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2760);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2763); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,354,_ctx);
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
		enterRule(_localctx, 200, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2767);
			_la = _input.LA(1);
			if ( !(((((_la - 283)) & ~0x3f) == 0 && ((1L << (_la - 283)) & ((1L << (EQ - 283)) | (1L << (NSEQ - 283)) | (1L << (NEQ - 283)) | (1L << (NEQJ - 283)) | (1L << (LT - 283)) | (1L << (LTE - 283)) | (1L << (GT - 283)) | (1L << (GTE - 283)))) != 0)) ) {
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
		enterRule(_localctx, 202, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2769);
			_la = _input.LA(1);
			if ( !(((((_la - 291)) & ~0x3f) == 0 && ((1L << (_la - 291)) & ((1L << (PLUS - 291)) | (1L << (MINUS - 291)) | (1L << (ASTERISK - 291)) | (1L << (SLASH - 291)) | (1L << (PERCENT - 291)) | (1L << (DIV - 291)) | (1L << (TILDE - 291)) | (1L << (AMPERSAND - 291)) | (1L << (PIPE - 291)) | (1L << (CONCAT_PIPE - 291)) | (1L << (HAT - 291)))) != 0)) ) {
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
		enterRule(_localctx, 204, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2771);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 119)) & ~0x3f) == 0 && ((1L << (_la - 119)) & ((1L << (IN - 119)) | (1L << (NOT - 119)) | (1L << (OR - 119)))) != 0)) ) {
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
		enterRule(_localctx, 206, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2773);
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
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
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
		enterRule(_localctx, 208, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2775);
			match(INTERVAL);
			setState(2778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2776);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2777);
				errorCapturingUnitToUnitInterval();
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

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2780);
			multiUnitsInterval();
			setState(2782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,357,_ctx) ) {
			case 1:
				{
				setState(2781);
				unitToUnitInterval();
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

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2787); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2784);
					intervalValue();
					setState(2785);
					intervalUnit();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2789); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,358,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2791);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,359,_ctx) ) {
			case 1:
				{
				setState(2792);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2793);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
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

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IntervalUnitContext from;
		public IntervalUnitContext to;
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IntervalUnitContext> intervalUnit() {
			return getRuleContexts(IntervalUnitContext.class);
		}
		public IntervalUnitContext intervalUnit(int i) {
			return getRuleContext(IntervalUnitContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2796);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2797);
			((UnitToUnitIntervalContext)_localctx).from = intervalUnit();
			setState(2798);
			match(TO);
			setState(2799);
			((UnitToUnitIntervalContext)_localctx).to = intervalUnit();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 218, RULE_intervalValue);
		int _la;
		try {
			setState(2806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2801);
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

				setState(2804);
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
				setState(2805);
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

	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(SparkSqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SparkSqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SparkSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SparkSqlBaseParser.MONTH, 0); }
		public TerminalNode SECOND() { return getToken(SparkSqlBaseParser.SECOND, 0); }
		public TerminalNode YEAR() { return getToken(SparkSqlBaseParser.YEAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_intervalUnit);
		try {
			setState(2815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2808);
				match(DAY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2809);
				match(HOUR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2810);
				match(MINUTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2811);
				match(MONTH);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2812);
				match(SECOND);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2813);
				match(YEAR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2814);
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

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
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
		enterRule(_localctx, 222, RULE_colPosition);
		try {
			setState(2820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2817);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2818);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2819);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
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
		enterRule(_localctx, 224, RULE_dataType);
		int _la;
		try {
			setState(2856);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,368,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2822);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2823);
				match(LT);
				setState(2824);
				dataType();
				setState(2825);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2827);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2828);
				match(LT);
				setState(2829);
				dataType();
				setState(2830);
				match(T__3);
				setState(2831);
				dataType();
				setState(2832);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2834);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2841);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2835);
					match(LT);
					setState(2837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
					case 1:
						{
						setState(2836);
						complexColTypeList();
						}
						break;
					}
					setState(2839);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2840);
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
				setState(2843);
				identifier();
				setState(2854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2844);
					match(T__1);
					setState(2845);
					match(INTEGER_VALUE);
					setState(2850);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2846);
						match(T__3);
						setState(2847);
						match(INTEGER_VALUE);
						}
						}
						setState(2852);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2853);
					match(T__2);
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

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2858);
			qualifiedColTypeWithPosition();
			setState(2863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2859);
				match(T__3);
				setState(2860);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2865);
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

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2866);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2867);
			dataType();
			setState(2870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2868);
				match(NOT);
				setState(2869);
				match(NULL);
				}
			}

			setState(2873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2872);
				commentSpec();
				}
			}

			setState(2876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2875);
				colPosition();
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
		enterRule(_localctx, 230, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2878);
			colType();
			setState(2883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2879);
					match(T__3);
					setState(2880);
					colType();
					}
					} 
				}
				setState(2885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,373,_ctx);
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
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
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
		enterRule(_localctx, 232, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2886);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2887);
			dataType();
			setState(2890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				setState(2888);
				match(NOT);
				setState(2889);
				match(NULL);
				}
				break;
			}
			setState(2893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
			case 1:
				{
				setState(2892);
				commentSpec();
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
		enterRule(_localctx, 234, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2895);
			complexColType();
			setState(2900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2896);
				match(T__3);
				setState(2897);
				complexColType();
				}
				}
				setState(2902);
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
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
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
		enterRule(_localctx, 236, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			identifier();
			setState(2904);
			match(T__10);
			setState(2905);
			dataType();
			setState(2908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2906);
				match(NOT);
				setState(2907);
				match(NULL);
				}
			}

			setState(2911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2910);
				commentSpec();
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
		enterRule(_localctx, 238, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2913);
			match(WHEN);
			setState(2914);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2915);
			match(THEN);
			setState(2916);
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

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2918);
			match(WINDOW);
			setState(2919);
			namedWindow();
			setState(2924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,379,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2920);
					match(T__3);
					setState(2921);
					namedWindow();
					}
					} 
				}
				setState(2926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,379,_ctx);
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
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
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
		enterRule(_localctx, 242, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2927);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2928);
			match(AS);
			setState(2929);
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
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
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
		enterRule(_localctx, 244, RULE_windowSpec);
		int _la;
		try {
			setState(2977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2931);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2932);
				match(T__1);
				setState(2933);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2934);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2936);
				match(T__1);
				setState(2971);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2937);
					match(CLUSTER);
					setState(2938);
					match(BY);
					setState(2939);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2944);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2940);
						match(T__3);
						setState(2941);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2946);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__2:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(2957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2947);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2948);
						match(BY);
						setState(2949);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2954);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2950);
							match(T__3);
							setState(2951);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2956);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2969);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2959);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2960);
						match(BY);
						setState(2961);
						sortItem();
						setState(2966);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2962);
							match(T__3);
							setState(2963);
							sortItem();
							}
							}
							setState(2968);
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
				setState(2974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2973);
					windowFrame();
					}
				}

				setState(2976);
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
		enterRule(_localctx, 246, RULE_windowFrame);
		try {
			setState(2995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2979);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2980);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2981);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2982);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2983);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2984);
				match(BETWEEN);
				setState(2985);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2986);
				match(AND);
				setState(2987);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2989);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2990);
				match(BETWEEN);
				setState(2991);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2992);
				match(AND);
				setState(2993);
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
		enterRule(_localctx, 248, RULE_frameBound);
		int _la;
		try {
			setState(3004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2997);
				match(UNBOUNDED);
				setState(2998);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
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
				setState(2999);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3000);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3001);
				expression();
				setState(3002);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3006);
			qualifiedName();
			setState(3011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(3007);
				match(T__3);
				setState(3008);
				qualifiedName();
				}
				}
				setState(3013);
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

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_functionName);
		try {
			setState(3018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3014);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3015);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3016);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3017);
				match(RIGHT);
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
		enterRule(_localctx, 254, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3020);
			identifier();
			setState(3025);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3021);
					match(T__4);
					setState(3022);
					identifier();
					}
					} 
				}
				setState(3027);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,392,_ctx);
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

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3028);
			identifier();
			setState(3029);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SparkSqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SparkSqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3033); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3031);
						match(MINUS);
						setState(3032);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3035); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,393,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
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
		enterRule(_localctx, 260, RULE_identifier);
		try {
			setState(3043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,395,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3040);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3041);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3042);
				strictNonReserved();
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
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
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
		enterRule(_localctx, 262, RULE_strictIdentifier);
		try {
			setState(3051);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,396,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3045);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3046);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3047);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3048);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3049);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3050);
				nonReserved();
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
		enterRule(_localctx, 264, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3053);
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
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SparkSqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
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
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SparkSqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SparkSqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitExponentLiteral(this);
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
		enterRule(_localctx, 266, RULE_number);
		int _la;
		try {
			setState(3094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,406,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3055);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3057);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3056);
					match(MINUS);
					}
				}

				setState(3059);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3060);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3061);
					match(MINUS);
					}
				}

				setState(3064);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3065);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3066);
					match(MINUS);
					}
				}

				setState(3069);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3070);
					match(MINUS);
					}
				}

				setState(3073);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3074);
					match(MINUS);
					}
				}

				setState(3077);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3078);
					match(MINUS);
					}
				}

				setState(3081);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3082);
					match(MINUS);
					}
				}

				setState(3085);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3086);
					match(MINUS);
					}
				}

				setState(3089);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3090);
					match(MINUS);
					}
				}

				setState(3093);
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

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_alterColumnAction);
		int _la;
		try {
			setState(3103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3096);
				match(TYPE);
				setState(3097);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3098);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3099);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3100);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3101);
				match(NOT);
				setState(3102);
				match(NULL);
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

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkSqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkSqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlBaseParser.TERMINATED, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public TerminalNode DISTCP() { return getToken(SparkSqlBaseParser.DISTCP, 0); }
		public TerminalNode CLICKHOUSE() { return getToken(SparkSqlBaseParser.CLICKHOUSE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONVERT) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (ITEMS - 130)) | (1L << (KEYS - 130)) | (1L << (LAST - 130)) | (1L << (LATERAL - 130)) | (1L << (LAZY - 130)) | (1L << (LIKE - 130)) | (1L << (LIMIT - 130)) | (1L << (LINES - 130)) | (1L << (LIST - 130)) | (1L << (LOAD - 130)) | (1L << (LOCAL - 130)) | (1L << (LOCATION - 130)) | (1L << (LOCK - 130)) | (1L << (LOCKS - 130)) | (1L << (LOGICAL - 130)) | (1L << (MACRO - 130)) | (1L << (MAP - 130)) | (1L << (MATCHED - 130)) | (1L << (MERGE - 130)) | (1L << (MSCK - 130)) | (1L << (NAMESPACE - 130)) | (1L << (NAMESPACES - 130)) | (1L << (NO - 130)) | (1L << (NULLS - 130)) | (1L << (OF - 130)) | (1L << (OPTION - 130)) | (1L << (OPTIONS - 130)) | (1L << (OUT - 130)) | (1L << (OUTPUTFORMAT - 130)) | (1L << (OVER - 130)) | (1L << (OVERLAY - 130)) | (1L << (OVERWRITE - 130)) | (1L << (PARTITION - 130)) | (1L << (PARTITIONED - 130)) | (1L << (PARTITIONS - 130)) | (1L << (PARQUET - 130)) | (1L << (PERCENTLIT - 130)) | (1L << (PIVOT - 130)) | (1L << (PLACING - 130)) | (1L << (POSITION - 130)) | (1L << (PRECEDING - 130)) | (1L << (PRINCIPALS - 130)) | (1L << (PROPERTIES - 130)) | (1L << (PURGE - 130)) | (1L << (QUERY - 130)) | (1L << (RANGE - 130)) | (1L << (RECORDREADER - 130)) | (1L << (RECORDWRITER - 130)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (RECOVER - 194)) | (1L << (REDUCE - 194)) | (1L << (REFRESH - 194)) | (1L << (RENAME - 194)) | (1L << (REPAIR - 194)) | (1L << (REPLACE - 194)) | (1L << (RESET - 194)) | (1L << (RESTRICT - 194)) | (1L << (REVOKE - 194)) | (1L << (RETAIN - 194)) | (1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (RUN - 194)) | (1L << (SCHEMA - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (TOUCH - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (UNLOCK - 260)) | (1L << (UNSET - 260)) | (1L << (UPDATE - 260)) | (1L << (USE - 260)) | (1L << (VALUES - 260)) | (1L << (VACUUM - 260)) | (1L << (VIEW - 260)) | (1L << (VIEWS - 260)) | (1L << (WINDOW - 260)) | (1L << (KILL - 260)) | (1L << (READ - 260)) | (1L << (JOB - 260)) | (1L << (ADDJAR - 260)) | (1L << (COMPRESS - 260)) | (1L << (FILE - 260)) | (1L << (DISTCP - 260)) | (1L << (CLICKHOUSE - 260)) | (1L << (DIV - 260)))) != 0)) ) {
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

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SparkSqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SparkSqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SparkSqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SparkSqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SparkSqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SparkSqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SparkSqlBaseParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(SparkSqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SparkSqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SparkSqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SparkSqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SparkSqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SparkSqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SparkSqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SparkSqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3107);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXCEPT - 85)) | (1L << (FULL - 85)) | (1L << (INNER - 85)) | (1L << (INTERSECT - 85)) | (1L << (JOIN - 85)) | (1L << (LEFT - 85)))) != 0) || ((((_la - 158)) & ~0x3f) == 0 && ((1L << (_la - 158)) & ((1L << (NATURAL - 158)) | (1L << (ON - 158)) | (1L << (RIGHT - 158)) | (1L << (SEMI - 158)))) != 0) || ((((_la - 223)) & ~0x3f) == 0 && ((1L << (_la - 223)) & ((1L << (SETMINUS - 223)) | (1L << (UNION - 223)) | (1L << (USING - 223)))) != 0)) ) {
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

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SparkSqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SparkSqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SparkSqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SparkSqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SparkSqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SparkSqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SparkSqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SparkSqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SparkSqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SparkSqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SparkSqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SparkSqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SparkSqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SparkSqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SparkSqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SparkSqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SparkSqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SparkSqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SparkSqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SparkSqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SparkSqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SparkSqlBaseParser.CAST, 0); }
		public TerminalNode CHANGE() { return getToken(SparkSqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SparkSqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SparkSqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SparkSqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SparkSqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SparkSqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SparkSqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SparkSqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SparkSqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SparkSqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SparkSqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SparkSqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SparkSqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SparkSqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SparkSqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SparkSqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SparkSqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode CONVERT() { return getToken(SparkSqlBaseParser.CONVERT, 0); }
		public TerminalNode COST() { return getToken(SparkSqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SparkSqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SparkSqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SparkSqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SparkSqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SparkSqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SparkSqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SparkSqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SparkSqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SparkSqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SparkSqlBaseParser.DATABASES, 0); }
		public TerminalNode DAY() { return getToken(SparkSqlBaseParser.DAY, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SparkSqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFINED() { return getToken(SparkSqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SparkSqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SparkSqlBaseParser.DELIMITED, 0); }
		public TerminalNode DELTA() { return getToken(SparkSqlBaseParser.DELTA, 0); }
		public TerminalNode DESC() { return getToken(SparkSqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SparkSqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DETAIL() { return getToken(SparkSqlBaseParser.DETAIL, 0); }
		public TerminalNode DFS() { return getToken(SparkSqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SparkSqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SparkSqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SparkSqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SparkSqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SparkSqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SparkSqlBaseParser.DROP, 0); }
		public TerminalNode DRY() { return getToken(SparkSqlBaseParser.DRY, 0); }
		public TerminalNode ELSE() { return getToken(SparkSqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SparkSqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SparkSqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SparkSqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SparkSqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SparkSqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SparkSqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SparkSqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SparkSqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SparkSqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SparkSqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SparkSqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SparkSqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SparkSqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SparkSqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SparkSqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SparkSqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SparkSqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SparkSqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SparkSqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SparkSqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SparkSqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SparkSqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SparkSqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SparkSqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SparkSqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SparkSqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SparkSqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SparkSqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SparkSqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SparkSqlBaseParser.HOUR, 0); }
		public TerminalNode HOURS() { return getToken(SparkSqlBaseParser.HOURS, 0); }
		public TerminalNode HISTORY() { return getToken(SparkSqlBaseParser.HISTORY, 0); }
		public TerminalNode IF() { return getToken(SparkSqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SparkSqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SparkSqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SparkSqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SparkSqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SparkSqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SparkSqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SparkSqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SparkSqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SparkSqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SparkSqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SparkSqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SparkSqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SparkSqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SparkSqlBaseParser.LAST, 0); }
		public TerminalNode LATERAL() { return getToken(SparkSqlBaseParser.LATERAL, 0); }
		public TerminalNode LAZY() { return getToken(SparkSqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SparkSqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SparkSqlBaseParser.LIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SparkSqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SparkSqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SparkSqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SparkSqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SparkSqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SparkSqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SparkSqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SparkSqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SparkSqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SparkSqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SparkSqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SparkSqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SparkSqlBaseParser.MERGE, 0); }
		public TerminalNode MINUTE() { return getToken(SparkSqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SparkSqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SparkSqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SparkSqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SparkSqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SparkSqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SparkSqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SparkSqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SparkSqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SparkSqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SparkSqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SparkSqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SparkSqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SparkSqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SparkSqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SparkSqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SparkSqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SparkSqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SparkSqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SparkSqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SparkSqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SparkSqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SparkSqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SparkSqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SparkSqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PARQUET() { return getToken(SparkSqlBaseParser.PARQUET, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SparkSqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SparkSqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SparkSqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SparkSqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SparkSqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SparkSqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SparkSqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SparkSqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SparkSqlBaseParser.PURGE, 0); }
		public TerminalNode QUERY() { return getToken(SparkSqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SparkSqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SparkSqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SparkSqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SparkSqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SparkSqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SparkSqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SparkSqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SparkSqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SparkSqlBaseParser.REPAIR, 0); }
		public TerminalNode REPLACE() { return getToken(SparkSqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SparkSqlBaseParser.RESET, 0); }
		public TerminalNode RESTRICT() { return getToken(SparkSqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SparkSqlBaseParser.REVOKE, 0); }
		public TerminalNode RETAIN() { return getToken(SparkSqlBaseParser.RETAIN, 0); }
		public TerminalNode RLIKE() { return getToken(SparkSqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SparkSqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SparkSqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SparkSqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SparkSqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SparkSqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SparkSqlBaseParser.ROWS, 0); }
		public TerminalNode RUN() { return getToken(SparkSqlBaseParser.RUN, 0); }
		public TerminalNode SCHEMA() { return getToken(SparkSqlBaseParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SparkSqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SparkSqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SparkSqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SparkSqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SparkSqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SparkSqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SparkSqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SparkSqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SparkSqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SparkSqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SparkSqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SparkSqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SparkSqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SparkSqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SparkSqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SparkSqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SparkSqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SparkSqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SparkSqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SparkSqlBaseParser.SUBSTRING, 0); }
		public TerminalNode TABLE() { return getToken(SparkSqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SparkSqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SparkSqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SparkSqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SparkSqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SparkSqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SparkSqlBaseParser.THEN, 0); }
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SparkSqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SparkSqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SparkSqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SparkSqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SparkSqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SparkSqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SparkSqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SparkSqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TYPE() { return getToken(SparkSqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SparkSqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SparkSqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SparkSqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SparkSqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SparkSqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SparkSqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SparkSqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SparkSqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SparkSqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SparkSqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SparkSqlBaseParser.VALUES, 0); }
		public TerminalNode VACUUM() { return getToken(SparkSqlBaseParser.VACUUM, 0); }
		public TerminalNode VIEW() { return getToken(SparkSqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SparkSqlBaseParser.VIEWS, 0); }
		public TerminalNode WHEN() { return getToken(SparkSqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SparkSqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SparkSqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SparkSqlBaseParser.WITH, 0); }
		public TerminalNode YEAR() { return getToken(SparkSqlBaseParser.YEAR, 0); }
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public TerminalNode DISTCP() { return getToken(SparkSqlBaseParser.DISTCP, 0); }
		public TerminalNode CLICKHOUSE() { return getToken(SparkSqlBaseParser.CLICKHOUSE, 0); }
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
		enterRule(_localctx, 274, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << CONVERT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DAY - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (INTO - 128)) | (1L << (IS - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (LAST - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MINUTE - 128)) | (1L << (MONTH - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PARQUET - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (RECORDREADER - 192)) | (1L << (RECORDWRITER - 192)) | (1L << (RECOVER - 192)) | (1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RETAIN - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (RUN - 192)) | (1L << (SCHEMA - 192)) | (1L << (SECOND - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNCACHE - 256)) | (1L << (UNIQUE - 256)) | (1L << (UNKNOWN - 256)) | (1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VACUUM - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (YEAR - 256)) | (1L << (KILL - 256)) | (1L << (READ - 256)) | (1L << (JOB - 256)) | (1L << (ADDJAR - 256)) | (1L << (COMPRESS - 256)) | (1L << (FILE - 256)) | (1L << (DISTCP - 256)) | (1L << (CLICKHOUSE - 256)) | (1L << (DIV - 256)))) != 0)) ) {
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
		case 7:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 41:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 95:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 97:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 98:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 130:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 131:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 133:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !legacy_create_hive_table_by_default_enabled;
		case 1:
			return legacy_create_hive_table_by_default_enabled;
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return legacy_setops_precedence_enbled;
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return !legacy_setops_precedence_enbled;
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return !legacy_setops_precedence_enbled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return SQL_standard_keyword_behavior;
		case 20:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 22:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 23:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013f\u0c2a\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\3\2\3\2\7\2\u0119\n\2\f\2\16\2\u011c"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u0134\n\t\3\t\3\t\3\t\5\t\u0139\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0141\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0149\n\t"+
		"\f\t\16\t\u014c\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u015f\n\t\3\t\3\t\5\t\u0163\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0169\n\t\3\t\5\t\u016c\n\t\3\t\5\t\u016f\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0177\n\t\3\t\5\t\u017a\n\t\3\t\3\t\5\t\u017e\n\t\3\t\5\t\u0181"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0189\n\t\3\t\3\t\3\t\5\t\u018e\n\t\3"+
		"\t\5\t\u0191\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0198\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u01a4\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u01af\n\t\f\t\16\t\u01b2\13\t\3\t\5\t\u01b5\n\t\3\t\5\t\u01b8\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u01bf\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u01ca\n\t\f\t\16\t\u01cd\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d4\n\t\3"+
		"\t\3\t\3\t\5\t\u01d9\n\t\3\t\5\t\u01dc\n\t\3\t\3\t\3\t\3\t\5\t\u01e2\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01ed\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u022d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0236"+
		"\n\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t\3\t\3\t\5\t\u0240\n\t\3\t\3\t\5\t\u0244"+
		"\n\t\3\t\3\t\3\t\5\t\u0249\n\t\3\t\3\t\3\t\3\t\5\t\u024f\n\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0257\n\t\3\t\3\t\3\t\3\t\5\t\u025d\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u026a\n\t\3\t\6\t\u026d\n\t\r\t\16"+
		"\t\u026e\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u027f"+
		"\n\t\3\t\3\t\3\t\7\t\u0284\n\t\f\t\16\t\u0287\13\t\3\t\5\t\u028a\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0290\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u029f\n\t\3\t\3\t\5\t\u02a3\n\t\3\t\3\t\3\t\3\t\5\t\u02a9"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u02af\n\t\3\t\5\t\u02b2\n\t\3\t\5\t\u02b5\n\t"+
		"\3\t\3\t\3\t\3\t\5\t\u02bb\n\t\3\t\3\t\5\t\u02bf\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\t\u02c7\n\t\f\t\16\t\u02ca\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02d2"+
		"\n\t\3\t\5\t\u02d5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02de\n\t\3\t\3"+
		"\t\3\t\5\t\u02e3\n\t\3\t\3\t\3\t\3\t\5\t\u02e9\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u02f0\n\t\3\t\5\t\u02f3\n\t\3\t\3\t\3\t\3\t\5\t\u02f9\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u0302\n\t\f\t\16\t\u0305\13\t\5\t\u0307\n\t\3"+
		"\t\3\t\5\t\u030b\n\t\3\t\3\t\3\t\5\t\u0310\n\t\3\t\3\t\3\t\5\t\u0315\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u031c\n\t\3\t\5\t\u031f\n\t\3\t\5\t\u0322\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u0329\n\t\3\t\3\t\3\t\5\t\u032e\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0337\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u033f\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0345\n\t\3\t\5\t\u0348\n\t\3\t\5\t\u034b\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0351\n\t\3\t\3\t\5\t\u0355\n\t\3\t\3\t\5\t\u0359\n"+
		"\t\3\t\3\t\5\t\u035d\n\t\5\t\u035f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0367"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u036f\n\t\3\t\3\t\3\t\3\t\5\t\u0375\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0381\n\t\3\t\3\t\5\t\u0385"+
		"\n\t\3\t\5\t\u0388\n\t\3\t\3\t\5\t\u038c\n\t\3\t\5\t\u038f\n\t\3\t\3\t"+
		"\5\t\u0393\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03aa\n\t\f\t\16\t\u03ad\13\t\5\t\u03af"+
		"\n\t\3\t\3\t\5\t\u03b3\n\t\3\t\3\t\3\t\3\t\5\t\u03b9\n\t\3\t\5\t\u03bc"+
		"\n\t\3\t\5\t\u03bf\n\t\3\t\3\t\3\t\3\t\5\t\u03c5\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u03cd\n\t\3\t\3\t\3\t\5\t\u03d2\n\t\3\t\3\t\3\t\3\t\5\t\u03d8"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u03de\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u03e8\n\t\f\t\16\t\u03eb\13\t\5\t\u03ed\n\t\3\t\3\t\3\t\7\t\u03f2\n\t"+
		"\f\t\16\t\u03f5\13\t\3\t\3\t\7\t\u03f9\n\t\f\t\16\t\u03fc\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0403\n\t\3\t\3\t\5\t\u0407\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0412\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u041e\n\t\3\t\5\t\u0421\n\t\3\t\3\t\3\t\3\t\5\t\u0427\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u042d\n\t\3\t\3\t\3\t\3\t\5\t\u0433\n\t\3\t\3\t\5\t\u0437\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u043e\n\t\3\t\5\t\u0441\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0447\n\t\3\t\3\t\3\t\3\t\5\t\u044d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0455\n\t\3\t\3\t\5\t\u0459\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0465\n\t\3\t\3\t\5\t\u0469\n\t\3\t\3\t\7\t\u046d\n\t\f\t\16"+
		"\t\u0470\13\t\5\t\u0472\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u047c\n\13\3\13\3\13\5\13\u0480\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0487"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u04fb\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0503"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u050b\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0514\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u051e\n\13\3\f\3\f\5\f\u0522\n\f\3\f\5\f\u0525\n\f\3\f\3\f\3\f\3"+
		"\f\5\f\u052b\n\f\3\f\3\f\3\r\3\r\5\r\u0531\n\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u053d\n\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0549\n\17\3\17\3\17\3\17\5\17\u054e\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\5\22\u0557\n\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\5\23\u055f\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0566\n\23\5"+
		"\23\u0568\n\23\3\23\3\23\3\23\5\23\u056d\n\23\3\23\3\23\5\23\u0571\n\23"+
		"\3\23\3\23\3\23\5\23\u0576\n\23\3\23\3\23\3\23\5\23\u057b\n\23\3\23\3"+
		"\23\3\23\5\23\u0580\n\23\3\23\5\23\u0583\n\23\3\23\3\23\3\23\5\23\u0588"+
		"\n\23\3\23\3\23\5\23\u058c\n\23\3\23\3\23\3\23\5\23\u0591\n\23\5\23\u0593"+
		"\n\23\3\24\3\24\5\24\u0597\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u059e\n"+
		"\25\f\25\16\25\u05a1\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u05a8\n\26\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u05b1\n\30\3\31\3\31\3\31\7\31"+
		"\u05b6\n\31\f\31\16\31\u05b9\13\31\3\32\3\32\3\32\3\32\7\32\u05bf\n\32"+
		"\f\32\16\32\u05c2\13\32\3\33\3\33\5\33\u05c6\n\33\3\33\5\33\u05c9\n\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u05de\n\35\f\35\16\35\u05e1\13\35\3\36"+
		"\3\36\3\36\3\36\7\36\u05e7\n\36\f\36\16\36\u05ea\13\36\3\36\3\36\3\37"+
		"\3\37\5\37\u05f0\n\37\3\37\5\37\u05f3\n\37\3 \3 \3 \7 \u05f8\n \f \16"+
		" \u05fb\13 \3 \5 \u05fe\n \3!\3!\3!\3!\5!\u0604\n!\3\"\3\"\3\"\3\"\7\""+
		"\u060a\n\"\f\"\16\"\u060d\13\"\3\"\3\"\3#\3#\3#\3#\7#\u0615\n#\f#\16#"+
		"\u0618\13#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u0622\n$\3%\3%\3%\3%\3%\5%\u0629"+
		"\n%\3&\3&\3&\3&\5&\u062f\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\6(\u063a\n("+
		"\r(\16(\u063b\3(\3(\3(\3(\3(\5(\u0643\n(\3(\3(\3(\3(\3(\5(\u064a\n(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0656\n(\3(\3(\3(\3(\7(\u065c\n(\f(\16"+
		"(\u065f\13(\3(\7(\u0662\n(\f(\16(\u0665\13(\5(\u0667\n(\3)\3)\3)\3)\3"+
		")\7)\u066e\n)\f)\16)\u0671\13)\5)\u0673\n)\3)\3)\3)\3)\3)\7)\u067a\n)"+
		"\f)\16)\u067d\13)\5)\u067f\n)\3)\3)\3)\3)\3)\7)\u0686\n)\f)\16)\u0689"+
		"\13)\5)\u068b\n)\3)\3)\3)\3)\3)\7)\u0692\n)\f)\16)\u0695\13)\5)\u0697"+
		"\n)\3)\5)\u069a\n)\3)\3)\3)\5)\u069f\n)\5)\u06a1\n)\3*\3*\3*\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u06ad\n+\3+\3+\3+\3+\3+\5+\u06b4\n+\3+\3+\3+\3+\3+\5+"+
		"\u06bb\n+\3+\7+\u06be\n+\f+\16+\u06c1\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u06cc\n,\3-\3-\5-\u06d0\n-\3-\3-\5-\u06d4\n-\3.\3.\6.\u06d8\n.\r.\16"+
		".\u06d9\3/\3/\5/\u06de\n/\3/\3/\3/\3/\7/\u06e4\n/\f/\16/\u06e7\13/\3/"+
		"\5/\u06ea\n/\3/\5/\u06ed\n/\3/\5/\u06f0\n/\3/\5/\u06f3\n/\3/\3/\5/\u06f7"+
		"\n/\3\60\3\60\5\60\u06fb\n\60\3\60\5\60\u06fe\n\60\3\60\3\60\5\60\u0702"+
		"\n\60\3\60\7\60\u0705\n\60\f\60\16\60\u0708\13\60\3\60\5\60\u070b\n\60"+
		"\3\60\5\60\u070e\n\60\3\60\5\60\u0711\n\60\3\60\5\60\u0714\n\60\5\60\u0716"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0722\n\61"+
		"\3\61\5\61\u0725\n\61\3\61\3\61\5\61\u0729\n\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\5\61\u0733\n\61\3\61\3\61\5\61\u0737\n\61\5\61\u0739"+
		"\n\61\3\61\5\61\u073c\n\61\3\61\3\61\5\61\u0740\n\61\3\62\3\62\7\62\u0744"+
		"\n\62\f\62\16\62\u0747\13\62\3\62\5\62\u074a\n\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\5\64\u0755\n\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u075f\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u076b\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\7\67\u0778\n\67\f\67\16\67\u077b\13\67\3\67\3\67\5\67\u077f\n\67"+
		"\38\38\38\78\u0784\n8\f8\168\u0787\138\39\39\39\39\3:\3:\3:\3;\3;\3;\3"+
		"<\3<\3<\5<\u0796\n<\3<\7<\u0799\n<\f<\16<\u079c\13<\3<\3<\3=\3=\3=\3="+
		"\3=\3=\7=\u07a6\n=\f=\16=\u07a9\13=\3=\3=\5=\u07ad\n=\3>\3>\3>\3>\7>\u07b3"+
		"\n>\f>\16>\u07b6\13>\3>\7>\u07b9\n>\f>\16>\u07bc\13>\3>\5>\u07bf\n>\3"+
		"?\3?\3?\3?\3?\7?\u07c6\n?\f?\16?\u07c9\13?\3?\3?\3?\3?\3?\3?\3?\3?\3?"+
		"\3?\7?\u07d5\n?\f?\16?\u07d8\13?\3?\3?\5?\u07dc\n?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\7?\u07e6\n?\f?\16?\u07e9\13?\3?\3?\5?\u07ed\n?\3@\3@\3@\3@\7@\u07f3"+
		"\n@\f@\16@\u07f6\13@\5@\u07f8\n@\3@\3@\5@\u07fc\n@\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\7A\u0808\nA\fA\16A\u080b\13A\3A\3A\3A\3B\3B\3B\3B\3B\7B\u0815"+
		"\nB\fB\16B\u0818\13B\3B\3B\5B\u081c\nB\3C\3C\5C\u0820\nC\3C\5C\u0823\n"+
		"C\3D\3D\3D\5D\u0828\nD\3D\3D\3D\3D\3D\7D\u082f\nD\fD\16D\u0832\13D\5D"+
		"\u0834\nD\3D\3D\3D\5D\u0839\nD\3D\3D\3D\7D\u083e\nD\fD\16D\u0841\13D\5"+
		"D\u0843\nD\3E\3E\3F\3F\7F\u0849\nF\fF\16F\u084c\13F\3G\3G\3G\3G\5G\u0852"+
		"\nG\3G\3G\3G\3G\3G\5G\u0859\nG\3H\5H\u085c\nH\3H\3H\3H\5H\u0861\nH\3H"+
		"\5H\u0864\nH\3H\3H\3H\5H\u0869\nH\3H\3H\5H\u086d\nH\3H\5H\u0870\nH\3H"+
		"\5H\u0873\nH\3I\3I\3I\3I\5I\u0879\nI\3J\3J\3J\5J\u087e\nJ\3J\3J\3K\5K"+
		"\u0883\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0895\nK"+
		"\5K\u0897\nK\3K\5K\u089a\nK\3L\3L\3L\3L\3M\3M\3M\7M\u08a3\nM\fM\16M\u08a6"+
		"\13M\3N\3N\3N\3N\7N\u08ac\nN\fN\16N\u08af\13N\3N\3N\3O\3O\5O\u08b5\nO"+
		"\3P\3P\3P\3P\7P\u08bb\nP\fP\16P\u08be\13P\3P\3P\3Q\3Q\5Q\u08c4\nQ\3R\3"+
		"R\5R\u08c8\nR\3R\3R\3R\3R\3R\3R\5R\u08d0\nR\3R\3R\3R\3R\3R\3R\5R\u08d8"+
		"\nR\3R\3R\3R\3R\5R\u08de\nR\3S\3S\3S\3S\7S\u08e4\nS\fS\16S\u08e7\13S\3"+
		"S\3S\3T\3T\3T\3T\3T\7T\u08f0\nT\fT\16T\u08f3\13T\5T\u08f5\nT\3T\3T\3T"+
		"\3U\5U\u08fb\nU\3U\3U\5U\u08ff\nU\5U\u0901\nU\3V\3V\3V\3V\3V\3V\3V\5V"+
		"\u090a\nV\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0916\nV\5V\u0918\nV\3V\3V"+
		"\3V\3V\3V\5V\u091f\nV\3V\3V\3V\3V\3V\5V\u0926\nV\3V\3V\3V\3V\5V\u092c"+
		"\nV\3V\3V\3V\3V\5V\u0932\nV\5V\u0934\nV\3W\3W\3W\7W\u0939\nW\fW\16W\u093c"+
		"\13W\3X\3X\3X\7X\u0941\nX\fX\16X\u0944\13X\3Y\3Y\3Y\5Y\u0949\nY\3Y\3Y"+
		"\3Z\3Z\3Z\5Z\u0950\nZ\3Z\3Z\3[\3[\5[\u0956\n[\3[\3[\5[\u095a\n[\5[\u095c"+
		"\n[\3\\\3\\\3\\\7\\\u0961\n\\\f\\\16\\\u0964\13\\\3]\3]\3]\3]\7]\u096a"+
		"\n]\f]\16]\u096d\13]\3]\3]\3^\3^\3^\3^\3^\3^\7^\u0977\n^\f^\16^\u097a"+
		"\13^\3^\3^\5^\u097e\n^\3_\3_\5_\u0982\n_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\3a\3a\5a\u0990\na\5a\u0992\na\3a\3a\3a\3a\3a\3a\7a\u099a\na\fa\16a\u099d"+
		"\13a\3b\5b\u09a0\nb\3b\3b\3b\3b\3b\3b\5b\u09a8\nb\3b\3b\3b\3b\3b\7b\u09af"+
		"\nb\fb\16b\u09b2\13b\3b\3b\3b\5b\u09b7\nb\3b\3b\3b\3b\3b\3b\5b\u09bf\n"+
		"b\3b\3b\3b\5b\u09c4\nb\3b\3b\3b\3b\5b\u09ca\nb\3b\3b\5b\u09ce\nb\3b\3"+
		"b\3b\5b\u09d3\nb\3b\3b\3b\5b\u09d8\nb\3b\3b\3b\5b\u09dd\nb\3c\3c\3c\3"+
		"c\5c\u09e3\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\7c\u09f8\nc\fc\16c\u09fb\13c\3d\3d\3d\3d\6d\u0a01\nd\rd\16d\u0a02\3"+
		"d\3d\5d\u0a07\nd\3d\3d\3d\3d\3d\6d\u0a0e\nd\rd\16d\u0a0f\3d\3d\5d\u0a14"+
		"\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7d\u0a24\nd\fd\16d\u0a27"+
		"\13d\5d\u0a29\nd\3d\3d\3d\3d\3d\3d\5d\u0a31\nd\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u0a3a\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\6"+
		"d\u0a4f\nd\rd\16d\u0a50\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0a5c\nd\3d\3d\3"+
		"d\7d\u0a61\nd\fd\16d\u0a64\13d\5d\u0a66\nd\3d\3d\3d\3d\3d\3d\3d\5d\u0a6f"+
		"\nd\3d\3d\5d\u0a73\nd\3d\3d\3d\3d\3d\3d\3d\3d\6d\u0a7d\nd\rd\16d\u0a7e"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\5d\u0a98\nd\3d\3d\3d\3d\3d\5d\u0a9f\nd\3d\5d\u0aa2\nd\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0ab1\nd\3d\3d\5d\u0ab5\nd\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\7d\u0abf\nd\fd\16d\u0ac2\13d\3e\3e\3e\3e\3e\3e\3e\3e\6e\u0acc"+
		"\ne\re\16e\u0acd\5e\u0ad0\ne\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3j\5j\u0add"+
		"\nj\3k\3k\5k\u0ae1\nk\3l\3l\3l\6l\u0ae6\nl\rl\16l\u0ae7\3m\3m\3m\5m\u0aed"+
		"\nm\3n\3n\3n\3n\3n\3o\5o\u0af5\no\3o\3o\5o\u0af9\no\3p\3p\3p\3p\3p\3p"+
		"\3p\5p\u0b02\np\3q\3q\3q\5q\u0b07\nq\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\5r\u0b18\nr\3r\3r\5r\u0b1c\nr\3r\3r\3r\3r\3r\7r\u0b23\nr"+
		"\fr\16r\u0b26\13r\3r\5r\u0b29\nr\5r\u0b2b\nr\3s\3s\3s\7s\u0b30\ns\fs\16"+
		"s\u0b33\13s\3t\3t\3t\3t\5t\u0b39\nt\3t\5t\u0b3c\nt\3t\5t\u0b3f\nt\3u\3"+
		"u\3u\7u\u0b44\nu\fu\16u\u0b47\13u\3v\3v\3v\3v\5v\u0b4d\nv\3v\5v\u0b50"+
		"\nv\3w\3w\3w\7w\u0b55\nw\fw\16w\u0b58\13w\3x\3x\3x\3x\3x\5x\u0b5f\nx\3"+
		"x\5x\u0b62\nx\3y\3y\3y\3y\3y\3z\3z\3z\3z\7z\u0b6d\nz\fz\16z\u0b70\13z"+
		"\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\7|\u0b81\n|\f|\16|\u0b84"+
		"\13|\3|\3|\3|\3|\3|\7|\u0b8b\n|\f|\16|\u0b8e\13|\5|\u0b90\n|\3|\3|\3|"+
		"\3|\3|\7|\u0b97\n|\f|\16|\u0b9a\13|\5|\u0b9c\n|\5|\u0b9e\n|\3|\5|\u0ba1"+
		"\n|\3|\5|\u0ba4\n|\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\3}\5}"+
		"\u0bb6\n}\3~\3~\3~\3~\3~\3~\3~\5~\u0bbf\n~\3\177\3\177\3\177\7\177\u0bc4"+
		"\n\177\f\177\16\177\u0bc7\13\177\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080"+
		"\u0bcd\n\u0080\3\u0081\3\u0081\3\u0081\7\u0081\u0bd2\n\u0081\f\u0081\16"+
		"\u0081\u0bd5\13\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\6\u0083"+
		"\u0bdc\n\u0083\r\u0083\16\u0083\u0bdd\3\u0083\5\u0083\u0be1\n\u0083\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u0be6\n\u0084\3\u0085\3\u0085\3\u0085\3"+
		"\u0085\3\u0085\3\u0085\5\u0085\u0bee\n\u0085\3\u0086\3\u0086\3\u0087\3"+
		"\u0087\5\u0087\u0bf4\n\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0bf9\n\u0087"+
		"\3\u0087\3\u0087\3\u0087\5\u0087\u0bfe\n\u0087\3\u0087\3\u0087\5\u0087"+
		"\u0c02\n\u0087\3\u0087\3\u0087\5\u0087\u0c06\n\u0087\3\u0087\3\u0087\5"+
		"\u0087\u0c0a\n\u0087\3\u0087\3\u0087\5\u0087\u0c0e\n\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0c12\n\u0087\3\u0087\3\u0087\5\u0087\u0c16\n\u0087\3\u0087\5"+
		"\u0087\u0c19\n\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3"+
		"\u0088\5\u0088\u0c22\n\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3"+
		"\u008b\3\u008b\7\u03ab\u03e9\u03f3\u03fa\u046e\6T\u00c0\u00c4\u00c6\u008c"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114\2,\4\2DD\u00be\u00be"+
		"\4\2\"\"\u00cc\u00cc\4\2BB\u009f\u009f\4\2jjyy\3\2-.\4\2\u00ef\u00ef\u010e"+
		"\u010e\4\2\21\21%%\7\2**\67\67\\\\ii\u0096\u0096\3\2IJ\4\2\\\\ii\4\2\u00a3"+
		"\u00a3\u0130\u0130\4\2\16\16\u008f\u008f\4\2HH\u00b6\u00b6\5\2AA\u009e"+
		"\u009e\u00d8\u00d8\6\2WW\u0080\u0080\u00e1\u00e1\u0103\u0103\5\2WW\u00e1"+
		"\u00e1\u0103\u0103\4\2\31\31II\4\2dd\u0087\u0087\4\2\20\20OO\4\2\u0134"+
		"\u0134\u0136\u0136\5\2__\u00fd\u00fd\u0105\u0105\4\2\u0125\u0126\u012b"+
		"\u012b\3\2\u0127\u012a\4\2\u0125\u0126\u012e\u012e\4\2<<>>\3\2\u00ed\u00ee"+
		"\4\2\6\6jj\4\2\6\6ff\5\2\35\35\u008a\u008a\u00f8\u00f8\3\2\u011d\u0124"+
		"\3\2\u0125\u012f\6\2\23\23yy\u00a2\u00a2\u00aa\u00aa\4\2__\u00fd\u00fd"+
		"\3\2\u0125\u0126\4\2PP\u00b3\u00b3\4\2\u00ab\u00ab\u00e6\u00e6\4\2ee\u00bb"+
		"\u00bb\3\2\u0135\u0136\4\2QQ\u00e0\u00e0\66\2\16\17\21\22\24\24\26\27"+
		"\31\32\34\34\36\"%%\'*,,.\64\66\67:;@BDNPRVVX^aacehilnqqtxz{}\177\u0081"+
		"\u0081\u0084\u0084\u0086\u0089\u008c\u008f\u0091\u009a\u009d\u009f\u00a1"+
		"\u00a1\u00a4\u00a5\u00a8\u00a9\u00ac\u00ac\u00ae\u00af\u00b1\u00bb\u00bd"+
		"\u00c5\u00c7\u00ce\u00d0\u00d8\u00db\u00de\u00e0\u00e4\u00e6\u00ee\u00f0"+
		"\u00f4\u00f7\u00f7\u00f9\u0102\u0106\u0109\u010c\u010f\u0112\u0112\u0115"+
		"\u011c\u012a\u012a\21\2\24\2499WWkk||\u0080\u0080\u0085\u0085\u008b\u008b"+
		"\u00a0\u00a0\u00a6\u00a6\u00cf\u00cf\u00db\u00db\u00e1\u00e1\u0103\u0103"+
		"\u010b\u010b\24\2\16\23\258:VXjl{}\177\u0081\u0084\u0086\u008a\u008c\u008f"+
		"\u0091\u009f\u00a1\u00a5\u00a7\u00ce\u00d0\u00da\u00dc\u00e0\u00e2\u0102"+
		"\u0104\u010a\u010c\u011c\u012a\u012a\2\u0e1c\2\u0116\3\2\2\2\4\u011f\3"+
		"\2\2\2\6\u0122\3\2\2\2\b\u0125\3\2\2\2\n\u0128\3\2\2\2\f\u012b\3\2\2\2"+
		"\16\u012e\3\2\2\2\20\u0471\3\2\2\2\22\u0473\3\2\2\2\24\u051d\3\2\2\2\26"+
		"\u051f\3\2\2\2\30\u0530\3\2\2\2\32\u0536\3\2\2\2\34\u0542\3\2\2\2\36\u054f"+
		"\3\2\2\2 \u0552\3\2\2\2\"\u0556\3\2\2\2$\u0592\3\2\2\2&\u0594\3\2\2\2"+
		"(\u0598\3\2\2\2*\u05a4\3\2\2\2,\u05a9\3\2\2\2.\u05b0\3\2\2\2\60\u05b2"+
		"\3\2\2\2\62\u05ba\3\2\2\2\64\u05c3\3\2\2\2\66\u05ce\3\2\2\28\u05df\3\2"+
		"\2\2:\u05e2\3\2\2\2<\u05ed\3\2\2\2>\u05fd\3\2\2\2@\u0603\3\2\2\2B\u0605"+
		"\3\2\2\2D\u0610\3\2\2\2F\u0621\3\2\2\2H\u0628\3\2\2\2J\u062a\3\2\2\2L"+
		"\u0630\3\2\2\2N\u0666\3\2\2\2P\u0672\3\2\2\2R\u06a2\3\2\2\2T\u06a5\3\2"+
		"\2\2V\u06cb\3\2\2\2X\u06cd\3\2\2\2Z\u06d5\3\2\2\2\\\u06f6\3\2\2\2^\u0715"+
		"\3\2\2\2`\u0721\3\2\2\2b\u0741\3\2\2\2d\u074d\3\2\2\2f\u0750\3\2\2\2h"+
		"\u0759\3\2\2\2j\u076a\3\2\2\2l\u077e\3\2\2\2n\u0780\3\2\2\2p\u0788\3\2"+
		"\2\2r\u078c\3\2\2\2t\u078f\3\2\2\2v\u0792\3\2\2\2x\u07ac\3\2\2\2z\u07ae"+
		"\3\2\2\2|\u07ec\3\2\2\2~\u07fb\3\2\2\2\u0080\u07fd\3\2\2\2\u0082\u081b"+
		"\3\2\2\2\u0084\u081d\3\2\2\2\u0086\u0824\3\2\2\2\u0088\u0844\3\2\2\2\u008a"+
		"\u0846\3\2\2\2\u008c\u0858\3\2\2\2\u008e\u0872\3\2\2\2\u0090\u0878\3\2"+
		"\2\2\u0092\u087a\3\2\2\2\u0094\u0899\3\2\2\2\u0096\u089b\3\2\2\2\u0098"+
		"\u089f\3\2\2\2\u009a\u08a7\3\2\2\2\u009c\u08b2\3\2\2\2\u009e\u08b6\3\2"+
		"\2\2\u00a0\u08c1\3\2\2\2\u00a2\u08dd\3\2\2\2\u00a4\u08df\3\2\2\2\u00a6"+
		"\u08ea\3\2\2\2\u00a8\u0900\3\2\2\2\u00aa\u0933\3\2\2\2\u00ac\u0935\3\2"+
		"\2\2\u00ae\u093d\3\2\2\2\u00b0\u0948\3\2\2\2\u00b2\u094f\3\2\2\2\u00b4"+
		"\u0953\3\2\2\2\u00b6\u095d\3\2\2\2\u00b8\u0965\3\2\2\2\u00ba\u097d\3\2"+
		"\2\2\u00bc\u0981\3\2\2\2\u00be\u0983\3\2\2\2\u00c0\u0991\3\2\2\2\u00c2"+
		"\u09dc\3\2\2\2\u00c4\u09e2\3\2\2\2\u00c6\u0ab4\3\2\2\2\u00c8\u0acf\3\2"+
		"\2\2\u00ca\u0ad1\3\2\2\2\u00cc\u0ad3\3\2\2\2\u00ce\u0ad5\3\2\2\2\u00d0"+
		"\u0ad7\3\2\2\2\u00d2\u0ad9\3\2\2\2\u00d4\u0ade\3\2\2\2\u00d6\u0ae5\3\2"+
		"\2\2\u00d8\u0ae9\3\2\2\2\u00da\u0aee\3\2\2\2\u00dc\u0af8\3\2\2\2\u00de"+
		"\u0b01\3\2\2\2\u00e0\u0b06\3\2\2\2\u00e2\u0b2a\3\2\2\2\u00e4\u0b2c\3\2"+
		"\2\2\u00e6\u0b34\3\2\2\2\u00e8\u0b40\3\2\2\2\u00ea\u0b48\3\2\2\2\u00ec"+
		"\u0b51\3\2\2\2\u00ee\u0b59\3\2\2\2\u00f0\u0b63\3\2\2\2\u00f2\u0b68\3\2"+
		"\2\2\u00f4\u0b71\3\2\2\2\u00f6\u0ba3\3\2\2\2\u00f8\u0bb5\3\2\2\2\u00fa"+
		"\u0bbe\3\2\2\2\u00fc\u0bc0\3\2\2\2\u00fe\u0bcc\3\2\2\2\u0100\u0bce\3\2"+
		"\2\2\u0102\u0bd6\3\2\2\2\u0104\u0be0\3\2\2\2\u0106\u0be5\3\2\2\2\u0108"+
		"\u0bed\3\2\2\2\u010a\u0bef\3\2\2\2\u010c\u0c18\3\2\2\2\u010e\u0c21\3\2"+
		"\2\2\u0110\u0c23\3\2\2\2\u0112\u0c25\3\2\2\2\u0114\u0c27\3\2\2\2\u0116"+
		"\u011a\5\20\t\2\u0117\u0119\7\3\2\2\u0118\u0117\3\2\2\2\u0119\u011c\3"+
		"\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\u011e\7\2\2\3\u011e\3\3\2\2\2\u011f\u0120\5\u00b4"+
		"[\2\u0120\u0121\7\2\2\3\u0121\5\3\2\2\2\u0122\u0123\5\u00b0Y\2\u0123\u0124"+
		"\7\2\2\3\u0124\7\3\2\2\2\u0125\u0126\5\u00aeX\2\u0126\u0127\7\2\2\3\u0127"+
		"\t\3\2\2\2\u0128\u0129\5\u00b2Z\2\u0129\u012a\7\2\2\3\u012a\13\3\2\2\2"+
		"\u012b\u012c\5\u00e2r\2\u012c\u012d\7\2\2\3\u012d\r\3\2\2\2\u012e\u012f"+
		"\5\u00e8u\2\u012f\u0130\7\2\2\3\u0130\17\3\2\2\2\u0131\u0472\5\"\22\2"+
		"\u0132\u0134\5\62\32\2\u0133\u0132\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135"+
		"\3\2\2\2\u0135\u0472\5N(\2\u0136\u0138\7\u0109\2\2\u0137\u0139\7\u009e"+
		"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0472\5\u00aeX\2\u013b\u013c\78\2\2\u013c\u0140\5,\27\2\u013d\u013e\7"+
		"v\2\2\u013e\u013f\7\u00a2\2\2\u013f\u0141\7Y\2\2\u0140\u013d\3\2\2\2\u0140"+
		"\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u014a\5\u00aeX\2\u0143\u0149"+
		"\5 \21\2\u0144\u0149\5\36\20\2\u0145\u0146\7\u0113\2\2\u0146\u0147\t\2"+
		"\2\2\u0147\u0149\5:\36\2\u0148\u0143\3\2\2\2\u0148\u0144\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u0472\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\21\2\2\u014e"+
		"\u014f\5,\27\2\u014f\u0150\5\u00aeX\2\u0150\u0151\7\u00e0\2\2\u0151\u0152"+
		"\t\2\2\2\u0152\u0153\5:\36\2\u0153\u0472\3\2\2\2\u0154\u0155\7\21\2\2"+
		"\u0155\u0156\5,\27\2\u0156\u0157\5\u00aeX\2\u0157\u0158\7\u00e0\2\2\u0158"+
		"\u0159\5\36\20\2\u0159\u0472\3\2\2\2\u015a\u015b\7Q\2\2\u015b\u015e\5"+
		",\27\2\u015c\u015d\7v\2\2\u015d\u015f\7Y\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\5\u00aeX\2\u0161\u0163"+
		"\t\3\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0472\3\2\2\2\u0164"+
		"\u0165\7\u00e3\2\2\u0165\u0168\t\4\2\2\u0166\u0167\t\5\2\2\u0167\u0169"+
		"\5\u00aeX\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016e\3\2\2"+
		"\2\u016a\u016c\7\u008c\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016f\7\u0130\2\2\u016e\u016b\3\2\2\2\u016e\u016f"+
		"\3\2\2\2\u016f\u0472\3\2\2\2\u0170\u0171\6\t\2\2\u0171\u0176\5\26\f\2"+
		"\u0172\u0173\7\4\2\2\u0173\u0174\5\u00e8u\2\u0174\u0175\7\5\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0172\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179\3\2"+
		"\2\2\u0178\u017a\5\66\34\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0180\58\35\2\u017c\u017e\7\30\2\2\u017d\u017c\3"+
		"\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\5\"\22\2\u0180"+
		"\u017d\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0472\3\2\2\2\u0182\u0183\6\t"+
		"\3\2\u0183\u0188\5\26\f\2\u0184\u0185\7\4\2\2\u0185\u0186\5\u00e8u\2\u0186"+
		"\u0187\7\5\2\2\u0187\u0189\3\2\2\2\u0188\u0184\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\66\34\2\u018b\u0190\58\35\2\u018c"+
		"\u018e\7\30\2\2\u018d\u018c\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3"+
		"\2\2\2\u018f\u0191\5\"\22\2\u0190\u018d\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0472\3\2\2\2\u0192\u0197\5\26\f\2\u0193\u0194\7\4\2\2\u0194\u0195\5"+
		"\u00e8u\2\u0195\u0196\7\5\2\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2"+
		"\u0197\u0198\3\2\2\2\u0198\u01b0\3\2\2\2\u0199\u01af\5 \21\2\u019a\u019b"+
		"\7\u00b4\2\2\u019b\u019c\7 \2\2\u019c\u019d\7\4\2\2\u019d\u019e\5\u00e8"+
		"u\2\u019e\u019f\7\5\2\2\u019f\u01a4\3\2\2\2\u01a0\u01a1\7\u00b4\2\2\u01a1"+
		"\u01a2\7 \2\2\u01a2\u01a4\5\u0096L\2\u01a3\u019a\3\2\2\2\u01a3\u01a0\3"+
		"\2\2\2\u01a4\u01af\3\2\2\2\u01a5\u01af\5\32\16\2\u01a6\u01af\5\34\17\2"+
		"\u01a7\u01af\5\u00aaV\2\u01a8\u01af\5F$\2\u01a9\u01af\5\36\20\2\u01aa"+
		"\u01ab\7\u0090\2\2\u01ab\u01af\7\u0134\2\2\u01ac\u01ad\7\u00f2\2\2\u01ad"+
		"\u01af\5:\36\2\u01ae\u0199\3\2\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01a5\3\2"+
		"\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01a7\3\2\2\2\u01ae\u01a8\3\2\2\2\u01ae"+
		"\u01a9\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2"+
		"\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b7\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\7\30\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3"+
		"\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\5\"\22\2\u01b7\u01b4\3\2\2\2\u01b7"+
		"\u01b8\3\2\2\2\u01b8\u0472\3\2\2\2\u01b9\u01ba\78\2\2\u01ba\u01be\7\u00ef"+
		"\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7\u00a2\2\2\u01bd\u01bf\7Y\2\2\u01be"+
		"\u01bb\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\5\u00b0"+
		"Y\2\u01c1\u01c2\7\u008c\2\2\u01c2\u01cb\5\u00b0Y\2\u01c3\u01ca\5\66\34"+
		"\2\u01c4\u01ca\5\u00aaV\2\u01c5\u01ca\5F$\2\u01c6\u01ca\5\36\20\2\u01c7"+
		"\u01c8\7\u00f2\2\2\u01c8\u01ca\5:\36\2\u01c9\u01c3\3\2\2\2\u01c9\u01c4"+
		"\3\2\2\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca"+
		"\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u0472\3\2"+
		"\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d3\5\30\r\2\u01cf\u01d0\7\4\2\2\u01d0"+
		"\u01d1\5\u00e8u\2\u01d1\u01d2\7\5\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01cf"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\5\66\34\2"+
		"\u01d6\u01db\58\35\2\u01d7\u01d9\7\30\2\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\5\"\22\2\u01db\u01d8\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01dc\u0472\3\2\2\2\u01dd\u01de\7\22\2\2\u01de\u01df"+
		"\7\u00ef\2\2\u01df\u01e1\5\u00aeX\2\u01e0\u01e2\5(\25\2\u01e1\u01e0\3"+
		"\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7\63\2\2\u01e4"+
		"\u01ec\7\u00e9\2\2\u01e5\u01ed\5\u0106\u0084\2\u01e6\u01e7\7f\2\2\u01e7"+
		"\u01e8\7.\2\2\u01e8\u01ed\5\u0098M\2\u01e9\u01ea\7f\2\2\u01ea\u01eb\7"+
		"\20\2\2\u01eb\u01ed\7.\2\2\u01ec\u01e5\3\2\2\2\u01ec\u01e6\3\2\2\2\u01ec"+
		"\u01e9\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0472\3\2\2\2\u01ee\u01ef\7\21"+
		"\2\2\u01ef\u01f0\7\u00ef\2\2\u01f0\u01f1\5\u00aeX\2\u01f1\u01f2\7\16\2"+
		"\2\u01f2\u01f3\t\6\2\2\u01f3\u01f4\5\u00e4s\2\u01f4\u0472\3\2\2\2\u01f5"+
		"\u01f6\7\21\2\2\u01f6\u01f7\7\u00ef\2\2\u01f7\u01f8\5\u00aeX\2\u01f8\u01f9"+
		"\7\16\2\2\u01f9\u01fa\t\6\2\2\u01fa\u01fb\7\4\2\2\u01fb\u01fc\5\u00e4"+
		"s\2\u01fc\u01fd\7\5\2\2\u01fd\u0472\3\2\2\2\u01fe\u01ff\7\21\2\2\u01ff"+
		"\u0200\7\u00ef\2\2\u0200\u0201\5\u00aeX\2\u0201\u0202\7\u00c8\2\2\u0202"+
		"\u0203\7-\2\2\u0203\u0204\5\u00aeX\2\u0204\u0205\7\u00f6\2\2\u0205\u0206"+
		"\5\u0102\u0082\2\u0206\u0472\3\2\2\2\u0207\u0208\7\21\2\2\u0208\u0209"+
		"\7\u00ef\2\2\u0209\u020a\5\u00aeX\2\u020a\u020b\7Q\2\2\u020b\u020c\t\6"+
		"\2\2\u020c\u020d\7\4\2\2\u020d\u020e\5\u00acW\2\u020e\u020f\7\5\2\2\u020f"+
		"\u0472\3\2\2\2\u0210\u0211\7\21\2\2\u0211\u0212\7\u00ef\2\2\u0212\u0213"+
		"\5\u00aeX\2\u0213\u0214\7Q\2\2\u0214\u0215\t\6\2\2\u0215\u0216\5\u00ac"+
		"W\2\u0216\u0472\3\2\2\2\u0217\u0218\7\21\2\2\u0218\u0219\t\7\2\2\u0219"+
		"\u021a\5\u00aeX\2\u021a\u021b\7\u00c8\2\2\u021b\u021c\7\u00f6\2\2\u021c"+
		"\u021d\5\u00aeX\2\u021d\u0472\3\2\2\2\u021e\u021f\7\21\2\2\u021f\u0220"+
		"\t\7\2\2\u0220\u0221\5\u00aeX\2\u0221\u0222\7\u00e0\2\2\u0222\u0223\7"+
		"\u00f2\2\2\u0223\u0224\5:\36\2\u0224\u0472\3\2\2\2\u0225\u0226\7\21\2"+
		"\2\u0226\u0227\t\7\2\2\u0227\u0228\5\u00aeX\2\u0228\u0229\7\u0107\2\2"+
		"\u0229\u022c\7\u00f2\2\2\u022a\u022b\7v\2\2\u022b\u022d\7Y\2\2\u022c\u022a"+
		"\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\5:\36\2\u022f"+
		"\u0472\3\2\2\2\u0230\u0231\7\21\2\2\u0231\u0232\7\u00ef\2\2\u0232\u0233"+
		"\5\u00aeX\2\u0233\u0235\t\b\2\2\u0234\u0236\7-\2\2\u0235\u0234\3\2\2\2"+
		"\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\5\u00aeX\2\u0238"+
		"\u023a\5\u010e\u0088\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u0472"+
		"\3\2\2\2\u023b\u023c\7\21\2\2\u023c\u023d\7\u00ef\2\2\u023d\u023f\5\u00ae"+
		"X\2\u023e\u0240\5(\25\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241\u0243\7%\2\2\u0242\u0244\7-\2\2\u0243\u0242\3\2\2"+
		"\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\u00aeX\2\u0246"+
		"\u0248\5\u00eav\2\u0247\u0249\5\u00e0q\2\u0248\u0247\3\2\2\2\u0248\u0249"+
		"\3\2\2\2\u0249\u0472\3\2\2\2\u024a\u024b\7\21\2\2\u024b\u024c\7\u00ef"+
		"\2\2\u024c\u024e\5\u00aeX\2\u024d\u024f\5(\25\2\u024e\u024d\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7\u00e0\2\2\u0251\u0252"+
		"\7\u00dd\2\2\u0252\u0256\7\u0130\2\2\u0253\u0254\7\u0113\2\2\u0254\u0255"+
		"\7\u00de\2\2\u0255\u0257\5:\36\2\u0256\u0253\3\2\2\2\u0256\u0257\3\2\2"+
		"\2\u0257\u0472\3\2\2\2\u0258\u0259\7\21\2\2\u0259\u025a\7\u00ef\2\2\u025a"+
		"\u025c\5\u00aeX\2\u025b\u025d\5(\25\2\u025c\u025b\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\7\u00e0\2\2\u025f\u0260\7\u00de"+
		"\2\2\u0260\u0261\5:\36\2\u0261\u0472\3\2\2\2\u0262\u0263\7\21\2\2\u0263"+
		"\u0264\t\7\2\2\u0264\u0265\5\u00aeX\2\u0265\u0269\7\16\2\2\u0266\u0267"+
		"\7v\2\2\u0267\u0268\7\u00a2\2\2\u0268\u026a\7Y\2\2\u0269\u0266\3\2\2\2"+
		"\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b\u026d\5&\24\2\u026c\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f"+
		"\u0472\3\2\2\2\u0270\u0271\7\21\2\2\u0271\u0272\7\u00ef\2\2\u0272\u0273"+
		"\5\u00aeX\2\u0273\u0274\5(\25\2\u0274\u0275\7\u00c8\2\2\u0275\u0276\7"+
		"\u00f6\2\2\u0276\u0277\5(\25\2\u0277\u0472\3\2\2\2\u0278\u0279\7\21\2"+
		"\2\u0279\u027a\t\7\2\2\u027a\u027b\5\u00aeX\2\u027b\u027e\7Q\2\2\u027c"+
		"\u027d\7v\2\2\u027d\u027f\7Y\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2"+
		"\2\u027f\u0280\3\2\2\2\u0280\u0285\5(\25\2\u0281\u0282\7\6\2\2\u0282\u0284"+
		"\5(\25\2\u0283\u0281\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285"+
		"\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u028a\7\u00bf"+
		"\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0472\3\2\2\2\u028b"+
		"\u028c\7\21\2\2\u028c\u028d\7\u00ef\2\2\u028d\u028f\5\u00aeX\2\u028e\u0290"+
		"\5(\25\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0292\7\u00e0\2\2\u0292\u0293\5\36\20\2\u0293\u0472\3\2\2\2\u0294\u0295"+
		"\7\21\2\2\u0295\u0296\7\u00ef\2\2\u0296\u0297\5\u00aeX\2\u0297\u0298\7"+
		"\u00c4\2\2\u0298\u0299\7\u00b5\2\2\u0299\u0472\3\2\2\2\u029a\u029b\7Q"+
		"\2\2\u029b\u029e\7\u00ef\2\2\u029c\u029d\7v\2\2\u029d\u029f\7Y\2\2\u029e"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2\5\u00ae"+
		"X\2\u02a1\u02a3\7\u00bf\2\2\u02a2\u02a1\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3"+
		"\u0472\3\2\2\2\u02a4\u02a5\7Q\2\2\u02a5\u02a8\7\u010e\2\2\u02a6\u02a7"+
		"\7v\2\2\u02a7\u02a9\7Y\2\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9"+
		"\u02aa\3\2\2\2\u02aa\u0472\5\u00aeX\2\u02ab\u02ae\78\2\2\u02ac\u02ad\7"+
		"\u00aa\2\2\u02ad\u02af\7\u00ca\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b4\3\2\2\2\u02b0\u02b2\7n\2\2\u02b1\u02b0\3\2\2\2\u02b1"+
		"\u02b2\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b5\7\u00f3\2\2\u02b4\u02b1"+
		"\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02ba\7\u010e\2"+
		"\2\u02b7\u02b8\7v\2\2\u02b8\u02b9\7\u00a2\2\2\u02b9\u02bb\7Y\2\2\u02ba"+
		"\u02b7\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\5\u00ae"+
		"X\2\u02bd\u02bf\5\u009eP\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf"+
		"\u02c8\3\2\2\2\u02c0\u02c7\5 \21\2\u02c1\u02c2\7\u00b4\2\2\u02c2\u02c3"+
		"\7\u00a6\2\2\u02c3\u02c7\5\u0096L\2\u02c4\u02c5\7\u00f2\2\2\u02c5\u02c7"+
		"\5:\36\2\u02c6\u02c0\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02cb\3\2"+
		"\2\2\u02ca\u02c8\3\2\2\2\u02cb\u02cc\7\30\2\2\u02cc\u02cd\5\"\22\2\u02cd"+
		"\u0472\3\2\2\2\u02ce\u02d1\78\2\2\u02cf\u02d0\7\u00aa\2\2\u02d0\u02d2"+
		"\7\u00ca\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2\2"+
		"\2\u02d3\u02d5\7n\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d7\7\u00f3\2\2\u02d7\u02d8\7\u010e\2\2\u02d8\u02dd\5"+
		"\u00b0Y\2\u02d9\u02da\7\4\2\2\u02da\u02db\5\u00e8u\2\u02db\u02dc\7\5\2"+
		"\2\u02dc\u02de\3\2\2\2\u02dd\u02d9\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02df"+
		"\3\2\2\2\u02df\u02e2\5\66\34\2\u02e0\u02e1\7\u00a9\2\2\u02e1\u02e3\5:"+
		"\36\2\u02e2\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u0472\3\2\2\2\u02e4"+
		"\u02e5\7\21\2\2\u02e5\u02e6\7\u010e\2\2\u02e6\u02e8\5\u00aeX\2\u02e7\u02e9"+
		"\7\30\2\2\u02e8\u02e7\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2"+
		"\u02ea\u02eb\5\"\22\2\u02eb\u0472\3\2\2\2\u02ec\u02ef\78\2\2\u02ed\u02ee"+
		"\7\u00aa\2\2\u02ee\u02f0\7\u00ca\2\2\u02ef\u02ed\3\2\2\2\u02ef\u02f0\3"+
		"\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02f3\7\u00f3\2\2\u02f2\u02f1\3\2\2\2"+
		"\u02f2\u02f3\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f8\7l\2\2\u02f5\u02f6"+
		"\7v\2\2\u02f6\u02f7\7\u00a2\2\2\u02f7\u02f9\7Y\2\2\u02f8\u02f5\3\2\2\2"+
		"\u02f8\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\5\u00aeX\2\u02fb"+
		"\u02fc\7\30\2\2\u02fc\u0306\7\u0130\2\2\u02fd\u02fe\7\u010b\2\2\u02fe"+
		"\u0303\5L\'\2\u02ff\u0300\7\6\2\2\u0300\u0302\5L\'\2\u0301\u02ff\3\2\2"+
		"\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0307"+
		"\3\2\2\2\u0305\u0303\3\2\2\2\u0306\u02fd\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0472\3\2\2\2\u0308\u030a\7Q\2\2\u0309\u030b\7\u00f3\2\2\u030a\u0309"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030f\7l\2\2\u030d"+
		"\u030e\7v\2\2\u030e\u0310\7Y\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u0311\3\2\2\2\u0311\u0472\5\u00aeX\2\u0312\u0314\7Z\2\2\u0313"+
		"\u0315\t\t\2\2\u0314\u0313\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0472\5\20\t\2\u0317\u0318\7\u00e3\2\2\u0318\u031b\7\u00f0"+
		"\2\2\u0319\u031a\t\5\2\2\u031a\u031c\5\u00aeX\2\u031b\u0319\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u0321\3\2\2\2\u031d\u031f\7\u008c\2\2\u031e\u031d"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\7\u0130\2"+
		"\2\u0321\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0472\3\2\2\2\u0323\u0324"+
		"\7\u00e3\2\2\u0324\u0325\7\u00ef\2\2\u0325\u0328\7\\\2\2\u0326\u0327\t"+
		"\5\2\2\u0327\u0329\5\u00aeX\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2"+
		"\u0329\u032a\3\2\2\2\u032a\u032b\7\u008c\2\2\u032b\u032d\7\u0130\2\2\u032c"+
		"\u032e\5(\25\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u0472\3\2"+
		"\2\2\u032f\u0330\7\u00e3\2\2\u0330\u0331\7\u00f2\2\2\u0331\u0336\5\u00ae"+
		"X\2\u0332\u0333\7\4\2\2\u0333\u0334\5> \2\u0334\u0335\7\5\2\2\u0335\u0337"+
		"\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0472\3\2\2\2\u0338"+
		"\u0339\7\u00e3\2\2\u0339\u033a\7.\2\2\u033a\u033b\t\5\2\2\u033b\u033e"+
		"\5\u00aeX\2\u033c\u033d\t\5\2\2\u033d\u033f\5\u00aeX\2\u033e\u033c\3\2"+
		"\2\2\u033e\u033f\3\2\2\2\u033f\u0472\3\2\2\2\u0340\u0341\7\u00e3\2\2\u0341"+
		"\u0344\7\u010f\2\2\u0342\u0343\t\5\2\2\u0343\u0345\5\u00aeX\2\u0344\u0342"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u034a\3\2\2\2\u0346\u0348\7\u008c\2"+
		"\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034b"+
		"\7\u0130\2\2\u034a\u0347\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u0472\3\2\2"+
		"\2\u034c\u034d\7\u00e3\2\2\u034d\u034e\7\u00b5\2\2\u034e\u0350\5\u00ae"+
		"X\2\u034f\u0351\5(\25\2\u0350\u034f\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0472\3\2\2\2\u0352\u0354\7\u00e3\2\2\u0353\u0355\5\u0106\u0084\2\u0354"+
		"\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u035e\7m"+
		"\2\2\u0357\u0359\7\u008c\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359"+
		"\u035c\3\2\2\2\u035a\u035d\5\u00aeX\2\u035b\u035d\7\u0130\2\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0358\3\2\2\2\u035e"+
		"\u035f\3\2\2\2\u035f\u0472\3\2\2\2\u0360\u0361\7\u00e3\2\2\u0361\u0362"+
		"\78\2\2\u0362\u0363\7\u00ef\2\2\u0363\u0366\5\u00aeX\2\u0364\u0365\7\30"+
		"\2\2\u0365\u0367\7\u00dd\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367"+
		"\u0472\3\2\2\2\u0368\u0369\7\u00e3\2\2\u0369\u036a\7;\2\2\u036a\u0472"+
		"\7\u009e\2\2\u036b\u036c\t\n\2\2\u036c\u036e\7l\2\2\u036d\u036f\7\\\2"+
		"\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0472"+
		"\5.\30\2\u0371\u0372\t\n\2\2\u0372\u0374\5,\27\2\u0373\u0375\7\\\2\2\u0374"+
		"\u0373\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0377\5\u00ae"+
		"X\2\u0377\u0472\3\2\2\2\u0378\u0379\t\n\2\2\u0379\u037a\7K\2\2\u037a\u0472"+
		"\5\u00aeX\2\u037b\u037c\t\n\2\2\u037c\u037d\7u\2\2\u037d\u0380\5\u00ae"+
		"X\2\u037e\u037f\7\u008d\2\2\u037f\u0381\7\u0134\2\2\u0380\u037e\3\2\2"+
		"\2\u0380\u0381\3\2\2\2\u0381\u0472\3\2\2\2\u0382\u0384\t\n\2\2\u0383\u0385"+
		"\7\u00ef\2\2\u0384\u0383\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\3\2\2"+
		"\2\u0386\u0388\t\13\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u0389\3\2\2\2\u0389\u038b\5\u00aeX\2\u038a\u038c\5(\25\2\u038b\u038a"+
		"\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2\2\2\u038d\u038f\5\60\31\2"+
		"\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0472\3\2\2\2\u0390\u0392"+
		"\t\n\2\2\u0391\u0393\7\u00c0\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2"+
		"\2\u0393\u0394\3\2\2\2\u0394\u0472\5\"\22\2\u0395\u0396\7/\2\2\u0396\u0397"+
		"\7\u00a6\2\2\u0397\u0398\5,\27\2\u0398\u0399\5\u00aeX\2\u0399\u039a\7"+
		"\u0083\2\2\u039a\u039b\t\f\2\2\u039b\u0472\3\2\2\2\u039c\u039d\7/\2\2"+
		"\u039d\u039e\7\u00a6\2\2\u039e\u039f\7\u00ef\2\2\u039f\u03a0\5\u00aeX"+
		"\2\u03a0\u03a1\7\u0083\2\2\u03a1\u03a2\t\f\2\2\u03a2\u0472\3\2\2\2\u03a3"+
		"\u03a4\7\u00c7\2\2\u03a4\u03a5\7\u00ef\2\2\u03a5\u0472\5\u00aeX\2\u03a6"+
		"\u03ae\7\u00c7\2\2\u03a7\u03af\7\u0130\2\2\u03a8\u03aa\13\2\2\2\u03a9"+
		"\u03a8\3\2\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ab\u03a9\3\2"+
		"\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ae\u03a7\3\2\2\2\u03ae"+
		"\u03ab\3\2\2\2\u03af\u0472\3\2\2\2\u03b0\u03b2\7!\2\2\u03b1\u03b3\7\u0089"+
		"\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b5\7\u00ef\2\2\u03b5\u03b8\5\u00aeX\2\u03b6\u03b7\7\u00a9\2\2\u03b7"+
		"\u03b9\5:\36\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03be\3\2"+
		"\2\2\u03ba\u03bc\7\30\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2\2\2\u03bc"+
		"\u03bd\3\2\2\2\u03bd\u03bf\5\"\22\2\u03be\u03bb\3\2\2\2\u03be\u03bf\3"+
		"\2\2\2\u03bf\u0472\3\2\2\2\u03c0\u03c1\7\u0102\2\2\u03c1\u03c4\7\u00ef"+
		"\2\2\u03c2\u03c3\7v\2\2\u03c3\u03c5\7Y\2\2\u03c4\u03c2\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u0472\5\u00aeX\2\u03c7\u03c8\7\'\2"+
		"\2\u03c8\u0472\7!\2\2\u03c9\u03ca\7\u0091\2\2\u03ca\u03cc\7@\2\2\u03cb"+
		"\u03cd\7\u0092\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cf\7}\2\2\u03cf\u03d1\7\u0130\2\2\u03d0\u03d2\7\u00b2"+
		"\2\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d4\7\u0082\2\2\u03d4\u03d5\7\u00ef\2\2\u03d5\u03d7\5\u00aeX\2\u03d6"+
		"\u03d8\5(\25\2\u03d7\u03d6\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u0472\3\2"+
		"\2\2\u03d9\u03da\7\u00fe\2\2\u03da\u03db\7\u00ef\2\2\u03db\u03dd\5\u00ae"+
		"X\2\u03dc\u03de\5(\25\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de"+
		"\u0472\3\2\2\2\u03df\u03e0\7\u009d\2\2\u03e0\u03e1\7\u00c9\2\2\u03e1\u03e2"+
		"\7\u00ef\2\2\u03e2\u0472\5\u00aeX\2\u03e3\u03e4\t\r\2\2\u03e4\u03ec\5"+
		"\u0106\u0084\2\u03e5\u03ed\7\u0130\2\2\u03e6\u03e8\13\2\2\2\u03e7\u03e6"+
		"\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea"+
		"\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03e5\3\2\2\2\u03ec\u03e9\3\2"+
		"\2\2\u03ed\u0472\3\2\2\2\u03ee\u03ef\7\u00e0\2\2\u03ef\u03f3\7\u00d1\2"+
		"\2\u03f0\u03f2\13\2\2\2\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3"+
		"\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u0472\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f6\u03fa\7\u00e0\2\2\u03f7\u03f9\13\2\2\2\u03f8\u03f7\3\2\2\2"+
		"\u03f9\u03fc\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u0472"+
		"\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u0472\7\u00cb\2\2\u03fe\u03ff\7\u009a"+
		"\2\2\u03ff\u0400\7\u00ef\2\2\u0400\u0402\5\u00aeX\2\u0401\u0403\5(\25"+
		"\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0405"+
		"\7\u00a9\2\2\u0405\u0407\5:\36\2\u0406\u0404\3\2\2\2\u0406\u0407\3\2\2"+
		"\2\u0407\u0472\3\2\2\2\u0408\u0409\7\u0115\2\2\u0409\u040a\7\u0117\2\2"+
		"\u040a\u0472\5\u0106\u0084\2\u040b\u040c\7\u0118\2\2\u040c\u0472\5\u0106"+
		"\u0084\2\u040d\u040e\7\u0116\2\2\u040e\u040f\7\u00ef\2\2\u040f\u0411\5"+
		"\u00aeX\2\u0410\u0412\5(\25\2\u0411\u0410\3\2\2\2\u0411\u0412\3\2\2\2"+
		"\u0412\u0413\3\2\2\2\u0413\u0414\7\u008d\2\2\u0414\u0415\5\u010c\u0087"+
		"\2\u0415\u0472\3\2\2\2\u0416\u0417\7\u0091\2\2\u0417\u0418\7@\2\2\u0418"+
		"\u0419\5\u00c8e\2\u0419\u041a\7\u00ef\2\2\u041a\u041d\5\u00aeX\2\u041b"+
		"\u041c\7\u00a9\2\2\u041c\u041e\5:\36\2\u041d\u041b\3\2\2\2\u041d\u041e"+
		"\3\2\2\2\u041e\u0472\3\2\2\2\u041f\u0421\5\62\32\2\u0420\u041f\3\2\2\2"+
		"\u0420\u0421\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\7[\2\2\u0423\u0424"+
		"\7\u00ef\2\2\u0424\u0426\5\u00aeX\2\u0425\u0427\5(\25\2\u0426\u0425\3"+
		"\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\7\u00f6\2\2"+
		"\u0429\u042c\5\u00c8e\2\u042a\u042b\7\u00a9\2\2\u042b\u042d\5:\36\2\u042c"+
		"\u042a\3\2\2\2\u042c\u042d\3\2\2\2\u042d\u0472\3\2\2\2\u042e\u042f\7\u0119"+
		"\2\2\u042f\u0430\7\u00ef\2\2\u0430\u0432\5\u00aeX\2\u0431\u0433\5(\25"+
		"\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0436\3\2\2\2\u0434\u0435"+
		"\7\u00a9\2\2\u0435\u0437\5:\36\2\u0436\u0434\3\2\2\2\u0436\u0437\3\2\2"+
		"\2\u0437\u0472\3\2\2\2\u0438\u0439\7\u0119\2\2\u0439\u043a\7\u011a\2\2"+
		"\u043a\u043d\5\u00c8e\2\u043b\u043c\7\u00a9\2\2\u043c\u043e\5:\36\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0472\3\2\2\2\u043f\u0441\5\62"+
		"\32\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442"+
		"\u0443\7\u011b\2\2\u0443\u0444\5\22\n\2\u0444\u0446\5\u00aeX\2\u0445\u0447"+
		"\5(\25\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u0449\7\u00f6\2\2\u0449\u044c\5\u00aeX\2\u044a\u044b\7\u00a9\2\2\u044b"+
		"\u044d\5:\36\2\u044c\u044a\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0472\3\2"+
		"\2\2\u044e\u044f\7\u010d\2\2\u044f\u0454\5\u00aeX\2\u0450\u0451\7\u00ce"+
		"\2\2\u0451\u0452\5\u010c\u0087\2\u0452\u0453\7t\2\2\u0453\u0455\3\2\2"+
		"\2\u0454\u0450\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0458\3\2\2\2\u0456\u0457"+
		"\7R\2\2\u0457\u0459\7\u00d7\2\2\u0458\u0456\3\2\2\2\u0458\u0459\3\2\2"+
		"\2\u0459\u0472\3\2\2\2\u045a\u045b\7\66\2\2\u045b\u045c\7\u00f6\2\2\u045c"+
		"\u045d\t\16\2\2\u045d\u0464\5\u00aeX\2\u045e\u045f\7\u00b4\2\2\u045f\u0460"+
		"\7 \2\2\u0460\u0461\7\4\2\2\u0461\u0462\5\u00e8u\2\u0462\u0463\7\5\2\2"+
		"\u0463\u0465\3\2\2\2\u0464\u045e\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0468"+
		"\3\2\2\2\u0466\u0467\7\u00a9\2\2\u0467\u0469\5:\36\2\u0468\u0466\3\2\2"+
		"\2\u0468\u0469\3\2\2\2\u0469\u0472\3\2\2\2\u046a\u046e\5\24\13\2\u046b"+
		"\u046d\13\2\2\2\u046c\u046b\3\2\2\2\u046d\u0470\3\2\2\2\u046e\u046f\3"+
		"\2\2\2\u046e\u046c\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0471"+
		"\u0131\3\2\2\2\u0471\u0133\3\2\2\2\u0471\u0136\3\2\2\2\u0471\u013b\3\2"+
		"\2\2\u0471\u014d\3\2\2\2\u0471\u0154\3\2\2\2\u0471\u015a\3\2\2\2\u0471"+
		"\u0164\3\2\2\2\u0471\u0170\3\2\2\2\u0471\u0182\3\2\2\2\u0471\u0192\3\2"+
		"\2\2\u0471\u01b9\3\2\2\2\u0471\u01ce\3\2\2\2\u0471\u01dd\3\2\2\2\u0471"+
		"\u01ee\3\2\2\2\u0471\u01f5\3\2\2\2\u0471\u01fe\3\2\2\2\u0471\u0207\3\2"+
		"\2\2\u0471\u0210\3\2\2\2\u0471\u0217\3\2\2\2\u0471\u021e\3\2\2\2\u0471"+
		"\u0225\3\2\2\2\u0471\u0230\3\2\2\2\u0471\u023b\3\2\2\2\u0471\u024a\3\2"+
		"\2\2\u0471\u0258\3\2\2\2\u0471\u0262\3\2\2\2\u0471\u0270\3\2\2\2\u0471"+
		"\u0278\3\2\2\2\u0471\u028b\3\2\2\2\u0471\u0294\3\2\2\2\u0471\u029a\3\2"+
		"\2\2\u0471\u02a4\3\2\2\2\u0471\u02ab\3\2\2\2\u0471\u02ce\3\2\2\2\u0471"+
		"\u02e4\3\2\2\2\u0471\u02ec\3\2\2\2\u0471\u0308\3\2\2\2\u0471\u0312\3\2"+
		"\2\2\u0471\u0317\3\2\2\2\u0471\u0323\3\2\2\2\u0471\u032f\3\2\2\2\u0471"+
		"\u0338\3\2\2\2\u0471\u0340\3\2\2\2\u0471\u034c\3\2\2\2\u0471\u0352\3\2"+
		"\2\2\u0471\u0360\3\2\2\2\u0471\u0368\3\2\2\2\u0471\u036b\3\2\2\2\u0471"+
		"\u0371\3\2\2\2\u0471\u0378\3\2\2\2\u0471\u037b\3\2\2\2\u0471\u0382\3\2"+
		"\2\2\u0471\u0390\3\2\2\2\u0471\u0395\3\2\2\2\u0471\u039c\3\2\2\2\u0471"+
		"\u03a3\3\2\2\2\u0471\u03a6\3\2\2\2\u0471\u03b0\3\2\2\2\u0471\u03c0\3\2"+
		"\2\2\u0471\u03c7\3\2\2\2\u0471\u03c9\3\2\2\2\u0471\u03d9\3\2\2\2\u0471"+
		"\u03df\3\2\2\2\u0471\u03e3\3\2\2\2\u0471\u03ee\3\2\2\2\u0471\u03f6\3\2"+
		"\2\2\u0471\u03fd\3\2\2\2\u0471\u03fe\3\2\2\2\u0471\u0408\3\2\2\2\u0471"+
		"\u040b\3\2\2\2\u0471\u040d\3\2\2\2\u0471\u0416\3\2\2\2\u0471\u0420\3\2"+
		"\2\2\u0471\u042e\3\2\2\2\u0471\u0438\3\2\2\2\u0471\u0440\3\2\2\2\u0471"+
		"\u044e\3\2\2\2\u0471\u045a\3\2\2\2\u0471\u046a\3\2\2\2\u0472\21\3\2\2"+
		"\2\u0473\u0474\7\u011c\2\2\u0474\23\3\2\2\2\u0475\u0476\78\2\2\u0476\u051e"+
		"\7\u00d1\2\2\u0477\u0478\7Q\2\2\u0478\u051e\7\u00d1\2\2\u0479\u047b\7"+
		"o\2\2\u047a\u047c\7\u00d1\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2"+
		"\u047c\u051e\3\2\2\2\u047d\u047f\7\u00cd\2\2\u047e\u0480\7\u00d1\2\2\u047f"+
		"\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u051e\3\2\2\2\u0481\u0482\7\u00e3"+
		"\2\2\u0482\u051e\7o\2\2\u0483\u0484\7\u00e3\2\2\u0484\u0486\7\u00d1\2"+
		"\2\u0485\u0487\7o\2\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u051e"+
		"\3\2\2\2\u0488\u0489\7\u00e3\2\2\u0489\u051e\7\u00bd\2\2\u048a\u048b\7"+
		"\u00e3\2\2\u048b\u051e\7\u00d2\2\2\u048c\u048d\7\u00e3\2\2\u048d\u048e"+
		"\7;\2\2\u048e\u051e\7\u00d2\2\2\u048f\u0490\7[\2\2\u0490\u051e\7\u00ef"+
		"\2\2\u0491\u0492\7x\2\2\u0492\u051e\7\u00ef\2\2\u0493\u0494\7\u00e3\2"+
		"\2\u0494\u051e\7\62\2\2\u0495\u0496\7\u00e3\2\2\u0496\u0497\78\2\2\u0497"+
		"\u051e\7\u00ef\2\2\u0498\u0499\7\u00e3\2\2\u0499\u051e\7\u00fa\2\2\u049a"+
		"\u049b\7\u00e3\2\2\u049b\u051e\7{\2\2\u049c\u049d\7\u00e3\2\2\u049d\u051e"+
		"\7\u0095\2\2\u049e\u049f\78\2\2\u049f\u051e\7z\2\2\u04a0\u04a1\7Q\2\2"+
		"\u04a1\u051e\7z\2\2\u04a2\u04a3\7\21\2\2\u04a3\u051e\7z\2\2\u04a4\u04a5"+
		"\7\u0094\2\2\u04a5\u051e\7\u00ef\2\2\u04a6\u04a7\7\u0094\2\2\u04a7\u051e"+
		"\7A\2\2\u04a8\u04a9\7\u0106\2\2\u04a9\u051e\7\u00ef\2\2\u04aa\u04ab\7"+
		"\u0106\2\2\u04ab\u051e\7A\2\2\u04ac\u04ad\78\2\2\u04ad\u04ae\7\u00f3\2"+
		"\2\u04ae\u051e\7\u0097\2\2\u04af\u04b0\7Q\2\2\u04b0\u04b1\7\u00f3\2\2"+
		"\u04b1\u051e\7\u0097\2\2\u04b2\u04b3\7\21\2\2\u04b3\u04b4\7\u00ef\2\2"+
		"\u04b4\u04b5\5\u00b0Y\2\u04b5\u04b6\7\u00a2\2\2\u04b6\u04b7\7)\2\2\u04b7"+
		"\u051e\3\2\2\2\u04b8\u04b9\7\21\2\2\u04b9\u04ba\7\u00ef\2\2\u04ba\u04bb"+
		"\5\u00b0Y\2\u04bb\u04bc\7)\2\2\u04bc\u04bd\7 \2\2\u04bd\u051e\3\2\2\2"+
		"\u04be\u04bf\7\21\2\2\u04bf\u04c0\7\u00ef\2\2\u04c0\u04c1\5\u00b0Y\2\u04c1"+
		"\u04c2\7\u00a2\2\2\u04c2\u04c3\7\u00e7\2\2\u04c3\u051e\3\2\2\2\u04c4\u04c5"+
		"\7\21\2\2\u04c5\u04c6\7\u00ef\2\2\u04c6\u04c7\5\u00b0Y\2\u04c7\u04c8\7"+
		"\u00e4\2\2\u04c8\u04c9\7 \2\2\u04c9\u051e\3\2\2\2\u04ca\u04cb\7\21\2\2"+
		"\u04cb\u04cc\7\u00ef\2\2\u04cc\u04cd\5\u00b0Y\2\u04cd\u04ce\7\u00a2\2"+
		"\2\u04ce\u04cf\7\u00e4\2\2\u04cf\u051e\3\2\2\2\u04d0\u04d1\7\21\2\2\u04d1"+
		"\u04d2\7\u00ef\2\2\u04d2\u04d3\5\u00b0Y\2\u04d3\u04d4\7\u00a2\2\2\u04d4"+
		"\u04d5\7\u00ea\2\2\u04d5\u04d6\7\30\2\2\u04d6\u04d7\7M\2\2\u04d7\u051e"+
		"\3\2\2\2\u04d8\u04d9\7\21\2\2\u04d9\u04da\7\u00ef\2\2\u04da\u04db\5\u00b0"+
		"Y\2\u04db\u04dc\7\u00e0\2\2\u04dc\u04dd\7\u00e4\2\2\u04dd\u04de\7\u0093"+
		"\2\2\u04de\u051e\3\2\2\2\u04df\u04e0\7\21\2\2\u04e0\u04e1\7\u00ef\2\2"+
		"\u04e1\u04e2\5\u00b0Y\2\u04e2\u04e3\7X\2\2\u04e3\u04e4\7\u00b3\2\2\u04e4"+
		"\u051e\3\2\2\2\u04e5\u04e6\7\21\2\2\u04e6\u04e7\7\u00ef\2\2\u04e7\u04e8"+
		"\5\u00b0Y\2\u04e8\u04e9\7\26\2\2\u04e9\u04ea\7\u00b3\2\2\u04ea\u051e\3"+
		"\2\2\2\u04eb\u04ec\7\21\2\2\u04ec\u04ed\7\u00ef\2\2\u04ed\u04ee\5\u00b0"+
		"Y\2\u04ee\u04ef\7\u0100\2\2\u04ef\u04f0\7\u00b3\2\2\u04f0\u051e\3\2\2"+
		"\2\u04f1\u04f2\7\21\2\2\u04f2\u04f3\7\u00ef\2\2\u04f3\u04f4\5\u00b0Y\2"+
		"\u04f4\u04f5\7\u00f7\2\2\u04f5\u051e\3\2\2\2\u04f6\u04f7\7\21\2\2\u04f7"+
		"\u04f8\7\u00ef\2\2\u04f8\u04fa\5\u00b0Y\2\u04f9\u04fb\5(\25\2\u04fa\u04f9"+
		"\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7\61\2\2"+
		"\u04fd\u051e\3\2\2\2\u04fe\u04ff\7\21\2\2\u04ff\u0500\7\u00ef\2\2\u0500"+
		"\u0502\5\u00b0Y\2\u0501\u0503\5(\25\2\u0502\u0501\3\2\2\2\u0502\u0503"+
		"\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\7\64\2\2\u0505\u051e\3\2\2\2"+
		"\u0506\u0507\7\21\2\2\u0507\u0508\7\u00ef\2\2\u0508\u050a\5\u00b0Y\2\u0509"+
		"\u050b\5(\25\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2"+
		"\2\2\u050c\u050d\7\u00e0\2\2\u050d\u050e\7c\2\2\u050e\u051e\3\2\2\2\u050f"+
		"\u0510\7\21\2\2\u0510\u0511\7\u00ef\2\2\u0511\u0513\5\u00b0Y\2\u0512\u0514"+
		"\5(\25\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u0516\7\u00ca\2\2\u0516\u0517\7.\2\2\u0517\u051e\3\2\2\2\u0518\u0519"+
		"\7\u00e8\2\2\u0519\u051e\7\u00f9\2\2\u051a\u051e\7\60\2\2\u051b\u051e"+
		"\7\u00d3\2\2\u051c\u051e\7L\2\2\u051d\u0475\3\2\2\2\u051d\u0477\3\2\2"+
		"\2\u051d\u0479\3\2\2\2\u051d\u047d\3\2\2\2\u051d\u0481\3\2\2\2\u051d\u0483"+
		"\3\2\2\2\u051d\u0488\3\2\2\2\u051d\u048a\3\2\2\2\u051d\u048c\3\2\2\2\u051d"+
		"\u048f\3\2\2\2\u051d\u0491\3\2\2\2\u051d\u0493\3\2\2\2\u051d\u0495\3\2"+
		"\2\2\u051d\u0498\3\2\2\2\u051d\u049a\3\2\2\2\u051d\u049c\3\2\2\2\u051d"+
		"\u049e\3\2\2\2\u051d\u04a0\3\2\2\2\u051d\u04a2\3\2\2\2\u051d\u04a4\3\2"+
		"\2\2\u051d\u04a6\3\2\2\2\u051d\u04a8\3\2\2\2\u051d\u04aa\3\2\2\2\u051d"+
		"\u04ac\3\2\2\2\u051d\u04af\3\2\2\2\u051d\u04b2\3\2\2\2\u051d\u04b8\3\2"+
		"\2\2\u051d\u04be\3\2\2\2\u051d\u04c4\3\2\2\2\u051d\u04ca\3\2\2\2\u051d"+
		"\u04d0\3\2\2\2\u051d\u04d8\3\2\2\2\u051d\u04df\3\2\2\2\u051d\u04e5\3\2"+
		"\2\2\u051d\u04eb\3\2\2\2\u051d\u04f1\3\2\2\2\u051d\u04f6\3\2\2\2\u051d"+
		"\u04fe\3\2\2\2\u051d\u0506\3\2\2\2\u051d\u050f\3\2\2\2\u051d\u0518\3\2"+
		"\2\2\u051d\u051a\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051c\3\2\2\2\u051e"+
		"\25\3\2\2\2\u051f\u0521\78\2\2\u0520\u0522\7\u00f3\2\2\u0521\u0520\3\2"+
		"\2\2\u0521\u0522\3\2\2\2\u0522\u0524\3\2\2\2\u0523\u0525\7]\2\2\u0524"+
		"\u0523\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\3\2\2\2\u0526\u052a\7\u00ef"+
		"\2\2\u0527\u0528\7v\2\2\u0528\u0529\7\u00a2\2\2\u0529\u052b\7Y\2\2\u052a"+
		"\u0527\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052d\5\u00ae"+
		"X\2\u052d\27\3\2\2\2\u052e\u052f\78\2\2\u052f\u0531\7\u00aa\2\2\u0530"+
		"\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0533\7\u00ca"+
		"\2\2\u0533\u0534\7\u00ef\2\2\u0534\u0535\5\u00aeX\2\u0535\31\3\2\2\2\u0536"+
		"\u0537\7)\2\2\u0537\u0538\7 \2\2\u0538\u053c\5\u0096L\2\u0539\u053a\7"+
		"\u00e7\2\2\u053a\u053b\7 \2\2\u053b\u053d\5\u009aN\2\u053c\u0539\3\2\2"+
		"\2\u053c\u053d\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f\7\u0082\2\2\u053f"+
		"\u0540\7\u0134\2\2\u0540\u0541\7\37\2\2\u0541\33\3\2\2\2\u0542\u0543\7"+
		"\u00e4\2\2\u0543\u0544\7 \2\2\u0544\u0545\5\u0096L\2\u0545\u0548\7\u00a6"+
		"\2\2\u0546\u0549\5B\"\2\u0547\u0549\5D#\2\u0548\u0546\3\2\2\2\u0548\u0547"+
		"\3\2\2\2\u0549\u054d\3\2\2\2\u054a\u054b\7\u00ea\2\2\u054b\u054c\7\30"+
		"\2\2\u054c\u054e\7M\2\2\u054d\u054a\3\2\2\2\u054d\u054e\3\2\2\2\u054e"+
		"\35\3\2\2\2\u054f\u0550\7\u0093\2\2\u0550\u0551\7\u0130\2\2\u0551\37\3"+
		"\2\2\2\u0552\u0553\7/\2\2\u0553\u0554\7\u0130\2\2\u0554!\3\2\2\2\u0555"+
		"\u0557\5\62\32\2\u0556\u0555\3\2\2\2\u0556\u0557\3\2\2\2\u0557\u0558\3"+
		"\2\2\2\u0558\u0559\5T+\2\u0559\u055a\5P)\2\u055a#\3\2\2\2\u055b\u055c"+
		"\7\177\2\2\u055c\u055e\7\u00b2\2\2\u055d\u055f\7\u00ef\2\2\u055e\u055d"+
		"\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0567\5\u00aeX"+
		"\2\u0561\u0565\5(\25\2\u0562\u0563\7v\2\2\u0563\u0564\7\u00a2\2\2\u0564"+
		"\u0566\7Y\2\2\u0565\u0562\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u0568\3\2"+
		"\2\2\u0567\u0561\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u0593\3\2\2\2\u0569"+
		"\u056a\7\177\2\2\u056a\u056c\7\u0082\2\2\u056b\u056d\7\u00ef\2\2\u056c"+
		"\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0570\5\u00ae"+
		"X\2\u056f\u0571\5(\25\2\u0570\u056f\3\2\2\2\u0570\u0571\3\2\2\2\u0571"+
		"\u0575\3\2\2\2\u0572\u0573\7v\2\2\u0573\u0574\7\u00a2\2\2\u0574\u0576"+
		"\7Y\2\2\u0575\u0572\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0593\3\2\2\2\u0577"+
		"\u0578\7\177\2\2\u0578\u057a\7\u00b2\2\2\u0579\u057b\7\u0092\2\2\u057a"+
		"\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7N"+
		"\2\2\u057d\u057f\7\u0130\2\2\u057e\u0580\5\u00aaV\2\u057f\u057e\3\2\2"+
		"\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u0583\5F$\2\u0582\u0581"+
		"\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0593\3\2\2\2\u0584\u0585\7\177\2\2"+
		"\u0585\u0587\7\u00b2\2\2\u0586\u0588\7\u0092\2\2\u0587\u0586\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058b\7N\2\2\u058a\u058c\7\u0130"+
		"\2\2\u058b\u058a\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\3\2\2\2\u058d"+
		"\u0590\5\66\34\2\u058e\u058f\7\u00a9\2\2\u058f\u0591\5:\36\2\u0590\u058e"+
		"\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u055b\3\2\2\2\u0592"+
		"\u0569\3\2\2\2\u0592\u0577\3\2\2\2\u0592\u0584\3\2\2\2\u0593%\3\2\2\2"+
		"\u0594\u0596\5(\25\2\u0595\u0597\5\36\20\2\u0596\u0595\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\'\3\2\2\2\u0598\u0599\7\u00b3\2\2\u0599\u059a\7\4\2\2\u059a"+
		"\u059f\5*\26\2\u059b\u059c\7\6\2\2\u059c\u059e\5*\26\2\u059d\u059b\3\2"+
		"\2\2\u059e\u05a1\3\2\2\2\u059f\u059d\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0"+
		"\u05a2\3\2\2\2\u05a1\u059f\3\2\2\2\u05a2\u05a3\7\5\2\2\u05a3)\3\2\2\2"+
		"\u05a4\u05a7\5\u0106\u0084\2\u05a5\u05a6\7\u011d\2\2\u05a6\u05a8\5\u00c8"+
		"e\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8+\3\2\2\2\u05a9\u05aa"+
		"\t\17\2\2\u05aa-\3\2\2\2\u05ab\u05b1\5\u0100\u0081\2\u05ac\u05b1\7\u0130"+
		"\2\2\u05ad\u05b1\5\u00caf\2\u05ae\u05b1\5\u00ccg\2\u05af\u05b1\5\u00ce"+
		"h\2\u05b0\u05ab\3\2\2\2\u05b0\u05ac\3\2\2\2\u05b0\u05ad\3\2\2\2\u05b0"+
		"\u05ae\3\2\2\2\u05b0\u05af\3\2\2\2\u05b1/\3\2\2\2\u05b2\u05b7\5\u0106"+
		"\u0084\2\u05b3\u05b4\7\7\2\2\u05b4\u05b6\5\u0106\u0084\2\u05b5\u05b3\3"+
		"\2\2\2\u05b6\u05b9\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\61\3\2\2\2\u05b9\u05b7\3\2\2\2\u05ba\u05bb\7\u0113\2\2\u05bb\u05c0\5"+
		"\64\33\2\u05bc\u05bd\7\6\2\2\u05bd\u05bf\5\64\33\2\u05be\u05bc\3\2\2\2"+
		"\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\63"+
		"\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c5\5\u0102\u0082\2\u05c4\u05c6\5"+
		"\u0096L\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2"+
		"\u05c7\u05c9\7\30\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05cb\7\4\2\2\u05cb\u05cc\5\"\22\2\u05cc\u05cd\7\5\2\2"+
		"\u05cd\65\3\2\2\2\u05ce\u05cf\7\u010b\2\2\u05cf\u05d0\5\u00aeX\2\u05d0"+
		"\67\3\2\2\2\u05d1\u05d2\7\u00a9\2\2\u05d2\u05de\5:\36\2\u05d3\u05d4\7"+
		"\u00b4\2\2\u05d4\u05d5\7 \2\2\u05d5\u05de\5\u00b8]\2\u05d6\u05de\5\32"+
		"\16\2\u05d7\u05de\5\36\20\2\u05d8\u05de\5 \21\2\u05d9\u05da\7\u0090\2"+
		"\2\u05da\u05de\7\u0134\2\2\u05db\u05dc\7\u00f2\2\2\u05dc\u05de\5:\36\2"+
		"\u05dd\u05d1\3\2\2\2\u05dd\u05d3\3\2\2\2\u05dd\u05d6\3\2\2\2\u05dd\u05d7"+
		"\3\2\2\2\u05dd\u05d8\3\2\2\2\u05dd\u05d9\3\2\2\2\u05dd\u05db\3\2\2\2\u05de"+
		"\u05e1\3\2\2\2\u05df\u05dd\3\2\2\2\u05df\u05e0\3\2\2\2\u05e09\3\2\2\2"+
		"\u05e1\u05df\3\2\2\2\u05e2\u05e3\7\4\2\2\u05e3\u05e8\5<\37\2\u05e4\u05e5"+
		"\7\6\2\2\u05e5\u05e7\5<\37\2\u05e6\u05e4\3\2\2\2\u05e7\u05ea\3\2\2\2\u05e8"+
		"\u05e6\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\3\2\2\2\u05ea\u05e8\3\2"+
		"\2\2\u05eb\u05ec\7\5\2\2\u05ec;\3\2\2\2\u05ed\u05f2\5> \2\u05ee\u05f0"+
		"\7\u011d\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f1\3\2\2"+
		"\2\u05f1\u05f3\5@!\2\u05f2\u05ef\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3=\3"+
		"\2\2\2\u05f4\u05f9\5\u0106\u0084\2\u05f5\u05f6\7\7\2\2\u05f6\u05f8\5\u0106"+
		"\u0084\2\u05f7\u05f5\3\2\2\2\u05f8\u05fb\3\2\2\2\u05f9\u05f7\3\2\2\2\u05f9"+
		"\u05fa\3\2\2\2\u05fa\u05fe\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fc\u05fe\7\u0130"+
		"\2\2\u05fd\u05f4\3\2\2\2\u05fd\u05fc\3\2\2\2\u05fe?\3\2\2\2\u05ff\u0604"+
		"\7\u0134\2\2\u0600\u0604\7\u0136\2\2\u0601\u0604\5\u00d0i\2\u0602\u0604"+
		"\7\u0130\2\2\u0603\u05ff\3\2\2\2\u0603\u0600\3\2\2\2\u0603\u0601\3\2\2"+
		"\2\u0603\u0602\3\2\2\2\u0604A\3\2\2\2\u0605\u0606\7\4\2\2\u0606\u060b"+
		"\5\u00c8e\2\u0607\u0608\7\6\2\2\u0608\u060a\5\u00c8e\2\u0609\u0607\3\2"+
		"\2\2\u060a\u060d\3\2\2\2\u060b\u0609\3\2\2\2\u060b\u060c\3\2\2\2\u060c"+
		"\u060e\3\2\2\2\u060d\u060b\3\2\2\2\u060e\u060f\7\5\2\2\u060fC\3\2\2\2"+
		"\u0610\u0611\7\4\2\2\u0611\u0616\5B\"\2\u0612\u0613\7\6\2\2\u0613\u0615"+
		"\5B\"\2\u0614\u0612\3\2\2\2\u0615\u0618\3\2\2\2\u0616\u0614\3\2\2\2\u0616"+
		"\u0617\3\2\2\2\u0617\u0619\3\2\2\2\u0618\u0616\3\2\2\2\u0619\u061a\7\5"+
		"\2\2\u061aE\3\2\2\2\u061b\u061c\7\u00ea\2\2\u061c\u061d\7\30\2\2\u061d"+
		"\u0622\5H%\2\u061e\u061f\7\u00ea\2\2\u061f\u0620\7 \2\2\u0620\u0622\5"+
		"J&\2\u0621\u061b\3\2\2\2\u0621\u061e\3\2\2\2\u0622G\3\2\2\2\u0623\u0624"+
		"\7~\2\2\u0624\u0625\7\u0130\2\2\u0625\u0626\7\u00ae\2\2\u0626\u0629\7"+
		"\u0130\2\2\u0627\u0629\5\u0106\u0084\2\u0628\u0623\3\2\2\2\u0628\u0627"+
		"\3\2\2\2\u0629I\3\2\2\2\u062a\u062e\7\u0130\2\2\u062b\u062c\7\u0113\2"+
		"\2\u062c\u062d\7\u00de\2\2\u062d\u062f\5:\36\2\u062e\u062b\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062fK\3\2\2\2\u0630\u0631\5\u0106\u0084\2\u0631\u0632"+
		"\7\u0130\2\2\u0632M\3\2\2\2\u0633\u0634\5$\23\2\u0634\u0635\5T+\2\u0635"+
		"\u0636\5P)\2\u0636\u0667\3\2\2\2\u0637\u0639\5z>\2\u0638\u063a\5R*\2\u0639"+
		"\u0638\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2"+
		"\2\2\u063c\u0667\3\2\2\2\u063d\u063e\7F\2\2\u063e\u063f\7j\2\2\u063f\u0640"+
		"\5\u00aeX\2\u0640\u0642\5\u00a8U\2\u0641\u0643\5r:\2\u0642\u0641\3\2\2"+
		"\2\u0642\u0643\3\2\2\2\u0643\u0667\3\2\2\2\u0644\u0645\7\u0108\2\2\u0645"+
		"\u0646\5\u00aeX\2\u0646\u0647\5\u00a8U\2\u0647\u0649\5d\63\2\u0648\u064a"+
		"\5r:\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u0667\3\2\2\2\u064b"+
		"\u064c\7\u009a\2\2\u064c\u064d\7\u0082\2\2\u064d\u064e\5\u00aeX\2\u064e"+
		"\u064f\5\u00a8U\2\u064f\u0655\7\u010b\2\2\u0650\u0656\5\u00aeX\2\u0651"+
		"\u0652\7\4\2\2\u0652\u0653\5\"\22\2\u0653\u0654\7\5\2\2\u0654\u0656\3"+
		"\2\2\2\u0655\u0650\3\2\2\2\u0655\u0651\3\2\2\2\u0656\u0657\3\2\2\2\u0657"+
		"\u0658\5\u00a8U\2\u0658\u0659\7\u00a6\2\2\u0659\u065d\5\u00c0a\2\u065a"+
		"\u065c\5f\64\2\u065b\u065a\3\2\2\2\u065c\u065f\3\2\2\2\u065d\u065b\3\2"+
		"\2\2\u065d\u065e\3\2\2\2\u065e\u0663\3\2\2\2\u065f\u065d\3\2\2\2\u0660"+
		"\u0662\5h\65\2\u0661\u0660\3\2\2\2\u0662\u0665\3\2\2\2\u0663\u0661\3\2"+
		"\2\2\u0663\u0664\3\2\2\2\u0664\u0667\3\2\2\2\u0665\u0663\3\2\2\2\u0666"+
		"\u0633\3\2\2\2\u0666\u0637\3\2\2\2\u0666\u063d\3\2\2\2\u0666\u0644\3\2"+
		"\2\2\u0666\u064b\3\2\2\2\u0667O\3\2\2\2\u0668\u0669\7\u00ab\2\2\u0669"+
		"\u066a\7 \2\2\u066a\u066f\5X-\2\u066b\u066c\7\6\2\2\u066c\u066e\5X-\2"+
		"\u066d\u066b\3\2\2\2\u066e\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u066f\u0670"+
		"\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u066f\3\2\2\2\u0672\u0668\3\2\2\2\u0672"+
		"\u0673\3\2\2\2\u0673\u067e\3\2\2\2\u0674\u0675\7(\2\2\u0675\u0676\7 \2"+
		"\2\u0676\u067b\5\u00be`\2\u0677\u0678\7\6\2\2\u0678\u067a\5\u00be`\2\u0679"+
		"\u0677\3\2\2\2\u067a\u067d\3\2\2\2\u067b\u0679\3\2\2\2\u067b\u067c\3\2"+
		"\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067e\u0674\3\2\2\2\u067e"+
		"\u067f\3\2\2\2\u067f\u068a\3\2\2\2\u0680\u0681\7P\2\2\u0681\u0682\7 \2"+
		"\2\u0682\u0687\5\u00be`\2\u0683\u0684\7\6\2\2\u0684\u0686\5\u00be`\2\u0685"+
		"\u0683\3\2\2\2\u0686\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2"+
		"\2\2\u0688\u068b\3\2\2\2\u0689\u0687\3\2\2\2\u068a\u0680\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068b\u0696\3\2\2\2\u068c\u068d\7\u00e6\2\2\u068d\u068e"+
		"\7 \2\2\u068e\u0693\5X-\2\u068f\u0690\7\6\2\2\u0690\u0692\5X-\2\u0691"+
		"\u068f\3\2\2\2\u0692\u0695\3\2\2\2\u0693\u0691\3\2\2\2\u0693\u0694\3\2"+
		"\2\2\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0696\u068c\3\2\2\2\u0696"+
		"\u0697\3\2\2\2\u0697\u0699\3\2\2\2\u0698\u069a\5\u00f2z\2\u0699\u0698"+
		"\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u06a0\3\2\2\2\u069b\u069e\7\u008d\2"+
		"\2\u069c\u069f\7\20\2\2\u069d\u069f\5\u00be`\2\u069e\u069c\3\2\2\2\u069e"+
		"\u069d\3\2\2\2\u069f\u06a1\3\2\2\2\u06a0\u069b\3\2\2\2\u06a0\u06a1\3\2"+
		"\2\2\u06a1Q\3\2\2\2\u06a2\u06a3\5$\23\2\u06a3\u06a4\5\\/\2\u06a4S\3\2"+
		"\2\2\u06a5\u06a6\b+\1\2\u06a6\u06a7\5V,\2\u06a7\u06bf\3\2\2\2\u06a8\u06a9"+
		"\f\5\2\2\u06a9\u06aa\6+\5\2\u06aa\u06ac\t\20\2\2\u06ab\u06ad\5\u0088E"+
		"\2\u06ac\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06ae\3\2\2\2\u06ae\u06be"+
		"\5T+\6\u06af\u06b0\f\4\2\2\u06b0\u06b1\6+\7\2\u06b1\u06b3\7\u0080\2\2"+
		"\u06b2\u06b4\5\u0088E\2\u06b3\u06b2\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b4"+
		"\u06b5\3\2\2\2\u06b5\u06be\5T+\5\u06b6\u06b7\f\3\2\2\u06b7\u06b8\6+\t"+
		"\2\u06b8\u06ba\t\21\2\2\u06b9\u06bb\5\u0088E\2\u06ba\u06b9\3\2\2\2\u06ba"+
		"\u06bb\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u06be\5T+\4\u06bd\u06a8\3\2\2"+
		"\2\u06bd\u06af\3\2\2\2\u06bd\u06b6\3\2\2\2\u06be\u06c1\3\2\2\2\u06bf\u06bd"+
		"\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0U\3\2\2\2\u06c1\u06bf\3\2\2\2\u06c2"+
		"\u06cc\5^\60\2\u06c3\u06cc\5Z.\2\u06c4\u06c5\7\u00ef\2\2\u06c5\u06cc\5"+
		"\u00aeX\2\u06c6\u06cc\5\u00a4S\2\u06c7\u06c8\7\4\2\2\u06c8\u06c9\5\"\22"+
		"\2\u06c9\u06ca\7\5\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c2\3\2\2\2\u06cb\u06c3"+
		"\3\2\2\2\u06cb\u06c4\3\2\2\2\u06cb\u06c6\3\2\2\2\u06cb\u06c7\3\2\2\2\u06cc"+
		"W\3\2\2\2\u06cd\u06cf\5\u00be`\2\u06ce\u06d0\t\22\2\2\u06cf\u06ce\3\2"+
		"\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06d2\7\u00a4\2\2\u06d2"+
		"\u06d4\t\23\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4Y\3\2\2\2"+
		"\u06d5\u06d7\5z>\2\u06d6\u06d8\5\\/\2\u06d7\u06d6\3\2\2\2\u06d8\u06d9"+
		"\3\2\2\2\u06d9\u06d7\3\2\2\2\u06d9\u06da\3\2\2\2\u06da[\3\2\2\2\u06db"+
		"\u06dd\5`\61\2\u06dc\u06de\5r:\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2"+
		"\2\u06de\u06df\3\2\2\2\u06df\u06e0\5P)\2\u06e0\u06f7\3\2\2\2\u06e1\u06e5"+
		"\5b\62\2\u06e2\u06e4\5\u0086D\2\u06e3\u06e2\3\2\2\2\u06e4\u06e7\3\2\2"+
		"\2\u06e5\u06e3\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e9\3\2\2\2\u06e7\u06e5"+
		"\3\2\2\2\u06e8\u06ea\5r:\2\u06e9\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea"+
		"\u06ec\3\2\2\2\u06eb\u06ed\5|?\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2"+
		"\2\u06ed\u06ef\3\2\2\2\u06ee\u06f0\5t;\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0"+
		"\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06f3\5\u00f2z\2\u06f2\u06f1\3\2\2"+
		"\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\5P)\2\u06f5\u06f7"+
		"\3\2\2\2\u06f6\u06db\3\2\2\2\u06f6\u06e1\3\2\2\2\u06f7]\3\2\2\2\u06f8"+
		"\u06fa\5`\61\2\u06f9\u06fb\5z>\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2"+
		"\2\u06fb\u06fd\3\2\2\2\u06fc\u06fe\5r:\2\u06fd\u06fc\3\2\2\2\u06fd\u06fe"+
		"\3\2\2\2\u06fe\u0716\3\2\2\2\u06ff\u0701\5b\62\2\u0700\u0702\5z>\2\u0701"+
		"\u0700\3\2\2\2\u0701\u0702\3\2\2\2\u0702\u0706\3\2\2\2\u0703\u0705\5\u0086"+
		"D\2\u0704\u0703\3\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706"+
		"\u0707\3\2\2\2\u0707\u070a\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u070b\5r"+
		":\2\u070a\u0709\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c"+
		"\u070e\5|?\2\u070d\u070c\3\2\2\2\u070d\u070e\3\2\2\2\u070e\u0710\3\2\2"+
		"\2\u070f\u0711\5t;\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0713"+
		"\3\2\2\2\u0712\u0714\5\u00f2z\2\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2"+
		"\2\u0714\u0716\3\2\2\2\u0715\u06f8\3\2\2\2\u0715\u06ff\3\2\2\2\u0716_"+
		"\3\2\2\2\u0717\u0718\7\u00da\2\2\u0718\u0719\7\u00fb\2\2\u0719\u071a\7"+
		"\4\2\2\u071a\u071b\5\u00b6\\\2\u071b\u071c\7\5\2\2\u071c\u0722\3\2\2\2"+
		"\u071d\u071e\7\u0098\2\2\u071e\u0722\5\u00b6\\\2\u071f\u0720\7\u00c5\2"+
		"\2\u0720\u0722\5\u00b6\\\2\u0721\u0717\3\2\2\2\u0721\u071d\3\2\2\2\u0721"+
		"\u071f\3\2\2\2\u0722\u0724\3\2\2\2\u0723\u0725\5\u00aaV\2\u0724\u0723"+
		"\3\2\2\2\u0724\u0725\3\2\2\2\u0725\u0728\3\2\2\2\u0726\u0727\7\u00c3\2"+
		"\2\u0727\u0729\7\u0130\2\2\u0728\u0726\3\2\2\2\u0728\u0729\3\2\2\2\u0729"+
		"\u072a\3\2\2\2\u072a\u072b\7\u010b\2\2\u072b\u0738\7\u0130\2\2\u072c\u0736"+
		"\7\30\2\2\u072d\u0737\5\u0098M\2\u072e\u0737\5\u00e8u\2\u072f\u0732\7"+
		"\4\2\2\u0730\u0733\5\u0098M\2\u0731\u0733\5\u00e8u\2\u0732\u0730\3\2\2"+
		"\2\u0732\u0731\3\2\2\2\u0733\u0734\3\2\2\2\u0734\u0735\7\5\2\2\u0735\u0737"+
		"\3\2\2\2\u0736\u072d\3\2\2\2\u0736\u072e\3\2\2\2\u0736\u072f\3\2\2\2\u0737"+
		"\u0739\3\2\2\2\u0738\u072c\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073b\3\2"+
		"\2\2\u073a\u073c\5\u00aaV\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c"+
		"\u073f\3\2\2\2\u073d\u073e\7\u00c2\2\2\u073e\u0740\7\u0130\2\2\u073f\u073d"+
		"\3\2\2\2\u073f\u0740\3\2\2\2\u0740a\3\2\2\2\u0741\u0745\7\u00da\2\2\u0742"+
		"\u0744\5v<\2\u0743\u0742\3\2\2\2\u0744\u0747\3\2\2\2\u0745\u0743\3\2\2"+
		"\2\u0745\u0746\3\2\2\2\u0746\u0749\3\2\2\2\u0747\u0745\3\2\2\2\u0748\u074a"+
		"\5\u0088E\2\u0749\u0748\3\2\2\2\u0749\u074a\3\2\2\2\u074a\u074b\3\2\2"+
		"\2\u074b\u074c\5\u00b6\\\2\u074cc\3\2\2\2\u074d\u074e\7\u00e0\2\2\u074e"+
		"\u074f\5n8\2\u074fe\3\2\2\2\u0750\u0751\7\u0110\2\2\u0751\u0754\7\u0099"+
		"\2\2\u0752\u0753\7\23\2\2\u0753\u0755\5\u00c0a\2\u0754\u0752\3\2\2\2\u0754"+
		"\u0755\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0757\7\u00f5\2\2\u0757\u0758"+
		"\5j\66\2\u0758g\3\2\2\2\u0759\u075a\7\u0110\2\2\u075a\u075b\7\u00a2\2"+
		"\2\u075b\u075e\7\u0099\2\2\u075c\u075d\7\23\2\2\u075d\u075f\5\u00c0a\2"+
		"\u075e\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761"+
		"\7\u00f5\2\2\u0761\u0762\5l\67\2\u0762i\3\2\2\2\u0763\u076b\7F\2\2\u0764"+
		"\u0765\7\u0108\2\2\u0765\u0766\7\u00e0\2\2\u0766\u076b\7\u0127\2\2\u0767"+
		"\u0768\7\u0108\2\2\u0768\u0769\7\u00e0\2\2\u0769\u076b\5n8\2\u076a\u0763"+
		"\3\2\2\2\u076a\u0764\3\2\2\2\u076a\u0767\3\2\2\2\u076bk\3\2\2\2\u076c"+
		"\u076d\7\177\2\2\u076d\u077f\7\u0127\2\2\u076e\u076f\7\177\2\2\u076f\u0770"+
		"\7\4\2\2\u0770\u0771\5\u00acW\2\u0771\u0772\7\5\2\2\u0772\u0773\7\u010c"+
		"\2\2\u0773\u0774\7\4\2\2\u0774\u0779\5\u00be`\2\u0775\u0776\7\6\2\2\u0776"+
		"\u0778\5\u00be`\2\u0777\u0775\3\2\2\2\u0778\u077b\3\2\2\2\u0779\u0777"+
		"\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077c\3\2\2\2\u077b\u0779\3\2\2\2\u077c"+
		"\u077d\7\5\2\2\u077d\u077f\3\2\2\2\u077e\u076c\3\2\2\2\u077e\u076e\3\2"+
		"\2\2\u077fm\3\2\2\2\u0780\u0785\5p9\2\u0781\u0782\7\6\2\2\u0782\u0784"+
		"\5p9\2\u0783\u0781\3\2\2\2\u0784\u0787\3\2\2\2\u0785\u0783\3\2\2\2\u0785"+
		"\u0786\3\2\2\2\u0786o\3\2\2\2\u0787\u0785\3\2\2\2\u0788\u0789\5\u00ae"+
		"X\2\u0789\u078a\7\u011d\2\2\u078a\u078b\5\u00be`\2\u078bq\3\2\2\2\u078c"+
		"\u078d\7\u0111\2\2\u078d\u078e\5\u00c0a\2\u078es\3\2\2\2\u078f\u0790\7"+
		"r\2\2\u0790\u0791\5\u00c0a\2\u0791u\3\2\2\2\u0792\u0793\7\b\2\2\u0793"+
		"\u079a\5x=\2\u0794\u0796\7\6\2\2\u0795\u0794\3\2\2\2\u0795\u0796\3\2\2"+
		"\2\u0796\u0797\3\2\2\2\u0797\u0799\5x=\2\u0798\u0795\3\2\2\2\u0799\u079c"+
		"\3\2\2\2\u079a\u0798\3\2\2\2\u079a\u079b\3\2\2\2\u079b\u079d\3\2\2\2\u079c"+
		"\u079a\3\2\2\2\u079d\u079e\7\t\2\2\u079ew\3\2\2\2\u079f\u07ad\5\u0106"+
		"\u0084\2\u07a0\u07a1\5\u0106\u0084\2\u07a1\u07a2\7\4\2\2\u07a2\u07a7\5"+
		"\u00c6d\2\u07a3\u07a4\7\6\2\2\u07a4\u07a6\5\u00c6d\2\u07a5\u07a3\3\2\2"+
		"\2\u07a6\u07a9\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a7\u07a8\3\2\2\2\u07a8\u07aa"+
		"\3\2\2\2\u07a9\u07a7\3\2\2\2\u07aa\u07ab\7\5\2\2\u07ab\u07ad\3\2\2\2\u07ac"+
		"\u079f\3\2\2\2\u07ac\u07a0\3\2\2\2\u07ady\3\2\2\2\u07ae\u07af\7j\2\2\u07af"+
		"\u07b4\5\u008aF\2\u07b0\u07b1\7\6\2\2\u07b1\u07b3\5\u008aF\2\u07b2\u07b0"+
		"\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5"+
		"\u07ba\3\2\2\2\u07b6\u07b4\3\2\2\2\u07b7\u07b9\5\u0086D\2\u07b8\u07b7"+
		"\3\2\2\2\u07b9\u07bc\3\2\2\2\u07ba\u07b8\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb"+
		"\u07be\3\2\2\2\u07bc\u07ba\3\2\2\2\u07bd\u07bf\5\u0080A\2\u07be\u07bd"+
		"\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf{\3\2\2\2\u07c0\u07c1\7p\2\2\u07c1\u07c2"+
		"\7 \2\2\u07c2\u07c7\5\u00be`\2\u07c3\u07c4\7\6\2\2\u07c4\u07c6\5\u00be"+
		"`\2\u07c5\u07c3\3\2\2\2\u07c6\u07c9\3\2\2\2\u07c7\u07c5\3\2\2\2\u07c7"+
		"\u07c8\3\2\2\2\u07c8\u07db\3\2\2\2\u07c9\u07c7\3\2\2\2\u07ca\u07cb\7\u0113"+
		"\2\2\u07cb\u07dc\7\u00d4\2\2\u07cc\u07cd\7\u0113\2\2\u07cd\u07dc\7:\2"+
		"\2\u07ce\u07cf\7q\2\2\u07cf\u07d0\7\u00e2\2\2\u07d0\u07d1\7\4\2\2\u07d1"+
		"\u07d6\5~@\2\u07d2\u07d3\7\6\2\2\u07d3\u07d5\5~@\2\u07d4\u07d2\3\2\2\2"+
		"\u07d5\u07d8\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9"+
		"\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d9\u07da\7\5\2\2\u07da\u07dc\3\2\2\2\u07db"+
		"\u07ca\3\2\2\2\u07db\u07cc\3\2\2\2\u07db\u07ce\3\2\2\2\u07db\u07dc\3\2"+
		"\2\2\u07dc\u07ed\3\2\2\2\u07dd\u07de\7p\2\2\u07de\u07df\7 \2\2\u07df\u07e0"+
		"\7q\2\2\u07e0\u07e1\7\u00e2\2\2\u07e1\u07e2\7\4\2\2\u07e2\u07e7\5~@\2"+
		"\u07e3\u07e4\7\6\2\2\u07e4\u07e6\5~@\2\u07e5\u07e3\3\2\2\2\u07e6\u07e9"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07ea\3\2\2\2\u07e9"+
		"\u07e7\3\2\2\2\u07ea\u07eb\7\5\2\2\u07eb\u07ed\3\2\2\2\u07ec\u07c0\3\2"+
		"\2\2\u07ec\u07dd\3\2\2\2\u07ed}\3\2\2\2\u07ee\u07f7\7\4\2\2\u07ef\u07f4"+
		"\5\u00be`\2\u07f0\u07f1\7\6\2\2\u07f1\u07f3\5\u00be`\2\u07f2\u07f0\3\2"+
		"\2\2\u07f3\u07f6\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5"+
		"\u07f8\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07ef\3\2\2\2\u07f7\u07f8\3\2"+
		"\2\2\u07f8\u07f9\3\2\2\2\u07f9\u07fc\7\5\2\2\u07fa\u07fc\5\u00be`\2\u07fb"+
		"\u07ee\3\2\2\2\u07fb\u07fa\3\2\2\2\u07fc\177\3\2\2\2\u07fd\u07fe\7\u00b8"+
		"\2\2\u07fe\u07ff\7\4\2\2\u07ff\u0800\5\u00b6\\\2\u0800\u0801\7f\2\2\u0801"+
		"\u0802\5\u0082B\2\u0802\u0803\7y\2\2\u0803\u0804\7\4\2\2\u0804\u0809\5"+
		"\u0084C\2\u0805\u0806\7\6\2\2\u0806\u0808\5\u0084C\2\u0807\u0805\3\2\2"+
		"\2\u0808\u080b\3\2\2\2\u0809\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c"+
		"\3\2\2\2\u080b\u0809\3\2\2\2\u080c\u080d\7\5\2\2\u080d\u080e\7\5\2\2\u080e"+
		"\u0081\3\2\2\2\u080f\u081c\5\u0106\u0084\2\u0810\u0811\7\4\2\2\u0811\u0816"+
		"\5\u0106\u0084\2\u0812\u0813\7\6\2\2\u0813\u0815\5\u0106\u0084\2\u0814"+
		"\u0812\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0814\3\2\2\2\u0816\u0817\3\2"+
		"\2\2\u0817\u0819\3\2\2\2\u0818\u0816\3\2\2\2\u0819\u081a\7\5\2\2\u081a"+
		"\u081c\3\2\2\2\u081b\u080f\3\2\2\2\u081b\u0810\3\2\2\2\u081c\u0083\3\2"+
		"\2\2\u081d\u0822\5\u00be`\2\u081e\u0820\7\30\2\2\u081f\u081e\3\2\2\2\u081f"+
		"\u0820\3\2\2\2\u0820\u0821\3\2\2\2\u0821\u0823\5\u0106\u0084\2\u0822\u081f"+
		"\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0085\3\2\2\2\u0824\u0825\7\u0088\2"+
		"\2\u0825\u0827\7\u010e\2\2\u0826\u0828\7\u00ad\2\2\u0827\u0826\3\2\2\2"+
		"\u0827\u0828\3\2\2\2\u0828\u0829\3\2\2\2\u0829\u082a\5\u0100\u0081\2\u082a"+
		"\u0833\7\4\2\2\u082b\u0830\5\u00be`\2\u082c\u082d\7\6\2\2\u082d\u082f"+
		"\5\u00be`\2\u082e\u082c\3\2\2\2\u082f\u0832\3\2\2\2\u0830\u082e\3\2\2"+
		"\2\u0830\u0831\3\2\2\2\u0831\u0834\3\2\2\2\u0832\u0830\3\2\2\2\u0833\u082b"+
		"\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\3\2\2\2\u0835\u0836\7\5\2\2\u0836"+
		"\u0842\5\u0106\u0084\2\u0837\u0839\7\30\2\2\u0838\u0837\3\2\2\2\u0838"+
		"\u0839\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u083f\5\u0106\u0084\2\u083b\u083c"+
		"\7\6\2\2\u083c\u083e\5\u0106\u0084\2\u083d\u083b\3\2\2\2\u083e\u0841\3"+
		"\2\2\2\u083f\u083d\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0843\3\2\2\2\u0841"+
		"\u083f\3\2\2\2\u0842\u0838\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0087\3\2"+
		"\2\2\u0844\u0845\t\24\2\2\u0845\u0089\3\2\2\2\u0846\u084a\5\u00a2R\2\u0847"+
		"\u0849\5\u008cG\2\u0848\u0847\3\2\2\2\u0849\u084c\3\2\2\2\u084a\u0848"+
		"\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u008b\3\2\2\2\u084c\u084a\3\2\2\2\u084d"+
		"\u084e\5\u008eH\2\u084e\u084f\7\u0085\2\2\u084f\u0851\5\u00a2R\2\u0850"+
		"\u0852\5\u0090I\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0859"+
		"\3\2\2\2\u0853\u0854\7\u00a0\2\2\u0854\u0855\5\u008eH\2\u0855\u0856\7"+
		"\u0085\2\2\u0856\u0857\5\u00a2R\2\u0857\u0859\3\2\2\2\u0858\u084d\3\2"+
		"\2\2\u0858\u0853\3\2\2\2\u0859\u008d\3\2\2\2\u085a\u085c\7|\2\2\u085b"+
		"\u085a\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u0873\3\2\2\2\u085d\u0873\7";
	private static final String _serializedATNSegment1 =
		"9\2\2\u085e\u0860\7\u008b\2\2\u085f\u0861\7\u00ad\2\2\u0860\u085f\3\2"+
		"\2\2\u0860\u0861\3\2\2\2\u0861\u0873\3\2\2\2\u0862\u0864\7\u008b\2\2\u0863"+
		"\u0862\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0873\7\u00db"+
		"\2\2\u0866\u0868\7\u00cf\2\2\u0867\u0869\7\u00ad\2\2\u0868\u0867\3\2\2"+
		"\2\u0868\u0869\3\2\2\2\u0869\u0873\3\2\2\2\u086a\u086c\7k\2\2\u086b\u086d"+
		"\7\u00ad\2\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u0873\3\2\2"+
		"\2\u086e\u0870\7\u008b\2\2\u086f\u086e\3\2\2\2\u086f\u0870\3\2\2\2\u0870"+
		"\u0871\3\2\2\2\u0871\u0873\7\24\2\2\u0872\u085b\3\2\2\2\u0872\u085d\3"+
		"\2\2\2\u0872\u085e\3\2\2\2\u0872\u0863\3\2\2\2\u0872\u0866\3\2\2\2\u0872"+
		"\u086a\3\2\2\2\u0872\u086f\3\2\2\2\u0873\u008f\3\2\2\2\u0874\u0875\7\u00a6"+
		"\2\2\u0875\u0879\5\u00c0a\2\u0876\u0877\7\u010b\2\2\u0877\u0879\5\u0096"+
		"L\2\u0878\u0874\3\2\2\2\u0878\u0876\3\2\2\2\u0879\u0091\3\2\2\2\u087a"+
		"\u087b\7\u00f1\2\2\u087b\u087d\7\4\2\2\u087c\u087e\5\u0094K\2\u087d\u087c"+
		"\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u0880\7\5\2\2\u0880"+
		"\u0093\3\2\2\2\u0881\u0883\7\u0126\2\2\u0882\u0881\3\2\2\2\u0882\u0883"+
		"\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\t\25\2\2\u0885\u089a\7\u00b7"+
		"\2\2\u0886\u0887\5\u00be`\2\u0887\u0888\7\u00d6\2\2\u0888\u089a\3\2\2"+
		"\2\u0889\u088a\7\36\2\2\u088a\u088b\7\u0134\2\2\u088b\u088c\7\u00ac\2"+
		"\2\u088c\u088d\7\u00a5\2\2\u088d\u0896\7\u0134\2\2\u088e\u0894\7\u00a6"+
		"\2\2\u088f\u0895\5\u0106\u0084\2\u0890\u0891\5\u0100\u0081\2\u0891\u0892"+
		"\7\4\2\2\u0892\u0893\7\5\2\2\u0893\u0895\3\2\2\2\u0894\u088f\3\2\2\2\u0894"+
		"\u0890\3\2\2\2\u0895\u0897\3\2\2\2\u0896\u088e\3\2\2\2\u0896\u0897\3\2"+
		"\2\2\u0897\u089a\3\2\2\2\u0898\u089a\5\u00be`\2\u0899\u0882\3\2\2\2\u0899"+
		"\u0886\3\2\2\2\u0899\u0889\3\2\2\2\u0899\u0898\3\2\2\2\u089a\u0095\3\2"+
		"\2\2\u089b\u089c\7\4\2\2\u089c\u089d\5\u0098M\2\u089d\u089e\7\5\2\2\u089e"+
		"\u0097\3\2\2\2\u089f\u08a4\5\u0102\u0082\2\u08a0\u08a1\7\6\2\2\u08a1\u08a3"+
		"\5\u0102\u0082\2\u08a2\u08a0\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4\u08a2\3"+
		"\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u0099\3\2\2\2\u08a6\u08a4\3\2\2\2\u08a7"+
		"\u08a8\7\4\2\2\u08a8\u08ad\5\u009cO\2\u08a9\u08aa\7\6\2\2\u08aa\u08ac"+
		"\5\u009cO\2\u08ab\u08a9\3\2\2\2\u08ac\u08af\3\2\2\2\u08ad\u08ab\3\2\2"+
		"\2\u08ad\u08ae\3\2\2\2\u08ae\u08b0\3\2\2\2\u08af\u08ad\3\2\2\2\u08b0\u08b1"+
		"\7\5\2\2\u08b1\u009b\3\2\2\2\u08b2\u08b4\5\u0102\u0082\2\u08b3\u08b5\t"+
		"\22\2\2\u08b4\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u009d\3\2\2\2\u08b6"+
		"\u08b7\7\4\2\2\u08b7\u08bc\5\u00a0Q\2\u08b8\u08b9\7\6\2\2\u08b9\u08bb"+
		"\5\u00a0Q\2\u08ba\u08b8\3\2\2\2\u08bb\u08be\3\2\2\2\u08bc\u08ba\3\2\2"+
		"\2\u08bc\u08bd\3\2\2\2\u08bd\u08bf\3\2\2\2\u08be\u08bc\3\2\2\2\u08bf\u08c0"+
		"\7\5\2\2\u08c0\u009f\3\2\2\2\u08c1\u08c3\5\u0106\u0084\2\u08c2\u08c4\5"+
		" \21\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4\3\2\2\2\u08c4\u00a1\3\2\2\2\u08c5"+
		"\u08c7\5\u00aeX\2\u08c6\u08c8\5\u0092J\2\u08c7\u08c6\3\2\2\2\u08c7\u08c8"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\5\u00a8U\2\u08ca\u08de\3\2\2"+
		"\2\u08cb\u08cc\7\4\2\2\u08cc\u08cd\5\"\22\2\u08cd\u08cf\7\5\2\2\u08ce"+
		"\u08d0\5\u0092J\2\u08cf\u08ce\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1"+
		"\3\2\2\2\u08d1\u08d2\5\u00a8U\2\u08d2\u08de\3\2\2\2\u08d3\u08d4\7\4\2"+
		"\2\u08d4\u08d5\5\u008aF\2\u08d5\u08d7\7\5\2\2\u08d6\u08d8\5\u0092J\2\u08d7"+
		"\u08d6\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\5\u00a8"+
		"U\2\u08da\u08de\3\2\2\2\u08db\u08de\5\u00a4S\2\u08dc\u08de\5\u00a6T\2"+
		"\u08dd\u08c5\3\2\2\2\u08dd\u08cb\3\2\2\2\u08dd\u08d3\3\2\2\2\u08dd\u08db"+
		"\3\2\2\2\u08dd\u08dc\3\2\2\2\u08de\u00a3\3\2\2\2\u08df\u08e0\7\u010c\2"+
		"\2\u08e0\u08e5\5\u00be`\2\u08e1\u08e2\7\6\2\2\u08e2\u08e4\5\u00be`\2\u08e3"+
		"\u08e1\3\2\2\2\u08e4\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2"+
		"\2\2\u08e6\u08e8\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08e9\5\u00a8U\2\u08e9"+
		"\u00a5\3\2\2\2\u08ea\u08eb\5\u0102\u0082\2\u08eb\u08f4\7\4\2\2\u08ec\u08f1"+
		"\5\u00be`\2\u08ed\u08ee\7\6\2\2\u08ee\u08f0\5\u00be`\2\u08ef\u08ed\3\2"+
		"\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08ef\3\2\2\2\u08f1\u08f2\3\2\2\2\u08f2"+
		"\u08f5\3\2\2\2\u08f3\u08f1\3\2\2\2\u08f4\u08ec\3\2\2\2\u08f4\u08f5\3\2"+
		"\2\2\u08f5\u08f6\3\2\2\2\u08f6\u08f7\7\5\2\2\u08f7\u08f8\5\u00a8U\2\u08f8"+
		"\u00a7\3\2\2\2\u08f9\u08fb\7\30\2\2\u08fa\u08f9\3\2\2\2\u08fa\u08fb\3"+
		"\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe\5\u0108\u0085\2\u08fd\u08ff\5\u0096"+
		"L\2\u08fe\u08fd\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff\u0901\3\2\2\2\u0900"+
		"\u08fa\3\2\2\2\u0900\u0901\3\2\2\2\u0901\u00a9\3\2\2\2\u0902\u0903\7\u00d5"+
		"\2\2\u0903\u0904\7h\2\2\u0904\u0905\7\u00dd\2\2\u0905\u0909\7\u0130\2"+
		"\2\u0906\u0907\7\u0113\2\2\u0907\u0908\7\u00de\2\2\u0908\u090a\5:\36\2"+
		"\u0909\u0906\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u0934\3\2\2\2\u090b\u090c"+
		"\7\u00d5\2\2\u090c\u090d\7h\2\2\u090d\u0917\7G\2\2\u090e\u090f\7a\2\2"+
		"\u090f\u0910\7\u00f4\2\2\u0910\u0911\7 \2\2\u0911\u0915\7\u0130\2\2\u0912"+
		"\u0913\7V\2\2\u0913\u0914\7 \2\2\u0914\u0916\7\u0130\2\2\u0915\u0912\3"+
		"\2\2\2\u0915\u0916\3\2\2\2\u0916\u0918\3\2\2\2\u0917\u090e\3\2\2\2\u0917"+
		"\u0918\3\2\2\2\u0918\u091e\3\2\2\2\u0919\u091a\7,\2\2\u091a\u091b\7\u0084"+
		"\2\2\u091b\u091c\7\u00f4\2\2\u091c\u091d\7 \2\2\u091d\u091f\7\u0130\2"+
		"\2\u091e\u0919\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0925\3\2\2\2\u0920\u0921"+
		"\7\u0098\2\2\u0921\u0922\7\u0086\2\2\u0922\u0923\7\u00f4\2\2\u0923\u0924"+
		"\7 \2\2\u0924\u0926\7\u0130\2\2\u0925\u0920\3\2\2\2\u0925\u0926\3\2\2"+
		"\2\u0926\u092b\3\2\2\2\u0927\u0928\7\u008e\2\2\u0928\u0929\7\u00f4\2\2"+
		"\u0929\u092a\7 \2\2\u092a\u092c\7\u0130\2\2\u092b\u0927\3\2\2\2\u092b"+
		"\u092c\3\2\2\2\u092c\u0931\3\2\2\2\u092d\u092e\7\u00a3\2\2\u092e\u092f"+
		"\7E\2\2\u092f\u0930\7\30\2\2\u0930\u0932\7\u0130\2\2\u0931\u092d\3\2\2"+
		"\2\u0931\u0932\3\2\2\2\u0932\u0934\3\2\2\2\u0933\u0902\3\2\2\2\u0933\u090b"+
		"\3\2\2\2\u0934\u00ab\3\2\2\2\u0935\u093a\5\u00aeX\2\u0936\u0937\7\6\2"+
		"\2\u0937\u0939\5\u00aeX\2\u0938\u0936\3\2\2\2\u0939\u093c\3\2\2\2\u093a"+
		"\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u00ad\3\2\2\2\u093c\u093a\3\2"+
		"\2\2\u093d\u0942\5\u0102\u0082\2\u093e\u093f\7\7\2\2\u093f\u0941\5\u0102"+
		"\u0082\2\u0940\u093e\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940\3\2\2\2\u0942"+
		"\u0943\3\2\2\2\u0943\u00af\3\2\2\2\u0944\u0942\3\2\2\2\u0945\u0946\5\u0102"+
		"\u0082\2\u0946\u0947\7\7\2\2\u0947\u0949\3\2\2\2\u0948\u0945\3\2\2\2\u0948"+
		"\u0949\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u094b\5\u0102\u0082\2\u094b\u00b1"+
		"\3\2\2\2\u094c\u094d\5\u0102\u0082\2\u094d\u094e\7\7\2\2\u094e\u0950\3"+
		"\2\2\2\u094f\u094c\3\2\2\2\u094f\u0950\3\2\2\2\u0950\u0951\3\2\2\2\u0951"+
		"\u0952\5\u0102\u0082\2\u0952\u00b3\3\2\2\2\u0953\u095b\5\u00be`\2\u0954"+
		"\u0956\7\30\2\2\u0955\u0954\3\2\2\2\u0955\u0956\3\2\2\2\u0956\u0959\3"+
		"\2\2\2\u0957\u095a\5\u0102\u0082\2\u0958\u095a\5\u0096L\2\u0959\u0957"+
		"\3\2\2\2\u0959\u0958\3\2\2\2\u095a\u095c\3\2\2\2\u095b\u0955\3\2\2\2\u095b"+
		"\u095c\3\2\2\2\u095c\u00b5\3\2\2\2\u095d\u0962\5\u00b4[\2\u095e\u095f"+
		"\7\6\2\2\u095f\u0961\5\u00b4[\2\u0960\u095e\3\2\2\2\u0961\u0964\3\2\2"+
		"\2\u0962\u0960\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u00b7\3\2\2\2\u0964\u0962"+
		"\3\2\2\2\u0965\u0966\7\4\2\2\u0966\u096b\5\u00ba^\2\u0967\u0968\7\6\2"+
		"\2\u0968\u096a\5\u00ba^\2\u0969\u0967\3\2\2\2\u096a\u096d\3\2\2\2\u096b"+
		"\u0969\3\2\2\2\u096b\u096c\3\2\2\2\u096c\u096e\3\2\2\2\u096d\u096b\3\2"+
		"\2\2\u096e\u096f\7\5\2\2\u096f\u00b9\3\2\2\2\u0970\u097e\5\u0100\u0081"+
		"\2\u0971\u0972\5\u0106\u0084\2\u0972\u0973\7\4\2\2\u0973\u0978\5\u00bc"+
		"_\2\u0974\u0975\7\6\2\2\u0975\u0977\5\u00bc_\2\u0976\u0974\3\2\2\2\u0977"+
		"\u097a\3\2\2\2\u0978\u0976\3\2\2\2\u0978\u0979\3\2\2\2\u0979\u097b\3\2"+
		"\2\2\u097a\u0978\3\2\2\2\u097b\u097c\7\5\2\2\u097c\u097e\3\2\2\2\u097d"+
		"\u0970\3\2\2\2\u097d\u0971\3\2\2\2\u097e\u00bb\3\2\2\2\u097f\u0982\5\u0100"+
		"\u0081\2\u0980\u0982\5\u00c8e\2\u0981\u097f\3\2\2\2\u0981\u0980\3\2\2"+
		"\2\u0982\u00bd\3\2\2\2\u0983\u0984\5\u00c0a\2\u0984\u00bf\3\2\2\2\u0985"+
		"\u0986\ba\1\2\u0986\u0987\7\u00a2\2\2\u0987\u0992\5\u00c0a\7\u0988\u0989"+
		"\7Y\2\2\u0989\u098a\7\4\2\2\u098a\u098b\5\"\22\2\u098b\u098c\7\5\2\2\u098c"+
		"\u0992\3\2\2\2\u098d\u098f\5\u00c4c\2\u098e\u0990\5\u00c2b\2\u098f\u098e"+
		"\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0992\3\2\2\2\u0991\u0985\3\2\2\2\u0991"+
		"\u0988\3\2\2\2\u0991\u098d\3\2\2\2\u0992\u099b\3\2\2\2\u0993\u0994\f\4"+
		"\2\2\u0994\u0995\7\23\2\2\u0995\u099a\5\u00c0a\5\u0996\u0997\f\3\2\2\u0997"+
		"\u0998\7\u00aa\2\2\u0998\u099a\5\u00c0a\4\u0999\u0993\3\2\2\2\u0999\u0996"+
		"\3\2\2\2\u099a\u099d\3\2\2\2\u099b\u0999\3\2\2\2\u099b\u099c\3\2\2\2\u099c"+
		"\u00c1\3\2\2\2\u099d\u099b\3\2\2\2\u099e\u09a0\7\u00a2\2\2\u099f\u099e"+
		"\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\7\34\2\2"+
		"\u09a2\u09a3\5\u00c4c\2\u09a3\u09a4\7\23\2\2\u09a4\u09a5\5\u00c4c\2\u09a5"+
		"\u09dd\3\2\2\2\u09a6\u09a8\7\u00a2\2\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8"+
		"\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09aa\7y\2\2\u09aa\u09ab\7\4\2\2\u09ab"+
		"\u09b0\5\u00be`\2\u09ac\u09ad\7\6\2\2\u09ad\u09af\5\u00be`\2\u09ae\u09ac"+
		"\3\2\2\2\u09af\u09b2\3\2\2\2\u09b0\u09ae\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1"+
		"\u09b3\3\2\2\2\u09b2\u09b0\3\2\2\2\u09b3\u09b4\7\5\2\2\u09b4\u09dd\3\2"+
		"\2\2\u09b5\u09b7\7\u00a2\2\2\u09b6\u09b5\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u09b8\3\2\2\2\u09b8\u09b9\7y\2\2\u09b9\u09ba\7\4\2\2\u09ba\u09bb\5\""+
		"\22\2\u09bb\u09bc\7\5\2\2\u09bc\u09dd\3\2\2\2\u09bd\u09bf\7\u00a2\2\2"+
		"\u09be\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u09c1"+
		"\7\u00d0\2\2\u09c1\u09dd\5\u00c4c\2\u09c2\u09c4\7\u00a2\2\2\u09c3\u09c2"+
		"\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\3\2\2\2\u09c5\u09c6\7\u008c\2"+
		"\2\u09c6\u09c9\5\u00c4c\2\u09c7\u09c8\7U\2\2\u09c8\u09ca\7\u0130\2\2\u09c9"+
		"\u09c7\3\2\2\2\u09c9\u09ca\3\2\2\2\u09ca\u09dd\3\2\2\2\u09cb\u09cd\7\u0083"+
		"\2\2\u09cc\u09ce\7\u00a2\2\2\u09cd\u09cc\3\2\2\2\u09cd\u09ce\3\2\2\2\u09ce"+
		"\u09cf\3\2\2\2\u09cf\u09dd\7\u00a3\2\2\u09d0\u09d2\7\u0083\2\2\u09d1\u09d3"+
		"\7\u00a2\2\2\u09d2\u09d1\3\2\2\2\u09d2\u09d3\3\2\2\2\u09d3\u09d4\3\2\2"+
		"\2\u09d4\u09dd\t\26\2\2\u09d5\u09d7\7\u0083\2\2\u09d6\u09d8\7\u00a2\2"+
		"\2\u09d7\u09d6\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09d9\3\2\2\2\u09d9\u09da"+
		"\7O\2\2\u09da\u09db\7j\2\2\u09db\u09dd\5\u00c4c\2\u09dc\u099f\3\2\2\2"+
		"\u09dc\u09a7\3\2\2\2\u09dc\u09b6\3\2\2\2\u09dc\u09be\3\2\2\2\u09dc\u09c3"+
		"\3\2\2\2\u09dc\u09cb\3\2\2\2\u09dc\u09d0\3\2\2\2\u09dc\u09d5\3\2\2\2\u09dd"+
		"\u00c3\3\2\2\2\u09de\u09df\bc\1\2\u09df\u09e3\5\u00c6d\2\u09e0\u09e1\t"+
		"\27\2\2\u09e1\u09e3\5\u00c4c\t\u09e2\u09de\3\2\2\2\u09e2\u09e0\3\2\2\2"+
		"\u09e3\u09f9\3\2\2\2\u09e4\u09e5\f\b\2\2\u09e5\u09e6\t\30\2\2\u09e6\u09f8"+
		"\5\u00c4c\t\u09e7\u09e8\f\7\2\2\u09e8\u09e9\t\31\2\2\u09e9\u09f8\5\u00c4"+
		"c\b\u09ea\u09eb\f\6\2\2\u09eb\u09ec\7\u012c\2\2\u09ec\u09f8\5\u00c4c\7"+
		"\u09ed\u09ee\f\5\2\2\u09ee\u09ef\7\u012f\2\2\u09ef\u09f8\5\u00c4c\6\u09f0"+
		"\u09f1\f\4\2\2\u09f1\u09f2\7\u012d\2\2\u09f2\u09f8\5\u00c4c\5\u09f3\u09f4"+
		"\f\3\2\2\u09f4\u09f5\5\u00caf\2\u09f5\u09f6\5\u00c4c\4\u09f6\u09f8\3\2"+
		"\2\2\u09f7\u09e4\3\2\2\2\u09f7\u09e7\3\2\2\2\u09f7\u09ea\3\2\2\2\u09f7"+
		"\u09ed\3\2\2\2\u09f7\u09f0\3\2\2\2\u09f7\u09f3\3\2\2\2\u09f8\u09fb\3\2"+
		"\2\2\u09f9\u09f7\3\2\2\2\u09f9\u09fa\3\2\2\2\u09fa\u00c5\3\2\2\2\u09fb"+
		"\u09f9\3\2\2\2\u09fc\u09fd\bd\1\2\u09fd\u0ab5\t\32\2\2\u09fe\u0a00\7#"+
		"\2\2\u09ff\u0a01\5\u00f0y\2\u0a00\u09ff\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02"+
		"\u0a00\3\2\2\2\u0a02\u0a03\3\2\2\2\u0a03\u0a06\3\2\2\2\u0a04\u0a05\7S"+
		"\2\2\u0a05\u0a07\5\u00be`\2\u0a06\u0a04\3\2\2\2\u0a06\u0a07\3\2\2\2\u0a07"+
		"\u0a08\3\2\2\2\u0a08\u0a09\7T\2\2\u0a09\u0ab5\3\2\2\2\u0a0a\u0a0b\7#\2"+
		"\2\u0a0b\u0a0d\5\u00be`\2\u0a0c\u0a0e\5\u00f0y\2\u0a0d\u0a0c\3\2\2\2\u0a0e"+
		"\u0a0f\3\2\2\2\u0a0f\u0a0d\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0a13\3\2"+
		"\2\2\u0a11\u0a12\7S\2\2\u0a12\u0a14\5\u00be`\2\u0a13\u0a11\3\2\2\2\u0a13"+
		"\u0a14\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\7T\2\2\u0a16\u0ab5\3\2"+
		"\2\2\u0a17\u0a18\7$\2\2\u0a18\u0a19\7\4\2\2\u0a19\u0a1a\5\u00be`\2\u0a1a"+
		"\u0a1b\7\30\2\2\u0a1b\u0a1c\5\u00e2r\2\u0a1c\u0a1d\7\5\2\2\u0a1d\u0ab5"+
		"\3\2\2\2\u0a1e\u0a1f\7\u00ec\2\2\u0a1f\u0a28\7\4\2\2\u0a20\u0a25\5\u00b4"+
		"[\2\u0a21\u0a22\7\6\2\2\u0a22\u0a24\5\u00b4[\2\u0a23\u0a21\3\2\2\2\u0a24"+
		"\u0a27\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26\u0a29\3\2"+
		"\2\2\u0a27\u0a25\3\2\2\2\u0a28\u0a20\3\2\2\2\u0a28\u0a29\3\2\2\2\u0a29"+
		"\u0a2a\3\2\2\2\u0a2a\u0ab5\7\5\2\2\u0a2b\u0a2c\7d\2\2\u0a2c\u0a2d\7\4"+
		"\2\2\u0a2d\u0a30\5\u00be`\2\u0a2e\u0a2f\7w\2\2\u0a2f\u0a31\7\u00a4\2\2"+
		"\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32\3\2\2\2\u0a32\u0a33"+
		"\7\5\2\2\u0a33\u0ab5\3\2\2\2\u0a34\u0a35\7\u0087\2\2\u0a35\u0a36\7\4\2"+
		"\2\u0a36\u0a39\5\u00be`\2\u0a37\u0a38\7w\2\2\u0a38\u0a3a\7\u00a4\2\2\u0a39"+
		"\u0a37\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\3\2\2\2\u0a3b\u0a3c\7\5"+
		"\2\2\u0a3c\u0ab5\3\2\2\2\u0a3d\u0a3e\7\u00ba\2\2\u0a3e\u0a3f\7\4\2\2\u0a3f"+
		"\u0a40\5\u00c4c\2\u0a40\u0a41\7y\2\2\u0a41\u0a42\5\u00c4c\2\u0a42\u0a43"+
		"\7\5\2\2\u0a43\u0ab5\3\2\2\2\u0a44\u0ab5\5\u00c8e\2\u0a45\u0ab5\7\u0127"+
		"\2\2\u0a46\u0a47\5\u0100\u0081\2\u0a47\u0a48\7\7\2\2\u0a48\u0a49\7\u0127"+
		"\2\2\u0a49\u0ab5\3\2\2\2\u0a4a\u0a4b\7\4\2\2\u0a4b\u0a4e\5\u00b4[\2\u0a4c"+
		"\u0a4d\7\6\2\2\u0a4d\u0a4f\5\u00b4[\2\u0a4e\u0a4c\3\2\2\2\u0a4f\u0a50"+
		"\3\2\2\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51\u0a52\3\2\2\2\u0a52"+
		"\u0a53\7\5\2\2\u0a53\u0ab5\3\2\2\2\u0a54\u0a55\7\4\2\2\u0a55\u0a56\5\""+
		"\22\2\u0a56\u0a57\7\5\2\2\u0a57\u0ab5\3\2\2\2\u0a58\u0a59\5\u00fe\u0080"+
		"\2\u0a59\u0a65\7\4\2\2\u0a5a\u0a5c\5\u0088E\2\u0a5b\u0a5a\3\2\2\2\u0a5b"+
		"\u0a5c\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d\u0a62\5\u00be`\2\u0a5e\u0a5f"+
		"\7\6\2\2\u0a5f\u0a61\5\u00be`\2\u0a60\u0a5e\3\2\2\2\u0a61\u0a64\3\2\2"+
		"\2\u0a62\u0a60\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a66\3\2\2\2\u0a64\u0a62"+
		"\3\2\2\2\u0a65\u0a5b\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66\u0a67\3\2\2\2\u0a67"+
		"\u0a6e\7\5\2\2\u0a68\u0a69\7b\2\2\u0a69\u0a6a\7\4\2\2\u0a6a\u0a6b\7\u0111"+
		"\2\2\u0a6b\u0a6c\5\u00c0a\2\u0a6c\u0a6d\7\5\2\2\u0a6d\u0a6f\3\2\2\2\u0a6e"+
		"\u0a68\3\2\2\2\u0a6e\u0a6f\3\2\2\2\u0a6f\u0a72\3\2\2\2\u0a70\u0a71\7\u00af"+
		"\2\2\u0a71\u0a73\5\u00f6|\2\u0a72\u0a70\3\2\2\2\u0a72\u0a73\3\2\2\2\u0a73"+
		"\u0ab5\3\2\2\2\u0a74\u0a75\5\u0106\u0084\2\u0a75\u0a76\7\n\2\2\u0a76\u0a77"+
		"\5\u00be`\2\u0a77\u0ab5\3\2\2\2\u0a78\u0a79\7\4\2\2\u0a79\u0a7c\5\u0106"+
		"\u0084\2\u0a7a\u0a7b\7\6\2\2\u0a7b\u0a7d\5\u0106\u0084\2\u0a7c\u0a7a\3"+
		"\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e\u0a7c\3\2\2\2\u0a7e\u0a7f\3\2\2\2\u0a7f"+
		"\u0a80\3\2\2\2\u0a80\u0a81\7\5\2\2\u0a81\u0a82\7\n\2\2\u0a82\u0a83\5\u00be"+
		"`\2\u0a83\u0ab5\3\2\2\2\u0a84\u0ab5\5\u0106\u0084\2\u0a85\u0a86\7\4\2"+
		"\2\u0a86\u0a87\5\u00be`\2\u0a87\u0a88\7\5\2\2\u0a88\u0ab5\3\2\2\2\u0a89"+
		"\u0a8a\7^\2\2\u0a8a\u0a8b\7\4\2\2\u0a8b\u0a8c\5\u0106\u0084\2\u0a8c\u0a8d"+
		"\7j\2\2\u0a8d\u0a8e\5\u00c4c\2\u0a8e\u0a8f\7\5\2\2\u0a8f\u0ab5\3\2\2\2"+
		"\u0a90\u0a91\t\33\2\2\u0a91\u0a92\7\4\2\2\u0a92\u0a93\5\u00c4c\2\u0a93"+
		"\u0a94\t\34\2\2\u0a94\u0a97\5\u00c4c\2\u0a95\u0a96\t\35\2\2\u0a96\u0a98"+
		"\5\u00c4c\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a99\3\2\2"+
		"\2\u0a99\u0a9a\7\5\2\2\u0a9a\u0ab5\3\2\2\2\u0a9b\u0a9c\7\u00fc\2\2\u0a9c"+
		"\u0a9e\7\4\2\2\u0a9d\u0a9f\t\36\2\2\u0a9e\u0a9d\3\2\2\2\u0a9e\u0a9f\3"+
		"\2\2\2\u0a9f\u0aa1\3\2\2\2\u0aa0\u0aa2\5\u00c4c\2\u0aa1\u0aa0\3\2\2\2"+
		"\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa3\3\2\2\2\u0aa3\u0aa4\7j\2\2\u0aa4\u0aa5"+
		"\5\u00c4c\2\u0aa5\u0aa6\7\5\2\2\u0aa6\u0ab5\3\2\2\2\u0aa7\u0aa8\7\u00b1"+
		"\2\2\u0aa8\u0aa9\7\4\2\2\u0aa9\u0aaa\5\u00c4c\2\u0aaa\u0aab\7\u00b9\2"+
		"\2\u0aab\u0aac\5\u00c4c\2\u0aac\u0aad\7j\2\2\u0aad\u0ab0\5\u00c4c\2\u0aae"+
		"\u0aaf\7f\2\2\u0aaf\u0ab1\5\u00c4c\2\u0ab0\u0aae\3\2\2\2\u0ab0\u0ab1\3"+
		"\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\7\5\2\2\u0ab3\u0ab5\3\2\2\2\u0ab4"+
		"\u09fc\3\2\2\2\u0ab4\u09fe\3\2\2\2\u0ab4\u0a0a\3\2\2\2\u0ab4\u0a17\3\2"+
		"\2\2\u0ab4\u0a1e\3\2\2\2\u0ab4\u0a2b\3\2\2\2\u0ab4\u0a34\3\2\2\2\u0ab4"+
		"\u0a3d\3\2\2\2\u0ab4\u0a44\3\2\2\2\u0ab4\u0a45\3\2\2\2\u0ab4\u0a46\3\2"+
		"\2\2\u0ab4\u0a4a\3\2\2\2\u0ab4\u0a54\3\2\2\2\u0ab4\u0a58\3\2\2\2\u0ab4"+
		"\u0a74\3\2\2\2\u0ab4\u0a78\3\2\2\2\u0ab4\u0a84\3\2\2\2\u0ab4\u0a85\3\2"+
		"\2\2\u0ab4\u0a89\3\2\2\2\u0ab4\u0a90\3\2\2\2\u0ab4\u0a9b\3\2\2\2\u0ab4"+
		"\u0aa7\3\2\2\2\u0ab5\u0ac0\3\2\2\2\u0ab6\u0ab7\f\n\2\2\u0ab7\u0ab8\7\13"+
		"\2\2\u0ab8\u0ab9\5\u00c4c\2\u0ab9\u0aba\7\f\2\2\u0aba\u0abf\3\2\2\2\u0abb"+
		"\u0abc\f\b\2\2\u0abc\u0abd\7\7\2\2\u0abd\u0abf\5\u0106\u0084\2\u0abe\u0ab6"+
		"\3\2\2\2\u0abe\u0abb\3\2\2\2\u0abf\u0ac2\3\2\2\2\u0ac0\u0abe\3\2\2\2\u0ac0"+
		"\u0ac1\3\2\2\2\u0ac1\u00c7\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac3\u0ad0\7\u00a3"+
		"\2\2\u0ac4\u0ad0\5\u00d2j\2\u0ac5\u0ac6\5\u0106\u0084\2\u0ac6\u0ac7\7"+
		"\u0130\2\2\u0ac7\u0ad0\3\2\2\2\u0ac8\u0ad0\5\u010c\u0087\2\u0ac9\u0ad0"+
		"\5\u00d0i\2\u0aca\u0acc\7\u0130\2\2\u0acb\u0aca\3\2\2\2\u0acc\u0acd\3"+
		"\2\2\2\u0acd\u0acb\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0ad0\3\2\2\2\u0acf"+
		"\u0ac3\3\2\2\2\u0acf\u0ac4\3\2\2\2\u0acf\u0ac5\3\2\2\2\u0acf\u0ac8\3\2"+
		"\2\2\u0acf\u0ac9\3\2\2\2\u0acf\u0acb\3\2\2\2\u0ad0\u00c9\3\2\2\2\u0ad1"+
		"\u0ad2\t\37\2\2\u0ad2\u00cb\3\2\2\2\u0ad3\u0ad4\t \2\2\u0ad4\u00cd\3\2"+
		"\2\2\u0ad5\u0ad6\t!\2\2\u0ad6\u00cf\3\2\2\2\u0ad7\u0ad8\t\"\2\2\u0ad8"+
		"\u00d1\3\2\2\2\u0ad9\u0adc\7\u0081\2\2\u0ada\u0add\5\u00d4k\2\u0adb\u0add"+
		"\5\u00d8m\2\u0adc\u0ada\3\2\2\2\u0adc\u0adb\3\2\2\2\u0adc\u0add\3\2\2"+
		"\2\u0add\u00d3\3\2\2\2\u0ade\u0ae0\5\u00d6l\2\u0adf\u0ae1\5\u00dan\2\u0ae0"+
		"\u0adf\3\2\2\2\u0ae0\u0ae1\3\2\2\2\u0ae1\u00d5\3\2\2\2\u0ae2\u0ae3\5\u00dc"+
		"o\2\u0ae3\u0ae4\5\u00dep\2\u0ae4\u0ae6\3\2\2\2\u0ae5\u0ae2\3\2\2\2\u0ae6"+
		"\u0ae7\3\2\2\2\u0ae7\u0ae5\3\2\2\2\u0ae7\u0ae8\3\2\2\2\u0ae8\u00d7\3\2"+
		"\2\2\u0ae9\u0aec\5\u00dan\2\u0aea\u0aed\5\u00d6l\2\u0aeb\u0aed\5\u00da"+
		"n\2\u0aec\u0aea\3\2\2\2\u0aec\u0aeb\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed"+
		"\u00d9\3\2\2\2\u0aee\u0aef\5\u00dco\2\u0aef\u0af0\5\u00dep\2\u0af0\u0af1"+
		"\7\u00f6\2\2\u0af1\u0af2\5\u00dep\2\u0af2\u00db\3\2\2\2\u0af3\u0af5\t"+
		"#\2\2\u0af4\u0af3\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u0af6\3\2\2\2\u0af6"+
		"\u0af9\t\25\2\2\u0af7\u0af9\7\u0130\2\2\u0af8\u0af4\3\2\2\2\u0af8\u0af7"+
		"\3\2\2\2\u0af9\u00dd\3\2\2\2\u0afa\u0b02\7C\2\2\u0afb\u0b02\7s\2\2\u0afc"+
		"\u0b02\7\u009b\2\2\u0afd\u0b02\7\u009c\2\2\u0afe\u0b02\7\u00d9\2\2\u0aff"+
		"\u0b02\7\u0114\2\2\u0b00\u0b02\5\u0106\u0084\2\u0b01\u0afa\3\2\2\2\u0b01"+
		"\u0afb\3\2\2\2\u0b01\u0afc\3\2\2\2\u0b01\u0afd\3\2\2\2\u0b01\u0afe\3\2"+
		"\2\2\u0b01\u0aff\3\2\2\2\u0b01\u0b00\3\2\2\2\u0b02\u00df\3\2\2\2\u0b03"+
		"\u0b07\7d\2\2\u0b04\u0b05\7\17\2\2\u0b05\u0b07\5\u0102\u0082\2\u0b06\u0b03"+
		"\3\2\2\2\u0b06\u0b04\3\2\2\2\u0b07\u00e1\3\2\2\2\u0b08\u0b09\7\27\2\2"+
		"\u0b09\u0b0a\7\u0121\2\2\u0b0a\u0b0b\5\u00e2r\2\u0b0b\u0b0c\7\u0123\2"+
		"\2\u0b0c\u0b2b\3\2\2\2\u0b0d\u0b0e\7\u0098\2\2\u0b0e\u0b0f\7\u0121\2\2"+
		"\u0b0f\u0b10\5\u00e2r\2\u0b10\u0b11\7\6\2\2\u0b11\u0b12\5\u00e2r\2\u0b12"+
		"\u0b13\7\u0123\2\2\u0b13\u0b2b\3\2\2\2\u0b14\u0b1b\7\u00ec\2\2\u0b15\u0b17"+
		"\7\u0121\2\2\u0b16\u0b18\5\u00ecw\2\u0b17\u0b16\3\2\2\2\u0b17\u0b18\3"+
		"\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1c\7\u0123\2\2\u0b1a\u0b1c\7\u011f"+
		"\2\2\u0b1b\u0b15\3\2\2\2\u0b1b\u0b1a\3\2\2\2\u0b1c\u0b2b\3\2\2\2\u0b1d"+
		"\u0b28\5\u0106\u0084\2\u0b1e\u0b1f\7\4\2\2\u0b1f\u0b24\7\u0134\2\2\u0b20"+
		"\u0b21\7\6\2\2\u0b21\u0b23\7\u0134\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b26"+
		"\3\2\2\2\u0b24\u0b22\3\2\2\2\u0b24\u0b25\3\2\2\2\u0b25\u0b27\3\2\2\2\u0b26"+
		"\u0b24\3\2\2\2\u0b27\u0b29\7\5\2\2\u0b28\u0b1e\3\2\2\2\u0b28\u0b29\3\2"+
		"\2\2\u0b29\u0b2b\3\2\2\2\u0b2a\u0b08\3\2\2\2\u0b2a\u0b0d\3\2\2\2\u0b2a"+
		"\u0b14\3\2\2\2\u0b2a\u0b1d\3\2\2\2\u0b2b\u00e3\3\2\2\2\u0b2c\u0b31\5\u00e6"+
		"t\2\u0b2d\u0b2e\7\6\2\2\u0b2e\u0b30\5\u00e6t\2\u0b2f\u0b2d\3\2\2\2\u0b30"+
		"\u0b33\3\2\2\2\u0b31\u0b2f\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u00e5\3\2"+
		"\2\2\u0b33\u0b31\3\2\2\2\u0b34\u0b35\5\u00aeX\2\u0b35\u0b38\5\u00e2r\2"+
		"\u0b36\u0b37\7\u00a2\2\2\u0b37\u0b39\7\u00a3\2\2\u0b38\u0b36\3\2\2\2\u0b38"+
		"\u0b39\3\2\2\2\u0b39\u0b3b\3\2\2\2\u0b3a\u0b3c\5 \21\2\u0b3b\u0b3a\3\2"+
		"\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u0b3e\3\2\2\2\u0b3d\u0b3f\5\u00e0q\2\u0b3e"+
		"\u0b3d\3\2\2\2\u0b3e\u0b3f\3\2\2\2\u0b3f\u00e7\3\2\2\2\u0b40\u0b45\5\u00ea"+
		"v\2\u0b41\u0b42\7\6\2\2\u0b42\u0b44\5\u00eav\2\u0b43\u0b41\3\2\2\2\u0b44"+
		"\u0b47\3\2\2\2\u0b45\u0b43\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u00e9\3\2"+
		"\2\2\u0b47\u0b45\3\2\2\2\u0b48\u0b49\5\u0102\u0082\2\u0b49\u0b4c\5\u00e2"+
		"r\2\u0b4a\u0b4b\7\u00a2\2\2\u0b4b\u0b4d\7\u00a3\2\2\u0b4c\u0b4a\3\2\2"+
		"\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b50\5 \21\2\u0b4f\u0b4e"+
		"\3\2\2\2\u0b4f\u0b50\3\2\2\2\u0b50\u00eb\3\2\2\2\u0b51\u0b56\5\u00eex"+
		"\2\u0b52\u0b53\7\6\2\2\u0b53\u0b55\5\u00eex\2\u0b54\u0b52\3\2\2\2\u0b55"+
		"\u0b58\3\2\2\2\u0b56\u0b54\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u00ed\3\2"+
		"\2\2\u0b58\u0b56\3\2\2\2\u0b59\u0b5a\5\u0106\u0084\2\u0b5a\u0b5b\7\r\2"+
		"\2\u0b5b\u0b5e\5\u00e2r\2\u0b5c\u0b5d\7\u00a2\2\2\u0b5d\u0b5f\7\u00a3"+
		"\2\2\u0b5e\u0b5c\3\2\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0b61\3\2\2\2\u0b60"+
		"\u0b62\5 \21\2\u0b61\u0b60\3\2\2\2\u0b61\u0b62\3\2\2\2\u0b62\u00ef\3\2"+
		"\2\2\u0b63\u0b64\7\u0110\2\2\u0b64\u0b65\5\u00be`\2\u0b65\u0b66\7\u00f5"+
		"\2\2\u0b66\u0b67\5\u00be`\2\u0b67\u00f1\3\2\2\2\u0b68\u0b69\7\u0112\2"+
		"\2\u0b69\u0b6e\5\u00f4{\2\u0b6a\u0b6b\7\6\2\2\u0b6b\u0b6d\5\u00f4{\2\u0b6c"+
		"\u0b6a\3\2\2\2\u0b6d\u0b70\3\2\2\2\u0b6e\u0b6c\3\2\2\2\u0b6e\u0b6f\3\2"+
		"\2\2\u0b6f\u00f3\3\2\2\2\u0b70\u0b6e\3\2\2\2\u0b71\u0b72\5\u0102\u0082"+
		"\2\u0b72\u0b73\7\30\2\2\u0b73\u0b74\5\u00f6|\2\u0b74\u00f5\3\2\2\2\u0b75"+
		"\u0ba4\5\u0102\u0082\2\u0b76\u0b77\7\4\2\2\u0b77\u0b78\5\u0102\u0082\2"+
		"\u0b78\u0b79\7\5\2\2\u0b79\u0ba4\3\2\2\2\u0b7a\u0b9d\7\4\2\2\u0b7b\u0b7c"+
		"\7(\2\2\u0b7c\u0b7d\7 \2\2\u0b7d\u0b82\5\u00be`\2\u0b7e\u0b7f\7\6\2\2"+
		"\u0b7f\u0b81\5\u00be`\2\u0b80\u0b7e\3\2\2\2\u0b81\u0b84\3\2\2\2\u0b82"+
		"\u0b80\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b9e\3\2\2\2\u0b84\u0b82\3\2"+
		"\2\2\u0b85\u0b86\t$\2\2\u0b86\u0b87\7 \2\2\u0b87\u0b8c\5\u00be`\2\u0b88"+
		"\u0b89\7\6\2\2\u0b89\u0b8b\5\u00be`\2\u0b8a\u0b88\3\2\2\2\u0b8b\u0b8e"+
		"\3\2\2\2\u0b8c\u0b8a\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d\u0b90\3\2\2\2\u0b8e"+
		"\u0b8c\3\2\2\2\u0b8f\u0b85\3\2\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b9b\3\2"+
		"\2\2\u0b91\u0b92\t%\2\2\u0b92\u0b93\7 \2\2\u0b93\u0b98\5X-\2\u0b94\u0b95"+
		"\7\6\2\2\u0b95\u0b97\5X-\2\u0b96\u0b94\3\2\2\2\u0b97\u0b9a\3\2\2\2\u0b98"+
		"\u0b96\3\2\2\2\u0b98\u0b99\3\2\2\2\u0b99\u0b9c\3\2\2\2\u0b9a\u0b98\3\2"+
		"\2\2\u0b9b\u0b91\3\2\2\2\u0b9b\u0b9c\3\2\2\2\u0b9c\u0b9e\3\2\2\2\u0b9d"+
		"\u0b7b\3\2\2\2\u0b9d\u0b8f\3\2\2\2\u0b9e\u0ba0\3\2\2\2\u0b9f\u0ba1\5\u00f8"+
		"}\2\u0ba0\u0b9f\3\2\2\2\u0ba0\u0ba1\3\2\2\2\u0ba1\u0ba2\3\2\2\2\u0ba2"+
		"\u0ba4\7\5\2\2\u0ba3\u0b75\3\2\2\2\u0ba3\u0b76\3\2\2\2\u0ba3\u0b7a\3\2"+
		"\2\2\u0ba4\u00f7\3\2\2\2\u0ba5\u0ba6\7\u00c1\2\2\u0ba6\u0bb6\5\u00fa~"+
		"\2\u0ba7\u0ba8\7\u00d6\2\2\u0ba8\u0bb6\5\u00fa~\2\u0ba9\u0baa\7\u00c1"+
		"\2\2\u0baa\u0bab\7\34\2\2\u0bab\u0bac\5\u00fa~\2\u0bac\u0bad\7\23\2\2"+
		"\u0bad\u0bae\5\u00fa~\2\u0bae\u0bb6\3\2\2\2\u0baf\u0bb0\7\u00d6\2\2\u0bb0"+
		"\u0bb1\7\34\2\2\u0bb1\u0bb2\5\u00fa~\2\u0bb2\u0bb3\7\23\2\2\u0bb3\u0bb4"+
		"\5\u00fa~\2\u0bb4\u0bb6\3\2\2\2\u0bb5\u0ba5\3\2\2\2\u0bb5\u0ba7\3\2\2"+
		"\2\u0bb5\u0ba9\3\2\2\2\u0bb5\u0baf\3\2\2\2\u0bb6\u00f9\3\2\2\2\u0bb7\u0bb8"+
		"\7\u0101\2\2\u0bb8\u0bbf\t&\2\2\u0bb9\u0bba\7;\2\2\u0bba\u0bbf\7\u00d5"+
		"\2\2\u0bbb\u0bbc\5\u00be`\2\u0bbc\u0bbd\t&\2\2\u0bbd\u0bbf\3\2\2\2\u0bbe"+
		"\u0bb7\3\2\2\2\u0bbe\u0bb9\3\2\2\2\u0bbe\u0bbb\3\2\2\2\u0bbf\u00fb\3\2"+
		"\2\2\u0bc0\u0bc5\5\u0100\u0081\2\u0bc1\u0bc2\7\6\2\2\u0bc2\u0bc4\5\u0100"+
		"\u0081\2\u0bc3\u0bc1\3\2\2\2\u0bc4\u0bc7\3\2\2\2\u0bc5\u0bc3\3\2\2\2\u0bc5"+
		"\u0bc6\3\2\2\2\u0bc6\u00fd\3\2\2\2\u0bc7\u0bc5\3\2\2\2\u0bc8\u0bcd\5\u0100"+
		"\u0081\2\u0bc9\u0bcd\7b\2\2\u0bca\u0bcd\7\u008b\2\2\u0bcb\u0bcd\7\u00cf"+
		"\2\2\u0bcc\u0bc8\3\2\2\2\u0bcc\u0bc9\3\2\2\2\u0bcc\u0bca\3\2\2\2\u0bcc"+
		"\u0bcb\3\2\2\2\u0bcd\u00ff\3\2\2\2\u0bce\u0bd3\5\u0106\u0084\2\u0bcf\u0bd0"+
		"\7\7\2\2\u0bd0\u0bd2\5\u0106\u0084\2\u0bd1\u0bcf\3\2\2\2\u0bd2\u0bd5\3"+
		"\2\2\2\u0bd3\u0bd1\3\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0101\3\2\2\2\u0bd5"+
		"\u0bd3\3\2\2\2\u0bd6\u0bd7\5\u0106\u0084\2\u0bd7\u0bd8\5\u0104\u0083\2"+
		"\u0bd8\u0103\3\2\2\2\u0bd9\u0bda\7\u0126\2\2\u0bda\u0bdc\5\u0106\u0084"+
		"\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0bdd\3\2\2\2\u0bdd\u0bdb\3\2\2\2\u0bdd\u0bde"+
		"\3\2\2\2\u0bde\u0be1\3\2\2\2\u0bdf\u0be1\3\2\2\2\u0be0\u0bdb\3\2\2\2\u0be0"+
		"\u0bdf\3\2\2\2\u0be1\u0105\3\2\2\2\u0be2\u0be6\5\u0108\u0085\2\u0be3\u0be4"+
		"\6\u0084\24\2\u0be4\u0be6\5\u0112\u008a\2\u0be5\u0be2\3\2\2\2\u0be5\u0be3"+
		"\3\2\2\2\u0be6\u0107\3\2\2\2\u0be7\u0bee\7\u0139\2\2\u0be8\u0bee\5\u010a"+
		"\u0086\2\u0be9\u0bea\6\u0085\25\2\u0bea\u0bee\5\u0110\u0089\2\u0beb\u0bec"+
		"\6\u0085\26\2\u0bec\u0bee\5\u0114\u008b\2\u0bed\u0be7\3\2\2\2\u0bed\u0be8"+
		"\3\2\2\2\u0bed\u0be9\3\2\2\2\u0bed\u0beb\3\2\2\2\u0bee\u0109\3\2\2\2\u0bef"+
		"\u0bf0\7\u013a\2\2\u0bf0\u010b\3\2\2\2\u0bf1\u0bf3\6\u0087\27\2\u0bf2"+
		"\u0bf4\7\u0126\2\2\u0bf3\u0bf2\3\2\2\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf5"+
		"\3\2\2\2\u0bf5\u0c19\7\u0135\2\2\u0bf6\u0bf8\6\u0087\30\2\u0bf7\u0bf9"+
		"\7\u0126\2\2\u0bf8\u0bf7\3\2\2\2\u0bf8\u0bf9\3\2\2\2\u0bf9\u0bfa\3\2\2"+
		"\2\u0bfa\u0c19\7\u0136\2\2\u0bfb\u0bfd\6\u0087\31\2\u0bfc\u0bfe\7\u0126"+
		"\2\2\u0bfd\u0bfc\3\2\2\2\u0bfd\u0bfe\3\2\2\2\u0bfe\u0bff\3\2\2\2\u0bff"+
		"\u0c19\t\'\2\2\u0c00\u0c02\7\u0126\2\2\u0c01\u0c00\3\2\2\2\u0c01\u0c02"+
		"\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c19\7\u0134\2\2\u0c04\u0c06\7\u0126"+
		"\2\2\u0c05\u0c04\3\2\2\2\u0c05\u0c06\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07"+
		"\u0c19\7\u0131\2\2\u0c08\u0c0a\7\u0126\2\2\u0c09\u0c08\3\2\2\2\u0c09\u0c0a"+
		"\3\2\2\2\u0c0a\u0c0b\3\2\2\2\u0c0b\u0c19\7\u0132\2\2\u0c0c\u0c0e\7\u0126"+
		"\2\2\u0c0d\u0c0c\3\2\2\2\u0c0d\u0c0e\3\2\2\2\u0c0e\u0c0f\3\2\2\2\u0c0f"+
		"\u0c19\7\u0133\2\2\u0c10\u0c12\7\u0126\2\2\u0c11\u0c10\3\2\2\2\u0c11\u0c12"+
		"\3\2\2\2\u0c12\u0c13\3\2\2\2\u0c13\u0c19\7\u0137\2\2\u0c14\u0c16\7\u0126"+
		"\2\2\u0c15\u0c14\3\2\2\2\u0c15\u0c16\3\2\2\2\u0c16\u0c17\3\2\2\2\u0c17"+
		"\u0c19\7\u0138\2\2\u0c18\u0bf1\3\2\2\2\u0c18\u0bf6\3\2\2\2\u0c18\u0bfb"+
		"\3\2\2\2\u0c18\u0c01\3\2\2\2\u0c18\u0c05\3\2\2\2\u0c18\u0c09\3\2\2\2\u0c18"+
		"\u0c0d\3\2\2\2\u0c18\u0c11\3\2\2\2\u0c18\u0c15\3\2\2\2\u0c19\u010d\3\2"+
		"\2\2\u0c1a\u0c1b\7\u00ff\2\2\u0c1b\u0c22\5\u00e2r\2\u0c1c\u0c22\5 \21"+
		"\2\u0c1d\u0c22\5\u00e0q\2\u0c1e\u0c1f\t(\2\2\u0c1f\u0c20\7\u00a2\2\2\u0c20"+
		"\u0c22\7\u00a3\2\2\u0c21\u0c1a\3\2\2\2\u0c21\u0c1c\3\2\2\2\u0c21\u0c1d"+
		"\3\2\2\2\u0c21\u0c1e\3\2\2\2\u0c22\u010f\3\2\2\2\u0c23\u0c24\t)\2\2\u0c24"+
		"\u0111\3\2\2\2\u0c25\u0c26\t*\2\2\u0c26\u0113\3\2\2\2\u0c27\u0c28\t+\2"+
		"\2\u0c28\u0115\3\2\2\2\u019a\u011a\u0133\u0138\u0140\u0148\u014a\u015e"+
		"\u0162\u0168\u016b\u016e\u0176\u0179\u017d\u0180\u0188\u018d\u0190\u0197"+
		"\u01a3\u01ae\u01b0\u01b4\u01b7\u01be\u01c9\u01cb\u01d3\u01d8\u01db\u01e1"+
		"\u01ec\u022c\u0235\u0239\u023f\u0243\u0248\u024e\u0256\u025c\u0269\u026e"+
		"\u027e\u0285\u0289\u028f\u029e\u02a2\u02a8\u02ae\u02b1\u02b4\u02ba\u02be"+
		"\u02c6\u02c8\u02d1\u02d4\u02dd\u02e2\u02e8\u02ef\u02f2\u02f8\u0303\u0306"+
		"\u030a\u030f\u0314\u031b\u031e\u0321\u0328\u032d\u0336\u033e\u0344\u0347"+
		"\u034a\u0350\u0354\u0358\u035c\u035e\u0366\u036e\u0374\u0380\u0384\u0387"+
		"\u038b\u038e\u0392\u03ab\u03ae\u03b2\u03b8\u03bb\u03be\u03c4\u03cc\u03d1"+
		"\u03d7\u03dd\u03e9\u03ec\u03f3\u03fa\u0402\u0406\u0411\u041d\u0420\u0426"+
		"\u042c\u0432\u0436\u043d\u0440\u0446\u044c\u0454\u0458\u0464\u0468\u046e"+
		"\u0471\u047b\u047f\u0486\u04fa\u0502\u050a\u0513\u051d\u0521\u0524\u052a"+
		"\u0530\u053c\u0548\u054d\u0556\u055e\u0565\u0567\u056c\u0570\u0575\u057a"+
		"\u057f\u0582\u0587\u058b\u0590\u0592\u0596\u059f\u05a7\u05b0\u05b7\u05c0"+
		"\u05c5\u05c8\u05dd\u05df\u05e8\u05ef\u05f2\u05f9\u05fd\u0603\u060b\u0616"+
		"\u0621\u0628\u062e\u063b\u0642\u0649\u0655\u065d\u0663\u0666\u066f\u0672"+
		"\u067b\u067e\u0687\u068a\u0693\u0696\u0699\u069e\u06a0\u06ac\u06b3\u06ba"+
		"\u06bd\u06bf\u06cb\u06cf\u06d3\u06d9\u06dd\u06e5\u06e9\u06ec\u06ef\u06f2"+
		"\u06f6\u06fa\u06fd\u0701\u0706\u070a\u070d\u0710\u0713\u0715\u0721\u0724"+
		"\u0728\u0732\u0736\u0738\u073b\u073f\u0745\u0749\u0754\u075e\u076a\u0779"+
		"\u077e\u0785\u0795\u079a\u07a7\u07ac\u07b4\u07ba\u07be\u07c7\u07d6\u07db"+
		"\u07e7\u07ec\u07f4\u07f7\u07fb\u0809\u0816\u081b\u081f\u0822\u0827\u0830"+
		"\u0833\u0838\u083f\u0842\u084a\u0851\u0858\u085b\u0860\u0863\u0868\u086c"+
		"\u086f\u0872\u0878\u087d\u0882\u0894\u0896\u0899\u08a4\u08ad\u08b4\u08bc"+
		"\u08c3\u08c7\u08cf\u08d7\u08dd\u08e5\u08f1\u08f4\u08fa\u08fe\u0900\u0909"+
		"\u0915\u0917\u091e\u0925\u092b\u0931\u0933\u093a\u0942\u0948\u094f\u0955"+
		"\u0959\u095b\u0962\u096b\u0978\u097d\u0981\u098f\u0991\u0999\u099b\u099f"+
		"\u09a7\u09b0\u09b6\u09be\u09c3\u09c9\u09cd\u09d2\u09d7\u09dc\u09e2\u09f7"+
		"\u09f9\u0a02\u0a06\u0a0f\u0a13\u0a25\u0a28\u0a30\u0a39\u0a50\u0a5b\u0a62"+
		"\u0a65\u0a6e\u0a72\u0a7e\u0a97\u0a9e\u0aa1\u0ab0\u0ab4\u0abe\u0ac0\u0acd"+
		"\u0acf\u0adc\u0ae0\u0ae7\u0aec\u0af4\u0af8\u0b01\u0b06\u0b17\u0b1b\u0b24"+
		"\u0b28\u0b2a\u0b31\u0b38\u0b3b\u0b3e\u0b45\u0b4c\u0b4f\u0b56\u0b5e\u0b61"+
		"\u0b6e\u0b82\u0b8c\u0b8f\u0b98\u0b9b\u0b9d\u0ba0\u0ba3\u0bb5\u0bbe\u0bc5"+
		"\u0bcc\u0bd3\u0bdd\u0be0\u0be5\u0bed\u0bf3\u0bf8\u0bfd\u0c01\u0c05\u0c09"+
		"\u0c0d\u0c11\u0c15\u0c18\u0c21";
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