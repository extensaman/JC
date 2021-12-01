package home.chapter01ifswitch.task11;

/**
Раздел "Операторы if/switch"
 * Задание №11
 *
 * Написать метод, который выводит расписание на неделю.
 * Задать на вход в метод порядковый номер дня недели и отобразить на экране то,
 * что запланировано на этот день.
 */

public class Runner {
    public static void main(String[] args) {

        WeekDiary weekDiary = new WeekDiary();

        weekDiary.writeNote(WeekDays.MONDAY);
        weekDiary.writeNote(WeekDays.SATURDAY);

        System.out.println(WeekDays.MONDAY.name + '\n' + weekDiary.readNote(WeekDays.MONDAY));
        System.out.println(WeekDays.FRIDAY.name + '\n' + weekDiary.readNote(WeekDays.FRIDAY));

        System.out.println(weekDiary);
    }
}
