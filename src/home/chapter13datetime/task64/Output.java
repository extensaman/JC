package home.chapter13datetime.task64;

import java.util.List;

public class Output {

    private Output() {}

    public static <T> void printList(List<T> list) {
        System.out.println("Collection:");
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static void printMessage(String message) {
        System.out.print(message);;
    }
}
