package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class CharConstant extends AbstractExpression {
  public char getValue() {
    return value;
  }

  char value;

  public CharConstant(int line, int column, char value) {
    super(line, column);
    this.value = value;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this,param);
  }



}
