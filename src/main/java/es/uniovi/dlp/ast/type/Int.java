package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Int extends AbstractType {

  public Int(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
