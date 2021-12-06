package home.chapter06inheritance.task01;

public class Group {

    private StudentBehavior[] studentsArray;

    public Group(StudentBehavior[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public StudentBehavior[] getStudentsArray() {
        return studentsArray;
    }

    public void printGroup() {
        View view = new View (this);
        view.printGroup();
    }
}
