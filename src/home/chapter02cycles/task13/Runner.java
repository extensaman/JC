package home.chapter02cycles.task13;

import java.util.Scanner;

/**
 * Раздел "Циклы"
 * Задание №13
 *
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Runner {

    public static void main(String[] args) {

        int number = inputIntegerMoreZero("Enter a positive integer: ");
        
        //number = 25;
        
        double multiply = calculateMultiply(number);
        
        System.out.println("Multiply numbers between 1 and " + number + " is " + multiply);

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
    
    public static double calculateMultiply (int number) {
    	
    	double multiply = 1;
    	
    	do {
        
    		multiply *= number--;
        
    	} while (number > 0); // можно установить условие (number > 1), для того, чтобы не умножать в последний раз на 1 и "сэкономить" одну итерацию 
    	
    	return multiply;
        
    }
}
