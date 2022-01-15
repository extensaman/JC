package home.chapter11thread.task57;

import java.util.Queue;

public class Store {

    private static final class Lock {}

    private final Object lock = new Lock();

    public static final int LIMIT_FOR_PRODUCERS = 100;
    public static final int LIMIT_FOR_CONSUMERS = 1;
    public static final int WAKE_UP_FOR_PRODUCERS = 80;

    private final Queue<Integer> queue;
    private volatile int operationsCount;

    public Store(Queue<Integer> queue) {
        this.queue = queue;
        this.operationsCount = 0;
    }

    public int getOperationsCount() {
        return operationsCount;
    }

    public boolean put() {

        synchronized (lock) {

            while (queue.size() >= WAKE_UP_FOR_PRODUCERS) {

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    return false;
                }

            }
            int putElement = Utility.generateRandomInteger();
            queue.add(putElement);
            operationsCount++;
            System.out.println("    >>> " + Thread.currentThread().getName() + " PUTTED " + putElement + ", Queue size = " + queue.size() + ", operations count = " + operationsCount);
            lock.notifyAll();
            return true;
        }

    }

    public boolean get() {

        synchronized (lock) {

            while (queue.size() < LIMIT_FOR_CONSUMERS) {

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }

            Integer getElement = queue.poll();
            operationsCount++;
            System.out.println("<<<     " + Thread.currentThread().getName() + " GETTED " + getElement + ", Queue size = " + queue.size() + ", operations count = " + operationsCount);
            if (queue.size() <= WAKE_UP_FOR_PRODUCERS) {
                lock.notifyAll();
            }
            return true;
        }
    }
}
