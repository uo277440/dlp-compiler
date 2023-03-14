package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.type.FunctionType;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class FunctionDefinition extends AbstractASTNode implements Definition {
  private FunctionType type;

  private List<VarDefinition> bodyDefs;

  private List<Statement> statements;
  private String name;

  public FunctionDefinition(
      int line,
      int column,
      String name,
      List<VarDefinition> bodyDefs,
      List<Statement> statements,
      FunctionType type) {
    super(line, column);
    this.name = name;
    this.statements = statements;
    this.bodyDefs = bodyDefs;
    this.type = type;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
