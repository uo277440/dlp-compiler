package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.ASTNode;

public interface Type extends ASTNode {
Type arithmetic(Type type);
boolean allowDot();
boolean isArithmetic();

Type casteable();
Type logical();
Type comparisson();
Type indexing();
boolean isIndexable();

}
