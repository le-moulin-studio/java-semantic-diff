package com.lemoulinstudio.sdiff.java.tree.sem;

import java.util.List;

public class Class extends DeclaredType {
  
  boolean isStatic;
  boolean isFinal;
  boolean isAbstract;
  
  Class superClass;
  List<Interface> interfaces;
  
  List<Field> fields;
  List<Constructor> constructor;
  List<Method> methods;

  public Class(String name) {
    super(name);
  }
  
}
