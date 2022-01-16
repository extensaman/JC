package home.chapter11thread.task58;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Раздел "Пулы потоков. Асинхронные вычисления"
 * Задание №58
 *
 * Создать задачу Callable, которая генерирует 1О файлов с 1О произвольными
 * строками -> засыпает произвольно на 1-З секунды, результат выполнения -
 * коллекция имен файлов. Запустить 1О задач параллельно в пуле из 3 потоков.
 * Вывести ход программы на экран с указанием имени потока, который выполняет
 * работу.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int POOL_CAPACITY = 3;
    public static final int TASK_COUNT = 10;

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(POOL_CAPACITY);
        List<Future<Result>> futureList = null;

        try {
            futureList = service.invokeAll(Stream.generate(CallableTask::new).limit(TASK_COUNT).collect(Collectors.toList()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (futureList.size() > 0) {

            Iterator<Future<Result>> iterator = futureList.iterator();

            while (iterator.hasNext()) {

                Future<Result> resultFuture = iterator.next();

                if (resultFuture.isCancelled()) {
                    iterator.remove();
                    continue;
                }

                if (resultFuture.isDone()) {

                    Result result = null;

                    try {
                        result = resultFuture.get();
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }

                    System.out.println(result);

                    iterator.remove();
                }
            }
        }
        System.out.println("\nAll tasks have being done\n");
        service.shutdown();

    }
}
