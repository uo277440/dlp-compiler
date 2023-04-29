package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Type, Type>{
    public void setVv(ValueCGVisitor vv) {
        this.vv = vv;
    }

    private ValueCGVisitor vv;
    public AddressCGVisitor(CodeGenerator cg){

    }
}
