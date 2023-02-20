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
		MULTI_COMMENT=1, ONE_COMMENT=2, INT_CONSTANT=3, ID=4, CHAR_CONSTANT=5, 
		REAL_CONSTANT=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MULTI_COMMENT", "ONE_COMMENT", "INT_CONSTANT", "ID", "CHAR_CONSTANT", 
			"REAL_CONSTANT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'#'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MULTI_COMMENT", "ONE_COMMENT", "INT_CONSTANT", "ID", "CHAR_CONSTANT", 
			"REAL_CONSTANT"
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
		"\u0004\u0000\u0006b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0004\u0002!\b\u0002\u000b"+
		"\u0002\f\u0002\"\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0003\u0005\u0003"+
		")\b\u0003\n\u0003\f\u0003,\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00047\b\u0004\u0003\u00049\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0004\u0005>\b\u0005\u000b\u0005\f\u0005?\u0001\u0005\u0005\u0005"+
		"C\b\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"J\b\u0005\u0001\u0005\u0001\u0005\u0005\u0005N\b\u0005\n\u0005\f\u0005"+
		"Q\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005"+
		"X\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\\\b\u0005\n\u0005\f\u0005"+
		"_\t\u0005\u0003\u0005a\b\u0005\u0001\u0013\u0000\u0006\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\u0001\u0000\u0006\u0001"+
		"\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000019\u0002\u0000"+
		"EEee\u0002\u0000++--m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0001\r\u0001\u0000\u0000\u0000\u0003\u001b\u0001\u0000"+
		"\u0000\u0000\u0005 \u0001\u0000\u0000\u0000\u0007%\u0001\u0000\u0000\u0000"+
		"\t-\u0001\u0000\u0000\u0000\u000b`\u0001\u0000\u0000\u0000\r\u000e\u0005"+
		"\"\u0000\u0000\u000e\u000f\u0005\"\u0000\u0000\u000f\u0013\u0001\u0000"+
		"\u0000\u0000\u0010\u0012\t\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000"+
		"\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005\"\u0000\u0000"+
		"\u0017\u0018\u0005\"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0006\u0000\u0000\u0000\u001a\u0002\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005#\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e"+
		"\u0006\u0001\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f!\u0007"+
		"\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#\u0006\u0001"+
		"\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000\u0000"+
		"&*\u0001\u0000\u0000\u0000\')\u0007\u0002\u0000\u0000(\'\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+\b\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-8\u0005"+
		"\'\u0000\u0000./\u0005\\\u0000\u0000/0\u0007\u0000\u0000\u000001\u0007"+
		"\u0000\u0000\u000019\u0007\u0000\u0000\u000023\u0005\\\u0000\u000037\u0005"+
		"n\u0000\u000045\u0005\\\u0000\u000057\u0005t\u0000\u000062\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u00008.\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000"+
		":;\u0005\'\u0000\u0000;\n\u0001\u0000\u0000\u0000<>\u0007\u0003\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@D\u0001\u0000\u0000\u0000AC\u0007"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000GI\u0007\u0004\u0000\u0000HJ\u0007\u0005"+
		"\u0000\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000KO\u0007\u0003\u0000\u0000LN\u0007\u0000\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000Pa\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RV\u0007\u0003\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001"+
		"\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000Y]\u0005.\u0000\u0000Z\\\u0007\u0000\u0000\u0000[Z\u0001\u0000\u0000"+
		"\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000`=\u0001"+
		"\u0000\u0000\u0000`R\u0001\u0000\u0000\u0000a\f\u0001\u0000\u0000\u0000"+
		"\u000f\u0000\u0013\"%(*68?DIOV]`\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}