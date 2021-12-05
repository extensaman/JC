package home.chapter07genericandenum.task38;

import java.util.Scanner;

/**
 * Раздел "Generics и Enum"
 * Задание №38
 *
 * Создать классы Саr и Motorcycle, которые наследуются от общего класса
 * Vehicle. Создать поле name в классе Vehicle и проинициализировать его через
 * конструктора. Создать geneгic класс Garage, который может хранить только объекты
 * типа наследуемого от Vehicle. Создать 2 объекта класса Gaгage (все поля ввести с
 * клавиатуры) и вывести на экран имя хранимого транспортного средства.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        String name;

        System.out.println("Enter a name of the car: ");
        name = enterVehicleName();
        Vehicle car = new Car(name);

        System.out.println("Enter a name of the motorcycle: ");
        name = enterVehicleName();
        Vehicle bike = new Motorcycle(name);

        Garage<Vehicle> vehicleGarage01 = new Garage<>(car);
        System.out.println(vehicleGarage01);

        Garage<Vehicle> vehicleGarage02 = new Garage<>(bike);
        System.out.println(vehicleGarage02);
    }

    public static String enterVehicleName(){

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
