package home.chapter10file.task49.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface ReadBehavior {

    List<Integer> readFromFile (File file) throws FileNotFoundException;
}
