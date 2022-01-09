package home.chapter12stream.task62;


/**
 * Раздел "Lambda & Stream API"
 * Задание №62
 *
 * Создать класс Person с полями name, surname, age.
 * Сгенерировать 100 человек в возрасте от 15 до 30 лет.
 * Написать ОДНУ НЕПРЕРЫВНУЮ цепочку stream, которая
 * - выбирает объекты, возраст которых < 21
 * - распечатывает их ан экран
 * - сортирует по фамилии, а потом по имени (с использоваием thenComparing)
 * - берет 4 первых объекта
 * - формирует коллекцию из фамилий объектов
 * - агрегирует все в коллекцию
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

import home.chapter12stream.task62.controller.Controller;
import home.chapter12stream.task62.service.Service;

public class Runner {

    public static final int PERSON_COUNT = 100;
    public static final int SURNAME_LENGTH = 6;
    public static final int NAME_LENGTH = 6;
    public static final int LOW_AGE_LIMIT = 15;
    public static final int HIGH_AGE_LIMIT = 30;
    public static final int AGE_LIMIT_FOR_STREAM = 21;
    public static final int PERSON_COUNT_LIMIT_FOR_STREAM = 4;

    public static void main(String[] args) {

        Controller controller = new Controller(new Service());

        controller.perform(
                PERSON_COUNT,
                SURNAME_LENGTH,
                NAME_LENGTH,
                LOW_AGE_LIMIT,
                HIGH_AGE_LIMIT,
                AGE_LIMIT_FOR_STREAM,
                PERSON_COUNT_LIMIT_FOR_STREAM);

    }
}
