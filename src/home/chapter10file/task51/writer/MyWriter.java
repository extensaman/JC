package home.chapter10file.task51.writer;

import java.io.*;
import java.util.Set;

public class MyWriter<T>{

    public void writeObjectSet (Set<T> set, File file) {

        try (
                ObjectOutputStream oos = new ObjectOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream(file)
                        )
                );
        ) {
            for (T object : set) {
                oos.writeObject(object);
            }
            oos.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
