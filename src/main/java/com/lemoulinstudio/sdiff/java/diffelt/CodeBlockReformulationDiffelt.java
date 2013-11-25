package com.lemoulinstudio.sdiff.java.diffelt;

import com.lemoulinstudio.sdiff.content.ContentElementData;
import com.lemoulinstudio.sdiff.content.ContentElementReference;
import com.lemoulinstudio.sdiff.content.ContentLocation;
import com.lemoulinstudio.sdiff.diffelt.Diffelt;

public class CodeBlockReformulationDiffelt implements Diffelt {

  /**
   * The content element before being reformulated.
   */
  public ContentElementData dataBefore;
  
  /**
   * The content element after being reformulated.
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
