package home.chapter06inheritance.task34;

public final class HrManager extends Manager{

    private double hrManagerSalary;
    private double hrManagerSalaryBonus;
    private double hrManagerIncomeBonus;

    public HrManager () {
        hrManagerSalary = super.getSalary() + Salary.HR_MANAGER_SALARY_ADDON.salary;
        hrManagerSalaryBonus = super.getSalaryBonus() + Bonus.HR_MANAGER_SALARY_BONUS_ADDON.bonus;
        hrManagerIncomeBonus = super.getIncomeBonus() + Bonus.HR_MANAGER_INCOME_BONUS_ADDON.bonus;
    }

    @Override
    public double getWage() {
        return hrManagerSalary + hrManagerSalary * hrManagerSalaryBonus +
                FactoryBookkeeping.INCOME_IN_MONTH.value * hrManagerIncomeBonus;
    }
}
