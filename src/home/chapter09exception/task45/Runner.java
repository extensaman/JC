package home.chapter09exception.task45;

/**
 * Раздел "Исключения"
 * Задание №45
 *
 * Написать метод, который будет возбуЖДать исключение и обработать это
 * исключение на уровне выше. Результат работы программы вывести на экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Chislo<Integer> ch01 = new Chislo<>(10);
        Chislo<Integer> ch02 = new Chislo<>(20);

        SpecificCalculator calculator01 = new SpecificCalculator(ch01, ch02);

        try {
            System.out.println(calculator01.calculateDivide());
        }
        catch (Exception e) {
            System.out.println("Exception " + e + " catched in Runner::main");
        }

        Chislo<Integer> ch03 = new Chislo<>(100);
        Chislo<Integer> ch04 = new Chislo<>(0);

        SpecificCalculator calculator02 = new SpecificCalculator(ch03, ch04);

        try {
            System.out.println(calculator02.calculateDivide());
        }
        catch (Exception e) {
            System.out.println("Exception " + e + " catched in Runner::main");
        }

    }
}
