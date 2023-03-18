package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.ASTNode;

public interface Expression extends ASTNode {
boolean isLvalue();
void setLvalue(boolean lvalue);
}
