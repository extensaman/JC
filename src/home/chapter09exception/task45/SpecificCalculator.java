package home.chapter09exception.task45;

public class SpecificCalculator {

    private Chislo ch1;
    private Chislo ch2;

    public SpecificCalculator(Chislo ch1, Chislo ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public Chislo calculateDivide () {
        Divider divider = new Divider();
        try {
            return divider.divide();
        } catch (Exception exception) {
            System.out.println("Catch Exception in \'SpecificCalculator::calculateDivide\'. Throw it upper.");
            throw exception;
        }
    }

    public Chislo calculateSum () {
        Sumer sumer = new Sumer();

        return sumer.add();
    }

    class Divider {

        public Chislo divide () {

            if (ch2.getT().doubleValue() == 0.0) {
                System.out.println("Throw ArithmeticException in \'SpecificCalculator.Divider::divide\'");
                throw new ArithmeticException("Division by zero");
            }

            return new Chislo ((ch1.getT()).doubleValue() / (ch2.getT()).doubleValue());
        }
    }

    class Sumer {

        public Chislo add () {
            return new Chislo ((ch1.getT()).doubleValue() + (ch2.getT()).doubleValue());
        }
    }
}
