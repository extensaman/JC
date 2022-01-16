package home.chapter11thread.task59;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Раздел "Пулы потоков. Асинхронные вычисления"
 * Задание №59
 *
 * Создать задачу CallaЬle, которая генерирует коллекцию из 1О рандомных целых
 * чисел -> засыпает произвольно на 1-10 секунд, результат выполнения - сумму этих
 * чисел в виде строки. Запустить 1О задач параллельно в пуле из 3 потоков. Вывести
 * ход программы на экран с указанием имени потока, который выполняет работу.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int POOL_CAPACITY = 3;
    public static final int TREADS_COUNT = 10;

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(POOL_CAPACITY);

        List<Future<Result>> futureList = createFutureList(service);

        while (futureList.size() > 0) {

            Iterator<Future<Result>> futureIterator = futureList.iterator();

            while (futureIterator.hasNext()) {
                Future<Result> result = futureIterator.next();

                if (result.isCancelled()) {
                    futureIterator.remove();
                    continue;
                }

                if (result.isDone()) {
                    try {
                        System.out.println(result.get());
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    futureIterator.remove();
                }

            }
        }

        System.out.println("\n\nAll threads finished\n\n");
        service.shutdown();

    }

    private static List<Future<Result>> createFutureList(ExecutorService service) {

        List<Future<Result>> futureList = new ArrayList<>();

        for (int i = 0; i < TREADS_COUNT; i++) {
            futureList.add(service.submit(new CallableTask()));
        }

        return futureList;
    }
}
