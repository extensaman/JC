package home.chapter06inheritance.task01;

public class Logic {

    public static final int FULL_TIME_FOR_BEST_STUDENT = 198;

    public Student simpleFactory (StudentTypes studentType) {

        switch (studentType) {
            case TYPE_01:
                return new Type01Student(new StudentTalant().generateTalantLevel(),
                            FULL_TIME_FOR_BEST_STUDENT, new Type01StudentBehavior());
            case TYPE_02:
                return new Type02Student(new StudentTalant().generateTalantLevel(),
                        FULL_TIME_FOR_BEST_STUDENT, new Type02StudentBehavior());
            case TYPE_03:
                return new Type03Student(new StudentTalant().generateTalantLevel(),
                        FULL_TIME_FOR_BEST_STUDENT, new Type03StudentBehavior());
        }
        return null;
    }

    public Student[] formGroup (int capacity) {

        Student[] group = new Student[capacity];
        int[] busyCell = new int[capacity];

        int subGroupsCount = capacity / StudentTypes.values().length;
        for (int i = 0; i < subGroupsCount; i++) {
            for (int j = 0; j < subGroupsCount; j++) {

                int index;
                do {
                    index = (int) (Math.random() * capacity);
                } while (busyCell[index] != 0);

                busyCell[index] = 1;
                group[index] = simpleFactory(StudentTypes.values()[j]);
            }
        }

        return group;
    }

}
