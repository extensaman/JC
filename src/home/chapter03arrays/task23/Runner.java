package home.chapter03arrays.task23;

/**
 * Раздел "Циклы"
 * Задание №23
 *
 * Создать двухмерный квадратный массив и заполнить его «бабочкой»,
 * то есть таким образом (вводишь произвольный размер матрицы и программа автоматически ее строит):
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {

        int[][] mas = new int[ARRAY_SIZE][ARRAY_SIZE];

        fillButterflyArray(mas);
        printArray("Массив-бабочка:", mas);

    }

    public static void fillButterflyArray(int[][] mas) {

        for (int i = 0; i <= mas.length / 2; i++) {

            for (int j = i; j < mas[i].length - i; j++) {

                mas[i][j] = 1;
            }
        }

        // копируем верхнюю часть в нижнюю
        int index = 0;
        for (int i = mas.length -1; i >= mas.length / 2; i--) {

            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = mas[index][j];
            }
            index++;
        }
    }

    public static void printArray(String message, int[][] mas) {

        System.out.println(message);

        for (int[] row : mas) {
            for (int element : row) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }

    }
}

