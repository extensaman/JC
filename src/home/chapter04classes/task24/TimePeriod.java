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

public class TimePeriod implements Comparable <TimePeriod>{

    private int hour;
    private int minute;
    private int second;

    public TimePeriod (int time) {

        if (time < 0) time = 0;

        this.second = time % 60;
        time /= 60;
        this.minute = time % 60;
        this.hour = time / 60;

    }

    public TimePeriod (int hour, int minute, int second) {

        if (hour < 0) hour = 0;
        if (minute < 0) minute = 0;
        if (second < 0) second = 0;

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getSeconds () {

        return second + 60 * minute + 3600 * hour;
    }

    @Override
    public int compareTo (TimePeriod obj) {

        return this.getSeconds() - obj.getSeconds();
    }

    @Override
    public String toString() {
        return getClass().getName() + ", hash = " + this.hashCode() + "\nHours = " + hour + "\nMinutes = " + minute + "\nSeconds = " + second;
    }

    @Override
    public boolean equals (Object o) {

        if (o == this) {
            return true;
        }

        TimePeriod obj = (TimePeriod) o;
        if (obj == null && this.getClass() != obj.getClass()) {
            return false;
        }

        return (this.getSeconds() == obj.getSeconds()) ? true : false;
    }

    @Override
    public int hashCode () {
        int hash = second;
        hash = 31 * hash + minute;
        hash = 31 * hash + hour;
        return hash;
    }
}
