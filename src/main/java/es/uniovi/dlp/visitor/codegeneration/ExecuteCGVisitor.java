package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.Invocation;
import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.type.FunctionType;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, FunctionDefinition> {
  public void setAddressV(AddressCGVisitor addressV) {
    this.addressV = addressV;
  }

  private AddressCGVisitor addressV;
  private ValueCGVisitor valueV;
  private CodeGenerator cg;

  public ExecuteCGVisitor(CodeGenerator cg) {
    this.cg = cg;
    addressV = new AddressCGVisitor(cg);
    valueV = new ValueCGVisitor(cg);
    addressV.setVv(valueV);
    valueV.setAddressCGVisitor(addressV);
  }

  @Override
  public VoidType visit(Assignment a, FunctionDefinition parameters) {
    /*          PLANTILLA
    execute[Assignment->expr1 expr2]
            address[expr1]
            value[expr2]
            store
     */
    a.getLeft().accept(addressV, null);
    a.getRight().accept(valueV, null);
    cg.cast(a.getRight().getType(),a.getLeft().getType());
    cg.store(a.getLeft().getType());

    return null;
  }

  @Override
  public VoidType visit(Write i, FunctionDefinition param) {
    /*          PLANTILLA
    execute[input-> expression]
            address[expression]
            in{ex.type}
            store{ex.type}
     */
    i.getBody().accept(valueV, null);
    cg.out(i.getBody().getType());
    return null;
  }

  @Override
  public VoidType visit(Read r, FunctionDefinition param) {
    /*          PLANTILLA
    execute[input-> expression]
            address[expression]
            in{ex.type}
            store{ex.type}
     */
    r.getToRead().accept(addressV, null);
    cg.in(r.getToRead().getType());
    cg.store(r.getToRead().getType());
    return null;
  }

  @Override
  public VoidType visit(While w, FunctionDefinition param) {
    int condition = cg.getLabel();
    int endLabel = cg.getLabel();
    cg.label(condition);
    w.getCondition().accept(valueV, null);
    cg.jz(endLabel);
    w.getBody().forEach(s -> s.accept(this, param));
    cg.jmp(condition);
    cg.label(endLabel);
    return null;
  }

  public VoidType visit(If i, FunctionDefinition param) {
    int elseBody = cg.getLabel();
    int endBody = cg.getLabel();
    i.getCondition().accept(valueV, null);
    cg.jz(elseBody);
    i.getBody().forEach(s -> s.accept(this, param));
    cg.jmp(endBody);
    cg.label(elseBody);
    i.getElseBody().forEach(s -> s.accept(this, param));
    cg.label(endBody);
    return null;
  }

  @Override
  public VoidType visit(Invocation i, FunctionDefinition param) {
    // i.accept(valueV, null);
    i.getArguments().forEach(arg -> arg.accept(valueV, null));
    cg.call(i.getName().getName());
    if (i.getType() instanceof VoidType) return null;
    cg.pop(i.getType());
    return null;
  }

  @Override
  public VoidType visit(Return r, FunctionDefinition param) {
    /*
    execute[return-> expression]
            valor[exp]
            ret
     */
    r.getExpression().accept(valueV, null);
    cg.ret(
        r.getExpression().getType().getNumberOfBytes(),
        -param.getLocalsSize(),
        ((FunctionType) param.getType()).getParamsSize());

    return null;
  }

  @Override
  public VoidType visit(FunctionDefinition f, FunctionDefinition parameters) {
    cg.nameFunc(f.getName());
    cg.enter(-f.getLocalsSize());
    // f.getType().accept(this, parameters);
    f.getStatements().forEach(s -> s.accept(this, f));
    if (((FunctionType) f.getType()).getReturnType() instanceof VoidType)
      cg.ret(0, -f.getLocalsSize(), ((FunctionType) f.getType()).getParamsSize());
    return null;
  }

  @Override
  public VoidType visit(Program p, FunctionDefinition param) {
    /*
    ejecuta[programa->definition*] =
                        call Main
                        halt
                        ejecuta[definition.]
     */
/**
    for (Definition d : p.getDefinitions()) {
      if (d instanceof VarDefinition) d.accept(this, param);
    }
 **/
    cg.call("main");
    cg.halt();
    for (Definition d : p.getDefinitions()) {
      if (d instanceof FunctionDefinition) d.accept(this, param);
    }
    return null;
  }
}
