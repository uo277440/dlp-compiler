package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Indexing extends AbstractExpression {
  public Expression getName() {
    return name;
  }

  private Expression name;

  public Expression getIndex() {
    return index;
  }

  private Expression index;

  public Indexing(int line, int column, Expression name, Expression index) {
    super(line, column);
    this.name = name;
    this.index = index;
    this.setLvalue(true);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
