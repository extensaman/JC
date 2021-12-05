package home.chapter06inheritance.task01;

public final class Type02Student extends Student implements StudentBehavior{

    public Type02Student(double talantLevel) {

        super(talantLevel);
    }

    @Override
    public double calculateRazborTime() {
        return Runner.FULL_TIME_FOR_BEST_STUDENT;
    }

    @Override
    public double calculatePotokTime() {
        return .0;
    }

    @Override
    public double calculatePraktikaTime() {
        return Runner.FULL_TIME_FOR_BEST_STUDENT;
    }

    @Override
    public double calculateStudyingTime() {
        return (this.calculatePotokTime() +
                this.calculatePraktikaTime() +
                this.calculateRazborTime() ) / super.getTalantLevel();
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_02.getDescription() + super.toString();
    }
}
