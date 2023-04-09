package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Write extends AbstractStatement {
  public Expression getBody() {
    return body;
  }

  private Expression body;

  public Write(int line, int column, Expression body) {
    super(line, column);
    this.body = body;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {

    return visitor.visit(this,param);
  }
}
