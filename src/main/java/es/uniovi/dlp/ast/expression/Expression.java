package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.ast.type.Type;

public interface Expression extends ASTNode {
  boolean isLvalue();

  void setLvalue(boolean lvalue);

  Type getType();

  void setType(Type type);
}
