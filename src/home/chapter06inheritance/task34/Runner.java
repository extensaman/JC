package home.chapter06inheritance.task34;

/**
 * Раздел "Наследование и полиморфизм. Внутренние и
 * анонимные классы"
 * Задание №34
 *
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * должностную структуру на заводе. Реализовать методы по начислению зарплаты в
 * зависимости от должности (почасовая, процентная, смешанная). Иерархия должна
 * иметь хотя бы три уровня.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {

        Employee director = new Director();
        director.printWage();

        Employee hrManager = new HrManager();
        hrManager.printWage();

        Employee designer = new Designer();
        designer.printWage();
    }
}
