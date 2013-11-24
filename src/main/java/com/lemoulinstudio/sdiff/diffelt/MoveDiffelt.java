package com.lemoulinstudio.sdiff.diffelt;

import com.lemoulinstudio.sdiff.content.ContentLocation;
import com.lemoulinstudio.sdiff.content.ContentElementReference;
import com.lemoulinstudio.sdiff.content.ContentElementData;

/**
 * A diffelt representing the movement of a content element.
 */
public class MoveDiffelt implements Diffelt {
  
  /**
   * The content element which is moved.
   */
  public ContentElementData data;
  
  /**
   * The location of the content element before being moved.
   */
  public ContentLocation locationBefore;
  
  /**
   * The location of the content element after being moved.
   */
  public ContentLocation locationAfter;
  
  /**
   * A reference to the content element before being moved.
   */
  public ContentElementReference referenceBefore;
  
  /**
   * A reference to the content element after being moved.
   */
  public ContentElementReference referenceAfter;
  
}
