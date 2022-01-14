package home.chapter11thread.task57;

public class Consumer implements Runnable{

    private final Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run(){

        while(!Thread.currentThread().isInterrupted()) {
            store.get();
        }
    }
}
