package patterns.strategy.character;

import patterns.strategy.behavior.WeaponBehavior;

public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public void setWeaponBehavior (WeaponBehavior weaponBehavior) {

        this.weaponBehavior = weaponBehavior;
    }

    public void fight () {

        weaponBehavior.useWeapon();
    }
}
