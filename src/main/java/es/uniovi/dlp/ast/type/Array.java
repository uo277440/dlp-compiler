package es.uniovi.dlp.ast.type;

public class Array extends AbstractType {
  private int size;

  public Array(int line, int column) {
    super(line, column);
  }
}
