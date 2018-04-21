// Generated from zeal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link zealParser}.
 */
public interface zealListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link zealParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(zealParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(zealParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void enterMain_command_list(zealParser.Main_command_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void exitMain_command_list(zealParser.Main_command_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#command_list}.
	 * @param ctx the parse tree
	 */
	void enterCommand_list(zealParser.Command_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#command_list}.
	 * @param ctx the parse tree
	 */
	void exitCommand_list(zealParser.Command_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#function_command_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_command_list(zealParser.Function_command_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#function_command_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_command_list(zealParser.Function_command_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(zealParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(zealParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(zealParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(zealParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#initialization_int}.
	 * @param ctx the parse tree
	 */
	void enterInitialization_int(zealParser.Initialization_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#initialization_int}.
	 * @param ctx the parse tree
	 */
	void exitInitialization_int(zealParser.Initialization_intContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#initialization_bool}.
	 * @param ctx the parse tree
	 */
	void enterInitialization_bool(zealParser.Initialization_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#initialization_bool}.
	 * @param ctx the parse tree
	 */
	void exitInitialization_bool(zealParser.Initialization_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(zealParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(zealParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(zealParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(zealParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(zealParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(zealParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(zealParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(zealParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPrint_pattern(zealParser.Print_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPrint_pattern(zealParser.Print_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(zealParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(zealParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(zealParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(zealParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(zealParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(zealParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(zealParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(zealParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterData_types(zealParser.Data_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitData_types(zealParser.Data_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturn_types(zealParser.Return_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturn_types(zealParser.Return_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(zealParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(zealParser.Return_stmtContext ctx);
}