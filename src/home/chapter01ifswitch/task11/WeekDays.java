package home.chapter01ifswitch.task11;

public enum WeekDays {
    MONDAY (0, "ПОНЕДЕЛЬНИК"),
    TUESDAY (1, "ВТОРНИК"),
    WENSDAY (2, "СРЕДА"),
    THUSDAY (3, "ЧЕТВЕРГ"),
    FRIDAY (4, "ПЯТНИЦА"),
    SATURDAY (5, "СУББОТА"),
    SUNDAY (6, "ВОСКРЕСЕНЬЕ");

    int id;
    String name;

    WeekDays(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
