package es.uniovi.dlp.ast.expression;

public class IntLiteral extends AbstractExpression {
  private int value;

  public IntLiteral(int line, int column) {
    super(line, column);
  }
}