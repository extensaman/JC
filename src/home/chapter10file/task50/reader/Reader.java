package home.chapter10file.task50.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Reader{

    private ReadBehavior reader;

    public Reader(ReadBehavior reader) {
        this.reader = reader;
    }

    public List<String> readPerform(File file) throws FileNotFoundException {
        return reader.readFromFile (file);
    }
}
