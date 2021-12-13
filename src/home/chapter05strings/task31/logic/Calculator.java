package home.chapter05strings.task31.logic;

import home.chapter05strings.task31.entity.Entity;
import home.chapter05strings.task31.misc.MagicNumbers;

public class Calculator {

    private Entity entity;
    private Uniter[] uniters;

    public Calculator(Entity entity, Uniter ... uniters) {
        this.entity = entity;
        this.uniters = uniters;
    }

    public Result calculateResult() {

        double[] result  = new double[uniters.length];
        for (int i = 0; i < uniters.length; i++) {
            result[i] = uniters[i].calculateTime(entity, MagicNumbers.CYCLES_COUNT.getValue());
        }

        return new Result (result, entity, MagicNumbers.CYCLES_COUNT.getValue());
    }
}
