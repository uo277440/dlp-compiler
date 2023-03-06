package es.uniovi.dlp.ast.expression;

public class Indexing extends AbstractExpression {
  private Expression name;
  private Expression index;

  public Indexing(int line, int column, Expression name, Expression index) {
    super(line, column);
    this.name = name;
    this.index = index;
  }
}
