package es.uniovi.dlp.ast.expression;

public class ComparisonOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(int line, int column) {
    super(line, column);
  }
}
