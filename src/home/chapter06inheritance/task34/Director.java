package home.chapter06inheritance.task34;

public final class Director extends CEO {

    private double directorIncomeBonus;

    public Director() {
        directorIncomeBonus = super.getIncomeBonus() + Bonus.DIRECTOR_INCOME_BONUS_ADDON.bonus;
    }

    @Override
    public double getWage() {
        return FactoryBookkeeping.INCOME_IN_MONTH.value * directorIncomeBonus;
    }
}
