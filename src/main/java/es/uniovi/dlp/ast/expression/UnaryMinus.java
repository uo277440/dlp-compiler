package es.uniovi.dlp.ast.expression;

public class UnaryMinus extends AbstractExpression {
  private Expression expression;

  public UnaryMinus(int line, int column, Expression ex) {
    super(line, column);
    this.expression = ex;
  }
}
