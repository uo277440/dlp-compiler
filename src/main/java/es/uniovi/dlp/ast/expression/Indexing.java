package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Indexing extends AbstractExpression {
  public Expression getName() {
    return name;
  }

  private Expression name;

  public List<Expression> getIndexes() {
    return indexes;
  }

  private List<Expression> indexes;

  public Indexing(int line, int column, Expression name, List<Expression> index) {
    super(line, column);
    this.name = name;
    this.indexes = index;
    this.setLvalue(true);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }


}
