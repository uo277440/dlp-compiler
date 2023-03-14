package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.program.VarDefinition;
import java.util.List;

public class FunctionType extends AbstractType {
  private List<VarDefinition> params;
  private Type returnType;

  public FunctionType(int line, int column, List<VarDefinition> varDefs, Type rt) {

    super(line, column);
    this.returnType = rt;
    this.params = varDefs;
  }
}
