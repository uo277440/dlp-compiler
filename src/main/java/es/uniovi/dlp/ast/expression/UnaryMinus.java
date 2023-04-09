package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class UnaryMinus extends AbstractExpression {
  public Expression getExpression() {
    return expression;
  }

  private Expression expression;

  public UnaryMinus(int line, int column, Expression ex) {
    super(line, column);
    this.expression = ex;
    this.setLvalue(false);
    this.setType(Int.getInstance());

  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this,param);
  }


}
