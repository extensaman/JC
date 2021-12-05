package home.chapter06inheritance.task01;

public final class Type03Student extends Student{

    public Type03Student(double talantLevel, double baseTime, StudentBehavior studentBehavior) {

        super (talantLevel, baseTime, studentBehavior);

    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_03.getDescription() + super.toString();
    }
}
