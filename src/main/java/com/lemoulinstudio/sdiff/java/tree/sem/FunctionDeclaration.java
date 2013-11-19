package com.lemoulinstudio.sdiff.java.tree.sem;

import java.util.List;

public abstract class FunctionDeclaration {
  
  DeclaredType parent;
  
  boolean isFinal;
  Visibility visibility;
  
  List<Parameter> parameters;
  Parameter ellipsis;
  
}
