package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.statement.Statement;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  private List<Expression> arguments;

  public Invocation(int line, int column,List<Expression> args) {

    super(line, column);
    this.arguments=args;
  }
}
