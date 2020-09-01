// Generated from /Users/scientiacluster/IdeaProjects/Romano/src/Expr.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, INT=2;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_thousand = 2, RULE_hundred = 3, RULE_ten = 4, 
		RULE_unit = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "thousand", "hundred", "ten", "unit"
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
			null, "NEWLINE", "INT"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ExprParser.NEWLINE, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(12);
				expr();
				setState(13);
				match(NEWLINE);

				    System.out.println("");

				}
				}
				setState(20);
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

	public static class ExprContext extends ParserRuleContext {
		public ThousandContext thousand() {
			return getRuleContext(ThousandContext.class,0);
		}
		public HundredContext hundred() {
			return getRuleContext(HundredContext.class,0);
		}
		public TenContext ten() {
			return getRuleContext(TenContext.class,0);
		}
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(21);
				thousand();
				}
				{
				setState(22);
				hundred();
				}
				{
				setState(23);
				ten();
				}
				{
				setState(24);
				unit();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(26);
				hundred();
				}
				{
				setState(27);
				ten();
				}
				{
				setState(28);
				unit();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(30);
				ten();
				}
				{
				setState(31);
				unit();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				unit();
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

	public static class ThousandContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ThousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterThousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitThousand(this);
		}
	}

	public final ThousandContext thousand() throws RecognitionException {
		ThousandContext _localctx = new ThousandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_thousand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(INT);

			    int q = Main.parse(_ctx.getText());
			    if(q <= 3) {
			      System.out.print(Main.repeat(q, "M"));
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

	public static class HundredContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public HundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterHundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitHundred(this);
		}
	}

	public final HundredContext hundred() throws RecognitionException {
		HundredContext _localctx = new HundredContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(INT);

			    int q = Main.parse(_ctx.getText());
			    if(q <= 3) {
			        System.out.print(Main.repeat(q, "C"));
			    }
			    if(q == 4) {
			        System.out.print("CD");
			    }
			    if(q >= 5 && q <=8) {
			        System.out.print("D");
			        System.out.print(Main.repeat(q-5, "C"));
			    }
			    if(q == 9) {
			        System.out.print("CM");
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

	public static class TenContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTen(this);
		}
	}

	public final TenContext ten() throws RecognitionException {
		TenContext _localctx = new TenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(INT);

			    int q = Main.parse(_ctx.getText());
			    if(q <= 3) {
			        System.out.print(Main.repeat(q, "X"));
			    }
			    if(q == 4) {
			        System.out.print("XL");
			    }
			    if(q >= 5 && q <=8) {
			        System.out.print("L");
			        System.out.print(Main.repeat(q-5, "X"));
			    }
			    if(q == 9) {
			        System.out.print("XC");
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

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(INT);

			    int q = Main.parse(_ctx.getText());
			    if(q <= 3) {
			        System.out.print(Main.repeat(q, "I"));
			    }
			    if(q == 4) {
			        System.out.print("IV");
			    }
			    if(q >= 5 && q <=8) {
			        System.out.print("V");
			        System.out.print(Main.repeat(q-5, "I"));
			    }
			    if(q == 9) {
			        System.out.print("IX");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\4\63\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\7\2\23\n\2\f\2\16"+
		"\2\26\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n"+
		"\f\2\2\2\60\2\24\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f"+
		"/\3\2\2\2\16\17\5\4\3\2\17\20\7\3\2\2\20\21\b\2\1\2\21\23\3\2\2\2\22\16"+
		"\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\24\25\3\2\2\2\25\3\3\2\2\2\26\24"+
		"\3\2\2\2\27\30\5\6\4\2\30\31\5\b\5\2\31\32\5\n\6\2\32\33\5\f\7\2\33%\3"+
		"\2\2\2\34\35\5\b\5\2\35\36\5\n\6\2\36\37\5\f\7\2\37%\3\2\2\2 !\5\n\6\2"+
		"!\"\5\f\7\2\"%\3\2\2\2#%\5\f\7\2$\27\3\2\2\2$\34\3\2\2\2$ \3\2\2\2$#\3"+
		"\2\2\2%\5\3\2\2\2&\'\7\4\2\2\'(\b\4\1\2(\7\3\2\2\2)*\7\4\2\2*+\b\5\1\2"+
		"+\t\3\2\2\2,-\7\4\2\2-.\b\6\1\2.\13\3\2\2\2/\60\7\4\2\2\60\61\b\7\1\2"+
		"\61\r\3\2\2\2\4\24$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}