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
	 * Enter a parse tree produced by the {@code commands}
	 * labeled alternative in {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void enterCommands(zealParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commands}
	 * labeled alternative in {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void exitCommands(zealParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functions}
	 * labeled alternative in {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(zealParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functions}
	 * labeled alternative in {@link zealParser#main_command_list}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(zealParser.FunctionsContext ctx);
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
	 * Enter a parse tree produced by {@link zealParser#label_command_list_if}.
	 * @param ctx the parse tree
	 */
	void enterLabel_command_list_if(zealParser.Label_command_list_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#label_command_list_if}.
	 * @param ctx the parse tree
	 */
	void exitLabel_command_list_if(zealParser.Label_command_list_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#label_command_list_else}.
	 * @param ctx the parse tree
	 */
	void enterLabel_command_list_else(zealParser.Label_command_list_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#label_command_list_else}.
	 * @param ctx the parse tree
	 */
	void exitLabel_command_list_else(zealParser.Label_command_list_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link zealParser#label_command_list_while}.
	 * @param ctx the parse tree
	 */
	void enterLabel_command_list_while(zealParser.Label_command_list_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#label_command_list_while}.
	 * @param ctx the parse tree
	 */
	void exitLabel_command_list_while(zealParser.Label_command_list_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssign}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(zealParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssign}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(zealParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarInit}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(zealParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarInit}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(zealParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElseBlock}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlock(zealParser.IfElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElseBlock}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlock(zealParser.IfElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileBlock}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(zealParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileBlock}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(zealParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionToVarAssign}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFunctionToVarAssign(zealParser.FunctionToVarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionToVarAssign}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFunctionToVarAssign(zealParser.FunctionToVarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(zealParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(zealParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(zealParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintExpression}
	 * labeled alternative in {@link zealParser#command}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(zealParser.PrintExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code TrueExpression}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpression(zealParser.TrueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpression}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpression(zealParser.TrueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpression}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpression(zealParser.FalseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpression}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpression(zealParser.FalseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality(zealParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality(zealParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equality2}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterEquality2(zealParser.Equality2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Equality2}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitEquality2(zealParser.Equality2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(zealParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(zealParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualLessThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualLessThan(zealParser.EqualLessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualLessThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualLessThan(zealParser.EqualLessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThanEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqual(zealParser.LessThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThanEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqual(zealParser.LessThanEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualGreaterThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualGreaterThan(zealParser.EqualGreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualGreaterThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualGreaterThan(zealParser.EqualGreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqual(zealParser.GreaterThanEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanEqual}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqual(zealParser.GreaterThanEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(zealParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(zealParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(zealParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(zealParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOperator}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(zealParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOperator}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(zealParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrOperator}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(zealParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrOperator}
	 * labeled alternative in {@link zealParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(zealParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(zealParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(zealParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(zealParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(zealParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermExpression}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(zealParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermExpression}
	 * labeled alternative in {@link zealParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(zealParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void enterDivide(zealParser.DivideContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void exitDivide(zealParser.DivideContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorExpression}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorExpression(zealParser.FactorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorExpression}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorExpression(zealParser.FactorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMod(zealParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMod(zealParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(zealParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link zealParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(zealParser.MultiplyContext ctx);
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
	 * Enter a parse tree produced by the {@code PrintSymbol}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPrintSymbol(zealParser.PrintSymbolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintSymbol}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPrintSymbol(zealParser.PrintSymbolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintRecursive}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPrintRecursive(zealParser.PrintRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintRecursive}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPrintRecursive(zealParser.PrintRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintText}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPrintText(zealParser.PrintTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintText}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPrintText(zealParser.PrintTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintFunctionCall}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(zealParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintFunctionCall}
	 * labeled alternative in {@link zealParser#print_pattern}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(zealParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(zealParser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(zealParser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterValueAssign(zealParser.ValueAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitValueAssign(zealParser.ValueAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAssign(zealParser.ExpressionAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAssign}
	 * labeled alternative in {@link zealParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAssign(zealParser.ExpressionAssignContext ctx);
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
	 * Enter a parse tree produced by {@link zealParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(zealParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link zealParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(zealParser.ArgumentsContext ctx);
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
	 * Enter a parse tree produced by the {@code NumericalDataType}
	 * labeled alternative in {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterNumericalDataType(zealParser.NumericalDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumericalDataType}
	 * labeled alternative in {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitNumericalDataType(zealParser.NumericalDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDataType(zealParser.BooleanDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanDataType}
	 * labeled alternative in {@link zealParser#data_types}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDataType(zealParser.BooleanDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnTypeDataType}
	 * labeled alternative in {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeDataType(zealParser.ReturnTypeDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnTypeDataType}
	 * labeled alternative in {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeDataType(zealParser.ReturnTypeDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnTypeVoid}
	 * labeled alternative in {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void enterReturnTypeVoid(zealParser.ReturnTypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnTypeVoid}
	 * labeled alternative in {@link zealParser#return_types}.
	 * @param ctx the parse tree
	 */
	void exitReturnTypeVoid(zealParser.ReturnTypeVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVariable}
	 * labeled alternative in {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnVariable(zealParser.ReturnVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVariable}
	 * labeled alternative in {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnVariable(zealParser.ReturnVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnExpression(zealParser.ReturnExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnExpression}
	 * labeled alternative in {@link zealParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnExpression(zealParser.ReturnExpressionContext ctx);
}