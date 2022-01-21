package home.chapter13datetime.task64;

import java.util.Scanner;

public class Input {

    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;

    private Input() {}

    public static int inputInteger() {

        Scanner sc = new Scanner(System.in);
        int m;
        while (!sc.hasNextInt() || (m = sc.nextInt()) < FIRST_MONTH || m > LAST_MONTH) {
            Output.printMessage("Wrong number. Try again");
            sc.nextLine();
        }
        return m;
    }
}
