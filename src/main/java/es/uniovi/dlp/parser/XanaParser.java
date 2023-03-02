// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.program.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.type.*;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int T__0 = 1,
      T__1 = 2,
      T__2 = 3,
      T__3 = 4,
      T__4 = 5,
      T__5 = 6,
      T__6 = 7,
      T__7 = 8,
      T__8 = 9,
      T__9 = 10,
      T__10 = 11,
      T__11 = 12,
      T__12 = 13,
      T__13 = 14,
      T__14 = 15,
      T__15 = 16,
      T__16 = 17,
      T__17 = 18,
      T__18 = 19,
      T__19 = 20,
      T__20 = 21,
      T__21 = 22,
      T__22 = 23,
      T__23 = 24,
      T__24 = 25,
      T__25 = 26,
      PUTS = 27,
      IN = 28,
      IF = 29,
      WHILE = 30,
      RETURN = 31,
      MAIN = 32,
      DEF = 33,
      DO = 34,
      END = 35,
      CHAR = 36,
      DOUBLE = 37,
      INT = 38,
      DEFSTRUCT = 39,
      INT_CONSTANT = 40,
      ONE_COMMENT = 41,
      WS = 42,
      CHAR_CONSTANT = 43,
      MANTISA = 44,
      CHARACTER = 45,
      REAL_CONSTANT = 46,
      MULTI_COMMENT = 47,
      ID = 48;
  public static final int RULE_program = 0,
      RULE_expression = 1,
      RULE_main_func = 2,
      RULE_var_definition = 3,
      RULE_type = 4,
      RULE_func_definition = 5,
      RULE_func_body = 6,
      RULE_simple_type = 7,
      RULE_complex_type = 8,
      RULE_struct = 9,
      RULE_assignation = 10,
      RULE_write = 11,
      RULE_read = 12,
      RULE_statement = 13,
      RULE_ifStatement = 14,
      RULE_whileStatement = 15,
      RULE_returnStatement = 16,
      RULE_invocation = 17,
      RULE_array = 18;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "expression",
      "main_func",
      "var_definition",
      "type",
      "func_definition",
      "func_body",
      "simple_type",
      "complex_type",
      "struct",
      "assignation",
      "write",
      "read",
      "statement",
      "ifStatement",
      "whileStatement",
      "returnStatement",
      "invocation",
      "array"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "'['",
      "']'",
      "'as'",
      "'!'",
      "'('",
      "')'",
      "'>'",
      "'<'",
      "'!='",
      "'=='",
      "'<='",
      "'>='",
      "'&&'",
      "'||'",
      "'+'",
      "'-'",
      "'/'",
      "'*'",
      "'^'",
      "'%'",
      "'.'",
      "','",
      "'::'",
      "'void'",
      "'='",
      "'else'",
      "'puts'",
      "'in'",
      "'if'",
      "'while'",
      "'return'",
      "'main'",
      "'def'",
      "'do'",
      "'end'",
      "'char'",
      "'double'",
      "'int'",
      "'defstruct'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "PUTS",
      "IN",
      "IF",
      "WHILE",
      "RETURN",
      "MAIN",
      "DEF",
      "DO",
      "END",
      "CHAR",
      "DOUBLE",
      "INT",
      "DEFSTRUCT",
      "INT_CONSTANT",
      "ONE_COMMENT",
      "WS",
      "CHAR_CONSTANT",
      "MANTISA",
      "CHARACTER",
      "REAL_CONSTANT",
      "MULTI_COMMENT",
      "ID"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "java-escape";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public XanaParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgramContext extends ParserRuleContext {
    public Program ast;
    public Var_definitionContext var_definition;
    public List<Var_definitionContext> varDefs = new ArrayList<Var_definitionContext>();
    public Func_definitionContext func_definition;
    public List<Func_definitionContext> funcDefs = new ArrayList<Func_definitionContext>();
    public Main_funcContext main_func;

    public Main_funcContext main_func() {
      return getRuleContext(Main_funcContext.class, 0);
    }

    public List<Var_definitionContext> var_definition() {
      return getRuleContexts(Var_definitionContext.class);
    }

    public Var_definitionContext var_definition(int i) {
      return getRuleContext(Var_definitionContext.class, i);
    }

    public List<Func_definitionContext> func_definition() {
      return getRuleContexts(Func_definitionContext.class);
    }

    public Func_definitionContext func_definition(int i) {
      return getRuleContext(Func_definitionContext.class, i);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(42);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              setState(40);
              _errHandler.sync(this);
              switch (_input.LA(1)) {
                case ID:
                  {
                    setState(38);
                    ((ProgramContext) _localctx).var_definition = var_definition();
                    ((ProgramContext) _localctx)
                        .varDefs.add(((ProgramContext) _localctx).var_definition);
                  }
                  break;
                case DEF:
                  {
                    setState(39);
                    ((ProgramContext) _localctx).func_definition = func_definition();
                    ((ProgramContext) _localctx)
                        .funcDefs.add(((ProgramContext) _localctx).func_definition);
                  }
                  break;
                default:
                  throw new NoViableAltException(this);
              }
            }
          }
          setState(44);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
        }
        setState(45);
        ((ProgramContext) _localctx).main_func = main_func();

        var defs = new ArrayList<Definition>();
        for (var varDefs : ((ProgramContext) _localctx).varDefs) {
          defs.addAll(varDefs.ast);
        }
        for (var funcDef : ((ProgramContext) _localctx).funcDefs) {
          defs.add(funcDef.ast);
        }
        defs.add(((ProgramContext) _localctx).main_func.ast);
        ((ProgramContext) _localctx).ast =
            new Program(
                _localctx.start.getLine(), _localctx.start.getCharPositionInLine() + 1, defs);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionContext extends ParserRuleContext {
    public Expression ast;
    public Token INT_CONSTANT;
    public Token ID;
    public Token REAL_CONSTANT;
    public InvocationContext invocation;

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TerminalNode REAL_CONSTANT() {
      return getToken(XanaParser.REAL_CONSTANT, 0);
    }

    public InvocationContext invocation() {
      return getRuleContext(InvocationContext.class, 0);
    }

    public TerminalNode CHAR_CONSTANT() {
      return getToken(XanaParser.CHAR_CONSTANT, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    return expression(0);
  }

  private ExpressionContext expression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
    ExpressionContext _prevctx = _localctx;
    int _startState = 2;
    enterRecursionRule(_localctx, 2, RULE_expression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(67);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
          case 1:
            {
              setState(49);
              ((ExpressionContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new IntLiteral(
                      ((ExpressionContext) _localctx).INT_CONSTANT.getLine(),
                      ((ExpressionContext) _localctx).INT_CONSTANT.getCharPositionInLine() + 1);
            }
            break;
          case 2:
            {
              setState(51);
              ((ExpressionContext) _localctx).ID = match(ID);
              ((ExpressionContext) _localctx).ast =
                  new Id(
                      ((ExpressionContext) _localctx).ID.getLine(),
                      ((ExpressionContext) _localctx).ID.getCharPositionInLine() + 1);
            }
            break;
          case 3:
            {
              setState(53);
              ((ExpressionContext) _localctx).REAL_CONSTANT = match(REAL_CONSTANT);
              ((ExpressionContext) _localctx).ast =
                  new RealConstant(
                      ((ExpressionContext) _localctx).REAL_CONSTANT.getLine(),
                      ((ExpressionContext) _localctx).REAL_CONSTANT.getCharPositionInLine() + 1);
            }
            break;
          case 4:
            {
              setState(55);
              ((ExpressionContext) _localctx).invocation = invocation();
              ((ExpressionContext) _localctx).ast = ((ExpressionContext) _localctx).invocation.ast;
            }
            break;
          case 5:
            {
              setState(58);
              match(CHAR_CONSTANT);
            }
            break;
          case 6:
            {
              setState(59);
              match(T__3);
              setState(60);
              expression(6);
            }
            break;
          case 7:
            {
              setState(61);
              match(T__4);
              setState(62);
              expression(0);
              setState(63);
              match(T__5);
            }
            break;
          case 8:
            {
              setState(65);
              match(T__15);
              setState(66);
              expression(1);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(95);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(93);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                case 1:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(69);
                    if (!(precpred(_ctx, 4)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                    setState(70);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(71);
                    expression(5);
                  }
                  break;
                case 2:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(72);
                    if (!(precpred(_ctx, 3)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                    setState(73);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(74);
                    expression(4);
                  }
                  break;
                case 3:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(75);
                    if (!(precpred(_ctx, 2)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                    setState(76);
                    match(T__20);
                    setState(77);
                    expression(3);
                  }
                  break;
                case 4:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(78);
                    if (!(precpred(_ctx, 13)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                    setState(83);
                    _errHandler.sync(this);
                    _alt = 1;
                    do {
                      switch (_alt) {
                        case 1:
                          {
                            {
                              setState(79);
                              match(T__0);
                              setState(80);
                              expression(0);
                              setState(81);
                              match(T__1);
                            }
                          }
                          break;
                        default:
                          throw new NoViableAltException(this);
                      }
                      setState(85);
                      _errHandler.sync(this);
                      _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                    } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
                    setState(88);
                    _errHandler.sync(this);
                    switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                      case 1:
                        {
                          setState(87);
                          expression(0);
                        }
                        break;
                    }
                  }
                  break;
                case 5:
                  {
                    _localctx = new ExpressionContext(_parentctx, _parentState);
                    pushNewRecursionContext(_localctx, _startState, RULE_expression);
                    setState(90);
                    if (!(precpred(_ctx, 12)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                    setState(91);
                    match(T__2);
                    setState(92);
                    simple_type();
                  }
                  break;
              }
            }
          }
          setState(97);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Main_funcContext extends ParserRuleContext {
    public FunctionDefinition ast;
    public Token DEF;

    public TerminalNode DEF() {
      return getToken(XanaParser.DEF, 0);
    }

    public TerminalNode MAIN() {
      return getToken(XanaParser.MAIN, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<Var_definitionContext> var_definition() {
      return getRuleContexts(Var_definitionContext.class);
    }

    public Var_definitionContext var_definition(int i) {
      return getRuleContext(Var_definitionContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Main_funcContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_main_func;
    }
  }

  public final Main_funcContext main_func() throws RecognitionException {
    Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_main_func);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(98);
        ((Main_funcContext) _localctx).DEF = match(DEF);
        setState(99);
        match(MAIN);
        setState(100);
        match(T__4);
        setState(101);
        match(T__5);
        setState(102);
        match(DO);
        setState(106);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(103);
                var_definition();
              }
            }
          }
          setState(108);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        }
        setState(112);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743486353456L) != 0) {
          {
            {
              setState(109);
              statement();
            }
          }
          setState(114);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(115);
        match(END);
        ((Main_funcContext) _localctx).ast =
            new FunctionDefinition(
                ((Main_funcContext) _localctx).DEF.getLine(),
                ((Main_funcContext) _localctx).DEF.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Var_definitionContext extends ParserRuleContext {
    public List<VarDefinition> ast = new ArrayList<>();
    public Token ID;
    public List<Token> ids = new ArrayList<Token>();
    public TypeContext type;

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public Var_definitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_var_definition;
    }
  }

  public final Var_definitionContext var_definition() throws RecognitionException {
    Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_var_definition);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        {
          {
            setState(118);
            ((Var_definitionContext) _localctx).ID = match(ID);
            ((Var_definitionContext) _localctx).ids.add(((Var_definitionContext) _localctx).ID);
            setState(123);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__21) {
              {
                {
                  setState(119);
                  match(T__21);
                  setState(120);
                  ((Var_definitionContext) _localctx).ID = match(ID);
                  ((Var_definitionContext) _localctx)
                      .ids.add(((Var_definitionContext) _localctx).ID);
                }
              }
              setState(125);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
            setState(126);
            match(T__22);
            setState(127);
            ((Var_definitionContext) _localctx).type = type();
          }
        }

        for (var id : ((Var_definitionContext) _localctx).ids) {
          _localctx.ast.add(
              new VarDefinition(
                  id.getLine(),
                  id.getCharPositionInLine() + 1,
                  id.getText(),
                  ((Var_definitionContext) _localctx).type.ast));
        }
        ;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TypeContext extends ParserRuleContext {
    public Type ast;
    public Simple_typeContext simple_type;
    public Complex_typeContext complex_type;

    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public Complex_typeContext complex_type() {
      return getRuleContext(Complex_typeContext.class, 0);
    }

    public TypeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_type;
    }
  }

  public final TypeContext type() throws RecognitionException {
    TypeContext _localctx = new TypeContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_type);
    try {
      setState(137);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case CHAR:
        case DOUBLE:
        case INT:
          enterOuterAlt(_localctx, 1);
          {
            setState(131);
            ((TypeContext) _localctx).simple_type = simple_type();
            ((TypeContext) _localctx).ast = ((TypeContext) _localctx).simple_type.ast;
          }
          break;
        case T__0:
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 2);
          {
            setState(134);
            ((TypeContext) _localctx).complex_type = complex_type();
            ((TypeContext) _localctx).ast = ((TypeContext) _localctx).complex_type.ast;
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_definitionContext extends ParserRuleContext {
    public FunctionDefinition ast;
    public Token DEF;

    public TerminalNode DEF() {
      return getToken(XanaParser.DEF, 0);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public Func_bodyContext func_body() {
      return getRuleContext(Func_bodyContext.class, 0);
    }

    public List<Simple_typeContext> simple_type() {
      return getRuleContexts(Simple_typeContext.class);
    }

    public Simple_typeContext simple_type(int i) {
      return getRuleContext(Simple_typeContext.class, i);
    }

    public Func_definitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_definition;
    }
  }

  public final Func_definitionContext func_definition() throws RecognitionException {
    Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_func_definition);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(139);
        ((Func_definitionContext) _localctx).DEF = match(DEF);
        setState(140);
        match(ID);
        setState(141);
        match(T__4);
        setState(158);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case ID:
            {
              {
                {
                  setState(142);
                  match(ID);
                  setState(143);
                  match(T__22);
                  setState(144);
                  simple_type();
                }
                setState(152);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__21) {
                  {
                    {
                      setState(146);
                      match(T__21);
                      {
                        setState(147);
                        match(ID);
                        setState(148);
                        match(T__22);
                        setState(149);
                        simple_type();
                      }
                    }
                  }
                  setState(154);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                }
                setState(155);
                match(T__5);
              }
            }
            break;
          case T__5:
            {
              setState(157);
              match(T__5);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(160);
        match(T__22);
        setState(163);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case CHAR:
          case DOUBLE:
          case INT:
            {
              setState(161);
              simple_type();
            }
            break;
          case T__23:
            {
              setState(162);
              match(T__23);
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(165);
        func_body();
        ((Func_definitionContext) _localctx).ast =
            new FunctionDefinition(
                ((Func_definitionContext) _localctx).DEF.getLine(),
                ((Func_definitionContext) _localctx).DEF.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Func_bodyContext extends ParserRuleContext {
    public List<VarDefinition> defs = new ArrayList<>();
    public List<Statement> statements = new ArrayList<>();

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<Var_definitionContext> var_definition() {
      return getRuleContexts(Var_definitionContext.class);
    }

    public Var_definitionContext var_definition(int i) {
      return getRuleContext(Var_definitionContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public Func_bodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_func_body;
    }
  }

  public final Func_bodyContext func_body() throws RecognitionException {
    Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_func_body);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(168);
        match(DO);
        setState(172);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(169);
                var_definition();
              }
            }
          }
          setState(174);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 14, _ctx);
        }
        setState(178);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743486353456L) != 0) {
          {
            {
              setState(175);
              statement();
            }
          }
          setState(180);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(181);
        match(END);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Simple_typeContext extends ParserRuleContext {
    public Type ast;
    public Token CHAR;
    public Token DOUBLE;
    public Token INT;

    public TerminalNode CHAR() {
      return getToken(XanaParser.CHAR, 0);
    }

    public TerminalNode DOUBLE() {
      return getToken(XanaParser.DOUBLE, 0);
    }

    public TerminalNode INT() {
      return getToken(XanaParser.INT, 0);
    }

    public Simple_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_simple_type;
    }
  }

  public final Simple_typeContext simple_type() throws RecognitionException {
    Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_simple_type);
    try {
      setState(189);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case CHAR:
          enterOuterAlt(_localctx, 1);
          {
            setState(183);
            ((Simple_typeContext) _localctx).CHAR = match(CHAR);
            ((Simple_typeContext) _localctx).ast =
                new Char(
                    ((Simple_typeContext) _localctx).CHAR.getLine(),
                    ((Simple_typeContext) _localctx).CHAR.getCharPositionInLine() + 1);
          }
          break;
        case DOUBLE:
          enterOuterAlt(_localctx, 2);
          {
            setState(185);
            ((Simple_typeContext) _localctx).DOUBLE = match(DOUBLE);
            ((Simple_typeContext) _localctx).ast =
                new DoubleType(
                    ((Simple_typeContext) _localctx).DOUBLE.getLine(),
                    ((Simple_typeContext) _localctx).DOUBLE.getCharPositionInLine() + 1);
          }
          break;
        case INT:
          enterOuterAlt(_localctx, 3);
          {
            setState(187);
            ((Simple_typeContext) _localctx).INT = match(INT);
            ((Simple_typeContext) _localctx).ast =
                new Int(
                    ((Simple_typeContext) _localctx).INT.getLine(),
                    ((Simple_typeContext) _localctx).INT.getCharPositionInLine() + 1);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Complex_typeContext extends ParserRuleContext {
    public Type ast;
    public ArrayContext array;
    public StructContext struct;

    public ArrayContext array() {
      return getRuleContext(ArrayContext.class, 0);
    }

    public StructContext struct() {
      return getRuleContext(StructContext.class, 0);
    }

    public Complex_typeContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_complex_type;
    }
  }

  public final Complex_typeContext complex_type() throws RecognitionException {
    Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_complex_type);
    try {
      setState(197);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case T__0:
          enterOuterAlt(_localctx, 1);
          {
            setState(191);
            ((Complex_typeContext) _localctx).array = array();
            ((Complex_typeContext) _localctx).ast =
                new Array(
                    ((Complex_typeContext) _localctx).array.ast.getLine(),
                    ((Complex_typeContext) _localctx).array.ast.getColumn());
          }
          break;
        case DEFSTRUCT:
          enterOuterAlt(_localctx, 2);
          {
            setState(194);
            ((Complex_typeContext) _localctx).struct = struct();
            ((Complex_typeContext) _localctx).ast =
                new Struct(
                    ((Complex_typeContext) _localctx).struct.ast.getLine(),
                    ((Complex_typeContext) _localctx).struct.ast.getColumn());
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StructContext extends ParserRuleContext {
    public Struct ast;
    public Token DEFSTRUCT;

    public TerminalNode DEFSTRUCT() {
      return getToken(XanaParser.DEFSTRUCT, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<Var_definitionContext> var_definition() {
      return getRuleContexts(Var_definitionContext.class);
    }

    public Var_definitionContext var_definition(int i) {
      return getRuleContext(Var_definitionContext.class, i);
    }

    public StructContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_struct;
    }
  }

  public final StructContext struct() throws RecognitionException {
    StructContext _localctx = new StructContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_struct);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(199);
        ((StructContext) _localctx).DEFSTRUCT = match(DEFSTRUCT);
        setState(200);
        match(DO);
        setState(204);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(201);
              var_definition();
            }
          }
          setState(206);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(207);
        match(END);
        ((StructContext) _localctx).ast =
            new Struct(
                ((StructContext) _localctx).DEFSTRUCT.getLine(),
                ((StructContext) _localctx).DEFSTRUCT.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignationContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public AssignationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignation;
    }
  }

  public final AssignationContext assignation() throws RecognitionException {
    AssignationContext _localctx = new AssignationContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_assignation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(215);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
          case 1:
            {
              setState(210);
              expression(0);
            }
            break;
          case 2:
            {
              setState(211);
              match(T__4);
              setState(212);
              expression(0);
              setState(213);
              match(T__5);
            }
            break;
        }
        setState(217);
        match(T__24);
        setState(223);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
          case 1:
            {
              setState(218);
              expression(0);
            }
            break;
          case 2:
            {
              setState(219);
              match(T__4);
              setState(220);
              expression(0);
              setState(221);
              match(T__5);
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class WriteContext extends ParserRuleContext {
    public List<Write> ast = new ArrayList<>();
    public ExpressionContext expression;
    public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();

    public TerminalNode PUTS() {
      return getToken(XanaParser.PUTS, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public WriteContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_write;
    }
  }

  public final WriteContext write() throws RecognitionException {
    WriteContext _localctx = new WriteContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_write);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(225);
        match(PUTS);
        {
          setState(226);
          ((WriteContext) _localctx).expression = expression(0);
          ((WriteContext) _localctx).exp.add(((WriteContext) _localctx).expression);
        }
        setState(231);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__21) {
          {
            {
              setState(227);
              match(T__21);
              setState(228);
              ((WriteContext) _localctx).expression = expression(0);
              ((WriteContext) _localctx).exp.add(((WriteContext) _localctx).expression);
            }
          }
          setState(233);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }

        for (var ex : ((WriteContext) _localctx).exp) {
          _localctx.ast.add(new Write(ex.ast.getLine(), ex.ast.getColumn()));
        }
        ;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReadContext extends ParserRuleContext {
    public List<Read> ast = new ArrayList<>();
    public ExpressionContext expression;
    public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();

    public TerminalNode IN() {
      return getToken(XanaParser.IN, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public ReadContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_read;
    }
  }

  public final ReadContext read() throws RecognitionException {
    ReadContext _localctx = new ReadContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_read);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(236);
        match(IN);
        {
          setState(237);
          ((ReadContext) _localctx).expression = expression(0);
          ((ReadContext) _localctx).exp.add(((ReadContext) _localctx).expression);
        }
        setState(242);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__21) {
          {
            {
              setState(238);
              match(T__21);
              setState(239);
              ((ReadContext) _localctx).expression = expression(0);
              ((ReadContext) _localctx).exp.add(((ReadContext) _localctx).expression);
            }
          }
          setState(244);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }

        for (var ex : ((ReadContext) _localctx).exp) {
          _localctx.ast.add(new Read(ex.ast.getLine(), ex.ast.getColumn()));
        }
        ;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StatementContext extends ParserRuleContext {
    public List<Statement> ast = new ArrayList<>();
    public WhileStatementContext whileStatement;
    public IfStatementContext ifStatement;
    public ReadContext read;
    public WriteContext write;
    public ReturnStatementContext returnStatement;

    public WhileStatementContext whileStatement() {
      return getRuleContext(WhileStatementContext.class, 0);
    }

    public IfStatementContext ifStatement() {
      return getRuleContext(IfStatementContext.class, 0);
    }

    public AssignationContext assignation() {
      return getRuleContext(AssignationContext.class, 0);
    }

    public ReadContext read() {
      return getRuleContext(ReadContext.class, 0);
    }

    public WriteContext write() {
      return getRuleContext(WriteContext.class, 0);
    }

    public ReturnStatementContext returnStatement() {
      return getRuleContext(ReturnStatementContext.class, 0);
    }

    public InvocationContext invocation() {
      return getRuleContext(InvocationContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_statement);
    try {
      setState(264);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 23, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(247);
            ((StatementContext) _localctx).whileStatement = whileStatement();
            _localctx.ast.add(((StatementContext) _localctx).whileStatement.ast);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(250);
            ((StatementContext) _localctx).ifStatement = ifStatement();
            _localctx.ast.add(((StatementContext) _localctx).ifStatement.ast);
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(253);
            assignation();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(254);
            ((StatementContext) _localctx).read = read();
            _localctx.ast.addAll(((StatementContext) _localctx).read.ast);
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(257);
            ((StatementContext) _localctx).write = write();
            _localctx.ast.addAll(((StatementContext) _localctx).write.ast);
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(260);
            ((StatementContext) _localctx).returnStatement = returnStatement();
            _localctx.ast.add(((StatementContext) _localctx).returnStatement.ast);
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(263);
            invocation();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IfStatementContext extends ParserRuleContext {
    public If ast;
    public Token IF;

    public TerminalNode IF() {
      return getToken(XanaParser.IF, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public IfStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_ifStatement;
    }
  }

  public final IfStatementContext ifStatement() throws RecognitionException {
    IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_ifStatement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(266);
        ((IfStatementContext) _localctx).IF = match(IF);
        setState(267);
        expression(0);
        setState(268);
        match(DO);
        setState(272);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743486353456L) != 0) {
          {
            {
              setState(269);
              statement();
            }
          }
          setState(274);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(282);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__25) {
          {
            setState(275);
            match(T__25);
            setState(279);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743486353456L) != 0) {
              {
                {
                  setState(276);
                  statement();
                }
              }
              setState(281);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(284);
        match(END);
        ((IfStatementContext) _localctx).ast =
            new If(
                ((IfStatementContext) _localctx).IF.getLine(),
                ((IfStatementContext) _localctx).IF.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class WhileStatementContext extends ParserRuleContext {
    public While ast;
    public Token WHILE;

    public TerminalNode WHILE() {
      return getToken(XanaParser.WHILE, 0);
    }

    public TerminalNode DO() {
      return getToken(XanaParser.DO, 0);
    }

    public TerminalNode END() {
      return getToken(XanaParser.END, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public WhileStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_whileStatement;
    }
  }

  public final WhileStatementContext whileStatement() throws RecognitionException {
    WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_whileStatement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(287);
        ((WhileStatementContext) _localctx).WHILE = match(WHILE);
        setState(289);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(288);
              expression(0);
            }
          }
          setState(291);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361739325603888L) != 0);
        setState(293);
        match(DO);
        setState(297);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743486353456L) != 0) {
          {
            {
              setState(294);
              statement();
            }
          }
          setState(299);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(300);
        match(END);
        ((WhileStatementContext) _localctx).ast =
            new While(
                ((WhileStatementContext) _localctx).WHILE.getLine(),
                ((WhileStatementContext) _localctx).WHILE.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReturnStatementContext extends ParserRuleContext {
    public Return ast;
    public Token RETURN;

    public TerminalNode RETURN() {
      return getToken(XanaParser.RETURN, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_returnStatement;
    }
  }

  public final ReturnStatementContext returnStatement() throws RecognitionException {
    ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_returnStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(303);
        ((ReturnStatementContext) _localctx).RETURN = match(RETURN);
        setState(304);
        expression(0);
        ((ReturnStatementContext) _localctx).ast =
            new Return(
                ((ReturnStatementContext) _localctx).RETURN.getLine(),
                ((ReturnStatementContext) _localctx).RETURN.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class InvocationContext extends ParserRuleContext {
    public Invocation ast;
    public Token ID;

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public InvocationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_invocation;
    }
  }

  public final InvocationContext invocation() throws RecognitionException {
    InvocationContext _localctx = new InvocationContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_invocation);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(307);
        ((InvocationContext) _localctx).ID = match(ID);
        setState(321);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
          case 1:
            {
              {
                setState(308);
                match(T__4);
                setState(309);
                expression(0);
                setState(314);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == T__21) {
                  {
                    {
                      setState(310);
                      match(T__21);
                      setState(311);
                      expression(0);
                    }
                  }
                  setState(316);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                }
                setState(317);
                match(T__5);
              }
            }
            break;
          case 2:
            {
              {
                setState(319);
                match(T__4);
                setState(320);
                match(T__5);
              }
            }
            break;
        }
        ((InvocationContext) _localctx).ast =
            new Invocation(
                ((InvocationContext) _localctx).ID.getLine(),
                ((InvocationContext) _localctx).ID.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrayContext extends ParserRuleContext {
    public Array ast;
    public Token INT_CONSTANT;

    public TerminalNode INT_CONSTANT() {
      return getToken(XanaParser.INT_CONSTANT, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public List<ArrayContext> array() {
      return getRuleContexts(ArrayContext.class);
    }

    public ArrayContext array(int i) {
      return getRuleContext(ArrayContext.class, i);
    }

    public ArrayContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_array;
    }
  }

  public final ArrayContext array() throws RecognitionException {
    ArrayContext _localctx = new ArrayContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_array);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        {
          setState(325);
          match(T__0);
          setState(326);
          ((ArrayContext) _localctx).INT_CONSTANT = match(INT_CONSTANT);
          setState(327);
          match(T__22);
        }
        setState(332);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(329);
                array();
              }
            }
          }
          setState(334);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 31, _ctx);
        }
        {
          setState(335);
          type();
          setState(336);
          match(T__1);
        }
        ((ArrayContext) _localctx).ast =
            new Array(
                ((ArrayContext) _localctx).INT_CONSTANT.getLine(),
                ((ArrayContext) _localctx).INT_CONSTANT.getCharPositionInLine() + 1);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 1:
        return expression_sempred((ExpressionContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 4);
      case 1:
        return precpred(_ctx, 3);
      case 2:
        return precpred(_ctx, 2);
      case 3:
        return precpred(_ctx, 13);
      case 4:
        return precpred(_ctx, 12);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u00010\u0155\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"
          + "\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"
          + "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0004\u0001T\b\u0001\u000b\u0001\f\u0001U\u0001"
          + "\u0001\u0003\u0001Y\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"
          + "\u0001^\b\u0001\n\u0001\f\u0001a\t\u0001\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002i\b\u0002\n\u0002"
          + "\f\u0002l\t\u0002\u0001\u0002\u0005\u0002o\b\u0002\n\u0002\f\u0002r\t"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0005\u0003z\b\u0003\n\u0003\f\u0003}\t\u0003\u0001\u0003\u0001"
          + "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"
          + "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008a\b\u0004\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"
          + "\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0097"
          + "\b\u0005\n\u0005\f\u0005\u009a\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"
          + "\u0003\u0005\u009f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"
          + "\u00a4\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"
          + "\u0005\u0006\u00ab\b\u0006\n\u0006\f\u0006\u00ae\t\u0006\u0001\u0006\u0005"
          + "\u0006\u00b1\b\u0006\n\u0006\f\u0006\u00b4\t\u0006\u0001\u0006\u0001\u0006"
          + "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"
          + "\u0003\u0007\u00be\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"
          + "\b\u0003\b\u00c6\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00cb\b\t\n\t\f\t"
          + "\u00ce\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"
          + "\n\u0003\n\u00d8\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"
          + "\n\u00e0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"
          + "\u00e6\b\u000b\n\u000b\f\u000b\u00e9\t\u000b\u0001\u000b\u0001\u000b\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f1\b\f\n\f\f\f\u00f4\t\f\u0001\f"
          + "\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"
          + "\r\u0003\r\u0109\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"
          + "\u000e\u010f\b\u000e\n\u000e\f\u000e\u0112\t\u000e\u0001\u000e\u0001\u000e"
          + "\u0005\u000e\u0116\b\u000e\n\u000e\f\u000e\u0119\t\u000e\u0003\u000e\u011b"
          + "\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0004"
          + "\u000f\u0122\b\u000f\u000b\u000f\f\u000f\u0123\u0001\u000f\u0001\u000f"
          + "\u0005\u000f\u0128\b\u000f\n\u000f\f\u000f\u012b\t\u000f\u0001\u000f\u0001"
          + "\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"
          + "\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0139"
          + "\b\u0011\n\u0011\f\u0011\u013c\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"
          + "\u0001\u0011\u0003\u0011\u0142\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"
          + "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u014b\b\u0012"
          + "\n\u0012\f\u0012\u014e\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"
          + "\u0012\u0001\u0012\u0001\u0012\u0000\u0001\u0002\u0013\u0000\u0002\u0004"
          + "\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""
          + "$\u0000\u0002\u0001\u0000\u0007\u000e\u0001\u0000\u000f\u0014\u0170\u0000"
          + "*\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0004b\u0001"
          + "\u0000\u0000\u0000\u0006v\u0001\u0000\u0000\u0000\b\u0089\u0001\u0000"
          + "\u0000\u0000\n\u008b\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000"
          + "\u0000\u000e\u00bd\u0001\u0000\u0000\u0000\u0010\u00c5\u0001\u0000\u0000"
          + "\u0000\u0012\u00c7\u0001\u0000\u0000\u0000\u0014\u00d7\u0001\u0000\u0000"
          + "\u0000\u0016\u00e1\u0001\u0000\u0000\u0000\u0018\u00ec\u0001\u0000\u0000"
          + "\u0000\u001a\u0108\u0001\u0000\u0000\u0000\u001c\u010a\u0001\u0000\u0000"
          + "\u0000\u001e\u011f\u0001\u0000\u0000\u0000 \u012f\u0001\u0000\u0000\u0000"
          + "\"\u0133\u0001\u0000\u0000\u0000$\u0145\u0001\u0000\u0000\u0000&)\u0003"
          + "\u0006\u0003\u0000\')\u0003\n\u0005\u0000(&\u0001\u0000\u0000\u0000(\'"
          + "\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"
          + "\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"
          + "\u0000\u0000-.\u0003\u0004\u0002\u0000./\u0006\u0000\uffff\uffff\u0000"
          + "/\u0001\u0001\u0000\u0000\u000001\u0006\u0001\uffff\uffff\u000012\u0005"
          + "(\u0000\u00002D\u0006\u0001\uffff\uffff\u000034\u00050\u0000\u00004D\u0006"
          + "\u0001\uffff\uffff\u000056\u0005.\u0000\u00006D\u0006\u0001\uffff\uffff"
          + "\u000078\u0003\"\u0011\u000089\u0006\u0001\uffff\uffff\u00009D\u0001\u0000"
          + "\u0000\u0000:D\u0005+\u0000\u0000;<\u0005\u0004\u0000\u0000<D\u0003\u0002"
          + "\u0001\u0006=>\u0005\u0005\u0000\u0000>?\u0003\u0002\u0001\u0000?@\u0005"
          + "\u0006\u0000\u0000@D\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000"
          + "BD\u0003\u0002\u0001\u0001C0\u0001\u0000\u0000\u0000C3\u0001\u0000\u0000"
          + "\u0000C5\u0001\u0000\u0000\u0000C7\u0001\u0000\u0000\u0000C:\u0001\u0000"
          + "\u0000\u0000C;\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000CA\u0001"
          + "\u0000\u0000\u0000D_\u0001\u0000\u0000\u0000EF\n\u0004\u0000\u0000FG\u0007"
          + "\u0000\u0000\u0000G^\u0003\u0002\u0001\u0005HI\n\u0003\u0000\u0000IJ\u0007"
          + "\u0001\u0000\u0000J^\u0003\u0002\u0001\u0004KL\n\u0002\u0000\u0000LM\u0005"
          + "\u0015\u0000\u0000M^\u0003\u0002\u0001\u0003NS\n\r\u0000\u0000OP\u0005"
          + "\u0001\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0005\u0002\u0000\u0000"
          + "RT\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"
          + "\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VX\u0001\u0000"
          + "\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000XY\u0001"
          + "\u0000\u0000\u0000Y^\u0001\u0000\u0000\u0000Z[\n\f\u0000\u0000[\\\u0005"
          + "\u0003\u0000\u0000\\^\u0003\u000e\u0007\u0000]E\u0001\u0000\u0000\u0000"
          + "]H\u0001\u0000\u0000\u0000]K\u0001\u0000\u0000\u0000]N\u0001\u0000\u0000"
          + "\u0000]Z\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"
          + "\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0003\u0001\u0000\u0000\u0000"
          + "a_\u0001\u0000\u0000\u0000bc\u0005!\u0000\u0000cd\u0005 \u0000\u0000d"
          + "e\u0005\u0005\u0000\u0000ef\u0005\u0006\u0000\u0000fj\u0005\"\u0000\u0000"
          + "gi\u0003\u0006\u0003\u0000hg\u0001\u0000\u0000\u0000il\u0001\u0000\u0000"
          + "\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kp\u0001\u0000"
          + "\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0003\u001a\r\u0000nm\u0001\u0000"
          + "\u0000\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001"
          + "\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"
          + "st\u0005#\u0000\u0000tu\u0006\u0002\uffff\uffff\u0000u\u0005\u0001\u0000"
          + "\u0000\u0000v{\u00050\u0000\u0000wx\u0005\u0016\u0000\u0000xz\u00050\u0000"
          + "\u0000yw\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000"
          + "\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000}{\u0001"
          + "\u0000\u0000\u0000~\u007f\u0005\u0017\u0000\u0000\u007f\u0080\u0003\b"
          + "\u0004\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082\u0006\u0003"
          + "\uffff\uffff\u0000\u0082\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0003"
          + "\u000e\u0007\u0000\u0084\u0085\u0006\u0004\uffff\uffff\u0000\u0085\u008a"
          + "\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u0010\b\u0000\u0087\u0088\u0006"
          + "\u0004\uffff\uffff\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0083"
          + "\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u008a\t\u0001"
          + "\u0000\u0000\u0000\u008b\u008c\u0005!\u0000\u0000\u008c\u008d\u00050\u0000"
          + "\u0000\u008d\u009e\u0005\u0005\u0000\u0000\u008e\u008f\u00050\u0000\u0000"
          + "\u008f\u0090\u0005\u0017\u0000\u0000\u0090\u0091\u0003\u000e\u0007\u0000"
          + "\u0091\u0098\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0016\u0000\u0000"
          + "\u0093\u0094\u00050\u0000\u0000\u0094\u0095\u0005\u0017\u0000\u0000\u0095"
          + "\u0097\u0003\u000e\u0007\u0000\u0096\u0092\u0001\u0000\u0000\u0000\u0097"
          + "\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098"
          + "\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000\u009a"
          + "\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0006\u0000\u0000\u009c"
          + "\u009f\u0001\u0000\u0000\u0000\u009d\u009f\u0005\u0006\u0000\u0000\u009e"
          + "\u008e\u0001\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f"
          + "\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a3\u0005\u0017\u0000\u0000\u00a1"
          + "\u00a4\u0003\u000e\u0007\u0000\u00a2\u00a4\u0005\u0018\u0000\u0000\u00a3"
          + "\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4"
          + "\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a7"
          + "\u0006\u0005\uffff\uffff\u0000\u00a7\u000b\u0001\u0000\u0000\u0000\u00a8"
          + "\u00ac\u0005\"\u0000\u0000\u00a9\u00ab\u0003\u0006\u0003\u0000\u00aa\u00a9"
          + "\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa"
          + "\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b2"
          + "\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b1"
          + "\u0003\u001a\r\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"
          + "\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001"
          + "\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001"
          + "\u0000\u0000\u0000\u00b5\u00b6\u0005#\u0000\u0000\u00b6\r\u0001\u0000"
          + "\u0000\u0000\u00b7\u00b8\u0005$\u0000\u0000\u00b8\u00be\u0006\u0007\uffff"
          + "\uffff\u0000\u00b9\u00ba\u0005%\u0000\u0000\u00ba\u00be\u0006\u0007\uffff"
          + "\uffff\u0000\u00bb\u00bc\u0005&\u0000\u0000\u00bc\u00be\u0006\u0007\uffff"
          + "\uffff\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000"
          + "\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u000f\u0001\u0000"
          + "\u0000\u0000\u00bf\u00c0\u0003$\u0012\u0000\u00c0\u00c1\u0006\b\uffff"
          + "\uffff\u0000\u00c1\u00c6\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u0012"
          + "\t\u0000\u00c3\u00c4\u0006\b\uffff\uffff\u0000\u00c4\u00c6\u0001\u0000"
          + "\u0000\u0000\u00c5\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000"
          + "\u0000\u0000\u00c6\u0011\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\'\u0000"
          + "\u0000\u00c8\u00cc\u0005\"\u0000\u0000\u00c9\u00cb\u0003\u0006\u0003\u0000"
          + "\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000"
          + "\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000"
          + "\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000"
          + "\u00cf\u00d0\u0005#\u0000\u0000\u00d0\u00d1\u0006\t\uffff\uffff\u0000"
          + "\u00d1\u0013\u0001\u0000\u0000\u0000\u00d2\u00d8\u0003\u0002\u0001\u0000"
          + "\u00d3\u00d4\u0005\u0005\u0000\u0000\u00d4\u00d5\u0003\u0002\u0001\u0000"
          + "\u00d5\u00d6\u0005\u0006\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000"
          + "\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000"
          + "\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00df\u0005\u0019\u0000\u0000"
          + "\u00da\u00e0\u0003\u0002\u0001\u0000\u00db\u00dc\u0005\u0005\u0000\u0000"
          + "\u00dc\u00dd\u0003\u0002\u0001\u0000\u00dd\u00de\u0005\u0006\u0000\u0000"
          + "\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000"
          + "\u00df\u00db\u0001\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000"
          + "\u00e1\u00e2\u0005\u001b\u0000\u0000\u00e2\u00e7\u0003\u0002\u0001\u0000"
          + "\u00e3\u00e4\u0005\u0016\u0000\u0000\u00e4\u00e6\u0003\u0002\u0001\u0000"
          + "\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000"
          + "\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000"
          + "\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000"
          + "\u00ea\u00eb\u0006\u000b\uffff\uffff\u0000\u00eb\u0017\u0001\u0000\u0000"
          + "\u0000\u00ec\u00ed\u0005\u001c\u0000\u0000\u00ed\u00f2\u0003\u0002\u0001"
          + "\u0000\u00ee\u00ef\u0005\u0016\u0000\u0000\u00ef\u00f1\u0003\u0002\u0001"
          + "\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f4\u0001\u0000\u0000"
          + "\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000"
          + "\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"
          + "\u0000\u00f5\u00f6\u0006\f\uffff\uffff\u0000\u00f6\u0019\u0001\u0000\u0000"
          + "\u0000\u00f7\u00f8\u0003\u001e\u000f\u0000\u00f8\u00f9\u0006\r\uffff\uffff"
          + "\u0000\u00f9\u0109\u0001\u0000\u0000\u0000\u00fa\u00fb\u0003\u001c\u000e"
          + "\u0000\u00fb\u00fc\u0006\r\uffff\uffff\u0000\u00fc\u0109\u0001\u0000\u0000"
          + "\u0000\u00fd\u0109\u0003\u0014\n\u0000\u00fe\u00ff\u0003\u0018\f\u0000"
          + "\u00ff\u0100\u0006\r\uffff\uffff\u0000\u0100\u0109\u0001\u0000\u0000\u0000"
          + "\u0101\u0102\u0003\u0016\u000b\u0000\u0102\u0103\u0006\r\uffff\uffff\u0000"
          + "\u0103\u0109\u0001\u0000\u0000\u0000\u0104\u0105\u0003 \u0010\u0000\u0105"
          + "\u0106\u0006\r\uffff\uffff\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107"
          + "\u0109\u0003\"\u0011\u0000\u0108\u00f7\u0001\u0000\u0000\u0000\u0108\u00fa"
          + "\u0001\u0000\u0000\u0000\u0108\u00fd\u0001\u0000\u0000\u0000\u0108\u00fe"
          + "\u0001\u0000\u0000\u0000\u0108\u0101\u0001\u0000\u0000\u0000\u0108\u0104"
          + "\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0109\u001b"
          + "\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001d\u0000\u0000\u010b\u010c"
          + "\u0003\u0002\u0001\u0000\u010c\u0110\u0005\"\u0000\u0000\u010d\u010f\u0003"
          + "\u001a\r\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0112\u0001\u0000"
          + "\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000"
          + "\u0000\u0000\u0111\u011a\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"
          + "\u0000\u0000\u0113\u0117\u0005\u001a\u0000\u0000\u0114\u0116\u0003\u001a"
          + "\r\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"
          + "\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"
          + "\u0000\u0118\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"
          + "\u0000\u011a\u0113\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"
          + "\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005#\u0000\u0000"
          + "\u011d\u011e\u0006\u000e\uffff\uffff\u0000\u011e\u001d\u0001\u0000\u0000"
          + "\u0000\u011f\u0121\u0005\u001e\u0000\u0000\u0120\u0122\u0003\u0002\u0001"
          + "\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"
          + "\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"
          + "\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0129\u0005\"\u0000\u0000"
          + "\u0126\u0128\u0003\u001a\r\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128"
          + "\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129"
          + "\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001\u0000\u0000\u0000\u012b"
          + "\u0129\u0001\u0000\u0000\u0000\u012c\u012d\u0005#\u0000\u0000\u012d\u012e"
          + "\u0006\u000f\uffff\uffff\u0000\u012e\u001f\u0001\u0000\u0000\u0000\u012f"
          + "\u0130\u0005\u001f\u0000\u0000\u0130\u0131\u0003\u0002\u0001\u0000\u0131"
          + "\u0132\u0006\u0010\uffff\uffff\u0000\u0132!\u0001\u0000\u0000\u0000\u0133"
          + "\u0141\u00050\u0000\u0000\u0134\u0135\u0005\u0005\u0000\u0000\u0135\u013a"
          + "\u0003\u0002\u0001\u0000\u0136\u0137\u0005\u0016\u0000\u0000\u0137\u0139"
          + "\u0003\u0002\u0001\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013c"
          + "\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"
          + "\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a"
          + "\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0006\u0000\u0000\u013e\u0142"
          + "\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140\u0142"
          + "\u0005\u0006\u0000\u0000\u0141\u0134\u0001\u0000\u0000\u0000\u0141\u013f"
          + "\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144"
          + "\u0006\u0011\uffff\uffff\u0000\u0144#\u0001\u0000\u0000\u0000\u0145\u0146"
          + "\u0005\u0001\u0000\u0000\u0146\u0147\u0005(\u0000\u0000\u0147\u0148\u0005"
          + "\u0017\u0000\u0000\u0148\u014c\u0001\u0000\u0000\u0000\u0149\u014b\u0003"
          + "$\u0012\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"
          + "\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"
          + "\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"
          + "\u0000\u0000\u014f\u0150\u0003\b\u0004\u0000\u0150\u0151\u0005\u0002\u0000"
          + "\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0006\u0012\uffff"
          + "\uffff\u0000\u0153%\u0001\u0000\u0000\u0000 (*CUX]_jp{\u0089\u0098\u009e"
          + "\u00a3\u00ac\u00b2\u00bd\u00c5\u00cc\u00d7\u00df\u00e7\u00f2\u0108\u0110"
          + "\u0117\u011a\u0123\u0129\u013a\u0141\u014c";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
