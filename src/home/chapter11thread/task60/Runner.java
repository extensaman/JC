package home.chapter11thread.task60;

import home.chapter11thread.task60.writter.MyWriter;

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
 * Задание №60
 *
 * Создать задачу Callable, которая берет сообщение "Hello World" + текущее
 * время и записывает его в файл. Запись в файл должна производиться
 * последовательно через синхронизированный метод. Запустить 10 задач
 * параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием
 * имени потока, который выполняет работу.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final String FILE_NAME = "d:/task60.txt";
    public static final String MESSAGE = "Hello, World!!!";
    public static final int THREAD_COUNT = 10;
    public static final int POOL_SIZE = 3;

    public static void main(String[] args) {

        MyWriter writter = new MyWriter(FILE_NAME);

        try {
            writter.openFile();
        } catch (Exception e) {
            System.out.println("Error while opening file " + FILE_NAME);
            return;
        }

        List<CallableTask> callableList = Stream.generate(() -> new CallableTask(writter, MESSAGE))
                .limit(THREAD_COUNT)
                .collect(Collectors.toList());

        ExecutorService service = Executors.newFixedThreadPool(POOL_SIZE);
        List<Future<String>> futureList = null;

        try {
            futureList = service.invokeAll(callableList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (futureList != null) {
            getFuture(futureList);
            System.out.println("\nAll tasks have been completed\n");
        } else {
            System.out.println("FutureList is null");
        }

        service.shutdown();
        writter.closeFile();
    }

    private static void getFuture(List<Future<String>> futureList) {

        while (futureList.size() > 0) {

            Iterator<Future<String>> iterator = futureList.iterator();

            while (iterator.hasNext()) {

                Future<String> future = iterator.next();

                if (future.isCancelled()) {
                    iterator.remove();
                    continue;
                }

                if (future.isDone()) {
                    try {
                        System.out.println(future.get());
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                    iterator.remove();
                }
            }
        }
    }
}
