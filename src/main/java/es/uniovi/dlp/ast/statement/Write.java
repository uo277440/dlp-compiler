package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import java.util.List;

public class Write extends AbstractStatement {
  private List<Expression> body;

  public Write(int line, int column) {
    super(line, column);
  }
}
