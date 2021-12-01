package home.chapter01ifswitch.task06;

import java.util.Scanner;

/**
 * Раздел "Операторы if/switch"
 * Задание №6
 *
 * Создайте метод с одним целочисленным параметром. Метод должен
 * определить, является ли последняя цифра числа семеркой и вернуть boolean
 * значение.
 */

public class Main {

    public static void main(String[] args) {

        int number = inputInteger ("Enter an integer: ");

        boolean isSeven = isLastDigitSeven (number);

        printResult (number, isSeven);
    }

    public static int inputInteger (String message) {

        System.out.println(message);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);

        while (!sc.hasNextInt()) {

            System.out.println("Wrong data entered. Enter an integer.");
            sc.nextLine();
        }

        return sc.nextInt();

    }

    public static boolean isLastDigitSeven (int number) {

        if (Math.abs(number) % 10 == 7) {

            return true;

        } else {

            return false;
        }
    }

    public static void printResult (int number, boolean isSeven) {

        if (isSeven) {

            System.out.println("The last digit in " + number + " is \'seven\'");

        } else {

            System.out.println("The last digit in " + number + " isn't \'seven\'");

        }

    }
}
