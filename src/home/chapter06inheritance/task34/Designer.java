package home.chapter06inheritance.task34;

public final class Designer extends Worker {

    private double disignerSalary;
    private double disignerBonus;

    public Designer() {
        disignerSalary = super.getSalary() + Salary.DISIGNER_SALARY_ADDON.salary;
        disignerBonus = super.getSalaryBonus() + Bonus.DISIGNER_SALARY_BONUS_ADDON.bonus;
    }

    @Override
    public double getWage() {
        return disignerSalary + disignerSalary * disignerBonus;
    }
}
