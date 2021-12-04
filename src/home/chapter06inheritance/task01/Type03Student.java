package home.chapter06inheritance.task01;

public final class Type03Student extends Student{

    public Type03Student() {
        double time = FULL_TIME_FOR_BEST_STUDENT * 3.0;
        super.setPraktikaTime(time);
        super.setResultable(student -> (FULL_TIME_FOR_BEST_STUDENT * 3 / student.getTalantLevel())); //new Type03Resultable());
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_03.getDescription() + super.toString();
    }
}
