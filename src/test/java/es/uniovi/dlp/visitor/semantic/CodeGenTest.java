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
  @Test
  void codeIf() {
    runCompiler("examples/codegeneration/if.xana");
  }
  @Test
  void codeWhile() {
    runCompiler("examples/codegeneration/while.xana");
  }
  @Test
  void codeFieldAccess() {
    runCompiler("examples/codegeneration/field_access.xana");
  }
  @Test
  void codeIndexing() {
    runCompiler("examples/codegeneration/indexing.xana");
  }
  @Test
  void codeBigInput() {
    runCompiler("examples/codegeneration/complete/big_input.xana");
  }
  @Test
  void codeInput() {
    runCompiler("examples/codegeneration/complete/input.xana");
  }
}
