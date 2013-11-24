package com.lemoulinstudio.sdiff.diffelt;

/**
 * A dependency between 2 diffelts.
 * 
 * The "dependent" diffelt depends on the "dependency" diffelt.
 */
public class DiffeltDependency {

  public final Diffelt dependent;
  public final Diffelt dependency;

  public DiffeltDependency(Diffelt dependent, Diffelt dependency) {
    this.dependent = dependent;
    this.dependency = dependency;
  }

}
