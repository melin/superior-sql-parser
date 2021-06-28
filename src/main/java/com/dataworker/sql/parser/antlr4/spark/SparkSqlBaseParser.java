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
		DATABASES=64, DBPROPERTIES=65, DEFINED=66, DELETE=67, DELIMITED=68, DELTA=69, 
		DESC=70, DESCRIBE=71, DETAIL=72, DFS=73, DIRECTORIES=74, DIRECTORY=75, 
		DISTINCT=76, DISTRIBUTE=77, DIV=78, DROP=79, DRY=80, ELSE=81, END=82, 
		ESCAPE=83, ESCAPED=84, EXCEPT=85, EXCHANGE=86, EXISTS=87, EXPLAIN=88, 
		EXPORT=89, EXTENDED=90, EXTERNAL=91, EXTRACT=92, FALSE=93, FETCH=94, FIELDS=95, 
		FILTER=96, FILEFORMAT=97, FIRST=98, FOLLOWING=99, FOR=100, FOREIGN=101, 
		FORMAT=102, FORMATTED=103, FROM=104, FULL=105, FUNCTION=106, FUNCTIONS=107, 
		GLOBAL=108, GRANT=109, GROUP=110, GROUPING=111, HAVING=112, HOURS=113, 
		HISTORY=114, IF=115, IGNORE=116, IMPORT=117, IN=118, INDEX=119, INDEXES=120, 
		INNER=121, INPATH=122, INPUTFORMAT=123, INSERT=124, INTERSECT=125, INTERVAL=126, 
		INTO=127, IS=128, ITEMS=129, JOIN=130, KEYS=131, LAST=132, LATERAL=133, 
		LAZY=134, LEADING=135, LEFT=136, LIKE=137, LIMIT=138, LINES=139, LIST=140, 
		LIFECYCLE=141, LOAD=142, LOCAL=143, LOCATION=144, LOCK=145, LOCKS=146, 
		LOGICAL=147, MACRO=148, MAP=149, MATCHED=150, MERGE=151, MSCK=152, NAMESPACE=153, 
		NAMESPACES=154, NATURAL=155, NO=156, NOT=157, NULL=158, NULLS=159, OF=160, 
		ON=161, ONLY=162, OPTION=163, OPTIONS=164, OR=165, ORDER=166, OUT=167, 
		OUTER=168, OUTPUTFORMAT=169, OVER=170, OVERLAPS=171, OVERLAY=172, OVERWRITE=173, 
		PARTITION=174, PARTITIONED=175, PARTITIONS=176, PARQUET=177, PERCENTLIT=178, 
		PIVOT=179, PLACING=180, POSITION=181, PRECEDING=182, PRIMARY=183, PRINCIPALS=184, 
		PROPERTIES=185, PURGE=186, QUERY=187, RANGE=188, RECORDREADER=189, RECORDWRITER=190, 
		RECOVER=191, REDUCE=192, REFERENCES=193, REFRESH=194, RENAME=195, REPAIR=196, 
		REPLACE=197, RESET=198, RESTRICT=199, REVOKE=200, RETAIN=201, RIGHT=202, 
		RLIKE=203, ROLE=204, ROLES=205, ROLLBACK=206, ROLLUP=207, ROW=208, ROWS=209, 
		RUN=210, SCHEMA=211, SELECT=212, SEMI=213, SEPARATED=214, SERDE=215, SERDEPROPERTIES=216, 
		SESSION_USER=217, SET=218, SETMINUS=219, SETS=220, SHOW=221, SKEWED=222, 
		SOME=223, SORT=224, SORTED=225, START=226, STATISTICS=227, STORED=228, 
		STRATIFY=229, STRUCT=230, SUBSTR=231, SUBSTRING=232, TABLE=233, TABLES=234, 
		TABLESAMPLE=235, TBLPROPERTIES=236, TEMPORARY=237, TERMINATED=238, THEN=239, 
		TO=240, TOUCH=241, TRAILING=242, TRANSACTION=243, TRANSACTIONS=244, TRANSFORM=245, 
		TRIM=246, TRUE=247, TRUNCATE=248, TYPE=249, UNARCHIVE=250, UNBOUNDED=251, 
		UNCACHE=252, UNION=253, UNIQUE=254, UNKNOWN=255, UNLOCK=256, UNSET=257, 
		UPDATE=258, USE=259, USER=260, USING=261, VALUES=262, VACUUM=263, VIEW=264, 
		VIEWS=265, WHEN=266, WHERE=267, WINDOW=268, WITH=269, KILL=270, READ=271, 
		JOB=272, ADDJAR=273, COMPRESS=274, FILE=275, DATAX=276, READER=277, WRITER=278, 
		EQ=279, NSEQ=280, NEQ=281, NEQJ=282, LT=283, LTE=284, GT=285, GTE=286, 
		PLUS=287, MINUS=288, ASTERISK=289, SLASH=290, PERCENT=291, TILDE=292, 
		AMPERSAND=293, PIPE=294, CONCAT_PIPE=295, HAT=296, STRING=297, BIGINT_LITERAL=298, 
		SMALLINT_LITERAL=299, TINYINT_LITERAL=300, INTEGER_VALUE=301, EXPONENT_VALUE=302, 
		DECIMAL_VALUE=303, DOUBLE_LITERAL=304, BIGDECIMAL_LITERAL=305, IDENTIFIER=306, 
		BACKQUOTED_IDENTIFIER=307, SIMPLE_COMMENT=308, BRACKETED_EMPTY_COMMENT=309, 
		BRACKETED_COMMENT=310, WS=311, UNRECOGNIZED=312, CLICKHOUSE=313;
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
		RULE_intervalValue = 109, RULE_colPosition = 110, RULE_dataType = 111, 
		RULE_qualifiedColTypeWithPositionList = 112, RULE_qualifiedColTypeWithPosition = 113, 
		RULE_colTypeList = 114, RULE_colType = 115, RULE_complexColTypeList = 116, 
		RULE_complexColType = 117, RULE_whenClause = 118, RULE_windowClause = 119, 
		RULE_namedWindow = 120, RULE_windowSpec = 121, RULE_windowFrame = 122, 
		RULE_frameBound = 123, RULE_qualifiedNameList = 124, RULE_functionName = 125, 
		RULE_qualifiedName = 126, RULE_errorCapturingIdentifier = 127, RULE_errorCapturingIdentifierExtra = 128, 
		RULE_identifier = 129, RULE_strictIdentifier = 130, RULE_quotedIdentifier = 131, 
		RULE_number = 132, RULE_alterColumnAction = 133, RULE_ansiNonReserved = 134, 
		RULE_strictNonReserved = 135, RULE_nonReserved = 136;
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
		"colPosition", "dataType", "qualifiedColTypeWithPositionList", "qualifiedColTypeWithPosition", 
		"colTypeList", "colType", "complexColTypeList", "complexColType", "whenClause", 
		"windowClause", "namedWindow", "windowSpec", "windowFrame", "frameBound", 
		"qualifiedNameList", "functionName", "qualifiedName", "errorCapturingIdentifier", 
		"errorCapturingIdentifierExtra", "identifier", "strictIdentifier", "quotedIdentifier", 
		"number", "alterColumnAction", "ansiNonReserved", "strictNonReserved", 
		"nonReserved"
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
		"'CURRENT_USER'", "'DATA'", "'DATABASE'", null, "'DBPROPERTIES'", "'DEFINED'", 
		"'DELETE'", "'DELIMITED'", "'DELTA'", "'DESC'", "'DESCRIBE'", "'DETAIL'", 
		"'DFS'", "'DIRECTORIES'", "'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", 
		"'DIV'", "'DROP'", "'DRY'", "'ELSE'", "'END'", "'ESCAPE'", "'ESCAPED'", 
		"'EXCEPT'", "'EXCHANGE'", "'EXISTS'", "'EXPLAIN'", "'EXPORT'", "'EXTENDED'", 
		"'EXTERNAL'", "'EXTRACT'", "'FALSE'", "'FETCH'", "'FIELDS'", "'FILTER'", 
		"'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", "'FOR'", "'FOREIGN'", "'FORMAT'", 
		"'FORMATTED'", "'FROM'", "'FULL'", "'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", 
		"'GRANT'", "'GROUP'", "'GROUPING'", "'HAVING'", "'HOURS'", "'HISTORY'", 
		"'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", "'INDEXES'", "'INNER'", 
		"'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", "'INTERVAL'", 
		"'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", "'LATERAL'", 
		"'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LINES'", "'LIST'", 
		"'LIFECYCLE'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
		"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MSCK'", "'NAMESPACE'", 
		"'NAMESPACES'", "'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", 
		"'ON'", "'ONLY'", "'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", 
		"'OUTER'", "'OUTPUTFORMAT'", "'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", 
		"'PARTITION'", "'PARTITIONED'", "'PARTITIONS'", "'PARQUET'", "'PERCENT'", 
		"'PIVOT'", "'PLACING'", "'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", 
		"'PROPERTIES'", "'PURGE'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
		"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
		"'REPLACE'", "'RESET'", "'RESTRICT'", "'REVOKE'", "'RETAIN'", "'RIGHT'", 
		null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", "'ROWS'", 
		"'RUN'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", 
		"'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", 
		"'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", "'STORED'", 
		"'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", "'TABLES'", 
		"'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", "'THEN'", "'TO'", 
		"'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", 
		"'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", "'UNBOUNDED'", 
		"'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", "'UNSET'", 
		"'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VACUUM'", "'VIEW'", 
		"'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'KILL'", "'READ'", 
		"'JOB'", "'ADDJAR'", "'COMPRESS'", "'FILE'", "'DATAX'", "'READER'", "'WRITER'", 
		null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'", null, null, null, 
		null, null, null, null, null, null, null, null, null, "'/**/'"
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
		"DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", "DELIMITED", 
		"DELTA", "DESC", "DESCRIBE", "DETAIL", "DFS", "DIRECTORIES", "DIRECTORY", 
		"DISTINCT", "DISTRIBUTE", "DIV", "DROP", "DRY", "ELSE", "END", "ESCAPE", 
		"ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", 
		"EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", 
		"FIRST", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", 
		"FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", 
		"HAVING", "HOURS", "HISTORY", "IF", "IGNORE", "IMPORT", "IN", "INDEX", 
		"INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", 
		"INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", 
		"LEFT", "LIKE", "LIMIT", "LINES", "LIST", "LIFECYCLE", "LOAD", "LOCAL", 
		"LOCATION", "LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", 
		"MSCK", "NAMESPACE", "NAMESPACES", "NATURAL", "NO", "NOT", "NULL", "NULLS", 
		"OF", "ON", "ONLY", "OPTION", "OPTIONS", "OR", "ORDER", "OUT", "OUTER", 
		"OUTPUTFORMAT", "OVER", "OVERLAPS", "OVERLAY", "OVERWRITE", "PARTITION", 
		"PARTITIONED", "PARTITIONS", "PARQUET", "PERCENTLIT", "PIVOT", "PLACING", 
		"POSITION", "PRECEDING", "PRIMARY", "PRINCIPALS", "PROPERTIES", "PURGE", 
		"QUERY", "RANGE", "RECORDREADER", "RECORDWRITER", "RECOVER", "REDUCE", 
		"REFERENCES", "REFRESH", "RENAME", "REPAIR", "REPLACE", "RESET", "RESTRICT", 
		"REVOKE", "RETAIN", "RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", 
		"ROW", "ROWS", "RUN", "SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", 
		"SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", 
		"SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", "STRATIFY", 
		"STRUCT", "SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
		"TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", "TRANSACTION", 
		"TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", 
		"UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", 
		"UPDATE", "USE", "USER", "USING", "VALUES", "VACUUM", "VIEW", "VIEWS", 
		"WHEN", "WHERE", "WINDOW", "WITH", "KILL", "READ", "JOB", "ADDJAR", "COMPRESS", 
		"FILE", "DATAX", "READER", "WRITER", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", 
		"LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "TILDE", 
		"AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
		"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
		"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
		"BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "CLICKHOUSE"
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
			setState(274);
			statement();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(275);
				match(T__0);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
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
			setState(283);
			namedExpression();
			setState(284);
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
			setState(286);
			tableIdentifier();
			setState(287);
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
			setState(289);
			multipartIdentifier();
			setState(290);
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
			setState(292);
			functionIdentifier();
			setState(293);
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
			setState(295);
			dataType();
			setState(296);
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
			setState(298);
			colTypeList();
			setState(299);
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
	public static class DataxExprContext extends StatementContext {
		public Token srcName;
		public TablePropertyListContext readOpts;
		public Token distName;
		public TablePropertyListContext writeOpts;
		public TerminalNode DATAX() { return getToken(SparkSqlBaseParser.DATAX, 0); }
		public TerminalNode READER() { return getToken(SparkSqlBaseParser.READER, 0); }
		public List<TerminalNode> OPTIONS() { return getTokens(SparkSqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SparkSqlBaseParser.OPTIONS, i);
		}
		public TerminalNode WRITER() { return getToken(SparkSqlBaseParser.WRITER, 0); }
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
		public DataxExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).enterDataxExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SparkSqlBaseListener ) ((SparkSqlBaseListener)listener).exitDataxExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SparkSqlBaseVisitor ) return ((SparkSqlBaseVisitor<? extends T>)visitor).visitDataxExpr(this);
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
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(302);
					ctes();
					}
				}

				setState(305);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(USE);
				setState(308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(307);
					match(NAMESPACE);
					}
					break;
				}
				setState(310);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(CREATE);
				setState(312);
				namespace();
				setState(316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(313);
					match(IF);
					setState(314);
					match(NOT);
					setState(315);
					match(EXISTS);
					}
					break;
				}
				setState(318);
				multipartIdentifier();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(324);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(319);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(320);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(321);
						match(WITH);
						setState(322);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(ALTER);
				setState(330);
				namespace();
				setState(331);
				multipartIdentifier();
				setState(332);
				match(SET);
				setState(333);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(334);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(ALTER);
				setState(337);
				namespace();
				setState(338);
				multipartIdentifier();
				setState(339);
				match(SET);
				setState(340);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(DROP);
				setState(343);
				namespace();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(344);
					match(IF);
					setState(345);
					match(EXISTS);
					}
					break;
				}
				setState(348);
				multipartIdentifier();
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(349);
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
				setState(352);
				match(SHOW);
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(354);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(355);
					multipartIdentifier();
					}
				}

				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(358);
						match(LIKE);
						}
					}

					setState(361);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(364);
				if (!(!legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "!legacy_create_hive_table_by_default_enabled");
				setState(365);
				createTableHeader();
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(366);
					match(T__1);
					setState(367);
					colTypeList();
					setState(368);
					match(T__2);
					}
					break;
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(372);
					tableProvider();
					}
				}

				setState(375);
				createTableClauses();
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(376);
						match(AS);
						}
					}

					setState(379);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(382);
				if (!(legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "legacy_create_hive_table_by_default_enabled");
				setState(383);
				createTableHeader();
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(384);
					match(T__1);
					setState(385);
					colTypeList();
					setState(386);
					match(T__2);
					}
				}

				setState(390);
				tableProvider();
				setState(391);
				createTableClauses();
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(392);
						match(AS);
						}
					}

					setState(395);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(398);
				createTableHeader();
				setState(403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(399);
					match(T__1);
					setState(400);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(401);
					match(T__2);
					}
					break;
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (LIFECYCLE - 141)) | (1L << (LOCATION - 141)) | (1L << (PARTITIONED - 141)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ROW - 208)) | (1L << (SKEWED - 208)) | (1L << (STORED - 208)) | (1L << (TBLPROPERTIES - 208)))) != 0)) {
					{
					setState(426);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(405);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						setState(415);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(406);
							match(PARTITIONED);
							setState(407);
							match(BY);
							setState(408);
							match(T__1);
							setState(409);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(410);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(412);
							match(PARTITIONED);
							setState(413);
							match(BY);
							setState(414);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(417);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(418);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(419);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(420);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(421);
						locationSpec();
						}
						break;
					case LIFECYCLE:
						{
						{
						setState(422);
						match(LIFECYCLE);
						setState(423);
						((CreateHiveTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(424);
						match(TBLPROPERTIES);
						setState(425);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(431);
						match(AS);
						}
					}

					setState(434);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(437);
				match(CREATE);
				setState(438);
				match(TABLE);
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(439);
					match(IF);
					setState(440);
					match(NOT);
					setState(441);
					match(EXISTS);
					}
					break;
				}
				setState(444);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(445);
				match(LIKE);
				setState(446);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ROW - 208)) | (1L << (STORED - 208)) | (1L << (TBLPROPERTIES - 208)) | (1L << (USING - 208)))) != 0)) {
					{
					setState(453);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(447);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(448);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(449);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(450);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(451);
						match(TBLPROPERTIES);
						setState(452);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(458);
				replaceTableHeader();
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(459);
					match(T__1);
					setState(460);
					colTypeList();
					setState(461);
					match(T__2);
					}
				}

				setState(465);
				tableProvider();
				setState(466);
				createTableClauses();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(467);
						match(AS);
						}
					}

					setState(470);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(473);
				match(ANALYZE);
				setState(474);
				match(TABLE);
				setState(475);
				multipartIdentifier();
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(476);
					partitionSpec();
					}
				}

				setState(479);
				match(COMPUTE);
				setState(480);
				match(STATISTICS);
				setState(488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(481);
					identifier();
					}
					break;
				case 2:
					{
					setState(482);
					match(FOR);
					setState(483);
					match(COLUMNS);
					setState(484);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(485);
					match(FOR);
					setState(486);
					match(ALL);
					setState(487);
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
				setState(490);
				match(ALTER);
				setState(491);
				match(TABLE);
				setState(492);
				multipartIdentifier();
				setState(493);
				match(ADD);
				setState(494);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(495);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(497);
				match(ALTER);
				setState(498);
				match(TABLE);
				setState(499);
				multipartIdentifier();
				setState(500);
				match(ADD);
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(502);
				match(T__1);
				setState(503);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(504);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(506);
				match(ALTER);
				setState(507);
				match(TABLE);
				setState(508);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(509);
				match(RENAME);
				setState(510);
				match(COLUMN);
				setState(511);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(512);
				match(TO);
				setState(513);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(515);
				match(ALTER);
				setState(516);
				match(TABLE);
				setState(517);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(518);
				match(DROP);
				setState(519);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(520);
				match(T__1);
				setState(521);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(522);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(524);
				match(ALTER);
				setState(525);
				match(TABLE);
				setState(526);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(527);
				match(DROP);
				setState(528);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(529);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(531);
				match(ALTER);
				setState(532);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(533);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(534);
				match(RENAME);
				setState(535);
				match(TO);
				setState(536);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(538);
				match(ALTER);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				multipartIdentifier();
				setState(541);
				match(SET);
				setState(542);
				match(TBLPROPERTIES);
				setState(543);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(545);
				match(ALTER);
				setState(546);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(547);
				multipartIdentifier();
				setState(548);
				match(UNSET);
				setState(549);
				match(TBLPROPERTIES);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(550);
					match(IF);
					setState(551);
					match(EXISTS);
					}
				}

				setState(554);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(556);
				match(ALTER);
				setState(557);
				match(TABLE);
				setState(558);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(559);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(560);
					match(COLUMN);
					}
					break;
				}
				setState(563);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(564);
					alterColumnAction();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(567);
				match(ALTER);
				setState(568);
				match(TABLE);
				setState(569);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(570);
					partitionSpec();
					}
				}

				setState(573);
				match(CHANGE);
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(574);
					match(COLUMN);
					}
					break;
				}
				setState(577);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(578);
				colType();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(579);
					colPosition();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(582);
				match(ALTER);
				setState(583);
				match(TABLE);
				setState(584);
				multipartIdentifier();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(585);
					partitionSpec();
					}
				}

				setState(588);
				match(SET);
				setState(589);
				match(SERDE);
				setState(590);
				match(STRING);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(591);
					match(WITH);
					setState(592);
					match(SERDEPROPERTIES);
					setState(593);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(596);
				match(ALTER);
				setState(597);
				match(TABLE);
				setState(598);
				multipartIdentifier();
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(599);
					partitionSpec();
					}
				}

				setState(602);
				match(SET);
				setState(603);
				match(SERDEPROPERTIES);
				setState(604);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(606);
				match(ALTER);
				setState(607);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(608);
				multipartIdentifier();
				setState(609);
				match(ADD);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(610);
					match(IF);
					setState(611);
					match(NOT);
					setState(612);
					match(EXISTS);
					}
				}

				setState(616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(615);
					partitionSpecLocation();
					}
					}
					setState(618); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(620);
				match(ALTER);
				setState(621);
				match(TABLE);
				setState(622);
				multipartIdentifier();
				setState(623);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(624);
				match(RENAME);
				setState(625);
				match(TO);
				setState(626);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(628);
				match(ALTER);
				setState(629);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(630);
				multipartIdentifier();
				setState(631);
				match(DROP);
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(632);
					match(IF);
					setState(633);
					match(EXISTS);
					}
				}

				setState(636);
				partitionSpec();
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(637);
					match(T__3);
					setState(638);
					partitionSpec();
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(644);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(647);
				match(ALTER);
				setState(648);
				match(TABLE);
				setState(649);
				multipartIdentifier();
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(650);
					partitionSpec();
					}
				}

				setState(653);
				match(SET);
				setState(654);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(656);
				match(ALTER);
				setState(657);
				match(TABLE);
				setState(658);
				multipartIdentifier();
				setState(659);
				match(RECOVER);
				setState(660);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(662);
				match(DROP);
				setState(663);
				match(TABLE);
				setState(666);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(664);
					match(IF);
					setState(665);
					match(EXISTS);
					}
					break;
				}
				setState(668);
				multipartIdentifier();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(669);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(672);
				match(DROP);
				setState(673);
				match(VIEW);
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(674);
					match(IF);
					setState(675);
					match(EXISTS);
					}
					break;
				}
				setState(678);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(679);
				match(CREATE);
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(680);
					match(OR);
					setState(681);
					match(REPLACE);
					}
				}

				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(684);
						match(GLOBAL);
						}
					}

					setState(687);
					match(TEMPORARY);
					}
				}

				setState(690);
				match(VIEW);
				setState(694);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(691);
					match(IF);
					setState(692);
					match(NOT);
					setState(693);
					match(EXISTS);
					}
					break;
				}
				setState(696);
				multipartIdentifier();
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(697);
					identifierCommentList();
					}
				}

				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(706);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(700);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(701);
						match(PARTITIONED);
						setState(702);
						match(ON);
						setState(703);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(704);
						match(TBLPROPERTIES);
						setState(705);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(711);
				match(AS);
				setState(712);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(714);
				match(CREATE);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(715);
					match(OR);
					setState(716);
					match(REPLACE);
					}
				}

				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(719);
					match(GLOBAL);
					}
				}

				setState(722);
				match(TEMPORARY);
				setState(723);
				match(VIEW);
				setState(724);
				tableIdentifier();
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(725);
					match(T__1);
					setState(726);
					colTypeList();
					setState(727);
					match(T__2);
					}
				}

				setState(731);
				tableProvider();
				setState(734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(732);
					match(OPTIONS);
					setState(733);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(736);
				match(ALTER);
				setState(737);
				match(VIEW);
				setState(738);
				multipartIdentifier();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(739);
					match(AS);
					}
				}

				setState(742);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(744);
				match(CREATE);
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(745);
					match(OR);
					setState(746);
					match(REPLACE);
					}
				}

				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(749);
					match(TEMPORARY);
					}
				}

				setState(752);
				match(FUNCTION);
				setState(756);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(753);
					match(IF);
					setState(754);
					match(NOT);
					setState(755);
					match(EXISTS);
					}
					break;
				}
				setState(758);
				multipartIdentifier();
				setState(759);
				match(AS);
				setState(760);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(761);
					match(USING);
					setState(762);
					resource();
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(763);
						match(T__3);
						setState(764);
						resource();
						}
						}
						setState(769);
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
				setState(772);
				match(DROP);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(773);
					match(TEMPORARY);
					}
				}

				setState(776);
				match(FUNCTION);
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(777);
					match(IF);
					setState(778);
					match(EXISTS);
					}
					break;
				}
				setState(781);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(782);
				match(EXPLAIN);
				setState(784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(783);
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
				setState(786);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(787);
				match(SHOW);
				setState(788);
				match(TABLES);
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(789);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(790);
					multipartIdentifier();
					}
				}

				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(794);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(793);
						match(LIKE);
						}
					}

					setState(796);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(799);
				match(SHOW);
				setState(800);
				match(TABLE);
				setState(801);
				match(EXTENDED);
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(802);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(803);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(806);
				match(LIKE);
				setState(807);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(808);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(811);
				match(SHOW);
				setState(812);
				match(TBLPROPERTIES);
				setState(813);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(814);
					match(T__1);
					setState(815);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(816);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(820);
				match(SHOW);
				setState(821);
				match(COLUMNS);
				setState(822);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(823);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
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
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(828);
				match(SHOW);
				setState(829);
				match(VIEWS);
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(830);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(831);
					multipartIdentifier();
					}
				}

				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(834);
						match(LIKE);
						}
					}

					setState(837);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(840);
				match(SHOW);
				setState(841);
				match(PARTITIONS);
				setState(842);
				multipartIdentifier();
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
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(846);
				match(SHOW);
				setState(848);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(847);
					identifier();
					}
					break;
				}
				setState(850);
				match(FUNCTIONS);
				setState(858);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(852);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(851);
						match(LIKE);
						}
						break;
					}
					setState(856);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(854);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(855);
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
				setState(860);
				match(SHOW);
				setState(861);
				match(CREATE);
				setState(862);
				match(TABLE);
				setState(863);
				multipartIdentifier();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(864);
					match(AS);
					setState(865);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(868);
				match(SHOW);
				setState(869);
				match(CURRENT);
				setState(870);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(871);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(872);
				match(FUNCTION);
				setState(874);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(873);
					match(EXTENDED);
					}
					break;
				}
				setState(876);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(877);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(878);
				namespace();
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(879);
					match(EXTENDED);
					}
					break;
				}
				setState(882);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(884);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(885);
				match(DETAIL);
				setState(886);
				((DescribeDeltaDetailContext)_localctx).table = multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(887);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				match(HISTORY);
				setState(889);
				((DescribeDeltaHistoryContext)_localctx).table = multipartIdentifier();
				setState(892);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(890);
					match(LIMIT);
					setState(891);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 53:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(894);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(895);
					match(TABLE);
					}
					break;
				}
				setState(899);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(898);
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
				setState(901);
				multipartIdentifier();
				setState(903);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(902);
					partitionSpec();
					}
					break;
				}
				setState(906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(905);
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
				setState(908);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(909);
					match(QUERY);
					}
				}

				setState(912);
				query();
				}
				break;
			case 55:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(913);
				match(COMMENT);
				setState(914);
				match(ON);
				setState(915);
				namespace();
				setState(916);
				multipartIdentifier();
				setState(917);
				match(IS);
				setState(918);
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
				setState(920);
				match(COMMENT);
				setState(921);
				match(ON);
				setState(922);
				match(TABLE);
				setState(923);
				multipartIdentifier();
				setState(924);
				match(IS);
				setState(925);
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
				setState(927);
				match(REFRESH);
				setState(928);
				match(TABLE);
				setState(929);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(930);
				match(REFRESH);
				setState(938);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(931);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(935);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(932);
							matchWildcard();
							}
							} 
						}
						setState(937);
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
				setState(940);
				match(CACHE);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(941);
					match(LAZY);
					}
				}

				setState(944);
				match(TABLE);
				setState(945);
				multipartIdentifier();
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(946);
					match(OPTIONS);
					setState(947);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(950);
						match(AS);
						}
					}

					setState(953);
					query();
					}
				}

				}
				break;
			case 60:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(956);
				match(UNCACHE);
				setState(957);
				match(TABLE);
				setState(960);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(958);
					match(IF);
					setState(959);
					match(EXISTS);
					}
					break;
				}
				setState(962);
				multipartIdentifier();
				}
				break;
			case 61:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(963);
				match(CLEAR);
				setState(964);
				match(CACHE);
				}
				break;
			case 62:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(965);
				match(LOAD);
				setState(966);
				match(DATA);
				setState(968);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(967);
					match(LOCAL);
					}
				}

				setState(970);
				match(INPATH);
				setState(971);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(973);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(972);
					match(OVERWRITE);
					}
				}

				setState(975);
				match(INTO);
				setState(976);
				match(TABLE);
				setState(977);
				multipartIdentifier();
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(978);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(981);
				match(TRUNCATE);
				setState(982);
				match(TABLE);
				setState(983);
				multipartIdentifier();
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(984);
					partitionSpec();
					}
				}

				}
				break;
			case 64:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(987);
				match(MSCK);
				setState(988);
				match(REPAIR);
				setState(989);
				match(TABLE);
				setState(990);
				multipartIdentifier();
				}
				break;
			case 65:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(991);
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
				setState(992);
				identifier();
				setState(1000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(993);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(997);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(994);
							matchWildcard();
							}
							} 
						}
						setState(999);
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
				setState(1002);
				match(SET);
				setState(1003);
				match(ROLE);
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1004);
						matchWildcard();
						}
						} 
					}
					setState(1009);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 67:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1010);
				match(SET);
				setState(1014);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1011);
						matchWildcard();
						}
						} 
					}
					setState(1016);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1017);
				match(RESET);
				}
				break;
			case 69:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1018);
				match(MERGE);
				setState(1019);
				match(TABLE);
				setState(1020);
				multipartIdentifier();
				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1021);
					partitionSpec();
					}
				}

				setState(1026);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1024);
					match(OPTIONS);
					setState(1025);
					((MergeTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 70:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1028);
				match(KILL);
				setState(1029);
				match(JOB);
				setState(1030);
				identifier();
				}
				break;
			case 71:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1031);
				match(ADDJAR);
				setState(1032);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 72:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1033);
				match(READ);
				setState(1034);
				match(TABLE);
				setState(1035);
				multipartIdentifier();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1036);
					partitionSpec();
					}
				}

				setState(1039);
				match(LIMIT);
				setState(1040);
				number();
				}
				break;
			case 73:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1042);
				match(LOAD);
				setState(1043);
				match(DATA);
				setState(1044);
				((LoadTempTableContext)_localctx).path = constant();
				setState(1045);
				match(TABLE);
				setState(1046);
				multipartIdentifier();
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1047);
					match(OPTIONS);
					setState(1048);
					((LoadTempTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 74:
				_localctx = new ExportTableContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1051);
					ctes();
					}
				}

				setState(1054);
				match(EXPORT);
				setState(1055);
				match(TABLE);
				setState(1056);
				multipartIdentifier();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1057);
					partitionSpec();
					}
				}

				setState(1060);
				match(TO);
				setState(1061);
				((ExportTableContext)_localctx).name = constant();
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1062);
					match(OPTIONS);
					setState(1063);
					((ExportTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 75:
				_localctx = new CompressTableContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1066);
				match(COMPRESS);
				setState(1067);
				match(TABLE);
				setState(1068);
				multipartIdentifier();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1069);
					partitionSpec();
					}
				}

				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1072);
					match(OPTIONS);
					setState(1073);
					((CompressTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 76:
				_localctx = new CompressFileContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1076);
				match(COMPRESS);
				setState(1077);
				match(FILE);
				setState(1078);
				((CompressFileContext)_localctx).path = constant();
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1079);
					match(OPTIONS);
					setState(1080);
					((CompressFileContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 77:
				_localctx = new DataxExprContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1083);
				match(DATAX);
				setState(1084);
				match(READER);
				setState(1085);
				match(T__1);
				setState(1086);
				((DataxExprContext)_localctx).srcName = match(STRING);
				setState(1087);
				match(T__2);
				setState(1088);
				match(OPTIONS);
				setState(1089);
				((DataxExprContext)_localctx).readOpts = tablePropertyList();
				setState(1090);
				match(WRITER);
				setState(1091);
				match(T__1);
				setState(1092);
				((DataxExprContext)_localctx).distName = match(STRING);
				setState(1093);
				match(T__2);
				setState(1094);
				match(OPTIONS);
				setState(1095);
				((DataxExprContext)_localctx).writeOpts = tablePropertyList();
				}
				break;
			case 78:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1097);
				match(VACUUM);
				setState(1098);
				((VacuumTableContext)_localctx).table = multipartIdentifier();
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(1099);
					match(RETAIN);
					setState(1100);
					((VacuumTableContext)_localctx).num = number();
					setState(1101);
					match(HOURS);
					}
				}

				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRY) {
					{
					setState(1105);
					match(DRY);
					setState(1106);
					match(RUN);
					}
				}

				}
				break;
			case 79:
				_localctx = new DeltaConvertContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1109);
				match(CONVERT);
				setState(1110);
				match(TO);
				setState(1111);
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
				setState(1112);
				((DeltaConvertContext)_localctx).table = multipartIdentifier();
				setState(1119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(1113);
					match(PARTITIONED);
					setState(1114);
					match(BY);
					setState(1115);
					match(T__1);
					setState(1116);
					colTypeList();
					setState(1117);
					match(T__2);
					}
				}

				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1121);
					match(OPTIONS);
					setState(1122);
					((DeltaConvertContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1125);
				unsupportedHiveNativeCommands();
				setState(1129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1126);
						matchWildcard();
						}
						} 
					}
					setState(1131);
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
			setState(1134);
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
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1137);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1139);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1141);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1145);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1152);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1199);
				tableIdentifier();
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1205);
				tableIdentifier();
				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1211);
				tableIdentifier();
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1217);
				tableIdentifier();
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1223);
				tableIdentifier();
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1229);
				tableIdentifier();
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1232);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1233);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1237);
				tableIdentifier();
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1240);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1244);
				tableIdentifier();
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1250);
				tableIdentifier();
				setState(1251);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1254);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1256);
				tableIdentifier();
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1260);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1262);
				tableIdentifier();
				setState(1263);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1265);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1266);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1267);
				tableIdentifier();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1268);
					partitionSpec();
					}
				}

				setState(1271);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1273);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1274);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1275);
				tableIdentifier();
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1276);
					partitionSpec();
					}
				}

				setState(1279);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1281);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1282);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1283);
				tableIdentifier();
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1284);
					partitionSpec();
					}
				}

				setState(1287);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1288);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1290);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1292);
				tableIdentifier();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1293);
					partitionSpec();
					}
				}

				setState(1296);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1299);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1300);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1301);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1302);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1303);
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
			setState(1306);
			match(CREATE);
			setState(1308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1307);
				match(TEMPORARY);
				}
			}

			setState(1311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1310);
				match(EXTERNAL);
				}
			}

			setState(1313);
			match(TABLE);
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1314);
				match(IF);
				setState(1315);
				match(NOT);
				setState(1316);
				match(EXISTS);
				}
				break;
			}
			setState(1319);
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
			setState(1323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1321);
				match(CREATE);
				setState(1322);
				match(OR);
				}
			}

			setState(1325);
			match(REPLACE);
			setState(1326);
			match(TABLE);
			setState(1327);
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
			setState(1329);
			match(CLUSTERED);
			setState(1330);
			match(BY);
			setState(1331);
			identifierList();
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1332);
				match(SORTED);
				setState(1333);
				match(BY);
				setState(1334);
				orderedIdentifierList();
				}
			}

			setState(1337);
			match(INTO);
			setState(1338);
			match(INTEGER_VALUE);
			setState(1339);
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
			setState(1341);
			match(SKEWED);
			setState(1342);
			match(BY);
			setState(1343);
			identifierList();
			setState(1344);
			match(ON);
			setState(1347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1345);
				constantList();
				}
				break;
			case 2:
				{
				setState(1346);
				nestedConstantList();
				}
				break;
			}
			setState(1352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1349);
				match(STORED);
				setState(1350);
				match(AS);
				setState(1351);
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
			setState(1354);
			match(LOCATION);
			setState(1355);
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
			setState(1357);
			match(COMMENT);
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
			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1360);
				ctes();
				}
			}

			setState(1363);
			queryTerm(0);
			setState(1364);
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
			setState(1421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1366);
				match(INSERT);
				setState(1367);
				match(OVERWRITE);
				setState(1369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1368);
					match(TABLE);
					}
					break;
				}
				setState(1371);
				multipartIdentifier();
				setState(1378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1372);
					partitionSpec();
					setState(1376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1373);
						match(IF);
						setState(1374);
						match(NOT);
						setState(1375);
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
				setState(1380);
				match(INSERT);
				setState(1381);
				match(INTO);
				setState(1383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1382);
					match(TABLE);
					}
					break;
				}
				setState(1385);
				multipartIdentifier();
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1386);
					partitionSpec();
					}
				}

				setState(1392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1389);
					match(IF);
					setState(1390);
					match(NOT);
					setState(1391);
					match(EXISTS);
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1394);
				match(INSERT);
				setState(1395);
				match(OVERWRITE);
				setState(1397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1396);
					match(LOCAL);
					}
				}

				setState(1399);
				match(DIRECTORY);
				setState(1400);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1401);
					rowFormat();
					}
				}

				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1404);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1407);
				match(INSERT);
				setState(1408);
				match(OVERWRITE);
				setState(1410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1409);
					match(LOCAL);
					}
				}

				setState(1412);
				match(DIRECTORY);
				setState(1414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1413);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1416);
				tableProvider();
				setState(1419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1417);
					match(OPTIONS);
					setState(1418);
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
			setState(1423);
			partitionSpec();
			setState(1425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1424);
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
			setState(1427);
			match(PARTITION);
			setState(1428);
			match(T__1);
			setState(1429);
			partitionVal();
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1430);
				match(T__3);
				setState(1431);
				partitionVal();
				}
				}
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1437);
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
			setState(1439);
			identifier();
			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1440);
				match(EQ);
				setState(1441);
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
			setState(1444);
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
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1448);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1449);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1450);
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
			setState(1453);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1454);
				match(T__4);
				setState(1455);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1460);
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
			setState(1461);
			match(WITH);
			setState(1462);
			namedQuery();
			setState(1467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1463);
				match(T__3);
				setState(1464);
				namedQuery();
				}
				}
				setState(1469);
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
			setState(1470);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1471);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1474);
				match(AS);
				}
			}

			setState(1477);
			match(T__1);
			setState(1478);
			query();
			setState(1479);
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
			setState(1481);
			match(USING);
			setState(1482);
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
			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (LIFECYCLE - 141)) | (1L << (LOCATION - 141)) | (1L << (OPTIONS - 141)) | (1L << (PARTITIONED - 141)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1496);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1484);
					match(OPTIONS);
					setState(1485);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1486);
					match(PARTITIONED);
					setState(1487);
					match(BY);
					setState(1488);
					((CreateTableClausesContext)_localctx).partitioning = transformList();
					}
					}
					break;
				case CLUSTERED:
					{
					setState(1489);
					bucketSpec();
					}
					break;
				case LOCATION:
					{
					setState(1490);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1491);
					commentSpec();
					}
					break;
				case LIFECYCLE:
					{
					{
					setState(1492);
					match(LIFECYCLE);
					setState(1493);
					((CreateTableClausesContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1494);
					match(TBLPROPERTIES);
					setState(1495);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1500);
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
			setState(1501);
			match(T__1);
			setState(1502);
			tableProperty();
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1503);
				match(T__3);
				setState(1504);
				tableProperty();
				}
				}
				setState(1509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1510);
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
			setState(1512);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (TRUE - 247)) | (1L << (EQ - 247)) | (1L << (STRING - 247)) | (1L << (INTEGER_VALUE - 247)) | (1L << (DECIMAL_VALUE - 247)))) != 0)) {
				{
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1513);
					match(EQ);
					}
				}

				setState(1516);
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
			setState(1528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				identifier();
				setState(1524);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1520);
					match(T__4);
					setState(1521);
					identifier();
					}
					}
					setState(1526);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1527);
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
			setState(1534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1530);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1531);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1532);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1533);
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
			setState(1536);
			match(T__1);
			setState(1537);
			constant();
			setState(1542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1538);
				match(T__3);
				setState(1539);
				constant();
				}
				}
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1545);
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
			setState(1547);
			match(T__1);
			setState(1548);
			constantList();
			setState(1553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1549);
				match(T__3);
				setState(1550);
				constantList();
				}
				}
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1556);
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
			setState(1564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(STORED);
				setState(1559);
				match(AS);
				setState(1560);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(STORED);
				setState(1562);
				match(BY);
				setState(1563);
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
			setState(1571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(INPUTFORMAT);
				setState(1567);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1568);
				match(OUTPUTFORMAT);
				setState(1569);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
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
			setState(1573);
			match(STRING);
			setState(1577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(1574);
				match(WITH);
				setState(1575);
				match(SERDEPROPERTIES);
				setState(1576);
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
			setState(1579);
			identifier();
			setState(1580);
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
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1582);
				insertInto();
				setState(1583);
				queryTerm(0);
				setState(1584);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1586);
				fromClause();
				setState(1588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1587);
					multiInsertQueryBody();
					}
					}
					setState(1590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1592);
				match(DELETE);
				setState(1593);
				match(FROM);
				setState(1594);
				multipartIdentifier();
				setState(1595);
				tableAlias();
				setState(1597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1596);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1599);
				match(UPDATE);
				setState(1600);
				multipartIdentifier();
				setState(1601);
				tableAlias();
				setState(1602);
				setClause();
				setState(1604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1603);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1606);
				match(MERGE);
				setState(1607);
				match(INTO);
				setState(1608);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1609);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1610);
				match(USING);
				setState(1616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1611);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1612);
					match(T__1);
					setState(1613);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1614);
					match(T__2);
					}
					break;
				}
				setState(1618);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1619);
				match(ON);
				setState(1620);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1621);
						matchedClause();
						}
						} 
					}
					setState(1626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1627);
					notMatchedClause();
					}
					}
					setState(1632);
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
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1635);
				match(ORDER);
				setState(1636);
				match(BY);
				setState(1637);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1638);
						match(T__3);
						setState(1639);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1644);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,182,_ctx);
				}
				}
				break;
			}
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1647);
				match(CLUSTER);
				setState(1648);
				match(BY);
				setState(1649);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1654);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1650);
						match(T__3);
						setState(1651);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1656);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				}
				break;
			}
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1659);
				match(DISTRIBUTE);
				setState(1660);
				match(BY);
				setState(1661);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1662);
						match(T__3);
						setState(1663);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1668);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				}
				break;
			}
			setState(1681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1671);
				match(SORT);
				setState(1672);
				match(BY);
				setState(1673);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1678);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1674);
						match(T__3);
						setState(1675);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1680);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				}
				break;
			}
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				{
				setState(1683);
				windowClause();
				}
				break;
			}
			setState(1691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1686);
				match(LIMIT);
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1687);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1688);
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
			setState(1693);
			insertInto();
			setState(1694);
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

			setState(1697);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1720);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1699);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1700);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1701);
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
						setState(1703);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1702);
							setQuantifier();
							}
						}

						setState(1705);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1706);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1707);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1708);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1709);
							setQuantifier();
							}
						}

						setState(1712);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1713);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1714);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1715);
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
						setState(1717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1716);
							setQuantifier();
							}
						}

						setState(1719);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
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
			setState(1734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1727);
				match(TABLE);
				setState(1728);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1729);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1730);
				match(T__1);
				setState(1731);
				query();
				setState(1732);
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
			setState(1736);
			expression();
			setState(1738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1737);
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
			setState(1742);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1740);
				match(NULLS);
				setState(1741);
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
			setState(1744);
			fromClause();
			setState(1746); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1745);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1748); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
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
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1750);
				transformClause();
				setState(1752);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1751);
					whereClause();
					}
					break;
				}
				setState(1754);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				selectClause();
				setState(1760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1757);
						lateralView();
						}
						} 
					}
					setState(1762);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
				}
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1763);
					whereClause();
					}
					break;
				}
				setState(1767);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1766);
					aggregationClause();
					}
					break;
				}
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1769);
					havingClause();
					}
					break;
				}
				setState(1773);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1772);
					windowClause();
					}
					break;
				}
				setState(1775);
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
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1779);
				transformClause();
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1780);
					fromClause();
					}
					break;
				}
				setState(1784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1783);
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
				setState(1786);
				selectClause();
				setState(1788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1787);
					fromClause();
					}
					break;
				}
				setState(1793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1790);
						lateralView();
						}
						} 
					}
					setState(1795);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
				}
				setState(1797);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1796);
					whereClause();
					}
					break;
				}
				setState(1800);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1799);
					aggregationClause();
					}
					break;
				}
				setState(1803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1802);
					havingClause();
					}
					break;
				}
				setState(1806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1805);
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
			setState(1820);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1810);
				match(SELECT);
				setState(1811);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1812);
				match(T__1);
				setState(1813);
				namedExpressionSeq();
				setState(1814);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1816);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1817);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1818);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1819);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1822);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1825);
				match(RECORDWRITER);
				setState(1826);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1829);
			match(USING);
			setState(1830);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1831);
				match(AS);
				setState(1841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1832);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1833);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1834);
					match(T__1);
					setState(1837);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
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
					}
					setState(1839);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1845);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1848);
				match(RECORDREADER);
				setState(1849);
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
			setState(1852);
			match(SELECT);
			setState(1856);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1853);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1858);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1859);
				setQuantifier();
				}
				break;
			}
			setState(1862);
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
			setState(1864);
			match(SET);
			setState(1865);
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
			setState(1867);
			match(WHEN);
			setState(1868);
			match(MATCHED);
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1869);
				match(AND);
				setState(1870);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1873);
			match(THEN);
			setState(1874);
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
			setState(1876);
			match(WHEN);
			setState(1877);
			match(NOT);
			setState(1878);
			match(MATCHED);
			setState(1881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1879);
				match(AND);
				setState(1880);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1883);
			match(THEN);
			setState(1884);
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
			setState(1893);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1886);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1887);
				match(UPDATE);
				setState(1888);
				match(SET);
				setState(1889);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1890);
				match(UPDATE);
				setState(1891);
				match(SET);
				setState(1892);
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
			setState(1913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				match(INSERT);
				setState(1896);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1897);
				match(INSERT);
				setState(1898);
				match(T__1);
				setState(1899);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1900);
				match(T__2);
				setState(1901);
				match(VALUES);
				setState(1902);
				match(T__1);
				setState(1903);
				expression();
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1904);
					match(T__3);
					setState(1905);
					expression();
					}
					}
					setState(1910);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1911);
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
			setState(1915);
			assignment();
			setState(1920);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1916);
				match(T__3);
				setState(1917);
				assignment();
				}
				}
				setState(1922);
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
			setState(1923);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1924);
			match(EQ);
			setState(1925);
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
			setState(1927);
			match(WHERE);
			setState(1928);
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
			setState(1930);
			match(HAVING);
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
			setState(1933);
			match(T__5);
			setState(1934);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1941);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
					case 1:
						{
						setState(1935);
						match(T__3);
						}
						break;
					}
					setState(1938);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			}
			setState(1944);
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
			setState(1959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1946);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1947);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1948);
				match(T__1);
				setState(1949);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1950);
					match(T__3);
					setState(1951);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1956);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1957);
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
			setState(1961);
			match(FROM);
			setState(1962);
			relation();
			setState(1967);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1963);
					match(T__3);
					setState(1964);
					relation();
					}
					} 
				}
				setState(1969);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			setState(1973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1970);
					lateralView();
					}
					} 
				}
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			setState(1977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1976);
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
			setState(2023);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				match(GROUP);
				setState(1980);
				match(BY);
				setState(1981);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1982);
						match(T__3);
						setState(1983);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1988);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				}
				setState(2006);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
				case 1:
					{
					setState(1989);
					match(WITH);
					setState(1990);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1991);
					match(WITH);
					setState(1992);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1993);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1994);
					match(SETS);
					setState(1995);
					match(T__1);
					setState(1996);
					groupingSet();
					setState(2001);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1997);
						match(T__3);
						setState(1998);
						groupingSet();
						}
						}
						setState(2003);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2004);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2008);
				match(GROUP);
				setState(2009);
				match(BY);
				setState(2010);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(2011);
				match(SETS);
				setState(2012);
				match(T__1);
				setState(2013);
				groupingSet();
				setState(2018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2014);
					match(T__3);
					setState(2015);
					groupingSet();
					}
					}
					setState(2020);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2021);
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
			setState(2038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				match(T__1);
				setState(2034);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
				case 1:
					{
					setState(2026);
					expression();
					setState(2031);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2027);
						match(T__3);
						setState(2028);
						expression();
						}
						}
						setState(2033);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2036);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
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
			setState(2040);
			match(PIVOT);
			setState(2041);
			match(T__1);
			setState(2042);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2043);
			match(FOR);
			setState(2044);
			pivotColumn();
			setState(2045);
			match(IN);
			setState(2046);
			match(T__1);
			setState(2047);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2048);
				match(T__3);
				setState(2049);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2054);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2055);
			match(T__2);
			setState(2056);
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
			setState(2070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2058);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2059);
				match(T__1);
				setState(2060);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2061);
					match(T__3);
					setState(2062);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2067);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2068);
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
			setState(2072);
			expression();
			setState(2077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(2074);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2073);
					match(AS);
					}
					break;
				}
				setState(2076);
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
			setState(2079);
			match(LATERAL);
			setState(2080);
			match(VIEW);
			setState(2082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2081);
				match(OUTER);
				}
				break;
			}
			setState(2084);
			qualifiedName();
			setState(2085);
			match(T__1);
			setState(2094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2086);
				expression();
				setState(2091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2087);
					match(T__3);
					setState(2088);
					expression();
					}
					}
					setState(2093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2096);
			match(T__2);
			setState(2097);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				{
				setState(2099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
				case 1:
					{
					setState(2098);
					match(AS);
					}
					break;
				}
				setState(2101);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2102);
						match(T__3);
						setState(2103);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2108);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
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
			setState(2111);
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
			setState(2113);
			relationPrimary();
			setState(2117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2114);
					joinRelation();
					}
					} 
				}
				setState(2119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
			setState(2131);
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
				setState(2120);
				joinType();
				}
				setState(2121);
				match(JOIN);
				setState(2122);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2123);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				match(NATURAL);
				setState(2127);
				joinType();
				setState(2128);
				match(JOIN);
				setState(2129);
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
			setState(2157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2133);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2136);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2137);
				match(LEFT);
				setState(2139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2138);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2141);
					match(LEFT);
					}
				}

				setState(2144);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2145);
				match(RIGHT);
				setState(2147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2146);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2149);
				match(FULL);
				setState(2151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2150);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2153);
					match(LEFT);
					}
				}

				setState(2156);
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
			setState(2163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2159);
				match(ON);
				setState(2160);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2161);
				match(USING);
				setState(2162);
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
			setState(2165);
			match(TABLESAMPLE);
			setState(2166);
			match(T__1);
			setState(2168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2167);
				sampleMethod();
				}
				break;
			}
			setState(2170);
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
			setState(2196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2172);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2175);
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
				setState(2176);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2177);
				expression();
				setState(2178);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2180);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2181);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2182);
				match(OUT);
				setState(2183);
				match(OF);
				setState(2184);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2185);
					match(ON);
					setState(2191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						setState(2186);
						identifier();
						}
						break;
					case 2:
						{
						setState(2187);
						qualifiedName();
						setState(2188);
						match(T__1);
						setState(2189);
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
				setState(2195);
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
			setState(2198);
			match(T__1);
			setState(2199);
			identifierSeq();
			setState(2200);
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
			setState(2202);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2203);
					match(T__3);
					setState(2204);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,276,_ctx);
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
			setState(2210);
			match(T__1);
			setState(2211);
			orderedIdentifier();
			setState(2216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2212);
				match(T__3);
				setState(2213);
				orderedIdentifier();
				}
				}
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2219);
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
			setState(2221);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2222);
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
			setState(2225);
			match(T__1);
			setState(2226);
			identifierComment();
			setState(2231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2227);
				match(T__3);
				setState(2228);
				identifierComment();
				}
				}
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2234);
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
			setState(2236);
			identifier();
			setState(2238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2237);
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
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2240);
				multipartIdentifier();
				setState(2242);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2241);
					sample();
					}
					break;
				}
				setState(2244);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				match(T__1);
				setState(2247);
				query();
				setState(2248);
				match(T__2);
				setState(2250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2249);
					sample();
					}
					break;
				}
				setState(2252);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2254);
				match(T__1);
				setState(2255);
				relation();
				setState(2256);
				match(T__2);
				setState(2258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2257);
					sample();
					}
					break;
				}
				setState(2260);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2262);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2263);
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
			setState(2266);
			match(VALUES);
			setState(2267);
			expression();
			setState(2272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2268);
					match(T__3);
					setState(2269);
					expression();
					}
					} 
				}
				setState(2274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
			}
			setState(2275);
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
			setState(2277);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2278);
			match(T__1);
			setState(2287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2279);
				expression();
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2280);
					match(T__3);
					setState(2281);
					expression();
					}
					}
					setState(2286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2289);
			match(T__2);
			setState(2290);
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
			setState(2299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				{
				setState(2293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
				case 1:
					{
					setState(2292);
					match(AS);
					}
					break;
				}
				setState(2295);
				strictIdentifier();
				setState(2297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
				case 1:
					{
					setState(2296);
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
			setState(2350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2301);
				match(ROW);
				setState(2302);
				match(FORMAT);
				setState(2303);
				match(SERDE);
				setState(2304);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2305);
					match(WITH);
					setState(2306);
					match(SERDEPROPERTIES);
					setState(2307);
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
				setState(2310);
				match(ROW);
				setState(2311);
				match(FORMAT);
				setState(2312);
				match(DELIMITED);
				setState(2322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2313);
					match(FIELDS);
					setState(2314);
					match(TERMINATED);
					setState(2315);
					match(BY);
					setState(2316);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
					case 1:
						{
						setState(2317);
						match(ESCAPED);
						setState(2318);
						match(BY);
						setState(2319);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
				case 1:
					{
					setState(2324);
					match(COLLECTION);
					setState(2325);
					match(ITEMS);
					setState(2326);
					match(TERMINATED);
					setState(2327);
					match(BY);
					setState(2328);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2336);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2331);
					match(MAP);
					setState(2332);
					match(KEYS);
					setState(2333);
					match(TERMINATED);
					setState(2334);
					match(BY);
					setState(2335);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2338);
					match(LINES);
					setState(2339);
					match(TERMINATED);
					setState(2340);
					match(BY);
					setState(2341);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2344);
					match(NULL);
					setState(2345);
					match(DEFINED);
					setState(2346);
					match(AS);
					setState(2347);
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
			setState(2352);
			multipartIdentifier();
			setState(2357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2353);
				match(T__3);
				setState(2354);
				multipartIdentifier();
				}
				}
				setState(2359);
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
			setState(2360);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2361);
					match(T__4);
					setState(2362);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,300,_ctx);
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
			setState(2371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2368);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2369);
				match(T__4);
				}
				break;
			}
			setState(2373);
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
			setState(2378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2375);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2376);
				match(T__4);
				}
				break;
			}
			setState(2380);
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
			setState(2382);
			expression();
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				{
				setState(2384);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
				case 1:
					{
					setState(2383);
					match(AS);
					}
					break;
				}
				setState(2388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
				case 1:
					{
					setState(2386);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2387);
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
			setState(2392);
			namedExpression();
			setState(2397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2393);
					match(T__3);
					setState(2394);
					namedExpression();
					}
					} 
				}
				setState(2399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,306,_ctx);
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
			setState(2400);
			match(T__1);
			setState(2401);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2402);
				match(T__3);
				setState(2403);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2408);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2409);
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
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2411);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2412);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2413);
				match(T__1);
				setState(2414);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2415);
					match(T__3);
					setState(2416);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2422);
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
			setState(2428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2426);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2427);
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
			setState(2430);
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
			setState(2444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2433);
				match(NOT);
				setState(2434);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2435);
				match(EXISTS);
				setState(2436);
				match(T__1);
				setState(2437);
				query();
				setState(2438);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2440);
				valueExpression(0);
				setState(2442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2441);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2452);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2446);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2447);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2448);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2449);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2450);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2451);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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
			setState(2519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2457);
					match(NOT);
					}
				}

				setState(2460);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2461);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2462);
				match(AND);
				setState(2463);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2465);
					match(NOT);
					}
				}

				setState(2468);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2469);
				match(T__1);
				setState(2470);
				expression();
				setState(2475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2471);
					match(T__3);
					setState(2472);
					expression();
					}
					}
					setState(2477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2478);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2480);
					match(NOT);
					}
				}

				setState(2483);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2484);
				match(T__1);
				setState(2485);
				query();
				setState(2486);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2488);
					match(NOT);
					}
				}

				setState(2491);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2492);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2493);
					match(NOT);
					}
				}

				setState(2496);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2497);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2498);
					match(ESCAPE);
					setState(2499);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2502);
				match(IS);
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2503);
					match(NOT);
					}
				}

				setState(2506);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2507);
				match(IS);
				setState(2509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2508);
					match(NOT);
					}
				}

				setState(2511);
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
				setState(2512);
				match(IS);
				setState(2514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2513);
					match(NOT);
					}
				}

				setState(2516);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2517);
				match(FROM);
				setState(2518);
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
			setState(2525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2522);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2523);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (TILDE - 287)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2524);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2548);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2546);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2527);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2528);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 289)) & ~0x3f) == 0 && ((1L << (_la - 289)) & ((1L << (ASTERISK - 289)) | (1L << (SLASH - 289)) | (1L << (PERCENT - 289)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2529);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2530);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2531);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (CONCAT_PIPE - 287)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2532);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2533);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2534);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2535);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2536);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2537);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2538);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2539);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2540);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2541);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2542);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2543);
						comparisonOperator();
						setState(2544);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2550);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,328,_ctx);
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
			setState(2735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2552);
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
				setState(2553);
				match(CASE);
				setState(2555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2554);
					whenClause();
					}
					}
					setState(2557); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2559);
					match(ELSE);
					setState(2560);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2563);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2565);
				match(CASE);
				setState(2566);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2568); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2567);
					whenClause();
					}
					}
					setState(2570); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2572);
					match(ELSE);
					setState(2573);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2576);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2578);
				match(CAST);
				setState(2579);
				match(T__1);
				setState(2580);
				expression();
				setState(2581);
				match(AS);
				setState(2582);
				dataType();
				setState(2583);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2585);
				match(STRUCT);
				setState(2586);
				match(T__1);
				setState(2595);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
				case 1:
					{
					setState(2587);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2588);
						match(T__3);
						setState(2589);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2597);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2598);
				match(FIRST);
				setState(2599);
				match(T__1);
				setState(2600);
				expression();
				setState(2603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2601);
					match(IGNORE);
					setState(2602);
					match(NULLS);
					}
				}

				setState(2605);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2607);
				match(LAST);
				setState(2608);
				match(T__1);
				setState(2609);
				expression();
				setState(2612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2610);
					match(IGNORE);
					setState(2611);
					match(NULLS);
					}
				}

				setState(2614);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2616);
				match(POSITION);
				setState(2617);
				match(T__1);
				setState(2618);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2619);
				match(IN);
				setState(2620);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2621);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2623);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2624);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2625);
				qualifiedName();
				setState(2626);
				match(T__4);
				setState(2627);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2629);
				match(T__1);
				setState(2630);
				namedExpression();
				setState(2633); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2631);
					match(T__3);
					setState(2632);
					namedExpression();
					}
					}
					setState(2635); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2637);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2639);
				match(T__1);
				setState(2640);
				query();
				setState(2641);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2643);
				functionName();
				setState(2644);
				match(T__1);
				setState(2656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
				case 1:
					{
					setState(2646);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,338,_ctx) ) {
					case 1:
						{
						setState(2645);
						setQuantifier();
						}
						break;
					}
					setState(2648);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2653);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2649);
						match(T__3);
						setState(2650);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2655);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2658);
				match(T__2);
				setState(2665);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
				case 1:
					{
					setState(2659);
					match(FILTER);
					setState(2660);
					match(T__1);
					setState(2661);
					match(WHERE);
					setState(2662);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2663);
					match(T__2);
					}
					break;
				}
				setState(2669);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2667);
					match(OVER);
					setState(2668);
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
				setState(2671);
				identifier();
				setState(2672);
				match(T__7);
				setState(2673);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2675);
				match(T__1);
				setState(2676);
				identifier();
				setState(2679); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2677);
					match(T__3);
					setState(2678);
					identifier();
					}
					}
					setState(2681); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2683);
				match(T__2);
				setState(2684);
				match(T__7);
				setState(2685);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2687);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2688);
				match(T__1);
				setState(2689);
				expression();
				setState(2690);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2692);
				match(EXTRACT);
				setState(2693);
				match(T__1);
				setState(2694);
				((ExtractContext)_localctx).field = identifier();
				setState(2695);
				match(FROM);
				setState(2696);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2697);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2699);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2700);
				match(T__1);
				setState(2701);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2702);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2703);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2704);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2705);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2708);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2710);
				match(TRIM);
				setState(2711);
				match(T__1);
				setState(2713);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2712);
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
				setState(2716);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,346,_ctx) ) {
				case 1:
					{
					setState(2715);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2718);
				match(FROM);
				setState(2719);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2720);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2722);
				match(OVERLAY);
				setState(2723);
				match(T__1);
				setState(2724);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2725);
				match(PLACING);
				setState(2726);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2727);
				match(FROM);
				setState(2728);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2729);
					match(FOR);
					setState(2730);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2733);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2737);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2738);
						match(T__8);
						setState(2739);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2740);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2742);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2743);
						match(T__4);
						setState(2744);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,350,_ctx);
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
			setState(2762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,352,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2750);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2751);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2752);
				identifier();
				setState(2753);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2755);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2756);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2758); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2757);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2760); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,351,_ctx);
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
			setState(2764);
			_la = _input.LA(1);
			if ( !(((((_la - 279)) & ~0x3f) == 0 && ((1L << (_la - 279)) & ((1L << (EQ - 279)) | (1L << (NSEQ - 279)) | (1L << (NEQ - 279)) | (1L << (NEQJ - 279)) | (1L << (LT - 279)) | (1L << (LTE - 279)) | (1L << (GT - 279)) | (1L << (GTE - 279)))) != 0)) ) {
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
			setState(2766);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (PLUS - 287)) | (1L << (MINUS - 287)) | (1L << (ASTERISK - 287)) | (1L << (SLASH - 287)) | (1L << (PERCENT - 287)) | (1L << (TILDE - 287)) | (1L << (AMPERSAND - 287)) | (1L << (PIPE - 287)) | (1L << (CONCAT_PIPE - 287)) | (1L << (HAT - 287)))) != 0)) ) {
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
			setState(2768);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 118)) & ~0x3f) == 0 && ((1L << (_la - 118)) & ((1L << (IN - 118)) | (1L << (NOT - 118)) | (1L << (OR - 118)))) != 0)) ) {
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
			setState(2770);
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
			setState(2772);
			match(INTERVAL);
			setState(2775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2773);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2774);
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
			setState(2777);
			multiUnitsInterval();
			setState(2779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				{
				setState(2778);
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
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(2784); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2781);
					intervalValue();
					setState(2782);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2786); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,355,_ctx);
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
			setState(2788);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2789);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2790);
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
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SparkSqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
			setState(2793);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2794);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2795);
			match(TO);
			setState(2796);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
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
			setState(2803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2798);
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

				setState(2801);
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
				setState(2802);
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
		enterRule(_localctx, 220, RULE_colPosition);
		try {
			setState(2808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2805);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2806);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2807);
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
		enterRule(_localctx, 222, RULE_dataType);
		int _la;
		try {
			setState(2844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2810);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2811);
				match(LT);
				setState(2812);
				dataType();
				setState(2813);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2815);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2816);
				match(LT);
				setState(2817);
				dataType();
				setState(2818);
				match(T__3);
				setState(2819);
				dataType();
				setState(2820);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2822);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2829);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2823);
					match(LT);
					setState(2825);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,360,_ctx) ) {
					case 1:
						{
						setState(2824);
						complexColTypeList();
						}
						break;
					}
					setState(2827);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2828);
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
				setState(2831);
				identifier();
				setState(2842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,363,_ctx) ) {
				case 1:
					{
					setState(2832);
					match(T__1);
					setState(2833);
					match(INTEGER_VALUE);
					setState(2838);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2834);
						match(T__3);
						setState(2835);
						match(INTEGER_VALUE);
						}
						}
						setState(2840);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2841);
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
		enterRule(_localctx, 224, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2846);
			qualifiedColTypeWithPosition();
			setState(2851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2847);
				match(T__3);
				setState(2848);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2853);
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
		enterRule(_localctx, 226, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2854);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2855);
			dataType();
			setState(2858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2856);
				match(NOT);
				setState(2857);
				match(NULL);
				}
			}

			setState(2861);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2860);
				commentSpec();
				}
			}

			setState(2864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2863);
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
		enterRule(_localctx, 228, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2866);
			colType();
			setState(2871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2867);
					match(T__3);
					setState(2868);
					colType();
					}
					} 
				}
				setState(2873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,369,_ctx);
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
		enterRule(_localctx, 230, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2874);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2875);
			dataType();
			setState(2878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
			case 1:
				{
				setState(2876);
				match(NOT);
				setState(2877);
				match(NULL);
				}
				break;
			}
			setState(2881);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
			case 1:
				{
				setState(2880);
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
		enterRule(_localctx, 232, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2883);
			complexColType();
			setState(2888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2884);
				match(T__3);
				setState(2885);
				complexColType();
				}
				}
				setState(2890);
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
		enterRule(_localctx, 234, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2891);
			identifier();
			setState(2892);
			match(T__10);
			setState(2893);
			dataType();
			setState(2896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2894);
				match(NOT);
				setState(2895);
				match(NULL);
				}
			}

			setState(2899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2898);
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
		enterRule(_localctx, 236, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2901);
			match(WHEN);
			setState(2902);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2903);
			match(THEN);
			setState(2904);
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
		enterRule(_localctx, 238, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2906);
			match(WINDOW);
			setState(2907);
			namedWindow();
			setState(2912);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2908);
					match(T__3);
					setState(2909);
					namedWindow();
					}
					} 
				}
				setState(2914);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,375,_ctx);
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
		enterRule(_localctx, 240, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2915);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2916);
			match(AS);
			setState(2917);
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
		enterRule(_localctx, 242, RULE_windowSpec);
		int _la;
		try {
			setState(2965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,383,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2919);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2920);
				match(T__1);
				setState(2921);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2922);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2924);
				match(T__1);
				setState(2959);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2925);
					match(CLUSTER);
					setState(2926);
					match(BY);
					setState(2927);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2932);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2928);
						match(T__3);
						setState(2929);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2934);
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
					setState(2945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2935);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2936);
						match(BY);
						setState(2937);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(2942);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2938);
							match(T__3);
							setState(2939);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(2944);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(2957);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2947);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
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
						sortItem();
						setState(2954);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2950);
							match(T__3);
							setState(2951);
							sortItem();
							}
							}
							setState(2956);
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
				setState(2962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2961);
					windowFrame();
					}
				}

				setState(2964);
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
		enterRule(_localctx, 244, RULE_windowFrame);
		try {
			setState(2983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,384,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2967);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2968);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2969);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2970);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2971);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2972);
				match(BETWEEN);
				setState(2973);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2974);
				match(AND);
				setState(2975);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2977);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2978);
				match(BETWEEN);
				setState(2979);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2980);
				match(AND);
				setState(2981);
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
		enterRule(_localctx, 246, RULE_frameBound);
		int _la;
		try {
			setState(2992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2985);
				match(UNBOUNDED);
				setState(2986);
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
				setState(2987);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2988);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2989);
				expression();
				setState(2990);
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
		enterRule(_localctx, 248, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2994);
			qualifiedName();
			setState(2999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2995);
				match(T__3);
				setState(2996);
				qualifiedName();
				}
				}
				setState(3001);
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
		enterRule(_localctx, 250, RULE_functionName);
		try {
			setState(3006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3002);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3003);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3004);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3005);
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
		enterRule(_localctx, 252, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3008);
			identifier();
			setState(3013);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3009);
					match(T__4);
					setState(3010);
					identifier();
					}
					} 
				}
				setState(3015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,388,_ctx);
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
		enterRule(_localctx, 254, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3016);
			identifier();
			setState(3017);
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
		enterRule(_localctx, 256, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3021); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3019);
						match(MINUS);
						setState(3020);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3023); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,389,_ctx);
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
		enterRule(_localctx, 258, RULE_identifier);
		try {
			setState(3031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3028);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3029);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3030);
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
		enterRule(_localctx, 260, RULE_strictIdentifier);
		try {
			setState(3039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3033);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3034);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3035);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3036);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3037);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3038);
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
		enterRule(_localctx, 262, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3041);
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
		enterRule(_localctx, 264, RULE_number);
		int _la;
		try {
			setState(3082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3043);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3044);
					match(MINUS);
					}
				}

				setState(3047);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3048);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3049);
					match(MINUS);
					}
				}

				setState(3052);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3053);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3054);
					match(MINUS);
					}
				}

				setState(3057);
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
				setState(3059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3058);
					match(MINUS);
					}
				}

				setState(3061);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3062);
					match(MINUS);
					}
				}

				setState(3065);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
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
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
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
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
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
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
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
		enterRule(_localctx, 266, RULE_alterColumnAction);
		int _la;
		try {
			setState(3091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3084);
				match(TYPE);
				setState(3085);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3086);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3087);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3088);
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
				setState(3089);
				match(NOT);
				setState(3090);
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
		public TerminalNode DATAX() { return getToken(SparkSqlBaseParser.DATAX, 0); }
		public TerminalNode READER() { return getToken(SparkSqlBaseParser.READER, 0); }
		public TerminalNode WRITER() { return getToken(SparkSqlBaseParser.WRITER, 0); }
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
		enterRule(_localctx, 268, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3093);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONVERT) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ITEMS - 129)) | (1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LATERAL - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PARQUET - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)) | (1L << (RECORDWRITER - 129)) | (1L << (RECOVER - 129)) | (1L << (REDUCE - 129)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (REFRESH - 194)) | (1L << (RENAME - 194)) | (1L << (REPAIR - 194)) | (1L << (REPLACE - 194)) | (1L << (RESET - 194)) | (1L << (RESTRICT - 194)) | (1L << (REVOKE - 194)) | (1L << (RETAIN - 194)) | (1L << (RLIKE - 194)) | (1L << (ROLE - 194)) | (1L << (ROLES - 194)) | (1L << (ROLLBACK - 194)) | (1L << (ROLLUP - 194)) | (1L << (ROW - 194)) | (1L << (ROWS - 194)) | (1L << (RUN - 194)) | (1L << (SCHEMA - 194)) | (1L << (SEMI - 194)) | (1L << (SEPARATED - 194)) | (1L << (SERDE - 194)) | (1L << (SERDEPROPERTIES - 194)) | (1L << (SET - 194)) | (1L << (SETMINUS - 194)) | (1L << (SETS - 194)) | (1L << (SHOW - 194)) | (1L << (SKEWED - 194)) | (1L << (SORT - 194)) | (1L << (SORTED - 194)) | (1L << (START - 194)) | (1L << (STATISTICS - 194)) | (1L << (STORED - 194)) | (1L << (STRATIFY - 194)) | (1L << (STRUCT - 194)) | (1L << (SUBSTR - 194)) | (1L << (SUBSTRING - 194)) | (1L << (TABLES - 194)) | (1L << (TABLESAMPLE - 194)) | (1L << (TBLPROPERTIES - 194)) | (1L << (TEMPORARY - 194)) | (1L << (TERMINATED - 194)) | (1L << (TOUCH - 194)) | (1L << (TRANSACTION - 194)) | (1L << (TRANSACTIONS - 194)) | (1L << (TRANSFORM - 194)) | (1L << (TRIM - 194)) | (1L << (TRUE - 194)) | (1L << (TRUNCATE - 194)) | (1L << (TYPE - 194)) | (1L << (UNARCHIVE - 194)) | (1L << (UNBOUNDED - 194)) | (1L << (UNCACHE - 194)) | (1L << (UNLOCK - 194)) | (1L << (UNSET - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (UPDATE - 258)) | (1L << (USE - 258)) | (1L << (VALUES - 258)) | (1L << (VACUUM - 258)) | (1L << (VIEW - 258)) | (1L << (VIEWS - 258)) | (1L << (WINDOW - 258)) | (1L << (KILL - 258)) | (1L << (READ - 258)) | (1L << (JOB - 258)) | (1L << (ADDJAR - 258)) | (1L << (COMPRESS - 258)) | (1L << (FILE - 258)) | (1L << (DATAX - 258)) | (1L << (READER - 258)) | (1L << (WRITER - 258)))) != 0)) ) {
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
		enterRule(_localctx, 270, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3095);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (EXCEPT - 85)) | (1L << (FULL - 85)) | (1L << (INNER - 85)) | (1L << (INTERSECT - 85)) | (1L << (JOIN - 85)) | (1L << (LEFT - 85)))) != 0) || ((((_la - 155)) & ~0x3f) == 0 && ((1L << (_la - 155)) & ((1L << (NATURAL - 155)) | (1L << (ON - 155)) | (1L << (RIGHT - 155)) | (1L << (SEMI - 155)))) != 0) || ((((_la - 219)) & ~0x3f) == 0 && ((1L << (_la - 219)) & ((1L << (SETMINUS - 219)) | (1L << (UNION - 219)) | (1L << (USING - 219)))) != 0)) ) {
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
		public TerminalNode KILL() { return getToken(SparkSqlBaseParser.KILL, 0); }
		public TerminalNode READ() { return getToken(SparkSqlBaseParser.READ, 0); }
		public TerminalNode JOB() { return getToken(SparkSqlBaseParser.JOB, 0); }
		public TerminalNode ADDJAR() { return getToken(SparkSqlBaseParser.ADDJAR, 0); }
		public TerminalNode COMPRESS() { return getToken(SparkSqlBaseParser.COMPRESS, 0); }
		public TerminalNode FILE() { return getToken(SparkSqlBaseParser.FILE, 0); }
		public TerminalNode DATAX() { return getToken(SparkSqlBaseParser.DATAX, 0); }
		public TerminalNode READER() { return getToken(SparkSqlBaseParser.READER, 0); }
		public TerminalNode WRITER() { return getToken(SparkSqlBaseParser.WRITER, 0); }
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
		enterRule(_localctx, 272, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3097);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << CONVERT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DATA) | (1L << DATABASE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATABASES - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DELTA - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DETAIL - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (DRY - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOURS - 64)) | (1L << (HISTORY - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (IS - 128)) | (1L << (ITEMS - 128)) | (1L << (KEYS - 128)) | (1L << (LAST - 128)) | (1L << (LATERAL - 128)) | (1L << (LAZY - 128)) | (1L << (LEADING - 128)) | (1L << (LIKE - 128)) | (1L << (LIMIT - 128)) | (1L << (LINES - 128)) | (1L << (LIST - 128)) | (1L << (LOAD - 128)) | (1L << (LOCAL - 128)) | (1L << (LOCATION - 128)) | (1L << (LOCK - 128)) | (1L << (LOCKS - 128)) | (1L << (LOGICAL - 128)) | (1L << (MACRO - 128)) | (1L << (MAP - 128)) | (1L << (MATCHED - 128)) | (1L << (MERGE - 128)) | (1L << (MSCK - 128)) | (1L << (NAMESPACE - 128)) | (1L << (NAMESPACES - 128)) | (1L << (NO - 128)) | (1L << (NOT - 128)) | (1L << (NULL - 128)) | (1L << (NULLS - 128)) | (1L << (OF - 128)) | (1L << (ONLY - 128)) | (1L << (OPTION - 128)) | (1L << (OPTIONS - 128)) | (1L << (OR - 128)) | (1L << (ORDER - 128)) | (1L << (OUT - 128)) | (1L << (OUTER - 128)) | (1L << (OUTPUTFORMAT - 128)) | (1L << (OVER - 128)) | (1L << (OVERLAPS - 128)) | (1L << (OVERLAY - 128)) | (1L << (OVERWRITE - 128)) | (1L << (PARTITION - 128)) | (1L << (PARTITIONED - 128)) | (1L << (PARTITIONS - 128)) | (1L << (PARQUET - 128)) | (1L << (PERCENTLIT - 128)) | (1L << (PIVOT - 128)) | (1L << (PLACING - 128)) | (1L << (POSITION - 128)) | (1L << (PRECEDING - 128)) | (1L << (PRIMARY - 128)) | (1L << (PRINCIPALS - 128)) | (1L << (PROPERTIES - 128)) | (1L << (PURGE - 128)) | (1L << (QUERY - 128)) | (1L << (RANGE - 128)) | (1L << (RECORDREADER - 128)) | (1L << (RECORDWRITER - 128)) | (1L << (RECOVER - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (REFERENCES - 192)) | (1L << (REFRESH - 192)) | (1L << (RENAME - 192)) | (1L << (REPAIR - 192)) | (1L << (REPLACE - 192)) | (1L << (RESET - 192)) | (1L << (RESTRICT - 192)) | (1L << (REVOKE - 192)) | (1L << (RETAIN - 192)) | (1L << (RLIKE - 192)) | (1L << (ROLE - 192)) | (1L << (ROLES - 192)) | (1L << (ROLLBACK - 192)) | (1L << (ROLLUP - 192)) | (1L << (ROW - 192)) | (1L << (ROWS - 192)) | (1L << (RUN - 192)) | (1L << (SCHEMA - 192)) | (1L << (SELECT - 192)) | (1L << (SEPARATED - 192)) | (1L << (SERDE - 192)) | (1L << (SERDEPROPERTIES - 192)) | (1L << (SESSION_USER - 192)) | (1L << (SET - 192)) | (1L << (SETS - 192)) | (1L << (SHOW - 192)) | (1L << (SKEWED - 192)) | (1L << (SOME - 192)) | (1L << (SORT - 192)) | (1L << (SORTED - 192)) | (1L << (START - 192)) | (1L << (STATISTICS - 192)) | (1L << (STORED - 192)) | (1L << (STRATIFY - 192)) | (1L << (STRUCT - 192)) | (1L << (SUBSTR - 192)) | (1L << (SUBSTRING - 192)) | (1L << (TABLE - 192)) | (1L << (TABLES - 192)) | (1L << (TABLESAMPLE - 192)) | (1L << (TBLPROPERTIES - 192)) | (1L << (TEMPORARY - 192)) | (1L << (TERMINATED - 192)) | (1L << (THEN - 192)) | (1L << (TO - 192)) | (1L << (TOUCH - 192)) | (1L << (TRAILING - 192)) | (1L << (TRANSACTION - 192)) | (1L << (TRANSACTIONS - 192)) | (1L << (TRANSFORM - 192)) | (1L << (TRIM - 192)) | (1L << (TRUE - 192)) | (1L << (TRUNCATE - 192)) | (1L << (TYPE - 192)) | (1L << (UNARCHIVE - 192)) | (1L << (UNBOUNDED - 192)) | (1L << (UNCACHE - 192)) | (1L << (UNIQUE - 192)) | (1L << (UNKNOWN - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (UNLOCK - 256)) | (1L << (UNSET - 256)) | (1L << (UPDATE - 256)) | (1L << (USE - 256)) | (1L << (USER - 256)) | (1L << (VALUES - 256)) | (1L << (VACUUM - 256)) | (1L << (VIEW - 256)) | (1L << (VIEWS - 256)) | (1L << (WHEN - 256)) | (1L << (WHERE - 256)) | (1L << (WINDOW - 256)) | (1L << (WITH - 256)) | (1L << (KILL - 256)) | (1L << (READ - 256)) | (1L << (JOB - 256)) | (1L << (ADDJAR - 256)) | (1L << (COMPRESS - 256)) | (1L << (FILE - 256)) | (1L << (DATAX - 256)) | (1L << (READER - 256)) | (1L << (WRITER - 256)))) != 0)) ) {
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
		case 129:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 130:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 132:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013b\u0c1e\4\2\t"+
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
		"\4\u008a\t\u008a\3\2\3\2\7\2\u0117\n\2\f\2\16\2\u011a\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\5\t\u0132\n\t\3\t\3\t\3\t\5\t\u0137\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u013f\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0147\n\t\f\t\16\t\u014a\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u015d\n\t\3\t\3\t\5\t\u0161\n\t\3\t\3\t\3\t\3\t\5\t\u0167\n\t\3\t"+
		"\5\t\u016a\n\t\3\t\5\t\u016d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0175\n\t"+
		"\3\t\5\t\u0178\n\t\3\t\3\t\5\t\u017c\n\t\3\t\5\t\u017f\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0187\n\t\3\t\3\t\3\t\5\t\u018c\n\t\3\t\5\t\u018f\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0196\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01a2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01ad\n\t\f"+
		"\t\16\t\u01b0\13\t\3\t\5\t\u01b3\n\t\3\t\5\t\u01b6\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01bd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01c8\n\t\f"+
		"\t\16\t\u01cb\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d2\n\t\3\t\3\t\3\t\5\t\u01d7"+
		"\n\t\3\t\5\t\u01da\n\t\3\t\3\t\3\t\3\t\5\t\u01e0\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u01eb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u022b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0234\n\t\3\t\3\t\5\t\u0238"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u023e\n\t\3\t\3\t\5\t\u0242\n\t\3\t\3\t\3\t\5"+
		"\t\u0247\n\t\3\t\3\t\3\t\3\t\5\t\u024d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0255\n\t\3\t\3\t\3\t\3\t\5\t\u025b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0268\n\t\3\t\6\t\u026b\n\t\r\t\16\t\u026c\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u027d\n\t\3\t\3\t"+
		"\3\t\7\t\u0282\n\t\f\t\16\t\u0285\13\t\3\t\5\t\u0288\n\t\3\t\3\t\3\t\3"+
		"\t\5\t\u028e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u029d\n\t\3\t\3\t\5\t\u02a1\n\t\3\t\3\t\3\t\3\t\5\t\u02a7\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u02ad\n\t\3\t\5\t\u02b0\n\t\3\t\5\t\u02b3\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u02b9\n\t\3\t\3\t\5\t\u02bd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u02c5\n\t\f\t\16\t\u02c8\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02d0\n\t\3"+
		"\t\5\t\u02d3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02dc\n\t\3\t\3\t\3\t"+
		"\5\t\u02e1\n\t\3\t\3\t\3\t\3\t\5\t\u02e7\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u02ee"+
		"\n\t\3\t\5\t\u02f1\n\t\3\t\3\t\3\t\3\t\5\t\u02f7\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u0300\n\t\f\t\16\t\u0303\13\t\5\t\u0305\n\t\3\t\3\t\5\t"+
		"\u0309\n\t\3\t\3\t\3\t\5\t\u030e\n\t\3\t\3\t\3\t\5\t\u0313\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u031a\n\t\3\t\5\t\u031d\n\t\3\t\5\t\u0320\n\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0327\n\t\3\t\3\t\3\t\5\t\u032c\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0335\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u033d\n\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0343\n\t\3\t\5\t\u0346\n\t\3\t\5\t\u0349\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u034f\n\t\3\t\3\t\5\t\u0353\n\t\3\t\3\t\5\t\u0357\n\t\3\t\3\t"+
		"\5\t\u035b\n\t\5\t\u035d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0365\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u036d\n\t\3\t\3\t\3\t\3\t\5\t\u0373\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u037f\n\t\3\t\3\t\5\t\u0383\n\t"+
		"\3\t\5\t\u0386\n\t\3\t\3\t\5\t\u038a\n\t\3\t\5\t\u038d\n\t\3\t\3\t\5\t"+
		"\u0391\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03a8\n\t\f\t\16\t\u03ab\13\t\5\t\u03ad\n"+
		"\t\3\t\3\t\5\t\u03b1\n\t\3\t\3\t\3\t\3\t\5\t\u03b7\n\t\3\t\5\t\u03ba\n"+
		"\t\3\t\5\t\u03bd\n\t\3\t\3\t\3\t\3\t\5\t\u03c3\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u03cb\n\t\3\t\3\t\3\t\5\t\u03d0\n\t\3\t\3\t\3\t\3\t\5\t\u03d6"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u03dc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u03e6\n\t\f\t\16\t\u03e9\13\t\5\t\u03eb\n\t\3\t\3\t\3\t\7\t\u03f0\n\t"+
		"\f\t\16\t\u03f3\13\t\3\t\3\t\7\t\u03f7\n\t\f\t\16\t\u03fa\13\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0401\n\t\3\t\3\t\5\t\u0405\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0410\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u041c\n\t\3\t\5\t\u041f\n\t\3\t\3\t\3\t\3\t\5\t\u0425\n\t\3\t\3\t\3"+
		"\t\3\t\5\t\u042b\n\t\3\t\3\t\3\t\3\t\5\t\u0431\n\t\3\t\3\t\5\t\u0435\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u043c\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0452\n\t\3\t\3\t\5"+
		"\t\u0456\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0462\n\t\3\t"+
		"\3\t\5\t\u0466\n\t\3\t\3\t\7\t\u046a\n\t\f\t\16\t\u046d\13\t\5\t\u046f"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0479\n\13\3\13\3\13\5"+
		"\13\u047d\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u0484\n\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u04f8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0500\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0508\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0511\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u051b\n"+
		"\13\3\f\3\f\5\f\u051f\n\f\3\f\5\f\u0522\n\f\3\f\3\f\3\f\3\f\5\f\u0528"+
		"\n\f\3\f\3\f\3\r\3\r\5\r\u052e\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u053a\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0546\n\17\3\17\3\17\3\17\5\17\u054b\n\17\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\5\22\u0554\n\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23"+
		"\u055c\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0563\n\23\5\23\u0565\n\23\3"+
		"\23\3\23\3\23\5\23\u056a\n\23\3\23\3\23\5\23\u056e\n\23\3\23\3\23\3\23"+
		"\5\23\u0573\n\23\3\23\3\23\3\23\5\23\u0578\n\23\3\23\3\23\3\23\5\23\u057d"+
		"\n\23\3\23\5\23\u0580\n\23\3\23\3\23\3\23\5\23\u0585\n\23\3\23\3\23\5"+
		"\23\u0589\n\23\3\23\3\23\3\23\5\23\u058e\n\23\5\23\u0590\n\23\3\24\3\24"+
		"\5\24\u0594\n\24\3\25\3\25\3\25\3\25\3\25\7\25\u059b\n\25\f\25\16\25\u059e"+
		"\13\25\3\25\3\25\3\26\3\26\3\26\5\26\u05a5\n\26\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\5\30\u05ae\n\30\3\31\3\31\3\31\7\31\u05b3\n\31\f\31\16\31"+
		"\u05b6\13\31\3\32\3\32\3\32\3\32\7\32\u05bc\n\32\f\32\16\32\u05bf\13\32"+
		"\3\33\3\33\5\33\u05c3\n\33\3\33\5\33\u05c6\n\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\7\35\u05db\n\35\f\35\16\35\u05de\13\35\3\36\3\36\3\36\3\36\7\36\u05e4"+
		"\n\36\f\36\16\36\u05e7\13\36\3\36\3\36\3\37\3\37\5\37\u05ed\n\37\3\37"+
		"\5\37\u05f0\n\37\3 \3 \3 \7 \u05f5\n \f \16 \u05f8\13 \3 \5 \u05fb\n "+
		"\3!\3!\3!\3!\5!\u0601\n!\3\"\3\"\3\"\3\"\7\"\u0607\n\"\f\"\16\"\u060a"+
		"\13\"\3\"\3\"\3#\3#\3#\3#\7#\u0612\n#\f#\16#\u0615\13#\3#\3#\3$\3$\3$"+
		"\3$\3$\3$\5$\u061f\n$\3%\3%\3%\3%\3%\5%\u0626\n%\3&\3&\3&\3&\5&\u062c"+
		"\n&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\6(\u0637\n(\r(\16(\u0638\3(\3(\3(\3"+
		"(\3(\5(\u0640\n(\3(\3(\3(\3(\3(\5(\u0647\n(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u0653\n(\3(\3(\3(\3(\7(\u0659\n(\f(\16(\u065c\13(\3(\7(\u065f"+
		"\n(\f(\16(\u0662\13(\5(\u0664\n(\3)\3)\3)\3)\3)\7)\u066b\n)\f)\16)\u066e"+
		"\13)\5)\u0670\n)\3)\3)\3)\3)\3)\7)\u0677\n)\f)\16)\u067a\13)\5)\u067c"+
		"\n)\3)\3)\3)\3)\3)\7)\u0683\n)\f)\16)\u0686\13)\5)\u0688\n)\3)\3)\3)\3"+
		")\3)\7)\u068f\n)\f)\16)\u0692\13)\5)\u0694\n)\3)\5)\u0697\n)\3)\3)\3)"+
		"\5)\u069c\n)\5)\u069e\n)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\5+\u06aa\n+\3+"+
		"\3+\3+\3+\3+\5+\u06b1\n+\3+\3+\3+\3+\3+\5+\u06b8\n+\3+\7+\u06bb\n+\f+"+
		"\16+\u06be\13+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u06c9\n,\3-\3-\5-\u06cd\n"+
		"-\3-\3-\5-\u06d1\n-\3.\3.\6.\u06d5\n.\r.\16.\u06d6\3/\3/\5/\u06db\n/\3"+
		"/\3/\3/\3/\7/\u06e1\n/\f/\16/\u06e4\13/\3/\5/\u06e7\n/\3/\5/\u06ea\n/"+
		"\3/\5/\u06ed\n/\3/\5/\u06f0\n/\3/\3/\5/\u06f4\n/\3\60\3\60\5\60\u06f8"+
		"\n\60\3\60\5\60\u06fb\n\60\3\60\3\60\5\60\u06ff\n\60\3\60\7\60\u0702\n"+
		"\60\f\60\16\60\u0705\13\60\3\60\5\60\u0708\n\60\3\60\5\60\u070b\n\60\3"+
		"\60\5\60\u070e\n\60\3\60\5\60\u0711\n\60\5\60\u0713\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u071f\n\61\3\61\5\61\u0722\n"+
		"\61\3\61\3\61\5\61\u0726\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0730\n\61\3\61\3\61\5\61\u0734\n\61\5\61\u0736\n\61\3\61\5\61\u0739"+
		"\n\61\3\61\3\61\5\61\u073d\n\61\3\62\3\62\7\62\u0741\n\62\f\62\16\62\u0744"+
		"\13\62\3\62\5\62\u0747\n\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3"+
		"\64\5\64\u0752\n\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65\u075c"+
		"\n\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0768\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u0775\n\67"+
		"\f\67\16\67\u0778\13\67\3\67\3\67\5\67\u077c\n\67\38\38\38\78\u0781\n"+
		"8\f8\168\u0784\138\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\5<\u0793\n<"+
		"\3<\7<\u0796\n<\f<\16<\u0799\13<\3<\3<\3=\3=\3=\3=\3=\3=\7=\u07a3\n=\f"+
		"=\16=\u07a6\13=\3=\3=\5=\u07aa\n=\3>\3>\3>\3>\7>\u07b0\n>\f>\16>\u07b3"+
		"\13>\3>\7>\u07b6\n>\f>\16>\u07b9\13>\3>\5>\u07bc\n>\3?\3?\3?\3?\3?\7?"+
		"\u07c3\n?\f?\16?\u07c6\13?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u07d2\n?\f"+
		"?\16?\u07d5\13?\3?\3?\5?\u07d9\n?\3?\3?\3?\3?\3?\3?\3?\3?\7?\u07e3\n?"+
		"\f?\16?\u07e6\13?\3?\3?\5?\u07ea\n?\3@\3@\3@\3@\7@\u07f0\n@\f@\16@\u07f3"+
		"\13@\5@\u07f5\n@\3@\3@\5@\u07f9\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\7A\u0805"+
		"\nA\fA\16A\u0808\13A\3A\3A\3A\3B\3B\3B\3B\3B\7B\u0812\nB\fB\16B\u0815"+
		"\13B\3B\3B\5B\u0819\nB\3C\3C\5C\u081d\nC\3C\5C\u0820\nC\3D\3D\3D\5D\u0825"+
		"\nD\3D\3D\3D\3D\3D\7D\u082c\nD\fD\16D\u082f\13D\5D\u0831\nD\3D\3D\3D\5"+
		"D\u0836\nD\3D\3D\3D\7D\u083b\nD\fD\16D\u083e\13D\5D\u0840\nD\3E\3E\3F"+
		"\3F\7F\u0846\nF\fF\16F\u0849\13F\3G\3G\3G\3G\5G\u084f\nG\3G\3G\3G\3G\3"+
		"G\5G\u0856\nG\3H\5H\u0859\nH\3H\3H\3H\5H\u085e\nH\3H\5H\u0861\nH\3H\3"+
		"H\3H\5H\u0866\nH\3H\3H\5H\u086a\nH\3H\5H\u086d\nH\3H\5H\u0870\nH\3I\3"+
		"I\3I\3I\5I\u0876\nI\3J\3J\3J\5J\u087b\nJ\3J\3J\3K\5K\u0880\nK\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0892\nK\5K\u0894\nK\3K\5"+
		"K\u0897\nK\3L\3L\3L\3L\3M\3M\3M\7M\u08a0\nM\fM\16M\u08a3\13M\3N\3N\3N"+
		"\3N\7N\u08a9\nN\fN\16N\u08ac\13N\3N\3N\3O\3O\5O\u08b2\nO\3P\3P\3P\3P\7"+
		"P\u08b8\nP\fP\16P\u08bb\13P\3P\3P\3Q\3Q\5Q\u08c1\nQ\3R\3R\5R\u08c5\nR"+
		"\3R\3R\3R\3R\3R\3R\5R\u08cd\nR\3R\3R\3R\3R\3R\3R\5R\u08d5\nR\3R\3R\3R"+
		"\3R\5R\u08db\nR\3S\3S\3S\3S\7S\u08e1\nS\fS\16S\u08e4\13S\3S\3S\3T\3T\3"+
		"T\3T\3T\7T\u08ed\nT\fT\16T\u08f0\13T\5T\u08f2\nT\3T\3T\3T\3U\5U\u08f8"+
		"\nU\3U\3U\5U\u08fc\nU\5U\u08fe\nU\3V\3V\3V\3V\3V\3V\3V\5V\u0907\nV\3V"+
		"\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u0913\nV\5V\u0915\nV\3V\3V\3V\3V\3V\5V"+
		"\u091c\nV\3V\3V\3V\3V\3V\5V\u0923\nV\3V\3V\3V\3V\5V\u0929\nV\3V\3V\3V"+
		"\3V\5V\u092f\nV\5V\u0931\nV\3W\3W\3W\7W\u0936\nW\fW\16W\u0939\13W\3X\3"+
		"X\3X\7X\u093e\nX\fX\16X\u0941\13X\3Y\3Y\3Y\5Y\u0946\nY\3Y\3Y\3Z\3Z\3Z"+
		"\5Z\u094d\nZ\3Z\3Z\3[\3[\5[\u0953\n[\3[\3[\5[\u0957\n[\5[\u0959\n[\3\\"+
		"\3\\\3\\\7\\\u095e\n\\\f\\\16\\\u0961\13\\\3]\3]\3]\3]\7]\u0967\n]\f]"+
		"\16]\u096a\13]\3]\3]\3^\3^\3^\3^\3^\3^\7^\u0974\n^\f^\16^\u0977\13^\3"+
		"^\3^\5^\u097b\n^\3_\3_\5_\u097f\n_\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3"+
		"a\5a\u098d\na\5a\u098f\na\3a\3a\3a\3a\3a\3a\7a\u0997\na\fa\16a\u099a\13"+
		"a\3b\5b\u099d\nb\3b\3b\3b\3b\3b\3b\5b\u09a5\nb\3b\3b\3b\3b\3b\7b\u09ac"+
		"\nb\fb\16b\u09af\13b\3b\3b\3b\5b\u09b4\nb\3b\3b\3b\3b\3b\3b\5b\u09bc\n"+
		"b\3b\3b\3b\5b\u09c1\nb\3b\3b\3b\3b\5b\u09c7\nb\3b\3b\5b\u09cb\nb\3b\3"+
		"b\3b\5b\u09d0\nb\3b\3b\3b\5b\u09d5\nb\3b\3b\3b\5b\u09da\nb\3c\3c\3c\3"+
		"c\5c\u09e0\nc\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\7c\u09f5\nc\fc\16c\u09f8\13c\3d\3d\3d\3d\6d\u09fe\nd\rd\16d\u09ff\3"+
		"d\3d\5d\u0a04\nd\3d\3d\3d\3d\3d\6d\u0a0b\nd\rd\16d\u0a0c\3d\3d\5d\u0a11"+
		"\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\7d\u0a21\nd\fd\16d\u0a24"+
		"\13d\5d\u0a26\nd\3d\3d\3d\3d\3d\3d\5d\u0a2e\nd\3d\3d\3d\3d\3d\3d\3d\5"+
		"d\u0a37\nd\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\6"+
		"d\u0a4c\nd\rd\16d\u0a4d\3d\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0a59\nd\3d\3d\3"+
		"d\7d\u0a5e\nd\fd\16d\u0a61\13d\5d\u0a63\nd\3d\3d\3d\3d\3d\3d\3d\5d\u0a6c"+
		"\nd\3d\3d\5d\u0a70\nd\3d\3d\3d\3d\3d\3d\3d\3d\6d\u0a7a\nd\rd\16d\u0a7b"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d\3d"+
		"\5d\u0a95\nd\3d\3d\3d\3d\3d\5d\u0a9c\nd\3d\5d\u0a9f\nd\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\5d\u0aae\nd\3d\3d\5d\u0ab2\nd\3d\3d\3d\3d\3d"+
		"\3d\3d\3d\7d\u0abc\nd\fd\16d\u0abf\13d\3e\3e\3e\3e\3e\3e\3e\3e\6e\u0ac9"+
		"\ne\re\16e\u0aca\5e\u0acd\ne\3f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3j\5j\u0ada"+
		"\nj\3k\3k\5k\u0ade\nk\3l\3l\3l\6l\u0ae3\nl\rl\16l\u0ae4\3m\3m\3m\5m\u0aea"+
		"\nm\3n\3n\3n\3n\3n\3o\5o\u0af2\no\3o\3o\5o\u0af6\no\3p\3p\3p\5p\u0afb"+
		"\np\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\3q\5q\u0b0c\nq\3q\3q\5q"+
		"\u0b10\nq\3q\3q\3q\3q\3q\7q\u0b17\nq\fq\16q\u0b1a\13q\3q\5q\u0b1d\nq\5"+
		"q\u0b1f\nq\3r\3r\3r\7r\u0b24\nr\fr\16r\u0b27\13r\3s\3s\3s\3s\5s\u0b2d"+
		"\ns\3s\5s\u0b30\ns\3s\5s\u0b33\ns\3t\3t\3t\7t\u0b38\nt\ft\16t\u0b3b\13"+
		"t\3u\3u\3u\3u\5u\u0b41\nu\3u\5u\u0b44\nu\3v\3v\3v\7v\u0b49\nv\fv\16v\u0b4c"+
		"\13v\3w\3w\3w\3w\3w\5w\u0b53\nw\3w\5w\u0b56\nw\3x\3x\3x\3x\3x\3y\3y\3"+
		"y\3y\7y\u0b61\ny\fy\16y\u0b64\13y\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3{"+
		"\3{\3{\3{\7{\u0b75\n{\f{\16{\u0b78\13{\3{\3{\3{\3{\3{\7{\u0b7f\n{\f{\16"+
		"{\u0b82\13{\5{\u0b84\n{\3{\3{\3{\3{\3{\7{\u0b8b\n{\f{\16{\u0b8e\13{\5"+
		"{\u0b90\n{\5{\u0b92\n{\3{\5{\u0b95\n{\3{\5{\u0b98\n{\3|\3|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0baa\n|\3}\3}\3}\3}\3}\3}\3}\5}\u0bb3"+
		"\n}\3~\3~\3~\7~\u0bb8\n~\f~\16~\u0bbb\13~\3\177\3\177\3\177\3\177\5\177"+
		"\u0bc1\n\177\3\u0080\3\u0080\3\u0080\7\u0080\u0bc6\n\u0080\f\u0080\16"+
		"\u0080\u0bc9\13\u0080\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\6\u0082"+
		"\u0bd0\n\u0082\r\u0082\16\u0082\u0bd1\3\u0082\5\u0082\u0bd5\n\u0082\3"+
		"\u0083\3\u0083\3\u0083\5\u0083\u0bda\n\u0083\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u0be2\n\u0084\3\u0085\3\u0085\3\u0086\3"+
		"\u0086\5\u0086\u0be8\n\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0bed\n\u0086"+
		"\3\u0086\3\u0086\3\u0086\5\u0086\u0bf2\n\u0086\3\u0086\3\u0086\5\u0086"+
		"\u0bf6\n\u0086\3\u0086\3\u0086\5\u0086\u0bfa\n\u0086\3\u0086\3\u0086\5"+
		"\u0086\u0bfe\n\u0086\3\u0086\3\u0086\5\u0086\u0c02\n\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0c06\n\u0086\3\u0086\3\u0086\5\u0086\u0c0a\n\u0086\3\u0086\5"+
		"\u0086\u0c0d\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0c16\n\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u008a\3"+
		"\u008a\3\u008a\7\u03a9\u03e7\u03f1\u03f8\u046b\6T\u00c0\u00c4\u00c6\u008b"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec"+
		"\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104"+
		"\u0106\u0108\u010a\u010c\u010e\u0110\u0112\2,\4\2CC\u00bb\u00bb\4\2\""+
		"\"\u00c9\u00c9\4\2BB\u009c\u009c\4\2jjxx\3\2-.\4\2\u00eb\u00eb\u010a\u010a"+
		"\4\2\21\21%%\7\2**\67\67\\\\ii\u0095\u0095\3\2HI\4\2\\\\ii\4\2\u00a0\u00a0"+
		"\u012b\u012b\4\2\16\16\u008e\u008e\4\2GG\u00b3\u00b3\5\2AA\u009b\u009b"+
		"\u00d5\u00d5\6\2WW\177\177\u00dd\u00dd\u00ff\u00ff\5\2WW\u00dd\u00dd\u00ff"+
		"\u00ff\4\2\31\31HH\4\2dd\u0086\u0086\4\2\20\20NN\4\2\u012f\u012f\u0131"+
		"\u0131\5\2__\u00f9\u00f9\u0101\u0101\4\2\u0121\u0122\u0126\u0126\4\2P"+
		"P\u0123\u0125\4\2\u0121\u0122\u0129\u0129\4\2<<>>\3\2\u00e9\u00ea\4\2"+
		"\6\6jj\4\2\6\6ff\5\2\35\35\u0089\u0089\u00f4\u00f4\3\2\u0119\u0120\4\2"+
		"PP\u0121\u012a\6\2\23\23xx\u009f\u009f\u00a7\u00a7\4\2__\u00f9\u00f9\3"+
		"\2\u0121\u0122\4\2OO\u00b0\u00b0\4\2\u00a8\u00a8\u00e2\u00e2\4\2ee\u00b8"+
		"\u00b8\3\2\u0130\u0131\4\2QQ\u00dc\u00dc\63\2\16\17\21\22\24\24\26\27"+
		"\31\32\34\34\36\"%%\'*,,.\64\66\67:;@MORVVX^aacehilnqqswyz|~\u0080\u0080"+
		"\u0083\u0083\u0085\u0088\u008b\u008e\u0090\u009c\u009e\u009e\u00a1\u00a2"+
		"\u00a5\u00a6\u00a9\u00a9\u00ab\u00ac\u00ae\u00b8\u00ba\u00c2\u00c4\u00cb"+
		"\u00cd\u00d5\u00d7\u00da\u00dc\u00e0\u00e2\u00ea\u00ec\u00f0\u00f3\u00f3"+
		"\u00f5\u00fe\u0102\u0105\u0108\u010b\u010e\u010e\u0110\u0118\21\2\24\24"+
		"99WWkk{{\177\177\u0084\u0084\u008a\u008a\u009d\u009d\u00a3\u00a3\u00cc"+
		"\u00cc\u00d7\u00d7\u00dd\u00dd\u00ff\u00ff\u0107\u0107\23\2\16\23\258"+
		":VXjlz|~\u0080\u0083\u0085\u0089\u008b\u008e\u0090\u009c\u009e\u00a2\u00a4"+
		"\u00cb\u00cd\u00d6\u00d8\u00dc\u00de\u00fe\u0100\u0106\u0108\u0118\2\u0e08"+
		"\2\u0114\3\2\2\2\4\u011d\3\2\2\2\6\u0120\3\2\2\2\b\u0123\3\2\2\2\n\u0126"+
		"\3\2\2\2\f\u0129\3\2\2\2\16\u012c\3\2\2\2\20\u046e\3\2\2\2\22\u0470\3"+
		"\2\2\2\24\u051a\3\2\2\2\26\u051c\3\2\2\2\30\u052d\3\2\2\2\32\u0533\3\2"+
		"\2\2\34\u053f\3\2\2\2\36\u054c\3\2\2\2 \u054f\3\2\2\2\"\u0553\3\2\2\2"+
		"$\u058f\3\2\2\2&\u0591\3\2\2\2(\u0595\3\2\2\2*\u05a1\3\2\2\2,\u05a6\3"+
		"\2\2\2.\u05ad\3\2\2\2\60\u05af\3\2\2\2\62\u05b7\3\2\2\2\64\u05c0\3\2\2"+
		"\2\66\u05cb\3\2\2\28\u05dc\3\2\2\2:\u05df\3\2\2\2<\u05ea\3\2\2\2>\u05fa"+
		"\3\2\2\2@\u0600\3\2\2\2B\u0602\3\2\2\2D\u060d\3\2\2\2F\u061e\3\2\2\2H"+
		"\u0625\3\2\2\2J\u0627\3\2\2\2L\u062d\3\2\2\2N\u0663\3\2\2\2P\u066f\3\2"+
		"\2\2R\u069f\3\2\2\2T\u06a2\3\2\2\2V\u06c8\3\2\2\2X\u06ca\3\2\2\2Z\u06d2"+
		"\3\2\2\2\\\u06f3\3\2\2\2^\u0712\3\2\2\2`\u071e\3\2\2\2b\u073e\3\2\2\2"+
		"d\u074a\3\2\2\2f\u074d\3\2\2\2h\u0756\3\2\2\2j\u0767\3\2\2\2l\u077b\3"+
		"\2\2\2n\u077d\3\2\2\2p\u0785\3\2\2\2r\u0789\3\2\2\2t\u078c\3\2\2\2v\u078f"+
		"\3\2\2\2x\u07a9\3\2\2\2z\u07ab\3\2\2\2|\u07e9\3\2\2\2~\u07f8\3\2\2\2\u0080"+
		"\u07fa\3\2\2\2\u0082\u0818\3\2\2\2\u0084\u081a\3\2\2\2\u0086\u0821\3\2"+
		"\2\2\u0088\u0841\3\2\2\2\u008a\u0843\3\2\2\2\u008c\u0855\3\2\2\2\u008e"+
		"\u086f\3\2\2\2\u0090\u0875\3\2\2\2\u0092\u0877\3\2\2\2\u0094\u0896\3\2"+
		"\2\2\u0096\u0898\3\2\2\2\u0098\u089c\3\2\2\2\u009a\u08a4\3\2\2\2\u009c"+
		"\u08af\3\2\2\2\u009e\u08b3\3\2\2\2\u00a0\u08be\3\2\2\2\u00a2\u08da\3\2"+
		"\2\2\u00a4\u08dc\3\2\2\2\u00a6\u08e7\3\2\2\2\u00a8\u08fd\3\2\2\2\u00aa"+
		"\u0930\3\2\2\2\u00ac\u0932\3\2\2\2\u00ae\u093a\3\2\2\2\u00b0\u0945\3\2"+
		"\2\2\u00b2\u094c\3\2\2\2\u00b4\u0950\3\2\2\2\u00b6\u095a\3\2\2\2\u00b8"+
		"\u0962\3\2\2\2\u00ba\u097a\3\2\2\2\u00bc\u097e\3\2\2\2\u00be\u0980\3\2"+
		"\2\2\u00c0\u098e\3\2\2\2\u00c2\u09d9\3\2\2\2\u00c4\u09df\3\2\2\2\u00c6"+
		"\u0ab1\3\2\2\2\u00c8\u0acc\3\2\2\2\u00ca\u0ace\3\2\2\2\u00cc\u0ad0\3\2"+
		"\2\2\u00ce\u0ad2\3\2\2\2\u00d0\u0ad4\3\2\2\2\u00d2\u0ad6\3\2\2\2\u00d4"+
		"\u0adb\3\2\2\2\u00d6\u0ae2\3\2\2\2\u00d8\u0ae6\3\2\2\2\u00da\u0aeb\3\2"+
		"\2\2\u00dc\u0af5\3\2\2\2\u00de\u0afa\3\2\2\2\u00e0\u0b1e\3\2\2\2\u00e2"+
		"\u0b20\3\2\2\2\u00e4\u0b28\3\2\2\2\u00e6\u0b34\3\2\2\2\u00e8\u0b3c\3\2"+
		"\2\2\u00ea\u0b45\3\2\2\2\u00ec\u0b4d\3\2\2\2\u00ee\u0b57\3\2\2\2\u00f0"+
		"\u0b5c\3\2\2\2\u00f2\u0b65\3\2\2\2\u00f4\u0b97\3\2\2\2\u00f6\u0ba9\3\2"+
		"\2\2\u00f8\u0bb2\3\2\2\2\u00fa\u0bb4\3\2\2\2\u00fc\u0bc0\3\2\2\2\u00fe"+
		"\u0bc2\3\2\2\2\u0100\u0bca\3\2\2\2\u0102\u0bd4\3\2\2\2\u0104\u0bd9\3\2"+
		"\2\2\u0106\u0be1\3\2\2\2\u0108\u0be3\3\2\2\2\u010a\u0c0c\3\2\2\2\u010c"+
		"\u0c15\3\2\2\2\u010e\u0c17\3\2\2\2\u0110\u0c19\3\2\2\2\u0112\u0c1b\3\2"+
		"\2\2\u0114\u0118\5\20\t\2\u0115\u0117\7\3\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\2\2\3\u011c\3\3\2\2\2\u011d\u011e"+
		"\5\u00b4[\2\u011e\u011f\7\2\2\3\u011f\5\3\2\2\2\u0120\u0121\5\u00b0Y\2"+
		"\u0121\u0122\7\2\2\3\u0122\7\3\2\2\2\u0123\u0124\5\u00aeX\2\u0124\u0125"+
		"\7\2\2\3\u0125\t\3\2\2\2\u0126\u0127\5\u00b2Z\2\u0127\u0128\7\2\2\3\u0128"+
		"\13\3\2\2\2\u0129\u012a\5\u00e0q\2\u012a\u012b\7\2\2\3\u012b\r\3\2\2\2"+
		"\u012c\u012d\5\u00e6t\2\u012d\u012e\7\2\2\3\u012e\17\3\2\2\2\u012f\u046f"+
		"\5\"\22\2\u0130\u0132\5\62\32\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u046f\5N(\2\u0134\u0136\7\u0105\2\2\u0135"+
		"\u0137\7\u009b\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u046f\5\u00aeX\2\u0139\u013a\78\2\2\u013a\u013e\5,\27\2"+
		"\u013b\u013c\7u\2\2\u013c\u013d\7\u009f\2\2\u013d\u013f\7Y\2\2\u013e\u013b"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0148\5\u00aeX"+
		"\2\u0141\u0147\5 \21\2\u0142\u0147\5\36\20\2\u0143\u0144\7\u010f\2\2\u0144"+
		"\u0145\t\2\2\2\u0145\u0147\5:\36\2\u0146\u0141\3\2\2\2\u0146\u0142\3\2"+
		"\2\2\u0146\u0143\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u046f\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7\21"+
		"\2\2\u014c\u014d\5,\27\2\u014d\u014e\5\u00aeX\2\u014e\u014f\7\u00dc\2"+
		"\2\u014f\u0150\t\2\2\2\u0150\u0151\5:\36\2\u0151\u046f\3\2\2\2\u0152\u0153"+
		"\7\21\2\2\u0153\u0154\5,\27\2\u0154\u0155\5\u00aeX\2\u0155\u0156\7\u00dc"+
		"\2\2\u0156\u0157\5\36\20\2\u0157\u046f\3\2\2\2\u0158\u0159\7Q\2\2\u0159"+
		"\u015c\5,\27\2\u015a\u015b\7u\2\2\u015b\u015d\7Y\2\2\u015c\u015a\3\2\2"+
		"\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0160\5\u00aeX\2\u015f"+
		"\u0161\t\3\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u046f\3\2"+
		"\2\2\u0162\u0163\7\u00df\2\2\u0163\u0166\t\4\2\2\u0164\u0165\t\5\2\2\u0165"+
		"\u0167\5\u00aeX\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u016c"+
		"\3\2\2\2\u0168\u016a\7\u008b\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2"+
		"\2\u016a\u016b\3\2\2\2\u016b\u016d\7\u012b\2\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u046f\3\2\2\2\u016e\u016f\6\t\2\2\u016f\u0174\5\26"+
		"\f\2\u0170\u0171\7\4\2\2\u0171\u0172\5\u00e6t\2\u0172\u0173\7\5\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0170\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2"+
		"\2\2\u0176\u0178\5\66\34\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u017e\58\35\2\u017a\u017c\7\30\2\2\u017b\u017a\3"+
		"\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\5\"\22\2\u017e"+
		"\u017b\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u046f\3\2\2\2\u0180\u0181\6\t"+
		"\3\2\u0181\u0186\5\26\f\2\u0182\u0183\7\4\2\2\u0183\u0184\5\u00e6t\2\u0184"+
		"\u0185\7\5\2\2\u0185\u0187\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\5\66\34\2\u0189\u018e\58\35\2\u018a"+
		"\u018c\7\30\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3"+
		"\2\2\2\u018d\u018f\5\"\22\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u046f\3\2\2\2\u0190\u0195\5\26\f\2\u0191\u0192\7\4\2\2\u0192\u0193\5"+
		"\u00e6t\2\u0193\u0194\7\5\2\2\u0194\u0196\3\2\2\2\u0195\u0191\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u01ae\3\2\2\2\u0197\u01ad\5 \21\2\u0198\u0199"+
		"\7\u00b1\2\2\u0199\u019a\7 \2\2\u019a\u019b\7\4\2\2\u019b\u019c\5\u00e6"+
		"t\2\u019c\u019d\7\5\2\2\u019d\u01a2\3\2\2\2\u019e\u019f\7\u00b1\2\2\u019f"+
		"\u01a0\7 \2\2\u01a0\u01a2\5\u0096L\2\u01a1\u0198\3\2\2\2\u01a1\u019e\3"+
		"\2\2\2\u01a2\u01ad\3\2\2\2\u01a3\u01ad\5\32\16\2\u01a4\u01ad\5\34\17\2"+
		"\u01a5\u01ad\5\u00aaV\2\u01a6\u01ad\5F$\2\u01a7\u01ad\5\36\20\2\u01a8"+
		"\u01a9\7\u008f\2\2\u01a9\u01ad\7\u012f\2\2\u01aa\u01ab\7\u00ee\2\2\u01ab"+
		"\u01ad\5:\36\2\u01ac\u0197\3\2\2\2\u01ac\u01a1\3\2\2\2\u01ac\u01a3\3\2"+
		"\2\2\u01ac\u01a4\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a6\3\2\2\2\u01ac"+
		"\u01a7\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b5\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b1\u01b3\7\30\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\5\"\22\2\u01b5\u01b2\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u046f\3\2\2\2\u01b7\u01b8\78\2\2\u01b8\u01bc\7\u00eb"+
		"\2\2\u01b9\u01ba\7u\2\2\u01ba\u01bb\7\u009f\2\2\u01bb\u01bd\7Y\2\2\u01bc"+
		"\u01b9\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5\u00b0"+
		"Y\2\u01bf\u01c0\7\u008b\2\2\u01c0\u01c9\5\u00b0Y\2\u01c1\u01c8\5\66\34"+
		"\2\u01c2\u01c8\5\u00aaV\2\u01c3\u01c8\5F$\2\u01c4\u01c8\5\36\20\2\u01c5"+
		"\u01c6\7\u00ee\2\2\u01c6\u01c8\5:\36\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2"+
		"\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u046f\3\2"+
		"\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01d1\5\30\r\2\u01cd\u01ce\7\4\2\2\u01ce"+
		"\u01cf\5\u00e6t\2\u01cf\u01d0\7\5\2\2\u01d0\u01d2\3\2\2\2\u01d1\u01cd"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\66\34\2"+
		"\u01d4\u01d9\58\35\2\u01d5\u01d7\7\30\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\5\"\22\2\u01d9\u01d6\3\2\2\2"+
		"\u01d9\u01da\3\2\2\2\u01da\u046f\3\2\2\2\u01db\u01dc\7\22\2\2\u01dc\u01dd"+
		"\7\u00eb\2\2\u01dd\u01df\5\u00aeX\2\u01de\u01e0\5(\25\2\u01df\u01de\3"+
		"\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7\63\2\2\u01e2"+
		"\u01ea\7\u00e5\2\2\u01e3\u01eb\5\u0104\u0083\2\u01e4\u01e5\7f\2\2\u01e5"+
		"\u01e6\7.\2\2\u01e6\u01eb\5\u0098M\2\u01e7\u01e8\7f\2\2\u01e8\u01e9\7"+
		"\20\2\2\u01e9\u01eb\7.\2\2\u01ea\u01e3\3\2\2\2\u01ea\u01e4\3\2\2\2\u01ea"+
		"\u01e7\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u046f\3\2\2\2\u01ec\u01ed\7\21"+
		"\2\2\u01ed\u01ee\7\u00eb\2\2\u01ee\u01ef\5\u00aeX\2\u01ef\u01f0\7\16\2"+
		"\2\u01f0\u01f1\t\6\2\2\u01f1\u01f2\5\u00e2r\2\u01f2\u046f\3\2\2\2\u01f3"+
		"\u01f4\7\21\2\2\u01f4\u01f5\7\u00eb\2\2\u01f5\u01f6\5\u00aeX\2\u01f6\u01f7"+
		"\7\16\2\2\u01f7\u01f8\t\6\2\2\u01f8\u01f9\7\4\2\2\u01f9\u01fa\5\u00e2"+
		"r\2\u01fa\u01fb\7\5\2\2\u01fb\u046f\3\2\2\2\u01fc\u01fd\7\21\2\2\u01fd"+
		"\u01fe\7\u00eb\2\2\u01fe\u01ff\5\u00aeX\2\u01ff\u0200\7\u00c5\2\2\u0200"+
		"\u0201\7-\2\2\u0201\u0202\5\u00aeX\2\u0202\u0203\7\u00f2\2\2\u0203\u0204"+
		"\5\u0100\u0081\2\u0204\u046f\3\2\2\2\u0205\u0206\7\21\2\2\u0206\u0207"+
		"\7\u00eb\2\2\u0207\u0208\5\u00aeX\2\u0208\u0209\7Q\2\2\u0209\u020a\t\6"+
		"\2\2\u020a\u020b\7\4\2\2\u020b\u020c\5\u00acW\2\u020c\u020d\7\5\2\2\u020d"+
		"\u046f\3\2\2\2\u020e\u020f\7\21\2\2\u020f\u0210\7\u00eb\2\2\u0210\u0211"+
		"\5\u00aeX\2\u0211\u0212\7Q\2\2\u0212\u0213\t\6\2\2\u0213\u0214\5\u00ac"+
		"W\2\u0214\u046f\3\2\2\2\u0215\u0216\7\21\2\2\u0216\u0217\t\7\2\2\u0217"+
		"\u0218\5\u00aeX\2\u0218\u0219\7\u00c5\2\2\u0219\u021a\7\u00f2\2\2\u021a"+
		"\u021b\5\u00aeX\2\u021b\u046f\3\2\2\2\u021c\u021d\7\21\2\2\u021d\u021e"+
		"\t\7\2\2\u021e\u021f\5\u00aeX\2\u021f\u0220\7\u00dc\2\2\u0220\u0221\7"+
		"\u00ee\2\2\u0221\u0222\5:\36\2\u0222\u046f\3\2\2\2\u0223\u0224\7\21\2"+
		"\2\u0224\u0225\t\7\2\2\u0225\u0226\5\u00aeX\2\u0226\u0227\7\u0103\2\2"+
		"\u0227\u022a\7\u00ee\2\2\u0228\u0229\7u\2\2\u0229\u022b\7Y\2\2\u022a\u0228"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\5:\36\2\u022d"+
		"\u046f\3\2\2\2\u022e\u022f\7\21\2\2\u022f\u0230\7\u00eb\2\2\u0230\u0231"+
		"\5\u00aeX\2\u0231\u0233\t\b\2\2\u0232\u0234\7-\2\2\u0233\u0232\3\2\2\2"+
		"\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\5\u00aeX\2\u0236"+
		"\u0238\5\u010c\u0087\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u046f"+
		"\3\2\2\2\u0239\u023a\7\21\2\2\u023a\u023b\7\u00eb\2\2\u023b\u023d\5\u00ae"+
		"X\2\u023c\u023e\5(\25\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\7%\2\2\u0240\u0242\7-\2\2\u0241\u0240\3\2\2"+
		"\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\5\u00aeX\2\u0244"+
		"\u0246\5\u00e8u\2\u0245\u0247\5\u00dep\2\u0246\u0245\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u046f\3\2\2\2\u0248\u0249\7\21\2\2\u0249\u024a\7\u00eb"+
		"\2\2\u024a\u024c\5\u00aeX\2\u024b\u024d\5(\25\2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\u00dc\2\2\u024f\u0250"+
		"\7\u00d9\2\2\u0250\u0254\7\u012b\2\2\u0251\u0252\7\u010f\2\2\u0252\u0253"+
		"\7\u00da\2\2\u0253\u0255\5:\36\2\u0254\u0251\3\2\2\2\u0254\u0255\3\2\2"+
		"\2\u0255\u046f\3\2\2\2\u0256\u0257\7\21\2\2\u0257\u0258\7\u00eb\2\2\u0258"+
		"\u025a\5\u00aeX\2\u0259\u025b\5(\25\2\u025a\u0259\3\2\2\2\u025a\u025b"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\7\u00dc\2\2\u025d\u025e\7\u00da"+
		"\2\2\u025e\u025f\5:\36\2\u025f\u046f\3\2\2\2\u0260\u0261\7\21\2\2\u0261"+
		"\u0262\t\7\2\2\u0262\u0263\5\u00aeX\2\u0263\u0267\7\16\2\2\u0264\u0265"+
		"\7u\2\2\u0265\u0266\7\u009f\2\2\u0266\u0268\7Y\2\2\u0267\u0264\3\2\2\2"+
		"\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\5&\24\2\u026a\u0269"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u046f\3\2\2\2\u026e\u026f\7\21\2\2\u026f\u0270\7\u00eb\2\2\u0270\u0271"+
		"\5\u00aeX\2\u0271\u0272\5(\25\2\u0272\u0273\7\u00c5\2\2\u0273\u0274\7"+
		"\u00f2\2\2\u0274\u0275\5(\25\2\u0275\u046f\3\2\2\2\u0276\u0277\7\21\2"+
		"\2\u0277\u0278\t\7\2\2\u0278\u0279\5\u00aeX\2\u0279\u027c\7Q\2\2\u027a"+
		"\u027b\7u\2\2\u027b\u027d\7Y\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u0283\5(\25\2\u027f\u0280\7\6\2\2\u0280\u0282"+
		"\5(\25\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0283"+
		"\u0284\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0288\7\u00bc"+
		"\2\2\u0287\u0286\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u046f\3\2\2\2\u0289"+
		"\u028a\7\21\2\2\u028a\u028b\7\u00eb\2\2\u028b\u028d\5\u00aeX\2\u028c\u028e"+
		"\5(\25\2\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u0290\7\u00dc\2\2\u0290\u0291\5\36\20\2\u0291\u046f\3\2\2\2\u0292\u0293"+
		"\7\21\2\2\u0293\u0294\7\u00eb\2\2\u0294\u0295\5\u00aeX\2\u0295\u0296\7"+
		"\u00c1\2\2\u0296\u0297\7\u00b2\2\2\u0297\u046f\3\2\2\2\u0298\u0299\7Q"+
		"\2\2\u0299\u029c\7\u00eb\2\2\u029a\u029b\7u\2\2\u029b\u029d\7Y\2\2\u029c"+
		"\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\5\u00ae"+
		"X\2\u029f\u02a1\7\u00bc\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u046f\3\2\2\2\u02a2\u02a3\7Q\2\2\u02a3\u02a6\7\u010a\2\2\u02a4\u02a5"+
		"\7u\2\2\u02a5\u02a7\7Y\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a8\3\2\2\2\u02a8\u046f\5\u00aeX\2\u02a9\u02ac\78\2\2\u02aa\u02ab\7"+
		"\u00a7\2\2\u02ab\u02ad\7\u00c7\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2"+
		"\2\2\u02ad\u02b2\3\2\2\2\u02ae\u02b0\7n\2\2\u02af\u02ae\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\7\u00ef\2\2\u02b2\u02af"+
		"\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b8\7\u010a\2"+
		"\2\u02b5\u02b6\7u\2\2\u02b6\u02b7\7\u009f\2\2\u02b7\u02b9\7Y\2\2\u02b8"+
		"\u02b5\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\5\u00ae"+
		"X\2\u02bb\u02bd\5\u009eP\2\u02bc\u02bb\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"\u02c6\3\2\2\2\u02be\u02c5\5 \21\2\u02bf\u02c0\7\u00b1\2\2\u02c0\u02c1"+
		"\7\u00a3\2\2\u02c1\u02c5\5\u0096L\2\u02c2\u02c3\7\u00ee\2\2\u02c3\u02c5"+
		"\5:\36\2\u02c4\u02be\3\2\2\2\u02c4\u02bf\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5"+
		"\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7\30\2\2\u02ca\u02cb\5\"\22\2\u02cb"+
		"\u046f\3\2\2\2\u02cc\u02cf\78\2\2\u02cd\u02ce\7\u00a7\2\2\u02ce\u02d0"+
		"\7\u00c7\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2"+
		"\2\u02d1\u02d3\7n\2\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4"+
		"\3\2\2\2\u02d4\u02d5\7\u00ef\2\2\u02d5\u02d6\7\u010a\2\2\u02d6\u02db\5"+
		"\u00b0Y\2\u02d7\u02d8\7\4\2\2\u02d8\u02d9\5\u00e6t\2\u02d9\u02da\7\5\2"+
		"\2\u02da\u02dc\3\2\2\2\u02db\u02d7\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02e0\5\66\34\2\u02de\u02df\7\u00a6\2\2\u02df\u02e1\5:"+
		"\36\2\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u046f\3\2\2\2\u02e2"+
		"\u02e3\7\21\2\2\u02e3\u02e4\7\u010a\2\2\u02e4\u02e6\5\u00aeX\2\u02e5\u02e7"+
		"\7\30\2\2\u02e6\u02e5\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2"+
		"\u02e8\u02e9\5\"\22\2\u02e9\u046f\3\2\2\2\u02ea\u02ed\78\2\2\u02eb\u02ec"+
		"\7\u00a7\2\2\u02ec\u02ee\7\u00c7\2\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3"+
		"\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02f1\7\u00ef\2\2\u02f0\u02ef\3\2\2\2"+
		"\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f6\7l\2\2\u02f3\u02f4"+
		"\7u\2\2\u02f4\u02f5\7\u009f\2\2\u02f5\u02f7\7Y\2\2\u02f6\u02f3\3\2\2\2"+
		"\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\5\u00aeX\2\u02f9"+
		"\u02fa\7\30\2\2\u02fa\u0304\7\u012b\2\2\u02fb\u02fc\7\u0107\2\2\u02fc"+
		"\u0301\5L\'\2\u02fd\u02fe\7\6\2\2\u02fe\u0300\5L\'\2\u02ff\u02fd\3\2\2"+
		"\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305"+
		"\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u02fb\3\2\2\2\u0304\u0305\3\2\2\2\u0305"+
		"\u046f\3\2\2\2\u0306\u0308\7Q\2\2\u0307\u0309\7\u00ef\2\2\u0308\u0307"+
		"\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030d\7l\2\2\u030b"+
		"\u030c\7u\2\2\u030c\u030e\7Y\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2\2"+
		"\2\u030e\u030f\3\2\2\2\u030f\u046f\5\u00aeX\2\u0310\u0312\7Z\2\2\u0311"+
		"\u0313\t\t\2\2\u0312\u0311\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u046f\5\20\t\2\u0315\u0316\7\u00df\2\2\u0316\u0319\7\u00ec"+
		"\2\2\u0317\u0318\t\5\2\2\u0318\u031a\5\u00aeX\2\u0319\u0317\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031f\3\2\2\2\u031b\u031d\7\u008b\2\2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\7\u012b\2"+
		"\2\u031f\u031c\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u046f\3\2\2\2\u0321\u0322"+
		"\7\u00df\2\2\u0322\u0323\7\u00eb\2\2\u0323\u0326\7\\\2\2\u0324\u0325\t"+
		"\5\2\2\u0325\u0327\5\u00aeX\2\u0326\u0324\3\2\2\2\u0326\u0327\3\2\2\2"+
		"\u0327\u0328\3\2\2\2\u0328\u0329\7\u008b\2\2\u0329\u032b\7\u012b\2\2\u032a"+
		"\u032c\5(\25\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u046f\3\2"+
		"\2\2\u032d\u032e\7\u00df\2\2\u032e\u032f\7\u00ee\2\2\u032f\u0334\5\u00ae"+
		"X\2\u0330\u0331\7\4\2\2\u0331\u0332\5> \2\u0332\u0333\7\5\2\2\u0333\u0335"+
		"\3\2\2\2\u0334\u0330\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u046f\3\2\2\2\u0336"+
		"\u0337\7\u00df\2\2\u0337\u0338\7.\2\2\u0338\u0339\t\5\2\2\u0339\u033c"+
		"\5\u00aeX\2\u033a\u033b\t\5\2\2\u033b\u033d\5\u00aeX\2\u033c\u033a\3\2"+
		"\2\2\u033c\u033d\3\2\2\2\u033d\u046f\3\2\2\2\u033e\u033f\7\u00df\2\2\u033f"+
		"\u0342\7\u010b\2\2\u0340\u0341\t\5\2\2\u0341\u0343\5\u00aeX\2\u0342\u0340"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0348\3\2\2\2\u0344\u0346\7\u008b\2"+
		"\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0349"+
		"\7\u012b\2\2\u0348\u0345\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u046f\3\2\2"+
		"\2\u034a\u034b\7\u00df\2\2\u034b\u034c\7\u00b2\2\2\u034c\u034e\5\u00ae"+
		"X\2\u034d\u034f\5(\25\2\u034e\u034d\3\2\2\2\u034e\u034f\3\2\2\2\u034f"+
		"\u046f\3\2\2\2\u0350\u0352\7\u00df\2\2\u0351\u0353\5\u0104\u0083\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u035c\7m"+
		"\2\2\u0355\u0357\7\u008b\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u035b\5\u00aeX\2\u0359\u035b\7\u012b\2\2\u035a\u0358"+
		"\3\2\2\2\u035a\u0359\3\2\2\2\u035b\u035d\3\2\2\2\u035c\u0356\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u046f\3\2\2\2\u035e\u035f\7\u00df\2\2\u035f\u0360"+
		"\78\2\2\u0360\u0361\7\u00eb\2\2\u0361\u0364\5\u00aeX\2\u0362\u0363\7\30"+
		"\2\2\u0363\u0365\7\u00d9\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u046f\3\2\2\2\u0366\u0367\7\u00df\2\2\u0367\u0368\7;\2\2\u0368\u046f"+
		"\7\u009b\2\2\u0369\u036a\t\n\2\2\u036a\u036c\7l\2\2\u036b\u036d\7\\\2"+
		"\2\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u046f"+
		"\5.\30\2\u036f\u0370\t\n\2\2\u0370\u0372\5,\27\2\u0371\u0373\7\\\2\2\u0372"+
		"\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0375\5\u00ae"+
		"X\2\u0375\u046f\3\2\2\2\u0376\u0377\t\n\2\2\u0377\u0378\7J\2\2\u0378\u046f"+
		"\5\u00aeX\2\u0379\u037a\t\n\2\2\u037a\u037b\7t\2\2\u037b\u037e\5\u00ae"+
		"X\2\u037c\u037d\7\u008c\2\2\u037d\u037f\7\u012f\2\2\u037e\u037c\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u046f\3\2\2\2\u0380\u0382\t\n\2\2\u0381\u0383"+
		"\7\u00eb\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2"+
		"\2\u0384\u0386\t\13\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u0389\5\u00aeX\2\u0388\u038a\5(\25\2\u0389\u0388"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u038c\3\2\2\2\u038b\u038d\5\60\31\2"+
		"\u038c\u038b\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u046f\3\2\2\2\u038e\u0390"+
		"\t\n\2\2\u038f\u0391\7\u00bd\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2"+
		"\2\u0391\u0392\3\2\2\2\u0392\u046f\5\"\22\2\u0393\u0394\7/\2\2\u0394\u0395"+
		"\7\u00a3\2\2\u0395\u0396\5,\27\2\u0396\u0397\5\u00aeX\2\u0397\u0398\7"+
		"\u0082\2\2\u0398\u0399\t\f\2\2\u0399\u046f\3\2\2\2\u039a\u039b\7/\2\2"+
		"\u039b\u039c\7\u00a3\2\2\u039c\u039d\7\u00eb\2\2\u039d\u039e\5\u00aeX"+
		"\2\u039e\u039f\7\u0082\2\2\u039f\u03a0\t\f\2\2\u03a0\u046f\3\2\2\2\u03a1"+
		"\u03a2\7\u00c4\2\2\u03a2\u03a3\7\u00eb\2\2\u03a3\u046f\5\u00aeX\2\u03a4"+
		"\u03ac\7\u00c4\2\2\u03a5\u03ad\7\u012b\2\2\u03a6\u03a8\13\2\2\2\u03a7"+
		"\u03a6\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03aa\3\2\2\2\u03a9\u03a7\3\2"+
		"\2\2\u03aa\u03ad\3\2\2\2\u03ab\u03a9\3\2\2\2\u03ac\u03a5\3\2\2\2\u03ac"+
		"\u03a9\3\2\2\2\u03ad\u046f\3\2\2\2\u03ae\u03b0\7!\2\2\u03af\u03b1\7\u0088"+
		"\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2"+
		"\u03b3\7\u00eb\2\2\u03b3\u03b6\5\u00aeX\2\u03b4\u03b5\7\u00a6\2\2\u03b5"+
		"\u03b7\5:\36\2\u03b6\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03bc\3\2"+
		"\2\2\u03b8\u03ba\7\30\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba"+
		"\u03bb\3\2\2\2\u03bb\u03bd\5\"\22\2\u03bc\u03b9\3\2\2\2\u03bc\u03bd\3"+
		"\2\2\2\u03bd\u046f\3\2\2\2\u03be\u03bf\7\u00fe\2\2\u03bf\u03c2\7\u00eb"+
		"\2\2\u03c0\u03c1\7u\2\2\u03c1\u03c3\7Y\2\2\u03c2\u03c0\3\2\2\2\u03c2\u03c3"+
		"\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u046f\5\u00aeX\2\u03c5\u03c6\7\'\2"+
		"\2\u03c6\u046f\7!\2\2\u03c7\u03c8\7\u0090\2\2\u03c8\u03ca\7@\2\2\u03c9"+
		"\u03cb\7\u0091\2\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03cc\u03cd\7|\2\2\u03cd\u03cf\7\u012b\2\2\u03ce\u03d0\7\u00af"+
		"\2\2\u03cf\u03ce\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d2\7\u0081\2\2\u03d2\u03d3\7\u00eb\2\2\u03d3\u03d5\5\u00aeX\2\u03d4"+
		"\u03d6\5(\25\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u046f\3\2"+
		"\2\2\u03d7\u03d8\7\u00fa\2\2\u03d8\u03d9\7\u00eb\2\2\u03d9\u03db\5\u00ae"+
		"X\2\u03da\u03dc\5(\25\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc"+
		"\u046f\3\2\2\2\u03dd\u03de\7\u009a\2\2\u03de\u03df\7\u00c6\2\2\u03df\u03e0"+
		"\7\u00eb\2\2\u03e0\u046f\5\u00aeX\2\u03e1\u03e2\t\r\2\2\u03e2\u03ea\5"+
		"\u0104\u0083\2\u03e3\u03eb\7\u012b\2\2\u03e4\u03e6\13\2\2\2\u03e5\u03e4"+
		"\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e8"+
		"\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03e3\3\2\2\2\u03ea\u03e7\3\2"+
		"\2\2\u03eb\u046f\3\2\2\2\u03ec\u03ed\7\u00dc\2\2\u03ed\u03f1\7\u00ce\2"+
		"\2\u03ee\u03f0\13\2\2\2\u03ef\u03ee\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u046f\3\2\2\2\u03f3\u03f1\3\2"+
		"\2\2\u03f4\u03f8\7\u00dc\2\2\u03f5\u03f7\13\2\2\2\u03f6\u03f5\3\2\2\2"+
		"\u03f7\u03fa\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u046f"+
		"\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fb\u046f\7\u00c8\2\2\u03fc\u03fd\7\u0099"+
		"\2\2\u03fd\u03fe\7\u00eb\2\2\u03fe\u0400\5\u00aeX\2\u03ff\u0401\5(\25"+
		"\2\u0400\u03ff\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0404\3\2\2\2\u0402\u0403"+
		"\7\u00a6\2\2\u0403\u0405\5:\36\2\u0404\u0402\3\2\2\2\u0404\u0405\3\2\2"+
		"\2\u0405\u046f\3\2\2\2\u0406\u0407\7\u0110\2\2\u0407\u0408\7\u0112\2\2"+
		"\u0408\u046f\5\u0104\u0083\2\u0409\u040a\7\u0113\2\2\u040a\u046f\5\u0104"+
		"\u0083\2\u040b\u040c\7\u0111\2\2\u040c\u040d\7\u00eb\2\2\u040d\u040f\5"+
		"\u00aeX\2\u040e\u0410\5(\25\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2\2\2"+
		"\u0410\u0411\3\2\2\2\u0411\u0412\7\u008c\2\2\u0412\u0413\5\u010a\u0086"+
		"\2\u0413\u046f\3\2\2\2\u0414\u0415\7\u0090\2\2\u0415\u0416\7@\2\2\u0416"+
		"\u0417\5\u00c8e\2\u0417\u0418\7\u00eb\2\2\u0418\u041b\5\u00aeX\2\u0419"+
		"\u041a\7\u00a6\2\2\u041a\u041c\5:\36\2\u041b\u0419\3\2\2\2\u041b\u041c"+
		"\3\2\2\2\u041c\u046f\3\2\2\2\u041d\u041f\5\62\32\2\u041e\u041d\3\2\2\2"+
		"\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\7[\2\2\u0421\u0422"+
		"\7\u00eb\2\2\u0422\u0424\5\u00aeX\2\u0423\u0425\5(\25\2\u0424\u0423\3"+
		"\2\2\2\u0424\u0425\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\7\u00f2\2\2"+
		"\u0427\u042a\5\u00c8e\2\u0428\u0429\7\u00a6\2\2\u0429\u042b\5:\36\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u046f\3\2\2\2\u042c\u042d\7\u0114"+
		"\2\2\u042d\u042e\7\u00eb\2\2\u042e\u0430\5\u00aeX\2\u042f\u0431\5(\25"+
		"\2\u0430\u042f\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0434\3\2\2\2\u0432\u0433"+
		"\7\u00a6\2\2\u0433\u0435\5:\36\2\u0434\u0432\3\2\2\2\u0434\u0435\3\2\2"+
		"\2\u0435\u046f\3\2\2\2\u0436\u0437\7\u0114\2\2\u0437\u0438\7\u0115\2\2"+
		"\u0438\u043b\5\u00c8e\2\u0439\u043a\7\u00a6\2\2\u043a\u043c\5:\36\2\u043b"+
		"\u0439\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u046f\3\2\2\2\u043d\u043e\7\u0116"+
		"\2\2\u043e\u043f\7\u0117\2\2\u043f\u0440\7\4\2\2\u0440\u0441\7\u012b\2"+
		"\2\u0441\u0442\7\5\2\2\u0442\u0443\7\u00a6\2\2\u0443\u0444\5:\36\2\u0444"+
		"\u0445\7\u0118\2\2\u0445\u0446\7\4\2\2\u0446\u0447\7\u012b\2\2\u0447\u0448"+
		"\7\5\2\2\u0448\u0449\7\u00a6\2\2\u0449\u044a\5:\36\2\u044a\u046f\3\2\2"+
		"\2\u044b\u044c\7\u0109\2\2\u044c\u0451\5\u00aeX\2\u044d\u044e\7\u00cb"+
		"\2\2\u044e\u044f\5\u010a\u0086\2\u044f\u0450\7s\2\2\u0450\u0452\3\2\2"+
		"\2\u0451\u044d\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0455\3\2\2\2\u0453\u0454"+
		"\7R\2\2\u0454\u0456\7\u00d4\2\2\u0455\u0453\3\2\2\2\u0455\u0456\3\2\2"+
		"\2\u0456\u046f\3\2\2\2\u0457\u0458\7\66\2\2\u0458\u0459\7\u00f2\2\2\u0459"+
		"\u045a\t\16\2\2\u045a\u0461\5\u00aeX\2\u045b\u045c\7\u00b1\2\2\u045c\u045d"+
		"\7 \2\2\u045d\u045e\7\4\2\2\u045e\u045f\5\u00e6t\2\u045f\u0460\7\5\2\2"+
		"\u0460\u0462\3\2\2\2\u0461\u045b\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0465"+
		"\3\2\2\2\u0463\u0464\7\u00a6\2\2\u0464\u0466\5:\36\2\u0465\u0463\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u046f\3\2\2\2\u0467\u046b\5\24\13\2\u0468"+
		"\u046a\13\2\2\2\u0469\u0468\3\2\2\2\u046a\u046d\3\2\2\2\u046b\u046c\3"+
		"\2\2\2\u046b\u0469\3\2\2\2\u046c\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046e"+
		"\u012f\3\2\2\2\u046e\u0131\3\2\2\2\u046e\u0134\3\2\2\2\u046e\u0139\3\2"+
		"\2\2\u046e\u014b\3\2\2\2\u046e\u0152\3\2\2\2\u046e\u0158\3\2\2\2\u046e"+
		"\u0162\3\2\2\2\u046e\u016e\3\2\2\2\u046e\u0180\3\2\2\2\u046e\u0190\3\2"+
		"\2\2\u046e\u01b7\3\2\2\2\u046e\u01cc\3\2\2\2\u046e\u01db\3\2\2\2\u046e"+
		"\u01ec\3\2\2\2\u046e\u01f3\3\2\2\2\u046e\u01fc\3\2\2\2\u046e\u0205\3\2"+
		"\2\2\u046e\u020e\3\2\2\2\u046e\u0215\3\2\2\2\u046e\u021c\3\2\2\2\u046e"+
		"\u0223\3\2\2\2\u046e\u022e\3\2\2\2\u046e\u0239\3\2\2\2\u046e\u0248\3\2"+
		"\2\2\u046e\u0256\3\2\2\2\u046e\u0260\3\2\2\2\u046e\u026e\3\2\2\2\u046e"+
		"\u0276\3\2\2\2\u046e\u0289\3\2\2\2\u046e\u0292\3\2\2\2\u046e\u0298\3\2"+
		"\2\2\u046e\u02a2\3\2\2\2\u046e\u02a9\3\2\2\2\u046e\u02cc\3\2\2\2\u046e"+
		"\u02e2\3\2\2\2\u046e\u02ea\3\2\2\2\u046e\u0306\3\2\2\2\u046e\u0310\3\2"+
		"\2\2\u046e\u0315\3\2\2\2\u046e\u0321\3\2\2\2\u046e\u032d\3\2\2\2\u046e"+
		"\u0336\3\2\2\2\u046e\u033e\3\2\2\2\u046e\u034a\3\2\2\2\u046e\u0350\3\2"+
		"\2\2\u046e\u035e\3\2\2\2\u046e\u0366\3\2\2\2\u046e\u0369\3\2\2\2\u046e"+
		"\u036f\3\2\2\2\u046e\u0376\3\2\2\2\u046e\u0379\3\2\2\2\u046e\u0380\3\2"+
		"\2\2\u046e\u038e\3\2\2\2\u046e\u0393\3\2\2\2\u046e\u039a\3\2\2\2\u046e"+
		"\u03a1\3\2\2\2\u046e\u03a4\3\2\2\2\u046e\u03ae\3\2\2\2\u046e\u03be\3\2"+
		"\2\2\u046e\u03c5\3\2\2\2\u046e\u03c7\3\2\2\2\u046e\u03d7\3\2\2\2\u046e"+
		"\u03dd\3\2\2\2\u046e\u03e1\3\2\2\2\u046e\u03ec\3\2\2\2\u046e\u03f4\3\2"+
		"\2\2\u046e\u03fb\3\2\2\2\u046e\u03fc\3\2\2\2\u046e\u0406\3\2\2\2\u046e"+
		"\u0409\3\2\2\2\u046e\u040b\3\2\2\2\u046e\u0414\3\2\2\2\u046e\u041e\3\2"+
		"\2\2\u046e\u042c\3\2\2\2\u046e\u0436\3\2\2\2\u046e\u043d\3\2\2\2\u046e"+
		"\u044b\3\2\2\2\u046e\u0457\3\2\2\2\u046e\u0467\3\2\2\2\u046f\21\3\2\2"+
		"\2\u0470\u0471\7\u013b\2\2\u0471\23\3\2\2\2\u0472\u0473\78\2\2\u0473\u051b"+
		"\7\u00ce\2\2\u0474\u0475\7Q\2\2\u0475\u051b\7\u00ce\2\2\u0476\u0478\7"+
		"o\2\2\u0477\u0479\7\u00ce\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2"+
		"\u0479\u051b\3\2\2\2\u047a\u047c\7\u00ca\2\2\u047b\u047d\7\u00ce\2\2\u047c"+
		"\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u051b\3\2\2\2\u047e\u047f\7\u00df"+
		"\2\2\u047f\u051b\7o\2\2\u0480\u0481\7\u00df\2\2\u0481\u0483\7\u00ce\2"+
		"\2\u0482\u0484\7o\2\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u051b"+
		"\3\2\2\2\u0485\u0486\7\u00df\2\2\u0486\u051b\7\u00ba\2\2\u0487\u0488\7"+
		"\u00df\2\2\u0488\u051b\7\u00cf\2\2\u0489\u048a\7\u00df\2\2\u048a\u048b"+
		"\7;\2\2\u048b\u051b\7\u00cf\2\2\u048c\u048d\7[\2\2\u048d\u051b\7\u00eb"+
		"\2\2\u048e\u048f\7w\2\2\u048f\u051b\7\u00eb\2\2\u0490\u0491\7\u00df\2"+
		"\2\u0491\u051b\7\62\2\2\u0492\u0493\7\u00df\2\2\u0493\u0494\78\2\2\u0494"+
		"\u051b\7\u00eb\2\2\u0495\u0496\7\u00df\2\2\u0496\u051b\7\u00f6\2\2\u0497"+
		"\u0498\7\u00df\2\2\u0498\u051b\7z\2\2\u0499\u049a\7\u00df\2\2\u049a\u051b"+
		"\7\u0094\2\2\u049b\u049c\78\2\2\u049c\u051b\7y\2\2\u049d\u049e\7Q\2\2"+
		"\u049e\u051b\7y\2\2\u049f\u04a0\7\21\2\2\u04a0\u051b\7y\2\2\u04a1\u04a2"+
		"\7\u0093\2\2\u04a2\u051b\7\u00eb\2\2\u04a3\u04a4\7\u0093\2\2\u04a4\u051b"+
		"\7A\2\2\u04a5\u04a6\7\u0102\2\2\u04a6\u051b\7\u00eb\2\2\u04a7\u04a8\7"+
		"\u0102\2\2\u04a8\u051b\7A\2\2\u04a9\u04aa\78\2\2\u04aa\u04ab\7\u00ef\2"+
		"\2\u04ab\u051b\7\u0096\2\2\u04ac\u04ad\7Q\2\2\u04ad\u04ae\7\u00ef\2\2"+
		"\u04ae\u051b\7\u0096\2\2\u04af\u04b0\7\21\2\2\u04b0\u04b1\7\u00eb\2\2"+
		"\u04b1\u04b2\5\u00b0Y\2\u04b2\u04b3\7\u009f\2\2\u04b3\u04b4\7)\2\2\u04b4"+
		"\u051b\3\2\2\2\u04b5\u04b6\7\21\2\2\u04b6\u04b7\7\u00eb\2\2\u04b7\u04b8"+
		"\5\u00b0Y\2\u04b8\u04b9\7)\2\2\u04b9\u04ba\7 \2\2\u04ba\u051b\3\2\2\2"+
		"\u04bb\u04bc\7\21\2\2\u04bc\u04bd\7\u00eb\2\2\u04bd\u04be\5\u00b0Y\2\u04be"+
		"\u04bf\7\u009f\2\2\u04bf\u04c0\7\u00e3\2\2\u04c0\u051b\3\2\2\2\u04c1\u04c2"+
		"\7\21\2\2\u04c2\u04c3\7\u00eb\2\2\u04c3\u04c4\5\u00b0Y\2\u04c4\u04c5\7"+
		"\u00e0\2\2\u04c5\u04c6\7 \2\2\u04c6\u051b\3\2\2\2\u04c7\u04c8\7\21\2\2"+
		"\u04c8\u04c9\7\u00eb\2\2\u04c9\u04ca\5\u00b0Y\2\u04ca\u04cb\7\u009f\2"+
		"\2\u04cb\u04cc\7\u00e0\2\2\u04cc\u051b\3\2\2\2\u04cd\u04ce\7\21\2\2\u04ce"+
		"\u04cf\7\u00eb\2\2\u04cf\u04d0\5\u00b0Y\2\u04d0\u04d1\7\u009f\2\2\u04d1"+
		"\u04d2\7\u00e6\2\2\u04d2\u04d3\7\30\2\2\u04d3\u04d4\7L\2\2\u04d4\u051b"+
		"\3\2\2\2\u04d5\u04d6\7\21\2\2\u04d6\u04d7\7\u00eb\2\2\u04d7\u04d8\5\u00b0"+
		"Y\2\u04d8\u04d9\7\u00dc\2\2\u04d9\u04da\7\u00e0\2\2\u04da\u04db\7\u0092"+
		"\2\2\u04db\u051b\3\2\2\2\u04dc\u04dd\7\21\2\2\u04dd\u04de\7\u00eb\2\2"+
		"\u04de\u04df\5\u00b0Y\2\u04df\u04e0\7X\2\2\u04e0\u04e1\7\u00b0\2\2\u04e1"+
		"\u051b\3\2\2\2\u04e2\u04e3\7\21\2\2\u04e3\u04e4\7\u00eb\2\2\u04e4\u04e5"+
		"\5\u00b0Y\2\u04e5\u04e6\7\26\2\2\u04e6\u04e7\7\u00b0\2\2\u04e7\u051b\3"+
		"\2\2\2\u04e8\u04e9\7\21\2\2\u04e9\u04ea\7\u00eb\2\2\u04ea\u04eb\5\u00b0"+
		"Y\2\u04eb\u04ec\7\u00fc\2\2\u04ec\u04ed\7\u00b0\2\2\u04ed\u051b\3\2\2"+
		"\2\u04ee\u04ef\7\21\2\2\u04ef\u04f0\7\u00eb\2\2\u04f0\u04f1\5\u00b0Y\2"+
		"\u04f1\u04f2\7\u00f3\2\2\u04f2\u051b\3\2\2\2\u04f3\u04f4\7\21\2\2\u04f4"+
		"\u04f5\7\u00eb\2\2\u04f5\u04f7\5\u00b0Y\2\u04f6\u04f8\5(\25\2\u04f7\u04f6"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\7\61\2\2"+
		"\u04fa\u051b\3\2\2\2\u04fb\u04fc\7\21\2\2\u04fc\u04fd\7\u00eb\2\2\u04fd"+
		"\u04ff\5\u00b0Y\2\u04fe\u0500\5(\25\2\u04ff\u04fe\3\2\2\2\u04ff\u0500"+
		"\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7\64\2\2\u0502\u051b\3\2\2\2"+
		"\u0503\u0504\7\21\2\2\u0504\u0505\7\u00eb\2\2\u0505\u0507\5\u00b0Y\2\u0506"+
		"\u0508\5(\25\2\u0507\u0506\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509\u050a\7\u00dc\2\2\u050a\u050b\7c\2\2\u050b\u051b\3\2\2\2\u050c"+
		"\u050d\7\21\2\2\u050d\u050e\7\u00eb\2\2\u050e\u0510\5\u00b0Y\2\u050f\u0511"+
		"\5(\25\2\u0510\u050f\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0513\7\u00c7\2\2\u0513\u0514\7.\2\2\u0514\u051b\3\2\2\2\u0515\u0516"+
		"\7\u00e4\2\2\u0516\u051b\7\u00f5\2\2\u0517\u051b\7\60\2\2\u0518\u051b"+
		"\7\u00d0\2\2\u0519\u051b\7K\2\2\u051a\u0472\3\2\2\2\u051a\u0474\3\2\2"+
		"\2\u051a\u0476\3\2\2\2\u051a\u047a\3\2\2\2\u051a\u047e\3\2\2\2\u051a\u0480"+
		"\3\2\2\2\u051a\u0485\3\2\2\2\u051a\u0487\3\2\2\2\u051a\u0489\3\2\2\2\u051a"+
		"\u048c\3\2\2\2\u051a\u048e\3\2\2\2\u051a\u0490\3\2\2\2\u051a\u0492\3\2"+
		"\2\2\u051a\u0495\3\2\2\2\u051a\u0497\3\2\2\2\u051a\u0499\3\2\2\2\u051a"+
		"\u049b\3\2\2\2\u051a\u049d\3\2\2\2\u051a\u049f\3\2\2\2\u051a\u04a1\3\2"+
		"\2\2\u051a\u04a3\3\2\2\2\u051a\u04a5\3\2\2\2\u051a\u04a7\3\2\2\2\u051a"+
		"\u04a9\3\2\2\2\u051a\u04ac\3\2\2\2\u051a\u04af\3\2\2\2\u051a\u04b5\3\2"+
		"\2\2\u051a\u04bb\3\2\2\2\u051a\u04c1\3\2\2\2\u051a\u04c7\3\2\2\2\u051a"+
		"\u04cd\3\2\2\2\u051a\u04d5\3\2\2\2\u051a\u04dc\3\2\2\2\u051a\u04e2\3\2"+
		"\2\2\u051a\u04e8\3\2\2\2\u051a\u04ee\3\2\2\2\u051a\u04f3\3\2\2\2\u051a"+
		"\u04fb\3\2\2\2\u051a\u0503\3\2\2\2\u051a\u050c\3\2\2\2\u051a\u0515\3\2"+
		"\2\2\u051a\u0517\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u0519\3\2\2\2\u051b"+
		"\25\3\2\2\2\u051c\u051e\78\2\2\u051d\u051f\7\u00ef\2\2\u051e\u051d\3\2"+
		"\2\2\u051e\u051f\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u0522\7]\2\2\u0521"+
		"\u0520\3\2\2\2\u0521\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0527\7\u00eb"+
		"\2\2\u0524\u0525\7u\2\2\u0525\u0526\7\u009f\2\2\u0526\u0528\7Y\2\2\u0527"+
		"\u0524\3\2\2\2\u0527\u0528\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u052a\5\u00ae"+
		"X\2\u052a\27\3\2\2\2\u052b\u052c\78\2\2\u052c\u052e\7\u00a7\2\2\u052d"+
		"\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530\7\u00c7"+
		"\2\2\u0530\u0531\7\u00eb\2\2\u0531\u0532\5\u00aeX\2\u0532\31\3\2\2\2\u0533"+
		"\u0534\7)\2\2\u0534\u0535\7 \2\2\u0535\u0539\5\u0096L\2\u0536\u0537\7"+
		"\u00e3\2\2\u0537\u0538\7 \2\2\u0538\u053a\5\u009aN\2\u0539\u0536\3\2\2"+
		"\2\u0539\u053a\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053c\7\u0081\2\2\u053c"+
		"\u053d\7\u012f\2\2\u053d\u053e\7\37\2\2\u053e\33\3\2\2\2\u053f\u0540\7"+
		"\u00e0\2\2\u0540\u0541\7 \2\2\u0541\u0542\5\u0096L\2\u0542\u0545\7\u00a3"+
		"\2\2\u0543\u0546\5B\"\2\u0544\u0546\5D#\2\u0545\u0543\3\2\2\2\u0545\u0544"+
		"\3\2\2\2\u0546\u054a\3\2\2\2\u0547\u0548\7\u00e6\2\2\u0548\u0549\7\30"+
		"\2\2\u0549\u054b\7L\2\2\u054a\u0547\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\35\3\2\2\2\u054c\u054d\7\u0092\2\2\u054d\u054e\7\u012b\2\2\u054e\37\3"+
		"\2\2\2\u054f\u0550\7/\2\2\u0550\u0551\7\u012b\2\2\u0551!\3\2\2\2\u0552"+
		"\u0554\5\62\32\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\3"+
		"\2\2\2\u0555\u0556\5T+\2\u0556\u0557\5P)\2\u0557#\3\2\2\2\u0558\u0559"+
		"\7~\2\2\u0559\u055b\7\u00af\2\2\u055a\u055c\7\u00eb\2\2\u055b\u055a\3"+
		"\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u0564\5\u00aeX\2"+
		"\u055e\u0562\5(\25\2\u055f\u0560\7u\2\2\u0560\u0561\7\u009f\2\2\u0561"+
		"\u0563\7Y\2\2\u0562\u055f\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2"+
		"\2\2\u0564\u055e\3\2\2\2\u0564\u0565\3\2\2\2\u0565\u0590\3\2\2\2\u0566"+
		"\u0567\7~\2\2\u0567\u0569\7\u0081\2\2\u0568\u056a\7\u00eb\2\2\u0569\u0568"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\5\u00aeX"+
		"\2\u056c\u056e\5(\25\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u0572"+
		"\3\2\2\2\u056f\u0570\7u\2\2\u0570\u0571\7\u009f\2\2\u0571\u0573\7Y\2\2"+
		"\u0572\u056f\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0590\3\2\2\2\u0574\u0575"+
		"\7~\2\2\u0575\u0577\7\u00af\2\2\u0576\u0578\7\u0091\2\2\u0577\u0576\3"+
		"\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\7M\2\2\u057a"+
		"\u057c\7\u012b\2\2\u057b\u057d\5\u00aaV\2\u057c\u057b\3\2\2\2\u057c\u057d"+
		"\3\2\2\2\u057d\u057f\3\2\2\2\u057e\u0580\5F$\2\u057f\u057e\3\2\2\2\u057f"+
		"\u0580\3\2\2\2\u0580\u0590\3\2\2\2\u0581\u0582\7~\2\2\u0582\u0584\7\u00af"+
		"\2\2\u0583\u0585\7\u0091\2\2\u0584\u0583\3\2\2\2\u0584\u0585\3\2\2\2\u0585"+
		"\u0586\3\2\2\2\u0586\u0588\7M\2\2\u0587\u0589\7\u012b\2\2\u0588\u0587"+
		"\3\2\2\2\u0588\u0589\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058d\5\66\34\2"+
		"\u058b\u058c\7\u00a6\2\2\u058c\u058e\5:\36\2\u058d\u058b\3\2\2\2\u058d"+
		"\u058e\3\2\2\2\u058e\u0590\3\2\2\2\u058f\u0558\3\2\2\2\u058f\u0566\3\2"+
		"\2\2\u058f\u0574\3\2\2\2\u058f\u0581\3\2\2\2\u0590%\3\2\2\2\u0591\u0593"+
		"\5(\25\2\u0592\u0594\5\36\20\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2\2\2"+
		"\u0594\'\3\2\2\2\u0595\u0596\7\u00b0\2\2\u0596\u0597\7\4\2\2\u0597\u059c"+
		"\5*\26\2\u0598\u0599\7\6\2\2\u0599\u059b\5*\26\2\u059a\u0598\3\2\2\2\u059b"+
		"\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d\u059f\3\2"+
		"\2\2\u059e\u059c\3\2\2\2\u059f\u05a0\7\5\2\2\u05a0)\3\2\2\2\u05a1\u05a4"+
		"\5\u0104\u0083\2\u05a2\u05a3\7\u0119\2\2\u05a3\u05a5\5\u00c8e\2\u05a4"+
		"\u05a2\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5+\3\2\2\2\u05a6\u05a7\t\17\2\2"+
		"\u05a7-\3\2\2\2\u05a8\u05ae\5\u00fe\u0080\2\u05a9\u05ae\7\u012b\2\2\u05aa"+
		"\u05ae\5\u00caf\2\u05ab\u05ae\5\u00ccg\2\u05ac\u05ae\5\u00ceh\2\u05ad"+
		"\u05a8\3\2\2\2\u05ad\u05a9\3\2\2\2\u05ad\u05aa\3\2\2\2\u05ad\u05ab\3\2"+
		"\2\2\u05ad\u05ac\3\2\2\2\u05ae/\3\2\2\2\u05af\u05b4\5\u0104\u0083\2\u05b0"+
		"\u05b1\7\7\2\2\u05b1\u05b3\5\u0104\u0083\2\u05b2\u05b0\3\2\2\2\u05b3\u05b6"+
		"\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5\61\3\2\2\2\u05b6"+
		"\u05b4\3\2\2\2\u05b7\u05b8\7\u010f\2\2\u05b8\u05bd\5\64\33\2\u05b9\u05ba"+
		"\7\6\2\2\u05ba\u05bc\5\64\33\2\u05bb\u05b9\3\2\2\2\u05bc\u05bf\3\2\2\2"+
		"\u05bd\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\63\3\2\2\2\u05bf\u05bd"+
		"\3\2\2\2\u05c0\u05c2\5\u0100\u0081\2\u05c1\u05c3\5\u0096L\2\u05c2\u05c1"+
		"\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05c6\7\30\2\2"+
		"\u05c5\u05c4\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8"+
		"\7\4\2\2\u05c8\u05c9\5\"\22\2\u05c9\u05ca\7\5\2\2\u05ca\65\3\2\2\2\u05cb"+
		"\u05cc\7\u0107\2\2\u05cc\u05cd\5\u00aeX\2\u05cd\67\3\2\2\2\u05ce\u05cf"+
		"\7\u00a6\2\2\u05cf\u05db\5:\36\2\u05d0\u05d1\7\u00b1\2\2\u05d1\u05d2\7"+
		" \2\2\u05d2\u05db\5\u00b8]\2\u05d3\u05db\5\32\16\2\u05d4\u05db\5\36\20"+
		"\2\u05d5\u05db\5 \21\2\u05d6\u05d7\7\u008f\2\2\u05d7\u05db\7\u012f\2\2"+
		"\u05d8\u05d9\7\u00ee\2\2\u05d9\u05db\5:\36\2\u05da\u05ce\3\2\2\2\u05da"+
		"\u05d0\3\2\2\2\u05da\u05d3\3\2\2\2\u05da\u05d4\3\2\2\2\u05da\u05d5\3\2"+
		"\2\2\u05da\u05d6\3\2\2\2\u05da\u05d8\3\2\2\2\u05db\u05de\3\2\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd9\3\2\2\2\u05de\u05dc\3\2\2\2"+
		"\u05df\u05e0\7\4\2\2\u05e0\u05e5\5<\37\2\u05e1\u05e2\7\6\2\2\u05e2\u05e4"+
		"\5<\37\2\u05e3\u05e1\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e5"+
		"\u05e6\3\2\2\2\u05e6\u05e8\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e8\u05e9\7\5"+
		"\2\2\u05e9;\3\2\2\2\u05ea\u05ef\5> \2\u05eb\u05ed\7\u0119\2\2\u05ec\u05eb"+
		"\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0\5@!\2\u05ef"+
		"\u05ec\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0=\3\2\2\2\u05f1\u05f6\5\u0104"+
		"\u0083\2\u05f2\u05f3\7\7\2\2\u05f3\u05f5\5\u0104\u0083\2\u05f4\u05f2\3"+
		"\2\2\2\u05f5\u05f8\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05fb\3\2\2\2\u05f8\u05f6\3\2\2\2\u05f9\u05fb\7\u012b\2\2\u05fa\u05f1"+
		"\3\2\2\2\u05fa\u05f9\3\2\2\2\u05fb?\3\2\2\2\u05fc\u0601\7\u012f\2\2\u05fd"+
		"\u0601\7\u0131\2\2\u05fe\u0601\5\u00d0i\2\u05ff\u0601\7\u012b\2\2\u0600"+
		"\u05fc\3\2\2\2\u0600\u05fd\3\2\2\2\u0600\u05fe\3\2\2\2\u0600\u05ff\3\2"+
		"\2\2\u0601A\3\2\2\2\u0602\u0603\7\4\2\2\u0603\u0608\5\u00c8e\2\u0604\u0605"+
		"\7\6\2\2\u0605\u0607\5\u00c8e\2\u0606\u0604\3\2\2\2\u0607\u060a\3\2\2"+
		"\2\u0608\u0606\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u0608"+
		"\3\2\2\2\u060b\u060c\7\5\2\2\u060cC\3\2\2\2\u060d\u060e\7\4\2\2\u060e"+
		"\u0613\5B\"\2\u060f\u0610\7\6\2\2\u0610\u0612\5B\"\2\u0611\u060f\3\2\2"+
		"\2\u0612\u0615\3\2\2\2\u0613\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u0616"+
		"\3\2\2\2\u0615\u0613\3\2\2\2\u0616\u0617\7\5\2\2\u0617E\3\2\2\2\u0618"+
		"\u0619\7\u00e6\2\2\u0619\u061a\7\30\2\2\u061a\u061f\5H%\2\u061b\u061c"+
		"\7\u00e6\2\2\u061c\u061d\7 \2\2\u061d\u061f\5J&\2\u061e\u0618\3\2\2\2"+
		"\u061e\u061b\3\2\2\2\u061fG\3\2\2\2\u0620\u0621\7}\2\2\u0621\u0622\7\u012b"+
		"\2\2\u0622\u0623\7\u00ab\2\2\u0623\u0626\7\u012b\2\2\u0624\u0626\5\u0104"+
		"\u0083\2\u0625\u0620\3\2\2\2\u0625\u0624\3\2\2\2\u0626I\3\2\2\2\u0627"+
		"\u062b\7\u012b\2\2\u0628\u0629\7\u010f\2\2\u0629\u062a\7\u00da\2\2\u062a"+
		"\u062c\5:\36\2\u062b\u0628\3\2\2\2\u062b\u062c\3\2\2\2\u062cK\3\2\2\2"+
		"\u062d\u062e\5\u0104\u0083\2\u062e\u062f\7\u012b\2\2\u062fM\3\2\2\2\u0630"+
		"\u0631\5$\23\2\u0631\u0632\5T+\2\u0632\u0633\5P)\2\u0633\u0664\3\2\2\2"+
		"\u0634\u0636\5z>\2\u0635\u0637\5R*\2\u0636\u0635\3\2\2\2\u0637\u0638\3"+
		"\2\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u0664\3\2\2\2\u063a"+
		"\u063b\7E\2\2\u063b\u063c\7j\2\2\u063c\u063d\5\u00aeX\2\u063d\u063f\5"+
		"\u00a8U\2\u063e\u0640\5r:\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640"+
		"\u0664\3\2\2\2\u0641\u0642\7\u0104\2\2\u0642\u0643\5\u00aeX\2\u0643\u0644"+
		"\5\u00a8U\2\u0644\u0646\5d\63\2\u0645\u0647\5r:\2\u0646\u0645\3\2\2\2"+
		"\u0646\u0647\3\2\2\2\u0647\u0664\3\2\2\2\u0648\u0649\7\u0099\2\2\u0649"+
		"\u064a\7\u0081\2\2\u064a\u064b\5\u00aeX\2\u064b\u064c\5\u00a8U\2\u064c"+
		"\u0652\7\u0107\2\2\u064d\u0653\5\u00aeX\2\u064e\u064f\7\4\2\2\u064f\u0650"+
		"\5\"\22\2\u0650\u0651\7\5\2\2\u0651\u0653\3\2\2\2\u0652\u064d\3\2\2\2"+
		"\u0652\u064e\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655\5\u00a8U\2\u0655"+
		"\u0656\7\u00a3\2\2\u0656\u065a\5\u00c0a\2\u0657\u0659\5f\64\2\u0658\u0657"+
		"\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u0660\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065f\5h\65\2\u065e\u065d\3\2"+
		"\2\2\u065f\u0662\3\2\2\2\u0660\u065e\3\2\2\2\u0660\u0661\3\2\2\2\u0661"+
		"\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0663\u0630\3\2\2\2\u0663\u0634\3\2"+
		"\2\2\u0663\u063a\3\2\2\2\u0663\u0641\3\2\2\2\u0663\u0648\3\2\2\2\u0664"+
		"O\3\2\2\2\u0665\u0666\7\u00a8\2\2\u0666\u0667\7 \2\2\u0667\u066c\5X-\2"+
		"\u0668\u0669\7\6\2\2\u0669\u066b\5X-\2\u066a\u0668\3\2\2\2\u066b\u066e"+
		"\3\2\2\2\u066c\u066a\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u0670\3\2\2\2\u066e"+
		"\u066c\3\2\2\2\u066f\u0665\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u067b\3\2"+
		"\2\2\u0671\u0672\7(\2\2\u0672\u0673\7 \2\2\u0673\u0678\5\u00be`\2\u0674"+
		"\u0675\7\6\2\2\u0675\u0677\5\u00be`\2\u0676\u0674\3\2\2\2\u0677\u067a"+
		"\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067c\3\2\2\2\u067a"+
		"\u0678\3\2\2\2\u067b\u0671\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u0687\3\2"+
		"\2\2\u067d\u067e\7O\2\2\u067e\u067f\7 \2\2\u067f\u0684\5\u00be`\2\u0680"+
		"\u0681\7\6\2\2\u0681\u0683\5\u00be`\2\u0682\u0680\3\2\2\2\u0683\u0686"+
		"\3\2\2\2\u0684\u0682\3\2\2\2\u0684\u0685\3\2\2\2\u0685\u0688\3\2\2\2\u0686"+
		"\u0684\3\2\2\2\u0687\u067d\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0693\3\2"+
		"\2\2\u0689\u068a\7\u00e2\2\2\u068a\u068b\7 \2\2\u068b\u0690\5X-\2\u068c"+
		"\u068d\7\6\2\2\u068d\u068f\5X-\2\u068e\u068c\3\2\2\2\u068f\u0692\3\2\2"+
		"\2\u0690\u068e\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690"+
		"\3\2\2\2\u0693\u0689\3\2\2\2\u0693\u0694\3\2\2\2\u0694\u0696\3\2\2\2\u0695"+
		"\u0697\5\u00f0y\2\u0696\u0695\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u069d"+
		"\3\2\2\2\u0698\u069b\7\u008c\2\2\u0699\u069c\7\20\2\2\u069a\u069c\5\u00be"+
		"`\2\u069b\u0699\3\2\2\2\u069b\u069a\3\2\2\2\u069c\u069e\3\2\2\2\u069d"+
		"\u0698\3\2\2\2\u069d\u069e\3\2\2\2\u069eQ\3\2\2\2\u069f\u06a0\5$\23\2"+
		"\u06a0\u06a1\5\\/\2\u06a1S\3\2\2\2\u06a2\u06a3\b+\1\2\u06a3\u06a4\5V,"+
		"\2\u06a4\u06bc\3\2\2\2\u06a5\u06a6\f\5\2\2\u06a6\u06a7\6+\5\2\u06a7\u06a9"+
		"\t\20\2\2\u06a8\u06aa\5\u0088E\2\u06a9\u06a8\3\2\2\2\u06a9\u06aa\3\2\2"+
		"\2\u06aa\u06ab\3\2\2\2\u06ab\u06bb\5T+\6\u06ac\u06ad\f\4\2\2\u06ad\u06ae"+
		"\6+\7\2\u06ae\u06b0\7\177\2\2\u06af\u06b1\5\u0088E\2\u06b0\u06af\3\2\2"+
		"\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06bb\5T+\5\u06b3\u06b4"+
		"\f\3\2\2\u06b4\u06b5\6+\t\2\u06b5\u06b7\t\21\2\2\u06b6\u06b8\5\u0088E"+
		"\2\u06b7\u06b6\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb"+
		"\5T+\4\u06ba\u06a5\3\2\2\2\u06ba\u06ac\3\2\2\2\u06ba\u06b3\3\2\2\2\u06bb"+
		"\u06be\3\2\2\2\u06bc\u06ba\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bdU\3\2\2\2"+
		"\u06be\u06bc\3\2\2\2\u06bf\u06c9\5^\60\2\u06c0\u06c9\5Z.\2\u06c1\u06c2"+
		"\7\u00eb\2\2\u06c2\u06c9\5\u00aeX\2\u06c3\u06c9\5\u00a4S\2\u06c4\u06c5"+
		"\7\4\2\2\u06c5\u06c6\5\"\22\2\u06c6\u06c7\7\5\2\2\u06c7\u06c9\3\2\2\2"+
		"\u06c8\u06bf\3\2\2\2\u06c8\u06c0\3\2\2\2\u06c8\u06c1\3\2\2\2\u06c8\u06c3"+
		"\3\2\2\2\u06c8\u06c4\3\2\2\2\u06c9W\3\2\2\2\u06ca\u06cc\5\u00be`\2\u06cb"+
		"\u06cd\t\22\2\2\u06cc\u06cb\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06d0\3"+
		"\2\2\2\u06ce\u06cf\7\u00a1\2\2\u06cf\u06d1\t\23\2\2\u06d0\u06ce\3\2\2"+
		"\2\u06d0\u06d1\3\2\2\2\u06d1Y\3\2\2\2\u06d2\u06d4\5z>\2\u06d3\u06d5\5"+
		"\\/\2\u06d4\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d4\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7[\3\2\2\2\u06d8\u06da\5`\61\2\u06d9\u06db\5r:\2\u06da"+
		"\u06d9\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\5P"+
		")\2\u06dd\u06f4\3\2\2\2\u06de\u06e2\5b\62\2\u06df\u06e1\5\u0086D\2\u06e0"+
		"\u06df\3\2\2\2\u06e1\u06e4\3\2\2\2\u06e2\u06e0\3\2\2\2\u06e2\u06e3\3\2"+
		"\2\2\u06e3\u06e6\3\2\2\2\u06e4\u06e2\3\2\2\2\u06e5\u06e7\5r:\2\u06e6\u06e5"+
		"\3\2\2\2\u06e6\u06e7\3\2\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06ea\5|?\2\u06e9"+
		"\u06e8\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ec\3\2\2\2\u06eb\u06ed\5t"+
		";\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ef\3\2\2\2\u06ee"+
		"\u06f0\5\u00f0y\2\u06ef\u06ee\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0\u06f1"+
		"\3\2\2\2\u06f1\u06f2\5P)\2\u06f2\u06f4\3\2\2\2\u06f3\u06d8\3\2\2\2\u06f3"+
		"\u06de\3\2\2\2\u06f4]\3\2\2\2\u06f5\u06f7\5`\61\2\u06f6\u06f8\5z>\2\u06f7"+
		"\u06f6\3\2\2\2\u06f7\u06f8\3\2\2\2\u06f8\u06fa\3\2\2\2\u06f9\u06fb\5r"+
		":\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u0713\3\2\2\2\u06fc"+
		"\u06fe\5b\62\2\u06fd\u06ff\5z>\2\u06fe\u06fd\3\2\2\2\u06fe\u06ff\3\2\2"+
		"\2\u06ff\u0703\3\2\2\2\u0700\u0702\5\u0086D\2\u0701\u0700\3\2\2\2\u0702"+
		"\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704\u0707\3\2"+
		"\2\2\u0705\u0703\3\2\2\2\u0706\u0708\5r:\2\u0707\u0706\3\2\2\2\u0707\u0708"+
		"\3\2\2\2\u0708\u070a\3\2\2\2\u0709\u070b\5|?\2\u070a\u0709\3\2\2\2\u070a"+
		"\u070b\3\2\2\2\u070b\u070d\3\2\2\2\u070c\u070e\5t;\2\u070d\u070c\3\2\2"+
		"\2\u070d\u070e\3\2\2\2\u070e\u0710\3\2\2\2\u070f\u0711\5\u00f0y\2\u0710"+
		"\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0713\3\2\2\2\u0712\u06f5\3\2"+
		"\2\2\u0712\u06fc\3\2\2\2\u0713_\3\2\2\2\u0714\u0715\7\u00d6\2\2\u0715"+
		"\u0716\7\u00f7\2\2\u0716\u0717\7\4\2\2\u0717\u0718\5\u00b6\\\2\u0718\u0719"+
		"\7\5\2\2\u0719\u071f\3\2\2\2\u071a\u071b\7\u0097\2\2\u071b\u071f\5\u00b6"+
		"\\\2\u071c\u071d\7\u00c2\2\2\u071d\u071f\5\u00b6\\\2\u071e\u0714\3\2\2"+
		"\2\u071e\u071a\3\2\2\2\u071e\u071c\3\2\2\2\u071f\u0721\3\2\2\2\u0720\u0722"+
		"\5\u00aaV\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0725\3\2\2"+
		"\2\u0723\u0724\7\u00c0\2\2\u0724\u0726\7\u012b\2\2\u0725\u0723\3\2\2\2"+
		"\u0725\u0726\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u0728\7\u0107\2\2\u0728"+
		"\u0735\7\u012b\2\2\u0729\u0733\7\30\2\2\u072a\u0734\5\u0098M\2\u072b\u0734"+
		"\5\u00e6t\2\u072c\u072f\7\4\2\2\u072d\u0730\5\u0098M\2\u072e\u0730\5\u00e6"+
		"t\2\u072f\u072d\3\2\2\2\u072f\u072e\3\2\2\2\u0730\u0731\3\2\2\2\u0731"+
		"\u0732\7\5\2\2\u0732\u0734\3\2\2\2\u0733\u072a\3\2\2\2\u0733\u072b\3\2"+
		"\2\2\u0733\u072c\3\2\2\2\u0734\u0736\3\2\2\2\u0735\u0729\3\2\2\2\u0735"+
		"\u0736\3\2\2\2\u0736\u0738\3\2\2\2\u0737\u0739\5\u00aaV\2\u0738\u0737"+
		"\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073c\3\2\2\2\u073a\u073b\7\u00bf\2"+
		"\2\u073b\u073d\7\u012b\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d"+
		"a\3\2\2\2\u073e\u0742\7\u00d6\2\2\u073f\u0741\5v<\2\u0740\u073f\3\2\2"+
		"\2\u0741\u0744\3\2\2\2\u0742\u0740\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0746"+
		"\3\2\2\2\u0744\u0742\3\2\2\2\u0745\u0747\5\u0088E\2\u0746\u0745\3\2\2"+
		"\2\u0746\u0747\3\2\2\2\u0747\u0748\3\2\2\2\u0748\u0749\5\u00b6\\\2\u0749"+
		"c\3\2\2\2\u074a\u074b\7\u00dc\2\2\u074b\u074c\5n8\2\u074ce\3\2\2\2\u074d"+
		"\u074e\7\u010c\2\2\u074e\u0751\7\u0098\2\2\u074f\u0750\7\23\2\2\u0750"+
		"\u0752\5\u00c0a\2\u0751\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0753"+
		"\3\2\2\2\u0753\u0754\7\u00f1\2\2\u0754\u0755\5j\66\2\u0755g\3\2\2\2\u0756"+
		"\u0757\7\u010c\2\2\u0757\u0758\7\u009f\2\2\u0758\u075b\7\u0098\2\2\u0759"+
		"\u075a\7\23\2\2\u075a\u075c\5\u00c0a\2\u075b\u0759\3\2\2\2\u075b\u075c"+
		"\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\7\u00f1\2\2\u075e\u075f\5l\67"+
		"\2\u075fi\3\2\2\2\u0760\u0768\7E\2\2\u0761\u0762\7\u0104\2\2\u0762\u0763"+
		"\7\u00dc\2\2\u0763\u0768\7\u0123\2\2\u0764\u0765\7\u0104\2\2\u0765\u0766"+
		"\7\u00dc\2\2\u0766\u0768\5n8\2\u0767\u0760\3\2\2\2\u0767\u0761\3\2\2\2"+
		"\u0767\u0764\3\2\2\2\u0768k\3\2\2\2\u0769\u076a\7~\2\2\u076a\u077c\7\u0123"+
		"\2\2\u076b\u076c\7~\2\2\u076c\u076d\7\4\2\2\u076d\u076e\5\u00acW\2\u076e"+
		"\u076f\7\5\2\2\u076f\u0770\7\u0108\2\2\u0770\u0771\7\4\2\2\u0771\u0776"+
		"\5\u00be`\2\u0772\u0773\7\6\2\2\u0773\u0775\5\u00be`\2\u0774\u0772\3\2"+
		"\2\2\u0775\u0778\3\2\2\2\u0776\u0774\3\2\2\2\u0776\u0777\3\2\2\2\u0777"+
		"\u0779\3\2\2\2\u0778\u0776\3\2\2\2\u0779\u077a\7\5\2\2\u077a\u077c\3\2"+
		"\2\2\u077b\u0769\3\2\2\2\u077b\u076b\3\2\2\2\u077cm\3\2\2\2\u077d\u0782"+
		"\5p9\2\u077e\u077f\7\6\2\2\u077f\u0781\5p9\2\u0780\u077e\3\2\2\2\u0781"+
		"\u0784\3\2\2\2\u0782\u0780\3\2\2\2\u0782\u0783\3\2\2\2\u0783o\3\2\2\2"+
		"\u0784\u0782\3\2\2\2\u0785\u0786\5\u00aeX\2\u0786\u0787\7\u0119\2\2\u0787"+
		"\u0788\5\u00be`\2\u0788q\3\2\2\2\u0789\u078a\7\u010d\2\2\u078a\u078b\5"+
		"\u00c0a\2\u078bs\3\2\2\2\u078c\u078d\7r\2\2\u078d\u078e\5\u00c0a\2\u078e"+
		"u\3\2\2\2\u078f\u0790\7\b\2\2\u0790\u0797\5x=\2\u0791\u0793\7\6\2\2\u0792"+
		"\u0791\3\2\2\2\u0792\u0793\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0796\5x"+
		"=\2\u0795\u0792\3\2\2\2\u0796\u0799\3\2\2\2\u0797\u0795\3\2\2\2\u0797"+
		"\u0798\3\2\2\2\u0798\u079a\3\2\2\2\u0799\u0797\3\2\2\2\u079a\u079b\7\t"+
		"\2\2\u079bw\3\2\2\2\u079c\u07aa\5\u0104\u0083\2\u079d\u079e\5\u0104\u0083"+
		"\2\u079e\u079f\7\4\2\2\u079f\u07a4\5\u00c6d\2\u07a0\u07a1\7\6\2\2\u07a1"+
		"\u07a3\5\u00c6d\2\u07a2\u07a0\3\2\2\2\u07a3\u07a6\3\2\2\2\u07a4\u07a2"+
		"\3\2\2\2\u07a4\u07a5\3\2\2\2\u07a5\u07a7\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a7"+
		"\u07a8\7\5\2\2\u07a8\u07aa\3\2\2\2\u07a9\u079c\3\2\2\2\u07a9\u079d\3\2"+
		"\2\2\u07aay\3\2\2\2\u07ab\u07ac\7j\2\2\u07ac\u07b1\5\u008aF\2\u07ad\u07ae"+
		"\7\6\2\2\u07ae\u07b0\5\u008aF\2\u07af\u07ad\3\2\2\2\u07b0\u07b3\3\2\2"+
		"\2\u07b1\u07af\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b7\3\2\2\2\u07b3\u07b1"+
		"\3\2\2\2\u07b4\u07b6\5\u0086D\2\u07b5\u07b4\3\2\2\2\u07b6\u07b9\3\2\2"+
		"\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7"+
		"\3\2\2\2\u07ba\u07bc\5\u0080A\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc\3\2\2"+
		"\2\u07bc{\3\2\2\2\u07bd\u07be\7p\2\2\u07be\u07bf\7 \2\2\u07bf\u07c4\5"+
		"\u00be`\2\u07c0\u07c1\7\6\2\2\u07c1\u07c3\5\u00be`\2\u07c2\u07c0\3\2\2"+
		"\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07d8"+
		"\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07c8\7\u010f\2\2\u07c8\u07d9\7\u00d1"+
		"\2\2\u07c9\u07ca\7\u010f\2\2\u07ca\u07d9\7:\2\2\u07cb\u07cc\7q\2\2\u07cc"+
		"\u07cd\7\u00de\2\2\u07cd\u07ce\7\4\2\2\u07ce\u07d3\5~@\2\u07cf\u07d0\7"+
		"\6\2\2\u07d0\u07d2\5~@\2\u07d1\u07cf\3\2\2\2\u07d2\u07d5\3\2\2\2\u07d3"+
		"\u07d1\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d6\3\2\2\2\u07d5\u07d3\3\2"+
		"\2\2\u07d6\u07d7\7\5\2\2\u07d7\u07d9\3\2\2\2\u07d8\u07c7\3\2\2\2\u07d8"+
		"\u07c9\3\2\2\2\u07d8\u07cb\3\2\2\2\u07d8\u07d9\3\2\2\2\u07d9\u07ea\3\2"+
		"\2\2\u07da\u07db\7p\2\2\u07db\u07dc\7 \2\2\u07dc\u07dd\7q\2\2\u07dd\u07de"+
		"\7\u00de\2\2\u07de\u07df\7\4\2\2\u07df\u07e4\5~@\2\u07e0\u07e1\7\6\2\2"+
		"\u07e1\u07e3\5~@\2\u07e2\u07e0\3\2\2\2\u07e3\u07e6\3\2\2\2\u07e4\u07e2"+
		"\3\2\2\2\u07e4\u07e5\3\2\2\2\u07e5\u07e7\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e7"+
		"\u07e8\7\5\2\2\u07e8\u07ea\3\2\2\2\u07e9\u07bd\3\2\2\2\u07e9\u07da\3\2"+
		"\2\2\u07ea}\3\2\2\2\u07eb\u07f4\7\4\2\2\u07ec\u07f1\5\u00be`\2\u07ed\u07ee"+
		"\7\6\2\2\u07ee\u07f0\5\u00be`\2\u07ef\u07ed\3\2\2\2\u07f0\u07f3\3\2\2"+
		"\2\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1"+
		"\3\2\2\2\u07f4\u07ec\3\2\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6"+
		"\u07f9\7\5\2\2\u07f7\u07f9\5\u00be`\2\u07f8\u07eb\3\2\2\2\u07f8\u07f7"+
		"\3\2\2\2\u07f9\177\3\2\2\2\u07fa\u07fb\7\u00b5\2\2\u07fb\u07fc\7\4\2\2"+
		"\u07fc\u07fd\5\u00b6\\\2\u07fd\u07fe\7f\2\2\u07fe\u07ff\5\u0082B\2\u07ff"+
		"\u0800\7x\2\2\u0800\u0801\7\4\2\2\u0801\u0806\5\u0084C\2\u0802\u0803\7"+
		"\6\2\2\u0803\u0805\5\u0084C\2\u0804\u0802\3\2\2\2\u0805\u0808\3\2\2\2"+
		"\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0809\3\2\2\2\u0808\u0806"+
		"\3\2\2\2\u0809\u080a\7\5\2\2\u080a\u080b\7\5\2\2\u080b\u0081\3\2\2\2\u080c"+
		"\u0819\5\u0104\u0083\2\u080d\u080e\7\4\2\2\u080e\u0813\5\u0104\u0083\2"+
		"\u080f\u0810\7\6\2\2\u0810\u0812\5\u0104\u0083\2\u0811\u080f\3\2\2\2\u0812"+
		"\u0815\3\2\2\2\u0813\u0811\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0816\3\2"+
		"\2\2\u0815\u0813\3\2\2\2\u0816\u0817\7\5\2\2\u0817\u0819\3\2\2\2\u0818"+
		"\u080c\3\2\2\2\u0818\u080d\3\2\2\2\u0819\u0083\3\2\2\2\u081a\u081f\5\u00be"+
		"`\2\u081b\u081d\7\30\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d"+
		"\u081e\3\2\2\2\u081e\u0820\5\u0104\u0083\2\u081f\u081c\3\2\2\2\u081f\u0820"+
		"\3\2\2\2\u0820\u0085\3\2\2\2\u0821\u0822\7\u0087\2\2\u0822\u0824\7\u010a"+
		"\2\2\u0823\u0825\7\u00aa\2\2\u0824\u0823\3\2\2\2\u0824\u0825\3\2\2\2\u0825"+
		"\u0826\3\2\2\2\u0826\u0827\5\u00fe\u0080\2\u0827\u0830\7\4\2\2\u0828\u082d"+
		"\5\u00be`\2\u0829\u082a\7\6\2\2\u082a\u082c\5\u00be`\2\u082b\u0829\3\2"+
		"\2\2\u082c\u082f\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082e\3\2\2\2\u082e"+
		"\u0831\3\2\2\2\u082f\u082d\3\2\2\2\u0830\u0828\3\2\2\2\u0830\u0831\3\2"+
		"\2\2\u0831\u0832\3\2\2\2\u0832\u0833\7\5\2\2\u0833\u083f\5\u0104\u0083"+
		"\2\u0834\u0836\7\30\2\2\u0835\u0834\3\2\2\2\u0835\u0836\3\2\2\2\u0836"+
		"\u0837\3\2\2\2\u0837\u083c\5\u0104\u0083\2\u0838\u0839\7\6\2\2\u0839\u083b"+
		"\5\u0104\u0083\2\u083a\u0838\3\2\2\2\u083b\u083e\3\2\2\2\u083c\u083a\3"+
		"\2\2\2\u083c\u083d\3\2\2\2\u083d\u0840\3\2\2\2\u083e\u083c\3\2\2\2\u083f"+
		"\u0835\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0087\3\2\2\2\u0841\u0842\t\24"+
		"\2\2\u0842\u0089\3\2\2\2\u0843\u0847\5\u00a2R\2\u0844\u0846\5\u008cG\2"+
		"\u0845\u0844\3\2\2\2\u0846\u0849\3\2\2\2\u0847\u0845\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u008b\3\2\2\2\u0849\u0847\3\2\2\2\u084a\u084b\5\u008eH"+
		"\2\u084b\u084c\7\u0084\2\2\u084c\u084e\5\u00a2R\2\u084d\u084f\5\u0090"+
		"I\2\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0856\3\2\2\2\u0850"+
		"\u0851\7\u009d\2\2\u0851\u0852\5\u008eH\2\u0852\u0853\7\u0084\2\2\u0853"+
		"\u0854\5\u00a2R\2\u0854\u0856\3\2\2\2\u0855\u084a\3\2\2\2\u0855\u0850"+
		"\3\2\2\2\u0856\u008d\3\2\2\2\u0857\u0859\7{\2\2\u0858\u0857\3\2\2\2\u0858"+
		"\u0859\3\2\2\2\u0859\u0870\3\2\2\2\u085a\u0870\79\2\2\u085b\u085d\7\u008a"+
		"\2\2\u085c\u085e\7\u00aa\2\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e"+
		"\u0870\3\2\2\2\u085f\u0861\7\u008a\2\2\u0860\u085f\3\2\2\2\u0860\u0861"+
		"\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0870\7\u00d7\2\2";
	private static final String _serializedATNSegment1 =
		"\u0863\u0865\7\u00cc\2\2\u0864\u0866\7\u00aa\2\2\u0865\u0864\3\2\2\2\u0865"+
		"\u0866\3\2\2\2\u0866\u0870\3\2\2\2\u0867\u0869\7k\2\2\u0868\u086a\7\u00aa"+
		"\2\2\u0869\u0868\3\2\2\2\u0869\u086a\3\2\2\2\u086a\u0870\3\2\2\2\u086b"+
		"\u086d\7\u008a\2\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086e"+
		"\3\2\2\2\u086e\u0870\7\24\2\2\u086f\u0858\3\2\2\2\u086f\u085a\3\2\2\2"+
		"\u086f\u085b\3\2\2\2\u086f\u0860\3\2\2\2\u086f\u0863\3\2\2\2\u086f\u0867"+
		"\3\2\2\2\u086f\u086c\3\2\2\2\u0870\u008f\3\2\2\2\u0871\u0872\7\u00a3\2"+
		"\2\u0872\u0876\5\u00c0a\2\u0873\u0874\7\u0107\2\2\u0874\u0876\5\u0096"+
		"L\2\u0875\u0871\3\2\2\2\u0875\u0873\3\2\2\2\u0876\u0091\3\2\2\2\u0877"+
		"\u0878\7\u00ed\2\2\u0878\u087a\7\4\2\2\u0879\u087b\5\u0094K\2\u087a\u0879"+
		"\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087c\3\2\2\2\u087c\u087d\7\5\2\2\u087d"+
		"\u0093\3\2\2\2\u087e\u0880\7\u0122\2\2\u087f\u087e\3\2\2\2\u087f\u0880"+
		"\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u0882\t\25\2\2\u0882\u0897\7\u00b4"+
		"\2\2\u0883\u0884\5\u00be`\2\u0884\u0885\7\u00d3\2\2\u0885\u0897\3\2\2"+
		"\2\u0886\u0887\7\36\2\2\u0887\u0888\7\u012f\2\2\u0888\u0889\7\u00a9\2"+
		"\2\u0889\u088a\7\u00a2\2\2\u088a\u0893\7\u012f\2\2\u088b\u0891\7\u00a3"+
		"\2\2\u088c\u0892\5\u0104\u0083\2\u088d\u088e\5\u00fe\u0080\2\u088e\u088f"+
		"\7\4\2\2\u088f\u0890\7\5\2\2\u0890\u0892\3\2\2\2\u0891\u088c\3\2\2\2\u0891"+
		"\u088d\3\2\2\2\u0892\u0894\3\2\2\2\u0893\u088b\3\2\2\2\u0893\u0894\3\2"+
		"\2\2\u0894\u0897\3\2\2\2\u0895\u0897\5\u00be`\2\u0896\u087f\3\2\2\2\u0896"+
		"\u0883\3\2\2\2\u0896\u0886\3\2\2\2\u0896\u0895\3\2\2\2\u0897\u0095\3\2"+
		"\2\2\u0898\u0899\7\4\2\2\u0899\u089a\5\u0098M\2\u089a\u089b\7\5\2\2\u089b"+
		"\u0097\3\2\2\2\u089c\u08a1\5\u0100\u0081\2\u089d\u089e\7\6\2\2\u089e\u08a0"+
		"\5\u0100\u0081\2\u089f\u089d\3\2\2\2\u08a0\u08a3\3\2\2\2\u08a1\u089f\3"+
		"\2\2\2\u08a1\u08a2\3\2\2\2\u08a2\u0099\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a4"+
		"\u08a5\7\4\2\2\u08a5\u08aa\5\u009cO\2\u08a6\u08a7\7\6\2\2\u08a7\u08a9"+
		"\5\u009cO\2\u08a8\u08a6\3\2\2\2\u08a9\u08ac\3\2\2\2\u08aa\u08a8\3\2\2"+
		"\2\u08aa\u08ab\3\2\2\2\u08ab\u08ad\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ad\u08ae"+
		"\7\5\2\2\u08ae\u009b\3\2\2\2\u08af\u08b1\5\u0100\u0081\2\u08b0\u08b2\t"+
		"\22\2\2\u08b1\u08b0\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u009d\3\2\2\2\u08b3"+
		"\u08b4\7\4\2\2\u08b4\u08b9\5\u00a0Q\2\u08b5\u08b6\7\6\2\2\u08b6\u08b8"+
		"\5\u00a0Q\2\u08b7\u08b5\3\2\2\2\u08b8\u08bb\3\2\2\2\u08b9\u08b7\3\2\2"+
		"\2\u08b9\u08ba\3\2\2\2\u08ba\u08bc\3\2\2\2\u08bb\u08b9\3\2\2\2\u08bc\u08bd"+
		"\7\5\2\2\u08bd\u009f\3\2\2\2\u08be\u08c0\5\u0104\u0083\2\u08bf\u08c1\5"+
		" \21\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u00a1\3\2\2\2\u08c2"+
		"\u08c4\5\u00aeX\2\u08c3\u08c5\5\u0092J\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5"+
		"\3\2\2\2\u08c5\u08c6\3\2\2\2\u08c6\u08c7\5\u00a8U\2\u08c7\u08db\3\2\2"+
		"\2\u08c8\u08c9\7\4\2\2\u08c9\u08ca\5\"\22\2\u08ca\u08cc\7\5\2\2\u08cb"+
		"\u08cd\5\u0092J\2\u08cc\u08cb\3\2\2\2\u08cc\u08cd\3\2\2\2\u08cd\u08ce"+
		"\3\2\2\2\u08ce\u08cf\5\u00a8U\2\u08cf\u08db\3\2\2\2\u08d0\u08d1\7\4\2"+
		"\2\u08d1\u08d2\5\u008aF\2\u08d2\u08d4\7\5\2\2\u08d3\u08d5\5\u0092J\2\u08d4"+
		"\u08d3\3\2\2\2\u08d4\u08d5\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\5\u00a8"+
		"U\2\u08d7\u08db\3\2\2\2\u08d8\u08db\5\u00a4S\2\u08d9\u08db\5\u00a6T\2"+
		"\u08da\u08c2\3\2\2\2\u08da\u08c8\3\2\2\2\u08da\u08d0\3\2\2\2\u08da\u08d8"+
		"\3\2\2\2\u08da\u08d9\3\2\2\2\u08db\u00a3\3\2\2\2\u08dc\u08dd\7\u0108\2"+
		"\2\u08dd\u08e2\5\u00be`\2\u08de\u08df\7\6\2\2\u08df\u08e1\5\u00be`\2\u08e0"+
		"\u08de\3\2\2\2\u08e1\u08e4\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2"+
		"\2\2\u08e3\u08e5\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e5\u08e6\5\u00a8U\2\u08e6"+
		"\u00a5\3\2\2\2\u08e7\u08e8\5\u0100\u0081\2\u08e8\u08f1\7\4\2\2\u08e9\u08ee"+
		"\5\u00be`\2\u08ea\u08eb\7\6\2\2\u08eb\u08ed\5\u00be`\2\u08ec\u08ea\3\2"+
		"\2\2\u08ed\u08f0\3\2\2\2\u08ee\u08ec\3\2\2\2\u08ee\u08ef\3\2\2\2\u08ef"+
		"\u08f2\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f1\u08e9\3\2\2\2\u08f1\u08f2\3\2"+
		"\2\2\u08f2\u08f3\3\2\2\2\u08f3\u08f4\7\5\2\2\u08f4\u08f5\5\u00a8U\2\u08f5"+
		"\u00a7\3\2\2\2\u08f6\u08f8\7\30\2\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3"+
		"\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fb\5\u0106\u0084\2\u08fa\u08fc\5\u0096"+
		"L\2\u08fb\u08fa\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fe\3\2\2\2\u08fd"+
		"\u08f7\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u00a9\3\2\2\2\u08ff\u0900\7\u00d2"+
		"\2\2\u0900\u0901\7h\2\2\u0901\u0902\7\u00d9\2\2\u0902\u0906\7\u012b\2"+
		"\2\u0903\u0904\7\u010f\2\2\u0904\u0905\7\u00da\2\2\u0905\u0907\5:\36\2"+
		"\u0906\u0903\3\2\2\2\u0906\u0907\3\2\2\2\u0907\u0931\3\2\2\2\u0908\u0909"+
		"\7\u00d2\2\2\u0909\u090a\7h\2\2\u090a\u0914\7F\2\2\u090b\u090c\7a\2\2"+
		"\u090c\u090d\7\u00f0\2\2\u090d\u090e\7 \2\2\u090e\u0912\7\u012b\2\2\u090f"+
		"\u0910\7V\2\2\u0910\u0911\7 \2\2\u0911\u0913\7\u012b\2\2\u0912\u090f\3"+
		"\2\2\2\u0912\u0913\3\2\2\2\u0913\u0915\3\2\2\2\u0914\u090b\3\2\2\2\u0914"+
		"\u0915\3\2\2\2\u0915\u091b\3\2\2\2\u0916\u0917\7,\2\2\u0917\u0918\7\u0083"+
		"\2\2\u0918\u0919\7\u00f0\2\2\u0919\u091a\7 \2\2\u091a\u091c\7\u012b\2"+
		"\2\u091b\u0916\3\2\2\2\u091b\u091c\3\2\2\2\u091c\u0922\3\2\2\2\u091d\u091e"+
		"\7\u0097\2\2\u091e\u091f\7\u0085\2\2\u091f\u0920\7\u00f0\2\2\u0920\u0921"+
		"\7 \2\2\u0921\u0923\7\u012b\2\2\u0922\u091d\3\2\2\2\u0922\u0923\3\2\2"+
		"\2\u0923\u0928\3\2\2\2\u0924\u0925\7\u008d\2\2\u0925\u0926\7\u00f0\2\2"+
		"\u0926\u0927\7 \2\2\u0927\u0929\7\u012b\2\2\u0928\u0924\3\2\2\2\u0928"+
		"\u0929\3\2\2\2\u0929\u092e\3\2\2\2\u092a\u092b\7\u00a0\2\2\u092b\u092c"+
		"\7D\2\2\u092c\u092d\7\30\2\2\u092d\u092f\7\u012b\2\2\u092e\u092a\3\2\2"+
		"\2\u092e\u092f\3\2\2\2\u092f\u0931\3\2\2\2\u0930\u08ff\3\2\2\2\u0930\u0908"+
		"\3\2\2\2\u0931\u00ab\3\2\2\2\u0932\u0937\5\u00aeX\2\u0933\u0934\7\6\2"+
		"\2\u0934\u0936\5\u00aeX\2\u0935\u0933\3\2\2\2\u0936\u0939\3\2\2\2\u0937"+
		"\u0935\3\2\2\2\u0937\u0938\3\2\2\2\u0938\u00ad\3\2\2\2\u0939\u0937\3\2"+
		"\2\2\u093a\u093f\5\u0100\u0081\2\u093b\u093c\7\7\2\2\u093c\u093e\5\u0100"+
		"\u0081\2\u093d\u093b\3\2\2\2\u093e\u0941\3\2\2\2\u093f\u093d\3\2\2\2\u093f"+
		"\u0940\3\2\2\2\u0940\u00af\3\2\2\2\u0941\u093f\3\2\2\2\u0942\u0943\5\u0100"+
		"\u0081\2\u0943\u0944\7\7\2\2\u0944\u0946\3\2\2\2\u0945\u0942\3\2\2\2\u0945"+
		"\u0946\3\2\2\2\u0946\u0947\3\2\2\2\u0947\u0948\5\u0100\u0081\2\u0948\u00b1"+
		"\3\2\2\2\u0949\u094a\5\u0100\u0081\2\u094a\u094b\7\7\2\2\u094b\u094d\3"+
		"\2\2\2\u094c\u0949\3\2\2\2\u094c\u094d\3\2\2\2\u094d\u094e\3\2\2\2\u094e"+
		"\u094f\5\u0100\u0081\2\u094f\u00b3\3\2\2\2\u0950\u0958\5\u00be`\2\u0951"+
		"\u0953\7\30\2\2\u0952\u0951\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0956\3"+
		"\2\2\2\u0954\u0957\5\u0100\u0081\2\u0955\u0957\5\u0096L\2\u0956\u0954"+
		"\3\2\2\2\u0956\u0955\3\2\2\2\u0957\u0959\3\2\2\2\u0958\u0952\3\2\2\2\u0958"+
		"\u0959\3\2\2\2\u0959\u00b5\3\2\2\2\u095a\u095f\5\u00b4[\2\u095b\u095c"+
		"\7\6\2\2\u095c\u095e\5\u00b4[\2\u095d\u095b\3\2\2\2\u095e\u0961\3\2\2"+
		"\2\u095f\u095d\3\2\2\2\u095f\u0960\3\2\2\2\u0960\u00b7\3\2\2\2\u0961\u095f"+
		"\3\2\2\2\u0962\u0963\7\4\2\2\u0963\u0968\5\u00ba^\2\u0964\u0965\7\6\2"+
		"\2\u0965\u0967\5\u00ba^\2\u0966\u0964\3\2\2\2\u0967\u096a\3\2\2\2\u0968"+
		"\u0966\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096b\3\2\2\2\u096a\u0968\3\2"+
		"\2\2\u096b\u096c\7\5\2\2\u096c\u00b9\3\2\2\2\u096d\u097b\5\u00fe\u0080"+
		"\2\u096e\u096f\5\u0104\u0083\2\u096f\u0970\7\4\2\2\u0970\u0975\5\u00bc"+
		"_\2\u0971\u0972\7\6\2\2\u0972\u0974\5\u00bc_\2\u0973\u0971\3\2\2\2\u0974"+
		"\u0977\3\2\2\2\u0975\u0973\3\2\2\2\u0975\u0976\3\2\2\2\u0976\u0978\3\2"+
		"\2\2\u0977\u0975\3\2\2\2\u0978\u0979\7\5\2\2\u0979\u097b\3\2\2\2\u097a"+
		"\u096d\3\2\2\2\u097a\u096e\3\2\2\2\u097b\u00bb\3\2\2\2\u097c\u097f\5\u00fe"+
		"\u0080\2\u097d\u097f\5\u00c8e\2\u097e\u097c\3\2\2\2\u097e\u097d\3\2\2"+
		"\2\u097f\u00bd\3\2\2\2\u0980\u0981\5\u00c0a\2\u0981\u00bf\3\2\2\2\u0982"+
		"\u0983\ba\1\2\u0983\u0984\7\u009f\2\2\u0984\u098f\5\u00c0a\7\u0985\u0986"+
		"\7Y\2\2\u0986\u0987\7\4\2\2\u0987\u0988\5\"\22\2\u0988\u0989\7\5\2\2\u0989"+
		"\u098f\3\2\2\2\u098a\u098c\5\u00c4c\2\u098b\u098d\5\u00c2b\2\u098c\u098b"+
		"\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u098f\3\2\2\2\u098e\u0982\3\2\2\2\u098e"+
		"\u0985\3\2\2\2\u098e\u098a\3\2\2\2\u098f\u0998\3\2\2\2\u0990\u0991\f\4"+
		"\2\2\u0991\u0992\7\23\2\2\u0992\u0997\5\u00c0a\5\u0993\u0994\f\3\2\2\u0994"+
		"\u0995\7\u00a7\2\2\u0995\u0997\5\u00c0a\4\u0996\u0990\3\2\2\2\u0996\u0993"+
		"\3\2\2\2\u0997\u099a\3\2\2\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999"+
		"\u00c1\3\2\2\2\u099a\u0998\3\2\2\2\u099b\u099d\7\u009f\2\2\u099c\u099b"+
		"\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u099e\3\2\2\2\u099e\u099f\7\34\2\2"+
		"\u099f\u09a0\5\u00c4c\2\u09a0\u09a1\7\23\2\2\u09a1\u09a2\5\u00c4c\2\u09a2"+
		"\u09da\3\2\2\2\u09a3\u09a5\7\u009f\2\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5"+
		"\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6\u09a7\7x\2\2\u09a7\u09a8\7\4\2\2\u09a8"+
		"\u09ad\5\u00be`\2\u09a9\u09aa\7\6\2\2\u09aa\u09ac\5\u00be`\2\u09ab\u09a9"+
		"\3\2\2\2\u09ac\u09af\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ad\u09ae\3\2\2\2\u09ae"+
		"\u09b0\3\2\2\2\u09af\u09ad\3\2\2\2\u09b0\u09b1\7\5\2\2\u09b1\u09da\3\2"+
		"\2\2\u09b2\u09b4\7\u009f\2\2\u09b3\u09b2\3\2\2\2\u09b3\u09b4\3\2\2\2\u09b4"+
		"\u09b5\3\2\2\2\u09b5\u09b6\7x\2\2\u09b6\u09b7\7\4\2\2\u09b7\u09b8\5\""+
		"\22\2\u09b8\u09b9\7\5\2\2\u09b9\u09da\3\2\2\2\u09ba\u09bc\7\u009f\2\2"+
		"\u09bb\u09ba\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be"+
		"\7\u00cd\2\2\u09be\u09da\5\u00c4c\2\u09bf\u09c1\7\u009f\2\2\u09c0\u09bf"+
		"\3\2\2\2\u09c0\u09c1\3\2\2\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\7\u008b\2"+
		"\2\u09c3\u09c6\5\u00c4c\2\u09c4\u09c5\7U\2\2\u09c5\u09c7\7\u012b\2\2\u09c6"+
		"\u09c4\3\2\2\2\u09c6\u09c7\3\2\2\2\u09c7\u09da\3\2\2\2\u09c8\u09ca\7\u0082"+
		"\2\2\u09c9\u09cb\7\u009f\2\2\u09ca\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb"+
		"\u09cc\3\2\2\2\u09cc\u09da\7\u00a0\2\2\u09cd\u09cf\7\u0082\2\2\u09ce\u09d0"+
		"\7\u009f\2\2\u09cf\u09ce\3\2\2\2\u09cf\u09d0\3\2\2\2\u09d0\u09d1\3\2\2"+
		"\2\u09d1\u09da\t\26\2\2\u09d2\u09d4\7\u0082\2\2\u09d3\u09d5\7\u009f\2"+
		"\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6\u09d7"+
		"\7N\2\2\u09d7\u09d8\7j\2\2\u09d8\u09da\5\u00c4c\2\u09d9\u099c\3\2\2\2"+
		"\u09d9\u09a4\3\2\2\2\u09d9\u09b3\3\2\2\2\u09d9\u09bb\3\2\2\2\u09d9\u09c0"+
		"\3\2\2\2\u09d9\u09c8\3\2\2\2\u09d9\u09cd\3\2\2\2\u09d9\u09d2\3\2\2\2\u09da"+
		"\u00c3\3\2\2\2\u09db\u09dc\bc\1\2\u09dc\u09e0\5\u00c6d\2\u09dd\u09de\t"+
		"\27\2\2\u09de\u09e0\5\u00c4c\t\u09df\u09db\3\2\2\2\u09df\u09dd\3\2\2\2"+
		"\u09e0\u09f6\3\2\2\2\u09e1\u09e2\f\b\2\2\u09e2\u09e3\t\30\2\2\u09e3\u09f5"+
		"\5\u00c4c\t\u09e4\u09e5\f\7\2\2\u09e5\u09e6\t\31\2\2\u09e6\u09f5\5\u00c4"+
		"c\b\u09e7\u09e8\f\6\2\2\u09e8\u09e9\7\u0127\2\2\u09e9\u09f5\5\u00c4c\7"+
		"\u09ea\u09eb\f\5\2\2\u09eb\u09ec\7\u012a\2\2\u09ec\u09f5\5\u00c4c\6\u09ed"+
		"\u09ee\f\4\2\2\u09ee\u09ef\7\u0128\2\2\u09ef\u09f5\5\u00c4c\5\u09f0\u09f1"+
		"\f\3\2\2\u09f1\u09f2\5\u00caf\2\u09f2\u09f3\5\u00c4c\4\u09f3\u09f5\3\2"+
		"\2\2\u09f4\u09e1\3\2\2\2\u09f4\u09e4\3\2\2\2\u09f4\u09e7\3\2\2\2\u09f4"+
		"\u09ea\3\2\2\2\u09f4\u09ed\3\2\2\2\u09f4\u09f0\3\2\2\2\u09f5\u09f8\3\2"+
		"\2\2\u09f6\u09f4\3\2\2\2\u09f6\u09f7\3\2\2\2\u09f7\u00c5\3\2\2\2\u09f8"+
		"\u09f6\3\2\2\2\u09f9\u09fa\bd\1\2\u09fa\u0ab2\t\32\2\2\u09fb\u09fd\7#"+
		"\2\2\u09fc\u09fe\5\u00eex\2\u09fd\u09fc\3\2\2\2\u09fe\u09ff\3\2\2\2\u09ff"+
		"\u09fd\3\2\2\2\u09ff\u0a00\3\2\2\2\u0a00\u0a03\3\2\2\2\u0a01\u0a02\7S"+
		"\2\2\u0a02\u0a04\5\u00be`\2\u0a03\u0a01\3\2\2\2\u0a03\u0a04\3\2\2\2\u0a04"+
		"\u0a05\3\2\2\2\u0a05\u0a06\7T\2\2\u0a06\u0ab2\3\2\2\2\u0a07\u0a08\7#\2"+
		"\2\u0a08\u0a0a\5\u00be`\2\u0a09\u0a0b\5\u00eex\2\u0a0a\u0a09\3\2\2\2\u0a0b"+
		"\u0a0c\3\2\2\2\u0a0c\u0a0a\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a10\3\2"+
		"\2\2\u0a0e\u0a0f\7S\2\2\u0a0f\u0a11\5\u00be`\2\u0a10\u0a0e\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a12\3\2\2\2\u0a12\u0a13\7T\2\2\u0a13\u0ab2\3\2"+
		"\2\2\u0a14\u0a15\7$\2\2\u0a15\u0a16\7\4\2\2\u0a16\u0a17\5\u00be`\2\u0a17"+
		"\u0a18\7\30\2\2\u0a18\u0a19\5\u00e0q\2\u0a19\u0a1a\7\5\2\2\u0a1a\u0ab2"+
		"\3\2\2\2\u0a1b\u0a1c\7\u00e8\2\2\u0a1c\u0a25\7\4\2\2\u0a1d\u0a22\5\u00b4"+
		"[\2\u0a1e\u0a1f\7\6\2\2\u0a1f\u0a21\5\u00b4[\2\u0a20\u0a1e\3\2\2\2\u0a21"+
		"\u0a24\3\2\2\2\u0a22\u0a20\3\2\2\2\u0a22\u0a23\3\2\2\2\u0a23\u0a26\3\2"+
		"\2\2\u0a24\u0a22\3\2\2\2\u0a25\u0a1d\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26"+
		"\u0a27\3\2\2\2\u0a27\u0ab2\7\5\2\2\u0a28\u0a29\7d\2\2\u0a29\u0a2a\7\4"+
		"\2\2\u0a2a\u0a2d\5\u00be`\2\u0a2b\u0a2c\7v\2\2\u0a2c\u0a2e\7\u00a1\2\2"+
		"\u0a2d\u0a2b\3\2\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a2f\3\2\2\2\u0a2f\u0a30"+
		"\7\5\2\2\u0a30\u0ab2\3\2\2\2\u0a31\u0a32\7\u0086\2\2\u0a32\u0a33\7\4\2"+
		"\2\u0a33\u0a36\5\u00be`\2\u0a34\u0a35\7v\2\2\u0a35\u0a37\7\u00a1\2\2\u0a36"+
		"\u0a34\3\2\2\2\u0a36\u0a37\3\2\2\2\u0a37\u0a38\3\2\2\2\u0a38\u0a39\7\5"+
		"\2\2\u0a39\u0ab2\3\2\2\2\u0a3a\u0a3b\7\u00b7\2\2\u0a3b\u0a3c\7\4\2\2\u0a3c"+
		"\u0a3d\5\u00c4c\2\u0a3d\u0a3e\7x\2\2\u0a3e\u0a3f\5\u00c4c\2\u0a3f\u0a40"+
		"\7\5\2\2\u0a40\u0ab2\3\2\2\2\u0a41\u0ab2\5\u00c8e\2\u0a42\u0ab2\7\u0123"+
		"\2\2\u0a43\u0a44\5\u00fe\u0080\2\u0a44\u0a45\7\7\2\2\u0a45\u0a46\7\u0123"+
		"\2\2\u0a46\u0ab2\3\2\2\2\u0a47\u0a48\7\4\2\2\u0a48\u0a4b\5\u00b4[\2\u0a49"+
		"\u0a4a\7\6\2\2\u0a4a\u0a4c\5\u00b4[\2\u0a4b\u0a49\3\2\2\2\u0a4c\u0a4d"+
		"\3\2\2\2\u0a4d\u0a4b\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\3\2\2\2\u0a4f"+
		"\u0a50\7\5\2\2\u0a50\u0ab2\3\2\2\2\u0a51\u0a52\7\4\2\2\u0a52\u0a53\5\""+
		"\22\2\u0a53\u0a54\7\5\2\2\u0a54\u0ab2\3\2\2\2\u0a55\u0a56\5\u00fc\177"+
		"\2\u0a56\u0a62\7\4\2\2\u0a57\u0a59\5\u0088E\2\u0a58\u0a57\3\2\2\2\u0a58"+
		"\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5f\5\u00be`\2\u0a5b\u0a5c"+
		"\7\6\2\2\u0a5c\u0a5e\5\u00be`\2\u0a5d\u0a5b\3\2\2\2\u0a5e\u0a61\3\2\2"+
		"\2\u0a5f\u0a5d\3\2\2\2\u0a5f\u0a60\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61\u0a5f"+
		"\3\2\2\2\u0a62\u0a58\3\2\2\2\u0a62\u0a63\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64"+
		"\u0a6b\7\5\2\2\u0a65\u0a66\7b\2\2\u0a66\u0a67\7\4\2\2\u0a67\u0a68\7\u010d"+
		"\2\2\u0a68\u0a69\5\u00c0a\2\u0a69\u0a6a\7\5\2\2\u0a6a\u0a6c\3\2\2\2\u0a6b"+
		"\u0a65\3\2\2\2\u0a6b\u0a6c\3\2\2\2\u0a6c\u0a6f\3\2\2\2\u0a6d\u0a6e\7\u00ac"+
		"\2\2\u0a6e\u0a70\5\u00f4{\2\u0a6f\u0a6d\3\2\2\2\u0a6f\u0a70\3\2\2\2\u0a70"+
		"\u0ab2\3\2\2\2\u0a71\u0a72\5\u0104\u0083\2\u0a72\u0a73\7\n\2\2\u0a73\u0a74"+
		"\5\u00be`\2\u0a74\u0ab2\3\2\2\2\u0a75\u0a76\7\4\2\2\u0a76\u0a79\5\u0104"+
		"\u0083\2\u0a77\u0a78\7\6\2\2\u0a78\u0a7a\5\u0104\u0083\2\u0a79\u0a77\3"+
		"\2\2\2\u0a7a\u0a7b\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7b\u0a7c\3\2\2\2\u0a7c"+
		"\u0a7d\3\2\2\2\u0a7d\u0a7e\7\5\2\2\u0a7e\u0a7f\7\n\2\2\u0a7f\u0a80\5\u00be"+
		"`\2\u0a80\u0ab2\3\2\2\2\u0a81\u0ab2\5\u0104\u0083\2\u0a82\u0a83\7\4\2"+
		"\2\u0a83\u0a84\5\u00be`\2\u0a84\u0a85\7\5\2\2\u0a85\u0ab2\3\2\2\2\u0a86"+
		"\u0a87\7^\2\2\u0a87\u0a88\7\4\2\2\u0a88\u0a89\5\u0104\u0083\2\u0a89\u0a8a"+
		"\7j\2\2\u0a8a\u0a8b\5\u00c4c\2\u0a8b\u0a8c\7\5\2\2\u0a8c\u0ab2\3\2\2\2"+
		"\u0a8d\u0a8e\t\33\2\2\u0a8e\u0a8f\7\4\2\2\u0a8f\u0a90\5\u00c4c\2\u0a90"+
		"\u0a91\t\34\2\2\u0a91\u0a94\5\u00c4c\2\u0a92\u0a93\t\35\2\2\u0a93\u0a95"+
		"\5\u00c4c\2\u0a94\u0a92\3\2\2\2\u0a94\u0a95\3\2\2\2\u0a95\u0a96\3\2\2"+
		"\2\u0a96\u0a97\7\5\2\2\u0a97\u0ab2\3\2\2\2\u0a98\u0a99\7\u00f8\2\2\u0a99"+
		"\u0a9b\7\4\2\2\u0a9a\u0a9c\t\36\2\2\u0a9b\u0a9a\3\2\2\2\u0a9b\u0a9c\3"+
		"\2\2\2\u0a9c\u0a9e\3\2\2\2\u0a9d\u0a9f\5\u00c4c\2\u0a9e\u0a9d\3\2\2\2"+
		"\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa1\7j\2\2\u0aa1\u0aa2"+
		"\5\u00c4c\2\u0aa2\u0aa3\7\5\2\2\u0aa3\u0ab2\3\2\2\2\u0aa4\u0aa5\7\u00ae"+
		"\2\2\u0aa5\u0aa6\7\4\2\2\u0aa6\u0aa7\5\u00c4c\2\u0aa7\u0aa8\7\u00b6\2"+
		"\2\u0aa8\u0aa9\5\u00c4c\2\u0aa9\u0aaa\7j\2\2\u0aaa\u0aad\5\u00c4c\2\u0aab"+
		"\u0aac\7f\2\2\u0aac\u0aae\5\u00c4c\2\u0aad\u0aab\3\2\2\2\u0aad\u0aae\3"+
		"\2\2\2\u0aae\u0aaf\3\2\2\2\u0aaf\u0ab0\7\5\2\2\u0ab0\u0ab2\3\2\2\2\u0ab1"+
		"\u09f9\3\2\2\2\u0ab1\u09fb\3\2\2\2\u0ab1\u0a07\3\2\2\2\u0ab1\u0a14\3\2"+
		"\2\2\u0ab1\u0a1b\3\2\2\2\u0ab1\u0a28\3\2\2\2\u0ab1\u0a31\3\2\2\2\u0ab1"+
		"\u0a3a\3\2\2\2\u0ab1\u0a41\3\2\2\2\u0ab1\u0a42\3\2\2\2\u0ab1\u0a43\3\2"+
		"\2\2\u0ab1\u0a47\3\2\2\2\u0ab1\u0a51\3\2\2\2\u0ab1\u0a55\3\2\2\2\u0ab1"+
		"\u0a71\3\2\2\2\u0ab1\u0a75\3\2\2\2\u0ab1\u0a81\3\2\2\2\u0ab1\u0a82\3\2"+
		"\2\2\u0ab1\u0a86\3\2\2\2\u0ab1\u0a8d\3\2\2\2\u0ab1\u0a98\3\2\2\2\u0ab1"+
		"\u0aa4\3\2\2\2\u0ab2\u0abd\3\2\2\2\u0ab3\u0ab4\f\n\2\2\u0ab4\u0ab5\7\13"+
		"\2\2\u0ab5\u0ab6\5\u00c4c\2\u0ab6\u0ab7\7\f\2\2\u0ab7\u0abc\3\2\2\2\u0ab8"+
		"\u0ab9\f\b\2\2\u0ab9\u0aba\7\7\2\2\u0aba\u0abc\5\u0104\u0083\2\u0abb\u0ab3"+
		"\3\2\2\2\u0abb\u0ab8\3\2\2\2\u0abc\u0abf\3\2\2\2\u0abd\u0abb\3\2\2\2\u0abd"+
		"\u0abe\3\2\2\2\u0abe\u00c7\3\2\2\2\u0abf\u0abd\3\2\2\2\u0ac0\u0acd\7\u00a0"+
		"\2\2\u0ac1\u0acd\5\u00d2j\2\u0ac2\u0ac3\5\u0104\u0083\2\u0ac3\u0ac4\7"+
		"\u012b\2\2\u0ac4\u0acd\3\2\2\2\u0ac5\u0acd\5\u010a\u0086\2\u0ac6\u0acd"+
		"\5\u00d0i\2\u0ac7\u0ac9\7\u012b\2\2\u0ac8\u0ac7\3\2\2\2\u0ac9\u0aca\3"+
		"\2\2\2\u0aca\u0ac8\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0acd\3\2\2\2\u0acc"+
		"\u0ac0\3\2\2\2\u0acc\u0ac1\3\2\2\2\u0acc\u0ac2\3\2\2\2\u0acc\u0ac5\3\2"+
		"\2\2\u0acc\u0ac6\3\2\2\2\u0acc\u0ac8\3\2\2\2\u0acd\u00c9\3\2\2\2\u0ace"+
		"\u0acf\t\37\2\2\u0acf\u00cb\3\2\2\2\u0ad0\u0ad1\t \2\2\u0ad1\u00cd\3\2"+
		"\2\2\u0ad2\u0ad3\t!\2\2\u0ad3\u00cf\3\2\2\2\u0ad4\u0ad5\t\"\2\2\u0ad5"+
		"\u00d1\3\2\2\2\u0ad6\u0ad9\7\u0080\2\2\u0ad7\u0ada\5\u00d4k\2\u0ad8\u0ada"+
		"\5\u00d8m\2\u0ad9\u0ad7\3\2\2\2\u0ad9\u0ad8\3\2\2\2\u0ad9\u0ada\3\2\2"+
		"\2\u0ada\u00d3\3\2\2\2\u0adb\u0add\5\u00d6l\2\u0adc\u0ade\5\u00dan\2\u0add"+
		"\u0adc\3\2\2\2\u0add\u0ade\3\2\2\2\u0ade\u00d5\3\2\2\2\u0adf\u0ae0\5\u00dc"+
		"o\2\u0ae0\u0ae1\5\u0104\u0083\2\u0ae1\u0ae3\3\2\2\2\u0ae2\u0adf\3\2\2"+
		"\2\u0ae3\u0ae4\3\2\2\2\u0ae4\u0ae2\3\2\2\2\u0ae4\u0ae5\3\2\2\2\u0ae5\u00d7"+
		"\3\2\2\2\u0ae6\u0ae9\5\u00dan\2\u0ae7\u0aea\5\u00d6l\2\u0ae8\u0aea\5\u00da"+
		"n\2\u0ae9\u0ae7\3\2\2\2\u0ae9\u0ae8\3\2\2\2\u0ae9\u0aea\3\2\2\2\u0aea"+
		"\u00d9\3\2\2\2\u0aeb\u0aec\5\u00dco\2\u0aec\u0aed\5\u0104\u0083\2\u0aed"+
		"\u0aee\7\u00f2\2\2\u0aee\u0aef\5\u0104\u0083\2\u0aef\u00db\3\2\2\2\u0af0"+
		"\u0af2\t#\2\2\u0af1\u0af0\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af3\3\2"+
		"\2\2\u0af3\u0af6\t\25\2\2\u0af4\u0af6\7\u012b\2\2\u0af5\u0af1\3\2\2\2"+
		"\u0af5\u0af4\3\2\2\2\u0af6\u00dd\3\2\2\2\u0af7\u0afb\7d\2\2\u0af8\u0af9"+
		"\7\17\2\2\u0af9\u0afb\5\u0100\u0081\2\u0afa\u0af7\3\2\2\2\u0afa\u0af8"+
		"\3\2\2\2\u0afb\u00df\3\2\2\2\u0afc\u0afd\7\27\2\2\u0afd\u0afe\7\u011d"+
		"\2\2\u0afe\u0aff\5\u00e0q\2\u0aff\u0b00\7\u011f\2\2\u0b00\u0b1f\3\2\2"+
		"\2\u0b01\u0b02\7\u0097\2\2\u0b02\u0b03\7\u011d\2\2\u0b03\u0b04\5\u00e0"+
		"q\2\u0b04\u0b05\7\6\2\2\u0b05\u0b06\5\u00e0q\2\u0b06\u0b07\7\u011f\2\2"+
		"\u0b07\u0b1f\3\2\2\2\u0b08\u0b0f\7\u00e8\2\2\u0b09\u0b0b\7\u011d\2\2\u0b0a"+
		"\u0b0c\5\u00eav\2\u0b0b\u0b0a\3\2\2\2\u0b0b\u0b0c\3\2\2\2\u0b0c\u0b0d"+
		"\3\2\2\2\u0b0d\u0b10\7\u011f\2\2\u0b0e\u0b10\7\u011b\2\2\u0b0f\u0b09\3"+
		"\2\2\2\u0b0f\u0b0e\3\2\2\2\u0b10\u0b1f\3\2\2\2\u0b11\u0b1c\5\u0104\u0083"+
		"\2\u0b12\u0b13\7\4\2\2\u0b13\u0b18\7\u012f\2\2\u0b14\u0b15\7\6\2\2\u0b15"+
		"\u0b17\7\u012f\2\2\u0b16\u0b14\3\2\2\2\u0b17\u0b1a\3\2\2\2\u0b18\u0b16"+
		"\3\2\2\2\u0b18\u0b19\3\2\2\2\u0b19\u0b1b\3\2\2\2\u0b1a\u0b18\3\2\2\2\u0b1b"+
		"\u0b1d\7\5\2\2\u0b1c\u0b12\3\2\2\2\u0b1c\u0b1d\3\2\2\2\u0b1d\u0b1f\3\2"+
		"\2\2\u0b1e\u0afc\3\2\2\2\u0b1e\u0b01\3\2\2\2\u0b1e\u0b08\3\2\2\2\u0b1e"+
		"\u0b11\3\2\2\2\u0b1f\u00e1\3\2\2\2\u0b20\u0b25\5\u00e4s\2\u0b21\u0b22"+
		"\7\6\2\2\u0b22\u0b24\5\u00e4s\2\u0b23\u0b21\3\2\2\2\u0b24\u0b27\3\2\2"+
		"\2\u0b25\u0b23\3\2\2\2\u0b25\u0b26\3\2\2\2\u0b26\u00e3\3\2\2\2\u0b27\u0b25"+
		"\3\2\2\2\u0b28\u0b29\5\u00aeX\2\u0b29\u0b2c\5\u00e0q\2\u0b2a\u0b2b\7\u009f"+
		"\2\2\u0b2b\u0b2d\7\u00a0\2\2\u0b2c\u0b2a\3\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d"+
		"\u0b2f\3\2\2\2\u0b2e\u0b30\5 \21\2\u0b2f\u0b2e\3\2\2\2\u0b2f\u0b30\3\2"+
		"\2\2\u0b30\u0b32\3\2\2\2\u0b31\u0b33\5\u00dep\2\u0b32\u0b31\3\2\2\2\u0b32"+
		"\u0b33\3\2\2\2\u0b33\u00e5\3\2\2\2\u0b34\u0b39\5\u00e8u\2\u0b35\u0b36"+
		"\7\6\2\2\u0b36\u0b38\5\u00e8u\2\u0b37\u0b35\3\2\2\2\u0b38\u0b3b\3\2\2"+
		"\2\u0b39\u0b37\3\2\2\2\u0b39\u0b3a\3\2\2\2\u0b3a\u00e7\3\2\2\2\u0b3b\u0b39"+
		"\3\2\2\2\u0b3c\u0b3d\5\u0100\u0081\2\u0b3d\u0b40\5\u00e0q\2\u0b3e\u0b3f"+
		"\7\u009f\2\2\u0b3f\u0b41\7\u00a0\2\2\u0b40\u0b3e\3\2\2\2\u0b40\u0b41\3"+
		"\2\2\2\u0b41\u0b43\3\2\2\2\u0b42\u0b44\5 \21\2\u0b43\u0b42\3\2\2\2\u0b43"+
		"\u0b44\3\2\2\2\u0b44\u00e9\3\2\2\2\u0b45\u0b4a\5\u00ecw\2\u0b46\u0b47"+
		"\7\6\2\2\u0b47\u0b49\5\u00ecw\2\u0b48\u0b46\3\2\2\2\u0b49\u0b4c\3\2\2"+
		"\2\u0b4a\u0b48\3\2\2\2\u0b4a\u0b4b\3\2\2\2\u0b4b\u00eb\3\2\2\2\u0b4c\u0b4a"+
		"\3\2\2\2\u0b4d\u0b4e\5\u0104\u0083\2\u0b4e\u0b4f\7\r\2\2\u0b4f\u0b52\5"+
		"\u00e0q\2\u0b50\u0b51\7\u009f\2\2\u0b51\u0b53\7\u00a0\2\2\u0b52\u0b50"+
		"\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u0b55\3\2\2\2\u0b54\u0b56\5 \21\2\u0b55"+
		"\u0b54\3\2\2\2\u0b55\u0b56\3\2\2\2\u0b56\u00ed\3\2\2\2\u0b57\u0b58\7\u010c"+
		"\2\2\u0b58\u0b59\5\u00be`\2\u0b59\u0b5a\7\u00f1\2\2\u0b5a\u0b5b\5\u00be"+
		"`\2\u0b5b\u00ef\3\2\2\2\u0b5c\u0b5d\7\u010e\2\2\u0b5d\u0b62\5\u00f2z\2"+
		"\u0b5e\u0b5f\7\6\2\2\u0b5f\u0b61\5\u00f2z\2\u0b60\u0b5e\3\2\2\2\u0b61"+
		"\u0b64\3\2\2\2\u0b62\u0b60\3\2\2\2\u0b62\u0b63\3\2\2\2\u0b63\u00f1\3\2"+
		"\2\2\u0b64\u0b62\3\2\2\2\u0b65\u0b66\5\u0100\u0081\2\u0b66\u0b67\7\30"+
		"\2\2\u0b67\u0b68\5\u00f4{\2\u0b68\u00f3\3\2\2\2\u0b69\u0b98\5\u0100\u0081"+
		"\2\u0b6a\u0b6b\7\4\2\2\u0b6b\u0b6c\5\u0100\u0081\2\u0b6c\u0b6d\7\5\2\2"+
		"\u0b6d\u0b98\3\2\2\2\u0b6e\u0b91\7\4\2\2\u0b6f\u0b70\7(\2\2\u0b70\u0b71"+
		"\7 \2\2\u0b71\u0b76\5\u00be`\2\u0b72\u0b73\7\6\2\2\u0b73\u0b75\5\u00be"+
		"`\2\u0b74\u0b72\3\2\2\2\u0b75\u0b78\3\2\2\2\u0b76\u0b74\3\2\2\2\u0b76"+
		"\u0b77\3\2\2\2\u0b77\u0b92\3\2\2\2\u0b78\u0b76\3\2\2\2\u0b79\u0b7a\t$"+
		"\2\2\u0b7a\u0b7b\7 \2\2\u0b7b\u0b80\5\u00be`\2\u0b7c\u0b7d\7\6\2\2\u0b7d"+
		"\u0b7f\5\u00be`\2\u0b7e\u0b7c\3\2\2\2\u0b7f\u0b82\3\2\2\2\u0b80\u0b7e"+
		"\3\2\2\2\u0b80\u0b81\3\2\2\2\u0b81\u0b84\3\2\2\2\u0b82\u0b80\3\2\2\2\u0b83"+
		"\u0b79\3\2\2\2\u0b83\u0b84\3\2\2\2\u0b84\u0b8f\3\2\2\2\u0b85\u0b86\t%"+
		"\2\2\u0b86\u0b87\7 \2\2\u0b87\u0b8c\5X-\2\u0b88\u0b89\7\6\2\2\u0b89\u0b8b"+
		"\5X-\2\u0b8a\u0b88\3\2\2\2\u0b8b\u0b8e\3\2\2\2\u0b8c\u0b8a\3\2\2\2\u0b8c"+
		"\u0b8d\3\2\2\2\u0b8d\u0b90\3\2\2\2\u0b8e\u0b8c\3\2\2\2\u0b8f\u0b85\3\2"+
		"\2\2\u0b8f\u0b90\3\2\2\2\u0b90\u0b92\3\2\2\2\u0b91\u0b6f\3\2\2\2\u0b91"+
		"\u0b83\3\2\2\2\u0b92\u0b94\3\2\2\2\u0b93\u0b95\5\u00f6|\2\u0b94\u0b93"+
		"\3\2\2\2\u0b94\u0b95\3\2\2\2\u0b95\u0b96\3\2\2\2\u0b96\u0b98\7\5\2\2\u0b97"+
		"\u0b69\3\2\2\2\u0b97\u0b6a\3\2\2\2\u0b97\u0b6e\3\2\2\2\u0b98\u00f5\3\2"+
		"\2\2\u0b99\u0b9a\7\u00be\2\2\u0b9a\u0baa\5\u00f8}\2\u0b9b\u0b9c\7\u00d3"+
		"\2\2\u0b9c\u0baa\5\u00f8}\2\u0b9d\u0b9e\7\u00be\2\2\u0b9e\u0b9f\7\34\2"+
		"\2\u0b9f\u0ba0\5\u00f8}\2\u0ba0\u0ba1\7\23\2\2\u0ba1\u0ba2\5\u00f8}\2"+
		"\u0ba2\u0baa\3\2\2\2\u0ba3\u0ba4\7\u00d3\2\2\u0ba4\u0ba5\7\34\2\2\u0ba5"+
		"\u0ba6\5\u00f8}\2\u0ba6\u0ba7\7\23\2\2\u0ba7\u0ba8\5\u00f8}\2\u0ba8\u0baa"+
		"\3\2\2\2\u0ba9\u0b99\3\2\2\2\u0ba9\u0b9b\3\2\2\2\u0ba9\u0b9d\3\2\2\2\u0ba9"+
		"\u0ba3\3\2\2\2\u0baa\u00f7\3\2\2\2\u0bab\u0bac\7\u00fd\2\2\u0bac\u0bb3"+
		"\t&\2\2\u0bad\u0bae\7;\2\2\u0bae\u0bb3\7\u00d2\2\2\u0baf\u0bb0\5\u00be"+
		"`\2\u0bb0\u0bb1\t&\2\2\u0bb1\u0bb3\3\2\2\2\u0bb2\u0bab\3\2\2\2\u0bb2\u0bad"+
		"\3\2\2\2\u0bb2\u0baf\3\2\2\2\u0bb3\u00f9\3\2\2\2\u0bb4\u0bb9\5\u00fe\u0080"+
		"\2\u0bb5\u0bb6\7\6\2\2\u0bb6\u0bb8\5\u00fe\u0080\2\u0bb7\u0bb5\3\2\2\2"+
		"\u0bb8\u0bbb\3\2\2\2\u0bb9\u0bb7\3\2\2\2\u0bb9\u0bba\3\2\2\2\u0bba\u00fb"+
		"\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbc\u0bc1\5\u00fe\u0080\2\u0bbd\u0bc1\7"+
		"b\2\2\u0bbe\u0bc1\7\u008a\2\2\u0bbf\u0bc1\7\u00cc\2\2\u0bc0\u0bbc\3\2"+
		"\2\2\u0bc0\u0bbd\3\2\2\2\u0bc0\u0bbe\3\2\2\2\u0bc0\u0bbf\3\2\2\2\u0bc1"+
		"\u00fd\3\2\2\2\u0bc2\u0bc7\5\u0104\u0083\2\u0bc3\u0bc4\7\7\2\2\u0bc4\u0bc6"+
		"\5\u0104\u0083\2\u0bc5\u0bc3\3\2\2\2\u0bc6\u0bc9\3\2\2\2\u0bc7\u0bc5\3"+
		"\2\2\2\u0bc7\u0bc8\3\2\2\2\u0bc8\u00ff\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bca"+
		"\u0bcb\5\u0104\u0083\2\u0bcb\u0bcc\5\u0102\u0082\2\u0bcc\u0101\3\2\2\2"+
		"\u0bcd\u0bce\7\u0122\2\2\u0bce\u0bd0\5\u0104\u0083\2\u0bcf\u0bcd\3\2\2"+
		"\2\u0bd0\u0bd1\3\2\2\2\u0bd1\u0bcf\3\2\2\2\u0bd1\u0bd2\3\2\2\2\u0bd2\u0bd5"+
		"\3\2\2\2\u0bd3\u0bd5\3\2\2\2\u0bd4\u0bcf\3\2\2\2\u0bd4\u0bd3\3\2\2\2\u0bd5"+
		"\u0103\3\2\2\2\u0bd6\u0bda\5\u0106\u0084\2\u0bd7\u0bd8\6\u0083\24\2\u0bd8"+
		"\u0bda\5\u0110\u0089\2\u0bd9\u0bd6\3\2\2\2\u0bd9\u0bd7\3\2\2\2\u0bda\u0105"+
		"\3\2\2\2\u0bdb\u0be2\7\u0134\2\2\u0bdc\u0be2\5\u0108\u0085\2\u0bdd\u0bde"+
		"\6\u0084\25\2\u0bde\u0be2\5\u010e\u0088\2\u0bdf\u0be0\6\u0084\26\2\u0be0"+
		"\u0be2\5\u0112\u008a\2\u0be1\u0bdb\3\2\2\2\u0be1\u0bdc\3\2\2\2\u0be1\u0bdd"+
		"\3\2\2\2\u0be1\u0bdf\3\2\2\2\u0be2\u0107\3\2\2\2\u0be3\u0be4\7\u0135\2"+
		"\2\u0be4\u0109\3\2\2\2\u0be5\u0be7\6\u0086\27\2\u0be6\u0be8\7\u0122\2"+
		"\2\u0be7\u0be6\3\2\2\2\u0be7\u0be8\3\2\2\2\u0be8\u0be9\3\2\2\2\u0be9\u0c0d"+
		"\7\u0130\2\2\u0bea\u0bec\6\u0086\30\2\u0beb\u0bed\7\u0122\2\2\u0bec\u0beb"+
		"\3\2\2\2\u0bec\u0bed\3\2\2\2\u0bed\u0bee\3\2\2\2\u0bee\u0c0d\7\u0131\2"+
		"\2\u0bef\u0bf1\6\u0086\31\2\u0bf0\u0bf2\7\u0122\2\2\u0bf1\u0bf0\3\2\2"+
		"\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf3\3\2\2\2\u0bf3\u0c0d\t\'\2\2\u0bf4\u0bf6"+
		"\7\u0122\2\2\u0bf5\u0bf4\3\2\2\2\u0bf5\u0bf6\3\2\2\2\u0bf6\u0bf7\3\2\2"+
		"\2\u0bf7\u0c0d\7\u012f\2\2\u0bf8\u0bfa\7\u0122\2\2\u0bf9\u0bf8\3\2\2\2"+
		"\u0bf9\u0bfa\3\2\2\2\u0bfa\u0bfb\3\2\2\2\u0bfb\u0c0d\7\u012c\2\2\u0bfc"+
		"\u0bfe\7\u0122\2\2\u0bfd\u0bfc\3\2\2\2\u0bfd\u0bfe\3\2\2\2\u0bfe\u0bff"+
		"\3\2\2\2\u0bff\u0c0d\7\u012d\2\2\u0c00\u0c02\7\u0122\2\2\u0c01\u0c00\3"+
		"\2\2\2\u0c01\u0c02\3\2\2\2\u0c02\u0c03\3\2\2\2\u0c03\u0c0d\7\u012e\2\2"+
		"\u0c04\u0c06\7\u0122\2\2\u0c05\u0c04\3\2\2\2\u0c05\u0c06\3\2\2\2\u0c06"+
		"\u0c07\3\2\2\2\u0c07\u0c0d\7\u0132\2\2\u0c08\u0c0a\7\u0122\2\2\u0c09\u0c08"+
		"\3\2\2\2\u0c09\u0c0a\3\2\2\2\u0c0a\u0c0b\3\2\2\2\u0c0b\u0c0d\7\u0133\2"+
		"\2\u0c0c\u0be5\3\2\2\2\u0c0c\u0bea\3\2\2\2\u0c0c\u0bef\3\2\2\2\u0c0c\u0bf5"+
		"\3\2\2\2\u0c0c\u0bf9\3\2\2\2\u0c0c\u0bfd\3\2\2\2\u0c0c\u0c01\3\2\2\2\u0c0c"+
		"\u0c05\3\2\2\2\u0c0c\u0c09\3\2\2\2\u0c0d\u010b\3\2\2\2\u0c0e\u0c0f\7\u00fb"+
		"\2\2\u0c0f\u0c16\5\u00e0q\2\u0c10\u0c16\5 \21\2\u0c11\u0c16\5\u00dep\2"+
		"\u0c12\u0c13\t(\2\2\u0c13\u0c14\7\u009f\2\2\u0c14\u0c16\7\u00a0\2\2\u0c15"+
		"\u0c0e\3\2\2\2\u0c15\u0c10\3\2\2\2\u0c15\u0c11\3\2\2\2\u0c15\u0c12\3\2"+
		"\2\2\u0c16\u010d\3\2\2\2\u0c17\u0c18\t)\2\2\u0c18\u010f\3\2\2\2\u0c19"+
		"\u0c1a\t*\2\2\u0c1a\u0111\3\2\2\2\u0c1b\u0c1c\t+\2\2\u0c1c\u0113\3\2\2"+
		"\2\u0196\u0118\u0131\u0136\u013e\u0146\u0148\u015c\u0160\u0166\u0169\u016c"+
		"\u0174\u0177\u017b\u017e\u0186\u018b\u018e\u0195\u01a1\u01ac\u01ae\u01b2"+
		"\u01b5\u01bc\u01c7\u01c9\u01d1\u01d6\u01d9\u01df\u01ea\u022a\u0233\u0237"+
		"\u023d\u0241\u0246\u024c\u0254\u025a\u0267\u026c\u027c\u0283\u0287\u028d"+
		"\u029c\u02a0\u02a6\u02ac\u02af\u02b2\u02b8\u02bc\u02c4\u02c6\u02cf\u02d2"+
		"\u02db\u02e0\u02e6\u02ed\u02f0\u02f6\u0301\u0304\u0308\u030d\u0312\u0319"+
		"\u031c\u031f\u0326\u032b\u0334\u033c\u0342\u0345\u0348\u034e\u0352\u0356"+
		"\u035a\u035c\u0364\u036c\u0372\u037e\u0382\u0385\u0389\u038c\u0390\u03a9"+
		"\u03ac\u03b0\u03b6\u03b9\u03bc\u03c2\u03ca\u03cf\u03d5\u03db\u03e7\u03ea"+
		"\u03f1\u03f8\u0400\u0404\u040f\u041b\u041e\u0424\u042a\u0430\u0434\u043b"+
		"\u0451\u0455\u0461\u0465\u046b\u046e\u0478\u047c\u0483\u04f7\u04ff\u0507"+
		"\u0510\u051a\u051e\u0521\u0527\u052d\u0539\u0545\u054a\u0553\u055b\u0562"+
		"\u0564\u0569\u056d\u0572\u0577\u057c\u057f\u0584\u0588\u058d\u058f\u0593"+
		"\u059c\u05a4\u05ad\u05b4\u05bd\u05c2\u05c5\u05da\u05dc\u05e5\u05ec\u05ef"+
		"\u05f6\u05fa\u0600\u0608\u0613\u061e\u0625\u062b\u0638\u063f\u0646\u0652"+
		"\u065a\u0660\u0663\u066c\u066f\u0678\u067b\u0684\u0687\u0690\u0693\u0696"+
		"\u069b\u069d\u06a9\u06b0\u06b7\u06ba\u06bc\u06c8\u06cc\u06d0\u06d6\u06da"+
		"\u06e2\u06e6\u06e9\u06ec\u06ef\u06f3\u06f7\u06fa\u06fe\u0703\u0707\u070a"+
		"\u070d\u0710\u0712\u071e\u0721\u0725\u072f\u0733\u0735\u0738\u073c\u0742"+
		"\u0746\u0751\u075b\u0767\u0776\u077b\u0782\u0792\u0797\u07a4\u07a9\u07b1"+
		"\u07b7\u07bb\u07c4\u07d3\u07d8\u07e4\u07e9\u07f1\u07f4\u07f8\u0806\u0813"+
		"\u0818\u081c\u081f\u0824\u082d\u0830\u0835\u083c\u083f\u0847\u084e\u0855"+
		"\u0858\u085d\u0860\u0865\u0869\u086c\u086f\u0875\u087a\u087f\u0891\u0893"+
		"\u0896\u08a1\u08aa\u08b1\u08b9\u08c0\u08c4\u08cc\u08d4\u08da\u08e2\u08ee"+
		"\u08f1\u08f7\u08fb\u08fd\u0906\u0912\u0914\u091b\u0922\u0928\u092e\u0930"+
		"\u0937\u093f\u0945\u094c\u0952\u0956\u0958\u095f\u0968\u0975\u097a\u097e"+
		"\u098c\u098e\u0996\u0998\u099c\u09a4\u09ad\u09b3\u09bb\u09c0\u09c6\u09ca"+
		"\u09cf\u09d4\u09d9\u09df\u09f4\u09f6\u09ff\u0a03\u0a0c\u0a10\u0a22\u0a25"+
		"\u0a2d\u0a36\u0a4d\u0a58\u0a5f\u0a62\u0a6b\u0a6f\u0a7b\u0a94\u0a9b\u0a9e"+
		"\u0aad\u0ab1\u0abb\u0abd\u0aca\u0acc\u0ad9\u0add\u0ae4\u0ae9\u0af1\u0af5"+
		"\u0afa\u0b0b\u0b0f\u0b18\u0b1c\u0b1e\u0b25\u0b2c\u0b2f\u0b32\u0b39\u0b40"+
		"\u0b43\u0b4a\u0b52\u0b55\u0b62\u0b76\u0b80\u0b83\u0b8c\u0b8f\u0b91\u0b94"+
		"\u0b97\u0ba9\u0bb2\u0bb9\u0bc0\u0bc7\u0bd1\u0bd4\u0bd9\u0be1\u0be7\u0bec"+
		"\u0bf1\u0bf5\u0bf9\u0bfd\u0c01\u0c05\u0c09\u0c0c\u0c15";
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