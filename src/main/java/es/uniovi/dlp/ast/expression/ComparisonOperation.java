package es.uniovi.dlp.ast.expression;

public class ComparisonOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public ComparisonOperation(
      int line, int column, Expression leftExpression, String op, Expression rightExpression) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.op = op;
  }
}
