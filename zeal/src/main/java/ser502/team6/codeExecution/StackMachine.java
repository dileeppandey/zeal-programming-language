package ser502.team6.codeExecution;

import java.util.List;
import java.util.Stack;

public class StackMachine {

	private Stack<String> operatorStack = new Stack<String>();
	private Stack<String> variableStack = new Stack<String>();
	SymbolTable symbolTable = new SymbolTable();
	private int currentLine = 0;
	private int continuousAdditionToVarStack = 0;

	public void executeInstructions(List<String> instructionsList) {
		for (currentLine = 0; currentLine < instructionsList
				.size(); currentLine++) {

			System.out.println(instructionsList.get(currentLine));

			if (instructionsList.get(currentLine).equalsIgnoreCase("END")) {
				break;
			}

			if (instructionsList.get(currentLine).equalsIgnoreCase("num")) {
				Entity entity = new Entity("num", "");
				symbolTable.insert(instructionsList.get(++currentLine), entity);
			} else if (instructionsList.get(currentLine)
					.equalsIgnoreCase("load")) {
				variableStack.push(instructionsList.get(++currentLine));
				continuousAdditionToVarStack++;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("add")
					|| instructionsList.get(currentLine).equalsIgnoreCase("mul")
					|| instructionsList.get(currentLine).equalsIgnoreCase("div")
					|| instructionsList.get(currentLine).equalsIgnoreCase("sub")
					|| instructionsList.get(currentLine)
							.equalsIgnoreCase("mod")) {
				operatorStack.push(instructionsList.get(currentLine));
				continuousAdditionToVarStack = 0;
			} else if (instructionsList.get(currentLine)
					.equalsIgnoreCase("store")) {
				recursivelyPerformStackedOperations();

				symbolTable.symbolTable.get(instructionsList
						.get(++currentLine)).attribute = variableStack.pop();

			}

			if (continuousAdditionToVarStack == 2) {
				performStackOperation();
			}
		}

		System.out.println(symbolTable.symbolTable.get("z").attribute);

	}

	private void recursivelyPerformStackedOperations() {
		while (operatorStack.size() > 0) {
			performStackOperation();
		}
		// TODO Auto-generated method stub

	}

	private void performStackOperation() {
		String var2 = variableStack.pop();
		String var1 = variableStack.pop();

		String operation = operatorStack.pop();

		switch (operation.toLowerCase()) {
		case "add":
			variableStack.push(String.valueOf(
					Double.parseDouble(var1) + Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "sub":
			variableStack.push(String.valueOf(
					Double.parseDouble(var1) - Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "div":
			variableStack.push(String.valueOf(
					Double.parseDouble(var1) / Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "mul":
			variableStack.push(String.valueOf(
					Double.parseDouble(var1) * Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "mod":
			variableStack.push(String.valueOf(
					Double.parseDouble(var1) % Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		default:
			break;
		}

	}
}
