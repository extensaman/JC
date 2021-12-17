package home.chapter08collection.task39;

import home.chapter08collection.task39.entity.Klass;
import home.chapter08collection.task39.logic.Controller;
import home.chapter08collection.task39.misc.MagicNumbers;

/**
 * Раздел "Коллекции"
 * Задание №39
 *
 * Создать список оценок учеников с помощью Arraylist, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {

        Controller controller = new Controller();
        Klass klass = new Klass(controller.createPupilsList());
        System.out.println(klass);

        controller.deleteBadPupilsMarksInKlass(klass, MagicNumbers.MINIMUM_MARK.getValue());
        System.out.println("-= Произведено удаление неудовлетворительных оценок =-");
        System.out.println(klass);

        controller.sortKlassByAverageMark(klass);
        System.out.println("-= Произведена сортировка студентов по успеваемости =-");
        System.out.println(klass);
    }
}
