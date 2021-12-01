package home.chapter06inheritance.task34;

public abstract class CEO extends Employee {

    private double ceoBonus;

    public CEO() {
        ceoBonus = super.getIncomeBonus() + Bonus.CEO_INCOME_BONUS.bonus;
    }

    @Override
    public double getIncomeBonus () {
        return ceoBonus;
    }

    public abstract double getWage();
}
