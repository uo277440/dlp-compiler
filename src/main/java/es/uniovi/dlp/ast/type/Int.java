package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Int extends AbstractType {
private static Int instance= new Int(0,0);
  public Int(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
  @Override
  public Type arithmetic(Type type){
    if(type instanceof Int || type instanceof Char){
      return this;
    }
    if(type instanceof DoubleType){
      return type;
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


  public static Int getInstance() {
    return instance;
  }

}
