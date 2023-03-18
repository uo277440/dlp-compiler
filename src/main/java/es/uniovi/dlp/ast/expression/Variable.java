package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Variable extends AbstractExpression {
  private String name;
  private Type type;

  public Variable(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }


}
