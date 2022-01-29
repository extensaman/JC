package home.chapter15reflectionandannotation.task72;

import home.chapter15reflectionandannotation.task72.entity.Entity;
import home.chapter15reflectionandannotation.task72.entity.InfoAboutAnnotation;
import home.chapter15reflectionandannotation.task72.logic.ReflectionWorker;
import home.chapter15reflectionandannotation.task72.view.View;

import java.util.List;

/**
 * Раздел Раздел "Reflection API. Аннотации"
 * Задание №72
 *
 * Создать собственную аннотацию @Academylnfo с полем уеаг. Создать метод,
 * помеченный этой аннотацией с заданным уеаг, и метод без нее. С помощью
 * рефлексии проверить наличие данной аннотации у этих методов из основной
 * программы.
 *
 * @author Yusikau Aliaksandr
 * @version 1.0
 */

public class Runner {
    public static void main(String[] args) {
        Entity entity = new Entity();
        ReflectionWorker worker = new ReflectionWorker(entity);
        List<InfoAboutAnnotation> list = worker.formInfoAboutAnnotation();
        View.printListInfoAboutAnnotation(list);
    }
}
