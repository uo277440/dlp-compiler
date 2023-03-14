package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.program.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class RunIntrospector {

  public static void main(String... args) throws IOException {

    CharStream input = CharStreams.fromFileName("examples/basic.xana");
    XanaLexer lexer = new XanaLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);
    XanaParser parser = new XanaParser(tokens);

    Program ast = parser.program().ast;

    IntrospectorModel model = new IntrospectorModel("Program", ast);
    new IntrospectorTree("Introspector", model);
  }
}
