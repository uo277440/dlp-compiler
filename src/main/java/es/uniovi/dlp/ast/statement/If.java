package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import java.util.List;

public class If extends AbstractStatement {
  private Expression condition;
  private List<Statement> body;
  private List<Statement> elseBody;

  public If(
      int line, int column, Expression condition, List<Statement> body, List<Statement> elseBody) {
    super(line, column);
    this.condition = condition;
    this.body = body;
    this.elseBody = elseBody;
  }
}
