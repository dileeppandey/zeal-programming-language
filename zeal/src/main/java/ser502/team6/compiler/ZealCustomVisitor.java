package ser502.team6.compiler;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import compiler.parser.zealBaseVisitor;
import compiler.parser.zealParser.AddContext;
import compiler.parser.zealParser.AndOperatorContext;
import compiler.parser.zealParser.ArgumentsContext;
import compiler.parser.zealParser.BooleanDataTypeContext;
import compiler.parser.zealParser.CommandContext;
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
import compiler.parser.zealParser.Label_command_list_elseContext;
import compiler.parser.zealParser.Label_command_list_ifContext;
import compiler.parser.zealParser.Label_command_list_whileContext;
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

/**
 * Overriding the antlr visitor class to include compilation language and
 * generate the intermediate code
 * 
 * @author vsriva12
 *
 */
public class ZealCustomVisitor extends zealBaseVisitor<String> {

	private static int blockCount = 0;

	/*
	 * This map will have key of the block name and value as variable name
	 */
	Map<String, String> scopeVariableMap = new HashMap<String, String>();

	@Override
	public String visitLabel_command_list_if(Label_command_list_ifContext ctx) {
		blockCount++;
		// String labelName = "label_"+blockCount + "_if";
		String mainCode = "label_" + blockCount + "_else\n";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			/*
			 * if(i==0) { mainCode+=labelName + ":\n"; }
			 */
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof CommandContext) {
				mainCode += instructions;
			}
		}
		return mainCode;
	}

	@Override
	public String visitLabel_command_list_else(Label_command_list_elseContext ctx) {
		String labelName = "label_" + blockCount + "_else";
		String mainCode = labelName + "\n";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			/*
			 * if(i==0) { mainCode+=labelName + ":\n"; }
			 */
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof CommandContext) {
				mainCode += instructions;
			}
		}
		return mainCode;
	}

	@Override
	public String visitLabel_command_list_while(Label_command_list_whileContext ctx) {
		String labelName = "label_" + blockCount + "_while";
		String mainCode = "label_" + blockCount + "_while_end" + "\n";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			/*if (i == 0) {
				mainCode += labelName + ":\n";
			}*/
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof CommandContext) {
				mainCode += instructions;
			}
		}
		mainCode += "goto " + labelName + "\n";
		return mainCode + labelName + "_end:\n";
	}

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
			String stmt = "num " + varName + "\nLOAD " + ctx.INT_VAL().getText() + "\nSTORE " + varName;
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitInitialization_bool(Initialization_boolContext ctx) {

		String varName = ctx.varName.getText();

		if (ctx.bool_expr() == null) {
			return "bool " + varName + " = " + visitChildren(ctx);
		} else {
			String stmt = "bool " + varName + "\nLOAD " + ctx.bool_expr().getText() + "\nSTORE " + varName;
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitAdd(AddContext ctx) {
		String stmt = "ADD " + ctx.left.getText() + " " + ctx.right.getText() + "\n";
		return stmt;
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
		return "LOAD " + value;
	}

	@Override
	public String visitVarAssign(VarAssignContext ctx) {
		String variableName = ctx.varName.getText();
		return visitChildren(ctx) + "STORE " + variableName + "\n";
	}

	@Override
	public String visitVariableAssign(VariableAssignContext ctx) {
		return visitChildren(ctx) + "LOAD " + ctx.varName.getText();
	}

	@Override
	public String visitCommand_list(Command_listContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunction_call(Function_callContext ctx) {
		return visitChildren(ctx);
	}

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

	@Override
	public String visitPrintText(PrintTextContext ctx) {
		String text = ctx.TEXT().getText();
		return visitChildren(ctx) + "WRITE " + text + "\n";
	}

	@Override
	public String visitWhileBlock(WhileBlockContext ctx) {
		blockCount++;
		String labelName = "label_" + blockCount + "_while";
		return labelName + ":\n" + visitChildren(ctx);
	}

	@Override
	public String visitDivide(DivideContext ctx) {
		String stmt = "DIV " + ctx.left.getText() + " " + ctx.right.getText() + "\n";
		return stmt;
	}

	@Override
	public String visitIfElseBlock(IfElseBlockContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitLessThan(LessThanContext ctx) {
		String stmt = "BGE " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitGreaterThan(GreaterThanContext ctx) {
		String stmt = "BLE " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitMultiply(MultiplyContext ctx) {
		String stmt = "MUL " + ctx.left.getText() + " " + ctx.right.getText() + "\n";
		return stmt;
	}

	@Override
	public String visitFunction(FunctionContext ctx) {

		visit(ctx.returnType);
		// visit(ctx.argumentList);
		String funcName = ctx.functionName.getText();

		return visitChildren(ctx) + funcName;
	}

	@Override
	public String visitEquality(EqualityContext ctx) {
		String stmt = "BNE " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitSub(SubContext ctx) {
		String stmt = "\nSUB " + ctx.left.getText() + " " + ctx.right.getText() + "\n";
		return stmt;
	}

	@Override
	public String visitNotEqual(NotEqualContext ctx) {
		String stmt = "BEQ " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitAndOperator(AndOperatorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitEqualGreaterThan(EqualGreaterThanContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitParams(ParamsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitTrueExpression(TrueExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFactorExpression(FactorExpressionContext ctx) {
		return visitChildren(ctx) + "\n";
	}

	@Override
	public String visitPrint_statement(Print_statementContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitReturnTypeVoid(ReturnTypeVoidContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitGreaterThanEqual(GreaterThanEqualContext ctx) {
		String stmt = "BLT " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitLessThanEqual(LessThanEqualContext ctx) {
		String stmt = "BGT " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitReturnVariable(ReturnVariableContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitReturnExpression(ReturnExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPrintExpression(PrintExpressionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitNumericalDataType(NumericalDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitEqualLessThan(EqualLessThanContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPrintSymbol(PrintSymbolContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPrintRecursive(PrintRecursiveContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunctionCall(FunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBooleanDataType(BooleanDataTypeContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFalseExpression(FalseExpressionContext ctx) {
		return visitChildren(ctx) + "false";
	}

	@Override
	public String visitOrOperator(OrOperatorContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFunction_command_list(Function_command_listContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPrintFunctionCall(PrintFunctionCallContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitMod(ModContext ctx) {
		String stmt = "MOD " + ctx.left.getText() + " " + ctx.right.getText() + "\n";
		return stmt;
	}

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
