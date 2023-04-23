package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
    private final CodeGenerator cg;

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    private  AddressCGVisitor addressCGVisitor;
    public ValueCGVisitor(CodeGenerator cg){

        this.cg = cg;

    }
}
