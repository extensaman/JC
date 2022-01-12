package home.chapter11thread.task53;

/**
 * Раздел "Класс Thread и интерфейс Runnable"
 * Задание №53
 *
 * Создать класс поток, который генерирует массив случайных целых чисел из 1О
 * элементов, "Затем находит максимальный элемент, в этом массиве, и выводит на
 * экран в формате имя потока, максимальный элемент. Запустить 10 потоков.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int THREAD_DEFAULT_COUNT = 10;

    public static void main(String[] args) {

        for (int i = 0; i < THREAD_DEFAULT_COUNT; i++) {

            new RandomArrayGenerator("Thread #" + i).start();

        }
    }
}
