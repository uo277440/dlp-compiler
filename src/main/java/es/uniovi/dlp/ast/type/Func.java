package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.program.VarDefinition;

public class Func extends AbstractType {
  private VarDefinition params;
  private Type returnType;

  public Func(int line, int column) {
    super(line, column);
  }
}
