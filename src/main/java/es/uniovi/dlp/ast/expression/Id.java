package es.uniovi.dlp.ast.expression;

public class Id extends AbstractExpression {
  private String name;

  public Id(int line, int column, String name) {
    super(line, column);
    this.name = name;
  }
}
