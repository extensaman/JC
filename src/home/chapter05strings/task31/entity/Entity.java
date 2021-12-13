package home.chapter05strings.task31.entity;

public class Entity {

    public static final String DEFAULT_TEXT = "aaabbbccc";

    private String text;

    public Entity() {
        this.text = DEFAULT_TEXT;
    }

    public Entity(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
