package es.uniovi.dlp.ast.expression;

public class UnaryMinus extends AbstractExpression {
  private Expression expression;

  public UnaryMinus(int line, int column) {
    super(line, column);
  }
}
