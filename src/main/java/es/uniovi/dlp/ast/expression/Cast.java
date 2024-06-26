package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Cast extends AbstractExpression {
  public Expression getLeft() {
    return left;
  }

  private Expression left;

  public Type getCastToType() {
    return castToType;
  }

  private Type castToType;

  public Cast(int line, int column, Expression left, Type type) {
    super(line, column);
    this.left = left;
    this.castToType = type;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
