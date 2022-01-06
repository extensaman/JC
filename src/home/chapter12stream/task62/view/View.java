package home.chapter12stream.task62.view;

import home.chapter12stream.task62.entity.Person;

import java.util.Set;

public class View {

    public static void printSet (Set<Person> set) {

        System.out.println("Set of Person: ");
        for (Person person : set) {
            System.out.println(person);
        }
    }
}
