package home.chapter11thread.task57;

import java.util.Queue;
import java.util.Random;

public class Store {

    public static final int LIMIT_FOR_PRODUCERS = 100;
    public static final int LIMIT_FOR_CONSUMERS = 1;
    public static final int WAKE_UP_FOR_PRODUCERS = 10;

    private final Queue<Integer> queque;
    private volatile Random random;
    private volatile int operationsCount;

    private volatile Object lock;

    public Store(Queue<Integer> queque, final Object lock) {
        this.queque = queque;
        this.lock = lock;
        this.random = new Random();
        this.operationsCount = 0;
    }

    public int getOperationsCount() {
        return operationsCount;
    }

    public void put() {

        synchronized (lock) {

            int queueSize = queque.size();
            if (queueSize >= LIMIT_FOR_PRODUCERS || queueSize <= WAKE_UP_FOR_PRODUCERS) {

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
            int putElement = Utility.generateRandomInteger();
            queque.offer(putElement);
            operationsCount++;
            System.out.println("    >>> " + Thread.currentThread().getName() + " PUTTED " + putElement + ", Queue size = " + queque.size() + ", operations count = " + operationsCount);
            lock.notify();
        }
    }

    public void get() {

        synchronized (lock) {
            int queueSize = queque.size();
            if (queueSize < LIMIT_FOR_CONSUMERS) {

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }

            Integer getElement = queque.poll();
            operationsCount++;
            System.out.println("<<<     " + Thread.currentThread().getName() + " GETTED " + getElement + ", Queue size = " + queque.size() + ", operations count = " + operationsCount);
            lock.notify();
        }
    }
}
