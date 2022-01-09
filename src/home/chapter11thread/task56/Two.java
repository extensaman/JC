package home.chapter11thread.task56;

public class Two {

    synchronized void anotherJob(Three three) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Перед вызовом three.calculateThree() класса Two");
        three.calculateThree();
        System.out.println("После вызова three.calculateThree() класса Two");
    }

    synchronized void calculateTwo() {
        System.out.println("Calculate Two");
    }
}
