package home.chapter06inheritance.task02notfrombook;

public enum MagicNumbers {

    FIRM_DEFAULT_COUNT(0),
    HR_COUNT (3),
    MANAGER_COUNT(2),
    SECURITY_COUNT(5),
    SALE_DEPARTMENT_COUNT(10),

    HR_INCOME(100),
    MANAGER_INCOME(10_000),
    SECURITY_INCOME(200),
    SALE_DEPARTMENT_INCOME (23894);

    private int value;

    MagicNumbers(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
