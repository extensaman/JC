package home.chapter08collection.task02notfrombook.service;

import home.chapter08collection.task02notfrombook.model.HeavyBox;
import java.util.List;

@FunctionalInterface
public interface ArrayMakingBehavior {
    abstract public HeavyBox[] getArray(List<HeavyBox> list);
}
