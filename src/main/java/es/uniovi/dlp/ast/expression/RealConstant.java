package es.uniovi.dlp.ast.expression;

public class RealConstant extends AbstractExpression {
  double value;

  public RealConstant(int line, int column, double value) {
    super(line, column);
    this.value = value;
  }
}
