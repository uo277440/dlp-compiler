package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class FunctionType extends AbstractType {
  public List<VarDefinition> getParams() {
    return params;
  }

  public Type getReturnType() {
    return returnType;
  }

  int paramsSize;
  private List<VarDefinition> params;

  public void setReturnType(Type returnType) {
    this.returnType = returnType;
  }

  private Type returnType;

  public FunctionType(int line, int column, List<VarDefinition> varDefs, Type rt) {

    super(line, column);
    this.returnType = rt;
    this.params = varDefs;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public int getNumberOfBytes() {
    return returnType.getNumberOfBytes();
  }

  public int getParamsSize() {
    return paramsSize;
  }

  public void setParamsSize(int paramsSize) {
    this.paramsSize = paramsSize;
  }
}
