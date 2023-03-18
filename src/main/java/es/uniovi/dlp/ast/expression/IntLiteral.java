package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class IntLiteral extends AbstractExpression {
  private int value;

  public IntLiteral(int line, int column, int value) {
    super(line, column);
    this.value = value;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }


}
