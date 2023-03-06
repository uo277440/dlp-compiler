package es.uniovi.dlp.ast.expression;

public class Not extends AbstractExpression {
  private Expression expression;

  public Not(int line, int column, Expression ex) {
    super(line, column);
    this.expression = ex;
  }
}
