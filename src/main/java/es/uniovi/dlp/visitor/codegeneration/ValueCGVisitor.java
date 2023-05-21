package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
  private final CodeGenerator cg;

  public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
    this.addressCGVisitor = addressCGVisitor;
  }

  private AddressCGVisitor addressCGVisitor;

  public ValueCGVisitor(CodeGenerator cg) {

    this.cg = cg;
  }

  @Override
  public VoidType visit(Not n, Type param) {

    n.getExpression().accept(this, param);
    cg.not();
    return null;
  }

  @Override
  public VoidType visit(UnaryMinus n, Type param) {
    n.getExpression().accept(this, param);
    cg.sub(n.getType());
    return null;
  }

  @Override
  public VoidType visit(Id i, Type param) {
    i.accept(addressCGVisitor, null);
    cg.load(i.getType());
    return null;
  }

  @Override
  public VoidType visit(LogicOperation l, Type param) {
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
  public VoidType visit(Invocation i, Type param) {
    i.getArguments().forEach(a -> a.accept(this, param));
    cg.call(i.getName().getName());
    return null;
  }

  @Override
  public VoidType visit(ComparisonOperation c, Type param) {
    c.getLeftExpression().accept(this, param);
    c.getRightExpression().accept(this, param);

    switch (c.getOp()) {
      case ">":
        cg.gt(c.getType());
        break;
      case "<":
        cg.lt(c.getType());
        break;
      case "<=":
        cg.le(c.getType());
        break;
      case "==":
        cg.eq(c.getType());
        break;
      case ">=":
        cg.ge(c.getType());
        break;
      case "!=":
        cg.ne(c.getType());
        break;
      default:
        throw new IllegalStateException("El operando es incorrecto");
    }

    return null;
  }

  @Override
  public VoidType visit(CharConstant c, Type param) {
    cg.push(c.getType(), c.getValue());
    return null;
  }

  @Override
  public VoidType visit(IntLiteral i, Type param) {
    cg.push(i.getType(), i.getValue());
    return null;
  }

  @Override
  public VoidType visit(RealConstant r, Type param) {
    cg.push(r.getType(), r.getValue());
    return null;
  }

  @Override
  public VoidType visit(FieldAccess f, Type param) {
    f.accept(addressCGVisitor, null);
    cg.load(f.getType());
    return null;
  }

  @Override
  public VoidType visit(Cast c, Type param) {
    c.getLeft().accept(this, param);
    cg.cast(c.getLeft().getType(), c.getCastToType());
    return null;
  }

  @Override
  public VoidType visit(ArithmeticOperation a, Type param) {
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
  public VoidType visit(Indexing i,Type param){
    i.accept(addressCGVisitor,null);
    cg.load(i.getType());
    return null;
  }
}

