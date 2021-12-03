package home.chapter06inheritance.task01;

public final class Type02Student extends Student{

    public Type02Student() {
        double time = FULL_TIME_FOR_BEST_STUDENT * 2.0;
        super.setPraktikaTime(time / 2.0);
        super.setRazborTime(time / 2.0);
    }
    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_02.getDescription() + super.toString();
    }
}
