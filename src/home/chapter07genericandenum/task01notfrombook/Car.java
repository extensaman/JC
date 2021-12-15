package home.chapter07genericandenum.task01notfrombook;

import home.chapter07genericandenum.task01notfrombook.engine.Engine;

public class Car <T extends Engine> {

    private T engineType;
    private String name;

    public Car(T engineType, String name) {
        this.engineType = engineType;
        this.name = name;
    }

    public void changeEngine (T newEngine) {
        this.engineType = newEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType=" + engineType +
                "\nName='" + name + '\'' +
                '}';
    }
}
