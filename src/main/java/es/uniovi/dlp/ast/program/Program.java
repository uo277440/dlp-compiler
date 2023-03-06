package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import java.util.List;

public class Program extends AbstractASTNode {
  List<Definition> definitions;

  public Program(int line, int column, List<Definition> definitions) {
    super(line, column);
    this.definitions = definitions;
  }
}
