package home.chapter10file.task50.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface ReadBehavior {

    List<String> readFromFile (File file) throws FileNotFoundException;
}
