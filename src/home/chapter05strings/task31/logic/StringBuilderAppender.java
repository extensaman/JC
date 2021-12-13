package home.chapter05strings.task31.logic;

import home.chapter05strings.task31.misc.MagicNumbers;
import home.chapter05strings.task31.entity.Entity;

public class StringBuilderAppender implements UniteBehavior {

    @Override
    public double calculateUniteTime(Entity entity, int cyclesCount) {

        String s = entity.getText();
        StringBuffer stringBuffer = new StringBuffer(s);

        long startTime;
        int i;

        startTime = System.nanoTime();

        for (i = 0; i < cyclesCount; i++) {
            stringBuffer.append(s);
        }

        return System.nanoTime() - startTime;
    }
}
