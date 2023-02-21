package es.uniovi.dlp.parser;

public class LexerHelper {
  public static int lexemeToInt(String lexeme) {
    try {
      return Integer.parseInt(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }

  public static char lexemeToChar(String lexeme) {

    if (lexeme.toCharArray()[1] == '\\' && lexeme.toCharArray()[2] == 'n') return '\n';
    else if (lexeme.toCharArray()[1] == '\\' && lexeme.toCharArray()[2] == 't') return '\t';
    else if (lexeme.toCharArray()[1] != '\\') return lexeme.toCharArray()[1];
    // falta para el ASCII
    return (char) ('\\' + (char) Integer.parseInt(lexeme.substring(2, lexeme.length() - 2)));
  }

  public static double lexemeToReal(String lexeme) {
    try {
      return Double.parseDouble(lexeme);
    } catch (NumberFormatException e) {
      e.printStackTrace();
    }
    return -1;
  }
}
