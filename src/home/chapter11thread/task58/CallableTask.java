package home.chapter11thread.task58;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Result> {

    public static final int MAX_SLEEP_TIME = 3000;
    public static final int MIN_SLEEP_TIME = 1000;
    public static final int FILES_COUNT = 10;

    @Override
    public Result call() {

        List<String> list = null;

        try {
            list = Utility.createFilesWithRandomString(Thread.currentThread().getName(), FILES_COUNT);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(MAX_SLEEP_TIME - MIN_SLEEP_TIME) + MIN_SLEEP_TIME);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("\nPRINT FROM THREAD >> "
                + Thread.currentThread().getName()
                + "\nList = " + list + '\n');

        return new Result(Thread.currentThread().getName(), list);
    }
}
