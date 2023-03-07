package es.uniovi.dlp.ast.expression;

public class ArithmeticOperation extends AbstractExpression {
  private String op;
  private Expression leftExpression;
  private Expression rightExpression;

  public ArithmeticOperation(
      int line, int column, Expression leftExpression, String op, Expression rightExpression) {
    super(line, column);
    this.leftExpression=leftExpression;
    this.rightExpression=rightExpression;
    this.op=op;
  }
}
