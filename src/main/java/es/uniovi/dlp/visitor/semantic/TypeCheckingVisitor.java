package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.statement.Read;
import es.uniovi.dlp.ast.type.ErrorType;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.visitor.AbstractVisitor;
import es.uniovi.dlp.error.Error;

import java.lang.reflect.Field;

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
    @Override
    public VoidType visit(ArithmeticOperation a, Type parameters) {
        super.visit(a,parameters);
        var left=a.getLeftExpression().getType();
        var right=a.getRightExpression().getType();
        a.setType(left.arithmetic(right));
        if(a.getType()==null){
            a.setType(ErrorType.getInstance());
            ErrorManager.getInstance().addError(new Error(a.getLine(),a.getColumn(),ErrorReason.INVALID_ARITHMETIC));
        }
        return null;
    }
    @Override
    public VoidType visit(Cast c, Type parameters) {
        super.visit(c,parameters);
        var left = c.getLeft().getType();
        c.setType(left.casteable(c.getCastToType()));
        if(c.getType()==null){
            c.setType(ErrorType.getInstance());
            ErrorManager.getInstance().addError(new Error(c.getLine(),c.getColumn(),ErrorReason.INVALID_CAST));
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
        c.getLeftExpression().accept(this,parameters);
        c.getRightExpression().accept(this,parameters);
        c.setLvalue(false);
        return null;
    }
    @Override
    public VoidType visit(FieldAccess f, Type parameters) {
        super.visit(f,parameters);
        var exp = f.getField().getType();
        f.setType(exp.allowDot(f.getAtributte()));
        if(f.getType()==null){
            f.setType(ErrorType.getInstance());
            ErrorManager.getInstance().addError(new Error(f.getLine(),f.getColumn(),ErrorReason.NO_SUCH_FIELD));
        }
        f.setLvalue(true);
        return null;
    }
    @Override
    public VoidType visit(Id id, Type parameters) {
        id.setLvalue(true);
        id.setType(id.getDefinition().getType());
        return null;
    }
    @Override
    public VoidType visit(Indexing id, Type parameters) {
        super.visit(id,parameters);
        var exp = id.getIndex().getType();
       // id.setType(exp.squareBrackets(id.get));
        id.setLvalue(true);
        return null;
    }
    @Override
    public VoidType visit(IntLiteral il, Type parameters) {

        il.setLvalue(false);
        return null;
    }

    @Override
    public VoidType visit(LogicOperation lo, Type parameters) {
       super.visit(lo,parameters);
        lo.setLvalue(false);
        var left = lo.getLeftExpression().getType();
        var right = lo.getRightExpression().getType();
        lo.setType(left.logical(right));
        if(lo.getType()==null){
            lo.setType(ErrorType.getInstance());
            ErrorManager.getInstance().addError(new Error(lo.getLine(),lo.getColumn(),ErrorReason.INVALID_LOGICAL));
        }
        return null;
    }
    @Override
    public VoidType visit(Not n, Type parameters) {
        super.visit(n,parameters);
        var exp = n.getExpression().getType();
        if(exp.isLogical())
            n.setType(exp);
        else
            n.setType(null);
        if(n.getType()==null){
            n.setType(ErrorType.getInstance());
            ErrorManager.getInstance().addError(new Error(n.getLine(),n.getColumn(),ErrorReason.NOT_LOGICAL));
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
        super.visit(um,parameters);
       if(!um.getExpression().getType().isArithmetic()){
           um.setType(ErrorType.getInstance());
           ErrorManager.getInstance().addError(new Error(um.getLine(),um.getColumn(),ErrorReason.INVALID_ARITHMETIC));
       }

        return null;
    }

}

