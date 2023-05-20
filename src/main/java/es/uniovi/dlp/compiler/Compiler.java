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

import java.io.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Compiler {
  private final String filename;
  private Program program;
  private boolean reportErrors = true;

  private OutputStreamWriter out;
  private boolean showDebug;

  public Compiler(String filename) throws FileNotFoundException, UnsupportedEncodingException {
    this.filename = filename;
    this.out=new OutputStreamWriter(new FileOutputStream("examples/codegeneration/pruebas.mp"),"utf-8");
  }

  public Compiler(String filename, OutputStreamWriter out) {
    this.filename = filename;
    this.out = out;
  }

  public void run() throws IOException {
    ErrorManager.getInstance().clearErrors();
    program = parse(filename);

    assignScope();
    assignType();

    checkErrors();
    assignOffsets();
    if(!ErrorManager.getInstance().hasErrors()) //no hará la generación de código si hay errores en las anteriores fases
    execute();
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

  private void execute() {
    ExecuteCGVisitor ev = new ExecuteCGVisitor(new CodeGenerator(showDebug, out, filename));
    ev.visit(program, null);
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
