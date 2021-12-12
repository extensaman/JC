package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;

public class StringConcatter {

    double calculateStringConcatTime(Model model) {

        String result = "";
        String text = model.getText();
        long startTime;
        int i;

        startTime = System.nanoTime();

        for (i = 0; i < model.getCyclesCount(); i++) {
            result += text;
        }

        return System.nanoTime() - startTime;
    }
}
