package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.type.*;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {

  @Override
  public VoidType visit(Assignment a, Type parameters) {
    super.visit(a, parameters);
    if (isErrorType(a.getLeft().getType()) || isErrorType(a.getRight().getType())) {
      return null;
    }
    if (!a.getLeft().isLvalue()) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  a.getLeft().getLine(), a.getLeft().getColumn(), ErrorReason.LVALUE_REQUIRED));
    }
    if (a.getLeft().getType().asignable(a.getRight().getType()) == null) {
      ErrorManager.getInstance()
          .addError(new Error(a.getLine(), a.getColumn(), ErrorReason.INCOMPATIBLE_TYPES));
    }

    return null;
  }

  @Override
  public VoidType visit(Read r, Type parameters) {
    r.getToRead().accept(this, parameters);
    if (!r.getToRead().isLvalue())
      ErrorManager.getInstance()
          .addError(
              new Error(
                  r.getToRead().getLine(), r.getToRead().getColumn(), ErrorReason.LVALUE_REQUIRED));

    return null;
  }

  @Override
  public VoidType visit(If i, Type parameters) {
    super.visit(i, parameters);
    if (i.getCondition().getType().logical() == null) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  i.getCondition().getLine(),
                  i.getCondition().getColumn(),
                  ErrorReason.NOT_LOGICAL));
    }
    return null;
  }

  @Override
  public VoidType visit(While w, Type parameters) {
    super.visit(w, parameters);

    if (w.getCondition().getType().logical() == null) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  w.getCondition().getLine(),
                  w.getCondition().getColumn(),
                  ErrorReason.NOT_LOGICAL));
    }
    return null;
  }

  @Override
  public VoidType visit(Invocation i, Type parameters) {
    super.visit(i, parameters);
    if (i.getDefinition() instanceof VarDefinition) {
      ErrorManager.getInstance()
          .addError(new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_INVOCATION));
      return null;
    }

    if (isErrorType(i.getName().getType())) {
      i.setType(ErrorType.getInstance());
      return null;
    }

    if (i.getArguments().size() != ((FunctionType) i.getName().getType()).getParams().size()) {
      ErrorManager.getInstance()
          .addError(new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_ARGS));
      return null;
    }
    for (int z = 0; z < i.getArguments().size(); z++) {
      if (i.getArguments()
              .get(z)
              .getType()
              .promotesTo(((FunctionType) i.getName().getType()).getParams().get(z).getType())
          == null) {
        ErrorManager.getInstance()
            .addError(new Error(i.getLine(), i.getColumn(), ErrorReason.INVALID_ARGS));
        return null;
      }
    }
    i.setType(((FunctionType) (i.getDefinition().getType())).getReturnType());
    return null;
  }

  @Override
  public VoidType visit(ArithmeticOperation a, Type parameters) {
    super.visit(a, parameters);
    var left = a.getLeftExpression().getType();
    var right = a.getRightExpression().getType();
    a.setType(left.arithmetic(right));
    if (a.getType() == null) {
      a.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(a.getLine(), a.getColumn(), ErrorReason.INVALID_ARITHMETIC));
    }
    return null;
  }

  @Override
  public VoidType visit(Cast c, Type parameters) {
    super.visit(c, parameters);
    var left = c.getLeft().getType();
    left.casteable(c.getCastToType());
    c.setType(left.casteable(c.getCastToType()));
    if (c.getType() == null) {
      c.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(c.getLine(), c.getColumn(), ErrorReason.INVALID_CAST));
    }
    return null;
  }

  @Override
  public VoidType visit(CharConstant c, Type parameters) {
    c.setLvalue(false);

    return null;
  }

  @Override
  public VoidType visit(ComparisonOperation c, Type parameters) {
    super.visit(c, parameters);
    var left = c.getLeftExpression().getType();
    var right = c.getRightExpression().getType();
    c.setType(left.comparisson(right));
    if(left instanceof DoubleType || right instanceof DoubleType){
      c.setCastTo(DoubleType.getInstance());
    }else{
      c.setCastTo(Int.getInstance());
    }

    if (c.getType() == null) {
      c.setType(new ErrorType(0, 0));
      ErrorManager.getInstance()
          .addError(new Error(c.getLine(), c.getColumn(), ErrorReason.INVALID_COMPARISON));
    }
    c.setLvalue(false);
    return null;
  }

  @Override
  public VoidType visit(FieldAccess f, Type parameters) {
    super.visit(f, parameters);
    var exp = f.getField().getType();
    f.setLvalue(true);
    if (!exp.dot()) {
      f.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(f.getLine(), f.getColumn(), ErrorReason.INVALID_DOT));
      return null;
    }
    f.setType(exp.allowDot(f.getAtributte()));
    if (f.getType() == null) {
      f.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(f.getLine(), f.getColumn(), ErrorReason.NO_SUCH_FIELD));
    }

    return null;
  }

  @Override
  public VoidType visit(Id id, Type parameters) {
    id.setLvalue(true);
    var definition = id.getDefinition();
    if (definition == null) {
      id.setType(ErrorType.getInstance());
    } else {
      id.setType(definition.getType());
    }

    super.visit(id, parameters);
    return null;
  }

  @Override
  public VoidType visit(Indexing id, Type parameters) {
    super.visit(id, parameters);
    var exp = id.getIndex().getType();
    var array = id.getName().getType();
    if (!(array instanceof Array)) {
      id.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(id.getLine(), id.getColumn(), ErrorReason.INVALID_INDEXING));
      return null;
    }
    id.setType(array.squareBrackets(exp));
    if (id.getType() == null) {
      id.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  id.getIndex().getLine(),
                  id.getIndex().getColumn(),
                  ErrorReason.INVALID_INDEX_EXPRESSION));
    }
    return null;
  }

  @Override
  public VoidType visit(IntLiteral il, Type parameters) {

    il.setLvalue(false);
    return null;
  }

  @Override
  public VoidType visit(LogicOperation lo, Type parameters) {
    super.visit(lo, parameters);
    lo.setLvalue(false);
    var left = lo.getLeftExpression().getType();
    var right = lo.getRightExpression().getType();
    lo.setType(left.logical(right));
    if (lo.getType() == null) {
      lo.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(new Error(lo.getLine(), lo.getColumn(), ErrorReason.INVALID_LOGICAL));
    }
    return null;
  }

  @Override
  public VoidType visit(Not n, Type parameters) {
    super.visit(n, parameters);
    var exp = n.getExpression().getType();
    if (exp.isLogical()) n.setType(exp);
    else n.setType(null);
    if (n.getType() == null) {
      n.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  n.getExpression().getLine(),
                  n.getExpression().getColumn(),
                  ErrorReason.NOT_LOGICAL));
    }

    n.setLvalue(false);
    return null;
  }

  @Override
  public VoidType visit(RealConstant rc, Type parameters) {
    rc.setLvalue(false);
    return null;
  }

  @Override
  public VoidType visit(UnaryMinus um, Type parameters) {
    super.visit(um, parameters);
    if (!um.getExpression().getType().isArithmetic()) {
      um.setType(ErrorType.getInstance());
      ErrorManager.getInstance()
          .addError(
              new Error(
                  um.getExpression().getLine(),
                  um.getExpression().getColumn(),
                  ErrorReason.INVALID_ARITHMETIC));
    }
    um.setType(um.getExpression().getType());
    return null;
  }

  @Override
  public VoidType visit(FunctionDefinition fd, Type param) {
    fd.getType().accept(this, param);
    fd.getBodyDefs().forEach(index -> index.accept(this, param));
    fd.getStatements()
        .forEach(index -> index.accept(this, ((FunctionType) fd.getType()).getReturnType()));

    return null;
  }

  @Override
  public VoidType visit(Return rt, Type param) {
    rt.getExpression().accept(this, param);
    if (rt.getExpression().getType().getClass() != (param.getClass())) {
      ErrorManager.getInstance()
          .addError(
              new Error(
                  rt.getExpression().getLine(),
                  rt.getExpression().getColumn(),
                  ErrorReason.INVALID_RETURN_TYPE));
    }
    return null;
  }

  private boolean isErrorType(Type t) {
    return t instanceof ErrorType;
  }
}
