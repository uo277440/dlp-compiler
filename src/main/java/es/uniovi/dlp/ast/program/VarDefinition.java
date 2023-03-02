package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.type.Type;

public class VarDefinition extends AbstractASTNode implements Definition {
  private String name;

  public VarDefinition(int line, int column, String name, Type type) {
    super(line, column);
  }
}
