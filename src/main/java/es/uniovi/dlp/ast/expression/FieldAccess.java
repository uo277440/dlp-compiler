package es.uniovi.dlp.ast.expression;

public class FieldAccess extends AbstractExpression {
  private Expression leftF;
  private String rightF;

  public FieldAccess(int line, int column, Expression left, String rightF) {
    super(line, column);
    this.leftF = left;
    this.rightF = rightF;
  }
}
