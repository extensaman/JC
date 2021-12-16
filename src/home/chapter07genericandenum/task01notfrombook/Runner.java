package home.chapter07genericandenum.task01notfrombook;

import home.chapter07genericandenum.task01notfrombook.engine.DieselEngine;
import home.chapter07genericandenum.task01notfrombook.engine.ElectricEngine;
import home.chapter07genericandenum.task01notfrombook.engine.Engine;
import home.chapter07genericandenum.task01notfrombook.engine.PetrolEngine;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Раздел "Generics и Enum"
 * Задание №01 (не из книги) - домашнее задание 14.12.2021
 *
 * Создать класс двигатель. У него есть три дочерних класса, Бензиновый двигатель,
 * Дизельный двигатель и Электрический двигатель с произвольными полями.
 * Создать класс машина, в котором тип двигателя сделать через Generic.
 * В основной программе создать три машины с различными типами двигателя.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Car<Engine> dieselEngineCar = new Car<Engine>(new DieselEngine(1200, 2500), "Renault");
        System.out.println(dieselEngineCar);

        Car<Engine> petrolEngineCar = new Car<Engine>(new PetrolEngine(1100, 1800), "Lada");
        System.out.println(petrolEngineCar);

        Car<Engine> electricEngineCar = new Car<Engine>(new ElectricEngine(2000, 290), "Tesla");
        System.out.println(electricEngineCar);

        Car<Engine> dieselEngineCar02 = dieselEngineCar.dublicateCar();
        System.out.println(dieselEngineCar02);

        // Работа с Generic-классом в коллекциях (с ипользованием Stream API)
        List<Car<Engine>> cars = new ArrayList<Car<Engine>>();
        cars.addAll(Arrays.asList(dieselEngineCar, petrolEngineCar, electricEngineCar, dieselEngineCar02));
        List<Car<Engine>> notDieselCars = cars.stream().filter(car -> car.getEngineType().getClass() != DieselEngine.class).collect(Collectors.toList());
        System.out.println("\nНе дизельные машины:");
        System.out.println(notDieselCars);
    }
}
