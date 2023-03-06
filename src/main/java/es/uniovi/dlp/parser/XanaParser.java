// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;
import es.uniovi.dlp.ast.*;
import es.uniovi.dlp.ast.expression.*;
import es.uniovi.dlp.ast.statement.*;
import es.uniovi.dlp.ast.program.*;
import es.uniovi.dlp.ast.type.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, PUTS=26, IN=27, VOID=28, IF=29, WHILE=30, RETURN=31, MAIN=32, 
		DEF=33, DO=34, END=35, CHAR=36, DOUBLE=37, INT=38, DEFSTRUCT=39, INT_CONSTANT=40, 
		ONE_COMMENT=41, WS=42, CHAR_CONSTANT=43, MANTISA=44, CHARACTER=45, REAL_CONSTANT=46, 
		MULTI_COMMENT=47, ID=48;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_main_func = 2, RULE_var_definition = 3, 
		RULE_returnType = 4, RULE_type = 5, RULE_func_definition = 6, RULE_param = 7, 
		RULE_func_body = 8, RULE_simple_type = 9, RULE_complex_type = 10, RULE_struct = 11, 
		RULE_assignation = 12, RULE_write = 13, RULE_read = 14, RULE_statement = 15, 
		RULE_ifStatement = 16, RULE_whileStatement = 17, RULE_returnStatement = 18, 
		RULE_invocation = 19, RULE_array = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "main_func", "var_definition", "returnType", 
			"type", "func_definition", "param", "func_body", "simple_type", "complex_type", 
			"struct", "assignation", "write", "read", "statement", "ifStatement", 
			"whileStatement", "returnStatement", "invocation", "array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'as'", "'!'", "'('", "')'", "'>'", "'<'", "'!='", 
			"'=='", "'<='", "'>='", "'&&'", "'||'", "'/'", "'*'", "'^'", "'%'", "'+'", 
			"'-'", "'.'", "','", "'::'", "'='", "'else'", "'puts'", "'in'", "'void'", 
			"'if'", "'while'", "'return'", "'main'", "'def'", "'do'", "'end'", "'char'", 
			"'double'", "'int'", "'defstruct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "PUTS", "IN", "VOID", "IF", "WHILE", "RETURN", "MAIN", "DEF", 
			"DO", "END", "CHAR", "DOUBLE", "INT", "DEFSTRUCT", "INT_CONSTANT", "ONE_COMMENT", 
			"WS", "CHAR_CONSTANT", "MANTISA", "CHARACTER", "REAL_CONSTANT", "MULTI_COMMENT", 
			"ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XanaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
			return getRuleContext(Main_funcContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<Func_definitionContext> func_definition() {
			return getRuleContexts(Func_definitionContext.class);
		}
		public Func_definitionContext func_definition(int i) {
			return getRuleContext(Func_definitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(44);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(42);
						((ProgramContext)_localctx).var_definition = var_definition();
						((ProgramContext)_localctx).varDefs.add(((ProgramContext)_localctx).var_definition);
						}
						break;
					case DEF:
						{
						setState(43);
						((ProgramContext)_localctx).func_definition = func_definition();
						((ProgramContext)_localctx).funcDefs.add(((ProgramContext)_localctx).func_definition);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(49);
			((ProgramContext)_localctx).main_func = main_func();

			var defs = new ArrayList<Definition>();
			for (var varDefs : ((ProgramContext)_localctx).varDefs) {
			    defs.addAll(varDefs.ast);
			}

			for (var funcDef : ((ProgramContext)_localctx).funcDefs) {
			    defs.add(funcDef.ast);
			}
			defs.add(((ProgramContext)_localctx).main_func.ast);
			((ProgramContext)_localctx).ast =  new Program(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,defs);
			       
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public ExpressionContext left;
		public ExpressionContext ex;
		public Token INT_CONSTANT;
		public Token name;
		public Token REAL_CONSTANT;
		public InvocationContext invocation;
		public Token CHAR_CONSTANT;
		public ExpressionContext expression;
		public Token op;
		public ExpressionContext right;
		public Simple_typeContext st;
		public Token idR;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(53);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1,LexerHelper.lexemeToInt(((ExpressionContext)_localctx).INT_CONSTANT.getText()));
				}
				break;
			case 2:
				{
				setState(55);
				((ExpressionContext)_localctx).name = match(ID);
				((ExpressionContext)_localctx).ast =  new Id(((ExpressionContext)_localctx).name.getLine(),((ExpressionContext)_localctx).name.getCharPositionInLine() + 1,((ExpressionContext)_localctx).name.getText());
				}
				break;
			case 3:
				{
				setState(57);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast =  new RealConstant(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1,LexerHelper.lexemeToReal(((ExpressionContext)_localctx).REAL_CONSTANT.getText()));
				}
				break;
			case 4:
				{
				setState(59);
				((ExpressionContext)_localctx).invocation = invocation();
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).invocation.ast;
				}
				break;
			case 5:
				{
				setState(62);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast =  new CharConstant(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,LexerHelper.lexemeToChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getText()));
				}
				break;
			case 6:
				{
				setState(64);
				match(T__3);
				setState(65);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(7);
				((ExpressionContext)_localctx).ast =  new Not(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).ex.ast);
				}
				break;
			case 7:
				{
				setState(68);
				match(T__4);
				setState(69);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(70);
				match(T__5);
				((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 8:
				{
				setState(73);
				match(T__19);
				setState(74);
				((ExpressionContext)_localctx).ex = ((ExpressionContext)_localctx).expression = expression(1);
				((ExpressionContext)_localctx).ast =  new UnaryMinus(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).ex.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(80);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).ast =  new ComparisonOperation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).left.ast,((ExpressionContext)_localctx).op.getText(),((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(84);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(85);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 491520L) != 0) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
						((ExpressionContext)_localctx).ast =  new ArithmeticOperation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).left.ast,((ExpressionContext)_localctx).op.getText(),((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(90);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
						((ExpressionContext)_localctx).ast =  new ArithmeticOperation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).left.ast,((ExpressionContext)_localctx).op.getText(),((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(99); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(95);
								match(T__0);
								setState(96);
								((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(0);
								setState(97);
								match(T__1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(101); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						((ExpressionContext)_localctx).ast =  new Indexing(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).left.ast,((ExpressionContext)_localctx).right.ast);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.ex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(106);
						match(T__2);
						setState(107);
						((ExpressionContext)_localctx).st = simple_type();
						((ExpressionContext)_localctx).ast =  new Cast(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).ex.ast,((ExpressionContext)_localctx).st.ast);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(111);
						match(T__20);
						setState(112);
						((ExpressionContext)_localctx).idR = match(ID);
						((ExpressionContext)_localctx).ast =  new FieldAccess(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ExpressionContext)_localctx).left.ast,((ExpressionContext)_localctx).idR.getText());
						}
						break;
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_funcContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token DEF;
		public Token name;
		public Var_definitionContext var_definition;
		public List<Var_definitionContext> defs = new ArrayList<Var_definitionContext>();
		public StatementContext statement;
		public List<StatementContext> sts = new ArrayList<StatementContext>();
		public TerminalNode DEF() { return getToken(XanaParser.DEF, 0); }
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public TerminalNode MAIN() { return getToken(XanaParser.MAIN, 0); }
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((Main_funcContext)_localctx).DEF = match(DEF);
			setState(120);
			((Main_funcContext)_localctx).name = match(MAIN);
			setState(121);
			match(T__4);
			setState(122);
			match(T__5);
			setState(123);
			match(DO);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					((Main_funcContext)_localctx).var_definition = var_definition();
					((Main_funcContext)_localctx).defs.add(((Main_funcContext)_localctx).var_definition);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743286009904L) != 0) {
				{
				{
				setState(130);
				((Main_funcContext)_localctx).statement = statement();
				((Main_funcContext)_localctx).sts.add(((Main_funcContext)_localctx).statement);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(END);

			var definitions =new ArrayList<VarDefinition>();
			var statements=new ArrayList<Statement>();
			for(var d:((Main_funcContext)_localctx).defs){
			definitions.addAll(d.ast);
			}
			for(var s:((Main_funcContext)_localctx).sts){
			statements.addAll(s.ast);
			}
			((Main_funcContext)_localctx).ast =  new FunctionDefinition(((Main_funcContext)_localctx).DEF.getLine(),((Main_funcContext)_localctx).DEF.getCharPositionInLine() + 1,((Main_funcContext)_localctx).name.getText(),definitions,statements,new FunctionType(((Main_funcContext)_localctx).DEF.getLine(),((Main_funcContext)_localctx).DEF.getCharPositionInLine() + 1,new ArrayList<VarDefinition>(),null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
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
			setState(139);
			((Var_definitionContext)_localctx).ID = match(ID);
			((Var_definitionContext)_localctx).ids.add(((Var_definitionContext)_localctx).ID);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(140);
				match(T__21);
				setState(141);
				((Var_definitionContext)_localctx).ID = match(ID);
				((Var_definitionContext)_localctx).ids.add(((Var_definitionContext)_localctx).ID);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__22);
			setState(148);
			((Var_definitionContext)_localctx).type = type();
			}
			}

			    for(var id : ((Var_definitionContext)_localctx).ids) {
			    _localctx.ast.add (new VarDefinition(id.getLine(),id.getCharPositionInLine() + 1, id.getText(),((Var_definitionContext)_localctx).type.ast));};
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnTypeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext simple_type;
		public Token VOID;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(XanaParser.VOID, 0); }
		public ReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnType; }
	}

	public final ReturnTypeContext returnType() throws RecognitionException {
		ReturnTypeContext _localctx = new ReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnType);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case DOUBLE:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				((ReturnTypeContext)_localctx).simple_type = simple_type();
				((ReturnTypeContext)_localctx).ast =  ((ReturnTypeContext)_localctx).simple_type.ast;
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				((ReturnTypeContext)_localctx).VOID = match(VOID);
				((ReturnTypeContext)_localctx).ast =  new VoidType(((ReturnTypeContext)_localctx).VOID.getLine(),((ReturnTypeContext)_localctx).VOID.getCharPositionInLine() + 1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
			return getRuleContext(Simple_typeContext.class,0);
		}
		public Complex_typeContext complex_type() {
			return getRuleContext(Complex_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case DOUBLE:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((TypeContext)_localctx).simple_type = simple_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast;
				}
				break;
			case T__0:
			case DEFSTRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((TypeContext)_localctx).complex_type = complex_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).complex_type.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Token DEF;
		public Token name;
		public ParamContext param;
		public List<ParamContext> params = new ArrayList<ParamContext>();
		public ReturnTypeContext returnType;
		public Func_bodyContext body;
		public TerminalNode DEF() { return getToken(XanaParser.DEF, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public ReturnTypeContext returnType() {
			return getRuleContext(ReturnTypeContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((Func_definitionContext)_localctx).DEF = match(DEF);
			setState(168);
			((Func_definitionContext)_localctx).name = match(ID);
			setState(169);
			match(T__4);
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				{
				setState(170);
				((Func_definitionContext)_localctx).param = param();
				((Func_definitionContext)_localctx).params.add(((Func_definitionContext)_localctx).param);
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(171);
					match(T__21);
					{
					setState(172);
					((Func_definitionContext)_localctx).param = param();
					((Func_definitionContext)_localctx).params.add(((Func_definitionContext)_localctx).param);
					}
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__5);
				}
				}
				break;
			case T__5:
				{
				setState(180);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(183);
			match(T__22);
			{
			setState(184);
			((Func_definitionContext)_localctx).returnType = returnType();
			}
			setState(185);
			((Func_definitionContext)_localctx).body = func_body();

			                var pars = new ArrayList<VarDefinition>();
			                for(var p : ((Func_definitionContext)_localctx).params){
			                pars.add(p.ast);
			                }
			                ((Func_definitionContext)_localctx).ast =  new FunctionDefinition(((Func_definitionContext)_localctx).DEF.getLine(),((Func_definitionContext)_localctx).DEF.getCharPositionInLine() + 1,((Func_definitionContext)_localctx).name.getText(),((Func_definitionContext)_localctx).body.defs,((Func_definitionContext)_localctx).body.statements,new FunctionType(((Func_definitionContext)_localctx).DEF.getLine(),((Func_definitionContext)_localctx).DEF.getCharPositionInLine() + 1,pars,((Func_definitionContext)_localctx).returnType.ast));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token name;
		public Simple_typeContext tipo;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((ParamContext)_localctx).name = match(ID);
			setState(189);
			match(T__22);
			setState(190);
			((ParamContext)_localctx).tipo = simple_type();
			((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).name.getLine(),((ParamContext)_localctx).name.getCharPositionInLine() + 1,((ParamContext)_localctx).name.getText(),((ParamContext)_localctx).tipo.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Func_bodyContext extends ParserRuleContext {
		public List<VarDefinition> defs = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public Var_definitionContext var_definition;
		public List<Var_definitionContext> vars = new ArrayList<Var_definitionContext>();
		public StatementContext statement;
		public List<StatementContext> stmnts = new ArrayList<StatementContext>();
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(DO);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					((Func_bodyContext)_localctx).var_definition = var_definition();
					((Func_bodyContext)_localctx).vars.add(((Func_bodyContext)_localctx).var_definition);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743286009904L) != 0) {
				{
				{
				setState(200);
				((Func_bodyContext)_localctx).statement = statement();
				((Func_bodyContext)_localctx).stmnts.add(((Func_bodyContext)_localctx).statement);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(END);

			var varDefs = new ArrayList<VarDefinition>();
			var sts = new ArrayList<Statement>();
			for(var def : ((Func_bodyContext)_localctx).vars)
			    varDefs.addAll(def.ast);
			for(var st : ((Func_bodyContext)_localctx).stmnts)
			    sts.addAll(st.ast);
			((Func_bodyContext)_localctx).defs =  varDefs;
			((Func_bodyContext)_localctx).statements = sts;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
		public TerminalNode CHAR() { return getToken(XanaParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(XanaParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(XanaParser.INT, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_type);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				((Simple_typeContext)_localctx).CHAR = match(CHAR);
				((Simple_typeContext)_localctx).ast =  new Char(((Simple_typeContext)_localctx).CHAR.getLine(),((Simple_typeContext)_localctx).CHAR.getCharPositionInLine() + 1);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				((Simple_typeContext)_localctx).DOUBLE = match(DOUBLE);
				((Simple_typeContext)_localctx).ast =  new DoubleType(((Simple_typeContext)_localctx).DOUBLE.getLine(),((Simple_typeContext)_localctx).DOUBLE.getCharPositionInLine() + 1);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				((Simple_typeContext)_localctx).INT = match(INT);
				((Simple_typeContext)_localctx).ast =  new Int(((Simple_typeContext)_localctx).INT.getLine(),((Simple_typeContext)_localctx).INT.getCharPositionInLine() + 1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
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
			return getRuleContext(ArrayContext.class,0);
		}
		public StructContext struct() {
			return getRuleContext(StructContext.class,0);
		}
		public Complex_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complex_type; }
	}

	public final Complex_typeContext complex_type() throws RecognitionException {
		Complex_typeContext _localctx = new Complex_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_complex_type);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((Complex_typeContext)_localctx).array = array();
				((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).array.ast;
				}
				break;
			case DEFSTRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				((Complex_typeContext)_localctx).struct = struct();
				((Complex_typeContext)_localctx).ast =  ((Complex_typeContext)_localctx).struct.ast;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructContext extends ParserRuleContext {
		public Struct ast;
		public Token DEFSTRUCT;
		public Var_definitionContext var_definition;
		public List<Var_definitionContext> vars = new ArrayList<Var_definitionContext>();
		public TerminalNode DEFSTRUCT() { return getToken(XanaParser.DEFSTRUCT, 0); }
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			((StructContext)_localctx).DEFSTRUCT = match(DEFSTRUCT);
			setState(226);
			match(DO);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(227);
				((StructContext)_localctx).var_definition = var_definition();
				((StructContext)_localctx).vars.add(((StructContext)_localctx).var_definition);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233);
			match(END);

			var structs = new ArrayList<StructField>();
			var i =0;
			for(var v: ((StructContext)_localctx).vars){
			for(var vd : v.ast){
			structs.add(new StructField(vd.getName(),vd.getType()));
			}
			}
			((StructContext)_localctx).ast =  new Struct(((StructContext)_localctx).DEFSTRUCT.getLine(),((StructContext)_localctx).DEFSTRUCT.getCharPositionInLine() + 1,structs);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationContext extends ParserRuleContext {
		public Assignation ast;
		public ExpressionContext left;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(236);
				((AssignationContext)_localctx).left = expression(0);
				}
				break;
			case 2:
				{
				setState(237);
				match(T__4);
				setState(238);
				((AssignationContext)_localctx).left = expression(0);
				setState(239);
				match(T__5);
				}
				break;
			}
			setState(243);
			match(T__23);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(244);
				((AssignationContext)_localctx).right = expression(0);
				}
				break;
			case 2:
				{
				setState(245);
				match(T__4);
				setState(246);
				((AssignationContext)_localctx).right = expression(0);
				setState(247);
				match(T__5);
				}
				break;
			}

			((AssignationContext)_localctx).ast =  new Assignation(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((AssignationContext)_localctx).left.ast,((AssignationContext)_localctx).right.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public List<Write> ast = new ArrayList<>();
		public ExpressionContext expression;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public TerminalNode PUTS() { return getToken(XanaParser.PUTS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(PUTS);
			{
			setState(254);
			((WriteContext)_localctx).expression = expression(0);
			((WriteContext)_localctx).exp.add(((WriteContext)_localctx).expression);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(255);
				match(T__21);
				setState(256);
				((WriteContext)_localctx).expression = expression(0);
				((WriteContext)_localctx).exp.add(((WriteContext)_localctx).expression);
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			for(var ex : ((WriteContext)_localctx).exp) {
			    if(ex.ast != null)
			    _localctx.ast.add (new Write(ex.ast.getLine(),ex.ast.getColumn(),ex.ast));};
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public List<Read> ast = new ArrayList<>();
		public ExpressionContext expression;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public TerminalNode IN() { return getToken(XanaParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IN);
			{
			setState(265);
			((ReadContext)_localctx).expression = expression(0);
			((ReadContext)_localctx).exp.add(((ReadContext)_localctx).expression);
			}
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(266);
				match(T__21);
				setState(267);
				((ReadContext)_localctx).expression = expression(0);
				((ReadContext)_localctx).exp.add(((ReadContext)_localctx).expression);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			for(var ex : ((ReadContext)_localctx).exp) {
			    if(ex.ast != null)
			    _localctx.ast.add(new Read(ex.ast.getLine(),ex.ast.getColumn(),ex.ast));};
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public WhileStatementContext whileStatement;
		public IfStatementContext ifStatement;
		public AssignationContext assignation;
		public ReadContext read;
		public WriteContext write;
		public ReturnStatementContext returnStatement;
		public InvocationContext invocation;
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public InvocationContext invocation() {
			return getRuleContext(InvocationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statement);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((StatementContext)_localctx).whileStatement = whileStatement();
				_localctx.ast.add(((StatementContext)_localctx).whileStatement.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				((StatementContext)_localctx).ifStatement = ifStatement();
				_localctx.ast.add(((StatementContext)_localctx).ifStatement.ast);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				((StatementContext)_localctx).assignation = assignation();
				_localctx.ast.add(((StatementContext)_localctx).assignation.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				((StatementContext)_localctx).read = read();
				_localctx.ast.addAll(((StatementContext)_localctx).read.ast);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				((StatementContext)_localctx).write = write();
				_localctx.ast.addAll(((StatementContext)_localctx).write.ast);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(290);
				((StatementContext)_localctx).returnStatement = returnStatement();
				_localctx.ast.add(((StatementContext)_localctx).returnStatement.ast);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				((StatementContext)_localctx).invocation = invocation();
				_localctx.ast.add(((StatementContext)_localctx).invocation.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public If ast;
		public Token IF;
		public ExpressionContext condition;
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public List<StatementContext> elseStatements = new ArrayList<StatementContext>();
		public TerminalNode IF() { return getToken(XanaParser.IF, 0); }
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(299);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(300);
			match(DO);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743286009904L) != 0) {
				{
				{
				setState(301);
				((IfStatementContext)_localctx).statement = statement();
				((IfStatementContext)_localctx).statements.add(((IfStatementContext)_localctx).statement);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(307);
				match(T__24);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743286009904L) != 0) {
					{
					{
					setState(308);
					((IfStatementContext)_localctx).statement = statement();
					((IfStatementContext)_localctx).elseStatements.add(((IfStatementContext)_localctx).statement);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(316);
			match(END);

			var sts=new ArrayList<Statement>();
			var elseSts=new ArrayList<Statement>();
			for(var state: ((IfStatementContext)_localctx).statements){
			if(state.ast != null)
			sts.addAll(state.ast);
			}
			for(var stateE: ((IfStatementContext)_localctx).elseStatements){
			if(stateE.ast != null)
			elseSts.addAll(stateE.ast);
			}
			((IfStatementContext)_localctx).ast =  new If(((IfStatementContext)_localctx).IF.getLine(),((IfStatementContext)_localctx).IF.getCharPositionInLine() + 1,((IfStatementContext)_localctx).condition.ast,sts,elseSts);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public While ast;
		public Token WHILE;
		public ExpressionContext condition;
		public StatementContext statement;
		public List<StatementContext> statements = new ArrayList<StatementContext>();
		public TerminalNode WHILE() { return getToken(XanaParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			setState(320);
			((WhileStatementContext)_localctx).condition = expression(0);
			setState(321);
			match(DO);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743286009904L) != 0) {
				{
				{
				setState(322);
				((WhileStatementContext)_localctx).statement = statement();
				((WhileStatementContext)_localctx).statements.add(((WhileStatementContext)_localctx).statement);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
			match(END);

			var sts=new ArrayList<Statement>();
			for(var state: ((WhileStatementContext)_localctx).statements){
			if(state.ast != null)
			sts.addAll(state.ast);
			}
			((WhileStatementContext)_localctx).ast =  new While(((WhileStatementContext)_localctx).WHILE.getLine(),((WhileStatementContext)_localctx).WHILE.getCharPositionInLine() + 1,((WhileStatementContext)_localctx).condition.ast,sts);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public Return ast;
		public Token RETURN;
		public ExpressionContext exp;
		public TerminalNode RETURN() { return getToken(XanaParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(332);
			((ReturnStatementContext)_localctx).exp = expression(0);
			((ReturnStatementContext)_localctx).ast =  new Return(((ReturnStatementContext)_localctx).RETURN.getLine(),((ReturnStatementContext)_localctx).RETURN.getCharPositionInLine() + 1,((ReturnStatementContext)_localctx).exp.ast);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InvocationContext extends ParserRuleContext {
		public Invocation ast;
		public Token ID;
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invocation; }
	}

	public final InvocationContext invocation() throws RecognitionException {
		InvocationContext _localctx = new InvocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			((InvocationContext)_localctx).ID = match(ID);
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				{
				setState(336);
				match(T__4);
				setState(337);
				expression(0);
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(338);
					match(T__21);
					setState(339);
					expression(0);
					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(T__5);
				}
				}
				break;
			case 2:
				{
				{
				setState(347);
				match(T__4);
				setState(348);
				match(T__5);
				}
				}
				break;
			}
			((InvocationContext)_localctx).ast =  new Invocation(((InvocationContext)_localctx).ID.getLine(),((InvocationContext)_localctx).ID.getCharPositionInLine() + 1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public Array ast;
		public Token size;
		public TypeContext tipo;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(353);
			match(T__0);
			setState(354);
			((ArrayContext)_localctx).size = match(INT_CONSTANT);
			setState(355);
			match(T__22);
			}
			{
			setState(357);
			((ArrayContext)_localctx).tipo = type();
			setState(358);
			match(T__1);
			}
			((ArrayContext)_localctx).ast =  new Array(_localctx.start.getLine(),_localctx.start.getCharPositionInLine() + 1,((ArrayContext)_localctx).tipo.ast,LexerHelper.lexemeToInt(((ArrayContext)_localctx).size.getText()));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001d\b\u0001\u000b\u0001\f\u0001e\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001s\b\u0001\n\u0001\f\u0001v\t"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002~\b\u0002\n\u0002\f\u0002\u0081\t\u0002\u0001\u0002"+
		"\u0005\u0002\u0084\b\u0002\n\u0002\f\u0002\u0087\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u008f"+
		"\b\u0003\n\u0003\f\u0003\u0092\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u009e\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a6\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"\u00ae\b\u0006\n\u0006\f\u0006\u00b1\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00b6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0005\b\u00c4\b\b\n\b\f\b\u00c7\t\b\u0001\b\u0005"+
		"\b\u00ca\b\b\n\b\f\b\u00cd\t\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d8\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e0\b\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00e5\b\u000b\n\u000b\f\u000b\u00e8\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00f2\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00fa"+
		"\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0102\b\r"+
		"\n\r\f\r\u0105\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u010d\b\u000e\n\u000e\f\u000e\u0110\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0129"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u012f"+
		"\b\u0010\n\u0010\f\u0010\u0132\t\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u0136\b\u0010\n\u0010\f\u0010\u0139\t\u0010\u0003\u0010\u013b\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u0144\b\u0011\n\u0011\f\u0011\u0147\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0155\b\u0013\n\u0013\f\u0013\u0158\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u015e\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0001\u0002\u0015"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(\u0000\u0003\u0001\u0000\u0007\u000e\u0001\u0000\u000f"+
		"\u0012\u0001\u0000\u0013\u0014\u0182\u0000.\u0001\u0000\u0000\u0000\u0002"+
		"M\u0001\u0000\u0000\u0000\u0004w\u0001\u0000\u0000\u0000\u0006\u008b\u0001"+
		"\u0000\u0000\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u00a5\u0001\u0000"+
		"\u0000\u0000\f\u00a7\u0001\u0000\u0000\u0000\u000e\u00bc\u0001\u0000\u0000"+
		"\u0000\u0010\u00c1\u0001\u0000\u0000\u0000\u0012\u00d7\u0001\u0000\u0000"+
		"\u0000\u0014\u00df\u0001\u0000\u0000\u0000\u0016\u00e1\u0001\u0000\u0000"+
		"\u0000\u0018\u00f1\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000\u0000"+
		"\u0000\u001c\u0108\u0001\u0000\u0000\u0000\u001e\u0128\u0001\u0000\u0000"+
		"\u0000 \u012a\u0001\u0000\u0000\u0000\"\u013f\u0001\u0000\u0000\u0000"+
		"$\u014b\u0001\u0000\u0000\u0000&\u014f\u0001\u0000\u0000\u0000(\u0161"+
		"\u0001\u0000\u0000\u0000*-\u0003\u0006\u0003\u0000+-\u0003\f\u0006\u0000"+
		",*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000"+
		"\u0000\u00000.\u0001\u0000\u0000\u000012\u0003\u0004\u0002\u000023\u0006"+
		"\u0000\uffff\uffff\u00003\u0001\u0001\u0000\u0000\u000045\u0006\u0001"+
		"\uffff\uffff\u000056\u0005(\u0000\u00006N\u0006\u0001\uffff\uffff\u0000"+
		"78\u00050\u0000\u00008N\u0006\u0001\uffff\uffff\u00009:\u0005.\u0000\u0000"+
		":N\u0006\u0001\uffff\uffff\u0000;<\u0003&\u0013\u0000<=\u0006\u0001\uffff"+
		"\uffff\u0000=N\u0001\u0000\u0000\u0000>?\u0005+\u0000\u0000?N\u0006\u0001"+
		"\uffff\uffff\u0000@A\u0005\u0004\u0000\u0000AB\u0003\u0002\u0001\u0007"+
		"BC\u0006\u0001\uffff\uffff\u0000CN\u0001\u0000\u0000\u0000DE\u0005\u0005"+
		"\u0000\u0000EF\u0003\u0002\u0001\u0000FG\u0005\u0006\u0000\u0000GH\u0006"+
		"\u0001\uffff\uffff\u0000HN\u0001\u0000\u0000\u0000IJ\u0005\u0014\u0000"+
		"\u0000JK\u0003\u0002\u0001\u0001KL\u0006\u0001\uffff\uffff\u0000LN\u0001"+
		"\u0000\u0000\u0000M4\u0001\u0000\u0000\u0000M7\u0001\u0000\u0000\u0000"+
		"M9\u0001\u0000\u0000\u0000M;\u0001\u0000\u0000\u0000M>\u0001\u0000\u0000"+
		"\u0000M@\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000MI\u0001\u0000"+
		"\u0000\u0000Nt\u0001\u0000\u0000\u0000OP\n\u0005\u0000\u0000PQ\u0007\u0000"+
		"\u0000\u0000QR\u0003\u0002\u0001\u0006RS\u0006\u0001\uffff\uffff\u0000"+
		"Ss\u0001\u0000\u0000\u0000TU\n\u0004\u0000\u0000UV\u0007\u0001\u0000\u0000"+
		"VW\u0003\u0002\u0001\u0005WX\u0006\u0001\uffff\uffff\u0000Xs\u0001\u0000"+
		"\u0000\u0000YZ\n\u0003\u0000\u0000Z[\u0007\u0002\u0000\u0000[\\\u0003"+
		"\u0002\u0001\u0004\\]\u0006\u0001\uffff\uffff\u0000]s\u0001\u0000\u0000"+
		"\u0000^c\n\u000e\u0000\u0000_`\u0005\u0001\u0000\u0000`a\u0003\u0002\u0001"+
		"\u0000ab\u0005\u0002\u0000\u0000bd\u0001\u0000\u0000\u0000c_\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0006\u0001\uffff\uffff"+
		"\u0000hs\u0001\u0000\u0000\u0000ij\n\r\u0000\u0000jk\u0005\u0003\u0000"+
		"\u0000kl\u0003\u0012\t\u0000lm\u0006\u0001\uffff\uffff\u0000ms\u0001\u0000"+
		"\u0000\u0000no\n\u0002\u0000\u0000op\u0005\u0015\u0000\u0000pq\u00050"+
		"\u0000\u0000qs\u0006\u0001\uffff\uffff\u0000rO\u0001\u0000\u0000\u0000"+
		"rT\u0001\u0000\u0000\u0000rY\u0001\u0000\u0000\u0000r^\u0001\u0000\u0000"+
		"\u0000ri\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0003"+
		"\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0005!\u0000\u0000"+
		"xy\u0005 \u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0005\u0006\u0000\u0000"+
		"{\u007f\u0005\"\u0000\u0000|~\u0003\u0006\u0003\u0000}|\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0085\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u001e\u000f\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005#\u0000\u0000\u0089\u008a\u0006\u0002\uffff\uffff\u0000\u008a"+
		"\u0005\u0001\u0000\u0000\u0000\u008b\u0090\u00050\u0000\u0000\u008c\u008d"+
		"\u0005\u0016\u0000\u0000\u008d\u008f\u00050\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0017\u0000\u0000\u0094\u0095\u0003\n\u0005\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0006\u0003\uffff\uffff\u0000\u0097\u0007\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0003\u0012\t\u0000\u0099\u009a\u0006\u0004"+
		"\uffff\uffff\u0000\u009a\u009e\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u001c\u0000\u0000\u009c\u009e\u0006\u0004\uffff\uffff\u0000\u009d\u0098"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\t\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0003\u0012\t\u0000\u00a0\u00a1\u0006\u0005"+
		"\uffff\uffff\u0000\u00a1\u00a6\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003"+
		"\u0014\n\u0000\u00a3\u00a4\u0006\u0005\uffff\uffff\u0000\u00a4\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a6\u000b\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"!\u0000\u0000\u00a8\u00a9\u00050\u0000\u0000\u00a9\u00b5\u0005\u0005\u0000"+
		"\u0000\u00aa\u00af\u0003\u000e\u0007\u0000\u00ab\u00ac\u0005\u0016\u0000"+
		"\u0000\u00ac\u00ae\u0003\u000e\u0007\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000"+
		"\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0006\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0005\u0006\u0000"+
		"\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000"+
		"\u0000\u00b8\u00b9\u0003\b\u0004\u0000\u00b9\u00ba\u0003\u0010\b\u0000"+
		"\u00ba\u00bb\u0006\u0006\uffff\uffff\u0000\u00bb\r\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u00050\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be"+
		"\u00bf\u0003\u0012\t\u0000\u00bf\u00c0\u0006\u0007\uffff\uffff\u0000\u00c0"+
		"\u000f\u0001\u0000\u0000\u0000\u00c1\u00c5\u0005\"\u0000\u0000\u00c2\u00c4"+
		"\u0003\u0006\u0003\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00cb\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u001e\u000f\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005#\u0000\u0000\u00cf\u00d0\u0006\b\uffff\uffff\u0000\u00d0\u0011"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005$\u0000\u0000\u00d2\u00d8\u0006"+
		"\t\uffff\uffff\u0000\u00d3\u00d4\u0005%\u0000\u0000\u00d4\u00d8\u0006"+
		"\t\uffff\uffff\u0000\u00d5\u00d6\u0005&\u0000\u0000\u00d6\u00d8\u0006"+
		"\t\uffff\uffff\u0000\u00d7\u00d1\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d8\u0013\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0003(\u0014\u0000\u00da\u00db\u0006\n"+
		"\uffff\uffff\u0000\u00db\u00e0\u0001\u0000\u0000\u0000\u00dc\u00dd\u0003"+
		"\u0016\u000b\u0000\u00dd\u00de\u0006\n\uffff\uffff\u0000\u00de\u00e0\u0001"+
		"\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e0\u0015\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\'\u0000\u0000\u00e2\u00e6\u0005\"\u0000\u0000\u00e3\u00e5\u0003\u0006"+
		"\u0003\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0005#\u0000\u0000\u00ea\u00eb\u0006\u000b\uffff"+
		"\uffff\u0000\u00eb\u0017\u0001\u0000\u0000\u0000\u00ec\u00f2\u0003\u0002"+
		"\u0001\u0000\u00ed\u00ee\u0005\u0005\u0000\u0000\u00ee\u00ef\u0003\u0002"+
		"\u0001\u0000\u00ef\u00f0\u0005\u0006\u0000\u0000\u00f0\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ec\u0001\u0000\u0000\u0000\u00f1\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f9\u0005\u0018"+
		"\u0000\u0000\u00f4\u00fa\u0003\u0002\u0001\u0000\u00f5\u00f6\u0005\u0005"+
		"\u0000\u0000\u00f6\u00f7\u0003\u0002\u0001\u0000\u00f7\u00f8\u0005\u0006"+
		"\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0006\f\uffff\uffff\u0000\u00fc\u0019\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u001a\u0000\u0000\u00fe\u0103\u0003\u0002"+
		"\u0001\u0000\u00ff\u0100\u0005\u0016\u0000\u0000\u0100\u0102\u0003\u0002"+
		"\u0001\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0006\r\uffff\uffff\u0000\u0107\u001b\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005\u001b\u0000\u0000\u0109\u010e\u0003\u0002"+
		"\u0001\u0000\u010a\u010b\u0005\u0016\u0000\u0000\u010b\u010d\u0003\u0002"+
		"\u0001\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u0110\u0001\u0000"+
		"\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000"+
		"\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0006\u000e\uffff\uffff\u0000\u0112\u001d\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0003\"\u0011\u0000\u0114\u0115\u0006\u000f"+
		"\uffff\uffff\u0000\u0115\u0129\u0001\u0000\u0000\u0000\u0116\u0117\u0003"+
		" \u0010\u0000\u0117\u0118\u0006\u000f\uffff\uffff\u0000\u0118\u0129\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0003\u0018\f\u0000\u011a\u011b\u0006\u000f"+
		"\uffff\uffff\u0000\u011b\u0129\u0001\u0000\u0000\u0000\u011c\u011d\u0003"+
		"\u001c\u000e\u0000\u011d\u011e\u0006\u000f\uffff\uffff\u0000\u011e\u0129"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0003\u001a\r\u0000\u0120\u0121\u0006"+
		"\u000f\uffff\uffff\u0000\u0121\u0129\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0003$\u0012\u0000\u0123\u0124\u0006\u000f\uffff\uffff\u0000\u0124\u0129"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0003&\u0013\u0000\u0126\u0127\u0006"+
		"\u000f\uffff\uffff\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0113"+
		"\u0001\u0000\u0000\u0000\u0128\u0116\u0001\u0000\u0000\u0000\u0128\u0119"+
		"\u0001\u0000\u0000\u0000\u0128\u011c\u0001\u0000\u0000\u0000\u0128\u011f"+
		"\u0001\u0000\u0000\u0000\u0128\u0122\u0001\u0000\u0000\u0000\u0128\u0125"+
		"\u0001\u0000\u0000\u0000\u0129\u001f\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u001d\u0000\u0000\u012b\u012c\u0003\u0002\u0001\u0000\u012c\u0130"+
		"\u0005\"\u0000\u0000\u012d\u012f\u0003\u001e\u000f\u0000\u012e\u012d\u0001"+
		"\u0000\u0000\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u013a\u0001"+
		"\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0137\u0005"+
		"\u0019\u0000\u0000\u0134\u0136\u0003\u001e\u000f\u0000\u0135\u0134\u0001"+
		"\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013b\u0001"+
		"\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u0133\u0001"+
		"\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0005#\u0000\u0000\u013d\u013e\u0006\u0010"+
		"\uffff\uffff\u0000\u013e!\u0001\u0000\u0000\u0000\u013f\u0140\u0005\u001e"+
		"\u0000\u0000\u0140\u0141\u0003\u0002\u0001\u0000\u0141\u0145\u0005\"\u0000"+
		"\u0000\u0142\u0144\u0003\u001e\u000f\u0000\u0143\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148\u0001\u0000\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u0149\u0005#\u0000\u0000"+
		"\u0149\u014a\u0006\u0011\uffff\uffff\u0000\u014a#\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0005\u001f\u0000\u0000\u014c\u014d\u0003\u0002\u0001\u0000"+
		"\u014d\u014e\u0006\u0012\uffff\uffff\u0000\u014e%\u0001\u0000\u0000\u0000"+
		"\u014f\u015d\u00050\u0000\u0000\u0150\u0151\u0005\u0005\u0000\u0000\u0151"+
		"\u0156\u0003\u0002\u0001\u0000\u0152\u0153\u0005\u0016\u0000\u0000\u0153"+
		"\u0155\u0003\u0002\u0001\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155"+
		"\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158"+
		"\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u0006\u0000\u0000\u015a"+
		"\u015e\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0005\u0000\u0000\u015c"+
		"\u015e\u0005\u0006\u0000\u0000\u015d\u0150\u0001\u0000\u0000\u0000\u015d"+
		"\u015b\u0001\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f"+
		"\u0160\u0006\u0013\uffff\uffff\u0000\u0160\'\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005\u0001\u0000\u0000\u0162\u0163\u0005(\u0000\u0000\u0163\u0164"+
		"\u0005\u0017\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0003\n\u0005\u0000\u0166\u0167\u0005\u0002\u0000\u0000\u0167\u0168\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0006\u0014\uffff\uffff\u0000\u0169)\u0001"+
		"\u0000\u0000\u0000\u001d,.Mert\u007f\u0085\u0090\u009d\u00a5\u00af\u00b5"+
		"\u00c5\u00cb\u00d7\u00df\u00e6\u00f1\u00f9\u0103\u010e\u0128\u0130\u0137"+
		"\u013a\u0145\u0156\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}