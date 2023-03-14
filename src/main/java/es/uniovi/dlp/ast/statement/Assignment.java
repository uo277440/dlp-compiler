package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

public class Assignment extends AbstractStatement {
  private Expression left;
  private Expression right;

  public Assignment(int line, int column, Expression left, Expression right) {
    super(line, column);
    this.left = left;
    this.right = right;
  }
}
