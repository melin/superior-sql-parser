// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.8
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		BRACKETED_COMMENT=310, WS=311, UNRECOGNIZED=312;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_unsupportedHiveNativeCommands = 8, RULE_createTableHeader = 9, RULE_replaceTableHeader = 10, 
		RULE_bucketSpec = 11, RULE_skewSpec = 12, RULE_locationSpec = 13, RULE_commentSpec = 14, 
		RULE_query = 15, RULE_insertInto = 16, RULE_partitionSpecLocation = 17, 
		RULE_partitionSpec = 18, RULE_partitionVal = 19, RULE_namespace = 20, 
		RULE_describeFuncName = 21, RULE_describeColName = 22, RULE_ctes = 23, 
		RULE_namedQuery = 24, RULE_tableProvider = 25, RULE_createTableClauses = 26, 
		RULE_tablePropertyList = 27, RULE_tableProperty = 28, RULE_tablePropertyKey = 29, 
		RULE_tablePropertyValue = 30, RULE_constantList = 31, RULE_nestedConstantList = 32, 
		RULE_createFileFormat = 33, RULE_fileFormat = 34, RULE_storageHandler = 35, 
		RULE_resource = 36, RULE_dmlStatementNoWith = 37, RULE_queryOrganization = 38, 
		RULE_multiInsertQueryBody = 39, RULE_queryTerm = 40, RULE_queryPrimary = 41, 
		RULE_sortItem = 42, RULE_fromStatement = 43, RULE_fromStatementBody = 44, 
		RULE_querySpecification = 45, RULE_transformClause = 46, RULE_selectClause = 47, 
		RULE_setClause = 48, RULE_matchedClause = 49, RULE_notMatchedClause = 50, 
		RULE_matchedAction = 51, RULE_notMatchedAction = 52, RULE_assignmentList = 53, 
		RULE_assignment = 54, RULE_whereClause = 55, RULE_havingClause = 56, RULE_hint = 57, 
		RULE_hintStatement = 58, RULE_fromClause = 59, RULE_aggregationClause = 60, 
		RULE_groupingSet = 61, RULE_pivotClause = 62, RULE_pivotColumn = 63, RULE_pivotValue = 64, 
		RULE_lateralView = 65, RULE_setQuantifier = 66, RULE_relation = 67, RULE_joinRelation = 68, 
		RULE_joinType = 69, RULE_joinCriteria = 70, RULE_sample = 71, RULE_sampleMethod = 72, 
		RULE_identifierList = 73, RULE_identifierSeq = 74, RULE_orderedIdentifierList = 75, 
		RULE_orderedIdentifier = 76, RULE_identifierCommentList = 77, RULE_identifierComment = 78, 
		RULE_relationPrimary = 79, RULE_inlineTable = 80, RULE_functionTable = 81, 
		RULE_tableAlias = 82, RULE_rowFormat = 83, RULE_multipartIdentifierList = 84, 
		RULE_multipartIdentifier = 85, RULE_tableIdentifier = 86, RULE_functionIdentifier = 87, 
		RULE_namedExpression = 88, RULE_namedExpressionSeq = 89, RULE_transformList = 90, 
		RULE_transform = 91, RULE_transformArgument = 92, RULE_expression = 93, 
		RULE_booleanExpression = 94, RULE_predicate = 95, RULE_valueExpression = 96, 
		RULE_primaryExpression = 97, RULE_constant = 98, RULE_comparisonOperator = 99, 
		RULE_arithmeticOperator = 100, RULE_predicateOperator = 101, RULE_booleanValue = 102, 
		RULE_interval = 103, RULE_errorCapturingMultiUnitsInterval = 104, RULE_multiUnitsInterval = 105, 
		RULE_errorCapturingUnitToUnitInterval = 106, RULE_unitToUnitInterval = 107, 
		RULE_intervalValue = 108, RULE_colPosition = 109, RULE_dataType = 110, 
		RULE_qualifiedColTypeWithPositionList = 111, RULE_qualifiedColTypeWithPosition = 112, 
		RULE_colTypeList = 113, RULE_colType = 114, RULE_complexColTypeList = 115, 
		RULE_complexColType = 116, RULE_whenClause = 117, RULE_windowClause = 118, 
		RULE_namedWindow = 119, RULE_windowSpec = 120, RULE_windowFrame = 121, 
		RULE_frameBound = 122, RULE_qualifiedNameList = 123, RULE_functionName = 124, 
		RULE_qualifiedName = 125, RULE_errorCapturingIdentifier = 126, RULE_errorCapturingIdentifierExtra = 127, 
		RULE_identifier = 128, RULE_strictIdentifier = 129, RULE_quotedIdentifier = 130, 
		RULE_number = 131, RULE_alterColumnAction = 132, RULE_ansiNonReserved = 133, 
		RULE_strictNonReserved = 134, RULE_nonReserved = 135;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"unsupportedHiveNativeCommands", "createTableHeader", "replaceTableHeader", 
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
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
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
			"'RUN'", "'SCHEMA'", "'SELECT'", "'SEMI'", "'SEPARATED'", "'SERDE'", 
			"'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", "'MINUS'", "'SETS'", 
			"'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", "'START'", "'STATISTICS'", 
			"'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", "'SUBSTRING'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", 
			"'TRANSFORM'", "'TRIM'", "'TRUE'", "'TRUNCATE'", "'TYPE'", "'UNARCHIVE'", 
			"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
			"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VACUUM'", 
			"'VIEW'", "'VIEWS'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", "'KILL'", 
			"'READ'", "'JOB'", "'ADDJAR'", "'COMPRESS'", "'FILE'", "'DATAX'", "'READER'", 
			"'WRITER'", null, "'<=>'", "'<>'", "'!='", "'<'", null, "'>'", null, 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", "'||'", "'^'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'/**/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", "ANY", "ARCHIVE", 
			"ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", "BOTH", "BUCKET", 
			"BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", "CHANGE", "CHECK", 
			"CLEAR", "CLUSTER", "CLUSTERED", "CODEGEN", "COLLATE", "COLLECTION", 
			"COLUMN", "COLUMNS", "COMMENT", "COMMIT", "COMPACT", "COMPACTIONS", "COMPUTE", 
			"CONCATENATE", "CONSTRAINT", "CONVERT", "COST", "CREATE", "CROSS", "CUBE", 
			"CURRENT", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_USER", 
			"DATA", "DATABASE", "DATABASES", "DBPROPERTIES", "DEFINED", "DELETE", 
			"DELIMITED", "DELTA", "DESC", "DESCRIBE", "DETAIL", "DFS", "DIRECTORIES", 
			"DIRECTORY", "DISTINCT", "DISTRIBUTE", "DIV", "DROP", "DRY", "ELSE", 
			"END", "ESCAPE", "ESCAPED", "EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", 
			"EXPORT", "EXTENDED", "EXTERNAL", "EXTRACT", "FALSE", "FETCH", "FIELDS", 
			"FILTER", "FILEFORMAT", "FIRST", "FOLLOWING", "FOR", "FOREIGN", "FORMAT", 
			"FORMATTED", "FROM", "FULL", "FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", 
			"GROUP", "GROUPING", "HAVING", "HOURS", "HISTORY", "IF", "IGNORE", "IMPORT", 
			"IN", "INDEX", "INDEXES", "INNER", "INPATH", "INPUTFORMAT", "INSERT", 
			"INTERSECT", "INTERVAL", "INTO", "IS", "ITEMS", "JOIN", "KEYS", "LAST", 
			"LATERAL", "LAZY", "LEADING", "LEFT", "LIKE", "LIMIT", "LINES", "LIST", 
			"LIFECYCLE", "LOAD", "LOCAL", "LOCATION", "LOCK", "LOCKS", "LOGICAL", 
			"MACRO", "MAP", "MATCHED", "MERGE", "MSCK", "NAMESPACE", "NAMESPACES", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
			"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
			"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PARQUET", 
			"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
			"PRINCIPALS", "PROPERTIES", "PURGE", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPLACE", "RESET", "RESTRICT", "REVOKE", "RETAIN", "RIGHT", 
			"RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", "RUN", 
			"SCHEMA", "SELECT", "SEMI", "SEPARATED", "SERDE", "SERDEPROPERTIES", 
			"SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", "SKEWED", "SOME", 
			"SORT", "SORTED", "START", "STATISTICS", "STORED", "STRATIFY", "STRUCT", 
			"SUBSTR", "SUBSTRING", "TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", 
			"TEMPORARY", "TERMINATED", "THEN", "TO", "TOUCH", "TRAILING", "TRANSACTION", 
			"TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", "TRUNCATE", "TYPE", "UNARCHIVE", 
			"UNBOUNDED", "UNCACHE", "UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", 
			"UPDATE", "USE", "USER", "USING", "VALUES", "VACUUM", "VIEW", "VIEWS", 
			"WHEN", "WHERE", "WINDOW", "WITH", "KILL", "READ", "JOB", "ADDJAR", "COMPRESS", 
			"FILE", "DATAX", "READER", "WRITER", "EQ", "NSEQ", "NEQ", "NEQJ", "LT", 
			"LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "STRING", "BIGINT_LITERAL", 
			"SMALLINT_LITERAL", "TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_EMPTY_COMMENT", 
			"BRACKETED_COMMENT", "WS", "UNRECOGNIZED"
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
			setState(272);
			statement();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(273);
				match(T__0);
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
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
			setState(281);
			namedExpression();
			setState(282);
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
			setState(284);
			tableIdentifier();
			setState(285);
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
			setState(287);
			multipartIdentifier();
			setState(288);
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
			setState(290);
			functionIdentifier();
			setState(291);
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
			setState(293);
			dataType();
			setState(294);
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
			setState(296);
			colTypeList();
			setState(297);
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
			setState(1130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(300);
					ctes();
					}
				}

				setState(303);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(USE);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(305);
					match(NAMESPACE);
					}
					break;
				}
				setState(308);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
				match(CREATE);
				setState(310);
				namespace();
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(311);
					match(IF);
					setState(312);
					match(NOT);
					setState(313);
					match(EXISTS);
					}
					break;
				}
				setState(316);
				multipartIdentifier();
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(322);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(317);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(318);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(319);
						match(WITH);
						setState(320);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(321);
						tablePropertyList();
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
				}
				break;
			case 5:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				match(ALTER);
				setState(328);
				namespace();
				setState(329);
				multipartIdentifier();
				setState(330);
				match(SET);
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				tablePropertyList();
				}
				break;
			case 6:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				match(ALTER);
				setState(335);
				namespace();
				setState(336);
				multipartIdentifier();
				setState(337);
				match(SET);
				setState(338);
				locationSpec();
				}
				break;
			case 7:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				match(DROP);
				setState(341);
				namespace();
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(342);
					match(IF);
					setState(343);
					match(EXISTS);
					}
					break;
				}
				setState(346);
				multipartIdentifier();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(347);
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
				setState(350);
				match(SHOW);
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==DATABASES || _la==NAMESPACES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(352);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(353);
					multipartIdentifier();
					}
				}

				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(356);
						match(LIKE);
						}
					}

					setState(359);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 9:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(362);
				if (!(!legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "!legacy_create_hive_table_by_default_enabled");
				setState(363);
				createTableHeader();
				setState(368);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(364);
					match(T__1);
					setState(365);
					colTypeList();
					setState(366);
					match(T__2);
					}
					break;
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(370);
					tableProvider();
					}
				}

				setState(373);
				createTableClauses();
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(374);
						match(AS);
						}
					}

					setState(377);
					query();
					}
				}

				}
				break;
			case 10:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(380);
				if (!(legacy_create_hive_table_by_default_enabled)) throw new FailedPredicateException(this, "legacy_create_hive_table_by_default_enabled");
				setState(381);
				createTableHeader();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(382);
					match(T__1);
					setState(383);
					colTypeList();
					setState(384);
					match(T__2);
					}
				}

				setState(388);
				tableProvider();
				setState(389);
				createTableClauses();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(391);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(390);
						match(AS);
						}
					}

					setState(393);
					query();
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateHiveTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(396);
				createTableHeader();
				setState(401);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(397);
					match(T__1);
					setState(398);
					((CreateHiveTableContext)_localctx).columns = colTypeList();
					setState(399);
					match(T__2);
					}
					break;
				}
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CLUSTERED || _la==COMMENT || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (LIFECYCLE - 141)) | (1L << (LOCATION - 141)) | (1L << (PARTITIONED - 141)))) != 0) || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ROW - 208)) | (1L << (SKEWED - 208)) | (1L << (STORED - 208)) | (1L << (TBLPROPERTIES - 208)))) != 0)) {
					{
					setState(424);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(403);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						setState(413);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
						case 1:
							{
							setState(404);
							match(PARTITIONED);
							setState(405);
							match(BY);
							setState(406);
							match(T__1);
							setState(407);
							((CreateHiveTableContext)_localctx).partitionColumns = colTypeList();
							setState(408);
							match(T__2);
							}
							break;
						case 2:
							{
							setState(410);
							match(PARTITIONED);
							setState(411);
							match(BY);
							setState(412);
							((CreateHiveTableContext)_localctx).partitionColumnNames = identifierList();
							}
							break;
						}
						}
						break;
					case CLUSTERED:
						{
						setState(415);
						bucketSpec();
						}
						break;
					case SKEWED:
						{
						setState(416);
						skewSpec();
						}
						break;
					case ROW:
						{
						setState(417);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(418);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(419);
						locationSpec();
						}
						break;
					case LIFECYCLE:
						{
						{
						setState(420);
						match(LIFECYCLE);
						setState(421);
						((CreateHiveTableContext)_localctx).lifecycle = match(INTEGER_VALUE);
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(422);
						match(TBLPROPERTIES);
						setState(423);
						((CreateHiveTableContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(429);
						match(AS);
						}
					}

					setState(432);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(435);
				match(CREATE);
				setState(436);
				match(TABLE);
				setState(440);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(437);
					match(IF);
					setState(438);
					match(NOT);
					setState(439);
					match(EXISTS);
					}
					break;
				}
				setState(442);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(443);
				match(LIKE);
				setState(444);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 208)) & ~0x3f) == 0 && ((1L << (_la - 208)) & ((1L << (ROW - 208)) | (1L << (STORED - 208)) | (1L << (TBLPROPERTIES - 208)) | (1L << (USING - 208)))) != 0)) {
					{
					setState(451);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(445);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(446);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(447);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(448);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(449);
						match(TBLPROPERTIES);
						setState(450);
						((CreateTableLikeContext)_localctx).tableProps = tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(456);
				replaceTableHeader();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(457);
					match(T__1);
					setState(458);
					colTypeList();
					setState(459);
					match(T__2);
					}
				}

				setState(463);
				tableProvider();
				setState(464);
				createTableClauses();
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(465);
						match(AS);
						}
					}

					setState(468);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(471);
				match(ANALYZE);
				setState(472);
				match(TABLE);
				setState(473);
				multipartIdentifier();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(474);
					partitionSpec();
					}
				}

				setState(477);
				match(COMPUTE);
				setState(478);
				match(STATISTICS);
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(479);
					identifier();
					}
					break;
				case 2:
					{
					setState(480);
					match(FOR);
					setState(481);
					match(COLUMNS);
					setState(482);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(483);
					match(FOR);
					setState(484);
					match(ALL);
					setState(485);
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
				setState(488);
				match(ALTER);
				setState(489);
				match(TABLE);
				setState(490);
				multipartIdentifier();
				setState(491);
				match(ADD);
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(495);
				match(ALTER);
				setState(496);
				match(TABLE);
				setState(497);
				multipartIdentifier();
				setState(498);
				match(ADD);
				setState(499);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(500);
				match(T__1);
				setState(501);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(502);
				match(T__2);
				}
				break;
			case 17:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(504);
				match(ALTER);
				setState(505);
				match(TABLE);
				setState(506);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(507);
				match(RENAME);
				setState(508);
				match(COLUMN);
				setState(509);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(510);
				match(TO);
				setState(511);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 18:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(513);
				match(ALTER);
				setState(514);
				match(TABLE);
				setState(515);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(516);
				match(DROP);
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(518);
				match(T__1);
				setState(519);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(520);
				match(T__2);
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(522);
				match(ALTER);
				setState(523);
				match(TABLE);
				setState(524);
				((DropTableColumnsContext)_localctx).table = multipartIdentifier();
				setState(525);
				match(DROP);
				setState(526);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(527);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 20:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(529);
				match(ALTER);
				setState(530);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(532);
				match(RENAME);
				setState(533);
				match(TO);
				setState(534);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 21:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(536);
				match(ALTER);
				setState(537);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(538);
				multipartIdentifier();
				setState(539);
				match(SET);
				setState(540);
				match(TBLPROPERTIES);
				setState(541);
				tablePropertyList();
				}
				break;
			case 22:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(543);
				match(ALTER);
				setState(544);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(545);
				multipartIdentifier();
				setState(546);
				match(UNSET);
				setState(547);
				match(TBLPROPERTIES);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(548);
					match(IF);
					setState(549);
					match(EXISTS);
					}
				}

				setState(552);
				tablePropertyList();
				}
				break;
			case 23:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(554);
				match(ALTER);
				setState(555);
				match(TABLE);
				setState(556);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(557);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(558);
					match(COLUMN);
					}
					break;
				}
				setState(561);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(562);
					alterColumnAction();
					}
				}

				}
				break;
			case 24:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(565);
				match(ALTER);
				setState(566);
				match(TABLE);
				setState(567);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(568);
					partitionSpec();
					}
				}

				setState(571);
				match(CHANGE);
				setState(573);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(572);
					match(COLUMN);
					}
					break;
				}
				setState(575);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(576);
				colType();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(577);
					colPosition();
					}
				}

				}
				break;
			case 25:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(580);
				match(ALTER);
				setState(581);
				match(TABLE);
				setState(582);
				multipartIdentifier();
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(583);
					partitionSpec();
					}
				}

				setState(586);
				match(SET);
				setState(587);
				match(SERDE);
				setState(588);
				match(STRING);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(589);
					match(WITH);
					setState(590);
					match(SERDEPROPERTIES);
					setState(591);
					tablePropertyList();
					}
				}

				}
				break;
			case 26:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(594);
				match(ALTER);
				setState(595);
				match(TABLE);
				setState(596);
				multipartIdentifier();
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(597);
					partitionSpec();
					}
				}

				setState(600);
				match(SET);
				setState(601);
				match(SERDEPROPERTIES);
				setState(602);
				tablePropertyList();
				}
				break;
			case 27:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(604);
				match(ALTER);
				setState(605);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(606);
				multipartIdentifier();
				setState(607);
				match(ADD);
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(608);
					match(IF);
					setState(609);
					match(NOT);
					setState(610);
					match(EXISTS);
					}
				}

				setState(614); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(613);
					partitionSpecLocation();
					}
					}
					setState(616); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 28:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(618);
				match(ALTER);
				setState(619);
				match(TABLE);
				setState(620);
				multipartIdentifier();
				setState(621);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(622);
				match(RENAME);
				setState(623);
				match(TO);
				setState(624);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 29:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(626);
				match(ALTER);
				setState(627);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(628);
				multipartIdentifier();
				setState(629);
				match(DROP);
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(630);
					match(IF);
					setState(631);
					match(EXISTS);
					}
				}

				setState(634);
				partitionSpec();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(635);
					match(T__3);
					setState(636);
					partitionSpec();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(642);
					match(PURGE);
					}
				}

				}
				break;
			case 30:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(645);
				match(ALTER);
				setState(646);
				match(TABLE);
				setState(647);
				multipartIdentifier();
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(648);
					partitionSpec();
					}
				}

				setState(651);
				match(SET);
				setState(652);
				locationSpec();
				}
				break;
			case 31:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(654);
				match(ALTER);
				setState(655);
				match(TABLE);
				setState(656);
				multipartIdentifier();
				setState(657);
				match(RECOVER);
				setState(658);
				match(PARTITIONS);
				}
				break;
			case 32:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(660);
				match(DROP);
				setState(661);
				match(TABLE);
				setState(664);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(662);
					match(IF);
					setState(663);
					match(EXISTS);
					}
					break;
				}
				setState(666);
				multipartIdentifier();
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(667);
					match(PURGE);
					}
				}

				}
				break;
			case 33:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(670);
				match(DROP);
				setState(671);
				match(VIEW);
				setState(674);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(672);
					match(IF);
					setState(673);
					match(EXISTS);
					}
					break;
				}
				setState(676);
				multipartIdentifier();
				}
				break;
			case 34:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(677);
				match(CREATE);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(678);
					match(OR);
					setState(679);
					match(REPLACE);
					}
				}

				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(683);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(682);
						match(GLOBAL);
						}
					}

					setState(685);
					match(TEMPORARY);
					}
				}

				setState(688);
				match(VIEW);
				setState(692);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(689);
					match(IF);
					setState(690);
					match(NOT);
					setState(691);
					match(EXISTS);
					}
					break;
				}
				setState(694);
				multipartIdentifier();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(695);
					identifierCommentList();
					}
				}

				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(704);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(698);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(699);
						match(PARTITIONED);
						setState(700);
						match(ON);
						setState(701);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(702);
						match(TBLPROPERTIES);
						setState(703);
						tablePropertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(709);
				match(AS);
				setState(710);
				query();
				}
				break;
			case 35:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(712);
				match(CREATE);
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(713);
					match(OR);
					setState(714);
					match(REPLACE);
					}
				}

				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(717);
					match(GLOBAL);
					}
				}

				setState(720);
				match(TEMPORARY);
				setState(721);
				match(VIEW);
				setState(722);
				tableIdentifier();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(723);
					match(T__1);
					setState(724);
					colTypeList();
					setState(725);
					match(T__2);
					}
				}

				setState(729);
				tableProvider();
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(730);
					match(OPTIONS);
					setState(731);
					tablePropertyList();
					}
				}

				}
				break;
			case 36:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(734);
				match(ALTER);
				setState(735);
				match(VIEW);
				setState(736);
				multipartIdentifier();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(737);
					match(AS);
					}
				}

				setState(740);
				query();
				}
				break;
			case 37:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(742);
				match(CREATE);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(743);
					match(OR);
					setState(744);
					match(REPLACE);
					}
				}

				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(747);
					match(TEMPORARY);
					}
				}

				setState(750);
				match(FUNCTION);
				setState(754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(751);
					match(IF);
					setState(752);
					match(NOT);
					setState(753);
					match(EXISTS);
					}
					break;
				}
				setState(756);
				multipartIdentifier();
				setState(757);
				match(AS);
				setState(758);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(759);
					match(USING);
					setState(760);
					resource();
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(761);
						match(T__3);
						setState(762);
						resource();
						}
						}
						setState(767);
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
				setState(770);
				match(DROP);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(771);
					match(TEMPORARY);
					}
				}

				setState(774);
				match(FUNCTION);
				setState(777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(775);
					match(IF);
					setState(776);
					match(EXISTS);
					}
					break;
				}
				setState(779);
				multipartIdentifier();
				}
				break;
			case 39:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(780);
				match(EXPLAIN);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(781);
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
				setState(784);
				statement();
				}
				break;
			case 40:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(785);
				match(SHOW);
				setState(786);
				match(TABLES);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(787);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(788);
					multipartIdentifier();
					}
				}

				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(792);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(791);
						match(LIKE);
						}
					}

					setState(794);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 41:
				_localctx = new ShowTableContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(797);
				match(SHOW);
				setState(798);
				match(TABLE);
				setState(799);
				match(EXTENDED);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(800);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(801);
					((ShowTableContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(804);
				match(LIKE);
				setState(805);
				((ShowTableContext)_localctx).pattern = match(STRING);
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(806);
					partitionSpec();
					}
				}

				}
				break;
			case 42:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(809);
				match(SHOW);
				setState(810);
				match(TBLPROPERTIES);
				setState(811);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(816);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(812);
					match(T__1);
					setState(813);
					((ShowTblPropertiesContext)_localctx).key = tablePropertyKey();
					setState(814);
					match(T__2);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(818);
				match(SHOW);
				setState(819);
				match(COLUMNS);
				setState(820);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(821);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
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
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(826);
				match(SHOW);
				setState(827);
				match(VIEWS);
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(828);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(829);
					multipartIdentifier();
					}
				}

				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(832);
						match(LIKE);
						}
					}

					setState(835);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(838);
				match(SHOW);
				setState(839);
				match(PARTITIONS);
				setState(840);
				multipartIdentifier();
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(841);
					partitionSpec();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(844);
				match(SHOW);
				setState(846);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(845);
					identifier();
					}
					break;
				}
				setState(848);
				match(FUNCTIONS);
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(850);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(849);
						match(LIKE);
						}
						break;
					}
					setState(854);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(852);
						multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(853);
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
				setState(858);
				match(SHOW);
				setState(859);
				match(CREATE);
				setState(860);
				match(TABLE);
				setState(861);
				multipartIdentifier();
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(862);
					match(AS);
					setState(863);
					match(SERDE);
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(866);
				match(SHOW);
				setState(867);
				match(CURRENT);
				setState(868);
				match(NAMESPACE);
				}
				break;
			case 49:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(869);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(870);
				match(FUNCTION);
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(871);
					match(EXTENDED);
					}
					break;
				}
				setState(874);
				describeFuncName();
				}
				break;
			case 50:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(875);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(876);
				namespace();
				setState(878);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(877);
					match(EXTENDED);
					}
					break;
				}
				setState(880);
				multipartIdentifier();
				}
				break;
			case 51:
				_localctx = new DescribeDeltaDetailContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(882);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(883);
				match(DETAIL);
				setState(884);
				((DescribeDeltaDetailContext)_localctx).table = multipartIdentifier();
				}
				break;
			case 52:
				_localctx = new DescribeDeltaHistoryContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(885);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(886);
				match(HISTORY);
				setState(887);
				((DescribeDeltaHistoryContext)_localctx).table = multipartIdentifier();
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(888);
					match(LIMIT);
					setState(889);
					((DescribeDeltaHistoryContext)_localctx).limit = match(INTEGER_VALUE);
					}
				}

				}
				break;
			case 53:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(892);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(893);
					match(TABLE);
					}
					break;
				}
				setState(897);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(896);
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
				setState(899);
				multipartIdentifier();
				setState(901);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(900);
					partitionSpec();
					}
					break;
				}
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(903);
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
				setState(906);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(907);
					match(QUERY);
					}
				}

				setState(910);
				query();
				}
				break;
			case 55:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(911);
				match(COMMENT);
				setState(912);
				match(ON);
				setState(913);
				namespace();
				setState(914);
				multipartIdentifier();
				setState(915);
				match(IS);
				setState(916);
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
				setState(918);
				match(COMMENT);
				setState(919);
				match(ON);
				setState(920);
				match(TABLE);
				setState(921);
				multipartIdentifier();
				setState(922);
				match(IS);
				setState(923);
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
				setState(925);
				match(REFRESH);
				setState(926);
				match(TABLE);
				setState(927);
				multipartIdentifier();
				}
				break;
			case 58:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(928);
				match(REFRESH);
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(929);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(933);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(930);
							matchWildcard();
							}
							} 
						}
						setState(935);
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
				setState(938);
				match(CACHE);
				setState(940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(939);
					match(LAZY);
					}
				}

				setState(942);
				match(TABLE);
				setState(943);
				multipartIdentifier();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(944);
					match(OPTIONS);
					setState(945);
					((CacheTableContext)_localctx).options = tablePropertyList();
					}
				}

				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==AS || _la==FROM || _la==MAP || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (REDUCE - 192)) | (1L << (SELECT - 192)) | (1L << (TABLE - 192)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(948);
						match(AS);
						}
					}

					setState(951);
					query();
					}
				}

				}
				break;
			case 60:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(954);
				match(UNCACHE);
				setState(955);
				match(TABLE);
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(956);
					match(IF);
					setState(957);
					match(EXISTS);
					}
					break;
				}
				setState(960);
				multipartIdentifier();
				}
				break;
			case 61:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(961);
				match(CLEAR);
				setState(962);
				match(CACHE);
				}
				break;
			case 62:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(963);
				match(LOAD);
				setState(964);
				match(DATA);
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(965);
					match(LOCAL);
					}
				}

				setState(968);
				match(INPATH);
				setState(969);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(970);
					match(OVERWRITE);
					}
				}

				setState(973);
				match(INTO);
				setState(974);
				match(TABLE);
				setState(975);
				multipartIdentifier();
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(976);
					partitionSpec();
					}
				}

				}
				break;
			case 63:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(979);
				match(TRUNCATE);
				setState(980);
				match(TABLE);
				setState(981);
				multipartIdentifier();
				setState(983);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(982);
					partitionSpec();
					}
				}

				}
				break;
			case 64:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(985);
				match(MSCK);
				setState(986);
				match(REPAIR);
				setState(987);
				match(TABLE);
				setState(988);
				multipartIdentifier();
				}
				break;
			case 65:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(989);
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
				setState(990);
				identifier();
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(991);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(995);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(992);
							matchWildcard();
							}
							} 
						}
						setState(997);
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
				setState(1000);
				match(SET);
				setState(1001);
				match(ROLE);
				setState(1005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1002);
						matchWildcard();
						}
						} 
					}
					setState(1007);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
				}
				}
				break;
			case 67:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1008);
				match(SET);
				setState(1012);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1009);
						matchWildcard();
						}
						} 
					}
					setState(1014);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1015);
				match(RESET);
				}
				break;
			case 69:
				_localctx = new MergeTableContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1016);
				match(MERGE);
				setState(1017);
				match(TABLE);
				setState(1018);
				multipartIdentifier();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1019);
					partitionSpec();
					}
				}

				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1022);
					match(OPTIONS);
					setState(1023);
					((MergeTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 70:
				_localctx = new KillJobContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1026);
				match(KILL);
				setState(1027);
				match(JOB);
				setState(1028);
				identifier();
				}
				break;
			case 71:
				_localctx = new AddJarContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1029);
				match(ADDJAR);
				setState(1030);
				((AddJarContext)_localctx).jar = identifier();
				}
				break;
			case 72:
				_localctx = new ReadTableContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1031);
				match(READ);
				setState(1032);
				match(TABLE);
				setState(1033);
				multipartIdentifier();
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1034);
					partitionSpec();
					}
				}

				setState(1037);
				match(LIMIT);
				setState(1038);
				number();
				}
				break;
			case 73:
				_localctx = new LoadTempTableContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1040);
				match(LOAD);
				setState(1041);
				match(DATA);
				setState(1042);
				((LoadTempTableContext)_localctx).path = constant();
				setState(1043);
				match(TABLE);
				setState(1044);
				multipartIdentifier();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1045);
					match(OPTIONS);
					setState(1046);
					((LoadTempTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 74:
				_localctx = new ExportTableContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1049);
					ctes();
					}
				}

				setState(1052);
				match(EXPORT);
				setState(1053);
				match(TABLE);
				setState(1054);
				multipartIdentifier();
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1055);
					partitionSpec();
					}
				}

				setState(1058);
				match(TO);
				setState(1059);
				((ExportTableContext)_localctx).name = constant();
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1060);
					match(OPTIONS);
					setState(1061);
					((ExportTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 75:
				_localctx = new CompressTableContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1064);
				match(COMPRESS);
				setState(1065);
				match(TABLE);
				setState(1066);
				multipartIdentifier();
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1067);
					partitionSpec();
					}
				}

				setState(1072);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1070);
					match(OPTIONS);
					setState(1071);
					((CompressTableContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 76:
				_localctx = new CompressFileContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1074);
				match(COMPRESS);
				setState(1075);
				match(FILE);
				setState(1076);
				((CompressFileContext)_localctx).path = constant();
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1077);
					match(OPTIONS);
					setState(1078);
					((CompressFileContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 77:
				_localctx = new DataxExprContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1081);
				match(DATAX);
				setState(1082);
				match(READER);
				setState(1083);
				match(T__1);
				setState(1084);
				((DataxExprContext)_localctx).srcName = match(STRING);
				setState(1085);
				match(T__2);
				setState(1086);
				match(OPTIONS);
				setState(1087);
				((DataxExprContext)_localctx).readOpts = tablePropertyList();
				setState(1088);
				match(WRITER);
				setState(1089);
				match(T__1);
				setState(1090);
				((DataxExprContext)_localctx).distName = match(STRING);
				setState(1091);
				match(T__2);
				setState(1092);
				match(OPTIONS);
				setState(1093);
				((DataxExprContext)_localctx).writeOpts = tablePropertyList();
				}
				break;
			case 78:
				_localctx = new VacuumTableContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1095);
				match(VACUUM);
				setState(1096);
				((VacuumTableContext)_localctx).table = multipartIdentifier();
				setState(1101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETAIN) {
					{
					setState(1097);
					match(RETAIN);
					setState(1098);
					((VacuumTableContext)_localctx).num = number();
					setState(1099);
					match(HOURS);
					}
				}

				setState(1105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DRY) {
					{
					setState(1103);
					match(DRY);
					setState(1104);
					match(RUN);
					}
				}

				}
				break;
			case 79:
				_localctx = new DeltaConvertContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1107);
				match(CONVERT);
				setState(1108);
				match(TO);
				setState(1109);
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
				setState(1110);
				((DeltaConvertContext)_localctx).table = multipartIdentifier();
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITIONED) {
					{
					setState(1111);
					match(PARTITIONED);
					setState(1112);
					match(BY);
					setState(1113);
					match(T__1);
					setState(1114);
					colTypeList();
					setState(1115);
					match(T__2);
					}
				}

				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1119);
					match(OPTIONS);
					setState(1120);
					((DeltaConvertContext)_localctx).options = tablePropertyList();
					}
				}

				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1123);
				unsupportedHiveNativeCommands();
				setState(1127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1124);
						matchWildcard();
						}
						} 
					}
					setState(1129);
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
		enterRule(_localctx, 16, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1133);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1134);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1135);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1137);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1141);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1144);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1145);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1146);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1148);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1191);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1194);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1195);
				tableIdentifier();
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1197);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1200);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1201);
				tableIdentifier();
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1203);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1206);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1207);
				tableIdentifier();
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1209);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1212);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1213);
				tableIdentifier();
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1215);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1217);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1218);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1219);
				tableIdentifier();
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1221);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1225);
				tableIdentifier();
				setState(1226);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1229);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1232);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1233);
				tableIdentifier();
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1236);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1239);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1240);
				tableIdentifier();
				setState(1241);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1242);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1244);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1245);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1246);
				tableIdentifier();
				setState(1247);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1248);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1250);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1251);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1252);
				tableIdentifier();
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1254);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1256);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1258);
				tableIdentifier();
				setState(1259);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1261);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1262);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1263);
				tableIdentifier();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1264);
					partitionSpec();
					}
				}

				setState(1267);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1269);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1270);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1271);
				tableIdentifier();
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1272);
					partitionSpec();
					}
				}

				setState(1275);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1277);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1278);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1279);
				tableIdentifier();
				setState(1281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1280);
					partitionSpec();
					}
				}

				setState(1283);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1284);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1286);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1287);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1288);
				tableIdentifier();
				setState(1290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1289);
					partitionSpec();
					}
				}

				setState(1292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1293);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1295);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1296);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1297);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1298);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1299);
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
		enterRule(_localctx, 18, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			match(CREATE);
			setState(1304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1303);
				match(TEMPORARY);
				}
			}

			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1306);
				match(EXTERNAL);
				}
			}

			setState(1309);
			match(TABLE);
			setState(1313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				setState(1310);
				match(IF);
				setState(1311);
				match(NOT);
				setState(1312);
				match(EXISTS);
				}
				break;
			}
			setState(1315);
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
		enterRule(_localctx, 20, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1317);
				match(CREATE);
				setState(1318);
				match(OR);
				}
			}

			setState(1321);
			match(REPLACE);
			setState(1322);
			match(TABLE);
			setState(1323);
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
		enterRule(_localctx, 22, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1325);
			match(CLUSTERED);
			setState(1326);
			match(BY);
			setState(1327);
			identifierList();
			setState(1331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1328);
				match(SORTED);
				setState(1329);
				match(BY);
				setState(1330);
				orderedIdentifierList();
				}
			}

			setState(1333);
			match(INTO);
			setState(1334);
			match(INTEGER_VALUE);
			setState(1335);
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
		enterRule(_localctx, 24, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1337);
			match(SKEWED);
			setState(1338);
			match(BY);
			setState(1339);
			identifierList();
			setState(1340);
			match(ON);
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				{
				setState(1341);
				constantList();
				}
				break;
			case 2:
				{
				setState(1342);
				nestedConstantList();
				}
				break;
			}
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1345);
				match(STORED);
				setState(1346);
				match(AS);
				setState(1347);
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
		enterRule(_localctx, 26, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			match(LOCATION);
			setState(1351);
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
		enterRule(_localctx, 28, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			match(COMMENT);
			setState(1354);
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
		enterRule(_localctx, 30, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1356);
				ctes();
				}
			}

			setState(1359);
			queryTerm(0);
			setState(1360);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
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
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
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
			setState(1423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				match(INSERT);
				setState(1363);
				match(OVERWRITE);
				setState(1365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1364);
					match(TABLE);
					}
					break;
				}
				setState(1367);
				multipartIdentifier();
				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1368);
					partitionSpec();
					setState(1372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1369);
						match(IF);
						setState(1370);
						match(NOT);
						setState(1371);
						match(EXISTS);
						}
					}

					}
				}

				setState(1377);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1376);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1379);
				match(INSERT);
				setState(1380);
				match(INTO);
				setState(1382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1381);
					match(TABLE);
					}
					break;
				}
				setState(1384);
				multipartIdentifier();
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1385);
					partitionSpec();
					}
				}

				setState(1391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1388);
					match(IF);
					setState(1389);
					match(NOT);
					setState(1390);
					match(EXISTS);
					}
				}

				setState(1394);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1393);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1396);
				match(INSERT);
				setState(1397);
				match(OVERWRITE);
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1398);
					match(LOCAL);
					}
				}

				setState(1401);
				match(DIRECTORY);
				setState(1402);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1403);
					rowFormat();
					}
				}

				setState(1407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1406);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1409);
				match(INSERT);
				setState(1410);
				match(OVERWRITE);
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1411);
					match(LOCAL);
					}
				}

				setState(1414);
				match(DIRECTORY);
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1415);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1418);
				tableProvider();
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1419);
					match(OPTIONS);
					setState(1420);
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
			setState(1425);
			partitionSpec();
			setState(1427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1426);
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
			setState(1429);
			match(PARTITION);
			setState(1430);
			match(T__1);
			setState(1431);
			partitionVal();
			setState(1436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1432);
				match(T__3);
				setState(1433);
				partitionVal();
				}
				}
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1439);
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
		enterRule(_localctx, 38, RULE_partitionVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			identifier();
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(1442);
				match(EQ);
				setState(1443);
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
		enterRule(_localctx, 40, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1446);
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
		enterRule(_localctx, 42, RULE_describeFuncName);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1448);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1449);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1452);
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
		enterRule(_localctx, 44, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(1456);
				match(T__4);
				setState(1457);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1462);
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
		enterRule(_localctx, 46, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			match(WITH);
			setState(1464);
			namedQuery();
			setState(1469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1465);
				match(T__3);
				setState(1466);
				namedQuery();
				}
				}
				setState(1471);
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
		enterRule(_localctx, 48, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				{
				setState(1473);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1476);
				match(AS);
				}
			}

			setState(1479);
			match(T__1);
			setState(1480);
			query();
			setState(1481);
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
		enterRule(_localctx, 50, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(USING);
			setState(1484);
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
		enterRule(_localctx, 52, RULE_createTableClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLUSTERED || _la==COMMENT || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (LIFECYCLE - 141)) | (1L << (LOCATION - 141)) | (1L << (OPTIONS - 141)) | (1L << (PARTITIONED - 141)))) != 0) || _la==TBLPROPERTIES) {
				{
				setState(1498);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONS:
					{
					{
					setState(1486);
					match(OPTIONS);
					setState(1487);
					((CreateTableClausesContext)_localctx).options = tablePropertyList();
					}
					}
					break;
				case PARTITIONED:
					{
					{
					setState(1488);
					match(PARTITIONED);
					setState(1489);
					match(BY);
					setState(1490);
					((CreateTableClausesContext)_localctx).partitioning = transformList();
					}
					}
					break;
				case CLUSTERED:
					{
					setState(1491);
					bucketSpec();
					}
					break;
				case LOCATION:
					{
					setState(1492);
					locationSpec();
					}
					break;
				case COMMENT:
					{
					setState(1493);
					commentSpec();
					}
					break;
				case LIFECYCLE:
					{
					{
					setState(1494);
					match(LIFECYCLE);
					setState(1495);
					((CreateTableClausesContext)_localctx).lifecycle = match(INTEGER_VALUE);
					}
					}
					break;
				case TBLPROPERTIES:
					{
					{
					setState(1496);
					match(TBLPROPERTIES);
					setState(1497);
					((CreateTableClausesContext)_localctx).tableProps = tablePropertyList();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1502);
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
		enterRule(_localctx, 54, RULE_tablePropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
			match(T__1);
			setState(1504);
			tableProperty();
			setState(1509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1505);
				match(T__3);
				setState(1506);
				tableProperty();
				}
				}
				setState(1511);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1512);
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
		enterRule(_localctx, 56, RULE_tableProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514);
			((TablePropertyContext)_localctx).key = tablePropertyKey();
			setState(1519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (TRUE - 247)) | (1L << (EQ - 247)) | (1L << (STRING - 247)) | (1L << (INTEGER_VALUE - 247)) | (1L << (DECIMAL_VALUE - 247)))) != 0)) {
				{
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1515);
					match(EQ);
					}
				}

				setState(1518);
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
		enterRule(_localctx, 58, RULE_tablePropertyKey);
		int _la;
		try {
			setState(1530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1521);
				identifier();
				setState(1526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(1522);
					match(T__4);
					setState(1523);
					identifier();
					}
					}
					setState(1528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1529);
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
		enterRule(_localctx, 60, RULE_tablePropertyValue);
		try {
			setState(1536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1534);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1535);
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
		enterRule(_localctx, 62, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538);
			match(T__1);
			setState(1539);
			constant();
			setState(1544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1540);
				match(T__3);
				setState(1541);
				constant();
				}
				}
				setState(1546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1547);
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
		enterRule(_localctx, 64, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1549);
			match(T__1);
			setState(1550);
			constantList();
			setState(1555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1551);
				match(T__3);
				setState(1552);
				constantList();
				}
				}
				setState(1557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1558);
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
		enterRule(_localctx, 66, RULE_createFileFormat);
		try {
			setState(1566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				match(STORED);
				setState(1561);
				match(AS);
				setState(1562);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1563);
				match(STORED);
				setState(1564);
				match(BY);
				setState(1565);
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
		enterRule(_localctx, 68, RULE_fileFormat);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1568);
				match(INPUTFORMAT);
				setState(1569);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1570);
				match(OUTPUTFORMAT);
				setState(1571);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1572);
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
		enterRule(_localctx, 70, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			match(STRING);
			setState(1579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				{
				setState(1576);
				match(WITH);
				setState(1577);
				match(SERDEPROPERTIES);
				setState(1578);
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
		enterRule(_localctx, 72, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			identifier();
			setState(1582);
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
		enterRule(_localctx, 74, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1584);
				insertInto();
				setState(1585);
				queryTerm(0);
				setState(1586);
				queryOrganization();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1588);
				fromClause();
				setState(1590); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1589);
					multiInsertQueryBody();
					}
					}
					setState(1592); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1594);
				match(DELETE);
				setState(1595);
				match(FROM);
				setState(1596);
				multipartIdentifier();
				setState(1597);
				tableAlias();
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1598);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1601);
				match(UPDATE);
				setState(1602);
				multipartIdentifier();
				setState(1603);
				tableAlias();
				setState(1604);
				setClause();
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1605);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1608);
				match(MERGE);
				setState(1609);
				match(INTO);
				setState(1610);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1611);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1612);
				match(USING);
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1613);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1614);
					match(T__1);
					setState(1615);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1616);
					match(T__2);
					}
					break;
				}
				setState(1620);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1621);
				match(ON);
				setState(1622);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1623);
						matchedClause();
						}
						} 
					}
					setState(1628);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				setState(1632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1629);
					notMatchedClause();
					}
					}
					setState(1634);
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
		enterRule(_localctx, 76, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1637);
				match(ORDER);
				setState(1638);
				match(BY);
				setState(1639);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1644);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1640);
						match(T__3);
						setState(1641);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1646);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
				}
				}
				break;
			}
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1649);
				match(CLUSTER);
				setState(1650);
				match(BY);
				setState(1651);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1656);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1652);
						match(T__3);
						setState(1653);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1658);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,186,_ctx);
				}
				}
				break;
			}
			setState(1671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1661);
				match(DISTRIBUTE);
				setState(1662);
				match(BY);
				setState(1663);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1668);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1664);
						match(T__3);
						setState(1665);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1670);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
				}
				}
				break;
			}
			setState(1683);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
			case 1:
				{
				setState(1673);
				match(SORT);
				setState(1674);
				match(BY);
				setState(1675);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1676);
						match(T__3);
						setState(1677);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1682);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,190,_ctx);
				}
				}
				break;
			}
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1685);
				windowClause();
				}
				break;
			}
			setState(1693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1688);
				match(LIMIT);
				setState(1691);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1689);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1690);
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
		enterRule(_localctx, 78, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			insertInto();
			setState(1696);
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
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1699);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1722);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1701);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1702);
						if (!(legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enbled");
						setState(1703);
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
						setState(1705);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1704);
							setQuantifier();
							}
						}

						setState(1707);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1708);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1709);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1710);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1712);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1711);
							setQuantifier();
							}
						}

						setState(1714);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1715);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1716);
						if (!(!legacy_setops_precedence_enbled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enbled");
						setState(1717);
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
						setState(1719);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1718);
							setQuantifier();
							}
						}

						setState(1721);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
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
		enterRule(_localctx, 82, RULE_queryPrimary);
		try {
			setState(1736);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1727);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1728);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1729);
				match(TABLE);
				setState(1730);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1731);
				inlineTable();
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1732);
				match(T__1);
				setState(1733);
				query();
				setState(1734);
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
		enterRule(_localctx, 84, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			expression();
			setState(1740);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1739);
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
			setState(1744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1742);
				match(NULLS);
				setState(1743);
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
		enterRule(_localctx, 86, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			fromClause();
			setState(1748); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1747);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1750); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
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
		enterRule(_localctx, 88, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1752);
				transformClause();
				setState(1754);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1753);
					whereClause();
					}
					break;
				}
				setState(1756);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1758);
				selectClause();
				setState(1762);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1759);
						lateralView();
						}
						} 
					}
					setState(1764);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				setState(1766);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1765);
					whereClause();
					}
					break;
				}
				setState(1769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1768);
					aggregationClause();
					}
					break;
				}
				setState(1772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1771);
					havingClause();
					}
					break;
				}
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1774);
					windowClause();
					}
					break;
				}
				setState(1777);
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
		enterRule(_localctx, 90, RULE_querySpecification);
		try {
			int _alt;
			setState(1810);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1781);
				transformClause();
				setState(1783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1782);
					fromClause();
					}
					break;
				}
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1785);
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
				setState(1788);
				selectClause();
				setState(1790);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1789);
					fromClause();
					}
					break;
				}
				setState(1795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1792);
						lateralView();
						}
						} 
					}
					setState(1797);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				}
				setState(1799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1798);
					whereClause();
					}
					break;
				}
				setState(1802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1801);
					aggregationClause();
					}
					break;
				}
				setState(1805);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1804);
					havingClause();
					}
					break;
				}
				setState(1808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1807);
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
		enterRule(_localctx, 92, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1812);
				match(SELECT);
				setState(1813);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1814);
				match(T__1);
				setState(1815);
				namedExpressionSeq();
				setState(1816);
				match(T__2);
				}
				break;
			case MAP:
				{
				setState(1818);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1819);
				namedExpressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1820);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1821);
				namedExpressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1824);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1827);
				match(RECORDWRITER);
				setState(1828);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1831);
			match(USING);
			setState(1832);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1833);
				match(AS);
				setState(1843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
				case 1:
					{
					setState(1834);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1835);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1836);
					match(T__1);
					setState(1839);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
					case 1:
						{
						setState(1837);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1838);
						colTypeList();
						}
						break;
					}
					setState(1841);
					match(T__2);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1848);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				{
				setState(1847);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1850);
				match(RECORDREADER);
				setState(1851);
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
		enterRule(_localctx, 94, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			match(SELECT);
			setState(1858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1855);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,228,_ctx);
			}
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1861);
				setQuantifier();
				}
				break;
			}
			setState(1864);
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
		enterRule(_localctx, 96, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(SET);
			setState(1867);
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
		enterRule(_localctx, 98, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			match(WHEN);
			setState(1870);
			match(MATCHED);
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1871);
				match(AND);
				setState(1872);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1875);
			match(THEN);
			setState(1876);
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
		enterRule(_localctx, 100, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1878);
			match(WHEN);
			setState(1879);
			match(NOT);
			setState(1880);
			match(MATCHED);
			setState(1883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1881);
				match(AND);
				setState(1882);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1885);
			match(THEN);
			setState(1886);
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
		enterRule(_localctx, 102, RULE_matchedAction);
		try {
			setState(1895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1888);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				match(UPDATE);
				setState(1890);
				match(SET);
				setState(1891);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1892);
				match(UPDATE);
				setState(1893);
				match(SET);
				setState(1894);
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
		enterRule(_localctx, 104, RULE_notMatchedAction);
		int _la;
		try {
			setState(1915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				match(INSERT);
				setState(1898);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(INSERT);
				setState(1900);
				match(T__1);
				setState(1901);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1902);
				match(T__2);
				setState(1903);
				match(VALUES);
				setState(1904);
				match(T__1);
				setState(1905);
				expression();
				setState(1910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1906);
					match(T__3);
					setState(1907);
					expression();
					}
					}
					setState(1912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1913);
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
		enterRule(_localctx, 106, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			assignment();
			setState(1922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(1918);
				match(T__3);
				setState(1919);
				assignment();
				}
				}
				setState(1924);
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
		enterRule(_localctx, 108, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1926);
			match(EQ);
			setState(1927);
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
		enterRule(_localctx, 110, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(WHERE);
			setState(1930);
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
		enterRule(_localctx, 112, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			match(HAVING);
			setState(1933);
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
		enterRule(_localctx, 114, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(T__5);
			setState(1936);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1943);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1938);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
					case 1:
						{
						setState(1937);
						match(T__3);
						}
						break;
					}
					setState(1940);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1945);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,237,_ctx);
			}
			setState(1946);
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
		enterRule(_localctx, 116, RULE_hintStatement);
		int _la;
		try {
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1949);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1950);
				match(T__1);
				setState(1951);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(1952);
					match(T__3);
					setState(1953);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1958);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1959);
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
		enterRule(_localctx, 118, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			match(FROM);
			setState(1964);
			relation();
			setState(1969);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1965);
					match(T__3);
					setState(1966);
					relation();
					}
					} 
				}
				setState(1971);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			setState(1975);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1972);
					lateralView();
					}
					} 
				}
				setState(1977);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			setState(1979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				{
				setState(1978);
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
		enterRule(_localctx, 120, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1981);
				match(GROUP);
				setState(1982);
				match(BY);
				setState(1983);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(1988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1984);
						match(T__3);
						setState(1985);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(1990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
				}
				setState(2008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
				case 1:
					{
					setState(1991);
					match(WITH);
					setState(1992);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(1993);
					match(WITH);
					setState(1994);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(1995);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(1996);
					match(SETS);
					setState(1997);
					match(T__1);
					setState(1998);
					groupingSet();
					setState(2003);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(1999);
						match(T__3);
						setState(2000);
						groupingSet();
						}
						}
						setState(2005);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2006);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				match(GROUP);
				setState(2011);
				match(BY);
				setState(2012);
				((AggregationClauseContext)_localctx).kind = match(GROUPING);
				setState(2013);
				match(SETS);
				setState(2014);
				match(T__1);
				setState(2015);
				groupingSet();
				setState(2020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2016);
					match(T__3);
					setState(2017);
					groupingSet();
					}
					}
					setState(2022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2023);
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
		enterRule(_localctx, 122, RULE_groupingSet);
		int _la;
		try {
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				match(T__1);
				setState(2036);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2028);
					expression();
					setState(2033);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2029);
						match(T__3);
						setState(2030);
						expression();
						}
						}
						setState(2035);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2038);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2039);
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
		enterRule(_localctx, 124, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2042);
			match(PIVOT);
			setState(2043);
			match(T__1);
			setState(2044);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2045);
			match(FOR);
			setState(2046);
			pivotColumn();
			setState(2047);
			match(IN);
			setState(2048);
			match(T__1);
			setState(2049);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2054);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2050);
				match(T__3);
				setState(2051);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2056);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2057);
			match(T__2);
			setState(2058);
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
		enterRule(_localctx, 126, RULE_pivotColumn);
		int _la;
		try {
			setState(2072);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2060);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				match(T__1);
				setState(2062);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2063);
					match(T__3);
					setState(2064);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2069);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2070);
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
		enterRule(_localctx, 128, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2074);
			expression();
			setState(2079);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
			case 1:
				{
				setState(2076);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2075);
					match(AS);
					}
					break;
				}
				setState(2078);
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
		enterRule(_localctx, 130, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2081);
			match(LATERAL);
			setState(2082);
			match(VIEW);
			setState(2084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2083);
				match(OUTER);
				}
				break;
			}
			setState(2086);
			qualifiedName();
			setState(2087);
			match(T__1);
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				{
				setState(2088);
				expression();
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2089);
					match(T__3);
					setState(2090);
					expression();
					}
					}
					setState(2095);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2098);
			match(T__2);
			setState(2099);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				{
				setState(2101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2100);
					match(AS);
					}
					break;
				}
				setState(2103);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2104);
						match(T__3);
						setState(2105);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
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
		enterRule(_localctx, 132, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2113);
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
		enterRule(_localctx, 134, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2115);
			relationPrimary();
			setState(2119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2116);
					joinRelation();
					}
					} 
				}
				setState(2121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,262,_ctx);
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
		enterRule(_localctx, 136, RULE_joinRelation);
		try {
			setState(2133);
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
				setState(2122);
				joinType();
				}
				setState(2123);
				match(JOIN);
				setState(2124);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2125);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2128);
				match(NATURAL);
				setState(2129);
				joinType();
				setState(2130);
				match(JOIN);
				setState(2131);
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
		enterRule(_localctx, 138, RULE_joinType);
		int _la;
		try {
			setState(2159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2135);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2138);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2139);
				match(LEFT);
				setState(2141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2140);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2143);
					match(LEFT);
					}
				}

				setState(2146);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2147);
				match(RIGHT);
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2148);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2151);
				match(FULL);
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2152);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2155);
					match(LEFT);
					}
				}

				setState(2158);
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
		enterRule(_localctx, 140, RULE_joinCriteria);
		try {
			setState(2165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2161);
				match(ON);
				setState(2162);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				match(USING);
				setState(2164);
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
		enterRule(_localctx, 142, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2167);
			match(TABLESAMPLE);
			setState(2168);
			match(T__1);
			setState(2170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
			case 1:
				{
				setState(2169);
				sampleMethod();
				}
				break;
			}
			setState(2172);
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
		enterRule(_localctx, 144, RULE_sampleMethod);
		int _la;
		try {
			setState(2198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2174);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2177);
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
				setState(2178);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				expression();
				setState(2180);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2182);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2183);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2184);
				match(OUT);
				setState(2185);
				match(OF);
				setState(2186);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2187);
					match(ON);
					setState(2193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
					case 1:
						{
						setState(2188);
						identifier();
						}
						break;
					case 2:
						{
						setState(2189);
						qualifiedName();
						setState(2190);
						match(T__1);
						setState(2191);
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
				setState(2197);
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
		enterRule(_localctx, 146, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			match(T__1);
			setState(2201);
			identifierSeq();
			setState(2202);
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
		enterRule(_localctx, 148, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2204);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2205);
					match(T__3);
					setState(2206);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,278,_ctx);
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
		enterRule(_localctx, 150, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2212);
			match(T__1);
			setState(2213);
			orderedIdentifier();
			setState(2218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2214);
				match(T__3);
				setState(2215);
				orderedIdentifier();
				}
				}
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2221);
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
		enterRule(_localctx, 152, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2223);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2224);
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
		enterRule(_localctx, 154, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2227);
			match(T__1);
			setState(2228);
			identifierComment();
			setState(2233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2229);
				match(T__3);
				setState(2230);
				identifierComment();
				}
				}
				setState(2235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2236);
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
		enterRule(_localctx, 156, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			identifier();
			setState(2240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2239);
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
		enterRule(_localctx, 158, RULE_relationPrimary);
		try {
			setState(2266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2242);
				multipartIdentifier();
				setState(2244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2243);
					sample();
					}
					break;
				}
				setState(2246);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				match(T__1);
				setState(2249);
				query();
				setState(2250);
				match(T__2);
				setState(2252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
				case 1:
					{
					setState(2251);
					sample();
					}
					break;
				}
				setState(2254);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2256);
				match(T__1);
				setState(2257);
				relation();
				setState(2258);
				match(T__2);
				setState(2260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2259);
					sample();
					}
					break;
				}
				setState(2262);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2264);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2265);
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
		enterRule(_localctx, 160, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2268);
			match(VALUES);
			setState(2269);
			expression();
			setState(2274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2270);
					match(T__3);
					setState(2271);
					expression();
					}
					} 
				}
				setState(2276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			setState(2277);
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
		enterRule(_localctx, 162, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			((FunctionTableContext)_localctx).funcName = errorCapturingIdentifier();
			setState(2280);
			match(T__1);
			setState(2289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				{
				setState(2281);
				expression();
				setState(2286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2282);
					match(T__3);
					setState(2283);
					expression();
					}
					}
					setState(2288);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2291);
			match(T__2);
			setState(2292);
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
		enterRule(_localctx, 164, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2294);
					match(AS);
					}
					break;
				}
				setState(2297);
				strictIdentifier();
				setState(2299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
				case 1:
					{
					setState(2298);
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
		enterRule(_localctx, 166, RULE_rowFormat);
		try {
			setState(2352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2303);
				match(ROW);
				setState(2304);
				match(FORMAT);
				setState(2305);
				match(SERDE);
				setState(2306);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
				case 1:
					{
					setState(2307);
					match(WITH);
					setState(2308);
					match(SERDEPROPERTIES);
					setState(2309);
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
				setState(2312);
				match(ROW);
				setState(2313);
				match(FORMAT);
				setState(2314);
				match(DELIMITED);
				setState(2324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2315);
					match(FIELDS);
					setState(2316);
					match(TERMINATED);
					setState(2317);
					match(BY);
					setState(2318);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						setState(2319);
						match(ESCAPED);
						setState(2320);
						match(BY);
						setState(2321);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,296,_ctx) ) {
				case 1:
					{
					setState(2326);
					match(COLLECTION);
					setState(2327);
					match(ITEMS);
					setState(2328);
					match(TERMINATED);
					setState(2329);
					match(BY);
					setState(2330);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2333);
					match(MAP);
					setState(2334);
					match(KEYS);
					setState(2335);
					match(TERMINATED);
					setState(2336);
					match(BY);
					setState(2337);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2340);
					match(LINES);
					setState(2341);
					match(TERMINATED);
					setState(2342);
					match(BY);
					setState(2343);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2350);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2346);
					match(NULL);
					setState(2347);
					match(DEFINED);
					setState(2348);
					match(AS);
					setState(2349);
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
		enterRule(_localctx, 168, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			multipartIdentifier();
			setState(2359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2355);
				match(T__3);
				setState(2356);
				multipartIdentifier();
				}
				}
				setState(2361);
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
		enterRule(_localctx, 170, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2363);
					match(T__4);
					setState(2364);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
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
		enterRule(_localctx, 172, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2370);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2371);
				match(T__4);
				}
				break;
			}
			setState(2375);
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
		enterRule(_localctx, 174, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2377);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2378);
				match(T__4);
				}
				break;
			}
			setState(2382);
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
		enterRule(_localctx, 176, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2384);
			expression();
			setState(2392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2385);
					match(AS);
					}
					break;
				}
				setState(2390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2388);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2389);
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
		enterRule(_localctx, 178, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			namedExpression();
			setState(2399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2395);
					match(T__3);
					setState(2396);
					namedExpression();
					}
					} 
				}
				setState(2401);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,308,_ctx);
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
		enterRule(_localctx, 180, RULE_transformList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2402);
			match(T__1);
			setState(2403);
			((TransformListContext)_localctx).transform = transform();
			((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
			setState(2408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2404);
				match(T__3);
				setState(2405);
				((TransformListContext)_localctx).transform = transform();
				((TransformListContext)_localctx).transforms.add(((TransformListContext)_localctx).transform);
				}
				}
				setState(2410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2411);
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
		enterRule(_localctx, 182, RULE_transform);
		int _la;
		try {
			setState(2426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2413);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2414);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2415);
				match(T__1);
				setState(2416);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2417);
					match(T__3);
					setState(2418);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2424);
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
		enterRule(_localctx, 184, RULE_transformArgument);
		try {
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2429);
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
		enterRule(_localctx, 186, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2432);
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
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2435);
				match(NOT);
				setState(2436);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2437);
				match(EXISTS);
				setState(2438);
				match(T__1);
				setState(2439);
				query();
				setState(2440);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2442);
				valueExpression(0);
				setState(2444);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2443);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2448);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2449);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2450);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2451);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2452);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2453);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,316,_ctx);
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
		enterRule(_localctx, 190, RULE_predicate);
		int _la;
		try {
			setState(2521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2459);
					match(NOT);
					}
				}

				setState(2462);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2463);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2464);
				match(AND);
				setState(2465);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2467);
					match(NOT);
					}
				}

				setState(2470);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2471);
				match(T__1);
				setState(2472);
				expression();
				setState(2477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(2473);
					match(T__3);
					setState(2474);
					expression();
					}
					}
					setState(2479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2480);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2482);
					match(NOT);
					}
				}

				setState(2485);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2486);
				match(T__1);
				setState(2487);
				query();
				setState(2488);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2490);
					match(NOT);
					}
				}

				setState(2493);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2494);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2495);
					match(NOT);
					}
				}

				setState(2498);
				((PredicateContext)_localctx).kind = match(LIKE);
				setState(2499);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2500);
					match(ESCAPE);
					setState(2501);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2504);
				match(IS);
				setState(2506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2505);
					match(NOT);
					}
				}

				setState(2508);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2509);
				match(IS);
				setState(2511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2510);
					match(NOT);
					}
				}

				setState(2513);
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
				setState(2514);
				match(IS);
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2515);
					match(NOT);
					}
				}

				setState(2518);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2519);
				match(FROM);
				setState(2520);
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
		int _startState = 192;
		enterRecursionRule(_localctx, 192, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2524);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2525);
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
				setState(2526);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2550);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2548);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2529);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2530);
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
						setState(2531);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2532);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2533);
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
						setState(2534);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2535);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2536);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2537);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2538);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2539);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2540);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2541);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2542);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2543);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2544);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2545);
						comparisonOperator();
						setState(2546);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2552);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
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
		int _startState = 194;
		enterRecursionRule(_localctx, 194, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentDatetimeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2554);
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
				setState(2555);
				match(CASE);
				setState(2557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2556);
					whenClause();
					}
					}
					setState(2559); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2561);
					match(ELSE);
					setState(2562);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2565);
				match(END);
				}
				break;
			case 3:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2567);
				match(CASE);
				setState(2568);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2570); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2569);
					whenClause();
					}
					}
					setState(2572); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2574);
					match(ELSE);
					setState(2575);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2578);
				match(END);
				}
				break;
			case 4:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2580);
				match(CAST);
				setState(2581);
				match(T__1);
				setState(2582);
				expression();
				setState(2583);
				match(AS);
				setState(2584);
				dataType();
				setState(2585);
				match(T__2);
				}
				break;
			case 5:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2587);
				match(STRUCT);
				setState(2588);
				match(T__1);
				setState(2597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
				case 1:
					{
					setState(2589);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2590);
						match(T__3);
						setState(2591);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2599);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2600);
				match(FIRST);
				setState(2601);
				match(T__1);
				setState(2602);
				expression();
				setState(2605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2603);
					match(IGNORE);
					setState(2604);
					match(NULLS);
					}
				}

				setState(2607);
				match(T__2);
				}
				break;
			case 7:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2609);
				match(LAST);
				setState(2610);
				match(T__1);
				setState(2611);
				expression();
				setState(2614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2612);
					match(IGNORE);
					setState(2613);
					match(NULLS);
					}
				}

				setState(2616);
				match(T__2);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2618);
				match(POSITION);
				setState(2619);
				match(T__1);
				setState(2620);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2621);
				match(IN);
				setState(2622);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2623);
				match(T__2);
				}
				break;
			case 9:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2625);
				constant();
				}
				break;
			case 10:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2626);
				match(ASTERISK);
				}
				break;
			case 11:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2627);
				qualifiedName();
				setState(2628);
				match(T__4);
				setState(2629);
				match(ASTERISK);
				}
				break;
			case 12:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2631);
				match(T__1);
				setState(2632);
				namedExpression();
				setState(2635); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2633);
					match(T__3);
					setState(2634);
					namedExpression();
					}
					}
					setState(2637); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2639);
				match(T__2);
				}
				break;
			case 13:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2641);
				match(T__1);
				setState(2642);
				query();
				setState(2643);
				match(T__2);
				}
				break;
			case 14:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2645);
				functionName();
				setState(2646);
				match(T__1);
				setState(2658);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,342,_ctx) ) {
				case 1:
					{
					setState(2648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
					case 1:
						{
						setState(2647);
						setQuantifier();
						}
						break;
					}
					setState(2650);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2655);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2651);
						match(T__3);
						setState(2652);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2657);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2660);
				match(T__2);
				setState(2667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2661);
					match(FILTER);
					setState(2662);
					match(T__1);
					setState(2663);
					match(WHERE);
					setState(2664);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2665);
					match(T__2);
					}
					break;
				}
				setState(2671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
				case 1:
					{
					setState(2669);
					match(OVER);
					setState(2670);
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
				setState(2673);
				identifier();
				setState(2674);
				match(T__7);
				setState(2675);
				expression();
				}
				break;
			case 16:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2677);
				match(T__1);
				setState(2678);
				identifier();
				setState(2681); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2679);
					match(T__3);
					setState(2680);
					identifier();
					}
					}
					setState(2683); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(2685);
				match(T__2);
				setState(2686);
				match(T__7);
				setState(2687);
				expression();
				}
				break;
			case 17:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2689);
				identifier();
				}
				break;
			case 18:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2690);
				match(T__1);
				setState(2691);
				expression();
				setState(2692);
				match(T__2);
				}
				break;
			case 19:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2694);
				match(EXTRACT);
				setState(2695);
				match(T__1);
				setState(2696);
				((ExtractContext)_localctx).field = identifier();
				setState(2697);
				match(FROM);
				setState(2698);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2699);
				match(T__2);
				}
				break;
			case 20:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2701);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2702);
				match(T__1);
				setState(2703);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2704);
				_la = _input.LA(1);
				if ( !(_la==T__3 || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2705);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==FOR) {
					{
					setState(2706);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2707);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2710);
				match(T__2);
				}
				break;
			case 21:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2712);
				match(TRIM);
				setState(2713);
				match(T__1);
				setState(2715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
				case 1:
					{
					setState(2714);
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
				setState(2718);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
				case 1:
					{
					setState(2717);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2720);
				match(FROM);
				setState(2721);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2722);
				match(T__2);
				}
				break;
			case 22:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2724);
				match(OVERLAY);
				setState(2725);
				match(T__1);
				setState(2726);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2727);
				match(PLACING);
				setState(2728);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2729);
				match(FROM);
				setState(2730);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2731);
					match(FOR);
					setState(2732);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2735);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2739);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2740);
						match(T__8);
						setState(2741);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2742);
						match(T__9);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2744);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2745);
						match(T__4);
						setState(2746);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
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
		enterRule(_localctx, 196, RULE_constant);
		try {
			int _alt;
			setState(2764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,354,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2752);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2753);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2754);
				identifier();
				setState(2755);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2757);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2758);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2760); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2759);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2762); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,353,_ctx);
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
		enterRule(_localctx, 198, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2766);
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
		enterRule(_localctx, 200, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2768);
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
		enterRule(_localctx, 202, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2770);
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
		enterRule(_localctx, 204, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
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
		enterRule(_localctx, 206, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2774);
			match(INTERVAL);
			setState(2777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,355,_ctx) ) {
			case 1:
				{
				setState(2775);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2776);
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
		enterRule(_localctx, 208, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2779);
			multiUnitsInterval();
			setState(2781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,356,_ctx) ) {
			case 1:
				{
				setState(2780);
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
		enterRule(_localctx, 210, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2786); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2783);
					intervalValue();
					setState(2784);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2788); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,357,_ctx);
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
		enterRule(_localctx, 212, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2790);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2793);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
			case 1:
				{
				setState(2791);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2792);
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
		enterRule(_localctx, 214, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2795);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2796);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2797);
			match(TO);
			setState(2798);
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
		enterRule(_localctx, 216, RULE_intervalValue);
		int _la;
		try {
			setState(2805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(2800);
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

				setState(2803);
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
				setState(2804);
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
		enterRule(_localctx, 218, RULE_colPosition);
		try {
			setState(2810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2807);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2808);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2809);
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
		public TerminalNode LT() { return getToken(SparkSqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SparkSqlBaseParser.GT, 0); }
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
		enterRule(_localctx, 220, RULE_dataType);
		int _la;
		try {
			setState(2846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2812);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2813);
				match(LT);
				setState(2814);
				dataType();
				setState(2815);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2817);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2818);
				match(LT);
				setState(2819);
				dataType();
				setState(2820);
				match(T__3);
				setState(2821);
				dataType();
				setState(2822);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2824);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(2831);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(2825);
					match(LT);
					setState(2827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
					case 1:
						{
						setState(2826);
						complexColTypeList();
						}
						break;
					}
					setState(2829);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(2830);
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
				setState(2833);
				identifier();
				setState(2844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2834);
					match(T__1);
					setState(2835);
					match(INTEGER_VALUE);
					setState(2840);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2836);
						match(T__3);
						setState(2837);
						match(INTEGER_VALUE);
						}
						}
						setState(2842);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2843);
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
		enterRule(_localctx, 222, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848);
			qualifiedColTypeWithPosition();
			setState(2853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2849);
				match(T__3);
				setState(2850);
				qualifiedColTypeWithPosition();
				}
				}
				setState(2855);
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
		enterRule(_localctx, 224, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2856);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(2857);
			dataType();
			setState(2860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2858);
				match(NOT);
				setState(2859);
				match(NULL);
				}
			}

			setState(2863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2862);
				commentSpec();
				}
			}

			setState(2866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(2865);
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
		enterRule(_localctx, 226, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2868);
			colType();
			setState(2873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2869);
					match(T__3);
					setState(2870);
					colType();
					}
					} 
				}
				setState(2875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,371,_ctx);
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
		enterRule(_localctx, 228, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2876);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(2877);
			dataType();
			setState(2880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,372,_ctx) ) {
			case 1:
				{
				setState(2878);
				match(NOT);
				setState(2879);
				match(NULL);
				}
				break;
			}
			setState(2883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
			case 1:
				{
				setState(2882);
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
		enterRule(_localctx, 230, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2885);
			complexColType();
			setState(2890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2886);
				match(T__3);
				setState(2887);
				complexColType();
				}
				}
				setState(2892);
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
		enterRule(_localctx, 232, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2893);
			identifier();
			setState(2894);
			match(T__10);
			setState(2895);
			dataType();
			setState(2898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(2896);
				match(NOT);
				setState(2897);
				match(NULL);
				}
			}

			setState(2901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2900);
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
		enterRule(_localctx, 234, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2903);
			match(WHEN);
			setState(2904);
			((WhenClauseContext)_localctx).condition = expression();
			setState(2905);
			match(THEN);
			setState(2906);
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
		enterRule(_localctx, 236, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2908);
			match(WINDOW);
			setState(2909);
			namedWindow();
			setState(2914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2910);
					match(T__3);
					setState(2911);
					namedWindow();
					}
					} 
				}
				setState(2916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
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
		enterRule(_localctx, 238, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2917);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(2918);
			match(AS);
			setState(2919);
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
		enterRule(_localctx, 240, RULE_windowSpec);
		int _la;
		try {
			setState(2967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2921);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2922);
				match(T__1);
				setState(2923);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(2924);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2926);
				match(T__1);
				setState(2961);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(2927);
					match(CLUSTER);
					setState(2928);
					match(BY);
					setState(2929);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(2934);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(2930);
						match(T__3);
						setState(2931);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(2936);
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
					setState(2947);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(2937);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
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
					}

					setState(2959);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(2949);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2950);
						match(BY);
						setState(2951);
						sortItem();
						setState(2956);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__3) {
							{
							{
							setState(2952);
							match(T__3);
							setState(2953);
							sortItem();
							}
							}
							setState(2958);
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
				setState(2964);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(2963);
					windowFrame();
					}
				}

				setState(2966);
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
		enterRule(_localctx, 242, RULE_windowFrame);
		try {
			setState(2985);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,386,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2969);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2970);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2971);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2972);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2973);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(2974);
				match(BETWEEN);
				setState(2975);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2976);
				match(AND);
				setState(2977);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2979);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(2980);
				match(BETWEEN);
				setState(2981);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(2982);
				match(AND);
				setState(2983);
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
		enterRule(_localctx, 244, RULE_frameBound);
		int _la;
		try {
			setState(2994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2987);
				match(UNBOUNDED);
				setState(2988);
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
				setState(2989);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(2990);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2991);
				expression();
				setState(2992);
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
		enterRule(_localctx, 246, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2996);
			qualifiedName();
			setState(3001);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(2997);
				match(T__3);
				setState(2998);
				qualifiedName();
				}
				}
				setState(3003);
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
		enterRule(_localctx, 248, RULE_functionName);
		try {
			setState(3008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,389,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3004);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3005);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3006);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3007);
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
		enterRule(_localctx, 250, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3010);
			identifier();
			setState(3015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,390,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3011);
					match(T__4);
					setState(3012);
					identifier();
					}
					} 
				}
				setState(3017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,390,_ctx);
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
		enterRule(_localctx, 252, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3018);
			identifier();
			setState(3019);
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
		enterRule(_localctx, 254, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,392,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3023); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3021);
						match(MINUS);
						setState(3022);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3025); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,391,_ctx);
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
		enterRule(_localctx, 256, RULE_identifier);
		try {
			setState(3033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,393,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3030);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3031);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3032);
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
		enterRule(_localctx, 258, RULE_strictIdentifier);
		try {
			setState(3041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,394,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3035);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3036);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3037);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3038);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3039);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3040);
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
		enterRule(_localctx, 260, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3043);
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
		enterRule(_localctx, 262, RULE_number);
		int _la;
		try {
			setState(3084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,404,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3045);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3046);
					match(MINUS);
					}
				}

				setState(3049);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3050);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3051);
					match(MINUS);
					}
				}

				setState(3054);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3055);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
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
				setState(3061);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3060);
					match(MINUS);
					}
				}

				setState(3063);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3064);
					match(MINUS);
					}
				}

				setState(3067);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3069);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3068);
					match(MINUS);
					}
				}

				setState(3071);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3072);
					match(MINUS);
					}
				}

				setState(3075);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3076);
					match(MINUS);
					}
				}

				setState(3079);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3080);
					match(MINUS);
					}
				}

				setState(3083);
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
		enterRule(_localctx, 264, RULE_alterColumnAction);
		int _la;
		try {
			setState(3093);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(3086);
				match(TYPE);
				setState(3087);
				dataType();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3088);
				commentSpec();
				}
				break;
			case AFTER:
			case FIRST:
				enterOuterAlt(_localctx, 3);
				{
				setState(3089);
				colPosition();
				}
				break;
			case DROP:
			case SET:
				enterOuterAlt(_localctx, 4);
				{
				setState(3090);
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
				setState(3091);
				match(NOT);
				setState(3092);
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
		enterRule(_localctx, 266, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3095);
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
		enterRule(_localctx, 268, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3097);
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
		enterRule(_localctx, 270, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3099);
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
		case 40:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 94:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 96:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 97:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 128:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 129:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 131:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u013a\u0c20\4\2\t"+
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
		"\3\2\3\2\7\2\u0115\n\2\f\2\16\2\u0118\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t\u0130"+
		"\n\t\3\t\3\t\3\t\5\t\u0135\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u013d\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u0145\n\t\f\t\16\t\u0148\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u015b\n\t\3"+
		"\t\3\t\5\t\u015f\n\t\3\t\3\t\3\t\3\t\5\t\u0165\n\t\3\t\5\t\u0168\n\t\3"+
		"\t\5\t\u016b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0173\n\t\3\t\5\t\u0176\n"+
		"\t\3\t\3\t\5\t\u017a\n\t\3\t\5\t\u017d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0185\n\t\3\t\3\t\3\t\5\t\u018a\n\t\3\t\5\t\u018d\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0194\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u01a0\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01ab\n\t\f\t\16\t\u01ae\13"+
		"\t\3\t\5\t\u01b1\n\t\3\t\5\t\u01b4\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u01bb\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u01c6\n\t\f\t\16\t\u01c9\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u01d0\n\t\3\t\3\t\3\t\5\t\u01d5\n\t\3\t\5\t"+
		"\u01d8\n\t\3\t\3\t\3\t\3\t\5\t\u01de\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u01e9\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0229\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0232\n\t\3\t\3\t\5\t\u0236\n\t\3\t"+
		"\3\t\3\t\3\t\5\t\u023c\n\t\3\t\3\t\5\t\u0240\n\t\3\t\3\t\3\t\5\t\u0245"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u024b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0253\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0259\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0266\n\t\3\t\6\t\u0269\n\t\r\t\16\t\u026a\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u027b\n\t\3\t\3\t\3\t\7\t"+
		"\u0280\n\t\f\t\16\t\u0283\13\t\3\t\5\t\u0286\n\t\3\t\3\t\3\t\3\t\5\t\u028c"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u029b\n\t"+
		"\3\t\3\t\5\t\u029f\n\t\3\t\3\t\3\t\3\t\5\t\u02a5\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02ab\n\t\3\t\5\t\u02ae\n\t\3\t\5\t\u02b1\n\t\3\t\3\t\3\t\3\t\5\t\u02b7"+
		"\n\t\3\t\3\t\5\t\u02bb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u02c3\n\t\f\t\16"+
		"\t\u02c6\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02ce\n\t\3\t\5\t\u02d1\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u02da\n\t\3\t\3\t\3\t\5\t\u02df\n\t\3"+
		"\t\3\t\3\t\3\t\5\t\u02e5\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u02ec\n\t\3\t\5\t"+
		"\u02ef\n\t\3\t\3\t\3\t\3\t\5\t\u02f5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u02fe\n\t\f\t\16\t\u0301\13\t\5\t\u0303\n\t\3\t\3\t\5\t\u0307\n\t\3"+
		"\t\3\t\3\t\5\t\u030c\n\t\3\t\3\t\3\t\5\t\u0311\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0318\n\t\3\t\5\t\u031b\n\t\3\t\5\t\u031e\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0325\n\t\3\t\3\t\3\t\5\t\u032a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0333\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u033b\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0341\n\t\3\t\5\t\u0344\n\t\3\t\5\t\u0347\n\t\3\t\3\t\3\t\3\t\5\t\u034d"+
		"\n\t\3\t\3\t\5\t\u0351\n\t\3\t\3\t\5\t\u0355\n\t\3\t\3\t\5\t\u0359\n\t"+
		"\5\t\u035b\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0363\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u036b\n\t\3\t\3\t\3\t\3\t\5\t\u0371\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u037d\n\t\3\t\3\t\5\t\u0381\n\t\3\t\5\t\u0384"+
		"\n\t\3\t\3\t\5\t\u0388\n\t\3\t\5\t\u038b\n\t\3\t\3\t\5\t\u038f\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u03a6\n\t\f\t\16\t\u03a9\13\t\5\t\u03ab\n\t\3\t\3\t\5\t"+
		"\u03af\n\t\3\t\3\t\3\t\3\t\5\t\u03b5\n\t\3\t\5\t\u03b8\n\t\3\t\5\t\u03bb"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u03c1\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03c9\n"+
		"\t\3\t\3\t\3\t\5\t\u03ce\n\t\3\t\3\t\3\t\3\t\5\t\u03d4\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u03da\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u03e4\n\t\f\t\16"+
		"\t\u03e7\13\t\5\t\u03e9\n\t\3\t\3\t\3\t\7\t\u03ee\n\t\f\t\16\t\u03f1\13"+
		"\t\3\t\3\t\7\t\u03f5\n\t\f\t\16\t\u03f8\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ff"+
		"\n\t\3\t\3\t\5\t\u0403\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u040e"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u041a\n\t\3\t\5\t\u041d"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0423\n\t\3\t\3\t\3\t\3\t\5\t\u0429\n\t\3\t\3"+
		"\t\3\t\3\t\5\t\u042f\n\t\3\t\3\t\5\t\u0433\n\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u043a\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0450\n\t\3\t\3\t\5\t\u0454\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0460\n\t\3\t\3\t\5\t\u0464\n\t\3\t\3\t"+
		"\7\t\u0468\n\t\f\t\16\t\u046b\13\t\5\t\u046d\n\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u0475\n\n\3\n\3\n\5\n\u0479\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u0480\n"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u04f4\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u04fc\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0504\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u050d\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0517"+
		"\n\n\3\13\3\13\5\13\u051b\n\13\3\13\5\13\u051e\n\13\3\13\3\13\3\13\3\13"+
		"\5\13\u0524\n\13\3\13\3\13\3\f\3\f\5\f\u052a\n\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0536\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0542\n\16\3\16\3\16\3\16\5\16\u0547\n\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\5\21\u0550\n\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22"+
		"\u0558\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u055f\n\22\5\22\u0561\n\22\3"+
		"\22\5\22\u0564\n\22\3\22\3\22\3\22\5\22\u0569\n\22\3\22\3\22\5\22\u056d"+
		"\n\22\3\22\3\22\3\22\5\22\u0572\n\22\3\22\5\22\u0575\n\22\3\22\3\22\3"+
		"\22\5\22\u057a\n\22\3\22\3\22\3\22\5\22\u057f\n\22\3\22\5\22\u0582\n\22"+
		"\3\22\3\22\3\22\5\22\u0587\n\22\3\22\3\22\5\22\u058b\n\22\3\22\3\22\3"+
		"\22\5\22\u0590\n\22\5\22\u0592\n\22\3\23\3\23\5\23\u0596\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u059d\n\24\f\24\16\24\u05a0\13\24\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u05a7\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u05b0"+
		"\n\27\3\30\3\30\3\30\7\30\u05b5\n\30\f\30\16\30\u05b8\13\30\3\31\3\31"+
		"\3\31\3\31\7\31\u05be\n\31\f\31\16\31\u05c1\13\31\3\32\3\32\5\32\u05c5"+
		"\n\32\3\32\5\32\u05c8\n\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u05dd\n\34\f\34"+
		"\16\34\u05e0\13\34\3\35\3\35\3\35\3\35\7\35\u05e6\n\35\f\35\16\35\u05e9"+
		"\13\35\3\35\3\35\3\36\3\36\5\36\u05ef\n\36\3\36\5\36\u05f2\n\36\3\37\3"+
		"\37\3\37\7\37\u05f7\n\37\f\37\16\37\u05fa\13\37\3\37\5\37\u05fd\n\37\3"+
		" \3 \3 \3 \5 \u0603\n \3!\3!\3!\3!\7!\u0609\n!\f!\16!\u060c\13!\3!\3!"+
		"\3\"\3\"\3\"\3\"\7\"\u0614\n\"\f\"\16\"\u0617\13\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\5#\u0621\n#\3$\3$\3$\3$\3$\5$\u0628\n$\3%\3%\3%\3%\5%\u062e\n"+
		"%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\6\'\u0639\n\'\r\'\16\'\u063a\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u0642\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0649\n\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0655\n\'\3\'\3\'\3\'\3\'\7\'\u065b"+
		"\n\'\f\'\16\'\u065e\13\'\3\'\7\'\u0661\n\'\f\'\16\'\u0664\13\'\5\'\u0666"+
		"\n\'\3(\3(\3(\3(\3(\7(\u066d\n(\f(\16(\u0670\13(\5(\u0672\n(\3(\3(\3("+
		"\3(\3(\7(\u0679\n(\f(\16(\u067c\13(\5(\u067e\n(\3(\3(\3(\3(\3(\7(\u0685"+
		"\n(\f(\16(\u0688\13(\5(\u068a\n(\3(\3(\3(\3(\3(\7(\u0691\n(\f(\16(\u0694"+
		"\13(\5(\u0696\n(\3(\5(\u0699\n(\3(\3(\3(\5(\u069e\n(\5(\u06a0\n(\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3*\3*\5*\u06ac\n*\3*\3*\3*\3*\3*\5*\u06b3\n*\3*\3"+
		"*\3*\3*\3*\5*\u06ba\n*\3*\7*\u06bd\n*\f*\16*\u06c0\13*\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u06cb\n+\3,\3,\5,\u06cf\n,\3,\3,\5,\u06d3\n,\3-\3-\6-"+
		"\u06d7\n-\r-\16-\u06d8\3.\3.\5.\u06dd\n.\3.\3.\3.\3.\7.\u06e3\n.\f.\16"+
		".\u06e6\13.\3.\5.\u06e9\n.\3.\5.\u06ec\n.\3.\5.\u06ef\n.\3.\5.\u06f2\n"+
		".\3.\3.\5.\u06f6\n.\3/\3/\5/\u06fa\n/\3/\5/\u06fd\n/\3/\3/\5/\u0701\n"+
		"/\3/\7/\u0704\n/\f/\16/\u0707\13/\3/\5/\u070a\n/\3/\5/\u070d\n/\3/\5/"+
		"\u0710\n/\3/\5/\u0713\n/\5/\u0715\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u0721\n\60\3\60\5\60\u0724\n\60\3\60\3\60\5\60\u0728"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0732\n\60\3\60\3\60"+
		"\5\60\u0736\n\60\5\60\u0738\n\60\3\60\5\60\u073b\n\60\3\60\3\60\5\60\u073f"+
		"\n\60\3\61\3\61\7\61\u0743\n\61\f\61\16\61\u0746\13\61\3\61\5\61\u0749"+
		"\n\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0754\n\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\5\64\u075e\n\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u076a\n\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0777\n\66\f\66\16\66\u077a\13\66"+
		"\3\66\3\66\5\66\u077e\n\66\3\67\3\67\3\67\7\67\u0783\n\67\f\67\16\67\u0786"+
		"\13\67\38\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\5;\u0795\n;\3;\7;\u0798"+
		"\n;\f;\16;\u079b\13;\3;\3;\3<\3<\3<\3<\3<\3<\7<\u07a5\n<\f<\16<\u07a8"+
		"\13<\3<\3<\5<\u07ac\n<\3=\3=\3=\3=\7=\u07b2\n=\f=\16=\u07b5\13=\3=\7="+
		"\u07b8\n=\f=\16=\u07bb\13=\3=\5=\u07be\n=\3>\3>\3>\3>\3>\7>\u07c5\n>\f"+
		">\16>\u07c8\13>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u07d4\n>\f>\16>\u07d7"+
		"\13>\3>\3>\5>\u07db\n>\3>\3>\3>\3>\3>\3>\3>\3>\7>\u07e5\n>\f>\16>\u07e8"+
		"\13>\3>\3>\5>\u07ec\n>\3?\3?\3?\3?\7?\u07f2\n?\f?\16?\u07f5\13?\5?\u07f7"+
		"\n?\3?\3?\5?\u07fb\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0807\n@\f@\16"+
		"@\u080a\13@\3@\3@\3@\3A\3A\3A\3A\3A\7A\u0814\nA\fA\16A\u0817\13A\3A\3"+
		"A\5A\u081b\nA\3B\3B\5B\u081f\nB\3B\5B\u0822\nB\3C\3C\3C\5C\u0827\nC\3"+
		"C\3C\3C\3C\3C\7C\u082e\nC\fC\16C\u0831\13C\5C\u0833\nC\3C\3C\3C\5C\u0838"+
		"\nC\3C\3C\3C\7C\u083d\nC\fC\16C\u0840\13C\5C\u0842\nC\3D\3D\3E\3E\7E\u0848"+
		"\nE\fE\16E\u084b\13E\3F\3F\3F\3F\5F\u0851\nF\3F\3F\3F\3F\3F\5F\u0858\n"+
		"F\3G\5G\u085b\nG\3G\3G\3G\5G\u0860\nG\3G\5G\u0863\nG\3G\3G\3G\5G\u0868"+
		"\nG\3G\3G\5G\u086c\nG\3G\5G\u086f\nG\3G\5G\u0872\nG\3H\3H\3H\3H\5H\u0878"+
		"\nH\3I\3I\3I\5I\u087d\nI\3I\3I\3J\5J\u0882\nJ\3J\3J\3J\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0894\nJ\5J\u0896\nJ\3J\5J\u0899\nJ\3K\3K"+
		"\3K\3K\3L\3L\3L\7L\u08a2\nL\fL\16L\u08a5\13L\3M\3M\3M\3M\7M\u08ab\nM\f"+
		"M\16M\u08ae\13M\3M\3M\3N\3N\5N\u08b4\nN\3O\3O\3O\3O\7O\u08ba\nO\fO\16"+
		"O\u08bd\13O\3O\3O\3P\3P\5P\u08c3\nP\3Q\3Q\5Q\u08c7\nQ\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\5Q\u08cf\nQ\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u08d7\nQ\3Q\3Q\3Q\3Q\5Q\u08dd\nQ\3"+
		"R\3R\3R\3R\7R\u08e3\nR\fR\16R\u08e6\13R\3R\3R\3S\3S\3S\3S\3S\7S\u08ef"+
		"\nS\fS\16S\u08f2\13S\5S\u08f4\nS\3S\3S\3S\3T\5T\u08fa\nT\3T\3T\5T\u08fe"+
		"\nT\5T\u0900\nT\3U\3U\3U\3U\3U\3U\3U\5U\u0909\nU\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\3U\3U\5U\u0915\nU\5U\u0917\nU\3U\3U\3U\3U\3U\5U\u091e\nU\3U\3U\3U"+
		"\3U\3U\5U\u0925\nU\3U\3U\3U\3U\5U\u092b\nU\3U\3U\3U\3U\5U\u0931\nU\5U"+
		"\u0933\nU\3V\3V\3V\7V\u0938\nV\fV\16V\u093b\13V\3W\3W\3W\7W\u0940\nW\f"+
		"W\16W\u0943\13W\3X\3X\3X\5X\u0948\nX\3X\3X\3Y\3Y\3Y\5Y\u094f\nY\3Y\3Y"+
		"\3Z\3Z\5Z\u0955\nZ\3Z\3Z\5Z\u0959\nZ\5Z\u095b\nZ\3[\3[\3[\7[\u0960\n["+
		"\f[\16[\u0963\13[\3\\\3\\\3\\\3\\\7\\\u0969\n\\\f\\\16\\\u096c\13\\\3"+
		"\\\3\\\3]\3]\3]\3]\3]\3]\7]\u0976\n]\f]\16]\u0979\13]\3]\3]\5]\u097d\n"+
		"]\3^\3^\5^\u0981\n^\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u098f\n`\5"+
		"`\u0991\n`\3`\3`\3`\3`\3`\3`\7`\u0999\n`\f`\16`\u099c\13`\3a\5a\u099f"+
		"\na\3a\3a\3a\3a\3a\3a\5a\u09a7\na\3a\3a\3a\3a\3a\7a\u09ae\na\fa\16a\u09b1"+
		"\13a\3a\3a\3a\5a\u09b6\na\3a\3a\3a\3a\3a\3a\5a\u09be\na\3a\3a\3a\5a\u09c3"+
		"\na\3a\3a\3a\3a\5a\u09c9\na\3a\3a\5a\u09cd\na\3a\3a\3a\5a\u09d2\na\3a"+
		"\3a\3a\5a\u09d7\na\3a\3a\3a\5a\u09dc\na\3b\3b\3b\3b\5b\u09e2\nb\3b\3b"+
		"\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\7b\u09f7\nb\fb\16"+
		"b\u09fa\13b\3c\3c\3c\3c\6c\u0a00\nc\rc\16c\u0a01\3c\3c\5c\u0a06\nc\3c"+
		"\3c\3c\3c\3c\6c\u0a0d\nc\rc\16c\u0a0e\3c\3c\5c\u0a13\nc\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\7c\u0a23\nc\fc\16c\u0a26\13c\5c\u0a28\nc"+
		"\3c\3c\3c\3c\3c\3c\5c\u0a30\nc\3c\3c\3c\3c\3c\3c\3c\5c\u0a39\nc\3c\3c"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\6c\u0a4e\nc\rc\16"+
		"c\u0a4f\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0a5b\nc\3c\3c\3c\7c\u0a60\nc\f"+
		"c\16c\u0a63\13c\5c\u0a65\nc\3c\3c\3c\3c\3c\3c\3c\5c\u0a6e\nc\3c\3c\5c"+
		"\u0a72\nc\3c\3c\3c\3c\3c\3c\3c\3c\6c\u0a7c\nc\rc\16c\u0a7d\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u0a97\n"+
		"c\3c\3c\3c\3c\3c\5c\u0a9e\nc\3c\5c\u0aa1\nc\3c\3c\3c\3c\3c\3c\3c\3c\3"+
		"c\3c\3c\3c\3c\5c\u0ab0\nc\3c\3c\5c\u0ab4\nc\3c\3c\3c\3c\3c\3c\3c\3c\7"+
		"c\u0abe\nc\fc\16c\u0ac1\13c\3d\3d\3d\3d\3d\3d\3d\3d\6d\u0acb\nd\rd\16"+
		"d\u0acc\5d\u0acf\nd\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3i\5i\u0adc\ni\3j\3"+
		"j\5j\u0ae0\nj\3k\3k\3k\6k\u0ae5\nk\rk\16k\u0ae6\3l\3l\3l\5l\u0aec\nl\3"+
		"m\3m\3m\3m\3m\3n\5n\u0af4\nn\3n\3n\5n\u0af8\nn\3o\3o\3o\5o\u0afd\no\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\3p\5p\u0b0e\np\3p\3p\5p\u0b12"+
		"\np\3p\3p\3p\3p\3p\7p\u0b19\np\fp\16p\u0b1c\13p\3p\5p\u0b1f\np\5p\u0b21"+
		"\np\3q\3q\3q\7q\u0b26\nq\fq\16q\u0b29\13q\3r\3r\3r\3r\5r\u0b2f\nr\3r\5"+
		"r\u0b32\nr\3r\5r\u0b35\nr\3s\3s\3s\7s\u0b3a\ns\fs\16s\u0b3d\13s\3t\3t"+
		"\3t\3t\5t\u0b43\nt\3t\5t\u0b46\nt\3u\3u\3u\7u\u0b4b\nu\fu\16u\u0b4e\13"+
		"u\3v\3v\3v\3v\3v\5v\u0b55\nv\3v\5v\u0b58\nv\3w\3w\3w\3w\3w\3x\3x\3x\3"+
		"x\7x\u0b63\nx\fx\16x\u0b66\13x\3y\3y\3y\3y\3z\3z\3z\3z\3z\3z\3z\3z\3z"+
		"\3z\3z\7z\u0b77\nz\fz\16z\u0b7a\13z\3z\3z\3z\3z\3z\7z\u0b81\nz\fz\16z"+
		"\u0b84\13z\5z\u0b86\nz\3z\3z\3z\3z\3z\7z\u0b8d\nz\fz\16z\u0b90\13z\5z"+
		"\u0b92\nz\5z\u0b94\nz\3z\5z\u0b97\nz\3z\5z\u0b9a\nz\3{\3{\3{\3{\3{\3{"+
		"\3{\3{\3{\3{\3{\3{\3{\3{\3{\3{\5{\u0bac\n{\3|\3|\3|\3|\3|\3|\3|\5|\u0bb5"+
		"\n|\3}\3}\3}\7}\u0bba\n}\f}\16}\u0bbd\13}\3~\3~\3~\3~\5~\u0bc3\n~\3\177"+
		"\3\177\3\177\7\177\u0bc8\n\177\f\177\16\177\u0bcb\13\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\6\u0081\u0bd2\n\u0081\r\u0081\16\u0081\u0bd3"+
		"\3\u0081\5\u0081\u0bd7\n\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0bdc\n"+
		"\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0be4\n"+
		"\u0083\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085\u0bea\n\u0085\3\u0085\3"+
		"\u0085\3\u0085\5\u0085\u0bef\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u0bf4"+
		"\n\u0085\3\u0085\3\u0085\5\u0085\u0bf8\n\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0bfc\n\u0085\3\u0085\3\u0085\5\u0085\u0c00\n\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0c04\n\u0085\3\u0085\3\u0085\5\u0085\u0c08\n\u0085\3\u0085\3\u0085"+
		"\5\u0085\u0c0c\n\u0085\3\u0085\5\u0085\u0c0f\n\u0085\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0086\3\u0086\3\u0086\5\u0086\u0c18\n\u0086\3\u0087\3"+
		"\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\7\u03a7\u03e5\u03ef\u03f6"+
		"\u0469\6R\u00be\u00c2\u00c4\u008a\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\2,"+
		"\4\2CC\u00bb\u00bb\4\2\"\"\u00c9\u00c9\4\2BB\u009c\u009c\4\2jjxx\3\2-"+
		".\4\2\u00eb\u00eb\u010a\u010a\4\2\21\21%%\7\2**\67\67\\\\ii\u0095\u0095"+
		"\3\2HI\4\2\\\\ii\4\2\u00a0\u00a0\u012b\u012b\4\2\16\16\u008e\u008e\4\2"+
		"GG\u00b3\u00b3\5\2AA\u009b\u009b\u00d5\u00d5\6\2WW\177\177\u00dd\u00dd"+
		"\u00ff\u00ff\5\2WW\u00dd\u00dd\u00ff\u00ff\4\2\31\31HH\4\2dd\u0086\u0086"+
		"\4\2\20\20NN\4\2\u012f\u012f\u0131\u0131\5\2__\u00f9\u00f9\u0101\u0101"+
		"\4\2\u0121\u0122\u0126\u0126\4\2PP\u0123\u0125\4\2\u0121\u0122\u0129\u0129"+
		"\4\2<<>>\3\2\u00e9\u00ea\4\2\6\6jj\4\2\6\6ff\5\2\35\35\u0089\u0089\u00f4"+
		"\u00f4\3\2\u0119\u0120\4\2PP\u0121\u012a\6\2\23\23xx\u009f\u009f\u00a7"+
		"\u00a7\4\2__\u00f9\u00f9\3\2\u0121\u0122\4\2OO\u00b0\u00b0\4\2\u00a8\u00a8"+
		"\u00e2\u00e2\4\2ee\u00b8\u00b8\3\2\u0130\u0131\4\2QQ\u00dc\u00dc\63\2"+
		"\16\17\21\22\24\24\26\27\31\32\34\34\36\"%%\'*,,.\64\66\67:;@MORVVX^a"+
		"acehilnqqswyz|~\u0080\u0080\u0083\u0083\u0085\u0088\u008b\u008e\u0090"+
		"\u009c\u009e\u009e\u00a1\u00a2\u00a5\u00a6\u00a9\u00a9\u00ab\u00ac\u00ae"+
		"\u00b8\u00ba\u00c2\u00c4\u00cb\u00cd\u00d5\u00d7\u00da\u00dc\u00e0\u00e2"+
		"\u00ea\u00ec\u00f0\u00f3\u00f3\u00f5\u00fe\u0102\u0105\u0108\u010b\u010e"+
		"\u010e\u0110\u0118\21\2\24\2499WWkk{{\177\177\u0084\u0084\u008a\u008a"+
		"\u009d\u009d\u00a3\u00a3\u00cc\u00cc\u00d7\u00d7\u00dd\u00dd\u00ff\u00ff"+
		"\u0107\u0107\23\2\16\23\258:VXjlz|~\u0080\u0083\u0085\u0089\u008b\u008e"+
		"\u0090\u009c\u009e\u00a2\u00a4\u00cb\u00cd\u00d6\u00d8\u00dc\u00de\u00fe"+
		"\u0100\u0106\u0108\u0118\2\u0e0d\2\u0112\3\2\2\2\4\u011b\3\2\2\2\6\u011e"+
		"\3\2\2\2\b\u0121\3\2\2\2\n\u0124\3\2\2\2\f\u0127\3\2\2\2\16\u012a\3\2"+
		"\2\2\20\u046c\3\2\2\2\22\u0516\3\2\2\2\24\u0518\3\2\2\2\26\u0529\3\2\2"+
		"\2\30\u052f\3\2\2\2\32\u053b\3\2\2\2\34\u0548\3\2\2\2\36\u054b\3\2\2\2"+
		" \u054f\3\2\2\2\"\u0591\3\2\2\2$\u0593\3\2\2\2&\u0597\3\2\2\2(\u05a3\3"+
		"\2\2\2*\u05a8\3\2\2\2,\u05af\3\2\2\2.\u05b1\3\2\2\2\60\u05b9\3\2\2\2\62"+
		"\u05c2\3\2\2\2\64\u05cd\3\2\2\2\66\u05de\3\2\2\28\u05e1\3\2\2\2:\u05ec"+
		"\3\2\2\2<\u05fc\3\2\2\2>\u0602\3\2\2\2@\u0604\3\2\2\2B\u060f\3\2\2\2D"+
		"\u0620\3\2\2\2F\u0627\3\2\2\2H\u0629\3\2\2\2J\u062f\3\2\2\2L\u0665\3\2"+
		"\2\2N\u0671\3\2\2\2P\u06a1\3\2\2\2R\u06a4\3\2\2\2T\u06ca\3\2\2\2V\u06cc"+
		"\3\2\2\2X\u06d4\3\2\2\2Z\u06f5\3\2\2\2\\\u0714\3\2\2\2^\u0720\3\2\2\2"+
		"`\u0740\3\2\2\2b\u074c\3\2\2\2d\u074f\3\2\2\2f\u0758\3\2\2\2h\u0769\3"+
		"\2\2\2j\u077d\3\2\2\2l\u077f\3\2\2\2n\u0787\3\2\2\2p\u078b\3\2\2\2r\u078e"+
		"\3\2\2\2t\u0791\3\2\2\2v\u07ab\3\2\2\2x\u07ad\3\2\2\2z\u07eb\3\2\2\2|"+
		"\u07fa\3\2\2\2~\u07fc\3\2\2\2\u0080\u081a\3\2\2\2\u0082\u081c\3\2\2\2"+
		"\u0084\u0823\3\2\2\2\u0086\u0843\3\2\2\2\u0088\u0845\3\2\2\2\u008a\u0857"+
		"\3\2\2\2\u008c\u0871\3\2\2\2\u008e\u0877\3\2\2\2\u0090\u0879\3\2\2\2\u0092"+
		"\u0898\3\2\2\2\u0094\u089a\3\2\2\2\u0096\u089e\3\2\2\2\u0098\u08a6\3\2"+
		"\2\2\u009a\u08b1\3\2\2\2\u009c\u08b5\3\2\2\2\u009e\u08c0\3\2\2\2\u00a0"+
		"\u08dc\3\2\2\2\u00a2\u08de\3\2\2\2\u00a4\u08e9\3\2\2\2\u00a6\u08ff\3\2"+
		"\2\2\u00a8\u0932\3\2\2\2\u00aa\u0934\3\2\2\2\u00ac\u093c\3\2\2\2\u00ae"+
		"\u0947\3\2\2\2\u00b0\u094e\3\2\2\2\u00b2\u0952\3\2\2\2\u00b4\u095c\3\2"+
		"\2\2\u00b6\u0964\3\2\2\2\u00b8\u097c\3\2\2\2\u00ba\u0980\3\2\2\2\u00bc"+
		"\u0982\3\2\2\2\u00be\u0990\3\2\2\2\u00c0\u09db\3\2\2\2\u00c2\u09e1\3\2"+
		"\2\2\u00c4\u0ab3\3\2\2\2\u00c6\u0ace\3\2\2\2\u00c8\u0ad0\3\2\2\2\u00ca"+
		"\u0ad2\3\2\2\2\u00cc\u0ad4\3\2\2\2\u00ce\u0ad6\3\2\2\2\u00d0\u0ad8\3\2"+
		"\2\2\u00d2\u0add\3\2\2\2\u00d4\u0ae4\3\2\2\2\u00d6\u0ae8\3\2\2\2\u00d8"+
		"\u0aed\3\2\2\2\u00da\u0af7\3\2\2\2\u00dc\u0afc\3\2\2\2\u00de\u0b20\3\2"+
		"\2\2\u00e0\u0b22\3\2\2\2\u00e2\u0b2a\3\2\2\2\u00e4\u0b36\3\2\2\2\u00e6"+
		"\u0b3e\3\2\2\2\u00e8\u0b47\3\2\2\2\u00ea\u0b4f\3\2\2\2\u00ec\u0b59\3\2"+
		"\2\2\u00ee\u0b5e\3\2\2\2\u00f0\u0b67\3\2\2\2\u00f2\u0b99\3\2\2\2\u00f4"+
		"\u0bab\3\2\2\2\u00f6\u0bb4\3\2\2\2\u00f8\u0bb6\3\2\2\2\u00fa\u0bc2\3\2"+
		"\2\2\u00fc\u0bc4\3\2\2\2\u00fe\u0bcc\3\2\2\2\u0100\u0bd6\3\2\2\2\u0102"+
		"\u0bdb\3\2\2\2\u0104\u0be3\3\2\2\2\u0106\u0be5\3\2\2\2\u0108\u0c0e\3\2"+
		"\2\2\u010a\u0c17\3\2\2\2\u010c\u0c19\3\2\2\2\u010e\u0c1b\3\2\2\2\u0110"+
		"\u0c1d\3\2\2\2\u0112\u0116\5\20\t\2\u0113\u0115\7\3\2\2\u0114\u0113\3"+
		"\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\2\2\3\u011a\3\3\2\2\2"+
		"\u011b\u011c\5\u00b2Z\2\u011c\u011d\7\2\2\3\u011d\5\3\2\2\2\u011e\u011f"+
		"\5\u00aeX\2\u011f\u0120\7\2\2\3\u0120\7\3\2\2\2\u0121\u0122\5\u00acW\2"+
		"\u0122\u0123\7\2\2\3\u0123\t\3\2\2\2\u0124\u0125\5\u00b0Y\2\u0125\u0126"+
		"\7\2\2\3\u0126\13\3\2\2\2\u0127\u0128\5\u00dep\2\u0128\u0129\7\2\2\3\u0129"+
		"\r\3\2\2\2\u012a\u012b\5\u00e4s\2\u012b\u012c\7\2\2\3\u012c\17\3\2\2\2"+
		"\u012d\u046d\5 \21\2\u012e\u0130\5\60\31\2\u012f\u012e\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u046d\5L\'\2\u0132\u0134\7\u0105\2"+
		"\2\u0133\u0135\7\u009b\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u046d\5\u00acW\2\u0137\u0138\78\2\2\u0138\u013c\5"+
		"*\26\2\u0139\u013a\7u\2\2\u013a\u013b\7\u009f\2\2\u013b\u013d\7Y\2\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0146\5\u00ac"+
		"W\2\u013f\u0145\5\36\20\2\u0140\u0145\5\34\17\2\u0141\u0142\7\u010f\2"+
		"\2\u0142\u0143\t\2\2\2\u0143\u0145\58\35\2\u0144\u013f\3\2\2\2\u0144\u0140"+
		"\3\2\2\2\u0144\u0141\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u046d\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\7\21"+
		"\2\2\u014a\u014b\5*\26\2\u014b\u014c\5\u00acW\2\u014c\u014d\7\u00dc\2"+
		"\2\u014d\u014e\t\2\2\2\u014e\u014f\58\35\2\u014f\u046d\3\2\2\2\u0150\u0151"+
		"\7\21\2\2\u0151\u0152\5*\26\2\u0152\u0153\5\u00acW\2\u0153\u0154\7\u00dc"+
		"\2\2\u0154\u0155\5\34\17\2\u0155\u046d\3\2\2\2\u0156\u0157\7Q\2\2\u0157"+
		"\u015a\5*\26\2\u0158\u0159\7u\2\2\u0159\u015b\7Y\2\2\u015a\u0158\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015e\5\u00acW\2\u015d"+
		"\u015f\t\3\2\2\u015e\u015d\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u046d\3\2"+
		"\2\2\u0160\u0161\7\u00df\2\2\u0161\u0164\t\4\2\2\u0162\u0163\t\5\2\2\u0163"+
		"\u0165\5\u00acW\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u016a"+
		"\3\2\2\2\u0166\u0168\7\u008b\2\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u0169\3\2\2\2\u0169\u016b\7\u012b\2\2\u016a\u0167\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u046d\3\2\2\2\u016c\u016d\6\t\2\2\u016d\u0172\5\24"+
		"\13\2\u016e\u016f\7\4\2\2\u016f\u0170\5\u00e4s\2\u0170\u0171\7\5\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2"+
		"\2\2\u0174\u0176\5\64\33\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u017c\5\66\34\2\u0178\u017a\7\30\2\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\5 \21\2\u017c"+
		"\u0179\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u046d\3\2\2\2\u017e\u017f\6\t"+
		"\3\2\u017f\u0184\5\24\13\2\u0180\u0181\7\4\2\2\u0181\u0182\5\u00e4s\2"+
		"\u0182\u0183\7\5\2\2\u0183\u0185\3\2\2\2\u0184\u0180\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5\64\33\2\u0187\u018c\5\66\34"+
		"\2\u0188\u018a\7\30\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018d\5 \21\2\u018c\u0189\3\2\2\2\u018c\u018d\3\2"+
		"\2\2\u018d\u046d\3\2\2\2\u018e\u0193\5\24\13\2\u018f\u0190\7\4\2\2\u0190"+
		"\u0191\5\u00e4s\2\u0191\u0192\7\5\2\2\u0192\u0194\3\2\2\2\u0193\u018f"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u01ac\3\2\2\2\u0195\u01ab\5\36\20\2"+
		"\u0196\u0197\7\u00b1\2\2\u0197\u0198\7 \2\2\u0198\u0199\7\4\2\2\u0199"+
		"\u019a\5\u00e4s\2\u019a\u019b\7\5\2\2\u019b\u01a0\3\2\2\2\u019c\u019d"+
		"\7\u00b1\2\2\u019d\u019e\7 \2\2\u019e\u01a0\5\u0094K\2\u019f\u0196\3\2"+
		"\2\2\u019f\u019c\3\2\2\2\u01a0\u01ab\3\2\2\2\u01a1\u01ab\5\30\r\2\u01a2"+
		"\u01ab\5\32\16\2\u01a3\u01ab\5\u00a8U\2\u01a4\u01ab\5D#\2\u01a5\u01ab"+
		"\5\34\17\2\u01a6\u01a7\7\u008f\2\2\u01a7\u01ab\7\u012f\2\2\u01a8\u01a9"+
		"\7\u00ee\2\2\u01a9\u01ab\58\35\2\u01aa\u0195\3\2\2\2\u01aa\u019f\3\2\2"+
		"\2\u01aa\u01a1\3\2\2\2\u01aa\u01a2\3\2\2\2\u01aa\u01a3\3\2\2\2\u01aa\u01a4"+
		"\3\2\2\2\u01aa\u01a5\3\2\2\2\u01aa\u01a6\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b3\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b1\7\30\2\2\u01b0\u01af\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\5 \21\2\u01b3\u01b0\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u046d\3\2\2\2\u01b5\u01b6\78\2\2\u01b6"+
		"\u01ba\7\u00eb\2\2\u01b7\u01b8\7u\2\2\u01b8\u01b9\7\u009f\2\2\u01b9\u01bb"+
		"\7Y\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01bd\5\u00aeX\2\u01bd\u01be\7\u008b\2\2\u01be\u01c7\5\u00aeX\2\u01bf"+
		"\u01c6\5\64\33\2\u01c0\u01c6\5\u00a8U\2\u01c1\u01c6\5D#\2\u01c2\u01c6"+
		"\5\34\17\2\u01c3\u01c4\7\u00ee\2\2\u01c4\u01c6\58\35\2\u01c5\u01bf\3\2"+
		"\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2\3\2\2\2\u01c5"+
		"\u01c3\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u046d\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cf\5\26\f\2\u01cb"+
		"\u01cc\7\4\2\2\u01cc\u01cd\5\u00e4s\2\u01cd\u01ce\7\5\2\2\u01ce\u01d0"+
		"\3\2\2\2\u01cf\u01cb\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1"+
		"\u01d2\5\64\33\2\u01d2\u01d7\5\66\34\2\u01d3\u01d5\7\30\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\5 \21\2\u01d7"+
		"\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u046d\3\2\2\2\u01d9\u01da\7\22"+
		"\2\2\u01da\u01db\7\u00eb\2\2\u01db\u01dd\5\u00acW\2\u01dc\u01de\5&\24"+
		"\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0"+
		"\7\63\2\2\u01e0\u01e8\7\u00e5\2\2\u01e1\u01e9\5\u0102\u0082\2\u01e2\u01e3"+
		"\7f\2\2\u01e3\u01e4\7.\2\2\u01e4\u01e9\5\u0096L\2\u01e5\u01e6\7f\2\2\u01e6"+
		"\u01e7\7\20\2\2\u01e7\u01e9\7.\2\2\u01e8\u01e1\3\2\2\2\u01e8\u01e2\3\2"+
		"\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u046d\3\2\2\2\u01ea"+
		"\u01eb\7\21\2\2\u01eb\u01ec\7\u00eb\2\2\u01ec\u01ed\5\u00acW\2\u01ed\u01ee"+
		"\7\16\2\2\u01ee\u01ef\t\6\2\2\u01ef\u01f0\5\u00e0q\2\u01f0\u046d\3\2\2"+
		"\2\u01f1\u01f2\7\21\2\2\u01f2\u01f3\7\u00eb\2\2\u01f3\u01f4\5\u00acW\2"+
		"\u01f4\u01f5\7\16\2\2\u01f5\u01f6\t\6\2\2\u01f6\u01f7\7\4\2\2\u01f7\u01f8"+
		"\5\u00e0q\2\u01f8\u01f9\7\5\2\2\u01f9\u046d\3\2\2\2\u01fa\u01fb\7\21\2"+
		"\2\u01fb\u01fc\7\u00eb\2\2\u01fc\u01fd\5\u00acW\2\u01fd\u01fe\7\u00c5"+
		"\2\2\u01fe\u01ff\7-\2\2\u01ff\u0200\5\u00acW\2\u0200\u0201\7\u00f2\2\2"+
		"\u0201\u0202\5\u00fe\u0080\2\u0202\u046d\3\2\2\2\u0203\u0204\7\21\2\2"+
		"\u0204\u0205\7\u00eb\2\2\u0205\u0206\5\u00acW\2\u0206\u0207\7Q\2\2\u0207"+
		"\u0208\t\6\2\2\u0208\u0209\7\4\2\2\u0209\u020a\5\u00aaV\2\u020a\u020b"+
		"\7\5\2\2\u020b\u046d\3\2\2\2\u020c\u020d\7\21\2\2\u020d\u020e\7\u00eb"+
		"\2\2\u020e\u020f\5\u00acW\2\u020f\u0210\7Q\2\2\u0210\u0211\t\6\2\2\u0211"+
		"\u0212\5\u00aaV\2\u0212\u046d\3\2\2\2\u0213\u0214\7\21\2\2\u0214\u0215"+
		"\t\7\2\2\u0215\u0216\5\u00acW\2\u0216\u0217\7\u00c5\2\2\u0217\u0218\7"+
		"\u00f2\2\2\u0218\u0219\5\u00acW\2\u0219\u046d\3\2\2\2\u021a\u021b\7\21"+
		"\2\2\u021b\u021c\t\7\2\2\u021c\u021d\5\u00acW\2\u021d\u021e\7\u00dc\2"+
		"\2\u021e\u021f\7\u00ee\2\2\u021f\u0220\58\35\2\u0220\u046d\3\2\2\2\u0221"+
		"\u0222\7\21\2\2\u0222\u0223\t\7\2\2\u0223\u0224\5\u00acW\2\u0224\u0225"+
		"\7\u0103\2\2\u0225\u0228\7\u00ee\2\2\u0226\u0227\7u\2\2\u0227\u0229\7"+
		"Y\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\58\35\2\u022b\u046d\3\2\2\2\u022c\u022d\7\21\2\2\u022d\u022e\7"+
		"\u00eb\2\2\u022e\u022f\5\u00acW\2\u022f\u0231\t\b\2\2\u0230\u0232\7-\2"+
		"\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235"+
		"\5\u00acW\2\u0234\u0236\5\u010a\u0086\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u046d\3\2\2\2\u0237\u0238\7\21\2\2\u0238\u0239\7\u00eb"+
		"\2\2\u0239\u023b\5\u00acW\2\u023a\u023c\5&\24\2\u023b\u023a\3\2\2\2\u023b"+
		"\u023c\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\7%\2\2\u023e\u0240\7-\2"+
		"\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242"+
		"\5\u00acW\2\u0242\u0244\5\u00e6t\2\u0243\u0245\5\u00dco\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u046d\3\2\2\2\u0246\u0247\7\21\2\2"+
		"\u0247\u0248\7\u00eb\2\2\u0248\u024a\5\u00acW\2\u0249\u024b\5&\24\2\u024a"+
		"\u0249\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7\u00dc"+
		"\2\2\u024d\u024e\7\u00d9\2\2\u024e\u0252\7\u012b\2\2\u024f\u0250\7\u010f"+
		"\2\2\u0250\u0251\7\u00da\2\2\u0251\u0253\58\35\2\u0252\u024f\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u046d\3\2\2\2\u0254\u0255\7\21\2\2\u0255\u0256\7"+
		"\u00eb\2\2\u0256\u0258\5\u00acW\2\u0257\u0259\5&\24\2\u0258\u0257\3\2"+
		"\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\7\u00dc\2\2\u025b"+
		"\u025c\7\u00da\2\2\u025c\u025d\58\35\2\u025d\u046d\3\2\2\2\u025e\u025f"+
		"\7\21\2\2\u025f\u0260\t\7\2\2\u0260\u0261\5\u00acW\2\u0261\u0265\7\16"+
		"\2\2\u0262\u0263\7u\2\2\u0263\u0264\7\u009f\2\2\u0264\u0266\7Y\2\2\u0265"+
		"\u0262\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\5$"+
		"\23\2\u0268\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u046d\3\2\2\2\u026c\u026d\7\21\2\2\u026d\u026e\7"+
		"\u00eb\2\2\u026e\u026f\5\u00acW\2\u026f\u0270\5&\24\2\u0270\u0271\7\u00c5"+
		"\2\2\u0271\u0272\7\u00f2\2\2\u0272\u0273\5&\24\2\u0273\u046d\3\2\2\2\u0274"+
		"\u0275\7\21\2\2\u0275\u0276\t\7\2\2\u0276\u0277\5\u00acW\2\u0277\u027a"+
		"\7Q\2\2\u0278\u0279\7u\2\2\u0279\u027b\7Y\2\2\u027a\u0278\3\2\2\2\u027a"+
		"\u027b\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u0281\5&\24\2\u027d\u027e\7\6"+
		"\2\2\u027e\u0280\5&\24\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281"+
		"\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2"+
		"\2\2\u0284\u0286\7\u00bc\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u046d\3\2\2\2\u0287\u0288\7\21\2\2\u0288\u0289\7\u00eb\2\2\u0289\u028b"+
		"\5\u00acW\2\u028a\u028c\5&\24\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2"+
		"\2\u028c\u028d\3\2\2\2\u028d\u028e\7\u00dc\2\2\u028e\u028f\5\34\17\2\u028f"+
		"\u046d\3\2\2\2\u0290\u0291\7\21\2\2\u0291\u0292\7\u00eb\2\2\u0292\u0293"+
		"\5\u00acW\2\u0293\u0294\7\u00c1\2\2\u0294\u0295\7\u00b2\2\2\u0295\u046d"+
		"\3\2\2\2\u0296\u0297\7Q\2\2\u0297\u029a\7\u00eb\2\2\u0298\u0299\7u\2\2"+
		"\u0299\u029b\7Y\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c"+
		"\3\2\2\2\u029c\u029e\5\u00acW\2\u029d\u029f\7\u00bc\2\2\u029e\u029d\3"+
		"\2\2\2\u029e\u029f\3\2\2\2\u029f\u046d\3\2\2\2\u02a0\u02a1\7Q\2\2\u02a1"+
		"\u02a4\7\u010a\2\2\u02a2\u02a3\7u\2\2\u02a3\u02a5\7Y\2\2\u02a4\u02a2\3"+
		"\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u046d\5\u00acW\2"+
		"\u02a7\u02aa\78\2\2\u02a8\u02a9\7\u00a7\2\2\u02a9\u02ab\7\u00c7\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02b0\3\2\2\2\u02ac\u02ae\7n"+
		"\2\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\3\2\2\2\u02af"+
		"\u02b1\7\u00ef\2\2\u02b0\u02ad\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b6\7\u010a\2\2\u02b3\u02b4\7u\2\2\u02b4\u02b5\7\u009f"+
		"\2\2\u02b5\u02b7\7Y\2\2\u02b6\u02b3\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u02ba\5\u00acW\2\u02b9\u02bb\5\u009cO\2\u02ba\u02b9"+
		"\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c4\3\2\2\2\u02bc\u02c3\5\36\20\2"+
		"\u02bd\u02be\7\u00b1\2\2\u02be\u02bf\7\u00a3\2\2\u02bf\u02c3\5\u0094K"+
		"\2\u02c0\u02c1\7\u00ee\2\2\u02c1\u02c3\58\35\2\u02c2\u02bc\3\2\2\2\u02c2"+
		"\u02bd\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2"+
		"\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7"+
		"\u02c8\7\30\2\2\u02c8\u02c9\5 \21\2\u02c9\u046d\3\2\2\2\u02ca\u02cd\7"+
		"8\2\2\u02cb\u02cc\7\u00a7\2\2\u02cc\u02ce\7\u00c7\2\2\u02cd\u02cb\3\2"+
		"\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02d0\3\2\2\2\u02cf\u02d1\7n\2\2\u02d0"+
		"\u02cf\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7\u00ef"+
		"\2\2\u02d3\u02d4\7\u010a\2\2\u02d4\u02d9\5\u00aeX\2\u02d5\u02d6\7\4\2"+
		"\2\u02d6\u02d7\5\u00e4s\2\u02d7\u02d8\7\5\2\2\u02d8\u02da\3\2\2\2\u02d9"+
		"\u02d5\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02de\5\64"+
		"\33\2\u02dc\u02dd\7\u00a6\2\2\u02dd\u02df\58\35\2\u02de\u02dc\3\2\2\2"+
		"\u02de\u02df\3\2\2\2\u02df\u046d\3\2\2\2\u02e0\u02e1\7\21\2\2\u02e1\u02e2"+
		"\7\u010a\2\2\u02e2\u02e4\5\u00acW\2\u02e3\u02e5\7\30\2\2\u02e4\u02e3\3"+
		"\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\5 \21\2\u02e7"+
		"\u046d\3\2\2\2\u02e8\u02eb\78\2\2\u02e9\u02ea\7\u00a7\2\2\u02ea\u02ec"+
		"\7\u00c7\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2"+
		"\2\u02ed\u02ef\7\u00ef\2\2\u02ee\u02ed\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f0\3\2\2\2\u02f0\u02f4\7l\2\2\u02f1\u02f2\7u\2\2\u02f2\u02f3\7\u009f"+
		"\2\2\u02f3\u02f5\7Y\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f7\5\u00acW\2\u02f7\u02f8\7\30\2\2\u02f8\u0302"+
		"\7\u012b\2\2\u02f9\u02fa\7\u0107\2\2\u02fa\u02ff\5J&\2\u02fb\u02fc\7\6"+
		"\2\2\u02fc\u02fe\5J&\2\u02fd\u02fb\3\2\2\2\u02fe\u0301\3\2\2\2\u02ff\u02fd"+
		"\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0302"+
		"\u02f9\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u046d\3\2\2\2\u0304\u0306\7Q"+
		"\2\2\u0305\u0307\7\u00ef\2\2\u0306\u0305\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u030b\7l\2\2\u0309\u030a\7u\2\2\u030a\u030c\7Y\2"+
		"\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u046d"+
		"\5\u00acW\2\u030e\u0310\7Z\2\2\u030f\u0311\t\t\2\2\u0310\u030f\3\2\2\2"+
		"\u0310\u0311\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u046d\5\20\t\2\u0313\u0314"+
		"\7\u00df\2\2\u0314\u0317\7\u00ec\2\2\u0315\u0316\t\5\2\2\u0316\u0318\5"+
		"\u00acW\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031d\3\2\2\2"+
		"\u0319\u031b\7\u008b\2\2\u031a\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b"+
		"\u031c\3\2\2\2\u031c\u031e\7\u012b\2\2\u031d\u031a\3\2\2\2\u031d\u031e"+
		"\3\2\2\2\u031e\u046d\3\2\2\2\u031f\u0320\7\u00df\2\2\u0320\u0321\7\u00eb"+
		"\2\2\u0321\u0324\7\\\2\2\u0322\u0323\t\5\2\2\u0323\u0325\5\u00acW\2\u0324"+
		"\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\7\u008b"+
		"\2\2\u0327\u0329\7\u012b\2\2\u0328\u032a\5&\24\2\u0329\u0328\3\2\2\2\u0329"+
		"\u032a\3\2\2\2\u032a\u046d\3\2\2\2\u032b\u032c\7\u00df\2\2\u032c\u032d"+
		"\7\u00ee\2\2\u032d\u0332\5\u00acW\2\u032e\u032f\7\4\2\2\u032f\u0330\5"+
		"<\37\2\u0330\u0331\7\5\2\2\u0331\u0333\3\2\2\2\u0332\u032e\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u046d\3\2\2\2\u0334\u0335\7\u00df\2\2\u0335\u0336"+
		"\7.\2\2\u0336\u0337\t\5\2\2\u0337\u033a\5\u00acW\2\u0338\u0339\t\5\2\2"+
		"\u0339\u033b\5\u00acW\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u046d\3\2\2\2\u033c\u033d\7\u00df\2\2\u033d\u0340\7\u010b\2\2\u033e\u033f"+
		"\t\5\2\2\u033f\u0341\5\u00acW\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2"+
		"\2\u0341\u0346\3\2\2\2\u0342\u0344\7\u008b\2\2\u0343\u0342\3\2\2\2\u0343"+
		"\u0344\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\7\u012b\2\2\u0346\u0343"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u046d\3\2\2\2\u0348\u0349\7\u00df\2"+
		"\2\u0349\u034a\7\u00b2\2\2\u034a\u034c\5\u00acW\2\u034b\u034d\5&\24\2"+
		"\u034c\u034b\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u046d\3\2\2\2\u034e\u0350"+
		"\7\u00df\2\2\u034f\u0351\5\u0102\u0082\2\u0350\u034f\3\2\2\2\u0350\u0351"+
		"\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u035a\7m\2\2\u0353\u0355\7\u008b\2"+
		"\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0359"+
		"\5\u00acW\2\u0357\u0359\7\u012b\2\2\u0358\u0356\3\2\2\2\u0358\u0357\3"+
		"\2\2\2\u0359\u035b\3\2\2\2\u035a\u0354\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"\u046d\3\2\2\2\u035c\u035d\7\u00df\2\2\u035d\u035e\78\2\2\u035e\u035f"+
		"\7\u00eb\2\2\u035f\u0362\5\u00acW\2\u0360\u0361\7\30\2\2\u0361\u0363\7"+
		"\u00d9\2\2\u0362\u0360\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u046d\3\2\2\2"+
		"\u0364\u0365\7\u00df\2\2\u0365\u0366\7;\2\2\u0366\u046d\7\u009b\2\2\u0367"+
		"\u0368\t\n\2\2\u0368\u036a\7l\2\2\u0369\u036b\7\\\2\2\u036a\u0369\3\2"+
		"\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u046d\5,\27\2\u036d"+
		"\u036e\t\n\2\2\u036e\u0370\5*\26\2\u036f\u0371\7\\\2\2\u0370\u036f\3\2"+
		"\2\2\u0370\u0371\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u0373\5\u00acW\2\u0373"+
		"\u046d\3\2\2\2\u0374\u0375\t\n\2\2\u0375\u0376\7J\2\2\u0376\u046d\5\u00ac"+
		"W\2\u0377\u0378\t\n\2\2\u0378\u0379\7t\2\2\u0379\u037c\5\u00acW\2\u037a"+
		"\u037b\7\u008c\2\2\u037b\u037d\7\u012f\2\2\u037c\u037a\3\2\2\2\u037c\u037d"+
		"\3\2\2\2\u037d\u046d\3\2\2\2\u037e\u0380\t\n\2\2\u037f\u0381\7\u00eb\2"+
		"\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u0384"+
		"\t\13\2\2\u0383\u0382\3\2\2\2\u0383\u0384\3\2\2\2\u0384\u0385\3\2\2\2"+
		"\u0385\u0387\5\u00acW\2\u0386\u0388\5&\24\2\u0387\u0386\3\2\2\2\u0387"+
		"\u0388\3\2\2\2\u0388\u038a\3\2\2\2\u0389\u038b\5.\30\2\u038a\u0389\3\2"+
		"\2\2\u038a\u038b\3\2\2\2\u038b\u046d\3\2\2\2\u038c\u038e\t\n\2\2\u038d"+
		"\u038f\7\u00bd\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u046d\5 \21\2\u0391\u0392\7/\2\2\u0392\u0393\7\u00a3\2"+
		"\2\u0393\u0394\5*\26\2\u0394\u0395\5\u00acW\2\u0395\u0396\7\u0082\2\2"+
		"\u0396\u0397\t\f\2\2\u0397\u046d\3\2\2\2\u0398\u0399\7/\2\2\u0399\u039a"+
		"\7\u00a3\2\2\u039a\u039b\7\u00eb\2\2\u039b\u039c\5\u00acW\2\u039c\u039d"+
		"\7\u0082\2\2\u039d\u039e\t\f\2\2\u039e\u046d\3\2\2\2\u039f\u03a0\7\u00c4"+
		"\2\2\u03a0\u03a1\7\u00eb\2\2\u03a1\u046d\5\u00acW\2\u03a2\u03aa\7\u00c4"+
		"\2\2\u03a3\u03ab\7\u012b\2\2\u03a4\u03a6\13\2\2\2\u03a5\u03a4\3\2\2\2"+
		"\u03a6\u03a9\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03ab"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03a3\3\2\2\2\u03aa\u03a7\3\2\2\2\u03ab"+
		"\u046d\3\2\2\2\u03ac\u03ae\7!\2\2\u03ad\u03af\7\u0088\2\2\u03ae\u03ad"+
		"\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\u00eb\2"+
		"\2\u03b1\u03b4\5\u00acW\2\u03b2\u03b3\7\u00a6\2\2\u03b3\u03b5\58\35\2"+
		"\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03ba\3\2\2\2\u03b6\u03b8"+
		"\7\30\2\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2"+
		"\u03b9\u03bb\5 \21\2\u03ba\u03b7\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u046d"+
		"\3\2\2\2\u03bc\u03bd\7\u00fe\2\2\u03bd\u03c0\7\u00eb\2\2\u03be\u03bf\7"+
		"u\2\2\u03bf\u03c1\7Y\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1"+
		"\u03c2\3\2\2\2\u03c2\u046d\5\u00acW\2\u03c3\u03c4\7\'\2\2\u03c4\u046d"+
		"\7!\2\2\u03c5\u03c6\7\u0090\2\2\u03c6\u03c8\7@\2\2\u03c7\u03c9\7\u0091"+
		"\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cb\7|\2\2\u03cb\u03cd\7\u012b\2\2\u03cc\u03ce\7\u00af\2\2\u03cd\u03cc"+
		"\3\2\2\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\7\u0081\2"+
		"\2\u03d0\u03d1\7\u00eb\2\2\u03d1\u03d3\5\u00acW\2\u03d2\u03d4\5&\24\2"+
		"\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u046d\3\2\2\2\u03d5\u03d6"+
		"\7\u00fa\2\2\u03d6\u03d7\7\u00eb\2\2\u03d7\u03d9\5\u00acW\2\u03d8\u03da"+
		"\5&\24\2\u03d9\u03d8\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u046d\3\2\2\2\u03db"+
		"\u03dc\7\u009a\2\2\u03dc\u03dd\7\u00c6\2\2\u03dd\u03de\7\u00eb\2\2\u03de"+
		"\u046d\5\u00acW\2\u03df\u03e0\t\r\2\2\u03e0\u03e8\5\u0102\u0082\2\u03e1"+
		"\u03e9\7\u012b\2\2\u03e2\u03e4\13\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7"+
		"\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03e1\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e9\u046d\3\2"+
		"\2\2\u03ea\u03eb\7\u00dc\2\2\u03eb\u03ef\7\u00ce\2\2\u03ec\u03ee\13\2"+
		"\2\2\u03ed\u03ec\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03f0\3\2\2\2\u03ef"+
		"\u03ed\3\2\2\2\u03f0\u046d\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f6\7\u00dc"+
		"\2\2\u03f3\u03f5\13\2\2\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f7\3\2\2\2\u03f6\u03f4\3\2\2\2\u03f7\u046d\3\2\2\2\u03f8\u03f6\3\2"+
		"\2\2\u03f9\u046d\7\u00c8\2\2\u03fa\u03fb\7\u0099\2\2\u03fb\u03fc\7\u00eb"+
		"\2\2\u03fc\u03fe\5\u00acW\2\u03fd\u03ff\5&\24\2\u03fe\u03fd\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u0401\7\u00a6\2\2\u0401\u0403"+
		"\58\35\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u046d\3\2\2\2\u0404"+
		"\u0405\7\u0110\2\2\u0405\u0406\7\u0112\2\2\u0406\u046d\5\u0102\u0082\2"+
		"\u0407\u0408\7\u0113\2\2\u0408\u046d\5\u0102\u0082\2\u0409\u040a\7\u0111"+
		"\2\2\u040a\u040b\7\u00eb\2\2\u040b\u040d\5\u00acW\2\u040c\u040e\5&\24"+
		"\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0410"+
		"\7\u008c\2\2\u0410\u0411\5\u0108\u0085\2\u0411\u046d\3\2\2\2\u0412\u0413"+
		"\7\u0090\2\2\u0413\u0414\7@\2\2\u0414\u0415\5\u00c6d\2\u0415\u0416\7\u00eb"+
		"\2\2\u0416\u0419\5\u00acW\2\u0417\u0418\7\u00a6\2\2\u0418\u041a\58\35"+
		"\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u046d\3\2\2\2\u041b\u041d"+
		"\5\60\31\2\u041c\u041b\3\2\2\2\u041c\u041d\3\2\2\2\u041d\u041e\3\2\2\2"+
		"\u041e\u041f\7[\2\2\u041f\u0420\7\u00eb\2\2\u0420\u0422\5\u00acW\2\u0421"+
		"\u0423\5&\24\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0424\3\2"+
		"\2\2\u0424\u0425\7\u00f2\2\2\u0425\u0428\5\u00c6d\2\u0426\u0427\7\u00a6"+
		"\2\2\u0427\u0429\58\35\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429"+
		"\u046d\3\2\2\2\u042a\u042b\7\u0114\2\2\u042b\u042c\7\u00eb\2\2\u042c\u042e"+
		"\5\u00acW\2\u042d\u042f\5&\24\2\u042e\u042d\3\2\2\2\u042e\u042f\3\2\2"+
		"\2\u042f\u0432\3\2\2\2\u0430\u0431\7\u00a6\2\2\u0431\u0433\58\35\2\u0432"+
		"\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u046d\3\2\2\2\u0434\u0435\7\u0114"+
		"\2\2\u0435\u0436\7\u0115\2\2\u0436\u0439\5\u00c6d\2\u0437\u0438\7\u00a6"+
		"\2\2\u0438\u043a\58\35\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u046d\3\2\2\2\u043b\u043c\7\u0116\2\2\u043c\u043d\7\u0117\2\2\u043d\u043e"+
		"\7\4\2\2\u043e\u043f\7\u012b\2\2\u043f\u0440\7\5\2\2\u0440\u0441\7\u00a6"+
		"\2\2\u0441\u0442\58\35\2\u0442\u0443\7\u0118\2\2\u0443\u0444\7\4\2\2\u0444"+
		"\u0445\7\u012b\2\2\u0445\u0446\7\5\2\2\u0446\u0447\7\u00a6\2\2\u0447\u0448"+
		"\58\35\2\u0448\u046d\3\2\2\2\u0449\u044a\7\u0109\2\2\u044a\u044f\5\u00ac"+
		"W\2\u044b\u044c\7\u00cb\2\2\u044c\u044d\5\u0108\u0085\2\u044d\u044e\7"+
		"s\2\2\u044e\u0450\3\2\2\2\u044f\u044b\3\2\2\2\u044f\u0450\3\2\2\2\u0450"+
		"\u0453\3\2\2\2\u0451\u0452\7R\2\2\u0452\u0454\7\u00d4\2\2\u0453\u0451"+
		"\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u046d\3\2\2\2\u0455\u0456\7\66\2\2"+
		"\u0456\u0457\7\u00f2\2\2\u0457\u0458\t\16\2\2\u0458\u045f\5\u00acW\2\u0459"+
		"\u045a\7\u00b1\2\2\u045a\u045b\7 \2\2\u045b\u045c\7\4\2\2\u045c\u045d"+
		"\5\u00e4s\2\u045d\u045e\7\5\2\2\u045e\u0460\3\2\2\2\u045f\u0459\3\2\2"+
		"\2\u045f\u0460\3\2\2\2\u0460\u0463\3\2\2\2\u0461\u0462\7\u00a6\2\2\u0462"+
		"\u0464\58\35\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u046d\3\2"+
		"\2\2\u0465\u0469\5\22\n\2\u0466\u0468\13\2\2\2\u0467\u0466\3\2\2\2\u0468"+
		"\u046b\3\2\2\2\u0469\u046a\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046d\3\2"+
		"\2\2\u046b\u0469\3\2\2\2\u046c\u012d\3\2\2\2\u046c\u012f\3\2\2\2\u046c"+
		"\u0132\3\2\2\2\u046c\u0137\3\2\2\2\u046c\u0149\3\2\2\2\u046c\u0150\3\2"+
		"\2\2\u046c\u0156\3\2\2\2\u046c\u0160\3\2\2\2\u046c\u016c\3\2\2\2\u046c"+
		"\u017e\3\2\2\2\u046c\u018e\3\2\2\2\u046c\u01b5\3\2\2\2\u046c\u01ca\3\2"+
		"\2\2\u046c\u01d9\3\2\2\2\u046c\u01ea\3\2\2\2\u046c\u01f1\3\2\2\2\u046c"+
		"\u01fa\3\2\2\2\u046c\u0203\3\2\2\2\u046c\u020c\3\2\2\2\u046c\u0213\3\2"+
		"\2\2\u046c\u021a\3\2\2\2\u046c\u0221\3\2\2\2\u046c\u022c\3\2\2\2\u046c"+
		"\u0237\3\2\2\2\u046c\u0246\3\2\2\2\u046c\u0254\3\2\2\2\u046c\u025e\3\2"+
		"\2\2\u046c\u026c\3\2\2\2\u046c\u0274\3\2\2\2\u046c\u0287\3\2\2\2\u046c"+
		"\u0290\3\2\2\2\u046c\u0296\3\2\2\2\u046c\u02a0\3\2\2\2\u046c\u02a7\3\2"+
		"\2\2\u046c\u02ca\3\2\2\2\u046c\u02e0\3\2\2\2\u046c\u02e8\3\2\2\2\u046c"+
		"\u0304\3\2\2\2\u046c\u030e\3\2\2\2\u046c\u0313\3\2\2\2\u046c\u031f\3\2"+
		"\2\2\u046c\u032b\3\2\2\2\u046c\u0334\3\2\2\2\u046c\u033c\3\2\2\2\u046c"+
		"\u0348\3\2\2\2\u046c\u034e\3\2\2\2\u046c\u035c\3\2\2\2\u046c\u0364\3\2"+
		"\2\2\u046c\u0367\3\2\2\2\u046c\u036d\3\2\2\2\u046c\u0374\3\2\2\2\u046c"+
		"\u0377\3\2\2\2\u046c\u037e\3\2\2\2\u046c\u038c\3\2\2\2\u046c\u0391\3\2"+
		"\2\2\u046c\u0398\3\2\2\2\u046c\u039f\3\2\2\2\u046c\u03a2\3\2\2\2\u046c"+
		"\u03ac\3\2\2\2\u046c\u03bc\3\2\2\2\u046c\u03c3\3\2\2\2\u046c\u03c5\3\2"+
		"\2\2\u046c\u03d5\3\2\2\2\u046c\u03db\3\2\2\2\u046c\u03df\3\2\2\2\u046c"+
		"\u03ea\3\2\2\2\u046c\u03f2\3\2\2\2\u046c\u03f9\3\2\2\2\u046c\u03fa\3\2"+
		"\2\2\u046c\u0404\3\2\2\2\u046c\u0407\3\2\2\2\u046c\u0409\3\2\2\2\u046c"+
		"\u0412\3\2\2\2\u046c\u041c\3\2\2\2\u046c\u042a\3\2\2\2\u046c\u0434\3\2"+
		"\2\2\u046c\u043b\3\2\2\2\u046c\u0449\3\2\2\2\u046c\u0455\3\2\2\2\u046c"+
		"\u0465\3\2\2\2\u046d\21\3\2\2\2\u046e\u046f\78\2\2\u046f\u0517\7\u00ce"+
		"\2\2\u0470\u0471\7Q\2\2\u0471\u0517\7\u00ce\2\2\u0472\u0474\7o\2\2\u0473"+
		"\u0475\7\u00ce\2\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0517"+
		"\3\2\2\2\u0476\u0478\7\u00ca\2\2\u0477\u0479\7\u00ce\2\2\u0478\u0477\3"+
		"\2\2\2\u0478\u0479\3\2\2\2\u0479\u0517\3\2\2\2\u047a\u047b\7\u00df\2\2"+
		"\u047b\u0517\7o\2\2\u047c\u047d\7\u00df\2\2\u047d\u047f\7\u00ce\2\2\u047e"+
		"\u0480\7o\2\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0517\3\2"+
		"\2\2\u0481\u0482\7\u00df\2\2\u0482\u0517\7\u00ba\2\2\u0483\u0484\7\u00df"+
		"\2\2\u0484\u0517\7\u00cf\2\2\u0485\u0486\7\u00df\2\2\u0486\u0487\7;\2"+
		"\2\u0487\u0517\7\u00cf\2\2\u0488\u0489\7[\2\2\u0489\u0517\7\u00eb\2\2"+
		"\u048a\u048b\7w\2\2\u048b\u0517\7\u00eb\2\2\u048c\u048d\7\u00df\2\2\u048d"+
		"\u0517\7\62\2\2\u048e\u048f\7\u00df\2\2\u048f\u0490\78\2\2\u0490\u0517"+
		"\7\u00eb\2\2\u0491\u0492\7\u00df\2\2\u0492\u0517\7\u00f6\2\2\u0493\u0494"+
		"\7\u00df\2\2\u0494\u0517\7z\2\2\u0495\u0496\7\u00df\2\2\u0496\u0517\7"+
		"\u0094\2\2\u0497\u0498\78\2\2\u0498\u0517\7y\2\2\u0499\u049a\7Q\2\2\u049a"+
		"\u0517\7y\2\2\u049b\u049c\7\21\2\2\u049c\u0517\7y\2\2\u049d\u049e\7\u0093"+
		"\2\2\u049e\u0517\7\u00eb\2\2\u049f\u04a0\7\u0093\2\2\u04a0\u0517\7A\2"+
		"\2\u04a1\u04a2\7\u0102\2\2\u04a2\u0517\7\u00eb\2\2\u04a3\u04a4\7\u0102"+
		"\2\2\u04a4\u0517\7A\2\2\u04a5\u04a6\78\2\2\u04a6\u04a7\7\u00ef\2\2\u04a7"+
		"\u0517\7\u0096\2\2\u04a8\u04a9\7Q\2\2\u04a9\u04aa\7\u00ef\2\2\u04aa\u0517"+
		"\7\u0096\2\2\u04ab\u04ac\7\21\2\2\u04ac\u04ad\7\u00eb\2\2\u04ad\u04ae"+
		"\5\u00aeX\2\u04ae\u04af\7\u009f\2\2\u04af\u04b0\7)\2\2\u04b0\u0517\3\2"+
		"\2\2\u04b1\u04b2\7\21\2\2\u04b2\u04b3\7\u00eb\2\2\u04b3\u04b4\5\u00ae"+
		"X\2\u04b4\u04b5\7)\2\2\u04b5\u04b6\7 \2\2\u04b6\u0517\3\2\2\2\u04b7\u04b8"+
		"\7\21\2\2\u04b8\u04b9\7\u00eb\2\2\u04b9\u04ba\5\u00aeX\2\u04ba\u04bb\7"+
		"\u009f\2\2\u04bb\u04bc\7\u00e3\2\2\u04bc\u0517\3\2\2\2\u04bd\u04be\7\21"+
		"\2\2\u04be\u04bf\7\u00eb\2\2\u04bf\u04c0\5\u00aeX\2\u04c0\u04c1\7\u00e0"+
		"\2\2\u04c1\u04c2\7 \2\2\u04c2\u0517\3\2\2\2\u04c3\u04c4\7\21\2\2\u04c4"+
		"\u04c5\7\u00eb\2\2\u04c5\u04c6\5\u00aeX\2\u04c6\u04c7\7\u009f\2\2\u04c7"+
		"\u04c8\7\u00e0\2\2\u04c8\u0517\3\2\2\2\u04c9\u04ca\7\21\2\2\u04ca\u04cb"+
		"\7\u00eb\2\2\u04cb\u04cc\5\u00aeX\2\u04cc\u04cd\7\u009f\2\2\u04cd\u04ce"+
		"\7\u00e6\2\2\u04ce\u04cf\7\30\2\2\u04cf\u04d0\7L\2\2\u04d0\u0517\3\2\2"+
		"\2\u04d1\u04d2\7\21\2\2\u04d2\u04d3\7\u00eb\2\2\u04d3\u04d4\5\u00aeX\2"+
		"\u04d4\u04d5\7\u00dc\2\2\u04d5\u04d6\7\u00e0\2\2\u04d6\u04d7\7\u0092\2"+
		"\2\u04d7\u0517\3\2\2\2\u04d8\u04d9\7\21\2\2\u04d9\u04da\7\u00eb\2\2\u04da"+
		"\u04db\5\u00aeX\2\u04db\u04dc\7X\2\2\u04dc\u04dd\7\u00b0\2\2\u04dd\u0517"+
		"\3\2\2\2\u04de\u04df\7\21\2\2\u04df\u04e0\7\u00eb\2\2\u04e0\u04e1\5\u00ae"+
		"X\2\u04e1\u04e2\7\26\2\2\u04e2\u04e3\7\u00b0\2\2\u04e3\u0517\3\2\2\2\u04e4"+
		"\u04e5\7\21\2\2\u04e5\u04e6\7\u00eb\2\2\u04e6\u04e7\5\u00aeX\2\u04e7\u04e8"+
		"\7\u00fc\2\2\u04e8\u04e9\7\u00b0\2\2\u04e9\u0517\3\2\2\2\u04ea\u04eb\7"+
		"\21\2\2\u04eb\u04ec\7\u00eb\2\2\u04ec\u04ed\5\u00aeX\2\u04ed\u04ee\7\u00f3"+
		"\2\2\u04ee\u0517\3\2\2\2\u04ef\u04f0\7\21\2\2\u04f0\u04f1\7\u00eb\2\2"+
		"\u04f1\u04f3\5\u00aeX\2\u04f2\u04f4\5&\24\2\u04f3\u04f2\3\2\2\2\u04f3"+
		"\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f6\7\61\2\2\u04f6\u0517\3"+
		"\2\2\2\u04f7\u04f8\7\21\2\2\u04f8\u04f9\7\u00eb\2\2\u04f9\u04fb\5\u00ae"+
		"X\2\u04fa\u04fc\5&\24\2\u04fb\u04fa\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u04fe\7\64\2\2\u04fe\u0517\3\2\2\2\u04ff\u0500\7"+
		"\21\2\2\u0500\u0501\7\u00eb\2\2\u0501\u0503\5\u00aeX\2\u0502\u0504\5&"+
		"\24\2\u0503\u0502\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\7\u00dc\2\2\u0506\u0507\7c\2\2\u0507\u0517\3\2\2\2\u0508\u0509"+
		"\7\21\2\2\u0509\u050a\7\u00eb\2\2\u050a\u050c\5\u00aeX\2\u050b\u050d\5"+
		"&\24\2\u050c\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u050f\7\u00c7\2\2\u050f\u0510\7.\2\2\u0510\u0517\3\2\2\2\u0511\u0512"+
		"\7\u00e4\2\2\u0512\u0517\7\u00f5\2\2\u0513\u0517\7\60\2\2\u0514\u0517"+
		"\7\u00d0\2\2\u0515\u0517\7K\2\2\u0516\u046e\3\2\2\2\u0516\u0470\3\2\2"+
		"\2\u0516\u0472\3\2\2\2\u0516\u0476\3\2\2\2\u0516\u047a\3\2\2\2\u0516\u047c"+
		"\3\2\2\2\u0516\u0481\3\2\2\2\u0516\u0483\3\2\2\2\u0516\u0485\3\2\2\2\u0516"+
		"\u0488\3\2\2\2\u0516\u048a\3\2\2\2\u0516\u048c\3\2\2\2\u0516\u048e\3\2"+
		"\2\2\u0516\u0491\3\2\2\2\u0516\u0493\3\2\2\2\u0516\u0495\3\2\2\2\u0516"+
		"\u0497\3\2\2\2\u0516\u0499\3\2\2\2\u0516\u049b\3\2\2\2\u0516\u049d\3\2"+
		"\2\2\u0516\u049f\3\2\2\2\u0516\u04a1\3\2\2\2\u0516\u04a3\3\2\2\2\u0516"+
		"\u04a5\3\2\2\2\u0516\u04a8\3\2\2\2\u0516\u04ab\3\2\2\2\u0516\u04b1\3\2"+
		"\2\2\u0516\u04b7\3\2\2\2\u0516\u04bd\3\2\2\2\u0516\u04c3\3\2\2\2\u0516"+
		"\u04c9\3\2\2\2\u0516\u04d1\3\2\2\2\u0516\u04d8\3\2\2\2\u0516\u04de\3\2"+
		"\2\2\u0516\u04e4\3\2\2\2\u0516\u04ea\3\2\2\2\u0516\u04ef\3\2\2\2\u0516"+
		"\u04f7\3\2\2\2\u0516\u04ff\3\2\2\2\u0516\u0508\3\2\2\2\u0516\u0511\3\2"+
		"\2\2\u0516\u0513\3\2\2\2\u0516\u0514\3\2\2\2\u0516\u0515\3\2\2\2\u0517"+
		"\23\3\2\2\2\u0518\u051a\78\2\2\u0519\u051b\7\u00ef\2\2\u051a\u0519\3\2"+
		"\2\2\u051a\u051b\3\2\2\2\u051b\u051d\3\2\2\2\u051c\u051e\7]\2\2\u051d"+
		"\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0523\7\u00eb"+
		"\2\2\u0520\u0521\7u\2\2\u0521\u0522\7\u009f\2\2\u0522\u0524\7Y\2\2\u0523"+
		"\u0520\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\5\u00ac"+
		"W\2\u0526\25\3\2\2\2\u0527\u0528\78\2\2\u0528\u052a\7\u00a7\2\2\u0529"+
		"\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b\u052c\7\u00c7"+
		"\2\2\u052c\u052d\7\u00eb\2\2\u052d\u052e\5\u00acW\2\u052e\27\3\2\2\2\u052f"+
		"\u0530\7)\2\2\u0530\u0531\7 \2\2\u0531\u0535\5\u0094K\2\u0532\u0533\7"+
		"\u00e3\2\2\u0533\u0534\7 \2\2\u0534\u0536\5\u0098M\2\u0535\u0532\3\2\2"+
		"\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0538\7\u0081\2\2\u0538"+
		"\u0539\7\u012f\2\2\u0539\u053a\7\37\2\2\u053a\31\3\2\2\2\u053b\u053c\7"+
		"\u00e0\2\2\u053c\u053d\7 \2\2\u053d\u053e\5\u0094K\2\u053e\u0541\7\u00a3"+
		"\2\2\u053f\u0542\5@!\2\u0540\u0542\5B\"\2\u0541\u053f\3\2\2\2\u0541\u0540"+
		"\3\2\2\2\u0542\u0546\3\2\2\2\u0543\u0544\7\u00e6\2\2\u0544\u0545\7\30"+
		"\2\2\u0545\u0547\7L\2\2\u0546\u0543\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\33\3\2\2\2\u0548\u0549\7\u0092\2\2\u0549\u054a\7\u012b\2\2\u054a\35\3"+
		"\2\2\2\u054b\u054c\7/\2\2\u054c\u054d\7\u012b\2\2\u054d\37\3\2\2\2\u054e"+
		"\u0550\5\60\31\2\u054f\u054e\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0551\3"+
		"\2\2\2\u0551\u0552\5R*\2\u0552\u0553\5N(\2\u0553!\3\2\2\2\u0554\u0555"+
		"\7~\2\2\u0555\u0557\7\u00af\2\2\u0556\u0558\7\u00eb\2\2\u0557\u0556\3"+
		"\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u0560\5\u00acW\2"+
		"\u055a\u055e\5&\24\2\u055b\u055c\7u\2\2\u055c\u055d\7\u009f\2\2\u055d"+
		"\u055f\7Y\2\2\u055e\u055b\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561\3\2"+
		"\2\2\u0560\u055a\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0563\3\2\2\2\u0562"+
		"\u0564\5\u0094K\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0592"+
		"\3\2\2\2\u0565\u0566\7~\2\2\u0566\u0568\7\u0081\2\2\u0567\u0569\7\u00eb"+
		"\2\2\u0568\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\3\2\2\2\u056a"+
		"\u056c\5\u00acW\2\u056b\u056d\5&\24\2\u056c\u056b\3\2\2\2\u056c\u056d"+
		"\3\2\2\2\u056d\u0571\3\2\2\2\u056e\u056f\7u\2\2\u056f\u0570\7\u009f\2"+
		"\2\u0570\u0572\7Y\2\2\u0571\u056e\3\2\2\2\u0571\u0572\3\2\2\2\u0572\u0574"+
		"\3\2\2\2\u0573\u0575\5\u0094K\2\u0574\u0573\3\2\2\2\u0574\u0575\3\2\2"+
		"\2\u0575\u0592\3\2\2\2\u0576\u0577\7~\2\2\u0577\u0579\7\u00af\2\2\u0578"+
		"\u057a\7\u0091\2\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a\u057b"+
		"\3\2\2\2\u057b\u057c\7M\2\2\u057c\u057e\7\u012b\2\2\u057d\u057f\5\u00a8"+
		"U\2\u057e\u057d\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0581\3\2\2\2\u0580"+
		"\u0582\5D#\2\u0581\u0580\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0592\3\2\2"+
		"\2\u0583\u0584\7~\2\2\u0584\u0586\7\u00af\2\2\u0585\u0587\7\u0091\2\2"+
		"\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a"+
		"\7M\2\2\u0589\u058b\7\u012b\2\2\u058a\u0589\3\2\2\2\u058a\u058b\3\2\2"+
		"\2\u058b\u058c\3\2\2\2\u058c\u058f\5\64\33\2\u058d\u058e\7\u00a6\2\2\u058e"+
		"\u0590\58\35\2\u058f\u058d\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2"+
		"\2\2\u0591\u0554\3\2\2\2\u0591\u0565\3\2\2\2\u0591\u0576\3\2\2\2\u0591"+
		"\u0583\3\2\2\2\u0592#\3\2\2\2\u0593\u0595\5&\24\2\u0594\u0596\5\34\17"+
		"\2\u0595\u0594\3\2\2\2\u0595\u0596\3\2\2\2\u0596%\3\2\2\2\u0597\u0598"+
		"\7\u00b0\2\2\u0598\u0599\7\4\2\2\u0599\u059e\5(\25\2\u059a\u059b\7\6\2"+
		"\2\u059b\u059d\5(\25\2\u059c\u059a\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c"+
		"\3\2\2\2\u059e\u059f\3\2\2\2\u059f\u05a1\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1"+
		"\u05a2\7\5\2\2\u05a2\'\3\2\2\2\u05a3\u05a6\5\u0102\u0082\2\u05a4\u05a5"+
		"\7\u0119\2\2\u05a5\u05a7\5\u00c6d\2\u05a6\u05a4\3\2\2\2\u05a6\u05a7\3"+
		"\2\2\2\u05a7)\3\2\2\2\u05a8\u05a9\t\17\2\2\u05a9+\3\2\2\2\u05aa\u05b0"+
		"\5\u00fc\177\2\u05ab\u05b0\7\u012b\2\2\u05ac\u05b0\5\u00c8e\2\u05ad\u05b0"+
		"\5\u00caf\2\u05ae\u05b0\5\u00ccg\2\u05af\u05aa\3\2\2\2\u05af\u05ab\3\2"+
		"\2\2\u05af\u05ac\3\2\2\2\u05af\u05ad\3\2\2\2\u05af\u05ae\3\2\2\2\u05b0"+
		"-\3\2\2\2\u05b1\u05b6\5\u0102\u0082\2\u05b2\u05b3\7\7\2\2\u05b3\u05b5"+
		"\5\u0102\u0082\2\u05b4\u05b2\3\2\2\2\u05b5\u05b8\3\2\2\2\u05b6\u05b4\3"+
		"\2\2\2\u05b6\u05b7\3\2\2\2\u05b7/\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05ba"+
		"\7\u010f\2\2\u05ba\u05bf\5\62\32\2\u05bb\u05bc\7\6\2\2\u05bc\u05be\5\62"+
		"\32\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd\3\2\2\2\u05bf"+
		"\u05c0\3\2\2\2\u05c0\61\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2\u05c4\5\u00fe"+
		"\u0080\2\u05c3\u05c5\5\u0094K\2\u05c4\u05c3\3\2\2\2\u05c4\u05c5\3\2\2"+
		"\2\u05c5\u05c7\3\2\2\2\u05c6\u05c8\7\30\2\2\u05c7\u05c6\3\2\2\2\u05c7"+
		"\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\7\4\2\2\u05ca\u05cb\5 "+
		"\21\2\u05cb\u05cc\7\5\2\2\u05cc\63\3\2\2\2\u05cd\u05ce\7\u0107\2\2\u05ce"+
		"\u05cf\5\u00acW\2\u05cf\65\3\2\2\2\u05d0\u05d1\7\u00a6\2\2\u05d1\u05dd"+
		"\58\35\2\u05d2\u05d3\7\u00b1\2\2\u05d3\u05d4\7 \2\2\u05d4\u05dd\5\u00b6"+
		"\\\2\u05d5\u05dd\5\30\r\2\u05d6\u05dd\5\34\17\2\u05d7\u05dd\5\36\20\2"+
		"\u05d8\u05d9\7\u008f\2\2\u05d9\u05dd\7\u012f\2\2\u05da\u05db\7\u00ee\2"+
		"\2\u05db\u05dd\58\35\2\u05dc\u05d0\3\2\2\2\u05dc\u05d2\3\2\2\2\u05dc\u05d5"+
		"\3\2\2\2\u05dc\u05d6\3\2\2\2\u05dc\u05d7\3\2\2\2\u05dc\u05d8\3\2\2\2\u05dc"+
		"\u05da\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2"+
		"\2\2\u05df\67\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\7\4\2\2\u05e2\u05e7"+
		"\5:\36\2\u05e3\u05e4\7\6\2\2\u05e4\u05e6\5:\36\2\u05e5\u05e3\3\2\2\2\u05e6"+
		"\u05e9\3\2\2\2\u05e7\u05e5\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05ea\3\2"+
		"\2\2\u05e9\u05e7\3\2\2\2\u05ea\u05eb\7\5\2\2\u05eb9\3\2\2\2\u05ec\u05f1"+
		"\5<\37\2\u05ed\u05ef\7\u0119\2\2\u05ee\u05ed\3\2\2\2\u05ee\u05ef\3\2\2"+
		"\2\u05ef\u05f0\3\2\2\2\u05f0\u05f2\5> \2\u05f1\u05ee\3\2\2\2\u05f1\u05f2"+
		"\3\2\2\2\u05f2;\3\2\2\2\u05f3\u05f8\5\u0102\u0082\2\u05f4\u05f5\7\7\2"+
		"\2\u05f5\u05f7\5\u0102\u0082\2\u05f6\u05f4\3\2\2\2\u05f7\u05fa\3\2\2\2"+
		"\u05f8\u05f6\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05fd\3\2\2\2\u05fa\u05f8"+
		"\3\2\2\2\u05fb\u05fd\7\u012b\2\2\u05fc\u05f3\3\2\2\2\u05fc\u05fb\3\2\2"+
		"\2\u05fd=\3\2\2\2\u05fe\u0603\7\u012f\2\2\u05ff\u0603\7\u0131\2\2\u0600"+
		"\u0603\5\u00ceh\2\u0601\u0603\7\u012b\2\2\u0602\u05fe\3\2\2\2\u0602\u05ff"+
		"\3\2\2\2\u0602\u0600\3\2\2\2\u0602\u0601\3\2\2\2\u0603?\3\2\2\2\u0604"+
		"\u0605\7\4\2\2\u0605\u060a\5\u00c6d\2\u0606\u0607\7\6\2\2\u0607\u0609"+
		"\5\u00c6d\2\u0608\u0606\3\2\2\2\u0609\u060c\3\2\2\2\u060a\u0608\3\2\2"+
		"\2\u060a\u060b\3\2\2\2\u060b\u060d\3\2\2\2\u060c\u060a\3\2\2\2\u060d\u060e"+
		"\7\5\2\2\u060eA\3\2\2\2\u060f\u0610\7\4\2\2\u0610\u0615\5@!\2\u0611\u0612"+
		"\7\6\2\2\u0612\u0614\5@!\2\u0613\u0611\3\2\2\2\u0614\u0617\3\2\2\2\u0615"+
		"\u0613\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617\u0615\3\2"+
		"\2\2\u0618\u0619\7\5\2\2\u0619C\3\2\2\2\u061a\u061b\7\u00e6\2\2\u061b"+
		"\u061c\7\30\2\2\u061c\u0621\5F$\2\u061d\u061e\7\u00e6\2\2\u061e\u061f"+
		"\7 \2\2\u061f\u0621\5H%\2\u0620\u061a\3\2\2\2\u0620\u061d\3\2\2\2\u0621"+
		"E\3\2\2\2\u0622\u0623\7}\2\2\u0623\u0624\7\u012b\2\2\u0624\u0625\7\u00ab"+
		"\2\2\u0625\u0628\7\u012b\2\2\u0626\u0628\5\u0102\u0082\2\u0627\u0622\3"+
		"\2\2\2\u0627\u0626\3\2\2\2\u0628G\3\2\2\2\u0629\u062d\7\u012b\2\2\u062a"+
		"\u062b\7\u010f\2\2\u062b\u062c\7\u00da\2\2\u062c\u062e\58\35\2\u062d\u062a"+
		"\3\2\2\2\u062d\u062e\3\2\2\2\u062eI\3\2\2\2\u062f\u0630\5\u0102\u0082"+
		"\2\u0630\u0631\7\u012b\2\2\u0631K\3\2\2\2\u0632\u0633\5\"\22\2\u0633\u0634"+
		"\5R*\2\u0634\u0635\5N(\2\u0635\u0666\3\2\2\2\u0636\u0638\5x=\2\u0637\u0639"+
		"\5P)\2\u0638\u0637\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u0638\3\2\2\2\u063a"+
		"\u063b\3\2\2\2\u063b\u0666\3\2\2\2\u063c\u063d\7E\2\2\u063d\u063e\7j\2"+
		"\2\u063e\u063f\5\u00acW\2\u063f\u0641\5\u00a6T\2\u0640\u0642\5p9\2\u0641"+
		"\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0666\3\2\2\2\u0643\u0644\7\u0104"+
		"\2\2\u0644\u0645\5\u00acW\2\u0645\u0646\5\u00a6T\2\u0646\u0648\5b\62\2"+
		"\u0647\u0649\5p9\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u0666"+
		"\3\2\2\2\u064a\u064b\7\u0099\2\2\u064b\u064c\7\u0081\2\2\u064c\u064d\5"+
		"\u00acW\2\u064d\u064e\5\u00a6T\2\u064e\u0654\7\u0107\2\2\u064f\u0655\5"+
		"\u00acW\2\u0650\u0651\7\4\2\2\u0651\u0652\5 \21\2\u0652\u0653\7\5\2\2"+
		"\u0653\u0655\3\2\2\2\u0654\u064f\3\2\2\2\u0654\u0650\3\2\2\2\u0655\u0656"+
		"\3\2\2\2\u0656\u0657\5\u00a6T\2\u0657\u0658\7\u00a3\2\2\u0658\u065c\5"+
		"\u00be`\2\u0659\u065b\5d\63\2\u065a\u0659\3\2\2\2\u065b\u065e\3\2\2\2"+
		"\u065c\u065a\3\2\2\2\u065c\u065d\3\2\2\2\u065d\u0662\3\2\2\2\u065e\u065c"+
		"\3\2\2\2\u065f\u0661\5f\64\2\u0660\u065f\3\2\2\2\u0661\u0664\3\2\2\2\u0662"+
		"\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662\3\2"+
		"\2\2\u0665\u0632\3\2\2\2\u0665\u0636\3\2\2\2\u0665\u063c\3\2\2\2\u0665"+
		"\u0643\3\2\2\2\u0665\u064a\3\2\2\2\u0666M\3\2\2\2\u0667\u0668\7\u00a8"+
		"\2\2\u0668\u0669\7 \2\2\u0669\u066e\5V,\2\u066a\u066b\7\6\2\2\u066b\u066d"+
		"\5V,\2\u066c\u066a\3\2\2\2\u066d\u0670\3\2\2\2\u066e\u066c\3\2\2\2\u066e"+
		"\u066f\3\2\2\2\u066f\u0672\3\2\2\2\u0670\u066e\3\2\2\2\u0671\u0667\3\2"+
		"\2\2\u0671\u0672\3\2\2\2\u0672\u067d\3\2\2\2\u0673\u0674\7(\2\2\u0674"+
		"\u0675\7 \2\2\u0675\u067a\5\u00bc_\2\u0676\u0677\7\6\2\2\u0677\u0679\5"+
		"\u00bc_\2\u0678\u0676\3\2\2\2\u0679\u067c\3\2\2\2\u067a\u0678\3\2\2\2"+
		"\u067a\u067b\3\2\2\2\u067b\u067e\3\2\2\2\u067c\u067a\3\2\2\2\u067d\u0673"+
		"\3\2\2\2\u067d\u067e\3\2\2\2\u067e\u0689\3\2\2\2\u067f\u0680\7O\2\2\u0680"+
		"\u0681\7 \2\2\u0681\u0686\5\u00bc_\2\u0682\u0683\7\6\2\2\u0683\u0685\5"+
		"\u00bc_\2\u0684\u0682\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2"+
		"\u0686\u0687\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u067f"+
		"\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u0695\3\2\2\2\u068b\u068c\7\u00e2\2"+
		"\2\u068c\u068d\7 \2\2\u068d\u0692\5V,\2\u068e\u068f\7\6\2\2\u068f\u0691"+
		"\5V,\2\u0690\u068e\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690\3\2\2\2\u0692"+
		"\u0693\3\2\2\2\u0693\u0696\3\2\2\2\u0694\u0692\3\2\2\2\u0695\u068b\3\2"+
		"\2\2\u0695\u0696\3\2\2\2\u0696\u0698\3\2\2\2\u0697\u0699\5\u00eex\2\u0698"+
		"\u0697\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069f\3\2\2\2\u069a\u069d\7\u008c"+
		"\2\2\u069b\u069e\7\20\2\2\u069c\u069e\5\u00bc_\2\u069d\u069b\3\2\2\2\u069d"+
		"\u069c\3\2\2\2\u069e\u06a0\3\2\2\2\u069f\u069a\3\2\2\2\u069f\u06a0\3\2"+
		"\2\2\u06a0O\3\2\2\2\u06a1\u06a2\5\"\22\2\u06a2\u06a3\5Z.\2\u06a3Q\3\2"+
		"\2\2\u06a4\u06a5\b*\1\2\u06a5\u06a6\5T+\2\u06a6\u06be\3\2\2\2\u06a7\u06a8"+
		"\f\5\2\2\u06a8\u06a9\6*\5\2\u06a9\u06ab\t\20\2\2\u06aa\u06ac\5\u0086D"+
		"\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06bd"+
		"\5R*\6\u06ae\u06af\f\4\2\2\u06af\u06b0\6*\7\2\u06b0\u06b2\7\177\2\2\u06b1"+
		"\u06b3\5\u0086D\2\u06b2\u06b1\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4"+
		"\3\2\2\2\u06b4\u06bd\5R*\5\u06b5\u06b6\f\3\2\2\u06b6\u06b7\6*\t\2\u06b7"+
		"\u06b9\t\21\2\2\u06b8\u06ba\5\u0086D\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba"+
		"\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bd\5R*\4\u06bc\u06a7\3\2\2\2\u06bc"+
		"\u06ae\3\2\2\2\u06bc\u06b5\3\2\2\2\u06bd\u06c0\3\2\2\2\u06be\u06bc\3\2"+
		"\2\2\u06be\u06bf\3\2\2\2\u06bfS\3\2\2\2\u06c0\u06be\3\2\2\2\u06c1\u06cb"+
		"\5\\/\2\u06c2\u06cb\5X-\2\u06c3\u06c4\7\u00eb\2\2\u06c4\u06cb\5\u00ac"+
		"W\2\u06c5\u06cb\5\u00a2R\2\u06c6\u06c7\7\4\2\2\u06c7\u06c8\5 \21\2\u06c8"+
		"\u06c9\7\5\2\2\u06c9\u06cb\3\2\2\2\u06ca\u06c1\3\2\2\2\u06ca\u06c2\3\2"+
		"\2\2\u06ca\u06c3\3\2\2\2\u06ca\u06c5\3\2\2\2\u06ca\u06c6\3\2\2\2\u06cb"+
		"U\3\2\2\2\u06cc\u06ce\5\u00bc_\2\u06cd\u06cf\t\22\2\2\u06ce\u06cd\3\2"+
		"\2\2\u06ce\u06cf\3\2\2\2\u06cf\u06d2\3\2\2\2\u06d0\u06d1\7\u00a1\2\2\u06d1"+
		"\u06d3\t\23\2\2\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3W\3\2\2\2"+
		"\u06d4\u06d6\5x=\2\u06d5\u06d7\5Z.\2\u06d6\u06d5\3\2\2\2\u06d7\u06d8\3"+
		"\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9Y\3\2\2\2\u06da\u06dc"+
		"\5^\60\2\u06db\u06dd\5p9\2\u06dc\u06db\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd"+
		"\u06de\3\2\2\2\u06de\u06df\5N(\2\u06df\u06f6\3\2\2\2\u06e0\u06e4\5`\61"+
		"\2\u06e1\u06e3\5\u0084C\2\u06e2\u06e1\3\2\2\2\u06e3\u06e6\3\2\2\2\u06e4"+
		"\u06e2\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u06e8\3\2\2\2\u06e6\u06e4\3\2"+
		"\2\2\u06e7\u06e9\5p9\2\u06e8\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06eb"+
		"\3\2\2\2\u06ea\u06ec\5z>\2\u06eb\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec"+
		"\u06ee\3\2\2\2\u06ed\u06ef\5r:\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2"+
		"\2\u06ef\u06f1\3\2\2\2\u06f0\u06f2\5\u00eex\2\u06f1\u06f0\3\2\2\2\u06f1"+
		"\u06f2\3\2\2\2\u06f2\u06f3\3\2\2\2\u06f3\u06f4\5N(\2\u06f4\u06f6\3\2\2"+
		"\2\u06f5\u06da\3\2\2\2\u06f5\u06e0\3\2\2\2\u06f6[\3\2\2\2\u06f7\u06f9"+
		"\5^\60\2\u06f8\u06fa\5x=\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa"+
		"\u06fc\3\2\2\2\u06fb\u06fd\5p9\2\u06fc\u06fb\3\2\2\2\u06fc\u06fd\3\2\2"+
		"\2\u06fd\u0715\3\2\2\2\u06fe\u0700\5`\61\2\u06ff\u0701\5x=\2\u0700\u06ff"+
		"\3\2\2\2\u0700\u0701\3\2\2\2\u0701\u0705\3\2\2\2\u0702\u0704\5\u0084C"+
		"\2\u0703\u0702\3\2\2\2\u0704\u0707\3\2\2\2\u0705\u0703\3\2\2\2\u0705\u0706"+
		"\3\2\2\2\u0706\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0708\u070a\5p9\2\u0709"+
		"\u0708\3\2\2\2\u0709\u070a\3\2\2\2\u070a\u070c\3\2\2\2\u070b\u070d\5z"+
		">\2\u070c\u070b\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u070f\3\2\2\2\u070e"+
		"\u0710\5r:\2\u070f\u070e\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0712\3\2\2"+
		"\2\u0711\u0713\5\u00eex\2\u0712\u0711\3\2\2\2\u0712\u0713\3\2\2\2\u0713"+
		"\u0715\3\2\2\2\u0714\u06f7\3\2\2\2\u0714\u06fe\3\2\2\2\u0715]\3\2\2\2"+
		"\u0716\u0717\7\u00d6\2\2\u0717\u0718\7\u00f7\2\2\u0718\u0719\7\4\2\2\u0719"+
		"\u071a\5\u00b4[\2\u071a\u071b\7\5\2\2\u071b\u0721\3\2\2\2\u071c\u071d"+
		"\7\u0097\2\2\u071d\u0721\5\u00b4[\2\u071e\u071f\7\u00c2\2\2\u071f\u0721"+
		"\5\u00b4[\2\u0720\u0716\3\2\2\2\u0720\u071c\3\2\2\2\u0720\u071e\3\2\2"+
		"\2\u0721\u0723\3\2\2\2\u0722\u0724\5\u00a8U\2\u0723\u0722\3\2\2\2\u0723"+
		"\u0724\3\2\2\2\u0724\u0727\3\2\2\2\u0725\u0726\7\u00c0\2\2\u0726\u0728"+
		"\7\u012b\2\2\u0727\u0725\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u0729\3\2\2"+
		"\2\u0729\u072a\7\u0107\2\2\u072a\u0737\7\u012b\2\2\u072b\u0735\7\30\2"+
		"\2\u072c\u0736\5\u0096L\2\u072d\u0736\5\u00e4s\2\u072e\u0731\7\4\2\2\u072f"+
		"\u0732\5\u0096L\2\u0730\u0732\5\u00e4s\2\u0731\u072f\3\2\2\2\u0731\u0730"+
		"\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\7\5\2\2\u0734\u0736\3\2\2\2\u0735"+
		"\u072c\3\2\2\2\u0735\u072d\3\2\2\2\u0735\u072e\3\2\2\2\u0736\u0738\3\2"+
		"\2\2\u0737\u072b\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073a\3\2\2\2\u0739"+
		"\u073b\5\u00a8U\2\u073a\u0739\3\2\2\2\u073a\u073b\3\2\2\2\u073b\u073e"+
		"\3\2\2\2\u073c\u073d\7\u00bf\2\2\u073d\u073f\7\u012b\2\2\u073e\u073c\3"+
		"\2\2\2\u073e\u073f\3\2\2\2\u073f_\3\2\2\2\u0740\u0744\7\u00d6\2\2\u0741"+
		"\u0743\5t;\2\u0742\u0741\3\2\2\2\u0743\u0746\3\2\2\2\u0744\u0742\3\2\2"+
		"\2\u0744\u0745\3\2\2\2\u0745\u0748\3\2\2\2\u0746\u0744\3\2\2\2\u0747\u0749"+
		"\5\u0086D\2\u0748\u0747\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074a\3\2\2"+
		"\2\u074a\u074b\5\u00b4[\2\u074ba\3\2\2\2\u074c\u074d\7\u00dc\2\2\u074d"+
		"\u074e\5l\67\2\u074ec\3\2\2\2\u074f\u0750\7\u010c\2\2\u0750\u0753\7\u0098"+
		"\2\2\u0751\u0752\7\23\2\2\u0752\u0754\5\u00be`\2\u0753\u0751\3\2\2\2\u0753"+
		"\u0754\3\2\2\2\u0754\u0755\3\2\2\2\u0755\u0756\7\u00f1\2\2\u0756\u0757"+
		"\5h\65\2\u0757e\3\2\2\2\u0758\u0759\7\u010c\2\2\u0759\u075a\7\u009f\2"+
		"\2\u075a\u075d\7\u0098\2\2\u075b\u075c\7\23\2\2\u075c\u075e\5\u00be`\2"+
		"\u075d\u075b\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760"+
		"\7\u00f1\2\2\u0760\u0761\5j\66\2\u0761g\3\2\2\2\u0762\u076a\7E\2\2\u0763"+
		"\u0764\7\u0104\2\2\u0764\u0765\7\u00dc\2\2\u0765\u076a\7\u0123\2\2\u0766"+
		"\u0767\7\u0104\2\2\u0767\u0768\7\u00dc\2\2\u0768\u076a\5l\67\2\u0769\u0762"+
		"\3\2\2\2\u0769\u0763\3\2\2\2\u0769\u0766\3\2\2\2\u076ai\3\2\2\2\u076b"+
		"\u076c\7~\2\2\u076c\u077e\7\u0123\2\2\u076d\u076e\7~\2\2\u076e\u076f\7"+
		"\4\2\2\u076f\u0770\5\u00aaV\2\u0770\u0771\7\5\2\2\u0771\u0772\7\u0108"+
		"\2\2\u0772\u0773\7\4\2\2\u0773\u0778\5\u00bc_\2\u0774\u0775\7\6\2\2\u0775"+
		"\u0777\5\u00bc_\2\u0776\u0774\3\2\2\2\u0777\u077a\3\2\2\2\u0778\u0776"+
		"\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077b\3\2\2\2\u077a\u0778\3\2\2\2\u077b"+
		"\u077c\7\5\2\2\u077c\u077e\3\2\2\2\u077d\u076b\3\2\2\2\u077d\u076d\3\2"+
		"\2\2\u077ek\3\2\2\2\u077f\u0784\5n8\2\u0780\u0781\7\6\2\2\u0781\u0783"+
		"\5n8\2\u0782\u0780\3\2\2\2\u0783\u0786\3\2\2\2\u0784\u0782\3\2\2\2\u0784"+
		"\u0785\3\2\2\2\u0785m\3\2\2\2\u0786\u0784\3\2\2\2\u0787\u0788\5\u00ac"+
		"W\2\u0788\u0789\7\u0119\2\2\u0789\u078a\5\u00bc_\2\u078ao\3\2\2\2\u078b"+
		"\u078c\7\u010d\2\2\u078c\u078d\5\u00be`\2\u078dq\3\2\2\2\u078e\u078f\7"+
		"r\2\2\u078f\u0790\5\u00be`\2\u0790s\3\2\2\2\u0791\u0792\7\b\2\2\u0792"+
		"\u0799\5v<\2\u0793\u0795\7\6\2\2\u0794\u0793\3\2\2\2\u0794\u0795\3\2\2"+
		"\2\u0795\u0796\3\2\2\2\u0796\u0798\5v<\2\u0797\u0794\3\2\2\2\u0798\u079b"+
		"\3\2\2\2\u0799\u0797\3\2\2\2\u0799\u079a\3\2\2\2\u079a\u079c\3\2\2\2\u079b"+
		"\u0799\3\2\2\2\u079c\u079d\7\t\2\2\u079du\3\2\2\2\u079e\u07ac\5\u0102"+
		"\u0082\2\u079f\u07a0\5\u0102\u0082\2\u07a0\u07a1\7\4\2\2\u07a1\u07a6\5"+
		"\u00c4c\2\u07a2\u07a3\7\6\2\2\u07a3\u07a5\5\u00c4c\2\u07a4\u07a2\3\2\2"+
		"\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2\2\2\u07a7\u07a9"+
		"\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07aa\7\5\2\2\u07aa\u07ac\3\2\2\2\u07ab"+
		"\u079e\3\2\2\2\u07ab\u079f\3\2\2\2\u07acw\3\2\2\2\u07ad\u07ae\7j\2\2\u07ae"+
		"\u07b3\5\u0088E\2\u07af\u07b0\7\6\2\2\u07b0\u07b2\5\u0088E\2\u07b1\u07af"+
		"\3\2\2\2\u07b2\u07b5\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4"+
		"\u07b9\3\2\2\2\u07b5\u07b3\3\2\2\2\u07b6\u07b8\5\u0084C\2\u07b7\u07b6"+
		"\3\2\2\2\u07b8\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba"+
		"\u07bd\3\2\2\2\u07bb\u07b9\3\2\2\2\u07bc\u07be\5~@\2\u07bd\u07bc\3\2\2"+
		"\2\u07bd\u07be\3\2\2\2\u07bey\3\2\2\2\u07bf\u07c0\7p\2\2\u07c0\u07c1\7"+
		" \2\2\u07c1\u07c6\5\u00bc_\2\u07c2\u07c3\7\6\2\2\u07c3\u07c5\5\u00bc_"+
		"\2\u07c4\u07c2\3\2\2\2\u07c5\u07c8\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c7"+
		"\3\2\2\2\u07c7\u07da\3\2\2\2\u07c8\u07c6\3\2\2\2\u07c9\u07ca\7\u010f\2"+
		"\2\u07ca\u07db\7\u00d1\2\2\u07cb\u07cc\7\u010f\2\2\u07cc\u07db\7:\2\2"+
		"\u07cd\u07ce\7q\2\2\u07ce\u07cf\7\u00de\2\2\u07cf\u07d0\7\4\2\2\u07d0"+
		"\u07d5\5|?\2\u07d1\u07d2\7\6\2\2\u07d2\u07d4\5|?\2\u07d3\u07d1\3\2\2\2"+
		"\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u07d8"+
		"\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07d9\7\5\2\2\u07d9\u07db\3\2\2\2\u07da"+
		"\u07c9\3\2\2\2\u07da\u07cb\3\2\2\2\u07da\u07cd\3\2\2\2\u07da\u07db\3\2"+
		"\2\2\u07db\u07ec\3\2\2\2\u07dc\u07dd\7p\2\2\u07dd\u07de\7 \2\2\u07de\u07df"+
		"\7q\2\2\u07df\u07e0\7\u00de\2\2\u07e0\u07e1\7\4\2\2\u07e1\u07e6\5|?\2"+
		"\u07e2\u07e3\7\6\2\2\u07e3\u07e5\5|?\2\u07e4\u07e2\3\2\2\2\u07e5\u07e8"+
		"\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e9\3\2\2\2\u07e8"+
		"\u07e6\3\2\2\2\u07e9\u07ea\7\5\2\2\u07ea\u07ec\3\2\2\2\u07eb\u07bf\3\2"+
		"\2\2\u07eb\u07dc\3\2\2\2\u07ec{\3\2\2\2\u07ed\u07f6\7\4\2\2\u07ee\u07f3"+
		"\5\u00bc_\2\u07ef\u07f0\7\6\2\2\u07f0\u07f2\5\u00bc_\2\u07f1\u07ef\3\2"+
		"\2\2\u07f2\u07f5\3\2\2\2\u07f3\u07f1\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4"+
		"\u07f7\3\2\2\2\u07f5\u07f3\3\2\2\2\u07f6\u07ee\3\2\2\2\u07f6\u07f7\3\2"+
		"\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07fb\7\5\2\2\u07f9\u07fb\5\u00bc_\2\u07fa"+
		"\u07ed\3\2\2\2\u07fa\u07f9\3\2\2\2\u07fb}\3\2\2\2\u07fc\u07fd\7\u00b5"+
		"\2\2\u07fd\u07fe\7\4\2\2\u07fe\u07ff\5\u00b4[\2\u07ff\u0800\7f\2\2\u0800"+
		"\u0801\5\u0080A\2\u0801\u0802\7x\2\2\u0802\u0803\7\4\2\2\u0803\u0808\5"+
		"\u0082B\2\u0804\u0805\7\6\2\2\u0805\u0807\5\u0082B\2\u0806\u0804\3\2\2"+
		"\2\u0807\u080a\3\2\2\2\u0808\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b"+
		"\3\2\2\2\u080a\u0808\3\2\2\2\u080b\u080c\7\5\2\2\u080c\u080d\7\5\2\2\u080d"+
		"\177\3\2\2\2\u080e\u081b\5\u0102\u0082\2\u080f\u0810\7\4\2\2\u0810\u0815"+
		"\5\u0102\u0082\2\u0811\u0812\7\6\2\2\u0812\u0814\5\u0102\u0082\2\u0813"+
		"\u0811\3\2\2\2\u0814\u0817\3\2\2\2\u0815\u0813\3\2\2\2\u0815\u0816\3\2"+
		"\2\2\u0816\u0818\3\2\2\2\u0817\u0815\3\2\2\2\u0818\u0819\7\5\2\2\u0819"+
		"\u081b\3\2\2\2\u081a\u080e\3\2\2\2\u081a\u080f\3\2\2\2\u081b\u0081\3\2"+
		"\2\2\u081c\u0821\5\u00bc_\2\u081d\u081f\7\30\2\2\u081e\u081d\3\2\2\2\u081e"+
		"\u081f\3\2\2\2\u081f\u0820\3\2\2\2\u0820\u0822\5\u0102\u0082\2\u0821\u081e"+
		"\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0083\3\2\2\2\u0823\u0824\7\u0087\2"+
		"\2\u0824\u0826\7\u010a\2\2\u0825\u0827\7\u00aa\2\2\u0826\u0825\3\2\2\2"+
		"\u0826\u0827\3\2\2\2\u0827\u0828\3\2\2\2\u0828\u0829\5\u00fc\177\2\u0829"+
		"\u0832\7\4\2\2\u082a\u082f\5\u00bc_\2\u082b\u082c\7\6\2\2\u082c\u082e"+
		"\5\u00bc_\2\u082d\u082b\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2\2"+
		"\2\u082f\u0830\3\2\2\2\u0830\u0833\3\2\2\2\u0831\u082f\3\2\2\2\u0832\u082a"+
		"\3\2\2\2\u0832\u0833\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835\7\5\2\2\u0835"+
		"\u0841\5\u0102\u0082\2\u0836\u0838\7\30\2\2\u0837\u0836\3\2\2\2\u0837"+
		"\u0838\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083e\5\u0102\u0082\2\u083a\u083b"+
		"\7\6\2\2\u083b\u083d\5\u0102\u0082\2\u083c\u083a\3\2\2\2\u083d\u0840\3"+
		"\2\2\2\u083e\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0842\3\2\2\2\u0840"+
		"\u083e\3\2\2\2\u0841\u0837\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0085\3\2"+
		"\2\2\u0843\u0844\t\24\2\2\u0844\u0087\3\2\2\2\u0845\u0849\5\u00a0Q\2\u0846"+
		"\u0848\5\u008aF\2\u0847\u0846\3\2\2\2\u0848\u084b\3\2\2\2\u0849\u0847"+
		"\3\2\2\2\u0849\u084a\3\2\2\2\u084a\u0089\3\2\2\2\u084b\u0849\3\2\2\2\u084c"+
		"\u084d\5\u008cG\2\u084d\u084e\7\u0084\2\2\u084e\u0850\5\u00a0Q\2\u084f"+
		"\u0851\5\u008eH\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0858"+
		"\3\2\2\2\u0852\u0853\7\u009d\2\2\u0853\u0854\5\u008cG\2\u0854\u0855\7"+
		"\u0084\2\2\u0855\u0856\5\u00a0Q\2\u0856\u0858\3\2\2\2\u0857\u084c\3\2"+
		"\2\2\u0857\u0852\3\2\2\2\u0858\u008b\3\2\2\2\u0859\u085b\7{\2\2\u085a"+
		"\u0859\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u0872\3\2\2\2\u085c\u0872\79"+
		"\2\2\u085d\u085f\7\u008a\2\2\u085e\u0860\7\u00aa\2\2\u085f\u085e\3\2\2"+
		"\2\u085f\u0860\3\2\2\2\u0860";
	private static final String _serializedATNSegment1 =
		"\u0872\3\2\2\2\u0861\u0863\7\u008a\2\2\u0862\u0861\3\2\2\2\u0862\u0863"+
		"\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0872\7\u00d7\2\2\u0865\u0867\7\u00cc"+
		"\2\2\u0866\u0868\7\u00aa\2\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868"+
		"\u0872\3\2\2\2\u0869\u086b\7k\2\2\u086a\u086c\7\u00aa\2\2\u086b\u086a"+
		"\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u0872\3\2\2\2\u086d\u086f\7\u008a\2"+
		"\2\u086e\u086d\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\3\2\2\2\u0870\u0872"+
		"\7\24\2\2\u0871\u085a\3\2\2\2\u0871\u085c\3\2\2\2\u0871\u085d\3\2\2\2"+
		"\u0871\u0862\3\2\2\2\u0871\u0865\3\2\2\2\u0871\u0869\3\2\2\2\u0871\u086e"+
		"\3\2\2\2\u0872\u008d\3\2\2\2\u0873\u0874\7\u00a3\2\2\u0874\u0878\5\u00be"+
		"`\2\u0875\u0876\7\u0107\2\2\u0876\u0878\5\u0094K\2\u0877\u0873\3\2\2\2"+
		"\u0877\u0875\3\2\2\2\u0878\u008f\3\2\2\2\u0879\u087a\7\u00ed\2\2\u087a"+
		"\u087c\7\4\2\2\u087b\u087d\5\u0092J\2\u087c\u087b\3\2\2\2\u087c\u087d"+
		"\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\7\5\2\2\u087f\u0091\3\2\2\2\u0880"+
		"\u0882\7\u0122\2\2\u0881\u0880\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u0883"+
		"\3\2\2\2\u0883\u0884\t\25\2\2\u0884\u0899\7\u00b4\2\2\u0885\u0886\5\u00bc"+
		"_\2\u0886\u0887\7\u00d3\2\2\u0887\u0899\3\2\2\2\u0888\u0889\7\36\2\2\u0889"+
		"\u088a\7\u012f\2\2\u088a\u088b\7\u00a9\2\2\u088b\u088c\7\u00a2\2\2\u088c"+
		"\u0895\7\u012f\2\2\u088d\u0893\7\u00a3\2\2\u088e\u0894\5\u0102\u0082\2"+
		"\u088f\u0890\5\u00fc\177\2\u0890\u0891\7\4\2\2\u0891\u0892\7\5\2\2\u0892"+
		"\u0894\3\2\2\2\u0893\u088e\3\2\2\2\u0893\u088f\3\2\2\2\u0894\u0896\3\2"+
		"\2\2\u0895\u088d\3\2\2\2\u0895\u0896\3\2\2\2\u0896\u0899\3\2\2\2\u0897"+
		"\u0899\5\u00bc_\2\u0898\u0881\3\2\2\2\u0898\u0885\3\2\2\2\u0898\u0888"+
		"\3\2\2\2\u0898\u0897\3\2\2\2\u0899\u0093\3\2\2\2\u089a\u089b\7\4\2\2\u089b"+
		"\u089c\5\u0096L\2\u089c\u089d\7\5\2\2\u089d\u0095\3\2\2\2\u089e\u08a3"+
		"\5\u00fe\u0080\2\u089f\u08a0\7\6\2\2\u08a0\u08a2\5\u00fe\u0080\2\u08a1"+
		"\u089f\3\2\2\2\u08a2\u08a5\3\2\2\2\u08a3\u08a1\3\2\2\2\u08a3\u08a4\3\2"+
		"\2\2\u08a4\u0097\3\2\2\2\u08a5\u08a3\3\2\2\2\u08a6\u08a7\7\4\2\2\u08a7"+
		"\u08ac\5\u009aN\2\u08a8\u08a9\7\6\2\2\u08a9\u08ab\5\u009aN\2\u08aa\u08a8"+
		"\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad"+
		"\u08af\3\2\2\2\u08ae\u08ac\3\2\2\2\u08af\u08b0\7\5\2\2\u08b0\u0099\3\2"+
		"\2\2\u08b1\u08b3\5\u00fe\u0080\2\u08b2\u08b4\t\22\2\2\u08b3\u08b2\3\2"+
		"\2\2\u08b3\u08b4\3\2\2\2\u08b4\u009b\3\2\2\2\u08b5\u08b6\7\4\2\2\u08b6"+
		"\u08bb\5\u009eP\2\u08b7\u08b8\7\6\2\2\u08b8\u08ba\5\u009eP\2\u08b9\u08b7"+
		"\3\2\2\2\u08ba\u08bd\3\2\2\2\u08bb\u08b9\3\2\2\2\u08bb\u08bc\3\2\2\2\u08bc"+
		"\u08be\3\2\2\2\u08bd\u08bb\3\2\2\2\u08be\u08bf\7\5\2\2\u08bf\u009d\3\2"+
		"\2\2\u08c0\u08c2\5\u0102\u0082\2\u08c1\u08c3\5\36\20\2\u08c2\u08c1\3\2"+
		"\2\2\u08c2\u08c3\3\2\2\2\u08c3\u009f\3\2\2\2\u08c4\u08c6\5\u00acW\2\u08c5"+
		"\u08c7\5\u0090I\2\u08c6\u08c5\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c8"+
		"\3\2\2\2\u08c8\u08c9\5\u00a6T\2\u08c9\u08dd\3\2\2\2\u08ca\u08cb\7\4\2"+
		"\2\u08cb\u08cc\5 \21\2\u08cc\u08ce\7\5\2\2\u08cd\u08cf\5\u0090I\2\u08ce"+
		"\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\5\u00a6"+
		"T\2\u08d1\u08dd\3\2\2\2\u08d2\u08d3\7\4\2\2\u08d3\u08d4\5\u0088E\2\u08d4"+
		"\u08d6\7\5\2\2\u08d5\u08d7\5\u0090I\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7"+
		"\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\5\u00a6T\2\u08d9\u08dd\3\2\2"+
		"\2\u08da\u08dd\5\u00a2R\2\u08db\u08dd\5\u00a4S\2\u08dc\u08c4\3\2\2\2\u08dc"+
		"\u08ca\3\2\2\2\u08dc\u08d2\3\2\2\2\u08dc\u08da\3\2\2\2\u08dc\u08db\3\2"+
		"\2\2\u08dd\u00a1\3\2\2\2\u08de\u08df\7\u0108\2\2\u08df\u08e4\5\u00bc_"+
		"\2\u08e0\u08e1\7\6\2\2\u08e1\u08e3\5\u00bc_\2\u08e2\u08e0\3\2\2\2\u08e3"+
		"\u08e6\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e5\3\2\2\2\u08e5\u08e7\3\2"+
		"\2\2\u08e6\u08e4\3\2\2\2\u08e7\u08e8\5\u00a6T\2\u08e8\u00a3\3\2\2\2\u08e9"+
		"\u08ea\5\u00fe\u0080\2\u08ea\u08f3\7\4\2\2\u08eb\u08f0\5\u00bc_\2\u08ec"+
		"\u08ed\7\6\2\2\u08ed\u08ef\5\u00bc_\2\u08ee\u08ec\3\2\2\2\u08ef\u08f2"+
		"\3\2\2\2\u08f0\u08ee\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u08f4\3\2\2\2\u08f2"+
		"\u08f0\3\2\2\2\u08f3\u08eb\3\2\2\2\u08f3\u08f4\3\2\2\2\u08f4\u08f5\3\2"+
		"\2\2\u08f5\u08f6\7\5\2\2\u08f6\u08f7\5\u00a6T\2\u08f7\u00a5\3\2\2\2\u08f8"+
		"\u08fa\7\30\2\2\u08f9\u08f8\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fb\3"+
		"\2\2\2\u08fb\u08fd\5\u0104\u0083\2\u08fc\u08fe\5\u0094K\2\u08fd\u08fc"+
		"\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u0900\3\2\2\2\u08ff\u08f9\3\2\2\2\u08ff"+
		"\u0900\3\2\2\2\u0900\u00a7\3\2\2\2\u0901\u0902\7\u00d2\2\2\u0902\u0903"+
		"\7h\2\2\u0903\u0904\7\u00d9\2\2\u0904\u0908\7\u012b\2\2\u0905\u0906\7"+
		"\u010f\2\2\u0906\u0907\7\u00da\2\2\u0907\u0909\58\35\2\u0908\u0905\3\2"+
		"\2\2\u0908\u0909\3\2\2\2\u0909\u0933\3\2\2\2\u090a\u090b\7\u00d2\2\2\u090b"+
		"\u090c\7h\2\2\u090c\u0916\7F\2\2\u090d\u090e\7a\2\2\u090e\u090f\7\u00f0"+
		"\2\2\u090f\u0910\7 \2\2\u0910\u0914\7\u012b\2\2\u0911\u0912\7V\2\2\u0912"+
		"\u0913\7 \2\2\u0913\u0915\7\u012b\2\2\u0914\u0911\3\2\2\2\u0914\u0915"+
		"\3\2\2\2\u0915\u0917\3\2\2\2\u0916\u090d\3\2\2\2\u0916\u0917\3\2\2\2\u0917"+
		"\u091d\3\2\2\2\u0918\u0919\7,\2\2\u0919\u091a\7\u0083\2\2\u091a\u091b"+
		"\7\u00f0\2\2\u091b\u091c\7 \2\2\u091c\u091e\7\u012b\2\2\u091d\u0918\3"+
		"\2\2\2\u091d\u091e\3\2\2\2\u091e\u0924\3\2\2\2\u091f\u0920\7\u0097\2\2"+
		"\u0920\u0921\7\u0085\2\2\u0921\u0922\7\u00f0\2\2\u0922\u0923\7 \2\2\u0923"+
		"\u0925\7\u012b\2\2\u0924\u091f\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u092a"+
		"\3\2\2\2\u0926\u0927\7\u008d\2\2\u0927\u0928\7\u00f0\2\2\u0928\u0929\7"+
		" \2\2\u0929\u092b\7\u012b\2\2\u092a\u0926\3\2\2\2\u092a\u092b\3\2\2\2"+
		"\u092b\u0930\3\2\2\2\u092c\u092d\7\u00a0\2\2\u092d\u092e\7D\2\2\u092e"+
		"\u092f\7\30\2\2\u092f\u0931\7\u012b\2\2\u0930\u092c\3\2\2\2\u0930\u0931"+
		"\3\2\2\2\u0931\u0933\3\2\2\2\u0932\u0901\3\2\2\2\u0932\u090a\3\2\2\2\u0933"+
		"\u00a9\3\2\2\2\u0934\u0939\5\u00acW\2\u0935\u0936\7\6\2\2\u0936\u0938"+
		"\5\u00acW\2\u0937\u0935\3\2\2\2\u0938\u093b\3\2\2\2\u0939\u0937\3\2\2"+
		"\2\u0939\u093a\3\2\2\2\u093a\u00ab\3\2\2\2\u093b\u0939\3\2\2\2\u093c\u0941"+
		"\5\u00fe\u0080\2\u093d\u093e\7\7\2\2\u093e\u0940\5\u00fe\u0080\2\u093f"+
		"\u093d\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3\2\2\2\u0941\u0942\3\2"+
		"\2\2\u0942\u00ad\3\2\2\2\u0943\u0941\3\2\2\2\u0944\u0945\5\u00fe\u0080"+
		"\2\u0945\u0946\7\7\2\2\u0946\u0948\3\2\2\2\u0947\u0944\3\2\2\2\u0947\u0948"+
		"\3\2\2\2\u0948\u0949\3\2\2\2\u0949\u094a\5\u00fe\u0080\2\u094a\u00af\3"+
		"\2\2\2\u094b\u094c\5\u00fe\u0080\2\u094c\u094d\7\7\2\2\u094d\u094f\3\2"+
		"\2\2\u094e\u094b\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\3\2\2\2\u0950"+
		"\u0951\5\u00fe\u0080\2\u0951\u00b1\3\2\2\2\u0952\u095a\5\u00bc_\2\u0953"+
		"\u0955\7\30\2\2\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0958\3"+
		"\2\2\2\u0956\u0959\5\u00fe\u0080\2\u0957\u0959\5\u0094K\2\u0958\u0956"+
		"\3\2\2\2\u0958\u0957\3\2\2\2\u0959\u095b\3\2\2\2\u095a\u0954\3\2\2\2\u095a"+
		"\u095b\3\2\2\2\u095b\u00b3\3\2\2\2\u095c\u0961\5\u00b2Z\2\u095d\u095e"+
		"\7\6\2\2\u095e\u0960\5\u00b2Z\2\u095f\u095d\3\2\2\2\u0960\u0963\3\2\2"+
		"\2\u0961\u095f\3\2\2\2\u0961\u0962\3\2\2\2\u0962\u00b5\3\2\2\2\u0963\u0961"+
		"\3\2\2\2\u0964\u0965\7\4\2\2\u0965\u096a\5\u00b8]\2\u0966\u0967\7\6\2"+
		"\2\u0967\u0969\5\u00b8]\2\u0968\u0966\3\2\2\2\u0969\u096c\3\2\2\2\u096a"+
		"\u0968\3\2\2\2\u096a\u096b\3\2\2\2\u096b\u096d\3\2\2\2\u096c\u096a\3\2"+
		"\2\2\u096d\u096e\7\5\2\2\u096e\u00b7\3\2\2\2\u096f\u097d\5\u00fc\177\2"+
		"\u0970\u0971\5\u0102\u0082\2\u0971\u0972\7\4\2\2\u0972\u0977\5\u00ba^"+
		"\2\u0973\u0974\7\6\2\2\u0974\u0976\5\u00ba^\2\u0975\u0973\3\2\2\2\u0976"+
		"\u0979\3\2\2\2\u0977\u0975\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u097a\3\2"+
		"\2\2\u0979\u0977\3\2\2\2\u097a\u097b\7\5\2\2\u097b\u097d\3\2\2\2\u097c"+
		"\u096f\3\2\2\2\u097c\u0970\3\2\2\2\u097d\u00b9\3\2\2\2\u097e\u0981\5\u00fc"+
		"\177\2\u097f\u0981\5\u00c6d\2\u0980\u097e\3\2\2\2\u0980\u097f\3\2\2\2"+
		"\u0981\u00bb\3\2\2\2\u0982\u0983\5\u00be`\2\u0983\u00bd\3\2\2\2\u0984"+
		"\u0985\b`\1\2\u0985\u0986\7\u009f\2\2\u0986\u0991\5\u00be`\7\u0987\u0988"+
		"\7Y\2\2\u0988\u0989\7\4\2\2\u0989\u098a\5 \21\2\u098a\u098b\7\5\2\2\u098b"+
		"\u0991\3\2\2\2\u098c\u098e\5\u00c2b\2\u098d\u098f\5\u00c0a\2\u098e\u098d"+
		"\3\2\2\2\u098e\u098f\3\2\2\2\u098f\u0991\3\2\2\2\u0990\u0984\3\2\2\2\u0990"+
		"\u0987\3\2\2\2\u0990\u098c\3\2\2\2\u0991\u099a\3\2\2\2\u0992\u0993\f\4"+
		"\2\2\u0993\u0994\7\23\2\2\u0994\u0999\5\u00be`\5\u0995\u0996\f\3\2\2\u0996"+
		"\u0997\7\u00a7\2\2\u0997\u0999\5\u00be`\4\u0998\u0992\3\2\2\2\u0998\u0995"+
		"\3\2\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2\2\2\u099a\u099b\3\2\2\2\u099b"+
		"\u00bf\3\2\2\2\u099c\u099a\3\2\2\2\u099d\u099f\7\u009f\2\2\u099e\u099d"+
		"\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u09a1\7\34\2\2"+
		"\u09a1\u09a2\5\u00c2b\2\u09a2\u09a3\7\23\2\2\u09a3\u09a4\5\u00c2b\2\u09a4"+
		"\u09dc\3\2\2\2\u09a5\u09a7\7\u009f\2\2\u09a6\u09a5\3\2\2\2\u09a6\u09a7"+
		"\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\7x\2\2\u09a9\u09aa\7\4\2\2\u09aa"+
		"\u09af\5\u00bc_\2\u09ab\u09ac\7\6\2\2\u09ac\u09ae\5\u00bc_\2\u09ad\u09ab"+
		"\3\2\2\2\u09ae\u09b1\3\2\2\2\u09af\u09ad\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0"+
		"\u09b2\3\2\2\2\u09b1\u09af\3\2\2\2\u09b2\u09b3\7\5\2\2\u09b3\u09dc\3\2"+
		"\2\2\u09b4\u09b6\7\u009f\2\2\u09b5\u09b4\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6"+
		"\u09b7\3\2\2\2\u09b7\u09b8\7x\2\2\u09b8\u09b9\7\4\2\2\u09b9\u09ba\5 \21"+
		"\2\u09ba\u09bb\7\5\2\2\u09bb\u09dc\3\2\2\2\u09bc\u09be\7\u009f\2\2\u09bd"+
		"\u09bc\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c0\7\u00cd"+
		"\2\2\u09c0\u09dc\5\u00c2b\2\u09c1\u09c3\7\u009f\2\2\u09c2\u09c1\3\2\2"+
		"\2\u09c2\u09c3\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7\u008b\2\2\u09c5"+
		"\u09c8\5\u00c2b\2\u09c6\u09c7\7U\2\2\u09c7\u09c9\7\u012b\2\2\u09c8\u09c6"+
		"\3\2\2\2\u09c8\u09c9\3\2\2\2\u09c9\u09dc\3\2\2\2\u09ca\u09cc\7\u0082\2"+
		"\2\u09cb\u09cd\7\u009f\2\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2\2\2\u09cd"+
		"\u09ce\3\2\2\2\u09ce\u09dc\7\u00a0\2\2\u09cf\u09d1\7\u0082\2\2\u09d0\u09d2"+
		"\7\u009f\2\2\u09d1\u09d0\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d3\3\2\2"+
		"\2\u09d3\u09dc\t\26\2\2\u09d4\u09d6\7\u0082\2\2\u09d5\u09d7\7\u009f\2"+
		"\2\u09d6\u09d5\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09d8\3\2\2\2\u09d8\u09d9"+
		"\7N\2\2\u09d9\u09da\7j\2\2\u09da\u09dc\5\u00c2b\2\u09db\u099e\3\2\2\2"+
		"\u09db\u09a6\3\2\2\2\u09db\u09b5\3\2\2\2\u09db\u09bd\3\2\2\2\u09db\u09c2"+
		"\3\2\2\2\u09db\u09ca\3\2\2\2\u09db\u09cf\3\2\2\2\u09db\u09d4\3\2\2\2\u09dc"+
		"\u00c1\3\2\2\2\u09dd\u09de\bb\1\2\u09de\u09e2\5\u00c4c\2\u09df\u09e0\t"+
		"\27\2\2\u09e0\u09e2\5\u00c2b\t\u09e1\u09dd\3\2\2\2\u09e1\u09df\3\2\2\2"+
		"\u09e2\u09f8\3\2\2\2\u09e3\u09e4\f\b\2\2\u09e4\u09e5\t\30\2\2\u09e5\u09f7"+
		"\5\u00c2b\t\u09e6\u09e7\f\7\2\2\u09e7\u09e8\t\31\2\2\u09e8\u09f7\5\u00c2"+
		"b\b\u09e9\u09ea\f\6\2\2\u09ea\u09eb\7\u0127\2\2\u09eb\u09f7\5\u00c2b\7"+
		"\u09ec\u09ed\f\5\2\2\u09ed\u09ee\7\u012a\2\2\u09ee\u09f7\5\u00c2b\6\u09ef"+
		"\u09f0\f\4\2\2\u09f0\u09f1\7\u0128\2\2\u09f1\u09f7\5\u00c2b\5\u09f2\u09f3"+
		"\f\3\2\2\u09f3\u09f4\5\u00c8e\2\u09f4\u09f5\5\u00c2b\4\u09f5\u09f7\3\2"+
		"\2\2\u09f6\u09e3\3\2\2\2\u09f6\u09e6\3\2\2\2\u09f6\u09e9\3\2\2\2\u09f6"+
		"\u09ec\3\2\2\2\u09f6\u09ef\3\2\2\2\u09f6\u09f2\3\2\2\2\u09f7\u09fa\3\2"+
		"\2\2\u09f8\u09f6\3\2\2\2\u09f8\u09f9\3\2\2\2\u09f9\u00c3\3\2\2\2\u09fa"+
		"\u09f8\3\2\2\2\u09fb\u09fc\bc\1\2\u09fc\u0ab4\t\32\2\2\u09fd\u09ff\7#"+
		"\2\2\u09fe\u0a00\5\u00ecw\2\u09ff\u09fe\3\2\2\2\u0a00\u0a01\3\2\2\2\u0a01"+
		"\u09ff\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02\u0a05\3\2\2\2\u0a03\u0a04\7S"+
		"\2\2\u0a04\u0a06\5\u00bc_\2\u0a05\u0a03\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06"+
		"\u0a07\3\2\2\2\u0a07\u0a08\7T\2\2\u0a08\u0ab4\3\2\2\2\u0a09\u0a0a\7#\2"+
		"\2\u0a0a\u0a0c\5\u00bc_\2\u0a0b\u0a0d\5\u00ecw\2\u0a0c\u0a0b\3\2\2\2\u0a0d"+
		"\u0a0e\3\2\2\2\u0a0e\u0a0c\3\2\2\2\u0a0e\u0a0f\3\2\2\2\u0a0f\u0a12\3\2"+
		"\2\2\u0a10\u0a11\7S\2\2\u0a11\u0a13\5\u00bc_\2\u0a12\u0a10\3\2\2\2\u0a12"+
		"\u0a13\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15\7T\2\2\u0a15\u0ab4\3\2"+
		"\2\2\u0a16\u0a17\7$\2\2\u0a17\u0a18\7\4\2\2\u0a18\u0a19\5\u00bc_\2\u0a19"+
		"\u0a1a\7\30\2\2\u0a1a\u0a1b\5\u00dep\2\u0a1b\u0a1c\7\5\2\2\u0a1c\u0ab4"+
		"\3\2\2\2\u0a1d\u0a1e\7\u00e8\2\2\u0a1e\u0a27\7\4\2\2\u0a1f\u0a24\5\u00b2"+
		"Z\2\u0a20\u0a21\7\6\2\2\u0a21\u0a23\5\u00b2Z\2\u0a22\u0a20\3\2\2\2\u0a23"+
		"\u0a26\3\2\2\2\u0a24\u0a22\3\2\2\2\u0a24\u0a25\3\2\2\2\u0a25\u0a28\3\2"+
		"\2\2\u0a26\u0a24\3\2\2\2\u0a27\u0a1f\3\2\2\2\u0a27\u0a28\3\2\2\2\u0a28"+
		"\u0a29\3\2\2\2\u0a29\u0ab4\7\5\2\2\u0a2a\u0a2b\7d\2\2\u0a2b\u0a2c\7\4"+
		"\2\2\u0a2c\u0a2f\5\u00bc_\2\u0a2d\u0a2e\7v\2\2\u0a2e\u0a30\7\u00a1\2\2"+
		"\u0a2f\u0a2d\3\2\2\2\u0a2f\u0a30\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31\u0a32"+
		"\7\5\2\2\u0a32\u0ab4\3\2\2\2\u0a33\u0a34\7\u0086\2\2\u0a34\u0a35\7\4\2"+
		"\2\u0a35\u0a38\5\u00bc_\2\u0a36\u0a37\7v\2\2\u0a37\u0a39\7\u00a1\2\2\u0a38"+
		"\u0a36\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\7\5"+
		"\2\2\u0a3b\u0ab4\3\2\2\2\u0a3c\u0a3d\7\u00b7\2\2\u0a3d\u0a3e\7\4\2\2\u0a3e"+
		"\u0a3f\5\u00c2b\2\u0a3f\u0a40\7x\2\2\u0a40\u0a41\5\u00c2b\2\u0a41\u0a42"+
		"\7\5\2\2\u0a42\u0ab4\3\2\2\2\u0a43\u0ab4\5\u00c6d\2\u0a44\u0ab4\7\u0123"+
		"\2\2\u0a45\u0a46\5\u00fc\177\2\u0a46\u0a47\7\7\2\2\u0a47\u0a48\7\u0123"+
		"\2\2\u0a48\u0ab4\3\2\2\2\u0a49\u0a4a\7\4\2\2\u0a4a\u0a4d\5\u00b2Z\2\u0a4b"+
		"\u0a4c\7\6\2\2\u0a4c\u0a4e\5\u00b2Z\2\u0a4d\u0a4b\3\2\2\2\u0a4e\u0a4f"+
		"\3\2\2\2\u0a4f\u0a4d\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\3\2\2\2\u0a51"+
		"\u0a52\7\5\2\2\u0a52\u0ab4\3\2\2\2\u0a53\u0a54\7\4\2\2\u0a54\u0a55\5 "+
		"\21\2\u0a55\u0a56\7\5\2\2\u0a56\u0ab4\3\2\2\2\u0a57\u0a58\5\u00fa~\2\u0a58"+
		"\u0a64\7\4\2\2\u0a59\u0a5b\5\u0086D\2\u0a5a\u0a59\3\2\2\2\u0a5a\u0a5b"+
		"\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a61\5\u00bc_\2\u0a5d\u0a5e\7\6\2"+
		"\2\u0a5e\u0a60\5\u00bc_\2\u0a5f\u0a5d\3\2\2\2\u0a60\u0a63\3\2\2\2\u0a61"+
		"\u0a5f\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a65\3\2\2\2\u0a63\u0a61\3\2"+
		"\2\2\u0a64\u0a5a\3\2\2\2\u0a64\u0a65\3\2\2\2\u0a65\u0a66\3\2\2\2\u0a66"+
		"\u0a6d\7\5\2\2\u0a67\u0a68\7b\2\2\u0a68\u0a69\7\4\2\2\u0a69\u0a6a\7\u010d"+
		"\2\2\u0a6a\u0a6b\5\u00be`\2\u0a6b\u0a6c\7\5\2\2\u0a6c\u0a6e\3\2\2\2\u0a6d"+
		"\u0a67\3\2\2\2\u0a6d\u0a6e\3\2\2\2\u0a6e\u0a71\3\2\2\2\u0a6f\u0a70\7\u00ac"+
		"\2\2\u0a70\u0a72\5\u00f2z\2\u0a71\u0a6f\3\2\2\2\u0a71\u0a72\3\2\2\2\u0a72"+
		"\u0ab4\3\2\2\2\u0a73\u0a74\5\u0102\u0082\2\u0a74\u0a75\7\n\2\2\u0a75\u0a76"+
		"\5\u00bc_\2\u0a76\u0ab4\3\2\2\2\u0a77\u0a78\7\4\2\2\u0a78\u0a7b\5\u0102"+
		"\u0082\2\u0a79\u0a7a\7\6\2\2\u0a7a\u0a7c\5\u0102\u0082\2\u0a7b\u0a79\3"+
		"\2\2\2\u0a7c\u0a7d\3\2\2\2\u0a7d\u0a7b\3\2\2\2\u0a7d\u0a7e\3\2\2\2\u0a7e"+
		"\u0a7f\3\2\2\2\u0a7f\u0a80\7\5\2\2\u0a80\u0a81\7\n\2\2\u0a81\u0a82\5\u00bc"+
		"_\2\u0a82\u0ab4\3\2\2\2\u0a83\u0ab4\5\u0102\u0082\2\u0a84\u0a85\7\4\2"+
		"\2\u0a85\u0a86\5\u00bc_\2\u0a86\u0a87\7\5\2\2\u0a87\u0ab4\3\2\2\2\u0a88"+
		"\u0a89\7^\2\2\u0a89\u0a8a\7\4\2\2\u0a8a\u0a8b\5\u0102\u0082\2\u0a8b\u0a8c"+
		"\7j\2\2\u0a8c\u0a8d\5\u00c2b\2\u0a8d\u0a8e\7\5\2\2\u0a8e\u0ab4\3\2\2\2"+
		"\u0a8f\u0a90\t\33\2\2\u0a90\u0a91\7\4\2\2\u0a91\u0a92\5\u00c2b\2\u0a92"+
		"\u0a93\t\34\2\2\u0a93\u0a96\5\u00c2b\2\u0a94\u0a95\t\35\2\2\u0a95\u0a97"+
		"\5\u00c2b\2\u0a96\u0a94\3\2\2\2\u0a96\u0a97\3\2\2\2\u0a97\u0a98\3\2\2"+
		"\2\u0a98\u0a99\7\5\2\2\u0a99\u0ab4\3\2\2\2\u0a9a\u0a9b\7\u00f8\2\2\u0a9b"+
		"\u0a9d\7\4\2\2\u0a9c\u0a9e\t\36\2\2\u0a9d\u0a9c\3\2\2\2\u0a9d\u0a9e\3"+
		"\2\2\2\u0a9e\u0aa0\3\2\2\2\u0a9f\u0aa1\5\u00c2b\2\u0aa0\u0a9f\3\2\2\2"+
		"\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aa2\3\2\2\2\u0aa2\u0aa3\7j\2\2\u0aa3\u0aa4"+
		"\5\u00c2b\2\u0aa4\u0aa5\7\5\2\2\u0aa5\u0ab4\3\2\2\2\u0aa6\u0aa7\7\u00ae"+
		"\2\2\u0aa7\u0aa8\7\4\2\2\u0aa8\u0aa9\5\u00c2b\2\u0aa9\u0aaa\7\u00b6\2"+
		"\2\u0aaa\u0aab\5\u00c2b\2\u0aab\u0aac\7j\2\2\u0aac\u0aaf\5\u00c2b\2\u0aad"+
		"\u0aae\7f\2\2\u0aae\u0ab0\5\u00c2b\2\u0aaf\u0aad\3\2\2\2\u0aaf\u0ab0\3"+
		"\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab2\7\5\2\2\u0ab2\u0ab4\3\2\2\2\u0ab3"+
		"\u09fb\3\2\2\2\u0ab3\u09fd\3\2\2\2\u0ab3\u0a09\3\2\2\2\u0ab3\u0a16\3\2"+
		"\2\2\u0ab3\u0a1d\3\2\2\2\u0ab3\u0a2a\3\2\2\2\u0ab3\u0a33\3\2\2\2\u0ab3"+
		"\u0a3c\3\2\2\2\u0ab3\u0a43\3\2\2\2\u0ab3\u0a44\3\2\2\2\u0ab3\u0a45\3\2"+
		"\2\2\u0ab3\u0a49\3\2\2\2\u0ab3\u0a53\3\2\2\2\u0ab3\u0a57\3\2\2\2\u0ab3"+
		"\u0a73\3\2\2\2\u0ab3\u0a77\3\2\2\2\u0ab3\u0a83\3\2\2\2\u0ab3\u0a84\3\2"+
		"\2\2\u0ab3\u0a88\3\2\2\2\u0ab3\u0a8f\3\2\2\2\u0ab3\u0a9a\3\2\2\2\u0ab3"+
		"\u0aa6\3\2\2\2\u0ab4\u0abf\3\2\2\2\u0ab5\u0ab6\f\n\2\2\u0ab6\u0ab7\7\13"+
		"\2\2\u0ab7\u0ab8\5\u00c2b\2\u0ab8\u0ab9\7\f\2\2\u0ab9\u0abe\3\2\2\2\u0aba"+
		"\u0abb\f\b\2\2\u0abb\u0abc\7\7\2\2\u0abc\u0abe\5\u0102\u0082\2\u0abd\u0ab5"+
		"\3\2\2\2\u0abd\u0aba\3\2\2\2\u0abe\u0ac1\3\2\2\2\u0abf\u0abd\3\2\2\2\u0abf"+
		"\u0ac0\3\2\2\2\u0ac0\u00c5\3\2\2\2\u0ac1\u0abf\3\2\2\2\u0ac2\u0acf\7\u00a0"+
		"\2\2\u0ac3\u0acf\5\u00d0i\2\u0ac4\u0ac5\5\u0102\u0082\2\u0ac5\u0ac6\7"+
		"\u012b\2\2\u0ac6\u0acf\3\2\2\2\u0ac7\u0acf\5\u0108\u0085\2\u0ac8\u0acf"+
		"\5\u00ceh\2\u0ac9\u0acb\7\u012b\2\2\u0aca\u0ac9\3\2\2\2\u0acb\u0acc\3"+
		"\2\2\2\u0acc\u0aca\3\2\2\2\u0acc\u0acd\3\2\2\2\u0acd\u0acf\3\2\2\2\u0ace"+
		"\u0ac2\3\2\2\2\u0ace\u0ac3\3\2\2\2\u0ace\u0ac4\3\2\2\2\u0ace\u0ac7\3\2"+
		"\2\2\u0ace\u0ac8\3\2\2\2\u0ace\u0aca\3\2\2\2\u0acf\u00c7\3\2\2\2\u0ad0"+
		"\u0ad1\t\37\2\2\u0ad1\u00c9\3\2\2\2\u0ad2\u0ad3\t \2\2\u0ad3\u00cb\3\2"+
		"\2\2\u0ad4\u0ad5\t!\2\2\u0ad5\u00cd\3\2\2\2\u0ad6\u0ad7\t\"\2\2\u0ad7"+
		"\u00cf\3\2\2\2\u0ad8\u0adb\7\u0080\2\2\u0ad9\u0adc\5\u00d2j\2\u0ada\u0adc"+
		"\5\u00d6l\2\u0adb\u0ad9\3\2\2\2\u0adb\u0ada\3\2\2\2\u0adb\u0adc\3\2\2"+
		"\2\u0adc\u00d1\3\2\2\2\u0add\u0adf\5\u00d4k\2\u0ade\u0ae0\5\u00d8m\2\u0adf"+
		"\u0ade\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u00d3\3\2\2\2\u0ae1\u0ae2\5\u00da"+
		"n\2\u0ae2\u0ae3\5\u0102\u0082\2\u0ae3\u0ae5\3\2\2\2\u0ae4\u0ae1\3\2\2"+
		"\2\u0ae5\u0ae6\3\2\2\2\u0ae6\u0ae4\3\2\2\2\u0ae6\u0ae7\3\2\2\2\u0ae7\u00d5"+
		"\3\2\2\2\u0ae8\u0aeb\5\u00d8m\2\u0ae9\u0aec\5\u00d4k\2\u0aea\u0aec\5\u00d8"+
		"m\2\u0aeb\u0ae9\3\2\2\2\u0aeb\u0aea\3\2\2\2\u0aeb\u0aec\3\2\2\2\u0aec"+
		"\u00d7\3\2\2\2\u0aed\u0aee\5\u00dan\2\u0aee\u0aef\5\u0102\u0082\2\u0aef"+
		"\u0af0\7\u00f2\2\2\u0af0\u0af1\5\u0102\u0082\2\u0af1\u00d9\3\2\2\2\u0af2"+
		"\u0af4\t#\2\2\u0af3\u0af2\3\2\2\2\u0af3\u0af4\3\2\2\2\u0af4\u0af5\3\2"+
		"\2\2\u0af5\u0af8\t\25\2\2\u0af6\u0af8\7\u012b\2\2\u0af7\u0af3\3\2\2\2"+
		"\u0af7\u0af6\3\2\2\2\u0af8\u00db\3\2\2\2\u0af9\u0afd\7d\2\2\u0afa\u0afb"+
		"\7\17\2\2\u0afb\u0afd\5\u00fe\u0080\2\u0afc\u0af9\3\2\2\2\u0afc\u0afa"+
		"\3\2\2\2\u0afd\u00dd\3\2\2\2\u0afe\u0aff\7\27\2\2\u0aff\u0b00\7\u011d"+
		"\2\2\u0b00\u0b01\5\u00dep\2\u0b01\u0b02\7\u011f\2\2\u0b02\u0b21\3\2\2"+
		"\2\u0b03\u0b04\7\u0097\2\2\u0b04\u0b05\7\u011d\2\2\u0b05\u0b06\5\u00de"+
		"p\2\u0b06\u0b07\7\6\2\2\u0b07\u0b08\5\u00dep\2\u0b08\u0b09\7\u011f\2\2"+
		"\u0b09\u0b21\3\2\2\2\u0b0a\u0b11\7\u00e8\2\2\u0b0b\u0b0d\7\u011d\2\2\u0b0c"+
		"\u0b0e\5\u00e8u\2\u0b0d\u0b0c\3\2\2\2\u0b0d\u0b0e\3\2\2\2\u0b0e\u0b0f"+
		"\3\2\2\2\u0b0f\u0b12\7\u011f\2\2\u0b10\u0b12\7\u011b\2\2\u0b11\u0b0b\3"+
		"\2\2\2\u0b11\u0b10\3\2\2\2\u0b12\u0b21\3\2\2\2\u0b13\u0b1e\5\u0102\u0082"+
		"\2\u0b14\u0b15\7\4\2\2\u0b15\u0b1a\7\u012f\2\2\u0b16\u0b17\7\6\2\2\u0b17"+
		"\u0b19\7\u012f\2\2\u0b18\u0b16\3\2\2\2\u0b19\u0b1c\3\2\2\2\u0b1a\u0b18"+
		"\3\2\2\2\u0b1a\u0b1b\3\2\2\2\u0b1b\u0b1d\3\2\2\2\u0b1c\u0b1a\3\2\2\2\u0b1d"+
		"\u0b1f\7\5\2\2\u0b1e\u0b14\3\2\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f\u0b21\3\2"+
		"\2\2\u0b20\u0afe\3\2\2\2\u0b20\u0b03\3\2\2\2\u0b20\u0b0a\3\2\2\2\u0b20"+
		"\u0b13\3\2\2\2\u0b21\u00df\3\2\2\2\u0b22\u0b27\5\u00e2r\2\u0b23\u0b24"+
		"\7\6\2\2\u0b24\u0b26\5\u00e2r\2\u0b25\u0b23\3\2\2\2\u0b26\u0b29\3\2\2"+
		"\2\u0b27\u0b25\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u00e1\3\2\2\2\u0b29\u0b27"+
		"\3\2\2\2\u0b2a\u0b2b\5\u00acW\2\u0b2b\u0b2e\5\u00dep\2\u0b2c\u0b2d\7\u009f"+
		"\2\2\u0b2d\u0b2f\7\u00a0\2\2\u0b2e\u0b2c\3\2\2\2\u0b2e\u0b2f\3\2\2\2\u0b2f"+
		"\u0b31\3\2\2\2\u0b30\u0b32\5\36\20\2\u0b31\u0b30\3\2\2\2\u0b31\u0b32\3"+
		"\2\2\2\u0b32\u0b34\3\2\2\2\u0b33\u0b35\5\u00dco\2\u0b34\u0b33\3\2\2\2"+
		"\u0b34\u0b35\3\2\2\2\u0b35\u00e3\3\2\2\2\u0b36\u0b3b\5\u00e6t\2\u0b37"+
		"\u0b38\7\6\2\2\u0b38\u0b3a\5\u00e6t\2\u0b39\u0b37\3\2\2\2\u0b3a\u0b3d"+
		"\3\2\2\2\u0b3b\u0b39\3\2\2\2\u0b3b\u0b3c\3\2\2\2\u0b3c\u00e5\3\2\2\2\u0b3d"+
		"\u0b3b\3\2\2\2\u0b3e\u0b3f\5\u00fe\u0080\2\u0b3f\u0b42\5\u00dep\2\u0b40"+
		"\u0b41\7\u009f\2\2\u0b41\u0b43\7\u00a0\2\2\u0b42\u0b40\3\2\2\2\u0b42\u0b43"+
		"\3\2\2\2\u0b43\u0b45\3\2\2\2\u0b44\u0b46\5\36\20\2\u0b45\u0b44\3\2\2\2"+
		"\u0b45\u0b46\3\2\2\2\u0b46\u00e7\3\2\2\2\u0b47\u0b4c\5\u00eav\2\u0b48"+
		"\u0b49\7\6\2\2\u0b49\u0b4b\5\u00eav\2\u0b4a\u0b48\3\2\2\2\u0b4b\u0b4e"+
		"\3\2\2\2\u0b4c\u0b4a\3\2\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u00e9\3\2\2\2\u0b4e"+
		"\u0b4c\3\2\2\2\u0b4f\u0b50\5\u0102\u0082\2\u0b50\u0b51\7\r\2\2\u0b51\u0b54"+
		"\5\u00dep\2\u0b52\u0b53\7\u009f\2\2\u0b53\u0b55\7\u00a0\2\2\u0b54\u0b52"+
		"\3\2\2\2\u0b54\u0b55\3\2\2\2\u0b55\u0b57\3\2\2\2\u0b56\u0b58\5\36\20\2"+
		"\u0b57\u0b56\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u00eb\3\2\2\2\u0b59\u0b5a"+
		"\7\u010c\2\2\u0b5a\u0b5b\5\u00bc_\2\u0b5b\u0b5c\7\u00f1\2\2\u0b5c\u0b5d"+
		"\5\u00bc_\2\u0b5d\u00ed\3\2\2\2\u0b5e\u0b5f\7\u010e\2\2\u0b5f\u0b64\5"+
		"\u00f0y\2\u0b60\u0b61\7\6\2\2\u0b61\u0b63\5\u00f0y\2\u0b62\u0b60\3\2\2"+
		"\2\u0b63\u0b66\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b64\u0b65\3\2\2\2\u0b65\u00ef"+
		"\3\2\2\2\u0b66\u0b64\3\2\2\2\u0b67\u0b68\5\u00fe\u0080\2\u0b68\u0b69\7"+
		"\30\2\2\u0b69\u0b6a\5\u00f2z\2\u0b6a\u00f1\3\2\2\2\u0b6b\u0b9a\5\u00fe"+
		"\u0080\2\u0b6c\u0b6d\7\4\2\2\u0b6d\u0b6e\5\u00fe\u0080\2\u0b6e\u0b6f\7"+
		"\5\2\2\u0b6f\u0b9a\3\2\2\2\u0b70\u0b93\7\4\2\2\u0b71\u0b72\7(\2\2\u0b72"+
		"\u0b73\7 \2\2\u0b73\u0b78\5\u00bc_\2\u0b74\u0b75\7\6\2\2\u0b75\u0b77\5"+
		"\u00bc_\2\u0b76\u0b74\3\2\2\2\u0b77\u0b7a\3\2\2\2\u0b78\u0b76\3\2\2\2"+
		"\u0b78\u0b79\3\2\2\2\u0b79\u0b94\3\2\2\2\u0b7a\u0b78\3\2\2\2\u0b7b\u0b7c"+
		"\t$\2\2\u0b7c\u0b7d\7 \2\2\u0b7d\u0b82\5\u00bc_\2\u0b7e\u0b7f\7\6\2\2"+
		"\u0b7f\u0b81\5\u00bc_\2\u0b80\u0b7e\3\2\2\2\u0b81\u0b84\3\2\2\2\u0b82"+
		"\u0b80\3\2\2\2\u0b82\u0b83\3\2\2\2\u0b83\u0b86\3\2\2\2\u0b84\u0b82\3\2"+
		"\2\2\u0b85\u0b7b\3\2\2\2\u0b85\u0b86\3\2\2\2\u0b86\u0b91\3\2\2\2\u0b87"+
		"\u0b88\t%\2\2\u0b88\u0b89\7 \2\2\u0b89\u0b8e\5V,\2\u0b8a\u0b8b\7\6\2\2"+
		"\u0b8b\u0b8d\5V,\2\u0b8c\u0b8a\3\2\2\2\u0b8d\u0b90\3\2\2\2\u0b8e\u0b8c"+
		"\3\2\2\2\u0b8e\u0b8f\3\2\2\2\u0b8f\u0b92\3\2\2\2\u0b90\u0b8e\3\2\2\2\u0b91"+
		"\u0b87\3\2\2\2\u0b91\u0b92\3\2\2\2\u0b92\u0b94\3\2\2\2\u0b93\u0b71\3\2"+
		"\2\2\u0b93\u0b85\3\2\2\2\u0b94\u0b96\3\2\2\2\u0b95\u0b97\5\u00f4{\2\u0b96"+
		"\u0b95\3\2\2\2\u0b96\u0b97\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u0b9a\7\5"+
		"\2\2\u0b99\u0b6b\3\2\2\2\u0b99\u0b6c\3\2\2\2\u0b99\u0b70\3\2\2\2\u0b9a"+
		"\u00f3\3\2\2\2\u0b9b\u0b9c\7\u00be\2\2\u0b9c\u0bac\5\u00f6|\2\u0b9d\u0b9e"+
		"\7\u00d3\2\2\u0b9e\u0bac\5\u00f6|\2\u0b9f\u0ba0\7\u00be\2\2\u0ba0\u0ba1"+
		"\7\34\2\2\u0ba1\u0ba2\5\u00f6|\2\u0ba2\u0ba3\7\23\2\2\u0ba3\u0ba4\5\u00f6"+
		"|\2\u0ba4\u0bac\3\2\2\2\u0ba5\u0ba6\7\u00d3\2\2\u0ba6\u0ba7\7\34\2\2\u0ba7"+
		"\u0ba8\5\u00f6|\2\u0ba8\u0ba9\7\23\2\2\u0ba9\u0baa\5\u00f6|\2\u0baa\u0bac"+
		"\3\2\2\2\u0bab\u0b9b\3\2\2\2\u0bab\u0b9d\3\2\2\2\u0bab\u0b9f\3\2\2\2\u0bab"+
		"\u0ba5\3\2\2\2\u0bac\u00f5\3\2\2\2\u0bad\u0bae\7\u00fd\2\2\u0bae\u0bb5"+
		"\t&\2\2\u0baf\u0bb0\7;\2\2\u0bb0\u0bb5\7\u00d2\2\2\u0bb1\u0bb2\5\u00bc"+
		"_\2\u0bb2\u0bb3\t&\2\2\u0bb3\u0bb5\3\2\2\2\u0bb4\u0bad\3\2\2\2\u0bb4\u0baf"+
		"\3\2\2\2\u0bb4\u0bb1\3\2\2\2\u0bb5\u00f7\3\2\2\2\u0bb6\u0bbb\5\u00fc\177"+
		"\2\u0bb7\u0bb8\7\6\2\2\u0bb8\u0bba\5\u00fc\177\2\u0bb9\u0bb7\3\2\2\2\u0bba"+
		"\u0bbd\3\2\2\2\u0bbb\u0bb9\3\2\2\2\u0bbb\u0bbc\3\2\2\2\u0bbc\u00f9\3\2"+
		"\2\2\u0bbd\u0bbb\3\2\2\2\u0bbe\u0bc3\5\u00fc\177\2\u0bbf\u0bc3\7b\2\2"+
		"\u0bc0\u0bc3\7\u008a\2\2\u0bc1\u0bc3\7\u00cc\2\2\u0bc2\u0bbe\3\2\2\2\u0bc2"+
		"\u0bbf\3\2\2\2\u0bc2\u0bc0\3\2\2\2\u0bc2\u0bc1\3\2\2\2\u0bc3\u00fb\3\2"+
		"\2\2\u0bc4\u0bc9\5\u0102\u0082\2\u0bc5\u0bc6\7\7\2\2\u0bc6\u0bc8\5\u0102"+
		"\u0082\2\u0bc7\u0bc5\3\2\2\2\u0bc8\u0bcb\3\2\2\2\u0bc9\u0bc7\3\2\2\2\u0bc9"+
		"\u0bca\3\2\2\2\u0bca\u00fd\3\2\2\2\u0bcb\u0bc9\3\2\2\2\u0bcc\u0bcd\5\u0102"+
		"\u0082\2\u0bcd\u0bce\5\u0100\u0081\2\u0bce\u00ff\3\2\2\2\u0bcf\u0bd0\7"+
		"\u0122\2\2\u0bd0\u0bd2\5\u0102\u0082\2\u0bd1\u0bcf\3\2\2\2\u0bd2\u0bd3"+
		"\3\2\2\2\u0bd3\u0bd1\3\2\2\2\u0bd3\u0bd4\3\2\2\2\u0bd4\u0bd7\3\2\2\2\u0bd5"+
		"\u0bd7\3\2\2\2\u0bd6\u0bd1\3\2\2\2\u0bd6\u0bd5\3\2\2\2\u0bd7\u0101\3\2"+
		"\2\2\u0bd8\u0bdc\5\u0104\u0083\2\u0bd9\u0bda\6\u0082\24\2\u0bda\u0bdc"+
		"\5\u010e\u0088\2\u0bdb\u0bd8\3\2\2\2\u0bdb\u0bd9\3\2\2\2\u0bdc\u0103\3"+
		"\2\2\2\u0bdd\u0be4\7\u0134\2\2\u0bde\u0be4\5\u0106\u0084\2\u0bdf\u0be0"+
		"\6\u0083\25\2\u0be0\u0be4\5\u010c\u0087\2\u0be1\u0be2\6\u0083\26\2\u0be2"+
		"\u0be4\5\u0110\u0089\2\u0be3\u0bdd\3\2\2\2\u0be3\u0bde\3\2\2\2\u0be3\u0bdf"+
		"\3\2\2\2\u0be3\u0be1\3\2\2\2\u0be4\u0105\3\2\2\2\u0be5\u0be6\7\u0135\2"+
		"\2\u0be6\u0107\3\2\2\2\u0be7\u0be9\6\u0085\27\2\u0be8\u0bea\7\u0122\2"+
		"\2\u0be9\u0be8\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0c0f"+
		"\7\u0130\2\2\u0bec\u0bee\6\u0085\30\2\u0bed\u0bef\7\u0122\2\2\u0bee\u0bed"+
		"\3\2\2\2\u0bee\u0bef\3\2\2\2\u0bef\u0bf0\3\2\2\2\u0bf0\u0c0f\7\u0131\2"+
		"\2\u0bf1\u0bf3\6\u0085\31\2\u0bf2\u0bf4\7\u0122\2\2\u0bf3\u0bf2\3\2\2"+
		"\2\u0bf3\u0bf4\3\2\2\2\u0bf4\u0bf5\3\2\2\2\u0bf5\u0c0f\t\'\2\2\u0bf6\u0bf8"+
		"\7\u0122\2\2\u0bf7\u0bf6\3\2\2\2\u0bf7\u0bf8\3\2\2\2\u0bf8\u0bf9\3\2\2"+
		"\2\u0bf9\u0c0f\7\u012f\2\2\u0bfa\u0bfc\7\u0122\2\2\u0bfb\u0bfa\3\2\2\2"+
		"\u0bfb\u0bfc\3\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u0c0f\7\u012c\2\2\u0bfe"+
		"\u0c00\7\u0122\2\2\u0bff\u0bfe\3\2\2\2\u0bff\u0c00\3\2\2\2\u0c00\u0c01"+
		"\3\2\2\2\u0c01\u0c0f\7\u012d\2\2\u0c02\u0c04\7\u0122\2\2\u0c03\u0c02\3"+
		"\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c05\3\2\2\2\u0c05\u0c0f\7\u012e\2\2"+
		"\u0c06\u0c08\7\u0122\2\2\u0c07\u0c06\3\2\2\2\u0c07\u0c08\3\2\2\2\u0c08"+
		"\u0c09\3\2\2\2\u0c09\u0c0f\7\u0132\2\2\u0c0a\u0c0c\7\u0122\2\2\u0c0b\u0c0a"+
		"\3\2\2\2\u0c0b\u0c0c\3\2\2\2\u0c0c\u0c0d\3\2\2\2\u0c0d\u0c0f\7\u0133\2"+
		"\2\u0c0e\u0be7\3\2\2\2\u0c0e\u0bec\3\2\2\2\u0c0e\u0bf1\3\2\2\2\u0c0e\u0bf7"+
		"\3\2\2\2\u0c0e\u0bfb\3\2\2\2\u0c0e\u0bff\3\2\2\2\u0c0e\u0c03\3\2\2\2\u0c0e"+
		"\u0c07\3\2\2\2\u0c0e\u0c0b\3\2\2\2\u0c0f\u0109\3\2\2\2\u0c10\u0c11\7\u00fb"+
		"\2\2\u0c11\u0c18\5\u00dep\2\u0c12\u0c18\5\36\20\2\u0c13\u0c18\5\u00dc"+
		"o\2\u0c14\u0c15\t(\2\2\u0c15\u0c16\7\u009f\2\2\u0c16\u0c18\7\u00a0\2\2"+
		"\u0c17\u0c10\3\2\2\2\u0c17\u0c12\3\2\2\2\u0c17\u0c13\3\2\2\2\u0c17\u0c14"+
		"\3\2\2\2\u0c18\u010b\3\2\2\2\u0c19\u0c1a\t)\2\2\u0c1a\u010d\3\2\2\2\u0c1b"+
		"\u0c1c\t*\2\2\u0c1c\u010f\3\2\2\2\u0c1d\u0c1e\t+\2\2\u0c1e\u0111\3\2\2"+
		"\2\u0198\u0116\u012f\u0134\u013c\u0144\u0146\u015a\u015e\u0164\u0167\u016a"+
		"\u0172\u0175\u0179\u017c\u0184\u0189\u018c\u0193\u019f\u01aa\u01ac\u01b0"+
		"\u01b3\u01ba\u01c5\u01c7\u01cf\u01d4\u01d7\u01dd\u01e8\u0228\u0231\u0235"+
		"\u023b\u023f\u0244\u024a\u0252\u0258\u0265\u026a\u027a\u0281\u0285\u028b"+
		"\u029a\u029e\u02a4\u02aa\u02ad\u02b0\u02b6\u02ba\u02c2\u02c4\u02cd\u02d0"+
		"\u02d9\u02de\u02e4\u02eb\u02ee\u02f4\u02ff\u0302\u0306\u030b\u0310\u0317"+
		"\u031a\u031d\u0324\u0329\u0332\u033a\u0340\u0343\u0346\u034c\u0350\u0354"+
		"\u0358\u035a\u0362\u036a\u0370\u037c\u0380\u0383\u0387\u038a\u038e\u03a7"+
		"\u03aa\u03ae\u03b4\u03b7\u03ba\u03c0\u03c8\u03cd\u03d3\u03d9\u03e5\u03e8"+
		"\u03ef\u03f6\u03fe\u0402\u040d\u0419\u041c\u0422\u0428\u042e\u0432\u0439"+
		"\u044f\u0453\u045f\u0463\u0469\u046c\u0474\u0478\u047f\u04f3\u04fb\u0503"+
		"\u050c\u0516\u051a\u051d\u0523\u0529\u0535\u0541\u0546\u054f\u0557\u055e"+
		"\u0560\u0563\u0568\u056c\u0571\u0574\u0579\u057e\u0581\u0586\u058a\u058f"+
		"\u0591\u0595\u059e\u05a6\u05af\u05b6\u05bf\u05c4\u05c7\u05dc\u05de\u05e7"+
		"\u05ee\u05f1\u05f8\u05fc\u0602\u060a\u0615\u0620\u0627\u062d\u063a\u0641"+
		"\u0648\u0654\u065c\u0662\u0665\u066e\u0671\u067a\u067d\u0686\u0689\u0692"+
		"\u0695\u0698\u069d\u069f\u06ab\u06b2\u06b9\u06bc\u06be\u06ca\u06ce\u06d2"+
		"\u06d8\u06dc\u06e4\u06e8\u06eb\u06ee\u06f1\u06f5\u06f9\u06fc\u0700\u0705"+
		"\u0709\u070c\u070f\u0712\u0714\u0720\u0723\u0727\u0731\u0735\u0737\u073a"+
		"\u073e\u0744\u0748\u0753\u075d\u0769\u0778\u077d\u0784\u0794\u0799\u07a6"+
		"\u07ab\u07b3\u07b9\u07bd\u07c6\u07d5\u07da\u07e6\u07eb\u07f3\u07f6\u07fa"+
		"\u0808\u0815\u081a\u081e\u0821\u0826\u082f\u0832\u0837\u083e\u0841\u0849"+
		"\u0850\u0857\u085a\u085f\u0862\u0867\u086b\u086e\u0871\u0877\u087c\u0881"+
		"\u0893\u0895\u0898\u08a3\u08ac\u08b3\u08bb\u08c2\u08c6\u08ce\u08d6\u08dc"+
		"\u08e4\u08f0\u08f3\u08f9\u08fd\u08ff\u0908\u0914\u0916\u091d\u0924\u092a"+
		"\u0930\u0932\u0939\u0941\u0947\u094e\u0954\u0958\u095a\u0961\u096a\u0977"+
		"\u097c\u0980\u098e\u0990\u0998\u099a\u099e\u09a6\u09af\u09b5\u09bd\u09c2"+
		"\u09c8\u09cc\u09d1\u09d6\u09db\u09e1\u09f6\u09f8\u0a01\u0a05\u0a0e\u0a12"+
		"\u0a24\u0a27\u0a2f\u0a38\u0a4f\u0a5a\u0a61\u0a64\u0a6d\u0a71\u0a7d\u0a96"+
		"\u0a9d\u0aa0\u0aaf\u0ab3\u0abd\u0abf\u0acc\u0ace\u0adb\u0adf\u0ae6\u0aeb"+
		"\u0af3\u0af7\u0afc\u0b0d\u0b11\u0b1a\u0b1e\u0b20\u0b27\u0b2e\u0b31\u0b34"+
		"\u0b3b\u0b42\u0b45\u0b4c\u0b54\u0b57\u0b64\u0b78\u0b82\u0b85\u0b8e\u0b91"+
		"\u0b93\u0b96\u0b99\u0bab\u0bb4\u0bbb\u0bc2\u0bc9\u0bd3\u0bd6\u0bdb\u0be3"+
		"\u0be9\u0bee\u0bf3\u0bf7\u0bfb\u0bff\u0c03\u0c07\u0c0b\u0c0e\u0c17";
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