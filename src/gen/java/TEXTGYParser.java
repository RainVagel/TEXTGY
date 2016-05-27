// Generated from TEXTGY.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TEXTGYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, MUUTUJANIMI=31, 
		SONE=32, ARV=33, WS=34, KOMMENTAAR=35;
	public static final int
		RULE_programm = 0, RULE_lause = 1, RULE_omistamine = 2, RULE_tuup = 3, 
		RULE_avaldis = 4, RULE_avaldis2 = 5, RULE_avaldis3 = 6, RULE_atom = 7, 
		RULE_iflause = 8, RULE_whilelause = 9;
	public static final String[] ruleNames = {
		"programm", "lause", "omistamine", "tuup", "avaldis", "avaldis2", "avaldis3", 
		"atom", "iflause", "whilelause"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'var'", "':'", "'='", "'Boolean'", "'Integer'", "'Double'", 
		"'String'", "'+'", "'-'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", 
		"'AND'", "'OR'", "'NOT'", "'*'", "'/'", "'('", "')'", "'IF'", "'THEN'", 
		"'ELSE IF'", "'ELSE'", "'END'", "'WHILE'", "'DO'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MUUTUJANIMI", "SONE", "ARV", 
		"WS", "KOMMENTAAR"
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

	@Override
	public String getGrammarFileName() { return "TEXTGY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TEXTGYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgrammContext extends ParserRuleContext {
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public ProgrammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterProgramm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitProgramm(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__21) | (1L << T__23) | (1L << T__28) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				{
				setState(20);
				lause();
				setState(21);
				match(T__0);
				}
				}
				setState(27);
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

	public static class LauseContext extends ParserRuleContext {
		public OmistamineContext omistamine() {
			return getRuleContext(OmistamineContext.class,0);
		}
		public IflauseContext iflause() {
			return getRuleContext(IflauseContext.class,0);
		}
		public WhilelauseContext whilelause() {
			return getRuleContext(WhilelauseContext.class,0);
		}
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public LauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterLause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitLause(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lause);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				omistamine();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				iflause();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				whilelause();
				}
				break;
			case T__9:
			case T__21:
			case MUUTUJANIMI:
			case SONE:
			case ARV:
				enterOuterAlt(_localctx, 4);
				{
				setState(31);
				avaldis(0);
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

	public static class OmistamineContext extends ParserRuleContext {
		public TuupContext tuup() {
			return getRuleContext(TuupContext.class,0);
		}
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public OmistamineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_omistamine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterOmistamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitOmistamine(this);
		}
	}

	public final OmistamineContext omistamine() throws RecognitionException {
		OmistamineContext _localctx = new OmistamineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_omistamine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(35);
			match(T__2);
			setState(36);
			tuup();
			setState(37);
			match(MUUTUJANIMI);
			setState(38);
			match(T__3);
			setState(39);
			avaldis(0);
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

	public static class TuupContext extends ParserRuleContext {
		public TuupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTuup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTuup(this);
		}
	}

	public final TuupContext tuup() throws RecognitionException {
		TuupContext _localctx = new TuupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tuup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AvaldisContext extends ParserRuleContext {
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public AvaldisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAvaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAvaldis(this);
		}
	}

	public final AvaldisContext avaldis() throws RecognitionException {
		return avaldis(0);
	}

	private AvaldisContext avaldis(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AvaldisContext _localctx = new AvaldisContext(_ctx, _parentState);
		AvaldisContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_avaldis, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(44);
			avaldis2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(55);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AvaldisContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis);
						setState(46);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(47);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(48);
						avaldis(3);
						}
						break;
					case 2:
						{
						_localctx = new AvaldisContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(T__8);
						setState(51);
						avaldis2(0);
						}
						break;
					case 3:
						{
						_localctx = new AvaldisContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis);
						setState(52);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(53);
						match(T__9);
						setState(54);
						avaldis2(0);
						}
						break;
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Avaldis2Context extends ParserRuleContext {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public Avaldis2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAvaldis2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAvaldis2(this);
		}
	}

	public final Avaldis2Context avaldis2() throws RecognitionException {
		return avaldis2(0);
	}

	private Avaldis2Context avaldis2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis2Context _localctx = new Avaldis2Context(_ctx, _parentState);
		Avaldis2Context _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_avaldis2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			avaldis3();
			}
			_ctx.stop = _input.LT(-1);
			setState(71);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(69);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new Avaldis2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis2);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						match(T__19);
						setState(65);
						avaldis3();
						}
						break;
					case 2:
						{
						_localctx = new Avaldis2Context(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_avaldis2);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						match(T__20);
						setState(68);
						avaldis3();
						}
						break;
					}
					} 
				}
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Avaldis3Context extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Avaldis3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAvaldis3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAvaldis3(this);
		}
	}

	public final Avaldis3Context avaldis3() throws RecognitionException {
		Avaldis3Context _localctx = new Avaldis3Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_avaldis3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(74);
				match(T__9);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(89);
			switch (_input.LA(1)) {
			case SONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(SONE);
				}
				break;
			case MUUTUJANIMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(MUUTUJANIMI);
				}
				break;
			case ARV:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(ARV);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(T__21);
				setState(86);
				avaldis(0);
				setState(87);
				match(T__22);
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

	public static class IflauseContext extends ParserRuleContext {
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public List<ProgrammContext> programm() {
			return getRuleContexts(ProgrammContext.class);
		}
		public ProgrammContext programm(int i) {
			return getRuleContext(ProgrammContext.class,i);
		}
		public IflauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iflause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterIflause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitIflause(this);
		}
	}

	public final IflauseContext iflause() throws RecognitionException {
		IflauseContext _localctx = new IflauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_iflause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__23);
			setState(92);
			match(T__21);
			setState(93);
			avaldis(0);
			setState(94);
			match(T__22);
			setState(95);
			match(T__24);
			setState(96);
			programm();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__25) {
				{
				{
				setState(97);
				match(T__25);
				setState(98);
				match(T__21);
				setState(99);
				avaldis(0);
				setState(100);
				match(T__22);
				setState(101);
				match(T__24);
				setState(102);
				programm();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(109);
				match(T__26);
				setState(110);
				programm();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(T__27);
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

	public static class WhilelauseContext extends ParserRuleContext {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public ProgrammContext programm() {
			return getRuleContext(ProgrammContext.class,0);
		}
		public WhilelauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilelause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterWhilelause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitWhilelause(this);
		}
	}

	public final WhilelauseContext whilelause() throws RecognitionException {
		WhilelauseContext _localctx = new WhilelauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilelause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__28);
			setState(119);
			match(T__21);
			setState(120);
			avaldis(0);
			setState(121);
			match(T__22);
			setState(122);
			match(T__29);
			setState(123);
			programm();
			setState(124);
			match(T__27);
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
		case 4:
			return avaldis_sempred((AvaldisContext)_localctx, predIndex);
		case 5:
			return avaldis2_sempred((Avaldis2Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean avaldis_sempred(AvaldisContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean avaldis2_sempred(Avaldis2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0081\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\5\3#\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7H\n\7\f\7\16\7K\13\7\3\b\7\bN\n\b\f\b\16\bQ\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\7\nr\n\n\f\n\16\nu\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\2\4\n\f\f\2\4\6\b"+
		"\n\f\16\20\22\24\2\4\3\2\7\n\3\2\r\25\u0085\2\33\3\2\2\2\4\"\3\2\2\2\6"+
		"$\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f>\3\2\2\2\16O\3\2\2\2\20[\3\2\2\2\22"+
		"]\3\2\2\2\24x\3\2\2\2\26\27\5\4\3\2\27\30\7\3\2\2\30\32\3\2\2\2\31\26"+
		"\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33"+
		"\3\2\2\2\36#\5\6\4\2\37#\5\22\n\2 #\5\24\13\2!#\5\n\6\2\"\36\3\2\2\2\""+
		"\37\3\2\2\2\" \3\2\2\2\"!\3\2\2\2#\5\3\2\2\2$%\7\4\2\2%&\7\5\2\2&\'\5"+
		"\b\5\2\'(\7!\2\2()\7\6\2\2)*\5\n\6\2*\7\3\2\2\2+,\t\2\2\2,\t\3\2\2\2-"+
		".\b\6\1\2./\5\f\7\2/;\3\2\2\2\60\61\f\4\2\2\61\62\t\3\2\2\62:\5\n\6\5"+
		"\63\64\f\6\2\2\64\65\7\13\2\2\65:\5\f\7\2\66\67\f\5\2\2\678\7\f\2\28:"+
		"\5\f\7\29\60\3\2\2\29\63\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2"+
		"\2\2<\13\3\2\2\2=;\3\2\2\2>?\b\7\1\2?@\5\16\b\2@I\3\2\2\2AB\f\5\2\2BC"+
		"\7\26\2\2CH\5\16\b\2DE\f\4\2\2EF\7\27\2\2FH\5\16\b\2GA\3\2\2\2GD\3\2\2"+
		"\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2KI\3\2\2\2LN\7\f\2\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\5\20\t\2S\17"+
		"\3\2\2\2T\\\7\"\2\2U\\\7!\2\2V\\\7#\2\2WX\7\30\2\2XY\5\n\6\2YZ\7\31\2"+
		"\2Z\\\3\2\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2\\\21\3\2\2\2]^\7"+
		"\32\2\2^_\7\30\2\2_`\5\n\6\2`a\7\31\2\2ab\7\33\2\2bl\5\2\2\2cd\7\34\2"+
		"\2de\7\30\2\2ef\5\n\6\2fg\7\31\2\2gh\7\33\2\2hi\5\2\2\2ik\3\2\2\2jc\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2ms\3\2\2\2nl\3\2\2\2op\7\35\2\2pr"+
		"\5\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v"+
		"w\7\36\2\2w\23\3\2\2\2xy\7\37\2\2yz\7\30\2\2z{\5\n\6\2{|\7\31\2\2|}\7"+
		" \2\2}~\5\2\2\2~\177\7\36\2\2\177\25\3\2\2\2\f\33\"9;GIO[ls";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}