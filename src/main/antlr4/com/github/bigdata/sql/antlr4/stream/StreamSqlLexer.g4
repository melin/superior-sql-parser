lexer grammar StreamSqlLexer;

channels { DCSTREAMCOMMENT, ERRORCHANNEL }

// SKIP

SPACE:                               [ \t\r\n]+    -> channel(HIDDEN);
SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(DCSTREAMCOMMENT);
COMMENT_INPUT:                       '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT:                        (
                                       ('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
                                       | '--' ('\r'? '\n' | EOF)
                                     ) -> channel(HIDDEN);

// Keywords
// Common Keywords
CREATE:                              'CREATE';
TABLE:                               'TABLE';
SOURCE:                              'SOURCE';
SINK:                                'SINK';
WITH:                                'WITH';
VIEW:                                'VIEW';
COMMENT:                             'COMMENT';
TRUE:                                'TRUE';
FALSE:                               'FALSE';
AS:                                  'AS';
BY:                                  'BY';
PROCTIME:                            'PROCTIME';
ROWTIME:                             'ROWTIME';
SET:                                 'SET';
WATERMARK:                           'WATERMARK';
RANGE:                               'RANGE';
DELAY:                               'DELAY';
INSERT:                              'INSERT';
INTO:                                'INTO';
FUNCTION:                            'FUNCTION';
USING:                               'USING';

MINUSMINUS:                          '--';

// DATA TYPE Keywords
VARCHAR:                             'VARCHAR';
BOOLEAN:                             'BOOLEAN';
TINYINT:                             'TINYINT';
SMALLINT:                            'SMALLINT';
INT:                                 'INT';
BIGINT:                              'BIGINT';
FLOAT:                               'FLOAT';
DECIMAL:                             'DECIMAL';
DOUBLE:                              'DOUBLE';
DATE:                                'DATE';
TIME:                                'TIME';
TIMESTAMP:                           'TIMESTAMP';

// Operators. Arithmetics
STAR:                                '*';
DIVIDE:                              '/';
MODULE:                              '%';
PLUS:                                '+';
MINUS:                               '-';

// Operators. Comparation
EQUAL_SYMBOL:                        '=';
GREATER_SYMBOL:                      '>';
LESS_SYMBOL:                         '<';
EXCLAMATION_SYMBOL:                  '!';


// Operators. Bit
BIT_NOT_OP:                          '~';
BIT_OR_OP:                           '|';
BIT_AND_OP:                          '&';
BIT_XOR_OP:                          '^';

// Constructors symbols
DOT:                                 '.';
LR_BRACKET:                          '(';
RR_BRACKET:                          ')';
COMMA:                               ',';
SEMI:                                ';';

DOT_ID:                              '.' ID_LITERAL;

ID:                                  ID_LITERAL;
REVERSE_QUOTE_ID:                    '`' ~'`'+ '`';
STRING_LITERAL:                      DQUOTA_STRING | SQUOTA_STRING;
DECIMAL_LITERAL:                     DEC_DIGIT+;
REAL_LITERAL:                        (DEC_DIGIT+)? '.' DEC_DIGIT+
                                     | DEC_DIGIT+ '.' EXPONENT_NUM_PART
                                     | (DEC_DIGIT+)? '.' (DEC_DIGIT+ EXPONENT_NUM_PART)
                                     | DEC_DIGIT+ EXPONENT_NUM_PART;

fragment EXPONENT_NUM_PART:          'E' '-'? DEC_DIGIT+;
fragment ID_LITERAL:                 [A-Z_$0-9]*?[A-Z_$]+?[A-Z_$0-9]*;
fragment DQUOTA_STRING:              '"' ( '\\'. | '""' | ~('"'| '\\') )* '"';
fragment SQUOTA_STRING:              '\'' ('\\'. | '\'\'' | ~('\'' | '\\'))* '\'';
fragment DEC_DIGIT:                  [0-9];

ERROR_RECONGNIGION:                  .    -> channel(ERRORCHANNEL);