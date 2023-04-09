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
: (varDefs+=var_definition | funcDefs+=func_definition )* main_func EOF{
var defs = new ArrayList<Definition>();
for (var varDefs : $varDefs) {
    defs.addAll(varDefs.ast);
}

for (var funcDef : $funcDefs) {
    defs.add(funcDef.ast);
}
defs.add($main_func.ast);
$ast = new Program(1,1,defs);
       };
//arithmetic_operation: (ID | invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT ) (arithmetic_operator (ID | invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT ))+;

expression returns [Expression ast]
:

     INT_CONSTANT {$ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine() + 1,LexerHelper.lexemeToInt($INT_CONSTANT.getText()));}
    | name=ID {$ast = new Id($name.getLine(),$name.getCharPositionInLine() + 1,$name.getText());}
    | REAL_CONSTANT {$ast = new RealConstant($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine() + 1,LexerHelper.lexemeToReal($REAL_CONSTANT.getText()));}
    | CHAR_CONSTANT {$ast = new CharConstant($start.getLine(),$start.getCharPositionInLine() + 1,LexerHelper.lexemeToChar($CHAR_CONSTANT.getText()));}
    | '('expression')'{$ast= $expression.ast;}
    | left=expression'['e=expression']' {

    $ast = new Indexing($start.getLine(),$start.getCharPositionInLine() + 1,$left.ast,$e.ast);
    }
    |left=expression'.'idR=ID {$ast = new FieldAccess($start.getLine(),$start.getCharPositionInLine() + 1,$left.ast,$idR.getText());}
    |ex=expression'as'st=simple_type {$ast = new Cast($start.getLine(),$start.getCharPositionInLine() + 1,$ex.ast,$st.ast);}
    | '-'ex=expression {$ast = new UnaryMinus($start.getLine(),$start.getCharPositionInLine() + 1,$ex.ast);}
    | '!' ex=expression {$ast = new Not($start.getLine(),$start.getCharPositionInLine() + 1,$ex.ast);}
    |left=expression op=('/'|'*'|'%') right=expression {$ast = new ArithmeticOperation($start.getLine(),$start.getCharPositionInLine() + 1,$left.ast,$op.getText(),$right.ast);}
    |left=expression op=('+'|'-') right=expression {$ast = new ArithmeticOperation($op.getLine(),$op.getCharPositionInLine() + 1,$left.ast,$op.getText(),$right.ast);}
    | left=expression op=('>' | '<' | '!=' | '==' | '<=' | '>=') right=expression {$ast = new ComparisonOperation($op.getLine(),$op.getCharPositionInLine() + 1,$left.ast,$op.getText(),$right.ast);}
    | left=expression op=('&&' | '||') right=expression {$ast = new LogicOperation($op.getLine(),$op.getCharPositionInLine() + 1,$left.ast,$op.getText(),$right.ast);}
    | invocation {$ast = $invocation.ast;}

    ;


main_func returns [FunctionDefinition ast]
:DEF name=MAIN'('')' DO ((defs+=var_definition) | (sts+=statement))*END{
var definitions =new ArrayList<VarDefinition>();
var statements=new ArrayList<Statement>();
for(var d:$defs){
definitions.addAll(d.ast);
}
for(var s:$sts){
statements.addAll(s.ast);
}
$ast = new FunctionDefinition($DEF.getLine(),$DEF.getCharPositionInLine() + 1,$name.getText(),definitions,statements,new FunctionType($DEF.getLine(),$DEF.getCharPositionInLine() + 1,new ArrayList<VarDefinition>(),new VoidType($start.getLine(),$start.getCharPositionInLine() + 1)));
};

//field_acces:(ID | atributte_access | invocation)('['(cast | arithmetic_operation | DIGIT | INT_CONSTANT | atributte_access | field_acces | ID |invocation)']')+;

var_definition returns[List<VarDefinition> ast=new ArrayList<>()]
: ((ids+=ID (',' ids+=ID)* '::' type)){
    for(var id : $ids) {
    $ast.add (new VarDefinition(id.getLine(),id.getCharPositionInLine() + 1, id.getText(),$type.ast));};
    };
returnType returns [Type ast]:
simple_type{$ast = $simple_type.ast;}
| VOID {$ast = new VoidType($VOID.getLine(),$VOID.getCharPositionInLine() + 1);};
type returns[Type ast]
: simple_type  {$ast = $simple_type.ast;}
| complex_type {$ast = $complex_type.ast;};

//func_definition returns [FuncDefinition ast]
//:'def' ID '('((param (',' param)* ')')
//                | ')')  '::' (simple_type | 'void') func_body;
func_definition returns [FunctionDefinition ast]
:DEF name=ID '('(((params+=param) (','(params+=param))* ')')
                | ')')  '::' (returnType) body=func_body{
                var pars = new ArrayList<VarDefinition>();
                for(var p : $params){
                pars.add(p.ast);
                }
                $ast = new FunctionDefinition($DEF.getLine(),$DEF.getCharPositionInLine() + 1,$name.getText(),$body.defs,$body.statements,new FunctionType($DEF.getLine(),$DEF.getCharPositionInLine() + 1,pars,$returnType.ast));};
