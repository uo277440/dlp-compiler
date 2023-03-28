package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.error.Error;

public abstract class AbstractType extends AbstractASTNode implements Type {
  public AbstractType(int line, int column) {
    super(line, column);
  }
  @Override
  public Type arithmetic(Type type){
    if(type instanceof ErrorType){
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
    return false;
  }

}
