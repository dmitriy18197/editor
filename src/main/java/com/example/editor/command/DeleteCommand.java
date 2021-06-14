package com.example.editor.command;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DeleteCommand implements AbstractCommand {

    private final List<String> lines;
    private final String userInput;

    @Override
    public void execute() {
        int lineIndex = parse(userInput);
        lines.remove(lineIndex);
    }

    private int parse(String userInput) {
        String[] tokens = userInput.split(" ");
        return Integer.parseInt(tokens[1]);
    }

}
