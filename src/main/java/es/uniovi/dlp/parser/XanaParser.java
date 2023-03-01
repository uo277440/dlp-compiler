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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		MAIN=32, DEF=33, DO=34, END=35, CHAR=36, DOUBLE=37, INT=38, DEFSTRUCT=39, 
		INT_CONSTANT=40, ONE_COMMENT=41, WS=42, CHAR_CONSTANT=43, MANTISA=44, 
		CHARACTER=45, REAL_CONSTANT=46, MULTI_COMMENT=47, ID=48;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_main_func = 2, RULE_var_definition = 3, 
		RULE_type = 4, RULE_func_definition = 5, RULE_func_body = 6, RULE_simple_type = 7, 
		RULE_complex_type = 8, RULE_struct = 9, RULE_assignation = 10, RULE_write = 11, 
		RULE_read = 12, RULE_statement = 13, RULE_if = 14, RULE_while = 15, RULE_return = 16, 
		RULE_invocation = 17, RULE_array = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expression", "main_func", "var_definition", "type", "func_definition", 
			"func_body", "simple_type", "complex_type", "struct", "assignation", 
			"write", "read", "statement", "if", "while", "return", "invocation", 
			"array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'as'", "'!'", "'('", "')'", "'>'", "'<'", "'!='", 
			"'=='", "'<='", "'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'*'", "'^'", 
			"'%'", "'.'", "','", "'::'", "'void'", "'='", "'puts'", "'in'", "'if'", 
			"'else'", "'while'", "'return'", "'main'", "'def'", "'do'", "'end'", 
			"'char'", "'double'", "'int'", "'defstruct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "MAIN", "DEF", "DO", 
			"END", "CHAR", "DOUBLE", "INT", "DEFSTRUCT", "INT_CONSTANT", "ONE_COMMENT", 
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
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(40);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(38);
						var_definition();
						}
						break;
					case DEF:
						{
						setState(39);
						func_definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(45);
			main_func();
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
		public Token INT_CONSTANT;
		public Token ID;
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(48);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast =  new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1);
				}
				break;
			case 2:
				{
				setState(50);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast =  new Id(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1);
				}
				break;
			case 3:
				{
				setState(52);
				match(REAL_CONSTANT);
				}
				break;
			case 4:
				{
				setState(53);
				invocation();
				}
				break;
			case 5:
				{
				setState(54);
				match(CHAR_CONSTANT);
				}
				break;
			case 6:
				{
				setState(55);
				match(T__3);
				setState(56);
				expression(6);
				}
				break;
			case 7:
				{
				setState(57);
				match(T__4);
				setState(58);
				expression(0);
				setState(59);
				match(T__5);
				}
				break;
			case 8:
				{
				setState(61);
				match(T__15);
				setState(62);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(66);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(67);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(69);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(72);
						match(T__20);
						setState(73);
						expression(3);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(74);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(79); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(75);
								match(T__0);
								setState(76);
								expression(0);
								setState(77);
								match(T__1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(81); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(84);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
						case 1:
							{
							setState(83);
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
						setState(86);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(87);
						match(T__2);
						setState(88);
						simple_type();
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public TerminalNode DEF() { return getToken(XanaParser.DEF, 0); }
		public TerminalNode MAIN() { return getToken(XanaParser.MAIN, 0); }
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
			setState(94);
			((Main_funcContext)_localctx).DEF = match(DEF);
			setState(95);
			match(MAIN);
			setState(96);
			match(T__4);
			setState(97);
			match(T__5);
			setState(98);
			match(DO);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					var_definition();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743016591408L) != 0) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(END);
			((Main_funcContext)_localctx).ast =  new FunctionDefinition(((Main_funcContext)_localctx).DEF.getLine(),((Main_funcContext)_localctx).DEF.getCharPositionInLine() + 1);
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
			setState(114);
			((Var_definitionContext)_localctx).ID = match(ID);
			((Var_definitionContext)_localctx).ids.add(((Var_definitionContext)_localctx).ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(115);
				match(T__21);
				setState(116);
				((Var_definitionContext)_localctx).ID = match(ID);
				((Var_definitionContext)_localctx).ids.add(((Var_definitionContext)_localctx).ID);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(T__22);
			setState(123);
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
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case DOUBLE:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((TypeContext)_localctx).simple_type = simple_type();
				((TypeContext)_localctx).ast =  ((TypeContext)_localctx).simple_type.ast;
				}
				break;
			case T__0:
			case DEFSTRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
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
		public TerminalNode DEF() { return getToken(XanaParser.DEF, 0); }
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public List<Simple_typeContext> simple_type() {
			return getRuleContexts(Simple_typeContext.class);
		}
		public Simple_typeContext simple_type(int i) {
			return getRuleContext(Simple_typeContext.class,i);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(DEF);
			setState(136);
			match(ID);
			setState(137);
			match(T__4);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				{
				setState(138);
				match(ID);
				setState(139);
				match(T__22);
				setState(140);
				simple_type();
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(142);
					match(T__21);
					{
					setState(143);
					match(ID);
					setState(144);
					match(T__22);
					setState(145);
					simple_type();
					}
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(151);
				match(T__5);
				}
				}
				break;
			case T__5:
				{
				setState(153);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			match(T__22);
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case DOUBLE:
			case INT:
				{
				setState(157);
				simple_type();
				}
				break;
			case T__23:
				{
				setState(158);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(161);
			func_body();
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
		enterRule(_localctx, 12, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(DO);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(164);
					var_definition();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743016591408L) != 0) {
				{
				{
				setState(170);
				statement();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(END);
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
		enterRule(_localctx, 14, RULE_simple_type);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((Simple_typeContext)_localctx).CHAR = match(CHAR);
				((Simple_typeContext)_localctx).ast =  new Char(((Simple_typeContext)_localctx).CHAR.getLine(),((Simple_typeContext)_localctx).CHAR.getCharPositionInLine() + 1);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				((Simple_typeContext)_localctx).DOUBLE = match(DOUBLE);
				((Simple_typeContext)_localctx).ast =  new DoubleType(((Simple_typeContext)_localctx).DOUBLE.getLine(),((Simple_typeContext)_localctx).DOUBLE.getCharPositionInLine() + 1);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		enterRule(_localctx, 16, RULE_complex_type);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				((Complex_typeContext)_localctx).array = array();
				((Complex_typeContext)_localctx).ast =  new Array(((Complex_typeContext)_localctx).array.ast.getLine(),((Complex_typeContext)_localctx).array.ast.getColumn());
				}
				break;
			case DEFSTRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				((Complex_typeContext)_localctx).struct = struct();
				((Complex_typeContext)_localctx).ast =  new Struct(((Complex_typeContext)_localctx).struct.ast.getLine(),((Complex_typeContext)_localctx).struct.ast.getColumn());
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
		enterRule(_localctx, 18, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			((StructContext)_localctx).DEFSTRUCT = match(DEFSTRUCT);
			setState(195);
			match(DO);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(196);
				var_definition();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(END);
			((StructContext)_localctx).ast =  new Struct(((StructContext)_localctx).DEFSTRUCT.getLine(),((StructContext)_localctx).DEFSTRUCT.getCharPositionInLine() + 1);
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
		enterRule(_localctx, 20, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(205);
				expression(0);
				}
				break;
			case 2:
				{
				setState(206);
				match(T__4);
				setState(207);
				expression(0);
				setState(208);
				match(T__5);
				}
				break;
			}
			setState(212);
			match(T__24);
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(213);
				expression(0);
				}
				break;
			case 2:
				{
				setState(214);
				match(T__4);
				setState(215);
				expression(0);
				setState(216);
				match(T__5);
				}
				break;
			}
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
		enterRule(_localctx, 22, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__25);
			{
			setState(221);
			expression(0);
			}
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(222);
				match(T__21);
				setState(223);
				expression(0);
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 24, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__26);
			{
			setState(230);
			expression(0);
			}
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(231);
				match(T__21);
				setState(232);
				expression(0);
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
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
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
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
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				while_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				assignation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				read();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				write();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				invocation();
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
	public static class IfContext extends ParserRuleContext {
		public If ast;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__27);
			setState(248);
			expression(0);
			setState(249);
			match(DO);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743016591408L) != 0) {
				{
				{
				setState(250);
				statement();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(256);
				match(T__28);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743016591408L) != 0) {
					{
					{
					setState(257);
					statement();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
			match(END);
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
	public static class WhileContext extends ParserRuleContext {
		public While ast;
		public TerminalNode DO() { return getToken(XanaParser.DO, 0); }
		public TerminalNode END() { return getToken(XanaParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__29);
			setState(269); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(268);
				expression(0);
				}
				}
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 361739325603888L) != 0 );
			setState(273);
			match(DO);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 361743016591408L) != 0) {
				{
				{
				setState(274);
				statement();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(END);
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
	public static class ReturnContext extends ParserRuleContext {
		public Return ast;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__30);
			setState(283);
			expression(0);
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
		enterRule(_localctx, 34, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ID);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				{
				setState(286);
				match(T__4);
				setState(287);
				expression(0);
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(288);
					match(T__21);
					setState(289);
					expression(0);
					}
					}
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(295);
				match(T__5);
				}
				}
				break;
			case 2:
				{
				{
				setState(297);
				match(T__4);
				setState(298);
				match(T__5);
				}
				}
				break;
			}
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
		public Token INT_CONSTANT;
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ArrayContext> array() {
			return getRuleContexts(ArrayContext.class);
		}
		public ArrayContext array(int i) {
			return getRuleContext(ArrayContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(301);
			match(T__0);
			setState(302);
			((ArrayContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
			setState(303);
			match(T__22);
			}
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					array();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			{
			setState(311);
			type();
			setState(312);
			match(T__1);
			}
			((ArrayContext)_localctx).ast =  new Array(((ArrayContext)_localctx).INT_CONSTANT.getLine(),((ArrayContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1);
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
		"\u0004\u00010\u013d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001@\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001P\b\u0001"+
		"\u000b\u0001\f\u0001Q\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001Z\b\u0001\n\u0001\f\u0001]\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002e\b\u0002\n\u0002\f\u0002h\t\u0002\u0001\u0002\u0005\u0002k\b\u0002"+
		"\n\u0002\f\u0002n\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0086\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00a0\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00a6\b\u0006\n\u0006\f\u0006\u00a9\t\u0006\u0001\u0006"+
		"\u0005\u0006\u00ac\b\u0006\n\u0006\f\u0006\u00af\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00b9\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00c1\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u00c6\b\t"+
		"\n\t\f\t\u00c9\t\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00d3\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00db\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00e1\b\u000b\n\u000b\f\u000b\u00e4\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ea\b\f\n\f\f\f\u00ed\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f6\b\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00fc\b\u000e\n\u000e\f\u000e\u00ff"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0103\b\u000e\n\u000e\f\u000e"+
		"\u0106\t\u000e\u0003\u000e\u0108\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0004\u000f\u010e\b\u000f\u000b\u000f\f\u000f\u010f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0114\b\u000f\n\u000f\f\u000f\u0117"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0123"+
		"\b\u0011\n\u0011\f\u0011\u0126\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u012c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0133\b\u0012\n\u0012\f\u0012\u0136"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0000\u0001\u0002\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0001\u0000"+
		"\u0007\u000e\u0001\u0000\u000f\u0014\u0158\u0000*\u0001\u0000\u0000\u0000"+
		"\u0002?\u0001\u0000\u0000\u0000\u0004^\u0001\u0000\u0000\u0000\u0006r"+
		"\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000\u0000\n\u0087\u0001"+
		"\u0000\u0000\u0000\f\u00a3\u0001\u0000\u0000\u0000\u000e\u00b8\u0001\u0000"+
		"\u0000\u0000\u0010\u00c0\u0001\u0000\u0000\u0000\u0012\u00c2\u0001\u0000"+
		"\u0000\u0000\u0014\u00d2\u0001\u0000\u0000\u0000\u0016\u00dc\u0001\u0000"+
		"\u0000\u0000\u0018\u00e5\u0001\u0000\u0000\u0000\u001a\u00f5\u0001\u0000"+
		"\u0000\u0000\u001c\u00f7\u0001\u0000\u0000\u0000\u001e\u010b\u0001\u0000"+
		"\u0000\u0000 \u011a\u0001\u0000\u0000\u0000\"\u011d\u0001\u0000\u0000"+
		"\u0000$\u012d\u0001\u0000\u0000\u0000&)\u0003\u0006\u0003\u0000\')\u0003"+
		"\n\u0005\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000),"+
		"\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0003\u0004"+
		"\u0002\u0000.\u0001\u0001\u0000\u0000\u0000/0\u0006\u0001\uffff\uffff"+
		"\u000001\u0005(\u0000\u00001@\u0006\u0001\uffff\uffff\u000023\u00050\u0000"+
		"\u00003@\u0006\u0001\uffff\uffff\u00004@\u0005.\u0000\u00005@\u0003\""+
		"\u0011\u00006@\u0005+\u0000\u000078\u0005\u0004\u0000\u00008@\u0003\u0002"+
		"\u0001\u00069:\u0005\u0005\u0000\u0000:;\u0003\u0002\u0001\u0000;<\u0005"+
		"\u0006\u0000\u0000<@\u0001\u0000\u0000\u0000=>\u0005\u0010\u0000\u0000"+
		">@\u0003\u0002\u0001\u0001?/\u0001\u0000\u0000\u0000?2\u0001\u0000\u0000"+
		"\u0000?4\u0001\u0000\u0000\u0000?5\u0001\u0000\u0000\u0000?6\u0001\u0000"+
		"\u0000\u0000?7\u0001\u0000\u0000\u0000?9\u0001\u0000\u0000\u0000?=\u0001"+
		"\u0000\u0000\u0000@[\u0001\u0000\u0000\u0000AB\n\u0004\u0000\u0000BC\u0007"+
		"\u0000\u0000\u0000CZ\u0003\u0002\u0001\u0005DE\n\u0003\u0000\u0000EF\u0007"+
		"\u0001\u0000\u0000FZ\u0003\u0002\u0001\u0004GH\n\u0002\u0000\u0000HI\u0005"+
		"\u0015\u0000\u0000IZ\u0003\u0002\u0001\u0003JO\n\r\u0000\u0000KL\u0005"+
		"\u0001\u0000\u0000LM\u0003\u0002\u0001\u0000MN\u0005\u0002\u0000\u0000"+
		"NP\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000"+
		"\u0000\u0000SU\u0003\u0002\u0001\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UZ\u0001\u0000\u0000\u0000VW\n\f\u0000\u0000WX\u0005"+
		"\u0003\u0000\u0000XZ\u0003\u000e\u0007\u0000YA\u0001\u0000\u0000\u0000"+
		"YD\u0001\u0000\u0000\u0000YG\u0001\u0000\u0000\u0000YJ\u0001\u0000\u0000"+
		"\u0000YV\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000"+
		"\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0003\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000^_\u0005!\u0000\u0000_`\u0005 \u0000\u0000`"+
		"a\u0005\u0005\u0000\u0000ab\u0005\u0006\u0000\u0000bf\u0005\"\u0000\u0000"+
		"ce\u0003\u0006\u0003\u0000dc\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gl\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ik\u0003\u001a\r\u0000ji\u0001\u0000"+
		"\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mo\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"op\u0005#\u0000\u0000pq\u0006\u0002\uffff\uffff\u0000q\u0005\u0001\u0000"+
		"\u0000\u0000rw\u00050\u0000\u0000st\u0005\u0016\u0000\u0000tv\u00050\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000z{\u0005\u0017\u0000\u0000{|\u0003\b\u0004\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0006\u0003\uffff\uffff\u0000~\u0007\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0003\u000e\u0007\u0000\u0080\u0081\u0006\u0004"+
		"\uffff\uffff\u0000\u0081\u0086\u0001\u0000\u0000\u0000\u0082\u0083\u0003"+
		"\u0010\b\u0000\u0083\u0084\u0006\u0004\uffff\uffff\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0082\u0001"+
		"\u0000\u0000\u0000\u0086\t\u0001\u0000\u0000\u0000\u0087\u0088\u0005!"+
		"\u0000\u0000\u0088\u0089\u00050\u0000\u0000\u0089\u009a\u0005\u0005\u0000"+
		"\u0000\u008a\u008b\u00050\u0000\u0000\u008b\u008c\u0005\u0017\u0000\u0000"+
		"\u008c\u008d\u0003\u000e\u0007\u0000\u008d\u0094\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0005\u0016\u0000\u0000\u008f\u0090\u00050\u0000\u0000\u0090"+
		"\u0091\u0005\u0017\u0000\u0000\u0091\u0093\u0003\u000e\u0007\u0000\u0092"+
		"\u008e\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095"+
		"\u0097\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0005\u0006\u0000\u0000\u0098\u009b\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0005\u0006\u0000\u0000\u009a\u008a\u0001\u0000\u0000\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009f\u0005\u0017\u0000\u0000\u009d\u00a0\u0003\u000e\u0007\u0000\u009e"+
		"\u00a0\u0005\u0018\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0003\f\u0006\u0000\u00a2\u000b\u0001\u0000\u0000\u0000\u00a3\u00a7"+
		"\u0005\"\u0000\u0000\u00a4\u00a6\u0003\u0006\u0003\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00ad\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003"+
		"\u001a\r\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0005#\u0000\u0000\u00b1\r\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005$\u0000\u0000\u00b3\u00b9\u0006\u0007\uffff\uffff"+
		"\u0000\u00b4\u00b5\u0005%\u0000\u0000\u00b5\u00b9\u0006\u0007\uffff\uffff"+
		"\u0000\u00b6\u00b7\u0005&\u0000\u0000\u00b7\u00b9\u0006\u0007\uffff\uffff"+
		"\u0000\u00b8\u00b2\u0001\u0000\u0000\u0000\u00b8\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0003$\u0012\u0000\u00bb\u00bc\u0006\b\uffff\uffff"+
		"\u0000\u00bc\u00c1\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u0012\t\u0000"+
		"\u00be\u00bf\u0006\b\uffff\uffff\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c1\u0011\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\'\u0000\u0000\u00c3"+
		"\u00c7\u0005\"\u0000\u0000\u00c4\u00c6\u0003\u0006\u0003\u0000\u00c5\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005#\u0000\u0000\u00cb\u00cc\u0006\t\uffff\uffff\u0000\u00cc\u0013"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d3\u0003\u0002\u0001\u0000\u00ce\u00cf"+
		"\u0005\u0005\u0000\u0000\u00cf\u00d0\u0003\u0002\u0001\u0000\u00d0\u00d1"+
		"\u0005\u0006\u0000\u0000\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd"+
		"\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00da\u0005\u0019\u0000\u0000\u00d5\u00db"+
		"\u0003\u0002\u0001\u0000\u00d6\u00d7\u0005\u0005\u0000\u0000\u00d7\u00d8"+
		"\u0003\u0002\u0001\u0000\u00d8\u00d9\u0005\u0006\u0000\u0000\u00d9\u00db"+
		"\u0001\u0000\u0000\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00da\u00d6"+
		"\u0001\u0000\u0000\u0000\u00db\u0015\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0005\u001a\u0000\u0000\u00dd\u00e2\u0003\u0002\u0001\u0000\u00de\u00df"+
		"\u0005\u0016\u0000\u0000\u00df\u00e1\u0003\u0002\u0001\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u0017"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u001b\u0000\u0000\u00e6\u00eb\u0003\u0002\u0001\u0000\u00e7\u00e8"+
		"\u0005\u0016\u0000\u0000\u00e8\u00ea\u0003\u0002\u0001\u0000\u00e9\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u0019"+
		"\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f6"+
		"\u0003\u001e\u000f\u0000\u00ef\u00f6\u0003\u001c\u000e\u0000\u00f0\u00f6"+
		"\u0003\u0014\n\u0000\u00f1\u00f6\u0003\u0018\f\u0000\u00f2\u00f6\u0003"+
		"\u0016\u000b\u0000\u00f3\u00f6\u0003 \u0010\u0000\u00f4\u00f6\u0003\""+
		"\u0011\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f5\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f0\u0001\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u001b\u0001\u0000"+
		"\u0000\u0000\u00f7\u00f8\u0005\u001c\u0000\u0000\u00f8\u00f9\u0003\u0002"+
		"\u0001\u0000\u00f9\u00fd\u0005\"\u0000\u0000\u00fa\u00fc\u0003\u001a\r"+
		"\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fe\u0107\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000"+
		"\u0000\u0100\u0104\u0005\u001d\u0000\u0000\u0101\u0103\u0003\u001a\r\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000"+
		"\u0104\u0102\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000"+
		"\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000"+
		"\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a\u0005#\u0000\u0000\u010a"+
		"\u001d\u0001\u0000\u0000\u0000\u010b\u010d\u0005\u001e\u0000\u0000\u010c"+
		"\u010e\u0003\u0002\u0001\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e"+
		"\u010f\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111"+
		"\u0115\u0005\"\u0000\u0000\u0112\u0114\u0003\u001a\r\u0000\u0113\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118"+
		"\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005#\u0000\u0000\u0119\u001f\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"\u001f\u0000\u0000\u011b\u011c\u0003\u0002\u0001\u0000\u011c!\u0001\u0000"+
		"\u0000\u0000\u011d\u012b\u00050\u0000\u0000\u011e\u011f\u0005\u0005\u0000"+
		"\u0000\u011f\u0124\u0003\u0002\u0001\u0000\u0120\u0121\u0005\u0016\u0000"+
		"\u0000\u0121\u0123\u0003\u0002\u0001\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000"+
		"\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0006\u0000"+
		"\u0000\u0128\u012c\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0005\u0000"+
		"\u0000\u012a\u012c\u0005\u0006\u0000\u0000\u012b\u011e\u0001\u0000\u0000"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012c#\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005\u0001\u0000\u0000\u012e\u012f\u0005(\u0000\u0000\u012f"+
		"\u0130\u0005\u0017\u0000\u0000\u0130\u0134\u0001\u0000\u0000\u0000\u0131"+
		"\u0133\u0003$\u0012\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133\u0136"+
		"\u0001\u0000\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0134"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0003\b\u0004\u0000\u0138\u0139\u0005"+
		"\u0002\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013b\u0006"+
		"\u0012\uffff\uffff\u0000\u013b%\u0001\u0000\u0000\u0000 (*?QTY[flw\u0085"+
		"\u0094\u009a\u009f\u00a7\u00ad\u00b8\u00c0\u00c7\u00d2\u00da\u00e2\u00eb"+
		"\u00f5\u00fd\u0104\u0107\u010f\u0115\u0124\u012b\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}