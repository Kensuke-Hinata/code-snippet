// Generated from Keywords.g4 by ANTLR 4.7.1

import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, CHAR=4, ID=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "CHAR", "ID", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "CHAR", "ID", "WS"
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


	    Map<String, Integer> Keywords = new HashMap<String, Integer>() {{
	        put("begin", KeywordsParser.BEGIN);
	        put("end", KeywordsParser.END);
	        put("if", KeywordsParser.IF);
	        put("then", KeywordsParser.THEN);
	        put("while", KeywordsParser.WHILE);
	    }};


	public KeywordsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Keywords.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 3:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 setText(String.valueOf(getText().charAt(1))); 
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			        if (Keywords.containsKey(getText())) {
			            setType(Keywords.get(getText()));
			        }
			    
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bK\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\4\7\4\33\n\4\f\4\16\4\36\13\4\5\4 \n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6*\n\6\3\6\3\6\3\6\7\6/\n\6\f\6\16\6\62\13\6\3\6\3\6\3"+
		"\6\3\6\7\68\n\6\f\6\16\6;\13\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\b\3\b\3\t\6"+
		"\tF\n\t\r\t\16\tG\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\b\3\2"+
		"\7\3\2\63;\3\2\62;\4\2\60\60aa\4\2C\\c|\5\2\13\f\17\17\"\"\2S\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\3\23"+
		"\3\2\2\2\5\25\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17"+
		"B\3\2\2\2\21E\3\2\2\2\23\24\7?\2\2\24\4\3\2\2\2\25\26\7=\2\2\26\6\3\2"+
		"\2\2\27 \7\62\2\2\30\34\t\2\2\2\31\33\t\3\2\2\32\31\3\2\2\2\33\36\3\2"+
		"\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\37\27\3\2\2"+
		"\2\37\30\3\2\2\2 \b\3\2\2\2!\"\7)\2\2\"#\13\2\2\2#$\7)\2\2$%\b\5\2\2%"+
		"\n\3\2\2\2&)\7\60\2\2\'*\5\r\7\2(*\t\4\2\2)\'\3\2\2\2)(\3\2\2\2*\60\3"+
		"\2\2\2+/\5\r\7\2,/\5\17\b\2-/\t\4\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61?\3\2\2\2\62\60\3\2\2\2\639\5\r\7"+
		"\2\648\5\r\7\2\658\5\17\b\2\668\t\4\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67"+
		"\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\b\6"+
		"\3\2=?\3\2\2\2>&\3\2\2\2>\63\3\2\2\2?\f\3\2\2\2@A\t\5\2\2A\16\3\2\2\2"+
		"BC\t\3\2\2C\20\3\2\2\2DF\t\6\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2"+
		"\2HI\3\2\2\2IJ\b\t\4\2J\22\3\2\2\2\f\2\34\37).\60\679>G\5\3\5\2\3\6\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}