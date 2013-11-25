package com.lemoulinstudio.sdiff.java.content;

import com.lemoulinstudio.sdiff.content.ContentReference;

public class JavaContentReference implements ContentReference {
  public String classname;
  public String methodName;
  public String fieldName;
  public int arrayIndex;
  public int statementIndex;
}
