package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class VarDefinition extends AbstractASTNode implements Definition {
  private String name;
  private int scope = 0;
  private int offset;

  Type type;

  public VarDefinition(int line, int column, String name, Type type) {

    super(line, column);
    this.name = name;
    this.type = type;
  }

  @Override
  public Type getType() {
    return type;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public int getScope() {
    return scope;
  }

  public void setScope(int scope) {
    this.scope = scope;
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }
}
