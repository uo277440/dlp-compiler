package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.statement.Assignment;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.ast.type.VoidType;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Type, Type> {
    public void setAddressV(AddressCGVisitor addressV) {
        this.addressV = addressV;
    }

    private AddressCGVisitor addressV;
    private ValueCGVisitor valueV;
    private CodeGenerator codeGenerator;
    public ExecuteCGVisitor(CodeGenerator cg){
        this.codeGenerator = cg;
        addressV =new AddressCGVisitor(cg);
        valueV = new ValueCGVisitor(cg);
        addressV.setVv(valueV);
        valueV.setAddressCGVisitor(addressV);

    }
    @Override
    public VoidType visit(Assignment a, Type parameters) {
        /*
        ejecuta[Assigment->expr1 expr2]
                address[expr1]
                value[expr2]
                store
         */
        a.getLeft().accept(addressV, null);
        a.getRight().accept(valueV, null);
        codeGenerator.store(a.getRight().getType());

        return null;
    }
}
