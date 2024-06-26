package es.uniovi.dlp.error;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ErrorManager {
  private static final ErrorManager instance = new ErrorManager();

  private final List<Error> errors = new ArrayList<>();

  private ErrorManager() {}

  public static ErrorManager getInstance() {
    return instance;
  }

  public void clearErrors() {
    errors.clear();
  }

  public List<Error> getErrors() {

    return new ArrayList<>(this.errors)
        .stream().sorted(Comparator.comparing(e -> e.location())).toList();
  }

  public boolean hasErrors() {
    return !(errors.isEmpty());
  }

  public void addError(Error e) {
    errors.add(e);
  }
}
