package home.chapter06inheritance.task01;

public final class Type01Student extends Student{

    public Type01Student() {
        double time = FULL_TIME_FOR_BEST_STUDENT / 3.0;
        super.setPotokTime(time);
        super.setPraktikaTime(time);
        super.setRazborTime(time);
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_01.getDescription() + super.toString();
    }
}
