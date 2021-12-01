package patterns.strategy.character;

public class Troll extends Character {

    @Override
    public void fight() {

        System.out.println("\nTroll fights");
        super.fight();
    }
}
