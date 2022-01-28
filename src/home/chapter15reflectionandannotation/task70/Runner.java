package home.chapter15reflectionandannotation.task70;

import home.chapter15reflectionandannotation.task70.entity.Man;
import home.chapter15reflectionandannotation.task70.logic.ClassInfoGetting;
import home.chapter15reflectionandannotation.task70.logic.CompareToCalling;
import home.chapter15reflectionandannotation.task70.logic.ReflectionProcessor;
import home.chapter15reflectionandannotation.task70.view.View;

import java.time.LocalDate;

/**
 * Раздел "Reflection API. Аннотации"
 * Задание №70
 *
 * Создать класс Man c произвольным набором полей и методов (не менее 3)
 * Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * Вызвать метод с помощью рефлексии из основной программы.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {


    public static final Man MAN = new Man("Петров", "Иван", LocalDate.of(1982, 4, 8));
    public static final Man MAN_2 = new Man("Петров", "Иван", LocalDate.of(1972, 4, 8));

    public static void main(String[] args) {

        ClassInfoGetting behavior = new ReflectionProcessor(MAN);

        printClassInfo(behavior);

        ((CompareToCalling)behavior).compareToCall(MAN_2);
    }

    private static void printClassInfo(ClassInfoGetting infoGetting) {
        View.printMessageAndString("Class name: ", infoGetting.getClassInfo());
        View.printMessageAndCollection("Class interfaces: ", infoGetting.getInterfaceInfo());
        View.printMessageAndCollection("Class fields: ", infoGetting.getFieldInfo());
        View.printMessageAndCollection("Class methods: ", infoGetting.getMethodInfo());
    }
}

