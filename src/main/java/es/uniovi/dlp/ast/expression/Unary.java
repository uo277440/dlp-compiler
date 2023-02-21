package es.uniovi.dlp.ast.expression;

public class Unary extends AbstractExpression {
  private Expression expression;

  public Unary(int line, int column) {
    super(line, column);
  }
}
