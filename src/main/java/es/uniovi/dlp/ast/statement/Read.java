package es.uniovi.dlp.ast.statement;

public class Read extends AbstractStatement {
  private String toRead;

  public Read(int line, int column) {
    super(line, column);
  }
}
