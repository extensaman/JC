package home.chapter05strings.task31patterncommand.controller;

import home.chapter05strings.task31patterncommand.model.Model;
import home.chapter05strings.task31patterncommand.view.View;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class Controller {

    private LinkedList<Command> commandQueue;

    public Controller(LinkedList<Command> commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void addCommand (Command command) {

        commandQueue.addLast(command);

    }

    public void executeController (Model model, View view) {

        Command command = commandQueue.pollFirst();
        while (command != null) {

            command.execute(model, view);
            command = commandQueue.pollFirst();
        }
        view.outMessage("Controller's queue is empty");

    }
}
