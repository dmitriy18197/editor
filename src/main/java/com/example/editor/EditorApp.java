package com.example.editor;

import com.example.editor.command.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

class EditorApp {

    void run() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Please enter a file path: ");
        String filePath = inputScanner.nextLine();

            List<String> lines = readFile(filePath);

            while (inputScanner.hasNext()) {
                String userInput = inputScanner.nextLine();
                Command command = Command.fromInput(userInput);
            if (command == null) {
                System.out.println("Incorrect command. Type `help` to list available commands.");
                continue;
            }
            switch (command) {
                case LIST:
                    new ListCommand(lines).execute();
                    break;
                case HELP:
                    new HelpCommand().execute();
                    break;
                case SAVE:
                    new SaveCommand(lines, filePath).execute();
                    break;
                case DELETE:
                    new DeleteCommand(lines, userInput).execute();
                    break;
                case INSERT:
                    new InsertCommand(lines, userInput).execute();
                    break;
                case QUIT:
                    new QuitCommand().execute();
                    break;
            }
        }
    }

    private List<String> readFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to read file: " + filePath);
        }
    }

}
