package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Array extends AbstractType {
  private int size;
  private Type type;

  public Array(int line, int column, Type type, int size) {
    super(line, column);
    this.type = type;
    this.size = size;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }

  @Override
  public boolean allowDot(){
    return true;
  }

}
