package home.chapter10file.task49.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Writer {

    private WriteBehavior writter;

    public Writer(WriteBehavior writter) {
        this.writter = writter;
    }

    public void writePerfom (String filePath, List<Integer> list) throws FileNotFoundException {
        File file = new File(filePath);
        writter.writeToFile (file, list);
    }
}
