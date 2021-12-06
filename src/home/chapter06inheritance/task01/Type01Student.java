package home.chapter06inheritance.task01;

public final class Type01Student extends Student implements StudentBehavior{

    public Type01Student(double talantLevel, double baseTime) {

        super (talantLevel, baseTime);

    }

    @Override
    public double calculateRazborTime() {
        return super.getBaseTime() / 3.0;
    }

    @Override
    public double calculatePotokTime() {
        return super.getBaseTime() / 3.0;
    }

    @Override
    public double calculatePraktikaTime() {
        return super.getBaseTime() / 3.0;
    }

    @Override
    public double calculateStudyingTime() {
        return (this.calculatePotokTime() +
                this.calculatePraktikaTime() +
                this.calculateRazborTime() ) / super.getTalantLevel();
    }

    @Override
    public String toString() {
        return '\n' + StudentTypes.TYPE_01.getDescription() + super.toString();
    }
}
