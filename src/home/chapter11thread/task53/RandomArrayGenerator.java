package home.chapter11thread.task53;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomArrayGenerator extends Thread{

    public static final int ARRAY_DEFAULT_SIZE = 10;
    public static final int LOW_RANDOM_LIMIT = 0;
    public static final int HIGH_RANDOM_LIMIT = 9;

    private int[] array;

    public RandomArrayGenerator(String threadName) {
        super (threadName);
    }
    @Override
    public void run() {

        array = new Random().ints(ARRAY_DEFAULT_SIZE, LOW_RANDOM_LIMIT, HIGH_RANDOM_LIMIT + 1).toArray();

        OptionalInt max = IntStream.of(array).max();
        if (max.isPresent()) {

            System.out.println(Thread.currentThread().getName()
                    + ": array is "
                    + Arrays.toString(array)
                    + ", max element is " + max.getAsInt());
        } else {
            System.out.println(Thread.currentThread().getName() + ": array is empty");
        }

    }
}
