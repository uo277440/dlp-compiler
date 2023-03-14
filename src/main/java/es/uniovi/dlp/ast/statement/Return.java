package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Return extends AbstractStatement {
  private Expression expression;

  public Return(int line, int column, Expression expression) {
    super(line, column);
    this.expression = expression;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
