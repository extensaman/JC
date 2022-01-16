package home.chapter11thread.task58;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Result {

    private final String timeStamp;
    private final String threadName;
    private final List<String> fileNames;

    public Result(final String threadName, final List<String> fileNames) {

        this.timeStamp = new SimpleDateFormat("HH:mm:ss.S").format(new Date());
        this.threadName = threadName;
        this.fileNames = fileNames;
    }

    @Override
    public String toString() {
        return timeStamp +
                " : threadName='" + threadName + '\'' +
                ", filesList='" + fileNames + '\'' +
                '}';
    }
}
