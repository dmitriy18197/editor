package com.example.editor.command;

public class HelpCommand implements AbstractCommand {

    @Override
    public void execute() {
        System.out.println("Try one of the following command:\n" +
                "`quit` - close program\n" +
                "`save` - save changes to file\n" +
                "`ins {n} {s}` - insert text `s` on line `n`\n" +
                "`del {n}` - delete line `n`\n" +
                "`list` - print all lines");
    }

}
