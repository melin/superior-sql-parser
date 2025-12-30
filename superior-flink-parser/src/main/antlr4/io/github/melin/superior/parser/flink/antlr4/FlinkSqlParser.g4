parser grammar FlinkSqlParser;

options { tokenVocab=FlinkSqlLexer; }

sqlStatements
    : singleStatement* EOF
    ;

singleStatement
    : sqlStatement SEMICOLON?
    | emptyStatement
    ;

sqlStatement
    : ddlStatement
    | dmlStatement
    | describeStatement
    | explainStatement
    | useStatement
    | showStatement
    | loadStatement
    | unloadStatement
    | setStatement
    | resetStatement
    | jarStatement
    | dtAddStatement
    ;

emptyStatement
    : SEMICOLON
    ;

ddlStatement
    : createTable
    | createDatabase
    | createView
    | createFunction
    | createCatalog
    | alterTable
    | alterView
    | alterDatabase
    | alterFunction
    | dropCatalog
    | dropTable
    | dropDatabase
    | dropView
    | dropFunction
    ;

dmlStatement
    : queryStatement
    | insertStatement
    ;

// some statement
describeStatement
    : (KW_DESCRIBE | KW_DESC) tablePath
    ;

explainStatement
    : KW_EXPLAIN (explainDetails | KW_PLAN KW_FOR)? (
        dmlStatement
        | insertSimpleStatement
        | insertMulStatement
    )
    ;

explainDetails
    : explainDetail (COMMA explainDetail)*
    ;

explainDetail
    : KW_CHANGELOG_MODE
    | KW_PLAN_ADVICE
    | KW_JSON_EXECUTION_PLAN
    | KW_ESTIMATED_COST
    ;

useStatement
    : KW_USE KW_CATALOG catalogPath
    | KW_USE databasePath
    | useModuleStatement
    ;

useModuleStatement
    : KW_USE KW_MODULES uid (COMMA uid)*
    ;

showStatement
    : KW_SHOW (KW_CATALOGS | KW_DATABASES | KW_VIEWS | KW_JARS)
    | KW_SHOW KW_CURRENT (KW_CATALOG | KW_DATABASE)
    | KW_SHOW KW_TABLES (( KW_FROM | KW_IN) databasePath)? likePredicate?
    | KW_SHOW KW_COLUMNS ( KW_FROM | KW_IN) (viewPath | tablePath) likePredicate?
    | KW_SHOW KW_CREATE (KW_TABLE tablePath | KW_VIEW viewPath)
    | KW_SHOW KW_USER? KW_FUNCTIONS
    | KW_SHOW KW_FULL? KW_MODULES
    ;

loadStatement
    : KW_LOAD KW_MODULE uid (KW_WITH tablePropertyList)?
    ;

unloadStatement
    : KW_UNLOAD KW_MODULE uid
    ;

setStatement
    : KW_SET (tableProperty)?
    ;

resetStatement
    : KW_RESET tablePropertyKey?
    ;

jarStatement
    : (KW_ADD | KW_REMOVE) KW_JAR jarFileName
    ;

// 数栈平台自研的添加文件语法
dtAddStatement
    : KW_ADD KW_JAR KW_WITH dtFilePath (KW_AS uid)?
    | KW_ADD KW_FILE KW_WITH dtFilePath (KW_AS uid)? (KW_RENAME uid)?
    | KW_ADD (
        KW_PYTHON_FILES
        | KW_PYTHON_REQUIREMENTS
        | KW_PYTHON_DEPENDENCIES
        | KW_PYTHON_JAR
        | KW_PYTHON_ARCHIVES
    ) KW_WITH dtFilePath KW_RENAME uid
    | KW_ADD KW_PYTHON_PARAMETER dtFilePath
    | KW_ADD KW_ENGINE KW_FILE KW_WITH dtFilePath KW_RENAME uid KW_KEY uid
    | KW_ADD KW_CONFIG KW_FILE KW_WITH dtFilePath KW_FOR uid KW_AS uid
    ;

dtFilePath
    : (SLASH_SIGN? uid)+
    ;

// Create statements

createTable
    : (simpleCreateTable | createTableAsSelect)
    ;

simpleCreateTable
    : KW_CREATE KW_TEMPORARY? KW_TABLE ifNotExists? tablePathCreate LR_BRACKET columnOptionDefinition (
        COMMA columnOptionDefinition
    )* (COMMA watermarkDefinition)? (COMMA tableConstraint)? (COMMA selfDefinitionClause)? RR_BRACKET (
        KW_COMMENT comment=STRING_LITERAL
    )? partitionDefinition? withOption likeDefinition?
    ;

/*
 * 详见 https://nightlies.apache.org/flink/flink-docs-release-1.16/docs/dev/table/sql/create/#as-select_statement
 * CTAS 不支持指定显示指定列，不支持创建分区表，临时表
 */
