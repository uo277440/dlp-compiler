package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Assignment extends AbstractStatement {


  private Expression left;
  private Expression right;

  public Assignment(int line, int column, Expression left, Expression right) {
    super(line, column);
    this.left = left;
    this.right = right;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
  public Expression getLeft() {
    return left;
  }

  public Expression getRight() {
    return right;
  }
}
