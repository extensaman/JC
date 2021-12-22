package home.chapter08collection.task01notfrombook;

import home.chapter08collection.task01notfrombook.entity.Element;
import home.chapter08collection.task01notfrombook.entity.Text;
import home.chapter08collection.task01notfrombook.logic.EntityBehavior;
import home.chapter08collection.task01notfrombook.logic.Logic;

import java.util.Set;

/**
 * Раздел "Коллекции"
 * Задание №01 (не из пособия)
 *
 * Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
 * Избавиться от повторяющихся элементов в строке и вывести результат на экран.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        EntityBehavior behavior = new Logic();
        Text text = behavior.getText();
        Set<Element> set = behavior.createSet(text);
        behavior.printElements(set);
    }
}
