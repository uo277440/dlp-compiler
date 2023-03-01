package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.type.Type;

public class Definition extends AbstractASTNode {
  private Type type;

  public Definition(int line, int column) {
    super(line, column);
  }
}
