package home.chapter07genericandenum.task37;

import java.util.Scanner;

/**
 * Раздел "Generics и Enum"
 * Задание №37
 *
 * Написать метод, который в зависимости от сезона, выводит на экран сумму
 * дней в этом сезоне. Входной параметр ввести с клавиатуры.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {

        printAllSeasons();
        System.out.println("\nВведите номер сезона: ");
        int choice = enterSeasonNumber();

        System.out.println("В сезоне " + Seasons.values()[choice - 1] +
                " количество дней = " + Seasons.values()[choice - 1].getCountOfDays());

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
                        "\nОписание сезона: " + season.getDescription()
        );

    }
}
