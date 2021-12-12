package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;
import home.chapter05strings.task31patterncommand.view.View;

public class CommandStringBuilderAppend implements Command{

    private StringBuilderAppender stringBuilderAppender;

    public CommandStringBuilderAppend(StringBuilderAppender stringBuilderAppender) {
        this.stringBuilderAppender = stringBuilderAppender;
    }

    @Override
    public void execute(Model model, View view) {
        double result = stringBuilderAppender.calculateStringBuilderAppendTime(model);
        view.outMessage(model.getCyclesCount() +
                " append-ов StringBuilder-а со строкой \"" + model.getText() + "\" происходят за " +
                result + " наносекунд\n");
    }
}
