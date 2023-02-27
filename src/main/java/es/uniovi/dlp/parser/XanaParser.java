// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

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
      MULTI_COMMENT = 24,
      ONE_COMMENT = 25,
      WS = 26,
      INT_CONSTANT = 27,
      ID = 28,
      CHAR_CONSTANT = 29,
      MANTISA = 30,
      CHARACTER = 31,
      LOGIC_OPERATOR = 32,
      DIGIT = 33,
      REAL_CONSTANT = 34;
  public static final int RULE_program = 0,
      RULE_var_definition = 1,
      RULE_type = 2,
      RULE_definition = 3,
      RULE_simple_type = 4,
      RULE_array = 5,
      RULE_struct = 6,
      RULE_expression = 7,
      RULE_assignation = 8,
      RULE_write = 9,
      RULE_read = 10,
      RULE_statement = 11,
      RULE_param = 12,
      RULE_if = 13,
      RULE_while = 14,
      RULE_return = 15,
      RULE_cast = 16;

  private static String[] makeRuleNames() {
    return new String[] {
      "program", "var_definition", "type", "definition", "simple_type", "array",
      "struct", "expression", "assignation", "write", "read", "statement",
      "param", "if", "while", "return", "cast"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "','",
      "'::'",
      "'\\n'",
      "'def'",
      "'('",
      "')'",
      "'char'",
      "'double'",
      "'int'",
      "'['",
      "']'",
      "':: defstruct do \\n'",
      "'end'",
      "'='",
      "'puts'",
      "'in'",
      "'1'",
      "'if'",
      "'do'",
      "'else'",
      "'while'",
      "'return'",
      "'as'"
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
      "MULTI_COMMENT",
      "ONE_COMMENT",
      "WS",
      "INT_CONSTANT",
      "ID",
      "CHAR_CONSTANT",
      "MANTISA",
      "CHARACTER",
      "LOGIC_OPERATOR",
      "DIGIT",
      "REAL_CONSTANT"
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
    public List<TerminalNode> INT_CONSTANT() {
      return getTokens(XanaParser.INT_CONSTANT);
    }

    public TerminalNode INT_CONSTANT(int i) {
      return getToken(XanaParser.INT_CONSTANT, i);
    }

    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public List<TerminalNode> REAL_CONSTANT() {
      return getTokens(XanaParser.REAL_CONSTANT);
    }

    public TerminalNode REAL_CONSTANT(int i) {
      return getToken(XanaParser.REAL_CONSTANT, i);
    }

    public List<TerminalNode> CHAR_CONSTANT() {
      return getTokens(XanaParser.CHAR_CONSTANT);
    }

    public TerminalNode CHAR_CONSTANT(int i) {
      return getToken(XanaParser.CHAR_CONSTANT, i);
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
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(37);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (((_la) & ~0x3f) == 0 && ((1L << _la) & 18119393280L) != 0) {
          {
            {
              setState(34);
              _la = _input.LA(1);
              if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 18119393280L) != 0)) {
                _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
            }
          }
          setState(39);
          _errHandler.sync(this);
          _la = _input.LA(1);
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
  public static class Var_definitionContext extends ParserRuleContext {
    public List<TerminalNode> ID() {
      return getTokens(XanaParser.ID);
    }

    public TerminalNode ID(int i) {
      return getToken(XanaParser.ID, i);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
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
    enterRule(_localctx, 2, RULE_var_definition);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(40);
        match(ID);
        setState(45);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(41);
              match(T__0);
              setState(42);
              match(ID);
            }
          }
          setState(47);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(48);
        match(T__1);
        setState(49);
        type();
        setState(50);
        match(T__2);
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
    public Simple_typeContext simple_type() {
      return getRuleContext(Simple_typeContext.class, 0);
    }

    public ArrayContext array() {
      return getRuleContext(ArrayContext.class, 0);
    }

    public StructContext struct() {
      return getRuleContext(StructContext.class, 0);
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
    enterRule(_localctx, 4, RULE_type);
    try {
      setState(55);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(52);
            simple_type();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(53);
            array();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(54);
            struct();
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
  public static class DefinitionContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public List<ParamContext> param() {
      return getRuleContexts(ParamContext.class);
    }

    public ParamContext param(int i) {
      return getRuleContext(ParamContext.class, i);
    }

    public DefinitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_definition;
    }
  }

  public final DefinitionContext definition() throws RecognitionException {
    DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_definition);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(57);
        match(T__3);
        setState(58);
        match(ID);
        setState(59);
        match(T__4);
        setState(61);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__16) {
          {
            setState(60);
            param();
          }
        }

        setState(67);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(63);
              match(T__0);
              setState(64);
              param();
            }
          }
          setState(69);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(70);
        match(T__5);
        setState(71);
        match(T__1);
        setState(72);
        type();
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
    enterRule(_localctx, 8, RULE_simple_type);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(74);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
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
  public static class ArrayContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public List<TerminalNode> INT_CONSTANT() {
      return getTokens(XanaParser.INT_CONSTANT);
    }

    public TerminalNode INT_CONSTANT(int i) {
      return getToken(XanaParser.INT_CONSTANT, i);
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
    enterRule(_localctx, 10, RULE_array);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(76);
        match(ID);
        setState(77);
        match(T__1);
        setState(81);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(78);
              match(T__9);
              setState(79);
              match(INT_CONSTANT);
              setState(80);
              match(T__1);
            }
          }
          setState(83);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == T__9);
        {
          setState(85);
          type();
          setState(86);
          match(T__10);
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
  public static class StructContext extends ParserRuleContext {
    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
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
    enterRule(_localctx, 12, RULE_struct);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(88);
        match(ID);
        setState(89);
        match(T__11);
        setState(95);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ID) {
          {
            {
              setState(90);
              var_definition();
              setState(91);
              match(T__2);
            }
          }
          setState(97);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(98);
        match(T__12);
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
    public TerminalNode DIGIT() {
      return getToken(XanaParser.DIGIT, 0);
    }

    public TerminalNode ID() {
      return getToken(XanaParser.ID, 0);
    }

    public TerminalNode CHARACTER() {
      return getToken(XanaParser.CHARACTER, 0);
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
    ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_expression);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(100);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 11005853696L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
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
    enterRule(_localctx, 16, RULE_assignation);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(102);
        expression();
        setState(103);
        match(T__13);
        setState(104);
        expression();
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
    enterRule(_localctx, 18, RULE_write);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(106);
        match(T__14);
        {
          setState(107);
          expression();
        }
        setState(112);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(108);
              match(T__0);
              setState(109);
              expression();
            }
          }
          setState(114);
          _errHandler.sync(this);
          _la = _input.LA(1);
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
  public static class ReadContext extends ParserRuleContext {
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
    enterRule(_localctx, 20, RULE_read);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(115);
        match(T__15);
        {
          setState(116);
          expression();
        }
        setState(121);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__0) {
          {
            {
              setState(117);
              match(T__0);
              setState(118);
              expression();
            }
          }
          setState(123);
          _errHandler.sync(this);
          _la = _input.LA(1);
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
  public static class StatementContext extends ParserRuleContext {
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
    enterRule(_localctx, 22, RULE_statement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(124);
        match(T__16);
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
  public static class ParamContext extends ParserRuleContext {
    public ParamContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_param;
    }
  }

  public final ParamContext param() throws RecognitionException {
    ParamContext _localctx = new ParamContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_param);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(126);
        match(T__16);
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
  public static class IfContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode LOGIC_OPERATOR() {
      return getToken(XanaParser.LOGIC_OPERATOR, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public IfContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_if;
    }
  }

  public final IfContext if_() throws RecognitionException {
    IfContext _localctx = new IfContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_if);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(128);
        match(T__17);
        setState(129);
        expression();
        setState(130);
        match(LOGIC_OPERATOR);
        setState(131);
        expression();
        setState(132);
        match(T__18);
        setState(136);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__16) {
          {
            {
              setState(133);
              statement();
            }
          }
          setState(138);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(146);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == T__19) {
          {
            setState(139);
            match(T__19);
            setState(143);
            _errHandler.sync(this);
            _la = _input.LA(1);
            while (_la == T__16) {
              {
                {
                  setState(140);
                  statement();
                }
              }
              setState(145);
              _errHandler.sync(this);
              _la = _input.LA(1);
            }
          }
        }

        setState(148);
        match(T__12);
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
  public static class WhileContext extends ParserRuleContext {
    public List<ExpressionContext> expression() {
      return getRuleContexts(ExpressionContext.class);
    }

    public ExpressionContext expression(int i) {
      return getRuleContext(ExpressionContext.class, i);
    }

    public TerminalNode LOGIC_OPERATOR() {
      return getToken(XanaParser.LOGIC_OPERATOR, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public WhileContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_while;
    }
  }

  public final WhileContext while_() throws RecognitionException {
    WhileContext _localctx = new WhileContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_while);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(150);
        match(T__20);
        setState(151);
        expression();
        setState(152);
        match(LOGIC_OPERATOR);
        setState(153);
        expression();
        setState(154);
        match(T__18);
        setState(158);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == T__16) {
          {
            {
              setState(155);
              statement();
            }
          }
          setState(160);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(161);
        match(T__12);
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
  public static class ReturnContext extends ParserRuleContext {
    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public ReturnContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_return;
    }
  }

  public final ReturnContext return_() throws RecognitionException {
    ReturnContext _localctx = new ReturnContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_return);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(163);
        match(T__21);
        setState(164);
        expression();
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
  public static class CastContext extends ParserRuleContext {
    public TypeContext type() {
      return getRuleContext(TypeContext.class, 0);
    }

    public CastContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_cast;
    }
  }

  public final CastContext cast() throws RecognitionException {
    CastContext _localctx = new CastContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_cast);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(166);
        match(T__22);
        setState(167);
        type();
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

  public static final String _serializedATN =
      "\u0004\u0001\"\u00aa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"
          + "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"
          + "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"
          + "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"
          + "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"
          + "\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"
          + "\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001,\b\u0001\n"
          + "\u0001\f\u0001/\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b\u0003\u0001\u0003"
          + "\u0001\u0003\u0005\u0003B\b\u0003\n\u0003\f\u0003E\t\u0003\u0001\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"
          + "\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005R\b\u0005"
          + "\u000b\u0005\f\u0005S\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"
          + "\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006^\b\u0006"
          + "\n\u0006\f\u0006a\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"
          + "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"
          + "\to\b\t\n\t\f\tr\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nx\b\n\n\n"
          + "\f\n{\t\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0005\r\u0087\b\r\n\r\f\r\u008a\t\r\u0001\r"
          + "\u0001\r\u0005\r\u008e\b\r\n\r\f\r\u0091\t\r\u0003\r\u0093\b\r\u0001\r"
          + "\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"
          + "\u000e\u0005\u000e\u009d\b\u000e\n\u000e\f\u000e\u00a0\t\u000e\u0001\u000e"
          + "\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"
          + "\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n"
          + "\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0003"
          + "\u0002\u0000\u001b\u001d\"\"\u0001\u0000\u0007\t\u0003\u0000\u001c\u001c"
          + "\u001f\u001f!!\u00a6\u0000%\u0001\u0000\u0000\u0000\u0002(\u0001\u0000"
          + "\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000"
          + "\bJ\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000\u0000\fX\u0001\u0000"
          + "\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000"
          + "\u0012j\u0001\u0000\u0000\u0000\u0014s\u0001\u0000\u0000\u0000\u0016|"
          + "\u0001\u0000\u0000\u0000\u0018~\u0001\u0000\u0000\u0000\u001a\u0080\u0001"
          + "\u0000\u0000\u0000\u001c\u0096\u0001\u0000\u0000\u0000\u001e\u00a3\u0001"
          + "\u0000\u0000\u0000 \u00a6\u0001\u0000\u0000\u0000\"$\u0007\u0000\u0000"
          + "\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"
          + "\u0000\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000"
          + "\'%\u0001\u0000\u0000\u0000(-\u0005\u001c\u0000\u0000)*\u0005\u0001\u0000"
          + "\u0000*,\u0005\u001c\u0000\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000"
          + "\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001"
          + "\u0000\u0000\u0000/-\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u0000"
          + "12\u0003\u0004\u0002\u000023\u0005\u0003\u0000\u00003\u0003\u0001\u0000"
          + "\u0000\u000048\u0003\b\u0004\u000058\u0003\n\u0005\u000068\u0003\f\u0006"
          + "\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"
          + "\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u0004\u0000\u0000"
          + ":;\u0005\u001c\u0000\u0000;=\u0005\u0005\u0000\u0000<>\u0003\u0018\f\u0000"
          + "=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>C\u0001\u0000\u0000"
          + "\u0000?@\u0005\u0001\u0000\u0000@B\u0003\u0018\f\u0000A?\u0001\u0000\u0000"
          + "\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000"
          + "\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0005"
          + "\u0006\u0000\u0000GH\u0005\u0002\u0000\u0000HI\u0003\u0004\u0002\u0000"
          + "I\u0007\u0001\u0000\u0000\u0000JK\u0007\u0001\u0000\u0000K\t\u0001\u0000"
          + "\u0000\u0000LM\u0005\u001c\u0000\u0000MQ\u0005\u0002\u0000\u0000NO\u0005"
          + "\n\u0000\u0000OP\u0005\u001b\u0000\u0000PR\u0005\u0002\u0000\u0000QN\u0001"
          + "\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000"
          + "ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0003\u0004\u0002"
          + "\u0000VW\u0005\u000b\u0000\u0000W\u000b\u0001\u0000\u0000\u0000XY\u0005"
          + "\u001c\u0000\u0000Y_\u0005\f\u0000\u0000Z[\u0003\u0002\u0001\u0000[\\"
          + "\u0005\u0003\u0000\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000\u0000"
          + "\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"
          + "\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005"
          + "\r\u0000\u0000c\r\u0001\u0000\u0000\u0000de\u0007\u0002\u0000\u0000e\u000f"
          + "\u0001\u0000\u0000\u0000fg\u0003\u000e\u0007\u0000gh\u0005\u000e\u0000"
          + "\u0000hi\u0003\u000e\u0007\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0005"
          + "\u000f\u0000\u0000kp\u0003\u000e\u0007\u0000lm\u0005\u0001\u0000\u0000"
          + "mo\u0003\u000e\u0007\u0000nl\u0001\u0000\u0000\u0000or\u0001\u0000\u0000"
          + "\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000q\u0013\u0001"
          + "\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0010\u0000\u0000"
          + "ty\u0003\u000e\u0007\u0000uv\u0005\u0001\u0000\u0000vx\u0003\u000e\u0007"
          + "\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000"
          + "\u0000\u0000yz\u0001\u0000\u0000\u0000z\u0015\u0001\u0000\u0000\u0000"
          + "{y\u0001\u0000\u0000\u0000|}\u0005\u0011\u0000\u0000}\u0017\u0001\u0000"
          + "\u0000\u0000~\u007f\u0005\u0011\u0000\u0000\u007f\u0019\u0001\u0000\u0000"
          + "\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\u0082\u0003\u000e\u0007"
          + "\u0000\u0082\u0083\u0005 \u0000\u0000\u0083\u0084\u0003\u000e\u0007\u0000"
          + "\u0084\u0088\u0005\u0013\u0000\u0000\u0085\u0087\u0003\u0016\u000b\u0000"
          + "\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000"
          + "\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"
          + "\u0089\u0092\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000"
          + "\u008b\u008f\u0005\u0014\u0000\u0000\u008c\u008e\u0003\u0016\u000b\u0000"
          + "\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000"
          + "\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"
          + "\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"
          + "\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"
          + "\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095"
          + "\u001b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0015\u0000\u0000\u0097"
          + "\u0098\u0003\u000e\u0007\u0000\u0098\u0099\u0005 \u0000\u0000\u0099\u009a"
          + "\u0003\u000e\u0007\u0000\u009a\u009e\u0005\u0013\u0000\u0000\u009b\u009d"
          + "\u0003\u0016\u000b\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u00a0"
          + "\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"
          + "\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e"
          + "\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\r\u0000\u0000\u00a2\u001d\u0001"
          + "\u0000\u0000\u0000\u00a3\u00a4\u0005\u0016\u0000\u0000\u00a4\u00a5\u0003"
          + "\u000e\u0007\u0000\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"
          + "\u0017\u0000\u0000\u00a7\u00a8\u0003\u0004\u0002\u0000\u00a8!\u0001\u0000"
          + "\u0000\u0000\r%-7=CS_py\u0088\u008f\u0092\u009e";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
