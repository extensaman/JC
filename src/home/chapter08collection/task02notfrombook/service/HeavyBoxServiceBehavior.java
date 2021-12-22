package home.chapter08collection.task02notfrombook.service;

import home.chapter08collection.task02notfrombook.model.HeavyBox;

import java.util.List;

public interface HeavyBoxServiceBehavior {

    abstract public HeavyBox getHeavyBox(double size, double height);
    abstract public void addHeavyBoxToList(List<HeavyBox> list, HeavyBox box);
    abstract public void printHeavyBoxList (List<HeavyBox> list);
    abstract public void changeFirstElementWeight (List<HeavyBox> list, double delta);
    abstract public HeavyBox deleteLastListElement (List<HeavyBox> list);
    abstract public void clearList(List<HeavyBox> list);
    abstract public void printHeavyBoxArray(ArrayMakingBehavior behavior, List<HeavyBox> list);
}
