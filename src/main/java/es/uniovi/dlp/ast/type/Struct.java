package es.uniovi.dlp.ast.type;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import es.uniovi.dlp.error.Location;
import es.uniovi.dlp.visitor.AbstractVisitor;
import java.util.ArrayList;
import java.util.List;

public class Struct extends AbstractType {
  public List<StructField> getFields() {
    return fields;
  }

  private List<StructField> fields;

  public Struct(int line, int column, List<StructField> fields) {
    super(line, column);
    checkRepeated(fields);
    this.fields = fields;
  }

  public void checkRepeated(List<StructField> fields) {
    List<String> names = new ArrayList<>();
    for (var field : fields) {
      if (names.contains(field.getName()))
        ErrorManager.getInstance()
            .addError(
                new Error(
                    new Location(field.getLine(), field.getColumn()),
                    ErrorReason.FIELD_ALREADY_DECLARED));
      names.add(field.getName());
    }
  }

  @Override
  public Type allowDot(String name) {
    for (var field : fields) {
      if (field.getName().equals(name)) return field.getType();
    }

    return null;
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return visitor.visit(this, param);
  }

  @Override
  public boolean dot() {
    return true;
  }

  @Override
  public int getNumberOfBytes() {
    int number = 0;
    for (StructField s : fields) {
      number += s.getType().getNumberOfBytes();
    }
    return number;
  }

  public StructField getField(String atributte) {
    for (StructField s : fields) if (atributte.equals(s.getName())) return s;
    return null;
  }
}
