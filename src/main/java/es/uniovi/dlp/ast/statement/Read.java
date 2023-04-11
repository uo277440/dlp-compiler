package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Read extends AbstractStatement {

  private Expression toRead;

  public Read(int line, int column, Expression toRead) {
    super(line, column);
    this.toRead = toRead;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public Expression getToRead() {
    return toRead;
  }
}
