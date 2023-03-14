package es.uniovi.dlp.ast.type;

public class StructField extends AbstractType {

  private String name;
  private Type type;

  public StructField(String name, Type type, int line, int column) {
    super(line, column);
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return name;
  }
}
