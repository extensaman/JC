package home.chapter06inheritance.task01;

public class Type01StudentBehavior implements StudentBehavior{

    @Override
    public double calculateRazborTime(Student student) {
        return student.getBaseTime() / 3.0;
    }

    @Override
    public double calculatePotokTime(Student student) {
        return student.getBaseTime() / 3.0;
    }

    @Override
    public double calculatePraktikaTime(Student student) {
        return student.getBaseTime() / 3.0;
    }
}
