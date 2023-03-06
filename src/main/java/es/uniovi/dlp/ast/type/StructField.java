package es.uniovi.dlp.ast.type;

public class StructField {
  private String name;
  private Type type;

  public StructField(String name, Type type) {
    this.name = name;
    this.type = type;
  }
}
