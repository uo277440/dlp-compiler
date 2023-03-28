package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Char extends AbstractType {
  private static Char instance= new Char(0,0);

  public Char(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
  @Override
  public Type arithmetic(Type type){
    if(type instanceof Char){
      return Int.getInstance();
    }
    return null;
  }
  @Override
  public boolean allowDot(){
    return false;
  }
  @Override
  public boolean isArithmetic(){
    return true;
  }

  public static Char getInstance() {
    return instance;
  }
}
