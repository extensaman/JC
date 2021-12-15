package home.chapter07genericandenum.task01notfrombook.engine;

public class ElectricEngine extends Engine {

    private int batteryCount;

    public ElectricEngine(int enginePower, int batteryCount) {
        super(enginePower);
        this.batteryCount = batteryCount;
    }

    @Override
    public String toString() {
        return "ELECTRIC" + super.toString() +
                "\nBattery count is " + this.batteryCount;
    }
}
