package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;

public class StringBuilderAppender{

    public double calculateStringBuilderAppendTime(Model model) {

        String s = model.getText();
        StringBuffer stringBuffer = new StringBuffer(s);

        long startTime;
        int i;

        startTime = System.nanoTime();

        for (i = 0; i < model.getCyclesCount(); i++) {
            stringBuffer.append(s);
        }

        return System.nanoTime() - startTime;
    }
}
