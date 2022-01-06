package home.chapter12stream.task61;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Раздел "Lambda, Streams API"
 * Задание №61
 *
 * Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
 * - печатает на экран значения в дюймах
 * - переводит значения в сантиметры
 * - печатает на экран сумму в сантиметрах
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int ARRAY_SIZE = 20;
    public static final double INCH_TO_CM = 2.54;


    public static void main(String[] args) {

        Service service = new Service();

        List<Integer> list = service.createList(ARRAY_SIZE);

        Predicate<Integer> isEvenInchPredicate = x -> x % 2 == 0;
        Consumer<Integer> printIntegerConsumer = System.out::println;
        Consumer<Double> printDoubleConsumer = x -> System.out.printf("%.2f\n", x);
        Function<Integer, Double> fromInchToCmFunction = x -> x / INCH_TO_CM;

        service.printEvenInch(list,
                isEvenInchPredicate,
                printIntegerConsumer);

        service.printEvenInchInCm(
                list,
                isEvenInchPredicate,
                printDoubleConsumer,
                fromInchToCmFunction);

        service.printSumOfCm(
                list,
                isEvenInchPredicate,
                printDoubleConsumer,
                fromInchToCmFunction);
    }

}
