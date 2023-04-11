package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.List;

public class Invocation extends AbstractExpression implements Statement {
  public List<Expression> getArguments() {
    return arguments;
  }

  public Id getName() {
    return name;
  }

  private List<Expression> arguments;
  Id name;

  public Definition getDefinition() {
    return definition;
  }

  public void setDefinition(Definition definition) {
    this.definition = definition;
  }

  Definition definition;

  public Invocation(int line, int column, List<Expression> args, Id left) {

    super(line, column);
    this.arguments = args;
    this.name = left;
    this.setLvalue(false);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }
}
