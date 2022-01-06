package home.chapter10file.task49.reader;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class DataInputStreamReader implements ReadBehavior {

    @Override
    public List<Integer> readFromFile(File file) throws FileNotFoundException {

        List<Integer> list = new LinkedList<>();

        try (
                DataInputStream stream = new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream(file)
                        )
                )
        ){
            while(true) {
                try {
                    list.add(stream.readInt());
                }
                catch (EOFException e) {
                    break;
                }
            }

        }
        catch (FileNotFoundException e) {
            throw e;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
