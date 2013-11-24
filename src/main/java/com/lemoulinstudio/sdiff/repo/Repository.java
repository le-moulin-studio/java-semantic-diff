package com.lemoulinstudio.sdiff.repo;

import java.io.File;

/**
 * A repository where some content is stored.
 */
public class Repository {
  
  // A few predefined types of repository.
  public static final String GIT_TYPE       = "git";
  public static final String MERCURIAL_TYPE = "hg";
  public static final String SVN_TYPE       = "svn";
  public static final String CVS_TYPE       = "cvs";
  
  /**
   * The type of repository.
   */
  public String type;
  
  /**
   * The base directory of this repository, if it exists.
   */
  public File baseDirectory;
  
  /**
   * The name of this repository, if it exists.
   */
  public String name;
  
  /**
   * The identifier of this repository, if it exists.
   */
  public String identifier;
  
}
