package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {
  public AbstractType(int line, int column) {
    super(line, column);
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof ErrorType) {
      return type;
    }
    return null;
  }

  @Override
  public Type allowDot(String name) {

    return null;
  }

  @Override
  public boolean isArithmetic() {
    return false;
  }

  @Override
  public Type casteable(Type t) {

    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }

  @Override
  public Type asignable(Type t) {

    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }

  @Override
  public boolean isIndexable() {
    return false;
  }

  @Override
  public Type logical(Type t) {
    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }

  @Override
  public Type logical() {
    if (this instanceof ErrorType) return this;

    return null;
  }

  @Override
  public Type comparisson(Type t) {
    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }
  @Override
  public Type promotesTo(Type t) {
    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }

  @Override
  public Type squareBrackets(Type t) {
    if (t instanceof ErrorType) {
      return t;
    }
    return null;
  }

  @Override
  public boolean isLogical() {
    return false;
  }

  @Override
  public boolean dot() {
    return false;
  }
  @Override
  public int getNumberOfBytes() {
    return -1;
  }
}
