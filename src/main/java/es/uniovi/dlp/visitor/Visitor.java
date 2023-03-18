package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;

public interface Visitor<ReturnType, ParamType> {
  ReturnType visit(Program program, ParamType param);
  ReturnType visit(Read read, ParamType param);
  ReturnType visit(Assignment assignment, ParamType param);
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

}
