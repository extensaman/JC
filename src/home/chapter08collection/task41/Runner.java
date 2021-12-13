package home.chapter08collection.task41;

import java.util.List;

/**
 * Раздел "Коллекции"
 * Задание №41
 *
 * Создать список оценок учеников с помощью Arraylist, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Logic logic = new Logic();
        List<Integer> list = logic.createListByRandom(MagicNumbers.DEFAULT_MARKS_COOUNT.getMark());
        Entity entity = new Entity(list);

        System.out.println(entity);
        Integer result = logic.searchMaximumMark(entity);
        System.out.println("Maximum mark is " + ((result == null) ? "not founded" : result));

    }
}
