package home.chapter07genericandenum.task36;

import java.util.Scanner;

/**
 * Раздел "Generics и Enum"
 * Задание №36
 *
 * Написать метод, который выводит следующий сезон от заданного во входном
 * параметре. Входной параметр ввести с клавиатуры.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {

        printAllSeasons();
        System.out.println("\nВведите номер сезона: ");
        int choice = enterSeasonNumber();

        if (choice == 4) {
            choice = 0;
        }

        Seasons season = Seasons.values()[choice];
        System.out.println("Следующий сезон: ");
        printSeason (season);

    }

    public static int enterSeasonNumber() {
        Scanner sc = new Scanner (System.in);

        int n;
        while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0 || n > Seasons.values().length) {
            sc.nextLine();
            System.out.println("Entered wrong data. Try again.");
        }
        return n;
    }

    public static void printAllSeasons () {
        Seasons[] mas = Seasons.values();
        for (int i = 0; i < mas.length; i++) {
            System.out.print("\n№ " + (i + 1));
            printSeason(mas[i]);
        }
    }

    public static void printSeason (Seasons season) {
        System.out.println(
                "\nИмя константы: " + season.toString() +
                "\nКоличество дней: " + season.getCountOfDays() +
                "\nОписание сезона: " + season.getDescription()
                            );

    }
}


