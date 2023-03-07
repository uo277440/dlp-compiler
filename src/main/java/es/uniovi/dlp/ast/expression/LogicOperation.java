package es.uniovi.dlp.ast.expression;

public class LogicOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public LogicOperation(int line, int column, Expression leftExpression, String op, Expression rightExpression) {
    super(line, column);
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
    this.op = op;

  }
}
