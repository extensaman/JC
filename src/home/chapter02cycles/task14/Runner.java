package home.chapter02cycles.task14;

import java.util.Scanner;

/**
 * Раздел "Циклы"
 * Задание №14
 *
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Runner {

    public static void main(String[] args) {

        long number = inputLongMoreZero("Enter a positive integer: ");
        
        //number = 7_893_823_445L;
        
        int sum = calculateDigitsSum(number); 
        
        System.out.println("Digits sum of number " + number + " is " + sum);

    }

    public static long inputLongMoreZero (String message) {

        System.out.println(message);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        long m;

        while (!sc.hasNextLong() || (m = sc.nextLong()) <= 0) {

            sc.nextLine();
            System.out.println("Wrong data entered. Input an integer > 0");
        }

        return m;
    }
    
    public static int calculateDigitsSum (long number) {
    	
    	int sum = 0;
    	    	
    	do {
        
    		sum += number % 10; 
    		number /= 10;
        
    	} while (number > 0);  
    	
    	return sum;
        
    }
}
