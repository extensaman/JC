package home.chapter08collection.task41;

import java.util.List;

@FunctionalInterface
public interface AddElementsBehavior {

    public void addElements (List<Integer> list, int count, int number);
}