createTableAsSelect
    : KW_CREATE KW_TABLE ifNotExists? tablePathCreate withOption (KW_AS queryStatement)?
    ;

columnOptionDefinition
    : physicalColumnDefinition
    | metadataColumnDefinition
    | computedColumnDefinition
    ;

physicalColumnDefinition
    : columnNameCreate columnType columnConstraint? (KW_COMMENT comment=STRING_LITERAL)?
    ;

columnNameCreate
    : uid
    | expression
    ;

columnName
    : uid
    ;

columnNamePath
    : uid
    ;

columnNameList
    : LR_BRACKET columnName (COMMA columnName)* RR_BRACKET
    ;

columnType
    : colType=(KW_DATE | KW_BOOLEAN | KW_NULL)
    | colType=(
        KW_CHAR
        | KW_VARCHAR
        | KW_STRING
        | KW_BINARY
        | KW_VARBINARY
        | KW_BYTES
        | KW_TINYINT
        | KW_SMALLINT
        | KW_INT
        | KW_INTEGER
        | KW_BIGINT
        | KW_TIME
        | KW_TIMESTAMP_LTZ
        | KW_DATETIME
    ) lengthOneDimension?
    | colType=KW_TIMESTAMP lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | colType=(KW_DECIMAL | KW_DEC | KW_NUMERIC | KW_FLOAT | KW_DOUBLE) lengthTwoOptionalDimension?
    | colType=(KW_ARRAY | KW_MULTISET) lengthOneTypeDimension?
    | colType=KW_MAP mapTypeDimension?
    | colType=KW_ROW rowTypeDimension?
    | colType=KW_RAW lengthTwoStringDimension?
    ;

lengthOneDimension
    : LR_BRACKET decimalLiteral RR_BRACKET
    ;

lengthTwoOptionalDimension
    : LR_BRACKET decimalLiteral (COMMA decimalLiteral)? RR_BRACKET
    ;

lengthTwoStringDimension
    : LR_BRACKET stringLiteral (COMMA stringLiteral)? RR_BRACKET
    ;

lengthOneTypeDimension
    : LESS_SYMBOL columnType GREATER_SYMBOL
    ;

mapTypeDimension
    : LESS_SYMBOL columnType (COMMA columnType) GREATER_SYMBOL
    ;

rowTypeDimension
    : LESS_SYMBOL columnName columnType (COMMA columnName columnType)* GREATER_SYMBOL
    | LR_BRACKET columnName columnType (COMMA columnName columnType)* RR_BRACKET
    ;

columnConstraint
    : (KW_CONSTRAINT constraintName)? KW_PRIMARY KW_KEY (KW_NOT KW_ENFORCED)?
    | KW_NOT? KW_NULL
    ;

metadataColumnDefinition
    : columnNameCreate columnType KW_METADATA (KW_FROM metadataKey)? KW_VIRTUAL?
    ;

metadataKey
    : STRING_LITERAL
    ;

computedColumnDefinition
    : columnNameCreate KW_AS computedColumnExpression (KW_COMMENT comment=STRING_LITERAL)?
    ;

// 计算表达式
computedColumnExpression
    : expression
    ;

watermarkDefinition
    : KW_WATERMARK KW_FOR columnName KW_AS expression
    ;

tableConstraint
    : (KW_CONSTRAINT constraintName)? KW_PRIMARY KW_KEY columnNameList KW_NOT KW_ENFORCED
    ;

constraintName
    : identifier
    ;

selfDefinitionClause // 数栈自定义语句 ‘PERIOD KW_FOR SYSTEM_TIME’
    : KW_PERIOD KW_FOR KW_SYSTEM_TIME
    ;

partitionDefinition
    : KW_PARTITIONED KW_BY transformList
    ;

transformList
    : LR_BRACKET transform (COMMA transform)* RR_BRACKET
    ;

transform
    : columnName                                                         # identityTransform
    | LR_BRACKET transformArgument (COMMA transformArgument)* RR_BRACKET # applyTransform
    ;

transformArgument
    : qualifiedName
    | constant
    ;

likeDefinition
    : KW_LIKE tablePath (LR_BRACKET likeOption* RR_BRACKET)?
    ;

likeOption
    : ((KW_INCLUDING | KW_EXCLUDING) (KW_ALL | KW_CONSTRAINTS | KW_PARTITIONS))
    | ((KW_INCLUDING | KW_EXCLUDING | KW_OVERWRITING) (KW_GENERATED | KW_OPTIONS | KW_WATERMARKS))
    ;

createCatalog
    : KW_CREATE KW_CATALOG catalogPathCreate withOption
    ;

createDatabase
    : KW_CREATE KW_DATABASE ifNotExists? databasePathCreate (KW_COMMENT comment=STRING_LITERAL)? withOption
    ;

