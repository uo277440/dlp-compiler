package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.expression.Invocation;
import es.uniovi.dlp.ast.program.Definition;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.type.FunctionType;
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
        if(!st.insert(vd)){
            ErrorManager.getInstance().addError(new Error(vd.getLine(),vd.getColumn(), ErrorReason.VARIABLE_ALREADY_DECLARED));
        }
        vd.getType().accept(this,param);
        return null;

    }

    @Override
    public VoidType visit(FunctionDefinition fd, Type param) {
        if(!st.insert(fd)){
            ErrorManager.getInstance().addError(new Error(fd.getLine(),fd.getColumn(), ErrorReason.FUNCTION_ALREADY_DECLARED));
        }
        st.set();
        fd.getType().accept(this,param);
        fd.getBodyDefs().forEach(index -> index.accept(this, param));
        fd.getStatements().forEach(index -> index.accept(this, param));
        st.reset();
        return null;

    }
    @Override
    public VoidType visit(Invocation fd, Type param) {

        return null;

    }


}
