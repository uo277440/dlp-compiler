package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {
  private int value;

  public IntLiteral(int line, int column, int value) {
    super(line, column);
    this.value = value;
    this.setLvalue(false);
    this.setType(Int.getInstance());
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
