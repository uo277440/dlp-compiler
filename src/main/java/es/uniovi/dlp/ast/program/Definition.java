package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.ASTNode;

public interface Definition extends ASTNode {
    String getName();
    int getScope();
    void setScope(int scope);
}
