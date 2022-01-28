package home.chapter11thread.task55;

/**
 * Раздел "Взаимодействие потоков. Producer - Consumer"
 * Задание №55
 *
 * Создать метод, который печатает название потока и засыпает на 2 секунды.
 * Запустить одновременно 1О потоков. Реализовать механизм синхронизации, чтобы
 * все потоки выполнились последовательно.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int THREAD_COUNT = 10;

    public static void main(String[] args) {

        final Object lock = new Object();

        for (int i = 0; i < THREAD_COUNT; i++) {
            new Thread(new SyncEntity(lock)).start();
        }
    }
}
