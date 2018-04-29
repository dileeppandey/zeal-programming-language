package ser502.team6.codeExecution;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StackMachine {
	private Stack<String> operatorStack = new Stack<String>();
	private Stack<String> variableStack = new Stack<String>();
	private Stack<String> booleanOperationStack = new Stack<String>();
	private Stack<String> booleanSymbolsStack = new Stack<String>();
	private HashMap<String, Integer> whileLoopStatements = new HashMap<String, Integer>();
	private Map<String, Boolean> labelBooleanMap = new HashMap<String, Boolean>();
	SymbolTable symbolTable = new SymbolTable();
	private int currentLine = 0;
	private int continuousAdditionToVarStack = 0;
	List<String> instructionsList;

	private boolean isPrinting = false;

	public void executeInstructions(List<String> instructionsList) {
		this.instructionsList = instructionsList;
		iterateOverInstructions();
	}

	private void iterateOverInstructions() {
		for (currentLine = 0; currentLine < instructionsList.size(); currentLine++) {

			// System.out.println(instructionsList.get(currentLine));

			if (instructionsList.get(currentLine).equalsIgnoreCase("END")) {
				break;
			}

			if (instructionsList.get(currentLine).equalsIgnoreCase("num")) {
				Entity entity = new Entity("num", "");
				symbolTable.insert(instructionsList.get(++currentLine), entity);
				isPrinting = false;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("bool")) {
				Entity entity = new Entity("bool", "");
				symbolTable.insert(instructionsList.get(++currentLine), entity);
				isPrinting = false;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("load")) {
				variableStack.push(instructionsList.get(++currentLine));
				if (!operatorStack.isEmpty()) {
					continuousAdditionToVarStack++;
				}

				isPrinting = false;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("add")
					|| instructionsList.get(currentLine).equalsIgnoreCase("mul")
					|| instructionsList.get(currentLine).equalsIgnoreCase("div")
					|| instructionsList.get(currentLine).equalsIgnoreCase("sub")
					|| instructionsList.get(currentLine).equalsIgnoreCase("mod")) {
				operatorStack.push(instructionsList.get(currentLine));
				continuousAdditionToVarStack = 0;
				isPrinting = false;
			} else if (instructionsList.get(currentLine).contains("while:")) {
				whileLoopStatements.put(instructionsList.get(currentLine).replace(":", ""), currentLine);
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("goto")) {
				currentLine = whileLoopStatements.get(instructionsList.get(currentLine + 1));
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("store")) {
				recursivelyPerformStackedOperations();

				symbolTable.symbolTable.get(instructionsList.get(++currentLine)).attribute = variableStack.pop();
				isPrinting = false;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("write")) {
				isPrinting = true;
				continue;
			} else if (instructionsList.get(currentLine).equalsIgnoreCase("BGE")
					|| instructionsList.get(currentLine).equalsIgnoreCase("BGT")
					|| instructionsList.get(currentLine).equalsIgnoreCase("BLT")
					|| instructionsList.get(currentLine).equalsIgnoreCase("BLE")
					|| instructionsList.get(currentLine).equalsIgnoreCase("BEQ")
					|| instructionsList.get(currentLine).equalsIgnoreCase("BNE")) {
				booleanOperationStack.push(instructionsList.get(currentLine));
				booleanSymbolsStack.push(instructionsList.get(currentLine + 1));
				booleanSymbolsStack.push(instructionsList.get(currentLine + 2));

				boolean oppositeBooleanEval = evaluateBoolean();

				if (oppositeBooleanEval == false) {
					// TODO: start executing below code
					currentLine = currentLine + 3;
					if (instructionsList.get(currentLine).contains("while_end)"))
						currentLine++;

					deleteElseStatement(instructionsList.get(currentLine + 3));

				} else {
					// TODO: go to instructionsList.get(currentLine+3)
					String labelForElse = instructionsList.get(currentLine + 3) + ":";
					String labelForWhileEnd = instructionsList.get(currentLine + 3) + ":";
					currentLine = currentLine + 3;
					boolean endNotFound = true;
					while (endNotFound) {
						if (instructionsList.get(currentLine).equalsIgnoreCase(labelForElse)) {
							endNotFound = false;
						} else if (instructionsList.get(currentLine).equalsIgnoreCase(labelForWhileEnd)) {
							endNotFound = false;
						} else {
							currentLine++;
						}
					}
				}
			}

			if (isPrinting) {
				if (instructionsList.get(currentLine).contains("\"")) {
					System.out.println(instructionsList.get(currentLine).replaceAll("\"", ""));
				} else {
					if (symbolTable.symbolTable.containsKey(instructionsList.get(currentLine))) {
						System.out.println(symbolTable.symbolTable.get(instructionsList.get(currentLine)).attribute);
					} else {
						// TODO: call funtion here
					}
				}
			}

			if (continuousAdditionToVarStack == 2) {
				performStackOperation();
			}
		}

		// System.out.println(symbolTable.symbolTable.get("z").attribute);

	}

	private void deleteElseStatement(String labelIfEnd) {

		String labelStart = labelIfEnd.split("_")[0] + "_" + labelIfEnd.split("_")[1] + "_else:";
		String labelEnd = labelIfEnd.split("_")[0] + "_" + labelIfEnd.split("_")[1] + "_endelse:";

		int startIndex = instructionsList.indexOf(labelStart);
		int endIndex = instructionsList.indexOf(labelEnd);

		for (int i = startIndex; i <= endIndex; i++) {
			if(startIndex >= 0) {
				instructionsList.remove(startIndex);
			}
		}

		// TODO Auto-generated method stub

	}

	private boolean evaluateBoolean() {

		String right = booleanSymbolsStack.pop().replaceAll(",", "");
		String left = booleanSymbolsStack.pop().replaceAll(",", "");
		String condition = booleanOperationStack.pop();

		if (!right.matches("[0-9]+") && !right.matches("[0-9.]+")) {
			right = symbolTable.symbolTable.get(right).attribute;
		}

		if (!left.matches("[0-9]+") && !left.matches("[0-9.]+")) {
			left = symbolTable.symbolTable.get(left).attribute;
		}

		switch (condition) {
		case "BGE":
			if (Double.parseDouble(left) >= Double.parseDouble(right)) {
				return true;
			}
			break;
		case "BGT":
			if (Double.parseDouble(left) > Double.parseDouble(right)) {
				return true;
			}
			break;
		case "BLT":
			if (Double.parseDouble(left) < Double.parseDouble(right)) {
				return true;
			}
			break;
		case "BLE":
			if (Double.parseDouble(left) <= Double.parseDouble(right)) {
				return true;
			}
			break;
		case "BEQ":
			if (Double.parseDouble(left) == Double.parseDouble(right)) {
				return true;
			}
			break;
		case "BNE":
			if (Double.parseDouble(left) != Double.parseDouble(right)) {
				return true;
			}
			break;
		default:
			break;
		}

		return false;

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
		try {
			Double.parseDouble(var2);
		} catch (NumberFormatException e) {
			Entity entity_var2 = symbolTable.symbolTable.get(var2);
			var2 = (entity_var2 == null) ? "NOTDEFINED" : entity_var2.attribute;
		}
		try {
			Double.parseDouble(var1);
		} catch (NumberFormatException e) {
			Entity entity_var1 = symbolTable.symbolTable.get(var1);
			var1 = (entity_var1 == null) ? "NOTDEFINED" : entity_var1.attribute;
		}
		switch (operation.toLowerCase()) {
		case "add":
			variableStack.push(String.valueOf(Double.parseDouble(var1) + Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "sub":
			variableStack.push(String.valueOf(Double.parseDouble(var1) - Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "div":
			variableStack.push(String.valueOf(Double.parseDouble(var1) / Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "mul":
			variableStack.push(String.valueOf(Double.parseDouble(var1) * Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		case "mod":
			variableStack.push(String.valueOf(Double.parseDouble(var1) % Double.parseDouble(var2)));
			continuousAdditionToVarStack = 1;
			break;
		default:
			break;
		}

	}
}
