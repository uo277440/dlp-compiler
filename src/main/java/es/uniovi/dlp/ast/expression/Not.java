package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Not extends AbstractExpression {
  private Expression expression;

  public Not(int line, int column, Expression ex) {
    super(line, column);
    this.expression = ex;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
