package com.codewithmosh.demos.command;

import com.codewithmosh.demos.command.fx.Command;

public class ResizeCommand implements Command {
  @Override
  public void execute() {
    System.out.println("Resize");
  }
}
