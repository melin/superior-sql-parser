parser grammar FlinkSqlParser;

options { tokenVocab=FlinkSqlLexer; }

program: statement EOF;

statement
    : sqlStatements EOF
    ;

sqlStatements
    : (sqlStatement SEMICOLON? | emptyStatement)*
    ;

sqlStatement
    : ddlStatement | dmlStatement | describeStatement | explainStatement | useStatement | showStatememt
    | loadStatement | unloadStatememt | setStatememt | resetStatememt | jarStatememt | dtAddStatement
    ;

emptyStatement
    : SEMICOLON
    ;

ddlStatement
    : createTable | createDatabase | createView | createFunction | createCatalog
    | alterTable | alertView | alterDatabase | alterFunction
    | dropCatalog | dropTable | dropDatabase | dropView | dropFunction
    ;

dmlStatement
    : queryStatement | insertStatement
    ;

// some statemen
describeStatement
    : (KW_DESCRIBE | KW_DESC) uid
    ;

explainStatement
    : KW_EXPLAIN (explainDetails | KW_PLAN KW_FOR)? (dmlStatement | insertSimpleStatement | insertMulStatement)
    ;

explainDetails
    : explainDetail (COMMA explainDetail)*
    ;

explainDetail
    : KW_CHANGELOG_MODE | KW_JSON_EXECUTION_PLAN | KW_ESTIMATED_COST
    ;

useStatement
    : KW_USE KW_CATALOG? uid | useModuleStatement
    ;

useModuleStatement
    : KW_USE KW_MODULES uid (COMMA uid)*
    ;

showStatememt
    : KW_SHOW (KW_CATALOGS | KW_DATABASES | KW_VIEWS | KW_JARS)
    | KW_SHOW KW_CURRENT (KW_CATALOG | KW_DATABASE)
    | KW_SHOW KW_TABLES (( KW_FROM | KW_IN ) uid)? likePredicate?
    | KW_SHOW KW_COLUMNS ( KW_FROM | KW_IN ) uid likePredicate?
    | KW_SHOW KW_CREATE (KW_TABLE | KW_VIEW) uid
    | KW_SHOW KW_USER? KW_FUNCTIONS
    | KW_SHOW KW_FULL? KW_MODULES
    ;

loadStatement
    : KW_LOAD KW_MODULE uid (KW_WITH tablePropertyList)?
    ;
    
unloadStatememt
    : KW_UNLOAD KW_MODULE uid
    ;

setStatememt
    : KW_SET (tableProperty)?
    ;

resetStatememt
    : KW_RESET tablePropertyKey?
    ;
    
jarStatememt
    : (KW_ADD | KW_REMOVE) KW_JAR jarFileName
    ;

// 数栈平台自研的添加文件语法
dtAddStatement
    : KW_ADD KW_JAR KW_WITH dtFilePath (KW_AS uid)?
    | KW_ADD KW_FILE KW_WITH dtFilePath (KW_AS uid)? (KW_RENAME uid)?
    | KW_ADD (KW_PYTHON_FILES | KW_PYTHON_REQUIREMENTS | KW_PYTHON_DEPENDENCIES | KW_PYTHON_JAR | KW_PYTHON_ARCHIVES) KW_WITH dtFilePath KW_RENAME uid
    | KW_ADD KW_PYTHON_PARAMETER dtFilePath
    | KW_ADD KW_ENGINE KW_FILE KW_WITH dtFilePath KW_RENAME uid KW_KEY uid
    ;

dtFilePath
    : SLASH_TEXT+
    ;

// Create statements

createTable
    : (simpleCreateTable | createTableAsSelect)
    ;
    
simpleCreateTable
    : KW_CREATE KW_TEMPORARY? KW_TABLE ifNotExists? sourceTable
    LR_BRACKET 
        columnOptionDefinition (COMMA columnOptionDefinition)*
        (COMMA watermarkDefinition)?
        (COMMA tableConstraint)?
        (COMMA selfDefinitionClause)?
    RR_BRACKET
    commentSpec?
    partitionDefinition?
    withOption
    likeDefinition?
    ;

/*
 * 详见 https://nightlies.apache.org/flink/flink-docs-release-1.16/docs/dev/table/sql/create/#as-select_statement
 * CTAS 不支持指定显示指定列，不支持创建分区表，临时表
 */
