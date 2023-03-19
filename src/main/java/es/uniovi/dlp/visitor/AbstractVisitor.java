package es.uniovi.dlp.visitor;

import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;
import es.uniovi.dlp.ast.statement.Statement;

public abstract class AbstractVisitor<ReturnType, ParamType>
    implements Visitor<ReturnType, ParamType> {

  @Override
  public ReturnType visit(Program program, ParamType param) {
    program.getDefinitions().forEach(definition -> definition.accept(this, param));
    return null;
  }
  @Override
  public ReturnType visit(Read read, ParamType param) {
    read.getToRead().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(Assignment assignment, ParamType param) {
    assignment.getRight().accept(this,param);
    assignment.getLeft().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(ArithmeticOperation ao, ParamType param) {
    ao.getLeftExpression().accept(this,param);
    ao.getRightExpression().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(FunctionDefinition fd, ParamType param) {
    fd.getType().accept(this, param);
    fd.getBodyDefs().forEach(index -> index.accept(this, param));
    fd.getStatements().forEach(index -> index.accept(this, param));


    return null;

  }
  @Override
  public ReturnType visit(Cast cast, ParamType param) {
    cast.getLeft().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(CharConstant c, ParamType param) {

    return null;
  }
  @Override
  public ReturnType visit(ComparisonOperation co, ParamType param) {
    co.getLeftExpression().accept(this,param);
    co.getLeftExpression().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(FieldAccess fa, ParamType param) {
    fa.getField().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(Id id, ParamType param) {

    return null;
  }
  @Override
  public ReturnType visit(Indexing indexing, ParamType param) {
    indexing.getIndexes().forEach(index -> index.accept(this, param));
    return null;
  }
  @Override
  public ReturnType visit(Invocation invocation, ParamType param) {
   invocation.getArguments().forEach(argument -> argument.accept(this, param));
    return null;
  }
  @Override
  public ReturnType visit(IntLiteral il, ParamType param) {

    return null;
  }
  @Override
  public ReturnType visit(LogicOperation lo, ParamType param) {
    lo.getLeftExpression().accept(this,param);
    lo.getRightExpression().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(Not not, ParamType param) {
    not.getExpression().accept(this,param);
    return null;
  }
  @Override
  public ReturnType visit(RealConstant rc, ParamType param) {

    return null;
  }
  @Override
  public ReturnType visit(UnaryMinus um, ParamType param) {
    um.getExpression().accept(this,param);
    return null;
  }
}
