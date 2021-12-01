package home.chapter01ifswitch.task07;

import java.util.Scanner;

/**
 * Раздел "Операторы if/switch"
 * Задание №7
 *
 * Имеется прямоугольное отверстие размерами а и Ь, где а и Ь - целые числа.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже
 * целое число).
 */

public class Runner {

    public static void main(String[] args) {

        int a = inputIntegerMoreZero("Enter \'a\': ");
        int b = inputIntegerMoreZero("Enter \'b\': ");

        int r = inputIntegerMoreZero("Enter \'r\': ");

        double diagonal = Math.sqrt( a * a + b * b);

        System.out.println("Diagonal equals: " + diagonal);

        if (diagonal > r * 2) {

            System.out.println("It's possible to cover");

        } else {

            System.out.println("It's impossible to cover");
        }

    }

    public static int inputIntegerMoreZero (String message) {

        System.out.println(message);

        Scanner sc = new Scanner(System.in);

        int m;

        while (!sc.hasNextInt() || (m = sc.nextInt()) <= 0) {

            sc.nextLine();
            System.out.println("Wrong data entered. Input an integer > 0");
        }

        return m;
    }
}
