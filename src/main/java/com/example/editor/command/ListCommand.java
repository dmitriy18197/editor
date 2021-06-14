package com.example.editor.command;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class ListCommand implements AbstractCommand {

    private final List<String> lines;

    @Override
    public void execute() {
        for (int i = 0; i < lines.size(); i++) {
            System.out.println(String.format("%d: %s", i, lines.get(i)));
        }
    }
}
