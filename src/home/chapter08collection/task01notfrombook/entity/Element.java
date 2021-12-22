package home.chapter08collection.task01notfrombook.entity;

import java.util.Objects;

public class Element {

    private final Character ch;

    public Element(Character ch) {
        this.ch = ch;
    }

    public Character getCh() {
        return ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Objects.equals(ch, element.ch);
    }

    @Override
    public int hashCode() {
        return 31 * ch.hashCode();
    }
}
