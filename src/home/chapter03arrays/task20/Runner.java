package home.chapter03arrays.task20;

/**
 * Раздел "Массивы"
 * Задание №20
 *
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Найдите максимальный элемент и выведите его индекс.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int ARRAY_SIZE = 10;
    public static final double ELEMENTS_LIMIT = 20.0;

    public static void main(String[] args) {

        int[] mas = new int[ARRAY_SIZE];

        fillRandomArray(mas);

        printArray("Сгенерированный массив следующий:", mas);

        System.out.println("\nИндекс максимального элемента: " + findMaxElementIndex(mas));

    }

    public static void fillRandomArray (int[] mas) {

        for (int i = 0; i < mas.length; i++) {

            mas[i] = (int) (Math.random() * ELEMENTS_LIMIT - ELEMENTS_LIMIT / 2.0);
        }
    }

    public static void printArray (String message, int[] mas) {

        System.out.println(message);

        for (int element : mas) {
            System.out.printf("%+3d", element);
        }

    }

    public static int findMaxElementIndex (int[] mas) {

        int index = 0;
        int maxElement = mas[0];

        for (int i = 1; i < mas.length; i++) {

            if (mas[i] > maxElement) {

                index = i;
                maxElement = mas[i];
            }

        }

        return index;
    }
}
