package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class FieldAccess extends AbstractExpression {
  private Expression field;
  private String atributte;

  public FieldAccess(int line, int column, Expression left, String rightF) {
    super(line, column);
    this.field = left;
    this.atributte = rightF;
    this.setLvalue(true);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }


}
