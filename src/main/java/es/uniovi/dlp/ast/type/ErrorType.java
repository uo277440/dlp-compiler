package es.uniovi.dlp.ast.type;

import com.sun.jdi.request.InvalidRequestStateException;
import es.uniovi.dlp.visitor.AbstractVisitor;

public class ErrorType extends AbstractType {
  private static ErrorType instance = new ErrorType(0, 0);

  public ErrorType(int line, int column) {
    super(line, column);
  }

  @Override
  public <ReturnType, ParamType> ReturnType accept(
      AbstractVisitor<ReturnType, ParamType> visitor, ParamType param) {
    return null;
  }

  @Override
  public boolean isArithmetic() {
    return false;
  }

  public static ErrorType getInstance() {
    return instance;
  }
  @Override
  public int getNumberOfBytes() {
    throw new InvalidRequestStateException("El error no tiene tamaño asignado");
  }
}
