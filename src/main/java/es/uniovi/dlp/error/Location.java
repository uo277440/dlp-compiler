package es.uniovi.dlp.error;

public record Location(int line, int column) implements Comparable<Location> {
  @Override
  public int compareTo(Location location) {

    if (this.line < location.line) {
      return -1;
    }
    if (this.line > location.line) {
      return 1;
    }
    if (this.line == location.line) {
      if (this.column < location.column) {
        return -1;
      }
      return 1;
    }
    return 0;
  }

  @Override
  public String toString() {
    return "line: " + line + ", column: " + column;
  }
}
