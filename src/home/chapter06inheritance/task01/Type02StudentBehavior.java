package home.chapter06inheritance.task01;

public class Type02StudentBehavior implements StudentBehavior{

    @Override
    public double calculateRazborTime(Student student) {
        return student.getBaseTime();
    }

    @Override
    public double calculatePotokTime(Student student) {
        return .0;
    }

    @Override
    public double calculatePraktikaTime(Student student) {
        return student.getBaseTime();
    }
}
