package home.chapter11thread.task55;

public class SyncEntity implements Runnable{

    public static final int MILLIS = 2000;
    private final Object lock;

    public SyncEntity(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            System.out.println(Thread.currentThread().getName() + " falls asleep");
            try {
                Thread.sleep(MILLIS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " woke up");
        }

    }
}
