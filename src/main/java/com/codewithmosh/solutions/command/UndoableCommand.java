package com.codewithmosh.solutions.command;

public interface UndoableCommand extends Command {
    void undo();
}