createTableAsSelect
    : KW_CREATE KW_TABLE ifNotExists? sourceTable withOption (KW_AS queryStatement)?
    ;

columnOptionDefinition
    : physicalColumnDefinition
    | metadataColumnDefinition
    | computedColumnDefinition
    ;

physicalColumnDefinition
    : columnName columnType columnConstraint? commentSpec?
    ;

columnName
    : uid | expression
    ;

columnNameList
    : LR_BRACKET columnName (',' columnName)* RR_BRACKET
    ;

columnType
    : typeName=(KW_DATE | KW_BOOLEAN | KW_NULL)
    | typeName=(KW_CHAR | KW_VARCHAR | KW_STRING | KW_BINARY | KW_VARBINARY | KW_BYTES
        | KW_TINYINT | KW_SMALLINT |KW_INT | KW_INTEGER | KW_BIGINT
        | KW_TIME | KW_TIMESTAMP_LTZ | KW_DATETIME
    ) lengthOneDimension?
    | typeName=KW_TIMESTAMP lengthOneDimension? ((KW_WITHOUT | KW_WITH) KW_LOCAL? KW_TIME KW_ZONE)?
    | typeName=(KW_DECIMAL | KW_DEC | KW_NUMERIC | KW_FLOAT | KW_DOUBLE) lengthTwoOptionalDimension?
    | type=(KW_ARRAY | KW_MULTISET) lengthOneTypeDimension?
    | type=KW_MAP mapTypeDimension?
    | type=KW_ROW rowTypeDimension?
    | type=KW_RAW lengthTwoStringDimension?
    ;

lengthOneDimension
    : '(' decimalLiteral ')'
    ;

lengthTwoOptionalDimension
    : '(' decimalLiteral (',' decimalLiteral)? ')'
    ;

lengthTwoStringDimension
    : '(' stringLiteral (',' stringLiteral)? ')'
    ;

lengthOneTypeDimension
    : LESS_SYMBOL columnType GREATER_SYMBOL
    ;

mapTypeDimension
    : LESS_SYMBOL columnType (COMMA columnType) GREATER_SYMBOL
    ;

rowTypeDimension
    : LESS_SYMBOL columnName columnType (COMMA columnName columnType)* GREATER_SYMBOL
    ;

columnConstraint
    :(KW_CONSTRAINT constraintName)? KW_PRIMARY KW_KEY (KW_NOT KW_ENFORCED)? | KW_NOT? KW_NULL
    ;

commentSpec
    : KW_COMMENT STRING_LITERAL
    ;

metadataColumnDefinition
    : columnName columnType KW_METADATA (KW_FROM metadataKey)? KW_VIRTUAL?
    ;

metadataKey
    : STRING_LITERAL
    ;

computedColumnDefinition
    : columnName KW_AS computedColumnExpression commentSpec?
    ;

// 计算表达式
computedColumnExpression
    : expression
    ;

watermarkDefinition
    : KW_WATERMARK KW_FOR expression KW_AS expression
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
    : '(' transform (',' transform)* ')'
    ;

transform
    : qualifiedName                                                           #identityTransform
    | transformName=identifier
      '(' transformArgument (',' transformArgument)* ')'  #applyTransform
    ;

transformArgument
    : qualifiedName
    | constant
    ;

likeDefinition
    : KW_LIKE sourceTable (LR_BRACKET likeOption* RR_BRACKET)?
    ;

sourceTable
    : uid
    ;

likeOption
    : ((KW_INCLUDING | KW_EXCLUDING) (KW_ALL | KW_CONSTRAINTS | KW_PARTITIONS))
    | ((KW_INCLUDING | KW_EXCLUDING | KW_OVERWRITING) (KW_GENERATED | KW_OPTIONS | KW_WATERMARKS))
    ;

createCatalog
    : KW_CREATE KW_CATALOG uid withOption
    ;

createDatabase
    : KW_CREATE KW_DATABASE ifNotExists? uid commentSpec? withOption
    ;

createView
    : KW_CREATE KW_TEMPORARY? KW_VIEW ifNotExists? uid columnNameList? commentSpec? KW_AS queryStatement
    ;

