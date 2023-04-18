package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Type, Type> {
    private final CodeGenerator cg;
    private final AddressCGVisitor addressCGVisitor;
    public ValueCGVisitor(CodeGenerator cg, AddressCGVisitor addressCGVisitor){

        this.cg = cg;
        this.addressCGVisitor=addressCGVisitor;
    }
}
