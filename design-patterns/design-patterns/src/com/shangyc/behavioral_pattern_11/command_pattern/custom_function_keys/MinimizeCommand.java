package com.shangyc.behavioral_pattern_11.command_pattern.custom_function_keys;

public class MinimizeCommand extends Commond {

    private WindowHandlder windowHandlder;

    public MinimizeCommand(WindowHandlder windowHandlder) {
        this.windowHandlder = windowHandlder;
    }

    @Override
    public void execute() {
        windowHandlder.minimize();
    }
}
