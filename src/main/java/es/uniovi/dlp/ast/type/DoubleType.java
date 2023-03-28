package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class DoubleType extends AbstractType {
  private static DoubleType instance= new DoubleType(0,0);

  public DoubleType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
  @Override
  public Type arithmetic(Type type){
    if(type instanceof DoubleType || type instanceof Int || type instanceof Char){
      return this;
    }
    return null;
  }

  @Override
  public boolean isArithmetic(){
    return true;
  }
  @Override
  public Type casteable(Type t){
    if(t instanceof DoubleType || t instanceof Int){
      return this;
    }
    return super.casteable(t);
  }
  public static DoubleType getInstance() {
    return instance;
  }
  @Override
  public Type comparisson(Type t){
    if(t instanceof Int || t instanceof Char || t instanceof DoubleType){
      return t;
    }
    return super.comparisson(t);
  }
}
