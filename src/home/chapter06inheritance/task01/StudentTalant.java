package home.chapter06inheritance.task01;

public class StudentTalant {

    public static final double MAX_TALANT_LEVEL = 1.0;
    static {
        talantLevel = ((int) (Math.random() * MAX_TALANT_LEVEL * 10.0) + 1) / (MAX_TALANT_LEVEL * 10.0);
    }
    private static final double talantLevel;

    public static double generateTalantLevel() {
        return talantLevel;
    }


}
