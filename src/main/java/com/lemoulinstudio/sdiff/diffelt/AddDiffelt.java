package com.lemoulinstudio.sdiff.diffelt;

import com.lemoulinstudio.sdiff.content.ContentLocation;
import com.lemoulinstudio.sdiff.content.ContentElementReference;
import com.lemoulinstudio.sdiff.content.ContentElementData;

/**
 * A diffelt representing the addition of a content element.
 */
public class AddDiffelt implements Diffelt {
  
  /**
   * The content element which is added.
   */
  public ContentElementData data;
  
  /**
   * The location where the content element is added to.
   */
  public ContentLocation location;
  
  /**
   * The reference to the content element after being added.
   */
  public ContentElementReference reference;
  
}