createView
    : KW_CREATE KW_TEMPORARY? KW_VIEW ifNotExists? viewPathCreate columnNameList? (
        KW_COMMENT comment=STRING_LITERAL
    )? KW_AS queryStatement
    ;

createFunction
    : KW_CREATE (KW_TEMPORARY | KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifNotExists? functionNameCreate KW_AS identifier (
        KW_LANGUAGE (KW_JAVA | KW_SCALA | KW_PYTHON)
    )? usingClause?
    ;

usingClause
    : KW_USING KW_JAR jarFileName (COMMA KW_JAR jarFileName)*
    ;

jarFileName
    : STRING_LITERAL
    ;

// Alter statements
// Just for simple alter table statements,
// it only includes rename, set key, add constraint, drop constraint, add unique

alterTable
    : KW_ALTER KW_TABLE ifExists? tablePath (
        renameDefinition
        | setKeyValueDefinition
        | addConstraint
        | dropConstraint
        | addUnique
    )
    ;

renameDefinition
    : KW_RENAME uid? KW_TO uid
    ;

setKeyValueDefinition
    : KW_SET tablePropertyList
    ;

addConstraint
    : KW_ADD KW_CONSTRAINT constraintName KW_PRIMARY KW_KEY columnNameList notForced?
    ;

dropConstraint
    : KW_DROP KW_CONSTRAINT constraintName
    ;

addUnique
    : KW_ADD KW_UNIQUE columnNameList
    ;

notForced
    : KW_NOT KW_ENFORCED
    ;

alterView
    : KW_ALTER KW_VIEW viewPath (renameDefinition | KW_AS queryStatement)
    ;

alterDatabase
    : KW_ALTER KW_DATABASE databasePath setKeyValueDefinition
    ;

alterFunction
    : KW_ALTER (KW_TEMPORARY | KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifExists? functionName KW_AS identifier (
        KW_LANGUAGE (KW_JAVA | KW_SCALA | KW_PYTHON)
    )? // TODO
    ;

// Drop statements

dropCatalog
    : KW_DROP KW_CATALOG ifExists? catalogPath
    ;

dropTable
    : KW_DROP KW_TEMPORARY? KW_TABLE ifExists? tablePath
    ;

dropDatabase
    : KW_DROP KW_DATABASE ifExists? databasePath dropType=(KW_RESTRICT | KW_CASCADE)?
    ;

dropView
    : KW_DROP KW_TEMPORARY? KW_VIEW ifExists? viewPath
    ;

dropFunction
    : KW_DROP (KW_TEMPORARY | KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifExists? functionName
    ;

// Insert statements

insertStatement
    : (KW_EXECUTE? insertSimpleStatement)
    | insertMulStatementCompatibility
    | (KW_EXECUTE insertMulStatement)
    ;

insertSimpleStatement
    : KW_INSERT (KW_INTO | KW_OVERWRITE) tablePath (
        insertPartitionDefinition? columnNameList? queryStatement
        | valuesDefinition
    )
    ;

insertPartitionDefinition
    : KW_PARTITION tablePropertyList
    ;

valuesDefinition
    : KW_VALUES valuesRowDefinition (COMMA valuesRowDefinition)*
    ;

valuesRowDefinition
    : LR_BRACKET valueDefinition (COMMA valueDefinition)* RR_BRACKET
    ;

valueDefinition
    : constant
    | functionCallExpression
    ;

insertMulStatementCompatibility
    : KW_BEGIN KW_STATEMENT KW_SET SEMICOLON (insertSimpleStatement SEMICOLON)+ KW_END
    ;

insertMulStatement
    : KW_STATEMENT KW_SET KW_BEGIN (insertSimpleStatement SEMICOLON)+ KW_END
    ;

// Select statements

queryStatement
    : valuesClause
    | withClause queryStatement
    | LR_BRACKET queryStatement RR_BRACKET
    | left=queryStatement operator=(KW_INTERSECT | KW_UNION | KW_EXCEPT) KW_ALL? right=queryStatement orderByClause? limitClause?
    | selectClause orderByClause? limitClause?
    | selectStatement orderByClause? limitClause?
    ;

valuesClause
    : KW_VALUES expression (COMMA expression)*
    ;

withClause
    : KW_WITH withItem (COMMA withItem)*
    ;

withItem
    : withItemName (LR_BRACKET columnName (COMMA columnName)* RR_BRACKET)? KW_AS LR_BRACKET queryStatement RR_BRACKET
    ;

withItemName
    : identifier
    ;

selectStatement
    : selectClause fromClause? whereClause? groupByClause? havingClause? windowClause?
    | selectClause fromClause matchRecognizeClause
    ;

selectClause
    : KW_SELECT setQuantifier? (
        ASTERISK_SIGN
        | projectItemDefinition (COMMA projectItemDefinition)*
    )
    ;

projectItemDefinition
    : overWindowItem
    | expression (KW_AS? columnName)?
    | columnName (KW_AS? expression)?
    ;

overWindowItem
    : primaryExpression KW_OVER windowSpec KW_AS identifier
    | primaryExpression KW_OVER errorCapturingIdentifier KW_AS identifier
    ;

fromClause
    : KW_FROM tableExpression
    ;

tableExpression
    : tableReference (COMMA tableReference)*
    | tableExpression KW_NATURAL? (KW_LEFT | KW_RIGHT | KW_FULL | KW_INNER)? KW_OUTER? KW_JOIN tableExpression joinCondition?
    | tableExpression KW_CROSS KW_JOIN tableExpression
    | inlineDataValueClause
    | windowTVFClause
    ;

tableReference
    : tablePrimary tableAlias?
    ;

tablePrimary
    : KW_TABLE? tablePath systemTimePeriod?
    | viewPath systemTimePeriod?
    | KW_LATERAL KW_TABLE LR_BRACKET functionCallExpression RR_BRACKET
    | KW_LATERAL? LR_BRACKET queryStatement RR_BRACKET
    | KW_UNNEST LR_BRACKET expression RR_BRACKET
    ;

systemTimePeriod
    : KW_FOR KW_SYSTEM_TIME KW_AS KW_OF dateTimeExpression
    ;

dateTimeExpression
    : expression
    ;

inlineDataValueClause
    : LR_BRACKET valuesDefinition RR_BRACKET tableAlias
    ;

windowTVFClause
    : KW_TABLE LR_BRACKET windowTVFExpression RR_BRACKET
    ;

windowTVFExpression
    : windowTVFName LR_BRACKET windowTVFParam (COMMA windowTVFParam)* RR_BRACKET
    ;

windowTVFName
    : KW_TUMBLE
    | KW_HOP
    | KW_CUMULATE
    ;

windowTVFParam
    : KW_TABLE timeAttrColumn
    | columnDescriptor
    | timeIntervalExpression
    | KW_DATA DOUBLE_RIGHT_ARROW KW_TABLE timeAttrColumn
    | KW_TIMECOL DOUBLE_RIGHT_ARROW columnDescriptor
    | timeIntervalParamName DOUBLE_RIGHT_ARROW timeIntervalExpression
    ;

timeIntervalParamName
    : KW_DATA
    | KW_TIMECOL
    | KW_SIZE
    | KW_OFFSET
    | KW_STEP
    | KW_SLIDE
    ;

columnDescriptor
    : KW_DESCRIPTOR LR_BRACKET columnName RR_BRACKET
    ;

joinCondition
    : KW_ON booleanExpression
    | KW_USING columnNameList
    ;

whereClause
    : KW_WHERE booleanExpression
    ;

groupByClause
    : KW_GROUP KW_BY groupItemDefinition (COMMA groupItemDefinition)*
    ;

groupItemDefinition
    : columnName
    | groupWindowFunction
    | LR_BRACKET RR_BRACKET
    | LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | groupingSetsNotationName LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | groupingSets LR_BRACKET groupItemDefinition (COMMA groupItemDefinition)* RR_BRACKET
    | expression
    ;

groupingSets
    : KW_GROUPING KW_SETS
    ;

groupingSetsNotationName
    : KW_CUBE
    | KW_ROLLUP
    ;

groupWindowFunction
    : groupWindowFunctionName LR_BRACKET timeAttrColumn COMMA timeIntervalExpression RR_BRACKET
    ;

groupWindowFunctionName
    : KW_TUMBLE
    | KW_HOP
    | KW_SESSION
    ;

timeAttrColumn
    : uid
    ;

havingClause
    : KW_HAVING booleanExpression
    ;

windowClause
    : KW_WINDOW namedWindow (COMMA namedWindow)*
    ;

namedWindow
    : name=errorCapturingIdentifier KW_AS windowSpec
    ;

windowSpec
    : name=errorCapturingIdentifier? LR_BRACKET partitionByClause? orderByClause? windowFrame? RR_BRACKET
    ;

matchRecognizeClause
    : KW_MATCH_RECOGNIZE LR_BRACKET partitionByClause? orderByClause? measuresClause? outputMode? afterMatchStrategy? patternDefinition?
        patternVariablesDefinition RR_BRACKET (KW_AS? identifier)?
    ;

orderByClause
    : KW_ORDER KW_BY orderItemDefinition (COMMA orderItemDefinition)*
    ;

orderItemDefinition
    : columnName ordering=(KW_ASC | KW_DESC)? (KW_NULLS nullOrder=(KW_LAST | KW_FIRST))?
    ;

limitClause
    : KW_LIMIT (KW_ALL | limit=expression)
    ;

partitionByClause
    : KW_PARTITION KW_BY (columnName | primaryExpression) (COMMA (columnName | primaryExpression))*
    ;

quantifiers
    : (ASTERISK_SIGN)
    | (ADD_SIGN)
    | (QUESTION_MARK_SIGN)
    | (LB_BRACKET DIG_LITERAL COMMA DIG_LITERAL RB_BRACKET)
    | (LB_BRACKET DIG_LITERAL COMMA RB_BRACKET)
    | (LB_BRACKET COMMA DIG_LITERAL RB_BRACKET)
    ;

measuresClause
    : KW_MEASURES projectItemDefinition (COMMA projectItemDefinition)*
    ;

patternDefinition
    : KW_PATTERN LR_BRACKET patternVariable+ RR_BRACKET withinClause?
    ;

patternVariable
    : unquotedIdentifier quantifiers?
    ;

outputMode
    : KW_ALL KW_ROWS KW_PER KW_MATCH
    | KW_ONE KW_ROW KW_PER KW_MATCH
    ;

afterMatchStrategy
    : KW_AFTER KW_MATCH KW_SKIP KW_PAST KW_LAST KW_ROW
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_NEXT KW_ROW
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_LAST unquotedIdentifier
    | KW_AFTER KW_MATCH KW_SKIP KW_TO KW_FIRST unquotedIdentifier
    ;

patternVariablesDefinition
    : KW_DEFINE projectItemDefinition (COMMA projectItemDefinition)*
    ;

windowFrame
    : KW_RANGE KW_BETWEEN timeIntervalExpression frameBound
    | KW_ROWS KW_BETWEEN DIG_LITERAL frameBound
    ;

frameBound
    : KW_PRECEDING KW_AND KW_CURRENT KW_ROW
    ;

withinClause
    : KW_WITHIN timeIntervalExpression
    ;

// expression

expression
    : booleanExpression
    ;

booleanExpression
    : KW_NOT booleanExpression                                                         # logicalNot
    | KW_EXISTS LR_BRACKET queryStatement RR_BRACKET                                   # exists
    | valueExpression predicate?                                                       # predicated
    | left=booleanExpression operator=KW_AND right=booleanExpression                   # logicalBinary
    | left=booleanExpression operator=KW_OR right=booleanExpression                    # logicalBinary
    | booleanExpression KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL) # logicalNested
    ;

predicate
    : KW_NOT? kind=KW_BETWEEN (KW_ASYMMETRIC | KW_SYMMETRIC)? lower=valueExpression KW_AND upper=valueExpression
    | KW_NOT? kind=KW_IN LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | KW_NOT? kind=KW_IN LR_BRACKET queryStatement RR_BRACKET
    | kind=KW_EXISTS LR_BRACKET queryStatement RR_BRACKET
    | KW_NOT? kind=KW_RLIKE pattern=valueExpression
    | likePredicate
    | KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL)
    | KW_IS KW_NOT? kind=KW_DISTINCT KW_FROM right=valueExpression
    | KW_NOT? kind=KW_SIMILAR KW_TO right=valueExpression (KW_ESCAPE stringLiteral)?
    | KW_IS KW_JSON (KW_VALUE | KW_ARRAY | identifier)?
    ;

likePredicate
    : KW_NOT? kind=KW_LIKE quantifier=(KW_ANY | KW_ALL) (
        LR_BRACKET RR_BRACKET
        | LR_BRACKET expression (COMMA expression)* RR_BRACKET
    )
    | KW_NOT? kind=KW_LIKE pattern=valueExpression (KW_ESCAPE stringLiteral)?
    ;

valueExpression
    : primaryExpression                                                                                        # valueExpressionDefault
    | operator=(HYPHEN_SIGN | ADD_SIGN | BIT_NOT_OP) valueExpression                                           # arithmeticUnary
    | left=valueExpression operator=(ASTERISK_SIGN | SLASH_SIGN | PERCENT_SIGN | KW_DIV) right=valueExpression # arithmeticBinary
    | left=valueExpression operator=(ADD_SIGN | HYPHEN_SIGN | DOUBLE_VERTICAL_SIGN) right=valueExpression      # arithmeticBinary
    | left=valueExpression operator=BIT_AND_OP right=valueExpression                                           # arithmeticBinary
    | left=valueExpression operator=BIT_XOR_OP right=valueExpression                                           # arithmeticBinary
    | left=valueExpression operator=BIT_OR_OP right=valueExpression                                            # arithmeticBinary
    | left=valueExpression comparisonOperator right=valueExpression                                            # comparison
    ;

functionCallExpression
    : reservedKeywordsNoParamsUsedAsFuncName
    | functionNameAndParams
    | functionNameWithParams LR_BRACKET (setQuantifier? functionParam (COMMA functionParam)*)? RR_BRACKET
    ;

primaryExpression
    : KW_CASE whenClause+ (KW_ELSE elseExpression=expression)? KW_END                  # searchedCase
    | KW_CASE value=expression whenClause+ (KW_ELSE elseExpression=expression)? KW_END # simpleCase
    | KW_CAST LR_BRACKET expression KW_AS columnType RR_BRACKET                        # cast
    // | STRUCT LR_BRACKET (argument+=namedExpression (COMMA argument+=namedExpression)*)? RR_BRACKET             #struct
    | KW_FIRST LR_BRACKET expression (KW_IGNORE KW_NULLS)? RR_BRACKET                    # first
    | KW_LAST LR_BRACKET expression (KW_IGNORE KW_NULLS)? RR_BRACKET                     # last
    | KW_POSITION LR_BRACKET substr=valueExpression KW_IN str=valueExpression RR_BRACKET # position
    | constant                                                                           # constantDefault
    | ASTERISK_SIGN                                                                      # star
    | uid DOT ASTERISK_SIGN                                                              # star
    // | LR_BRACKET namedExpression (COMMA namedExpression)+ RR_BRACKET                                           #rowConstructor
    | LR_BRACKET queryStatement RR_BRACKET # subqueryExpression
    | functionCallExpression               # functionCall
    // | identifier '->' expression                                                               #lambda
    // | '(' identifier (',' identifier)+ ')' '->' expression                                     #lambda
    | value=primaryExpression LS_BRACKET index=valueExpression RS_BRACKET # subscript
    | columnNamePath                                                      # columnReference
    | dereferenceDefinition                                               # dereference
    | LR_BRACKET expression RR_BRACKET                                    # parenthesizedExpression
    // | EXTRACT LR_BRACKET field=identifier KW_FROM source=valueExpression RR_BRACKET                             #extract
    // | (SUBSTR | SUBSTRING) LR_BRACKET str=valueExpression (KW_FROM | COMMA) pos=valueExpression
    //   ((KW_FOR | COMMA) len=valueExpression)? RR_BRACKET                                                   #substring
    // | TRIM LR_BRACKET trimOption=(BOTH | LEADING | TRAILING)? (trimStr=valueExpression)?
    //    KW_FROM srcStr=valueExpression RR_BRACKET                                                         #trim
    // | OVERLAY LR_BRACKET input=valueExpression PLACING replace=valueExpression
    //   KW_FROM position=valueExpression (KW_FOR length=valueExpression)? RR_BRACKET                          #overlay
    ;

functionNameCreate
    : uid
    ;

functionName
    : reservedKeywordsUsedAsFuncName
    | reservedKeywordsNoParamsUsedAsFuncName
    | reservedKeywordsFollowParamsUsedAsFuncName
    | uid
    ;

/**
* Built-in function name that is following with params directly without parentheses
* Reference Link:https://nightlies.apache.org/flink/flink-docs-release-1.16/zh/docs/dev/table/functions/systemfunctions/#%E6%97%B6%E9%97%B4%E5%87%BD%E6%95%B0
*/
functionNameAndParams
    : reservedKeywordsFollowParamsUsedAsFuncName STRING_LITERAL
    | timeIntervalExpression
    ;

/**
* Function name that is need to follow with parentheses and params
*/
functionNameWithParams
    : reservedKeywordsUsedAsFuncName
    | uid
    ;

functionParam
    : reservedKeywordsUsedAsFuncParam
    | timeIntervalUnit
    | timePointUnit
    | expression
    ;

dereferenceDefinition
    : uid
    ;

// base common

correlationName
    : identifier
    ;

qualifiedName
    : identifier
    | dereferenceDefinition
    ;

timeIntervalExpression
    : KW_INTERVAL (errorCapturingMultiUnitsInterval | errorCapturingUnitToUnitInterval)?
    ;

errorCapturingMultiUnitsInterval
    : multiUnitsInterval unitToUnitInterval?
    ;

multiUnitsInterval
    : (intervalValue timeIntervalUnit)+
    ;

errorCapturingUnitToUnitInterval
    : body=unitToUnitInterval (error1=multiUnitsInterval | error2=unitToUnitInterval)?
    ;

unitToUnitInterval
    : value=intervalValue from=timeIntervalUnit KW_TO to=timeIntervalUnit
    ;

intervalValue
    : (ADD_SIGN | HYPHEN_SIGN)? (DIG_LITERAL | REAL_LITERAL)
    | STRING_LITERAL
    ;

tableAlias
    : KW_AS? alias=identifier identifierList?
    ;

errorCapturingIdentifier
    : identifier errorCapturingIdentifierExtra
    ;

errorCapturingIdentifierExtra
    : (KW_MINUS identifier)+ # errorIdent
    |                        # realIdent
    ;

identifierList
    : LR_BRACKET identifierSeq RR_BRACKET
    ;

identifierSeq
    : identifier (COMMA identifier)*
    ;

identifier
    : unquotedIdentifier  # unquotedIdentifierAlternative
    | quotedIdentifier    # quotedIdentifierAlternative
    | nonReservedKeywords # nonReservedKeywordsAlternative
    ;

unquotedIdentifier
    : DIG_LITERAL
    | ID_LITERAL
    ;

quotedIdentifier
    : STRING_LITERAL
    ;

whenClause
    : KW_WHEN condition=expression KW_THEN result=expression
    ;

catalogPath
    : identifier
    ;

catalogPathCreate
    : identifier
    ;

databasePath
    : identifier (DOT identifier)?
    ;

databasePathCreate
    : identifier (DOT identifier)?
    ;

tablePathCreate
    : identifier (DOT identifier)?
    | identifier DOT identifier (DOT identifier)?
    ;

tablePath
    : identifier (DOT identifier)?
    | identifier DOT identifier (DOT identifier)?
    ;

viewPath
    : identifier (DOT identifier)?
    | identifier DOT identifier (DOT identifier)?
    ;

viewPathCreate
    : identifier (DOT identifier)?
    | identifier DOT identifier (DOT identifier)?
    ;

uid
    : identifier (DOT identifier)*?
    ;

withOption
    : KW_WITH tablePropertyList
    ;

ifNotExists
    : KW_IF KW_NOT KW_EXISTS
    ;

ifExists
    : KW_IF KW_EXISTS
    ;

tablePropertyList
    : LR_BRACKET tableProperty (COMMA tableProperty)* RR_BRACKET
    ;

tableProperty
    : key=tablePropertyKey (EQUAL_SYMBOL? value=tablePropertyValue)?
    ;

tablePropertyKey
    : identifier
    | dereferenceDefinition
    | STRING_LITERAL
    ;

tablePropertyValue
    : DIG_LITERAL
    | REAL_LITERAL
    | booleanLiteral
    | STRING_LITERAL
    ;

logicalOperator
    : KW_AND
    | BIT_AND_OP BIT_AND_OP
    | KW_OR
    | BIT_OR_OP BIT_OR_OP
    ;

comparisonOperator
    : EQUAL_SYMBOL
    | GREATER_SYMBOL
    | LESS_SYMBOL
    | LESS_SYMBOL EQUAL_SYMBOL
    | GREATER_SYMBOL EQUAL_SYMBOL
    | LESS_SYMBOL GREATER_SYMBOL
    | EXCLAMATION_SYMBOL EQUAL_SYMBOL
    | LESS_SYMBOL EQUAL_SYMBOL GREATER_SYMBOL
    ;

bitOperator
    : LESS_SYMBOL LESS_SYMBOL
    | GREATER_SYMBOL GREATER_SYMBOL
    | BIT_AND_OP
    | BIT_XOR_OP
    | BIT_OR_OP
    ;

mathOperator
    : ASTERISK_SIGN
    | SLASH_SIGN
    | PERCENT_SIGN
    | KW_DIV
    | ADD_SIGN
    | HYPHEN_SIGN
    | DOUBLE_HYPHEN_SIGN
    ;

unaryOperator
    : EXCLAMATION_SYMBOL
    | BIT_NOT_OP
    | ADD_SIGN
    | HYPHEN_SIGN
    | KW_NOT
    ;

constant
    : timeIntervalExpression
    | timePointLiteral
    | stringLiteral               // 引号包含的字符串
    | HYPHEN_SIGN? decimalLiteral // 正/负整数
    | booleanLiteral              // 布尔值
    | REAL_LITERAL                // 小数
    | BIT_STRING
    | KW_NOT? KW_NULL // 空 | 非空
    ;

timePointLiteral
    : timePointUnit stringLiteral
    ;

stringLiteral
    : STRING_LITERAL
    ;

decimalLiteral
    : DIG_LITERAL
    ;

booleanLiteral
    : KW_TRUE
    | KW_FALSE
    ;

setQuantifier
    : KW_DISTINCT
    | KW_ALL
    ;

timePointUnit
    : KW_YEAR
    | KW_QUARTER
    | KW_MONTH
    | KW_WEEK
    | KW_DAY
    | KW_HOUR
    | KW_MINUTE
    | KW_SECOND
    | KW_MILLISECOND
    | KW_MICROSECOND
    ;

timeIntervalUnit
    : KW_MILLENNIUM
    | KW_CENTURY
    | KW_DECADE
    | KW_YEAR
    | KW_YEARS
    | KW_QUARTER
    | KW_MONTH
    | KW_MONTHS
    | KW_WEEK
    | KW_WEEKS
    | KW_DAY
    | KW_DAYS
    | KW_HOUR
    | KW_HOURS
    | KW_MINUTE
    | KW_MINUTES
    | KW_SECOND
    | KW_SECONDS
    | KW_MILLISECOND
    | KW_MICROSECOND
    | KW_NANOSECOND
    | KW_EPOCH
    ;

reservedKeywordsUsedAsFuncParam
    : KW_ARRAY
    | KW_ALL
    | KW_BOTH
    | KW_CURRENT_TIMESTAMP
    | KW_CURRENT_DATE
    | KW_CURRENT_TIME
    | KW_LOCALTIME
    | KW_LOCALTIMESTAMP
    | KW_DISTINCT
    | KW_LEADING
    | KW_TRAILING
    | KW_VALUE
    | ASTERISK_SIGN
    ;

/**
* Built-in function name without parentheses and params
*/
reservedKeywordsNoParamsUsedAsFuncName
    : KW_LOCALTIME
    | KW_LOCALTIMESTAMP
    | KW_CURRENT_TIME
    | KW_CURRENT_DATE
    | KW_CURRENT_TIMESTAMP
    ;

reservedKeywordsFollowParamsUsedAsFuncName
    : KW_DATE
    | KW_TIME
    | KW_TIMESTAMP
    ;

reservedKeywordsUsedAsFuncName
    : KW_ABS
    | KW_ARRAY
    | KW_AVG
    | KW_CARDINALITY
    | KW_CAST
    | KW_CEIL
    | KW_CEILING
    | KW_COALESCE
    | KW_COLLECT
    | KW_COUNT
    | KW_CUME_DIST
    | KW_DAYOFWEEK
    | KW_DAYOFYEAR
    | KW_DENSE_RANK
    | KW_ELEMENT
    | KW_EXP
    | KW_EXTRACT
    | KW_FIRST_VALUE
    | KW_FLOOR
    | KW_GROUPING
    | KW_HOUR
    | KW_IF
    | KW_LAG
    | KW_LAST_VALUE
    | KW_LEAD
    | KW_LEFT
    | KW_LN
    | KW_LOWER
    | KW_MAP
    | KW_MAX
    | KW_MIN
    | KW_MINUTE
    | KW_MOD
    | KW_MONTH
    | KW_NULLIF
    | KW_NTILE
    | KW_OVERLAY
    | KW_PERCENT_RANK
    | KW_POSITION
    | KW_POWER
    | KW_QUARTER
    | KW_ROW
    | KW_ROWS
    | KW_ROW_NUMBER
    | KW_RANK
    | KW_RIGHT
    | KW_SECOND
    | KW_STDDEV_POP
    | KW_STDDEV_SAMP
    | KW_SUBSTRING
    | KW_SUM
    | KW_TIMESTAMP_DIFF
    | KW_TRIM
    | KW_TRUNCATE
    | KW_TRY_CAST
    | KW_UPPER
    | KW_VAR_POP
    | KW_VAR_SAMP
    | KW_WEEK
    | KW_YEAR
    | KW_JSON_VALUE
    | KW_JSON_EXISTS
    | KW_JSON_QUERY
    | KW_JSON_OBJECT
    | KW_JSON_OBJECTAGG
    | KW_JSON_ARRAY
    | KW_JSON_ARRAYAGG
    ;

nonReservedKeywords
    : KW_ADD
    | KW_AFTER
    | KW_ASC
    | KW_CASCADE
    | KW_CATALOG
    | KW_CENTURY
    | KW_CONFIG
    | KW_CONSTRAINTS
    | KW_CUMULATE
    | KW_DATA
    | KW_DATABASE
    | KW_DAYS
    | KW_DECADE
    | KW_DESC
    | KW_DESCRIPTOR
    | KW_DIV
    | KW_ENGINE
    | KW_EPOCH
    | KW_EXCLUDING
    | KW_FILE
    | KW_FIRST
    | KW_GENERATED
    | KW_HOP
    | KW_HOURS
    | KW_IGNORE
    | KW_INCLUDING
    | KW_JAR
    | KW_JARS
    | KW_JAVA
    | KW_KEY
    | KW_LAST
    | KW_LOAD
    | KW_MAP
    | KW_MICROSECOND
    | KW_MILLENNIUM
    | KW_MILLISECOND
    | KW_MINUTES
    | KW_MONTHS
    | KW_NANOSECOND
    | KW_NULLS
    | KW_OPTIONS
    | KW_PAST
    | KW_PLAN
    | KW_PRECEDING
    | KW_PYTHON
    | KW_PYTHON_ARCHIVES
    | KW_PYTHON_DEPENDENCIES
    | KW_PYTHON_FILES
    | KW_PYTHON_JAR
    | KW_PYTHON_PARAMETER
    | KW_PYTHON_REQUIREMENTS
    | KW_QUARTER
    | KW_REMOVE
    | KW_RESTRICT
    | KW_SECONDS
    | KW_SESSION
    | KW_SETS
    | KW_SIZE
    | KW_SLIDE
    | KW_STEP
    | KW_TEMPORARY
    | KW_TIMECOL
    | KW_TUMBLE
    | KW_UNLOAD
    | KW_VIEW
    | KW_WEEK
    | KW_YEARS
    | KW_ZONE
    ;
