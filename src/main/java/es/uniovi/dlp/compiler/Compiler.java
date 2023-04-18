package es.uniovi.dlp.compiler;

import es.uniovi.dlp.ast.program.Program;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.parser.XanaLexer;
import es.uniovi.dlp.parser.XanaParser;
import es.uniovi.dlp.visitor.codegeneration.CodeGenerator;
import es.uniovi.dlp.visitor.codegeneration.ExecuteCGVisitor;
import es.uniovi.dlp.visitor.codegeneration.OffsetVisitor;
import es.uniovi.dlp.visitor.semantic.IdentificationVisitor;
import es.uniovi.dlp.visitor.semantic.TypeCheckingVisitor;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {
  private final String filename;
  private Program program;
  private boolean reportErrors = true;

  private OutputStreamWriter out;
  private boolean showDebug;



  public Compiler(String filename) {
    this.filename = filename;
  }
  public Compiler(String filename,OutputStreamWriter out) {
    this.filename = filename;
    this.out=out;
  }


  public void run() throws IOException {
    ErrorManager.getInstance().clearErrors();
    program = parse(filename);

    assignScope();
    assignType();

    checkErrors();
    assignOffsets();

    
  }

  private void assignOffsets() {
    OffsetVisitor ov = new OffsetVisitor();
    ov.visit(program, null);
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

  private void execute(){
    ExecuteCGVisitor ev = new ExecuteCGVisitor(new CodeGenerator(showDebug,out,filename));
  }

  private void assignScope() {
    // Run here your IdentificationVisitor
    IdentificationVisitor iv = new IdentificationVisitor();
    iv.visit(program, null);
  }

  public void setReportErrors(boolean reportErrors) {
    this.reportErrors = reportErrors;
  }

  public void setShowDebug(boolean showDebug) {
    this.showDebug = showDebug;
  }
}
