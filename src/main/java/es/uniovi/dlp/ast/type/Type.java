package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
  Type arithmetic(Type type);

  Type allowDot(String name);

  boolean dot();

  boolean isArithmetic();

  Type casteable(Type t);

  Type logical(Type t);

  Type logical();

  Type comparisson(Type t);

  Type squareBrackets(Type t);

  boolean isIndexable();

  boolean isLogical();

  Type asignable(Type t);

  int getNumberOfBytes();


  Type promotesTo(Type t);
  Type getIntermediateType(Type t);
}
