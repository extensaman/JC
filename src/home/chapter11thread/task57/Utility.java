package home.chapter11thread.task57;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Utility {

    public static final int BOUND = 100;

    private static Random random = new Random();

    private Utility() {}

    public static Queue<Integer> generateRandomQueue (int elementCount) {

        Queue<Integer> queue = new LinkedBlockingQueue<>();

        for (int i = 0; i < elementCount; i++) {
            queue.offer(generateRandomInteger());
        }

        return queue;
    }

    public static Integer generateRandomInteger() {
        return random.nextInt(BOUND) + 1;
    }
}
