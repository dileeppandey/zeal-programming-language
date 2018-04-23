package ser502.team6.compiler;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import compiler.parser.zealBaseVisitor;
import compiler.parser.zealParser.AddContext;
import compiler.parser.zealParser.AndOperatorContext;
import compiler.parser.zealParser.ArgumentsContext;
import compiler.parser.zealParser.BooleanDataTypeContext;
import compiler.parser.zealParser.Command_listContext;
import compiler.parser.zealParser.DeclarationsContext;
import compiler.parser.zealParser.DivideContext;
import compiler.parser.zealParser.EqualGreaterThanContext;
import compiler.parser.zealParser.EqualLessThanContext;
import compiler.parser.zealParser.EqualityContext;
import compiler.parser.zealParser.ExpressionAssignContext;
import compiler.parser.zealParser.FactorExpressionContext;
import compiler.parser.zealParser.FalseExpressionContext;
import compiler.parser.zealParser.FunctionCallContext;
import compiler.parser.zealParser.FunctionContext;
import compiler.parser.zealParser.FunctionToVarAssignContext;
import compiler.parser.zealParser.Function_callContext;
import compiler.parser.zealParser.Function_command_listContext;
import compiler.parser.zealParser.GreaterThanContext;
import compiler.parser.zealParser.GreaterThanEqualContext;
import compiler.parser.zealParser.IfElseBlockContext;
import compiler.parser.zealParser.Initialization_boolContext;
import compiler.parser.zealParser.Initialization_intContext;
import compiler.parser.zealParser.LessThanContext;
import compiler.parser.zealParser.LessThanEqualContext;
import compiler.parser.zealParser.Main_command_listContext;
import compiler.parser.zealParser.ModContext;
import compiler.parser.zealParser.MultiplyContext;
import compiler.parser.zealParser.NotEqualContext;
import compiler.parser.zealParser.NumericalDataTypeContext;
import compiler.parser.zealParser.OrOperatorContext;
import compiler.parser.zealParser.ParamsContext;
import compiler.parser.zealParser.PrintExpressionContext;
import compiler.parser.zealParser.PrintFunctionCallContext;
import compiler.parser.zealParser.PrintRecursiveContext;
import compiler.parser.zealParser.PrintSymbolContext;
import compiler.parser.zealParser.PrintTextContext;
import compiler.parser.zealParser.Print_statementContext;
import compiler.parser.zealParser.ProgramContext;
import compiler.parser.zealParser.ReturnExpressionContext;
import compiler.parser.zealParser.ReturnTypeDataTypeContext;
import compiler.parser.zealParser.ReturnTypeVoidContext;
import compiler.parser.zealParser.ReturnVariableContext;
import compiler.parser.zealParser.SubContext;
import compiler.parser.zealParser.TrueExpressionContext;
import compiler.parser.zealParser.ValueAssignContext;
import compiler.parser.zealParser.VarAssignContext;
import compiler.parser.zealParser.VarInitContext;
import compiler.parser.zealParser.VariableAssignContext;
import compiler.parser.zealParser.WhileBlockContext;

public class ZealCustomVisitor extends zealBaseVisitor<String> {

	@Override
	public String visitDeclarations(DeclarationsContext ctx) {
		String varName = ctx.varName.getText();
		String type;
		if (ctx.data_types() == null) {
			return visitChildren(ctx);
		} else {
			type = ctx.data_types().getText();
			return type + " " + varName + " " + visitChildren(ctx);
		}
	}

	@Override
	public String visitInitialization_int(Initialization_intContext ctx) {
		String varName = ctx.varName.getText();

		if (ctx.INT_VAL() == null) {
			return "num " + varName + " = " + visitChildren(ctx);
		} else {
			String stmt = "num " + varName + "\nMOV " + varName + ", "
					+ ctx.INT_VAL().getText();
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitInitialization_bool(Initialization_boolContext ctx) {

		String varName = ctx.varName.getText();

		if (ctx.bool_expr() == null) {
			return "bool " + varName + " = " + visitChildren(ctx);
		} else {
			String stmt = "bool " + varName + "\nMOV " + varName + ", "
					+ ctx.bool_expr().getText();
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitVarInit(VarInitContext ctx) {
		return visitChildren(ctx) + "\n";
	}

	@Override
	public String visitExpressionAssign(ExpressionAssignContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitValueAssign(ValueAssignContext ctx) {
		String value = ctx.value.getText();
		return value;
	}

	@Override
	public String visitVarAssign(VarAssignContext ctx) {
		String variableName = ctx.varName.getText();
		return "MOV " + variableName + ", " + visitChildren(ctx);
	}

	@Override
	public String visitVariableAssign(VariableAssignContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitAdd(AddContext ctx) {
		return visitChildren(ctx) + "ADD\n";
	}

	@Override
	public String visitCommand_list(Command_listContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunction_call(Function_callContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitProgram(ProgramContext ctx) {
		String mainCode = "";
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof Main_command_listContext) {
				mainCode += instructions;
			}
		}
		return mainCode + "\nEND";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrintText(PrintTextContext ctx) {
		String text = ctx.TEXT().getText();
		return visitChildren(ctx) + "WRITE " + text + "\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitWhileBlock(WhileBlockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitDivide(DivideContext ctx) {
		return visitChildren(ctx) + "DIVIDE\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitIfElseBlock(IfElseBlockContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitLessThan(LessThanContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitGreaterThan(GreaterThanContext ctx) {
		return visitChildren(ctx) + "GE\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitMultiply(MultiplyContext ctx) {
		return visitChildren(ctx) + "MULT\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFunction(FunctionContext ctx) {

		visit(ctx.returnType);
		// visit(ctx.argumentList);
		String funcName = ctx.functionName.getText();

		return visitChildren(ctx) + funcName;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitEquality(EqualityContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitSub(SubContext ctx) {
		return visitChildren(ctx) + "SUB\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitNotEqual(NotEqualContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitAndOperator(AndOperatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitEqualGreaterThan(EqualGreaterThanContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitParams(ParamsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitTrueExpression(TrueExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFactorExpression(FactorExpressionContext ctx) {
		return visitChildren(ctx) + "\n";
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrint_statement(Print_statementContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitReturnTypeVoid(ReturnTypeVoidContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitGreaterThanEqual(GreaterThanEqualContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitLessThanEqual(LessThanEqualContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitReturnVariable(ReturnVariableContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitReturnExpression(ReturnExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrintExpression(PrintExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitNumericalDataType(NumericalDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitEqualLessThan(EqualLessThanContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrintSymbol(PrintSymbolContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrintRecursive(PrintRecursiveContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFunctionCall(FunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitBooleanDataType(BooleanDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFalseExpression(FalseExpressionContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitOrOperator(OrOperatorContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFunction_command_list(Function_command_listContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitPrintFunctionCall(PrintFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitMod(ModContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitArguments(ArgumentsContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitFunctionToVarAssign(FunctionToVarAssignContext ctx) {
		return visitChildren(ctx);
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 * </p>
	 */
	@Override
	public String visitReturnTypeDataType(ReturnTypeDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitChildren(@NotNull RuleNode node) {
		String result = "";
		int n = node.getChildCount();
		for (int i = 0; i < n; i++) {

			ParseTree c = node.getChild(i);
			String childResult = c.accept(this);
			if (childResult != null)
				result = result.concat(childResult);
		}
		return result;
	}
}
