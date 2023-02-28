grammar Xana;


@header {
package es.uniovi.dlp.parser;
}

program: (var_definition | func_definition)*main_func
       ;
arithmetic_operation: (ID | invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT ) (arithmetic_operator (ID | invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT ))+;
expression:  (field_acces | arithmetic_operation |logic_operattion|comparison_operation|cast|INT_CONSTANT| DIGIT | ID | CHARACTER | REAL_CONSTANT | invocation | CHAR_CONSTANT | oposite_operation | ')' | '(' | LOGIC_OPERATOR | arithmetic_operator | atributte_access)+;
arithmetic_operator:'+'|'-'|'/'|'*'|'^'|'%';
main_func:'def'MAIN'('')' 'do' (var_definition)*(statement)*'end';
field_acces:(ID | atributte_access | invocation)('['(cast | arithmetic_operation | DIGIT | INT_CONSTANT | atributte_access | field_acces | ID |invocation)']')+;
var_definition: ((ID (',' ID)* '::' type));
type: simple_type | complex_type ;
func_definition:'def' ID '('((param (',' param)* ')') | ')')  '::' (simple_type | 'void') func_body;
param: ID '::' simple_type;
func_body:'do'(var_definition)*(statement)*'end';
simple_type: 'char' | 'double' | 'int';
complex_type:array | struct;
struct:'defstruct' 'do'  (var_definition)* 'end';
comparison_operation: (ID | INT_CONSTANT | DIGIT)LOGIC_OPERATOR(ID | INT_CONSTANT | DIGIT);
logic_operattion: (invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT | ID) (LOGIC_OPERATOR (invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT | ID))+;
assignation: (expression | '('expression')') '=' (expression | '('expression')');
write:'puts'(expression)(',' expression)*;
read:'in'(expression)(',' expression)*;
statement: while | if | assignation | read | write | return | invocation;
if: 'if' expression 'do' (statement)* ('else' (statement)*)? 'end';
while: 'while' expression+ 'do' (statement)* 'end';
return:'return'expression;
cast:(CHAR_CONSTANT | ID | arithmetic_operation | field_acces | atributte_access | REAL_CONSTANT | DIGIT | INT_CONSTANT)'as'type;
oposite_operation:'!'expression+;
atributte_access:ID'.'ID;
invocation:ID(('('expression (',' expression)*')') | ('('')'));
array:('[' (DIGIT | INT_CONSTANT) '::')+ (type ']');
MAIN: 'main';

ONE_COMMENT: '#' ~[\r\n]* -> skip;

WS: [ \t\r\n] -> skip;

DIGIT:[1-9][0-9]*;

CHAR_CONSTANT: '\''(('\\'[0-9][0-9][0-9]) | ('\\n' | '\\t' | '\\r') | (.)) '\'';

MANTISA: [Ee] [+-]? [1-9] [0-9]*;

CHARACTER: '\''[a-zA-Z]'\'';

LOGIC_OPERATOR: '>' | '<' | '!=' | '==' | '<=' | '>=' | '&&' | '||';


REAL_CONSTANT: ([1-9]+ [0-9]* MANTISA?) | ([1-9][0-9]*'.'[0-9]*MANTISA?) | ('.'[1-9][0-9]*MANTISA?) ;

MULTI_COMMENT: '"""'.*?'"""' -> skip;

ID: ([a-zA-Z] | '_') ('_' | [a-zA-Z] | [0-9])*;

INT_CONSTANT: [0-9]+[0-9]* ;


