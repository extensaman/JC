package home.chapter07genericandenum.task01notfrombook;

import home.chapter07genericandenum.task01notfrombook.engine.Engine;

public class Car <T extends Engine> {

    private T engineType;
    private String name;

    public Car(T engineType, String name) {
        this.engineType = engineType;
        this.name = name;
    }

    public T getEngineType() {
        return engineType;
    }

    public void changeEngine (T newEngine) {
        this.engineType = newEngine;
    }

    public Car<Engine> dublicateCar() {
        return (Car<Engine>)this.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                "\nName='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() {
        return new Car<Engine>(this.engineType, this.name);
    }
}
