package es.uniovi.dlp.visitor.codegeneration;

import es.uniovi.dlp.ast.expression.Id;
import es.uniovi.dlp.ast.program.FunctionDefinition;
import es.uniovi.dlp.ast.program.VarDefinition;
import es.uniovi.dlp.ast.type.FunctionType;
import es.uniovi.dlp.ast.type.Struct;
import es.uniovi.dlp.ast.type.StructField;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Integer, Integer> {
  private int size = 0;

  @Override
  public Integer visit(Id id, Integer param) {
    id.getDefinition().getType().accept(this, param);

    return null;
  }

  @Override
  public Integer visit(VarDefinition v, Integer param) {
    v.getType().accept(this, param);

    if (v.getScope() == 0) {
      v.setOffset(size);
      size += v.getType().getNumberOfBytes();
      return 0;
    } else if (v.getScope() == 1) {
      v.setOffset(-(param + v.getType().getNumberOfBytes()));
      return v.getType().getNumberOfBytes();
    }

    return -1;
  }

  @Override
  public Integer visit(FunctionDefinition f, Integer param) {
    f.getStatements().forEach(st -> st.accept(this, param));
    f.getType().accept(this, param);
    int localSize = 0;
    for (VarDefinition v : f.getBodyDefs()) {
      localSize += v.accept(this, localSize);
    }
    f.setLocalsSize(-localSize);

    return null;
  }

  @Override
  public Integer visit(FunctionType f, Integer param) {

    int acumulated = 4;
    for (int i = f.getParams().size() - 1; i >= 0; i--) {
      f.getParams().get(i).setOffset(acumulated);
      acumulated += f.getParams().get(i).getType().getNumberOfBytes();
    }

    f.setParamsSize(acumulated - 4);
    return null;
  }

  @Override
  public Integer visit(Struct r, Integer param) {
    int sizeS = 0;
    for (StructField field : r.getFields()) {
      sizeS += field.accept(this, sizeS);
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
