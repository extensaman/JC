package home.chapter06inheritance.task01;

public class Runner {

    public static final int GROUP_DEFAULT_CAPACITY = 9;

    public static void main(String[] args) {

        Group group01 = new Group(Logic.formGroup(GROUP_DEFAULT_CAPACITY));
        group01.printGroup();


    }
}
