package es.uniovi.dlp.ast.expression;

public class Not extends AbstractExpression {
  private Expression expression;

  public Not(int line, int column) {
    super(line, column);
  }
}
