package home.chapter11thread.task59;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {

    private final String timeStamp;
    private final String threadName;
    private final String sum;

    public Result(final String threadName, final String sum) {

        this.timeStamp = new SimpleDateFormat("HH:mm:ss.S").format(new Date());
        this.threadName = threadName;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return timeStamp +
                " : threadName='" + threadName + '\'' +
                ", sum='" + sum + '\'' +
                '}';
    }
}
