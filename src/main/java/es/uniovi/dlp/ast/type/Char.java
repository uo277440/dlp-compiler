package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Char extends AbstractType {

  public Char(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
