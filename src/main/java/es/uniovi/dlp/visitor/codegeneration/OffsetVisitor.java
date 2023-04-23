package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.IntLiteral;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.statement.Statement;
import es.uniovi.dlp.ast.type.FunctionType;
import es.uniovi.dlp.ast.type.Struct;
import es.uniovi.dlp.ast.type.StructField;
import es.uniovi.dlp.ast.type.Type;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Integer, Integer> {
    private int size = 0;

    @Override
    public Integer visit(VarDefinition v, Integer param) {
        super.visit(v,param);

        if(v.getScope() == 0){
            v.setOffset(size);
            size+=v.getType().getNumberOfBytes();
            return -1;
        }else if(v.getScope() == 1){
            v.setOffset(-(param + v.getType().getNumberOfBytes()));
            return v.getType().getNumberOfBytes();
        }


        return -1;
    }
    @Override
    public Integer visit(FunctionDefinition f, Integer param) {
        f.getType().accept(this, param);
        int localSize = 0;
        for(VarDefinition v:f.getBodyDefs()){
                localSize += v.accept(this, localSize);
        }
        f.setLocalsSize(-localSize);

        return null;
    }
    @Override
    public Integer visit(FunctionType f, Integer param) {

        int offset=4;
        for(VarDefinition v:f.getParams()){
            v.setOffset(offset);
            offset+=v.getType().getNumberOfBytes();
        }
        return null;
    }

    @Override
    public Integer visit(Struct r, Integer param) {
        int sizeS = 0;
        for(StructField field: r.getFields()){
            sizeS+=field.accept(this, sizeS);
        }
        return -1;
    }
    @Override
    public Integer visit(StructField r, Integer param) {
        r.getType().accept(this, param);
        r.setOffset(param);
        return r.getType().getNumberOfBytes();
    }
}