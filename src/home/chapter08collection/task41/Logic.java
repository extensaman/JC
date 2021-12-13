package home.chapter08collection.task41;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Logic {

    public List<Integer> createListByRandom (int cellsCount) {

        List<Integer> list = new ArrayList<Integer>(cellsCount);
        for (int i = 0; i < cellsCount; i++) {

            int element = (int) (Math.random() * MagicNumbers.DEFAULT_MAX_MARK.getMark()) + 1;
            list.add(element);
        }

        return list;
    }

    public Integer searchMaximumMark(Entity entity) {

        List<Integer> list = entity.getList();
        if (list == null) {return null;}
        Integer max = list.get(0);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
