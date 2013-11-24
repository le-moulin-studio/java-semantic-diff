package com.lemoulinstudio.sdiff.diffelt;

import com.lemoulinstudio.sdiff.content.FileContentReference;

/**
 * A location inside a content persisted in a file.
 * 
 * Here, the content is treated as pure binary data,
 * each location is like an index in a byte array.
 */
public class FileContentLocation implements ContentLocation {
  
  /**
   * A reference to a content which is in a file.
   */
  public FileContentReference file;
  
  /**
   * A location inside a file.
   * 
   * It points to the position of a byte.
   */
  public long index;
  
}
