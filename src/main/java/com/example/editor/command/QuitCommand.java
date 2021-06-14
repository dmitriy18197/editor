package com.example.editor.command;

public class QuitCommand implements AbstractCommand {

    @Override
    public void execute() {
        System.exit(0);
    }

}
