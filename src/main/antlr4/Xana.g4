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

REAL_CONSTANT: ([1-9]+ [0-9]* MANTISA?) | ([1-9][0-9]*'.'[0-9]*MANTISA?) | ('.'[1-9][0-9]*MANTISA?) ;

var_definition: ID (',' ID)* '::' type '\n';

type: 'int'; //parche para que compile

definition:'def' ID '(' param? (',' param)* ')' '::' type;
simple_type: 'char' | 'double' | 'int';
array:ID '::' '[' INT_CONSTANT '::' ((type ']') | ('['INT_CONSTANT '::' type ']') );