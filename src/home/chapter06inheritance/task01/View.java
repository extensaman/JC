package home.chapter06inheritance.task01;

public class View {

    private Group group;

    public View(Group group) {
        this.group = group;
    }

    public void printGroup() {

        StudentBehavior[] studentsArray = group.getStudentsArray();
        StringBuffer stringBuffer = new StringBuffer("Группа состоит из:\n");
        for (int i = 0; i < studentsArray.length; i++) {
            stringBuffer.append('\n')
                    .append(Integer.toString(i + 1))
                    .append(studentsArray[i])
                    .append("\nВремя на разбор: ")
                    .append(studentsArray[i].calculateRazborTime())
                    .append("\nВремя на поток: ")
                    .append(studentsArray[i].calculatePotokTime())
                    .append("\nВремя на практику: ")
                    .append(studentsArray[i].calculatePraktikaTime())
                    .append("\nСумарное время на освоение навыка: ")
                    .append(studentsArray[i].calculateStudyingTime());
        }
        System.out.println(stringBuffer.toString());
    }
}
