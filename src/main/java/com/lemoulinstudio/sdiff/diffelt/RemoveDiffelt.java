package com.lemoulinstudio.sdiff.diffelt;

import com.lemoulinstudio.sdiff.content.ContentLocation;
import com.lemoulinstudio.sdiff.content.ContentElementReference;
import com.lemoulinstudio.sdiff.content.ContentElementData;

/**
 * A diffelt representing the removal of a content element.
 */
public class RemoveDiffelt implements Diffelt {
  
  /**
   * The content element which is removed.
   */
  public ContentElementData data;
  
  /**
   * The location where the content element is removed from.
   */
  public ContentLocation location;
  
  /**
   * The reference to the content element before being removed.
   */
  public ContentElementReference reference;
  
}
