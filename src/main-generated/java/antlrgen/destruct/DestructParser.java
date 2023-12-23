// Generated from Destruct.g4 by ANTLR 4.13.1
package antlrgen.destruct;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DestructParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, SINGLE_LINE_COMMENT=14, MULTI_LINE_COMMENT=15, 
		LITERAL=16, STRING=17, NUMBER=18, NUMERIC_LITERAL=19, SYMBOL=20, IDENTIFIER=21, 
		WS=22;
	public static final int
		RULE_start = 0, RULE_ruleStatement = 1, RULE_ruleTarget = 2, RULE_targetSpecifier = 3, 
		RULE_match = 4, RULE_transformed = 5, RULE_destruct = 6, RULE_destructRest = 7, 
		RULE_rest = 8, RULE_obj = 9, RULE_destructPair = 10, RULE_destructDefault = 11, 
		RULE_pair = 12, RULE_key = 13, RULE_destructValue = 14, RULE_value = 15, 
		RULE_destructArr = 16, RULE_destructArrValue = 17, RULE_arr = 18, RULE_arrValue = 19, 
		RULE_number = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "ruleStatement", "ruleTarget", "targetSpecifier", "match", "transformed", 
			"destruct", "destructRest", "rest", "obj", "destructPair", "destructDefault", 
			"pair", "key", "destructValue", "value", "destructArr", "destructArrValue", 
			"arr", "arrValue", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'|'", "';'", "'.'", "'*'", "'=>'", "'{'", "','", "'}'", 
			"'...'", "'='", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", "LITERAL", "STRING", 
			"NUMBER", "NUMERIC_LITERAL", "SYMBOL", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "Destruct.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DestructParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<RuleStatementContext> ruleStatement() {
			return getRuleContexts(RuleStatementContext.class);
		}
		public RuleStatementContext ruleStatement(int i) {
			return getRuleContext(RuleStatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(42);
				ruleStatement();
				}
				}
				setState(47);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleStatementContext extends ParserRuleContext {
		public RuleTargetContext ruleTarget() {
			return getRuleContext(RuleTargetContext.class,0);
		}
		public List<MatchContext> match() {
			return getRuleContexts(MatchContext.class);
		}
		public MatchContext match(int i) {
			return getRuleContext(MatchContext.class,i);
		}
		public RuleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterRuleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitRuleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitRuleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleStatementContext ruleStatement() throws RecognitionException {
		RuleStatementContext _localctx = new RuleStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			ruleTarget();
			setState(49);
			match(T__0);
			setState(50);
			match();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(51);
				match(T__1);
				setState(52);
				match();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTargetContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DestructParser.IDENTIFIER, 0); }
		public List<TargetSpecifierContext> targetSpecifier() {
			return getRuleContexts(TargetSpecifierContext.class);
		}
		public TargetSpecifierContext targetSpecifier(int i) {
			return getRuleContext(TargetSpecifierContext.class,i);
		}
		public RuleTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterRuleTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitRuleTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitRuleTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleTargetContext ruleTarget() throws RecognitionException {
		RuleTargetContext _localctx = new RuleTargetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENTIFIER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(61);
				targetSpecifier();
				}
				}
				setState(66);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TargetSpecifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DestructParser.IDENTIFIER, 0); }
		public TargetSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterTargetSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitTargetSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitTargetSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetSpecifierContext targetSpecifier() throws RecognitionException {
		TargetSpecifierContext _localctx = new TargetSpecifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_targetSpecifier);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__3);
				setState(68);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(T__3);
				setState(70);
				match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MatchContext extends ParserRuleContext {
		public DestructContext destruct() {
			return getRuleContext(DestructContext.class,0);
		}
		public TransformedContext transformed() {
			return getRuleContext(TransformedContext.class,0);
		}
		public MatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitMatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchContext match() throws RecognitionException {
		MatchContext _localctx = new MatchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			destruct();
			setState(74);
			match(T__5);
			setState(75);
			transformed();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TransformedContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TransformedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterTransformed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitTransformed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitTransformed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformedContext transformed() throws RecognitionException {
		TransformedContext _localctx = new TransformedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_transformed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructContext extends ParserRuleContext {
		public List<DestructPairContext> destructPair() {
			return getRuleContexts(DestructPairContext.class);
		}
		public DestructPairContext destructPair(int i) {
			return getRuleContext(DestructPairContext.class,i);
		}
		public DestructRestContext destructRest() {
			return getRuleContext(DestructRestContext.class,0);
		}
		public DestructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructContext destruct() throws RecognitionException {
		DestructContext _localctx = new DestructContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_destruct);
		int _la;
		try {
			int _alt;
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__6);
				setState(80);
				destructPair();
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						match(T__7);
						setState(82);
						destructPair();
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(88);
					match(T__7);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__9) {
						{
						setState(89);
						destructRest();
						}
					}

					}
				}

				setState(94);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__6);
				setState(97);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructRestContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public DestructRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructRestContext destructRest() throws RecognitionException {
		DestructRestContext _localctx = new DestructRestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_destructRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__9);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2818048L) != 0)) {
				{
				setState(101);
				key();
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class RestContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitRest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__9);
			setState(105);
			key();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitObj(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitObj(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_obj);
		int _la;
		try {
			int _alt;
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(T__6);
				setState(108);
				pair();
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(T__7);
						setState(110);
						pair();
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(116);
					match(T__7);
					}
				}

				setState(119);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(T__6);
				setState(122);
				match(T__8);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructPairContext extends ParserRuleContext {
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public DestructValueContext destructValue() {
			return getRuleContext(DestructValueContext.class,0);
		}
		public DestructDefaultContext destructDefault() {
			return getRuleContext(DestructDefaultContext.class,0);
		}
		public DestructPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructPairContext destructPair() throws RecognitionException {
		DestructPairContext _localctx = new DestructPairContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_destructPair);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL:
			case STRING:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				key();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(126);
					match(T__0);
					setState(127);
					destructValue();
					}
				}

				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(130);
					destructDefault();
					}
				}

				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructDefaultContext extends ParserRuleContext {
		public DestructValueContext destructValue() {
			return getRuleContext(DestructValueContext.class,0);
		}
		public DestructDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructDefaultContext destructDefault() throws RecognitionException {
		DestructDefaultContext _localctx = new DestructDefaultContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_destructDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			match(T__10);
			setState(137);
			destructValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PairContext extends ParserRuleContext {
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pair);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				rest();
				}
				break;
			case LITERAL:
			case STRING:
			case NUMERIC_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				key();
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(141);
					match(T__0);
					setState(142);
					value();
					}
				}

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

	@SuppressWarnings("CheckReturnValue")
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DestructParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DestructParser.IDENTIFIER, 0); }
		public TerminalNode LITERAL() { return getToken(DestructParser.LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(DestructParser.NUMERIC_LITERAL, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2818048L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DestructParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public DestructArrContext destructArr() {
			return getRuleContext(DestructArrContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(DestructParser.LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DestructParser.IDENTIFIER, 0); }
		public DestructValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructValueContext destructValue() throws RecognitionException {
		DestructValueContext _localctx = new DestructValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_destructValue);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(STRING);
				}
				break;
			case NUMBER:
			case NUMERIC_LITERAL:
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				number();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				obj();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				destructArr();
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DestructParser.STRING, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ObjContext obj() {
			return getRuleContext(ObjContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode LITERAL() { return getToken(DestructParser.LITERAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DestructParser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(STRING);
				}
				break;
			case NUMBER:
			case NUMERIC_LITERAL:
			case SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				number();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				obj();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				arr();
				}
				break;
			case LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				match(LITERAL);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructArrContext extends ParserRuleContext {
		public List<DestructArrValueContext> destructArrValue() {
			return getRuleContexts(DestructArrValueContext.class);
		}
		public DestructArrValueContext destructArrValue(int i) {
			return getRuleContext(DestructArrValueContext.class,i);
		}
		public List<DestructDefaultContext> destructDefault() {
			return getRuleContexts(DestructDefaultContext.class);
		}
		public DestructDefaultContext destructDefault(int i) {
			return getRuleContext(DestructDefaultContext.class,i);
		}
		public DestructArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructArrContext destructArr() throws RecognitionException {
		DestructArrContext _localctx = new DestructArrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_destructArr);
		int _la;
		try {
			int _alt;
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__11);
				setState(166);
				destructArrValue();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(167);
					destructDefault();
					}
				}

				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						match(T__7);
						setState(171);
						destructArrValue();
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__10) {
							{
							setState(172);
							destructDefault();
							}
						}

						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(180);
					match(T__7);
					}
				}

				setState(183);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(T__11);
				setState(186);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestructArrValueContext extends ParserRuleContext {
		public DestructValueContext destructValue() {
			return getRuleContext(DestructValueContext.class,0);
		}
		public DestructRestContext destructRest() {
			return getRuleContext(DestructRestContext.class,0);
		}
		public DestructArrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destructArrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterDestructArrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitDestructArrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitDestructArrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DestructArrValueContext destructArrValue() throws RecognitionException {
		DestructArrValueContext _localctx = new DestructArrValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_destructArrValue);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__11:
			case LITERAL:
			case STRING:
			case NUMBER:
			case NUMERIC_LITERAL:
			case SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				destructValue();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				destructRest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrContext extends ParserRuleContext {
		public List<ArrValueContext> arrValue() {
			return getRuleContexts(ArrValueContext.class);
		}
		public ArrValueContext arrValue(int i) {
			return getRuleContext(ArrValueContext.class,i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arr);
		int _la;
		try {
			int _alt;
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__11);
				setState(194);
				arrValue();
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(195);
						match(T__7);
						setState(196);
						arrValue();
						}
						} 
					}
					setState(201);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(202);
					match(T__7);
					}
				}

				setState(205);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__11);
				setState(208);
				match(T__12);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ArrValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterArrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitArrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitArrValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrValueContext arrValue() throws RecognitionException {
		ArrValueContext _localctx = new ArrValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrValue);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__11:
			case LITERAL:
			case STRING:
			case NUMBER:
			case NUMERIC_LITERAL:
			case SYMBOL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				value();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				rest();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(DestructParser.NUMERIC_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(DestructParser.NUMBER, 0); }
		public TerminalNode SYMBOL() { return getToken(DestructParser.SYMBOL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DestructListener ) ((DestructListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DestructVisitor ) return ((DestructVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SYMBOL) {
				{
				setState(215);
				match(SYMBOL);
				}
			}

			setState(218);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==NUMERIC_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00dd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0005"+
		"\u0000,\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u00019\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002?\b"+
		"\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006T\b\u0006\n\u0006\f\u0006W\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006[\b\u0006\u0003\u0006]\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006c\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0003\u0007g\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0005\tp\b\t\n\t\f\ts\t\t\u0001\t\u0003\tv\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t|\b\t\u0001\n\u0001\n\u0001\n\u0003\n\u0081"+
		"\b\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0003\n\u0087\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0090\b\f\u0003"+
		"\f\u0092\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009c\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a4"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00a9\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ae\b\u0010\u0005\u0010"+
		"\u00b0\b\u0010\n\u0010\f\u0010\u00b3\t\u0010\u0001\u0010\u0003\u0010\u00b6"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00bc"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00c0\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00c6\b\u0012\n\u0012"+
		"\f\u0012\u00c9\t\u0012\u0001\u0012\u0003\u0012\u00cc\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d2\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d6\b\u0013\u0001\u0014\u0003\u0014\u00d9\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(\u0000\u0002\u0003\u0000\u0010\u0011\u0013\u0013\u0015\u0015\u0001"+
		"\u0000\u0012\u0013\u00ed\u0000-\u0001\u0000\u0000\u0000\u00020\u0001\u0000"+
		"\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006G\u0001\u0000\u0000\u0000"+
		"\bI\u0001\u0000\u0000\u0000\nM\u0001\u0000\u0000\u0000\fb\u0001\u0000"+
		"\u0000\u0000\u000ed\u0001\u0000\u0000\u0000\u0010h\u0001\u0000\u0000\u0000"+
		"\u0012{\u0001\u0000\u0000\u0000\u0014\u0086\u0001\u0000\u0000\u0000\u0016"+
		"\u0088\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000\u0000\u001a"+
		"\u0093\u0001\u0000\u0000\u0000\u001c\u009b\u0001\u0000\u0000\u0000\u001e"+
		"\u00a3\u0001\u0000\u0000\u0000 \u00bb\u0001\u0000\u0000\u0000\"\u00bf"+
		"\u0001\u0000\u0000\u0000$\u00d1\u0001\u0000\u0000\u0000&\u00d5\u0001\u0000"+
		"\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000"+
		"+*\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000.\u0001\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u000001\u0003\u0004\u0002\u000012\u0005\u0001\u0000\u0000"+
		"27\u0003\b\u0004\u000034\u0005\u0002\u0000\u000046\u0003\b\u0004\u0000"+
		"53\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0003\u0000\u0000;\u0003\u0001\u0000\u0000\u0000"+
		"<@\u0005\u0015\u0000\u0000=?\u0003\u0006\u0003\u0000>=\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0005\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0004\u0000\u0000DH\u0005\u0015\u0000\u0000EF\u0005\u0004\u0000"+
		"\u0000FH\u0005\u0005\u0000\u0000GC\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0003\f\u0006\u0000JK\u0005"+
		"\u0006\u0000\u0000KL\u0003\n\u0005\u0000L\t\u0001\u0000\u0000\u0000MN"+
		"\u0003\u001e\u000f\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0007"+
		"\u0000\u0000PU\u0003\u0014\n\u0000QR\u0005\b\u0000\u0000RT\u0003\u0014"+
		"\n\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000V\\\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000XZ\u0005\b\u0000\u0000Y[\u0003\u000e\u0007\u0000ZY\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000"+
		"\\X\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_c\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000ac\u0005\t\u0000\u0000bO\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000c\r\u0001\u0000\u0000\u0000df\u0005\n\u0000\u0000eg\u0003\u001a"+
		"\r\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u000f\u0001"+
		"\u0000\u0000\u0000hi\u0005\n\u0000\u0000ij\u0003\u001a\r\u0000j\u0011"+
		"\u0001\u0000\u0000\u0000kl\u0005\u0007\u0000\u0000lq\u0003\u0018\f\u0000"+
		"mn\u0005\b\u0000\u0000np\u0003\u0018\f\u0000om\u0001\u0000\u0000\u0000"+
		"ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tv\u0005\b\u0000"+
		"\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0005\t\u0000\u0000x|\u0001\u0000\u0000\u0000yz\u0005\u0007"+
		"\u0000\u0000z|\u0005\t\u0000\u0000{k\u0001\u0000\u0000\u0000{y\u0001\u0000"+
		"\u0000\u0000|\u0013\u0001\u0000\u0000\u0000}\u0080\u0003\u001a\r\u0000"+
		"~\u007f\u0005\u0001\u0000\u0000\u007f\u0081\u0003\u001c\u000e\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0003\u0016\u000b\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0087"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086}\u0001"+
		"\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u0015\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0005\u000b\u0000\u0000\u0089\u008a\u0003"+
		"\u001c\u000e\u0000\u008a\u0017\u0001\u0000\u0000\u0000\u008b\u0092\u0003"+
		"\u0010\b\u0000\u008c\u008f\u0003\u001a\r\u0000\u008d\u008e\u0005\u0001"+
		"\u0000\u0000\u008e\u0090\u0003\u001e\u000f\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008b\u0001\u0000\u0000\u0000\u0091\u008c\u0001\u0000"+
		"\u0000\u0000\u0092\u0019\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0000"+
		"\u0000\u0000\u0094\u001b\u0001\u0000\u0000\u0000\u0095\u009c\u0005\u0011"+
		"\u0000\u0000\u0096\u009c\u0003(\u0014\u0000\u0097\u009c\u0003\u0012\t"+
		"\u0000\u0098\u009c\u0003 \u0010\u0000\u0099\u009c\u0005\u0010\u0000\u0000"+
		"\u009a\u009c\u0005\u0015\u0000\u0000\u009b\u0095\u0001\u0000\u0000\u0000"+
		"\u009b\u0096\u0001\u0000\u0000\u0000\u009b\u0097\u0001\u0000\u0000\u0000"+
		"\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u001d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a4\u0005\u0011\u0000\u0000\u009e\u00a4\u0003(\u0014\u0000\u009f"+
		"\u00a4\u0003\u0012\t\u0000\u00a0\u00a4\u0003$\u0012\u0000\u00a1\u00a4"+
		"\u0005\u0010\u0000\u0000\u00a2\u00a4\u0005\u0015\u0000\u0000\u00a3\u009d"+
		"\u0001\u0000\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u009f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u001f"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00a8\u0003"+
		"\"\u0011\u0000\u00a7\u00a9\u0003\u0016\u000b\u0000\u00a8\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00ad\u0003\"\u0011"+
		"\u0000\u00ac\u00ae\u0003\u0016\u000b\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000"+
		"\u0000\u00af\u00aa\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b6\u0005\b\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b8\u0005\r\u0000\u0000\u00b8\u00bc\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\u0005\f\u0000\u0000\u00ba\u00bc\u0005\r\u0000\u0000\u00bb\u00a5"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc!\u0001"+
		"\u0000\u0000\u0000\u00bd\u00c0\u0003\u001c\u000e\u0000\u00be\u00c0\u0003"+
		"\u000e\u0007\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0#\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005\f"+
		"\u0000\u0000\u00c2\u00c7\u0003&\u0013\u0000\u00c3\u00c4\u0005\b\u0000"+
		"\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005\b\u0000\u0000\u00cb"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce\u00d2"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\f\u0000\u0000\u00d0\u00d2\u0005"+
		"\r\u0000\u0000\u00d1\u00c1\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2%\u0001\u0000\u0000\u0000\u00d3\u00d6\u0003\u001e\u000f"+
		"\u0000\u00d4\u00d6\u0003\u0010\b\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\'\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d9\u0005\u0014\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0007\u0001\u0000\u0000\u00db)\u0001\u0000\u0000\u0000\u001e-7"+
		"@GUZ\\bfqu{\u0080\u0083\u0086\u008f\u0091\u009b\u00a3\u00a8\u00ad\u00b1"+
		"\u00b5\u00bb\u00bf\u00c7\u00cb\u00d1\u00d5\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}