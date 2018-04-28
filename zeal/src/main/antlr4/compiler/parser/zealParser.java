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
		T__31=32, T__32=33, T__33=34, T__34=35, IDENTIFIER=36, INT_VAL=37, TEXT=38, 
		WHITESPACE=39, BLOCK_COMMENT=40, LINE_COMMENT=41;
	public static final int
		RULE_program = 0, RULE_main_command_list = 1, RULE_command_list = 2, RULE_function_command_list = 3, 
		RULE_label_command_list_if = 4, RULE_label_command_list_else = 5, RULE_label_command_list_while = 6, 
		RULE_command = 7, RULE_declarations = 8, RULE_initialization_int = 9, 
		RULE_initialization_bool = 10, RULE_bool_expr = 11, RULE_expr = 12, RULE_term = 13, 
		RULE_print_statement = 14, RULE_print_pattern = 15, RULE_factor = 16, 
		RULE_function = 17, RULE_arguments = 18, RULE_function_call = 19, RULE_params = 20, 
		RULE_data_types = 21, RULE_return_types = 22, RULE_return_stmt = 23;
	public static final String[] ruleNames = {
		"program", "main_command_list", "command_list", "function_command_list", 
		"label_command_list_if", "label_command_list_else", "label_command_list_while", 
		"command", "declarations", "initialization_int", "initialization_bool", 
		"bool_expr", "expr", "term", "print_statement", "print_pattern", "factor", 
		"function", "arguments", "function_call", "params", "data_types", "return_types", 
		"return_stmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "';'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'while'", 
		"'num'", "'bool'", "'true'", "'false'", "'=='", "'==='", "'!='", "'=<'", 
		"'<='", "'=>'", "'>='", "'>'", "'<'", "'!'", "'&&'", "'||'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'print'", "','", "'function'", "'void'", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENTIFIER", "INT_VAL", "TEXT", "WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT"
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
		public List<Main_command_listContext> main_command_list() {
			return getRuleContexts(Main_command_listContext.class);
		}
		public Main_command_listContext main_command_list(int i) {
			return getRuleContext(Main_command_listContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				main_command_list();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__30) | (1L << T__32) | (1L << IDENTIFIER))) != 0) );
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
		public Main_command_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_command_list; }
	 
		public Main_command_listContext() { }
		public void copyFrom(Main_command_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionsContext extends Main_command_listContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext(Main_command_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunctions(this);
		}
	}
	public static class CommandsContext extends Main_command_listContext {
		public Command_listContext command_list() {
			return getRuleContext(Command_listContext.class,0);
		}
		public CommandsContext(Main_command_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitCommands(this);
		}
	}

	public final Main_command_listContext main_command_list() throws RecognitionException {
		Main_command_listContext _localctx = new Main_command_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_command_list);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__30:
			case IDENTIFIER:
				_localctx = new CommandsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				command_list();
				}
				break;
			case T__32:
				_localctx = new FunctionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				function();
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
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				command();
				setState(59);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				command();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				command();
				setState(65);
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

	public static class Label_command_list_ifContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Label_command_list_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_command_list_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterLabel_command_list_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitLabel_command_list_if(this);
		}
	}

	public final Label_command_list_ifContext label_command_list_if() throws RecognitionException {
		Label_command_list_ifContext _localctx = new Label_command_list_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label_command_list_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				command();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__30) | (1L << IDENTIFIER))) != 0) );
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

	public static class Label_command_list_elseContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Label_command_list_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_command_list_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterLabel_command_list_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitLabel_command_list_else(this);
		}
	}

	public final Label_command_list_elseContext label_command_list_else() throws RecognitionException {
		Label_command_list_elseContext _localctx = new Label_command_list_elseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label_command_list_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				command();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__30) | (1L << IDENTIFIER))) != 0) );
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

	public static class Label_command_list_whileContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public Label_command_list_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_command_list_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterLabel_command_list_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitLabel_command_list_while(this);
		}
	}

	public final Label_command_list_whileContext label_command_list_while() throws RecognitionException {
		Label_command_list_whileContext _localctx = new Label_command_list_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_label_command_list_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				command();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__30) | (1L << IDENTIFIER))) != 0) );
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
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarInitContext extends CommandContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public VarInitContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitVarInit(this);
		}
	}
	public static class WhileBlockContext extends CommandContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Label_command_list_whileContext label_command_list_while() {
			return getRuleContext(Label_command_list_whileContext.class,0);
		}
		public WhileBlockContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitWhileBlock(this);
		}
	}
	public static class IfElseBlockContext extends CommandContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Label_command_list_ifContext label_command_list_if() {
			return getRuleContext(Label_command_list_ifContext.class,0);
		}
		public Label_command_list_elseContext label_command_list_else() {
			return getRuleContext(Label_command_list_elseContext.class,0);
		}
		public IfElseBlockContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterIfElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitIfElseBlock(this);
		}
	}
	public static class PrintExpressionContext extends CommandContext {
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public PrintExpressionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrintExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrintExpression(this);
		}
	}
	public static class FunctionCallContext extends CommandContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionCallContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunctionCall(this);
		}
	}
	public static class FunctionToVarAssignContext extends CommandContext {
		public Token varName;
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public FunctionToVarAssignContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFunctionToVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFunctionToVarAssign(this);
		}
	}
	public static class VarAssignContext extends CommandContext {
		public Token varName;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public VarAssignContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitVarAssign(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new VarAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((VarAssignContext)_localctx).varName = match(IDENTIFIER);
				setState(85);
				match(T__0);
				setState(86);
				expr(0);
				setState(87);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new VarInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				declarations();
				setState(90);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new IfElseBlockContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__2);
				setState(93);
				match(T__3);
				setState(94);
				bool_expr();
				setState(95);
				match(T__4);
				setState(96);
				match(T__5);
				setState(97);
				label_command_list_if();
				setState(98);
				match(T__6);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(99);
					match(T__7);
					setState(100);
					match(T__5);
					setState(101);
					label_command_list_else();
					setState(102);
					match(T__6);
					}
				}

				setState(106);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new WhileBlockContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(T__8);
				setState(109);
				match(T__3);
				setState(110);
				bool_expr();
				setState(111);
				match(T__4);
				setState(112);
				match(T__5);
				setState(113);
				label_command_list_while();
				setState(114);
				match(T__6);
				setState(115);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new FunctionToVarAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__10) {
					{
					setState(117);
					data_types();
					}
				}

				setState(120);
				((FunctionToVarAssignContext)_localctx).varName = match(IDENTIFIER);
				setState(121);
				match(T__0);
				setState(122);
				function_call();
				setState(123);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				function_call();
				setState(126);
				match(T__1);
				}
				break;
			case 7:
				_localctx = new PrintExpressionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				print_statement();
				setState(129);
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
		enterRule(_localctx, 16, RULE_declarations);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((DeclarationsContext)_localctx).varName = match(T__9);
				setState(134);
				initialization_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((DeclarationsContext)_localctx).varName = match(T__10);
				setState(136);
				initialization_bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				data_types();
				setState(138);
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
		enterRule(_localctx, 18, RULE_initialization_int);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((Initialization_intContext)_localctx).varName = match(IDENTIFIER);
				setState(143);
				match(T__0);
				setState(144);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((Initialization_intContext)_localctx).varName = match(IDENTIFIER);
				setState(146);
				match(T__0);
				setState(147);
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
		enterRule(_localctx, 20, RULE_initialization_bool);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((Initialization_boolContext)_localctx).varName = match(IDENTIFIER);
				setState(151);
				match(T__0);
				setState(152);
				bool_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((Initialization_boolContext)_localctx).varName = match(IDENTIFIER);
				setState(154);
				match(T__0);
				setState(155);
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
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
	 
		public Bool_exprContext() { }
		public void copyFrom(Bool_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOperatorContext extends Bool_exprContext {
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public OrOperatorContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitOrOperator(this);
		}
	}
	public static class Equality2Context extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Equality2Context(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterEquality2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitEquality2(this);
		}
	}
	public static class NotEqualContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public NotEqualContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterNotEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitNotEqual(this);
		}
	}
	public static class AndOperatorContext extends Bool_exprContext {
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public AndOperatorContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitAndOperator(this);
		}
	}
	public static class GreaterThanEqualContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanEqualContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterGreaterThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitGreaterThanEqual(this);
		}
	}
	public static class EqualGreaterThanContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualGreaterThanContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterEqualGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitEqualGreaterThan(this);
		}
	}
	public static class LessThanEqualContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanEqualContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterLessThanEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitLessThanEqual(this);
		}
	}
	public static class TrueExpressionContext extends Bool_exprContext {
		public TrueExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterTrueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitTrueExpression(this);
		}
	}
	public static class LessThanContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitLessThan(this);
		}
	}
	public static class EqualLessThanContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualLessThanContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterEqualLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitEqualLessThan(this);
		}
	}
	public static class GreaterThanContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterGreaterThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitGreaterThan(this);
		}
	}
	public static class EqualityContext extends Bool_exprContext {
		public ExprContext left;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualityContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitEquality(this);
		}
	}
	public static class FalseExpressionContext extends Bool_exprContext {
		public FalseExpressionContext(Bool_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFalseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFalseExpression(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bool_expr);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new TrueExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new FalseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__12);
				}
				break;
			case 3:
				_localctx = new EqualityContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				((EqualityContext)_localctx).left = expr(0);
				setState(161);
				match(T__13);
				setState(162);
				((EqualityContext)_localctx).right = expr(0);
				}
				break;
			case 4:
				_localctx = new Equality2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				((Equality2Context)_localctx).left = expr(0);
				setState(165);
				match(T__14);
				setState(166);
				((Equality2Context)_localctx).right = expr(0);
				}
				break;
			case 5:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				((NotEqualContext)_localctx).left = expr(0);
				setState(169);
				match(T__15);
				setState(170);
				((NotEqualContext)_localctx).right = expr(0);
				}
				break;
			case 6:
				_localctx = new EqualLessThanContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(172);
				((EqualLessThanContext)_localctx).left = expr(0);
				setState(173);
				match(T__16);
				setState(174);
				((EqualLessThanContext)_localctx).right = expr(0);
				}
				break;
			case 7:
				_localctx = new LessThanEqualContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(176);
				((LessThanEqualContext)_localctx).left = expr(0);
				setState(177);
				match(T__17);
				setState(178);
				((LessThanEqualContext)_localctx).right = expr(0);
				}
				break;
			case 8:
				_localctx = new EqualGreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				((EqualGreaterThanContext)_localctx).left = expr(0);
				setState(181);
				match(T__18);
				setState(182);
				((EqualGreaterThanContext)_localctx).right = expr(0);
				}
				break;
			case 9:
				_localctx = new GreaterThanEqualContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				((GreaterThanEqualContext)_localctx).left = expr(0);
				setState(185);
				match(T__19);
				setState(186);
				((GreaterThanEqualContext)_localctx).right = expr(0);
				}
				break;
			case 10:
				_localctx = new GreaterThanContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(188);
				((GreaterThanContext)_localctx).left = expr(0);
				setState(189);
				match(T__20);
				setState(190);
				((GreaterThanContext)_localctx).right = expr(0);
				}
				break;
			case 11:
				_localctx = new LessThanContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(192);
				((LessThanContext)_localctx).left = expr(0);
				setState(193);
				match(T__21);
				setState(194);
				((LessThanContext)_localctx).right = expr(0);
				}
				break;
			case 12:
				_localctx = new NotEqualContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(196);
				match(T__22);
				setState(197);
				match(T__3);
				setState(198);
				bool_expr();
				setState(199);
				match(T__4);
				}
				break;
			case 13:
				_localctx = new AndOperatorContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(201);
				match(T__3);
				setState(202);
				bool_expr();
				setState(203);
				match(T__4);
				setState(204);
				match(T__23);
				setState(205);
				match(T__3);
				setState(206);
				bool_expr();
				setState(207);
				match(T__4);
				}
				break;
			case 14:
				_localctx = new OrOperatorContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(209);
				match(T__3);
				setState(210);
				bool_expr();
				setState(211);
				match(T__4);
				setState(212);
				match(T__24);
				setState(213);
				match(T__3);
				setState(214);
				bool_expr();
				setState(215);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public ExprContext left;
		public TermContext right;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitAdd(this);
		}
	}
	public static class SubContext extends ExprContext {
		public ExprContext left;
		public TermContext right;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitSub(this);
		}
	}
	public static class TermExpressionContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterTermExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitTermExpression(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(220);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(228);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						((AddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(223);
						match(T__25);
						setState(224);
						((AddContext)_localctx).right = term(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						((SubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(226);
						match(T__26);
						setState(227);
						((SubContext)_localctx).right = term(0);
						}
						break;
					}
					} 
				}
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivideContext extends TermContext {
		public TermContext left;
		public FactorContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public DivideContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitDivide(this);
		}
	}
	public static class FactorExpressionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterFactorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitFactorExpression(this);
		}
	}
	public static class ModContext extends TermContext {
		public TermContext left;
		public FactorContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ModContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitMod(this);
		}
	}
	public static class MultiplyContext extends TermContext {
		public TermContext left;
		public FactorContext right;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public MultiplyContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitMultiply(this);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactorExpressionContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(234);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyContext(new TermContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(236);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(237);
						match(T__27);
						setState(238);
						((MultiplyContext)_localctx).right = factor();
						}
						break;
					case 2:
						{
						_localctx = new DivideContext(new TermContext(_parentctx, _parentState));
						((DivideContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						match(T__28);
						setState(241);
						((DivideContext)_localctx).right = factor();
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new TermContext(_parentctx, _parentState));
						((ModContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						match(T__29);
						setState(244);
						((ModContext)_localctx).right = factor();
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 28, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__30);
			setState(251);
			match(T__3);
			setState(252);
			print_pattern();
			setState(253);
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
		public Print_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_pattern; }
	 
		public Print_patternContext() { }
		public void copyFrom(Print_patternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintFunctionCallContext extends Print_patternContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public PrintFunctionCallContext(Print_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrintFunctionCall(this);
		}
	}
	public static class PrintSymbolContext extends Print_patternContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public PrintSymbolContext(Print_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrintSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrintSymbol(this);
		}
	}
	public static class PrintRecursiveContext extends Print_patternContext {
		public Token varName;
		public Print_patternContext print_pattern() {
			return getRuleContext(Print_patternContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public PrintRecursiveContext(Print_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrintRecursive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrintRecursive(this);
		}
	}
	public static class PrintTextContext extends Print_patternContext {
		public TerminalNode TEXT() { return getToken(zealParser.TEXT, 0); }
		public PrintTextContext(Print_patternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterPrintText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitPrintText(this);
		}
	}

	public final Print_patternContext print_pattern() throws RecognitionException {
		Print_patternContext _localctx = new Print_patternContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_pattern);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new PrintSymbolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((PrintSymbolContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new PrintRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((PrintRecursiveContext)_localctx).varName = match(IDENTIFIER);
				setState(257);
				match(T__31);
				setState(258);
				print_pattern();
				}
				break;
			case 3:
				_localctx = new PrintTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(TEXT);
				}
				break;
			case 4:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				function_call();
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
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueAssignContext extends FactorContext {
		public Token value;
		public TerminalNode INT_VAL() { return getToken(zealParser.INT_VAL, 0); }
		public ValueAssignContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterValueAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitValueAssign(this);
		}
	}
	public static class VariableAssignContext extends FactorContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public VariableAssignContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterVariableAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitVariableAssign(this);
		}
	}
	public static class ExpressionAssignContext extends FactorContext {
		public Token expression;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionAssignContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterExpressionAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitExpressionAssign(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new VariableAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((VariableAssignContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case INT_VAL:
				_localctx = new ValueAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((ValueAssignContext)_localctx).value = match(INT_VAL);
				}
				break;
			case T__3:
				_localctx = new ExpressionAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				((ExpressionAssignContext)_localctx).expression = match(T__3);
				setState(266);
				expr(0);
				setState(267);
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
		public ArgumentsContext arguments;
		public List<ArgumentsContext> argumentList = new ArrayList<ArgumentsContext>();
		public Function_command_listContext function_command_list() {
			return getRuleContext(Function_command_listContext.class,0);
		}
		public Return_typesContext return_types() {
			return getRuleContext(Return_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public List<Return_stmtContext> return_stmt() {
			return getRuleContexts(Return_stmtContext.class);
		}
		public Return_stmtContext return_stmt(int i) {
			return getRuleContext(Return_stmtContext.class,i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
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
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(T__32);
			setState(272);
			((FunctionContext)_localctx).returnType = return_types();
			setState(273);
			((FunctionContext)_localctx).functionName = match(IDENTIFIER);
			setState(274);
			match(T__3);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(275);
				((FunctionContext)_localctx).arguments = arguments();
				((FunctionContext)_localctx).argumentList.add(((FunctionContext)_localctx).arguments);
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
			match(T__4);
			setState(282);
			match(T__5);
			setState(283);
			function_command_list();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(284);
				return_stmt();
				setState(285);
				match(T__1);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public Token varName;
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arguments);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				data_types();
				setState(295);
				((ArgumentsContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				data_types();
				setState(298);
				((ArgumentsContext)_localctx).varName = match(IDENTIFIER);
				setState(299);
				match(T__31);
				setState(300);
				arguments();
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
		enterRule(_localctx, 38, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((Function_callContext)_localctx).functionName = match(IDENTIFIER);
			setState(305);
			match(T__3);
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(306);
				params();
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
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
		enterRule(_localctx, 40, RULE_params);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				((ParamsContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				((ParamsContext)_localctx).varName = match(IDENTIFIER);
				setState(316);
				match(T__31);
				setState(317);
				params();
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
	 
		public Data_typesContext() { }
		public void copyFrom(Data_typesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumericalDataTypeContext extends Data_typesContext {
		public NumericalDataTypeContext(Data_typesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterNumericalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitNumericalDataType(this);
		}
	}
	public static class BooleanDataTypeContext extends Data_typesContext {
		public BooleanDataTypeContext(Data_typesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterBooleanDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitBooleanDataType(this);
		}
	}

	public final Data_typesContext data_types() throws RecognitionException {
		Data_typesContext _localctx = new Data_typesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_data_types);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new NumericalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__9);
				}
				break;
			case T__10:
				_localctx = new BooleanDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(T__10);
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

	public static class Return_typesContext extends ParserRuleContext {
		public Return_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_types; }
	 
		public Return_typesContext() { }
		public void copyFrom(Return_typesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnTypeVoidContext extends Return_typesContext {
		public ReturnTypeVoidContext(Return_typesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturnTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturnTypeVoid(this);
		}
	}
	public static class ReturnTypeDataTypeContext extends Return_typesContext {
		public Data_typesContext data_types() {
			return getRuleContext(Data_typesContext.class,0);
		}
		public ReturnTypeDataTypeContext(Return_typesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturnTypeDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturnTypeDataType(this);
		}
	}

	public final Return_typesContext return_types() throws RecognitionException {
		Return_typesContext _localctx = new Return_typesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_return_types);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				_localctx = new ReturnTypeDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				data_types();
				}
				break;
			case T__33:
				_localctx = new ReturnTypeVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				match(T__33);
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
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
	 
		public Return_stmtContext() { }
		public void copyFrom(Return_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnVariableContext extends Return_stmtContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(zealParser.IDENTIFIER, 0); }
		public ReturnVariableContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturnVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturnVariable(this);
		}
	}
	public static class ReturnExpressionContext extends Return_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExpressionContext(Return_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).enterReturnExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof zealListener ) ((zealListener)listener).exitReturnExpression(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_stmt);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new ReturnVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__34);
				setState(329);
				((ReturnVariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new ReturnExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(T__34);
				setState(331);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0151\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\5\4@\n\4"+
		"\3\5\3\5\3\5\3\5\5\5F\n\5\3\6\6\6I\n\6\r\6\16\6J\3\7\6\7N\n\7\r\7\16\7"+
		"O\3\b\6\bS\n\b\r\b\16\bT\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0086\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00dc\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00e7\n\16\f\16\16\16\u00ea\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00f8\n\17\f\17"+
		"\16\17\u00fb\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0108\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0110\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0117\n\23\f\23\16\23\u011a\13\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u0122\n\23\f\23\16\23\u0125\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0131\n\24\3\25\3\25\3\25"+
		"\7\25\u0136\n\25\f\25\16\25\u0139\13\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\5\26\u0141\n\26\3\27\3\27\5\27\u0145\n\27\3\30\3\30\5\30\u0149\n\30\3"+
		"\31\3\31\3\31\3\31\5\31\u014f\n\31\3\31\2\4\32\34\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u016a\2\63\3\2\2\2\49\3\2\2\2"+
		"\6?\3\2\2\2\bE\3\2\2\2\nH\3\2\2\2\fM\3\2\2\2\16R\3\2\2\2\20\u0085\3\2"+
		"\2\2\22\u008e\3\2\2\2\24\u0096\3\2\2\2\26\u009e\3\2\2\2\30\u00db\3\2\2"+
		"\2\32\u00dd\3\2\2\2\34\u00eb\3\2\2\2\36\u00fc\3\2\2\2 \u0107\3\2\2\2\""+
		"\u010f\3\2\2\2$\u0111\3\2\2\2&\u0130\3\2\2\2(\u0132\3\2\2\2*\u0140\3\2"+
		"\2\2,\u0144\3\2\2\2.\u0148\3\2\2\2\60\u014e\3\2\2\2\62\64\5\4\3\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67:\5"+
		"\6\4\28:\5$\23\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;@\5\20\t\2<=\5\20\t"+
		"\2=>\5\6\4\2>@\3\2\2\2?;\3\2\2\2?<\3\2\2\2@\7\3\2\2\2AF\5\20\t\2BC\5\20"+
		"\t\2CD\5\6\4\2DF\3\2\2\2EA\3\2\2\2EB\3\2\2\2F\t\3\2\2\2GI\5\20\t\2HG\3"+
		"\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\13\3\2\2\2LN\5\20\t\2ML\3\2\2\2"+
		"NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QS\5\20\t\2RQ\3\2\2\2ST\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VW\7&\2\2WX\7\3\2\2XY\5\32\16\2YZ\7"+
		"\4\2\2Z\u0086\3\2\2\2[\\\5\22\n\2\\]\7\4\2\2]\u0086\3\2\2\2^_\7\5\2\2"+
		"_`\7\6\2\2`a\5\30\r\2ab\7\7\2\2bc\7\b\2\2cd\5\n\6\2dj\7\t\2\2ef\7\n\2"+
		"\2fg\7\b\2\2gh\5\f\7\2hi\7\t\2\2ik\3\2\2\2je\3\2\2\2jk\3\2\2\2kl\3\2\2"+
		"\2lm\7\4\2\2m\u0086\3\2\2\2no\7\13\2\2op\7\6\2\2pq\5\30\r\2qr\7\7\2\2"+
		"rs\7\b\2\2st\5\16\b\2tu\7\t\2\2uv\7\4\2\2v\u0086\3\2\2\2wy\5,\27\2xw\3"+
		"\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7&\2\2{|\7\3\2\2|}\5(\25\2}~\7\4\2\2~\u0086"+
		"\3\2\2\2\177\u0080\5(\25\2\u0080\u0081\7\4\2\2\u0081\u0086\3\2\2\2\u0082"+
		"\u0083\5\36\20\2\u0083\u0084\7\4\2\2\u0084\u0086\3\2\2\2\u0085V\3\2\2"+
		"\2\u0085[\3\2\2\2\u0085^\3\2\2\2\u0085n\3\2\2\2\u0085x\3\2\2\2\u0085\177"+
		"\3\2\2\2\u0085\u0082\3\2\2\2\u0086\21\3\2\2\2\u0087\u0088\7\f\2\2\u0088"+
		"\u008f\5\24\13\2\u0089\u008a\7\r\2\2\u008a\u008f\5\26\f\2\u008b\u008c"+
		"\5,\27\2\u008c\u008d\7&\2\2\u008d\u008f\3\2\2\2\u008e\u0087\3\2\2\2\u008e"+
		"\u0089\3\2\2\2\u008e\u008b\3\2\2\2\u008f\23\3\2\2\2\u0090\u0091\7&\2\2"+
		"\u0091\u0092\7\3\2\2\u0092\u0097\7\'\2\2\u0093\u0094\7&\2\2\u0094\u0095"+
		"\7\3\2\2\u0095\u0097\5\24\13\2\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2"+
		"\u0097\25\3\2\2\2\u0098\u0099\7&\2\2\u0099\u009a\7\3\2\2\u009a\u009f\5"+
		"\30\r\2\u009b\u009c\7&\2\2\u009c\u009d\7\3\2\2\u009d\u009f\5\26\f\2\u009e"+
		"\u0098\3\2\2\2\u009e\u009b\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00dc\7\16\2"+
		"\2\u00a1\u00dc\7\17\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\7\20\2\2\u00a4"+
		"\u00a5\5\32\16\2\u00a5\u00dc\3\2\2\2\u00a6\u00a7\5\32\16\2\u00a7\u00a8"+
		"\7\21\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00dc\3\2\2\2\u00aa\u00ab\5\32\16"+
		"\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00dc\3\2\2\2\u00ae"+
		"\u00af\5\32\16\2\u00af\u00b0\7\23\2\2\u00b0\u00b1\5\32\16\2\u00b1\u00dc"+
		"\3\2\2\2\u00b2\u00b3\5\32\16\2\u00b3\u00b4\7\24\2\2\u00b4\u00b5\5\32\16"+
		"\2\u00b5\u00dc\3\2\2\2\u00b6\u00b7\5\32\16\2\u00b7\u00b8\7\25\2\2\u00b8"+
		"\u00b9\5\32\16\2\u00b9\u00dc\3\2\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00bc"+
		"\7\26\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00dc\3\2\2\2\u00be\u00bf\5\32\16"+
		"\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\5\32\16\2\u00c1\u00dc\3\2\2\2\u00c2"+
		"\u00c3\5\32\16\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\5\32\16\2\u00c5\u00dc"+
		"\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00c9\5\30\r\2"+
		"\u00c9\u00ca\7\7\2\2\u00ca\u00dc\3\2\2\2\u00cb\u00cc\7\6\2\2\u00cc\u00cd"+
		"\5\30\r\2\u00cd\u00ce\7\7\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\7\6\2\2"+
		"\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\7\2\2\u00d2\u00dc\3\2\2\2\u00d3\u00d4"+
		"\7\6\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\7\2\2\u00d6\u00d7\7\33\2\2"+
		"\u00d7\u00d8\7\6\2\2\u00d8\u00d9\5\30\r\2\u00d9\u00da\7\7\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00a0\3\2\2\2\u00db\u00a1\3\2\2\2\u00db\u00a2\3\2\2\2\u00db"+
		"\u00a6\3\2\2\2\u00db\u00aa\3\2\2\2\u00db\u00ae\3\2\2\2\u00db\u00b2\3\2"+
		"\2\2\u00db\u00b6\3\2\2\2\u00db\u00ba\3\2\2\2\u00db\u00be\3\2\2\2\u00db"+
		"\u00c2\3\2\2\2\u00db\u00c6\3\2\2\2\u00db\u00cb\3\2\2\2\u00db\u00d3\3\2"+
		"\2\2\u00dc\31\3\2\2\2\u00dd\u00de\b\16\1\2\u00de\u00df\5\34\17\2\u00df"+
		"\u00e8\3\2\2\2\u00e0\u00e1\f\5\2\2\u00e1\u00e2\7\34\2\2\u00e2\u00e7\5"+
		"\34\17\2\u00e3\u00e4\f\4\2\2\u00e4\u00e5\7\35\2\2\u00e5\u00e7\5\34\17"+
		"\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\33\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\b\17\1\2\u00ec\u00ed\5\"\22\2\u00ed\u00f9\3\2\2\2\u00ee\u00ef\f"+
		"\6\2\2\u00ef\u00f0\7\36\2\2\u00f0\u00f8\5\"\22\2\u00f1\u00f2\f\5\2\2\u00f2"+
		"\u00f3\7\37\2\2\u00f3\u00f8\5\"\22\2\u00f4\u00f5\f\4\2\2\u00f5\u00f6\7"+
		" \2\2\u00f6\u00f8\5\"\22\2\u00f7\u00ee\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\35\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7!\2\2\u00fd\u00fe"+
		"\7\6\2\2\u00fe\u00ff\5 \21\2\u00ff\u0100\7\7\2\2\u0100\37\3\2\2\2\u0101"+
		"\u0108\7&\2\2\u0102\u0103\7&\2\2\u0103\u0104\7\"\2\2\u0104\u0108\5 \21"+
		"\2\u0105\u0108\7(\2\2\u0106\u0108\5(\25\2\u0107\u0101\3\2\2\2\u0107\u0102"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108!\3\2\2\2\u0109"+
		"\u0110\7&\2\2\u010a\u0110\7\'\2\2\u010b\u010c\7\6\2\2\u010c\u010d\5\32"+
		"\16\2\u010d\u010e\7\7\2\2\u010e\u0110\3\2\2\2\u010f\u0109\3\2\2\2\u010f"+
		"\u010a\3\2\2\2\u010f\u010b\3\2\2\2\u0110#\3\2\2\2\u0111\u0112\7#\2\2\u0112"+
		"\u0113\5.\30\2\u0113\u0114\7&\2\2\u0114\u0118\7\6\2\2\u0115\u0117\5&\24"+
		"\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\7\2\2\u011c"+
		"\u011d\7\b\2\2\u011d\u0123\5\b\5\2\u011e\u011f\5\60\31\2\u011f\u0120\7"+
		"\4\2\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0126\u0127\7\t\2\2\u0127%\3\2\2\2\u0128\u0129\5,\27\2\u0129\u012a"+
		"\7&\2\2\u012a\u0131\3\2\2\2\u012b\u012c\5,\27\2\u012c\u012d\7&\2\2\u012d"+
		"\u012e\7\"\2\2\u012e\u012f\5&\24\2\u012f\u0131\3\2\2\2\u0130\u0128\3\2"+
		"\2\2\u0130\u012b\3\2\2\2\u0131\'\3\2\2\2\u0132\u0133\7&\2\2\u0133\u0137"+
		"\7\6\2\2\u0134\u0136\5*\26\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\7\7\2\2\u013b)\3\2\2\2\u013c\u0141\7&\2\2\u013d\u013e"+
		"\7&\2\2\u013e\u013f\7\"\2\2\u013f\u0141\5*\26\2\u0140\u013c\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0141+\3\2\2\2\u0142\u0145\7\f\2\2\u0143\u0145\7\r\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145-\3\2\2\2\u0146\u0149\5"+
		",\27\2\u0147\u0149\7$\2\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"/\3\2\2\2\u014a\u014b\7%\2\2\u014b\u014f\7&\2\2\u014c\u014d\7%\2\2\u014d"+
		"\u014f\5\32\16\2\u014e\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014f\61\3\2"+
		"\2\2\36\659?EJOTjx\u0085\u008e\u0096\u009e\u00db\u00e6\u00e8\u00f7\u00f9"+
		"\u0107\u010f\u0118\u0123\u0130\u0137\u0140\u0144\u0148\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}