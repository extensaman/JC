package home.chapter10file.task49;

/**
 * Раздел "Работа с файлами"
 * Задание №49
 *
 * Записать с помощью Java в двоичный файл 20 случайных чисел. Прочитать
 * записанный файл, вывести на экран числа и их среднее арифметическое.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

import home.chapter10file.task49.controller.Controller;

import java.io.FileNotFoundException;

public class Runner {

    public static final String FILE_PATH = "D:/new.bin";
    public static final int LIST_SIZE = 20;
    public static final int LOW_RANDOM_LIMIT = 1;
    public static final int HIGH_RANDOM_LIMIT = 10;

    public static void main(String[] args) {

        Controller controller = new Controller();

        try {
            controller.perform(FILE_PATH, LIST_SIZE, LOW_RANDOM_LIMIT, HIGH_RANDOM_LIMIT);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
