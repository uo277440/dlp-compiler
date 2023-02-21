package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Type;

public class Cast extends AbstractExpression {
  private Type type;

  public Cast(int line, int column) {
    super(line, column);
  }
}
