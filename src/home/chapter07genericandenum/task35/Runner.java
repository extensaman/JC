package home.chapter07genericandenum.task35;

/**
 * Раздел "Generics и Enum"
 * Задание №35
 *
 * Создать eпum, который описывает сезоны года. Добавить поле description в
 * этот enum. Добавить поле couпtOfDays в этот enum. Вывести на экран все константы
 * сезоны года.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {

    public static void main(String[] args) {

        for (Seasons season : Seasons.values()) {
            System.out.println("\nИмя константы: " + season.toString() +
                    "\nКоличество дней: " + season.getCountOfDays() +
                    "\nОписание сезона: " + season.getDescription());
        }

    }
}
