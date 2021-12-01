package home.chapter02cycles.task15;

/**
 * Раздел "Циклы"
 * Задание №15
 *
 * Найти среди чисел от 50 до 70 второе простое число (число называют простым,
 * если оно делится без остатка только на 1 и себя)
 * и завершить цикл с использованием break.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int START_POINT = 50;
    public static final int END_POINT = 70;

    public static void main(String[] args) {

        boolean isFirstPrimeNumberFounded = false;

        int secondPrimeNumberIndex = -1;

        for (int i = START_POINT; i <= END_POINT; i++) {

            if (isPrimeNumber(i)) {

                if (isFirstPrimeNumberFounded) {
                    secondPrimeNumberIndex = i;
                    break;
                } else {
                    isFirstPrimeNumberFounded = true;
                }

            }
        }

        if (secondPrimeNumberIndex >= 0) {
            System.out.println("Второе простое число: " + secondPrimeNumberIndex);
        } else {
            System.out.println("Второе простое число не надено");
        }
    }

    public static boolean isPrimeNumber (int number) {

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                return false;
            }
        }

        return  true;
    }
}
