package com.lemoulinstudio.sdiff.diffelt;

/**
 * A diffelt representing the rename of a content element.
 */
public class RenameDiffelt implements Diffelt {
  
  /**
   * The content element which is moved.
   */
  public ContentElementData data;
  
  /**
   * The reference to the content element before being renamed.
   */
  public ContentElementReference referenceBefore;
  
  /**
   * The reference to the content element after being renamed.
   */
  public ContentElementReference referenceAfter;
  
}
