package home.chapter08collection.task01notfrombook.logic;

import home.chapter08collection.task01notfrombook.entity.Element;
import home.chapter08collection.task01notfrombook.entity.Text;

import java.util.Set;

public interface EntityBehavior {

    abstract public Text getText();
    abstract public Set<Element> createSet (Text text);
    abstract public void printElements(Set<Element> set);
}
