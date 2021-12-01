package home.chapter00entry.task04;

import java.util.Scanner;

/**
 * Раздел "Типы данных. Переменные. Операторы. Методы"
 * Задание №4
 *
 * Написать метод, который принимает на вход два целых числа, делает их
 * суммирование и складывает результат с произведением двух этих чисел, и
 * возвращает полученный результат из метода . Передать на вход в метод любые два
 * числа. Вывести полученный результат работы метода на экран.
 */

public class Main {

    public static void main(String[] args) {

        int a = inputInteger("Enter the first number: ");
        int b = inputInteger("Enter the second number: ");
        long result = calculateResult(a, b);

        System.out.println("The result of calculation is " + result);
    }

    public static int inputInteger (String message) {

        System.out.println(message);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("Wrong data entered. Enter an integer");
            sc.nextLine();
        }

        return sc.nextInt();
    }

    public static long calculateResult (int a, int b) {

        return ((long) a + b) + (long) a * b;
    }
}
