package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Type;

public class Cast extends AbstractExpression {
  private Expression left;
  private Type type;

  public Cast(int line, int column, Expression left, Type type) {
    super(line, column);
    this.left = left;
    this.type = type;
  }
}
