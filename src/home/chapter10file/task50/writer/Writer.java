package home.chapter10file.task50.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Writer {

    private WriteBehavior writter;

    public Writer(WriteBehavior writter) {
        this.writter = writter;
    }

    public void setWritterBehavior(WriteBehavior writter) {
        this.writter = writter;
    }

    public void writePerform(File file, List list) throws FileNotFoundException {
        writter.writeToFile (file, list);
    }
}
