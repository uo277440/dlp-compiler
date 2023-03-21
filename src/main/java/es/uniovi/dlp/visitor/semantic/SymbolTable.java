package es.uniovi.dlp.visitor.semantic;


import es.uniovi.dlp.ast.program.Definition;

import java.util.*;

public class SymbolTable {
  private int scope = 0;
  private List<Map<String, Definition>> table;

  public SymbolTable() {
    table = new ArrayList<>();
    table.add(new HashMap<String, Definition>());
  }

  public void set() {
    table.add(new HashMap<String, Definition>());
    scope++;
  }

  public void reset() {
    table.remove(table.size() - 1);
    scope--;
  }

  public boolean insert(Definition definition) {
    if(!table.get(scope).containsKey(definition.getName())){
      table.get(scope).put(definition.getName(),definition);
      definition.setScope(scope);
      return true;
    }
    return false;
  }

  public Definition find(String id) {
 int currentScope = scope;
 while(currentScope >= 0){
   if(table.get(currentScope).containsKey(id))
      return table.get(currentScope).get(id);
   currentScope--;

 }
 return null;

  }


  public Definition findInCurrentScope(String id) {return table.get(scope).get(id);}
}
