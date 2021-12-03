package home.chapter06inheritance.task01;

public enum StudentTypes {

    TYPE_01 (0,"Студент 1-ого типа"),
    TYPE_02 (1,"Студент 2-ого типа"),
    TYPE_03 (2,"Студент 3-его типа");

    private int id;
    private String description;

    StudentTypes (int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
