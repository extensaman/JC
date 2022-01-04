package home.chapter10file.task49.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class Reader{

    private ReadBehavior reader;

    public Reader(ReadBehavior reader) {
        this.reader = reader;
    }

    public List<Integer> readPerfom (String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        return reader.readFromFile (file);
    }
}