createFunction
    : KW_CREATE (KW_TEMPORARY|KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifNotExists? uid KW_AS identifier (KW_LANGUAGE (KW_JAVA|KW_SCALA|KW_PYTHON))? usingClause?
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
    : KW_ALTER KW_TABLE ifExists? uid (renameDefinition | setKeyValueDefinition | addConstraint | dropConstraint | addUnique)
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

alertView
    : KW_ALTER KW_VIEW uid (renameDefinition | KW_AS queryStatement)
    ;

alterDatabase
    : KW_ALTER KW_DATABASE uid setKeyValueDefinition
    ;

alterFunction
    : KW_ALTER (KW_TEMPORARY|KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifExists? uid KW_AS identifier (KW_LANGUAGE (KW_JAVA|KW_SCALA|KW_PYTHON))? 
    ;


// Drop statements

dropCatalog
    : KW_DROP KW_CATALOG ifExists? uid
    ;

dropTable
    : KW_DROP KW_TEMPORARY? KW_TABLE ifExists? uid
    ;

dropDatabase
    : KW_DROP KW_DATABASE ifExists? uid dropType=(KW_RESTRICT | KW_CASCADE)?
    ;

dropView
    : KW_DROP KW_TEMPORARY? KW_VIEW ifExists? uid
    ;

dropFunction
    : KW_DROP (KW_TEMPORARY|KW_TEMPORARY KW_SYSTEM)? KW_FUNCTION ifExists? uid
    ;


// Insert statements

insertStatement
: (KW_EXECUTE? insertSimpleStatement)
	| insertMulStatementCompatibility | (KW_EXECUTE insertMulStatement)
    ;

insertSimpleStatement
    : KW_INSERT (KW_INTO | KW_OVERWRITE) uid
    (
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
    : LR_BRACKET
        constant (COMMA constant)*
    RR_BRACKET
    ;

insertMulStatementCompatibility
	: KW_BEGIN KW_STATEMENT KW_SET SEMICOLON (insertSimpleStatement SEMICOLON)+ KW_END
    ;

insertMulStatement
    : KW_STATEMENT KW_SET KW_BEGIN (insertSimpleStatement SEMICOLON)+ KW_END
    ;

// Select statements

queryStatement
    : valuesCaluse
    | withClause queryStatement
    | '(' queryStatement ')'
    | left=queryStatement operator=(KW_INTERSECT | KW_UNION | KW_EXCEPT) KW_ALL? right=queryStatement orderByCaluse? limitClause?
    | selectClause orderByCaluse? limitClause?
    | selectStatement orderByCaluse? limitClause?
    ;

valuesCaluse
    : KW_VALUES expression (COMMA expression )*
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
    : selectClause fromClause whereClause? groupByClause? havingClause? windowClause?
    | selectClause fromClause matchRecognizeClause
    ;

selectClause
    : KW_SELECT setQuantifier? (ASTERISK_SIGN | projectItemDefinition (COMMA projectItemDefinition)*)
    ;

projectItemDefinition
    : overWindowItem
    | expression (KW_AS? expression)?
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
    | windoTVFClause
    ;

tableReference
    : tablePrimary tableAlias?
    ;

tablePrimary
    : KW_TABLE? tablePath systemTimePeriod? (KW_AS? correlationName)?
    | KW_LATERAL KW_TABLE LR_BRACKET functionName LR_BRACKET functionParam (COMMA functionParam)* RR_BRACKET RR_BRACKET
    | KW_LATERAL? LR_BRACKET queryStatement RR_BRACKET
    | KW_UNNEST LR_BRACKET expression RR_BRACKET
    ;

tablePath
    : uid
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

windoTVFClause
    : KW_TABLE LR_BRACKET windowTVFExression RR_BRACKET
    ;

windowTVFExression
    : windoTVFName LR_BRACKET windowTVFParam (COMMA windowTVFParam)* RR_BRACKET
    ;

windoTVFName
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
    : KW_DESCRIPTOR LR_BRACKET uid RR_BRACKET
    ;

joinCondition
    : KW_ON booleanExpression
    | KW_USING LR_BRACKET uid (COMMA uid)* RR_BRACKET
    ;

whereClause
    : KW_WHERE booleanExpression
    ;

groupByClause
    : KW_GROUP KW_BY groupItemDefinition (COMMA groupItemDefinition)*
    ;

groupItemDefinition
    : expression
    | groupWindowFunction
    | LR_BRACKET RR_BRACKET
    | LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | groupingSetsNotaionName LR_BRACKET expression (COMMA expression)* RR_BRACKET
    | groupingSets LR_BRACKET groupItemDefinition (COMMA groupItemDefinition)* RR_BRACKET
    ;

groupingSets
    : KW_GROUPING KW_SETS
    ;

groupingSetsNotaionName
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
    : KW_WINDOW namedWindow (',' namedWindow)*
    ;

namedWindow
    : name=errorCapturingIdentifier KW_AS windowSpec
    ;

windowSpec
    : name=errorCapturingIdentifier?
    LR_BRACKET
        partitionByClause?
        orderByCaluse?
        windowFrame?
    RR_BRACKET
    ;

matchRecognizeClause
    : KW_MATCH_RECOGNIZE 
    LR_BRACKET 
        partitionByClause?
        orderByCaluse?
        measuresClause?
        outputMode?
        afterMatchStrategy?
        patternDefination?
        patternVariablesDefination
    RR_BRACKET ( KW_AS? identifier )?
    ;

orderByCaluse
    : KW_ORDER KW_BY orderItemDefition (COMMA orderItemDefition)*
    ;

orderItemDefition
    : expression ordering=(KW_ASC | KW_DESC)? (KW_NULLS nullOrder=(KW_LAST | KW_FIRST))?
    ;

limitClause
    : KW_LIMIT (KW_ALL | limit=expression)
    ;

partitionByClause
    : KW_PARTITION KW_BY expression (COMMA expression)*
    ;

quantifiers
    : (ASTERISK_SIGN)
    | (ADD_SIGN)
    | (QUESTION_MARK_SIGN)
    | (LB_BRACKET DIG_LITERAL COMMA DIG_LITERAL RB_BRACKET)
    | (LB_BRACKET DIG_LITERAL COMMA  RB_BRACKET)
    | (LB_BRACKET COMMA DIG_LITERAL RB_BRACKET)
    ;

measuresClause
    : KW_MEASURES projectItemDefinition (COMMA projectItemDefinition)*
    ;

patternDefination
    : KW_PATTERN 
    LR_BRACKET
        patternVariable+
    RR_BRACKET 
    withinClause?
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

patternVariablesDefination
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
    : KW_NOT booleanExpression                                        #logicalNot
    | KW_EXISTS '(' queryStatement ')'                                         #exists
    | valueExpression predicate?                                   #predicated
    | left=booleanExpression operator=KW_AND right=booleanExpression  #logicalBinary
    | left=booleanExpression operator=KW_OR right=booleanExpression   #logicalBinary
    | booleanExpression KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL) #logicalNested
    ;

predicate
    : KW_NOT? 
        kind=KW_BETWEEN (KW_ASYMMETRIC | KW_SYMMETRIC)? 
        lower=valueExpression KW_AND 
        upper=valueExpression
    | KW_NOT? kind=KW_IN '(' expression (',' expression)* ')'
    | KW_NOT? kind=KW_IN '(' queryStatement ')'
    | kind=KW_EXISTS '(' queryStatement ')'
    | KW_NOT? kind=KW_RLIKE pattern=valueExpression
    | likePredicate
    | KW_IS KW_NOT? kind=(KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_NULL)
    | KW_IS KW_NOT? kind=KW_DISTINCT KW_FROM right=valueExpression
    | KW_NOT? kind=KW_SIMILAR KW_TO right=valueExpression (KW_ESCAPE stringLiteral)?
    ;

likePredicate
    : KW_NOT? kind=KW_LIKE quantifier=(KW_ANY | KW_ALL) ('('')' | '(' expression (',' expression)* ')')
    | KW_NOT? kind=KW_LIKE pattern=valueExpression (KW_ESCAPE stringLiteral)?
    ;

valueExpression
    : primaryExpression                                                                      #valueExpressionDefault
    | operator=('-' | '+' | '~') valueExpression                                        #arithmeticUnary
    | left=valueExpression operator=('*' | '/' | '%' | KW_DIV) right=valueExpression #arithmeticBinary
    | left=valueExpression operator=('+' | '-' | DOUBLE_VERTICAL_SIGN) right=valueExpression       #arithmeticBinary
    | left=valueExpression operator='&' right=valueExpression                          #arithmeticBinary
    | left=valueExpression operator='^' right=valueExpression                                #arithmeticBinary
    | left=valueExpression operator='|' right=valueExpression                               #arithmeticBinary
    | left=valueExpression comparisonOperator right=valueExpression                          #comparison
    | left=valueExpression right=SLASH_TEXT                                                #arithmeticBinaryAlternate
    ;

primaryExpression
    : KW_CASE whenClause+ (KW_ELSE elseExpression=expression)? KW_END                                   #searchedCase
    | KW_CASE value=expression whenClause+ (KW_ELSE elseExpression=expression)? KW_END                  #simpleCase
    | KW_CAST '(' expression KW_AS columnType ')'                                                      #cast
    // | STRUCT '(' (argument+=namedExpression (',' argument+=namedExpression)*)? ')'             #struct
    | KW_FIRST '(' expression (KW_IGNORE KW_NULLS)? ')'                                                 #first
    | KW_LAST '(' expression (KW_IGNORE KW_NULLS)? ')'                                                  #last
    | KW_POSITION '(' substr=valueExpression KW_IN str=valueExpression ')'                           #position
    | constant                                                                                 #constantDefault
    | '*'                                                                                 #star
    | uid '.' '*'                                                                #star
    // | '(' namedExpression (',' namedExpression)+ ')'                                           #rowConstructor
    | '(' queryStatement ')'                                                                            #subqueryExpression
    | functionName '(' (setQuantifier? functionParam (',' functionParam)*)? ')'                      #functionCall
    // | identifier '->' expression                                                               #lambda
    // | '(' identifier (',' identifier)+ ')' '->' expression                                     #lambda
    | value=primaryExpression LS_BRACKET index=valueExpression RS_BRACKET                                   #subscript
    | identifier                                                                               #columnReference
    | dereferenceDefinition                                                                                      #dereference
    | '(' expression ')'                                                                       #parenthesizedExpression
    // | EXTRACT '(' field=identifier KW_FROM source=valueExpression ')'                             #extract
    // | (SUBSTR | SUBSTRING) '(' str=valueExpression (KW_FROM | ',') pos=valueExpression
    //   ((KW_FOR | ',') len=valueExpression)? ')'                                                   #substring
    // | TRIM '(' trimOption=(BOTH | LEADING | TRAILING)? (trimStr=valueExpression)?
    //    KW_FROM srcStr=valueExpression ')'                                                         #trim
    // | OVERLAY '(' input=valueExpression PLACING replace=valueExpression
    //   KW_FROM position=valueExpression (KW_FOR length=valueExpression)? ')'                          #overlay
    ;

functionName
    : reservedKeywordsUsedAsFuncName
    | nonReservedKeywords
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
    : identifier | dereferenceDefinition
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
    : ('+' | '-')? (DIG_LITERAL | REAL_LITERAL)
    | STRING_LITERAL
    ;

columnAlias
    : KW_AS? identifier identifierList?
    ;

tableAlias
    : KW_AS? identifier identifierList?
    ;

errorCapturingIdentifier
    : identifier errorCapturingIdentifierExtra
    ;

errorCapturingIdentifierExtra
    : (KW_MINUS identifier)+    #errorIdent
    |                        #realIdent
    ;

identifierList
    : '(' identifierSeq ')'
    ;

identifierSeq
    : identifier (COMMA identifier)*
    ;

identifier
    : unquotedIdentifier         #unquotedIdentifierAlternative
    | quotedIdentifier           #quotedIdentifierAlternative
    | nonReservedKeywords        #nonReservedKeywordsAlternative
    ;

unquotedIdentifier
    : DIG_LITERAL | ID_LITERAL
    ;

quotedIdentifier
    : STRING_LITERAL
    ;

whenClause
    : KW_WHEN condition=expression KW_THEN result=expression
    ;

uid
    : identifier (DOT identifier)*?
    ;

withOption
    : KW_WITH tablePropertyList
    ;

ifNotExists
    : KW_IF KW_NOT KW_EXISTS;

ifExists
    : KW_IF KW_EXISTS;

tablePropertyList
    : '(' tableProperty (',' tableProperty)* ')'
    ;

tableProperty
    : key=tablePropertyKey (EQUAL_SYMBOL? value=tablePropertyValue)?
    ;

tablePropertyKey
    : identifier | dereferenceDefinition
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
    | '&' '&'
    | KW_OR 
    | '|' '|'
    ;

comparisonOperator
    : '=' 
    | '>' 
    | '<' 
    | '<' '=' 
    | '>' '='
    | '<' '>' 
    | '!' '=' 
    | '<' '=' '>'
    ;

bitOperator
    : '<' '<' 
    | '>' '>' 
    | '&' 
    | '^' 
    | '|'
    ;

mathOperator
    : '*' 
    | SLASH_SIGN 
    | PENCENT_SIGN 
    | KW_DIV 
    | '+' 
    | '-' 
    | DOUBLE_HYPNEN_SIGN
    ;

unaryOperator
    : '!' 
    | '~' 
    | ADD_SIGN 
    | '-' 
    | KW_NOT
    ;

constant
    : timeIntervalExpression
    | timePointLiteral
    | stringLiteral                                             // 引号包含的字符串
    | HYPNEN_SIGN? decimalLiteral                                // 正/负整数
    | booleanLiteral                                            // 布尔值
    | REAL_LITERAL                                              // 小数
    | BIT_STRING
    | KW_NOT? KW_NULL                                           // 空 | 非空
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
    : KW_TRUE | KW_FALSE;

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
    : KW_LEADING
    | KW_TRAILING
    | KW_BOTH
    | KW_ALL
    | KW_DISTINCT
    | ASTERISK_SIGN
    ;

reservedKeywordsUsedAsFuncName
    : KW_ABS
    | KW_ARRAY
    | KW_AVG
    | KW_CAST
    | KW_CEIL
    | KW_COALESCE
    | KW_COLLECT
    | KW_COUNT
    | KW_DATE
    | KW_GROUPING
    | KW_HOUR
    | KW_IF
    | KW_LAG
    | KW_LEFT
    | KW_MAP
    | KW_MINUTE
    | KW_MONTH
    | KW_OVERLAY
    | KW_POSITION
    | KW_POWER
    | KW_QUARTER
    | KW_RANK
    | KW_RIGHT
    | KW_SECOND
    | KW_SUBSTRING
    | KW_SUM
    | KW_TIME
    | KW_TIMESTAMP
    | KW_TRUNCATE
    | KW_UPPER
    | KW_WEEK
    | KW_YEAR
    ;

reservedKeywords
    : KW_ABS
    | KW_ALL
    | KW_ALLOW
    | KW_ALTER 
    | KW_AND
    | KW_ANY
    | KW_ARE
    | KW_ARRAY
    | KW_AS
    | KW_ASYMMETRIC
    | KW_AT
    | KW_AVG
    | KW_BEGIN
    | KW_BETWEEN
    | KW_BIGINT
    | KW_BINARY
    | KW_BIT
    | KW_BLOB
    | KW_BOOLEAN
    | KW_BOTH
    | KW_BY
    | KW_CALL
    | KW_CALLED
    | KW_CASCADED
    | KW_CASE
    | KW_CAST
    | KW_CEIL
    | KW_CHAR
    | KW_CHARACTER
    | KW_CHECK
    | KW_CLOB
    | KW_CLOSE
    | KW_COALESCE
    | KW_COLLATE
    | KW_COLLECT
    | KW_COLUMN
    | KW_COMMIT
    | KW_CONNECT
    | KW_CONSTRAINT
    | KW_CONTAINS
    | KW_CONVERT
    | KW_COUNT
    | KW_CREATE
    | KW_CROSS
    | KW_CUBE
    | KW_CURRENT
    | KW_CURSOR
    | KW_CYCLE
    | KW_DATE
    | KW_DATETIME
    | KW_DAY
    | KW_DEC
    | KW_DECIMAL
    | KW_DECLARE
    | KW_DEFAULT
    | KW_DEFINE
    | KW_DELETE
    | KW_DESCRIBE
    | KW_DISTINCT
    | KW_DOUBLE
    | KW_DROP
    | KW_EACH
    | KW_ELSE
    | KW_END
    | KW_EQUALS
    | KW_EXCEPT
    | KW_EXECUTE
    | KW_EXISTS
    | KW_EXPLAIN
    | KW_EXTERNAL
    | KW_EXTRACT
    | KW_FALSE
    | KW_FLOAT
    | KW_FOR
    | KW_FROM
    | KW_FULL
    | KW_FUNCTION
    | KW_GLOBAL
    | KW_GRANT
    | KW_GROUP
    | KW_GROUPING
    | KW_GROUPS
    | KW_HAVING
    | KW_HOUR
    | KW_IMPORT
    | KW_IN
    | KW_INCLUDING
    | KW_INNER
    | KW_INOUT
    | KW_INSERT
    | KW_INT
    | KW_INTEGER
    | KW_INTERSECT
    | KW_INTERVAL
    | KW_INTO
    | KW_IS
    | KW_JOIN
    | KW_LAG
    | KW_LANGUAGE
    | KW_LATERAL
    | KW_LEADING
    | KW_LEFT
    | KW_LIKE
    | KW_LIMIT
    | KW_LOCAL
    | KW_MATCH
    | KW_MATCH_RECOGNIZE
    | KW_MEASURES
    | KW_MERGE
    | KW_METADATA
    | KW_MINUS
    | KW_MINUTE
    | KW_MODIFIES
    | KW_MODULE
    | KW_MONTH
    | KW_MULTISET
    | KW_NATURAL
    | KW_NEXT
    | KW_NO
    | KW_NONE
    | KW_NOT
    | KW_NULL
    | KW_NUMERIC
    | KW_OF
    | KW_OFFSET
    | KW_ON
    | KW_ONE
    | KW_OR
    | KW_ORDER
    | KW_OUT
    | KW_OUTER
    | KW_OVER
    | KW_OVERLAY
    | KW_PARTITION
    | KW_PATTERN
    | KW_PER
    | KW_PERCENT
    | KW_PERIOD
    | KW_POSITION
    | KW_PRIMARY
    | KW_RANGE
    | KW_RANK
    | KW_RESET
    | KW_REVOKE
    | KW_RIGHT
    | KW_RLIKE
    | KW_ROLLBACK
    | KW_ROLLUP
    | KW_ROW
    | KW_ROWS
    | KW_SECOND
    | KW_SELECT
    | KW_SET
    | KW_SHOW
    | KW_SIMILAR
    | KW_SKIP
    | KW_SMALLINT
    | KW_START
    | KW_STATIC
    | KW_SUBSTRING
    | KW_SUM
    | KW_SYSTEM_TIME
    | KW_SYSTEM
    | KW_SYSTEM_TIME
    | KW_SYSTEM_USER
    | KW_TABLE
    | KW_TABLESAMPLE
    | KW_THEN
    | KW_TIME
    | KW_TIMESTAMP
    | KW_TINYINT
    | KW_TO
    | KW_TRUE
    | KW_TRUNCATE
    | KW_UNION
    | KW_UNIQUE
    | KW_UNKNOWN
    | KW_UNNEST
    | KW_UPPER
    | KW_UPSERT
    | KW_USER
    | KW_USING
    | KW_VALUE
    | KW_VALUES
    | KW_VARBINARY
    | KW_VARCHAR
    | KW_WHEN
    | KW_WHERE
    | KW_WINDOW
    | KW_WITH
    | KW_WITHIN
    | KW_WITHOUT
    | KW_YEAR
    ;

nonReservedKeywords
    :KW_ADD                           
    |KW_ADMIN                         
    |KW_AFTER                         
    |KW_ANALYZE                       
    |KW_ASC                           
    |KW_BEFORE                        
    |KW_BYTES                         
    |KW_CASCADE                       
    |KW_CATALOG                       
    |KW_CATALOGS                      
    |KW_CENTURY                       
    |KW_CHAIN                         
    |KW_CHANGELOG_MODE                
    |KW_CHARACTERS                    
    |KW_COMMENT                       
    |KW_COMPACT                       
    |KW_COLUMNS                       
    |KW_CONSTRAINTS                   
    |KW_CONSTRUCTOR                   
    |KW_CUMULATE                      
    |KW_DATA                          
    |KW_DATABASE                      
    |KW_DATABASES                     
    |KW_DAYS                          
    |KW_DECADE                        
    |KW_DEFINED                       
    |KW_DESC                          
    |KW_DESCRIPTOR                    
    |KW_DIV                           
    |KW_ENCODING                      
    |KW_ENFORCED                      
    |KW_ENGINE                        
    |KW_ERROR                         
    |KW_ESTIMATED_COST                
    |KW_EXCEPTION                     
    |KW_EXCLUDE                       
    |KW_EXCLUDING                     
    |KW_EXTENDED                      
    |KW_FILE                          
    |KW_FINAL                         
    |KW_FIRST                         
    |KW_FOLLOWING                     
    |KW_FORMAT                        
    |KW_FORTRAN                       
    |KW_FOUND                         
    |KW_FRAC_SECOND                   
    |KW_FUNCTIONS                     
    |KW_GENERAL                       
    |KW_GENERATED                     
    |KW_GO                            
    |KW_GOTO                          
    |KW_GRANTED                       
    |KW_HOP                           
    |KW_HOURS                         
    |KW_IF                            
    |KW_IGNORE                        
    |KW_INCREMENT                     
    |KW_INPUT                         
    |KW_INVOKER                       
    |KW_JAR                           
    |KW_JARS                          
    |KW_JAVA                          
    |KW_JSON                          
    |KW_JSON_EXECUTION_PLAN           
    |KW_KEY                           
    |KW_KEY_MEMBER                    
    |KW_KEY_TYPE                      
    |KW_LABEL                         
    |KW_LAST                          
    |KW_LENGTH                        
    |KW_LEVEL                         
    |KW_LOAD                          
    |KW_MAP                           
    |KW_MICROSECOND                   
    |KW_MILLENNIUM                    
    |KW_MILLISECOND                   
    |KW_MINUTES                       
    |KW_MINVALUE                      
    |KW_MODIFY                        
    |KW_MODULES                       
    |KW_MONTHS                        
    |KW_NANOSECOND                    
    |KW_NULLS                         
    |KW_NUMBER                        
    |KW_OPTION                        
    |KW_OPTIONS                       
    |KW_ORDERING                      
    |KW_OUTPUT                        
    |KW_OVERWRITE                     
    |KW_OVERWRITING                   
    |KW_PARTITIONED                   
    |KW_PARTITIONS                    
    |KW_PASSING                       
    |KW_PAST                          
    |KW_PATH                          
    |KW_PLACING                       
    |KW_PLAN                          
    |KW_PRECEDING                     
    |KW_PRESERVE                      
    |KW_PRIOR                         
    |KW_PRIVILEGES                    
    |KW_PUBLIC                        
    |KW_PYTHON                        
    |KW_PYTHON_FILES                  
    |KW_PYTHON_REQUIREMENTS           
    |KW_PYTHON_DEPENDENCIES           
    |KW_PYTHON_JAR                    
    |KW_PYTHON_ARCHIVES               
    |KW_PYTHON_PARAMETER              
    |KW_QUARTER                       
    |KW_RAW                           
    |KW_READ                          
    |KW_RELATIVE                      
    |KW_REMOVE                        
    |KW_RENAME                        
    |KW_REPLACE                       
    |KW_RESPECT                       
    |KW_RESTART                       
    |KW_RESTRICT                      
    |KW_ROLE                          
    |KW_ROW_COUNT                     
    |KW_SCALA                         
    |KW_SCALAR                        
    |KW_SCALE                         
    |KW_SCHEMA                        
    |KW_SECONDS                       
    |KW_SECTION                       
    |KW_SECURITY                      
    |KW_SELF                          
    |KW_SERVER                        
    |KW_SERVER_NAME                   
    |KW_SESSION                       
    |KW_SETS                          
    |KW_SIMPLE                        
    |KW_SIZE                          
    |KW_SLIDE                         
    |KW_SOURCE                        
    |KW_SPACE                         
    |KW_STATE                         
    |KW_STATEMENT                     
    |KW_STEP                          
    |KW_STRING                        
    |KW_STRUCTURE                     
    |KW_STYLE                         
    |KW_TABLES                        
    |KW_TEMPORARY                     
    |KW_TIMECOL                       
    |KW_TIMESTAMP_LTZ                 
    |KW_TIMESTAMPADD                  
    |KW_TIMESTAMPDIFF                 
    |KW_TRANSFORM                     
    |KW_TUMBLE                        
    |KW_TYPE                          
    |KW_UNDER                         
    |KW_UNLOAD                        
    |KW_USAGE                         
    |KW_USE                           
    |KW_UTF16                         
    |KW_UTF32                         
    |KW_UTF8                          
    |KW_VERSION                       
    |KW_VIEW                          
    |KW_VIEWS                         
    |KW_VIRTUAL                       
    |KW_WATERMARK                     
    |KW_WATERMARKS                    
    |KW_WEEK                          
    |KW_WORK                          
    |KW_WRAPPER                       
    |KW_YEARS                         
    |KW_ZONE                          
    ;