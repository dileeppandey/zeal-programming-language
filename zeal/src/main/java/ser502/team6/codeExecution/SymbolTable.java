package ser502.team6.codeExecution;

import java.util.HashMap;

import ser502.team6.util.Logger;

/**
 * 
 * @author User
 *
 */
public class SymbolTable {
	public HashMap<String, Entity> symbolTable;

	public SymbolTable() {
		symbolTable = new HashMap<String, Entity>();
	}

	/**
	 * 
	 * @param identifierName
	 * @param entity
	 */
	public void insert(String identifierName, Entity entity) {
		if (!this.symbolTable.containsKey(identifierName)) {
			this.symbolTable.put(identifierName, entity);
		} else {
			Logger.printWarning(
					"This key is already in the scope :" + identifierName);
		}
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean lookup(String key) {
		if (this.symbolTable.containsKey(key)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SymbolTable [symbolTable=");
		builder.append(symbolTable);
		builder.append("]");
		return builder.toString();
	}

}
