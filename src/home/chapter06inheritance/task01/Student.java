package home.chapter06inheritance.task01;

/**
 * Раздел "Наследование и полиморфизм. Внутренние и
 * анонимные классы"
 * Задание не из пособия
 *
 * Дано:
 *
 * Есть три типа студентов:
 * 1 тип - делают разборы, практическую часть и находятся в потоке
 * 2 тип - делают только практическую часть и разборы
 * 3 тип - делают только практическую часть
 *
 * У студентов есть талант: величина от 0,1 до 1. Талант влияет на освоение навыка(скила).
 * Например если для освоения навыка вождения нужно потратить 22 часа, то
 * студент с талантом 1 затратит 22 часа
 * студент с талантом 0,1 затратит 22/0,1 = 220 часов
 * студент с талантом 0,5 затратит 22/0,5 = 44 часа
 * студент с талантом 0,8 затратит 22/0,8 = 27,5 часов
 *
 * Считается что 1 тип студентов освайвают материал за то время, которое нужно потратить на освоение.
 * 2 тип студентов освайвают материал в два раза дольше.
 * 3 тип студентов освайвают материал в три раза дольше.
 * Например если для освоения навыка вождения нужно потратить 22 часа, то
 * 1 тип студента потратит 22 часа (22/3 = 7,3; 7,3 часа на разборы, 7,3 часа на практику, 7,3 часа на находение в потоке)
 * 2 тип студента потрати 22 x 2 = 44 часа (44/2 = 22; 22 часа на практику, 22 часа на разборы)
 * 3 тип студента потратит 22 x 3 = 66 часов (66 часов на практику)
 *
 * Задача:
 * Студенту 1 типа с талантом 1 нужно потратить на разбор для преобретения практического навыка по java core 66 часов
 * (Всего на освоение навыка по java core 198 часов).
 * Необходимо посчитать для каждого студента затраченное время на изучение java в классе
 * (вывести на экран тип студента, его талант, время необходимое для разбора, практики,
 * нахождения в потоке и суммарное время на освоение навыка).
 *
 * В классе 9 студентов (по 3 студента каждого типа).
 * Талант задается рандомно.
 * Использовать патерн стратегия.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public abstract class Student {

    public static final int FULL_TIME_FOR_BEST_STUDENT = 198;

    private double talantLevel;
    private double razborTime;
    private double praktikaTime;
    private double potokTime;

    public Student () {
        this.talantLevel = ((int) (Math.random() * 10.0) + 1) / 10.0;
        razborTime = 0.0;
        praktikaTime = 0.0;
        potokTime = 0.0;
    }

    public void setRazborTime(double razborTime) {
        this.razborTime = razborTime;
    }

    public void setPraktikaTime(double praktikaTime) {
        this.praktikaTime = praktikaTime;
    }

    public void setPotokTime(double potokTime) {
        this.potokTime = potokTime;
    }

    public double calculateSummaryTime() {
        return  (razborTime + potokTime + praktikaTime) / talantLevel;
    }

    @Override
    public String toString() {
        return "\nТалант: " + talantLevel +
                "\nВремя на разбор: " + razborTime +
                "\nВремя на практику: " + praktikaTime +
                "\nВремя на поток: " + potokTime +
                "\nСумарное время на освоение навыка: " + calculateSummaryTime() +
                '\n';
    }
}