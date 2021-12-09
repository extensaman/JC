package home.chapter08collection.task40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Logic {

    public List<Integer> generateList(int size) {

        List<Integer> list = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * MagicNumbers.NUMBERS_UPPER_LIMIT.getValue()) + 1);
        }

        return list;

    }

    // Вариант реализации через HashSet
    public void deleteRepeatElementsFromListByUsingHashSet (Entity entity) {

        List<Integer> list = entity.getIntegerList();
        HashSet<Integer> integerSet = new HashSet<Integer>(list);
        entity.setIntegerList(new ArrayList<>(integerSet));
    }

    // Вариант реализации через циклы For
    public void deleteRepeatElementsFromListByUsingFor (Entity entity) {

        List<Integer> list = entity.getIntegerList();

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j--);
                }
            }

        }
    }
}
