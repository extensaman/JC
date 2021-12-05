package home.chapter06inheritance.task01;

public class Group {

    private Student[] group;

    public Group(Student[] group) {
        this.group = group;
    }

    public void printGroup() {

        StringBuffer stringBuffer = new StringBuffer("Группа состоит из:\n");
        for (int i = 0; i < group.length; i++) {
            stringBuffer.append('\n')
                        .append(Integer.toString(i + 1))
                        .append(group[i])
                        .append("\nВремя на разбор: ")
                        .append(group[i].getStudentBehavior().calculateRazborTime(group[i]))
                        .append("\nВремя на поток: ")
                        .append(group[i].getStudentBehavior().calculatePotokTime(group[i]))
                        .append("\nВремя на практику: ")
                        .append(group[i].getStudentBehavior().calculatePraktikaTime(group[i]))
                        .append("\nСумарное время на освоение навыка: ")
                        .append(group[i].calculateStudyingTime());
        }
        System.out.println(stringBuffer.toString());
    }

}
