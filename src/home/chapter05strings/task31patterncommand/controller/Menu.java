package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;
import home.chapter05strings.task31patterncommand.view.View;

import java.util.LinkedList;

public class Menu {

    public static final String MENU_TEXT = "1 - enter a text for process\n" +
            "2 - enter cycles count\n" +
            "3 - add StringConcatter to the queue\n" +
            "4 - add StringBuilderAppender to the queue\n"+
            "5 - execute the queue\n" +
            "0 - exit\n";

    public void run (Model model, View view, Controller controller) {

        while (true){

            view.outMessage(MENU_TEXT);
            int choice = view.inInteger();

            switch (choice){
                case 1:
                    view.outMessage("Enter new text for process: ");
                    model.setText(view.inText());
                    break;
                case 2:
                    view.outMessage("Enter cycles count: ");
                    model.setCyclesCount(view.inInteger());
                    break;
                case 3:
                    controller.addCommand(new CommandStringConcat(new StringConcatter()));
                    view.outMessage("Command StringConcat added to the queue");
                    break;
                case 4:
                    controller.addCommand((new CommandStringBuilderAppend(new StringBuilderAppender())));
                    view.outMessage("Command StringBuilderAppend added to the queue");
                    break;
                case 5:
                    controller.executeController(model, view);
                    break;
                case 0:
                    return;
                default:
                    view.outMessage("Wrong data entered");
            }
        }


    }
}
