package home.chapter06inheritance.task01;

public class Group {

    public static final int GROUP_CAPACITY = 9;

    private Student[] group;

    public Group() {
        group = new Student[GROUP_CAPACITY];
    }

    public Student simpleFactory (StudentTypes studentType) {

        switch (studentType) {
            case TYPE_01:
                return new Type01Student();
            case TYPE_02:
                return new Type02Student();
            case TYPE_03:
                return new Type03Student();
        }
        return null;
    }

    public void formGroup () {
        int[] busyCell = new int[GROUP_CAPACITY];

        int subGroupsCount = GROUP_CAPACITY / StudentTypes.values().length;
        for (int i = 0; i < subGroupsCount; i++) {
            for (int j = 0; j < subGroupsCount; j++) {

                int index;
                do {
                    index = (int) (Math.random() * GROUP_CAPACITY);
                } while (busyCell[index] != 0);

                busyCell[index] = 1;
                group[index] = simpleFactory(StudentTypes.values()[j]);
            }
        }
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer("Группа состоит из:\n");
        for (int i = 0; i < GROUP_CAPACITY; i++) {
            stringBuffer.append(Integer.toString(i + 1)).append(group[i]);
        }
        return stringBuffer.toString();
    }
}
