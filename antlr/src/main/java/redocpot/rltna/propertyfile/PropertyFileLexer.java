// Generated from PropertyFile.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PropertyFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, STRING=4;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "ID", "LETTER", "DIGIT", "STRING", "ESC", "UNICODE", "HEX"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ID", "STRING"
	};
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


	public PropertyFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PropertyFile.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\6<\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\7\4\35\n\4\f\4\16\4 \13\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\7\7)\n\7\f\7\16\7,\13\7\3\7\3\7\3\b\3\b\3\b\5\b\63\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\2\2\13\3\3\5\4\7\5\t\2\13\2\r\6\17\2\21\2\23\2"+
		"\3\2\7\6\2C\\aac|\u0082\u0101\3\2\62;\4\2$$^^\n\2$$\61\61^^ddhhppttvv"+
		"\5\2\62;C\\c|\2;\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\3\25"+
		"\3\2\2\2\5\27\3\2\2\2\7\31\3\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r%\3\2\2\2\17"+
		"/\3\2\2\2\21\64\3\2\2\2\23:\3\2\2\2\25\26\7?\2\2\26\4\3\2\2\2\27\30\7"+
		"\f\2\2\30\6\3\2\2\2\31\36\5\t\5\2\32\35\5\t\5\2\33\35\5\13\6\2\34\32\3"+
		"\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\b\3\2"+
		"\2\2 \36\3\2\2\2!\"\t\2\2\2\"\n\3\2\2\2#$\t\3\2\2$\f\3\2\2\2%*\7$\2\2"+
		"&)\5\17\b\2\')\n\4\2\2(&\3\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+-\3\2\2\2,*\3\2\2\2-.\7$\2\2.\16\3\2\2\2/\62\7^\2\2\60\63\t\5\2\2"+
		"\61\63\5\21\t\2\62\60\3\2\2\2\62\61\3\2\2\2\63\20\3\2\2\2\64\65\7w\2\2"+
		"\65\66\5\23\n\2\66\67\5\23\n\2\678\5\23\n\289\5\23\n\29\22\3\2\2\2:;\t"+
		"\6\2\2;\24\3\2\2\2\b\2\34\36(*\62\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}