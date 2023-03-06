package es.uniovi.dlp.ast.type;

public class Array extends AbstractType {
  private int size;
  private Type type;

  public Array(int line, int column, Type type,int size) {
    super(line, column);
    this.type = type;
    this.size=size;
  }
}
