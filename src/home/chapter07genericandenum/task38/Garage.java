package home.chapter07genericandenum.task38;

public class Garage <T extends Vehicle>{

    private T vehicle;

    public Garage (T vehicle) {
        this.vehicle = vehicle;
    }

    public void driveIntoGarage (T vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString(){

        return "There is a vehicle " + vehicle.toString() + " in garage " + super.toString();
    }
}
