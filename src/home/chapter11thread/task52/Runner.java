package home.chapter11thread.task52;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Раздел "Класс Thread и интерфейс Runnable"
 * Задание №52
 *
 * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
 * коллекции из 10 случайных целых чисел и выводит на экран
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int SIZE = 10;
    public static final int LOW_LIMIT = 0;
    public static final int BOUND = 10;
    public static final int THREAD_COUNT = 5;
    public static final int TIME_OUT = 1000;


    public static void main(String[] args) throws InterruptedException {

        Collection<Thread> runnables = new ArrayList<>();

        for (int i = 0; i < THREAD_COUNT; i++) {

            runnables.add(new Thread(
                    () -> {
                        Service service = new Service();
                        Collection<Integer> collection =
                                service.createCollectionWithRandomNumbers(SIZE, LOW_LIMIT, BOUND);
                        View.printCollection(Thread.currentThread().getName(), collection);
                        try {
                            Thread.sleep(TIME_OUT);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        double average = service.calculateAverageOfCollection(collection);
                        View.printAverage(Thread.currentThread().getName(), average);

                    }, "Thread #" + i));
        }

        for (Thread thread : runnables) {
            thread.start();
            thread.join(); // или вместо этого делаем методы класса View synchronized
        }
    }
}
