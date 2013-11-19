package com.lemoulinstudio.sdiff.java.tree.sem;

import java.util.List;

public class Interface extends DeclaredType {
  
  List<Interface> superInterfaces;
  
  List<Field> fields;
  List<Constructor> constructor;
  List<Method> methods;

  public Interface(String name) {
    super(name);
  }
  
}
