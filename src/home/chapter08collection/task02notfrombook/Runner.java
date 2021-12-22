package home.chapter08collection.task02notfrombook;

import home.chapter08collection.task02notfrombook.model.HeavyBox;
import home.chapter08collection.task02notfrombook.service.ArrayMakingBehavior;
import home.chapter08collection.task02notfrombook.service.HeavyBoxService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Раздел "Коллекции"
 * Задание №02 (не из пособия)
 *
 * Создать коллекцию, содержащую объекты класса HeavyBox(два поля размер и вес).
 * б) Распечатать его содержимое используя for each.
 * в) Изменить вес первого ящика на 1.
 * г) Удалить последний ящик.
 * д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
 * е) Удалить все ящики.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        HeavyBoxService service = new HeavyBoxService();

        List<HeavyBox> boxList = new ArrayList<>();

        HeavyBox box01 = service.getHeavyBox(10.5,9.67);
        service.addHeavyBoxToList(boxList, box01);

        HeavyBox box02 = service.getHeavyBox(15.5,110.47);
        service.addHeavyBoxToList(boxList, box02);

        HeavyBox box03 = service.getHeavyBox(10.2,130.68);
        service.addHeavyBoxToList(boxList, box03);

        HeavyBox box04 = service.getHeavyBox(0.8,0.27);
        service.addHeavyBoxToList(boxList, box04);

        // б) Распечатать его содержимое используя for each.
        service.printHeavyBoxList(boxList);

        // в) Изменить вес первого ящика на 1.
        service.changeFirstElementWeight(boxList, 0.15678);
        service.printHeavyBoxList(boxList);

        // г) Удалить последний ящик.
        service.deleteLastListElement(boxList);
        service.printHeavyBoxList(boxList);

        // д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        // Вариант №1
        service.printHeavyBoxArray(e -> e.toArray(new HeavyBox[0]), boxList);

        // д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        // Вариант №2
        ArrayMakingBehavior arrayMakingBehavior01 = new ArrayMakingBehavior() {
            @Override
            public HeavyBox[] getArray(List<HeavyBox> list) {

                HeavyBox[] array = new HeavyBox[list.size()];
                Iterator<HeavyBox> iterator = list.iterator();
                int i = 0;
                while (iterator.hasNext()) {
                    array[i++] = iterator.next();
                }

                return array;
            }
        };

        service.printHeavyBoxArray(arrayMakingBehavior01, boxList);

        // д) Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
        // Вариант №3
        ArrayMakingBehavior arrayMakingBehavior02 = new ArrayMakingBehavior() {
            @Override
            public HeavyBox[] getArray(List<HeavyBox> list) {

                HeavyBox[] array = new HeavyBox[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    array[i] = list.get(i);
                }
                return array;
            }
        };

        service.printHeavyBoxArray(arrayMakingBehavior02, boxList);

        // е) Удалить все ящики.
        service.clearList(boxList);
        service.printHeavyBoxList(boxList);
    }
}
