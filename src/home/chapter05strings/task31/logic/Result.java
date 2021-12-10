package home.chapter05strings.task31.logic;

import home.chapter05strings.task31.entity.Entity;

public class Result {

    private double[] times;
    private int cyclesCount;
    private Entity entity;

    public Result(double[] times, Entity entity, int cyclesCount) {
        this.times = times;
        this.cyclesCount = cyclesCount;
        this.entity = entity;
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();

        for (int i = 0; i < times.length; i++) {

            stringBuffer.append(cyclesCount +
                    " операций №" + (i+1) + " со строкой \"" + entity + "\" происходят за " +
                    times[i] + " наносекунд\n");
        }
        return stringBuffer.toString();
    }
}
