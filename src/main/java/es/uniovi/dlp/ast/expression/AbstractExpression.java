package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.type.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

  private boolean lvalue=false;
  private Type type;

  public AbstractExpression(int line, int column) {
    super(line, column);
  }

  @Override
  public boolean isLvalue() {
    return lvalue;
  }

  @Override
  public void setLvalue(boolean lvalue) {
    this.lvalue = lvalue;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public void setType(Type type) {
    this.type = type;
  }
}
