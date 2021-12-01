package home.chapter03arrays.task22;

/**
 * Раздел "Массивы"
 * Задание №22
 *
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Выведите на экран, переверните и снова выведите на экран
 * (при переворачивании нежелательно создавать еще один массив).
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int ARRAY_SIZE = 10;
    public static final double ELEMENTS_LIMIT = 10.0;

    public static void main(String[] args) {

        int[] mas = new int[ARRAY_SIZE];

        fillRandomArray(mas);
        printArray("Сгенерированный массив:", mas);

        inverseArray(mas);
        printArray("\nПеревернутый массив:", mas);

        inverseArray(mas);
        printArray("\nПовторно перевернутый массив:", mas);

    }

    public static void fillRandomArray(int[] mas) {

        for (int i = 0; i < mas.length; i++) {

            mas[i] = (int) (Math.random() * ELEMENTS_LIMIT - ELEMENTS_LIMIT / 2.0);
        }
    }

    public static void printArray(String message, int[] mas) {

        System.out.println(message);

        for (int element : mas) {
            System.out.printf("%+3d", element);
        }

    }

    public static void inverseArray(int[] mas) {

        int middle = mas.length / 2;
        int end = mas.length - 1;

        for (int i = 0; i < middle; i++) {

            int temp = mas[i];
            mas[i] = mas[end - i];
            mas[end - i] = temp;

        }
    }
}
