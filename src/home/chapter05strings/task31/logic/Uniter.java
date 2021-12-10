package home.chapter05strings.task31.logic;

import home.chapter05strings.task31.entity.Entity;
import home.chapter05strings.task31.logic.UniteBehavior;

public class Uniter {

    UniteBehavior behavior;

    public Uniter(UniteBehavior behavior) {
        this.behavior = behavior;
    }

    public double calculateTime (Entity entity){
        return behavior.calculateUniteTime(entity);
    }
}
