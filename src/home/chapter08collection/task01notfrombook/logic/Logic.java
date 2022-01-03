package home.chapter08collection.task01notfrombook.logic;

import home.chapter08collection.task01notfrombook.Input;
import home.chapter08collection.task01notfrombook.entity.Element;
import home.chapter08collection.task01notfrombook.entity.Text;

import java.util.LinkedHashSet;
import java.util.Set;

public class Logic implements EntityBehavior{

    @Override
    public Text getText() {
        System.out.println("Enter a text: ");
        return new Text (Input.enterText());
    }

    @Override
    public Set<Element> createSet(Text text) {

        char[] mas = text.getText().toCharArray();
        Set<Element> set = new LinkedHashSet<>();

        for (char ch : mas) {
            if (ch >= '0' && ch <= '9') {
                set.add(new Element(ch));
            }
        }

        return set;
    }

    @Override
    public void printElements(Set<Element> set) {

        System.out.println("Result is");
        for (Element element : set) {
            System.out.print(element.getCh() + " ");
        }
    }
}
