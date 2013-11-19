package com.lemoulinstudio.sdiff.java.tree.sem;

public class PrimitiveType extends Type {
  
  public static final PrimitiveType VOID    = new PrimitiveType("void");
  public static final PrimitiveType BOOLEAN = new PrimitiveType("boolean");
  public static final PrimitiveType CHAR    = new PrimitiveType("char");
  public static final PrimitiveType BYTE    = new PrimitiveType("byte");
  public static final PrimitiveType SHORT   = new PrimitiveType("short");
  public static final PrimitiveType INT     = new PrimitiveType("int");
  public static final PrimitiveType LONG    = new PrimitiveType("long");
  public static final PrimitiveType FLOAT   = new PrimitiveType("float");
  public static final PrimitiveType DOUBLE  = new PrimitiveType("double");

  public PrimitiveType(String name) {
    super(name);
  }
  
}
