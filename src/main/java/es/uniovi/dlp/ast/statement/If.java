package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class If extends AbstractStatement {
  private Expression condition;
  private List<Statement> body;

  public Expression getCondition() {
    return condition;
  }

  public List<Statement> getBody() {
    return body;
  }

  public List<Statement> getElseBody() {
    return elseBody;
  }

  private List<Statement> elseBody;

  public If(
      int line, int column, Expression condition, List<Statement> body, List<Statement> elseBody) {
    super(line, column);
    this.condition = condition;
    this.body = body;
    this.elseBody = elseBody;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
