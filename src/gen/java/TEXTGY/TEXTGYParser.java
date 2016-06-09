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
		RULE_programm = 0, RULE_lausetejada = 1, RULE_lause = 2, RULE_tagastuslause = 3, 
		RULE_omistamine = 4, RULE_muutujadeklaratsioon = 5, RULE_tuup = 6, RULE_iflause = 7, 
		RULE_whilelause = 8, RULE_alterlause = 9, RULE_objektiloomine = 10, RULE_funktsiooniloomine = 11, 
		RULE_objektituup = 12, RULE_objektiparameeter = 13, RULE_funktsioonivaljakutseobjekt = 14, 
		RULE_avaldis = 15, RULE_avaldis5 = 16, RULE_avaldis4 = 17, RULE_avaldis3 = 18, 
		RULE_avaldis2 = 19, RULE_avaldis1 = 20, RULE_avaldis0 = 21;
	public static final String[] ruleNames = {
		"programm", "lausetejada", "lause", "tagastuslause", "omistamine", "muutujadeklaratsioon", 
		"tuup", "iflause", "whilelause", "alterlause", "objektiloomine", "funktsiooniloomine", 
		"objektituup", "objektiparameeter", "funktsioonivaljakutseobjekt", "avaldis", 
		"avaldis5", "avaldis4", "avaldis3", "avaldis2", "avaldis1", "avaldis0"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'return'", "'='", "'var'", "':'", "'Boolean'", "'Integer'", 
		"'Double'", "'String'", "'Object'", "'IF'", "'('", "')'", "'THEN'", "'ELSE IF'", 
		"'ELSE'", "'END'", "'WHILE'", "'DO'", "'ALTER'", "','", "'CREATE'", "'NEW'", 
		"'OBJECT'", "'AS'", "'TYPE'", "'WITH'", "'FUNCTION'", "'->'", "'Creature'", 
		"'Item'", "'Room'", "'DESCRIPTION'", "'ITEM'", "'SKILL'", "'ATTRIBUTE'", 
		"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'AND'", "'OR'", "'NOT'", 
		"'+'", "'-'", "'*'", "'/'"
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
			setState(44);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__46) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				{
				setState(46);
				lause();
				setState(47);
				match(T__0);
				}
				}
				setState(53);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				omistamine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				iflause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				whilelause();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				avaldis();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				funktsiooniloomine();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				alterlause();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				muutujadeklaratsioon();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
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
			setState(64);
			match(T__1);
			setState(65);
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
			setState(67);
			match(MUUTUJANIMI);
			setState(68);
			match(T__2);
			setState(69);
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
		public ObjektiloomineContext objektiloomine() {
			return getRuleContext(ObjektiloomineContext.class,0);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__3);
				setState(72);
				match(T__4);
				setState(73);
				tuup();
				setState(74);
				match(MUUTUJANIMI);
				setState(77);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(75);
					match(T__2);
					setState(76);
					avaldis();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(T__3);
				setState(80);
				match(MUUTUJANIMI);
				setState(81);
				match(T__2);
				setState(82);
				avaldis();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(T__3);
				setState(84);
				match(T__4);
				setState(85);
				tuup();
				setState(86);
				match(MUUTUJANIMI);
				setState(87);
				match(T__2);
				setState(88);
				objektiloomine();
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
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
			setState(94);
			match(T__10);
			setState(95);
			match(T__11);
			setState(96);
			avaldis();
			setState(97);
			match(T__12);
			setState(98);
			match(T__13);
			setState(99);
			programm();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(100);
				match(T__14);
				setState(101);
				match(T__11);
				setState(102);
				avaldis();
				setState(103);
				match(T__12);
				setState(104);
				match(T__13);
				setState(105);
				programm();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(112);
				match(T__15);
				setState(113);
				programm();
				}
			}

			setState(116);
			match(T__16);
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
			setState(118);
			match(T__17);
			setState(119);
			match(T__11);
			setState(120);
			avaldis();
			setState(121);
			match(T__12);
			setState(122);
			match(T__18);
			setState(123);
			programm();
			setState(124);
			match(T__16);
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
		public TerminalNode FUNKTSIOONINIMI() { return getToken(TEXTGYParser.FUNKTSIOONINIMI, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__19);
			setState(127);
			match(MUUTUJANIMI);
			setState(128);
			match(FUNKTSIOONINIMI);
			setState(129);
			match(T__11);
			setState(138);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__46) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				setState(130);
				avaldis();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(131);
					match(T__20);
					setState(132);
					avaldis();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
			match(T__12);
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
		public List<FunktsioonivaljakutseobjektContext> funktsioonivaljakutseobjekt() {
			return getRuleContexts(FunktsioonivaljakutseobjektContext.class);
		}
		public FunktsioonivaljakutseobjektContext funktsioonivaljakutseobjekt(int i) {
			return getRuleContext(FunktsioonivaljakutseobjektContext.class,i);
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
		enterRule(_localctx, 20, RULE_objektiloomine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__21);
			setState(143);
			match(T__22);
			setState(144);
			match(T__23);
			setState(145);
			match(MUUTUJANIMI);
			setState(146);
			match(T__24);
			setState(147);
			match(T__25);
			setState(148);
			objektituup();
			setState(149);
			match(T__26);
			setState(150);
			funktsioonivaljakutseobjekt();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__20) {
				{
				{
				setState(151);
				match(T__20);
				setState(152);
				funktsioonivaljakutseobjekt();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(T__16);
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
		enterRule(_localctx, 22, RULE_funktsiooniloomine);
		int _la;
		try {
			int _alt;
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__21);
				setState(161);
				match(T__22);
				setState(162);
				match(T__27);
				setState(163);
				match(FUNKTSIOONINIMI);
				setState(164);
				match(T__11);
				setState(179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(172);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(165);
							tuup();
							setState(166);
							match(T__4);
							setState(167);
							match(MUUTUJANIMI);
							setState(168);
							match(T__20);
							}
							} 
						}
						setState(174);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					}
					setState(175);
					tuup();
					setState(176);
					match(T__4);
					setState(177);
					match(MUUTUJANIMI);
					}
				}

				setState(181);
				match(T__12);
				setState(182);
				match(T__4);
				setState(183);
				programm();
				setState(184);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__21);
				setState(187);
				match(T__22);
				setState(188);
				match(T__27);
				setState(189);
				match(FUNKTSIOONINIMI);
				setState(190);
				match(T__11);
				setState(205);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) {
					{
					setState(198);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(191);
							tuup();
							setState(192);
							match(T__4);
							setState(193);
							match(MUUTUJANIMI);
							setState(194);
							match(T__20);
							}
							} 
						}
						setState(200);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
					}
					setState(201);
					tuup();
					setState(202);
					match(T__4);
					setState(203);
					match(MUUTUJANIMI);
					}
				}

				setState(207);
				match(T__12);
				setState(208);
				match(T__28);
				setState(209);
				tuup();
				setState(210);
				match(T__4);
				setState(211);
				programm();
				setState(212);
				match(T__16);
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
		enterRule(_localctx, 24, RULE_objektituup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
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

	public static class ObjektiparameeterContext extends ParserRuleContext {
		public ObjektiparameeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objektiparameeter; }
	 
		public ObjektiparameeterContext() { }
		public void copyFrom(ObjektiparameeterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ItemParameeterContext extends ObjektiparameeterContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public ItemParameeterContext(ObjektiparameeterContext ctx) { copyFrom(ctx); }
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
	public static class SkillParameeterContext extends ObjektiparameeterContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public SkillParameeterContext(ObjektiparameeterContext ctx) { copyFrom(ctx); }
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
	public static class DescriptionParameeterContext extends ObjektiparameeterContext {
		public TerminalNode SONE() { return getToken(TEXTGYParser.SONE, 0); }
		public DescriptionParameeterContext(ObjektiparameeterContext ctx) { copyFrom(ctx); }
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
	public static class AttributeParameeterContext extends ObjektiparameeterContext {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public AttributeParameeterContext(ObjektiparameeterContext ctx) { copyFrom(ctx); }
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

	public final ObjektiparameeterContext objektiparameeter() throws RecognitionException {
		ObjektiparameeterContext _localctx = new ObjektiparameeterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_objektiparameeter);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case T__32:
				_localctx = new DescriptionParameeterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(T__32);
				setState(219);
				match(T__11);
				setState(220);
				match(SONE);
				setState(221);
				match(T__12);
				}
				break;
			case T__33:
				_localctx = new ItemParameeterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(T__33);
				setState(223);
				match(T__11);
				setState(224);
				match(MUUTUJANIMI);
				setState(225);
				match(T__12);
				}
				break;
			case T__34:
				_localctx = new SkillParameeterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				match(T__34);
				setState(227);
				match(T__11);
				setState(228);
				match(MUUTUJANIMI);
				setState(229);
				match(T__4);
				setState(230);
				match(ARV);
				setState(231);
				match(T__12);
				}
				break;
			case T__35:
				_localctx = new AttributeParameeterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				match(T__35);
				setState(233);
				match(T__11);
				setState(234);
				match(MUUTUJANIMI);
				setState(235);
				match(T__12);
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

	public static class FunktsioonivaljakutseobjektContext extends ParserRuleContext {
		public TerminalNode FUNKTSIOONINIMI() { return getToken(TEXTGYParser.FUNKTSIOONINIMI, 0); }
		public List<AvaldisContext> avaldis() {
			return getRuleContexts(AvaldisContext.class);
		}
		public AvaldisContext avaldis(int i) {
			return getRuleContext(AvaldisContext.class,i);
		}
		public FunktsioonivaljakutseobjektContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktsioonivaljakutseobjekt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterFunktsioonivaljakutseobjekt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitFunktsioonivaljakutseobjekt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitFunktsioonivaljakutseobjekt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunktsioonivaljakutseobjektContext funktsioonivaljakutseobjekt() throws RecognitionException {
		FunktsioonivaljakutseobjektContext _localctx = new FunktsioonivaljakutseobjektContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funktsioonivaljakutseobjekt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(FUNKTSIOONINIMI);
			setState(239);
			match(T__11);
			setState(248);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__46) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
				{
				setState(240);
				avaldis();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(241);
					match(T__20);
					setState(242);
					avaldis();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
			match(T__12);
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
		enterRule(_localctx, 30, RULE_avaldis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
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
		enterRule(_localctx, 32, RULE_avaldis5);
		int _la;
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new VordlemineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				avaldis4(0);
				setState(255);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(256);
				avaldis4(0);
				}
				break;
			case 2:
				_localctx = new TriviaalneAvaldis5Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_avaldis4, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis4Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(262);
			avaldis3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LiitmineLahutamineContext(new Avaldis4Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis4);
					setState(264);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(265);
					_la = _input.LA(1);
					if ( !(_la==T__45 || _la==T__46) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(266);
					avaldis3(0);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_avaldis3, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TriviaalneAvaldis3Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(273);
			avaldis2();
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new KorrutamineJagamineContext(new Avaldis3Context(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_avaldis3);
					setState(275);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(276);
					_la = _input.LA(1);
					if ( !(_la==T__47 || _la==T__48) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(277);
					avaldis2();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 38, RULE_avaldis2);
		try {
			setState(286);
			switch (_input.LA(1)) {
			case T__46:
				_localctx = new UnaarneMiinusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(T__46);
				setState(284);
				avaldis2();
				}
				break;
			case T__11:
			case FUNKTSIOONINIMI:
			case MUUTUJANIMI:
			case SONE:
			case ARV:
				_localctx = new TriviaalneAvaldis2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
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
		enterRule(_localctx, 40, RULE_avaldis1);
		int _la;
		try {
			setState(302);
			switch (_input.LA(1)) {
			case FUNKTSIOONINIMI:
				_localctx = new FunktsiooniValjakutseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(FUNKTSIOONINIMI);
				setState(289);
				match(T__11);
				setState(298);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__46) | (1L << FUNKTSIOONINIMI) | (1L << MUUTUJANIMI) | (1L << SONE) | (1L << ARV))) != 0)) {
					{
					setState(290);
					avaldis();
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__20) {
						{
						{
						setState(291);
						match(T__20);
						setState(292);
						avaldis();
						}
						}
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(300);
				match(T__12);
				}
				break;
			case T__11:
			case MUUTUJANIMI:
			case SONE:
			case ARV:
				_localctx = new TriviaalneAvaldis1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
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
	public static class SkillAvaldisContext extends Avaldis0Context {
		public TerminalNode MUUTUJANIMI() { return getToken(TEXTGYParser.MUUTUJANIMI, 0); }
		public TerminalNode ARV() { return getToken(TEXTGYParser.ARV, 0); }
		public SkillAvaldisContext(Avaldis0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).enterSkillAvaldis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TEXTGYListener ) ((TEXTGYListener)listener).exitSkillAvaldis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TEXTGYVisitor ) return ((TEXTGYVisitor<? extends T>)visitor).visitSkillAvaldis(this);
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
		enterRule(_localctx, 42, RULE_avaldis0);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new SoneLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(SONE);
				}
				break;
			case 2:
				_localctx = new MuutujaNimiRContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(MUUTUJANIMI);
				}
				break;
			case 3:
				_localctx = new ArvuLiteraalRContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(ARV);
				}
				break;
			case 4:
				_localctx = new SuluAvaldisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(T__11);
				setState(308);
				avaldis();
				setState(309);
				match(T__12);
				}
				break;
			case 5:
				_localctx = new SkillAvaldisContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(311);
				match(MUUTUJANIMI);
				setState(312);
				match(T__4);
				setState(313);
				match(ARV);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return avaldis4_sempred((Avaldis4Context)_localctx, predIndex);
		case 18:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\t\3\t\5"+
		"\tu\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u0088\n\13\f\13\16\13\u008b\13\13\5\13\u008d\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f"+
		"\16\f\u009f\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ad"+
		"\n\r\f\r\16\r\u00b0\13\r\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c7\n\r\f\r\16\r\u00ca"+
		"\13\r\3\r\3\r\3\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d9"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ef\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00f6\n\20\f\20\16\20\u00f9\13\20\5\20\u00fb\n\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0106\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\7\23\u010e\n\23\f\23\16\23\u0111\13\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\25\3\25\3\25\5\25"+
		"\u0121\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u0128\n\26\f\26\16\26\u012b"+
		"\13\26\5\26\u012d\n\26\3\26\3\26\5\26\u0131\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u013d\n\27\3\27\2\4$&\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\b\f\3\2 \"\3\2\'/\3\2\60\61"+
		"\3\2\62\63\u014d\2.\3\2\2\2\4\65\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nE\3\2"+
		"\2\2\f\\\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22x\3\2\2\2\24\u0080\3\2\2\2"+
		"\26\u0090\3\2\2\2\30\u00d8\3\2\2\2\32\u00da\3\2\2\2\34\u00ee\3\2\2\2\36"+
		"\u00f0\3\2\2\2 \u00fe\3\2\2\2\"\u0105\3\2\2\2$\u0107\3\2\2\2&\u0112\3"+
		"\2\2\2(\u0120\3\2\2\2*\u0130\3\2\2\2,\u013c\3\2\2\2./\5\4\3\2/\3\3\2\2"+
		"\2\60\61\5\6\4\2\61\62\7\3\2\2\62\64\3\2\2\2\63\60\3\2\2\2\64\67\3\2\2"+
		"\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\28A\5\n\6\29A"+
		"\5\20\t\2:A\5\22\n\2;A\5 \21\2<A\5\30\r\2=A\5\24\13\2>A\5\f\7\2?A\5\b"+
		"\5\2@8\3\2\2\2@9\3\2\2\2@:\3\2\2\2@;\3\2\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2"+
		"\2\2@?\3\2\2\2A\7\3\2\2\2BC\7\4\2\2CD\5 \21\2D\t\3\2\2\2EF\7\65\2\2FG"+
		"\7\5\2\2GH\5 \21\2H\13\3\2\2\2IJ\7\6\2\2JK\7\7\2\2KL\5\16\b\2LO\7\65\2"+
		"\2MN\7\5\2\2NP\5 \21\2OM\3\2\2\2OP\3\2\2\2P]\3\2\2\2QR\7\6\2\2RS\7\65"+
		"\2\2ST\7\5\2\2T]\5 \21\2UV\7\6\2\2VW\7\7\2\2WX\5\16\b\2XY\7\65\2\2YZ\7"+
		"\5\2\2Z[\5\26\f\2[]\3\2\2\2\\I\3\2\2\2\\Q\3\2\2\2\\U\3\2\2\2]\r\3\2\2"+
		"\2^_\t\2\2\2_\17\3\2\2\2`a\7\r\2\2ab\7\16\2\2bc\5 \21\2cd\7\17\2\2de\7"+
		"\20\2\2eo\5\2\2\2fg\7\21\2\2gh\7\16\2\2hi\5 \21\2ij\7\17\2\2jk\7\20\2"+
		"\2kl\5\2\2\2ln\3\2\2\2mf\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pt\3\2\2"+
		"\2qo\3\2\2\2rs\7\22\2\2su\5\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\23"+
		"\2\2w\21\3\2\2\2xy\7\24\2\2yz\7\16\2\2z{\5 \21\2{|\7\17\2\2|}\7\25\2\2"+
		"}~\5\2\2\2~\177\7\23\2\2\177\23\3\2\2\2\u0080\u0081\7\26\2\2\u0081\u0082"+
		"\7\65\2\2\u0082\u0083\7\64\2\2\u0083\u008c\7\16\2\2\u0084\u0089\5 \21"+
		"\2\u0085\u0086\7\27\2\2\u0086\u0088\5 \21\2\u0087\u0085\3\2\2\2\u0088"+
		"\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\3\2"+
		"\2\2\u008b\u0089\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\17\2\2\u008f\25\3\2\2\2\u0090\u0091\7\30"+
		"\2\2\u0091\u0092\7\31\2\2\u0092\u0093\7\32\2\2\u0093\u0094\7\65\2\2\u0094"+
		"\u0095\7\33\2\2\u0095\u0096\7\34\2\2\u0096\u0097\5\32\16\2\u0097\u0098"+
		"\7\35\2\2\u0098\u009d\5\36\20\2\u0099\u009a\7\27\2\2\u009a\u009c\5\36"+
		"\20\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\23"+
		"\2\2\u00a1\27\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7\31\2\2\u00a4"+
		"\u00a5\7\36\2\2\u00a5\u00a6\7\64\2\2\u00a6\u00b5\7\16\2\2\u00a7\u00a8"+
		"\5\16\b\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\7\65\2\2\u00aa\u00ab\7\27\2"+
		"\2\u00ab\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\5\16\b\2\u00b2\u00b3\7\7\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b6\3"+
		"\2\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\17\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5\2\2\2\u00ba\u00bb\7"+
		"\23\2\2\u00bb\u00d9\3\2\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\7\31\2\2"+
		"\u00be\u00bf\7\36\2\2\u00bf\u00c0\7\64\2\2\u00c0\u00cf\7\16\2\2\u00c1"+
		"\u00c2\5\16\b\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\7\65\2\2\u00c4\u00c5\7"+
		"\27\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00cb\u00cc\5\16\b\2\u00cc\u00cd\7\7\2\2\u00cd\u00ce\7\65\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00d4\5\16\b\2\u00d4"+
		"\u00d5\7\7\2\2\u00d5\u00d6\5\2\2\2\u00d6\u00d7\7\23\2\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00a2\3\2\2\2\u00d8\u00bc\3\2\2\2\u00d9\31\3\2\2\2\u00da"+
		"\u00db\t\3\2\2\u00db\33\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7\16\2"+
		"\2\u00de\u00df\7\66\2\2\u00df\u00ef\7\17\2\2\u00e0\u00e1\7$\2\2\u00e1"+
		"\u00e2\7\16\2\2\u00e2\u00e3\7\65\2\2\u00e3\u00ef\7\17\2\2\u00e4\u00e5"+
		"\7%\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\7\65\2\2\u00e7\u00e8\7\7\2\2"+
		"\u00e8\u00e9\7\67\2\2\u00e9\u00ef\7\17\2\2\u00ea\u00eb\7&\2\2\u00eb\u00ec"+
		"\7\16\2\2\u00ec\u00ed\7\65\2\2\u00ed\u00ef\7\17\2\2\u00ee\u00dc\3\2\2"+
		"\2\u00ee\u00e0\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\35"+
		"\3\2\2\2\u00f0\u00f1\7\64\2\2\u00f1\u00fa\7\16\2\2\u00f2\u00f7\5 \21\2"+
		"\u00f3\u00f4\7\27\2\2\u00f4\u00f6\5 \21\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\7\17\2\2\u00fd\37\3\2\2\2\u00fe\u00ff\5\"\22\2\u00ff"+
		"!\3\2\2\2\u0100\u0101\5$\23\2\u0101\u0102\t\4\2\2\u0102\u0103\5$\23\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0106\5$\23\2\u0105\u0100\3\2\2\2\u0105\u0104"+
		"\3\2\2\2\u0106#\3\2\2\2\u0107\u0108\b\23\1\2\u0108\u0109\5&\24\2\u0109"+
		"\u010f\3\2\2\2\u010a\u010b\f\4\2\2\u010b\u010c\t\5\2\2\u010c\u010e\5&"+
		"\24\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110%\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\b\24\1\2"+
		"\u0113\u0114\5(\25\2\u0114\u011a\3\2\2\2\u0115\u0116\f\4\2\2\u0116\u0117"+
		"\t\6\2\2\u0117\u0119\5(\25\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\'\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d\u011e\7\61\2\2\u011e\u0121\5(\25\2\u011f\u0121\5*\26\2\u0120\u011d"+
		"\3\2\2\2\u0120\u011f\3\2\2\2\u0121)\3\2\2\2\u0122\u0123\7\64\2\2\u0123"+
		"\u012c\7\16\2\2\u0124\u0129\5 \21\2\u0125\u0126\7\27\2\2\u0126\u0128\5"+
		" \21\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0124\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\7\17\2\2\u012f"+
		"\u0131\5,\27\2\u0130\u0122\3\2\2\2\u0130\u012f\3\2\2\2\u0131+\3\2\2\2"+
		"\u0132\u013d\7\66\2\2\u0133\u013d\7\65\2\2\u0134\u013d\7\67\2\2\u0135"+
		"\u0136\7\16\2\2\u0136\u0137\5 \21\2\u0137\u0138\7\17\2\2\u0138\u013d\3"+
		"\2\2\2\u0139\u013a\7\65\2\2\u013a\u013b\7\7\2\2\u013b\u013d\7\67\2\2\u013c"+
		"\u0132\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0135\3\2"+
		"\2\2\u013c\u0139\3\2\2\2\u013d-\3\2\2\2\33\65@O\\ot\u0089\u008c\u009d"+
		"\u00ae\u00b5\u00c8\u00cf\u00d8\u00ee\u00f7\u00fa\u0105\u010f\u011a\u0120"+
		"\u0129\u012c\u0130\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}