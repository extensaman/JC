package home.chapter11thread.task52;

import java.util.Collection;

public class View {

    public static void printCollection(String threadName, Collection<Integer> collection) {
        System.out.println("Collection of " + threadName);
        for (Integer integer : collection) {
            System.out.println(integer);
        }
    }
    public static void printAverage(String threadName, double average) {
        System.out.println("Average of " + threadName + " is " + average);
    }

}
