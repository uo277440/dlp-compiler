package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ComparisonOperation extends AbstractExpression {
  private String op;

  public Type getCastTo() {
    return castTo;
  }

  public void setCastTo(Type castTo) {
    this.castTo=castTo;
  }

  private Type castTo;

  public String getOp() {
    return op;
  }

  public Expression getLeftExpression() {
    return leftExpression;
  }

  public Expression getRightExpression() {
    return rightExpression;
  }

  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(
      int line, int column, Expression leftExpression, String op, Expression rightExpression) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.op = op;
    this.setLvalue(false);
    this.setType(Int.getInstance());
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
