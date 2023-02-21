package es.uniovi.dlp.ast.expression;

public class Indexing extends AbstractExpression {
  private Expression expression;

  public Indexing(int line, int column) {
    super(line, column);
  }
}
