package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleLiteral extends AbstractExpression {
  private double value;

  public DoubleLiteral(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
