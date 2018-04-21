// Generated from zeal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class zealParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, IDENTIFIER=34, INT_VAL=35, TEXT=36, WHITESPACE=37, 
		BLOCK_COMMENT=38, LINE_COMMENT=39;
	public static final int
		RULE_program = 0, RULE_main_command_list = 1, RULE_command_list = 2, RULE_function_command_list = 3, 
		RULE_command = 4, RULE_declarations = 5, RULE_initialization_int = 6, 
		RULE_initialization_bool = 7, RULE_bool_expr = 8, RULE_expr = 9, RULE_term = 10, 
		RULE_print_statement = 11, RULE_print_pattern = 12, RULE_factor = 13, 
		RULE_function = 14, RULE_function_call = 15, RULE_params = 16, RULE_data_types = 17, 
		RULE_return_types = 18, RULE_return_stmt = 19;
	public static final String[] ruleNames = {
		"program", "main_command_list", "command_list", "function_command_list", 
		"command", "declarations", "initialization_int", "initialization_bool", 
		"bool_expr", "expr", "term", "print_statement", "print_pattern", "factor", 
		"function", "function_call", "params", "data_types", "return_types", "return_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
		"'num'", "'bool'", "'true'", "'false'", "'=='", "'!='", "'=<'", "'<='", 
		"'=>'", "'>='", "'>'", "'<'", "'!'", "'&&'", "'||'", "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'print'", "','", "'void'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
		"INT_VAL", "TEXT", "WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "zeal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public zealParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Main_command_listContext main_command_list() {
			return getRuleContext(Main_command_listContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			main_command_list();
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

	public static class Main_command_listContext extends ParserRuleContext {
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Main_command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterMain_command_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitMain_command_list(this);
		}
	}

	public final Main_command_listContext main_command_list() throws RecognitionException {
		Main_command_listContext _localctx = new Main_command_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_command_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			command_list();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__31))) != 0)) {
				{
				{
				setState(43);
				function();
				}
				}
				setState(48);
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

	public static class Command_listContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public Command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterCommand_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitCommand_list(this);
		}
	}

	public final Command_listContext command_list() throws RecognitionException {
		Command_listContext _localctx = new Command_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command_list);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				command();
				setState(51);
				command_list();
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

	public static class Function_command_listContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public Function_command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_command_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunction_command_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunction_command_list(this);
		}
	}

	public final Function_command_listContext function_command_list() throws RecognitionException {
		Function_command_listContext _localctx = new Function_command_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_command_list);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				command();
				setState(57);
				command_list();
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

	public static class CommandContext extends ParserRuleContext {
		public Token varName;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Command_listContext> command_list() {
			return getRuleContexts(Command_listContext.class);
		}
		public Command_listContext command_list(int i) {
			return getRuleContext(Command_listContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				((CommandContext)_localctx).varName = match(IDENTIFIER);
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				setState(64);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				declarations();
				setState(67);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(T__2);
				setState(70);
				match(T__3);
				setState(71);
				bool_expr();
				setState(72);
				match(T__4);
				setState(73);
				match(T__5);
				setState(74);
				command_list();
				setState(75);
				match(T__6);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(76);
					match(T__7);
					setState(77);
					match(T__5);
					setState(78);
					command_list();
					setState(79);
					match(T__6);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(T__8);
				setState(89);
				match(T__3);
				setState(90);
				bool_expr();
				setState(91);
				match(T__4);
				setState(92);
				match(T__5);
				setState(93);
				command_list();
				setState(94);
				match(T__6);
				setState(95);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(97);
					data_types();
					}
				}

				setState(100);
				((CommandContext)_localctx).varName = match(IDENTIFIER);
				setState(101);
				match(T__0);
				setState(102);
				function_call();
				setState(103);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				function_call();
				setState(106);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				print_statement();
				setState(109);
				match(T__1);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public Token varName;
		public Initialization_intContext initialization_int() {
			return getRuleContext(Initialization_intContext.class,0);
		}
		public Initialization_boolContext initialization_bool() {
			return getRuleContext(Initialization_boolContext.class,0);
		}
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarations);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				((DeclarationsContext)_localctx).varName = match(T__9);
				setState(114);
				initialization_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((DeclarationsContext)_localctx).varName = match(T__10);
				setState(116);
				initialization_bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				data_types();
				setState(118);
				((DeclarationsContext)_localctx).varName = match(IDENTIFIER);
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

	public static class Initialization_intContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode INT_VAL() { return getToken(zealParser.INT_VAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public Initialization_intContext initialization_int() {
			return getRuleContext(Initialization_intContext.class,0);
		}
		public Initialization_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterInitialization_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitInitialization_int(this);
		}
	}

	public final Initialization_intContext initialization_int() throws RecognitionException {
		Initialization_intContext _localctx = new Initialization_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initialization_int);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((Initialization_intContext)_localctx).varName = match(IDENTIFIER);
				setState(123);
				match(T__0);
				setState(124);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				((Initialization_intContext)_localctx).varName = match(IDENTIFIER);
				setState(126);
				match(T__0);
				setState(127);
				initialization_int();
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

	public static class Initialization_boolContext extends ParserRuleContext {
		public Token varName;
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public Initialization_boolContext initialization_bool() {
			return getRuleContext(Initialization_boolContext.class,0);
		}
		public Initialization_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterInitialization_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitInitialization_bool(this);
		}
	}

	public final Initialization_boolContext initialization_bool() throws RecognitionException {
		Initialization_boolContext _localctx = new Initialization_boolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_initialization_bool);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				((Initialization_boolContext)_localctx).varName = match(IDENTIFIER);
				setState(131);
				match(T__0);
				setState(132);
				bool_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((Initialization_boolContext)_localctx).varName = match(IDENTIFIER);
				setState(134);
				match(T__0);
				setState(135);
				initialization_bool();
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

	public static class Bool_exprContext extends ParserRuleContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bool_expr);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(141);
				match(T__13);
				setState(142);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(145);
				match(T__14);
				setState(146);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(149);
				match(T__15);
				setState(150);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(153);
				match(T__16);
				setState(154);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(157);
				match(T__17);
				setState(158);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(161);
				match(T__18);
				setState(162);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(165);
				match(T__19);
				setState(166);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(168);
				((Bool_exprContext)_localctx).left = expr(0);
				setState(169);
				match(T__20);
				setState(170);
				((Bool_exprContext)_localctx).right = expr(0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				match(T__21);
				setState(173);
				match(T__3);
				setState(174);
				bool_expr();
				setState(175);
				match(T__4);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				match(T__3);
				setState(178);
				bool_expr();
				setState(179);
				match(T__4);
				setState(180);
				match(T__22);
				setState(181);
				match(T__3);
				setState(182);
				bool_expr();
				setState(183);
				match(T__4);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				match(T__3);
				setState(186);
				bool_expr();
				setState(187);
				match(T__4);
				setState(188);
				match(T__23);
				setState(189);
				match(T__3);
				setState(190);
				bool_expr();
				setState(191);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public TermContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case IDENTIFIER:
			case INT_VAL:
				{
				setState(196);
				term(0);
				}
				break;
			case T__29:
				{
				setState(197);
				print_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(201);
						match(T__24);
						setState(202);
						((ExprContext)_localctx).right = term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(T__25);
						setState(205);
						((ExprContext)_localctx).right = term(0);
						}
						break;
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext left;
		public FactorContext right;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(212);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(214);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(215);
						match(T__26);
						setState(216);
						((TermContext)_localctx).right = factor();
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(T__27);
						setState(219);
						((TermContext)_localctx).right = factor();
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(221);
						match(T__28);
						setState(222);
						((TermContext)_localctx).right = factor();
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Print_statementContext extends ParserRuleContext {
		public Print_patternContext print_pattern() {
			return getRuleContext(Print_patternContext.class,0);
		}
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__29);
			setState(229);
			match(T__3);
			setState(230);
			print_pattern();
			setState(231);
			match(T__4);
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

	public static class Print_patternContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public Print_patternContext print_pattern() {
			return getRuleContext(Print_patternContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(zealParser.TEXT, 0); }
		public Print_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrint_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrint_pattern(this);
		}
	}

	public final Print_patternContext print_pattern() throws RecognitionException {
		Print_patternContext _localctx = new Print_patternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print_pattern);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((Print_patternContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				((Print_patternContext)_localctx).varName = match(IDENTIFIER);
				setState(235);
				match(T__30);
				setState(236);
				print_pattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(TEXT);
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

	public static class FactorContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public TerminalNode INT_VAL() { return getToken(zealParser.INT_VAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_factor);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				((FactorContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case INT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(INT_VAL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				match(T__3);
				setState(243);
				expr(0);
				setState(244);
				match(T__4);
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

	public static class FunctionContext extends ParserRuleContext {
		public Return_typesContext returnType;
		public Token functionName;
		public Function_command_listContext function_command_list() {
			return getRuleContext(Function_command_listContext.class,0);
		}
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			((FunctionContext)_localctx).returnType = return_types();
			setState(249);
			((FunctionContext)_localctx).functionName = match(IDENTIFIER);
			setState(250);
			match(T__3);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(251);
				params();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			match(T__4);
			setState(258);
			match(T__5);
			setState(259);
			function_command_list();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(260);
				return_stmt();
				setState(261);
				match(T__1);
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(T__6);
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

	public static class Function_callContext extends ParserRuleContext {
		public Token functionName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((Function_callContext)_localctx).functionName = match(IDENTIFIER);
			setState(271);
			match(T__3);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(272);
				params();
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			match(T__4);
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

	public static class ParamsContext extends ParserRuleContext {
		public Token varName;
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				data_types();
				setState(281);
				((ParamsContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				data_types();
				setState(284);
				((ParamsContext)_localctx).varName = match(IDENTIFIER);
				setState(285);
				match(T__30);
				setState(286);
				params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				((ParamsContext)_localctx).varName = match(IDENTIFIER);
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

	public static class Data_typesContext extends ParserRuleContext {
		public Data_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterData_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitData_types(this);
		}
	}

	public final Data_typesContext data_types() throws RecognitionException {
		Data_typesContext _localctx = new Data_typesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_data_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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

	public static class Return_typesContext extends ParserRuleContext {
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturn_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturn_types(this);
		}
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_types);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				data_types();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(T__31);
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

	public static class Return_stmtContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_stmt);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(T__32);
				setState(298);
				((Return_stmtContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(T__32);
				setState(300);
				expr(0);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 10:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u0132\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6T\n"+
		"\6\f\6\16\6W\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"e\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0083\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13"+
		"\5\13\u00c9\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00d1\n\13\f\13\16"+
		"\13\u00d4\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e2"+
		"\n\f\f\f\16\f\u00e5\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00f1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\20\3"+
		"\20\3\20\3\20\7\20\u00ff\n\20\f\20\16\20\u0102\13\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u010a\n\20\f\20\16\20\u010d\13\20\3\20\3\20\3\21\3"+
		"\21\3\21\7\21\u0114\n\21\f\21\16\21\u0117\13\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0124\n\22\3\23\3\23\3\24\3\24"+
		"\5\24\u012a\n\24\3\25\3\25\3\25\3\25\5\25\u0130\n\25\3\25\2\4\24\26\26"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\f\r\2\u0149\2*\3"+
		"\2\2\2\4,\3\2\2\2\6\67\3\2\2\2\b=\3\2\2\2\nq\3\2\2\2\fz\3\2\2\2\16\u0082"+
		"\3\2\2\2\20\u008a\3\2\2\2\22\u00c3\3\2\2\2\24\u00c8\3\2\2\2\26\u00d5\3"+
		"\2\2\2\30\u00e6\3\2\2\2\32\u00f0\3\2\2\2\34\u00f8\3\2\2\2\36\u00fa\3\2"+
		"\2\2 \u0110\3\2\2\2\"\u0123\3\2\2\2$\u0125\3\2\2\2&\u0129\3\2\2\2(\u012f"+
		"\3\2\2\2*+\5\4\3\2+\3\3\2\2\2,\60\5\6\4\2-/\5\36\20\2.-\3\2\2\2/\62\3"+
		"\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\638\5\n\6"+
		"\2\64\65\5\n\6\2\65\66\5\6\4\2\668\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2"+
		"8\7\3\2\2\29>\5\n\6\2:;\5\n\6\2;<\5\6\4\2<>\3\2\2\2=9\3\2\2\2=:\3\2\2"+
		"\2>\t\3\2\2\2?@\7$\2\2@A\7\3\2\2AB\5\24\13\2BC\7\4\2\2Cr\3\2\2\2DE\5\f"+
		"\7\2EF\7\4\2\2Fr\3\2\2\2GH\7\5\2\2HI\7\6\2\2IJ\5\22\n\2JK\7\7\2\2KL\7"+
		"\b\2\2LM\5\6\4\2MU\7\t\2\2NO\7\n\2\2OP\7\b\2\2PQ\5\6\4\2QR\7\t\2\2RT\3"+
		"\2\2\2SN\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7"+
		"\4\2\2Yr\3\2\2\2Z[\7\13\2\2[\\\7\6\2\2\\]\5\22\n\2]^\7\7\2\2^_\7\b\2\2"+
		"_`\5\6\4\2`a\7\t\2\2ab\7\4\2\2br\3\2\2\2ce\5$\23\2dc\3\2\2\2de\3\2\2\2"+
		"ef\3\2\2\2fg\7$\2\2gh\7\3\2\2hi\5 \21\2ij\7\4\2\2jr\3\2\2\2kl\5 \21\2"+
		"lm\7\4\2\2mr\3\2\2\2no\5\30\r\2op\7\4\2\2pr\3\2\2\2q?\3\2\2\2qD\3\2\2"+
		"\2qG\3\2\2\2qZ\3\2\2\2qd\3\2\2\2qk\3\2\2\2qn\3\2\2\2r\13\3\2\2\2st\7\f"+
		"\2\2t{\5\16\b\2uv\7\r\2\2v{\5\20\t\2wx\5$\23\2xy\7$\2\2y{\3\2\2\2zs\3"+
		"\2\2\2zu\3\2\2\2zw\3\2\2\2{\r\3\2\2\2|}\7$\2\2}~\7\3\2\2~\u0083\7%\2\2"+
		"\177\u0080\7$\2\2\u0080\u0081\7\3\2\2\u0081\u0083\5\16\b\2\u0082|\3\2"+
		"\2\2\u0082\177\3\2\2\2\u0083\17\3\2\2\2\u0084\u0085\7$\2\2\u0085\u0086"+
		"\7\3\2\2\u0086\u008b\5\22\n\2\u0087\u0088\7$\2\2\u0088\u0089\7\3\2\2\u0089"+
		"\u008b\5\20\t\2\u008a\u0084\3\2\2\2\u008a\u0087\3\2\2\2\u008b\21\3\2\2"+
		"\2\u008c\u00c4\7\16\2\2\u008d\u00c4\7\17\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u0090\7\20\2\2\u0090\u0091\5\24\13\2\u0091\u00c4\3\2\2\2\u0092\u0093"+
		"\5\24\13\2\u0093\u0094\7\21\2\2\u0094\u0095\5\24\13\2\u0095\u00c4\3\2"+
		"\2\2\u0096\u0097\5\24\13\2\u0097\u0098\7\22\2\2\u0098\u0099\5\24\13\2"+
		"\u0099\u00c4\3\2\2\2\u009a\u009b\5\24\13\2\u009b\u009c\7\23\2\2\u009c"+
		"\u009d\5\24\13\2\u009d\u00c4\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0"+
		"\7\24\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00c4\3\2\2\2\u00a2\u00a3\5\24\13"+
		"\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00c4\3\2\2\2\u00a6"+
		"\u00a7\5\24\13\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\5\24\13\2\u00a9\u00c4"+
		"\3\2\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7\27\2\2\u00ac\u00ad\5\24\13"+
		"\2\u00ad\u00c4\3\2\2\2\u00ae\u00af\7\30\2\2\u00af\u00b0\7\6\2\2\u00b0"+
		"\u00b1\5\22\n\2\u00b1\u00b2\7\7\2\2\u00b2\u00c4\3\2\2\2\u00b3\u00b4\7"+
		"\6\2\2\u00b4\u00b5\5\22\n\2\u00b5\u00b6\7\7\2\2\u00b6\u00b7\7\31\2\2\u00b7"+
		"\u00b8\7\6\2\2\u00b8\u00b9\5\22\n\2\u00b9\u00ba\7\7\2\2\u00ba\u00c4\3"+
		"\2\2\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\5\22\n\2\u00bd\u00be\7\7\2\2\u00be"+
		"\u00bf\7\32\2\2\u00bf\u00c0\7\6\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7"+
		"\7\2\2\u00c2\u00c4\3\2\2\2\u00c3\u008c\3\2\2\2\u00c3\u008d\3\2\2\2\u00c3"+
		"\u008e\3\2\2\2\u00c3\u0092\3\2\2\2\u00c3\u0096\3\2\2\2\u00c3\u009a\3\2"+
		"\2\2\u00c3\u009e\3\2\2\2\u00c3\u00a2\3\2\2\2\u00c3\u00a6\3\2\2\2\u00c3"+
		"\u00aa\3\2\2\2\u00c3\u00ae\3\2\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00bb\3\2"+
		"\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\b\13\1\2\u00c6\u00c9\5\26\f\2\u00c7"+
		"\u00c9\5\30\r\2\u00c8\u00c5\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00d2\3"+
		"\2\2\2\u00ca\u00cb\f\6\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00d1\5\26\f\2\u00cd"+
		"\u00ce\f\5\2\2\u00ce\u00cf\7\34\2\2\u00cf\u00d1\5\26\f\2\u00d0\u00ca\3"+
		"\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\25\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\b\f\1"+
		"\2\u00d6\u00d7\5\34\17\2\u00d7\u00e3\3\2\2\2\u00d8\u00d9\f\6\2\2\u00d9"+
		"\u00da\7\35\2\2\u00da\u00e2\5\34\17\2\u00db\u00dc\f\5\2\2\u00dc\u00dd"+
		"\7\36\2\2\u00dd\u00e2\5\34\17\2\u00de\u00df\f\4\2\2\u00df\u00e0\7\37\2"+
		"\2\u00e0\u00e2\5\34\17\2\u00e1\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\27\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7 \2\2\u00e7\u00e8"+
		"\7\6\2\2\u00e8\u00e9\5\32\16\2\u00e9\u00ea\7\7\2\2\u00ea\31\3\2\2\2\u00eb"+
		"\u00f1\7$\2\2\u00ec\u00ed\7$\2\2\u00ed\u00ee\7!\2\2\u00ee\u00f1\5\32\16"+
		"\2\u00ef\u00f1\7&\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f0\u00ef"+
		"\3\2\2\2\u00f1\33\3\2\2\2\u00f2\u00f9\7$\2\2\u00f3\u00f9\7%\2\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\u00f6\5\24\13\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\3"+
		"\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9"+
		"\35\3\2\2\2\u00fa\u00fb\5&\24\2\u00fb\u00fc\7$\2\2\u00fc\u0100\7\6\2\2"+
		"\u00fd\u00ff\5\"\22\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103"+
		"\u0104\7\7\2\2\u0104\u0105\7\b\2\2\u0105\u010b\5\b\5\2\u0106\u0107\5("+
		"\25\2\u0107\u0108\7\4\2\2\u0108\u010a\3\2\2\2\u0109\u0106\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7\t\2\2\u010f\37\3\2\2\2\u0110\u0111"+
		"\7$\2\2\u0111\u0115\7\6\2\2\u0112\u0114\5\"\22\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\7\2\2\u0119!\3\2\2\2\u011a\u011b"+
		"\5$\23\2\u011b\u011c\7$\2\2\u011c\u0124\3\2\2\2\u011d\u011e\5$\23\2\u011e"+
		"\u011f\7$\2\2\u011f\u0120\7!\2\2\u0120\u0121\5\"\22\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0124\7$\2\2\u0123\u011a\3\2\2\2\u0123\u011d\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124#\3\2\2\2\u0125\u0126\t\2\2\2\u0126%\3\2\2\2\u0127"+
		"\u012a\5$\23\2\u0128\u012a\7\"\2\2\u0129\u0127\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012a\'\3\2\2\2\u012b\u012c\7#\2\2\u012c\u0130\7$\2\2\u012d\u012e"+
		"\7#\2\2\u012e\u0130\5\24\13\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u0130)\3\2\2\2\31\60\67=Udqz\u0082\u008a\u00c3\u00c8\u00d0\u00d2\u00e1"+
		"\u00e3\u00f0\u00f8\u0100\u010b\u0115\u0123\u0129\u012f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}