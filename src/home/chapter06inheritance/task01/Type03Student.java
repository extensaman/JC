package home.chapter06inheritance.task01;

public final class Type03Student extends Student implements StudentBehavior{

    public Type03Student(double talantLevel) {

        super (talantLevel);

    }

    @Override
    public double calculateRazborTime() {
        return .0;
    }

    @Override
    public double calculatePotokTime() {
        return .0;
    }

    @Override
    public double calculatePraktikaTime() {
        return Runner.FULL_TIME_FOR_BEST_STUDENT * 3.0;
    }

    @Override
    public double calculateStudyingTime() {
        return (this.calculatePotokTime() +
                this.calculatePraktikaTime() +
                this.calculateRazborTime() ) / super.getTalantLevel();
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_03.getDescription() + super.toString();
    }
}
