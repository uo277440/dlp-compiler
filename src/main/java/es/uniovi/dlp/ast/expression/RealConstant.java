package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.DoubleType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class RealConstant extends AbstractExpression {
  double value;

  public RealConstant(int line, int column, double value) {
    super(line, column);
    this.value = value;
    this.setLvalue(false);
    this.setType(DoubleType.getInstance());
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this,param);
  }


}
