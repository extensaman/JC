package home.chapter03arrays.task21;

/**
 * Раздел "Массивы"
 * Задание №21
 *
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько,
 * то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int ARRAY_SIZE = 10;
    public static final double ELEMENTS_LIMIT = 20.0;
    public static final int MIN = 0;
    public static final int MAX = 1;

    public static void main(String[] args) {

        int[] mas = new int[ARRAY_SIZE];

        fillRandomArray(mas);
        printArray("Сгенерированный массив следующий:", mas);

        int[] indexMinMax = findMinMaxElementIndex(mas);
        printArray("\nМинимальный и максимальный элементы расположены на следующих индексах: ", indexMinMax);

        int sum = sumArrayElements(mas, indexMinMax[MIN], indexMinMax[MAX]);
        System.out.println("\nCумма элементов массива, расположенных между минимальным и максимальным значениями, равна " + sum);
    }

    public static void fillRandomArray(int[] mas) {

        for (int i = 0; i < mas.length; i++) {

            mas[i] = (int) (Math.random() * ELEMENTS_LIMIT - ELEMENTS_LIMIT / 2.0);
        }
    }

    public static void printArray(String message, int[] mas) {

        System.out.println(message);

        for (int element : mas) {
            System.out.printf("%3d", element);
        }

    }

    public static int[] findMinMaxElementIndex(int[] mas) {

        int[] arrayOfMinAndMaxIndexResult = new int[2]; // Будем этот массив возвращать: [0] - индекс минимального элемента, [1] - индекс максимального элемента
        int[] arrayOfMinAndMaxIndexForward = new int[2]; // Будем использовать при прямой проходке по массиву
        int[] arrayOfMinAndMaxIndexBackward = new int[2]; // Будем использовать при обратной проходке по массиву

        int maxElement, minElement;

        // находим индексы минимального и максимального элементов при прямой проходке
        maxElement = minElement = mas[0];
        for (int i = 1; i < mas.length; i++) {

            if (mas[i] <= minElement) {

                arrayOfMinAndMaxIndexForward[MIN] = i;
                minElement = mas[i];
            }

            if (mas[i] >= maxElement) {

                arrayOfMinAndMaxIndexForward[MAX] = i;
                maxElement = mas[i];
            }
        }

        // находим индексы минимального и максимального элементов при обратной проходке
        maxElement = minElement = mas[mas.length - 1];
        for (int i = mas.length - 1; i >= 0; i--) {

            if (mas[i] <= minElement) {

                arrayOfMinAndMaxIndexBackward[MIN] = i;
                minElement = mas[i];
            }

            if (mas[i] >= maxElement) {

                arrayOfMinAndMaxIndexBackward[MAX] = i;
                maxElement = mas[i];
            }
        }

        // находим максимальное расстояние
        if (
                Math.abs (arrayOfMinAndMaxIndexForward[MIN] - arrayOfMinAndMaxIndexBackward[MAX])
                        >
                        Math.abs (arrayOfMinAndMaxIndexBackward[MIN] - arrayOfMinAndMaxIndexForward[MAX])
        )
        {
            arrayOfMinAndMaxIndexResult[MIN] = arrayOfMinAndMaxIndexForward[MIN];
            arrayOfMinAndMaxIndexResult[MAX] = arrayOfMinAndMaxIndexBackward[MAX];

        } else {

            arrayOfMinAndMaxIndexResult[MIN] = arrayOfMinAndMaxIndexBackward[MIN];
            arrayOfMinAndMaxIndexResult[MAX] = arrayOfMinAndMaxIndexForward[MAX];
        }

        return arrayOfMinAndMaxIndexResult;
    }

    public static int sumArrayElements (int[] mas, int start, int end) {

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {

            sum += mas[i];
        }

        return sum;
    }
}
