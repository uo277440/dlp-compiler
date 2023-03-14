package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.program.Program;

public interface Visitor<ReturnType, ParamType> {
  ReturnType visit(Program program, ParamType param);
}
