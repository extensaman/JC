package home.chapter12stream.task61;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Service {

    public List<Integer> createList (int size) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(i + 1);
        }

        return list;
    }

    public void printEvenInch (List<Integer> list,
                               Predicate<Integer> isEvenInchPredicate,
                               Consumer<Integer> printConsumer)
    {
        System.out.println("Четные значения дюймов:");

        for (Integer integer : list) {
            if (isEvenInchPredicate.test(integer)) {
                printConsumer.accept(integer);
            }

        }
    }

    public void printEvenInchInCm (List<Integer> list,
                                   Predicate<Integer> isEvenInchPredicate,
                                   Consumer<Double> printConsumer,
                                   Function<Integer, Double> fromInchToCmFunction
    ) {

        System.out.println("Четные значения дюймов, переведенные в сантиметры:");

        for (Integer integer : list) {
            if (isEvenInchPredicate.test(integer)) {
                printConsumer.accept(fromInchToCmFunction.apply(integer));
            }

        }
    }

    public void printSumOfCm (List<Integer> list,
                              Predicate<Integer> isEvenInchPredicate,
                              Consumer<Double> printConsumer,
                              Function<Integer, Double> fromInchToCmFunction
    ) {

        System.out.println("Сумма четных значений дюймов, переведенных в сантиметры:");

        double sum = 0.0;
        for (Integer integer : list) {
            if (isEvenInchPredicate.test(integer)) {
                sum += fromInchToCmFunction.apply(integer);
            }

        }
        printConsumer.accept(sum);
    }
}
