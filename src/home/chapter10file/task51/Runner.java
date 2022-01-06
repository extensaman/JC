package home.chapter10file.task51;

/**
 * Раздел "Работа с файлами"
 * Задание №51
 *
 * Создать объект Person с полями name, surname, age. Сгенерировать 1О
 * объектов класса Person со случайными полями соответствующего типа. С помощью
 * Java создать файл, в который запишется информация о этих людях.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

import home.chapter10file.task51.controller.Controller;
import home.chapter10file.task51.service.Service;

public class Runner {

    public static final int PERSON_COUNT = 10;
    public static final String FILE_PATH = "d:/personObjectTest.txt";
    public static final int SURNAME_LENGTH = 6;
    public static final int NAME_LENGTH = 6;
    public static final int LOW_AGE_LIMIT = 18;
    public static final int HIGH_AGE_LIMIT = 60;

    public static void main(String[] args) {

        Controller controller = new Controller(new Service());

        controller.perform(
                PERSON_COUNT,
                FILE_PATH,
                SURNAME_LENGTH,
                NAME_LENGTH,
                LOW_AGE_LIMIT,
                HIGH_AGE_LIMIT);
    }
}
