package home.chapter10file.task49.viewer;

import java.util.List;

public class View {

    public void printListAndAverage (String message, List<Integer> list, double average) {

        printList(message, list);
        System.out.println("Average is " + average);
    }

    public void printList (String message, List<Integer> list) {

        System.out.println(message);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
