// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, MAIN=31, ONE_COMMENT=32, 
		WS=33, DIGIT=34, CHAR_CONSTANT=35, MANTISA=36, CHARACTER=37, LOGIC_OPERATOR=38, 
		REAL_CONSTANT=39, MULTI_COMMENT=40, ID=41, INT_CONSTANT=42;
	public static final int
		RULE_program = 0, RULE_arithmetic_operation = 1, RULE_expression = 2, 
		RULE_arithmetic_operator = 3, RULE_main_func = 4, RULE_field_acces = 5, 
		RULE_var_definition = 6, RULE_type = 7, RULE_func_definition = 8, RULE_param = 9, 
		RULE_func_body = 10, RULE_simple_type = 11, RULE_complex_type = 12, RULE_struct = 13, 
		RULE_comparison_operation = 14, RULE_logic_operattion = 15, RULE_assignation = 16, 
		RULE_write = 17, RULE_read = 18, RULE_statement = 19, RULE_if = 20, RULE_while = 21, 
		RULE_return = 22, RULE_cast = 23, RULE_oposite_operation = 24, RULE_atributte_access = 25, 
		RULE_invocation = 26, RULE_array = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "arithmetic_operation", "expression", "arithmetic_operator", 
			"main_func", "field_acces", "var_definition", "type", "func_definition", 
			"param", "func_body", "simple_type", "complex_type", "struct", "comparison_operation", 
			"logic_operattion", "assignation", "write", "read", "statement", "if", 
			"while", "return", "cast", "oposite_operation", "atributte_access", "invocation", 
			"array"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "')'", "'('", "'+'", "'-'", "'/'", "'*'", "'^'", "'%'", "'def'", 
			"'do'", "'end'", "'['", "']'", "','", "'::'", "'void'", "'char'", "'double'", 
			"'int'", "'defstruct'", "'='", "'puts'", "'in'", "'if'", "'else'", "'while'", 
			"'return'", "'as'", "'!'", "'.'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "MAIN", "ONE_COMMENT", "WS", 
			"DIGIT", "CHAR_CONSTANT", "MANTISA", "CHARACTER", "LOGIC_OPERATOR", "REAL_CONSTANT", 
			"MULTI_COMMENT", "ID", "INT_CONSTANT"
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
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(58);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(56);
						var_definition();
						}
						break;
					case T__8:
						{
						setState(57);
						func_definition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(63);
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
	public static class Arithmetic_operationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<InvocationContext> invocation() {
			return getRuleContexts(InvocationContext.class);
		}
		public InvocationContext invocation(int i) {
			return getRuleContext(InvocationContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public List<TerminalNode> REAL_CONSTANT() { return getTokens(XanaParser.REAL_CONSTANT); }
		public TerminalNode REAL_CONSTANT(int i) {
			return getToken(XanaParser.REAL_CONSTANT, i);
		}
		public List<Arithmetic_operatorContext> arithmetic_operator() {
			return getRuleContexts(Arithmetic_operatorContext.class);
		}
		public Arithmetic_operatorContext arithmetic_operator(int i) {
			return getRuleContext(Arithmetic_operatorContext.class,i);
		}
		public Arithmetic_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operation; }
	}

	public final Arithmetic_operationContext arithmetic_operation() throws RecognitionException {
		Arithmetic_operationContext _localctx = new Arithmetic_operationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_arithmetic_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				match(ID);
				}
				break;
			case 2:
				{
				setState(66);
				invocation();
				}
				break;
			case 3:
				{
				setState(67);
				match(INT_CONSTANT);
				}
				break;
			case 4:
				{
				setState(68);
				match(DIGIT);
				}
				break;
			case 5:
				{
				setState(69);
				match(REAL_CONSTANT);
				}
				break;
			}
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					arithmetic_operator();
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(73);
						match(ID);
						}
						break;
					case 2:
						{
						setState(74);
						invocation();
						}
						break;
					case 3:
						{
						setState(75);
						match(DIGIT);
						}
						break;
					case 4:
						{
						setState(76);
						match(INT_CONSTANT);
						}
						break;
					case 5:
						{
						setState(77);
						match(REAL_CONSTANT);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public List<Field_accesContext> field_acces() {
			return getRuleContexts(Field_accesContext.class);
		}
		public Field_accesContext field_acces(int i) {
			return getRuleContext(Field_accesContext.class,i);
		}
		public List<Arithmetic_operationContext> arithmetic_operation() {
			return getRuleContexts(Arithmetic_operationContext.class);
		}
		public Arithmetic_operationContext arithmetic_operation(int i) {
			return getRuleContext(Arithmetic_operationContext.class,i);
		}
		public List<Logic_operattionContext> logic_operattion() {
			return getRuleContexts(Logic_operattionContext.class);
		}
		public Logic_operattionContext logic_operattion(int i) {
			return getRuleContext(Logic_operattionContext.class,i);
		}
		public List<Comparison_operationContext> comparison_operation() {
			return getRuleContexts(Comparison_operationContext.class);
		}
		public Comparison_operationContext comparison_operation(int i) {
			return getRuleContext(Comparison_operationContext.class,i);
		}
		public List<CastContext> cast() {
			return getRuleContexts(CastContext.class);
		}
		public CastContext cast(int i) {
			return getRuleContext(CastContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<TerminalNode> CHARACTER() { return getTokens(XanaParser.CHARACTER); }
		public TerminalNode CHARACTER(int i) {
			return getToken(XanaParser.CHARACTER, i);
		}
		public List<TerminalNode> REAL_CONSTANT() { return getTokens(XanaParser.REAL_CONSTANT); }
		public TerminalNode REAL_CONSTANT(int i) {
			return getToken(XanaParser.REAL_CONSTANT, i);
		}
		public List<InvocationContext> invocation() {
			return getRuleContexts(InvocationContext.class);
		}
		public InvocationContext invocation(int i) {
			return getRuleContext(InvocationContext.class,i);
		}
		public List<TerminalNode> CHAR_CONSTANT() { return getTokens(XanaParser.CHAR_CONSTANT); }
		public TerminalNode CHAR_CONSTANT(int i) {
			return getToken(XanaParser.CHAR_CONSTANT, i);
		}
		public List<Oposite_operationContext> oposite_operation() {
			return getRuleContexts(Oposite_operationContext.class);
		}
		public Oposite_operationContext oposite_operation(int i) {
			return getRuleContext(Oposite_operationContext.class,i);
		}
		public List<TerminalNode> LOGIC_OPERATOR() { return getTokens(XanaParser.LOGIC_OPERATOR); }
		public TerminalNode LOGIC_OPERATOR(int i) {
			return getToken(XanaParser.LOGIC_OPERATOR, i);
		}
		public List<Arithmetic_operatorContext> arithmetic_operator() {
			return getRuleContexts(Arithmetic_operatorContext.class);
		}
		public Arithmetic_operatorContext arithmetic_operator(int i) {
			return getRuleContext(Arithmetic_operatorContext.class,i);
		}
		public List<Atributte_accessContext> atributte_access() {
			return getRuleContexts(Atributte_accessContext.class);
		}
		public Atributte_accessContext atributte_access(int i) {
			return getRuleContext(Atributte_accessContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(102);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(84);
						field_acces();
						}
						break;
					case 2:
						{
						setState(85);
						arithmetic_operation();
						}
						break;
					case 3:
						{
						setState(86);
						logic_operattion();
						}
						break;
					case 4:
						{
						setState(87);
						comparison_operation();
						}
						break;
					case 5:
						{
						setState(88);
						cast();
						}
						break;
					case 6:
						{
						setState(89);
						match(INT_CONSTANT);
						}
						break;
					case 7:
						{
						setState(90);
						match(DIGIT);
						}
						break;
					case 8:
						{
						setState(91);
						match(ID);
						}
						break;
					case 9:
						{
						setState(92);
						match(CHARACTER);
						}
						break;
					case 10:
						{
						setState(93);
						match(REAL_CONSTANT);
						}
						break;
					case 11:
						{
						setState(94);
						invocation();
						}
						break;
					case 12:
						{
						setState(95);
						match(CHAR_CONSTANT);
						}
						break;
					case 13:
						{
						setState(96);
						oposite_operation();
						}
						break;
					case 14:
						{
						setState(97);
						match(T__0);
						}
						break;
					case 15:
						{
						setState(98);
						match(T__1);
						}
						break;
					case 16:
						{
						setState(99);
						match(LOGIC_OPERATOR);
						}
						break;
					case 17:
						{
						setState(100);
						arithmetic_operator();
						}
						break;
					case 18:
						{
						setState(101);
						atributte_access();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Arithmetic_operatorContext extends ParserRuleContext {
		public Arithmetic_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic_operator; }
	}

	public final Arithmetic_operatorContext arithmetic_operator() throws RecognitionException {
		Arithmetic_operatorContext _localctx = new Arithmetic_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arithmetic_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 504L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Main_funcContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_main_func);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__8);
			setState(109);
			match(MAIN);
			setState(110);
			match(T__1);
			setState(111);
			match(T__0);
			setState(112);
			match(T__9);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					var_definition();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7611449606654L) != 0) {
				{
				{
				setState(119);
				statement();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__10);
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
	public static class Field_accesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<Atributte_accessContext> atributte_access() {
			return getRuleContexts(Atributte_accessContext.class);
		}
		public Atributte_accessContext atributte_access(int i) {
			return getRuleContext(Atributte_accessContext.class,i);
		}
		public List<InvocationContext> invocation() {
			return getRuleContexts(InvocationContext.class);
		}
		public InvocationContext invocation(int i) {
			return getRuleContext(InvocationContext.class,i);
		}
		public List<CastContext> cast() {
			return getRuleContexts(CastContext.class);
		}
		public CastContext cast(int i) {
			return getRuleContext(CastContext.class,i);
		}
		public List<Arithmetic_operationContext> arithmetic_operation() {
			return getRuleContexts(Arithmetic_operationContext.class);
		}
		public Arithmetic_operationContext arithmetic_operation(int i) {
			return getRuleContext(Arithmetic_operationContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<Field_accesContext> field_acces() {
			return getRuleContexts(Field_accesContext.class);
		}
		public Field_accesContext field_acces(int i) {
			return getRuleContext(Field_accesContext.class,i);
		}
		public Field_accesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_acces; }
	}

	public final Field_accesContext field_acces() throws RecognitionException {
		Field_accesContext _localctx = new Field_accesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_acces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				match(ID);
				}
				break;
			case 2:
				{
				setState(128);
				atributte_access();
				}
				break;
			case 3:
				{
				setState(129);
				invocation();
				}
				break;
			}
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(T__11);
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(133);
					cast();
					}
					break;
				case 2:
					{
					setState(134);
					arithmetic_operation();
					}
					break;
				case 3:
					{
					setState(135);
					match(DIGIT);
					}
					break;
				case 4:
					{
					setState(136);
					match(INT_CONSTANT);
					}
					break;
				case 5:
					{
					setState(137);
					atributte_access();
					}
					break;
				case 6:
					{
					setState(138);
					field_acces();
					}
					break;
				case 7:
					{
					setState(139);
					match(ID);
					}
					break;
				case 8:
					{
					setState(140);
					invocation();
					}
					break;
				}
				setState(143);
				match(T__12);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
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
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(148);
			match(ID);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(149);
				match(T__13);
				setState(150);
				match(ID);
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__14);
			setState(157);
			type();
			}
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
	public static class TypeContext extends ParserRuleContext {
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				simple_type();
				}
				break;
			case T__11:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				complex_type();
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
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
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
		enterRule(_localctx, 16, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__8);
			setState(164);
			match(ID);
			setState(165);
			match(T__1);
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(166);
				param();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(167);
					match(T__13);
					setState(168);
					param();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(T__0);
				}
				}
				break;
			case T__0:
				{
				setState(176);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179);
			match(T__14);
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
			case T__18:
				{
				setState(180);
				simple_type();
				}
				break;
			case T__15:
				{
				setState(181);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(184);
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
	public static class ParamContext extends ParserRuleContext {
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
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(T__14);
			setState(188);
			simple_type();
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
		enterRule(_localctx, 20, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__9);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					var_definition();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7611449606654L) != 0) {
				{
				{
				setState(197);
				statement();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(T__10);
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
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Complex_typeContext extends ParserRuleContext {
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
		enterRule(_localctx, 24, RULE_complex_type);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				array();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				struct();
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
		enterRule(_localctx, 26, RULE_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__19);
			setState(212);
			match(T__9);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(213);
				var_definition();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219);
			match(T__10);
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
	public static class Comparison_operationContext extends ParserRuleContext {
		public TerminalNode LOGIC_OPERATOR() { return getToken(XanaParser.LOGIC_OPERATOR, 0); }
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public Comparison_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operation; }
	}

	public final Comparison_operationContext comparison_operation() throws RecognitionException {
		Comparison_operationContext _localctx = new Comparison_operationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6614249635840L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(222);
			match(LOGIC_OPERATOR);
			setState(223);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 6614249635840L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class Logic_operattionContext extends ParserRuleContext {
		public List<InvocationContext> invocation() {
			return getRuleContexts(InvocationContext.class);
		}
		public InvocationContext invocation(int i) {
			return getRuleContext(InvocationContext.class,i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public List<TerminalNode> REAL_CONSTANT() { return getTokens(XanaParser.REAL_CONSTANT); }
		public TerminalNode REAL_CONSTANT(int i) {
			return getToken(XanaParser.REAL_CONSTANT, i);
		}
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public List<TerminalNode> LOGIC_OPERATOR() { return getTokens(XanaParser.LOGIC_OPERATOR); }
		public TerminalNode LOGIC_OPERATOR(int i) {
			return getToken(XanaParser.LOGIC_OPERATOR, i);
		}
		public Logic_operattionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_operattion; }
	}

	public final Logic_operattionContext logic_operattion() throws RecognitionException {
		Logic_operattionContext _localctx = new Logic_operattionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_logic_operattion);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(225);
				invocation();
				}
				break;
			case 2:
				{
				setState(226);
				match(INT_CONSTANT);
				}
				break;
			case 3:
				{
				setState(227);
				match(DIGIT);
				}
				break;
			case 4:
				{
				setState(228);
				match(REAL_CONSTANT);
				}
				break;
			case 5:
				{
				setState(229);
				match(ID);
				}
				break;
			}
			setState(240); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(232);
					match(LOGIC_OPERATOR);
					setState(238);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(233);
						invocation();
						}
						break;
					case 2:
						{
						setState(234);
						match(DIGIT);
						}
						break;
					case 3:
						{
						setState(235);
						match(INT_CONSTANT);
						}
						break;
					case 4:
						{
						setState(236);
						match(REAL_CONSTANT);
						}
						break;
					case 5:
						{
						setState(237);
						match(ID);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(242); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 32, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(244);
				expression();
				}
				break;
			case 2:
				{
				setState(245);
				match(T__1);
				setState(246);
				expression();
				setState(247);
				match(T__0);
				}
				break;
			}
			setState(251);
			match(T__20);
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(252);
				expression();
				}
				break;
			case 2:
				{
				setState(253);
				match(T__1);
				setState(254);
				expression();
				setState(255);
				match(T__0);
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
		enterRule(_localctx, 34, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__21);
			{
			setState(260);
			expression();
			}
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(261);
				match(T__13);
				setState(262);
				expression();
				}
				}
				setState(267);
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
		enterRule(_localctx, 36, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__22);
			{
			setState(269);
			expression();
			}
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(270);
				match(T__13);
				setState(271);
				expression();
				}
				}
				setState(276);
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
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				while_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				assignation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				read();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				write();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(282);
				return_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(283);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 40, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__23);
			setState(287);
			expression();
			setState(288);
			match(T__9);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7611449606654L) != 0) {
				{
				{
				setState(289);
				statement();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(295);
				match(T__24);
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7611449606654L) != 0) {
					{
					{
					setState(296);
					statement();
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(304);
			match(T__10);
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
		enterRule(_localctx, 42, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__25);
			setState(308); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(307);
				expression();
				}
				}
				setState(310); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 7611218919934L) != 0 );
			setState(312);
			match(T__9);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 7611449606654L) != 0) {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(T__10);
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
		enterRule(_localctx, 44, RULE_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(T__26);
			setState(322);
			expression();
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
	public static class CastContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CHAR_CONSTANT() { return getToken(XanaParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(XanaParser.ID, 0); }
		public Arithmetic_operationContext arithmetic_operation() {
			return getRuleContext(Arithmetic_operationContext.class,0);
		}
		public Field_accesContext field_acces() {
			return getRuleContext(Field_accesContext.class,0);
		}
		public Atributte_accessContext atributte_access() {
			return getRuleContext(Atributte_accessContext.class,0);
		}
		public TerminalNode REAL_CONSTANT() { return getToken(XanaParser.REAL_CONSTANT, 0); }
		public TerminalNode DIGIT() { return getToken(XanaParser.DIGIT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(XanaParser.INT_CONSTANT, 0); }
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(324);
				match(CHAR_CONSTANT);
				}
				break;
			case 2:
				{
				setState(325);
				match(ID);
				}
				break;
			case 3:
				{
				setState(326);
				arithmetic_operation();
				}
				break;
			case 4:
				{
				setState(327);
				field_acces();
				}
				break;
			case 5:
				{
				setState(328);
				atributte_access();
				}
				break;
			case 6:
				{
				setState(329);
				match(REAL_CONSTANT);
				}
				break;
			case 7:
				{
				setState(330);
				match(DIGIT);
				}
				break;
			case 8:
				{
				setState(331);
				match(INT_CONSTANT);
				}
				break;
			}
			setState(334);
			match(T__27);
			setState(335);
			type();
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
	public static class Oposite_operationContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Oposite_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oposite_operation; }
	}

	public final Oposite_operationContext oposite_operation() throws RecognitionException {
		Oposite_operationContext _localctx = new Oposite_operationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_oposite_operation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(T__28);
			setState(339); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(338);
					expression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(341); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Atributte_accessContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(XanaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(XanaParser.ID, i);
		}
		public Atributte_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributte_access; }
	}

	public final Atributte_accessContext atributte_access() throws RecognitionException {
		Atributte_accessContext _localctx = new Atributte_accessContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_atributte_access);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(T__29);
			setState(345);
			match(ID);
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
		enterRule(_localctx, 52, RULE_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ID);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				{
				setState(348);
				match(T__1);
				setState(349);
				expression();
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__13) {
					{
					{
					setState(350);
					match(T__13);
					setState(351);
					expression();
					}
					}
					setState(356);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(357);
				match(T__0);
				}
				}
				break;
			case 2:
				{
				{
				setState(359);
				match(T__1);
				setState(360);
				match(T__0);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(XanaParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(XanaParser.DIGIT, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(XanaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(XanaParser.INT_CONSTANT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(363);
					match(T__11);
					setState(364);
					_la = _input.LA(1);
					if ( !(_la==DIGIT || _la==INT_CONSTANT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(365);
					match(T__14);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(368); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			{
			setState(370);
			type();
			setState(371);
			match(T__12);
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

	public static final String _serializedATN =
		"\u0004\u0001*\u0176\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001O\b\u0001\u0004\u0001"+
		"Q\b\u0001\u000b\u0001\f\u0001R\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u0002g\b\u0002\u000b\u0002\f\u0002"+
		"h\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t\u0004"+
		"\u0001\u0004\u0005\u0004y\b\u0004\n\u0004\f\u0004|\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u008e\b\u0005\u0001\u0005"+
		"\u0004\u0005\u0091\b\u0005\u000b\u0005\f\u0005\u0092\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0098\b\u0006\n\u0006\f\u0006\u009b\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00a2\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"\u00aa\b\b\n\b\f\b\u00ad\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b2\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00b7\b\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00c1\b\n\n\n\f\n\u00c4\t\n"+
		"\u0001\n\u0005\n\u00c7\b\n\n\n\f\n\u00ca\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\f\u00d2\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u00d7\b\r\n\r\f\r\u00da\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00e7\b\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ef\b\u000f\u0004"+
		"\u000f\u00f1\b\u000f\u000b\u000f\f\u000f\u00f2\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fa\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0102\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u0108\b\u0011\n\u0011\f\u0011\u010b\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u0111\b\u0012\n\u0012\f\u0012\u0114\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u011d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0123\b\u0014\n\u0014\f\u0014\u0126\t\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u012a\b\u0014\n\u0014\f\u0014\u012d\t\u0014"+
		"\u0003\u0014\u012f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0004\u0015\u0135\b\u0015\u000b\u0015\f\u0015\u0136\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u013b\b\u0015\n\u0015\f\u0015\u013e\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u014d\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0004\u0018\u0154\b\u0018\u000b\u0018\f\u0018\u0155\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0161\b\u001a\n\u001a\f\u001a"+
		"\u0164\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u016a\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u016f\b"+
		"\u001b\u000b\u001b\f\u001b\u0170\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0000\u0000\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000\u0004\u0001\u0000"+
		"\u0003\b\u0001\u0000\u0011\u0013\u0002\u0000\"\")*\u0002\u0000\"\"**\u01ae"+
		"\u0000<\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004f"+
		"\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\bl\u0001\u0000"+
		"\u0000\u0000\n\u0082\u0001\u0000\u0000\u0000\f\u0094\u0001\u0000\u0000"+
		"\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00ba\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00cd\u0001\u0000\u0000\u0000\u0018\u00d1\u0001\u0000\u0000"+
		"\u0000\u001a\u00d3\u0001\u0000\u0000\u0000\u001c\u00dd\u0001\u0000\u0000"+
		"\u0000\u001e\u00e6\u0001\u0000\u0000\u0000 \u00f9\u0001\u0000\u0000\u0000"+
		"\"\u0103\u0001\u0000\u0000\u0000$\u010c\u0001\u0000\u0000\u0000&\u011c"+
		"\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*\u0132\u0001\u0000"+
		"\u0000\u0000,\u0141\u0001\u0000\u0000\u0000.\u014c\u0001\u0000\u0000\u0000"+
		"0\u0151\u0001\u0000\u0000\u00002\u0157\u0001\u0000\u0000\u00004\u015b"+
		"\u0001\u0000\u0000\u00006\u016e\u0001\u0000\u0000\u00008;\u0003\f\u0006"+
		"\u00009;\u0003\u0010\b\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0003"+
		"\b\u0004\u0000@\u0001\u0001\u0000\u0000\u0000AG\u0005)\u0000\u0000BG\u0003"+
		"4\u001a\u0000CG\u0005*\u0000\u0000DG\u0005\"\u0000\u0000EG\u0005\'\u0000"+
		"\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GP\u0001"+
		"\u0000\u0000\u0000HN\u0003\u0006\u0003\u0000IO\u0005)\u0000\u0000JO\u0003"+
		"4\u001a\u0000KO\u0005\"\u0000\u0000LO\u0005*\u0000\u0000MO\u0005\'\u0000"+
		"\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000NK\u0001\u0000"+
		"\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OQ\u0001"+
		"\u0000\u0000\u0000PH\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000"+
		"RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\u0003\u0001\u0000"+
		"\u0000\u0000Tg\u0003\n\u0005\u0000Ug\u0003\u0002\u0001\u0000Vg\u0003\u001e"+
		"\u000f\u0000Wg\u0003\u001c\u000e\u0000Xg\u0003.\u0017\u0000Yg\u0005*\u0000"+
		"\u0000Zg\u0005\"\u0000\u0000[g\u0005)\u0000\u0000\\g\u0005%\u0000\u0000"+
		"]g\u0005\'\u0000\u0000^g\u00034\u001a\u0000_g\u0005#\u0000\u0000`g\u0003"+
		"0\u0018\u0000ag\u0005\u0001\u0000\u0000bg\u0005\u0002\u0000\u0000cg\u0005"+
		"&\u0000\u0000dg\u0003\u0006\u0003\u0000eg\u00032\u0019\u0000fT\u0001\u0000"+
		"\u0000\u0000fU\u0001\u0000\u0000\u0000fV\u0001\u0000\u0000\u0000fW\u0001"+
		"\u0000\u0000\u0000fX\u0001\u0000\u0000\u0000fY\u0001\u0000\u0000\u0000"+
		"fZ\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000f\\\u0001\u0000\u0000"+
		"\u0000f]\u0001\u0000\u0000\u0000f^\u0001\u0000\u0000\u0000f_\u0001\u0000"+
		"\u0000\u0000f`\u0001\u0000\u0000\u0000fa\u0001\u0000\u0000\u0000fb\u0001"+
		"\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0007"+
		"\u0000\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005\t\u0000\u0000"+
		"mn\u0005\u001f\u0000\u0000no\u0005\u0002\u0000\u0000op\u0005\u0001\u0000"+
		"\u0000pt\u0005\n\u0000\u0000qs\u0003\f\u0006\u0000rq\u0001\u0000\u0000"+
		"\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uz\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wy\u0003"+
		"&\u0013\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}~\u0005\u000b\u0000\u0000~\t\u0001\u0000\u0000"+
		"\u0000\u007f\u0083\u0005)\u0000\u0000\u0080\u0083\u00032\u0019\u0000\u0081"+
		"\u0083\u00034\u001a\u0000\u0082\u007f\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0090"+
		"\u0001\u0000\u0000\u0000\u0084\u008d\u0005\f\u0000\u0000\u0085\u008e\u0003"+
		".\u0017\u0000\u0086\u008e\u0003\u0002\u0001\u0000\u0087\u008e\u0005\""+
		"\u0000\u0000\u0088\u008e\u0005*\u0000\u0000\u0089\u008e\u00032\u0019\u0000"+
		"\u008a\u008e\u0003\n\u0005\u0000\u008b\u008e\u0005)\u0000\u0000\u008c"+
		"\u008e\u00034\u001a\u0000\u008d\u0085\u0001\u0000\u0000\u0000\u008d\u0086"+
		"\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d\u0088"+
		"\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008d\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0005\r\u0000\u0000\u0090\u0084\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u000b\u0001\u0000\u0000\u0000\u0094\u0099\u0005"+
		")\u0000\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096\u0098\u0005)\u0000"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u009b\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\u000f\u0000\u0000\u009d\u009e\u0003\u000e\u0007"+
		"\u0000\u009e\r\u0001\u0000\u0000\u0000\u009f\u00a2\u0003\u0016\u000b\u0000"+
		"\u00a0\u00a2\u0003\u0018\f\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005\t\u0000\u0000\u00a4\u00a5\u0005)\u0000\u0000\u00a5\u00b1"+
		"\u0005\u0002\u0000\u0000\u00a6\u00ab\u0003\u0012\t\u0000\u00a7\u00a8\u0005"+
		"\u000e\u0000\u0000\u00a8\u00aa\u0003\u0012\t\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0001"+
		"\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005\u0001"+
		"\u0000\u0000\u00b1\u00a6\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b6\u0005\u000f"+
		"\u0000\u0000\u00b4\u00b7\u0003\u0016\u000b\u0000\u00b5\u00b7\u0005\u0010"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0014"+
		"\n\u0000\u00b9\u0011\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005)\u0000"+
		"\u0000\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u00bd\u0003\u0016\u000b"+
		"\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00c2\u0005\n\u0000\u0000"+
		"\u00bf\u00c1\u0003\f\u0006\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c8\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0003&\u0013\u0000\u00c6\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u000b\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0007\u0001\u0000\u0000\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf\u00d2"+
		"\u00036\u001b\u0000\u00d0\u00d2\u0003\u001a\r\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u0019\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u0014\u0000\u0000\u00d4\u00d8\u0005"+
		"\n\u0000\u0000\u00d5\u00d7\u0003\f\u0006\u0000\u00d6\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db\u0001\u0000"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u000b"+
		"\u0000\u0000\u00dc\u001b\u0001\u0000\u0000\u0000\u00dd\u00de\u0007\u0002"+
		"\u0000\u0000\u00de\u00df\u0005&\u0000\u0000\u00df\u00e0\u0007\u0002\u0000"+
		"\u0000\u00e0\u001d\u0001\u0000\u0000\u0000\u00e1\u00e7\u00034\u001a\u0000"+
		"\u00e2\u00e7\u0005*\u0000\u0000\u00e3\u00e7\u0005\"\u0000\u0000\u00e4"+
		"\u00e7\u0005\'\u0000\u0000\u00e5\u00e7\u0005)\u0000\u0000\u00e6\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e6\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00f0\u0001\u0000\u0000\u0000\u00e8\u00ee"+
		"\u0005&\u0000\u0000\u00e9\u00ef\u00034\u001a\u0000\u00ea\u00ef\u0005\""+
		"\u0000\u0000\u00eb\u00ef\u0005*\u0000\u0000\u00ec\u00ef\u0005\'\u0000"+
		"\u0000\u00ed\u00ef\u0005)\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u001f\u0001\u0000\u0000\u0000"+
		"\u00f4\u00fa\u0003\u0004\u0002\u0000\u00f5\u00f6\u0005\u0002\u0000\u0000"+
		"\u00f6\u00f7\u0003\u0004\u0002\u0000\u00f7\u00f8\u0005\u0001\u0000\u0000"+
		"\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fb\u0101\u0005\u0015\u0000\u0000\u00fc\u0102\u0003\u0004\u0002\u0000"+
		"\u00fd\u00fe\u0005\u0002\u0000\u0000\u00fe\u00ff\u0003\u0004\u0002\u0000"+
		"\u00ff\u0100\u0005\u0001\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00fc\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000"+
		"\u0102!\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0016\u0000\u0000\u0104"+
		"\u0109\u0003\u0004\u0002\u0000\u0105\u0106\u0005\u000e\u0000\u0000\u0106"+
		"\u0108\u0003\u0004\u0002\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0001\u0000\u0000\u0000\u010a#\u0001\u0000\u0000\u0000\u010b\u0109"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0017\u0000\u0000\u010d\u0112"+
		"\u0003\u0004\u0002\u0000\u010e\u010f\u0005\u000e\u0000\u0000\u010f\u0111"+
		"\u0003\u0004\u0002\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113%\u0001\u0000\u0000\u0000\u0114\u0112\u0001"+
		"\u0000\u0000\u0000\u0115\u011d\u0003*\u0015\u0000\u0116\u011d\u0003(\u0014"+
		"\u0000\u0117\u011d\u0003 \u0010\u0000\u0118\u011d\u0003$\u0012\u0000\u0119"+
		"\u011d\u0003\"\u0011\u0000\u011a\u011d\u0003,\u0016\u0000\u011b\u011d"+
		"\u00034\u001a\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c\u0116\u0001"+
		"\u0000\u0000\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011c\u0118\u0001"+
		"\u0000\u0000\u0000\u011c\u0119\u0001\u0000\u0000\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\'\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\u0018\u0000\u0000\u011f\u0120\u0003\u0004"+
		"\u0002\u0000\u0120\u0124\u0005\n\u0000\u0000\u0121\u0123\u0003&\u0013"+
		"\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000"+
		"\u0000\u0125\u012e\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000"+
		"\u0000\u0127\u012b\u0005\u0019\u0000\u0000\u0128\u012a\u0003&\u0013\u0000"+
		"\u0129\u0128\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u0127\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u000b\u0000\u0000"+
		"\u0131)\u0001\u0000\u0000\u0000\u0132\u0134\u0005\u001a\u0000\u0000\u0133"+
		"\u0135\u0003\u0004\u0002\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138"+
		"\u013c\u0005\n\u0000\u0000\u0139\u013b\u0003&\u0013\u0000\u013a\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005\u000b\u0000\u0000\u0140+\u0001\u0000\u0000\u0000\u0141\u0142\u0005"+
		"\u001b\u0000\u0000\u0142\u0143\u0003\u0004\u0002\u0000\u0143-\u0001\u0000"+
		"\u0000\u0000\u0144\u014d\u0005#\u0000\u0000\u0145\u014d\u0005)\u0000\u0000"+
		"\u0146\u014d\u0003\u0002\u0001\u0000\u0147\u014d\u0003\n\u0005\u0000\u0148"+
		"\u014d\u00032\u0019\u0000\u0149\u014d\u0005\'\u0000\u0000\u014a\u014d"+
		"\u0005\"\u0000\u0000\u014b\u014d\u0005*\u0000\u0000\u014c\u0144\u0001"+
		"\u0000\u0000\u0000\u014c\u0145\u0001\u0000\u0000\u0000\u014c\u0146\u0001"+
		"\u0000\u0000\u0000\u014c\u0147\u0001\u0000\u0000\u0000\u014c\u0148\u0001"+
		"\u0000\u0000\u0000\u014c\u0149\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001"+
		"\u0000\u0000\u0000\u014e\u014f\u0005\u001c\u0000\u0000\u014f\u0150\u0003"+
		"\u000e\u0007\u0000\u0150/\u0001\u0000\u0000\u0000\u0151\u0153\u0005\u001d"+
		"\u0000\u0000\u0152\u0154\u0003\u0004\u0002\u0000\u0153\u0152\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u01561\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005)\u0000\u0000\u0158\u0159\u0005\u001e\u0000\u0000"+
		"\u0159\u015a\u0005)\u0000\u0000\u015a3\u0001\u0000\u0000\u0000\u015b\u0169"+
		"\u0005)\u0000\u0000\u015c\u015d\u0005\u0002\u0000\u0000\u015d\u0162\u0003"+
		"\u0004\u0002\u0000\u015e\u015f\u0005\u000e\u0000\u0000\u015f\u0161\u0003"+
		"\u0004\u0002\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0161\u0164\u0001"+
		"\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001"+
		"\u0000\u0000\u0000\u0163\u0165\u0001\u0000\u0000\u0000\u0164\u0162\u0001"+
		"\u0000\u0000\u0000\u0165\u0166\u0005\u0001\u0000\u0000\u0166\u016a\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0005\u0002\u0000\u0000\u0168\u016a\u0005"+
		"\u0001\u0000\u0000\u0169\u015c\u0001\u0000\u0000\u0000\u0169\u0167\u0001"+
		"\u0000\u0000\u0000\u016a5\u0001\u0000\u0000\u0000\u016b\u016c\u0005\f"+
		"\u0000\u0000\u016c\u016d\u0007\u0003\u0000\u0000\u016d\u016f\u0005\u000f"+
		"\u0000\u0000\u016e\u016b\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000"+
		"\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0173\u0003\u000e"+
		"\u0007\u0000\u0173\u0174\u0005\r\u0000\u0000\u01747\u0001\u0000\u0000"+
		"\u0000\':<FNRfhtz\u0082\u008d\u0092\u0099\u00a1\u00ab\u00b1\u00b6\u00c2"+
		"\u00c8\u00d1\u00d8\u00e6\u00ee\u00f2\u00f9\u0101\u0109\u0112\u011c\u0124"+
		"\u012b\u012e\u0136\u013c\u014c\u0155\u0162\u0169\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}