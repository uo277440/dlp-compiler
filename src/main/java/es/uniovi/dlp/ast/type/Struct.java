package es.uniovi.dlp.ast.type;

import java.util.List;

public class Struct extends AbstractType {
  private List<StructField> fields;

  public Struct(int line, int column) {
    super(line, column);
  }
}
