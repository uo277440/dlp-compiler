package es.uniovi.dlp.ast.expression;

public class CharConstant extends AbstractExpression {
  char value;

  public CharConstant(int line, int column, char value) {
    super(line, column);
    this.value = value;
  }
}
