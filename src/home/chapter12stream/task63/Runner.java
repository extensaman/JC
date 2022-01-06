package home.chapter12stream.task63;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Раздел "Lambda & Stream API"
 * Задание №63
 *
 * Сгенерируйте List коллекцию целых числе из n элементов от
 * minValue до maxValue. Определить, содержатся ли в данной коллекции
 * числа, которые делятся и на 3 и на 5 с помощью Stream
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static final int SIZE = 100;
    public static final int MIN_VALUE = -100;
    public static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        List<Integer> list = new Random().ints(MIN_VALUE, MAX_VALUE)
                .limit(SIZE)
                .peek(System.out::println)
                .filter(x -> x % 3 == 0 && x % 5 == 0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Делятся на 3 и на 5: " + list);

    }
}