param returns [VarDefinition ast]
:name=ID '::' tipo=simple_type{$ast = new VarDefinition($name.getLine(),$name.getCharPositionInLine() + 1,$name.getText(),$tipo.ast);};
func_body returns [List<VarDefinition> defs= new ArrayList<>(),List<Statement> statements=new ArrayList<>()]
:DO ((vars+=var_definition) |  (stmnts+=statement))*END{
var varDefs = new ArrayList<VarDefinition>();
var sts = new ArrayList<Statement>();
for(var def : $vars)
    varDefs.addAll(def.ast);
for(var st : $stmnts)
    sts.addAll(st.ast);
$defs= varDefs;
$statements=sts;
};

simple_type returns [Type ast]
        : CHAR {$ast = new Char($CHAR.getLine(),$CHAR.getCharPositionInLine() + 1);}
        | DOUBLE{$ast = new DoubleType($DOUBLE.getLine(),$DOUBLE.getCharPositionInLine() + 1);}
        | INT{$ast = new Int($INT.getLine(),$INT.getCharPositionInLine() + 1);};

complex_type returns [Type ast]
         :array {$ast = $array.ast;}
         |struct{$ast = $struct.ast;};

struct returns [Struct ast]
:DEFSTRUCT DO  (vars+=var_definition)* END {
var structs = new ArrayList<StructField>();
var i =0;
for(var v: $vars){
for(var vd : v.ast){
structs.add(new StructField(vd.getName(),vd.getType(),vd.getLine(),vd.getColumn()));
}
}
$ast = new Struct($DEFSTRUCT.getLine(),$DEFSTRUCT.getCharPositionInLine() + 1,structs);
};

//comparison_operation: (ID | INT_CONSTANT | DIGIT)LOGIC_OPERATOR(ID | INT_CONSTANT | DIGIT);

//logic_operattion: (invocation|INT_CONSTANT | DIGIT  | REAL_CONSTANT | ID) (LOGIC_OPERATOR (invocation|DIGIT | INT_CONSTANT | REAL_CONSTANT | ID))+;

assignation returns [Assignment ast]
: (left = expression | '('left = expression')') '=' (right = expression | '('right = expression')'){
$ast = new Assignment($start.getLine(),$start.getCharPositionInLine() + 1,$left.ast,$right.ast);};
write returns [List<Write> ast= new ArrayList<>()]
:PUTS(exp+=expression)(',' exp+=expression)*{
for(var ex : $exp) {
    if(ex.ast != null)
    $ast.add (new Write(ex.ast.getLine(),ex.ast.getColumn(),ex.ast));};
    };

read returns [List<Read> ast = new ArrayList<>()]
:IN (exp+=expression)(',' exp+=expression)* {
for(var ex : $exp) {
    if(ex.ast != null)
    $ast.add(new Read(ex.ast.getLine(),ex.ast.getColumn(),ex.ast));};
    };

statement returns [List<Statement> ast= new ArrayList<>()]
:   whileStatement {$ast.add($whileStatement.ast);}
    | ifStatement {$ast.add($ifStatement.ast);}
    | assignation {$ast.add($assignation.ast);}
    | read {$ast.addAll($read.ast);}
    | write {$ast.addAll($write.ast);}
    | returnStatement {$ast.add($returnStatement.ast);}
    | invocation {$ast.add($invocation.ast);}
    ;


ifStatement returns [If ast]
: IF condition=expression DO (statements+=statement)* ('else' (elseStatements+=statement)*)? END {
var sts=new ArrayList<Statement>();
var elseSts=new ArrayList<Statement>();
for(var state: $statements){
if(state.ast != null)
sts.addAll(state.ast);
}
for(var stateE: $elseStatements){
if(stateE.ast != null)
elseSts.addAll(stateE.ast);
}
$ast = new If($IF.getLine(),$IF.getCharPositionInLine() + 1,$condition.ast,sts,elseSts);
};

whileStatement returns [While ast]
: WHILE condition=expression DO (statements+=statement)* END{
var sts=new ArrayList<Statement>();
for(var state: $statements){
if(state.ast != null)
sts.addAll(state.ast);
}
$ast = new While($WHILE.getLine(),$WHILE.getCharPositionInLine() + 1,$condition.ast,sts);
};

returnStatement returns [Return ast]
:RETURN exp = expression {$ast = new Return($RETURN.getLine(),$RETURN.getCharPositionInLine() + 1,$exp.ast);};


invocation returns [Invocation ast]
:name=ID(('('exps+=expression (',' exps+=expression)*')') | ('('')')) {
var exs = new ArrayList<Expression>();
for(var e : $exps){
exs.add(e.ast);
}
$ast = new Invocation($start.getLine(),$start.getCharPositionInLine() + 1,exs,new Id($start.getLine(),$start.getCharPositionInLine() + 1,$name.getText()));
};

array returns [Array ast]
: ('[' size=INT_CONSTANT '::')  (tipo=type ']') {$ast = new Array($start.getLine(),$start.getCharPositionInLine() + 1,$tipo.ast,LexerHelper.lexemeToInt($size.getText()));};

PUTS: 'puts';

IN: 'in';

VOID: 'void';

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








