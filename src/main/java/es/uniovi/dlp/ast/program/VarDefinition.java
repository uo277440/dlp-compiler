package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.type.Type;

public class VarDefinition extends AbstractASTNode implements Definition {
  private String name;
  Type type;

  public VarDefinition(int line, int column, String name, Type type) {

    super(line, column);
    this.name = name;
    this.type = type;
  }

  public Type getType() {
    return type;
  }

  public String getName() {
    return name;
  }
}
