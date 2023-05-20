package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.visitor.AbstractVisitor;

public class Char extends AbstractType {
  private static Char instance = new Char(0, 0);

  public Char(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }

  @Override
  public Type arithmetic(Type type) {
    if (type instanceof Char) {
      return Int.getInstance();
    }
    return null;
  }

  @Override
  public boolean isArithmetic() {
    return true;
  }

  public static Char getInstance() {
    return instance;
  }

  @Override
  public Type casteable(Type t) {
    if (t instanceof Int) {
      return Int.getInstance();
    }
    if (t instanceof Char) {
      return this;
    }
    if (t instanceof DoubleType) {
      return t;
    }
    return super.casteable(t);
  }

  @Override
  public Type comparisson(Type t) {
    if (t instanceof Int || t instanceof Char || t instanceof DoubleType) {
      return t;
    }
    return super.comparisson(t);
  }

  @Override
  public Type asignable(Type t) {
    if (t instanceof Char) {
      return t;
    }
    return super.asignable(t);
  }

  @Override
  public Type promotesTo(Type t) {
    if (t instanceof Char || t instanceof Int || t instanceof DoubleType) {
      return t;
    }
    return super.promotesTo(t);
  }

  @Override
  public int getNumberOfBytes() {
    return 1;
  }

  @Override
  public Type getIntermediateType(Type t) {
    if (t instanceof DoubleType) return Int.getInstance();
    if (t instanceof Int) return t;
    return super.getIntermediateType(t);
  }
}
