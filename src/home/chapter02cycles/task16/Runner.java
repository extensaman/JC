package home.chapter02cycles.task16;

/**
 * Раздел "Циклы"
 * Задание №16
 *
 * Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (isDivideBySeven(i)) {
                System.out.println(i + ": Hope!");
            }
        }
    }

    public static boolean isDivideBySeven (int number) {

        return (number % 7 == 0) ? true: false;

    }
}
