package home.chapter10file.task49.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface WriteBehavior {
    void writeToFile (File file, List<Integer> list) throws FileNotFoundException;
}
