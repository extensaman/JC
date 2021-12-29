package home.chapter08collection.task09notfrombook.view;

import java.util.Scanner;

public class View {

    public static final String MENU = "\nMENU:\n1 - sort by name (ASC)\n2 - sort by name (DESC)\n" +
            "3 - sort by price (ASC)\n4 - sort by price (DESC)\n" +
            "5 - sort by rating (ASC)\n6 - sort by rating (DESC)\n" +
            "0 - exit";

    public static final int MENU_ITEM_COUNT = 6;

    public static int inputInt() {
        Scanner sc = new Scanner (System.in);

        int m;
        while (!sc.hasNextInt() || (m = sc.nextInt()) < 0 || m > MENU_ITEM_COUNT) {
            System.out.println("Wrong data entered. Try again");
            sc.nextLine();
        }

        return m;
    }

    public static void printMenu() {
        System.out.println(MENU);
    }
}
