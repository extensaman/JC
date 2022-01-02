package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;
import home.chapter05strings.task31patterncommand.view.View;

public class CommandStringConcat implements Command{
    private StringConcatter stringConcatter;

    public CommandStringConcat(StringConcatter stringConcatter) {
        this.stringConcatter = stringConcatter;
    }

    @Override
    public void execute (Model model, View view) {
        double result = stringConcatter.calculateStringConcatTime(model);
        view.outMessage(model.getCyclesCount() +
                " операций \"плюсования\" String-а \"" + model.getText() + "\" происходят за " +
                result + " наносекунд\n");
    }
}
