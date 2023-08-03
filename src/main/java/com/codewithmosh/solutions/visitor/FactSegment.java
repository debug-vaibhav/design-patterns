package com.codewithmosh.solutions.visitor;

public class FactSegment extends Segment {
  @Override
  public void applyFilter(AudioFilter filter) {
    filter.apply(this);
  }
}
