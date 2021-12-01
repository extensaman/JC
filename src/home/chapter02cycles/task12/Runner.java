package home.chapter02cycles.task12;

import java.util.Scanner;

/**
 * Раздел "Циклы"
 * Задание №12
 *
 * Вычислить факториал целых чисел от О до 1О с помощью цикла while.
 */

public class Runner {

    public static void main(String[] args) {

        int number = inputIntegerMoreZero("Enter a positive integer: ");
        
        //number = 10;
        
        long factorial = calculateFactorial(number);
        
        System.out.println("Factorial of number " + number + " is " + factorial);

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
    
    public static long calculateFactorial (int number) {
    	
    	long factorial = 1;
    	
    	while (number > 0) {
        	factorial *= number--;
        }
    	
    	return factorial;
        
    }
}
