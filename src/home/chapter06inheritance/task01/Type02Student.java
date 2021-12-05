package home.chapter06inheritance.task01;

public final class Type02Student extends Student implements StudentBehavior{

    public Type02Student(double talantLevel, double baseTime) {

        super (talantLevel, baseTime);
    }

    @Override
    public double calculateRazborTime() {
        return super.getBaseTime();
    }

    @Override
    public double calculatePotokTime() {
        return .0;
    }

    @Override
    public double calculatePraktikaTime() {
        return super.getBaseTime();
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
