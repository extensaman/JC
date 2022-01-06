package home.chapter12stream.task62.view;

import java.util.Collection;

public class View {

    public static <T> void printCollection (Collection<T> set) {

        System.out.println("Collection: ");
        for (T person : set) {
            System.out.println(person);
        }
    }
}
