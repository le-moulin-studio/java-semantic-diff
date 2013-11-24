package com.lemoulinstudio.sdiff.diffelt;

/**
 * A diffelt representing the replacement or modification of a content element.
 */
public class ReplaceDiffelt implements Diffelt {
  
  /**
   * The content element before being replaced.
   */
  public ContentElementData dataBefore;
  
  /**
   * The content element after being replaced.
   */
  public ContentElementData dataAfter;
  
  /**
   * The location of the content element.
   */
  public ContentLocation location;
  
  /**
   * A reference to the content element.
   */
  public ContentElementReference reference;
  
}
