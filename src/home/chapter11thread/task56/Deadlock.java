package home.chapter11thread.task56;

public class Deadlock {

    private final One one = new One();
    private final Two two = new Two();
    private final Three three = new Three();

    public Deadlock() {

        Thread t1 = new Thread(() -> one.heavyJob(two));
        Thread t2 = new Thread(() -> two.anotherJob(three));
        t1.start();
        t2.start();
        three.incredibleJob(one);
    }
}
