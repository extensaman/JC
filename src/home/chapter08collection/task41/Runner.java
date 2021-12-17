package home.chapter08collection.task41;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
 * * сделать тоже самое, только вставлять элементы не в конец а в середину списка.
 * ** можно использовать патерн стратгия
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        Logic logic = new Logic();

        // Часть 1

        List<Integer> list = logic.createListByRandom(MagicNumbers.DEFAULT_MARKS_COOUNT.getValue());

        Entity entity00 = new Entity(list);

        System.out.println(entity00);
        Integer result = logic.searchMaximumMark(entity00);
        System.out.println("Maximum mark is " + ((result == null) ? "not founded" : result));

        // Часть 2

        AddElementsBehavior addingToEnd = new AddElementsBehavior() {
            @Override
            public void addElements(List<Integer> list, int count, int number) {

                for (int i = 0; i < count; i++) {
                    list.add(number);
                }
            }
        };

        AddElementsBehavior addingToMiddle = new AddElementsBehavior() {
            @Override
            public void addElements(List<Integer> list, int count, int number) {
                list.add(number);
                for (int i = 0; i < count - 1; i++) {
                    list.add(1, number);
                }
            }
        };

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Вставляем МНОГО элементов в конец ArrayList-a
        long arrayListAddingTimeToEnd = logic.getTimeForAddElementsToList(arrayList,
                MagicNumbers.DEFAULT_ADDING_COUNT.getValue(),
                MagicNumbers.DEFAULT_VALUE_FOR_INSERT.getValue(),
                addingToEnd);

        System.out.println("Вставка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                        " элементов в конец ArrayList происходит за " + arrayListAddingTimeToEnd + " наносекунд");

        // Вставляем МНОГО элементов в конец LinkedList-a
        long linkedListAddingTimeToEnd = logic.getTimeForAddElementsToList(linkedList,
                MagicNumbers.DEFAULT_ADDING_COUNT.getValue(),
                MagicNumbers.DEFAULT_VALUE_FOR_INSERT.getValue(),
                addingToEnd);

        System.out.println("Вставка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                " элементов в конец LinkedList происходит за " + linkedListAddingTimeToEnd + " наносекунд");

        arrayList.clear();
        linkedList.clear();

        // Вставляем МНОГО элементов в середину ArrayList-a
        // Большое время обусловлено необходимостью последовательного смещения на одну ячейку вправо
        // всех элементов, расположенных правее от вставлямого места
        long arrayListAddingTimeToMiddle = logic.getTimeForAddElementsToList(arrayList,
                MagicNumbers.DEFAULT_ADDING_COUNT.getValue(),
                MagicNumbers.DEFAULT_VALUE_FOR_INSERT.getValue(),
                addingToMiddle);

        System.out.println("Вставка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                " элементов в середину ArrayList происходит за " + arrayListAddingTimeToMiddle + " наносекунд");

        // Вставляем МНОГО элементов в середину LinkedList-a
        long linkedListAddingTimeToMiddle = logic.getTimeForAddElementsToList(linkedList,
                MagicNumbers.DEFAULT_ADDING_COUNT.getValue(),
                MagicNumbers.DEFAULT_VALUE_FOR_INSERT.getValue(),
                addingToMiddle);

        System.out.println("Вставка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                " элементов в середину LinkedList происходит за " + linkedListAddingTimeToMiddle + " наносекунд");

        // Выбираем МНОГО элементов (случайным образом) из ArrayList-a
        long arrayListSampleTimeFromList = logic.getTimeForSampleFromList(arrayList, MagicNumbers.DEFAULT_SAMPLE_SIZE.getValue());

        System.out.println("Выборка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                " элементов (в случайном порядке) из ArrayList происходит за " + arrayListSampleTimeFromList + " наносекунд");

        // Выбираем МНОГО элементов (случайным образом) из LinkedList-a
        // Большое время в LinkedList обусловлено бОльшими временными затратами на итерации по переходу от начала списка до требуемого элемента
        // Асимтота данной операции равна О(m), где m - это удаленность (в элементах) требуемого элемента от начала списка
        // В ArrayList-е асимптота перехода к требуемому элементу равна O(1)
        long linkedListSampleTimeFromList = logic.getTimeForSampleFromList(linkedList, MagicNumbers.DEFAULT_SAMPLE_SIZE.getValue());

        System.out.println("Выборка " + MagicNumbers.DEFAULT_ADDING_COUNT.getValue() +
                " элементов (в случайном порядке) из LinkedList происходит за " + linkedListSampleTimeFromList + " наносекунд");
    }
}
