package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

public class Write extends AbstractStatement {
  private Expression body;

  public Write(int line, int column, Expression body) {
    super(line, column);
    this.body = body;
  }
}
