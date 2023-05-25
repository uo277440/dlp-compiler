package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.expression.Id;
import es.uniovi.dlp.ast.expression.Invocation;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.type.ErrorType;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Type, Type> {
  private SymbolTable st = new SymbolTable();

  @Override
  public VoidType visit(VarDefinition vd, Type param) {
    if (!st.insert(vd)) {
      ErrorManager.getInstance()
          .addError(new Error(vd.getLine(), vd.getColumn(), ErrorReason.VARIABLE_ALREADY_DECLARED));
    }
    // vd.getType().accept(this,param);
    super.visit(vd, param);
    return null;
  }

  @Override
  public VoidType visit(FunctionDefinition fd, Type param) {
    if (!st.insert(fd)) {
      ErrorManager.getInstance()
          .addError(new Error(fd.getLine(), fd.getColumn(), ErrorReason.FUNCTION_ALREADY_DECLARED));
    }
    st.set();
    super.visit(fd, param);
    // fd.getType().accept(this,param);
    // fd.getBodyDefs().forEach(index -> index.accept(this, param));
    // fd.getStatements().forEach(index -> index.accept(this, param));
    st.reset();
    return null;
  }

  @Override
  public Type visit(Invocation in, Type param) {
    var variable = in.getName();
    var definition = st.find(variable.getName());
    if (definition == null) {

      ErrorManager.getInstance()
          .addError(
              new Error(
                  variable.getLine(), variable.getColumn(), ErrorReason.FUNCTION_NOT_DECLARED));
      in.setDefinition(null);
      in.setType(ErrorType.getInstance());
      return null;
    }
    in.setDefinition(definition);
    /**
     * if (in.getDefinition() instanceof VarDefinition v) in.setType(v.getType()); else
     * in.setType(((FunctionType) (in.getDefinition().getType())).getReturnType());
     */
    return super.visit(in, param);
  }

  @Override
  public Type visit(Id id, Type param) {

    var variable = id.getName();

    if (st.find(variable) == null) {
      ErrorManager.getInstance()
          .addError(new Error(id.getLine(), id.getColumn(), ErrorReason.VARIABLE_NOT_DECLARED));
      id.setDefinition(null);
      id.setType(ErrorType.getInstance());
      return null;
    }
    id.setDefinition(st.find(variable));
    return null;
  }
}
