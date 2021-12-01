package home.chapter04classes.task24;

/**
 * Раздел "Классы и объекты"
 * Задание №24
 *
 * Создать класс описывающий промежуток времени. Сам премежуток в классе
 * должен задаваться тремя свойствами: секунда минутами, часами. Сделать
 * методы для получения полного количества секунд в объекте, сравнения двух
 * объектов (метод должен работать аналогично compareTo в строках).
 * Создать два конструктора:
 * • получающий общее количество секунд
 * • получающий часы, минуты и секунды по отдельности.
 * Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */

public class Runner {

    public static void main(String[] args) {

        TimePeriod timePeriod01 = new TimePeriod(1,1,1);
        System.out.println(timePeriod01);

        TimePeriod timePeriod02 = new TimePeriod(3662);
        System.out.println(timePeriod02);

        System.out.println(timePeriod01.compareTo(timePeriod02));
    }
}
