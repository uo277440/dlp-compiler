package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  public List<Expression> getArguments() {
    return arguments;
  }

  public Expression getName() {
    return name;
  }

  private List<Expression> arguments;
  Expression name;

  public Invocation(int line, int column, List<Expression> args, Expression left) {

    super(line, column);
    this.arguments = args;
    this.name = left;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this,param);
  }


}
