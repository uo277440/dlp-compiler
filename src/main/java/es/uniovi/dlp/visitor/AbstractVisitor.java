package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;

public abstract class AbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {

  @Override
  public ReturnType visit(Program program, ParamType param) {
    program.getDefinitions().forEach(definition -> definition.accept(this, param));
    return null;
  }
  @Override
  public ReturnType visit(Read read, ParamType param) {
    read.getToRead().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(Assignment assignment, ParamType param) {
    assignment.getRight().accept(this,param);
    assignment.getLeft().accept(this,param);
    return null;
  }
}
