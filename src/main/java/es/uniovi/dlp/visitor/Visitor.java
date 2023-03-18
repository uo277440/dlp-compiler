package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;

public interface Visitor<ReturnType, ParamType> {
  ReturnType visit(Program program, ParamType param);
  ReturnType visit(Read read, ParamType param);
  ReturnType visit(Assignment assignment, ParamType param);
}
