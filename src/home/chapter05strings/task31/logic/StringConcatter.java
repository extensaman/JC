package home.chapter05strings.task31.logic;

import home.chapter05strings.task31.misc.MagicNumbers;
import home.chapter05strings.task31.entity.Entity;

public class StringConcatter implements UniteBehavior {
    @Override
    public double calculateUniteTime(Entity entity) {

        String result = "";
        String text = entity.getText();
        long startTime;
        int i;

        startTime = System.nanoTime();

        for (i = 0; i < MagicNumbers.CYCLES_COUNT.getValue(); i++) {
            result += text;
        }

        return System.nanoTime() - startTime;
    }
}
