package ser502.team6.codeExecution;

import java.util.HashMap;

public class SymbolTable {

	public HashMap<String, Entity> symbolTable;

	public SymbolTable() {
		symbolTable = new HashMap<String, Entity>();
	}

	public void insert(String identifierName, Entity entity) {
		this.symbolTable.put(identifierName, entity);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SymbolTable [symbolTable=");
		builder.append(symbolTable);
		builder.append("]");
		return builder.toString();
	}
	
	

}
