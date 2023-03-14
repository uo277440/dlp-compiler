package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {
  private final String filename;
  private Program program;
  private boolean reportErrors = true;

  public Compiler(String filename) {
    this.filename = filename;
  }

  public void run() throws IOException {
    ErrorManager.getInstance().clearErrors();
    program = parse(filename);
    assignType();
    checkErrors();
  }

  private void checkErrors() {
    if (!reportErrors) return;

    ErrorManager errorManager = ErrorManager.getInstance();
    if (errorManager.hasErrors()) {
      errorManager.getErrors().forEach(System.err::println);
      System.exit(-1);
    }
  }

  public Program getProgram() {
    return program;
  }

  private Program parse(String file) throws IOException {
    CharStream input = CharStreams.fromFileName(file);
    XanaLexer lexer = new XanaLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XanaParser parser = new XanaParser(tokens);

    return parser.program().ast;
  }

  private void assignType() {
    TypeCheckingVisitor typeCheckingVisitor = new TypeCheckingVisitor();
    typeCheckingVisitor.visit(program, null);
  }

  public void setReportErrors(boolean reportErrors) {
    this.reportErrors = reportErrors;
  }
}