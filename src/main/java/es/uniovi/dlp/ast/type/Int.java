package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Int extends AbstractType {
  private static Int instance = new Int(0, 0);

  public Int(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof Int || type instanceof Char) {
      return this;
    }
    if (type instanceof DoubleType) {
      return type;
    }
    return null;
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  public static Int getInstance() {
    return instance;
  }

  @Override
  public Type casteable(Type t) {
    if (t instanceof DoubleType) {
      return t;
    }
    if (t instanceof Char) {
      return t;
    }
    if (t instanceof Int) {
      return this;
    }
    return super.casteable(t);
  }

  public boolean isIndexable() {
    return true;
  }

  @Override
  public Type comparisson(Type t) {
    if (t instanceof Int || t instanceof Char || t instanceof DoubleType) {
      return t;
    }
    return super.comparisson(t);
  }

  @Override
  public Type logical(Type t) {
    if (t instanceof Int) {
      return t;
    }
    return super.logical(t);
  }

  @Override
  public Type asignable(Type t) {
    if (t instanceof Int) {
      return t;
    }
    if (t instanceof Char) {
      return t;
    }
    return super.asignable(t);
  }

  @Override
  public boolean isLogical() {
    return true;
  }

  @Override
  public Type logical() {
    return this;
  }

  @Override
  public Type promotesTo(Type t) {
    if (t instanceof Int || t instanceof DoubleType) {
      return t;
    }
    return super.promotesTo(t);
  }

  @Override
  public int getNumberOfBytes() {
    return 2;
  }

  @Override
  public Type getIntermediateType(Type t) {
    if (t instanceof DoubleType || t instanceof Char) return t;
    return super.getIntermediateType(t);
  }
}
