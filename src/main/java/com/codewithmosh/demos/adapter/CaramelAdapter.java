package com.codewithmosh.demos.adapter;

import com.codewithmosh.demos.adapter.avaFilters.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
  @Override
  public void apply(Image image) {
    init();
    render(image);
  }
}
