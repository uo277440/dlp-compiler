package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Id extends AbstractExpression {
  private String name;
  private Definition definition;

  public Id(int line, int column, String name) {
    super(line, column);
    this.name = name;
    this.setLvalue(true);
  }


  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);

  }
}
