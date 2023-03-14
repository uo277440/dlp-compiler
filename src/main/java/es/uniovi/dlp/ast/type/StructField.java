package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructField extends AbstractType {

  private String name;
  private Type type;

  public StructField(String name, Type type, int line, int column) {
    super(line, column);
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
