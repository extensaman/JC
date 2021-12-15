package home.chapter07genericandenum.task01notfrombook.engine;

public class DieselEngine extends Engine {

    private int engineCapacity;

    public DieselEngine(int enginePower, int engineCapacity) {
        super(enginePower);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "DIESEL" + super.toString() +
                            "\nEngine capacity is " + this.engineCapacity;
    }
}
