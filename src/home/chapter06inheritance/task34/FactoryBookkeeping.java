package home.chapter06inheritance.task34;

public enum FactoryBookkeeping { // заводская бухгалтерия

    INCOME_IN_MONTH (100_000.0); // прибыль в месяц по заводу

    public double value;

    FactoryBookkeeping (double value) {
        this.value = value;
    }
}
