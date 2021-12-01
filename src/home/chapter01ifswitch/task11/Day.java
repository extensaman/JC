package home.chapter01ifswitch.task11;

/**
 * Раздел "Операторы if/switch"
 * Задание №11
 *
 * Написать метод, который выводит расписание на неделю.
 * Задать на вход в метод порядковый номер дня недели и отобразить на экране то,
 * что запланировано на этот день.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Day {

    private String info;

    public Day(String info) {
        this.info = info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {

            return "Запись:\n" + info;
    }
}
