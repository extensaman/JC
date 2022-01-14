package home.chapter11thread.task57;

public class Producer implements Runnable{

    private final Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run(){

        while(!Thread.currentThread().isInterrupted()) {
            store.put();
        }
    }
    
}
