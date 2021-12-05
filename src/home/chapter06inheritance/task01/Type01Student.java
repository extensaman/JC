package home.chapter06inheritance.task01;

public final class Type01Student extends Student{

    public Type01Student(double talantLevel, double baseTime, StudentBehavior studentBehavior) {

        super (talantLevel, baseTime, studentBehavior);

    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_01.getDescription() + super.toString();
    }
}
