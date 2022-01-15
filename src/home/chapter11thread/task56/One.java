package home.chapter11thread.task56;

public class One {

    public synchronized void heavyJob (Two two) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Перед вызовом two.calculateTwo() класса One");
        two.calculateTwo();
        System.out.println("После вызова two.calculateTwo() класса One");
    }
    public synchronized void calculateOne() {
        System.out.println("Calculate One");
    }
}
