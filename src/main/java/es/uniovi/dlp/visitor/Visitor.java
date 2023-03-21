package es.uniovi.dlp.visitor;


import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.type.*;

public interface Visitor<ReturnType, ParamType> {
  //Definitions
  ReturnType visit(Program program, ParamType param);
  ReturnType visit(VarDefinition vd, ParamType param);
  ReturnType visit(FunctionDefinition fd, ParamType param);





  //Expressions

  ReturnType visit(ArithmeticOperation ao, ParamType param);
  ReturnType visit(Cast cast, ParamType param);
  ReturnType visit(CharConstant c, ParamType param);
  ReturnType visit(ComparisonOperation co, ParamType param);
  ReturnType visit(FieldAccess fa, ParamType param);
  ReturnType visit(Id id, ParamType param);
  ReturnType visit(Indexing indexing, ParamType param);
  ReturnType visit(IntLiteral il, ParamType param);
  ReturnType visit(Invocation invocation, ParamType param);
  ReturnType visit(LogicOperation lo, ParamType param);
  ReturnType visit(Not not, ParamType param);
  ReturnType visit(RealConstant rc, ParamType param);
  ReturnType visit(UnaryMinus um, ParamType param);


  //Statements
  ReturnType visit(Read read, ParamType param);
  ReturnType visit(Assignment assignment, ParamType param);
  ReturnType visit(If i, ParamType param);
  ReturnType visit(While w, ParamType param);
  ReturnType visit(Write w, ParamType param);
  ReturnType visit(Return r, ParamType param);

//types
  ReturnType visit(Array a, ParamType param);
  ReturnType visit(Char c, ParamType param);
  ReturnType visit(DoubleType d, ParamType param);
  ReturnType visit(FunctionType ft, ParamType param);
  ReturnType visit(Int i, ParamType param);
  ReturnType visit(Struct s, ParamType param);
  ReturnType visit(StructField sf, ParamType param);
  ReturnType visit(VoidType v, ParamType param);


}
