package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.ASTNode;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class StructField implements ASTNode {

  private int offset = -1;

  private String name;

  private Type type;

  private int line;
  private int column;

  public StructField(String name, Type type, int line, int column) {
    this.line = line;
    this.column = column;
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  @Override
  public int getLine() {
    return line;
  }

  @Override
  public int getColumn() {
    return column;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  public int getOffset() {
    return offset;
  }

  public void setOffset(int offset) {
    this.offset = offset;
  }

  public Type getType() {
    return type;
  }
}
