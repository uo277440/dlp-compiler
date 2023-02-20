grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (INT_CONSTANT | ID | REAL_CONSTANT | CHAR_CONSTANT)*
       ;

MULTI_COMMENT: '""'.*?'""' -> skip;

ONE_COMMENT: '#' -> skip;

INT_CONSTANT: [0-9]+ ;

ID: ([a-zA-Z] | '_') ('_' | [a-zA-Z] | [0-9])*;

CHAR_CONSTANT: '\''(('\\'[0-9][0-9][0-9]) | ('\\n' | '\\t')) '\'';

REAL_CONSTANT: ([1-9]+ [0-9]* [Ee] [+-]? [1-9] [0-9]*) | ([1-9][0-9]*'.'[0-9]*) ;