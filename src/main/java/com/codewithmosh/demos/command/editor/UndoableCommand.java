package com.codewithmosh.demos.command.editor;

public interface UndoableCommand extends Command {
  void unexecute();
}
