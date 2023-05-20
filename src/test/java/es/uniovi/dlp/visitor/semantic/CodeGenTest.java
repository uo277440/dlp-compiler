package es.uniovi.dlp.visitor.semantic;

import static es.uniovi.dlp.TestHelpers.assertFoundErrors;
import static es.uniovi.dlp.TestHelpers.runCompiler;

import es.uniovi.dlp.error.Error;
import es.uniovi.dlp.error.ErrorManager;
import es.uniovi.dlp.error.ErrorReason;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class CodeGenTest {

  @Test
  void codeSimple() {
    runCompiler("examples/codegeneration/simple.xana");
    }
}
