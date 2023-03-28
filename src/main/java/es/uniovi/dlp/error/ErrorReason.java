package es.uniovi.dlp.error;

public enum ErrorReason {
  FIELD_ALREADY_DECLARED("Field already declared in struct"),

  LVALUE_REQUIRED("Lvalue is required"),
  FUNCTION_ALREADY_DECLARED("Function already declared"),

  VARIABLE_ALREADY_DECLARED("Variable already declared"), VARIABLE_NOT_DECLARED("Variable not declared"), FUNCTION_NOT_DECLARED("Function not declared"), INVALID_INDEX_EXPRESSION("Index not valid, invalid expression"), INVALID_INDEXING("invalid indexing"), INVALID_CAST("invalid cast"), INVALID_ARITHMETIC("invalid arithmetic operation"), NOT_LOGICAL("not logical"), INVALID_LOGICAL("invalid logical"), INVALID_COMPARISON("invalid comparisson"), NO_SUCH_FIELD("no such field"), INVALID_DOT("invalid dot"), INCOMPATIBLE_TYPES("incompatible types"), INVALID_RETURN_TYPE("invalid return type"), INVALID_ARGS("invalid args"), INVALID_INVOCATION("invalid invocation");


  private final String message;

  ErrorReason(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}
