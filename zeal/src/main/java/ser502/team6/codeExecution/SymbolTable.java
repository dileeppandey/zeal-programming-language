package ser502.team6.codeExecution;

import ser502.team6.util.Logger;

import java.util.HashMap;

public class SymbolTable {

  public HashMap<String, Entity> symbolTable;

  public SymbolTable() {
    symbolTable = new HashMap<String, Entity>();
  }
  /* Inserts a sumbol into symbol table */
  public void insert(String identifierName, Entity entity) {
    if(!this.symbolTable.containsKey(identifierName)) {
      this.symbolTable.put(identifierName, entity);
    } else {
      Logger.printWarning("This key is already in the scope :" + identifierName);
    }
  }
  /* Checks if a symbol already exists */
  public boolean lookup(String key) {
    if(this.symbolTable.containsKey(key)) {
      return true;
    } else {
      return false;
    }
  }
}
