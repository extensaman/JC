package home.chapter09exception.task45;

public class Chislo <T extends Number>{

    private T t;

    public Chislo(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Chislo{" +
                "t=" + t +
                '}';
    }
}
