package es.uniovi.dlp.ast.program;

import es.uniovi.dlp.ast.AbstractASTNode;
import es.uniovi.dlp.visitor.AbstractVisitor;

import java.util.List;

public class Program extends AbstractASTNode {


  List<Definition> definitions;

  public Program(int line, int column, List<Definition> definitions) {
    super(line, column);
    this.definitions = definitions;
  }
  public List<Definition> getDefinitions() {
    return definitions;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
