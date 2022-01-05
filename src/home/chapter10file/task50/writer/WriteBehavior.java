package home.chapter10file.task50.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public interface WriteBehavior <T>{
    void  writeToFile (File file, List<T> list) throws FileNotFoundException;
}
