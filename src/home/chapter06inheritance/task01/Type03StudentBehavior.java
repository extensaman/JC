package home.chapter06inheritance.task01;

public class Type03StudentBehavior implements StudentBehavior{

    @Override
    public double calculateRazborTime(Student student) {
        return .0;
    }

    @Override
    public double calculatePotokTime(Student student) {
        return .0;
    }

    @Override
    public double calculatePraktikaTime(Student student) {
        return student.getBaseTime() * 3.0;
    }
}
