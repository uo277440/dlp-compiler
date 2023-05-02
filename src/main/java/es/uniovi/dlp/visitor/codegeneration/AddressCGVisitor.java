package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.FieldAccess;
import es.uniovi.dlp.ast.expression.Id;
import es.uniovi.dlp.ast.expression.Indexing;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.type.Int;
import es.uniovi.dlp.ast.type.Struct;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, FunctionDefinition>{
    public void setVv(ValueCGVisitor vv) {
        this.vv = vv;
    }
private CodeGenerator cg;
    private ValueCGVisitor vv;
    public AddressCGVisitor(CodeGenerator cg){
    this.cg=cg;
    }
    @Override
    public VoidType visit(Indexing i, FunctionDefinition param) {
        i.getName().accept(this, param);
        i.getIndex().accept(vv, null);
        cg.push(Int.getInstance(), i.getType().getNumberOfBytes());
        cg.mul(Int.getInstance());
        cg.add(Int.getInstance());

        return null;
    }

    @Override
    public VoidType visit(FieldAccess f, FunctionDefinition param) {
        f.getField().accept(this, param);
        var ff = ((Struct)(f.getField().getType())).getField(f.getAtributte());
        cg.push(Int.getInstance(),
                (ff.getOffset()));
        cg.add(Int.getInstance());
        return null;
    }

    @Override
    public VoidType visit(Id i, FunctionDefinition param) {
        if (i.getDefinition().getScope() == 0){
            cg.pusha(((VarDefinition)i.getDefinition()).getOffset());
        }else {
            cg.pushBP();
            cg.push(((VarDefinition)i.getDefinition()).getOffset());
            cg.add(Int.getInstance());
        }
        return null;
    }

}
