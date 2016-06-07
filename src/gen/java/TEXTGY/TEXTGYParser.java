// Generated from TEXTGY.g4 by ANTLR 4.5.3
package TEXTGY;
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		FUNKTSIOONINIMI=53, MUUTUJANIMI=54, SONE=55, ARV=56, WS=57, KOMMENTAAR=58;
	public static final int
		RULE_programm = 0, RULE_lausetejada = 1, RULE_lause = 2, RULE_tagastuslause = 3, 
		RULE_omistamine = 4, RULE_muutujadeklaratsioon = 5, RULE_tuup = 6, RULE_iflause = 7, 
		RULE_whilelause = 8, RULE_alterlause = 9, RULE_altertegevus = 10, RULE_hastegevus = 11, 
		RULE_addtegevus = 12, RULE_removetegevus = 13, RULE_changetegevus = 14, 
		RULE_objektiloomine = 15, RULE_funktsiooniloomine = 16, RULE_objektituup = 17, 
		RULE_objektiparameetrid = 18, RULE_avaldis = 19, RULE_avaldis5 = 20, RULE_avaldis4 = 21, 
		RULE_avaldis3 = 22, RULE_avaldis2 = 23, RULE_avaldis1 = 24, RULE_avaldis0 = 25;
	public static final String[] ruleNames = {
		"programm", "lausetejada", "lause", "tagastuslause", "omistamine", "muutujadeklaratsioon", 
		"tuup", "iflause", "whilelause", "alterlause", "altertegevus", "hastegevus", 
		"addtegevus", "removetegevus", "changetegevus", "objektiloomine", "funktsiooniloomine", 
		"objektituup", "objektiparameetrid", "avaldis", "avaldis5", "avaldis4", 
		"avaldis3", "avaldis2", "avaldis1", "avaldis0"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'return'", "'='", "'var'", "':'", "'Boolean'", "'Integer'", 
		"'Double'", "'String'", "'IF'", "'('", "')'", "'THEN'", "'ELSE IF'", "'ELSE'", 
		"'END'", "'WHILE'", "'DO'", "'ALTER'", "'HAS'", "'ITEM'", "','", "'SKILL'", 
		"'ATTRIBUTE'", "'ADD'", "'REMOVE'", "'CHANGE'", "'+'", "'-'", "'DESCRIPTION'", 
		"'CREATE'", "'NEW'", "'OBJECT'", "'AS'", "'TYPE'", "'WITH'", "'FUNCTION'", 
		"'->'", "'Creature'", "'Item'", "'Room'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'AND'", "'OR'", "'NOT'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "FUNKTSIOONINIMI", "MUUTUJANIMI", "SONE", 
		"ARV", "WS", "KOMMENTAAR"
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
		public LausetejadaContext lausetejada() {
			return getRuleContext(LausetejadaContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			lausetejada();
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

	public static class LausetejadaContext extends ParserRuleContext {
		public List<LauseContext> lause() {
			return getRuleContexts(LauseContext.class);
		}
		public LauseContext lause(int i) {
			return getRuleContext(LauseContext.class,i);
		}
		public LausetejadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lausetejada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterLausetejada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitLausetejada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitLausetejada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LausetejadaContext lausetejada() throws RecognitionException {
		LausetejadaContext _localctx = new LausetejadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lausetejada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__18) | (1L << T__28) | (1L << T__30) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				{
				setState(54);
				lause();
				setState(55);
				match(T__0);
				}
				}
				setState(61);
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
		public ObjektiloomineContext objektiloomine() {
			return getRuleContext(ObjektiloomineContext.class,0);
		}
		public FunktsiooniloomineContext funktsiooniloomine() {
			return getRuleContext(FunktsiooniloomineContext.class,0);
		}
		public AlterlauseContext alterlause() {
			return getRuleContext(AlterlauseContext.class,0);
		}
		public MuutujadeklaratsioonContext muutujadeklaratsioon() {
			return getRuleContext(MuutujadeklaratsioonContext.class,0);
		}
		public TagastuslauseContext tagastuslause() {
			return getRuleContext(TagastuslauseContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitLause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LauseContext lause() throws RecognitionException {
		LauseContext _localctx = new LauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lause);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				omistamine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				iflause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				whilelause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				avaldis();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				objektiloomine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				funktsiooniloomine();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				alterlause();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				muutujadeklaratsioon();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				tagastuslause();
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

	public static class TagastuslauseContext extends ParserRuleContext {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public TagastuslauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagastuslause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTagastuslause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTagastuslause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTagastuslause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagastuslauseContext tagastuslause() throws RecognitionException {
		TagastuslauseContext _localctx = new TagastuslauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tagastuslause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__1);
			setState(74);
			avaldis();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitOmistamine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmistamineContext omistamine() throws RecognitionException {
		OmistamineContext _localctx = new OmistamineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_omistamine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(MUUTUJANIMI);
			setState(77);
			match(T__2);
			setState(78);
			avaldis();
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

	public static class MuutujadeklaratsioonContext extends ParserRuleContext {
		public TuupContext tuup() {
			return getRuleContext(TuupContext.class,0);
		}
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public MuutujadeklaratsioonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_muutujadeklaratsioon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterMuutujadeklaratsioon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitMuutujadeklaratsioon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitMuutujadeklaratsioon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MuutujadeklaratsioonContext muutujadeklaratsioon() throws RecognitionException {
		MuutujadeklaratsioonContext _localctx = new MuutujadeklaratsioonContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_muutujadeklaratsioon);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__3);
				setState(81);
				match(T__4);
				setState(82);
				tuup();
				setState(83);
				match(MUUTUJANIMI);
				setState(86);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(84);
					match(T__2);
					setState(85);
					avaldis();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__3);
				setState(89);
				match(MUUTUJANIMI);
				setState(90);
				match(T__2);
				setState(91);
				avaldis();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTuup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuupContext tuup() throws RecognitionException {
		TuupContext _localctx = new TuupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tuup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitIflause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IflauseContext iflause() throws RecognitionException {
		IflauseContext _localctx = new IflauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_iflause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__9);
			setState(97);
			match(T__10);
			setState(98);
			avaldis();
			setState(99);
			match(T__11);
			setState(100);
			match(T__12);
			setState(101);
			programm();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(102);
				match(T__13);
				setState(103);
				match(T__10);
				setState(104);
				avaldis();
				setState(105);
				match(T__11);
				setState(106);
				match(T__12);
				setState(107);
				programm();
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(114);
				match(T__14);
				setState(115);
				programm();
				}
			}

			setState(118);
			match(T__15);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitWhilelause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilelauseContext whilelause() throws RecognitionException {
		WhilelauseContext _localctx = new WhilelauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_whilelause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__16);
			setState(121);
			match(T__10);
			setState(122);
			avaldis();
			setState(123);
			match(T__11);
			setState(124);
			match(T__17);
			setState(125);
			programm();
			setState(126);
			match(T__15);
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

	public static class AlterlauseContext extends ParserRuleContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public AltertegevusContext altertegevus() {
			return getRuleContext(AltertegevusContext.class,0);
		}
		public AlterlauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterlause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAlterlause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAlterlause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAlterlause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterlauseContext alterlause() throws RecognitionException {
		AlterlauseContext _localctx = new AlterlauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alterlause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__18);
			setState(129);
			match(MUUTUJANIMI);
			setState(130);
			altertegevus();
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

	public static class AltertegevusContext extends ParserRuleContext {
		public HastegevusContext hastegevus() {
			return getRuleContext(HastegevusContext.class,0);
		}
		public AddtegevusContext addtegevus() {
			return getRuleContext(AddtegevusContext.class,0);
		}
		public RemovetegevusContext removetegevus() {
			return getRuleContext(RemovetegevusContext.class,0);
		}
		public ChangetegevusContext changetegevus() {
			return getRuleContext(ChangetegevusContext.class,0);
		}
		public AltertegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altertegevus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAltertegevus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAltertegevus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAltertegevus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltertegevusContext altertegevus() throws RecognitionException {
		AltertegevusContext _localctx = new AltertegevusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_altertegevus);
		try {
			setState(136);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				hastegevus();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				addtegevus();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				removetegevus();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				changetegevus();
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

	public static class HastegevusContext extends ParserRuleContext {
		public HastegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastegevus; }
	 
		public HastegevusContext() { }
		public void copyFrom(HastegevusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HasItemContext extends HastegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public HasItemContext(HastegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterHasItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitHasItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitHasItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HasSkillContext extends HastegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public HasSkillContext(HastegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterHasSkill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitHasSkill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitHasSkill(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HasAttributeContext extends HastegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public HasAttributeContext(HastegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterHasAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitHasAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitHasAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastegevusContext hastegevus() throws RecognitionException {
		HastegevusContext _localctx = new HastegevusContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hastegevus);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new HasItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__19);
				setState(139);
				match(T__20);
				setState(140);
				match(T__10);
				setState(141);
				match(MUUTUJANIMI);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(142);
					match(T__21);
					setState(143);
					match(MUUTUJANIMI);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new HasSkillContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__19);
				setState(151);
				match(T__22);
				setState(152);
				match(T__10);
				setState(153);
				match(MUUTUJANIMI);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(154);
					match(T__21);
					setState(155);
					match(MUUTUJANIMI);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new HasAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(T__19);
				setState(163);
				match(T__23);
				setState(164);
				match(T__10);
				setState(165);
				match(MUUTUJANIMI);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(166);
					match(T__21);
					setState(167);
					match(MUUTUJANIMI);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(T__11);
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

	public static class AddtegevusContext extends ParserRuleContext {
		public AddtegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addtegevus; }
	 
		public AddtegevusContext() { }
		public void copyFrom(AddtegevusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddAttributeContext extends AddtegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public AddAttributeContext(AddtegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAddAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAddAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAddAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSkillContext extends AddtegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public List<TerminalNode> ARV() { return getTokens(TEXTGYParser.ARV); }
		public TerminalNode ARV(int i) {
			return getToken(TEXTGYParser.ARV, i);
		}
		public AddSkillContext(AddtegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAddSkill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAddSkill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAddSkill(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddItemContext extends AddtegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public AddItemContext(AddtegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAddItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAddItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAddItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddtegevusContext addtegevus() throws RecognitionException {
		AddtegevusContext _localctx = new AddtegevusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addtegevus);
		int _la;
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AddItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__24);
				setState(177);
				match(T__20);
				setState(178);
				match(T__10);
				setState(179);
				match(MUUTUJANIMI);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(180);
					match(T__21);
					setState(181);
					match(MUUTUJANIMI);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new AddSkillContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(T__24);
				setState(189);
				match(T__22);
				setState(190);
				match(T__10);
				setState(191);
				match(MUUTUJANIMI);
				setState(192);
				match(T__4);
				setState(193);
				match(ARV);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(194);
					match(T__21);
					setState(195);
					match(MUUTUJANIMI);
					setState(196);
					match(T__4);
					setState(197);
					match(ARV);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new AddAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(T__24);
				setState(205);
				match(T__23);
				setState(206);
				match(T__10);
				setState(207);
				match(MUUTUJANIMI);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(208);
					match(T__21);
					setState(209);
					match(MUUTUJANIMI);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(215);
				match(T__11);
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

	public static class RemovetegevusContext extends ParserRuleContext {
		public RemovetegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removetegevus; }
	 
		public RemovetegevusContext() { }
		public void copyFrom(RemovetegevusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RemoveItemContext extends RemovetegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public RemoveItemContext(RemovetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterRemoveItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitRemoveItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitRemoveItem(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemoveSkillContext extends RemovetegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public RemoveSkillContext(RemovetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterRemoveSkill(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitRemoveSkill(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitRemoveSkill(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemoveAttributeContext extends RemovetegevusContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public RemoveAttributeContext(RemovetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterRemoveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitRemoveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitRemoveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemovetegevusContext removetegevus() throws RecognitionException {
		RemovetegevusContext _localctx = new RemovetegevusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_removetegevus);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new RemoveItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__25);
				setState(219);
				match(T__20);
				setState(220);
				match(T__10);
				setState(221);
				match(MUUTUJANIMI);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(222);
					match(T__21);
					setState(223);
					match(MUUTUJANIMI);
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(229);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new RemoveSkillContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__25);
				setState(231);
				match(T__22);
				setState(232);
				match(T__10);
				setState(233);
				match(MUUTUJANIMI);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(234);
					match(T__21);
					setState(235);
					match(MUUTUJANIMI);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new RemoveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__25);
				setState(243);
				match(T__23);
				setState(244);
				match(T__10);
				setState(245);
				match(MUUTUJANIMI);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(246);
					match(T__21);
					setState(247);
					match(MUUTUJANIMI);
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__11);
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

	public static class ChangetegevusContext extends ParserRuleContext {
		public ChangetegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changetegevus; }
	 
		public ChangetegevusContext() { }
		public void copyFrom(ChangetegevusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ChangeDescriptionContext extends ChangetegevusContext {
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public ChangeDescriptionContext(ChangetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterChangeDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitChangeDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitChangeDescription(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeSkillRegularContext extends ChangetegevusContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public ChangeSkillRegularContext(ChangetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterChangeSkillRegular(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitChangeSkillRegular(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitChangeSkillRegular(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChangeSkillPlusMinusContext extends ChangetegevusContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public ChangeSkillPlusMinusContext(ChangetegevusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterChangeSkillPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitChangeSkillPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitChangeSkillPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangetegevusContext changetegevus() throws RecognitionException {
		ChangetegevusContext _localctx = new ChangetegevusContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_changetegevus);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ChangeSkillPlusMinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__26);
				setState(257);
				match(T__22);
				setState(258);
				match(T__10);
				setState(259);
				match(MUUTUJANIMI);
				setState(260);
				match(T__4);
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(262);
				match(ARV);
				setState(263);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new ChangeSkillRegularContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__26);
				setState(265);
				match(T__22);
				setState(266);
				match(T__10);
				setState(267);
				match(MUUTUJANIMI);
				setState(268);
				match(T__4);
				setState(269);
				match(ARV);
				setState(270);
				match(T__11);
				}
				break;
			case 3:
				_localctx = new ChangeDescriptionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				match(T__26);
				setState(272);
				match(T__29);
				setState(273);
				match(T__10);
				setState(274);
				match(SONE);
				setState(275);
				match(T__11);
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

	public static class ObjektiloomineContext extends ParserRuleContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public ObjektituupContext objektituup() {
			return getRuleContext(ObjektituupContext.class,0);
		}
		public List<ObjektiparameetridContext> objektiparameetrid() {
			return getRuleContexts(ObjektiparameetridContext.class);
		}
		public ObjektiparameetridContext objektiparameetrid(int i) {
			return getRuleContext(ObjektiparameetridContext.class,i);
		}
		public ObjektiloomineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objektiloomine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterObjektiloomine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitObjektiloomine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitObjektiloomine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjektiloomineContext objektiloomine() throws RecognitionException {
		ObjektiloomineContext _localctx = new ObjektiloomineContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_objektiloomine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__30);
			setState(279);
			match(T__31);
			setState(280);
			match(T__32);
			setState(281);
			match(MUUTUJANIMI);
			setState(282);
			match(T__33);
			setState(283);
			match(T__34);
			setState(284);
			objektituup();
			setState(285);
			match(T__35);
			setState(286);
			objektiparameetrid();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(287);
				match(T__21);
				setState(288);
				objektiparameetrid();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(T__15);
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

	public static class FunktsiooniloomineContext extends ParserRuleContext {
		public TerminalNode FUNKTSIOONINIMI() { return getToken(TEXTGYParser.FUNKTSIOONINIMI, 0); }
		public ProgrammContext programm() {
			return getRuleContext(ProgrammContext.class,0);
		}
		public List<TuupContext> tuup() {
			return getRuleContexts(TuupContext.class);
		}
		public TuupContext tuup(int i) {
			return getRuleContext(TuupContext.class,i);
		}
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public FunktsiooniloomineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktsiooniloomine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterFunktsiooniloomine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitFunktsiooniloomine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitFunktsiooniloomine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunktsiooniloomineContext funktsiooniloomine() throws RecognitionException {
		FunktsiooniloomineContext _localctx = new FunktsiooniloomineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funktsiooniloomine);
		int _la;
		try {
			int _alt;
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__30);
				setState(297);
				match(T__31);
				setState(298);
				match(T__36);
				setState(299);
				match(FUNKTSIOONINIMI);
				setState(300);
				match(T__10);
				setState(315);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(301);
							tuup();
							setState(302);
							match(T__4);
							setState(303);
							match(MUUTUJANIMI);
							setState(304);
							match(T__21);
							}
							} 
						}
						setState(310);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(311);
					tuup();
					setState(312);
					match(T__4);
					setState(313);
					match(MUUTUJANIMI);
					}
				}

				setState(317);
				match(T__11);
				setState(318);
				match(T__4);
				setState(319);
				programm();
				setState(320);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__30);
				setState(323);
				match(T__31);
				setState(324);
				match(T__36);
				setState(325);
				match(FUNKTSIOONINIMI);
				setState(326);
				match(T__10);
				setState(341);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(334);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(327);
							tuup();
							setState(328);
							match(T__4);
							setState(329);
							match(MUUTUJANIMI);
							setState(330);
							match(T__21);
							}
							} 
						}
						setState(336);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
					}
					setState(337);
					tuup();
					setState(338);
					match(T__4);
					setState(339);
					match(MUUTUJANIMI);
					}
				}

				setState(343);
				match(T__11);
				setState(344);
				match(T__37);
				setState(345);
				tuup();
				setState(346);
				match(T__4);
				setState(347);
				programm();
				setState(348);
				match(T__15);
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

	public static class ObjektituupContext extends ParserRuleContext {
		public ObjektituupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objektituup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterObjektituup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitObjektituup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitObjektituup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjektituupContext objektituup() throws RecognitionException {
		ObjektituupContext _localctx = new ObjektituupContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objektituup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
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

	public static class ObjektiparameetridContext extends ParserRuleContext {
		public ObjektiparameetridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objektiparameetrid; }
	 
		public ObjektiparameetridContext() { }
		public void copyFrom(ObjektiparameetridContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ItemParameeterContext extends ObjektiparameetridContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public ItemParameeterContext(ObjektiparameetridContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterItemParameeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitItemParameeter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitItemParameeter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkillParameeterContext extends ObjektiparameetridContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public List<TerminalNode> ARV() { return getTokens(TEXTGYParser.ARV); }
		public TerminalNode ARV(int i) {
			return getToken(TEXTGYParser.ARV, i);
		}
		public SkillParameeterContext(ObjektiparameetridContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterSkillParameeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitSkillParameeter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitSkillParameeter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescriptionParameeterContext extends ObjektiparameetridContext {
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public DescriptionParameeterContext(ObjektiparameetridContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterDescriptionParameeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitDescriptionParameeter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitDescriptionParameeter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeParameeterContext extends ObjektiparameetridContext {
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public AttributeParameeterContext(ObjektiparameetridContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAttributeParameeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAttributeParameeter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAttributeParameeter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjektiparameetridContext objektiparameetrid() throws RecognitionException {
		ObjektiparameetridContext _localctx = new ObjektiparameetridContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_objektiparameetrid);
		int _la;
		try {
			setState(395);
			switch (_input.LA(1)) {
			case T__29:
				_localctx = new DescriptionParameeterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__29);
				setState(355);
				match(T__10);
				setState(356);
				match(SONE);
				setState(357);
				match(T__11);
				}
				break;
			case T__20:
				_localctx = new ItemParameeterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(T__20);
				setState(359);
				match(T__10);
				setState(360);
				match(MUUTUJANIMI);
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(361);
					match(T__21);
					setState(362);
					match(MUUTUJANIMI);
					}
					}
					setState(367);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(368);
				match(T__11);
				}
				break;
			case T__22:
				_localctx = new SkillParameeterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(T__22);
				setState(370);
				match(T__10);
				setState(371);
				match(MUUTUJANIMI);
				setState(372);
				match(T__4);
				setState(373);
				match(ARV);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(374);
					match(T__21);
					setState(375);
					match(MUUTUJANIMI);
					setState(376);
					match(T__4);
					setState(377);
					match(ARV);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				match(T__11);
				}
				break;
			case T__23:
				_localctx = new AttributeParameeterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(T__23);
				setState(385);
				match(T__10);
				setState(386);
				match(MUUTUJANIMI);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(387);
					match(T__21);
					setState(388);
					match(MUUTUJANIMI);
					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(394);
				match(T__11);
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

	public static class AvaldisContext extends ParserRuleContext {
		public Avaldis5Context avaldis5() {
			return getRuleContext(Avaldis5Context.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAvaldis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AvaldisContext avaldis() throws RecognitionException {
		AvaldisContext _localctx = new AvaldisContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_avaldis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			avaldis5();
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

	public static class Avaldis5Context extends ParserRuleContext {
		public Avaldis5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis5; }
	 
		public Avaldis5Context() { }
		public void copyFrom(Avaldis5Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VordlemineContext extends Avaldis5Context {
		public List<Avaldis4Context> avaldis4() {
			return getRuleContexts(Avaldis4Context.class);
		}
		public Avaldis4Context avaldis4(int i) {
			return getRuleContext(Avaldis4Context.class,i);
		}
		public VordlemineContext(Avaldis5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterVordlemine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitVordlemine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitVordlemine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneAvaldis5Context extends Avaldis5Context {
		public Avaldis4Context avaldis4() {
			return getRuleContext(Avaldis4Context.class,0);
		}
		public TriviaalneAvaldis5Context(Avaldis5Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTriviaalneAvaldis5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTriviaalneAvaldis5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTriviaalneAvaldis5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis5Context avaldis5() throws RecognitionException {
		Avaldis5Context _localctx = new Avaldis5Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_avaldis5);
		int _la;
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new VordlemineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				avaldis4(0);
				setState(400);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(401);
				avaldis4(0);
				}
				break;
			case 2:
				_localctx = new TriviaalneAvaldis5Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				avaldis4(0);
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

	public static class Avaldis4Context extends ParserRuleContext {
		public Avaldis4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis4; }
	 
		public Avaldis4Context() { }
		public void copyFrom(Avaldis4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneAvaldis4Context extends Avaldis4Context {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public TriviaalneAvaldis4Context(Avaldis4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTriviaalneAvaldis4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTriviaalneAvaldis4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTriviaalneAvaldis4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiitmineLahutamineContext extends Avaldis4Context {
		public Avaldis4Context avaldis4() {
			return getRuleContext(Avaldis4Context.class,0);
		}
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public LiitmineLahutamineContext(Avaldis4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterLiitmineLahutamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitLiitmineLahutamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitLiitmineLahutamine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis4Context avaldis4() throws RecognitionException {
		return avaldis4(0);
	}

	private Avaldis4Context avaldis4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis4Context _localctx = new Avaldis4Context(_ctx, _parentState);
		Avaldis4Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_avaldis4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(407);
			avaldis3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Avaldis4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis4);
					setState(409);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(410);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(411);
					avaldis3(0);
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public Avaldis3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis3; }
	 
		public Avaldis3Context() { }
		public void copyFrom(Avaldis3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class KorrutamineJagamineContext extends Avaldis3Context {
		public Avaldis3Context avaldis3() {
			return getRuleContext(Avaldis3Context.class,0);
		}
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public KorrutamineJagamineContext(Avaldis3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterKorrutamineJagamine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitKorrutamineJagamine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitKorrutamineJagamine(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TriviaalneAvaldis3Context extends Avaldis3Context {
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public TriviaalneAvaldis3Context(Avaldis3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTriviaalneAvaldis3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTriviaalneAvaldis3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTriviaalneAvaldis3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis3Context avaldis3() throws RecognitionException {
		return avaldis3(0);
	}

	private Avaldis3Context avaldis3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Avaldis3Context _localctx = new Avaldis3Context(_ctx, _parentState);
		Avaldis3Context _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_avaldis3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(418);
			avaldis2();
			}
			_ctx.stop = _input.LT(-1);
			setState(425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Avaldis3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis3);
					setState(420);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(421);
					_la = _input.LA(1);
					if ( !(_la==T__50 || _la==T__51) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(422);
					avaldis2();
					}
					} 
				}
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public Avaldis2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis2; }
	 
		public Avaldis2Context() { }
		public void copyFrom(Avaldis2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneAvaldis2Context extends Avaldis2Context {
		public Avaldis1Context avaldis1() {
			return getRuleContext(Avaldis1Context.class,0);
		}
		public TriviaalneAvaldis2Context(Avaldis2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTriviaalneAvaldis2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTriviaalneAvaldis2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTriviaalneAvaldis2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaarneMiinusContext extends Avaldis2Context {
		public Avaldis2Context avaldis2() {
			return getRuleContext(Avaldis2Context.class,0);
		}
		public UnaarneMiinusContext(Avaldis2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterUnaarneMiinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitUnaarneMiinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitUnaarneMiinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis2Context avaldis2() throws RecognitionException {
		Avaldis2Context _localctx = new Avaldis2Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_avaldis2);
		try {
			setState(431);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				match(T__28);
				setState(429);
				avaldis2();
				}
				break;
			case T__10:
			case FUNKTSIOONINIMI:
			case MUUTUJANIMI:
			case SONE:
			case ARV:
				_localctx = new TriviaalneAvaldis2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				avaldis1();
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

	public static class Avaldis1Context extends ParserRuleContext {
		public Avaldis1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis1; }
	 
		public Avaldis1Context() { }
		public void copyFrom(Avaldis1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TriviaalneAvaldis1Context extends Avaldis1Context {
		public Avaldis0Context avaldis0() {
			return getRuleContext(Avaldis0Context.class,0);
		}
		public TriviaalneAvaldis1Context(Avaldis1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterTriviaalneAvaldis1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitTriviaalneAvaldis1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitTriviaalneAvaldis1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunktsiooniValjakutseContext extends Avaldis1Context {
		public TerminalNode FUNKTSIOONINIMI() { return getToken(TEXTGYParser.FUNKTSIOONINIMI, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public FunktsiooniValjakutseContext(Avaldis1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterFunktsiooniValjakutse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitFunktsiooniValjakutse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitFunktsiooniValjakutse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis1Context avaldis1() throws RecognitionException {
		Avaldis1Context _localctx = new Avaldis1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_avaldis1);
		int _la;
		try {
			setState(447);
			switch (_input.LA(1)) {
			case FUNKTSIOONINIMI:
				_localctx = new FunktsiooniValjakutseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(FUNKTSIOONINIMI);
				setState(434);
				match(T__10);
				setState(443);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__28) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
					{
					setState(435);
					avaldis();
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(436);
						match(T__21);
						setState(437);
						avaldis();
						}
						}
						setState(442);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(445);
				match(T__11);
				}
				break;
			case T__10:
			case MUUTUJANIMI:
			case SONE:
			case ARV:
				_localctx = new TriviaalneAvaldis1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				avaldis0();
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

	public static class Avaldis0Context extends ParserRuleContext {
		public Avaldis0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avaldis0; }
	 
		public Avaldis0Context() { }
		public void copyFrom(Avaldis0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArvuLiteraalRContext extends Avaldis0Context {
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public ArvuLiteraalRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterArvuLiteraalR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitArvuLiteraalR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitArvuLiteraalR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SuluAvaldisContext extends Avaldis0Context {
		public AvaldisContext avaldis() {
			return getRuleContext(AvaldisContext.class,0);
		}
		public SuluAvaldisContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterSuluAvaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitSuluAvaldis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitSuluAvaldis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SoneLiteraalRContext extends Avaldis0Context {
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public SoneLiteraalRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterSoneLiteraalR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitSoneLiteraalR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitSoneLiteraalR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuutujaNimiRContext extends Avaldis0Context {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public MuutujaNimiRContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterMuutujaNimiR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitMuutujaNimiR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitMuutujaNimiR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Avaldis0Context avaldis0() throws RecognitionException {
		Avaldis0Context _localctx = new Avaldis0Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_avaldis0);
		try {
			setState(456);
			switch (_input.LA(1)) {
			case SONE:
				_localctx = new SoneLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(SONE);
				}
				break;
			case MUUTUJANIMI:
				_localctx = new MuutujaNimiRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(MUUTUJANIMI);
				}
				break;
			case ARV:
				_localctx = new ArvuLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				match(ARV);
				}
				break;
			case T__10:
				_localctx = new SuluAvaldisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(452);
				match(T__10);
				setState(453);
				avaldis();
				setState(454);
				match(T__11);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return avaldis4_sempred((Avaldis4Context)_localctx, predIndex);
		case 22:
			return avaldis3_sempred((Avaldis3Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean avaldis4_sempred(Avaldis4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean avaldis3_sempred(Avaldis3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\3\7\3\7\5\7_\n\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tp\n\t\f\t\16\ts\13\t"+
		"\3\t\3\t\5\tw\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0093"+
		"\n\r\f\r\16\r\u0096\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u009f\n\r\f\r"+
		"\16\r\u00a2\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ab\n\r\f\r\16\r\u00ae"+
		"\13\r\3\r\5\r\u00b1\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b9\n\16"+
		"\f\16\16\16\u00bc\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00c9\n\16\f\16\16\16\u00cc\13\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00d5\n\16\f\16\16\16\u00d8\13\16\3\16\5\16\u00db\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e3\n\17\f\17\16\17\u00e6\13"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n\17\f\17\16\17\u00f2"+
		"\13\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00fb\n\17\f\17\16\17\u00fe"+
		"\13\17\3\17\5\17\u0101\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0117"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0124"+
		"\n\21\f\21\16\21\u0127\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\7\22\u0135\n\22\f\22\16\22\u0138\13\22\3\22\3\22\3"+
		"\22\3\22\5\22\u013e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014f\n\22\f\22\16\22\u0152\13\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0158\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u0161\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u016e\n\24\f\24\16\24\u0171\13\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u017d\n\24\f\24\16\24\u0180\13\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0188\n\24\f\24\16\24\u018b\13\24\3\24\5\24"+
		"\u018e\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0197\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u019f\n\27\f\27\16\27\u01a2\13\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u01aa\n\30\f\30\16\30\u01ad\13\30\3\31\3"+
		"\31\3\31\5\31\u01b2\n\31\3\32\3\32\3\32\3\32\3\32\7\32\u01b9\n\32\f\32"+
		"\16\32\u01bc\13\32\5\32\u01be\n\32\3\32\3\32\5\32\u01c2\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u01cb\n\33\3\33\2\4,.\34\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\7\3\2\b\13\3\2\36\37\3\2"+
		")+\3\2,\64\3\2\65\66\u01e9\2\66\3\2\2\2\4=\3\2\2\2\6I\3\2\2\2\bK\3\2\2"+
		"\2\nN\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22z\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u008a\3\2\2\2\30\u00b0\3\2\2\2\32\u00da\3\2\2\2\34\u0100\3"+
		"\2\2\2\36\u0116\3\2\2\2 \u0118\3\2\2\2\"\u0160\3\2\2\2$\u0162\3\2\2\2"+
		"&\u018d\3\2\2\2(\u018f\3\2\2\2*\u0196\3\2\2\2,\u0198\3\2\2\2.\u01a3\3"+
		"\2\2\2\60\u01b1\3\2\2\2\62\u01c1\3\2\2\2\64\u01ca\3\2\2\2\66\67\5\4\3"+
		"\2\67\3\3\2\2\289\5\6\4\29:\7\3\2\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@J\5\n\6\2AJ\5\20\t\2BJ\5\22\n\2"+
		"CJ\5(\25\2DJ\5 \21\2EJ\5\"\22\2FJ\5\24\13\2GJ\5\f\7\2HJ\5\b\5\2I@\3\2"+
		"\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2"+
		"\2\2IH\3\2\2\2J\7\3\2\2\2KL\7\4\2\2LM\5(\25\2M\t\3\2\2\2NO\78\2\2OP\7"+
		"\5\2\2PQ\5(\25\2Q\13\3\2\2\2RS\7\6\2\2ST\7\7\2\2TU\5\16\b\2UX\78\2\2V"+
		"W\7\5\2\2WY\5(\25\2XV\3\2\2\2XY\3\2\2\2Y_\3\2\2\2Z[\7\6\2\2[\\\78\2\2"+
		"\\]\7\5\2\2]_\5(\25\2^R\3\2\2\2^Z\3\2\2\2_\r\3\2\2\2`a\t\2\2\2a\17\3\2"+
		"\2\2bc\7\f\2\2cd\7\r\2\2de\5(\25\2ef\7\16\2\2fg\7\17\2\2gq\5\2\2\2hi\7"+
		"\20\2\2ij\7\r\2\2jk\5(\25\2kl\7\16\2\2lm\7\17\2\2mn\5\2\2\2np\3\2\2\2"+
		"oh\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rv\3\2\2\2sq\3\2\2\2tu\7\21\2"+
		"\2uw\5\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\22\2\2y\21\3\2\2\2z{\7"+
		"\23\2\2{|\7\r\2\2|}\5(\25\2}~\7\16\2\2~\177\7\24\2\2\177\u0080\5\2\2\2"+
		"\u0080\u0081\7\22\2\2\u0081\23\3\2\2\2\u0082\u0083\7\25\2\2\u0083\u0084"+
		"\78\2\2\u0084\u0085\5\26\f\2\u0085\25\3\2\2\2\u0086\u008b\5\30\r\2\u0087"+
		"\u008b\5\32\16\2\u0088\u008b\5\34\17\2\u0089\u008b\5\36\20\2\u008a\u0086"+
		"\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\27\3\2\2\2\u008c\u008d\7\26\2\2\u008d\u008e\7\27\2\2\u008e\u008f\7\r"+
		"\2\2\u008f\u0094\78\2\2\u0090\u0091\7\30\2\2\u0091\u0093\78\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u00b1\7\16\2\2\u0098"+
		"\u0099\7\26\2\2\u0099\u009a\7\31\2\2\u009a\u009b\7\r\2\2\u009b\u00a0\7"+
		"8\2\2\u009c\u009d\7\30\2\2\u009d\u009f\78\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00b1\7\16\2\2\u00a4\u00a5\7\26\2\2\u00a5"+
		"\u00a6\7\32\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00ac\78\2\2\u00a8\u00a9\7\30"+
		"\2\2\u00a9\u00ab\78\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b1\7\16\2\2\u00b0\u008c\3\2\2\2\u00b0\u0098\3\2\2\2\u00b0"+
		"\u00a4\3\2\2\2\u00b1\31\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3\u00b4\7\27"+
		"\2\2\u00b4\u00b5\7\r\2\2\u00b5\u00ba\78\2\2\u00b6\u00b7\7\30\2\2\u00b7"+
		"\u00b9\78\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00db\7\16\2\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\7\31\2\2\u00c0\u00c1"+
		"\7\r\2\2\u00c1\u00c2\78\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00ca\7:\2\2\u00c4"+
		"\u00c5\7\30\2\2\u00c5\u00c6\78\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c9\7:"+
		"\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00db\7\16"+
		"\2\2\u00ce\u00cf\7\33\2\2\u00cf\u00d0\7\32\2\2\u00d0\u00d1\7\r\2\2\u00d1"+
		"\u00d6\78\2\2\u00d2\u00d3\7\30\2\2\u00d3\u00d5\78\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\7\16\2\2\u00da\u00b2\3"+
		"\2\2\2\u00da\u00be\3\2\2\2\u00da\u00ce\3\2\2\2\u00db\33\3\2\2\2\u00dc"+
		"\u00dd\7\34\2\2\u00dd\u00de\7\27\2\2\u00de\u00df\7\r\2\2\u00df\u00e4\7"+
		"8\2\2\u00e0\u00e1\7\30\2\2\u00e1\u00e3\78\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e7\u0101\7\16\2\2\u00e8\u00e9\7\34\2\2\u00e9"+
		"\u00ea\7\31\2\2\u00ea\u00eb\7\r\2\2\u00eb\u00f0\78\2\2\u00ec\u00ed\7\30"+
		"\2\2\u00ed\u00ef\78\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f3\u0101\7\16\2\2\u00f4\u00f5\7\34\2\2\u00f5\u00f6\7\32\2\2\u00f6"+
		"\u00f7\7\r\2\2\u00f7\u00fc\78\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fb\78"+
		"\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\7\16"+
		"\2\2\u0100\u00dc\3\2\2\2\u0100\u00e8\3\2\2\2\u0100\u00f4\3\2\2\2\u0101"+
		"\35\3\2\2\2\u0102\u0103\7\35\2\2\u0103\u0104\7\31\2\2\u0104\u0105\7\r"+
		"\2\2\u0105\u0106\78\2\2\u0106\u0107\7\7\2\2\u0107\u0108\t\3\2\2\u0108"+
		"\u0109\7:\2\2\u0109\u0117\7\16\2\2\u010a\u010b\7\35\2\2\u010b\u010c\7"+
		"\31\2\2\u010c\u010d\7\r\2\2\u010d\u010e\78\2\2\u010e\u010f\7\7\2\2\u010f"+
		"\u0110\7:\2\2\u0110\u0117\7\16\2\2\u0111\u0112\7\35\2\2\u0112\u0113\7"+
		" \2\2\u0113\u0114\7\r\2\2\u0114\u0115\79\2\2\u0115\u0117\7\16\2\2\u0116"+
		"\u0102\3\2\2\2\u0116\u010a\3\2\2\2\u0116\u0111\3\2\2\2\u0117\37\3\2\2"+
		"\2\u0118\u0119\7!\2\2\u0119\u011a\7\"\2\2\u011a\u011b\7#\2\2\u011b\u011c"+
		"\78\2\2\u011c\u011d\7$\2\2\u011d\u011e\7%\2\2\u011e\u011f\5$\23\2\u011f"+
		"\u0120\7&\2\2\u0120\u0125\5&\24\2\u0121\u0122\7\30\2\2\u0122\u0124\5&"+
		"\24\2\u0123\u0121\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\22"+
		"\2\2\u0129!\3\2\2\2\u012a\u012b\7!\2\2\u012b\u012c\7\"\2\2\u012c\u012d"+
		"\7\'\2\2\u012d\u012e\7\67\2\2\u012e\u013d\7\r\2\2\u012f\u0130\5\16\b\2"+
		"\u0130\u0131\7\7\2\2\u0131\u0132\78\2\2\u0132\u0133\7\30\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u012f\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\5\16"+
		"\b\2\u013a\u013b\7\7\2\2\u013b\u013c\78\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u0136\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\16"+
		"\2\2\u0140\u0141\7\7\2\2\u0141\u0142\5\2\2\2\u0142\u0143\7\22\2\2\u0143"+
		"\u0161\3\2\2\2\u0144\u0145\7!\2\2\u0145\u0146\7\"\2\2\u0146\u0147\7\'"+
		"\2\2\u0147\u0148\7\67\2\2\u0148\u0157\7\r\2\2\u0149\u014a\5\16\b\2\u014a"+
		"\u014b\7\7\2\2\u014b\u014c\78\2\2\u014c\u014d\7\30\2\2\u014d\u014f\3\2"+
		"\2\2\u014e\u0149\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\5\16"+
		"\b\2\u0154\u0155\7\7\2\2\u0155\u0156\78\2\2\u0156\u0158\3\2\2\2\u0157"+
		"\u0150\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\16"+
		"\2\2\u015a\u015b\7(\2\2\u015b\u015c\5\16\b\2\u015c\u015d\7\7\2\2\u015d"+
		"\u015e\5\2\2\2\u015e\u015f\7\22\2\2\u015f\u0161\3\2\2\2\u0160\u012a\3"+
		"\2\2\2\u0160\u0144\3\2\2\2\u0161#\3\2\2\2\u0162\u0163\t\4\2\2\u0163%\3"+
		"\2\2\2\u0164\u0165\7 \2\2\u0165\u0166\7\r\2\2\u0166\u0167\79\2\2\u0167"+
		"\u018e\7\16\2\2\u0168\u0169\7\27\2\2\u0169\u016a\7\r\2\2\u016a\u016f\7"+
		"8\2\2\u016b\u016c\7\30\2\2\u016c\u016e\78\2\2\u016d\u016b\3\2\2\2\u016e"+
		"\u0171\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0172\u018e\7\16\2\2\u0173\u0174\7\31\2\2\u0174"+
		"\u0175\7\r\2\2\u0175\u0176\78\2\2\u0176\u0177\7\7\2\2\u0177\u017e\7:\2"+
		"\2\u0178\u0179\7\30\2\2\u0179\u017a\78\2\2\u017a\u017b\7\7\2\2\u017b\u017d"+
		"\7:\2\2\u017c\u0178\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u018e\7\16"+
		"\2\2\u0182\u0183\7\32\2\2\u0183\u0184\7\r\2\2\u0184\u0189\78\2\2\u0185"+
		"\u0186\7\30\2\2\u0186\u0188\78\2\2\u0187\u0185\3\2\2\2\u0188\u018b\3\2"+
		"\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018c\u018e\7\16\2\2\u018d\u0164\3\2\2\2\u018d\u0168\3"+
		"\2\2\2\u018d\u0173\3\2\2\2\u018d\u0182\3\2\2\2\u018e\'\3\2\2\2\u018f\u0190"+
		"\5*\26\2\u0190)\3\2\2\2\u0191\u0192\5,\27\2\u0192\u0193\t\5\2\2\u0193"+
		"\u0194\5,\27\2\u0194\u0197\3\2\2\2\u0195\u0197\5,\27\2\u0196\u0191\3\2"+
		"\2\2\u0196\u0195\3\2\2\2\u0197+\3\2\2\2\u0198\u0199\b\27\1\2\u0199\u019a"+
		"\5.\30\2\u019a\u01a0\3\2\2\2\u019b\u019c\f\4\2\2\u019c\u019d\t\3\2\2\u019d"+
		"\u019f\5.\30\2\u019e\u019b\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1-\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4"+
		"\b\30\1\2\u01a4\u01a5\5\60\31\2\u01a5\u01ab\3\2\2\2\u01a6\u01a7\f\4\2"+
		"\2\u01a7\u01a8\t\6\2\2\u01a8\u01aa\5\60\31\2\u01a9\u01a6\3\2\2\2\u01aa"+
		"\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac/\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ae\u01af\7\37\2\2\u01af\u01b2\5\60\31\2\u01b0"+
		"\u01b2\5\62\32\2\u01b1\u01ae\3\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\61\3\2"+
		"\2\2\u01b3\u01b4\7\67\2\2\u01b4\u01bd\7\r\2\2\u01b5\u01ba\5(\25\2\u01b6"+
		"\u01b7\7\30\2\2\u01b7\u01b9\5(\25\2\u01b8\u01b6\3\2\2\2\u01b9\u01bc\3"+
		"\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c2\7\16\2\2\u01c0\u01c2\5\64\33\2\u01c1\u01b3\3\2\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c2\63\3\2\2\2\u01c3\u01cb\79\2\2\u01c4\u01cb\78\2\2"+
		"\u01c5\u01cb\7:\2\2\u01c6\u01c7\7\r\2\2\u01c7\u01c8\5(\25\2\u01c8\u01c9"+
		"\7\16\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01c4\3\2\2\2"+
		"\u01ca\u01c5\3\2\2\2\u01ca\u01c6\3\2\2\2\u01cb\65\3\2\2\2(=IX^qv\u008a"+
		"\u0094\u00a0\u00ac\u00b0\u00ba\u00ca\u00d6\u00da\u00e4\u00f0\u00fc\u0100"+
		"\u0116\u0125\u0136\u013d\u0150\u0157\u0160\u016f\u017e\u0189\u018d\u0196"+
		"\u01a0\u01ab\u01b1\u01ba\u01bd\u01c1\u01ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}