package com.lemoulinstudio.sdiff.java.tree.sem;

public abstract class DeclaredType extends Type {

  DeclaredType parent;
  Visibility visibility;
  
  public DeclaredType(String name) {
    super(name);
  }
  
}
