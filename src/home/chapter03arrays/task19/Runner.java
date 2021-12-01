package home.chapter03arrays.task19;

import java.util.Scanner;

/**
 * Раздел "Массивы"
 * Задание №19
 *
 * Создать отдельный класс с методом, который делает:
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа (разными способами напримерер используя Math.random() ) и 
 * выведите на экран элементы, стоящие на четных позициях.
 */

public class Runner {

    public static void main(String[] args) {

        int size = inputIntegerMoreZero("Enter an array size: ");
        
        Storage store1 = new Storage (size);
        
        store1.fillRandomArray(size);
        store1.printAllArrayElements();
        store1.printEvenArrayElements();
        
        System.out.println("\nCreate default array and initialize with sequential numbers");
        Storage store2 = new Storage();
        
        store2.fillSequentialArray();
        store2.printAllArrayElements();
        store2.printEvenArrayElements();

    }

    public static int inputIntegerMoreZero (String message) {

        System.out.println(message);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int m;

        while (!sc.hasNextInt() || (m = sc.nextInt()) <= 0) {

            sc.nextLine();
            System.out.println("Wrong data entered. Input an integer > 0");
        }

        return m;
    }
    
}