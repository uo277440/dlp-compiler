grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (INT_CONSTANT | ID | REAL_CONSTANT | CHAR_CONSTANT)*
       ;

MULTI_COMMENT: '"""'.*?'"""' -> skip;

ONE_COMMENT: '#' ~[\r\n]* -> skip;
WS: [ \t\r\n] -> skip;


INT_CONSTANT: [0-9]+ ;

ID: ([a-zA-Z] | '_') ('_' | [a-zA-Z] | [0-9])*;

CHAR_CONSTANT: '\''(('\\'[0-9][0-9][0-9]) | ('\\n' | '\\t' | '\\r') | (.)) '\'';

MANTISA: [Ee] [+-]? [1-9] [0-9]*;

CHARACTER: '\''[a-zA-Z]'\'';

LOGIC_OPERATOR: '>' | '<' | '!=' | '==';

DIGIT:[0-9]+;

REAL_CONSTANT: ([1-9]+ [0-9]* MANTISA?) | ([1-9][0-9]*'.'[0-9]*MANTISA?) | ('.'[1-9][0-9]*MANTISA?) ;

var_definition: ID (',' ID)* '::' type '\\n';

type: simple_type | array | struct; //parche para que compile

definition:'def' ID '(' param? (',' param)* ')' '::' type;
simple_type: 'char' | 'double' | 'int';
array:ID '::' ('[' INT_CONSTANT '::')+ (type ']');
struct:ID ':: defstruct do \\n' (var_definition '\\n')* 'end';
expression:DIGIT | ID | CHARACTER;
assignation: expression '=' expression;
write:'puts'(expression)(',' expression)*;
read:'in'(expression)(',' expression)*;
statement: '1';
param: '1';
if: 'if' expression LOGIC_OPERATOR expression 'do' (statement)* ('else' (statement)*)? 'end';
while: 'while' expression LOGIC_OPERATOR expression 'do' (statement)* 'end';
return:'return'expression;
cast:'as'type;

