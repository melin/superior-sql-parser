parser grammar StreamSqlParser;

options { tokenVocab=StreamSqlLexer; }

root
    : sqlStatements? MINUSMINUS? EOF
    ;

sqlStatements
    : (sqlStatement MINUSMINUS? SEMI | emptyStatement)*
    (sqlStatement (MINUSMINUS? SEMI)? | emptyStatement)
    ;

sqlStatement
    : createSoureTable | createSinkTable | createView | createFunction | insertStatement
    | setStatement
    ;

createSoureTable
    : CREATE SOURCE TABLE tableName
      '(' columns=colTypeList ')'
      WITH tableProps=tablePropertyList
      timeMode=timeModeExpr
    ;

createSinkTable
    : CREATE SINK TABLE tableName
      '(' columns=colTypeList ')'
      WITH tableProps=tablePropertyList
    ;

createView
    : CREATE VIEW tableName AS
      select = selectExpr
    ;

createFunction
    : CREATE FUNCTION functionName AS className=STRING_LITERAL
      USING jarFile=STRING_LITERAL
    ;

insertStatement
    : INSERT INTO tableName
      select = selectExpr
    ;

setStatement
    : SET setKeyExpr EQUAL_SYMBOL valueKeyExpr
    ;

emptyStatement
    : SEMI
    ;

setKeyExpr
    : ID (DOT_ID)*
    ;

valueKeyExpr
    : word (word)*
    ;

selectExpr
    : word (word)*
    ;

word
    : ID
    | DOT_ID
    | STRING_LITERAL | DECIMAL_LITERAL | REAL_LITERAL | booleanValue
    | AS | BY | PROCTIME | SET
    | STAR | DIVIDE | MODULE | PLUS | MINUS
    | EQUAL_SYMBOL | GREATER_SYMBOL | LESS_SYMBOL | EXCLAMATION_SYMBOL
    | BIT_NOT_OP | BIT_OR_OP | BIT_AND_OP | BIT_XOR_OP
    | LR_BRACKET | RR_BRACKET | COMMA
    ;

colTypeList
    : colType (',' colType)*
    ;

colType
    : ID dataType (COMMENT comment=STRING_LITERAL)?
    ;

dataType
    : VARCHAR | BOOLEAN | TINYINT | SMALLINT | INT | BIGINT
    | FLOAT | DECIMAL | DOUBLE
    | DATE | TIME | TIMESTAMP
    ;

tablePropertyList
    : '(' tableProperty (',' tableProperty)* ')'
    ;

tableProperty
    : key=tablePropertyKey EQUAL_SYMBOL value=tablePropertyValue
    ;

tablePropertyKey
    : ID (DOT_ID)*
    | STRING_LITERAL
    ;

tablePropertyValue
    : DECIMAL_LITERAL
    | booleanValue
    | STRING_LITERAL
    ;

booleanValue
    : TRUE | FALSE
    ;

timeModeExpr
    : TIMESTAMP BY timeMode=PROCTIME attrName=attrNameExpr
    | TIMESTAMP BY timeMode=ROWTIME attrName=attrNameExpr
      SET WATERMARK DELAY time=DECIMAL_LITERAL
    ;

attrNameExpr
    : PROCTIME
    | ROWTIME
    | ID
    ;

tableName
    : ID
    ;

functionName
    : ID
    ;