package home.chapter15reflectionandannotation.task70.view;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public final class View {

    private View(){}

    public static void printMessageAndString(String message, String text) {
        System.out.println(message + text);
    }

    public static <T> void printMessageAndCollection(String message, Collection<T> collection) {
        System.out.print(message);
        for(T element : collection) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }
}
