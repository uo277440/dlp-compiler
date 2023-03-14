package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class FunctionType extends AbstractType {
  private List<VarDefinition> params;
  private Type returnType;

  public FunctionType(int line, int column, List<VarDefinition> varDefs, Type rt) {

    super(line, column);
    this.returnType = rt;
    this.params = varDefs;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }
}
