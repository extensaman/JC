package home.chapter11thread.task59;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class CallableTask implements Callable<Result> {

    public static final int SIZE = 10;
    public static final int LOW_BOUND = 0;
    public static final int HIGH_BOUND = 100;
    public static final int MAX_SLEEP_TIME = 10000;
    public static final int MIN_SLEEP_TIME = 1000;

    @Override
    public Result call() {

        Random random = new Random();

        List<Integer> list = random.ints(SIZE, LOW_BOUND, HIGH_BOUND)
                .boxed()
                .collect(Collectors.toList());

        try {
            Thread.sleep(random.nextInt(MAX_SLEEP_TIME - MIN_SLEEP_TIME) + MIN_SLEEP_TIME);
        } catch (InterruptedException e) {
            return null;
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("\nPRINT FROM THREAD >> "
                + Thread.currentThread().getName()
                + "\nList = " + list
                + "\nSum = " + sum + '\n');

        return new Result(Thread.currentThread().getName(), Integer.toString(sum));
    }
}
