package patterns.strategy.character;

public class King extends Character {

    @Override
    public void fight () {

        System.out.println("\nKing fights");
        super.fight();
    }
}
