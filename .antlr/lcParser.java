// Generated from /home2/users/alumnes/1251062/dades/linux/LP/Practica/lc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, LLETRA=6;
	public static final int
		RULE_root = 0, RULE_terme = 1, RULE_abstraccio = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "terme", "abstraccio"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'\u03BB'", "'\\'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "LLETRA"
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
	public String getGrammarFileName() { return "lc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TermeContext terme() {
			return getRuleContext(TermeContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			terme(0);
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

	public static class TermeContext extends ParserRuleContext {
		public TermeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terme; }
	 
		public TermeContext() { }
		public void copyFrom(TermeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends TermeContext {
		public TermeContext terme() {
			return getRuleContext(TermeContext.class,0);
		}
		public ParentesisContext(TermeContext ctx) { copyFrom(ctx); }
	}
	public static class LletraContext extends TermeContext {
		public TerminalNode LLETRA() { return getToken(lcParser.LLETRA, 0); }
		public LletraContext(TermeContext ctx) { copyFrom(ctx); }
	}
	public static class AbsContext extends TermeContext {
		public AbstraccioContext abstraccio() {
			return getRuleContext(AbstraccioContext.class,0);
		}
		public AbsContext(TermeContext ctx) { copyFrom(ctx); }
	}
	public static class AplicacioContext extends TermeContext {
		public List<TermeContext> terme() {
			return getRuleContexts(TermeContext.class);
		}
		public TermeContext terme(int i) {
			return getRuleContext(TermeContext.class,i);
		}
		public AplicacioContext(TermeContext ctx) { copyFrom(ctx); }
	}

	public final TermeContext terme() throws RecognitionException {
		return terme(0);
	}

	private TermeContext terme(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermeContext _localctx = new TermeContext(_ctx, _parentState);
		TermeContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_terme, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(9);
				match(T__0);
				setState(10);
				terme(0);
				setState(11);
				match(T__1);
				}
				break;
			case T__2:
			case T__3:
				{
				_localctx = new AbsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				abstraccio();
				}
				break;
			case LLETRA:
				{
				_localctx = new LletraContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(LLETRA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(21);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AplicacioContext(new TermeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_terme);
					setState(17);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(18);
					terme(4);
					}
					} 
				}
				setState(23);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class AbstraccioContext extends ParserRuleContext {
		public TerminalNode LLETRA() { return getToken(lcParser.LLETRA, 0); }
		public TermeContext terme() {
			return getRuleContext(TermeContext.class,0);
		}
		public AbstraccioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstraccio; }
	}

	public final AbstraccioContext abstraccio() throws RecognitionException {
		AbstraccioContext _localctx = new AbstraccioContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abstraccio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(25);
			match(LLETRA);
			setState(26);
			match(T__4);
			setState(27);
			terme(0);
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
			return terme_sempred((TermeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean terme_sempred(TermeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\22\n\3\3\3\3\3\7\3"+
		"\26\n\3\f\3\16\3\31\13\3\3\4\3\4\3\4\3\4\3\4\3\4\2\3\4\5\2\4\6\2\3\3\2"+
		"\5\6\2\37\2\b\3\2\2\2\4\21\3\2\2\2\6\32\3\2\2\2\b\t\5\4\3\2\t\3\3\2\2"+
		"\2\n\13\b\3\1\2\13\f\7\3\2\2\f\r\5\4\3\2\r\16\7\4\2\2\16\22\3\2\2\2\17"+
		"\22\5\6\4\2\20\22\7\b\2\2\21\n\3\2\2\2\21\17\3\2\2\2\21\20\3\2\2\2\22"+
		"\27\3\2\2\2\23\24\f\5\2\2\24\26\5\4\3\6\25\23\3\2\2\2\26\31\3\2\2\2\27"+
		"\25\3\2\2\2\27\30\3\2\2\2\30\5\3\2\2\2\31\27\3\2\2\2\32\33\t\2\2\2\33"+
		"\34\7\b\2\2\34\35\7\7\2\2\35\36\5\4\3\2\36\7\3\2\2\2\4\21\27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}