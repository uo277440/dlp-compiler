package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.type.FunctionType;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, FunctionDefinition> {
  private final CodeGenerator cg;

  public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
    this.addressCGVisitor = addressCGVisitor;
  }

  private AddressCGVisitor addressCGVisitor;

  public ValueCGVisitor(CodeGenerator cg) {

    this.cg = cg;
  }

  @Override
  public VoidType visit(Not n, FunctionDefinition param) {

    n.getExpression().accept(this, param);
    cg.not();
    return null;
  }

  @Override
  public VoidType visit(UnaryMinus n, FunctionDefinition param) {
    cg.push(n.getType(),0);
    n.getExpression().accept(this, param);
    cg.sub(n.getType());
    return null;
  }

  @Override
  public VoidType visit(Id i, FunctionDefinition param) {
    i.accept(addressCGVisitor, null);
    cg.load(i.getType());
    return null;
  }

  @Override
  public VoidType visit(LogicOperation l, FunctionDefinition param) {
    l.getLeftExpression().accept(this, param);
    l.getRightExpression().accept(this, param);
    switch (l.getOp()) {
      case "||":
        cg.or();
        break;
      case "&&":
        cg.and();
        break;
      default:
        throw new IllegalStateException("El operando es incorrecto");
    }
    return null;
  }

  @Override
  public VoidType visit(Invocation i, FunctionDefinition param) {
    //i.getArguments().forEach(a -> a.accept(this, param));
    for(int j=0;j<i.getArguments().size();j++){
      i.getArguments().get(j).accept(this,null);
      cg.cast(i.getArguments().get(j).getType(),((FunctionType)i.getName().getDefinition().getType()).getParams().get(j).getType());
    }
    cg.call(i.getName().getName());
    return null;
  }

  @Override
  public VoidType visit(ComparisonOperation c, FunctionDefinition param) {
    c.getLeftExpression().accept(this, param);
    cg.cast(c.getLeftExpression().getType(),c.getCastTo());
    c.getRightExpression().accept(this, param);
    cg.cast(c.getRightExpression().getType(),c.getCastTo());
    switch (c.getOp()) {
      case ">":
        cg.gt(c.getCastTo());
        break;
      case "<":
        cg.lt(c.getCastTo());
        break;
      case "<=":
        cg.le(c.getCastTo());
        break;
      case "==":
        cg.eq(c.getCastTo());
        break;
      case ">=":
        cg.ge(c.getCastTo());
        break;
      case "!=":
        cg.ne(c.getCastTo());
        break;
      default:
        throw new IllegalStateException("El operando es incorrecto");
    }

    return null;
  }

  @Override
  public VoidType visit(CharConstant c, FunctionDefinition param) {
    cg.push(c.getType(), c.getValue());
    return null;
  }

  @Override
  public VoidType visit(IntLiteral i, FunctionDefinition param) {
    cg.push(i.getType(), i.getValue());
    return null;
  }

  @Override
  public VoidType visit(RealConstant r, FunctionDefinition param) {
    cg.push(r.getType(), r.getValue());
    return null;
  }

  @Override
  public VoidType visit(FieldAccess f, FunctionDefinition param) {
    f.accept(addressCGVisitor, null);
    cg.load(f.getType());
    return null;
  }

  @Override
  public VoidType visit(Cast c, FunctionDefinition param) {
    c.getLeft().accept(this, param);
    cg.cast(c.getLeft().getType(), c.getCastToType());
    return null;
  }

  @Override
  public VoidType visit(ArithmeticOperation a, FunctionDefinition param) {
    a.getLeftExpression().accept(this, param);
    cg.cast(a.getLeftExpression().getType(), a.getType());
    a.getRightExpression().accept(this, param);
    cg.cast(a.getRightExpression().getType(), a.getType());
    switch (a.getOp()) {
      case "+":
        cg.add(a.getType());
        break;
      case "-":
        cg.sub(a.getType());
        break;
      case "*":
        cg.mul(a.getType());
        break;
      case "/":
        cg.div(a.getType());
        break;
      case "%":
        cg.mod(a.getType());
        break;
      default:
        throw new IllegalStateException("operador no válido");
    }
    return null;
  }

  @Override
  public VoidType visit(Indexing i, FunctionDefinition param) {
    i.accept(addressCGVisitor, null);
    cg.load(i.getType());
    return null;
  }
}
