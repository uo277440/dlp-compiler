package es.uniovi.dlp.visitor.semantic;

import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.error.Error;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Type> {
    @Override
    public VoidType visit(Assignment a, Type parameters) {
        a.getLeft().accept(this, parameters);
        a.getRight().accept(this, parameters);
        if(!a.getLeft().isLvalue())
            ErrorManager.getInstance().addError(new Error(a.getLeft().getLine() ,a.getLeft().getColumn(),
                    ErrorReason.LVALUE_REQUIRED));

        return null;
    }
    @Override
    public VoidType visit(Read r, Type parameters) {
        r.getToRead().accept(this, parameters);


        if(!r.getToRead().isLvalue())
            ErrorManager.getInstance().addError(new Error(r.getToRead().getLine() ,r.getToRead().getColumn(),
                    ErrorReason.LVALUE_REQUIRED));

        return null;
    }
}
