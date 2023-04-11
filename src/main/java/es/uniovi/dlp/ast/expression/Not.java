package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Not extends AbstractExpression {
  public Expression getExpression() {
    return expression;
  }

  private Expression expression;

  public Not(int line, int column, Expression ex) {
    super(line, column);
    this.expression = ex;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
