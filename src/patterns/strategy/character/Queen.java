package patterns.strategy.character;

public class Queen extends Character {

    @Override
    public void fight() {

        System.out.println("\nQueen fights");
        super.fight();
    }
}
