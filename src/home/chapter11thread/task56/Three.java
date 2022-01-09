package home.chapter11thread.task56;

public class Three {

    synchronized void incredibleJob (One one) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Перед вызовом one.calculateOne() класса Three");
        one.calculateOne();
        System.out.println("После вызова one.calculateOne() класса Three");
    }
    synchronized void calculateThree() {
        System.out.println("Calculate Three");
    }

}
