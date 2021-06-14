package com.example.editor.command;

import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@RequiredArgsConstructor
public class SaveCommand implements AbstractCommand {

    private final List<String> lines;
    private final String filePath;

    @Override
    public void execute() {
        try {
            Files.write(Paths.get(filePath), lines);
        } catch (IOException e) {
            throw new RuntimeException("Failed to save.");
        }
    }

}
