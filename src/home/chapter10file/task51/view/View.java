package home.chapter10file.task51.view;

import home.chapter10file.task51.entity.Person;

import java.util.Collection;

public class View {

    public static <T> void printCollection(Collection<T> set) {

        System.out.println("Set of Person: ");
        for (T person : set) {
            System.out.println(person);
        }
    }
}
