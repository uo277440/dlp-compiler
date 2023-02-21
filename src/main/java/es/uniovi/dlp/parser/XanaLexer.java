// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MULTI_COMMENT=1, ONE_COMMENT=2, WS=3, INT_CONSTANT=4, ID=5, CHAR_CONSTANT=6, 
		MANTISA=7, REAL_CONSTANT=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTI_COMMENT", "ONE_COMMENT", "WS", "INT_CONSTANT", "ID", "CHAR_CONSTANT", 
			"MANTISA", "REAL_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_COMMENT", "ONE_COMMENT", "WS", "INT_CONSTANT", "ID", "CHAR_CONSTANT", 
			"MANTISA", "REAL_CONSTANT"
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


	public XanaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Xana.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\b\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0017\b\u0000\n\u0000\f\u0000\u001a\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0005\u0001$\b\u0001\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004"+
		"\u00030\b\u0003\u000b\u0003\f\u00031\u0001\u0004\u0003\u00045\b\u0004"+
		"\u0001\u0004\u0005\u00048\b\u0004\n\u0004\f\u0004;\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005"+
		"\u0001\u0005\u0003\u0005K\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0003\u0006Q\b\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0007\u0004\u0007[\b\u0007\u000b"+
		"\u0007\f\u0007\\\u0001\u0007\u0005\u0007`\b\u0007\n\u0007\f\u0007c\t\u0007"+
		"\u0001\u0007\u0003\u0007f\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"j\b\u0007\n\u0007\f\u0007m\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"q\b\u0007\n\u0007\f\u0007t\t\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007|\b\u0007\n\u0007\f\u0007\u007f"+
		"\t\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007\u0003\u0007\u0084\b\u0007"+
		"\u0001\u0018\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0001\u0000\b\u0002\u0000\n\n\r\r\u0003"+
		"\u0000\t\n\r\r  \u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002"+
		"\u0000EEee\u0002\u0000++--\u0001\u000019\u0098\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000"+
		"\u0003!\u0001\u0000\u0000\u0000\u0005*\u0001\u0000\u0000\u0000\u0007/"+
		"\u0001\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b<\u0001\u0000"+
		"\u0000\u0000\rN\u0001\u0000\u0000\u0000\u000f\u0083\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0005\"\u0000\u0000\u0012\u0013\u0005\"\u0000\u0000"+
		"\u0013\u0014\u0005\"\u0000\u0000\u0014\u0018\u0001\u0000\u0000\u0000\u0015"+
		"\u0017\t\u0000\u0000\u0000\u0016\u0015\u0001\u0000\u0000\u0000\u0017\u001a"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0018\u0016"+
		"\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000\u001a\u0018"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0005\"\u0000\u0000\u001c\u001d\u0005"+
		"\"\u0000\u0000\u001d\u001e\u0005\"\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f \u0006\u0000\u0000\u0000 \u0002\u0001\u0000\u0000\u0000"+
		"!%\u0005#\u0000\u0000\"$\b\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000"+
		"$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0006\u0001"+
		"\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0007\u0001\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,-\u0006\u0002\u0000\u0000-\u0006\u0001\u0000"+
		"\u0000\u0000.0\u0007\u0002\u0000\u0000/.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"2\b\u0001\u0000\u0000\u000035\u0007\u0003\u0000\u000043\u0001\u0000\u0000"+
		"\u000059\u0001\u0000\u0000\u000068\u0007\u0004\u0000\u000076\u0001\u0000"+
		"\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001"+
		"\u0000\u0000\u0000:\n\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		"<J\u0005\'\u0000\u0000=>\u0005\\\u0000\u0000>?\u0007\u0002\u0000\u0000"+
		"?@\u0007\u0002\u0000\u0000@K\u0007\u0002\u0000\u0000AB\u0005\\\u0000\u0000"+
		"BH\u0005n\u0000\u0000CD\u0005\\\u0000\u0000DH\u0005t\u0000\u0000EF\u0005"+
		"\\\u0000\u0000FH\u0005r\u0000\u0000GA\u0001\u0000\u0000\u0000GC\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IK\t\u0000\u0000\u0000J=\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\'\u0000\u0000"+
		"M\f\u0001\u0000\u0000\u0000NP\u0007\u0005\u0000\u0000OQ\u0007\u0006\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RV\u0007\u0007\u0000\u0000SU\u0007\u0002\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000W\u000e\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000Y[\u0007\u0007\u0000\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]a\u0001\u0000\u0000\u0000^`\u0007\u0002\u0000\u0000_^\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000df\u0003"+
		"\r\u0006\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0084"+
		"\u0001\u0000\u0000\u0000gk\u0007\u0007\u0000\u0000hj\u0007\u0002\u0000"+
		"\u0000ih\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000nr\u0005.\u0000\u0000oq\u0007\u0002\u0000\u0000po\u0001"+
		"\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000"+
		"\u0000uw\u0003\r\u0006\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000w\u0084\u0001\u0000\u0000\u0000xy\u0005.\u0000\u0000y}\u0007\u0007"+
		"\u0000\u0000z|\u0007\u0002\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0003\r\u0006\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083Z\u0001"+
		"\u0000\u0000\u0000\u0083g\u0001\u0000\u0000\u0000\u0083x\u0001\u0000\u0000"+
		"\u0000\u0084\u0010\u0001\u0000\u0000\u0000\u0014\u0000\u0018%1479GJPV"+
		"\\aekrv}\u0081\u0083\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}