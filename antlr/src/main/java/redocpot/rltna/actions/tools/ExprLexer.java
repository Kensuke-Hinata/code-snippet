// Generated from tools/Expr.g4 by ANTLR 4.7.1

package tools;
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
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, INT=8, ID=9, NEWLINE=10, 
		WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "INT", "ID", "LETTER", 
		"DIGIT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "INT", "ID", "NEWLINE", 
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\r]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\t\7\t/\n\t\f\t\16\t\62\13\t\5\t\64\n\t\3\n"+
		"\3\n\3\n\5\n9\n\n\3\n\3\n\3\n\7\n>\n\n\f\n\16\nA\13\n\3\n\3\n\3\n\3\n"+
		"\7\nG\n\n\f\n\16\nJ\13\n\5\nL\n\n\3\13\3\13\3\f\3\f\3\r\5\rS\n\r\3\r\3"+
		"\r\3\16\6\16X\n\16\r\16\16\16Y\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\2\27\2\31\f\33\r\3\2\7\3\2\63;\3\2\62;\4\2\60\60"+
		"aa\4\2C\\c|\5\2\13\f\17\17\"\"\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2"+
		"\t#\3\2\2\2\13%\3\2\2\2\r\'\3\2\2\2\17)\3\2\2\2\21\63\3\2\2\2\23K\3\2"+
		"\2\2\25M\3\2\2\2\27O\3\2\2\2\31R\3\2\2\2\33W\3\2\2\2\35\36\7?\2\2\36\4"+
		"\3\2\2\2\37 \7*\2\2 \6\3\2\2\2!\"\7+\2\2\"\b\3\2\2\2#$\7,\2\2$\n\3\2\2"+
		"\2%&\7\61\2\2&\f\3\2\2\2\'(\7-\2\2(\16\3\2\2\2)*\7/\2\2*\20\3\2\2\2+\64"+
		"\7\62\2\2,\60\t\2\2\2-/\t\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63+\3\2\2\2\63,\3\2\2\2\64\22\3\2"+
		"\2\2\658\7\60\2\2\669\5\25\13\2\679\t\4\2\28\66\3\2\2\28\67\3\2\2\29?"+
		"\3\2\2\2:>\5\25\13\2;>\5\27\f\2<>\t\4\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@L\3\2\2\2A?\3\2\2\2BH\5\25\13\2CG\5\25"+
		"\13\2DG\5\27\f\2EG\t\4\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2IL\3\2\2\2JH\3\2\2\2K\65\3\2\2\2KB\3\2\2\2L\24\3\2\2\2"+
		"MN\t\5\2\2N\26\3\2\2\2OP\t\3\2\2P\30\3\2\2\2QS\7\17\2\2RQ\3\2\2\2RS\3"+
		"\2\2\2ST\3\2\2\2TU\7\f\2\2U\32\3\2\2\2VX\t\6\2\2WV\3\2\2\2XY\3\2\2\2Y"+
		"W\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\16\2\2\\\34\3\2\2\2\r\2\60\638=?FH"+
		"KRY\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}