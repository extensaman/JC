package home.chapter07genericandenum.task01notfrombook.engine;

public class Engine {

    private int enginePower;

    public Engine(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    @Override
    public String toString() {
        return "\nEngine power is " + enginePower;
    }
}
