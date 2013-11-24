package com.lemoulinstudio.sdiff.content;

import com.lemoulinstudio.sdiff.repo.Repository;
import java.io.File;

/**
 * A reference to a content persisted in a file.
 */
public class FileContentReference implements ContentReference {
  
  /**
   * The repository the content belongs to, if it exists.
   */
  public Repository repository;
  
  /**
   * The file containing the content.
   */
  public File file;
  
}
