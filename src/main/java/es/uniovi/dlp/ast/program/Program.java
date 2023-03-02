package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import java.util.List;

public class Program extends AbstractASTNode {
  public Program(int line, int column, List<Definition> defs) {

    super(line, column);
  }
}
