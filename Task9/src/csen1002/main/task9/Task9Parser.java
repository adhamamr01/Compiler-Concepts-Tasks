// Generated from C:/Users/adham/CompilerTask/Task9/src/csen1002/main/task9\Task9.g4 by ANTLR 4.10.1
package csen1002.main.task9;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Task9Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LETTERA=1, LETTERB=2, LETTERC=3, WS=4;
	public static final int
		RULE_start = 0, RULE_s = 1, RULE_a = 2, RULE_b = 3, RULE_c = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "s", "a", "b", "c"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LETTERA", "LETTERB", "LETTERC", "WS"
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
	public String getGrammarFileName() { return "Task9.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		/**
		 * Compares two integer numbers
		 *
		 * @param x the first number to compare
		 * @param y the second number to compare
		 * @return 1 if x is equal to y, and 0 otherwise
		 */
		public static int equals(int x, int y) {
		    return x == y ? 1 : 0;
		}

	public Task9Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public SContext s;
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Task9Parser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task9Visitor ) return ((Task9Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((StartContext)_localctx).s = s();
			setState(11);
			match(EOF);
			System.out.println("The result is" + ((StartContext)_localctx).s.check);
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

	public static class SContext extends ParserRuleContext {
		public int check;
		public AContext a;
		public CContext c;
		public BContext b;
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task9Visitor ) return ((Task9Visitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_s);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((SContext)_localctx).a = a(0);
			setState(15);
			((SContext)_localctx).c = c(0);
			setState(16);
			((SContext)_localctx).b = b(0);
			if(((SContext)_localctx).a.check== 1 && ((SContext)_localctx).b.check == 0 && ((SContext)_localctx).c.check == 0)
			                                            ((SContext)_localctx).check =  1;
			                                        else
			                                            ((SContext)_localctx).check =  equals(((SContext)_localctx).a.check,((SContext)_localctx).b.check) * equals(((SContext)_localctx).a.check,((SContext)_localctx).c.check) ;
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

	public static class AContext extends ParserRuleContext {
		public int inh;
		public int check;
		public AContext A1;
		public TerminalNode LETTERA() { return getToken(Task9Parser.LETTERA, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public AContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AContext(ParserRuleContext parent, int invokingState, int inh) {
			super(parent, invokingState);
			this.inh = inh;
		}
		@Override public int getRuleIndex() { return RULE_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task9Visitor ) return ((Task9Visitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AContext a(int inh) throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState(), inh);
		enterRule(_localctx, 4, RULE_a);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERA:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(LETTERA);
				setState(20);
				((AContext)_localctx).A1 = a(_localctx.inh);
				((AContext)_localctx).check =  ((AContext)_localctx).A1.check + 1;
				}
				break;
			case EOF:
			case LETTERB:
			case LETTERC:
				enterOuterAlt(_localctx, 2);
				{
				((AContext)_localctx).check = _localctx.inh;
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

	public static class BContext extends ParserRuleContext {
		public int inh;
		public int check;
		public BContext B1;
		public TerminalNode LETTERB() { return getToken(Task9Parser.LETTERB, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BContext(ParserRuleContext parent, int invokingState, int inh) {
			super(parent, invokingState);
			this.inh = inh;
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task9Visitor ) return ((Task9Visitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b(int inh) throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState(), inh);
		enterRule(_localctx, 6, RULE_b);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERB:
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(LETTERB);
				setState(27);
				((BContext)_localctx).B1 = b(_localctx.inh);
				((BContext)_localctx).check =  ((BContext)_localctx).B1.check + 1;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				((BContext)_localctx).check = _localctx.inh;
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

	public static class CContext extends ParserRuleContext {
		public int inh;
		public int check;
		public CContext C1;
		public TerminalNode LETTERC() { return getToken(Task9Parser.LETTERC, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CContext(ParserRuleContext parent, int invokingState, int inh) {
			super(parent, invokingState);
			this.inh = inh;
		}
		@Override public int getRuleIndex() { return RULE_c; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).enterC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Task9Listener ) ((Task9Listener)listener).exitC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Task9Visitor ) return ((Task9Visitor<? extends T>)visitor).visitC(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c(int inh) throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState(), inh);
		enterRule(_localctx, 8, RULE_c);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTERC:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(LETTERC);
				setState(34);
				((CContext)_localctx).C1 = c(_localctx.inh);
				((CContext)_localctx).check =  ((CContext)_localctx).C1.check + 1;
				}
				break;
			case EOF:
			case LETTERB:
				enterOuterAlt(_localctx, 2);
				{
				((CContext)_localctx).check = _localctx.inh;
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

	public static final String _serializedATN =
		"\u0004\u0001\u0004)\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\u0019\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003 \b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\'\b\u0004\u0001"+
		"\u0004\u0000\u0000\u0005\u0000\u0002\u0004\u0006\b\u0000\u0000&\u0000"+
		"\n\u0001\u0000\u0000\u0000\u0002\u000e\u0001\u0000\u0000\u0000\u0004\u0018"+
		"\u0001\u0000\u0000\u0000\u0006\u001f\u0001\u0000\u0000\u0000\b&\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000"+
		"\u0000\u0001\f\r\u0006\u0000\uffff\uffff\u0000\r\u0001\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0003\b\u0004\u0000"+
		"\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0012\u0006\u0001\uffff\uffff"+
		"\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u0001\u0000"+
		"\u0000\u0014\u0015\u0003\u0004\u0002\u0000\u0015\u0016\u0006\u0002\uffff"+
		"\uffff\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0019\u0006\u0002"+
		"\uffff\uffff\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018\u0017\u0001"+
		"\u0000\u0000\u0000\u0019\u0005\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0002\u0000\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u001d\u0006"+
		"\u0003\uffff\uffff\u0000\u001d \u0001\u0000\u0000\u0000\u001e \u0006\u0003"+
		"\uffff\uffff\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 \u0007\u0001\u0000\u0000\u0000!\"\u0005\u0003\u0000"+
		"\u0000\"#\u0003\b\u0004\u0000#$\u0006\u0004\uffff\uffff\u0000$\'\u0001"+
		"\u0000\u0000\u0000%\'\u0006\u0004\uffff\uffff\u0000&!\u0001\u0000\u0000"+
		"\u0000&%\u0001\u0000\u0000\u0000\'\t\u0001\u0000\u0000\u0000\u0003\u0018"+
		"\u001f&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}