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

}
