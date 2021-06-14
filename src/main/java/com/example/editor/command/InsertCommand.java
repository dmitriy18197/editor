package com.example.editor.command;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class InsertCommand implements AbstractCommand {

    private final List<String> lines;
    private final String userInput;

    @Override
    public void execute() {
        InsertInput input = parse(userInput);
        lines.add(input.lineIndex, input.content);
    }

    private InsertInput parse(String userInput) {
        String[] tokens = userInput.split(" ");
        int lineIndex = Integer.parseInt(tokens[1]);
        StringBuilder content = new StringBuilder();
        for (int i = 2; i < tokens.length; i++) {
            content.append(tokens[i]).append(" ");
        }
        return new InsertInput(lineIndex, content.toString());
    }

    @RequiredArgsConstructor
    private static class InsertInput {
        private final int lineIndex;
        private final String content;
    }
}
