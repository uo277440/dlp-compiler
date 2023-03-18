package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {


  private boolean lvalue;
  public AbstractExpression(int line, int column) {
    super(line, column);
  }
  @Override
  public boolean isLvalue() {
    return lvalue;
  }
  @Override
  public void setLvalue(boolean lvalue) {
    this.lvalue=lvalue;
  }

}
