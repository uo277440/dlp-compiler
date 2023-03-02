grammar Xana;


@header {
package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.program.*;
import es.uniovi.dlp.ast.type.*;

}

program returns [Program ast]
: (varDefs+=var_definition | funcDefs+=func_definition )* main_func {
var defs = new ArrayList<Definition>();
for (var varDefs : $varDefs) {
    defs.addAll(varDefs.ast);
}
for (var funcDef : $funcDefs) {
    defs.add(funcDef.ast);
}
defs.add($main_func.ast);
$ast = new Program($start.getLine(),$start.getCharPositionInLine() + 1,defs);
       };
//arithmetic_operation: (ID | invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT ) (arithmetic_operator (ID | invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT ))+;

expression returns [Expression ast]
:  expression('['expression']')+ expression?
    |expression'as'simple_type
    |INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine() + 1);}
    | ID {$ast = new Id($ID.getLine(),$ID.getCharPositionInLine() + 1);}
    | REAL_CONSTANT {$ast = new RealConstant($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine() + 1);}
    | invocation {$ast = $invocation.ast;}
    | CHAR_CONSTANT
    | '!' expression
    | '('expression')'
    | expression ('>' | '<' | '!=' | '==' | '<=' | '>=' | '&&' | '||') expression
    |expression ('+'|'-'|'/'|'*'|'^'|'%') expression
    |expression'.'expression
    | '-'expression
    ;


main_func returns [FunctionDefinition ast]
:DEF MAIN'('')' DO (var_definition)*(statement)*END{$ast = new FunctionDefinition($DEF.getLine(),$DEF.getCharPositionInLine() + 1);};

//field_acces:(ID | atributte_access | invocation)('['(cast | arithmetic_operation | DIGIT | INT_CONSTANT | atributte_access | field_acces | ID |invocation)']')+;

var_definition returns[List<VarDefinition> ast=new ArrayList<>()]
: ((ids+=ID (',' ids+=ID)* '::' type)){
    for(var id : $ids) {
    $ast.add (new VarDefinition(id.getLine(),id.getCharPositionInLine() + 1, id.getText(),$type.ast));};
    };

type returns[Type ast]
: simple_type  {$ast = $simple_type.ast;}
| complex_type {$ast = $complex_type.ast;};

//func_definition returns [FuncDefinition ast]
//:'def' ID '('((param (',' param)* ')')
//                | ')')  '::' (simple_type | 'void') func_body;
func_definition returns [FunctionDefinition ast]
:DEF ID '('(((ID '::' simple_type) (',' (ID '::' simple_type))* ')')
                | ')')  '::' (simple_type | 'void') func_body
                {$ast = new FunctionDefinition($DEF.getLine(),$DEF.getCharPositionInLine() + 1);};

//param: ID '::' simple_type;

func_body returns [List<VarDefinition> defs= new ArrayList<>(),List<Statement> statements=new ArrayList<>()]
:DO(var_definition)*(statement)*END;

simple_type returns [Type ast]
        : CHAR {$ast = new Char($CHAR.getLine(),$CHAR.getCharPositionInLine() + 1);}
        | DOUBLE{$ast = new DoubleType($DOUBLE.getLine(),$DOUBLE.getCharPositionInLine() + 1);}
        | INT{$ast = new Int($INT.getLine(),$INT.getCharPositionInLine() + 1);};

complex_type returns [Type ast]
         :array {$ast = new Array($array.ast.getLine(),$array.ast.getColumn());}
         |struct{$ast = new Struct($struct.ast.getLine(),$struct.ast.getColumn());};

struct returns [Struct ast]
:DEFSTRUCT DO  (var_definition)* END {$ast = new Struct($DEFSTRUCT.getLine(),$DEFSTRUCT.getCharPositionInLine() + 1);};

//comparison_operation: (ID | INT_CONSTANT | DIGIT)LOGIC_OPERATOR(ID | INT_CONSTANT | DIGIT);

//logic_operattion: (invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT | ID) (LOGIC_OPERATOR (invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT | ID))+;

assignation: (expression | '('expression')') '=' (expression | '('expression')');

write returns [List<Write> ast= new ArrayList<>()]
:PUTS(exp+=expression)(',' exp+=expression)*{
for(var ex : $exp) {
    $ast.add (new Write(ex.ast.getLine(),ex.ast.getColumn()));};
    };

read returns [List<Read> ast = new ArrayList<>()]
:IN (exp+=expression)(',' exp+=expression)* {
for(var ex : $exp) {
    $ast.add (new Read(ex.ast.getLine(),ex.ast.getColumn()));};
    };

statement returns [List<Statement> ast= new ArrayList<>()]
:   whileStatement {$ast.add($whileStatement.ast);}
    | ifStatement {$ast.add($ifStatement.ast);}
    | assignation
    | read {$ast.addAll($read.ast);}
    | write {$ast.addAll($write.ast);}
    | returnStatement {$ast.add($returnStatement.ast);}
    | invocation
    ;


ifStatement returns [If ast]
: IF expression DO (statement)* ('else' (statement)*)? END {$ast = new If($IF.getLine(),$IF.getCharPositionInLine() + 1);};

whileStatement returns [While ast]
: WHILE expression+ DO (statement)* END{$ast = new While($WHILE.getLine(),$WHILE.getCharPositionInLine() + 1);};

returnStatement returns [Return ast]
:RETURN expression {$ast = new Return($RETURN.getLine(),$RETURN.getCharPositionInLine() + 1);};

//cast:(CHAR_CONSTANT | ID | arithmetic_operation | field_acces | atributte_access | REAL_CONSTANT | DIGIT | INT_CONSTANT)'as'simple_type;

//atributte_access:ID'.'ID;

invocation returns [Invocation ast]
:ID(('('expression (',' expression)*')') | ('('')')) {$ast = new Invocation($ID.getLine(),$ID.getCharPositionInLine() + 1);};

array returns [Array ast]
: ('[' INT_CONSTANT '::') (array)* (type ']') {$ast = new Array($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine() + 1);};

PUTS: 'puts';

IN: 'in';

IF: 'if';

WHILE: 'while';

RETURN: 'return';

MAIN: 'main';

DEF: 'def';

DO: 'do';

END: 'end';

CHAR: 'char';

DOUBLE: 'double';

INT: 'int';

DEFSTRUCT: 'defstruct';

INT_CONSTANT: [0-9]+[0-9]* ;

ONE_COMMENT: '#' ~[\r\n]* -> skip;

WS: [ \t\r\n] -> skip;

CHAR_CONSTANT: '\''(('\\'[0-9][0-9][0-9]) | ('\\n' | '\\t' | '\\r') | (.)) '\'';

MANTISA: [Ee] [+-]? [1-9] [0-9]*;

CHARACTER: '\''[a-zA-Z]'\'';

REAL_CONSTANT: ([1-9]+ [0-9]* MANTISA?) | ([1-9][0-9]*'.'[0-9]*MANTISA?) | ('.'[1-9][0-9]*MANTISA?) ;

MULTI_COMMENT: '"""'.*?'"""' -> skip;

ID: ([a-zA-Z] | '_') ('_' | [a-zA-Z] | [0-9])*;








