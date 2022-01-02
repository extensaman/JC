package home.chapter05strings.task31patterncommand.model;

public class Model {

    public static final String DEFAULT_TEXT = "aabbcc";
    public static final int DEFAULT_CYCLES_COUNT = 1000;

    private String text;
    private int cyclesCount;

    public Model () {

        this.text = DEFAULT_TEXT;
        this.cyclesCount = DEFAULT_CYCLES_COUNT;
    }

    public Model(String text, int cyclesCount) {

        this.text = text;
        this.cyclesCount = cyclesCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getCyclesCount() {
        return cyclesCount;
    }

    public void setCyclesCount(int cyclesCount) {
        this.cyclesCount = cyclesCount;
    }

    @Override
    public String toString() {
        return "Model{" +
                "text='" + text + '\'' +
                ", cyclesCount=" + cyclesCount +
                '}';
    }
}
