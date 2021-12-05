package home.chapter06inheritance.task01;

public class Logic {



    public StudentBehavior simpleFactory (StudentTypes studentType) {

        switch (studentType) {
            case TYPE_01:
                return new Type01Student(new StudentTalant().generateTalantLevel());
            case TYPE_02:
                return new Type02Student(new StudentTalant().generateTalantLevel());
            case TYPE_03:
                return new Type03Student(new StudentTalant().generateTalantLevel());
        }
        return null;
    }

    public StudentBehavior[] formGroup (int capacity) {

        StudentBehavior[] group = new StudentBehavior[capacity];
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
