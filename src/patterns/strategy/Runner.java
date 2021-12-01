package patterns.strategy;

import patterns.strategy.behavior.AxeBehavior;
import patterns.strategy.behavior.KnifeBehavior;
import patterns.strategy.behavior.SwordBehavior;
import patterns.strategy.character.Character;
import patterns.strategy.character.King;
import patterns.strategy.character.Queen;

public class Runner {

    public static void main(String[] args) {

        Character king = new King();

        king.setWeaponBehavior(new SwordBehavior());
        king.fight();

        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();

        queen.setWeaponBehavior(new AxeBehavior());
        queen.fight();

    }
}
