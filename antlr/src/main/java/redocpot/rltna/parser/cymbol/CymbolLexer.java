// Generated from Cymbol.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, INT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "ID", "INT", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'float'", "'int'", "'void'", "'('", "')'", "','", 
		"'{'", "'}'", "'if'", "'then'", "'else'", "'return'", "'['", "']'", "'-'", 
		"'!'", "'*'", "'+'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
		"WS"
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


	public CymbolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cymbol.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\7\27{\n\27\f\27\16\27"+
		"~\13\27\3\30\3\30\3\30\7\30\u0083\n\30\f\30\16\30\u0086\13\30\5\30\u0088"+
		"\n\30\3\31\3\31\3\32\3\32\3\33\6\33\u008f\n\33\r\33\16\33\u0090\3\33\3"+
		"\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\32\3\2\6"+
		"\3\2\63;\3\2\62;\6\2C\\aac|\u0082\u0101\5\2\13\f\17\17\"\"\2\u0096\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\tA\3\2\2\2\13E\3\2\2\2"+
		"\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2"+
		"\2\31W\3\2\2\2\33\\\3\2\2\2\35a\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#l\3\2\2"+
		"\2%n\3\2\2\2\'p\3\2\2\2)r\3\2\2\2+t\3\2\2\2-w\3\2\2\2/\u0087\3\2\2\2\61"+
		"\u0089\3\2\2\2\63\u008b\3\2\2\2\65\u008e\3\2\2\2\678\7?\2\28\4\3\2\2\2"+
		"9:\7=\2\2:\6\3\2\2\2;<\7h\2\2<=\7n\2\2=>\7q\2\2>?\7c\2\2?@\7v\2\2@\b\3"+
		"\2\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\n\3\2\2\2EF\7x\2\2FG\7q\2\2GH\7k\2"+
		"\2HI\7f\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7+\2\2M\20\3\2\2\2NO\7."+
		"\2\2O\22\3\2\2\2PQ\7}\2\2Q\24\3\2\2\2RS\7\177\2\2S\26\3\2\2\2TU\7k\2\2"+
		"UV\7h\2\2V\30\3\2\2\2WX\7v\2\2XY\7j\2\2YZ\7g\2\2Z[\7p\2\2[\32\3\2\2\2"+
		"\\]\7g\2\2]^\7n\2\2^_\7u\2\2_`\7g\2\2`\34\3\2\2\2ab\7t\2\2bc\7g\2\2cd"+
		"\7v\2\2de\7w\2\2ef\7t\2\2fg\7p\2\2g\36\3\2\2\2hi\7]\2\2i \3\2\2\2jk\7"+
		"_\2\2k\"\3\2\2\2lm\7/\2\2m$\3\2\2\2no\7#\2\2o&\3\2\2\2pq\7,\2\2q(\3\2"+
		"\2\2rs\7-\2\2s*\3\2\2\2tu\7?\2\2uv\7?\2\2v,\3\2\2\2w|\5\61\31\2x{\5\61"+
		"\31\2y{\5\63\32\2zx\3\2\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}."+
		"\3\2\2\2~|\3\2\2\2\177\u0088\7\62\2\2\u0080\u0084\t\2\2\2\u0081\u0083"+
		"\t\3\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\177\3\2\2"+
		"\2\u0087\u0080\3\2\2\2\u0088\60\3\2\2\2\u0089\u008a\t\4\2\2\u008a\62\3"+
		"\2\2\2\u008b\u008c\t\3\2\2\u008c\64\3\2\2\2\u008d\u008f\t\5\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\33\2\2\u0093\66\3\2\2\2\b\2z|\u0084"+
		"\u0087\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}