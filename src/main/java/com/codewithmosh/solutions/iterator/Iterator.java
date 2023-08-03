package com.codewithmosh.solutions.iterator;

public interface Iterator {
  boolean hasNext();
  Product current();
  void next();
}
