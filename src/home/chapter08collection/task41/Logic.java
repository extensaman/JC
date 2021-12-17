package home.chapter08collection.task41;

/**
 * Раздел "Коллекции"
 * Задание №41
 *
 * Часть 1
 * Создать список оценок учеников с помощью Arraylist, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 *
 * Часть 2
 * Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList.
 * Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз.
 * Замерьте время, которое потрачено на это.
 * Сравните результаты и предположите, почему они именно такие.
 *
 * Часть 3
 * * сделать тоже самое, только вставлять элементы не в конец а в середину списка.
 *
 * ** можно использовать паттерн стратгия
 *
 * @author Yusikau Aliaksandr
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logic {

    // Методы для реализации Части 1 задания

    public List<Integer> createListByRandom (int cellsCount) {

        List<Integer> list = new ArrayList<Integer>(cellsCount);
        for (int i = 0; i < cellsCount; i++) {

            int element = (int) (Math.random() * MagicNumbers.DEFAULT_MAX_MARK.getValue()) + 1;
            list.add(element);
        }

        return list;
    }

    public Integer searchMaximumMark(Entity entity) {

        List<Integer> list = entity.getList();
        if (list == null) {return null;}
        Integer max = list.get(0);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    // Методы для реализации Части 2 задания

    public long getTimeForSampleFromList (List<Integer> list, int count) {

        long l = System.nanoTime();

        for (int i = 0; i < count; i++) {

            list.get( (int) (Math.random() * list.size()) );
        }
        return System.nanoTime() - l;
    }

    public long getTimeForAddElementsToList (List<Integer> list, int count, int number, AddElementsBehavior behavior) {

        long l = System.nanoTime();

        behavior.addElements(list, count, number);

        return System.nanoTime() - l;
    }
}
