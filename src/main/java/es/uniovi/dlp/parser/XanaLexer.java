// Generated from java-escape by ANTLR 4.11.1

package es.uniovi.dlp.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XanaLexer extends Lexer {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int MULTI_COMMENT = 1,
      INT_CONSTANT = 2,
      ID = 3,
      CHAR_CONSTANT = 4,
      REAL_CONSTANT = 5;
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {"MULTI_COMMENT", "INT_CONSTANT", "ID", "CHAR_CONSTANT", "REAL_CONSTANT"};
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {};
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null, "MULTI_COMMENT", "INT_CONSTANT", "ID", "CHAR_CONSTANT", "REAL_CONSTANT"
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

  public XanaLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @Override
  public String getGrammarFileName() {
    return "Xana.g4";
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
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\u0004\u0000\u0005\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"
          + "\u0010\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001"
          + "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001b\b\u0001\u000b"
          + "\u0001\f\u0001\u001c\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0005"
          + "\u0002#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"
          + "\u0003\u0003\u00031\b\u0003\u0003\u00033\b\u0003\u0001\u0003\u0001\u0003"
          + "\u0001\u0004\u0004\u00048\b\u0004\u000b\u0004\f\u00049\u0001\u0004\u0005"
          + "\u0004=\b\u0004\n\u0004\f\u0004@\t\u0004\u0001\u0004\u0001\u0004\u0003"
          + "\u0004D\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004H\b\u0004\n\u0004\f"
          + "\u0004K\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f"
          + "\u0004R\t\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f"
          + "\u0004Y\t\u0004\u0003\u0004[\b\u0004\u0001\u0011\u0000\u0005\u0001\u0001"
          + "\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u0001\u0000\u0006\u0001\u0000"
          + "09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000019\u0002\u0000EEe"
          + "e\u0002\u0000++--g\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"
          + "\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"
          + "\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0001\u000b\u0001\u0000"
          + "\u0000\u0000\u0003\u001a\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000"
          + "\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000\tZ\u0001\u0000\u0000\u0000"
          + "\u000b\f\u0005\"\u0000\u0000\f\r\u0005\"\u0000\u0000\r\u0011\u0001\u0000"
          + "\u0000\u0000\u000e\u0010\t\u0000\u0000\u0000\u000f\u000e\u0001\u0000\u0000"
          + "\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000"
          + "\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"
          + "\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\"\u0000\u0000"
          + "\u0015\u0016\u0005\"\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017"
          + "\u0018\u0006\u0000\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019"
          + "\u001b\u0007\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001b"
          + "\u001c\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c"
          + "\u001d\u0001\u0000\u0000\u0000\u001d\u0004\u0001\u0000\u0000\u0000\u001e"
          + " \u0007\u0001\u0000\u0000\u001f\u001e\u0001\u0000\u0000\u0000 $\u0001"
          + "\u0000\u0000\u0000!#\u0007\u0002\u0000\u0000\"!\u0001\u0000\u0000\u0000"
          + "#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"
          + "\u0000%\u0006\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'2\u0005"
          + "\'\u0000\u0000()\u0005\\\u0000\u0000)*\u0007\u0000\u0000\u0000*+\u0007"
          + "\u0000\u0000\u0000+3\u0007\u0000\u0000\u0000,-\u0005\\\u0000\u0000-1\u0005"
          + "n\u0000\u0000./\u0005\\\u0000\u0000/1\u0005t\u0000\u00000,\u0001\u0000"
          + "\u0000\u00000.\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u00002(\u0001"
          + "\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u0000"
          + "45\u0005\'\u0000\u00005\b\u0001\u0000\u0000\u000068\u0007\u0003\u0000"
          + "\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u000097\u0001\u0000"
          + "\u0000\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000;=\u0007"
          + "\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000"
          + "><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000\u0000"
          + "\u0000@>\u0001\u0000\u0000\u0000AC\u0007\u0004\u0000\u0000BD\u0007\u0005"
          + "\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001"
          + "\u0000\u0000\u0000EI\u0007\u0003\u0000\u0000FH\u0007\u0000\u0000\u0000"
          + "GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000"
          + "\u0000IJ\u0001\u0000\u0000\u0000J[\u0001\u0000\u0000\u0000KI\u0001\u0000"
          + "\u0000\u0000LP\u0007\u0003\u0000\u0000MO\u0007\u0000\u0000\u0000NM\u0001"
          + "\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000"
          + "PQ\u0001\u0000\u0000\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"
          + "\u0000SW\u0005.\u0000\u0000TV\u0007\u0000\u0000\u0000UT\u0001\u0000\u0000"
          + "\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"
          + "\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z7\u0001"
          + "\u0000\u0000\u0000ZL\u0001\u0000\u0000\u0000[\n\u0001\u0000\u0000\u0000"
          + "\u000f\u0000\u0011\u001c\u001f\"$029>CIPWZ\u0001\u0006\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
