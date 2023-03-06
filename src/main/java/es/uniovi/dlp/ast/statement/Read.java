package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

public class Read extends AbstractStatement {
  private Expression toRead;

  public Read(int line, int column, Expression toRead) {
    super(line, column);
    this.toRead = toRead;
  }
}
