package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

public class Return extends AbstractStatement {
  private Expression expression;

  public Return(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }
}
