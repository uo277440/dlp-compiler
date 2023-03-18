package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class ComparisonOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(
      int line, int column, Expression leftExpression, String op, Expression rightExpression) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.op = op;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }


}
