package home.chapter07genericandenum.task01notfrombook.engine;

import home.chapter07genericandenum.task01notfrombook.engine.Engine;

public class PetrolEngine extends Engine {

    private int engineCapacity;

    public PetrolEngine(int enginePower, int engineCapacity) {
        super(enginePower);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "PETROL" + super.toString() +
                "\nEngine capacity is " + this.engineCapacity;
    }
}
