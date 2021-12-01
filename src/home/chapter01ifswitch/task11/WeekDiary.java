package home.chapter01ifswitch.task11;

import java.util.Scanner;

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

public class WeekDiary {

    public static final int WEEK_LENGTH = 7;
    private Day[] shedule = new Day[WEEK_LENGTH];

    {
        for (int i = 0; i < shedule.length; i++) {
            shedule[i] = new Day ("пусто");
        }
    }
    public void writeNote (WeekDays day) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите запись на " + day.name);
        String s = sc.nextLine();
        shedule[day.id].setInfo(s);
    }

    public Day readNote (WeekDays day) {

        return shedule[day.id];
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer("\nРасписание на неделю:\n");
        WeekDays[] weekDays = WeekDays.values();

        for (int i = 0; i < shedule.length; i++) {
            str.append(weekDays[i].name).append('\n');
            str.append(shedule[i]).append("\n\n");
        }

        return str.toString();
    }
}
