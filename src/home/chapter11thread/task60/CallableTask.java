package home.chapter11thread.task60;

import home.chapter11thread.task60.writter.MyWriter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private final MyWriter writer;
    private final String message;

    public CallableTask(MyWriter writer, String message) {
        this.writer = writer;
        this.message = message;
    }

    @Override
    public String call() {
        String s = new SimpleDateFormat("HH:mm:ss.S").format(new Date())
                + " " + Thread.currentThread().getName() + " " + message;
        writer.writeString(s + '\n');
        return s;
    }

}
