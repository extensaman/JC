package home.chapter06inheritance.task01;

public final class Type02Student extends Student{

    public Type02Student(double talantLevel, double baseTime, StudentBehavior studentBehavior) {

        super(talantLevel, baseTime, studentBehavior);
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_02.getDescription() + super.toString();
    }
}
