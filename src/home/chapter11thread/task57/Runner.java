package home.chapter11thread.task57;

import java.util.HashSet;
import java.util.Set;

/**
 * Раздел "Взаимодействие потоков. Producer - Consumer"
 * Задание №57
 *
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все
 * одновременно. Есть очередь с 200 элементами. Производители добавляют
 * случайное число от 1 .. 100, а потребители берут эти числа. Если в очереди
 * элементов>= 100 производители спят, если нет элементов в очереди - потребители
 * спят. Если элементов стало <= 80, производители просыпаются. Все это работает до
 * тех пор, пока обработанных элементов не станет 10000, только потом программа
 * завершается.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int PRODUCERS_COUNT = 3;
    public static final int CONSUMERS_COUNT = 2;
    public static final int DEFAULT_ELEMENT_COUNT = 100;
    public static final int OPERATIONS_COUNT_LIMIT = 10_000;
    public static final String PRODUCER_NAME = "Producer #";
    public static final String CONSUMER_NAME = "Consumer #";

    public static void main(String[] args) {

        Store store = new Store(Utility.generateRandomQueue(DEFAULT_ELEMENT_COUNT), new Object());
        Set<Thread> threadList = new HashSet<>();

        for (int i = 0; i < PRODUCERS_COUNT; i++) {
            threadList.add(new Thread(new Producer(store), PRODUCER_NAME + i));
        }

        for (int i = 0; i < CONSUMERS_COUNT; i++) {
            threadList.add(new Thread(new Consumer(store), CONSUMER_NAME + i));
        }

        System.out.println("Threads are starting...");
        for (Thread thread : threadList) {
            thread.start();
        }

        System.out.println("Threads started.");
        while (store.getOperationsCount() < OPERATIONS_COUNT_LIMIT){}


        System.out.println("Threads are interrupting...");
        for (Thread thread : threadList) {
            thread.interrupt();
        }
    }
}
