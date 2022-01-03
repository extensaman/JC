package home.chapter09exception.task43;

import java.util.Deque;

public class Entity {

    private Deque<String> stack;

    public Entity(Deque<String> stack) {
        this.stack = stack;
    }

    public void push (String s) {
        stack.push(s);
    }

    public String pop () {
        return stack.pop();
    }

    public void printAllToUpperCase() {

        for (String s : stack) {

            try {
                System.out.println(s.toUpperCase());
            } catch(NullPointerException e) {
                System.out.println("Возникло исключение: " + e);
                continue;
            }
        }

    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
