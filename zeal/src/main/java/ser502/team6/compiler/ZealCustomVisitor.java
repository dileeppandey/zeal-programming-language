package ser502.team6.compiler;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;

import compiler.parser.zealBaseVisitor;
import compiler.parser.zealParser;
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
import compiler.parser.zealParser.Return_typesContext;
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
	private static int argCount = 0;

	/*
	 * This map will have key of the block name and value as variable name
	 */
	Map<String, String> scopeVariableMap = new HashMap<String, String>();
@Override
	public String visitFunctions(@NotNull zealParser.FunctionsContext ctx) 
	{
	ParseTree child = ctx.function();
	String op = visit(child);
    return op;
	}
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
		return mainCode + "label_" + blockCount + "_else:\n";
	}

	@Override
	public String visitLabel_command_list_else(Label_command_list_elseContext ctx) {
		String mainCode = "";
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
			return "NUM " + varName + " = " + visitChildren(ctx);
		} else {
			String stmt = "NUM " + varName + "\nLOAD " + ctx.INT_VAL().getText() + "\nSTORE " + varName;
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitInitialization_bool(Initialization_boolContext ctx) {

		String varName = ctx.varName.getText();

		if (ctx.bool_expr() == null) {
			return "BOOL " + varName + " = " + visitChildren(ctx);
		} else {
			String stmt = "BOOL " + varName + "\nLOAD " + ctx.bool_expr().getText() + "\nSTORE " + varName;
			return visitChildren(ctx) + stmt;
		}
	}

	@Override
	public String visitAdd(AddContext ctx) {
		String stmt = "ADD\n" + visit(ctx.left) + "\n" + visit(ctx.right) + "\n";
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
		String stmt = "DIV\n" + visit(ctx.left) + "\n" + visit(ctx.right) + "\n";
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
		String stmt = "MUL\n" + visit(ctx.left) + "\n" + visit(ctx.right) + "\n";
		return stmt;
	}

	@Override
	public String visitFunction(FunctionContext ctx) {

		// visit(ctx.argumentList);
		String funcBody = visitFunction_command_list(ctx.function_command_list());
		String arguments = visitArguments(ctx.arguments);
		int argumentCount = (ctx.arguments!=null)?ctx.arguments.getText().split(",").length:0;
		String returnType = ctx.returnType.getText();
		String funcName = ctx.functionName.getText();
		String returnVariable = (ctx.return_stmt(0)==null)?"VOID":ctx.return_stmt(0).getText();
		StringBuilder funcCall = new StringBuilder();
		funcCall.append("FUNCTION");
	    funcCall.append(" ");
	    funcCall.append(funcName);
	    funcCall.append(":<");
	    funcCall.append(returnType);
	    funcCall.append(">:<");
	    funcCall.append(argumentCount);
	    funcCall.append(">\n");
	    funcCall.append(arguments);
	    funcCall.append("\n");
	    funcCall.append(funcBody);
	    if(returnVariable != "VOID") {
			funcCall.append("RETURN");
			funcCall.append("\t");
			funcCall.append(returnVariable.replace("return",""));
			funcCall.append("\n");
	    }
	    funcCall.append("END_FUNCTION");//CHECK THIS
	    return funcCall.toString();
	}

	@Override
	public String visitEquality(EqualityContext ctx) {
		String stmt = "BNE " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitSub(SubContext ctx) {
		String stmt = "\nSUB\n" + visit(ctx.left) + "\n" + visit(ctx.right) + "\n";
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
		argCount++;
		return "param"+argCount+":"+ctx.varName.getText()+"\n"+visitChildren(ctx);
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
		return "VOID "+visitChildren(ctx);
	}

	@Override
	public String visitGreaterThanEqual(GreaterThanEqualContext ctx) {
		String stmt = "BGT " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
		return visitChildren(ctx) + stmt;
	}

	@Override
	public String visitLessThanEqual(LessThanEqualContext ctx) {
		String stmt = "BLT " + ctx.left.getText() + ", " + ctx.right.getText() + ", ";
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
		StringBuilder funcCall = new StringBuilder();
		funcCall.append("call_function ");
		funcCall.append(ctx.function_call().functionName.getText());
	    funcCall.append("\n");
	    argCount = 0;
		return funcCall.toString()+visitChildren(ctx)+"end_function"+"\n";
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
		String stmt = "MOD\n" + visit(ctx.left) + "\n" + visit(ctx.right) + "\n";
		return stmt;
	}

	@Override
	public String visitArguments(ArgumentsContext ctx) {
		StringBuilder argBuilder = new StringBuilder();
		if(ctx != null) {
		String moreArgs = visitChildren(ctx);
		argBuilder.append("ARGUMENT ");
		argBuilder.append(ctx.data_types().getText());
		argBuilder.append(" ");
		argBuilder.append(ctx.varName.getText());
		if(moreArgs.length()>0)
			{
				argBuilder.append("\n");
				argBuilder.append(visitChildren(ctx));
			}
		}
		return argBuilder.toString();
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
