package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class Id extends AbstractExpression {
  public String getName() {
    return name;
  }

  public Definition getDefinition() {
    return definition;
  }

  private String name;

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }

  private Definition definition;

  public Id(int line, int column, String name) {
    super(line, column);
    this.name = name;
    this.setLvalue(true);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
