package home.chapter06inheritance.task01;

public class Runner {

    public static final int GROUP_DEFAULT_CAPACITY = 9;
    public static final int FULL_TIME_FOR_BEST_STUDENT = 198;

    public static void main(String[] args) {

        Logic logic = new Logic();
        Group group01 = new Group(logic.formGroup(GROUP_DEFAULT_CAPACITY));
        group01.printGroup();


    }
}
