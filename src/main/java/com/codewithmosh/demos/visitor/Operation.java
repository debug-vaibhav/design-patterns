package com.codewithmosh.demos.visitor;

public interface Operation {
  void apply(HeadingNode heading);
  void apply(AnchorNode anchor);
}
