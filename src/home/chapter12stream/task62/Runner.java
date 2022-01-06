package home.chapter12stream.task62;

import home.chapter12stream.task62.controller.Controller;

public class Runner {

    public static final int PERSON_COUNT = 16;
    public static final int SURNAME_LENGTH = 6;
    public static final int NAME_LENGTH = 6;
    public static final int LOW_AGE_LIMIT = 15;
    public static final int HIGH_AGE_LIMIT = 30;

    public static void main(String[] args) {

        Controller controller = new Controller();

        controller.perform(
                PERSON_COUNT,
                SURNAME_LENGTH,
                NAME_LENGTH,
                LOW_AGE_LIMIT,
                HIGH_AGE_LIMIT);

    }
}
