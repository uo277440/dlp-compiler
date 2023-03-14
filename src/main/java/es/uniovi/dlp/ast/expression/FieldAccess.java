package es.uniovi.dlp.ast.expression;

public class FieldAccess extends AbstractExpression {
  private Expression field;
  private String atributte;

  public FieldAccess(int line, int column, Expression left, String rightF) {
    super(line, column);
    this.field = left;
    this.atributte = rightF;
  }
}
