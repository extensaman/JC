package home.chapter10file.task51.reader;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class MyReader<T> {

    public Set<T> readObjectSet (File file) {

        Set<T> set = new TreeSet<>();

        try (
                ObjectInputStream ois = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(file)
                        )
                );
        ) {

            while (true) {
                try {
                    set.add((T) ois.readObject());
                }
                catch (EOFException e) {
                    break;
                }
            }
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return set;
    }
}
