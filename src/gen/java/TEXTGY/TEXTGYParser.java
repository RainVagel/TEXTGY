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
		T__45=46, T__46=47, T__47=48, T__48=49, FUNKTSIOONINIMI=50, MUUTUJANIMI=51, 
		SONE=52, ARV=53, WS=54, KOMMENTAAR=55;
	public static final int
		RULE_programm = 0, RULE_lause = 1, RULE_tagastuslause = 2, RULE_omistamine = 3, 
		RULE_muutujadeklaratsioon = 4, RULE_tuup = 5, RULE_iflause = 6, RULE_whilelause = 7, 
		RULE_alterlause = 8, RULE_altertegevus = 9, RULE_hastegevus = 10, RULE_addtegevus = 11, 
		RULE_removetegevus = 12, RULE_changetegevus = 13, RULE_objektiloomine = 14, 
		RULE_funktsiooniloomine = 15, RULE_objektituup = 16, RULE_objektiparameetrid = 17, 
		RULE_avaldis = 18, RULE_avaldis5 = 19, RULE_avaldis4 = 20, RULE_avaldis3 = 21, 
		RULE_avaldis2 = 22, RULE_avaldis1 = 23, RULE_avaldis0 = 24;
	public static final String[] ruleNames = {
		"programm", "lause", "tagastuslause", "omistamine", "muutujadeklaratsioon", 
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
		"'->'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'AND'", "'OR'", 
		"'NOT'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "FUNKTSIOONINIMI", "MUUTUJANIMI", "SONE", "ARV", "WS", "KOMMENTAAR"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitProgramm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrammContext programm() throws RecognitionException {
		ProgrammContext _localctx = new ProgrammContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__9) | (1L << T__10) | (1L << T__16) | (1L << T__18) | (1L << T__28) | (1L << T__30) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				{
				setState(50);
				lause();
				setState(51);
				match(T__0);
				}
				}
				setState(57);
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
		enterRule(_localctx, 2, RULE_lause);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				omistamine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				iflause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				whilelause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				avaldis();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				objektiloomine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				funktsiooniloomine();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				alterlause();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				muutujadeklaratsioon();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
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
		enterRule(_localctx, 4, RULE_tagastuslause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__1);
			setState(70);
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
		enterRule(_localctx, 6, RULE_omistamine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(MUUTUJANIMI);
			setState(73);
			match(T__2);
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
		enterRule(_localctx, 8, RULE_muutujadeklaratsioon);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__3);
				setState(77);
				match(T__4);
				setState(78);
				tuup();
				setState(79);
				match(MUUTUJANIMI);
				setState(82);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(80);
					match(T__2);
					setState(81);
					avaldis();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__3);
				setState(85);
				match(MUUTUJANIMI);
				setState(86);
				match(T__2);
				setState(87);
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
		enterRule(_localctx, 10, RULE_tuup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 12, RULE_iflause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__9);
			setState(93);
			match(T__10);
			setState(94);
			avaldis();
			setState(95);
			match(T__11);
			setState(96);
			match(T__12);
			setState(97);
			programm();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(98);
				match(T__13);
				setState(99);
				match(T__10);
				setState(100);
				avaldis();
				setState(101);
				match(T__11);
				setState(102);
				match(T__12);
				setState(103);
				programm();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(110);
				match(T__14);
				setState(111);
				programm();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
		enterRule(_localctx, 14, RULE_whilelause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__16);
			setState(120);
			match(T__10);
			setState(121);
			avaldis();
			setState(122);
			match(T__11);
			setState(123);
			match(T__17);
			setState(124);
			programm();
			setState(125);
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
		enterRule(_localctx, 16, RULE_alterlause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__18);
			setState(128);
			match(MUUTUJANIMI);
			setState(129);
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
		enterRule(_localctx, 18, RULE_altertegevus);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				hastegevus();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				addtegevus();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				removetegevus();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
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
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public HastegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hastegevus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterHastegevus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitHastegevus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitHastegevus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HastegevusContext hastegevus() throws RecognitionException {
		HastegevusContext _localctx = new HastegevusContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hastegevus);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__19);
				setState(138);
				match(T__20);
				setState(139);
				match(T__10);
				setState(140);
				match(MUUTUJANIMI);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(141);
					match(T__21);
					setState(142);
					match(MUUTUJANIMI);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__19);
				setState(150);
				match(T__22);
				setState(151);
				match(T__10);
				setState(152);
				match(MUUTUJANIMI);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(153);
					match(T__21);
					setState(154);
					match(MUUTUJANIMI);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__19);
				setState(162);
				match(T__23);
				setState(163);
				match(T__10);
				setState(164);
				match(MUUTUJANIMI);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(165);
					match(T__21);
					setState(166);
					match(MUUTUJANIMI);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172);
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
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public AddtegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addtegevus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterAddtegevus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitAddtegevus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitAddtegevus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddtegevusContext addtegevus() throws RecognitionException {
		AddtegevusContext _localctx = new AddtegevusContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addtegevus);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(T__24);
				setState(176);
				match(T__20);
				setState(177);
				match(T__10);
				setState(178);
				match(MUUTUJANIMI);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(179);
					match(T__21);
					setState(180);
					match(MUUTUJANIMI);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__24);
				setState(188);
				match(T__22);
				setState(189);
				match(T__10);
				setState(190);
				match(MUUTUJANIMI);
				setState(191);
				match(T__4);
				setState(192);
				match(ARV);
				setState(193);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__24);
				setState(195);
				match(T__23);
				setState(196);
				match(T__10);
				setState(197);
				match(MUUTUJANIMI);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(198);
					match(T__21);
					setState(199);
					match(MUUTUJANIMI);
					}
					}
					setState(204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
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
		public List<TerminalNode> MUUTUJANIMI() { return getTokens(TEXTGYParser.MUUTUJANIMI); }
		public TerminalNode MUUTUJANIMI(int i) {
			return getToken(TEXTGYParser.MUUTUJANIMI, i);
		}
		public RemovetegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_removetegevus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterRemovetegevus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitRemovetegevus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitRemovetegevus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemovetegevusContext removetegevus() throws RecognitionException {
		RemovetegevusContext _localctx = new RemovetegevusContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_removetegevus);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__25);
				setState(209);
				match(T__20);
				setState(210);
				match(T__10);
				setState(211);
				match(MUUTUJANIMI);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(212);
					match(T__21);
					setState(213);
					match(MUUTUJANIMI);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__25);
				setState(221);
				match(T__22);
				setState(222);
				match(T__10);
				setState(223);
				match(MUUTUJANIMI);
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(224);
					match(T__21);
					setState(225);
					match(MUUTUJANIMI);
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__25);
				setState(233);
				match(T__23);
				setState(234);
				match(T__10);
				setState(235);
				match(MUUTUJANIMI);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21) {
					{
					{
					setState(236);
					match(T__21);
					setState(237);
					match(MUUTUJANIMI);
					}
					}
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(243);
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
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public ChangetegevusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changetegevus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterChangetegevus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitChangetegevus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitChangetegevus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangetegevusContext changetegevus() throws RecognitionException {
		ChangetegevusContext _localctx = new ChangetegevusContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_changetegevus);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__26);
				setState(247);
				match(T__22);
				setState(248);
				match(T__10);
				setState(249);
				match(MUUTUJANIMI);
				setState(250);
				match(T__4);
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(252);
				match(ARV);
				setState(253);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__26);
				setState(255);
				match(T__22);
				setState(256);
				match(T__10);
				setState(257);
				match(MUUTUJANIMI);
				setState(258);
				match(T__4);
				setState(259);
				match(ARV);
				setState(260);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(T__26);
				setState(262);
				match(T__29);
				setState(263);
				match(T__10);
				setState(264);
				match(SONE);
				setState(265);
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
		public ObjektiparameetridContext objektiparameetrid() {
			return getRuleContext(ObjektiparameetridContext.class,0);
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
		enterRule(_localctx, 28, RULE_objektiloomine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__30);
			setState(269);
			match(T__31);
			setState(270);
			match(T__32);
			setState(271);
			match(MUUTUJANIMI);
			setState(272);
			match(T__33);
			setState(273);
			match(T__34);
			setState(274);
			objektituup();
			setState(275);
			match(T__35);
			setState(276);
			objektiparameetrid();
			setState(277);
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
		enterRule(_localctx, 30, RULE_funktsiooniloomine);
		int _la;
		try {
			int _alt;
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				match(T__30);
				setState(280);
				match(T__31);
				setState(281);
				match(T__36);
				setState(282);
				match(FUNKTSIOONINIMI);
				setState(283);
				match(T__10);
				setState(298);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(291);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(284);
							tuup();
							setState(285);
							match(T__4);
							setState(286);
							match(MUUTUJANIMI);
							setState(287);
							match(T__21);
							}
							} 
						}
						setState(293);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
					}
					setState(294);
					tuup();
					setState(295);
					match(T__4);
					setState(296);
					match(MUUTUJANIMI);
					}
				}

				setState(300);
				match(T__11);
				setState(301);
				match(T__4);
				setState(302);
				programm();
				setState(303);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__30);
				setState(306);
				match(T__31);
				setState(307);
				match(T__36);
				setState(308);
				match(FUNKTSIOONINIMI);
				setState(309);
				match(T__10);
				setState(324);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(310);
							tuup();
							setState(311);
							match(T__4);
							setState(312);
							match(MUUTUJANIMI);
							setState(313);
							match(T__21);
							}
							} 
						}
						setState(319);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
					}
					setState(320);
					tuup();
					setState(321);
					match(T__4);
					setState(322);
					match(MUUTUJANIMI);
					}
				}

				setState(326);
				match(T__11);
				setState(327);
				match(T__37);
				setState(328);
				tuup();
				setState(329);
				match(T__4);
				setState(330);
				programm();
				setState(331);
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
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
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
		enterRule(_localctx, 32, RULE_objektituup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(MUUTUJANIMI);
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
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public ObjektiparameetridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objektiparameetrid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterObjektiparameetrid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitObjektiparameetrid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitObjektiparameetrid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjektiparameetridContext objektiparameetrid() throws RecognitionException {
		ObjektiparameetridContext _localctx = new ObjektiparameetridContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objektiparameetrid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(MUUTUJANIMI);
			setState(338);
			match(T__10);
			setState(339);
			avaldis();
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(340);
				match(T__21);
				setState(341);
				avaldis();
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(T__11);
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
		enterRule(_localctx, 36, RULE_avaldis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 38, RULE_avaldis5);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VordlemineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				avaldis4(0);
				setState(352);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(353);
				avaldis4(0);
				}
				break;
			case 2:
				_localctx = new TriviaalneAvaldis5Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_avaldis4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(359);
			avaldis3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Avaldis4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis4);
					setState(361);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(362);
					_la = _input.LA(1);
					if ( !(_la==T__27 || _la==T__28) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(363);
					avaldis3(0);
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_avaldis3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(370);
			avaldis2();
			}
			_ctx.stop = _input.LT(-1);
			setState(377);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Avaldis3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis3);
					setState(372);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(373);
					_la = _input.LA(1);
					if ( !(_la==T__47 || _la==T__48) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(374);
					avaldis2();
					}
					} 
				}
				setState(379);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 44, RULE_avaldis2);
		try {
			setState(383);
			switch (_input.LA(1)) {
			case T__28:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__28);
				setState(381);
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
				setState(382);
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
		enterRule(_localctx, 46, RULE_avaldis1);
		int _la;
		try {
			setState(399);
			switch (_input.LA(1)) {
			case FUNKTSIOONINIMI:
				_localctx = new FunktsiooniValjakutseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(FUNKTSIOONINIMI);
				setState(386);
				match(T__10);
				setState(395);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__28) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
					{
					setState(387);
					avaldis();
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__21) {
						{
						{
						setState(388);
						match(T__21);
						setState(389);
						avaldis();
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(397);
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
				setState(398);
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
		enterRule(_localctx, 48, RULE_avaldis0);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case SONE:
				_localctx = new SoneLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(SONE);
				}
				break;
			case MUUTUJANIMI:
				_localctx = new MuutujaNimiRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(MUUTUJANIMI);
				}
				break;
			case ARV:
				_localctx = new ArvuLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				match(ARV);
				}
				break;
			case T__10:
				_localctx = new SuluAvaldisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(T__10);
				setState(405);
				avaldis();
				setState(406);
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
		case 20:
			return avaldis4_sempred((Avaldis4Context)_localctx, predIndex);
		case 21:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u019d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6U\n\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bl\n\b\f\b\16\bo\13\b\3\b\3\b\7\bs\n\b"+
		"\f\b\16\bv\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0092"+
		"\n\f\f\f\16\f\u0095\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009e\n\f\f\f"+
		"\16\f\u00a1\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n\f\f\f\16\f\u00ad"+
		"\13\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b8\n\r\f\r\16\r"+
		"\u00bb\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00cb\n\r\f\r\16\r\u00ce\13\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00d9\n\16\f\16\16\16\u00dc\13\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8\13\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00f1\n\16\f\16\16\16\u00f4\13\16\3\16\5\16"+
		"\u00f7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\7\21\u0124\n\21\f\21\16\21\u0127\13\21\3\21\3\21"+
		"\3\21\3\21\5\21\u012d\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u013e\n\21\f\21\16\21\u0141\13\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0150\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u0159\n\23\f"+
		"\23\16\23\u015c\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0167\n\25\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u016f\n\26\f\26\16\26\u0172"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u017a\n\27\f\27\16\27\u017d"+
		"\13\27\3\30\3\30\3\30\5\30\u0182\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u0189"+
		"\n\31\f\31\16\31\u018c\13\31\5\31\u018e\n\31\3\31\3\31\5\31\u0192\n\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u019b\n\32\3\32\2\4*,\33\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\b\13\3\2\36"+
		"\37\3\2)\61\3\2\62\63\u01b3\29\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bJ\3\2\2"+
		"\2\nZ\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20y\3\2\2\2\22\u0081\3\2\2\2\24"+
		"\u0089\3\2\2\2\26\u00af\3\2\2\2\30\u00d0\3\2\2\2\32\u00f6\3\2\2\2\34\u010c"+
		"\3\2\2\2\36\u010e\3\2\2\2 \u014f\3\2\2\2\"\u0151\3\2\2\2$\u0153\3\2\2"+
		"\2&\u015f\3\2\2\2(\u0166\3\2\2\2*\u0168\3\2\2\2,\u0173\3\2\2\2.\u0181"+
		"\3\2\2\2\60\u0191\3\2\2\2\62\u019a\3\2\2\2\64\65\5\4\3\2\65\66\7\3\2\2"+
		"\668\3\2\2\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2"+
		";9\3\2\2\2<F\5\b\5\2=F\5\16\b\2>F\5\20\t\2?F\5&\24\2@F\5\36\20\2AF\5 "+
		"\21\2BF\5\22\n\2CF\5\n\6\2DF\5\6\4\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3"+
		"\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH"+
		"\7\4\2\2HI\5&\24\2I\7\3\2\2\2JK\7\65\2\2KL\7\5\2\2LM\5&\24\2M\t\3\2\2"+
		"\2NO\7\6\2\2OP\7\7\2\2PQ\5\f\7\2QT\7\65\2\2RS\7\5\2\2SU\5&\24\2TR\3\2"+
		"\2\2TU\3\2\2\2U[\3\2\2\2VW\7\6\2\2WX\7\65\2\2XY\7\5\2\2Y[\5&\24\2ZN\3"+
		"\2\2\2ZV\3\2\2\2[\13\3\2\2\2\\]\t\2\2\2]\r\3\2\2\2^_\7\f\2\2_`\7\r\2\2"+
		"`a\5&\24\2ab\7\16\2\2bc\7\17\2\2cm\5\2\2\2de\7\20\2\2ef\7\r\2\2fg\5&\24"+
		"\2gh\7\16\2\2hi\7\17\2\2ij\5\2\2\2jl\3\2\2\2kd\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2nt\3\2\2\2om\3\2\2\2pq\7\21\2\2qs\5\2\2\2rp\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\22\2\2x\17\3\2\2\2"+
		"yz\7\23\2\2z{\7\r\2\2{|\5&\24\2|}\7\16\2\2}~\7\24\2\2~\177\5\2\2\2\177"+
		"\u0080\7\22\2\2\u0080\21\3\2\2\2\u0081\u0082\7\25\2\2\u0082\u0083\7\65"+
		"\2\2\u0083\u0084\5\24\13\2\u0084\23\3\2\2\2\u0085\u008a\5\26\f\2\u0086"+
		"\u008a\5\30\r\2\u0087\u008a\5\32\16\2\u0088\u008a\5\34\17\2\u0089\u0085"+
		"\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\25\3\2\2\2\u008b\u008c\7\26\2\2\u008c\u008d\7\27\2\2\u008d\u008e\7\r"+
		"\2\2\u008e\u0093\7\65\2\2\u008f\u0090\7\30\2\2\u0090\u0092\7\65\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u00b0\7\16\2\2\u0097"+
		"\u0098\7\26\2\2\u0098\u0099\7\31\2\2\u0099\u009a\7\r\2\2\u009a\u009f\7"+
		"\65\2\2\u009b\u009c\7\30\2\2\u009c\u009e\7\65\2\2\u009d\u009b\3\2\2\2"+
		"\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00b0\7\16\2\2\u00a3\u00a4\7\26\2\2"+
		"\u00a4\u00a5\7\32\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00ab\7\65\2\2\u00a7\u00a8"+
		"\7\30\2\2\u00a8\u00aa\7\65\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b0\7\16\2\2\u00af\u008b\3\2\2\2\u00af\u0097\3\2\2\2"+
		"\u00af\u00a3\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\7\33\2\2\u00b2\u00b3"+
		"\7\27\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b9\7\65\2\2\u00b5\u00b6\7\30\2"+
		"\2\u00b6\u00b8\7\65\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bc\u00d1\7\16\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\7\31\2\2\u00bf"+
		"\u00c0\7\r\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\7"+
		"\67\2\2\u00c3\u00d1\7\16\2\2\u00c4\u00c5\7\33\2\2\u00c5\u00c6\7\32\2\2"+
		"\u00c6\u00c7\7\r\2\2\u00c7\u00cc\7\65\2\2\u00c8\u00c9\7\30\2\2\u00c9\u00cb"+
		"\7\65\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1"+
		"\7\16\2\2\u00d0\u00b1\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0\u00c4\3\2\2\2"+
		"\u00d1\31\3\2\2\2\u00d2\u00d3\7\34\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5"+
		"\7\r\2\2\u00d5\u00da\7\65\2\2\u00d6\u00d7\7\30\2\2\u00d7\u00d9\7\65\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00f7\7\16\2\2"+
		"\u00de\u00df\7\34\2\2\u00df\u00e0\7\31\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e6"+
		"\7\65\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e5\7\65\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f7\7\16\2\2\u00ea\u00eb\7\34\2\2"+
		"\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7\r\2\2\u00ed\u00f2\7\65\2\2\u00ee\u00ef"+
		"\7\30\2\2\u00ef\u00f1\7\65\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2"+
		"\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u00f7\7\16\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00de\3\2\2\2"+
		"\u00f6\u00ea\3\2\2\2\u00f7\33\3\2\2\2\u00f8\u00f9\7\35\2\2\u00f9\u00fa"+
		"\7\31\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc\7\65\2\2\u00fc\u00fd\7\7\2\2"+
		"\u00fd\u00fe\t\3\2\2\u00fe\u00ff\7\67\2\2\u00ff\u010d\7\16\2\2\u0100\u0101"+
		"\7\35\2\2\u0101\u0102\7\31\2\2\u0102\u0103\7\r\2\2\u0103\u0104\7\65\2"+
		"\2\u0104\u0105\7\7\2\2\u0105\u0106\7\67\2\2\u0106\u010d\7\16\2\2\u0107"+
		"\u0108\7\35\2\2\u0108\u0109\7 \2\2\u0109\u010a\7\r\2\2\u010a\u010b\7\66"+
		"\2\2\u010b\u010d\7\16\2\2\u010c\u00f8\3\2\2\2\u010c\u0100\3\2\2\2\u010c"+
		"\u0107\3\2\2\2\u010d\35\3\2\2\2\u010e\u010f\7!\2\2\u010f\u0110\7\"\2\2"+
		"\u0110\u0111\7#\2\2\u0111\u0112\7\65\2\2\u0112\u0113\7$\2\2\u0113\u0114"+
		"\7%\2\2\u0114\u0115\5\"\22\2\u0115\u0116\7&\2\2\u0116\u0117\5$\23\2\u0117"+
		"\u0118\7\22\2\2\u0118\37\3\2\2\2\u0119\u011a\7!\2\2\u011a\u011b\7\"\2"+
		"\2\u011b\u011c\7\'\2\2\u011c\u011d\7\64\2\2\u011d\u012c\7\r\2\2\u011e"+
		"\u011f\5\f\7\2\u011f\u0120\7\7\2\2\u0120\u0121\7\65\2\2\u0121\u0122\7"+
		"\30\2\2\u0122\u0124\3\2\2\2\u0123\u011e\3\2\2\2\u0124\u0127\3\2\2\2\u0125"+
		"\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0128\u0129\5\f\7\2\u0129\u012a\7\7\2\2\u012a\u012b\7\65\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u0125\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012e\u012f\7\16\2\2\u012f\u0130\7\7\2\2\u0130\u0131\5\2\2\2\u0131"+
		"\u0132\7\22\2\2\u0132\u0150\3\2\2\2\u0133\u0134\7!\2\2\u0134\u0135\7\""+
		"\2\2\u0135\u0136\7\'\2\2\u0136\u0137\7\64\2\2\u0137\u0146\7\r\2\2\u0138"+
		"\u0139\5\f\7\2\u0139\u013a\7\7\2\2\u013a\u013b\7\65\2\2\u013b\u013c\7"+
		"\30\2\2\u013c\u013e\3\2\2\2\u013d\u0138\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0142\u0143\5\f\7\2\u0143\u0144\7\7\2\2\u0144\u0145\7\65\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\7\16\2\2\u0149\u014a\7(\2\2\u014a\u014b\5\f\7\2\u014b"+
		"\u014c\7\7\2\2\u014c\u014d\5\2\2\2\u014d\u014e\7\22\2\2\u014e\u0150\3"+
		"\2\2\2\u014f\u0119\3\2\2\2\u014f\u0133\3\2\2\2\u0150!\3\2\2\2\u0151\u0152"+
		"\7\65\2\2\u0152#\3\2\2\2\u0153\u0154\7\65\2\2\u0154\u0155\7\r\2\2\u0155"+
		"\u015a\5&\24\2\u0156\u0157\7\30\2\2\u0157\u0159\5&\24\2\u0158\u0156\3"+
		"\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7\16\2\2\u015e%\3\2\2\2"+
		"\u015f\u0160\5(\25\2\u0160\'\3\2\2\2\u0161\u0162\5*\26\2\u0162\u0163\t"+
		"\4\2\2\u0163\u0164\5*\26\2\u0164\u0167\3\2\2\2\u0165\u0167\5*\26\2\u0166"+
		"\u0161\3\2\2\2\u0166\u0165\3\2\2\2\u0167)\3\2\2\2\u0168\u0169\b\26\1\2"+
		"\u0169\u016a\5,\27\2\u016a\u0170\3\2\2\2\u016b\u016c\f\4\2\2\u016c\u016d"+
		"\t\3\2\2\u016d\u016f\5,\27\2\u016e\u016b\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171+\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173\u0174\b\27\1\2\u0174\u0175\5.\30\2\u0175\u017b\3\2\2\2\u0176\u0177"+
		"\f\4\2\2\u0177\u0178\t\5\2\2\u0178\u017a\5.\30\2\u0179\u0176\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c-\3\2\2\2"+
		"\u017d\u017b\3\2\2\2\u017e\u017f\7\37\2\2\u017f\u0182\5.\30\2\u0180\u0182"+
		"\5\60\31\2\u0181\u017e\3\2\2\2\u0181\u0180\3\2\2\2\u0182/\3\2\2\2\u0183"+
		"\u0184\7\64\2\2\u0184\u018d\7\r\2\2\u0185\u018a\5&\24\2\u0186\u0187\7"+
		"\30\2\2\u0187\u0189\5&\24\2\u0188\u0186\3\2\2\2\u0189\u018c\3\2\2\2\u018a"+
		"\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018d\u0185\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0192\7\16\2\2\u0190\u0192\5\62\32\2\u0191\u0183\3\2\2\2\u0191\u0190"+
		"\3\2\2\2\u0192\61\3\2\2\2\u0193\u019b\7\66\2\2\u0194\u019b\7\65\2\2\u0195"+
		"\u019b\7\67\2\2\u0196\u0197\7\r\2\2\u0197\u0198\5&\24\2\u0198\u0199\7"+
		"\16\2\2\u0199\u019b\3\2\2\2\u019a\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a"+
		"\u0195\3\2\2\2\u019a\u0196\3\2\2\2\u019b\63\3\2\2\2#9ETZmt\u0089\u0093"+
		"\u009f\u00ab\u00af\u00b9\u00cc\u00d0\u00da\u00e6\u00f2\u00f6\u010c\u0125"+
		"\u012c\u013f\u0146\u014f\u015a\u0166\u0170\u017b\u0181\u018a\u018d\u0191"+
		"\u019a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}