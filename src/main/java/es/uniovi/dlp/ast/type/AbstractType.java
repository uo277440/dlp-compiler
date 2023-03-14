package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.AbstractASTNode;

public abstract class AbstractType extends AbstractASTNode implements Type {
  public AbstractType(int line, int column) {
    super(line, column);
  }
}
