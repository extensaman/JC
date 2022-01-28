package home.chapter11thread.task54;

/**
 * Раздел "Класс Thread и интерфейс RunnaЫe"
 * Задание №54
 *
 * Создать класс поток, который создает средствами Java файл и записать в него
 * произвольно сгенерированный массив из 1О случайных целых чисел. Запустить 5
 * потоков.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int THREAD_DEFAULT_COUNT = 10;
    public static final String FILE_PATH_SAMPLE = "d:/fileWorkerThread";
    public static final String FILE_PATH_SAMPLE_EXTENSION = ".ppp";


    public static void main(String[] args) {

        for (int i = 0; i < THREAD_DEFAULT_COUNT; i++) {

            new FileWorkerThread("Thread #" + i, FILE_PATH_SAMPLE + i + FILE_PATH_SAMPLE_EXTENSION).start();

        }
    }
}
