package com.example.editor.command;

import lombok.AllArgsConstructor;

import java.util.Arrays;

@AllArgsConstructor
public enum Command {
    // with args
    INSERT("ins \\d .+"),
    DELETE("del \\d"),

    // with no args
    LIST("list"),
    HELP("help"),
    QUIT("quit"),
    SAVE("save");

    private final String pattern;

    public static Command fromInput(String input) {
        return Arrays.stream(Command.values())
                .filter(it -> input.matches(it.pattern))
                .findFirst()
                .orElse(null);
    }

}
