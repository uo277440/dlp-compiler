package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.statement.Statement;

public class FunctionDefinition extends AbstractASTNode {
  private Statement statements;
  private VarDefinition varDefinitions;
  private String name;

  public FunctionDefinition(int line, int column) {
    super(line, column);
  }
}
